package jobsheet12;

public class DoubleLinkedLists04 {
  Node04 head;
  Node04 tail;
  int size;
  
    public DoubleLinkedLists04() {
    head = null;
    tail = null;
    size = 0;
  }

    public boolean isEmpty() {
        return head == null;
  }
    public void addFirst(Mahasiswa04 data) {
        Node04 newNode = new Node04(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Mahasiswa04 data) {
        Node04 newNode = new Node04(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void add(int index, Mahasiswa04 data) {
        if (index < 0 || index > size) {
            System.out.println("Indeks salah, tidak bisa menambahkan data.");
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }else if (index == size) {
            addLast(data);
            return;
        }else {
            Node04 newNode = new Node04(data);
            Node04 current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
            size++;
        }
    }

    public void removeAfter(String keyNim) {
        Node04 current = search(keyNim);
        if (current == null || current.next == null) {
            System.out.println("Tidak ada node setelah NIM " + keyNim);
            return;
        }
        Node04 toRemove = current.next;
        current.next = toRemove.next;
        if (toRemove.next != null) {
            toRemove.next.prev = current;
        } else {
            tail = current;
        }
        size--;
        System.out.println("Data setelah NIM " + keyNim + " berhasil dihapus:");
        toRemove.data.tampil();
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Indeks tidak valid.");
            return;
        }
        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node04 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
            System.out.println("Data berhasil dihapus pada indeks " + index + ":");
            current.data.tampil();
            size--;
        }
    }

    public Mahasiswa04 getFirst() {
        if (isEmpty()) return null;
        return head.data;
    }

    public Mahasiswa04 getLast() {
        if (isEmpty()) return null;
        return tail.data;
    }

    public Mahasiswa04 getIndex(int index) {
        if (index < 0 || index >= size) return null;
        Node04 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public void insertAfter(String keyNim, Mahasiswa04 data) {
        Node04 current = head;

        //Cari node dengan nim = keyNim
        while(current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if(current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node04 newNode04 = new Node04(data);
        //Jika current adalah tail, cukup tambahkan di akhir
        if(current == tail) {
            current.next = newNode04;
            newNode04.prev = current;
            tail = newNode04;
        }else {
            //Sisispkan di tengah
            newNode04.next = current.next;
            newNode04.prev = current;
            current.next.prev = newNode04;
            current.next = newNode04;
        }
        size++;
        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }
    

    public void print() {
        if (isEmpty()) {
            System.out.println("List kosong.");
            return;
        }else {
            Node04 current = head;
            System.out.println("Isi Double Linked List:");
            while (current != null) {
                current.data.tampil();
                current = current.next;
            }
            System.out.println("Total data: " + size);
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }else {
            Mahasiswa04 dataDihapus = head.data;
            if(head == tail) {
                head = tail = null; // Jika hanya ada satu elemen
            } else {
                head = head.next; // Pindahkan head ke node berikutnya
                head.prev = null; // Set prev dari head baru ke null
            }
            System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah: " );
            dataDihapus.tampil(); // Tampilkan data yang dihapus
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        Mahasiswa04 dataDihapus = tail.data;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah: ");
        dataDihapus.tampil(); // Tampilkan data yang dihapus
    }

    public Node04 search(String nim){
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dicari.");
            return null;
        }
        Node04 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null; // Jika tidak ditemukan
    }
    public int getSize() {
        return size;
    }
}

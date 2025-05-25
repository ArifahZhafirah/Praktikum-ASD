public class TugasSingleLingkedList04 {

    TugasNode04 front;
    TugasNode04 rear;
    int size;

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(TugasMahasiswa04 data) {
        TugasNode04 newNode = new TugasNode04(data);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public TugasMahasiswa04 dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        TugasMahasiswa04 data = front.data;
        front = front.next;
        size--;
        if (isEmpty()) {
            rear = null;
        }
        return data;
    }

    public TugasMahasiswa04 peekFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        return front.data;
    }

    public TugasMahasiswa04 peekRear() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        return rear.data;
    }

    public int getSize() {
        return size;
    }

    public void clear() {
        front = null;
        rear = null;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }

    public void tampilAntrian() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        TugasNode04 current = front;
        System.out.println("Daftar Antrian:");
        while (current != null) {
            current.data.tampilkanInformasi();
            current = current.next;
        }
    }
}
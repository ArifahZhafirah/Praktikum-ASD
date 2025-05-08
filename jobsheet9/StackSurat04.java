package jobsheet9;

public class StackSurat04 {
    Surat04[] stack;
    int size;
    int top;

    public StackSurat04(int size) {
        this.size = size;
        stack = new Surat04[size];
        top = -1;
    }

    boolean isFull(){
        if (top == size -1) {
            return true;
        }else {
            return false;
        }
    }

    boolean isEmpty(){
        if (top == -1) {
            return true;
        }else {
            return false;
        }
    }

    void push(Surat04 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
        }else {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat izin lagi.");
        }
    }

    public Surat04 pop(){
        if (!isEmpty()) {
            Surat04 surat = stack[top];
            top--;
            return surat;
        }else {
            System.out.println("Stack kosong! Tidak ada surat izin yang dapat diproses.");
            return null;
        }
    }

    public Surat04 peek() {
        if (!isEmpty()) {
            return stack[0];
        }else {
            System.out.println("Stack kosong! Tidak ada surat yang dikumpulkan");
            return null;
        }
    }

    public boolean search(String namaMahasiswa) {
        for (int i = 0; i <= top; i++){
            if (stack[i].namaMahasiswa.equalsIgnoreCase(namaMahasiswa)){
                return true;
            }
        }
        return false;
    }
}

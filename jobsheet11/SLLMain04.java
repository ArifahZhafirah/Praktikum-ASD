public class SLLMain04 {
    public static void main(String[] args) {
        SingleLinkedList04 sll = new SingleLinkedList04();
        Mahasiswa04 mhs1 = new Mahasiswa04("Alvaro", "24212200", "1A", 4.0 );   
        Mahasiswa04 mhs2 = new Mahasiswa04("Bimon", "23212201", "2B", 3.8);
        Mahasiswa04 mhs3 = new Mahasiswa04("Cintia", "22212202", "3C", 3.5);
        Mahasiswa04 mhs4 = new Mahasiswa04("Dirga", "21212203", "4D", 3.6);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addFirst(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();  

        System.out.println("data index 1 : ");
        sll.getData(1);
        
        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("Bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
        
    }
    
}

public class Main05 {

    public static void main(String[] args) {
        LinkedIntList05 a = new LinkedIntList05();
        a.add(1);
        a.add(1);
        a.add(1);
        a.add(3);
        a.add(3);
        a.add(6);
        a.add(9);
        a.add(15);
        a.add(15);
        a.add(23);
        a.add(23);
        a.add(23);
        a.add(40);
        a.add(40);
        System.out.println(a.countDuplicates());
    }
}

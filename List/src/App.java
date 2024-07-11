public class App {
    public static void main(String[] args) throws Exception {

        MyList<Integer> list = new MyList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.print();
        System.out.println();

        System.out.println("3. değer" + list.get(2));

        System.out.println("1. İndex silindi");
        list.remove(1);
        list.print();





    }
}

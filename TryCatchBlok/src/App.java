import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int[] arr   = {0,1,2,3,6,5,4};
        int index;
        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println(Arrays.toString(arr));

        System.out.println("Lütfen bir numara giriniz.");
            index = input.nextInt();
        indexOf(arr,index);





    }





    public static void indexOf(int[] arr, int index)
    {
        try {
            System.out.println(arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException e ) {

            System.out.println(e.getClass().getName());
            System.out.println(e.getMessage());
        }
    }
}

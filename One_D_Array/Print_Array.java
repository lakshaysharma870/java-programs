package One_D_Array;
import java.util.Scanner;
public class Print_Array {
    public static void main(String...a){
        Scanner in = new Scanner(System.in);
        System.out.println("enter how many elements u wnat enter:");
        int n = in.nextInt();
        int arr[]=new int[n];


        System.out.println("enter  elements :");
        for(int i=0;i<arr.length;i++){
             arr[i]=in.nextInt();
        }

        System.out.println("enter the no");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        in.close();

    }
}


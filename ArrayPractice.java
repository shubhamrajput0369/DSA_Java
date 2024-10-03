import java.util.*;

public class ArrayPractice {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }

        System.out.println(arr.toString());
    }
}
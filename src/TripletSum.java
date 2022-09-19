import java.util.Scanner;

public class TripletSum {
    public static int[] takeinput(){
        //take input from user
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }
    public static void tripletSum(int[] arr, int num){
        //write your code here
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == num){
                        index++;
                    }
                }
            }
        }
        System.out.print(index+ " ");
    }

    public static void main(String[] args) {
        int[] arr = takeinput();
        int num = new Scanner(System.in).nextInt();
        tripletSum(arr, num);
    }
}

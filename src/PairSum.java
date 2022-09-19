import java.util.Scanner;

public class PairSum {
    public  static int[] takeinput(){
        //take input from user
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }
    public static void pairSum(int[] arr, int num){
        //write your code here
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == num){
                    index++;
                    if (arr[i] < arr[j]){
                        System.out.println(arr[i] + " " + arr[j]);
                    } else {
                        System.out.println(arr[j] + " " + arr[i]);
                    }
                }
            }
        }
        System.out.print("Total Pairs are "+index+ " ");
    }

    public static void main(String[] args) {
        int[] arr = takeinput();
        int num = new Scanner(System.in).nextInt();
        pairSum(arr, num);
    }
}

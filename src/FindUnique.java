import java.util.Scanner;

public class FindUnique {
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
    public static int uniqueNumber(int[] inputArray){
        //find unique number from array
        int ans = 0;
        for (int i = 0; i < inputArray.length; i++) {
            ans = ans ^ inputArray[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        //main function
        //take input from user of how many arrays he want to enter
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arrAns = new int[n];

        for (int index = 0; index < n; index++) {
            int[] arr = takeinput();
            arrAns[index] = uniqueNumber(arr);
        }
        for (int i :arrAns) {
            System.out.println(i);
        }
    }
}


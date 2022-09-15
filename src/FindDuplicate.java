import java.util.Scanner;

public class FindDuplicate {
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
    public static int duplicateNumber(int[] inputArray){
        //find duplicate number
        for (int i = 0; i < inputArray.length; i++) {
            //check if number is present in array
            for (int j = i + 1; j < inputArray.length; j++) {
                //if number is present return it
                if (inputArray[i] == inputArray[j]){
                    return inputArray[i];
                }
            }
        }
        //if no duplicate number is found return -1
        return -1;
    }

    public static void main(String[] args) {
        int ans = duplicateNumber(takeinput());
        System.out.println(ans);
    }


}

import java.util.Scanner;

// How do you find the missing number in a given integer array of 1 to 100?

public class Missing_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int [100];
       int total_sum=100*(100+1)/2;
       int sum=0;
       for(int i=0; i<100; i++){
         sum+= arr[i];
       }
       int missing_element=total_sum-sum;
       System.out.println(missing_element);
    }
}

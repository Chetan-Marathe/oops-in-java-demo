import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("The factorial of the number is "+fact(a));
    }
    static int fact(int a){
        if(a<=1){
            return 1;
        }
        return a*fact(a-1);
    }
}

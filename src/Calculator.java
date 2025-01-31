import java.util.*;
public class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no 1");
        int a = sc.nextInt();
        System.out.println("Enter no 2");
        int b = sc.nextInt();
        System.out.println("Addition is "+add(a,b));
        System.out.println("Subtraction is "+sub(a,b));
        System.out.println("Multiplication is "+mul(a,b));
        System.out.println("Division is "+div(a,b));
    }
    static int add(int a, int b){
        return a+b;
    }
    static int sub(int a, int b){
        return a-b;
    }
    static int mul(int a, int b){
        return a*b;
    }
    static int div(int a, int b){
        return a/b;
    }
}
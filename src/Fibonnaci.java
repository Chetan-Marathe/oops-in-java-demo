import java.util.*;
public class Fibonnaci {
    public static void main(String[] args) {
        System.out.println("Enter the upper limit");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        fibo(a);
    }

    static void fibo(int a){
        int m =0;
        int n =1;
        int o = 0;
        System.out.print(m);
        System.out.print(" "+n);
        for(int i=1;i<a;i++){
            o=m+n;
            System.out.print(" "+o);
            m=n;
            n=o;
        }
    }

}

package practicas;
import java.util.Scanner;
public class clase1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        int casos = sc.nextInt();
        for(int i=0; i<casos;i++){
            a=sc.nextInt() ; b=sc.nextInt();
            System.out.println(a*b);
        }
        sc.close();
    }
}
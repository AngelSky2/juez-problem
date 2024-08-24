import java.util.Scanner;
public class latas_y_mas_latas {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int tamaño= sc.nextInt();
        int sacar=sc.nextInt();
        long p1=tamaño-sacar;
        long p2=sacar-1;
        long piramideA=((p1+1)*p1)/2;
        long piramideB=((p2+1)*p2)/2;
        System.out.println(piramideA+piramideB);
        sc.close();
    }
    
}

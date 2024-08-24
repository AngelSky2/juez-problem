import java.util.Scanner;
public class p1019{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,c,d;
        a=sc.nextInt();
        for(int i =0  ; i<a ;i++){
            b=sc.nextInt();
            c=sc.nextInt();
            d=sc.nextInt();
            int men= men(b, c, d);
            int may= may(b, c, d);
            System.out.println("Case 1: "+(b+c+d-men-may));
        }
        sc.close();

    }
    public static int may(int a, int b,int c){
        if(a<b){
            if(b<c){
                return c;
            }
            else{
                return b;
            }
        }
        else{
            if(a<c){
                return c;
            }
            else{
                return a;
            }
        }
    }
    public static int men(int a, int b,int c){
        if(a<b){
            if(a<c){
                return a;
            }
            else{
                return c;
            }
        }
        else{
            if(b<c){
                return b;
            }
            else{
                return c;
            }
        }
    }
}
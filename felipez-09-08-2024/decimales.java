import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;
public class decimales {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int loop= sc.nextInt();
        for(int i =0 ; i<loop ;i++){
            int es=sc.nextInt();
            if(!primo(es)){
                System.out.println(es+": "+-1);
            }
            else{
                String aux =" ";
                BigDecimal uno=BigDecimal.ONE;
                BigDecimal n=new BigDecimal(es);
                MathContext mc = new MathContext(41);
                BigDecimal decimal=uno.divide(n,mc);
                String resultado =decimal.toPlainString();
                for(int j=1;j<=40;j++){
                    aux+=resultado.charAt(j+1)+" ";
                }
                System.out.println(es+":"+aux);
                
            }

        }
        sc.close();
    }
    public static boolean primo(int numero){
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; 
            }
        }
        return true;
    }
}

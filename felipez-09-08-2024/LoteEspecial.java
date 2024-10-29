import java.util.Scanner;
public class LoteEspecial {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x=sc.nextInt();
        int [] vect = new int[n];
        int suma =0;
        for (int i =0 ;i<n ; i++){
            int a = sc.nextInt();
            suma +=a;
            vect[i]=a;
        }
        if(verificador(suma, vect, n, x)){
            System.out.println("SI");
        }
        else{
            System.out.println("NO");
        }

        sc.close();
    }
    public static Boolean verificador(int suma, int[] vect, int n, int x){
        if(sumaimar(suma)&&creciente(vect, n)&&primo(n, vect, x)){
            return true;
        }
        return false;
    }
    public static Boolean sumaimar(int suma){
        if(!(suma %2==0)){
            return true;
        }
        return false;
    }
    public static Boolean creciente(int[] vect,int n){
        for (int i =0; i<n-1;i++){
            if(vect[i]> vect[i+1]){
                return false;
            }
        }
        return true;
    }
    public static boolean primo(int n, int vect[], int x){
        int suma =0;
        for (int i = 0 ; i<n; i++){
            if(esPrimo(vect[i])){
                suma++;
            }
            if(x<=suma){
                return true;
            }
        }
        return false;
    }
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}

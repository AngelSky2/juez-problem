import java.util.Scanner;
public class estar_o_no_estara {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String cadena=sc.nextLine();
        cadena=cadena.replace(",","");
        String[] partes=cadena.split(" ");
        for(int i=0 ; i<partes.length;i++){
            if(partes[i].contains("o")){
                System.out.println(partes[i]);
            }
        }
        sc.close();
    }
}

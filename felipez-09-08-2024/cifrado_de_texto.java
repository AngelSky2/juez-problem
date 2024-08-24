import java.util.Scanner;
public class cifrado_de_texto {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String cadena;
        while(!(cadena= sc.nextLine()).isEmpty()){
            cadena=convertir(cadena);
            System.out.println(cadena);
        }
        sc.close();
    }
    public static String convertir (String cadeana){
        String total="";
        boolean sw=true;
        String primero , segundo;
        for (char caracter : cadeana.toCharArray()) {
            String binario=String.format("%8s", Integer.toBinaryString(caracter)).replace(' ', '0');
            primero=binario.substring(0,4);
            segundo=binario.substring(4,8);
            String igual=segundo+primero;
            String numero = Integer.toString(Integer.parseInt(igual, 2));
            if(sw){
                total=numero;
                sw=false;
            }
            else{
                total=total+" "+numero;
            }
        }
        return total;
        
        
    }
}

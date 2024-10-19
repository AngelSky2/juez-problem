package práctica6;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class noki{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String [] n2= {"a","b","c"};
        String [] n3= {"d","e","f"};
        String [] n4= {"g","h","i"};
        String [] n5= {"j","k","l"};
        String [] n6= {"m","n","o"};
        String [] n7= {"p","q","r","s"};
        String [] n8= {"t","u","v"};
        String [] n9= {"w","x","y","z"};
        HashMap<Integer , String[]> nokia = new HashMap<>();
        
        nokia.put(2, n2);
        nokia.put(3, n3);
        nokia.put(4, n4);
        nokia.put(5, n5);
        nokia.put(6, n6);
        nokia.put(7, n7);
        nokia.put(8, n8);
        nokia.put(9, n9);
        int numero= sc.nextInt();
        
        List<String[]> vectores = new ArrayList<>();
        List<String> combinaciones = new ArrayList<>();
        int s=0;
        while (numero != 0) {
            int digito = numero % 10; 
            s = s * 10 + digito; 
            numero /= 10; 
        }
        while (s > 0) {
            int digito = s % 10; 
            String[] vectorRecuperado = nokia.get(digito);
            vectores.add(vectorRecuperado);
            s /= 10; 
        }
        

        generarCombinaciones(vectores, vectores.size() - 1, new String[vectores.size()], combinaciones);
        combinaciones.sort(null);
        for (String combinacion : combinaciones) {
            System.out.println(combinacion);
        }



        sc.close();
    }
    private static void generarCombinaciones(List<String[]> vectores, int indice, String[] combinacion, List<String> resultado) {
        
        if (indice < 0) {
            resultado.add(String.join("", combinacion));
            return;
        }
        for (String elemento : vectores.get(indice)) {
            combinacion[indice] = elemento; 
            generarCombinaciones(vectores, indice - 1, combinacion, resultado);
        }
    }
}
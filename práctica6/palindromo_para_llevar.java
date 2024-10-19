import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ParticionesPalindromo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        List<List<String>> resultados = new ArrayList<>();
        int[] contador = {0};
        particionarPalindromos(s, 0, new ArrayList<>(), resultados);
        contarPalindromos(s, 0, new ArrayList<>(), contador);
        
        System.out.println(contador[0]);
        for (List<String> particion : resultados) {
            System.out.println(particion);
        }
    }

    private static void particionarPalindromos(String s, int inicio, List<String> actual, List<List<String>> resultados) {
        if (inicio >= s.length()) {
            resultados.add(new ArrayList<>(actual)); // Agregar copia de la partición actual
            return;
        }

        for (int fin = inicio + 1; fin <= s.length(); fin++) {
            String subcadena = s.substring(inicio, fin);
            if (esPalindromo(subcadena)) {
                actual.add(subcadena); // Agregar subcadena a la partición actual
                particionarPalindromos(s, fin, actual, resultados); // Recursión para el resto de la cadena
                actual.remove(actual.size() - 1); // Retroceder para explorar otras particiones
            }
        }
    }

    private static boolean esPalindromo(String str) {
        int izquierda = 0;
        int derecha = str.length() - 1;

        while (izquierda < derecha) {
            if (str.charAt(izquierda) != str.charAt(derecha)) {
                return false; // No es un palíndromo
            }
            izquierda++;
            derecha--;
        }
        return true; // Es un palíndromo
    }
    private static void contarPalindromos(String s, int inicio, List<String> actual, int[] contador) {
        if (inicio >= s.length()) {
            contador[0]++; // Aumentar el contador cuando se encuentra una partición válida
            return;
        }

        for (int fin = inicio + 1; fin <= s.length(); fin++) {
            String subcadena = s.substring(inicio, fin);
            if (esPalindromo(subcadena)) {
                actual.add(subcadena); // Agregar subcadena a la partición actual
                contarPalindromos(s, fin, actual, contador); // Recursión para el resto de la cadena
                actual.remove(actual.size() - 1); // Retroceder
            }
        }
    }
}

import java.util.Scanner;
public class SumaDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leer x y k
        int x = scanner.nextInt();
        int k = scanner.nextInt();

        // Calcular x^k
        long potencia = (long) Math.pow(x, k);
        
        // Calcular a1 = s(x^k)
        int a1 = sumaDigitos(potencia);
        
        // Calcular a2 = s(a1)
        int a2 = sumaDigitos(a1);
        
        // a3, a4, ..., hasta a201
        int resultado = a2;
        for (int i = 3; i <= 201; i++) {
            resultado = sumaDigitos(resultado);
        }

        // Imprimir el resultado
        System.out.println("a201 = " + resultado);
    }

    private static int sumaDigitos(long n) {
        int suma = 0;
        while (n > 0) {
            suma += n % 10; // Sumar el último dígito
            n /= 10;        // Eliminar el último dígito
        }
        return suma;
    }

    private static int sumaDigitos(int n) {
        int suma = 0;
        while (n > 0) {
            suma += n % 10; // Sumar el último dígito
            n /= 10;        // Eliminar el último dígito
        }
        return suma;
    }
}

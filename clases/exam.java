import java.util.PriorityQueue;
import java.util.Scanner;

class Operacion implements Comparable<Operacion> {
    double num1;
    double num2;
    char operador;

    public Operacion(double num1, double num2, char operador) {
        this.num1 = num1;
        this.num2 = num2;
        this.operador = operador;
    }

    @Override
    public int compareTo(Operacion otra) {
        return Integer.compare(precedencia(otra.operador), precedencia(this.operador));
    }

    private static int precedencia(char operador) {
        switch (operador) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return 0;
        }
    }

    public double calcular() {
        switch (operador) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            case '^':
                return Math.pow(num1, num2);
            default:
                throw new IllegalArgumentException("Operador no válido: " + operador);
        }
    }
}

public class exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una expresión (ejemplo: 3 + 5 * 2). Escriba 'salir' para terminar.");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("salir")) {
                break;
            }

            double resultado = evaluarExpresion(input);
            System.out.println("Resultado: " + resultado);
        }

        scanner.close();
    }

    public static double evaluarExpresion(String expresion) {
        String[] tokens = expresion.split(" ");
        PriorityQueue<Operacion> colaPrioridad = new PriorityQueue<>();

        for (int i = 0; i < tokens.length; i++) {
            if (i > 0 && i < tokens.length - 1) {
                double num1 = Double.parseDouble(tokens[i - 1]);
                double num2 = Double.parseDouble(tokens[i + 1]);
                char operador = tokens[i].charAt(0);
                colaPrioridad.add(new Operacion(num1, num2, operador));
            }
        }

        double resultado = 0;
        while (!colaPrioridad.isEmpty()) {
            Operacion operacion = colaPrioridad.poll();
            resultado = operacion.calcular();
        }

        return resultado;
    }
}

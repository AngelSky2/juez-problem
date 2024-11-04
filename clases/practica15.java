import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;

public class practica15 {
    private static HashMap<String, String> javaKeywords = new HashMap<>();
    static {
        javaKeywords.put("abstract", "Indica que una clase o método es abstracto.");
        javaKeywords.put("assert", "Usado para realizar una afirmación durante la ejecución.");
        javaKeywords.put("boolean", "Tipo de dato que representa valores verdaderos o falsos.");
        javaKeywords.put("break", "Termina el bucle o el switch.");
        javaKeywords.put("byte", "Tipo de dato entero de 8 bits.");
        javaKeywords.put("case", "Define una opción en una estructura switch.");
        javaKeywords.put("catch", "Captura excepciones en un bloque try.");
        javaKeywords.put("char", "Tipo de dato que representa un carácter.");
        javaKeywords.put("class", "Define una clase.");
        javaKeywords.put("const", "Palabra reservada no utilizada en Java.");
        javaKeywords.put("continue", "Salta a la siguiente iteración de un bucle.");
        javaKeywords.put("default", "Define la opción predeterminada en un switch.");
        javaKeywords.put("do", "Inicia un bucle do-while.");
        javaKeywords.put("double", "Tipo de dato de punto flotante de doble precisión.");
        javaKeywords.put("else", "Define una alternativa en una estructura if.");
        javaKeywords.put("enum", "Define un conjunto de constantes enumeradas.");
        javaKeywords.put("extends", "Indica que una clase hereda de otra.");
        javaKeywords.put("final", "Declara una constante o una clase/método que no puede ser modificado.");
        javaKeywords.put("finally", "Bloque que se ejecuta después de try-catch.");
        javaKeywords.put("float", "Tipo de dato de punto flotante de precisión simple.");
        javaKeywords.put("for", "Inicia un bucle for.");
        javaKeywords.put("goto", "Palabra reservada no utilizada en Java.");
        javaKeywords.put("if", "Inicia una estructura condicional.");
        javaKeywords.put("implements", "Indica que una clase implementa una interfaz.");
        javaKeywords.put("import", "Importa clases o paquetes.");
        javaKeywords.put("instanceof", "Verifica si un objeto es una instancia de una clase o interfaz.");
        javaKeywords.put("int", "Tipo de dato entero de 32 bits.");
        javaKeywords.put("interface", "Define una interfaz.");
        javaKeywords.put("long", "Tipo de dato entero de 64 bits.");
        javaKeywords.put("native", "Indica que un método es implementado en código nativo.");
        javaKeywords.put("new", "Crea una nueva instancia de un objeto.");
        javaKeywords.put("null", "Literal que representa la ausencia de un valor.");
        javaKeywords.put("package", "Define un paquete.");
        javaKeywords.put("private", "Especifica que un miembro es accesible solo dentro de su propia clase.");
        javaKeywords.put("protected", "Especifica que un miembro es accesible en su propia clase, clases derivadas y en su paquete.");
        javaKeywords.put("public", "Especifica que un miembro es accesible desde cualquier otra clase.");
        javaKeywords.put("return", "Devuelve un valor de un método.");
        javaKeywords.put("short", "Tipo de dato entero de 16 bits.");
        javaKeywords.put("static", "Indica que un miembro pertenece a la clase en lugar de a instancias de la clase.");
        javaKeywords.put("strictfp", "Asegura que los cálculos de punto flotante sean consistentes.");
        javaKeywords.put("super", "Se refiere a la clase base de una subclase.");
        javaKeywords.put("switch", "Define una estructura de control múltiple.");
        javaKeywords.put("synchronized", "Usado para controlar el acceso a un bloque de código por múltiples hilos.");
        javaKeywords.put("this", "Referencia a la instancia actual de la clase.");
        javaKeywords.put("throw", "Lanza una excepción.");
        javaKeywords.put("throws", "Declara que un método puede lanzar excepciones.");
        javaKeywords.put("transient", "Indica que un campo no debe ser serializado.");
        javaKeywords.put("try", "Inicia un bloque para manejar excepciones.");
        javaKeywords.put("void", "Indica que un método no devuelve ningún valor.");
        javaKeywords.put("volatile", "Indica que un campo puede ser modificado por múltiples hilos.");
        javaKeywords.put("while", "Inicia un bucle while.");
        
    }
    public static void main(String[] args) throws FileNotFoundException{
        File f = new File("Codigo.txt");
        
        Scanner sc = new Scanner(f);
        int cont=0;
        while(sc.hasNext()){
            String token=sc.next();
            if(javaKeywords.containsKey(token)){
                cont++;
                System.out.println(token + ": " + javaKeywords.get(token));
            }
            
        }
        System.out.println(cont);
    }
    
}

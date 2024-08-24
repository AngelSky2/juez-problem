
import java.util.Scanner;
public class Copia_detectada{
    
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        //System.out.println("hola mundo");
        int repet=sc.nextInt();
        for(int i = 0 ; i < repet; i++){
            int cse=sc.nextInt();
            int[] vect=readVector(sc,cse);
            int dist=diferent(vect);
            System.out.println(dist);
        }
        sc.close();
    }
    public static int[] readVector(Scanner sc, int a){
        
        int[] vec= new int[a];
        for(int i =0 ; i < a; i ++){
            vec[i]=sc.nextInt();
        }
        return vec;
    }
    public static int diferent(int[] vec){
        int firstValue = vec[0]; 
        if(vec[0]!=vec[1]){
            if (vec[1]==vec[2]){
                return 0;
            }
            return 1;
        }
        for (int i = 1; i < vec.length; i++) {
            if (vec[i] != firstValue) {
                return i; 
            }
        }
        return -1;
    }
}
import java.util.Scanner;
public class suma_de_cubos {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int loop=sc.nextInt();
        for(int i =0; i<loop;i++){
            int a=sc.nextInt();
            System.out.println(son(a)); 
        }
        
        sc.close();

    }
    public static String son(int a){
        for(int i=0; i<100;i++){
            for(int j=0;j<100;j++ ){
                for(int k=0;k<100;k++){
                    
                    if(i*i*i+j*j*j+k*k*k==a){
                        String resutado=(a+" se puede expresar como la suma de 3 cubos");
                        return resutado;
                    }
                }
            }
        }
        String resutado=(a+" no se puede expresar como la suma de 3 cubos");
        return resutado;
    }
}

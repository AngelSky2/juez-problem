import java.util.Scanner;
import java.util.HashMap;
public class accidente_de_microndas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repet= sc.nextInt();
        HashMap<String,Integer> hora= new HashMap<>();
        String h,m,s;
        for(int i =0 ; i<repet ;i++){
            String input = sc.next();
            String[] parts = input.split(":");
            hora.put("hora", Integer.parseInt(parts[0]));
            hora.put("minutos", Integer.parseInt(parts[1]));
            hora.put("segundos",00);
            hora=restar(hora);
            h=devolver("hora", hora);
            m=devolver("minutos", hora);
            s=devolver("segundos", hora);
        

            System.out.println(h+":"+m+":"+s);
        }
        sc.close();
    }
    public static String devolver(String a,HashMap<String,Integer> hora){
        if(hora.get(a)!=0){
            if(hora.get(a)<10){
                return "0"+Integer.toString(hora.get(a));
            }
            return Integer.toString(hora.get(a));
        }
        else{
            return "00";
        }
    }
    public static HashMap<String,Integer> restar(HashMap<String,Integer> hora){
        hora.put("segundos", hora.get("segundos")-hora.get("minutos"));
        if(hora.get("segundos")<0){
            hora.put("minutos",hora.get("minutos")-1);
            hora.put("segundos",hora.get("segundos")+60);
        }
            hora.put("minutos", hora.get("minutos")-hora.get("hora"));
        if(hora.get("minutos")<0){
            hora.put("hora",hora.get("hora")-1);
            hora.put("minutos",hora.get("minutos")+60);
        }
        return hora;
    }
}

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class clase15 {

    public static void main(String[] args) {
        Set<Integer> claves= new HashSet<Integer>();
        claves.add(50);
        claves.add(10);
        claves.add(100);
        System.out.println("calves "+claves);
        TreeSet<Integer> ts = new TreeSet<Integer>(claves);
        System.out.println("ts "+ ts);


    }
}
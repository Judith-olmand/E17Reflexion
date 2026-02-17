import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class E17Reflexion {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));
        for(String s: lista){
            System.out.println(s);
        }
        for (String s : lista) {
            if ("D".equals(s)) {
                lista.remove(s); // Lanza ConcurrentModificationException
            }
        }
        System.out.println();
        for(String s: lista){
            System.out.println(s);
        }
    }
}
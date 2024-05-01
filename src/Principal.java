import java.util.Arrays;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Rogerio","Renata","Ary","Sarah","Miguel","Paula");

        nomes.stream()
                .sorted()
                .limit(3)
                .forEach(System.out::println);
    }
}

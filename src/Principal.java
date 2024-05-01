import java.util.Arrays;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Rogerio","Renata","Ary","Sarah","Miguel","Paula");

        nomes.stream()
                .sorted()
                .limit(3)
                .forEach(System.out::println);

        nomes.stream().sorted()
                .limit(3)
                .filter(n -> n.startsWith("R")) // nesse caso não retornou nenhum  nome mesmo contendo 2 no array .
                .map(n -> n.toUpperCase())
                .forEach(System.out::println);

        nomes.stream().sorted()
                .limit(3)
                .filter(n -> n.startsWith("A")) // nesse caso retornou corretament o Ary só continha ele no Array.
                .map(n -> n.toUpperCase())
                .forEach(System.out::println);
    }
}

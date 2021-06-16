//O
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class ConjuntoBomRuim {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int entradaDados = Integer.valueOf(br.readLine());

        while (entradaDados != 0) {
            List<String> conjunto = new ArrayList<>();
            for (int i = 0; i < entradaDados; i++)
                conjunto.add(br.readLine());

            conjunto = conjunto.stream().sorted().collect(Collectors.toList());

            String saida = "Conjunto Bom";
            for (int i = 0; i < entradaDados - 1; i++) {
                if (conjunto.get(i + 1).startsWith(conjunto.get(i))) {
                    saida = "Conjunto Ruim";
                    break;
                }
            }

            System.out.println(saida);
            entradaDados = Integer.valueOf(br.readLine());
        }
    }
}
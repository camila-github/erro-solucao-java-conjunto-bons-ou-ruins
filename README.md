## Exercicio (Java): Abreviando posts do blog

O exercicio publicado é referente ao treinamento do Bootcamp Java - Praticando Programação em Java 
(https://digitalinnovation.one)


#### Descrição do Desafio:

Nesse algoritmo você deverá descobrir se um conjunto de palavras é bom ou ruim. Por definição, um conjunto é bom quando nenhuma palavra desse conjunto é um prefixo de outra palavra. Caso contrário, é considerado um conjunto ruim.

Por exemplo, {dbc, dae, dbcde} é um conjunto ruim, pois dbc é um prefixo de dbcde. Quando duas palavras são idênticas, definimos como uma sendo prefixo da outra.

#### Entrada: 

A entrada contém vários casos de teste. A primeira linha de cada caso de teste terá um inteiro N (1 ≤ N ≤ 10⁵), que representa a quantidade de palavras no conjunto. Segue então N linhas, cada uma tendo uma palavra de no máximo 100 letras minúsculas. A entrada termina quando N = 0 e não deve ser processada.

#### Saída: 

Para cada caso de teste, você deverá imprimir "Conjunto Bom", ou "Conjunto Ruim", conforme explicado acima.

Exemplos de Entrada  | Exemplos de Saída
------------- | -------------
3 | Conjunto Ruim
abc | Conjunto Bom
dae |
abcde |
2 |
abc |
def |
0 |


#### Java　

```java
//SOLUCAO 1

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
```


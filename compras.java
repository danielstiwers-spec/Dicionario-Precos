import java.util.HashMap;
import java.util.Scanner;

public class compras{
    public static void main(String[] args){
        HashMap<String, Double> tabelaPrecos = new HashMap<>();

        tabelaPrecos.put("78910", 4.50);
        tabelaPrecos.put("78920", 8.90);
        tabelaPrecos.put("78930", 12.00);

        HashMap<String, String> nomesProdutos = new HashMap<>();
        nomesProdutos.put("78910", "Chocolate");
        nomesProdutos.put("78920", "Café");
        nomesProdutos.put("78930", "Azeite");

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o código de barras):");
            String codigoBarras = scanner.nextLine();

            if (tabelaPrecos.containsKey(codigoBarras)) {
                String nomeProduto = nomesProdutos.get(codigoBarras);
                Double preco = tabelaPrecos.get(codigoBarras);
                System.out.printf("Produto localizado! %s - Preço: R$ %.2f%n", nomeProduto, preco);
            } else {
                System.out.println("Código de barras não identificado. Procure suporte para mais informações.");
            }
        }
    }
    
}
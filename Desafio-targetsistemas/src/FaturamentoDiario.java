
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FaturamentoDiario {
    
    public static void main(String[] args) throws IOException {
        // Ler o arquivo JSON que contém o faturamento diário
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(new File("dados.json"));
        JsonNode faturamentoDiario = root.get("faturamento_diario");
        
        // Criar um vetor com os valores de faturamento diário
        double[] faturamento = new double[faturamentoDiario.size()];
        for (int i = 0; i < faturamento.length; i++) {
            faturamento[i] = faturamentoDiario.get(i).asDouble();
        }
        
        // Calcular o menor valor de faturamento diário
        double menorFaturamento = Arrays.stream(faturamento).min().getAsDouble();
        System.out.println("Menor faturamento diário: " + menorFaturamento);
        
        // Calcular o maior valor de faturamento diário
        double maiorFaturamento = Arrays.stream(faturamento).max().getAsDouble();
        System.out.println("Maior faturamento diário: " + maiorFaturamento);
        
        // Calcular a média mensal de faturamento, ignorando dias sem faturamento
        double somaFaturamento = 0;
        int numDiasComFaturamento = 0;
        for (double f : faturamento) {
            if (f > 0) {
                somaFaturamento += f;
                numDiasComFaturamento++;
            }
        }
        double mediaFaturamento = somaFaturamento / numDiasComFaturamento;
        
        // Contar o número de dias com faturamento acima da média
        int numDiasAcimaDaMedia = 0;
        for (double f : faturamento) {
            if (f > mediaFaturamento) {
                numDiasAcimaDaMedia++;
            }
        }
        System.out.println("Número de dias com faturamento acima da média: " + numDiasAcimaDaMedia);
    }

}


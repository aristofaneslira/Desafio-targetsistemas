
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FaturamentoDiario {
    
    public static void main(String[] args) throws IOException {
        // Ler o arquivo JSON que cont�m o faturamento di�rio
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(new File("dados.json"));
        JsonNode faturamentoDiario = root.get("faturamento_diario");
        
        // Criar um vetor com os valores de faturamento di�rio
        double[] faturamento = new double[faturamentoDiario.size()];
        for (int i = 0; i < faturamento.length; i++) {
            faturamento[i] = faturamentoDiario.get(i).asDouble();
        }
        
        // Calcular o menor valor de faturamento di�rio
        double menorFaturamento = Arrays.stream(faturamento).min().getAsDouble();
        System.out.println("Menor faturamento di�rio: " + menorFaturamento);
        
        // Calcular o maior valor de faturamento di�rio
        double maiorFaturamento = Arrays.stream(faturamento).max().getAsDouble();
        System.out.println("Maior faturamento di�rio: " + maiorFaturamento);
        
        // Calcular a m�dia mensal de faturamento, ignorando dias sem faturamento
        double somaFaturamento = 0;
        int numDiasComFaturamento = 0;
        for (double f : faturamento) {
            if (f > 0) {
                somaFaturamento += f;
                numDiasComFaturamento++;
            }
        }
        double mediaFaturamento = somaFaturamento / numDiasComFaturamento;
        
        // Contar o n�mero de dias com faturamento acima da m�dia
        int numDiasAcimaDaMedia = 0;
        for (double f : faturamento) {
            if (f > mediaFaturamento) {
                numDiasAcimaDaMedia++;
            }
        }
        System.out.println("N�mero de dias com faturamento acima da m�dia: " + numDiasAcimaDaMedia);
    }

}


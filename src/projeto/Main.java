package projeto;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Definindo o faturamento mensal por estado
        Map<String, Double> faturamentoMensal = new HashMap<>();
        faturamentoMensal.put("SP", 67836.43);
        faturamentoMensal.put("RJ", 36678.66);
        faturamentoMensal.put("MG", 29229.88);
        faturamentoMensal.put("ES", 27165.48);
        faturamentoMensal.put("Outros", 19849.53);

        // Calculando o total do faturamento mensal
        double totalFaturamentoMensal = faturamentoMensal.values()
                .stream()
                .mapToDouble(Double::doubleValue)
                .sum();

        // Calculando o percentual de representação de cada estado
        Map<String, Double> percentualPorEstado = new HashMap<>();
        for (String estado : faturamentoMensal.keySet()) {
            double faturamentoEstado = faturamentoMensal.get(estado);
            double percentual = faturamentoEstado / totalFaturamentoMensal * 100;
            percentualPorEstado.put(estado, percentual);
        }

        // Imprimindo os resultados
        System.out.println("Faturamento mensal por estado:");
        System.out.println(faturamentoMensal);

        System.out.println("\nPercentual de representação de cada estado no faturamento mensal:");
        System.out.println(percentualPorEstado);

    }

}

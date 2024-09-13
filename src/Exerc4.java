import java.math.BigDecimal;
import java.math.RoundingMode;


public class Exerc4 {
    public static void main(String[] args) {

        //A classe BigDecimal foi escolhida com o intuito de priorizar a precisão dos dados informados.

        BigDecimal[] values = {new BigDecimal("67836.43"), new BigDecimal("36678.66"),
        new BigDecimal("29229.88"), new BigDecimal("27165.48"), new BigDecimal("19849.53")};

        String[] states = {"SP", "RJ", "MG", "ES", "Outros"};

        BigDecimal sumOfValues = new BigDecimal("0");
        BigDecimal[] valuesOnPercent = new BigDecimal[5];
        BigDecimal percent = new BigDecimal("100");

        //Soma dos valores do array "values".
        for (int i = 0; i < values.length; i++) {
            sumOfValues = sumOfValues.add(values[i]);
        }
        
        for (int x = 0; x < values.length; x++) {
            valuesOnPercent[x] = values[x].divide(sumOfValues, 2, RoundingMode.DOWN);
        }

        for (int p = 0; p < valuesOnPercent.length; p++) {
            System.out.println(states[p] + " - " + valuesOnPercent[p].multiply(percent) + "%");
        }

        
        
    }
}

public class Exerc3 {
    public static void main(String[] args) throws Exception {
        
        double[] values = {22174.1664, 24537.6698, 26139.6134, 26742.6612, 42889.2258, 46251.174, 11191.4722, 3847.4823,
                          373.7838, 2659.7563, 48924.2448, 18419.2614, 5240.1826, 43829.1667, 18235.6852, 4355.0662, 13327.1025, 
                          25681.8318, 1718.1221, 13220.495, 8414.61
                          };

        System.out.println("\nMaior valor: " + greatestValue(values) + "\n");

        System.out.println("Menor valor: " + lowestValue(values) + "\n");

        System.out.println("Número de dias no mês em que o valor de faturamento diário foi superior à média mensal. " + daysAboveAverage(values) + "\n");

    }

    static double greatestValue(double[] values) {
        double greatestValue = 0;

        for (int i = 0; i < values.length; i++) {
            if (values[i] > greatestValue) {
                greatestValue = values[i];
            }
        }

        return greatestValue;
    }

    static double lowestValue(double[] values) {
        // Essa variável contém o maior valor de double. Assim, sempre que o array for iterado, ele passará valores menores que os anteriores até chegar no menor valor.
        double lowestValue = Double.MAX_VALUE;
        
        for(int i = 0; i < values.length; i++) {
            if (values[i] < lowestValue) {
                lowestValue = values[i];
            }
        }

        return lowestValue;
    }

    static double daysAboveAverage(double[] values) {
        double average;
        double sumOfTheValues = 0;
        int daysAboveAverage = 0;

        for (int i = 0; i < values.length; i++) {
            sumOfTheValues += values[i];
        }

        average = sumOfTheValues/values.length;

        // for que descobre o número de dias no mês em que o valor de faturamento diário foi superior à média mensal. 
        for (int x = 0; x < values.length; x++) {
            if (values[x] > average) {
                daysAboveAverage = daysAboveAverage + 1;
            }
            
        }
        return daysAboveAverage;
    }

}

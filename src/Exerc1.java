public class Exerc1 {
    public static void main(String[] args) throws Exception {
        
        int INDICE = 13, SOMA = 0, K = 0;

        try {
            while (K < INDICE) {
                K = K + 1;
                SOMA = SOMA + K;
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        //Saída: 91.
        System.out.println(SOMA);

    }
}

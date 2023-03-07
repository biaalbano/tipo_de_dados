public class EstruturaDeRepeticao {
    /**
     * @param args
     */
   public static void main(String args[]) {
      /*  for (int i= 150; i<=300; i++){
            System.out.println(i);
        }; EXERCÍCIO 1
*/
        int soma = 0;
        for (int i=1 -1; i<=1000; i++){
            soma = soma + i;

        public static void main(String[] args) {


            for (int i = 150; i <= 300; i++) {
                System.out.println(i);
            }

            System.out.println("\n");


            int soma = 0;

            for (int n = 0; n <= 1000; n++) {

                soma = n + soma;

            }

            System.out.println(soma);
            System.out.println("\n");


            for (int md3 = 0; md3 <= 100; md3 += 3) {
                System.out.println(md3);
            }

            System.out.println("\n");


            for (int fatNum = 10; fatNum >= 0; fatNum--) {
                int fatResult = 1;

                for (int fat = fatNum; fat > 1; fat--) {

                    if (fat == 0) {
                        fatResult = 1;
                        break;
                    } else {
                        fatResult = fat * fatResult;
                    }
                }

                System.out.println(fatNum + "! = " + fatResult);
            }
        }


    }
}
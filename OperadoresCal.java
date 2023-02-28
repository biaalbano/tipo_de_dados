import java.util.Scanner;

public class OperadorCal {
    //colete dois números do teclado
    //faça as 4 operações matemáticas
    //delcare também as variáveis soma, mult, divisão, resto, subtração;
    public static void main(String[] Barela){
    try (Scanner entrada = new Scanner(System.in)) {
        int numero1=0;
        int numero2=0;
        int soma=0;
        int multiplicacao=0;
        float divisao=0;
        int resto=0;
        int subtracao=0;

        System.out.println("Digite o 1º número: ");
        numero1=entrada.nextInt();

        System.out.println("Digite o 2º número: ");
        numero2=entrada.nextInt();

        soma=numero1+numero2;
        System.out.println("A soma dos dois números é: " +soma);

        multiplicacao=numero1*numero2;
        System.out.println("A multiplicação dos dois números é: " +multiplicacao);

        divisao=numero1/numero2;
        System.out.println("A divisão dos dois números é: " +divisao);

        resto=numero1%numero2;
        System.out.println("O resto dos dois números é: " +resto);

        subtracao=numero1-numero2;
        System.out.println("A subtração dos dois números é: " +subtracao);
    }

}
}

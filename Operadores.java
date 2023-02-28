
public class Operadores {
    public static void main(String[] barela){
        Scanner entrada = new Scanner(System.in);
        int idade=0;
        int numero1=0;
        int numero2=0;
        int soma=0;
        System.out.println("Digite sua idade");
        idade=entrada.nextInt();
        System.out.println(idade);

        System.out.println("Digite um número");
        numero1=entrada.nextInt();

        System.out.println("Digite outro número");
        numero2=entrada.nextInt();
        soma=numero1+numero2;
        System.out.println("A soma dos dois números é" +soma);

    }
}

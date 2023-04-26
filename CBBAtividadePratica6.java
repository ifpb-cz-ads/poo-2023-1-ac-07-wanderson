import java.util.Scanner;

public class CBBAtividadePratica6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[10];
        int maior = Integer.MIN_VALUE;

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %dº número inteiro: ", i+1);
            numeros[i] = entrada.nextInt();
        }

        System.out.println("Os números digitados foram:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        System.out.printf("\nO maior número digitado foi %d", maior);
    }

}

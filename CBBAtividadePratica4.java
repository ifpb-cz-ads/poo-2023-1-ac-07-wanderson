import java.util.Scanner;

public class CBBAtividadePratica4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[] notas = new double[10];
        double media = 0;
        int qtdAcima = 0;
        int qtdAbaixo = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Digite a nota do aluno %d: ", i+1);
            notas[i] = entrada.nextDouble();
            media += notas[i];
        }

        media /= notas.length;

        for (int i = 0; i <= notas.length; i++) {
            if (notas[i] > media) {
                qtdAcima++;
            } else if (notas[i] < media) {
                qtdAbaixo++;
            }
        }

        System.out.printf("A média das notas é %.2f\n", media);
        System.out.printf("%d alunos tiveram notas acima da média\n", qtdAcima);
        System.out.printf("%d alunos tiveram notas abaixo da média\n", qtdAbaixo);
    }

}

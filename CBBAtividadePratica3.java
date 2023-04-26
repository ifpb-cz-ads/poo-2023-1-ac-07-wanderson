public class CBBAtividadePratica3 {
    public static void main(String[] args) {
        int[] numeros = new int[100];

        for (int i = 0; i <numeros.length; i++) {
            numeros[i] = i;
        }
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}

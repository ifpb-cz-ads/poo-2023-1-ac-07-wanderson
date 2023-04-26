public class CBBAtividadePratica5 {

    public static void main(String[] args) {
        String[] dias = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};

        // Laço while
        System.out.println("Laço while:");
        int i = 0;
        while (i < dias.length) {
            System.out.println(dias[i]);
            i++;
        }

        // Laço do-while
        System.out.println("\nLaço do-while:");
        i = 0;
        do {
            System.out.println(dias[i]);
            i++;
        } while (i < dias.length);

        // Laço for
        System.out.println("\nLaço for:");
        for (int j = 0; j < dias.length; j++) {
            System.out.println(dias[j]);
        }
    }

}

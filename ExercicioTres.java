import java.util.HashMap;
import java.util.Scanner;

class ExercicioTres {
    public static void resolve(Scanner scanner) {
        HashMap<String, String> entries = ExercicioDois.resolve(scanner);

        System.out.println("Deseja pesquisar por um CPF? (Reponda com 'sim' ou 'não', sem aspas)");
        String response = scanner.nextLine();
        if (response.toLowerCase().equals("não") || response.toLowerCase().equals("nao"))
            return;
        String option;
        do {
            System.out.println("Digite por um CPF.");
            option = scanner.nextLine();
            String phoneNumber = entries.get(option);
            if (phoneNumber == null) {
                System.out.println("CPF não cadastrado");
            } else {
                System.out.printf("Número de telefone registrado para '%s':\n%s\n", option, phoneNumber);
            }
            System.out.println("Deseja procurar por outro CPF? (Responda com 'sim' ou 'não', sem aspas)");
        } while ((option = scanner.nextLine()).toLowerCase().equals("sim"));
    }
}
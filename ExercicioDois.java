import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class ExercicioDois {
    public static HashMap<String, String> resolve(Scanner scanner) {
        HashMap<String, String> entries = new HashMap<String, String>();
        do {
            System.out.println("Insira seu cpf abaixo (apenas números): ");
            String cpf = scanner.nextLine();
            if (cpf.length() != 11) {
                System.out.println("CPF de tamanho inválido.");
                continue;
            }
            if (entries.get(cpf) != null) {
                System.out.println("CPF já cadastrado.");
                continue;
            }
            System.out.println("Digite seu telefone: ");
            String phoneNumber = scanner.nextLine();
            entries.put(cpf, phoneNumber);
        } while (entries.size() < 5);

        System.out.println("Usuários cadastrados: ");
        int index = 0;
        for (Map.Entry<String, String> entry : entries.entrySet()) {
            System.out.printf("%d - %s (telefone: %s)\n", ++index, entry.getKey(), entry.getValue());
        }
        return entries;
    }
}
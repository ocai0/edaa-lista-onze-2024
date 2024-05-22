import java.util.HashSet;

class ExercicioUm {
    public static void resolve() {
        int[] entries = { 1, 10, 50, 60, 10, 200, 300, 500, 700, 800, 900, 14, 33, 60, 55, 70, 80, 3, 100, 200, 25, 50,
                75, 100, 300, 1000, 11, 22, 33, 60, 70, 80, 100, 35, 10, 150, 75, 85, 95, 200 };
        HashSet<Integer> uniqueEntries = new HashSet<Integer>();
        for (int entry : entries)
            uniqueEntries.add(entry);

        System.out.printf("Quantos números deverão ser sorteados após a exclusão dos números repetidos? ");
        System.out.println(uniqueEntries.size() + " itens");
    }
}
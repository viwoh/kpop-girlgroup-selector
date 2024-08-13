import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class KpopGroupSelector {
    public static void main(String[] args) {
        // Lista de grupos
        ArrayList<String> groups = new ArrayList<>();
        groups.add("Girls' Generation (SNSD)");
        groups.add("EXID");
        groups.add("Red Velvet");
        groups.add("Mamamoo");
        groups.add("GFRIEND");
        groups.add("AOA");
        groups.add("TWICE");
        groups.add("4Minute");
        groups.add("Secret");
        groups.add("KARA");
        groups.add("LOONA");
        
        // Criação do scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número aleatório para selecionar um grupo (de 0 a " + (groups.size() - 1) + "):");
        
        // Leitura do valor do usuário
        int userValue = scanner.nextInt();
        
        // Verificação se o valor está dentro do intervalo válido
        if (userValue >= 0 && userValue < groups.size()) {
            // Exibe o grupo correspondente ao valor inserido
            System.out.println("Você foi redirecionado para o grupo: " + groups.get(userValue));
        } else {
            System.out.println("Número inválido. Por favor, digite um número entre 0 e " + (groups.size() - 1) + ".");
        }
        
        // Fechar o scanner
        scanner.close();
    }
}

import java.util.Scanner;

public class AIChatbot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to JavaBot!");
        System.out.println("Type bye to exit.");

        while (true) {
            System.out.print("You: ");
            String input = sc.nextLine().toLowerCase().trim();

            if (input.contains("bye") || input.contains("exit")) {
                System.out.println("JavaBot: Goodbye!");
                break;
            } else if (input.contains("hello") || input.equals("hi")) {
                System.out.println("JavaBot: Hello! How can I help you?");
            } else if (input.contains("java")) {
                System.out.println("JavaBot: Java is an object-oriented programming language.");
            } else if (input.contains("ai")) {
                System.out.println("JavaBot: AI stands for Artificial Intelligence.");
            } else {
                System.out.println("JavaBot: Sorry, I don't understand that yet.");
            }
        }

        sc.close();
    }
}
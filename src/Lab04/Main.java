package Lab04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = scanner.nextLine();

        String message = sayHello(name);
        System.out.println(message);

        try {
            int num = name.length();
            if (num % 2 != 0)
                throw new OddIntegerException("Your name is odd!");
        } catch (OddIntegerException e) {
            e.printStackTrace();
        } finally {
            System.out.println("You're welcome");
        }
    }

    private static String sayHello(String name) throws NullPointerException {
        if (name == null) {
            throw new NullPointerException("Null string");
        }
        return "Hello, " + name;
    }
}

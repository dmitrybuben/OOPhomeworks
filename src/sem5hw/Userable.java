package sem5hw;

import java.util.Scanner;

public interface Userable {
    default String writeMessage() {
        System.out.println("Write message: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    default void readMessage() {
        String message = String.valueOf(new Scanner(System.in));
        System.out.println("New message for You: " + message);
    }
}

package sem5hw;

import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {
        var userRepository = new UserRepository();
        var user1 = new User(0,"Bill","Koch","B",UserType.USER);
        userRepository.save(user1,0l);
        user1.writeMessage();

        var user2 = new User(1,"Nick","Ball","N",UserType.USER);
        userRepository.save(user2,1l);
        user2.readMessage();

        userRepository.find(user1, 0L);

    }
}

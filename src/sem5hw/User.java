package sem5hw;

public class User extends ChatUser implements Userable{

    public User(int chatUserId, String name, String surname, String nick, UserType userType) {
        super(chatUserId, name, surname, nick, userType);
    }

    @Override
    public String writeMessage() {
        return Userable.super.writeMessage();
    }

    @Override
    public void readMessage() {
    }
}

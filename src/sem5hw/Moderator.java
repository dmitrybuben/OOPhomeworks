package sem5hw;

public class Moderator extends ChatUser implements Moderatable{
    public Moderator(int chatUserId, String name, String surname, String nick, UserType userType) {
        super(chatUserId, name, surname, nick, userType);

}

    @Override
    public void saveToDb() {

    }

    @Override
    public void findMessage() {

    }
}

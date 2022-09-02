package sem5hw;

public class Admin extends ChatUser implements Adminable{

    public Admin(int chatUserId, String name, String surname, String nick, UserType userType) {
        super(chatUserId, name, surname, nick, userType);
    }

    @Override
    public void findMessage() {

    }
}

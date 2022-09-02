package sem5hw;

public abstract class ChatUser {
    private int chatUserId = 0;
    private String name;
    private String surname;
    private String nick;
    private UserType userType;

    public ChatUser(int chatUserId, String name, String surname, String nick, UserType userType) {
        this.chatUserId = chatUserId++;
        this.name = name;
        this.surname = surname;
        this.nick = nick;
        this.userType = userType;
    }

    public int getChatUserId() {
        return chatUserId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getNick() {
        return nick;
    }

    public UserType getUserType() {
        return userType;
    }
}

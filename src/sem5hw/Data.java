package sem5hw;

import java.time.LocalDateTime;

public class Data {
    private Long id = 0L;
    private LocalDateTime createdTime;
    private ChatUser chatUser;
    private Message message;

    public void setId(Long id) {
        this.id = id++;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public void setChatUser(ChatUser chatUser) {
        this.chatUser = chatUser;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
}

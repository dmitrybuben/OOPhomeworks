package sem5hw;

import java.time.LocalDateTime;

public abstract class Message {
    private LocalDateTime createdTime;
    private String message;


    public Message(LocalDateTime createdTime, String message) {
        this.createdTime = createdTime;
        this.message = message;
    }

    @Override
    public String toString() {
        return "Message{" +
                "createdTime='" + createdTime + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}

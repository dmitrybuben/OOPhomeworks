package sem5hw;

import java.time.LocalDateTime;

public class TextMessage extends Message{

    public TextMessage(LocalDateTime createdTime, String message) {
        super(createdTime, message);
    }
}

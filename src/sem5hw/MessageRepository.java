package sem5hw;

import java.time.LocalDateTime;
import java.util.Date;

public class MessageRepository implements Repository<Message, Date> {

    @Override
    public void save(Message message, Date date) {
        Data data = new Data();
        data.setMessage(message);
        data.setCreatedTime(LocalDateTime.now());
    }

    @Override
    public void find(Message message, Date date) {
        Data data = new Data();
        data.setMessage(message);
        data.setCreatedTime(LocalDateTime.now());
    }
}

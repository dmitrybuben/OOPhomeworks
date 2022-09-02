package sem5hw;

import java.time.LocalDateTime;

public class UserRepository implements Repository<ChatUser,Long> {

    @Override
    public void save(ChatUser chatUser, Long aLong) {
        Data data = new Data();
        data.setChatUser(chatUser);
        data.setCreatedTime(LocalDateTime.now());
        data.setId(0l);
        DataBase.putData(data);

    }

    @Override
    public void find(ChatUser chatUser, Long aLong) {
        Data data = new Data();
        data.setChatUser(chatUser);
        data.setCreatedTime(LocalDateTime.now());
        data.setId(0l);
    }
}

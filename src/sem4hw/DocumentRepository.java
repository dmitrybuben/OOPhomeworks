package sem4hw;

import java.time.LocalDateTime;

public class DocumentRepository implements Repository<Document, Long> {

    @Override
    public void save(Document document) {
        Data data = new Data();
        data.setDocument(document);
        data.setCreatedData(LocalDateTime.now());
        data.setId(1);
        DataBase.putData(data);
    }

    @Override
    public void deleteById(Long aLong) {
    }

    @Override
    public Document findById(Long aLong) {
        return null;
    }

    @Override
    public Long update(Document document, Long aLong) {
        return null;
    }
}

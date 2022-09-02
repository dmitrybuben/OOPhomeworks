package sem5hw;

public interface Repository<T,ID> {
    void save(T t,ID id);
    void find(T t,ID id);
}

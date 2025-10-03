package Repository;

public class BaseRepository {
    public void deleteById(ID id) {
        T entity = dataMap.remove(id);
        if (entity != null) {
            allData.remove(entity);
        }
    }

}

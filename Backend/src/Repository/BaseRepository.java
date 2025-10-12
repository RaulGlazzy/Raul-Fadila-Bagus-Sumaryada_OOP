package Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

public abstract class BaseRepository<T, ID> {
    Map<ID, T> dataMap = new HashMap<>();
    protected List<T> allData = new ArrayList<>();

    public Optional<T>  findByID(ID id){
        return Optional.ofNullable(dataMap.get(id));
    };
    public List<T> findAll(){
        return new ArrayList<T>(allData);
    };

    public abstract void save(T entity);
    public abstract ID getID(T entity);
}

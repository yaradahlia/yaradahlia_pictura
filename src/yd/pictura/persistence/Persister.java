package yd.pictura.persistence;

import yd.pictura.persistence.dml.Update;
import java.util.List;
import java.util.UUID;
import yd.pictura.persistence.dml.Delete;
import yd.pictura.persistence.dml.Insert;
import yd.pictura.persistence.dml.Select;

/**
 *
 * @author aaa
 */
public abstract class Persister {
    private Structure structure;
    
    public Structure getStructure() {
        return this.structure;
    }
    
    public long count() {
        long count = 0L;
        
        // FIXME work here by using select method
        
        return count;
    }
    
    public abstract <T extends AEntity> T select(UUID id);
    public abstract <T extends AEntity> List<T> select(Select select, Class<T> c);
    public abstract <T extends AEntity> List<T> select(Select select, int offset, int limit, Class<T> c);
    public abstract <T extends AEntity> T selectOne(Select select, Class<T> c);
    
    
    public <T extends AEntity> void insert(List<T> values) {
        for (T value : values) {
            this.insert(value);
        }
    }
    
    public abstract <T extends AEntity> void insert(T value);
    public abstract <T extends AEntity> void insertBulk(List<T> values, int bulkLength);
    public abstract void insert(Insert insert);    
    
    public <T extends AEntity> void update(List<T> values) {
        for(T value : values) {
            this.update(value);
        }
    }
    
    public abstract <T extends AEntity> void update(T value);
    public abstract void update(Update update);
    public abstract void update(Update update, int limit);
    
    
    public <T extends AEntity> void delete(List<T> values) {
        for(T value : values) {
            this.delete(value);
        }
    }
    
    public abstract <T extends AEntity> void delete(T value);    
    public abstract <T extends AEntity> void deleteBulk(List<T> values, int bulkLength);
    public abstract <T extends AEntity> void delete(Delete delete);
    public abstract <T extends AEntity> void delete(Delete delete, int limit);
}

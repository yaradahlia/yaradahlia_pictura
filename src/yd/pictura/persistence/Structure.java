package yd.pictura.persistence;

/**
 * Provides functionality to handle structure manipulation.
 * @author aaa
 */
abstract class Structure {    
    public abstract void createCollection(Class<? extends AEntity> c);
    public abstract void removeCollection(Class<? extends AEntity> c);
    public abstract void emptyCollection(Class<? extends AEntity> c);
}

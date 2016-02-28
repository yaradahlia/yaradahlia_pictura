package yd.pictura.persistence.annotations;

import yd.pictura.persistence.AEntity;

/**
 * Defines a reference from current type to another one.
 * @author aaa
 */
public @interface NReference {
    
    Class<? extends AEntity> destination = null;
    EReferenceType referenceType = EReferenceType.ONE_TO_MANY;
        
    public static enum EReferenceType {
        ONE_TO_MANY
        ;
    }
}

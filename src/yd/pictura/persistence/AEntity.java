package yd.pictura.persistence;

import java.io.Serializable;
import java.util.UUID;
import yd.pictura.persistence.annotations.NGenerated;
import yd.pictura.persistence.annotations.NId;

/**
 * Base class for all persisted entities;
 * @author aaa
 */
public class AEntity implements Serializable{
    
    @NGenerated
    private Long serverId;
    
    @NId
    private final UUID id;

    public AEntity() {
        this.id = UUID.randomUUID();
    }
    
    
}

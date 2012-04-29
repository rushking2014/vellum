/*
 * Copyright Evan Summers
 * 
 */
package venigma.server.storage;

/**
 *
 * @author evan
 */
public enum StorageExceptionType {
    ID_NULL,
    ENTITY_NULL,
    KEY_NULL,
    KEY_NOT_FOUND,
    KEY_ALREADY_EXISTS,
    ID_NOT_FOUND,
    ID_ALREADY_EXISTS,
    PAIR_NOT_FOUND,
    PAIR_ALREADY_EXISTS,
    NO_DATABASE_STORE_PASSWORD,
    NO_DATABASE_NAME;
    
    public StorageRuntimeException newRuntimeException() {
        return new StorageRuntimeException(this);
    }
    
    public StorageException newException() {
        return new StorageException(this);
    }
    
}

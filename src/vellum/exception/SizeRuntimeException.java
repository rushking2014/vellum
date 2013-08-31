/*
 *    https://code.google.com/p/vellum - Contributed by Evan Summers
 * 
 */
package vellum.exception;

/**
 *
 * @author evan.summers
 */
public class SizeRuntimeException extends RuntimeException {
    long size;
    
    public SizeRuntimeException(long size) {
        this.size = size;
    }
    
    
}

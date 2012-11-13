/*
 * Apache Software License 2.0, (c) Copyright 2012, Evan Summers
 * 
 */
package venigma.data;

import java.util.Date;
import venigma.data.IdEntity;
import venigma.server.CipherRequest;
import venigma.server.CipherRequestType;
import venigma.server.CipherResponseType;

/**
 *
 * @author evan
 */
public class LogEvent implements IdEntity {
    Long id;
    Date timestamp;
    String message;
    CipherRequestType requestType;
    CipherResponseType responseType;
    CipherRequest request;
            
    public LogEvent() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
        
    public void setId(Long id) {
        this.id = id;
    }
    
    @Override
    public Comparable getId() {
        return id;
    }
    
}

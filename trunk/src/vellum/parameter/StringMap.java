/*
 * Apache Software License 2.0, (c) Copyright 2012 Evan Summers, 2010 iPay (Pty) Ltd
 * Apache Software License 2.0
 * Supported by iPay (Pty) Ltd, BizSwitch.net
 */

package vellum.parameter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import vellum.exception.EnumRuntimeException;

/**
 *
 * @author evanx
 */
public class StringMap extends HashMap<String, String> {
    List<Entry<String, String>> entryList = new ArrayList();

    public StringMap() {
    }

    public StringMap(Map m) {
        super(m);
    }
    
    public long getLong(String key) {
        return Long.parseLong(getString(key));
    }
    
    public String getString(String key) {
        String value = super.get(key);
        if (value == null) {
            throw new EnumRuntimeException(StringMapExceptionType.NOT_FOUND);
        }
        return value;
    }
    
    public String getString(String key, String defaultValue) {
        String value = super.get(key);
        if (value == null) {
            return defaultValue;
        }
        return value;
    }
    
    public long getLong(String key, long defaultValue) {
        String string = super.get(key);
        if (string == null) {
            return defaultValue;
        }
        return Long.parseLong(string);        
    }
    
}


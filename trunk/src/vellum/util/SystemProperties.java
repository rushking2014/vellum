/*
       Source https://code.google.com/p/vellum by @evanxsummers

       Licensed to the Apache Software Foundation (ASF) under one
       or more contributor license agreements. See the NOTICE file
       distributed with this work for additional information
       regarding copyright ownership.  The ASF licenses this file
       to you under the Apache License, Version 2.0 (the
       "License"); you may not use this file except in compliance
       with the License.  You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

       Unless required by applicable law or agreed to in writing,
       software distributed under the License is distributed on an
       "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
       KIND, either express or implied.  See the License for the
       specific language governing permissions and limitations
       under the License.  
 */
package vellum.util;

/**
 *
 * @author evan.summers
 */
public class SystemProperties {

    public static String getString(String name) {
        String string = System.getProperty(name);
        if (string == null) {
            throw new RuntimeException(name);
        }
        return string;
    }

    public static String getString(String name, String defaultValue) {
        String string = System.getProperty(name, defaultValue);
        return string;
    }
    
    public static char[] getChars(String name, char[] defaultValue) {
        String string = System.getProperty(name);
        if (string == null) {
            return defaultValue;
        }
        return string.toCharArray();
    }
    
    public static int getInt(String name, int defaultValue) {
        String string = System.getProperty(name);
        if (string == null) {
            return defaultValue;
        }
        return Integer.parseInt(string);
    }
    
    public static boolean getBoolean(String name) {
        return Boolean.getBoolean(name);
    }
    
}

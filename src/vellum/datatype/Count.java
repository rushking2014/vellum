/*
       Contributed (2013) by Evan Summers via https://code.google.com/p/vellum

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
package vellum.datatype;

/**
 *
 * @author evan.summers
 */
public class Count {
    public static final int G = 1024*1024*1024;
    public static final int M = 1024*1024;
    public static final int K = 1024;
    public static final int _16M = 16*1024*1024;

    public static String prettySize(long length) {
        if (length > 5*M) {
            return String.format("%dM", length/M);
        } else if (length > 5*G) {
            return String.format("%dG", length/G);
        }
        return String.format("%d bytes", length);
    }

}

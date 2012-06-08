/*
 * Apache Software License 2.0
 * (c) Copyright 2012, Evan Summers
 */
package vellum.logger;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 *
 * @author evans
 */
public class LogrDispatcher implements LogrHandler {
    List<LogrHandler> handlerList = new CopyOnWriteArrayList();

    @Override
    public void handle(LogrMessage message) {
        for (LogrHandler handler : handlerList) {
            handler.handle(message);
        }
    }

    public List<LogrHandler> getHandlerList() {
        return handlerList;
    }
 
}

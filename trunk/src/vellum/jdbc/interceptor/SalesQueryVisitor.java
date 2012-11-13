/*
 * Apache Software License 2.0, (c) Copyright 2012, Evan Summers
 * 
 */
package vellum.jdbc.interceptor;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author evan
 */
public class SalesQueryVisitor implements QueryVisitor {
    static String SALES_QUERY = "select * from sales where begin_date > ? and end_date < ?";
    
    @Override
    public ResultSet executeQuery(PreparedStatementHandler handler, String sql) throws SQLException {
        if (!sql.equals(SALES_QUERY)) {
            return handler.executeQuery(sql);
        }
        PreparedStatement statement = handler.connection.prepareStatement(sql);
        handler.set(statement);
        return statement.executeQuery(SALES_QUERY);
    }
    
}

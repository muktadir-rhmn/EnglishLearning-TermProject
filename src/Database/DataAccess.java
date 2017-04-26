package Database;

import java.sql.*;

public class DataAccess {
    private String dbURL = "jdbc:oracle:thin:@localhost:1521:XE";
    private String userName = "project";
    private String password = "123";
    private Connection cnn = null; //private bcoz if we make it public, we may mistakenly disconnect this connection
    
    /**
     * Used Singleton design pattern. 
     * Because we need only one connection to the database.
     * 
     */
    private static DataAccess dataAccess= null;
    public static DataAccess getDataAccess(){
        if(dataAccess == null) return (dataAccess = new DataAccess());
        else return dataAccess;
    }
    private DataAccess(){
        dataAccess = this;
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            cnn = DriverManager.getConnection(dbURL, userName, password);
            if(cnn == null) System.out.println("Could not be connected to the database");
            else System.out.println("Connected to DB successfully");

        } catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public PreparedStatement getStatement(String sql) throws SQLException{
        return cnn.prepareStatement(sql);
    }

    public CallableStatement getCallableStatement(String sql) throws SQLException {
        return cnn.prepareCall(sql);
    }
    
}

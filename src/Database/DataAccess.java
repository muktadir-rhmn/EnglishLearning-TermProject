package Database;

import Model.WordGroup;
import java.sql.*;
import java.util.ArrayList;

public class DataAccess {
    private String dbURL = "jdbc:oracle:thin:@localhost:1521:orcl";
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
    
    public ArrayList<WordGroup> levelListWord(){
        ArrayList<WordGroup> temp = new ArrayList<>();
        try{
            String query = "select level_title, ENTITY_LEVEL_ID from entity_level where entity_type = 0";
            PreparedStatement stmt = cnn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while(rs.next())
            {
                String query1 = "select TITLE,word_group_id from WORD_GROUP where level_id = ?";
                String levelName = rs.getString("level_title");
                int levelID = rs.getInt("ENTITY_LEVEL_ID");
                PreparedStatement stmt1 = cnn.prepareStatement(query1);
                stmt1.setInt(1, levelID);
                ResultSet rs1 = stmt1.executeQuery();
                while(rs1.next()){
                    String word_group = rs1.getString("title");
                    int word_group_id = rs1.getInt("word_group_id");
                    WordGroup obj = new WordGroup(levelID, levelName, word_group_id, word_group);
                    temp.add(obj);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
        return temp;
    }  
    
    public ArrayList<String> levelListLesson(){
        ArrayList<String> temp = new ArrayList<>();
        try{
            String query = "select level_title from entity_level where entity_type = 1";
            PreparedStatement stmt = cnn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while(rs.next())
            {
                String levelName = rs.getString("level_title");
                temp.add(levelName);
            }
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
        return temp;
    }    
    
    public PreparedStatement getStatement(String sql) throws SQLException{
        return cnn.prepareStatement(sql);
    }

    public CallableStatement getCallableStatement(String sql) throws SQLException {
        return cnn.prepareCall(sql);
    }
    
}

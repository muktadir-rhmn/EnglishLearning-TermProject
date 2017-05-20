package Model;

import Database.DataAccess;
import javafx.util.Pair;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by MUKTADIR on 5/9/2017.
 */
public class Practice {
    public static void insert(Pair<String , String> p){

        DataAccess da = DataAccess.getDataAccess();
        String sql = "INSERT INTO PRACTICE(PRACTICE_ID, ENTITY_ID, OPTION1, OPTION2) VALUES(PRACTICE_SEQUENCE.NEXTVAL, 0,?, ?)";

        try {
            PreparedStatement stmt = da.getStatement(sql);
            stmt = da.getStatement(sql);
            stmt.setString(1, p.getKey());
            stmt.setString(2, p.getValue());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return;
    }

    public static void insertArticleExercise(Pair<String , String[]> p){

        DataAccess da = DataAccess.getDataAccess();
        String sql = "INSERT INTO PRACTICE(PRACTICE_ID, ENTITY_ID, PROBLEM, OPTION1, OPTION2, OPTION3) VALUES(PRACTICE_SEQUENCE.NEXTVAL, 2,?, ?, ?, ?)";
        
        try {
            PreparedStatement stmt = da.getStatement(sql);
            stmt = da.getStatement(sql);
            stmt.setString(1, p.getKey());
            stmt.setString(2, p.getValue()[0]);
            stmt.setString(3, p.getValue()[1]);
            stmt.setString(4, p.getValue()[2]);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return;
    }
    
    public static void insertPrepositionExercise(Pair<String , String[]> p){

        DataAccess da = DataAccess.getDataAccess();
        String sql = "INSERT INTO PRACTICE(PRACTICE_ID, ENTITY_ID, PROBLEM, OPTION1, OPTION2, OPTION3) VALUES(PRACTICE_SEQUENCE.NEXTVAL, 1,?, ?, ?, ?)";

        try {
            PreparedStatement stmt = da.getStatement(sql);
            stmt = da.getStatement(sql);
            stmt.setString(1, p.getKey());
            stmt.setString(2, p.getValue()[0]);
            stmt.setString(3, p.getValue()[1]);
            stmt.setString(4, p.getValue()[2]);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return;
    }
    
    public static Pair<String , String > [] getFourSentences(){
        Pair<String, String >[] ret = new Pair[4];
        int i = 0;

        String sql = "SELECT *\n" +
                "FROM (SELECT PRACTICE_ID, OPTION1, OPTION2\n" +
                "FROM PRACTICE\n" +
                "WHERE ENTITY_ID = 0\n" +
                "ORDER BY DBMS_RANDOM.RANDOM)\n" +
                "WHERE ROWNUM <= 4\n";

        DataAccess da = DataAccess.getDataAccess();

        try {
            PreparedStatement stmt = da.getStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {//assumed there is always at least one entry.
                String op1 = rs.getString("OPTION1");
                String op2 = rs.getString("OPTION2");
                ret[i++] = new Pair<>(op1, op2);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ret;
    }
    
    public static Pair<String , String[] > [] getFourArticlePractises(){
        Pair<String, String[] >[] ret = new Pair[4];
        int i = 0;
        String sql = "SELECT *\n" +
                "FROM (SELECT PRACTICE_ID, PROBLEM, OPTION1, OPTION2, OPTION3\n" +
                "FROM PRACTICE\n" +
                "WHERE ENTITY_ID = 2\n" +
                "ORDER BY DBMS_RANDOM.RANDOM)\n" +
                "WHERE ROWNUM <= 4\n";

        DataAccess da = DataAccess.getDataAccess();

        try {
            PreparedStatement stmt = da.getStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {//assumed there is always at least one entry.
                int tmpidx = 0;
                String problem = rs.getString("PROBLEM");
                String[] temp = new String[5];
                temp[tmpidx++] = rs.getString("OPTION1");
                temp[tmpidx++] = rs.getString("OPTION2");
                temp[tmpidx] = rs.getString("OPTION3");
                ret[i++] = new Pair<>(problem, temp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ret;
    }
    
    public static Pair<String , String[] > [] getFourPrepositionPractises(){
        Pair<String, String[] >[] ret = new Pair[4];
        int i = 0;
        String sql = "SELECT *\n" +
                "FROM (SELECT PRACTICE_ID, PROBLEM, OPTION1, OPTION2, OPTION3\n" +
                "FROM PRACTICE\n" +
                "WHERE ENTITY_ID = 1\n" +
                "ORDER BY DBMS_RANDOM.RANDOM)\n" +
                "WHERE ROWNUM <= 4\n";

        DataAccess da = DataAccess.getDataAccess();

        try {
            PreparedStatement stmt = da.getStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {//assumed there is always at least one entry.
                int tmpidx = 0;
                String problem = rs.getString("PROBLEM");
                String[] temp = new String[10];
                temp[tmpidx++] = rs.getString("OPTION1");
                temp[tmpidx++] = rs.getString("OPTION2");
                temp[tmpidx] = rs.getString("OPTION3");
                ret[i++] = new Pair<>(problem, temp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ret;
    }
}

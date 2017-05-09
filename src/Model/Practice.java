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
}

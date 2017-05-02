package Model;

import Database.DataAccess;
import Practice.JumbledSentence;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by MUKTADIR on 4/30/2017.
 */
public class MdlJumbledSentence {
    /*public static void main(String[] args) {
        String sentence = "muka I am";
        int[] arr = {2, 0, 1 };
        insert(sentence, arr);
    }
    */
    public static void insert(String sentence, int[] correctOrder)  {
        String str = "";
        for (int i = 0; i < correctOrder.length; i++) {
            str += correctOrder[i] + ",";
        }
        str = str.trim(); //removes the last space

        DataAccess da = DataAccess.getDataAccess();
        String sql = "INSERT INTO JUMBLED_SENTENCE(JUMBLED_SENTENCE_ID, JUMBLED_SENTENCE, CORRECT_ORDER) VALUES(JUMBLED_SENTENCE_SEQUENCE.NEXTVAL, ?, ?)";

        try {
            PreparedStatement stmt = da.getStatement(sql);
            stmt = da.getStatement(sql);
            stmt.setString(1, sentence);
            stmt.setString(2, str);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return;
    }

    public static JumbledSentence getRandomSentence(){
        JumbledSentence ret = new JumbledSentence();

        String sql = "SELECT *\n" +
                "FROM (SELECT *\n" +
                "FROM JUMBLED_SENTENCE\n" +
                "ORDER BY DBMS_RANDOM.RANDOM)\n" +
                "WHERE ROWNUM =1\n";

        DataAccess da = DataAccess.getDataAccess();

        try {
            PreparedStatement stmt = da.getStatement(sql);
            ResultSet rs = stmt.executeQuery();
            rs.next();//assumed there is always at least one entry.
            ret.sentence = rs.getString("JUMBLED_SENTENCE");
            ret.correctOrderStr = rs.getString("CORRECT_ORDER");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ret;
    }

}

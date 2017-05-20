/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Database.DataAccess;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import javafx.util.Pair;

/**
 *
 * @author user
 */
public class Lesson {
    int entityID;
    String title;
    String content;
    int levelID;
    int levelNo;
    int entity_type;
    DataAccess db = DataAccess.getDataAccess();
    public Lesson(String title, String content, int levelNo, int entity_type){
        this.entityID = db.getEnityId();
        System.out.println(entityID);
        this.title = title;
        this.content = content;
        this.levelNo = levelNo;
        this.entity_type = entity_type;
        //db.insertLesson(entityID, title, content, levelID);
    }
    public Lesson(){
        //
    }
    public void insertLesson(){
        EntityLevel obj = new EntityLevel(levelNo, entity_type);
        levelID = obj.getLevelID();
        db.insertLesson(entityID, title, content, levelID);
    }
    public Set<Pair<String, Integer> > getLessonLevel(){
        DataAccess da = DataAccess.getDataAccess();
        String sql = "Select * from entity_level where entity_type = 1";
        Set<Pair<String, Integer> > List = new HashSet<>(); 
        try {
            PreparedStatement stmt = da.getStatement(sql);
            stmt = da.getStatement(sql);
            ResultSet rs1 = stmt.executeQuery();
            while(rs1.next()){
                String title = rs1.getString("LEVEL_TITLE");
                Integer id = rs1.getInt("ENTITY_LEVEL_ID");
                System.out.println(title);
                System.out.println(id);
                
                Pair obj = new Pair(title, id);
                List.add(obj);
            }
            return List;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public ArrayList<Pair<String, String> > getLesson(int level_id){
        DataAccess da = DataAccess.getDataAccess();
        String sql = "Select * from LESSON where level_id = ?";
        ArrayList<Pair<String, String>> List = new ArrayList<>(); 
        try {
            PreparedStatement stmt = da.getStatement(sql);
            stmt = da.getStatement(sql);
            stmt.setInt(1, level_id);
            ResultSet rs1 = stmt.executeQuery();
            while(rs1.next()){
                String title = rs1.getString("TITLE");
                String content = rs1.getString("CONTENT");
                Pair obj = new Pair(title, content);
                List.add(obj);
            }
            return List;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}

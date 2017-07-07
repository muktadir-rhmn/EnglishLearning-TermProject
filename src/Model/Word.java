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
import java.util.HashSet;
import java.util.Set;
import javafx.util.Pair;

/**
 *
 * @author user
 */
public class Word {
    String word;
    String meaning;
    String partsofSpeech;
    int wordGroupID;
    int entityID;
    DataAccess db = DataAccess.getDataAccess();
    public Word(String word, String meaning, String partsofSpeech, int wordGroupID){
        this.entityID = db.getEnityId();
        this.word = word;
        this.partsofSpeech = partsofSpeech;
        this.meaning = meaning;
        this.wordGroupID = wordGroupID; 
    }
    
    public Word(int entityID, String word, String meaning, String partsofSpeech){
        this.entityID = entityID;
        this.word = word;
        this.partsofSpeech = partsofSpeech;
        this.meaning = meaning;
    }
    
    public int getEntityID(){
        return entityID;
    }
    
    public String getWord(){
        return word;
    }
    
    public String getMeaning(){
        return meaning;
    }
    
    public String getPartsofSpeech(){
        return partsofSpeech;
    }
    
    public Word(){}
    
    public void insertWord(){
        db.insertWord(entityID, word, meaning, partsofSpeech, wordGroupID);
    }
    
    public Set<Pair<String, Integer> > getWordLevel(){
        DataAccess da = DataAccess.getDataAccess();
        String sql = "Select * from entity_level where entity_type = 0";
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
    
    public ArrayList<Pair<String, Integer> > getWordGroup(int level_id){
        DataAccess da = DataAccess.getDataAccess();
        String sql = "Select * from WORD_GROUP where level_id = ?";
        ArrayList<Pair<String, Integer>> List = new ArrayList<>(); 
        try {
            PreparedStatement stmt = da.getStatement(sql);
            stmt = da.getStatement(sql);
            stmt.setInt(1, level_id);
            ResultSet rs1 = stmt.executeQuery();
            while(rs1.next()){
                String title = rs1.getString("TITLE");
                int id = rs1.getInt("WORD_GROUP_ID");
                Pair obj = new Pair(title, id);
                List.add(obj);
            }
            return List;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public ArrayList<Word> getWord(int level_id){
        DataAccess da = DataAccess.getDataAccess();
        String sql = "Select * from WORD where WORD_GROUP_ID = ?";
        ArrayList<Word> List = new ArrayList<>(); 
        try {
            PreparedStatement stmt = da.getStatement(sql);
            stmt = da.getStatement(sql);
            stmt.setInt(1, level_id);
            ResultSet rs1 = stmt.executeQuery();
            while(rs1.next()){
                int id = rs1.getInt("ENTITY_ID");
                String title = rs1.getString("WORD");
                String meaning = rs1.getString("meaning");
                String partsofSpeech = rs1.getString("PARTS_OF_SPEECH");
                Word obj = new Word(id,title, meaning, partsofSpeech);
                List.add(obj);
            }
            return List;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public ArrayList<String> getExamples(int id){
        DataAccess da = DataAccess.getDataAccess();
        String sql = "Select * from WORD_EXAMPLE where ENTITY_ID = ?";
        ArrayList<String> List = new ArrayList<>();
        try {
            PreparedStatement stmt = da.getStatement(sql);
            stmt = da.getStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs1 = stmt.executeQuery();
            while(rs1.next()){
                String example = rs1.getString("SENTENCE");
                List.add(example);
            }
            return List;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public Word getWord(String name){
        DataAccess da = DataAccess.getDataAccess();
        String sql = "Select * from WORD where WORD = ?";
        try {
            PreparedStatement stmt = da.getStatement(sql);
            stmt = da.getStatement(sql);
            stmt.setString(1, name);
            ResultSet rs1 = stmt.executeQuery();
            if(rs1.next()){
                int id = rs1.getInt("ENTITY_ID");
                String title = rs1.getString("WORD");
                String meaning = rs1.getString("meaning");
                String partsofSpeech = rs1.getString("PARTS_OF_SPEECH");
                Word obj = new Word(id,title, meaning, partsofSpeech);
                return obj;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}

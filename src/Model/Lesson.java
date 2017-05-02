/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Database.DataAccess;

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
    public void insertLesson(){
        EntityLevel obj = new EntityLevel(levelNo, entity_type);
        levelID = obj.getLevelID();
        db.insertLesson(entityID, title, content, levelID);
    }
}

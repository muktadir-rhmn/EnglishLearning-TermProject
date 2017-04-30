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
public class EntityLevel {
    int levelNo;
    int entity_type;
    public EntityLevel(int levelNo, int entity_type){
        this.levelNo = levelNo;
        this.entity_type = entity_type;
    }
    public int getLevelID(){
        DataAccess db = DataAccess.getDataAccess();
        return db.getEnityLevelId(levelNo, entity_type);
    }
}

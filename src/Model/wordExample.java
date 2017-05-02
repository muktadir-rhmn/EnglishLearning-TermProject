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
public class wordExample {
    String example;
    int entityID;
    DataAccess db = DataAccess.getDataAccess();
    public wordExample(String example){
        this.example = example;
        this.entityID = db.getEnityId();
    }
    public void insertWordExample(){
        db.insertWordExample(entityID, example);
    }
}

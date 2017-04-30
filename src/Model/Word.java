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
    public void insertWord(){
        db.insertWord(entityID, word, meaning, partsofSpeech, wordGroupID);
    }
}

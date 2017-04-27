/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author user
 */
public class WordGroup {
    int entity_id;
    String entity_level_title;
    int word_group_id;
    String word_group_title;
    public WordGroup(int entity_id, String entity_level_title, int word_group_id, String word_group_title){
        this.entity_id = entity_id;
        this.entity_level_title = entity_level_title;
        this.word_group_id = word_group_id;
        this.word_group_title = word_group_title;
    }
    public int get_entity_id(){return entity_id;}
    public String get_entity_level_title(){return entity_level_title;}
    public int get_word_group_id(){return word_group_id;}
    public String get_word_group_title(){return word_group_title;}
}


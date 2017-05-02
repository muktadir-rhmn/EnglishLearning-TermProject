/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Database.DataAccess;
import java.sql.PreparedStatement;

/**
 *
 * @author user
 */
public class Entity {
    public Entity(){
        DataAccess db = DataAccess.getDataAccess();
        db.insertEntity();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Database.DataAccess;

import java.sql.PreparedStatement;
import java.sql.SQLException;

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
    public EntityLevel(){
        //
    }

    public int getLevelID(){
        DataAccess db = DataAccess.getDataAccess();
        return db.getEnityLevelId(levelNo, entity_type);
    }

    public void insertLevel(int type , int levelNo, String levelTitle){
        DataAccess da = DataAccess.getDataAccess();
        String sql = "insert into entity_level values(?, ?, ?, ?)";
        try {
            PreparedStatement stmt = da.getStatement(sql);
            stmt.setInt(1, da.getEnityLevelIdByMuktadir());
            stmt.setInt(2,levelNo);
            stmt.setString(3,levelTitle);
            stmt.setInt(4,type);
            stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}

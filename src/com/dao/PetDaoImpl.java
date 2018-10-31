package com.dao;

import com.domain.Pet;
import com.utils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PetDaoImpl extends DBConnection implements PetDao {
    /**
     * 查询所有宠物
     */
    @Override
    public List<Pet> findAllPet() throws Exception {
        Connection connection=DBConnection.getConnection();
        String sql="select * from Pet";
        PreparedStatement ps=connection.prepareStatement(sql);
        ResultSet rs=ps.executeQuery();
        List<Pet> petList=new ArrayList<>();
        while(rs.next()){
            Pet pet=new Pet();
            pet.setId(rs.getInt(0));
            pet.setOwnerId(rs.getInt(1));
            pet.setStoreId(rs.getInt(2));
            pet.setName(rs.getString(0));
            pet.setTypeName(rs.getString(1));
            pet.setHealth(rs.getInt(3));
            pet.setLove(rs.getInt(4));
            pet.setBirthday(rs.getDate(0));
            petList.add(pet);
        }
            DBConnection.closeAll(connection,ps,rs);
            return petList;
    }




}

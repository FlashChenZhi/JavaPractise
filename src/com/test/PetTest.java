package com.test;

import com.dao.PetDaoImpl;
import com.domain.Pet;

import java.util.List;

public class PetTest {

    public static void main(String[] args) {
        PetDaoImpl pdi=new PetDaoImpl();
        try {
            List<Pet> list=pdi.findAllPet();
            for(Pet pet:list){
                System.out.println("宠物编号："+pet.getId()+"\t\t主人代号："+pet.getOwnerId()+"\t\t商代编号："+pet.getStoreId()+
                        "\t\t宠物名字："+pet.getName()+"\t\t宠物类型："+pet.getTypeName()+"\t\t健康状态："+pet.getHealth()+
                        "\t\t爱心值："+pet.getLove()+"\t\t出生年月："+pet.getBirthday());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

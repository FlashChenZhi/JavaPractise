package com.dao;

import com.domain.Pet;

import java.util.List;

public interface PetDao {
    /**
     * 查询所有宠物
     */
    List<Pet> findAllPet() throws Exception;

}

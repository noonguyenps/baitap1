package com.example.baitap1.DAO;

import com.example.baitap1.Models.CategoryModel;

import java.util.List;

public interface ICategoryDao {
    List<CategoryModel> findAll();
    void create(CategoryModel categoryModel);
    void edit(CategoryModel category);
    void delete(int id);
    CategoryModel get(int id);

}

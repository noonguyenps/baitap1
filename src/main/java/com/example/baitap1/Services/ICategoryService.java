package com.example.baitap1.Services;

import com.example.baitap1.Models.CategoryModel;

import java.util.List;

public interface ICategoryService {
    List<CategoryModel> findAll();
    void edit(CategoryModel category);
    void delete(int id);
    void create(CategoryModel categoryModel);
    CategoryModel get(int id);

}

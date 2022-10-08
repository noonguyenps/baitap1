package com.example.baitap1.Services.Impl;

import com.example.baitap1.DAO.ICategoryDao;
import com.example.baitap1.DAO.Impl.CategoryImpl;
import com.example.baitap1.Models.CategoryModel;
import com.example.baitap1.Services.ICategoryService;

import java.util.List;

public class ICategoryServiceImpl implements ICategoryService {
    ICategoryDao categoryDao = new CategoryImpl();
    @Override
    public List<CategoryModel> findAll() {
        return  categoryDao.findAll();
    }

    @Override
    public void edit(CategoryModel category) {
        categoryDao.edit(category);
    }

    @Override
    public void delete(int id) {
        categoryDao.delete(id);
    }

    @Override
    public void create(CategoryModel categoryModel) {
        categoryDao.create(categoryModel);
    }

    @Override
    public CategoryModel get(int id) {
        return categoryDao.get(id);
    }
}

package com.ecommerce.demo.Service;

import com.ecommerce.demo.Model.categoryModel;

import java.util.List;
//using inteface to promote loose coupling and modularity in code base
//it will also have  declaration of all the methods we want to have
//the categoryServiceImpl class will implement all the methods declared in the categoryService (interface).
public interface categoryService {
    List<categoryModel> getAllCategories();
    void createCategory(categoryModel category);
}


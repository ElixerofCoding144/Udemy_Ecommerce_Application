package com.ecommerce.demo.Service;

import com.ecommerce.demo.Model.categoryModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class categoryServiceImpl implements categoryService{
    //datatype of categories is categoryModel which is defined in categoryModel.java
    private List<categoryModel> categories = new ArrayList<>();
    private Long nextId = 1L;//created this variable to manage ids

    @Override
    public List<categoryModel> getAllCategories() {
        return categories;
    }
    @Override
    public void createCategory( categoryModel category){
        category.setCategoryId(nextId++);//automatically increase the id when a new category will be added
        categories.add(category);
    }
}

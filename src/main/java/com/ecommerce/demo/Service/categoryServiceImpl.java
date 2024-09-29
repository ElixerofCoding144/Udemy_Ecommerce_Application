package com.ecommerce.demo.Service;

import com.ecommerce.demo.Model.categoryModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class categoryServiceImpl implements categoryService{
    //datatype of categories is categoryModel which is defined in categoryModel.java
    private List<categoryModel> categories = new ArrayList<>();

    @Override
    public List<categoryModel> getAllCategories() {
        return categories;
    }
    @Override
    public void createCategory( categoryModel category){
        categories.add(category);
    }
}

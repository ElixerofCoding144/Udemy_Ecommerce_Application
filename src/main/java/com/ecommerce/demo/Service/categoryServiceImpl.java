package com.ecommerce.demo.Service;

import com.ecommerce.demo.Model.categoryModel;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

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

    @Override
    public String deleteCategory(Long categoryID) {
        categoryModel category = categories.stream().filter(c -> c.getCategoryId().equals(categoryID)).findFirst().orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource not found"));
        if (category==null) return "CategoryID doesn't exist. :/";
        categories.remove(category);
        return "Category: " + category.getCategoryName() + " with category ID: " + categoryID + " is deleted successfully!! :)";
    }
}

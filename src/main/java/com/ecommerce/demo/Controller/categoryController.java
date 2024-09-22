package com.ecommerce.demo.Controller;

import com.ecommerce.demo.Model.categoryModel; // Correct import for your model
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class categoryController {
    //datatype of categories is categoryModel which is defined in categoryModel.java
    private List<categoryModel> categories = new ArrayList<>();
    @GetMapping("/api/public/categories")
    public List<categoryModel> getAllCategories(){
        return categories;
    }

    @PostMapping("/api/public/categories")
    public String createCategory(@RequestBody categoryModel categoryInput){
        categories.add(categoryInput);
        return "Category added successfully";
    }

}

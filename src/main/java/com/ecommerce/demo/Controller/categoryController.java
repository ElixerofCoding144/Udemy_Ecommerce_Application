package com.ecommerce.demo.Controller;

import com.ecommerce.demo.Model.categoryModel; //import for your model
import com.ecommerce.demo.Service.categoryService; //import for your service
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class categoryController {
    @Autowired
    private categoryService categoryService;//datatype of categoryService is being injected here
//This is a constructor injection
//    public categoryController(categoryService categoryService) {
//        this.categoryService = categoryService;
//    }

    @GetMapping("/api/public/categories")
    public List<categoryModel> getAllCategories(){
        return categoryService.getAllCategories();
    }

    @PostMapping("/api/public/categories")
    public String createCategory(@RequestBody categoryModel categoryInput){
        categoryService.createCategory(categoryInput);
        return "Category added successfully";
    }

}

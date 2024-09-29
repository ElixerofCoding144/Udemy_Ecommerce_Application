package com.ecommerce.demo.Controller;

import com.ecommerce.demo.Model.categoryModel; //import for your model
import com.ecommerce.demo.Service.categoryService; //import for your service
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    //Without @PathVariable, Spring Boot cannot map the URL parameter to the method's argument.
    // i.e. we were getting the following error after hitting api
    //    {
    //        "timestamp": "2024-09-29T19:43:20.207+00:00",
    //            "status": 500,
    //            "error": "Internal Server Error",
    //            "path": "/api/admin/categories/1"
    //    }
    @DeleteMapping("/api/admin/categories/{categoryID}")
    public String deleteCategory(@PathVariable Long categoryID){
        String status = categoryService.deleteCategory(categoryID);
        return status;
    }
}

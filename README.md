# Udemy_Ecommerce_Application
Building a Production-Grade eCommerce App - Design, develop and deploy a fully functional eCommerce app using Spring Boot, Spring Framework and related tech.

# File structure 

![image](https://github.com/user-attachments/assets/c7172a45-e53a-4ead-994a-1eb604e72029)


# Overview of Files

### `categoryController.java`

This is your controller class that handles HTTP requests. It contains two methods:
1. **getAllCategories()**: Returns all the categories in the categories list.
2. **createCategory()**: Adds a new category to the categories list when an HTTP POST request is made.

### `categoryModel.java`

This is your model class that represents the structure of a category. It has two properties:
- **categoryId**: A unique identifier for the category.
- **categoryName**: The name of the category.

Lombok's `@Getter` and `@Setter` annotations generate the getter and setter methods for these fields automatically.

### `EcommerceApplication.java`

This is the entry point of your Spring Boot application. The `main` method runs the Spring Boot application by calling `SpringApplication.run()`.



# Udemy_Ecommerce_Application
Building a Production-Grade eCommerce App - Design, develop and deploy a fully functional eCommerce app using Spring Boot, Spring Framework and related tech.

# File structure 

![image](https://github.com/user-attachments/assets/c7172a45-e53a-4ead-994a-1eb604e72029)


# Overview of Files

Lombok's `@Getter` and `@Setter` annotations generate the getter and setter methods for these fields automatically.

### `categoryController.java`

- This is your controller class that handles HTTP requests.
- It uses the categoryService interface to call business logic methods for managing categories.
- Annotated with @RestController to handle RESTful API requests.
- Uses constructor injection or field injection (with @Autowired) to inject the categoryService.
- It contains two methods:
  1. **getAllCategories()**: Returns all the categories in the categories list.
  2. **createCategory()**: Adds a new category to the categories list when an HTTP POST request is made.
- Endpoints:
  1. GET /api/public/categories: Fetches all categories.
  2. POST /api/public/categories: Adds a new category based on the categoryModel passed in the request body.

### `categoryModel.java`

-This is your model class that represents the structure of a category. It has two properties:
  1. **categoryId**: A unique identifier for the category.
  2. **categoryName**: The name of the category.

Lombok's `@Getter` and `@Setter` annotations generate the getter and setter methods for these fields automatically.

### `Service Folder`
#### `categoryService.java`

This is your model class that represents the structure of a category. It has two properties:
- **categoryId**: A unique identifier for the category.
- **categoryName**: The name of the category.

#### `categoryServiceImpl.java`
- The class implements the `categoryService` interface and provides the actual business logic for the category operations.
- It uses an in-memory list (categories) `List<categoryModel>` to store categories and manage them.
- It maintains a `nextId` variable to simulate auto-incrementing IDs for categories.
- Annotated with `@Service` to be recognized as a service layer by Spring Boot’s dependency injection mechanism.
- Key Methods:
  1. `getAllCategories()`: Returns a list of all stored categories.
  2. `createCategory(categoryModel category)`: Adds a new category to the list.

### `EcommerceApplication.java`

This is the entry point of your Spring Boot application. The `main` method runs the Spring Boot application by calling `SpringApplication.run()`.


![image](https://github.com/user-attachments/assets/1e140d09-6af1-49b4-a2b3-96b9e5c5819d)

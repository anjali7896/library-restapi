
## 1. Project Title & Goal
This project is a Spring Boot REST API that manages a library book inventory using strictly in-memory storage, tested using Postman and developed in Spring Tool Suite (STS).

The API allows adding, retrieving, filtering by year, and deleting books.

---

## 2. Setup Instructions

### Prerequisites
- Java 11 or higher
- Maven
- Spring Tool Suite (STS)
- Postman

### Steps to Run the Project
1. Open Spring Tool Suite (STS)**.
2. Import the project:
```

File → Import → Existing Maven Project → Select project folder → Finish

```
3. Right-click `LibraryApplication.java` → **Run As → Spring Boot App**.
4. The application will start at:
```

[http://localhost:8080](http://localhost:8080)

````
5. Use **Postman** to test the API endpoints.

---

## 3. Project Logic

### Why this approach was chosen
- The requirement specified **strictly in-memory storage**, so a `HashMap<Integer, Book>` is used instead of a database.
- Spring Boot is used for **fast and clean REST API development**.
- Postman is used for testing requests and responses.
- STS is used to organize the project and run it easily.

### Hardest Bug and Fix
- **Problem:** Encountered `404 Not Found` and `BookService bean not found`.
- **Cause:** Controller was outside the base package, and `@Service` annotation was missing.
- **Fix:** 
  - Moved all classes under `com.example.library`.
  - Added `@Service` annotation to `BookService`.
  - Restarted the application.

---

## 4. API Endpoints

| Method | Endpoint | Description |
|--------|---------|-------------|
| POST   | /books | Add a new book |
| GET    | /books/{id} | Get a book by ID |
| GET    | /books/search?year={year} | Get books filtered by year |
| GET    | /books | Get all books |
| DELETE | /books/{id} | Delete a book by ID |

---

## 5. Postman Screenshots

 1. GET /books → Retrieve all books
    ![image_alt](https://github.com/anjali7896/library-restapi/blob/965d74ae1659c249d60020dc24a4e6bcf802ef73/Screenshot%20(51).png) 
   
 2. GET /books/search?year=2024 → Filter by year
   ![image_alt](https://github.com/anjali7896/library-restapi/blob/9d5f6cea44f9ec1d73ad20ccfd7a6fd8d7c1330f/Screenshot%20(53).png)

 3. Delete a book by id
    ![image-alt](https://github.com/anjali7896/library-restapi/blob/63e1b7928c149ab55905d11a5342bbc0345b5a33/Screenshot%20(54).png)

---

## 6. Future Improvements

If I had **2 more days**, I would:

* Add **Swagger UI** for API documentation
* Add **exception handling** for better error responses
* Write **unit tests** using JUnit and Mockito
* Add **input validation** (prevent duplicate IDs or invalid input)
* Optionally integrate a **database** while keeping in-memory mode for testing

---

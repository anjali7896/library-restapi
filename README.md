
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

## 5. Sample Requests and Responses

### 5.1 Add Books (POST /books)
**Request Body Example 1**
```json
{
  "id": 1,
  "title": "Ramayan",
  "author": "Valmiki",
  "year": 2024
}
````

**Request Body Example 2**

```json
{
  "id": 2,
  "title": "Mahabharat",
  "author": "Ved Vyasa",
  "year": 2024
}
```

**Request Body Example 3**

```json
{
  "id": 3,
  "title": "Bhagavad Gita",
  "author": "Ved Vyasa",
  "year": 2023
}
```

---

### 5.2 Get All Books (GET /books)

**Expected Response**

```json
[
  {
    "id": 1,
    "title": "Ramayan",
    "author": "Valmiki",
    "year": 2024
  },
  {
    "id": 2,
    "title": "Mahabharat",
    "author": "Ved Vyasa",
    "year": 2024
  },
  {
    "id": 3,
    "title": "Bhagavad Gita",
    "author": "Ved Vyasa",
    "year": 2023
  }
]
```

---

### 5.3 Get Books by Year (GET /books/search?year=2024)

**Expected Response**

```json
[
  {
    "id": 1,
    "title": "Ramayan",
    "author": "Valmiki",
    "year": 2024
  },
  {
    "id": 2,
    "title": "Mahabharat",
    "author": "Ved Vyasa",
    "year": 2024
  }
]
```

---

### 5.4 Get Book by ID (GET /books/1)

**Expected Response**

```json
{
  "id": 1,
  "title": "Ramayan",
  "author": "Valmiki",
  "year": 2024
}
```

---

### 5.5 Delete a Book (DELETE /books/3)

**Response**

```
Book deleted successfully
```

---

## 6. Postman Screenshots


2. GET /books → Retrieve all books
   
4. GET /books/search?year=2024 → Filter by year
![image_alt](https://github.com/anjali7896/library-restapi/blob/9d5f6cea44f9ec1d73ad20ccfd7a6fd8d7c1330f/Screenshot%20(53).png)

---

## 7. Future Improvements

If I had **2 more days**, I would:

* Add **Swagger UI** for API documentation
* Add **exception handling** for better error responses
* Write **unit tests** using JUnit and Mockito
* Add **input validation** (prevent duplicate IDs or invalid input)
* Optionally integrate a **database** while keeping in-memory mode for testing

---

✅ Fully in-memory
✅ Tested using **Postman**
✅ Developed in **Spring Tool Suite (STS)**
✅ Clean REST API with CRUD operations

```

---

If you want, I can **also prepare a ready-made Postman collection JSON** with:

- POST requests for the 3 holy books  
- GET all books  
- GET by year 2024  

So you can **import into Postman and take screenshots immediately**.  

Do you want me to do that next?
```

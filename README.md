# 1.8.Lambas-Level2

## 📄 Description – Exercise Statement

This project contains the solution to the following Java exercises:

### Exercise 1
Create a list of proper names and return only those that:
- Start with an uppercase `'A'`.
- Have exactly 3 letters.

### Exercise 2
Given a list of integers, return a **comma-separated string** where each number is prefixed with:
- `'e'` if the number is **even**
- `'o'` if the number is **odd**

Example:

```sh
Input: [3, 55, 44]
Output: "o3, o55, e44"
```


### Exercise 3
Create a **Functional Interface** called `Operation` with a method `operacion(float a, float b)`.  
Inject lambdas that perform **addition**, **subtraction**, **multiplication**, and **division**.


### Exercise 4
Create a list that includes both **strings** and **numbers**, and:
1. Sort alphabetically by the first character (`charAt(0)`).
2. Sort so that strings containing `'e'` appear first.
3. Replace every `'a'` or `'A'` with `'4'`.
4. Display only numeric elements (even if stored as strings).

All implemented through **Lambdas and Streams**, using `ListUtilsService`.

---

### 🧰 Common Utility: `ListUtilsService`

A shared utility class containing static, reusable methods for list operations:
- Sorting by string length or first character.
- Filtering and transforming lists.
- Replacing characters case-insensitively.
- Checking if numbers are even.
- Extracting numeric strings.

All methods are **static**, **functional**, and **stateless**, following good practice for utility services.



---

## 💻 Technologies Used
- **Java 17**
- **Streams API**
- **Lambda Expressions**
- **Method References**
- **Functional Interfaces**
- **IntelliJ IDEA**
- **Git & GitHub**

---

## 📋 Requirements
- JDK 17 or higher installed  
- IntelliJ IDEA (or any Java-compatible IDE)  
- Git

---

## 🛠️ Installation
Clone the repository and access the project folder:

```sh
git clone https://github.com/leilaweicman/1.8.Lambas-Level2.git
cd 1.8.Lambas-Level2
```

---

## ▶️ Execution

Each exercise includes a `Main.java` file within its respective `exerciseX` package.  
Run from the IDE or from the terminal:

```sh
javac exercise1/Main.java
java exercise1.Main
```

---

## 🌐 Deployment
Not applicable (local practice project).


---

## 🤝 Contributions

1. Fork this repository.
2. Create a new branch:
```sh
git checkout -b feature/NewFeature
```
3. Commit your changes:
```sh
git commit -m "Add NewFeature"
```
4. Commit your changes:
```sh
git push origin feature/NewFeature
```
5. Open a Pull Request.

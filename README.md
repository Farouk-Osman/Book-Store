# 📚 Quantum Bookstore – Fawry Internship Challenge

Welcome to the **Quantum Bookstore** challenge submitted for the **Fawry N² Dev Slope #10** internship program.

This is a Java console-based simulation of an online bookstore, showcasing OOP design, error handling, extensibility, and service interaction.

## Table of Contents

- [Features](#features)
- [Project Structure](#project-structure)
- [How to Run](#how-to-run)
- [Classes Overview](#classes-overview)
- [UML Diagram](#uml-diagram)
- [Contributing](#contributing)
- [License](#license)

---

## 🚀 Features

- Add different types of books:
  - `PaperBook`: Has stock and is shipped
  - `EBook`: Has file type and is emailed
  - `ShowcaseBook`: Display only, not for sale
- Buy books using ISBN
- Validate stock availability
- Send paper books to a `ShippingService`
- Send eBooks to a `MailService`
- Remove outdated books older than X years
- Print payment receipts and service logs

---

## 📸 Screenshot

> Output from running the full test:

![Running Output](https://private-us-east-1.manuscdn.com/sessionFile/vECx9Eg4sPGcrLWWNsHRSn/sandbox/0oRsI6faDcJzRaa5ABjqwC-images_1752039135945_na1fn_L2hvbWUvdWJ1bnR1L0Jvb2stU3RvcmUvU2NyZWVuc2hvdA.png?Policy=eyJTdGF0ZW1lbnQiOlt7IlJlc291cmNlIjoiaHR0cHM6Ly9wcml2YXRlLXVzLWVhc3QtMS5tYW51c2Nkbi5jb20vc2Vzc2lvbkZpbGUvdkVDeDlFZzRzUEdjckxXV05zSFJTbi9zYW5kYm94LzBvUnNJNmZhRGNKelJhYTVBQmpxd0MtaW1hZ2VzXzE3NTIwMzkxMzU5NDVfbmExZm5fTDJodmJXVXZkV0oxYm5SMUwwSnZiMnN0VTNSdmNtVXZVMk55WldWdWMyaHZkQS5wbmciLCJDb25kaXRpb24iOnsiRGF0ZUxlc3NUaGFuIjp7IkFXUzpFcG9jaFRpbWUiOjE3OTg3NjE2MDB9fX1dfQ__&Key-Pair-Id=K2HSFNDJXOU9YS&Signature=lFjgYWzQK5ro03tXg4yWjG4q5FShHsphiVzdY~Ozn4eaw50MNflWpUY8mHjns2BsuUOeid~uYqxYcec7CUvlukql1BlztUsR5G~USsSfWThjxgsJqKbzPWnCJsj3j69LlbMcJDNT1giDhDMlRss6Saf-ex7~Y0PrpD1QLyG6IEXyIqcNApYlDJ94ZnDU3hyNFfsS2~-eClT6bBrIYUTWVLwwecgTNo8mIKbelDD1LwY1xZhfL4egpXsWiqSEu-q9UCHeQZm47wIEGVXqfYCS-xaPPQlbyyIydNeY6HVUwoavbZHIVBlsYKhVIClm3haJhmEuG4Zxzub1bihqlgCIVw__)

## Project Structure

The project is organized into several Java classes, each responsible for a specific part of the online bookstore system.

```
Book-Store/
├── Book.java
├── BookStoreInventory.java
├── EBook.java
├── EmailService.java
├── PaperBook.java
├── QuantumBookstoreFullTest.java
├── README.md
├── ShippingService.java
└── ShowCaseBook.java
```

## How to Run

To compile and run this project, you will need a Java Development Kit (JDK) installed on your system.

1.  **Clone the repository:**

    ```bash
    git clone https://github.com/Farouk-Osman/Book-Store.git
    cd Book-Store
    ```

2.  **Compile the Java files:**

    ```bash
    javac *.java
    ```

3.  **Run the `QuantumBookstoreFullTest` class:**

    ```bash
    java QuantumBookstoreFullTest
    ```

    The `QuantumBookstoreFullTest` class contains a comprehensive demonstration of the system's functionality.

## Classes Overview

Here's a brief description of each Java class in the project:

-   `Book.java`: The abstract base class for all types of books, defining common attributes and methods.
-   `BookStoreInventory.java`: Manages the inventory of books, including adding, removing, and retrieving books.
-   `EBook.java`: Extends `Book` to represent electronic books, with an associated file type.
-   `EmailService.java`: A service for simulating the emailing of e-books.
-   `PaperBook.java`: Extends `Book` to represent physical books, with stock management and shipping capabilities.
-   `QuantumBookstoreFullTest.java`: The main class containing tests and demonstrations of the bookstore's features.
-   `ShippingService.java`: A service for simulating the shipping of physical books.
-   `ShowCaseBook.java`: Extends `Book` to represent books that are for display only and not for sale.

## UML Diagram
![UML Class Diagram](class_diagram..png)

## Contributing

Feel free to fork this repository, submit pull requests, or report issues. Contributions are welcome!

## License

This project is open-source and available under the [MIT License](LICENSE).

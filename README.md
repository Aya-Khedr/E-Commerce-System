E-Commerce System

This project implements a simple E-Commerce system using Java Swing for the graphical user interface (GUI). It allows users to manage different types of products and handle customer interactions such as shopping cart management and order processing.


Features

Product Management:

Create and manage various types of products including Electronic, Clothing, and Book products.

Each product type has specific attributes, e.g., brand and warranty period for electronics, size and fabric for clothing, author and publisher for books.

Customer Management:

Maintain customer records including customer ID, name, and address.
Shopping Cart Functionality:

Add and remove products from the shopping cart.

Calculate the total price of items in the cart.


Order Processing:

Place orders for the products in the cart.

Display order details including customer information and total price.


Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

Prerequisites

Java Development Kit (JDK) installed

IDE (e.g., IntelliJ IDEA, Eclipse) with Java support

Installation
Clone the repository:

bash
Copy code
git clone https://github.com/Aya-Khedr/E-Commerce-System.git
Open the project in your preferred IDE.

Compile the Java files.

Running the Application
Locate and run EcommerceSystem.java to start the application.

Follow the on-screen instructions to interact with the E-Commerce system.

Class Overview
Product:

Attributes: productId, name, price

Methods: Getters and setters

ElectronicProduct (subclass of Product):

Attributes: Inherits from Product (brand, warrantyPeriod)

Methods: Getters and setters

ClothingProduct (subclass of Product):

Attributes: Inherits from Product (size, fabric)

Methods: Getters and setters

BookProduct (subclass of Product):

Attributes: Inherits from Product (author, publisher)

Methods: Getters and setters

Customer:

Attributes: customerId, name, address

Methods: Getters and setters

Cart:

Attributes: customerId, nProducts, products

Methods: Getters and setters, addProduct, removeProduct, calculatePrice, placeOrder

Order:

Attributes: customerId, orderId, products, totalPrice

Methods: printOrderInfo

EcommerceSystem:

Main class with main method for GUI initialization and interaction.
Built With
Java - Programming language used

Java Swing - GUI toolkit used for building the graphical user interface


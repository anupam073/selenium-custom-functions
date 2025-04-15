# selenium-custom-functions

A Java-based utility project containing reusable, custom Selenium functions for enhanced browser interaction using the WebDriver and Actions API. This project helps keep your automation code **cleaner**, **modular**, and more **maintainable**.

## 🚀 Features

- ✅ Scroll to element  
- ✅ Smooth scrolling  
- ✅ Mouse hover  
- ✅ Action-based click  
- ✅ Double click  
- ✅ Right click  
- ✅ Drag and drop  
- ✅ Click and hold  
- ✅ Release element  
- ✅ Send keys to element  

## 🛠 Technologies Used

- Java  
- Selenium WebDriver  
- Maven 
- TestNG *(optional or replaceable)*  

## 📁 Project Structure

selenium-custom-functions/
├── Framework
│   └── Functions
│       └── Functions.java
├── BaseTest
│   └── Base.java
├── test
│   └── test.java
├── pom.xml
└── README.md

## 🧪 Usage Example

```java
Functions functions = new Functions(driver);
functions.scrollToElement(myElement);
functions.actionClick(myElement);
functions.hoverOverElement(myElement);

selenium-custom-functions
A Java-based utility project containing reusable, custom Selenium functions for enhanced browser interaction using the WebDriver and Actions API. Helps in keeping your automation code cleaner, modular, and more maintainable.

Features
Scroll to element

Smooth scrolling

Mouse hover

Action-based click

Double click

Right click

Drag and drop

Click and hold

Release element

Send keys to element

Technologies Used
Java

Selenium WebDriver

Maven (optional)

TestNG (optional or can be replaced)

Project Structure
pgsql
Copy
Edit
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
Usage Example
java
Copy
Edit
Functions functions = new Functions(driver);
functions.scrollToElement(myElement);
functions.actionClick(myElement);
functions.hoverOverElement(myElement);
Clone & Run
bash
Copy
Edit
git clone https://github.com/anupam073/selenium-custom-functions.git
cd selenium-custom-functions

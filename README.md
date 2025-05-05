# behave-login-java

Project structure

```
behave-login-java/
├── src/
│   ├── test/
│       ├── java/
│           ├── steps/
│               └── LoginSteps.java
│           └── runners/
│               └── TestRunner.java
│       └── resources/
│           └── features/
│               └── login.feature
├── pom.xml
└── README.md
```


# Java Login Test (Cucumber + Selenium)

This is a basic example of automated UI testing using Java, Selenium WebDriver, and Cucumber (Gherkin syntax).

## 🔧 Tools Used
- Java
- Maven
- Selenium WebDriver
- Cucumber JVM
- JUnit

## ▶️ How to Run

1. Make sure you have:
   - Java (JDK 11+)
   - Maven
   - Chrome + chromedriver

2. Install dependencies and run the tests:
```bash
mvn test

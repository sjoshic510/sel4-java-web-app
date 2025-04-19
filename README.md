# Maven Test Execution & Allure Report Guide

## 🧪 Running Tests with Maven

### Run All Tests  
This command will run all test classes with names starting with `Test`:
```bash
mvn test
```

### Run a Specific Test Class  
To run a specific test class:
```bash
mvn test -Dtest=Test_002_Maximize
```

```bash
mvn test -Dtest=Test_001_LunchBrowers
```

### Run a Specific Test Method from a Class  
To run a specific method inside a test class:
```bash
mvn test -Dtest=Test_002_Maximize#test_lunch_walmart
```

## 🔁 Other Maven Use Cases

### Run a Single Test Class
```bash
mvn test -Dtest=Test1
```

### Run Multiple Test Classes
```bash
mvn test -Dtest=Test1,Test2
```

### Run All Methods Matching a Pattern
```bash
mvn test -Dtest=Test1#testFoo*
```

### Run Multiple Methods Matching Patterns
```bash
mvn test -Dtest=Test1#testFoo*+testBar*
```

## 📊 Allure Report Setup & Usage

### 🛠️ Installation on Windows

1. **Open PowerShell as Administrator**

2. **Install Scoop**
```powershell
Set-ExecutionPolicy RemoteSigned -Scope CurrentUser
irm get.scoop.sh | iex
```

3. **Install Allure via Scoop**
```powershell
scoop install allure
```

4. **Verify Allure Installation**
```bash
allure --version
```

### 📈 Generating and Viewing Reports

- **Generate the Allure Report**
```bash
allure generate allure-results -o allure-report --clean
```

- **View the Allure Report in Browser**
```bash
allure open allure-report
```

- **Serve the Report (auto-refresh on changes)**
```bash
allure serve allure-results
```

### ⚡ Automatic Allure Report Generation After Maven Test Run

After running your Maven tests, use this to serve the report:
```bash
allure serve allure-results
```

> Example:
```bash
C:\Users\Bijaya Chhetri\eclipse-workspace-new\testmvn_project>allure serve allure-results
```

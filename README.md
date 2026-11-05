# Calculator App
This is a simple calculator app that uses Java, Maven and Spring Framework. This project is being used for the DevOps module to demonstrate effective usage of programming practices.

## Badges
This section will be added to later when GitHub Actions are integrated

## Features
- [x] Web form UI
- [x] Addition 
- [ ] Subtraction
- [ ] Multiplication
- [ ] Division

## Prerequisites
JDK 21, Maven

## Getting started
In the command prompt:
```bash
git clone https://github.com/jackboyleATU/DevOps-Calculator.git
cd DevOps-Calculator
mvn spring-bootrun
```

Then in your browser of choice, go to [http://localhost:8080](http://localhost:8080)

## Usage
Enter your two numbers into the input boxes. Then select the operation you want to use from the radio buttons, then press calculate.
The result will be presented after the "Result:" text.

## Project Structure
```
src/main/java/com/calculator/
├── CalculatorApplication.java  # Spring Boot entry point
├── CalculatorController.java   # Handles GET / and POST /calculate
└── Calculator.java             # Arithmetic logic
src/main/resources/templates/
└── index.html                  # Thymeleaf UI
```

## Licence
Licensed under GPL-3.0, see [LICENCE](LICENCE.md)

## Branching Strategy
This project uses **GitHub Flow**
GitHub Flow is a lightweight branching strategy that uses a single protected 'main' branch and short-lived feature branches.

### Branches
| Branch | Purpose |
|---|---|
|`main` | Always stable and deployable. No direct commits. |
|`feature/<issue-number>-<short-description>` | New features, e.g. `feature/3-division`|
|`bugfix/<issue-number>-<short-description>` | Bug fixes, e.g. `bugfix/7-negative-input` |
|`docs/<short-description>` | Documentation-only changes, e.g. `docs/update-readme` |

### Workflow
1. Create or pick an issue describing the change.
2. Branch off the latest `main`:
    ```
    git checkout mian
    git pull
    git checkout -b feature/3-division
    ```
3. Commit changes with clear messages that reference the issue.
4. Push the branch and open a pull request into `main`:
    ```
    git push -u origin feature/3-division
    ```
5. GitHub Actions builds and tests the branch, The pull request can only be merged once all checks pass.
6. Merge the pull request.

### Why GitHub Flow?
This project is small, with a single deployable application and no need to maintain multiple release versions. The processes are kept simple while keeping automated testing and code reviews.
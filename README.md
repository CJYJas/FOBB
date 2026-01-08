
## Overview

This project simulates fundamental banking operations for Savings and Current accounts. It showcases polymorphism, with a base `Account` class and specialized subclasses that handle operations like deposits, withdrawals, interest calculation, and overdrafts according to their specific rules. The `BankingSystem` class serves as the main driver, orchestrating a series of transactions to demonstrate the functionality of the different account types.

## Features

*   **Account Hierarchy**: A base `Account` class with specialized `SavingsAccount` and `CurrentAccount` subclasses.
*   **Transactions**: Supports core banking operations such as depositing and withdrawing funds.
*   **Savings Account Logic**: Manages a minimum balance and calculates interest.
*   **Current Account Logic**: Implements an overdraft facility and applies fees.
*   **Polymorphism**: Uses a single list of `Account` objects to manage and process different account types uniformly.

## Project Structure

The project is structured as a standard NetBeans Java application. Key files include:

*   `src/fobb/Account.java`: The abstract base class defining common properties and methods for all bank accounts, such as `accountNumber`, `balance`, and `deposit()`.
*   `src/fobb/SavingsAccount.java`: (Inferred from `BankingSystem.java`) A subclass of `Account` that includes logic for interest calculation and maintaining a minimum balance.
*   `src/fobb/CurrentAccount.java`: (Inferred from `BankingSystem.java`) A subclass of `Account` that manages an overdraft limit and associated charges.
*   `src/fobb/BankingSystem.java`: The main entry point of the application. It creates account instances, performs a series of transactions, and prints a summary to the console.
*   `build.xml`: The Ant build script for compiling and running the project.

## Getting Started

This project is configured to be built and run using Apache Ant, as it was developed in the NetBeans IDE.

### Prerequisites

*   Java Development Kit (JDK) 16 or later.
*   NetBeans IDE (or Apache Ant installed on your system).

### Building and Running

1.  **Clone the repository:**
    ```sh
    git clone https://github.com/CJYJas/FOBB.git
    ```
2.  **Open in NetBeans IDE:**
    *   Open NetBeans IDE.
    *   Go to `File > Open Project` and select the cloned repository folder.
    *   The IDE will automatically recognize the project.

3.  **Run the application:**
    *   Right-click on the `FOBB` project in the "Projects" pane.
    *   Select "Run".
    *   The output of the simulation will be displayed in the NetBeans output console.
  
Link for Presentation
https://youtu.be/6vM8Xf8ysuQ?si=bUyPavK7yStVDFp6

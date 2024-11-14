# BankApp
Bank Accounts Java Project

This project simulates various types of bank accounts with distinct features using Java Object-Oriented Programming principles. Each account type extends a base BankAccount class, implementing specific functionalities like overdraft limits, bonus deposits, fixed terms, and minimum/maximum balance tracking.

Project Structure

The project contains several classes that represent different types of accounts. Here's an overview of each:

1. BankAccount (Base Class)
Purpose: The foundational class for all account types.
Features: Manages the account number and balance with basic methods for deposit and withdrawal.
2. CheckingAccount
Inherits: BankAccount
Additional Feature: Overdraft limit, restricting withdrawals beyond a specific negative balance.
Override: withdrawalNotAllowed to enforce overdraft rules.
3. BonusAccount
Inherits: BankAccount
Additional Feature: Adds a bonus amount for deposits over a specified threshold.
Override: deposit method to implement bonus deposits.
4. CDAccount (Certificate of Deposit Account)
Inherits: BankAccount
Additional Features: Fixed start date and term duration. Withdrawals are restricted until the term ends.
Override: withdrawalNotAllowed to enforce term restrictions.
5. MinMaxAccount
Inherits: BankAccount
Additional Features: Tracks the minimum and maximum balance over the account's lifetime.
Override: deposit and withdraw methods to update min/max balances.
6. MonetaryValue
Purpose: Utility class for handling and comparing monetary amounts.
Features: Supports arithmetic operations, comparisons, and parsing from string representations (e.g., "$10.00").
7. CheckingAccountTest
Purpose: Testing class for CheckingAccount using Java Reflection.
Features: Ensures correct field accessibility, inheritance, method declarations, and functionality (such as enforcing overdraft limits).

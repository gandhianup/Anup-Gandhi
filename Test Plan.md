# **N26 – QE Home Challenge**

## **Test Plan / Test Case Document**

*Table of Content*

1.  Introduction

    1.  Purpose

    2.  Overview

2.  Test Strategy - *NA (for this task)*

    1.  Test Objective

    2.  Test Assumptions

    3.  Test Principles

    4.  Testing Scopesss

3.  Test Cases

4.  Test Execution - *NA (for this task)*

    1.  Entry Exit Criteria

    2.  Test Matrix

    3.  Defect Tracking and reporting

5.  Test Management Process - *NA (for this task)*

6.  Test Environment - *NA (for this task)*

## **Introduction**

1.  **Purpose:** This test plan describes the testing approach and overall
    framework that will drive the testing of the Monify mobile application. This
    document includes:

    1.  Test Strategy: rules the test will be based on, including the givens of
        the project (e.g.: start / end dates, objectives, assumptions);
        description of the process to set up a valid test (e.g.: entry / exit
        criteria, creation of test cases, specific tasks to perform, scheduling,
        data strategy).

    2.  Execution Strategy: How the test execution will be handled and the
        defect management tools to be used.

    3.  Test Management: process to handle the tests and all the events that we
        encounter during the execution like escalations and risks and mitigation
        plans

2.  **Overview:** Monify app helps an individual to document every day expenses
    to keep track of the money flow and manage it in a better way. This app
    gives the user a details report based on the category of the expenses in
    different graph format and also allows user to export the report and save
    it.

## **Test Cases**

### **Reference:**

**Test ID**: Unique ID for individual test cases

**Description**: One liner test description

**Status**: Current status of the test case. Should be one of these: Draft /
Development / Review / Execution Ready / Retire

**Test Type**: Type of the test case being writer. Should be one of these: UI /
End-To-End / Functional / Performance / Exploratory / Smoke / Security / Stress
/ Regression. One test case can have more than one test case type marked for it.

**Priority**: Indicates the test case priority. P0 being the highest and P3
being the lowest.

**Automatable**: States whether the test case is automatable or not. Should be
one of these two: Y / N

**Product**: Product or module for which the test case is being written.

**Component**: Indicates the component under the product for which the test case
is being written.

**Creation Date**: Date on which the test case was drafted.

**Author**: Name of the individual who has drafted the test case.

### **List of test cases** (A list of ideas/bullet points to test for - A sample detailed test case is added at the end)

| **Test ID** | **Description**                                                                                                                                                                                                                                                                   | **Priority** | **Test Type**               |
|-------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------|-----------------------------|
| **1.**      | **Launch Monify Application to verify the UI of home page (Balance box, add expense button, add income button, category icons) – UI should be properly aligned, spelled and colored.**                                                                                            | **P2**       | **UI**                      |
| **2.**      | **Add an income record by clicking on ‘+’ button and selecting the category as ‘Salary’ and +ve integer as income value – Income should be displayed on the home screen as per the input value provided.**                                                                        | **P0**       | **End-To-End**              |
| **3.**      | **Add an expense record by clicking on ‘-‘ button and selecting the category from the available list and +ve integer as the expense value. – Expense is added and is displayed on the home screen with appropriate category linked to it from the center of the page.**           | **P0**       | **End-To-End**              |
| **4.**      | **Verify the balance amount. Balance amount should be Income-Expense**                                                                                                                                                                                                            | **P0**       | **Functional**              |
| **5.**      | **Enter -ve value for income – The field excepts the -ve value but will not allow you to save the record. When you try to save the record, the invalid value entered will be removed and user is prompted to enter the valid value again.**                                       | **P1**       | **End-To-End**              |
| **6.**      | **Enter -ve value for expense – The field excepts the -ve value but will not allow you to save the record. When you try to save the record, the invalid value entered will be removed and user is prompted to enter the valid value again.**                                      | **P1**       | **End-To-End**              |
| **7.**      | **Enter description for the income or expense (numeric/alphabet/alphanumeric/special characters) - All values are accepted in the description field**                                                                                                                             | **P3**       | **Functional**              |
| **8.**      | **While adding an income or expense, click on ‘CHOOSE CATEGORY’ field prior entering any income/expense amount – user is not allowed to choose any category unless some +ve amount is entered.**                                                                                  | **P2**       | **Functional**              |
| **9.**      | **Scroll the ‘Balance’ box up – User is presented with the list of records added up to date separated category wise.**                                                                                                                                                            | **P1**       | **Functional**              |
| **10.**     | **Click on any of the category icon on the home screen – user is taken directly to add income screen for that category. Enter a valid income and add – User is navigated back to home screen with the specific income added.**                                                    | **P1**       | **End-To-End**              |
| **11.**     | **Add an expense prior to adding an income – Income added is considered appropriately and balance is adjusted accordingly.**                                                                                                                                                      | **P1**       | **End-To-End**              |
| **12.**     | **Swipe from the home screen – Options to view the entries by Day /Week/Month/Year/All and specific date is displayed. Also Option to choose a different account is also provided**                                                                                               | **P1**       | **Functional**              |
| **13.**     | **Swipe left to from the home screen – Option to set Category/ Accounts /Currencies /Settings is provides**                                                                                                                                                                       | **P1**       | **Functional**              |
| **14.**     | **Choose to add a new category by swiping left from the home screen and clicking on ‘+’ button – user is asked to buy the pro version of the app by paying the relevant amount.**                                                                                                 | **P1**       | **Functional**              |
| **15.**     | **Click on Buy button to go pro with the app – Use is navigated to google payment gateway to complete the payment successfully by the available payment method.**                                                                                                                 | **P0**       | **End-To-End, Security**    |
| **16.**     | **Click on ‘New Transfer’ option available at the top of the screen from the home screen (two arrows icon) and transfer the desired amount from one account to other account – The balance is adjusted accordingly and each account is properly highlighted with the new values** | **P1**       | **End-To-End**              |
| **17.**     | **Go to adding a new account by swiping right from the home page to get the page to add a new account. Click on ‘Currency Rates’ hyperlink from that page. – User is navigated to buy a pro version of the app**                                                                  | **P1**       | **Functional**              |
| **18.**     | **Adding a new account by swiping left from home screen – the added account is now shown in the account field by swiping right from the home page**                                                                                                                               | **P1**       | **End-To-End**              |
| **19.**     | **Click on export to file option by swiping right from the home screen with huge amount of records for expense and income and the phone memory being insufficient – user is not allowed to export the data as there is no sufficient memory available**                           | **P1**       | **End-To-End, Performance** |
| **20.**     | **Choose a specific date by swiping right from the home screen and selecting the calendar where there are no record available- User is shown with the error message that cant go to the specific date as there are no records available.**                                        | **P2**       | **Functional**              |
| **21.**     | **Click on dropbox sync to sync the app to the dropbox account so that the back could be synced on the specified dropbox account– user is navigated to buy the pro version of the app**                                                                                           | **P2**       | **End-To-End**              |
| **22.**     | **Create a file that the app accepts as the input and choose to restore the file from the ‘Restore Data’ – file is restored properly and balance and category are highlighted accordingly**                                                                                       | **P0**       | **End-To-End**              |
| **23.**     | **Choose clear data to clear the data completely from the app – user is prompted with a warning message to confirm the action and on confirming the action all records are wiped off**                                                                                            | **P1**       | **End-To-End**              |

## **A Sample Detailed Test Case**

| Test Case ID: 1 | Test Name: Add an expense record                                                   |                                                                                        |                     |
|-----------------|------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------|---------------------|
| Priority: P1    | Automatable: Y                                                                     | Product: Monify                                                                        | Component: Income   |
| Status: Review  | Test Case Type: End-To-End                                                         | Creation Date: 120.06.18                                                               | Author: Anup Gandhi |
| **Step No.**    | **Test Input**                                                                     | **Expected Result**                                                                    |                     |
| 1.              | I launch the Monify application on the android device under test.                  | Application is launched successfully.                                                  |                     |
| 2.              | Click on ‘+’ button that is at the bottom of the home page to add a new expense    | Page to add new expense loads                                                          |                     |
| 3.              | Input a valid integer in the expense field.                                        | Value successfully entered                                                             |                     |
| 4.              | Click on ‘CHOOSE CATEGORY’ option available at the bottom of the page              | List of categories load                                                                |                     |
| 5.              | Choose a category from the list                                                    | Category is selected and record is added and user is navigated back to the home screen |                     |
| 6.              | Verify if the record is successfully added and the balance is adjusted accordingly | Record in added as per the user input and balance is shown appropriately               |                     |

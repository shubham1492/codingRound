# TestVagrant hiring challenge for applicants 

About the codebase:
---------------------------------
*This is a simple test project for testing a few scenarios on a sample flight/hotel booking website. There are **3 tests** in total spread over 3 test classes. Following tech stack has been used to develop the same.*

**Tech Stack:** *Java*  *Selenium* *TestNG*  *Gradle/Maven*

**The parameters of evaluation**
----------------------------------
1. Naming Conventions & readability of code
2. Modularization & Abstraction
3. Demonstration of OO concepts & Design Patterns
4. Etiquette of Version control

Problem Statement
----------------------------------
**Tasks:**

1. Test are failing which needs your expertise to fix it.
2. Review and point out design issues with the current codebase/framework, if any.
3. Improve/refactor the code to implement your suggestions.

**Expectation:**
1. Create a GitHub account if not existing already.
2. Fork this repo (DO NOT CLONE).
3. Fix the errors and refactor the code, consider **abstractions, reusability and maintenance.**
4. Make sure you make multiple check-ins in the process, we would love to see your progress bit by bit.
5. Also check-in a separate file where you should list all your code review comments.
6. Send us the link of your GitHub repo to **careers@testvagrant.com**. Also attach your **resume**.


** Review Comment : **
----------------------------

1.  Web Driver initilization was wrong in all three test classes i.e. Driver is initilized before passing the system property for the binary.
2.  Duplicate code was used in every individual test class.
3.  Modularty and readability concept was missing.
4.  codebase design was not based on Opps concept.
5.  Test data and source code written in same file.
6.  WaitFor method is using thread.sleep(timeout) which is not a good for waiting a element.
7.  isElementPresent is not a optimized method.

** Improve/refactor: **
----------------------------------

1. Code design is build based on opps concept.
2. The Globle scope operatins like initilizing webdriver, starting  new webdriver session and hittiing
   test application url etc.are specified in TestBase.java class.
3. TestBase.java is parent class for all  testbase classes.
4. Generic module class contains all the common method for all sub module.
5. Constant class is used to maintain sepration between source code and data.
6. created Modules which contains locators and methods.
7. Current code design use factory design pattern to instantiate web driver.
8. Update chromedriver.exe version with latest chrome browser support.
9. Whole design is using meven as build tool.
10.Whole frameWork is design based on Page Object Model.  











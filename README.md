# CoffeeShopApplication

This is an open source backend Application based on REST APIs to track customer activity and total bill amount.

**Features:**
1.Adding Customer Info to the database.
2.Fetching Customer Details
3.Updating Customer Info.
4.Deleteing Customer Info.

**Instructions for downloading the project:**

1. Install MySql server on your system which will be used as your  local server for project.
2. Inside Mysql Server create a database name ebdb.
3. Import Dump20211005.sql in Mysql under ebdb database.
4. Download Postman in your system.
5. After downloading create a new workspace in your p
6. Import exp.postman_collection.json file inside postman
7. Download the zip file of the code and unzip on any of the drive.
8. Open InteliJ and click on open project.
9. Select the coffee application file and click ok.
10. Go to Application.Properties file and change Mysql username and password with regards to your system .
11. Click on build project and then click on Run StartCoffeeApplication.
12. Go to postman and click on Add data and send request with orderid,name,foodname,amount of your choice and send request.
13. Data will be added in MySql
14. For retrieve data click Retrieve data and in the above url change the orderId with your orderid.
15. For updating data click Update Data change the orderId with your orderid of your choice and then provide updated orderid,name,foodname,amount.
16. For deleting data click Delete Data and provide orderId of the customer which you want to delete and data will be deleted. 



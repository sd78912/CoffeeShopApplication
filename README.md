# CoffeeShopApplication

This is an open source backend Application based on REST APIs to track customer activity.

**Features:**

1. Adding Customer info in the database.

2. Fetching Customer Details

3. Updating Customer info in the database.

4. Deleteing Customer info in the database.

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

**SAMPLE IMAGES:** 

1. MySql Database before data is added:

![Screenshot (372)](https://user-images.githubusercontent.com/64826389/135968208-72932199-5bd8-4aa4-905e-e7039ad17920.png)


2. Postman Post Mapping:

![Screenshot (373)](https://user-images.githubusercontent.com/64826389/135967905-2403adb0-6e19-435e-8b81-06c834a85f8d.png)


3. MySql Database after data is added:

![Screenshot (374)](https://user-images.githubusercontent.com/64826389/135967734-04dd2ae7-ef9d-44be-b5e6-92757f197502.png)

4. Postman Get Mapping:

![Screenshot (375)](https://user-images.githubusercontent.com/64826389/135967838-1334d226-987f-4839-9cd1-1d97bb007790.png)


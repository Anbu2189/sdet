REM   Script: Activity7
REM   Activity7

SELECT Salesman_ID, SUM(purchase_amount) AS "Sum PurchaseAmount" 
from Orders 
GROUP by Salesman_ID 
Order by SUM(purchase_amount) desc;

SELECT SUM(purchase_amount) AS "Sum PurchaseAmount" 
from Orders;

SELECT AVG(purchase_amount) AS "AVG PurchaseAmount" 
from Orders;

SELECT Salesman_ID, Round(AVG(purchase_amount),0) AS "AVG PurchaseAmount" 
from Orders 
GROUP by Salesman_ID 
Order by AVG(purchase_amount) desc;

SELECT MAX(purchase_amount) AS "Max PurchaseAmount" 
from Orders;

SELECT salesman_id,MAX(purchase_amount) AS "Max PurchaseAmount" 
from Orders 
GROUP by salesman_id 
Order by salesman_id;

SELECT MIN(purchase_amount) AS "Min PurchaseAmount" 
from Orders;

SELECT count(distinct salesman_id) AS "salesmancount" 
from Orders;


REM   Script: Activity8
REM   Activity8

SELECT Customer_Id, Round(MAX(purchase_amount),0) AS MAXPurchaseamount from Orders 
GROUP by customer_Id 
Order by MAXPurchaseamount desc;

SELECT salesman_id, order_date, ROUND(MAX(purchase_amount),0) AS MAXPurchaseamount from Orders 
WHERE order_date=To_DATE('2012/08/17', 'YYYY/MM/DD') 
GROUP by salesman_Id, Order_date;

SELECT customer_id, order_date, ROUND(MAX(purchase_amount),0) AS MAXPurchaseamount from Orders 
GROUP by customer_id, order_date 
Having MAX(purchase_amount) in ('2030','3450','5760','6000');


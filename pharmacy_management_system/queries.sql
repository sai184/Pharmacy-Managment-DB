
-- Query 1: Customers and their orders
SELECT c.Name AS CustomerName, COUNT(o.OrderID) AS TotalOrders, SUM(o.TotalAmount) AS TotalSpent
FROM Customers c
JOIN Orders o ON c.CustomerID = o.CustomerID
GROUP BY c.Name;

-- Query 2: Medicines below stock level
SELECT Name, QuantityInStock FROM Medicines WHERE QuantityInStock < 50;

-- Query 3: Most expensive medicine
SELECT Name, Price FROM Medicines WHERE Price = (SELECT MAX(Price) FROM Medicines);

-- Query 4: Order details for a specific order
SELECT o.OrderID, o.OrderDate, c.Name, m.Name AS MedicineName, od.Quantity, od.Price
FROM Orders o
JOIN OrderDetails od ON o.OrderID = od.OrderID
JOIN Medicines m ON od.MedicineID = m.MedicineID
JOIN Customers c ON o.CustomerID = c.CustomerID
WHERE o.OrderID = 1;

-- Query 5: Update quantity
UPDATE Medicines SET QuantityInStock = QuantityInStock - 2 WHERE MedicineID = 1;

-- Query 6: Delete an order
DELETE FROM Orders WHERE OrderID = 1;

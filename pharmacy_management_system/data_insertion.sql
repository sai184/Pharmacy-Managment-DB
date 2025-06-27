
-- Inserting into Customers
INSERT INTO Customers VALUES (1, 'John Doe', 'johndoe@example.com', '123-456-7890', '123 Elm St');
INSERT INTO Customers VALUES (2, 'Jane Smith', 'jane@example.com', '987-654-3210', '456 Oak Ave');

-- Inserting into Medicines
INSERT INTO Medicines VALUES (1, 'Paracetamol', 'Tablet', 10.50, 100);
INSERT INTO Medicines VALUES (2, 'Ibuprofen', 'Capsule', 15.75, 60);

-- Inserting into Orders
INSERT INTO Orders VALUES (1, 1, TO_DATE('2025-04-10', 'YYYY-MM-DD'), 21.00);
INSERT INTO Orders VALUES (2, 2, TO_DATE('2025-04-11', 'YYYY-MM-DD'), 15.75);

-- Inserting into OrderDetails
INSERT INTO OrderDetails VALUES (1, 1, 1, 2, 10.50);
INSERT INTO OrderDetails VALUES (2, 2, 2, 1, 15.75);

-- Inserting into Payments
INSERT INTO Payments VALUES (1, 1, TO_DATE('2025-04-10', 'YYYY-MM-DD'), 21.00, 'Cash');
INSERT INTO Payments VALUES (2, 2, TO_DATE('2025-04-11', 'YYYY-MM-DD'), 15.75, 'Card');

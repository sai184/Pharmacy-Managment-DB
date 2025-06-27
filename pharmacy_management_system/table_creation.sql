
-- Customers Table
CREATE TABLE Customers (
    CustomerID INT PRIMARY KEY,
    Name VARCHAR2(100) NOT NULL,
    Email VARCHAR2(100) NOT NULL,
    PhoneNumber VARCHAR2(15),
    Address VARCHAR2(255)
);

-- Medicines Table
CREATE TABLE Medicines (
    MedicineID INT PRIMARY KEY,
    Name VARCHAR2(100) NOT NULL,
    Type VARCHAR2(50),
    Price DECIMAL(10, 2),
    QuantityInStock INT
);

-- Orders Table
CREATE TABLE Orders (
    OrderID INT PRIMARY KEY,
    CustomerID INT,
    OrderDate DATE,
    TotalAmount DECIMAL(10, 2),
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);

-- OrderDetails Table
CREATE TABLE OrderDetails (
    OrderDetailID INT PRIMARY KEY,
    OrderID INT,
    MedicineID INT,
    Quantity INT,
    Price DECIMAL(10, 2),
    FOREIGN KEY (OrderID) REFERENCES Orders(OrderID),
    FOREIGN KEY (MedicineID) REFERENCES Medicines(MedicineID)
);

-- Payments Table
CREATE TABLE Payments (
    PaymentID INT PRIMARY KEY,
    OrderID INT,
    PaymentDate DATE,
    Amount DECIMAL(10, 2),
    PaymentMethod VARCHAR2(50),
    FOREIGN KEY (OrderID) REFERENCES Orders(OrderID)
);

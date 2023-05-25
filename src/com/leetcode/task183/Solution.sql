SELECT name as Customers
FROM Customers
WHERE id NOT IN
      (Select customerId FROM Orders);
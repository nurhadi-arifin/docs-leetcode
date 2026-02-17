-- Table
CREATE TABLE Employee (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    salary INT,
    managerId INT
);

-- Data
INSERT INTO Employee (id, name, salary, managerId) VALUES
(1, 'Joe', 70000, 3),
(2, 'Henry', 80000, 4),
(3, 'Sam', 60000, NULL),
(4, 'Max', 90000, NULL);

-- Final Answer
SELECT 
    e.name AS Employee
FROM 
    Employee e
JOIN 
    Employee m ON e.managerId = m.id
WHERE 
    e.salary > m.salary;
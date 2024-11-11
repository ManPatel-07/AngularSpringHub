INSERT INTO orders(price, order_status) VALUES
(150.75, 'CONFIRMED'),
(200.00, 'PENDING'),
(120.25, 'CANCELLED'),
(175.00, 'CONFIRMED'),
(90.50, 'PENDING'),
(300.00, 'CANCELLED'),
(250.75, 'CONFIRMED'),
(135.00, 'PENDING'),
(80.25, 'CANCELLED'),
(190.50, 'CONFIRMED'),
(170.00, 'CANCELLED'),
(220.75, 'PENDING'),
(210.00, 'CONFIRMED'),
(140.25, 'CANCELLED'),
(130.50, 'PENDING');


INSERT INTO order_item(order_id, product_id, quantity) VALUES
(1, 101, 1),
(1, 102, 3),
(1, 103, 2),
(2, 104, 5),
(2, 105, 1),
(3, 106, 4),
(3, 107, 2),
(3, 108, 6),
(3, 109, 3),
(4, 110, 2),
(5, 111, 5),
(5, 112, 1),
(5, 113, 3),
(6, 114, 4),
(6, 115, 2);

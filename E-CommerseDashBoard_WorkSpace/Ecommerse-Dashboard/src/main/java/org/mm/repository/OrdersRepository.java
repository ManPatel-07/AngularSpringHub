package org.mm.repository;

import org.mm.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Long>
{
    @Query("SELECT SUM(o.totalAmount) AS totalRevenue, COUNT(o.customerId) AS totalOrders, AVG(o.totalAmount) AS averageOrderValue FROM Orders o")
    Object[] findOrderStats();
    

    @Query("SELECT COUNT(o.id) AS totalOrders, SUM(o.totalAmount) AS totalRevenue, AVG(o.totalAmount) AS averageOrderValue FROM Orders o")
    Object[] findOrderStats2();
}

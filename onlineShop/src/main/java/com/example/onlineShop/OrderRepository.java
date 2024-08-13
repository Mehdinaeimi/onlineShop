package com.example.onlineShop;

import java.util.List;

public interface OrderRepository extends BaseRepository<Order, Long> {
    List<Order> findByCustomer(Customer customer);
}

package com.educaweb.course.repositories;

import com.educaweb.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long > {


}

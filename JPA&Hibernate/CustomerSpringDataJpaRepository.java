package com.demo.learnjpaandhibernate;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerSpringDataJpaRepository extends JpaRepository<Customers, Long>{

}

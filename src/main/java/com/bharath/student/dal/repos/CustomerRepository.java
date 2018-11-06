package com.bharath.student.dal.repos;

import com.bharath.student.dal.entities.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}

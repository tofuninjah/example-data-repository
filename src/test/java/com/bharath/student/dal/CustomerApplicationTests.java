package com.bharath.student.dal;

import com.bharath.student.dal.entities.Customer;
import com.bharath.student.dal.repos.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerApplicationTests {

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void testCreateCustomer() {
        Customer customer = new Customer();
        customer.setName("JC Penny");
        customer.setEmail("jc.penny@jcpenny.com");

        customerRepository.save(customer);
    }

    @Test
    public void testFindCustomerById() {
        Customer customer = customerRepository.findById(2L).get();

        System.out.println(customer);

    }

    @Test
    public void testUpdateCustomerById() {
        Customer customer = customerRepository.findById(2L).get();
        customer.setEmail("jc-cents@jcpenny.com");
        System.out.println(customer);
    }

    @Test
    public void testDeleteCustomer() {
        Customer customer = customerRepository.findById(2L).get();
        customerRepository.delete(customer);
        System.out.println(customer);
    }
}

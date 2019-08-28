package pl.aleksandrabobowska.springmvcrest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.aleksandrabobowska.springmvcrest.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}

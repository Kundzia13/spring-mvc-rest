package pl.aleksandrabobowska.springmvcrest.bootstap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.aleksandrabobowska.springmvcrest.domain.Customer;
import pl.aleksandrabobowska.springmvcrest.repositories.CustomerRepository;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    public BootStrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Loading Customer Data");

        Customer c1 = new Customer();
        c1.setFirstName("Michał");
        c1.setLastName("Nowak");
        customerRepository.save(c1);

        Customer c2 = new Customer();
        c2.setFirstName("Paweł");
        c2.setLastName("Kowalski");
        customerRepository.save(c2);

        Customer c3 = new Customer();
        c3.setFirstName("Anna");
        c3.setLastName("Poniedziałek");
        customerRepository.save(c3);

        System.out.println("Customers Saved: " + customerRepository.count());
    }
}

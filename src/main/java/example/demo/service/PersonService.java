package example.demo.service;

import example.demo.model.Address;
import example.demo.model.Person;
import example.demo.repository.AddressRepository;
import example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private AddressRepository addressRepository;

    public void addListPerson() {
        for (int i = 0; i < 100; i++) {
            Person person = Person.builder().name("tuan"+ i).build();
            personRepository.save(person);
            Address address = Address.builder().city("HaNoi" + i).person(person).build();
            addressRepository.save(address);
        }

    }
}

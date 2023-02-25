package example.demo.service.Address;

import example.demo.model.Address;
import example.demo.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public Address getAddress(Integer id) {
        return addressRepository.findById(id).get();
    }
}

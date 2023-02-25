package example.demo.controller;


import example.demo.model.Address;
import example.demo.service.Address.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
@CrossOrigin
@RequestMapping("/address")

public class AddressController {

    @Autowired
    AddressService addressService;

    @GetMapping("/{id}")
    public ResponseEntity<Address> get(@PathVariable Integer id) {

        try {
            Address address = addressService.getAddress(id);
            return new ResponseEntity<Address>(address, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Address>(HttpStatus.NOT_FOUND);
        }

    }
}

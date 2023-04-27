package example.demo.service.register;

import example.demo.model.Register;
import example.demo.repository.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegisterServiceImpl implements RegisterService {
    @Autowired
    private RegisterRepository registerRepository;

    @Override
    public Register save(Register register) {
        return registerRepository.save(register);
    }

    @Override
    public Optional<Register> getRegisterById(int id) {
        return registerRepository.findById(id);
    }

    @Override
    public void delete(int id) {
        registerRepository.deleteById(id);
    }

    @Override
    public List<Register> getRegisters() {
        return registerRepository.findAll();
    }
}

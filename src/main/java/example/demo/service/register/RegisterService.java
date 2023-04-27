package example.demo.service.register;

import example.demo.model.Register;

import java.util.List;
import java.util.Optional;

public interface RegisterService {
    Register save(Register register);

    Optional<Register> getRegisterById(int id);

    void delete(int id);

    List<Register> getRegisters();
}

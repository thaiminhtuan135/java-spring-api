package example.demo.service.account;

import example.demo.model.Account;

import java.util.List;
import java.util.Optional;

public interface AccountService {
    Account save(Account account);

    Optional<Account> getAccountById(int id);

    void delete(int id);

    List<Account> getAccounts();
}

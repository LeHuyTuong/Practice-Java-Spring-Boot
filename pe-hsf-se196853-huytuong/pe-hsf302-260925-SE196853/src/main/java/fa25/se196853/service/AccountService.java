package fa25.se196853.service;

import fa25.se196853.entity.Account;

public interface AccountService {
    Account getAccount(String email, String password);

    Account createAccount(Account account);
}

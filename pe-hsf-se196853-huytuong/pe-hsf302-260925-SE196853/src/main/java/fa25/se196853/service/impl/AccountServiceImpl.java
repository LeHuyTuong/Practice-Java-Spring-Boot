package fa25.se196853.service.impl;

import fa25.se196853.entity.Account;
import fa25.se196853.repository.AccountRepository;
import fa25.se196853.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Account getAccount(String email, String password) {
        return accountRepository.findByEmailAndPassword(email, password);
    }

    @Override
    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }
}

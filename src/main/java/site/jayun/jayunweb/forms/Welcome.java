package site.jayun.jayunweb.forms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import site.jayun.jayunweb.entity.Account;
import site.jayun.jayunweb.entity.AccountRepository;

@RestController
@RequestMapping("/forms")
@Slf4j
public class Welcome {
    @Autowired
    AccountRepository accountRepository;

    @GetMapping(path = "/welcome")
    public String getAdminInfo(String currentAccount) {
        Account account = accountRepository.findOneByAccount(currentAccount);
        if (account != null) {
            log.info(account.toString());
            return account.toString();
        } else {
            if (accountRepository.count() == 0) {
                account = new Account();
                account.setAccount("admin");
                account.setState(0);
                accountRepository.save(account);
                return account.toString();
            } else {
                log.info("not find!");
                return "not find!";
            }
        }
    }
}
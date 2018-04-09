package site.jayun.jayunweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;
import site.jayun.jayunweb.entity.Account;
import site.jayun.jayunweb.entity.AccountRepository;
import site.jayun.jayunweb.entity.BookInfo;
import site.jayun.jayunweb.entity.BookInfoRepository;
import site.jayun.jayunweb.entity.Dept;
import site.jayun.jayunweb.entity.DeptRepository;

@Controller
@SpringBootApplication
public class StartApp {
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private BookInfoRepository bookReposititory;
    @Autowired
    private DeptRepository deptRepository;

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        if (accountRepository.count() == 0) {
            Account account = new Account();
            account.setBookNo("master");
            account.setAccount("admin");
            accountRepository.save(account);
            account = new Account();
            account.setBookNo("master");
            account.setAccount("jason");
            accountRepository.save(account);
        }
        if (bookReposititory.count() == 0) {
            BookInfo book = new BookInfo();
            book.setBookNo("master");
            book.setShortName("主帐套");
            bookReposititory.save(book);
        }
        if (deptRepository.count() == 0) {
            Dept dept = new Dept();
            dept.setCode("001");
            dept.setName("研发部");
            deptRepository.save(dept);
            dept = new Dept();
            dept.setCode("002");
            dept.setName("业务部");
            dept.setRemark("asdf");
            deptRepository.save(dept);
        }

        // return new RedirectPage("/forms/welcome").toString();
        return "redirect:/forms/welcome";
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApp.class, args);
    }
}

package site.jayun.jayunweb.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, String>
{
    Account findOneByAccount(String account);
}
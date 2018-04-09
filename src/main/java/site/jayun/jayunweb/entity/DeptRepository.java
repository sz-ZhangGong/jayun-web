package site.jayun.jayunweb.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeptRepository extends JpaRepository<Dept, String> {
    public Dept findOneByName(String name);
}

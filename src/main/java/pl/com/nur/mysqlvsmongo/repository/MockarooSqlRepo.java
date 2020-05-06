package pl.com.nur.mysqlvsmongo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.com.nur.mysqlvsmongo.model.MockarooSql;

@Repository
public interface MockarooSqlRepo extends JpaRepository<MockarooSql, Long> {
}

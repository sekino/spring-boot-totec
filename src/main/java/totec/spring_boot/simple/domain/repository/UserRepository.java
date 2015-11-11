package totec.spring_boot.simple.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import totec.spring_boot.simple.domain.model.User;

/**
 * @author akano_yuki on 2015/11/11.
 */

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}

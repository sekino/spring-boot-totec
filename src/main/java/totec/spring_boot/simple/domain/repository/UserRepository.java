package totec.spring_boot.simple.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import totec.spring_boot.simple.domain.model.User;
import totec.spring_boot.simple.domain.model.UserSample;

import java.util.List;

/**
 * @author akano_yuki on 2015/11/11.
 */

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	@Query("select u from User u where u.userId like :userId%")
	public List<User> findByUserId(@Param("userId") String userId);
}
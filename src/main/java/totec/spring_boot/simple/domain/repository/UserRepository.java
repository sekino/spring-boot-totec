package totec.spring_boot.simple.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import totec.spring_boot.simple.domain.model.UserSample;

import java.util.List;

/**
 * @author akano_yuki on 2015/11/11.
 */

@Repository
public interface UserRepository extends JpaRepository<UserSample, Integer> {
	@Query("select u from User u where u.user_ldap_id = :name and u.user_employee_number = :num")
	public List<UserSample> findUsers(@Param("name") String name, @Param("num") String num);
}
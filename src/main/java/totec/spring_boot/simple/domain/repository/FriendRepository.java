package totec.spring_boot.simple.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import totec.spring_boot.simple.domain.model.Friend;

import java.util.List;

/**
 * @author akano_yuki on 2015/11/13.
 */
public interface FriendRepository extends JpaRepository<Friend, Integer> {
	@Query("select f from Friend f where f.self = :selfNo")
	public List<Integer> listFriendNo(@Param("selfNo") int selfNo);
}

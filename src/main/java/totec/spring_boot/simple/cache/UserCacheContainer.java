package totec.spring_boot.simple.cache;

import java.util.HashMap;
import java.util.Map;

/**
 * @author akano_yuki on 2015/11/13.
 */
public class UserCacheContainer {
	// id: userId
	private Map<String, CacheUser> cacheUserMap = new HashMap<String, CacheUser>(1000);


}

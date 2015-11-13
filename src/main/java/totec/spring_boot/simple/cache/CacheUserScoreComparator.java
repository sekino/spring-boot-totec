package totec.spring_boot.simple.cache;

import java.util.Comparator;

/**
 * @author akano_yuki on 2015/11/13.
 *
 * {@link CacheUser}をuserPublicScoreの降順に並べるcomparator
 */
public class CacheUserScoreComparator implements Comparator<CacheUser> {
	@Override
	public int compare(CacheUser cacheUser1, CacheUser cacheUser2) {

		return 0;
	}
}

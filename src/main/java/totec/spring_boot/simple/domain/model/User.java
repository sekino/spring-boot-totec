package totec.spring_boot.simple.domain.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author akano_yuki on 2015/11/11.
 */

@Entity
public class User {

	@Id
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

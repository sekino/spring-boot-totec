package totec.spring_boot.simple.domain.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author akano_yuki on 2015/11/11.
 */

@Entity
public class UserSample implements Serializable {
	@Id
	private int user_id;
	private String user_employee_number;
	private String user_ldap_id;
	private String user_password;
	private String user_name;
	private int user_sex;
	private String user_skype_id;
	private String user_dislike;
	private String user_like;
	private String user_allergie;
	private String user_link;
	private String user_comment;
	private int junle_id;
	private String user_image;
	private int user_type;
	private int user_is_del_flg;

	public int getUser_id() {
		return user_id;
	}

	public String getUser_employee_number() {
		return user_employee_number;
	}

	public String getUser_ldap_id() {
		return user_ldap_id;
	}

	public String getUser_password() {
		return user_password;
	}

	public String getUser_name() {
		return user_name;
	}

	public int getUser_sex() {
		return user_sex;
	}

	public String getUser_skype_id() {
		return user_skype_id;
	}

	public String getUser_dislike() {
		return user_dislike;
	}

	public String getUser_like() {
		return user_like;
	}

	public String getUser_allergie() {
		return user_allergie;
	}

	public String getUser_link() {
		return user_link;
	}

	public String getUser_comment() {
		return user_comment;
	}

	public int getJunle_id() {
		return junle_id;
	}

	public String getUser_image() {
		return user_image;
	}

	public int getUser_type() {
		return user_type;
	}

	public int getUser_is_del_flg() {
		return user_is_del_flg;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public void setUser_employee_number(String user_employee_number) {
		this.user_employee_number = user_employee_number;
	}

	public void setUser_ldap_id(String user_ldap_id) {
		this.user_ldap_id = user_ldap_id;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public void setUser_sex(int user_sex) {
		this.user_sex = user_sex;
	}

	public void setUser_skype_id(String user_skype_id) {
		this.user_skype_id = user_skype_id;
	}

	public void setUser_dislike(String user_dislike) {
		this.user_dislike = user_dislike;
	}

	public void setUser_like(String user_like) {
		this.user_like = user_like;
	}

	public void setUser_allergie(String user_allergie) {
		this.user_allergie = user_allergie;
	}

	public void setUser_link(String user_link) {
		this.user_link = user_link;
	}

	public void setUser_comment(String user_comment) {
		this.user_comment = user_comment;
	}

	public void setJunle_id(int junle_id) {
		this.junle_id = junle_id;
	}

	public void setUser_image(String user_image) {
		this.user_image = user_image;
	}

	public void setUser_type(int user_type) {
		this.user_type = user_type;
	}

	public void setUser_is_del_flg(int user_is_del_flg) {
		this.user_is_del_flg = user_is_del_flg;
	}

	@Override
	public String toString() {
		return "User{" +
				"user_id=" + user_id +
				", user_employee_number='" + user_employee_number + '\'' +
				", user_ldap_id='" + user_ldap_id + '\'' +
				", user_password='" + user_password + '\'' +
				", user_name='" + user_name + '\'' +
				", user_sex=" + user_sex +
				", user_skype_id='" + user_skype_id + '\'' +
				", user_dislike='" + user_dislike + '\'' +
				", user_like='" + user_like + '\'' +
				", user_allergie='" + user_allergie + '\'' +
				", user_link='" + user_link + '\'' +
				", user_comment='" + user_comment + '\'' +
				", junle_id=" + junle_id +
				", user_image='" + user_image + '\'' +
				", user_type=" + user_type +
				", user_is_del_flg=" + user_is_del_flg +
				'}';
	}
}

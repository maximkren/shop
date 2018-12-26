/**
 * 
 */
package shop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Maxim Kren E-mail: krenmaxim@gmail.com 24 дек. 2018 г. 19:45:49
 */

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ID;
	private String firstName;
	private String lastName;
	private int age;
	private boolean Deleted;

	public int getUserID() {
		return ID;
	}

	public void setUserID(int userID) {
		this.ID = userID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isDeleted() {
		return Deleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.Deleted = isDeleted;
	}

}

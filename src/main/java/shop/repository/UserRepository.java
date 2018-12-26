/**
 * 
 */
package shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import shop.model.User;

/**
 * @author Maxim Kren E-mail: krenmaxim@gmail.com 24 дек. 2018 г. 21:50:02
 */
public interface UserRepository extends JpaRepository<User, Integer> {

}

/**
 * 
 */
package shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import shop.model.Product;

/**
 * @author Maxim Kren E-mail: krenmaxim@gmail.com 24 дек. 2018 г. 21:51:38
 */
public interface ProductRepository extends JpaRepository<Product, Integer> {

}

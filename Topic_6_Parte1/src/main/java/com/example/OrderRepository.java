package com.example;




import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface OrderRepository extends CrudRepository<Order, Long>{
	
	List<Order> findByPurchasenumber(int purchasenumber);
	
	List<Order> findByAccountAndProductAndPurchasenumber( Long account, Long product, int purchasenumber );

}
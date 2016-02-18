package com.example;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AccountController {
	
	  @RequestMapping("/login")
	  @ResponseBody
	  public String login(String username, String password) {
	    try {
	    	
	      if ( accountRepository.findByUsernameAndPassword( username, password).size() == 1  )
	      {
	    	  return "Login succesful";
	      }
	      else
	      {
	    	  return "Login  NOT succesful";
	      }
	      
	    }
	    catch (Exception ex) {
	      return "Error login user: " + ex.toString();
	    }
	  }
	  
	  
	  @RequestMapping("/create")
	  @ResponseBody
	  public String create(String username, String password, String name) {
		  
	    try {
	    	accountRepository.save(new Account(username, password, name ));
	    }
	    catch (Exception ex) {
	      return "Error creating the user: " + ex.toString();
	    }
	    return "User succesfully created";
	  }
	
	  @RequestMapping("/find-by-name")
	  @ResponseBody
	  public String findByName(String name) {
	    try {
	    	
	      List<Product> list = productRepository.findByName(name);
	      
	      String result = "" + list.size() + "";
	      
	      for ( int i = 0 ; i < list.size() ; i++)
	      {
	    	  result = result.concat( "<p>" + list.get(i).getId() + ", " + list.get(i).getName() + ", " + list.get(i).getDescription() + ", " + list.get(i).getCategory() );
	    	  result = result.concat(";</p>");
	      }
	      
	      return result;
	    }
	    catch (Exception ex) {
	      return "Error find product by name";
	    }
	  }
	
	
	  @RequestMapping("/find-by-category")
	  @ResponseBody
	  public String findByCategory(String category) {
	    try {
	    	
	      List<Product> list = productRepository.findByCategory(category);
	      
	      String result = "" + list.size() + "";
	      
	      for ( int i = 0 ; i < list.size(); i++)
	      {
	    	  result = result.concat("<p>" + list.get(i).getId() + ", " + list.get(i).getName() + ", " + list.get(i).getDescription() + ", " + list.get(i).getCategory() );
	    	  result = result.concat(";</p> ");
	      }
	      
	      return result;
	    }
	    catch (Exception ex) {
	      return "Error find product by category";
	    }
	  }
	  
	  
	  
	  @RequestMapping("/add-product")
	  @ResponseBody
	  public String addProduct(Long account, Long product, int purchasenumber) 
	  {
	    try {
	    
	      Order order = new Order( account, product, purchasenumber );
	      orderRepository.save(order);
	      
	      return ("<p>" + order.getAccount() + ", " + order.getProduct() + ", " + order.getPurchasenumber() + "</p>" );
	      
	    }
	    catch (Exception ex) {
	      return "Error add-product";
	    }
	  }
	  
	  
	  @RequestMapping("/delete-product")
	  @ResponseBody
	  public String deleteProduct(Long account, Long product, int purchasenumber) 
	  {
	    try {
	    
	    	List<Order> list = orderRepository.findByAccountAndProductAndPurchasenumber(account, product, purchasenumber);
	    	
	    	String result = "" + list.size() + "";
	    	
	    	if ( list.size() == 0 )
	    	{
	    		result = result.concat(", Could NOT delete product from order");
	    	}
	    	else
	    	{
	    		Order order = list.get(0);
	    	
	    		orderRepository.delete(order.getId());
	    		
	    		result = result.concat(", Product deleted from order");
	    	}
	      
	      return result;
	      
	    }
	    catch (Exception ex) {
	      return "Error delete-product";
	    }
	  }
	  
	  
	  @RequestMapping("/buy-products")
	  @ResponseBody
	  public String buyProducts(Long account, int purchasenumber, int creditcard) 
	  {
	    try {
	    
	    	List<Order> list = orderRepository.findByPurchasenumber(purchasenumber);
	    	
	    	String result = "" + list.size() + "";
	    	
	    	for ( int i = 0; i < list.size() ; i ++ )
	    	{
	    		Order order = list.get(i);
	    		
	    		result = result.concat("<p>" + order.getAccount() + ", " + order.getProduct() + ", " + order.getPurchasenumber() );
		    	result = result.concat(";</p> ");
	    		
	    		order.setCreditcard(creditcard);
	    		
	    		orderRepository.save(order);
	    	}
	      
	      result = result.concat("<p>Succes buy order</p>");
	      
	      return result;
	      
	    }
	    catch (Exception ex) {
	      return "Error buy order";
	    }
	  }
	  
	  
	/**  
	@RequestMapping("/")
	@ResponseBody
	public String test() {

	    accountRepository.save(new Account("alber", "alber", "alberto ghibaudo" ));
	    
	    productRepository.save(new Product("TV", "20 pounds", 2000.00, "elec"));
	    productRepository.save(new Product("PC", "Pentium", 3000.00, "elec"));
		productRepository.save(new Product("Phone", "Red", 200.00, "elec"));
		
	    return "hello";
	}
	
	**/
	  
	  	@Autowired
		private AccountRepository accountRepository;
		
		@Autowired
		private ProductRepository productRepository;
		
		@Autowired
		private OrderRepository orderRepository;

}

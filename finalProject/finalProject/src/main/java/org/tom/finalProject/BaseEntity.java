package org.tom.finalProject;

import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

public class BaseEntity {

	@Id
	@Property("id")
	public int id;
	
}

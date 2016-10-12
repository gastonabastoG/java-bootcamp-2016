package com.tom.bootcamp;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BlogTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		for(Integer i=0;i<=10;i++){
			Blog.postEntry("entry"+i.toString());
		}
	}

	@Test
	public void CanPost() {
		Blog.postEntry("This is an example");
		assertTrue(Blog.getEntries().contains("This is an example"));
	}

	@Test
	public void CanDelete() {
		Blog.postEntry("example");
		Blog.deleteEntry("example");
		assertTrue(!Blog.getEntries().contains("example"));
	}
	
	@Test
	public void CanList() {
		assertTrue(Blog.getRecentEntries().size()== 10 || Blog.getRecentEntries().size()== Blog.getEntries().size());
	}
	
}

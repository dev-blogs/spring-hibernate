package com.devblogs.hibernate;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration("classpath:spring-context.xml")
public class TestSpringHibernate extends AbstractJUnit4SpringContextTests {
	@Test
	public void testWarehouseCRUD() {
	}
	
	@Test
    public void testItemCRUD() {
	}
}
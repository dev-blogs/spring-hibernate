package com.devblogs.hibernate;

import java.util.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.devblogs.dao.WarehouseDao;
import com.devblogs.model.Warehouse;

public class App {
	public static void main(String [] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");		
	}
}
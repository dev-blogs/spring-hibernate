package com.devblogs.hibernate;

import java.util.Collection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.devblogs.dao.ItemDao;
import com.devblogs.model.Item;

public class App {
	public static void main(String [] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		ItemDao itemDao = (ItemDao) context.getBean(ItemDao.class);
		
		try {
			Collection<Item> items = itemDao.getAllItems();
			for (Item item : items) {
				System.out.println(item);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
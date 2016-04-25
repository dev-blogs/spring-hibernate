package com.devblogs.dao.impl;

import java.sql.SQLException;
import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.devblogs.dao.ItemDao;
import com.devblogs.model.Item;

@Component
public class ItemDaoImpl implements ItemDao {
	@Autowired
	private SessionFactory sessionFactory;

	public void addItem(Item item, Session session) throws SQLException, Exception {
	}

	public void updateItem(Item item, Session session) throws SQLException, Exception {
	}

	public Item getItemById(Long id, Session session) throws SQLException, Exception {
		return null;
	}

	@Transactional(readOnly = true)
	public Collection<Item> getAllItems() throws SQLException, Exception {		
		return sessionFactory.getCurrentSession().createQuery("from Item c").list();
	}

	public void deleteItem(Item item, Session session) throws SQLException, Exception {
	}
}
package com.devblogs.dao.impl;

import java.sql.SQLException;
import java.util.Collection;
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

	@Transactional(readOnly = false)
	public void addItem(Item item) throws SQLException, Exception {
		sessionFactory.getCurrentSession().save(item);
	}

	@Transactional(readOnly = false)
	public void updateItem(Item item) throws SQLException, Exception {
		sessionFactory.getCurrentSession().update(item);
	}

	@Transactional(readOnly = true)
	public Item getItemById(Long id) throws SQLException, Exception {
		return (Item) sessionFactory.getCurrentSession().createQuery("from Item where id = " + id).uniqueResult();
	}

	@Transactional(readOnly = true)
	public Collection<Item> getAllItems() throws SQLException, Exception {		
		return sessionFactory.getCurrentSession().createQuery("from Item i").list();
	}

	@Transactional(readOnly = false)
	public void deleteItem(Item item) throws SQLException, Exception {
		sessionFactory.getCurrentSession().delete(item);
	}
}
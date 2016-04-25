package com.devblogs.dao;

import java.sql.SQLException;
import java.util.Collection;
import org.hibernate.Session;
import com.devblogs.model.Item;

public interface ItemDao {
	public void addItem(Item item, Session session) throws SQLException, Exception;
    public void updateItem(Item item, Session session) throws SQLException, Exception;
    public Item getItemById(Long id, Session session) throws SQLException, Exception;
    public Collection<Item> getAllItems() throws SQLException, Exception;
    public void deleteItem(Item item, Session session) throws SQLException, Exception;
}
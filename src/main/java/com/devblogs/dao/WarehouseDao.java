package com.devblogs.dao;

import java.sql.SQLException;
import java.util.Collection;
import org.hibernate.Session;
import com.devblogs.model.Warehouse;

public interface WarehouseDao {
	public void addWarehouse(Warehouse warehouse, Session session) throws SQLException, Exception;
    public void updateWarehouse(Warehouse warehouse, Session session) throws SQLException, Exception;
    public Warehouse getWarehouseById(Long id, Session session) throws SQLException, Exception;
    public Collection<Warehouse> getAllWarehouses(Session session) throws SQLException, Exception;
    public void deleteWarehouse(Warehouse warehouse, Session session) throws SQLException, Exception;
}
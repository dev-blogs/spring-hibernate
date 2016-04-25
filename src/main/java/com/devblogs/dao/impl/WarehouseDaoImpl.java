package com.devblogs.dao.impl;

import java.sql.SQLException;
import java.util.Collection;
import org.hibernate.Session;
import com.devblogs.dao.WarehouseDao;
import com.devblogs.model.Warehouse;

public class WarehouseDaoImpl implements WarehouseDao {

	public void addWarehouse(Warehouse warehouse, Session session) throws SQLException, Exception {
	}

	public void updateWarehouse(Warehouse warehouse, Session session) throws SQLException, Exception {
	}

	public Warehouse getWarehouseById(Long id, Session session) throws SQLException, Exception {
		return null;
	}

	public Collection<Warehouse> getAllWarehouses(Session session) throws SQLException, Exception {
		return null;
	}

	public void deleteWarehouse(Warehouse warehouse, Session session) throws SQLException, Exception {
	}
}
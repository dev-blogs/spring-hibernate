package com.devblogs.dao;

import java.sql.SQLException;
import java.util.Collection;
import com.devblogs.model.Warehouse;

public interface WarehouseDao {
	public void addWarehouse(Warehouse warehouse) throws SQLException, Exception;
    public void updateWarehouse(Warehouse warehouse) throws SQLException, Exception;
    public Warehouse getWarehouseById(Long id) throws SQLException, Exception;
    public Collection<Warehouse> getAllWarehouses() throws SQLException, Exception;
    public void deleteWarehouse(Warehouse warehouse) throws SQLException, Exception;
}
package com.devblogs.dao;

import java.sql.SQLException;
import java.util.Collection;
import com.devblogs.model.Provider;

public interface ProviderDao {
	public void addProvider(Provider provider) throws SQLException, Exception;
    public void updateProvider(Provider provider) throws SQLException, Exception;
    public Provider getProviderById(Long id) throws SQLException, Exception;
    public Collection<Provider> getAllProviders() throws SQLException, Exception;
    public void deleteProvider(Provider provider) throws SQLException, Exception;
}
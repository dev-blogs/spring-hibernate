package com.devblogs.dao;

import java.sql.SQLException;
import java.util.Collection;
import org.hibernate.Session;
import com.devblogs.model.Provider;

public interface ProviderDao {
	public void addProvider(Provider provider, Session session) throws SQLException, Exception;
    public void updateProvider(Provider provider, Session session) throws SQLException, Exception;
    public Provider getProviderById(Long id, Session session) throws SQLException, Exception;
    public Collection<Provider> getAllProviders(Session session) throws SQLException, Exception;
    public void deleteProvider(Provider provider, Session session) throws SQLException, Exception;
}
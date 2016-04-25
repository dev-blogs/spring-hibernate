package com.devblogs.dao.impl;

import java.sql.SQLException;
import java.util.Collection;
import org.hibernate.Session;
import com.devblogs.dao.ProviderDao;
import com.devblogs.model.Provider;

public class ProviderDaoImpl implements ProviderDao {

	public void addProvider(Provider provider, Session session) throws SQLException, Exception {
	}

	public void updateProvider(Provider provider, Session session) throws SQLException, Exception {
	}

	public Provider getProviderById(Long id, Session session) throws SQLException, Exception {
		return null;
	}

	public Collection<Provider> getAllProviders(Session session) throws SQLException, Exception {
		return null;
	}

	public void deleteProvider(Provider provider, Session session) throws SQLException, Exception {
		
	}
}
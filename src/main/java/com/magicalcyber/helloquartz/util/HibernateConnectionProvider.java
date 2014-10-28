package com.magicalcyber.helloquartz.util;

import org.hibernate.internal.SessionFactoryImpl;
import org.quartz.utils.ConnectionProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by MagicalCyber on 10/28/2014.
 */
public class HibernateConnectionProvider implements ConnectionProvider {
    private static final Logger log = LoggerFactory.getLogger(HibernateConnectionProvider.class);

    @Override
    public Connection getConnection() throws SQLException {
        log.info("Quartz getting connection...");
        Connection connection = ((SessionFactoryImpl) HibernateUtil.getSessionFactory()).getConnectionProvider().getConnection();
        return connection;
    }

    @Override
    public void shutdown() throws SQLException {

    }
}

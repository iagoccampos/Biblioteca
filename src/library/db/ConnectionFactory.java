/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author iago.campos
 */
public abstract class ConnectionFactory {
    private static final String url = "jdbc:mysql://localhost:3306/library?useTimezone=true&serverTimezone=UTC";

    public static Connection getConnection() throws SQLException {
	return DriverManager.getConnection(url.toString(), "root", "pass123");
    }
}

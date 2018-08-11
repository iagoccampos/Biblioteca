/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.controller;

import library.db.ConnectionFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author iago.campos
 */
public abstract class StudentLogin
{
    public static boolean validate(String acc, String pass) throws SQLException
    {
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery("SELECT password=" + pass
                + " AS result FROM students WHERE registration=" + acc);

        if(result.next() && result.getInt("result") == 1)
        {
            connection.close();
            return true;
        }

        result.close();
        statement.close();
        connection.close();

        return true;
    }
}

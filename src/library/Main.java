package library;

import java.util.logging.Level;
import java.util.logging.Logger;
import library.controller.ScreenController;
import library.view.LoginGUI;

public class Main
{
    public static void main(String[] args)
    {
        ScreenController.init();
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch(ClassNotFoundException ex)
        {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

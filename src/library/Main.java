package library;

import java.util.logging.Level;
import java.util.logging.Logger;
import library.controller.ScreenController;
import library.view.LoginGUI;

public class Main {
    public static void main(String[] args) {
	ScreenController.init();

	connectToDatabase();
    }

    private static void connectToDatabase() {
	try {
	    Class.forName("com.mysql.cj.jdbc.Driver");
	} catch(ClassNotFoundException ex) {
	    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
	}
    }
}

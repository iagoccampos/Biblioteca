/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.controller;

import com.sun.tracing.dtrace.DependencyClass;
import javax.swing.JFrame;
import library.view.LibrarianGUI;
import library.view.LoginGUI;
import library.view.PendenciesGUI;

/**
 *
 * @author iago.campos
 */
public abstract class ScreenController {

    public static final int LOGIN_SCREEN = 0;
    public static final int LIBRARIAN_SCREEN = 1;
    public static final int PENDENCIES_SCREEN = 2;
    public static final int STUDENT_SCREEN = 3;

    private static LoginGUI login = new LoginGUI();
    private static LibrarianGUI librarian = new LibrarianGUI();
    private static PendenciesGUI pendencies = new PendenciesGUI();

    private static JFrame currentWindow = login;

    public static void init() {
	login.setVisible(true);
	librarian.setVisible(false);
	pendencies.setVisible(false);
    }

    public static void showScreen(int screen) {
	currentWindow.setVisible(false);
	switch(screen) {
	    case LOGIN_SCREEN:
		currentWindow = login;
		break;
	    case LIBRARIAN_SCREEN:
		currentWindow = librarian;
		break;
	    case PENDENCIES_SCREEN:
		currentWindow = pendencies;
	    default:
		break;
	}
	currentWindow.setVisible(true);
    }
}

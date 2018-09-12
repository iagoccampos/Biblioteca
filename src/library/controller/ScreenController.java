/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.controller;

import enums.Screens;
import com.sun.tracing.dtrace.DependencyClass;
import javax.swing.JFrame;
import library.view.RegisterBookGUI;
import library.view.LibrarianGUI;
import library.view.BookListGUI;
import library.view.LoginGUI;
import library.view.PendenciesGUI;
import library.view.RentBookGUI;

/**
 *
 * @author iago.campos
 */
public abstract class ScreenController {

    private static LoginGUI login = new LoginGUI();
    private static LibrarianGUI librarian = new LibrarianGUI();
    private static RegisterBookGUI bookReg = new RegisterBookGUI();
    private static BookListGUI bookList = new BookListGUI();
    private static PendenciesGUI pendencies = new PendenciesGUI();
    private static RentBookGUI rentbook = new RentBookGUI();

    private static JFrame currentWindow = login;

    public static void init() {
	login.setVisible(true);
	librarian.setVisible(false);
	pendencies.setVisible(false);
    }

    public static void showScreen(Screens screen) {
	currentWindow.setVisible(false);
	switch(screen) {
	    case LOGIN:
		currentWindow = login;
		break;
	    case LIBRARIAN:
		currentWindow = librarian;
		break;
	    case BOOK_REG:
		currentWindow = bookReg;
		break;
	    case BOOK_LIST:
		currentWindow = bookList;
		break;
	    case PENDENCIES:
		currentWindow = pendencies;
		break;
	    case RENTBOOK:
		currentWindow = rentbook;
		break;
	    default:
		System.err.println("Problema ao trocar as janelas.");
		break;
	}
	currentWindow.setVisible(true);
    }
}

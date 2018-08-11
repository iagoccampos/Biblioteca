/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.controller;

import javax.swing.JFrame;
import library.view.LibrarianGUI;
import library.view.LoginGUI;

/**
 *
 * @author iago.campos
 */
public abstract class ScreenController
{

    public static final int LOGIN_SCREEN = 0;
    public static final int LIBRARIAN_SCREEN = 1;
    public static final int STUDENT_SCREEN = 2;

    private static LoginGUI login = new LoginGUI();
    private static LibrarianGUI librarian = new LibrarianGUI();

    private static JFrame currentWindow = login;

    public static void init()
    {
        login.setVisible(true);
        librarian.setVisible(false);
    }

    public static void showScreen(int screen)
    {
        currentWindow.setVisible(false);
        switch(screen)
        {
            case LOGIN_SCREEN:
                currentWindow = login;
                break;
            case LIBRARIAN_SCREEN:
                currentWindow = librarian;
                break;
            default:
                break;
        }
        currentWindow.setVisible(true);
    }
}

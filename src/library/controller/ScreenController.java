/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.controller;

import library.view.LibrarianGUI;
import library.view.LoginGUI;

/**
 *
 * @author iago.campos
 */
public abstract class ScreenController {
    
    public static final int LOGIN_SCREEN = 0;
    public static final int LIBRARIAN_SCREEN = 1;
    
    private static LoginGUI login = new LoginGUI();
    private static LibrarianGUI librarian = new LibrarianGUI();
    
    private int currentWindow = 0;
    
    static{
        login.setVisible(false);
        librarian.setVisible(false);
    }
    
    public void showScreen(int screen)
    {
        switch(screen)
        {
            case LOGIN_SCREEN:
                break;
            case LIBRARIAN_SCREEN:
                break;
            default:
                break;
        }
    }
}

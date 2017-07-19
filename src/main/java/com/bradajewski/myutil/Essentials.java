package com.bradajewski.myutil;

import javax.swing.JOptionPane;

/**
 *
 * @author Bogumił Radajewski
 */
public class Essentials {
    
    /**
     * Sprawdza zainstalowaną w systemie wersję platformy Java i jej zgodność z wymaganiami programu. 
     * Jeśli test się nie uda - kończy działanie programu wywołującego
     * @param classToTest klasa na podstawie której ma być przeprowadzony test wersji JRE
     * @param errMessage wiadomośc wyświetlana w razie błędu
     */
    public static void checkJavaVersion(String classToTest, String errMessage) {
        try {
            Class.forName(classToTest);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, errMessage, "Error: Update Java", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
    }
}

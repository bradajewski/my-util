package com.bradajewski.myutil;

import java.awt.Image;
import java.awt.Toolkit;

/**
 * Klasa zawierająca statyczne metody ułatwiające pracę z zasobami w Maven.
 * @author PRO-WIZJA
 */
public class Resources {
    
    /**
     * Metoda umożliwiająca dostęp do obrazów dołączanych z folderu src/main/resources
     * 
     * @param name ścieżka do pliku, np. "images/file.jpg"
     * @return {@code Image} - pobrany plik 
     */
    public static Image getImage(String name) {
        return Toolkit.getDefaultToolkit().getImage(Thread.currentThread().getContextClassLoader().getResource(name));
    } 
}

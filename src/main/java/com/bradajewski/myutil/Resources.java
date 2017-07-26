package com.bradajewski.myutil;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.InputStream;

/**
 * Klasa zawierająca statyczne metody ułatwiające pracę z zasobami w Maven.
 * @author Bogumił Radajewski
 */
public class Resources {
    
    /**
     * Metoda umożliwiająca dostęp do dowolnych zasobów dołączanych do src/main/resources
     * @param name - nazwa zasobu, np. "file.txt"
     * @return (@code InputStream} odpowiadający wybranemu zasobowi
     */
    public static InputStream getResource(String name) {
        return Thread.currentThread().getContextClassLoader().getResourceAsStream(name);
    }
    
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

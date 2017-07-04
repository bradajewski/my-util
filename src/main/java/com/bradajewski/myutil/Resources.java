package com.bradajewski.myutil;

import java.awt.Image;
import java.awt.Toolkit;

/**
 * Klasa zawierająca statyczne metody ułatwiające pracę z zasobami w Maven.
 * @author PRO-WIZJA
 */
public class Resources {
    
    /**
     * Metoda umożliwiająca dostęp do obrazów dołączanych przez Maven z folderu 
     * src/main/resources do archiwum .jar.
     * 
     * @param name ścieżka do pliku, np. "images/file.jpg"
     * @return {@code Image} - pobrany plik 
     */
    public final static Image getImage(String name) {
        return Toolkit.getDefaultToolkit().getImage(Thread.currentThread().getContextClassLoader().getResource(name));
    } 
}

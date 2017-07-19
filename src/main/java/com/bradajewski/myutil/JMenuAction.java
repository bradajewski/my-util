package com.bradajewski.myutil;

import java.awt.event.InputEvent;
import javax.swing.AbstractAction;
import javax.swing.Icon;
import javax.swing.KeyStroke;

/**
 * Abstrakcyjne klasa rozszerzająca {@code AbstractAction}, pozwalająca ustawić
 * nazwę, ikonę, akcelerator i tekst podpowiedzi dla obiektów paska menu i paska narzędzi.
 */
public abstract class JMenuAction extends AbstractAction {

    /**
     * Domyślny konstruktor
     * @param name nazwa akcji
     * @param image ikona akcji
     * @param accelerator wartość odpowiadająca klawiszowi akceleratora
     * @param description opis jaki ma się pojawiać dla obiektów wykorzystujących akcję
     */
    JMenuAction(String name, Icon image, int accelerator, String description) {
        super(name, image);
        init(accelerator, description);
    }

    private void init(int accelerator, String description) {
        if (accelerator != -1) putValue(AbstractAction.ACCELERATOR_KEY, KeyStroke.getKeyStroke(accelerator, InputEvent.CTRL_DOWN_MASK));
        putValue(AbstractAction.SHORT_DESCRIPTION, description);
    }
}
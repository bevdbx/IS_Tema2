package org.example.factory;

import org.example.buttons.Button;

public abstract class Dialog {
    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }
    public abstract Button createButton();
}

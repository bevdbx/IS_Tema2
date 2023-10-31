package org.example.factory;

import org.example.buttons.Button;
import org.example.buttons.HTMLButton;

public class HTMLDialog extends Dialog{
    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}

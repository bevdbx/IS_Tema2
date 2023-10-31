package org.example.factory;

import org.example.buttons.Button;
import org.example.buttons.WindowsButton;

public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}

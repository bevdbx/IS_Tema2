package org.example;

import org.example.factory.Dialog;
import org.example.factory.HTMLDialog;
import org.example.factory.WindowsDialog;

public class Main {
    private static Dialog dialog;
    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HTMLDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
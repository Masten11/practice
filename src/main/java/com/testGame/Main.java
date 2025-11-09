package com.testGame;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater (() -> {
            JFrame window = new JFrame();

            window.setTitle("Test game window");

            window.setSize(800, 600);

            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            window.setLocationRelativeTo(null);

            window.setVisible(true);
        });
    }
}
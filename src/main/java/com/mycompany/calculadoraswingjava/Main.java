package com.mycompany.calculadoraswingjava;

import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(() -> {
            
            Calculadora calc = new Calculadora();
            calc.setVisible(true);
            
        });
        
    }
}

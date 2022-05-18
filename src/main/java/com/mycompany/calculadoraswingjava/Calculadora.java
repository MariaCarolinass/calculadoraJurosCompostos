package com.mycompany.calculadoraswingjava;

import java.awt.event.ActionEvent;

public class Calculadora extends CalculadoraViewForm {

    @Override
    protected void btnCalcularClick(ActionEvent ev) {
        
    }

    @Override
    protected void btnLimparClick(ActionEvent ev) {
        
        txtCapital.setText("");
        txtTaxaJuros.setText("");
        txtPeriodo.setText("");
        txtMontante.setText("");
        
    }

    @Override
    protected void btnFecharClick(ActionEvent ev) {
        
        this.setVisible(false);
        this.dispose();
        
    }
    
    
    
}

package com.mycompany.calculadoraswingjava;

import java.awt.event.ActionEvent;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculadora extends CalculadoraViewForm {

    
    private BigDecimal toBigDecimal(String valor) {
        
        try {
            
            // converter conteúdo txt para BigDecimal
            return new BigDecimal(valor).setScale(4, RoundingMode.HALF_EVEN);
            
        } catch (Exception ex) {
            
            // retornar zero caso o conteúdo txt seja vázio
            return BigDecimal.ZERO;
            
        }
        
    }
    
    @Override
    protected void btnCalcularClick(ActionEvent ev) {
        
        // passando txt para converter
        BigDecimal capital = toBigDecimal(txtCapital.getText());
        BigDecimal taxaJuros = toBigDecimal(txtTaxaJuros.getText());
        BigDecimal periodo = toBigDecimal(txtPeriodo.getText());
        
        // fórmula: montante = capital * ((1 + taxaJuros%) / periodo)
        BigDecimal montante = taxaJuros.divide(new BigDecimal(100), 
                RoundingMode.HALF_EVEN); // taxaJuros: divisão por 100
        montante = montante.add(BigDecimal.ONE); // somar + 1
        montante = montante.pow(periodo.intValue()); // montante/periodo (int)
        montante = montante.multiply(capital); // multiplicação pelo capital
        montante = montante.setScale(2, RoundingMode.HALF_EVEN);
        
        // exibindo calculo em txtMontante
        txtMontante.setText(montante.toPlainString());
        
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

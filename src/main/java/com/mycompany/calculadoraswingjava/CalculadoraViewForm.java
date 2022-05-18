package com.mycompany.calculadoraswingjava;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public abstract class CalculadoraViewForm extends JFrame {
    
    // Painel
    protected JPanel pnlForm;
    protected JPanel pnlRodape;
    
    // Botões
    protected JButton btnCalcular;
    protected JButton btnLimpar;
    protected JButton btnFechar;
            
    // Capital
    protected JLabel jblCapital;
    protected JTextField txtCapital;
    
    // Taxa Juros
    protected JLabel jblTaxaJuros;
    protected JTextField txtTaxaJuros;
    
    // Período
    protected JLabel jblPeriodo;
    protected JTextField txtPeriodo;
    
    // Montante
    protected JLabel jblMontante;
    protected JTextField txtMontante;
    
    
    // Construtor
    public CalculadoraViewForm() {
        
        this.init();
        
    }
    
    private void init() {
        
        this.setTitle("Calculadora Juros Compostos");
        this.setSize(640, 480);
        
    }
    
    
    // Gets
    public JPanel getPnlForm() {
        // criar novo painel se for nulo
        if (pnlForm == null) {
            pnlForm = new JPanel();
        }
        
        return pnlForm;
    }

    public JPanel getPnlRodape() {
        // criar novo painel se for nulo
        if (pnlRodape == null) {
            pnlRodape = new JPanel();
        }
        
        return pnlRodape;
    }
    
    
}

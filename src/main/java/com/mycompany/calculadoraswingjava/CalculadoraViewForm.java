package com.mycompany.calculadoraswingjava;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public abstract class CalculadoraViewForm extends JFrame {
    
    private static final int TAMANHO_TXT = 10;
    
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
        this.eventos();
        
    }
    
    private void init() {
        
        this.setTitle("Calculadora Juros Compostos");
        this.setSize(640, 480);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        this.getContentPane().setLayout(new BorderLayout());
        this.setResizable(false);
        
        this.getContentPane().add(this.getPnlForm(), BorderLayout.CENTER);
        this.getContentPane().add(this.getPnlRodape(), BorderLayout.PAGE_END);
        this.pack();
        
    }

    protected abstract void btnCalcularClick(ActionEvent ev);
    protected abstract void btnLimparClick(ActionEvent ev);
    protected abstract void btnFecharClick(ActionEvent ev);
    
    private void eventos() {
        
        btnCalcular.addActionListener(this::btnCalcularClick);
        btnLimpar.addActionListener(this::btnLimparClick);
        btnFechar.addActionListener(this::btnFecharClick);
        
    }
    
    // Gets
    public JPanel getPnlForm() {
        // criar novo painel se for nulo
        if (pnlForm == null) {
            pnlForm = new JPanel(new GridLayout(4, 2));
            
            this.jblCapital = new JLabel("Capital");
            this.txtCapital = new JTextField(TAMANHO_TXT);
            
            pnlForm.add(jblCapital);
            pnlForm.add(txtCapital);
            
            this.jblTaxaJuros = new JLabel("Taxa Juros");
            this.txtTaxaJuros = new JTextField(TAMANHO_TXT);
            
            pnlForm.add(jblTaxaJuros);
            pnlForm.add(txtTaxaJuros);
            
            this.jblPeriodo = new JLabel("Período");
            this.txtPeriodo = new JTextField(TAMANHO_TXT);
            
            pnlForm.add(jblPeriodo);
            pnlForm.add(txtPeriodo);
            
            this.jblMontante = new JLabel("Montante");
            this.txtMontante = new JTextField(TAMANHO_TXT);
            this.txtMontante.setEditable(false);
            
            pnlForm.add(jblMontante);
            pnlForm.add(txtMontante);
            
        }
        
        return pnlForm;
    }

    public JPanel getPnlRodape() {
        // criar novo painel se for nulo
        if (pnlRodape == null) {
            pnlRodape = new JPanel(new FlowLayout(FlowLayout.CENTER));
            
            // criando novos botões
            btnCalcular = new JButton("Calcular");
            btnLimpar = new JButton("Limpar");
            btnFechar = new JButton("Fechar");
            
            // add botões no painel rodape
            pnlRodape.add(this.btnCalcular);
            pnlRodape.add(this.btnLimpar);
            pnlRodape.add(this.btnFechar);
            
        }
        
        return pnlRodape;
    }
    
    
}

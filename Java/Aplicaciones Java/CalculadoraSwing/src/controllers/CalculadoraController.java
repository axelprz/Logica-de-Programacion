
package controllers;

import java.awt.Color;
import static java.awt.Frame.ICONIFIED;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import models.CalculadoraModel;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import views.PanelCalculadora;

public class CalculadoraController implements ActionListener, KeyListener {
    private final PanelCalculadora view;
    private final CalculadoraModel model;

    public CalculadoraController(PanelCalculadora view, CalculadoraModel model) {
        this.view = view;
        this.model = model;
        view.btn0.addActionListener(this);
        view.btn1.addActionListener(this);
        view.btn2.addActionListener(this);
        view.btn3.addActionListener(this);
        view.btn4.addActionListener(this);
        view.btn5.addActionListener(this);
        view.btn6.addActionListener(this);
        view.btn7.addActionListener(this);
        view.btn8.addActionListener(this);
        view.btn9.addActionListener(this);
        view.btnBorrar.addActionListener(this);
        view.btnBorrarTodo.addActionListener(this);
        view.btnCambiarModo.addActionListener(this);
        view.btnCerrar.addActionListener(this);
        view.btnComa.addActionListener(this);
        view.btnDividir.addActionListener(this);
        view.btnIgual.addActionListener(this);
        view.btnMinimizar.addActionListener(this);
        view.btnMultiplicar.addActionListener(this);
        view.btnRestar.addActionListener(this);
        view.btnSumar.addActionListener(this);
        
        view.addKeyListener(this);
        view.setFocusable(true);
        view.requestFocusInWindow();
    }
    
    private void refocus() {
        view.requestFocusInWindow();
    }

    private void mostrarNumero(int n){
        view.jLabelOperacion.setText(view.jLabelOperacion.getText() + n);
        refocus();
    }
    
    private void mostrarOperador(char o){
        view.jLabelOperacion.setText(view.jLabelOperacion.getText() + o);
        refocus();
    }
    
    private void mostrarResultado(){
        String operacion = view.jLabelOperacion.getText();
        Double resultado;
        
        try {
            Expression e = new ExpressionBuilder(operacion).build();
            resultado = e.evaluate();
            
            if(resultado % 1 != 0){
                view.jLabelResultado.setText(String.valueOf(resultado));
            }else{
                view.jLabelResultado.setText(String.valueOf(resultado).substring(0, String.valueOf(resultado).length() - 2));
            }
        } catch (Exception e) {
            view.btnBorrarTodo.doClick();
        }
        refocus();
    }
    
    private void borrarNumero(){
        String operacion = view.jLabelOperacion.getText();
        view.jLabelOperacion.setText(operacion.substring(0, operacion.length() - 1));
        refocus();
    }
    
    private void modoOscuro(){
        view.jPanelBackground.setBackground(Color.decode("#000000"));
        
        view.btn0.setIcon(new ImageIcon(getClass().getResource("/img/btn4-dark.png")));
        view.btn0.setRolloverIcon(new ImageIcon(getClass().getResource("/img/btn4-dark-selected.png")));
        view.btn0.setForeground(Color.decode("#fefefe"));
        
        view.btn1.setIcon(new ImageIcon(getClass().getResource("/img/btn3-dark.png")));
        view.btn1.setRolloverIcon(new ImageIcon(getClass().getResource("/img/btn3-dark-selected.png")));
        view.btn1.setForeground(Color.decode("#fefefe"));
        
        view.btn2.setIcon(new ImageIcon(getClass().getResource("/img/btn3-dark.png")));
        view.btn2.setRolloverIcon(new ImageIcon(getClass().getResource("/img/btn3-dark-selected.png")));
        view.btn2.setForeground(Color.decode("#fefefe"));
        
        view.btn3.setIcon(new ImageIcon(getClass().getResource("/img/btn3-dark.png")));
        view.btn3.setRolloverIcon(new ImageIcon(getClass().getResource("/img/btn3-dark-selected.png")));
        view.btn3.setForeground(Color.decode("#fefefe"));
        
        view.btn4.setIcon(new ImageIcon(getClass().getResource("/img/btn3-dark.png")));
        view.btn4.setRolloverIcon(new ImageIcon(getClass().getResource("/img/btn3-dark-selected.png")));
        view.btn4.setForeground(Color.decode("#fefefe"));
        
        view.btn5.setIcon(new ImageIcon(getClass().getResource("/img/btn3-dark.png")));
        view.btn5.setRolloverIcon(new ImageIcon(getClass().getResource("/img/btn3-dark-selected.png")));
        view.btn5.setForeground(Color.decode("#fefefe"));
        
        view.btn6.setIcon(new ImageIcon(getClass().getResource("/img/btn3-dark.png")));
        view.btn6.setRolloverIcon(new ImageIcon(getClass().getResource("/img/btn3-dark-selected.png")));
        view.btn6.setForeground(Color.decode("#fefefe"));
        
        view.btn7.setIcon(new ImageIcon(getClass().getResource("/img/btn3-dark.png")));
        view.btn7.setRolloverIcon(new ImageIcon(getClass().getResource("/img/btn3-dark-selected.png")));
        view.btn7.setForeground(Color.decode("#fefefe"));
        
        view.btn8.setIcon(new ImageIcon(getClass().getResource("/img/btn3-dark.png")));
        view.btn8.setRolloverIcon(new ImageIcon(getClass().getResource("/img/btn3-dark-selected.png")));
        view.btn8.setForeground(Color.decode("#fefefe"));
        
        view.btn9.setIcon(new ImageIcon(getClass().getResource("/img/btn3-dark.png")));
        view.btn9.setRolloverIcon(new ImageIcon(getClass().getResource("/img/btn3-dark-selected.png")));
        view.btn9.setForeground(Color.decode("#fefefe"));
        
        view.btnBorrar.setIcon(new ImageIcon(getClass().getResource("/img/btn-borrar-dark.png")));
        view.btnBorrar.setRolloverIcon(new ImageIcon(getClass().getResource("/img/btn-borrar-dark-selected.png")));
        view.btnBorrar.setForeground(Color.decode("#fefefe"));
        
        view.btnBorrarTodo.setIcon(new ImageIcon(getClass().getResource("/img/btn1-dark.png")));
        view.btnBorrarTodo.setRolloverIcon(new ImageIcon(getClass().getResource("/img/btn1-dark-selected.png")));
        view.btnBorrarTodo.setForeground(Color.decode("#000000"));
        
        view.btnCambiarModo.setIcon(new ImageIcon(getClass().getResource("/img/btn-modeDark.png")));
        
        view.btnCerrar.setIcon(new ImageIcon(getClass().getResource("/img/btn-close-dark.png")));
        
        view.btnMinimizar.setIcon(new ImageIcon(getClass().getResource("/img/btn-min-dark.png")));
        
        view.btnComa.setIcon(new ImageIcon(getClass().getResource("/img/btn3-dark.png")));
        view.btnComa.setRolloverIcon(new ImageIcon(getClass().getResource("/img/btn3-dark-selected.png")));
        view.btnComa.setForeground(Color.decode("#fefefe"));
        
        view.btnMultiplicar.setIcon(new ImageIcon(getClass().getResource("/img/btn2-dark.png")));
        view.btnMultiplicar.setRolloverIcon(new ImageIcon(getClass().getResource("/img/btn2-dark-selected.png")));
        view.btnMultiplicar.setForeground(Color.decode("#fefefe"));
        
        view.btnDividir.setIcon(new ImageIcon(getClass().getResource("/img/btn2-dark.png")));
        view.btnDividir.setRolloverIcon(new ImageIcon(getClass().getResource("/img/btn2-dark-selected.png")));
        view.btnDividir.setForeground(Color.decode("#fefefe"));
        
        view.btnSumar.setIcon(new ImageIcon(getClass().getResource("/img/btn2-dark.png")));
        view.btnSumar.setRolloverIcon(new ImageIcon(getClass().getResource("/img/btn2-dark-selected.png")));
        view.btnSumar.setForeground(Color.decode("#fefefe"));
        
        view.btnRestar.setIcon(new ImageIcon(getClass().getResource("/img/btn2-dark.png")));
        view.btnRestar.setRolloverIcon(new ImageIcon(getClass().getResource("/img/btn2-dark-selected.png")));
        view.btnRestar.setForeground(Color.decode("#fefefe"));
        
        view.btnIgual.setIcon(new ImageIcon(getClass().getResource("/img/btn2-dark.png")));
        view.btnIgual.setRolloverIcon(new ImageIcon(getClass().getResource("/img/btn2-dark-selected.png")));
        view.btnIgual.setForeground(Color.decode("#fefefe"));
        
        view.jLabelOperacion.setForeground(Color.decode("#fefefe"));
        view.jLabelResultado.setForeground(Color.decode("#fefefe"));
        
        refocus();
    }
    
    private void modoClaro(){
        view.jPanelBackground.setBackground(Color.decode("#fefefe"));
        
        view.btn0.setIcon(new ImageIcon(getClass().getResource("/img/btn4.png")));
        view.btn0.setRolloverIcon(new ImageIcon(getClass().getResource("/img/btn4-selected.png")));
        view.btn0.setForeground(Color.decode("#000000"));
        
        view.btn1.setIcon(new ImageIcon(getClass().getResource("/img/btn3.png")));
        view.btn1.setRolloverIcon(new ImageIcon(getClass().getResource("/img/btn3-selected.png")));
        view.btn1.setForeground(Color.decode("#000000"));
        
        view.btn2.setIcon(new ImageIcon(getClass().getResource("/img/btn3.png")));
        view.btn2.setRolloverIcon(new ImageIcon(getClass().getResource("/img/btn3-selected.png")));
        view.btn2.setForeground(Color.decode("#000000"));
        
        view.btn3.setIcon(new ImageIcon(getClass().getResource("/img/btn3.png")));
        view.btn3.setRolloverIcon(new ImageIcon(getClass().getResource("/img/btn3-selected.png")));
        view.btn3.setForeground(Color.decode("#000000"));
        
        view.btn4.setIcon(new ImageIcon(getClass().getResource("/img/btn3.png")));
        view.btn4.setRolloverIcon(new ImageIcon(getClass().getResource("/img/btn3-selected.png")));
        view.btn4.setForeground(Color.decode("#000000"));
        
        view.btn5.setIcon(new ImageIcon(getClass().getResource("/img/btn3.png")));
        view.btn5.setRolloverIcon(new ImageIcon(getClass().getResource("/img/btn3-selected.png")));
        view.btn5.setForeground(Color.decode("#000000"));
        
        view.btn6.setIcon(new ImageIcon(getClass().getResource("/img/btn3.png")));
        view.btn6.setRolloverIcon(new ImageIcon(getClass().getResource("/img/btn3-selected.png")));
        view.btn6.setForeground(Color.decode("#000000"));
        
        view.btn7.setIcon(new ImageIcon(getClass().getResource("/img/btn3.png")));
        view.btn7.setRolloverIcon(new ImageIcon(getClass().getResource("/img/btn3-selected.png")));
        view.btn7.setForeground(Color.decode("#000000"));
        
        view.btn8.setIcon(new ImageIcon(getClass().getResource("/img/btn3.png")));
        view.btn8.setRolloverIcon(new ImageIcon(getClass().getResource("/img/btn3-selected.png")));
        view.btn8.setForeground(Color.decode("#000000"));
        
        view.btn9.setIcon(new ImageIcon(getClass().getResource("/img/btn3.png")));
        view.btn9.setRolloverIcon(new ImageIcon(getClass().getResource("/img/btn3-selected.png")));
        view.btn9.setForeground(Color.decode("#000000"));
        
        view.btnBorrar.setIcon(new ImageIcon(getClass().getResource("/img/btn-borrar.png")));
        view.btnBorrar.setRolloverIcon(new ImageIcon(getClass().getResource("/img/btn-borrar-selected.png")));
        view.btnBorrar.setForeground(Color.decode("#fefefe"));
        
        view.btnBorrarTodo.setIcon(new ImageIcon(getClass().getResource("/img/btn1.png")));
        view.btnBorrarTodo.setRolloverIcon(new ImageIcon(getClass().getResource("/img/btn1-selected.png")));
        view.btnBorrarTodo.setForeground(Color.decode("#fefefe"));
        
        view.btnCambiarModo.setIcon(new ImageIcon(getClass().getResource("/img/btn-modeLight.png")));
        
        view.btnCerrar.setIcon(new ImageIcon(getClass().getResource("/img/btn-close.png")));
        
        view.btnMinimizar.setIcon(new ImageIcon(getClass().getResource("/img/btn-min.png")));
        
        view.btnComa.setIcon(new ImageIcon(getClass().getResource("/img/btn3.png")));
        view.btnComa.setRolloverIcon(new ImageIcon(getClass().getResource("/img/btn3-selected.png")));
        view.btnComa.setForeground(Color.decode("#000000"));
        
        view.btnMultiplicar.setIcon(new ImageIcon(getClass().getResource("/img/btn2.png")));
        view.btnMultiplicar.setRolloverIcon(new ImageIcon(getClass().getResource("/img/btn2-selected.png")));
        view.btnMultiplicar.setForeground(Color.decode("#fefefe"));
        
        view.btnDividir.setIcon(new ImageIcon(getClass().getResource("/img/btn2.png")));
        view.btnDividir.setRolloverIcon(new ImageIcon(getClass().getResource("/img/btn2-selected.png")));
        view.btnDividir.setForeground(Color.decode("#fefefe"));
        
        view.btnSumar.setIcon(new ImageIcon(getClass().getResource("/img/btn2.png")));
        view.btnSumar.setRolloverIcon(new ImageIcon(getClass().getResource("/img/btn2-selected.png")));
        view.btnSumar.setForeground(Color.decode("#fefefe"));
        
        view.btnRestar.setIcon(new ImageIcon(getClass().getResource("/img/btn2.png")));
        view.btnRestar.setRolloverIcon(new ImageIcon(getClass().getResource("/img/btn2-selected.png")));
        view.btnRestar.setForeground(Color.decode("#fefefe"));
        
        view.btnIgual.setIcon(new ImageIcon(getClass().getResource("/img/btn2.png")));
        view.btnIgual.setRolloverIcon(new ImageIcon(getClass().getResource("/img/btn2-selected.png")));
        view.btnIgual.setForeground(Color.decode("#fefefe"));
        
        view.jLabelOperacion.setForeground(Color.decode("#000000"));
        view.jLabelResultado.setForeground(Color.decode("#000000"));
        
        refocus();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == view.btn0){
            mostrarNumero(0);
            mostrarResultado();
        }
        else if(e.getSource() == view.btn1){
            mostrarNumero(1);
            mostrarResultado();
        }
        else if(e.getSource() == view.btn2){
            mostrarNumero(2);
            mostrarResultado();
        }
        else if(e.getSource() == view.btn3){
            mostrarNumero(3);
            mostrarResultado();
        }
        else if(e.getSource() == view.btn4){
            mostrarNumero(4);
            mostrarResultado();
        }
        else if(e.getSource() == view.btn5){
            mostrarNumero(5);
            mostrarResultado();
        }
        else if(e.getSource() == view.btn6){
            mostrarNumero(6);
            mostrarResultado();
        }
        else if(e.getSource() == view.btn7){
            mostrarNumero(7);
            mostrarResultado();
        }
        else if(e.getSource() == view.btn8){
            mostrarNumero(8);
            mostrarResultado();
        }
        else if(e.getSource() == view.btn9){
            mostrarNumero(9);
            mostrarResultado();
        }
        else if(e.getSource() == view.btnComa){
            mostrarOperador('.'); 
        }
        else if(e.getSource() == view.btnDividir){
            mostrarOperador('/');
        }
        else if(e.getSource() == view.btnMultiplicar){
            mostrarOperador('*');
        }
        else if(e.getSource() == view.btnRestar){
            mostrarOperador('-');
        }
        else if(e.getSource() == view.btnSumar){
            mostrarOperador('+');
        }
        else if(e.getSource() == view.btnIgual){
            mostrarResultado();
            view.jLabelOperacion.setText(view.jLabelResultado.getText());
        }
        else if(e.getSource() == view.btnBorrar){
            borrarNumero();
        }
        else if(e.getSource() == view.btnBorrarTodo){
            view.jLabelOperacion.setText("");
            view.jLabelResultado.setText("");
            refocus();
        }
        else if(e.getSource() == view.btnCambiarModo){
            if(model.isDarkMode()){
                modoClaro();
                model.setDarkMode(false);
            }else{
                modoOscuro();
                model.setDarkMode(true);
            }
        }
        else if(e.getSource() == view.btnCerrar){
            view.dispose();
        }
        else if(e.getSource() == view.btnMinimizar){
            view.setExtendedState(ICONIFIED);
            refocus();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char keyChar = e.getKeyChar();
        
        if (Character.isDigit(keyChar)) {
            mostrarNumero(Character.getNumericValue(keyChar));
            mostrarResultado();
        } else if (keyChar == '.' || keyChar == ',') {
            mostrarOperador('.');
        } else if (keyChar == '/') {
            mostrarOperador('/');
        } else if (keyChar == '*') {
            mostrarOperador('*');
        } else if (keyChar == '-') {
            mostrarOperador('-');
        } else if (keyChar == '+') {
            mostrarOperador('+');
        } else if (keyChar == KeyEvent.VK_ENTER) {
            mostrarResultado();
            view.jLabelOperacion.setText(view.jLabelResultado.getText());
        } else if (keyChar == KeyEvent.VK_BACK_SPACE) {
            borrarNumero();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author Юрий
 */
public class CalculatorController implements ActionListener{
    //передали экземпляр класса Calculator
    Calculator frame;
    char selectedAction = ' ';// + - * /
    double result = 0;
   
    //создали конструктор
    public CalculatorController(Calculator frame) {
        this.frame = frame;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton cl = (JButton) e.getSource();
        String ariaText = frame.textArea.getText();
        double displayValue = 0;
        if(!"".equals(ariaText)){
            displayValue = Double.parseDouble(ariaText);
        }
        Object rev = e.getSource();
       
        if(rev == frame.button[3]){
            selectedAction = '+';
            result = displayValue;
            frame.textArea.setText("");
           
            
            }else if(rev == frame.button[15]){
            selectedAction = '/';
            result = displayValue;
            frame.textArea.setText("");
            
            }else if(rev == frame.button[11]){
            selectedAction = '*';
            result = displayValue;
            frame.textArea.setText("");
           
            
            }else if(rev == frame.button[7]){
            selectedAction = '-';
            result = displayValue;
            frame.textArea.setText("");
            
            
            }else if(rev == frame.button[14]){
            selectedAction = 'C';
            result = displayValue;
            frame.textArea.setText("");
            
            
            }else if(rev == frame.button[16]){
                if(selectedAction == '+'){
               result += displayValue;
               frame.textArea.setText("" + result);
        
            }else if(selectedAction == '/'){
                result /= displayValue;
                frame.textArea.setText("" + result);
            }else if(selectedAction == '*'){
                result *= displayValue;
                frame.textArea.setText("" + result);
            }else if(selectedAction == '-'){
                result -= displayValue;
                frame.textArea.setText("" + result);
            }else if(selectedAction == '%'){
                result %= displayValue;
                frame.textArea.setText("" + result);
                
            }
            
            }else{
             
        String clButton = cl.getText();
        frame.textArea.setText(ariaText + clButton);
    }
    
}
    }

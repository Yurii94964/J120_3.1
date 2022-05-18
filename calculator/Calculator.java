/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Юрий
 */
public class Calculator extends JFrame{
    JButton [] button = new JButton[17];
    int res = 0;
    JPanel centerPanel;//создали переменную
    JTextArea textArea;
    
    public Calculator(){
        setTitle("Калькулятор");
        init();
        setSize(250, 300);// размер окна
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);//что делать при нажатии на кнопку закрытия окна
        setVisible(true);//видимость окна
    }

    private void init() {
        Container cr = getContentPane();
        textArea = new JTextArea();
        GridLayout grid1 = new GridLayout(4,4,1,1);//создаем компановщик Grid
        centerPanel = new JPanel(grid1);
        cr.add(centerPanel, BorderLayout.CENTER);//добавление на экран кнопки в компановщик Border  
        button();
        cr.add(textArea, BorderLayout.NORTH);//добавление на экран кнопки в компановщик Border
        cr.add(button[16], BorderLayout.SOUTH);
        
        CalculatorController calculatorController = new CalculatorController(this);
        button[16].addActionListener(calculatorController);
        button[3].addActionListener(calculatorController);
        button[7].addActionListener(calculatorController);
        button[11].addActionListener(calculatorController);
        button[15].addActionListener(calculatorController);
       
      } 
         private void button (){  //создание кнопок калькулятора через массив
         button [0] = new JButton("7");
         button [1] = new JButton("8");
         button [2] = new JButton("9");
         button [3] = new JButton("+");
         button [4] = new JButton("4");      
         button [5] = new JButton("5");
         button [6] = new JButton("6");
         button [7] = new JButton("-");
         button [8] = new JButton("1");
         button [9] = new JButton("2");
         button [10] = new JButton("3");
         button [11] = new JButton("*");
         button [12] = new JButton("0");
         button [13] = new JButton(".");
         button [14] = new JButton("C");
         button [15] = new JButton("/");
         button [16] = new JButton("=");
        
         for(JButton b : button){ // создали цикл
            b.addActionListener(new CalculatorController(this));
             centerPanel.add(b);
           
        
    }
       
    
         }}

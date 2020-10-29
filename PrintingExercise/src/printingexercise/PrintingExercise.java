/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printingexercise;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

/**
 *
 * @author sermar
 */
public class PrintingExercise extends JFrame{

   private JPanel mainPanel = new JPanel();
   private JPanel panelPanel = new JPanel();
   private JPanel microPanel = new JPanel();
   private JPanel ramPanel = new JPanel();
   private JPanel monitorsPanel = new JPanel();
   private JPanel miscePanel = new JPanel();
   private JButton boton = new JButton();
   private ButtonGroup bg = new ButtonGroup();
   private JRadioButton intel1,intel2,amd1,amd2,ram1,ram2,ram4,ram8,lg1,lg2,hp1,hp2 = new JRadioButton();
   private JCheckBox mouseN,mouseP,keyboardN,keyboardP = new JCheckBox();
    
   public PrintingExercise(){
       
       setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700, 300);
        setTitle("Printing");
        
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        
        panelPanel = new JPanel();
        panelPanel.setLayout(new GridLayout(1,4));
        
        boton = new JButton("Print");
        mainPanel.add(boton,BorderLayout.SOUTH);
        
        
        microPanel = new JPanel();
        microPanel.setLayout(new GridLayout(4,1));
        TitledBorder title;
        title = BorderFactory.createTitledBorder ("Micros");
        microPanel.setBorder (title);
        intel1 = new JRadioButton("Intel 1");
        intel2 = new JRadioButton("Intel 2");
        amd1 = new JRadioButton("AMD 1");
        amd2 = new JRadioButton("AMD 2");
        microPanel.add(intel1);
        microPanel.add(intel2);
        microPanel.add(amd1);
        microPanel.add(amd2);
        panelPanel.add(microPanel);
        
        
        ramPanel = new JPanel();
        ramPanel.setLayout(new GridLayout(4,1));
        TitledBorder title1;
        title1 = BorderFactory.createTitledBorder ("RAM");
        ramPanel.setBorder (title1);
        ram1 = new JRadioButton("RAM 1 GB");
        ram2 = new JRadioButton("RAM 2 GB");
        ram4 = new JRadioButton("RAM 4 GB");
        ram8 = new JRadioButton("RAM 8 GB");
        ramPanel.add(ram1);
        ramPanel.add(ram2);
        ramPanel.add(ram4);
        ramPanel.add(ram8);
        panelPanel.add(ramPanel);
        
        
        monitorsPanel = new JPanel();
        monitorsPanel.setLayout(new GridLayout(4,1));
        TitledBorder title2;
        title2 = BorderFactory.createTitledBorder ("Monitors");
        monitorsPanel.setBorder (title2);
        lg1 = new JRadioButton("LG1");
        lg2 = new JRadioButton("LG2");
        hp1 = new JRadioButton("HP1");
        hp2 = new JRadioButton("HP2");
        monitorsPanel.add(lg1);
        monitorsPanel.add(lg2);
        monitorsPanel.add(hp1);
        monitorsPanel.add(hp2);
        panelPanel.add(monitorsPanel);
        
        miscePanel = new JPanel();
        miscePanel.setLayout(new GridLayout(4,1));
        TitledBorder title3;
        title3 = BorderFactory.createTitledBorder ("Miscellanea");
        miscePanel.setBorder (title3);
        mouseN = new JCheckBox("Mouse Normal");
        mouseP = new JCheckBox("Mouse Pro");
        keyboardN = new JCheckBox("Keyboard Normal");
        keyboardP = new JCheckBox("Keyboard Pro");
        miscePanel.add(mouseN);
        miscePanel.add(mouseP);
        miscePanel.add(keyboardN);
        miscePanel.add(keyboardP);
        panelPanel.add(miscePanel);
        
        mainPanel.add(panelPanel);
        add(mainPanel);
   }
}

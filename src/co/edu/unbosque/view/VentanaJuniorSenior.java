package co.edu.unbosque.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaJuniorSenior extends JFrame implements ActionListener {

  private JButton botonJunior;
  private JButton botonSenior;
  private JLabel titulo;
  private JPanel botones;

  public VentanaJuniorSenior(ActionListener action)  {
    titulo = new JLabel("ELIGE EL TIPO DE EMPLEADO");
    botonJunior = new JButton("JUNIOR");
    botonJunior.addActionListener(action);
    botonSenior = new JButton("SENIOR");
    botonSenior.addActionListener(action);
    botones = new JPanel();

    botones.setLayout(new GridLayout(1,2));
    setLayout(null);
    setSize(510, 300);

    add(titulo);
    titulo.setBounds(170,0,510,50);
    botones.add(botonJunior);
    botones.add(botonSenior);
    add(botones);
    botones.setBounds(0,50,510,220);
    setLocationRelativeTo(null);
  }

  @Override
  public void actionPerformed(ActionEvent e) {

  }

}

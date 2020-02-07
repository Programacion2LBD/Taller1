package co.edu.unbosque.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaNiveles extends JFrame implements ActionListener {

  private JButton boton1;
  private JButton boton2;
  private JButton boton3;
  private JButton boton4;
  private JButton boton5;

  private JLabel titulo;
  private JPanel botones;

  public VentanaNiveles()  {
    titulo = new JLabel("ELIGE EL NIVEL DEL INGENIERO JUNIOR");
    boton1 = new JButton("NIVEL 1");
    boton2 = new JButton("NIVEL 2");
    boton3 = new JButton("NIVEL 3");
    boton4 = new JButton("NIVEL 4");
    boton5 = new JButton("NIVEL 5");

    botones = new JPanel();

    botones.setLayout(new GridLayout(1,2));
    setLayout(null);
    setSize(510, 300);

    add(titulo);
    titulo.setBounds(150,0,510,50);
    botones.add(boton1);
    botones.add(botonSenior);
    add(botones);
    botones.setBounds(0,50,510,220);
    setLocationRelativeTo(null);
  }

  @Override
  public void actionPerformed(ActionEvent e) {

  }

}

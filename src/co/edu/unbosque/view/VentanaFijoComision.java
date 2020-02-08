package co.edu.unbosque.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaFijoComision extends JFrame implements ActionListener {

  private JButton botonComision;
  private JButton botonFijo;
  private JLabel titulo;
  private JPanel botones;

  public VentanaFijoComision(ActionListener action)  {
    titulo = new JLabel("ELIGE EL TIPO DE SALARIO DEL EMPLEADO");
    botonComision = new JButton("A COMISION");
    botonComision.addActionListener(action);
    botonFijo = new JButton("SALARIO FIJO");
    botonFijo.addActionListener(action);
    botones = new JPanel();

    botones.setLayout(new GridLayout(1,2));
    setLayout(null);
    setSize(510, 300);

    add(titulo);
    titulo.setBounds(150,0,510,50);
    botones.add(botonComision);
    botones.add(botonFijo);
    add(botones);
    botones.setBounds(0,50,510,220);
    setLocationRelativeTo(null);
  }

  @Override
  public void actionPerformed(ActionEvent e) {

  }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Zimagenes;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author DERICK ALEXIS
 */
public class FondoPanel extends JPanel { 
    private Image imagen; 
    public FondoPanel(String ruta) { 
        this.imagen = new ImageIcon(ruta).getImage(); 
    } 
    @Override protected void paintComponent(Graphics g) { 
        super.paintComponent(g); g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this); } 
}

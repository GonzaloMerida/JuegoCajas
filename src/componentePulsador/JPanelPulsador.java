/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentePulsador;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Gonzalo
 */
public class JPanelPulsador extends javax.swing.JPanel implements Serializable {

    private File rutaImagen;
    private boolean teclaPulsada = false;
    private static PulsadorListener pulsadorListener;

    public JPanelPulsador() {
        initComponents();
        this.setFocusable(true);
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char tecla = e.getKeyChar();
                if (Character.toLowerCase(tecla) == 'a') {
                    pulsadorListener.onTeclaPulsada();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
    }

    public File getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(File rutaImagen) {
        this.rutaImagen = rutaImagen;
        repaint();
    }

    public static PulsadorListener getPulsadorListener() {
        return pulsadorListener;
    }

    public static void setPulsadorListener(PulsadorListener pulsadorListener) {
        JPanelPulsador.pulsadorListener = pulsadorListener;
    }

    public void addPulsacionListener(PulsadorListener pulsadorListener) {
        this.pulsadorListener = pulsadorListener;
    }

    public void removePulsacionListener(PulsadorListener pulsadorListener) {
        this.pulsadorListener = null;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (rutaImagen != null && rutaImagen.exists()) {
            //Creamos un objeto imagen a partir de la ruta que nos llega
            ImageIcon imageIcon = new ImageIcon(rutaImagen.getAbsolutePath());
            //Image imagenEscalada = imageIcon.getImage().getScaledInstance(getWidth(), getHeight(), Image.SCALE_DEFAULT);
            g.drawImage(imageIcon.getImage(), 0, 0, null);
        }
    }

    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 651, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 462, Short.MAX_VALUE)
        );
    }
}

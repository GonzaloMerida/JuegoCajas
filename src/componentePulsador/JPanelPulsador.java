/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentePulsador;

import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.Serializable;
import javax.swing.JPanel;

/**
 *
 * @author Gonzalo
 */
public class JPanelPulsador extends JPanel implements Serializable {

    private File rutaImagen;
    private boolean teclaPulsada = false;
    private static PulsadorListener pulsadorListener;

    public JPanelPulsador() {
        this.addKeyListener(new KeyAdapter());
        // Asegura que el panel puede recibir eventos de teclado
        this.setFocusable(true);
    }

    public File getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(File rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    public static PulsadorListener getPulsadorListener() {
        return pulsadorListener;
    }

    public static void setPulsadorListener(PulsadorListener pulsadorListener) {
        JPanelPulsador.pulsadorListener = pulsadorListener;
    }

    private void Listener(MouseAdapter mouseAdapter) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private class KeyAdapter implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
            
        }

        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyChar() == 'p') {
                teclaPulsada = true;
                if (pulsadorListener != null) {
                    pulsadorListener.onTeclaPulsada();
                }
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
            teclaPulsada = false;
        }
    }

}

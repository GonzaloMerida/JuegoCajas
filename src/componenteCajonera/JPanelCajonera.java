/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componenteCajonera;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
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
public class JPanelCajonera extends JPanel implements Serializable {

    private File rutaImagen;
    private boolean ratonPresionado = false;
    private Point puntoPresion;
    private static ArrastreListenerHorizontal arrastreListener;

    public JPanelCajonera() {
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                ratonPresionado = true;
                puntoPresion = e.getPoint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                Point posicionActual = e.getPoint();
                if (puntoPresion.x - posicionActual.x < 50) {
                    if (arrastreListener != null) {
                        arrastreListener.arrastre();
                    }
                }
                ratonPresionado = false;
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

    public static void addArrastreListenerHorizontal(ArrastreListenerHorizontal arrastreListenerHorizontal) {
        JPanelCajonera.arrastreListener = arrastreListenerHorizontal;
    }

    public static void removeArrastreListener(ArrastreListenerHorizontal arrastreListenerHorizontal) {
        JPanelCajonera.arrastreListener = null;
    }

}

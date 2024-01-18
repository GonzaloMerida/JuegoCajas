/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componenteCaja;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Gonzalo
 */
public class JPanelCaja extends JPanel implements Serializable {

    private File rutaImagen;
    private static ArrastreListenerVertical arrastreListener;

    public JPanelCaja() {
    }

    public File getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(File rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (rutaImagen != null && rutaImagen.exists()) {
            //Creamos un objeto imagen a partir de la ruta que nos llega
            ImageIcon imageIcon = new ImageIcon(rutaImagen.getAbsolutePath());
            g.drawImage(imageIcon.getImage(), 0, 0, null);
        }
    }

    public static void addArrastreListenerVertical(ArrastreListenerVertical arrastreListenerVertical) {
        JPanelCaja.arrastreListener = arrastreListenerVertical;
    }

    public static void removeArrastreListener(ArrastreListenerVertical arrastreListenerVertical) {
        JPanelCaja.arrastreListener = null;
    }

}

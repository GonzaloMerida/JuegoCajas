/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componenteCajonera;

import java.awt.Graphics;
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
    private static ArrastreListenerHorizontal arrastreListener;

    public JPanelCajonera() {
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

    public static void addArrastreListenerVertical(ArrastreListenerHorizontal arrastreListenerVertical) {
        JPanelCajonera.arrastreListener = arrastreListenerVertical;
    }

    public static void removeArrastreListener(ArrastreListenerHorizontal arrastreListenerVertical) {
        JPanelCajonera.arrastreListener = null;
    }

}

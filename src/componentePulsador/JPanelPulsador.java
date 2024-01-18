/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentePulsador;

import java.io.File;
import java.io.Serializable;
import javax.swing.JPanel;

/**
 *
 * @author Gonzalo
 */
public class JPanelPulsador extends JPanel implements Serializable{
    private File rutaImagen;
    private static PulsadorListener pulsadorListener;

    public JPanelPulsador() {
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
    
    
}

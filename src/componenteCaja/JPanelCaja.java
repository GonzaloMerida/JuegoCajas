/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componenteCaja;

import java.awt.Image;
import java.io.File;
import java.io.Serializable;
import javax.swing.JPanel;

/**
 *
 * @author Gonzalo
 */
public class JPanelCaja extends JPanel implements Serializable {

    private File cajaAbierta = new File("src\\componenteCaja\\caja_abierta.png");
    private File cajaCerrada = new File("src\\componenteCaja\\caja_cerrada.png");
    private boolean estaAbierta = false;

    public JPanelCaja() {
    }

    public File getCajaAbierta() {
        return cajaAbierta;
    }

    public void setCajaAbierta(File cajaAbierta) {
        this.cajaAbierta = cajaAbierta;
    }

    public File getCajaCerrada() {
        return cajaCerrada;
    }

    public void setCajaCerrada(File cajaCerrada) {
        this.cajaCerrada = cajaCerrada;
    }

    public boolean isEstaAbierta() {
        return estaAbierta;
    }

    public void setEstaAbierta(boolean estaAbierta) {
        this.estaAbierta = estaAbierta;
    }
    
    
}

/*
 * ImagePanel.java
 *
 * Created on 9 de Janeiro de 2008, 19:00
 */

package br.gfca.openstereogram;

import java.awt.Graphics;
import java.awt.Image;

/**
 *
 * @author  Gustavo
 */
public class ImagePanel extends javax.swing.JPanel {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = -2756196238320814039L;
	
	private Image image;
    
    /** Creates new form BeanForm */
    public ImagePanel() {
	initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" C�digo Gerado ">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));
    }// </editor-fold>//GEN-END:initComponents

    public void setImage( Image i ) {
	this.image = i;
	this.repaint();
    }
    
    @Override
    public void paint(Graphics g) {
	super.paint(g);
	g.drawImage( this.image, 0, 0, null );
    }    
    
    // Declara��o de vari�veis - n�o modifique//GEN-BEGIN:variables
    // Fim da declara��o de vari�veis//GEN-END:variables

	protected void paintComponent(Graphics g) {
	}
    
}

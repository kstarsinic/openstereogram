/*
 * StereogramWindow.java
 *
 * Created on 9 de Janeiro de 2008, 18:47
 */

package br.gfca.openstereogram;

import java.awt.Image;

/**
 *
 * @author  Gustavo
 */
public class StereogramWindow extends javax.swing.JFrame {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = -2929272496487947728L;
	
	/** Creates new form StereogramWindow */
    public StereogramWindow( Image i ) {
	initComponents();
	this.imagePanel.setImage( i );
	this.setLocationRelativeTo( null );
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" C�digo Gerado ">//GEN-BEGIN:initComponents
    private void initComponents() {
        imagePanel = new br.gfca.openstereogram.ImagePanel();
        menuBar = new javax.swing.JMenuBar();
        imageMenu = new javax.swing.JMenu();
        saveMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        closeMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        javax.swing.GroupLayout imagePanelLayout = new javax.swing.GroupLayout(imagePanel);
        imagePanel.setLayout(imagePanelLayout);
        imagePanelLayout.setHorizontalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 649, Short.MAX_VALUE)
        );
        imagePanelLayout.setVerticalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 489, Short.MAX_VALUE)
        );

        imageMenu.setText("Image");
        saveMenuItem.setText("Save...");
        imageMenu.add(saveMenuItem);

        imageMenu.add(jSeparator1);

        closeMenuItem.setText("Close");
        imageMenu.add(closeMenuItem);

        menuBar.add(imageMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Declara��o de vari�veis - n�o modifique//GEN-BEGIN:variables
    private javax.swing.JMenuItem closeMenuItem;
    private javax.swing.JMenu imageMenu;
    private br.gfca.openstereogram.ImagePanel imagePanel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem saveMenuItem;
    // Fim da declara��o de vari�veis//GEN-END:variables
    
}

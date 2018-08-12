/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Classes.Metodos;
import javax.swing.JOptionPane;
/**
 *
 * @author danie
 */
public class InicioSeccion extends javax.swing.JFrame {

    /**
     * Creates new form InicioSeccion
     */
    public InicioSeccion() {
        initComponents();
    }

    public static String usuario = "";
    public static String nombre_profesor = "";
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        IconCerrar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rSButtonMetro1 = new rsbuttom.RSButtonMetro();
        ButtonRecuperarContraseña = new rsbuttom.RSButtonMetro();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Usuario = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        BottonRegistro = new rsbuttom.RSButtonMetro();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jPanel2.setLayout(new java.awt.BorderLayout());

        IconCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-cerrar-ventana-40.png"))); // NOI18N
        IconCerrar.setToolTipText("");
        IconCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconCerrarMouseClicked(evt);
            }
        });
        jPanel2.add(IconCerrar, java.awt.BorderLayout.EAST);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        rSButtonMetro1.setBackground(new java.awt.Color(0, 102, 102));
        rSButtonMetro1.setText("Ingresar");
        rSButtonMetro1.setColorNormal(new java.awt.Color(0, 102, 102));
        rSButtonMetro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMetro1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 7;
        gridBagConstraints.insets = new java.awt.Insets(21, 16, 17, 26);
        jPanel1.add(rSButtonMetro1, gridBagConstraints);

        ButtonRecuperarContraseña.setBackground(new java.awt.Color(0, 102, 102));
        ButtonRecuperarContraseña.setText("Recuperar Contraseña");
        ButtonRecuperarContraseña.setColorNormal(new java.awt.Color(0, 102, 102));
        ButtonRecuperarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRecuperarContraseñaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 7;
        gridBagConstraints.insets = new java.awt.Insets(0, 96, 35, 118);
        jPanel1.add(ButtonRecuperarContraseña, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Contraseña: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(15, 20, 0, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(19, 22, 1, 2);
        jPanel1.add(jLabel2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 207;
        gridBagConstraints.insets = new java.awt.Insets(19, 0, 1, 9);
        jPanel1.add(Usuario, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 201;
        gridBagConstraints.insets = new java.awt.Insets(17, 0, 7, 11);
        jPanel1.add(Password, gridBagConstraints);

        BottonRegistro.setBackground(new java.awt.Color(0, 102, 102));
        BottonRegistro.setText("Registrarce");
        BottonRegistro.setColorNormal(new java.awt.Color(0, 102, 102));
        BottonRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottonRegistroActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 7;
        gridBagConstraints.insets = new java.awt.Insets(21, 15, 17, 25);
        jPanel1.add(BottonRegistro, gridBagConstraints);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Entypo_e722(0)_280.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(-45, 0, 0, 0);
        jPanel1.add(jLabel4, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void IconCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_IconCerrarMouseClicked

    private void rSButtonMetro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMetro1ActionPerformed
        Metodos met=new Metodos();
        String direUsu="Usuario.txt";
        if (met.EncontrarUsuario(direUsu, Usuario.getText(), Password.getText(),2)) {
            usuario = Usuario.getText();
            nombre_profesor = met.EncontrarNombre(direUsu, usuario);
            Principal prin=new Principal();
            prin.setVisible(true);
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(this, "INGRESO ERRONEO", "VERIFICAR PASWORD O NICKNAME", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_rSButtonMetro1ActionPerformed

    private void BottonRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottonRegistroActionPerformed
        Registrarse r = new Registrarse();
        r.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BottonRegistroActionPerformed

    private void ButtonRecuperarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRecuperarContraseñaActionPerformed
               
    }//GEN-LAST:event_ButtonRecuperarContraseñaActionPerformed

    
    
    public static void main(String[] args) {
        InicioSeccion ini = new InicioSeccion();
        ini.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttom.RSButtonMetro BottonRegistro;
    private rsbuttom.RSButtonMetro ButtonRecuperarContraseña;
    private javax.swing.JLabel IconCerrar;
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField Usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private rsbuttom.RSButtonMetro rSButtonMetro1;
    // End of variables declaration//GEN-END:variables
}

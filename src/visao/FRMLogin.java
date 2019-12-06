/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import com.mysql.jdbc.log.Log;

import controleService.ControleLogin;
import controle.SharedP_Control;
import controleService.ControleCargo;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import modelo.CargoBEAN;
import modelo.FuncionarioBEAN;
import modelo.local.SharedPreferencesBEAN;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.Headers;
import sync.RestauranteAPI;
import sync.SyncDefault;
import visao.util.AlertDialog;
import visao.util.Carregamento;

/**
 *
 * @author Daniel
 */
public class FRMLogin extends javax.swing.JFrame {

    private ControleLogin c = new ControleLogin();
    private ControleCargo contCargo = new ControleCargo();

    /**
     * Creates new form FRMLogin2
     */
    public FRMLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
//
        comboUsuario.setModel(c.buscar(""));

        comboUsuario.grabFocus();
        comboUsuario.getEditor().getEditorComponent().addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent evt) {

                String cadenaEscrita = comboUsuario.getEditor().getItem().toString();

                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    if (comparar(cadenaEscrita)) {// compara si el texto escrito se ecuentra en la lista
                        // busca el texto escrito en la base de datos
                        c.buscar(cadenaEscrita);
                    } else if (comboUsuario.getSelectedIndex() == 0) {// en caso contrario toma como default el elemento 0 o sea el primero de la lista y lo busca.
                        comboUsuario.setSelectedIndex(0);
                    }
                }
                if (evt.getKeyCode() == KeyEvent.VK_0 || evt.getKeyCode() == KeyEvent.VK_1
                        || evt.getKeyCode() == KeyEvent.VK_2 || evt.getKeyCode() == KeyEvent.VK_3
                        || evt.getKeyCode() == KeyEvent.VK_4 || evt.getKeyCode() == KeyEvent.VK_5
                        || evt.getKeyCode() == KeyEvent.VK_6 || evt.getKeyCode() == KeyEvent.VK_7
                        || evt.getKeyCode() == KeyEvent.VK_8 || evt.getKeyCode() == KeyEvent.VK_9) {
                    try {
                        comboUsuario.setModel((ComboBoxModel<String>) c.buscar(cadenaEscrita));
                        if (comboUsuario.getItemCount() > 0) {
                            comboUsuario.getEditor().setItem(cadenaEscrita);
                            comboUsuario.showPopup();

                        } else {
                            comboUsuario.addItem(cadenaEscrita);
                        }
                    } catch (NumberFormatException ey) {
                    }
                } else if (evt.getKeyCode() >= 65 && evt.getKeyCode() <= 90 || evt.getKeyCode() >= 96 && evt.getKeyCode() <= 105 || evt.getKeyCode() == 8) {
                    comboUsuario.setModel(c.buscar(cadenaEscrita));
                    if (comboUsuario.getItemCount() > 0) {
                        comboUsuario.getEditor().setItem(cadenaEscrita);
                        comboUsuario.showPopup();

                    } else {
                        comboUsuario.addItem(cadenaEscrita);
                    }
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        comboUsuario = new javax.swing.JComboBox<>();
        jpfSenha = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnLocalizar1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/key.png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(190, 290, 40, 40);

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 51));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("LOGIN");
        jPanel2.add(jLabel21);
        jLabel21.setBounds(0, 0, 800, 28);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(190, 190, 40, 50);

        comboUsuario.setEditable(true);
        comboUsuario.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        comboUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboUsuarioActionPerformed(evt);
            }
        });
        comboUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboUsuarioKeyPressed(evt);
            }
        });
        jPanel2.add(comboUsuario);
        comboUsuario.setBounds(240, 200, 300, 40);

        jpfSenha.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jpfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpfSenhaActionPerformed(evt);
            }
        });
        jPanel2.add(jpfSenha);
        jpfSenha.setBounds(240, 300, 300, 40);

        btnLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon.png"))); // NOI18N
        btnLogin.setText("Login");
        btnLogin.setMaximumSize(new java.awt.Dimension(105, 25));
        btnLogin.setMinimumSize(new java.awt.Dimension(105, 25));
        btnLogin.setPreferredSize(new java.awt.Dimension(105, 25));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginjButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogin);
        btnLogin.setBounds(230, 380, 140, 51);

        btnLocalizar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLocalizar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/remove-symbol (2).png"))); // NOI18N
        btnLocalizar1.setText("Cancelar");
        btnLocalizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalizar1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnLocalizar1);
        btnLocalizar1.setBounds(410, 380, 140, 51);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logotipo4.jpg"))); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(0, 10, 800, 530);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 533, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginjButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginjButton6ActionPerformed

        if (!comboUsuario.getSelectedItem().equals("")) {
            if (!jpfSenha.getText().equals("")) {
                fazLogin(comboUsuario.getSelectedItem() + "", jpfSenha.getText());

            } else {
                JOptionPane.showMessageDialog(null, "Insira sua senha");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Insira um email");
        }

    }//GEN-LAST:event_btnLoginjButton6ActionPerformed

    private void btnLocalizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalizar1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnLocalizar1ActionPerformed

    private void jpfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpfSenhaActionPerformed
        btnLoginjButton6ActionPerformed(evt);
    }//GEN-LAST:event_jpfSenhaActionPerformed

    private void comboUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboUsuarioActionPerformed

    }//GEN-LAST:event_comboUsuarioActionPerformed

    private void comboUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboUsuarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jpfSenha.requestFocus();
        }
    }//GEN-LAST:event_comboUsuarioKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FRMLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRMLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRMLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRMLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRMLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLocalizar1;
    private javax.swing.JButton btnLogin;
    private javax.swing.JComboBox<String> comboUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jpfSenha;
    // End of variables declaration//GEN-END:variables
//private UJComboBox comboUsuario;
    public void tipoLogin(String cargo) {
        FRMPrincipal p = new FRMPrincipal();
        FRMPrincipalCaixa p1 = new FRMPrincipalCaixa();
        FRMPrincipalGarcom p2 = new FRMPrincipalGarcom();
        FRMPrincipalGerente p3 = new FRMPrincipalGerente();

        switch (cargo) {
            case "ADM":
                p.setVisible(true);
                break;
            case "CAIXA":
                p1.setVisible(true);
                break;
            case "GARÇOM":
                p2.setVisible(true);
                break;
            case "GERENTE":
                p3.setVisible(true);
                break;
            default:
                p2.setVisible(true);
                break;

        }
        dispose();

    }

    private boolean comparar(String cadena) {
        Object[] lista = comboUsuario.getComponents();
        boolean encontrado = false;
        for (Object object : lista) {
            if (cadena.equals(object)) {
                encontrado = true;
                break;
            }

        }
        return encontrado;
    }

    private SharedPreferencesBEAN fazLogin(String nomeUsuario, String senha) {
        Carregamento a = new Carregamento(FRMLogin.this, true);
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                a.setVisible(true);
            }
        });
        RestauranteAPI api = SyncDefault.RETROFIT_RESTAURANTE.create(RestauranteAPI.class);
        final Call<SharedPreferencesBEAN> call = api.fazLogin(nomeUsuario, senha);
        SharedPreferencesBEAN u = null;
        System.out.println("1");
        call.enqueue(new Callback<SharedPreferencesBEAN>() {
            @Override
            public void onResponse(Call<SharedPreferencesBEAN> call, Response<SharedPreferencesBEAN> response) {

                if (response.code() == 200) {
                    String auth = response.headers().get("auth");
                    if (auth.equals("1")) {
                        System.out.println("Login correto");
                        SharedPreferencesBEAN u = response.body();
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(FRMLogin.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        SwingUtilities.invokeLater(new Runnable() {
                            public void run() {
                                a.setVisible(false);
                                c.logIN(u);
                                tipoLogin(u.getFunCargo());

                            }
                        });

                    } else {
                        a.setVisible(false);
                        JOptionPane.showMessageDialog(null, "Login Incorreto");
                        System.out.println("Login incorreto");
                        // senha ou usuario incorreto

                    }
                } else {
                    a.setVisible(false);
                    JOptionPane.showMessageDialog(null, "Servidor não responde!!");

                    //servidor fora do ar
                }

            }

            @Override
            public void onFailure(Call<SharedPreferencesBEAN> call, Throwable t) {
                //Servidor fora do ar
                a.setVisible(false);
                JOptionPane.showMessageDialog(null, "Login Incorreto erro");
                System.out.println("Login incorreto");

            }
        });

        return u;

    }

}

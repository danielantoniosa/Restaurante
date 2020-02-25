/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import com.mysql.jdbc.log.Log;
import com.sun.org.apache.bcel.internal.generic.F2D;

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
import modelo.local.SharedPreferencesEmpresaBEAN;
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
public class FRMLoginEmpresa extends javax.swing.JFrame {

    private ControleLogin c = new ControleLogin();

    public FRMLoginEmpresa() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);

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
        jPanel3 = new javax.swing.JPanel();
        jpfSenha = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        lnTitulo = new javax.swing.JLabel();
        usu = new javax.swing.JLabel();
        sen = new javax.swing.JLabel();
        chekLogado = new javax.swing.JCheckBox();
        lbCadastro = new javax.swing.JLabel();
        jtfUsuario = new javax.swing.JTextField();
        lbConf = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jpfSenha.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jpfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpfSenhaActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(0, 51, 204));
        btnLogin.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.setMaximumSize(new java.awt.Dimension(105, 25));
        btnLogin.setMinimumSize(new java.awt.Dimension(105, 25));
        btnLogin.setPreferredSize(new java.awt.Dimension(105, 25));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginjButton6ActionPerformed(evt);
            }
        });

        lnTitulo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lnTitulo.setForeground(new java.awt.Color(0, 51, 102));
        lnTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lnTitulo.setText("LOGIN");

        usu.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        usu.setText("Email-Empresa:");

        sen.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        sen.setText("Senha:");

        chekLogado.setBackground(new java.awt.Color(255, 255, 255));
        chekLogado.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        chekLogado.setText("Manter-me logado");

        lbCadastro.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbCadastro.setForeground(new java.awt.Color(0, 0, 204));
        lbCadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCadastro.setText("Não possui cadastro, Clique aqui !!");
        lbCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCadastroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbCadastroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbCadastroMouseExited(evt);
            }
        });

        jtfUsuario.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jtfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lnTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(sen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jpfSenha)
                                .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chekLogado, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                                .addComponent(usu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lnTitulo)
                .addGap(60, 60, 60)
                .addComponent(usu)
                .addGap(4, 4, 4)
                .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(chekLogado)
                .addGap(47, 47, 47)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(lbCadastro)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        lbConf.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbConf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/gear.png"))); // NOI18N
        lbConf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbConfMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbConfMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1300, 1300, 1300)
                        .addComponent(lbConf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(435, 435, 435)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(435, 435, 435)))
                .addGap(2, 2, 2))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lbConf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jpfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpfSenhaActionPerformed
        btnLoginjButton6ActionPerformed(evt);
    }//GEN-LAST:event_jpfSenhaActionPerformed

    private void btnLoginjButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginjButton6ActionPerformed
        if (!jtfUsuario.getText().equals("")) {
            if (!jpfSenha.getText().equals("")) {
                fazLogin(jtfUsuario.getText() + "", jpfSenha.getText());
            } else {
                JOptionPane.showMessageDialog(null, "Insira sua senha");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Insira um email");
        }
    }//GEN-LAST:event_btnLoginjButton6ActionPerformed

    private void lbCadastroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCadastroMouseEntered
        lbCadastro.setForeground(Color.BLACK);
    }//GEN-LAST:event_lbCadastroMouseEntered

    private void lbCadastroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCadastroMouseExited
        lbCadastro.setForeground(new Color(0, 0, 204));
    }//GEN-LAST:event_lbCadastroMouseExited

    private void lbConfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbConfMouseEntered
        lbConf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/gearF.png")));
    }//GEN-LAST:event_lbConfMouseEntered

    private void lbConfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbConfMouseExited
        lbConf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/gear.png")));
    }//GEN-LAST:event_lbConfMouseExited

    private void lbCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCadastroMouseClicked
        //  mudar para cadastro de empresa
        FRMPreEmpresa e = new FRMPreEmpresa();
        e.setVisible(true);
    }//GEN-LAST:event_lbCadastroMouseClicked

    private void jtfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfUsuarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {

                new FRMLoginEmpresa().setVisible(true);

            }
        }
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JCheckBox chekLogado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jpfSenha;
    private javax.swing.JTextField jtfUsuario;
    private javax.swing.JLabel lbCadastro;
    private javax.swing.JLabel lbConf;
    private javax.swing.JLabel lnTitulo;
    private javax.swing.JLabel sen;
    private javax.swing.JLabel usu;
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
        Object[] lista = jtfUsuario.getComponents();
        boolean encontrado = false;
        for (Object object : lista) {
            if (cadena.equals(object)) {
                encontrado = true;
                break;
            }

        }
        return encontrado;
    }

    private SharedPreferencesEmpresaBEAN fazLogin(String nomeUsuario, String senha) {
        Carregamento a = new Carregamento(FRMLoginEmpresa.this, true);
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                a.setVisible(true);
            }
        });
        RestauranteAPI api = SyncDefault.RETROFIT_RESTAURANTE.create(RestauranteAPI.class
        );
        final Call<SharedPreferencesEmpresaBEAN> call = api.fazLoginEmpresa(nomeUsuario, senha);
        SharedPreferencesEmpresaBEAN u = null;
        System.out.println("1");
        call.enqueue(new Callback<SharedPreferencesEmpresaBEAN>() {
            @Override
            public void onResponse(Call<SharedPreferencesEmpresaBEAN> call, Response<SharedPreferencesEmpresaBEAN> response) {
                if (response.code() == 200) {
                    String auth = response.headers().get("auth");
                    if (auth.equals("1")) {
                        System.out.println("Login correto");
                        SharedPreferencesEmpresaBEAN u = response.body();
                        SwingUtilities.invokeLater(new Runnable() {
                            public void run() {
                                a.setVisible(false);
                                if (u != null) {
                                    if (chekLogado.isSelected()) {
                                        c.logEmpresa(u);
                                    }
                                    FRMLogin l = new FRMLogin();
                                    l.setVisible(true);
                                    dispose();
                                } else {
                                    JOptionPane.showMessageDialog(null, "Login Invalido");
                                }

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
            public void onFailure(Call<SharedPreferencesEmpresaBEAN> call, Throwable t) {
                //Servidor fora do ar
                a.setVisible(false);
                JOptionPane.showMessageDialog(null, "Login Incorreto erro");
                System.out.println("Login incorreto");

            }
        });

        return u;

    }

}

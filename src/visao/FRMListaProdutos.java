/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.PedidoControle;
import controle.ProdutoControle;
import controle.VendaControle;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import modelo.Produtos;
import modelo.ProdutosGravados;
import modelo.VendaAtualBEAN;

/**
 *
 * @author Daniel
 */
public class FRMListaProdutos extends javax.swing.JFrame {

    private DefaultTableModel dTable;
    private TableRowSorter<TableModel> tr;
    private PedidoControle p = new PedidoControle();
    private VendaControle controle = new VendaControle();

    /**
     * Creates new form FRMListaProdutos
     */
    public FRMListaProdutos() {
        initComponents();

        setLocationRelativeTo(null);

        comboProduto.grabFocus();
        comboProduto.getEditor().getEditorComponent().addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent evt) {

                String cadenaEscrita = comboProduto.getEditor().getItem().toString();

                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    botaoPesquisar.hasFocus();
                }
                if (evt.getKeyCode() == KeyEvent.VK_0 || evt.getKeyCode() == KeyEvent.VK_1
                        || evt.getKeyCode() == KeyEvent.VK_2 || evt.getKeyCode() == KeyEvent.VK_3
                        || evt.getKeyCode() == KeyEvent.VK_4 || evt.getKeyCode() == KeyEvent.VK_5
                        || evt.getKeyCode() == KeyEvent.VK_6 || evt.getKeyCode() == KeyEvent.VK_7
                        || evt.getKeyCode() == KeyEvent.VK_8 || evt.getKeyCode() == KeyEvent.VK_9) {
                    try {
                        comboProduto.setModel((ComboBoxModel<String>) p.buscar(Integer.parseInt(cadenaEscrita)));
                        System.out.println("entrou");
                        if (comboProduto.getItemCount() > 0) {
                            comboProduto.getEditor().setItem(cadenaEscrita);
                            comboProduto.showPopup();

                        } else {
                            comboProduto.addItem(cadenaEscrita);
                        }
                    } catch (NumberFormatException ey) {
                    }
                } else if (evt.getKeyCode() >= 65 && evt.getKeyCode() <= 90 || evt.getKeyCode() >= 96 && evt.getKeyCode() <= 105 || evt.getKeyCode() == 8) {
                    comboProduto.setModel(p.buscar(cadenaEscrita));
                    if (comboProduto.getItemCount() > 0) {
                        comboProduto.getEditor().setItem(cadenaEscrita);
                        comboProduto.showPopup();

                    } else {
                        comboProduto.addItem(cadenaEscrita);
                    }
                }
            }
        });
        
    }

    public void atualizaProdutos() {
        preencheTabelaProdutos(controle.listarProdutosMesa(labMesa.getText()));
        atualizaProdutosNImpressos();
    }

    private boolean comparar(String cadena) {
        Object[] lista = comboProduto.getComponents();
        boolean encontrado = false;
        for (Object object : lista) {
            if (cadena.equals(object)) {
                encontrado = true;
                break;
            }

        }
        return encontrado;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel12 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        labMesa = new javax.swing.JLabel();
        labMesa1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        botaoPesquisar = new javax.swing.JButton();
        comboProduto = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaProdutosNImpressos = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jtfMesaDestino = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabelaProdutosE = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        taMotivo = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel12.setBackground(new java.awt.Color(255, 153, 0));

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel40.setText("Mesa:");

        labMesa.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        labMesa1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labMesa1.setText("N°");

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/remove-symbol (2).png"))); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel40)
                .addGap(41, 41, 41)
                .addComponent(labMesa1)
                .addGap(18, 18, 18)
                .addComponent(labMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(labMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labMesa1))
                .addGap(0, 24, Short.MAX_VALUE))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTabbedPane1.setInheritsPopupMenu(true);
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/reltorio.png"))); // NOI18N
        jButton1.setText("Imprimir");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 11))); // NOI18N

        botaoPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/loupe.png"))); // NOI18N
        botaoPesquisar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                botaoPesquisarFocusGained(evt);
            }
        });
        botaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarActionPerformed(evt);
            }
        });

        comboProduto.setEditable(true);
        comboProduto.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        comboProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Produtos não impressos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 11))); // NOI18N

        jScrollPane1.setViewportView(listaProdutosNImpressos);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 247, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Adicionar", jPanel2);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Produtos"));

        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pedido", "Cod Produto", "Nome", "Quantidade", "Valor", "Hora"
            }
        ));
        jScrollPane5.setViewportView(tabelaProdutos);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 403, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mesa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 11))); // NOI18N

        jtfMesaDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfMesaDestinoActionPerformed(evt);
            }
        });
        jtfMesaDestino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfMesaDestinoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtfMesaDestino)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtfMesaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jButton5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton5.setText("GRAVAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 44, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jTabbedPane1.addTab("Transferir", jPanel3);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Produtos"));

        tabelaProdutosE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "Quantidade", "Valor", "Hora"
            }
        ));
        jScrollPane6.setViewportView(tabelaProdutosE);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 403, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Motivo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 11))); // NOI18N

        taMotivo.setColumns(20);
        taMotivo.setRows(5);
        taMotivo.setAutoscrolls(false);
        jScrollPane4.setViewportView(taMotivo);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton4.setText("GRAVAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        jTabbedPane1.addTab("Excluir", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarActionPerformed
        Produtos pro = p.buscarUm(comboProduto.getSelectedItem() + "");
        if (pro != null) {
            FRMRealizarVenda r = new FRMRealizarVenda();
            r.setProdutos(pro);            
            r.setDados(labMesa.getText() + "");
            r.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "NÃO encontrado!!");
        }
    }//GEN-LAST:event_botaoPesquisarActionPerformed

    private void comboProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProdutoActionPerformed

    }//GEN-LAST:event_comboProdutoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jtfMesaDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfMesaDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfMesaDestinoActionPerformed

    private void botaoPesquisarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_botaoPesquisarFocusGained
        // atualizaProdutosNImpressos();
    }//GEN-LAST:event_botaoPesquisarFocusGained

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        atualizaProdutos();
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        if (!jtfMesaDestino.getText().equals("")) {
            if (tabelaProdutos.isBackgroundSet()) {
                int produto = Integer.parseInt(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 1) + "");
                String time = tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 5) + "";
                controle.transferirProduto(Integer.parseInt(labMesa.getText()), Integer.parseInt(jtfMesaDestino.getText()), produto, time);
                atualizaProdutos();
            } else {
                JOptionPane.showMessageDialog(null, "Selecione um produto!!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Insira uma mesa de Destino!!");
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jtfMesaDestinoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfMesaDestinoKeyTyped
        String caracteres = "987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_jtfMesaDestinoKeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (!taMotivo.getText().equals("")) {
            if (tabelaProdutosE.isBackgroundSet()) {
                int produto = Integer.parseInt(tabelaProdutosE.getValueAt(tabelaProdutosE.getSelectedRow(), 1) + "");
                String time = tabelaProdutosE.getValueAt(tabelaProdutosE.getSelectedRow(), 5) + "";
                controle.excluirProduto(Integer.parseInt(labMesa.getText()), taMotivo.getText(), produto, time);
                atualizaProdutos();
                JOptionPane.showMessageDialog(null, "Produto Excluido!!");
            } else {
                JOptionPane.showMessageDialog(null, "Selecione um produto!!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Insira uma justificativa!!");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(FRMListaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRMListaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRMListaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRMListaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRMListaProdutos().setVisible(true);
                
            }
        });
        
    }

    public void setDados(String mesa) {
        labMesa.setText(mesa);
        atualizaProdutosNImpressos();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoPesquisar;
    private javax.swing.JComboBox<String> comboProduto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jtfMesaDestino;
    private javax.swing.JLabel labMesa;
    private javax.swing.JLabel labMesa1;
    private javax.swing.JList<String> listaProdutosNImpressos;
    private javax.swing.JTextArea taMotivo;
    private javax.swing.JTable tabelaProdutos;
    private javax.swing.JTable tabelaProdutosE;
    // End of variables declaration//GEN-END:variables

    private void atualizaProdutosNImpressos() {
        DefaultListModel modelo = new DefaultListModel();

        ArrayList<ProdutosGravados> pni = controle.getProdutosNImpressos(Integer.parseInt(labMesa.getText()));
        if (pni.size() > 0) {
            for (ProdutosGravados p : pni) {
                modelo.addElement(p.getCodProduto() + " : " + p.getNome() + " Hora:  " + p.getTime() + ", Quantidade " + p.getQuantidade() + ", R$" + p.getValor());
            }
            listaProdutosNImpressos.setModel(modelo);
        }
    }

    private DefaultTableModel criaTabelaProdutos() {
        //sempre que usar JTable é necessário ter um DefaulttableModel
        DefaultTableModel dTable = new DefaultTableModel() {
            //Define o tipo dos campos (coluna) na mesma ordem que as colunas foram criadas
            Class[] types = new Class[]{
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            //define se os campos podem ser editados na propria tabela
            boolean[] canEdit = new boolean[]{
                false, false, false
            };

            /*@Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }*/
        ;

        };
        //retorna o DefaultTableModel
    return dTable;
    }

    private void preencheTabelaProdutos(ArrayList<ProdutosGravados> dados) {
        dTable = criaTabelaProdutos();
        //seta o nome das colunas da tabela
        dTable.addColumn("Pedido");
        dTable.addColumn("Cod Produto");
        dTable.addColumn("Nome");
        dTable.addColumn("Quantidade");
        dTable.addColumn("Valor");
        dTable.addColumn("Hora");

        //pega os dados do ArrayList
        //cada célula do arrayList vira uma linha(row) na tabela
        for (ProdutosGravados dado : dados) {
            dTable.addRow(new Object[]{dado.getCodPedidVenda(), dado.getCodProduto(), dado.getNome(),
                dado.getQuantidade(), dado.getValor(), dado.getTime()});
        }
        //set o modelo da tabela
        tabelaProdutos.setModel(dTable);
        tabelaProdutosE.setModel(dTable);
        tr = new TableRowSorter<TableModel>(dTable);
        tabelaProdutos.setRowSorter(tr);
        tabelaProdutosE.setRowSorter(tr);

    }
}

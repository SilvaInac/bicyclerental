/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadorabike.view;

import locadorabike.controller.buscaDAO;
import locadorabike.model.Bicicleta;
import locadorabike.model.Franquia;
import locadorabike.model.Usuario;

/**
 *
 * @author Cap
 */
public class Locar extends javax.swing.JFrame {

    /**
     * Creates new form Locar
     */
    buscaDAO buscas = new buscaDAO();
    public Locar() {
        initComponents();
        for(Franquia fra: buscas.buscarFranquiaSemFiltro()){
            escolha1.addItem(fra);
            escolha2.addItem(fra);
        }
    }
    Usuario atualuser = new Usuario();
    public Locar(Usuario user) {
        atualuser.setCpf(user.getCpf());
        atualuser.setTelefone(user.getTelefone());
        atualuser.setAdm(user.isAdm());
        atualuser.setEndereco(user.getEndereco());
        atualuser.setNome(user.getNome());
        atualuser.setSenha(user.getSenha());
        initComponents();
        for(Franquia fra: buscas.buscarFranquiaSemFiltro()){
            escolha1.addItem(fra);
            escolha2.addItem(fra);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        leg1 = new javax.swing.JLabel();
        escolha1 = new javax.swing.JComboBox<>();
        leg2 = new javax.swing.JLabel();
        escolha2 = new javax.swing.JComboBox<>();
        leg3 = new javax.swing.JLabel();
        bike = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        modelo = new javax.swing.JLabel();
        aro = new javax.swing.JLabel();
        cor = new javax.swing.JLabel();
        leg5 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        acessorio = new javax.swing.JComboBox<>();
        corcap = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tamanhocap = new javax.swing.JLabel();
        logout1 = new javax.swing.JLabel();
        leg6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        leg7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        logout2 = new javax.swing.JLabel();
        leg4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cor3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        modelo2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        aro2 = new javax.swing.JLabel();
        cor4 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        leg8 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        corcap1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        tamanhocap1 = new javax.swing.JLabel();
        corcap2 = new javax.swing.JLabel();
        devolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        leg1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        leg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        leg1.setText("SAIDA:");
        jPanel2.add(leg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 80, 30));

        escolha1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                escolha1ItemStateChanged(evt);
            }
        });
        escolha1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                escolha1PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                escolha1PopupMenuWillBecomeVisible(evt);
            }
        });
        jPanel2.add(escolha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 280, 30));

        leg2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        leg2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        leg2.setText("DESTINO:");
        jPanel2.add(leg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 80, 30));

        escolha2.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                escolha2PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jPanel2.add(escolha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 280, 30));

        leg3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        leg3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        leg3.setText("ESCOLHA A BIKE QUE VOCÊ DESEJA");
        jPanel2.add(leg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 372, 30));

        bike.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                bikeItemStateChanged(evt);
            }
        });
        bike.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                bikePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jPanel2.add(bike, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 100, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BIKE:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 70, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MODELO:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 100, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("COR:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 60, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ARO:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 80, 30));

        modelo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        modelo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 110, 30));

        aro.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        aro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(aro, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 100, 30));

        cor.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(cor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 100, 30));

        leg5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        leg5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        leg5.setText("ESCOLHA A DATA DE:");
        jPanel2.add(leg5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 372, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ACESSÓRIO:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 100, 30));

        acessorio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(acessorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 266, 30));

        corcap.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        corcap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(corcap, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 90, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("COR CAP.:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 100, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("TAMANHO:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 80, 30));

        tamanhocap.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tamanhocap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(tamanhocap, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 80, 30));

        logout1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        logout1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/locadorabike/view/imagens/volta_30x30.png"))); // NOI18N
        logout1.setText("VOLTAR");
        logout1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout1MouseClicked(evt);
            }
        });
        jPanel2.add(logout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        leg6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        leg6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        leg6.setText("ESCOLHA A FRANQUIA DE:");
        jPanel2.add(leg6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 200, 30));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/locadorabike/view/imagens/locar1_30x30.png"))); // NOI18N
        jButton1.setText("LOCAR");
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 170, 40));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("SAÍDA:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 90, 30));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("DEVOLUÇÃO:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 110, 30));

        leg7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        leg7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        leg7.setText("ESCOLHA O ACESSÓRIO QUE VOCÊ DESEJA");
        jPanel2.add(leg7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 372, 30));

        jTabbedPane1.addTab("LOCAR", jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logout2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        logout2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logout2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/locadorabike/view/imagens/volta_30x30.png"))); // NOI18N
        logout2.setText("VOLTAR");
        logout2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout2MouseClicked(evt);
            }
        });
        jPanel3.add(logout2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        leg4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        leg4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        leg4.setText("BIKE ESCOLHIDA:");
        jPanel3.add(leg4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 372, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("BIKE:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 70, 30));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("COR:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 70, 30));

        cor3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cor3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(cor3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 100, 30));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("MODELO:");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 100, 30));

        modelo2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        modelo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(modelo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 110, 30));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("ARO:");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 100, 30));

        aro2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        aro2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(aro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 110, 30));

        cor4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cor4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(cor4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 100, 30));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("ACESSÓRIO:");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 100, 30));

        leg8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        leg8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        leg8.setText("ACESSÓRIO ESCOLHIDO:");
        jPanel3.add(leg8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 372, 30));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("COR CAP.:");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 100, 30));

        corcap1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        corcap1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(corcap1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 260, 30));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("TAMANHO:");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 80, 30));

        tamanhocap1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tamanhocap1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(tamanhocap1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 80, 30));

        corcap2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        corcap2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(corcap2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 90, 30));

        devolver.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        devolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/locadorabike/view/imagens/devolver_30x30.png"))); // NOI18N
        devolver.setText("DEVOLVER");
        jPanel3.add(devolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 170, 40));

        jTabbedPane1.addTab("MINHAS LOCAÇÕES", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(400, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logout1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout1MouseClicked
        // TODO add your handling code here:
        menuprincipal menu = new menuprincipal(atualuser);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logout1MouseClicked

    private void logout2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout2MouseClicked
        // TODO add your handling code here:
        menuprincipal menu = new menuprincipal(atualuser);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logout2MouseClicked

    private void escolha1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_escolha1ItemStateChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_escolha1ItemStateChanged

    private void bikeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_bikeItemStateChanged
        // TODO add your handling code here:
        //função aberta errada
    }//GEN-LAST:event_bikeItemStateChanged

    private void escolha2PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_escolha2PopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        //função aberta errada
    }//GEN-LAST:event_escolha2PopupMenuWillBecomeInvisible

    private void escolha1PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_escolha1PopupMenuWillBecomeVisible
        // TODO add your handling code here:
        bike.removeAllItems();
    }//GEN-LAST:event_escolha1PopupMenuWillBecomeVisible

    private void escolha1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_escolha1PopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        Franquia frq = (Franquia) escolha1.getSelectedItem();
        Bicicleta biciaux = new Bicicleta();
        if(buscas.buscarBikePorFranquia(frq.getCnpj()) != null){
            for(Bicicleta bici: buscas.buscarBikePorFranquia(frq.getCnpj())){
                bike.addItem(bici);
                System.out.println(bici.getCor());
            }
        }
    }//GEN-LAST:event_escolha1PopupMenuWillBecomeInvisible

    private void bikePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_bikePopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        Bicicleta bici = (Bicicleta) bike.getSelectedItem();
        if(bici == null){
            modelo.setText("");
            System.out.println("");
            cor.setText("");
            aro.setText("");
        }
        else{
            modelo.setText(bici.getModelo());
            System.out.println(bici.getCor());
            cor.setText(bici.getCor());
            aro.setText(Integer.toString(bici.getAro()));
        }
    }//GEN-LAST:event_bikePopupMenuWillBecomeInvisible

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
            java.util.logging.Logger.getLogger(Locar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Locar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Locar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Locar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Locar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> acessorio;
    private javax.swing.JLabel aro;
    private javax.swing.JLabel aro2;
    private javax.swing.JComboBox<Object> bike;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel cor;
    private javax.swing.JLabel cor3;
    private javax.swing.JLabel cor4;
    private javax.swing.JLabel corcap;
    private javax.swing.JLabel corcap1;
    private javax.swing.JLabel corcap2;
    private javax.swing.JButton devolver;
    private javax.swing.JComboBox<Object> escolha1;
    private javax.swing.JComboBox<Object> escolha2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel leg1;
    private javax.swing.JLabel leg2;
    private javax.swing.JLabel leg3;
    private javax.swing.JLabel leg4;
    private javax.swing.JLabel leg5;
    private javax.swing.JLabel leg6;
    private javax.swing.JLabel leg7;
    private javax.swing.JLabel leg8;
    private javax.swing.JLabel logout1;
    private javax.swing.JLabel logout2;
    private javax.swing.JLabel modelo;
    private javax.swing.JLabel modelo2;
    private javax.swing.JLabel tamanhocap;
    private javax.swing.JLabel tamanhocap1;
    // End of variables declaration//GEN-END:variables
}

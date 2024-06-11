/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package com.FrameEdit;

import com.FrameAdmin.FrameAdmin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class FrameEdit extends javax.swing.JFrame {
    private String id_motor;
    
    public FrameEdit(String id) {
        initComponents();
        this.id_motor = id;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        txtBrand = new javax.swing.JComboBox<>();
        btnedit = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        btnkembali = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(40, 42, 54));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(145, 125, 247));

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 38)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nebula Motosports");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel1)
                .addContainerGap(408, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 80));

        txtHarga.setBackground(new java.awt.Color(51, 51, 51));
        txtHarga.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txtHarga.setForeground(new java.awt.Color(255, 255, 255));
        txtHarga.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(145, 125, 247), 2, true), "Harga Motor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins SemiBold", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(txtHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 450, -1));

        txtnama.setBackground(new java.awt.Color(51, 51, 51));
        txtnama.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txtnama.setForeground(new java.awt.Color(255, 255, 255));
        txtnama.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(145, 125, 247), 2, true), "Tipe Motor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins SemiBold", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });
        jPanel1.add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 450, -1));

        txtBrand.setBackground(new java.awt.Color(51, 51, 51));
        txtBrand.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txtBrand.setForeground(new java.awt.Color(255, 255, 255));
        txtBrand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Honda", "Yamaha", "Suzuki", "Kawasaki", "Ducati", "Aprilia", "KTM" }));
        txtBrand.setToolTipText("");
        txtBrand.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(145, 125, 247), 2, true), "Brand Motor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins SemiBold", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(txtBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 450, 50));

        btnedit.setBackground(new java.awt.Color(145, 125, 247));
        btnedit.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        btnedit.setForeground(new java.awt.Color(255, 255, 255));
        btnedit.setText("Edit");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });
        jPanel1.add(btnedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 90, 30));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Bensin");
        jRadioButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255), 2));
        jRadioButton1.setOpaque(false);
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, 30));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Listrik");
        jRadioButton2.setOpaque(false);
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, -1, 30));

        jLabel2.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bahan Bakar");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        btnkembali.setBackground(new java.awt.Color(145, 125, 247));
        btnkembali.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        btnkembali.setForeground(new java.awt.Color(255, 255, 255));
        btnkembali.setText("Kembali");
        btnkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkembaliActionPerformed(evt);
            }
        });
        jPanel1.add(btnkembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 90, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        String nama = txtnama.getText().trim();
        String harga = txtHarga.getText().trim();
        String bahan = "";
        String brand = (String) txtBrand.getSelectedItem();
        
        if (jRadioButton1.isSelected()){
            bahan = jRadioButton1.getText().trim();
        } else {
             bahan = jRadioButton2.getText().trim();
        }
       
        if (nama.isEmpty() || harga.isEmpty() || buttonGroup1.getSelection() == null || brand == null) {
            JOptionPane.showMessageDialog(this, "Semua field harus diisi", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            int hargaInt = Integer.parseInt(harga);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Harga harus berupa angka !", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Connection con = null;
        PreparedStatement pst = null;

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbnebulamotor", "root", "");
            String query = "UPDATE tbmotor SET tipe = ?, merk = ?,  harga = ?, jenis = ? WHERE id_motor = ?";
            pst = con.prepareStatement(query);
            pst.setString(1, nama);
            pst.setString(2, brand);
            pst.setString(3, harga);
            pst.setString(4, bahan);
            pst.setString(5, id_motor);
            
            int rowsUpdated = pst.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Data berhasil diperbarui", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Data tidak ditemukan", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error closing resources: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btneditActionPerformed

    private void btnkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkembaliActionPerformed
        FrameAdmin admin = new FrameAdmin();
        admin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnkembaliActionPerformed

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnkembali;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JComboBox<String> txtBrand;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtnama;
    // End of variables declaration//GEN-END:variables
}

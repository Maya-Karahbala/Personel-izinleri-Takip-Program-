/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonelPaketi;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author scramblebit
 */
public class frmPersonelEkle extends javax.swing.JFrame {

    DefaultTableModel dtm = new DefaultTableModel();
     Date date = new Date();
    public List<Personel> personeller;

    /**
     * Creates new form frmPersonelEkle
     */
    public frmPersonelEkle() {
        initComponents();

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersonelIzinTakipiAppDatatbasePU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT p FROM Personel p");
        personeller = q.getResultList();
        int id = 0;
        for (Personel person : personeller) {
            if (person.getId() > id) {
                id = person.getId();
            }
        }
        lblId.setText(String.valueOf(++id));
        jTable1.setModel(dtm);
        dtm.setColumnIdentifiers(new Object[]{"id", "Adi", "Soyadi", "Tc kimlik No", "cinsiyet","giris tarihi","maas","calisma suresi","yillik izin"});
        personelleriYazdir();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtAd = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSoyad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTelefon = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtMaas = new javax.swing.JTextField();
        RadioErkek = new javax.swing.JRadioButton();
        RadioKadin = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        btnEkle = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Personel Ekle");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Ad");

        txtAd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdActionPerformed(evt);
            }
        });

        jLabel2.setText("Soyad");

        txtSoyad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoyadActionPerformed(evt);
            }
        });

        jLabel3.setText("TC  No");

        txtTc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTcActionPerformed(evt);
            }
        });

        jLabel4.setText(" Giris Tarihi");

        jLabel5.setText("Telefon No");

        txtTelefon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonActionPerformed(evt);
            }
        });

        jLabel6.setText("Cinsiyet");

        jLabel7.setText("gun ");

        jLabel8.setText("ay");

        jLabel9.setText("yıl");

        jLabel10.setText("id");

        txtMaas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaasActionPerformed(evt);
            }
        });

        buttonGroup1.add(RadioErkek);
        RadioErkek.setText("Erkek");

        buttonGroup1.add(RadioKadin);
        RadioKadin.setSelected(true);
        RadioKadin.setText("Kadın");

        jLabel13.setText("Maaş");

        btnEkle.setText("Yenı Personel Ekle");
        btnEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEkleActionPerformed(evt);
            }
        });

        jButton2.setText("geri dön");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnClear.setText("clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jDateChooser1.setDateFormatString("dd-MM-yyyy");

        jLabel14.setText("gg-aa-yyyy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAd))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSoyad))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTc)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefon)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaas, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(RadioErkek)
                                        .addGap(68, 68, 68)
                                        .addComponent(RadioKadin)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEkle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jLabel14)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RadioErkek)
                    .addComponent(RadioKadin))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnEkle)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(btnClear))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdActionPerformed

    private void txtSoyadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoyadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoyadActionPerformed

    private void txtTcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTcActionPerformed

    private void txtTelefonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonActionPerformed

    private void txtMaasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaasActionPerformed

    private void btnEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEkleActionPerformed
        boolean sonucTc = true;
        boolean sonuc,sonuc2=true;
       if(txtAd.getText().equals("")||txtTc.getText().equals("")||txtSoyad.getText().equals("")||txtTelefon.getText().equals("")
           ||txtMaas.getText().equals("")||jDateChooser1.getDate().equals(null)    ){
           sonuc2=false;
       }
        
        if (RadioErkek.isSelected()) {
            sonuc = false;
        } else {
            sonuc = true;
        }
         boolean ayniBilgiler = true;
        for (Personel person : personeller) {
//            if (person.getAdi().equals(txtAd.getText())
//                    && person.getSoyadi().equals(txtSoyad.getText()) && txtTc.getText().equals(String.valueOf(person.getTcNo()))) {
//                if (person.getGirisTarihi().equals(jDateChooser1.getDate()) && txtTelefon.getText().equals(String.valueOf(person.getTelefonNo()))
//                        && person.getCinsiyet().equals(sonuc) && txtMaas.getText().equals(String.valueOf(person.getMaas()))) {
//                    ayniBilgiler = false;
//                    break;
//                }
//            } else 
             if (txtTc.getText().equals(String.valueOf(person.getTcNo()))) {

                sonucTc = false;
                break;
            }
            
        }
        
         if (sonucTc==sonuc2==true) {
                if (jDateChooser1.getDate().after(date)){
           JOptionPane.showMessageDialog(null, "girdiginiz tarihe dikkat edin"); 
        }
            //constructur kullanilmali
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersonelIzinTakipiAppDatatbasePU");
            EntityManager em = emf.createEntityManager();
            Personel yeniPersonel = new Personel();
            try{
            yeniPersonel.setId(Integer.valueOf(lblId.getText()));
            yeniPersonel.setAdi(txtAd.getText());
            yeniPersonel.setSoyadi(txtSoyad.getText());
            yeniPersonel.setTcNo(Integer.valueOf(txtTc.getText()));
            yeniPersonel.setTelefonNo(Integer.valueOf(txtTelefon.getText()));
            yeniPersonel.setCinsiyet(sonuc);
            yeniPersonel.setMaas(Integer.parseInt(txtMaas.getText()));
            yeniPersonel.setGirisTarihi(jDateChooser1.getDate());
            yeniPersonel.setCalismaSuresi(getCalismaSuresi());
            yeniPersonel.setYillikIzin(YilikIzinHesapla());
            yeniPersonel.setKullanilanIzin(0);
            yeniPersonel.setKalanIzin(YilikIzinHesapla());
            yeniPersonel.setKullanilanSaat(0);
            yeniPersonel.setKalanSaat(0);
            
            em.getTransaction().begin();
            em.persist(yeniPersonel);
            em.getTransaction().commit();
             em.close();
            emf.close();
            personelleriYazdir();
            clear();}
            catch(NumberFormatException ex){
              JOptionPane.showMessageDialog(null, "girdiginiz bilgilere dikkat ediniz");  
            }

           

        } else if (!sonucTc) {
            JOptionPane.showMessageDialog(null, "aynı tc kimlik nolu personel bulundu");
        }
//       
//    
//      

    }//GEN-LAST:event_btnEkleActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        new frm_personelIslemleri().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked


    }//GEN-LAST:event_jTable1MouseClicked
    public void personelleriYazdir() {
        dtm.setRowCount(0);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersonelIzinTakipiAppDatatbasePU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT p FROM Personel p");
        personeller = q.getResultList();
        for (Personel person : personeller) {
             DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            String gun=dateFormat.format(person.getGirisTarihi());
            dtm.addRow(new Object[]{person.getId(), person.getAdi(), person.getSoyadi(), person.getTcNo(), person.getCinsiyet()
            ,gun,person.getMaas(),person.getCalismaSuresi(),person.getYillikIzin()});
        }

    }

    public void clear() {
        txtAd.setText("");
        txtSoyad.setText("");
        txtTc.setText("");
        txtTelefon.setText("");
        txtMaas.setText("");
        jDateChooser1.setDate(null);
        int id = 0;
        for (Personel person : personeller) {
            if (person.getId() > id) {
                id = person.getId();
            }
        }
        lblId.setText(String.valueOf(++id));

    }

    /**
     * @param args the command line arguments
     */
    public final int getCalismaSuresi() {

       

        long diffInMillies = date.getTime() - jDateChooser1.getDate().getTime();

        int calismaSuresi = Integer.valueOf(String.valueOf(diffInMillies / (1000 * 60 * 60 * 24)));//kidem hesplama

        return calismaSuresi;

    }

    public final int YilikIzinHesapla() {
        int yillikIzin = 0;

        if (getCalismaSuresi() < 1 * 365) {
            yillikIzin = 0;
        } else if (getCalismaSuresi() < 6 * 365) {
            yillikIzin = 14;
        } else if (getCalismaSuresi() < 15 * 365) {
            yillikIzin = 20;
        }
        else  {
            yillikIzin = 24;
        }

        return yillikIzin;
    }

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
            java.util.logging.Logger.getLogger(frmPersonelEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPersonelEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPersonelEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPersonelEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPersonelEkle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RadioErkek;
    private javax.swing.JRadioButton RadioKadin;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnEkle;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblId;
    private javax.swing.JTextField txtAd;
    private javax.swing.JTextField txtMaas;
    private javax.swing.JTextField txtSoyad;
    private javax.swing.JTextField txtTc;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stripbandunk.alexvariasi.view.impl;

import com.stripbandunk.alexvariasi.entity.master.Pelanggan;
import com.stripbandunk.alexvariasi.entity.transaction.DetailPenjualan;
import com.stripbandunk.alexvariasi.entity.transaction.Penjualan;
import com.stripbandunk.alexvariasi.manager.LoginManager;
import com.stripbandunk.alexvariasi.manager.SpringManager;
import com.stripbandunk.alexvariasi.service.PelangganService;
import com.stripbandunk.alexvariasi.service.PenjualanService;
import com.stripbandunk.alexvariasi.view.DialogView;
import com.stripbandunk.alexvariasi.view.FormApp;
import com.stripbandunk.jglasspane.JGlassPane;
import com.stripbandunk.jglasspane.component.MessageComponent;
import com.stripbandunk.jwidget.JDynamicTable;
import com.stripbandunk.jwidget.model.DynamicTableModel;
import java.awt.Font;
import java.awt.Window;
import java.util.Date;
import java.util.Locale;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import org.springframework.format.number.CurrencyFormatter;

/**
 *
 * @author echo
 */
public class TambahPenjualanView extends DialogView {

    private DynamicTableModel<DetailPenjualan> dynamicTableModel;

    private JDynamicTable jDynamicTable;

    private JGlassPane jGlassPane;

    private MessageComponent messageComponent;

    private long total;

    public TambahPenjualanView(FormApp formApp) {
        super(formApp);
        initComponents();

        dynamicTableModel = new DynamicTableModel<>(DetailPenjualan.class);
        jDynamicTable = new JDynamicTable(dynamicTableModel);
        jScrollPane1.setViewportView(jDynamicTable);

        jGlassPane = new JGlassPane();
        setGlassPane(jGlassPane);
        getGlassPane().setVisible(true);

        messageComponent = new MessageComponent();
        jGlassPane.addGlassPaneComponent(messageComponent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldPengguna = new javax.swing.JTextField();
        jTextFieldTanggal = new javax.swing.JTextField();
        jTextFieldKodePelanggan = new javax.swing.JTextField();
        jTextFieldNamaPelanggan = new javax.swing.JTextField();
        jButtonCari = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabelTotal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jButtonBatal = new javax.swing.JButton();
        jButtonBayar = new javax.swing.JButton();
        jButtonTambahBarang = new javax.swing.JButton();
        jButtonHapusBarang = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jFormattedTextFieldUangPembayaran = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(jLabel1.getFont().deriveFont(jLabel1.getFont().getStyle() | java.awt.Font.BOLD, 24));
        jLabel1.setText("Transaksi Penjualan");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Transaksi"));

        jLabel2.setText("Pengguna :");

        jLabel3.setText("Tanggal :");

        jLabel4.setText("Kode Pelanggan :");

        jLabel5.setText("Nama Pelanggan :");

        jTextFieldPengguna.setEnabled(false);

        jTextFieldTanggal.setEnabled(false);

        jTextFieldNamaPelanggan.setEnabled(false);

        jButtonCari.setText("Cari");
        jButtonCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldPengguna)
                    .addComponent(jTextFieldTanggal)
                    .addComponent(jTextFieldNamaPelanggan)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldKodePelanggan, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCari)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldPengguna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldKodePelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldNamaPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Total Harga"));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jLabelTotal.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        jLabelTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelTotal.setText("Rp. 1.000.000.000");
        jLabelTotal.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel3.add(jLabelTotal, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3, java.awt.BorderLayout.CENTER);

        jButtonBatal.setText("Batal");
        jButtonBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBatalActionPerformed(evt);
            }
        });

        jButtonBayar.setText("Bayar");
        jButtonBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBayarActionPerformed(evt);
            }
        });

        jButtonTambahBarang.setText("Tambah Barang");
        jButtonTambahBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTambahBarangActionPerformed(evt);
            }
        });

        jButtonHapusBarang.setText("Hapus Barang");
        jButtonHapusBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHapusBarangActionPerformed(evt);
            }
        });

        jLabel6.setFont(jLabel6.getFont().deriveFont(jLabel6.getFont().getStyle() | java.awt.Font.BOLD));
        jLabel6.setText("Uang Pembayaran : ");

        jFormattedTextFieldUangPembayaran.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFormattedTextFieldUangPembayaran.setValue(new Long(0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonTambahBarang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonHapusBarang)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldUangPembayaran)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBayar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBatal)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBatal)
                    .addComponent(jButtonBayar)
                    .addComponent(jButtonTambahBarang)
                    .addComponent(jButtonHapusBarang)
                    .addComponent(jLabel6)
                    .addComponent(jFormattedTextFieldUangPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBatalActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonBatalActionPerformed

    private void jButtonCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCariActionPerformed
        CariPelangganView cariPelanggan = new CariPelangganView(getFormApp());
        Pelanggan pelanggan = cariPelanggan.search(this);
        if (pelanggan != null) {
            jTextFieldKodePelanggan.setText(pelanggan.getId());
            jTextFieldNamaPelanggan.setText(pelanggan.getNama());
        }
    }//GEN-LAST:event_jButtonCariActionPerformed

    private void jButtonTambahBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTambahBarangActionPerformed
        TambahBarangPenjualanView tambahBarangPenjualanView = new TambahBarangPenjualanView(getFormApp());
        DetailPenjualan detailPenjualan = tambahBarangPenjualanView.search(this);
        if (detailPenjualan != null) {
            dynamicTableModel.add(detailPenjualan);
            total();
        }
    }//GEN-LAST:event_jButtonTambahBarangActionPerformed

    private void jButtonHapusBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHapusBarangActionPerformed
        if (jDynamicTable.getSelectedRow() == -1) {
            messageComponent.showWarning("Pilih salah satu");
        } else {
            dynamicTableModel.remove(jDynamicTable.convertRowIndexToModel(jDynamicTable.getSelectedRow()));
            total();
        }
    }//GEN-LAST:event_jButtonHapusBarangActionPerformed

    private void jButtonBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBayarActionPerformed
        PelangganService pelangganService = SpringManager.getInstance().getBean(PelangganService.class);
        PenjualanService penjualanService = SpringManager.getInstance().getBean(PenjualanService.class);

        Pelanggan pelanggan = pelangganService.find(jTextFieldKodePelanggan.getText());
        if (pelanggan == null) {
            messageComponent.showWarning("Pelanggan Tidak Ditemukan");
        } else if (dynamicTableModel.getRowCount() == 0) {
            messageComponent.showWarning("Belum ada barang yang dibeli");
        } else if (Long.valueOf(jFormattedTextFieldUangPembayaran.getValue().toString()) < total) {
            messageComponent.showWarning("Uang pembayaran kurang");
        } else {
            Penjualan penjualan = new Penjualan();
            penjualan.setPelanggan(pelanggan);
            penjualan.setPengguna(LoginManager.getInstance().getPengguna());
            penjualan.setWaktuTransaksi(new Date());
            penjualan.setWaktuTransaksiDiubah(new Date());
            penjualan.setUang(Long.valueOf(jFormattedTextFieldUangPembayaran.getValue().toString()));
            for (int i = 0; i < dynamicTableModel.getRowCount(); i++) {
                DetailPenjualan detailPenjualan = dynamicTableModel.get(i);
                penjualan.tambahDaftarPenjualan(detailPenjualan);
            }

            long kembalian = penjualan.getUang() - penjualan.getTotal();
            JLabel label = new JLabel(formatter.print(kembalian, locale));
            label.setFont(label.getFont().deriveFont(Font.BOLD, 24));
            JOptionPane.showMessageDialog(this, label);

            penjualanService.save(penjualan);
            dispose();
        }
    }//GEN-LAST:event_jButtonBayarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBatal;
    private javax.swing.JButton jButtonBayar;
    private javax.swing.JButton jButtonCari;
    private javax.swing.JButton jButtonHapusBarang;
    private javax.swing.JButton jButtonTambahBarang;
    private javax.swing.JFormattedTextField jFormattedTextFieldUangPembayaran;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldKodePelanggan;
    private javax.swing.JTextField jTextFieldNamaPelanggan;
    private javax.swing.JTextField jTextFieldPengguna;
    private javax.swing.JTextField jTextFieldTanggal;
    // End of variables declaration//GEN-END:variables

    @Override
    public void display(Window formApp, Object parameter) {
        total();
        setLocationRelativeTo(formApp);
        setVisible(true);
    }

    private CurrencyFormatter formatter = new CurrencyFormatter();

    private Locale locale = new Locale("in", "ID");

    private void total() {
        total = 0l;
        for (int i = 0; i < dynamicTableModel.getRowCount(); i++) {
            DetailPenjualan detailPenjualan = dynamicTableModel.get(i);
            total += detailPenjualan.getSubTotal();
        }
        formatter.setFractionDigits(0);
        jLabelTotal.setText(formatter.print(total, locale));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListifyUI;

import Hashtable.HashTable;
import AdvanceSort.AdvancedSort;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form UI
     */
    String NamaUser;
    String PasswordUser;

    public Home(String nama, String password) {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/project/Saly-26.png")));
        NamaUser = nama;
        PasswordUser = password;
        Namma.setText(NamaUser);
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        DefaultTableModel model1 = (DefaultTableModel) table1.getModel();
        if (NamaUser.equals("Annisa02") && PasswordUser.equals("sa1212")) {

            hs.insert("basis data", "24-12-2021", 0);
            hs.insert("makalah qurdist", "29-12-2021", 1);
            hs.insert("progres prak stukdat 3", "20-12-2021", 2);
            hs.insert("lanjut strukdat nlp", "19-12-2021", 3);
            hs.insert("bing poster", "25-12-2021", 4);
            hs.insert("bing ringkas", "28-12-2021", 5);
            hs.insert("UAS Prak Basis data", "30-12-2021", 6);
            hs.displayTable();

            for (int j = 0; j < hs.length(); j++) {
                model.addRow(new Object[]{hs.getValue(j), hs.getTanggal(j)});
                model1.addRow(new Object[]{hs.getValue(j), hs.getTanggal(j)});
            }

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

        MainPanel = new javax.swing.JPanel();
        MenuPanel = new javax.swing.JPanel();
        TbTugas = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        txtTugas = new javax.swing.JTextField();
        txtDate = new com.toedter.calendar.JDateChooser();
        btnHapus = new javax.swing.JLabel();
        btnSelesai = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnTambah = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnMencari = new javax.swing.JLabel();
        btnClock = new javax.swing.JLabel();
        minusButton = new javax.swing.JLabel();
        closeButton = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Namma = new javax.swing.JTextField();
        btnSorting = new javax.swing.JLabel();
        btnDate = new javax.swing.JLabel();
        btnPlus = new javax.swing.JLabel();
        bgMenu = new javax.swing.JLabel();
        BodyPanel = new javax.swing.JPanel();
        ClockOn = new javax.swing.JPanel();
        TbTugas1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        txtCari1 = new javax.swing.JTextField();
        btnSearch1 = new javax.swing.JLabel();
        bgClockOn1 = new javax.swing.JLabel();
        DateOn = new javax.swing.JPanel();
        TbTugas2 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        bgClockOn2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setUndecorated(true);
        getContentPane().setLayout(null);

        MainPanel.setBackground(new java.awt.Color(51, 153, 0));
        MainPanel.setLayout(null);

        MenuPanel.setLayout(null);

        TbTugas.setBackground(new java.awt.Color(243, 190, 153));
        TbTugas.setBorder(null);

        table.setBackground(new java.awt.Color(255, 238, 234));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tugas To-do", "DeadLine"
            }
        ));
        table.setGridColor(new java.awt.Color(255, 238, 234));
        table.setSelectionBackground(new java.awt.Color(243, 190, 153));
        table.setShowHorizontalLines(false);
        table.setShowVerticalLines(false);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        TbTugas.setViewportView(table);

        MenuPanel.add(TbTugas);
        TbTugas.setBounds(90, 110, 560, 140);
        MenuPanel.add(txtTugas);
        txtTugas.setBounds(110, 350, 220, 30);
        MenuPanel.add(txtDate);
        txtDate.setBounds(400, 350, 220, 30);

        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Group 12.png"))); // NOI18N
        btnHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHapusMouseClicked(evt);
            }
        });
        MenuPanel.add(btnHapus);
        btnHapus.setBounds(710, 260, 50, 40);

        btnSelesai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/donebutton.png"))); // NOI18N
        btnSelesai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSelesaiMouseClicked(evt);
            }
        });
        MenuPanel.add(btnSelesai);
        btnSelesai.setBounds(710, 180, 120, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Deadline.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        MenuPanel.add(jLabel3);
        jLabel3.setBounds(400, 330, 140, 18);

        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Button Add.png"))); // NOI18N
        btnTambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTambahMouseClicked(evt);
            }
        });
        MenuPanel.add(btnTambah);
        btnTambah.setBounds(310, 400, 120, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Group 6a.png"))); // NOI18N
        MenuPanel.add(jLabel2);
        jLabel2.setBounds(290, 240, 150, 100);
        MenuPanel.add(txtCari);
        txtCari.setBounds(690, 90, 100, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/what to-do_.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        MenuPanel.add(jLabel1);
        jLabel1.setBounds(110, 330, 140, 18);

        btnMencari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Searchbutton.png"))); // NOI18N
        btnMencari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMencariMouseClicked(evt);
            }
        });
        MenuPanel.add(btnMencari);
        btnMencari.setBounds(680, 120, 116, 50);

        btnClock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/clock.png"))); // NOI18N
        btnClock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClockMouseClicked(evt);
            }
        });
        MenuPanel.add(btnClock);
        btnClock.setBounds(10, 240, 40, 40);

        minusButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Minus.png"))); // NOI18N
        minusButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minusButtonMouseClicked(evt);
            }
        });
        MenuPanel.add(minusButton);
        minusButton.setBounds(730, 0, 30, 30);

        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Close.png"))); // NOI18N
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });
        MenuPanel.add(closeButton);
        closeButton.setBounds(760, 0, 30, 30);

        btnLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/log out.png"))); // NOI18N
        btnLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogOutMouseClicked(evt);
            }
        });
        MenuPanel.add(btnLogOut);
        btnLogOut.setBounds(680, 440, 120, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Done !.png"))); // NOI18N
        MenuPanel.add(jLabel6);
        jLabel6.setBounds(720, 220, 70, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("You Logged in as");
        MenuPanel.add(jLabel5);
        jLabel5.setBounds(690, 390, 110, 15);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Delete.png"))); // NOI18N
        MenuPanel.add(jLabel7);
        jLabel7.setBounds(720, 300, 50, 12);

        Namma.setBackground(new java.awt.Color(255, 238, 234));
        Namma.setBorder(null);
        MenuPanel.add(Namma);
        Namma.setBounds(710, 420, 70, 14);

        btnSorting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Button Urutkan.png"))); // NOI18N
        btnSorting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSortingMouseClicked(evt);
            }
        });
        MenuPanel.add(btnSorting);
        btnSorting.setBounds(680, 330, 120, 40);

        btnDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Date.png"))); // NOI18N
        btnDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDateMouseClicked(evt);
            }
        });
        MenuPanel.add(btnDate);
        btnDate.setBounds(10, 290, 40, 40);

        btnPlus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Plus Square.png"))); // NOI18N
        btnPlus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPlusMouseClicked(evt);
            }
        });
        MenuPanel.add(btnPlus);
        btnPlus.setBounds(10, 190, 40, 40);

        bgMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/bgtodo.png"))); // NOI18N
        MenuPanel.add(bgMenu);
        bgMenu.setBounds(0, 0, 800, 500);

        MainPanel.add(MenuPanel);
        MenuPanel.setBounds(0, 0, 800, 500);

        BodyPanel.setLayout(new java.awt.CardLayout());

        ClockOn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TbTugas1.setBackground(new java.awt.Color(243, 190, 153));
        TbTugas1.setBorder(null);

        table1.setBackground(new java.awt.Color(255, 238, 234));
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tugas To-do", "Deadline"
            }
        ));
        table1.setGridColor(new java.awt.Color(255, 238, 234));
        table1.setSelectionBackground(new java.awt.Color(243, 190, 153));
        table1.setShowHorizontalLines(false);
        table1.setShowVerticalLines(false);
        TbTugas1.setViewportView(table1);

        ClockOn.add(TbTugas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 550, 360));
        ClockOn.add(txtCari1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, 100, -1));

        btnSearch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Searchbutton.png"))); // NOI18N
        btnSearch1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearch1MouseClicked(evt);
            }
        });
        ClockOn.add(btnSearch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, -1, -1));

        bgClockOn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/bgtasks.png"))); // NOI18N
        ClockOn.add(bgClockOn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, -1));

        BodyPanel.add(ClockOn, "card2");

        DateOn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TbTugas2.setBackground(new java.awt.Color(243, 190, 153));
        TbTugas2.setBorder(null);

        table2.setBackground(new java.awt.Color(255, 238, 234));
        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tugas To-do", "Deadline"
            }
        ));
        table2.setGridColor(new java.awt.Color(255, 238, 234));
        table2.setSelectionBackground(new java.awt.Color(243, 190, 153));
        table2.setShowHorizontalLines(false);
        table2.setShowVerticalLines(false);
        TbTugas2.setViewportView(table2);

        DateOn.add(TbTugas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 560, 350));

        bgClockOn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/done.png"))); // NOI18N
        DateOn.add(bgClockOn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 460));

        BodyPanel.add(DateOn, "card2");

        MainPanel.add(BodyPanel);
        BodyPanel.setBounds(60, 40, 740, 460);

        getContentPane().add(MainPanel);
        MainPanel.setBounds(0, 0, 800, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int maxSize = 100;
    HashTable hs = new HashTable(maxSize);
    HashTable hsDone = new HashTable(maxSize);
    int i = 0;
    HashTable ht = new HashTable(maxSize);

    private void btnPlusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlusMouseClicked
        //Remove Panel
        BodyPanel.removeAll();
        BodyPanel.repaint();
        BodyPanel.revalidate();

        //Add Panel
        MainPanel.repaint();
        BodyPanel.repaint();
        BodyPanel.revalidate();
    }//GEN-LAST:event_btnPlusMouseClicked

    private void btnDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDateMouseClicked
        //Remove Panel
        BodyPanel.removeAll();
        BodyPanel.repaint();
        BodyPanel.revalidate();

        //Add Panel
        BodyPanel.add(DateOn);
        BodyPanel.repaint();
        BodyPanel.revalidate();
    }//GEN-LAST:event_btnDateMouseClicked

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        this.dispose(); // menutup Login
    }//GEN-LAST:event_closeButtonMouseClicked

    private void minusButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusButtonMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minusButtonMouseClicked

    private void btnClockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClockMouseClicked
        //Remove Panel
        BodyPanel.removeAll();
        BodyPanel.repaint();
        BodyPanel.revalidate();

        //Add Panel
        BodyPanel.add(ClockOn);
        BodyPanel.repaint();
        BodyPanel.revalidate();
    }//GEN-LAST:event_btnClockMouseClicked

    private void btnSelesaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelesaiMouseClicked

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        DefaultTableModel model2 = (DefaultTableModel) table2.getModel();

        int row = table.getSelectedRow();
        String nama = (String) model.getValueAt(row, 0);
        String tanggal = (String) model.getValueAt(row, 1);
        if (row >= 0) {
            int ok = JOptionPane.showConfirmDialog(null, "Sudah Selesai?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (ok == 0) {

                System.out.println("Tabel tugas yang selesai :");

                hsDone.insert(nama, tanggal, i);
                model2.addRow(new Object[]{hsDone.getValue(i), hsDone.getTanggal(i)});
                hsDone.displayTable();

                model.removeRow(row);
                hs.delete(row);
            }
            i++;
        } else {
            JOptionPane.showMessageDialog(null, "tidak ada tugas yang dipilih", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSelesaiMouseClicked

    private void btnHapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseClicked
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        DefaultTableModel model1 = (DefaultTableModel) table1.getModel();

        int row = table.getSelectedRow();
        if (row >= 0) {
            int ok = JOptionPane.showConfirmDialog(null, "Yakin mau Hapus?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (ok == 0) {
                model.removeRow(row);
                model1.removeRow(row);
                hs.delete(row);
                hs.displayTable();
            }

        } else {
            JOptionPane.showMessageDialog(null, "tidak ada tugas yang dipilih", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnHapusMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        //        for (int i = 0; i < 100; i++) {
        //            Home home = new Home();
        //            Heap hp = new Heap(100);
        //            home.table.setValueAt(hp.getValue(), i, 1);
        //            home.table.setValueAt(hp.getKey(), i, 2);
        //        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnTambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMouseClicked

        JOptionPane.showMessageDialog(null, "Tugas ditambahkan");

        String tampilan = "dd-MM-yyyy";

        SimpleDateFormat format = new SimpleDateFormat(tampilan);
        DefaultTableModel dataModel = (DefaultTableModel) table.getModel();
        DefaultTableModel dataModel1 = (DefaultTableModel) table1.getModel();

        String tanggal = String.valueOf(format.format(txtDate.getDate()));
        hs.insert(txtTugas.getText(), tanggal, i++);
        System.out.println("Tabel tugas anda :");
        hs.displayTable();
//        lq.displayQueue();

        dataModel.addRow(new Object[]{txtTugas.getText(), tanggal});
        dataModel1.addRow(new Object[]{txtTugas.getText(), tanggal});


    }//GEN-LAST:event_btnTambahMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked


    private void btnMencariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMencariMouseClicked
        String text = txtCari.getText();
        boolean Kondisi = false;
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        List<String> listTugas = new ArrayList<>();
        List<String> listTanggal = new ArrayList<>();

        for (int j = 0; j < model.getRowCount(); j++) {
            String nama = (String) model.getValueAt(j, 0);
            String tanggal = (String) model.getValueAt(j, 1);

            listTugas.add(nama);
            listTanggal.add(tanggal);

            System.out.println("Tugas yang dicari :");
            System.out.println(listTugas.get(j) + " " + listTanggal.get(j));

            String Tugas[] = new String[listTugas.size()];
            String Tanggal[] = new String[listTanggal.size()];

            for (int i = 0; i < listTugas.size(); i++) {
                Tugas[i] = listTugas.get(i);
            }
            for (int i = 0; i < listTanggal.size(); i++) {
                Tanggal[i] = listTanggal.get(i);
            }

            if (Tanggal[j].equals(text)) {
                JOptionPane.showMessageDialog(null, "Tugasmu : " + Tugas[j] + " deadlinenya :" + Tanggal[j]);
                Kondisi = true;
                break;
            } else if (Tugas[j].equals(text)) {
                JOptionPane.showMessageDialog(null, "Tugasmu : " + Tugas[j] + " deadlinenya :" + Tanggal[j]);
                Kondisi = true;
                break;
            }
        }

        if (Kondisi == false) {
            JOptionPane.showMessageDialog(null, "Tidak ada");
        }
    }//GEN-LAST:event_btnMencariMouseClicked

    private void btnLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOutMouseClicked
        String Nama = "";
        String Password = "";

        Login n = new Login(Nama, Password);
        n.setVisible(true);
        n.pack();
        n.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnLogOutMouseClicked

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked

//        DefaultTableModel model = (DefaultTableModel) table.getModel();
//        int pilih = table.getSelectedRow();
//        if (pilih == -1) {
//            return;
//        }
//        String nama = (String) model.getValueAt(pilih, 0);
//        String tanggal = (String) model.getValueAt(pilih, 1);
//        DefaultTableModel dataModel2 = (DefaultTableModel) table2.getModel();
//        dataModel2.addRow(new Object[]{nama, tanggal});

    }//GEN-LAST:event_tableMouseClicked

    private void btnSearch1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearch1MouseClicked
        String text = txtCari1.getText();

        DefaultTableModel model = (DefaultTableModel) table1.getModel();

        List<String> listTugas = new ArrayList<>();
        List<String> listTanggal = new ArrayList<>();

        for (int j = 0; j < model.getRowCount(); j++) {
            String nama = (String) model.getValueAt(j, 0);
            String tanggal = (String) model.getValueAt(j, 1);

            listTugas.add(nama);
            listTanggal.add(tanggal);

            System.out.println("Tugas yang dicari :");
            System.out.println(listTugas.get(j) + listTanggal.get(j));

            String Tugas[] = new String[listTugas.size()];
            String Tanggal[] = new String[listTanggal.size()];

            for (int i = 0; i < listTugas.size(); i++) {
                Tugas[i] = listTugas.get(i);
            }
            for (int i = 0; i < listTanggal.size(); i++) {
                Tanggal[i] = listTanggal.get(i);
            }

            if (Tanggal[j].equals(text)) {
                JOptionPane.showMessageDialog(null, "Tugasmu : " + Tugas[j] + " deadlinenya :" + Tanggal[j]);
                break;
            } else if (Tugas[j].equals(text)) {
                JOptionPane.showMessageDialog(null, "Tugasmu : " + Tugas[j] + " deadlinenya :" + Tanggal[j]);;
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Tidak ada");
            }
        }
    }//GEN-LAST:event_btnSearch1MouseClicked

    private void btnSortingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSortingMouseClicked
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        AdvancedSort sort = new AdvancedSort(model.getRowCount());

        for (int j = 0; j < model.getRowCount(); j++) {
            sort.insert(hs.getTanggal(j), hs.getValue(j));

        }
        model.setRowCount(0);

        sort.shellSort();
        System.out.println(" setelah diurutkan : ");
        sort.display();

        for (int j = 0; j < hs.length(); j++) {
            hs.delete(j);
        }
        for (int j = 0; j < sort.panjang(); j++) {
            hs.insert(sort.getTugas(j), sort.getTanggal(j), j);
        }
        for (int j = 0; j < sort.panjang(); j++) {
            model.addRow(new Object[]{sort.getTugas(j), sort.getTanggal(j)});
        }
        hs.displayTable();
    }//GEN-LAST:event_btnSortingMouseClicked

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
            java.util.logging.Logger.getLogger(Home.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Home().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BodyPanel;
    private javax.swing.JPanel ClockOn;
    private javax.swing.JPanel DateOn;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JTextField Namma;
    private javax.swing.JScrollPane TbTugas;
    private javax.swing.JScrollPane TbTugas1;
    private javax.swing.JScrollPane TbTugas2;
    private javax.swing.JLabel bgClockOn1;
    private javax.swing.JLabel bgClockOn2;
    private javax.swing.JLabel bgMenu;
    private javax.swing.JLabel btnClock;
    private javax.swing.JLabel btnDate;
    private javax.swing.JLabel btnHapus;
    private javax.swing.JLabel btnLogOut;
    private javax.swing.JLabel btnMencari;
    private javax.swing.JLabel btnPlus;
    private javax.swing.JLabel btnSearch1;
    private javax.swing.JLabel btnSelesai;
    private javax.swing.JLabel btnSorting;
    private javax.swing.JLabel btnTambah;
    private javax.swing.JLabel closeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel minusButton;
    public javax.swing.JTable table;
    public javax.swing.JTable table1;
    public javax.swing.JTable table2;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtCari1;
    private com.toedter.calendar.JDateChooser txtDate;
    private javax.swing.JTextField txtTugas;
    // End of variables declaration//GEN-END:variables

}

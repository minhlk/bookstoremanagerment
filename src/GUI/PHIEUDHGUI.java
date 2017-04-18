/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.CHITIETPHIEUDHBUS;
import BUS.PHIEUDHBUS;
import DTO.CHITIETPHIEUDHDTO;
import DTO.PHIEUDHDTO;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Button;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author MKZ
 */
public class PHIEUDHGUI extends javax.swing.JPanel {

    /**
     * Creates new form DATHANGGUI
     */
    TableRowSorter sorter;
    public PHIEUDHGUI() {
        initComponents();
        jPanel15.setVisible(false);
        jPanel16.setVisible(false);
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jButton20 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton24 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jButton14 = new javax.swing.JButton();
        jTextField8 = new javax.swing.JTextField();
        jButton15 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton21 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jPanel16 = new javax.swing.JPanel();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel15 = new javax.swing.JLabel();
        jButton23 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phiếu", "Ngày lập", "Tình trạng", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable4.setColumnSelectionAllowed(true);
        jTable4.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable4.getTableHeader().setReorderingAllowed(false);
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loadChiTietPhieuEvent(evt);
            }
        });
        jScrollPane4.setViewportView(jTable4);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phiếu", "Tên sách", "Số lượng nhập", "Số lượng nhận", "Giá mua", "Ma sach"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable5.setColumnSelectionAllowed(true);
        jTable5.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable5.getTableHeader().setReorderingAllowed(false);
        jTable5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                GetChiTietSachEvent(evt);
            }
        });
        jScrollPane5.setViewportView(jTable5);

        jButton20.setText("Refresh");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshEvent(evt);
            }
        });

        jCheckBox1.setText("Đủ");
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ChangeTinhTrangEvent(evt);
            }
        });

        jButton24.setText("Cập nhật");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capNhatChiTietPhieuEvent(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCheckBox1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton24))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jButton14.setText("Lọc");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locMaPhieuEvent(evt);
            }
        });

        jTextField8.setEditable(false);
        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(255, 0, 0));
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setText("Mã phiếu");
        jTextField8.setBorder(null);

        jButton15.setText("In phiếu");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InPhieuEvent(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tùy chọn"));

        jButton21.setText("Tạo phiếu ");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadFormTaoPhieuEvent(evt);
            }
        });

        jButton25.setText("Hủy phiếu ");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HuyPhieuEvent(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton21, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton25, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jButton21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton25)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Tình trạng--", "Đủ", "Thiếu" }));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                locTinhTrangEvent(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Trạng thái--", "hoạt động", "kết thúc" }));
        jComboBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                locTrangThaiEvent(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 51, 51));
        jLabel15.setText("Tên sách");

        jButton23.setText("Sửa");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaSoLuongEvent(evt);
            }
        });

        jLabel16.setText("Đã nhập");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jTextField8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 5, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton20))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
  
    private void loadChiTietPhieuEvent(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadChiTietPhieuEvent
        // TODO add your handling code here:
        if(jTable4.getSelectedRow()!=-1){
        int idPhieu = Integer.parseInt(jTable4.getValueAt(jTable4.getSelectedRow(), 0).toString());
        int tinhTrang = Integer.parseInt(jTable4.getValueAt(jTable4.getSelectedRow(), 2).toString() =="Đủ"? "1":"0");
        jPanel15.setVisible(true);
        jPanel16.setVisible(true);
        if(tinhTrang == 1){
        jCheckBox1.setSelected(true);
        jCheckBox1.setEnabled(false);
        jButton24.setEnabled(false);
        
        }
        else{    
        jCheckBox1.setSelected(false);
        jCheckBox1.setEnabled(true);
        jButton24.setEnabled(true);
        }
        jTextField8.setText("Mã phiếu : "+idPhieu);
        ArrayList<CHITIETPHIEUDHDTO> arr = new CHITIETPHIEUDHBUS().getChiTietPhieu(idPhieu);
        DefaultTableModel model;
        model = new DefaultTableModel();
        model.addColumn("Mã phiếu");
        model.addColumn("Tên sách");
        model.addColumn("Số lượng đặt");
        model.addColumn("Đã nhận");
//        model.addColumn("Giá mua");
        model.addColumn("Mã Sách");
        for(int i=0;i< arr.size();i++){
            model.addRow(new Object[]{arr.get(i).getIdPhieu()
                ,arr.get(i).getTenSach().trim()
                ,arr.get(i).getSoLuongNhap()
                ,arr.get(i).getSoLuongNhan()
//                ,arr.get(i).getGiaMua()
                ,arr.get(i).getIdSach()
            });
        }
        jTable5.setModel(model);
        }
    }//GEN-LAST:event_loadChiTietPhieuEvent

    private void GetChiTietSachEvent(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GetChiTietSachEvent
        // TODO add your handling code here:
        jLabel15.setText(jTable5.getValueAt(jTable5.getSelectedRow(), 1).toString());
        jSpinner2.setValue(Integer.parseInt(jTable5.getValueAt(jTable5.getSelectedRow(), 3).toString()));
    }//GEN-LAST:event_GetChiTietSachEvent

    private void RefreshEvent(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshEvent
        // TODO add your handling code here:
        loadFormPhieu();
        jComboBox2.setSelectedIndex(0);
        jComboBox3.setSelectedIndex(0);
    }//GEN-LAST:event_RefreshEvent

    private void loadFormTaoPhieuEvent(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadFormTaoPhieuEvent
      CHITIETPHIEUDHGUI taoPhieuForm = new CHITIETPHIEUDHGUI();
        taoPhieuForm.setVisible(true);
    }//GEN-LAST:event_loadFormTaoPhieuEvent

    private void locMaPhieuEvent(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locMaPhieuEvent
         if(sorter != null)
                sorter.setRowFilter(RowFilter.regexFilter(jTextField6.getText().toUpperCase(), 0));        
        
    }//GEN-LAST:event_locMaPhieuEvent

    private void locTinhTrangEvent(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_locTinhTrangEvent
          if(sorter != null){
            if(jComboBox2.getSelectedIndex() == 1){
                sorter.setRowFilter(RowFilter.regexFilter("Đủ", 2));
            }
            if(jComboBox2.getSelectedIndex() == 2)
            sorter.setRowFilter(RowFilter.regexFilter("Thiếu", 2));
            jComboBox3.setSelectedIndex(0);
            }
    }//GEN-LAST:event_locTinhTrangEvent

    private void locTrangThaiEvent(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_locTrangThaiEvent
        if(sorter != null){
            if(jComboBox3.getSelectedIndex() == 1){
                sorter.setRowFilter(RowFilter.regexFilter("Hoạt động", 3));
            }
            if(jComboBox3.getSelectedIndex() == 2)
            sorter.setRowFilter(RowFilter.regexFilter("Kết thúc", 3));
            jComboBox2.setSelectedIndex(0);
            }   
        
    }//GEN-LAST:event_locTrangThaiEvent

    private void InPhieuEvent(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InPhieuEvent
        // TODO add your handling code here:
        if(jTable5.getRowCount()>0){
                String path = "";
       JFileChooser fileChooser = new JFileChooser();
fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
int result = fileChooser.showOpenDialog(this);
if (result == JFileChooser.APPROVE_OPTION) {
    File selectedFile = fileChooser.getSelectedFile();
    path = selectedFile.getAbsolutePath().isEmpty()?"phieudathang.pdf":selectedFile.getAbsolutePath()+".pdf";
     try {
//            BaseFont courier = BaseFont.createFont(BaseFont.COURIER, BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
//            Font font = new Font(courier, 12, Font.NORMAL);
            BaseFont baseFont=BaseFont.createFont("C://Windows//Fonts//vuTimes.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            Font font=new Font(baseFont, 8);
//            FontFactory.registerDirectories();

//            Font font = FontFactory.getFont("Times New Roman");
            Chunk chunk = new Chunk("",font);
           
            Document doc = new Document();
            
            PdfWriter.getInstance(doc, new FileOutputStream(path));
            doc.open();
            doc.add(chunk);
            PdfPTable pdfTable = new PdfPTable(jTable5.getColumnCount());
            //adding table headers
            for (int i = 0; i < jTable5.getColumnCount(); i++) {
                pdfTable.addCell(new Phrase(jTable5.getColumnName(i),font));
            }
            //extracting data from the JTable and inserting it to PdfPTable
            for (int rows = 0; rows < jTable5.getRowCount() - 1; rows++) {
                for (int cols = 0; cols < jTable5.getColumnCount(); cols++) {
                    pdfTable.addCell(new Phrase(jTable5.getModel().getValueAt(rows, cols).toString(),font));

                }
            }
            doc.add(pdfTable);
            doc.close();
            System.out.println("done");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(THONGKECHIGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(THONGKECHIGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(THONGKECHIGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
}
        }
        else
            JOptionPane.showMessageDialog(this,"Chọn phiếu cần in");
       
        
    }//GEN-LAST:event_InPhieuEvent

    private void ChangeTinhTrangEvent(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ChangeTinhTrangEvent
         // TODO add your handling code here:
        if(jCheckBox1.isSelected()){
        for(int i = 0 ; i< jTable5.getRowCount();i++)
        jTable5.setValueAt(jTable5.getValueAt(i, 2), i, 3);
//        jLabel16.setVisible(false);
//        jSpinner2.setVisible(false);
//        jButton23.setVisible(false);
          jPanel16.setVisible(false);
        }
        else{
        for(int i = 0 ; i< jTable5.getRowCount();i++)
        jTable5.setValueAt(0, i, 3);
//        jLabel16.setVisible(true);
//        jSpinner2.setVisible(true);
//        jButton23.setVisible(true);
          jPanel16.setVisible(true);
        }
    }//GEN-LAST:event_ChangeTinhTrangEvent

    private void capNhatChiTietPhieuEvent(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capNhatChiTietPhieuEvent
                // TODO add your handling code here:
                int dialogResult = JOptionPane.showConfirmDialog (null, "Chắc chắn muốn cập nhật?","Lưu ý",JOptionPane.YES_NO_OPTION);
                if(dialogResult == JOptionPane.YES_OPTION){
                        int tinhTrang = 1 ;
        
                        ArrayList<CHITIETPHIEUDHDTO> arr = new ArrayList<>();
                        for(int i =0;i < jTable5.getRowCount();i++){
                            int idPhieu = Integer.parseInt(jTable5.getValueAt(i, 0).toString());
                            int idSach = Integer.parseInt(jTable5.getValueAt(i, 4).toString());
                            int soLuongNhan = Integer.parseInt(jTable5.getValueAt(i, 3).toString());
                            int soLuongNhap = Integer.parseInt(jTable5.getValueAt(i, 2).toString());
                            if(soLuongNhap > soLuongNhan) tinhTrang = 0;
                            arr.add(new CHITIETPHIEUDHDTO(idPhieu,idSach,soLuongNhan));
                        }
                        // Cập nhật chi tiết của phiếu đặt hàng sau khi kiểm tra
                        CHITIETPHIEUDHBUS chiTietPhieuBus = new CHITIETPHIEUDHBUS();
                        PHIEUDHBUS phieuBus = new PHIEUDHBUS();
                        chiTietPhieuBus.tangSoLuong(arr);
                        chiTietPhieuBus.editChiTietPhieu(arr);
                        phieuBus.changetinhTrang(arr.get(0).getIdPhieu(), tinhTrang);

                        // Nếu trình trạng là thiếu thì trạng thái trả về 0(đang chờ),và ngược lại(kết thúc)
                        int trangThai = tinhTrang == 1? 0:1;
                        phieuBus.changeState(arr.get(0).getIdPhieu(),trangThai);
                        //  Load lại form
                        loadFormPhieu();
                        ((DefaultTableModel)jTable5.getModel()).setRowCount(0);
                }
    }//GEN-LAST:event_capNhatChiTietPhieuEvent

    private void suaSoLuongEvent(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaSoLuongEvent
      if(jTable5.getSelectedRow()!=-1){
            // TODO add your handling code here:
        int soLuongNhan = (Integer) jSpinner2.getValue();
        int soLuongNhap = (Integer) jTable5.getValueAt(jTable5.getSelectedRow(), 2);
        if(0 <= soLuongNhan && soLuongNhan <=  soLuongNhap)
            jTable5.setValueAt(soLuongNhan, jTable5.getSelectedRow(), 3);
        else
            JOptionPane.showMessageDialog(this, "Đã nhận vượt quá yêu cầu đặt hàng");
      }
       else
            JOptionPane.showMessageDialog(this, "Chọn sách cần sửa");
    }//GEN-LAST:event_suaSoLuongEvent

    private void HuyPhieuEvent(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HuyPhieuEvent
        // Hủy phiếu
        if(jTable4.getSelectedRow() != -1){
        int dialogResult = JOptionPane.showConfirmDialog (null, "Chắc chắn muốn hủy phiếu?","Lưu ý",JOptionPane.YES_NO_OPTION);
            if(dialogResult == JOptionPane.YES_OPTION){
                    int tinhTrang = 1 ;
        
                    ArrayList<CHITIETPHIEUDHDTO> arr = new ArrayList<>();
                    for(int i =0;i < jTable5.getRowCount();i++){
                        int idPhieu = Integer.parseInt(jTable5.getValueAt(i, 0).toString());
                        int idSach = Integer.parseInt(jTable5.getValueAt(i, 4).toString());
                        int soLuongNhan = Integer.parseInt(jTable5.getValueAt(i, 3).toString());
                        arr.add(new CHITIETPHIEUDHDTO(idPhieu,idSach,soLuongNhan));
                    }
                    // Cập nhật chi tiết của phiếu đặt hàng sau khi kiểm tra
                    CHITIETPHIEUDHBUS chiTietPhieuBus = new CHITIETPHIEUDHBUS();
                    PHIEUDHBUS phieuBus = new PHIEUDHBUS();
                    chiTietPhieuBus.huyChiTietPhieu(arr);
                    phieuBus.changetinhTrang(arr.get(0).getIdPhieu(), tinhTrang);

                    int trangThai = 0;
                    phieuBus.changeState(arr.get(0).getIdPhieu(),trangThai);
                    //  Load lại form
                    loadFormPhieu();
                    ((DefaultTableModel)jTable5.getModel()).setRowCount(0);
            }
        }
        else
            JOptionPane.showMessageDialog(this, "Chọn phiếu cần hủy");
        
    }//GEN-LAST:event_HuyPhieuEvent
    
    
    private void loadFormPhieu() {
      DefaultTableModel model;
         model = new DefaultTableModel();
        model.addColumn("Mã phiếu");
        model.addColumn("Ngày lập");
        model.addColumn("Tình trạng");
        model.addColumn("Trạng thái");
PHIEUDHBUS bus = new PHIEUDHBUS();
ArrayList<PHIEUDHDTO> arr = bus.loadFormNhap();
 for(int i=0;i< arr.size();i++){
            model.addRow(new Object[]{arr.get(i).getIdPhieu()
                    ,arr.get(i).getNgayLap().trim()
                    ,arr.get(i).getTinhTrang()==1?"Đủ":"Thiếu"
                    ,arr.get(i).getTrangThai()==1?"Hoạt động":"Kết thúc"
            });
         }
          jTable4.setModel(model);  
          sorter = new TableRowSorter<>(jTable4.getModel());
          jTable4.setRowSorter(sorter);
    }//
  
  
  
    
  

    
   
    

    

   
    

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables

   
    
    
   
   

    
}

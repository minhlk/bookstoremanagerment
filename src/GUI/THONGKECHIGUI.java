/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.PHIEUDHBUS;
import DTO.THONGKECHIDTO;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import java.awt.Color;
import java.io.FileOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.RowFilter.ComparisonType;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
//import org.w3c.dom.Document;


import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JFileChooser;
/**
 *
 * @author MKZ
 */
public class THONGKECHIGUI extends javax.swing.JPanel {

    /**
     * Creates new form THONGKENHAPGUI
     */
    TableRowSorter sorter;
    public THONGKECHIGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jTextField10 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton16 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jButton8 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        jButton9 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel6.setName("adf"); // NOI18N

        jButton6.setText("Tìm kiếm ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã phiếu", "Mã sách", "Tên sách" }));
        jComboBox4.setToolTipText("");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Tình trạng--", "Đủ", "Thiếu" }));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Trạng thái--", "hoạt động", "kết thúc" }));
        jComboBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox3ItemStateChanged(evt);
            }
        });

        jButton16.setText("Lọc");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jLabel22.setText("Thời gian bắt đầu ");

        jLabel23.setText("Thời gian kết thúc ");

        jDateChooser1.setDateFormatString("yyyy-MM-dd");

        jDateChooser2.setDateFormatString("yyyy-MM-dd");

        jButton8.setText("In báo cáo ");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton13.setText("Refresh");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton9.setText("Hiển thị thống kê");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton13))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 478, Short.MAX_VALUE)
                        .addComponent(jYearChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton9))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16)
                    .addComponent(jYearChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9))
                .addGap(8, 8, 8)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel23))
                    .addComponent(jButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6)
                    .addComponent(jButton13)))
        );

        jScrollPane2.setPreferredSize(new java.awt.Dimension(452, 200));

        jTable2.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phiếu", "Mã sách ", "Tên sách", "Ngày lập ", "Số lượng Nhập ", "Số lượng Nhận", "Giá mua ", "Tổng giá ", "Tình trạng", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setColumnSelectionAllowed(true);
        jTable2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
       locTinhTrang();
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jComboBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox3ItemStateChanged
      locTrangThai();
    }//GEN-LAST:event_jComboBox3ItemStateChanged

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
            locDanhSach();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
            hienThiThongKe();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed

        loadFormThongKeChi();
        jComboBox2.setSelectedIndex(0);
        jComboBox3.setSelectedIndex(0);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       timKiem();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if(jTable2.getRowCount()>0)
        inThongKeChi();   

    
        
    }//GEN-LAST:event_jButton8ActionPerformed
    
    private void loadFormThongKeChi(){
    if(sorter != null) sorter.setRowFilter(null);
 DefaultTableModel model;
         model = new DefaultTableModel();
        model.addColumn("Mã phiếu");
        model.addColumn("Mã sách");
        model.addColumn("Tên sách");
        model.addColumn("Ngày lập");
        model.addColumn("Số lượng nhập");
        model.addColumn("Số lượng nhận");
        model.addColumn("Giá mua");
        model.addColumn("Tổng giá");
        model.addColumn("Tình trạng");
        model.addColumn("Trạng thái");
PHIEUDHBUS bus = new PHIEUDHBUS();
ArrayList<THONGKECHIDTO> arr = bus.loadFormThongKeChi();
 for(int i=0;i< arr.size();i++){
        try {
            model.addRow(new Object[]{arr.get(i).getIdPhieu()
                    ,arr.get(i).getIdSach()
                    ,arr.get(i).getTenSach().trim()
                    ,new SimpleDateFormat("yyyy-MM-dd").parse(arr.get(i).getNgayLap())
//                    ,arr.get(i).getNgayLap()
                    ,arr.get(i).getSoLuongNhap()
                    ,arr.get(i).getSoLuongNhan()
                    ,arr.get(i).getGiaMua()
                    ,arr.get(i).getTongGia()
                    ,arr.get(i).getTinhTrang()==1?"Đủ":"Thiếu"
                    ,arr.get(i).getTrangThai()==1?"Hoạt động":"Kết thúc"
            });
        } catch (ParseException ex) {
            Logger.getLogger(THONGKECHIGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
         }
          jTable2.setModel(model);  
          sorter = new TableRowSorter<>(jTable2.getModel());
          jTable2.setRowSorter(sorter);
    }//
    
    private void inThongKeChi(){
     String path = "";
       JFileChooser fileChooser = new JFileChooser();
fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
int result = fileChooser.showOpenDialog(this);
if (result == JFileChooser.APPROVE_OPTION) {
    File selectedFile = fileChooser.getSelectedFile();
    path = selectedFile.getAbsolutePath().isEmpty()?"thongke.pdf":selectedFile.getAbsolutePath()+".pdf";
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
            PdfPTable pdfTable = new PdfPTable(jTable2.getColumnCount());
            //adding table headers
            for (int i = 0; i < jTable2.getColumnCount(); i++) {
                pdfTable.addCell(new Phrase(jTable2.getColumnName(i),font));
            }
            //extracting data from the JTable and inserting it to PdfPTable
            for (int rows = 0; rows < jTable2.getRowCount() - 1; rows++) {
                for (int cols = 0; cols < jTable2.getColumnCount(); cols++) {
                    pdfTable.addCell(new Phrase(jTable2.getModel().getValueAt(rows, cols).toString(),font));

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
       
     
    }//
    
    private void locDanhSach() {
        //        try {
            // TODO add your handling code here:
//            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            
//            Date date = formatter.parse(jDateChooser1.getDate().toString());
//            Date date = jDateChooser1.getDate();
        ArrayList<RowFilter<Object,Object>> filters = new ArrayList<RowFilter<Object,Object>>(2);
        filters.add( RowFilter.dateFilter(ComparisonType.AFTER, jDateChooser1.getDate(),3) );
        filters.add( RowFilter.dateFilter(ComparisonType.BEFORE, jDateChooser2.getDate(),3) );
        RowFilter rf = RowFilter.andFilter(filters);

        sorter.setRowFilter(rf);
//System.out.println(date.toString());
//        } catch (ParseException ex) {
//            Logger.getLogger(THONGKECHIGUI.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//

    private void hienThiThongKe() {
                // TODO add your handling code here:
        PHIEUDHBUS mPhieu = new PHIEUDHBUS();
        int year = jYearChooser1.getYear();
        Map<Integer,Integer> mMap = mPhieu.thongKeChi(year);
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for(int i= 1; i <= 12 ;i++){
            dataset.setValue(mMap.get(i), "Tổng tiền (VNĐ)", "Tháng : "+i);
        }
        JFreeChart chart = ChartFactory.createBarChart("Tổng chi trong năm "+ year, "Thời gian (Tháng)", "Tổng tiền (VNĐ)", dataset,PlotOrientation.HORIZONTAL,false,true,false);
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.BLACK);
        ChartFrame frame = new ChartFrame("Tổng chi chart", chart);
        frame.setVisible(true);
        frame.setSize(500,500);
     }//

    private void timKiem() {
         // TODO add your handling code here: Mã phiếu, Mã sách, Tên sách
        if(sorter != null){
            if(jComboBox4.getSelectedIndex() == 0){
                sorter.setRowFilter(RowFilter.regexFilter(jTextField10.getText().toUpperCase(), 0));
            }
            if(jComboBox4.getSelectedIndex() == 1){
                sorter.setRowFilter(RowFilter.regexFilter(jTextField10.getText().toUpperCase(), 1));
            }
            if(jComboBox4.getSelectedIndex() == 2)
            sorter.setRowFilter(RowFilter.regexFilter(jTextField10.getText().toUpperCase(), 2));

        }
    }//

    private void locTinhTrang() {
         // TODO add your handling code here:
        //        TableRowSorter sorter = new TableRowSorter<TableModel>(jTable2.getModel());
        //        jTable2.setRowSorter(sorter);
        if(sorter != null){
            if(jComboBox2.getSelectedIndex() == 1){
                sorter.setRowFilter(RowFilter.regexFilter("Đủ", 8));
            }
            if(jComboBox2.getSelectedIndex() == 2)
            sorter.setRowFilter(RowFilter.regexFilter("Thiếu", 8));

        }
    }

    private void locTrangThai() {
          // TODO add your handling code here:
        //        TableRowSorter sorter = new TableRowSorter<TableModel>(jTable2.getModel());
        //        jTable2.setRowSorter(sorter);
        if(sorter != null){
            if(jComboBox3.getSelectedIndex() == 1){
                sorter.setRowFilter(RowFilter.regexFilter("Hoạt động", 9));
            }
            if(jComboBox3.getSelectedIndex() == 2)
            sorter.setRowFilter(RowFilter.regexFilter("Kết thúc", 9));

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField10;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    // End of variables declaration//GEN-END:variables

}

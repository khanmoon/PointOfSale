/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mansoor.main;

import dto.Payment_Method;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import jssc.SerialPort;
import static jssc.SerialPort.MASK_RXCHAR;
import jssc.SerialPortEvent;
import jssc.SerialPortException;
import org.orm.PersistentException;

/**
 *
 * @author manso
 */
public class Invoice extends javax.swing.JFrame {

    /**
     * Creates new form Invoice
     */
    DefaultTableModel tm;
    String person;
    SerialPort arduinoPort = null;
    public Invoice(String salesperson) {
        initComponents();
        DateFormat df1 = new SimpleDateFormat("dd/MM/yy");
        Date dateobj = new Date();
        lbl_date.setText(df1.format(dateobj));
        DateFormat df2 = new SimpleDateFormat("HH:mm:ss");
        lbl_time.setText(df2.format(dateobj));
        person = salesperson;
        lbl_salesperson.setText(person);
        tm = (DefaultTableModel) tbl_sales.getModel();
        loadCbPayMethod();
    }

    private void loadCbPayMethod() {
        Payment_Method[] paym;
        try {
            paym = dto.Payment_MethodDAO.listPayment_MethodByQuery(null, null);
            for(int i=0;i<paym.length;i++){
                cb_paymethod.addItem(paym[i].getPAY_Type());
            }
        } catch (PersistentException ex) {
            Logger.getLogger(Invoice.class.getName()).log(Level.SEVERE, null, ex);
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

        lbl_date = new javax.swing.JLabel();
        lbl_time = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_sales = new javax.swing.JTable();
        lbl_salesperson = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_code = new javax.swing.JTextField();
        btn_additem = new javax.swing.JButton();
        btn_deleteitem = new javax.swing.JButton();
        txt_Qty = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btn_proceed = new javax.swing.JButton();
        lbl_total = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_decqty = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        btn_back = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        cb_paymethod = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Date:");

        jLabel2.setText("Time:");

        tbl_sales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Prod Code", "Name", "Qty", "Price", "Total"
            }
        ));
        jScrollPane1.setViewportView(tbl_sales);

        jLabel4.setText("Sales Person:");

        jLabel3.setText("Prod Code");

        txt_code.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_codeCaretUpdate(evt);
            }
        });
        txt_code.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_codeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_codeFocusLost(evt);
            }
        });
        txt_code.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txt_codeInputMethodTextChanged(evt);
            }
        });
        txt_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codeActionPerformed(evt);
            }
        });
        txt_code.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txt_codePropertyChange(evt);
            }
        });

        btn_additem.setText("Add");
        btn_additem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_additemActionPerformed(evt);
            }
        });

        btn_deleteitem.setText("Delete");
        btn_deleteitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteitemActionPerformed(evt);
            }
        });

        txt_Qty.setText("1");
        txt_Qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_QtyActionPerformed(evt);
            }
        });

        jLabel5.setText("Qty");

        btn_proceed.setText("Print and Proceed");
        btn_proceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_proceedActionPerformed(evt);
            }
        });

        lbl_total.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel7.setText("Total");

        btn_decqty.setText("Decrease Qty");
        btn_decqty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_decqtyActionPerformed(evt);
            }
        });

        jToolBar1.setRollover(true);

        btn_back.setText("Back");
        btn_back.setFocusable(false);
        btn_back.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_back.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_back);

        btn_logout.setText("Logout");
        btn_logout.setFocusable(false);
        btn_logout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_logout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_logout);

        jCheckBox1.setText("ON Barcode");
        jCheckBox1.setFocusable(false);
        jCheckBox1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jCheckBox1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_total, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cb_paymethod, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn_decqty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_proceed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_code)
                                .addComponent(btn_additem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_deleteitem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_Qty)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_date, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(lbl_time, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_salesperson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_date, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_time, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_salesperson, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addComponent(btn_additem)
                        .addGap(18, 18, 18)
                        .addComponent(btn_deleteitem)
                        .addGap(18, 18, 18)
                        .addComponent(btn_decqty)
                        .addGap(69, 69, 69)
                        .addComponent(cb_paymethod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_proceed, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_total, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codeActionPerformed

    private void btn_additemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_additemActionPerformed

        if (additem()) {
            return;
        }
        
    }//GEN-LAST:event_btn_additemActionPerformed

    private boolean additem() throws NumberFormatException {
        int code = Integer.parseInt(txt_code.getText());
        int count = tm.getRowCount();
        for (int i = 0; i<count; i++) {
            int value = (int) tm.getValueAt(i,0);
            if (Integer.parseInt(txt_code.getText())==value) {
                int previous = (int) tm.getValueAt(i, 2);
                int current = Integer.parseInt(txt_Qty.getText());
                tm.setValueAt(previous+current, i, 2);
                int Q=(int) tm.getValueAt(i, 2);
                int pr = (int) tm.getValueAt(i,3);
                tm.setValueAt(pr*Q, i, 4);
                calTotal(tm);
                return true;
            }
        }
        try {
            dto.Product p = dto.ProductDAO.getProductByORMID(code);
            Object[] obj =new Object[5];
            obj[0]=p.getPROD_Code();
            obj[1]=p.getPROD_Name();
            int Q=Integer.parseInt(txt_Qty.getText());
            obj[2]=Q;
            int pr=p.getPROD_Price();
            obj[3]=pr;
            obj[4]=Q*pr;
            tm.addRow(obj);
            
        } catch (PersistentException ex) {
            Logger.getLogger(Invoice.class.getName()).log(Level.SEVERE, null, ex);
        }
        calTotal(tm);
        return false;
    }
        private boolean additem(int id) throws NumberFormatException {
        int code = id;
        int count = tm.getRowCount();
        for (int i = 0; i<count; i++) {
            int value = (int) tm.getValueAt(i,0);
            if (code==value) {
                int previous = (int) tm.getValueAt(i, 2);
                int current = Integer.parseInt(txt_Qty.getText());
                tm.setValueAt(previous+current, i, 2);
                int Q=(int) tm.getValueAt(i, 2);
                int pr = (int) tm.getValueAt(i,3);
                tm.setValueAt(pr*Q, i, 4);
                calTotal(tm);
                return true;
            }
        }
        try {
            dto.Product p = dto.ProductDAO.getProductByORMID(code);
            Object[] obj =new Object[5];
            obj[0]=p.getPROD_Code();
            obj[1]=p.getPROD_Name();
            int Q=Integer.parseInt(txt_Qty.getText());
            obj[2]=Q;
            int pr=p.getPROD_Price();
            obj[3]=pr;
            obj[4]=Q*pr;
            tm.addRow(obj);
            
        } catch (PersistentException ex) {
            Logger.getLogger(Invoice.class.getName()).log(Level.SEVERE, null, ex);
        }
        calTotal(tm);
        return false;
    }

    private void calTotal(DefaultTableModel tm) {
        int total = 0;
        for(int i=0 ; i<tm.getRowCount();i++ ){
            total+=(int)tm.getValueAt(i, 4);
        }
        lbl_total.setText(total+"");
    }

    private void txt_QtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_QtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_QtyActionPerformed

    private void btn_proceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_proceedActionPerformed

        int count = tm.getRowCount();
        dto.Invoice_Product ip = dto.Invoice_ProductDAO.createInvoice_Product();
        dto.Invoice in=dto.InvoiceDAO.createInvoice();
        in.setCUST(null);
        in.setCUST_Name("Mansoor");
        in.setINV_Subtotal(0);
        in.setINV_Tax(0);
        in.setINV_Date(new Date());
        in.setINV_Total(Integer.parseInt(lbl_total.getText()));
        try {
            in.setStaffS(dto.StaffDAO.getStaffByORMID(1));
            dto.InvoiceDAO.save(in);
        } catch (PersistentException ex) {
            Logger.getLogger(Invoice.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(int i=0;i<count;i++){
            ip.setINV_Number(in);
            int value = (int) tm.getValueAt(i, 0);
            int qty = (int)tm.getValueAt(i, 2);
            dto.Product p;
            try {
                p = dto.ProductDAO.getProductByORMID(value);
                ip.setProductPROD_Code(p);
                ip.setQuantity(qty);
                dto.Invoice_ProductDAO.save(ip);
            } catch (PersistentException ex) {
                Logger.getLogger(Invoice.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_btn_proceedActionPerformed

    private void btn_deleteitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteitemActionPerformed
        int v = tbl_sales.getSelectedRow();
        if(v!=-1){
            int q = (int) tbl_sales.getValueAt(v, 4);
            int total = Integer.parseInt(lbl_total.getText());
            lbl_total.setText((total-q)+"");
            tm.removeRow(v);
        }
        else{
            JOptionPane.showMessageDialog(this, "Please select item!");
        }
    }//GEN-LAST:event_btn_deleteitemActionPerformed

    private void btn_decqtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_decqtyActionPerformed
        int v = tbl_sales.getSelectedRow();
        if(v!=-1){
            int c=(int) tbl_sales.getValueAt(v, 2);
            if(c==1){
                return;
            }
            tbl_sales.setValueAt(c-1, v, 2);
            int q = (int) tbl_sales.getValueAt(v, 4);
            int p = (int) tbl_sales.getValueAt(v, 3);
            tbl_sales.setValueAt(q-p, v, 4);
            int curr =Integer.parseInt(lbl_total.getText());
            int n = curr - p;
            lbl_total.setText(n+"");
        }
        else{
            JOptionPane.showMessageDialog(this, "Please select item!");
        }
    }//GEN-LAST:event_btn_decqtyActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        MainMenu m = new MainMenu(person);
        m.setVisible(true);
        close();
       
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        login m = new login();
        m.setVisible(true);
        close();
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void txt_codeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_codeFocusGained
        if(jCheckBox1.isSelected())
        connectArduino("COM8");
    }//GEN-LAST:event_txt_codeFocusGained

    private void txt_codePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txt_codePropertyChange
 
    }//GEN-LAST:event_txt_codePropertyChange

    private void txt_codeInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txt_codeInputMethodTextChanged

    }//GEN-LAST:event_txt_codeInputMethodTextChanged

    private void txt_codeCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_codeCaretUpdate

    }//GEN-LAST:event_txt_codeCaretUpdate

    private void txt_codeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_codeFocusLost
        if(jCheckBox1.isSelected())
        disconnectArduino();
    }//GEN-LAST:event_txt_codeFocusLost

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Invoice("Mansoor").setVisible(true);
            }
        });
    }
    public void close(){							
											
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);			
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);		
											
    }
    
        public boolean connectArduino(String port){
        
        System.out.println("connectArduino");
        
        boolean success = false;
        SerialPort serialPort = new SerialPort(port);
        try {
            serialPort.openPort();
            serialPort.setParams(
                    SerialPort.BAUDRATE_9600,
                    SerialPort.DATABITS_8,
                    SerialPort.STOPBITS_1,
                    SerialPort.PARITY_NONE);
            serialPort.setEventsMask(MASK_RXCHAR);
            serialPort.addEventListener((SerialPortEvent serialPortEvent) -> {
                if(serialPortEvent.isRXCHAR()){
                    try {
                        String st = serialPort.readString(serialPortEvent
                                .getEventValue());
                        System.out.println(st);
                        
                        //Update label in ui thread
                       // txt_code.setText(st);
                        additem(Integer.parseInt(st));
                    } catch (SerialPortException ex) {
                        Logger.getLogger(Invoice.class.getName())
                                .log(Level.SEVERE, null, ex);
                    }
                    
                }
            });
            
            arduinoPort = serialPort;
            success = true;
        } catch (SerialPortException ex) {
            Logger.getLogger(Invoice.class.getName())
                    .log(Level.SEVERE, null, ex);
            System.out.println("SerialPortException: " + ex.toString());
        }

        return success;
    }
    
    public void disconnectArduino(){
        
        System.out.println("disconnectArduino()");
        if(arduinoPort != null){
            try {
                arduinoPort.removeEventListener();
                
                if(arduinoPort.isOpened()){
                    arduinoPort.closePort();
                }
                
            } catch (SerialPortException ex) {
                Logger.getLogger(Invoice.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_additem;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_decqty;
    private javax.swing.JButton btn_deleteitem;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_proceed;
    private javax.swing.JComboBox<String> cb_paymethod;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lbl_date;
    private javax.swing.JLabel lbl_salesperson;
    private javax.swing.JLabel lbl_time;
    private javax.swing.JLabel lbl_total;
    private javax.swing.JTable tbl_sales;
    private javax.swing.JTextField txt_Qty;
    private javax.swing.JTextField txt_code;
    // End of variables declaration//GEN-END:variables
}

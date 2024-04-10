package demo;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
//import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Exp_calculatorr  extends javax.swing.JFrame {

	    public Exp_calculatorr() {
	        initComponents();
	    }
	    
	    @SuppressWarnings("unchecked")
	    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	    private void initComponents() {

	        jPanel1 = new javax.swing.JPanel();
	        jButtonC = new javax.swing.JButton();
	        output = new javax.swing.JTextField();
	        jButtondot = new javax.swing.JButton();
	        jButtonD = new javax.swing.JButton();
	        jButton9 = new javax.swing.JButton();
	        jButton0 = new javax.swing.JButton();
	        jButton7 = new javax.swing.JButton();
	        jButton8 = new javax.swing.JButton();
	        jButton4 = new javax.swing.JButton();
	        jButtonMi = new javax.swing.JButton();
	        jButton5 = new javax.swing.JButton();
	        jButton6 = new javax.swing.JButton();
	        jButtonMu = new javax.swing.JButton();
	        jButton1 = new javax.swing.JButton();
	        jButton2 = new javax.swing.JButton();
	        jButton3 = new javax.swing.JButton();
	        jButtonEq = new javax.swing.JButton();
	        jButtonP = new javax.swing.JButton();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	        setBackground(new java.awt.Color(51, 51, 51));

	        jPanel1.setBackground(new java.awt.Color(21, 21, 21));

	        jButtonC.setBackground(new java.awt.Color(31, 31, 31));
	        jButtonC.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
	        jButtonC.setForeground(new java.awt.Color(255, 255, 255));
	        jButtonC.setText("C");
	        jButtonC.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButtonCActionPerformed(evt);
	            }
	        });

	        output.setEditable(false);
	        output.setBackground(new java.awt.Color(21, 21, 21));
	        output.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
	        output.setForeground(new java.awt.Color(255, 255, 255));
	        output.setText("0");
	        output.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

	        jButtondot.setBackground(new java.awt.Color(31, 31, 31));
	        jButtondot.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
	        jButtondot.setForeground(new java.awt.Color(255, 255, 255));
	        jButtondot.setText(".");
	        jButtondot.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButtondotActionPerformed(evt);
	            }
	        });

	        jButtonD.setBackground(new java.awt.Color(26, 26, 26));
	        jButtonD.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
	        jButtonD.setForeground(new java.awt.Color(255, 255, 255));
	        jButtonD.setText("/");
	        jButtonD.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButtonDActionPerformed(evt);
	            }
	        });

	        jButton9.setBackground(new java.awt.Color(31, 31, 31));
	        jButton9.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
	        jButton9.setForeground(new java.awt.Color(255, 255, 255));
	        jButton9.setText("9");
	        jButton9.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton9ActionPerformed(evt);
	            }
	        });

	        jButton0.setBackground(new java.awt.Color(31, 31, 31));
	        jButton0.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
	        jButton0.setForeground(new java.awt.Color(255, 255, 255));
	        jButton0.setText("0");
	        jButton0.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton0ActionPerformed(evt);
	            }
	        });

	        jButton7.setBackground(new java.awt.Color(31, 31, 31));
	        jButton7.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
	        jButton7.setForeground(new java.awt.Color(255, 255, 255));
	        jButton7.setText("7");
	        jButton7.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton7ActionPerformed(evt);
	            }
	        });

	        jButton8.setBackground(new java.awt.Color(31, 31, 31));
	        jButton8.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
	        jButton8.setForeground(new java.awt.Color(255, 255, 255));
	        jButton8.setText("8");
	        jButton8.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton8ActionPerformed(evt);
	            }
	        });

	        jButton4.setBackground(new java.awt.Color(31, 31, 31));
	        jButton4.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
	        jButton4.setForeground(new java.awt.Color(255, 255, 255));
	        jButton4.setText("4");
	        jButton4.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton4ActionPerformed(evt);
	            }
	        });

	        jButtonMi.setBackground(new java.awt.Color(26, 26, 26));
	        jButtonMi.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
	        jButtonMi.setForeground(new java.awt.Color(255, 255, 255));
	        jButtonMi.setText("-");
	        jButtonMi.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButtonMiActionPerformed(evt);
	            }
	        });

	        jButton5.setBackground(new java.awt.Color(31, 31, 31));
	        jButton5.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
	        jButton5.setForeground(new java.awt.Color(255, 255, 255));
	        jButton5.setText("5");
	        jButton5.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton5ActionPerformed(evt);
	            }
	        });

	        jButton6.setBackground(new java.awt.Color(31, 31, 31));
	        jButton6.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
	        jButton6.setForeground(new java.awt.Color(255, 255, 255));
	        jButton6.setText("6");
	        jButton6.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton6ActionPerformed(evt);
	            }
	        });

	        jButtonMu.setBackground(new java.awt.Color(26, 26, 26));
	        jButtonMu.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
	        jButtonMu.setForeground(new java.awt.Color(255, 255, 255));
	        jButtonMu.setText("*");
	        jButtonMu.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButtonMuActionPerformed(evt);
	            }
	        });

	        jButton1.setBackground(new java.awt.Color(31, 31, 31));
	        jButton1.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
	        jButton1.setForeground(new java.awt.Color(255, 255, 255));
	        jButton1.setText("1");
	        jButton1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton1ActionPerformed(evt);
	            }
	        });

	        jButton2.setBackground(new java.awt.Color(31, 31, 31));
	        jButton2.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
	        jButton2.setForeground(new java.awt.Color(255, 255, 255));
	        jButton2.setText("2");
	        jButton2.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton2ActionPerformed(evt);
	            }
	        });

	        jButton3.setBackground(new java.awt.Color(26, 26, 26));
	        jButton3.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
	        jButton3.setForeground(new java.awt.Color(255, 255, 255));
	        jButton3.setText("3");
	        jButton3.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton3ActionPerformed(evt);
	            }
	        });

	        jButtonEq.setBackground(new java.awt.Color(51, 102, 255));
	        jButtonEq.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
	        jButtonEq.setForeground(new java.awt.Color(255, 255, 255));
	        jButtonEq.setText("=");
	        jButtonEq.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButtonEqActionPerformed(evt);
	            }
	        });

	        jButtonP.setBackground(new java.awt.Color(31, 31, 31));
	        jButtonP.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
	        jButtonP.setForeground(new java.awt.Color(255, 255, 255));
	        jButtonP.setText("+");
	        jButtonP.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButtonPActionPerformed(evt);
	            }
	        });

	        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
	        jPanel1.setLayout(jPanel1Layout);
	        jPanel1Layout.setHorizontalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(jButtonD, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                        .addGroup(jPanel1Layout.createSequentialGroup()
	                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                            .addComponent(jButtonMi, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addGroup(jPanel1Layout.createSequentialGroup()
	                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                            .addComponent(jButtonP, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addGroup(jPanel1Layout.createSequentialGroup()
	                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                            .addComponent(jButtonMu, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addGroup(jPanel1Layout.createSequentialGroup()
	                            .addComponent(jButtonC, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                            .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                            .addComponent(jButtondot, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                            .addComponent(jButtonEq, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );
	        jPanel1Layout.setVerticalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addGap(84, 84, 84)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jButtonD, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jButtonP, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jButtonMi, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jButtonMu, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jButtonC, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jButtonEq, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jButtondot, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addContainerGap(15, Short.MAX_VALUE))
	        );

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        );

	        pack();
	    }// </editor-fold>//GEN-END:initComponents
	    
	    private void appendText(String num){
	        if(num.equals("+") || num.equals("-") || num.equals("*") || num.equals("/")){
	            String curr = output.getText();
	            if(curr.contains("+") || curr.contains("-") || curr.contains("*") || curr.contains("/")){
	                evaluate();
	            }
	        }
	        if(output.getText().equals("0")){
	            output.setText(num+"");
	        }else{
	            output.setText(output.getText() + num);
	        }
	    }
	    
	    private void evaluate(){
	        String str = output.getText();
	        String opr1;
	        String opr2;
	        char operator = '.';
	        int operatorIndex = -1;

	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            if (c == '+' || c == '-' || c == '*' || c == '/') {
	                operatorIndex = i;
	                operator = c;
	                break;
	            }
	        }

	        if (operatorIndex != -1) {
	            opr1 = str.substring(0, operatorIndex);
	            opr2 = str.substring(operatorIndex + 1); 
	        } else {
	            output.setText("Error: No operator found");
	            return;
	        }

	        double a = Double.parseDouble(opr1);
	        double b = Double.parseDouble(opr2);

	        switch (operator) {
	            case '+' -> output.setText((a + b) + "");
	            case '-' -> output.setText((a - b) + "");
	            case '*' -> output.setText((a * b) + "");
	            case '/' -> {
	                if (b != 0) {
	                    output.setText((a / b) + "");
	                } else {
	                    output.setText("Error: Division by zero");
	                }
	            }
	            default -> {
	            }
	        }
	    }
	    
	    private void jButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCActionPerformed
	        output.setText("");
	    }//GEN-LAST:event_jButtonCActionPerformed

	    private void jButtondotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondotActionPerformed
	        appendText(".");
	    }//GEN-LAST:event_jButtondotActionPerformed

	    private void jButtonDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDActionPerformed
	        appendText("/");
	    }//GEN-LAST:event_jButtonDActionPerformed

	    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
	        appendText("9");
	    }//GEN-LAST:event_jButton9ActionPerformed

	    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
	        appendText("0");
	    }//GEN-LAST:event_jButton0ActionPerformed

	    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
	        appendText("7");
	    }//GEN-LAST:event_jButton7ActionPerformed

	    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
	        appendText("8");
	    }//GEN-LAST:event_jButton8ActionPerformed

	    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
	        appendText("4");
	    }//GEN-LAST:event_jButton4ActionPerformed

	    private void jButtonMiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMiActionPerformed
	        appendText("-");
	    }//GEN-LAST:event_jButtonMiActionPerformed

	    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
	        appendText("5");
	    }//GEN-LAST:event_jButton5ActionPerformed

	    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
	        appendText("6");
	    }//GEN-LAST:event_jButton6ActionPerformed

	    private void jButtonMuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMuActionPerformed
	        appendText("*");
	    }//GEN-LAST:event_jButtonMuActionPerformed

	    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
	        appendText("1");
	    }//GEN-LAST:event_jButton1ActionPerformed

	    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
	        appendText("2");
	    }//GEN-LAST:event_jButton2ActionPerformed

	    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
	        appendText("3");
	    }//GEN-LAST:event_jButton3ActionPerformed

	    private void jButtonEqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEqActionPerformed
	        evaluate();
	    }//GEN-LAST:event_jButtonEqActionPerformed

	    private void jButtonPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPActionPerformed
	        appendText("+");
	    }//GEN-LAST:event_jButtonPActionPerformed

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
	            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	        //</editor-fold>

	        /* Create and display the form */
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new Exp_calculatorr().setVisible(true);
	            }
	        });
	    }

	    // Variables declaration - do not modify//GEN-BEGIN:variables
	    private javax.swing.JButton jButton0;
	    private javax.swing.JButton jButton1;
	    private javax.swing.JButton jButton2;
	    private javax.swing.JButton jButton3;
	    private javax.swing.JButton jButton4;
	    private javax.swing.JButton jButton5;
	    private javax.swing.JButton jButton6;
	    private javax.swing.JButton jButton7;
	    private javax.swing.JButton jButton8;
	    private javax.swing.JButton jButton9;
	    private javax.swing.JButton jButtonC;
	    private javax.swing.JButton jButtonD;
	    private javax.swing.JButton jButtonEq;
	    private javax.swing.JButton jButtonMi;
	    private javax.swing.JButton jButtonMu;
	    private javax.swing.JButton jButtonP;
	    private javax.swing.JButton jButtondot;
	    private javax.swing.JPanel jPanel1;
	    private javax.swing.JTextField output;
	    // End of variables declaration//GEN-END:variables
	}
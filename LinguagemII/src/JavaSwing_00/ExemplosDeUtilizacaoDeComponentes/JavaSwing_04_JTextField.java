package JavaSwing_00.ExemplosDeUtilizacaoDeComponentes;

public class JavaSwing_04_JTextField extends javax.swing.JFrame {

    public JavaSwing_04_JTextField() {
        initComponents();
        
        //Iniciar o JFrame no meio da tela.
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtResultado = new javax.swing.JTextField();
        btnCliqueAqui = new javax.swing.JButton();
        lblMensagemOlaMundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema IFBA");
        setResizable(false);

        txtResultado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnCliqueAqui.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCliqueAqui.setText("Clique aqui");
        btnCliqueAqui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliqueAquiActionPerformed(evt);
            }
        });

        lblMensagemOlaMundo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblMensagemOlaMundo.setText("Olá Mundo!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lblMensagemOlaMundo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(btnCliqueAqui)
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCliqueAqui)
                    .addComponent(lblMensagemOlaMundo))
                .addGap(94, 94, 94)
                .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCliqueAquiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCliqueAquiActionPerformed

        //Lendo o texto de um componente e atribuindo-o a uma variável.
        String mensagem = lblMensagemOlaMundo.getText();

        //Atribuindo o valor de uma variável a um campo de texto.
        txtResultado.setText(mensagem);
    }//GEN-LAST:event_btnCliqueAquiActionPerformed

    public static void main(String args[]) {
      
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JavaSwing_04_JTextField.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JavaSwing_04_JTextField.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JavaSwing_04_JTextField.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JavaSwing_04_JTextField.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JavaSwing_04_JTextField().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCliqueAqui;
    private javax.swing.JLabel lblMensagemOlaMundo;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}

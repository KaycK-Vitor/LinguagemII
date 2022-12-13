//Definição de pacote ao qual a classe pertence
package BancoDeDados_02_Cadastro;

//Importação de classes
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


//Criação de classe pública que herda da classe JFrame
public class CadastroDeContaGUI_RetornaIdGerado extends javax.swing.JFrame {

    //Construtor da classe
    public CadastroDeContaGUI_RetornaIdGerado() {
        initComponents();
        
        //Abrir o formulário centralizado na horizontal e vertical
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        txtSaldo = new javax.swing.JTextField();
        lblLimite = new javax.swing.JLabel();
        txtLimite = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema IFBA");
        setResizable(false);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTitulo.setText("Cadastro de Conta");

        lblNumero.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNumero.setText("Número:");

        lblSaldo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSaldo.setText("Saldo:");

        txtNumero.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroKeyTyped(evt);
            }
        });

        txtSaldo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSaldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSaldoKeyTyped(evt);
            }
        });

        lblLimite.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblLimite.setText("Limite:");

        txtLimite.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtLimite.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLimiteKeyTyped(evt);
            }
        });

        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLimite, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtLimite, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCadastrar)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblTitulo)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumero)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSaldo)
                    .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLimite)
                    .addComponent(txtLimite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnLimpar))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Limpando todos os campos da tela
    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        
        txtNumero.setText("");
        txtSaldo.setText("");
        txtLimite.setText("");
        
    }//GEN-LAST:event_btnLimparActionPerformed

    //Validação do campo de texto número
    private void txtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyTyped
        
        PermitirDigitarSomenteNumeros(evt);
        
    }//GEN-LAST:event_txtNumeroKeyTyped

    //Validação do campo de texto saldo
    private void txtSaldoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSaldoKeyTyped
        
        PermitirDigitarSomenteNumerosEVirgula(evt);
        
    }//GEN-LAST:event_txtSaldoKeyTyped

    //Validação do campo de texto limite
    private void txtLimiteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLimiteKeyTyped
       
        PermitirDigitarSomenteNumerosEVirgula(evt);
        
    }//GEN-LAST:event_txtLimiteKeyTyped

    
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        
        
        //Lê o número digitado no campo de texto e armazena em uma variável (String)
        String strNumero = txtNumero.getText();
        
        //Converte a String capturada anteriormente para int a armazena em uma variável (int) 
        int numero = Integer.parseInt(strNumero);
        
        
        //Lê o saldo digitado no campo de texto e armazena em uma variável (String)
        String strSaldo = txtSaldo.getText();
        
        //Substitui, dentro da String, vírgula por ponto
        strSaldo = strSaldo.replace(',', '.');
        
        //Converte a String capturada anteriormente para double a armazena em uma variável (double) 
        double saldo = Double.parseDouble(strSaldo);
        
        
        //Lê o limite digitado no campo de texto e armazena em uma variável (String)
        String strLimite = txtLimite.getText();
        
        //Substitui, dentro da String, vírgula por ponto
        strLimite = strLimite.replace(',', '.');
        
        //Converte a String capturada anteriormente para double a armazena em uma variável (double) 
        double limite = Double.parseDouble(strLimite);

        
        //Cria um objeto gerenciador de conexao com o banco de dados
        GerenciadorBD bd = new GerenciadorBD();

        //realiza conexão com o banco de dados
        Connection conexao = bd.Conectar();
        
        //Tenta executar o conjunto de instruções abaixo
        try 
        {
            //sql a ser executado no banco de dados
            String sql = "INSERT INTO conta (numero, saldo, limite) VALUES (?, ?, ?)";
            
            //Cria array que guarda as colunas a serem retornadas após insert
            String colunasGeradas[] = { "id" };

            //cria o comando a ser executado no banco de dados
            PreparedStatement comando = conexao.prepareStatement(sql, colunasGeradas);

            //Combina os valores lidos do teclado com o sql acima
            comando.setInt(1, numero);
            comando.setDouble(2, saldo);
            comando.setDouble(3, limite);

            //executa o comando no banco de dados
            comando.execute();

            //resgata id gerado automaticamente, após a execução do insert
            ResultSet resultado = comando.getGeneratedKeys();
            
            int idGerado = 0;

            //lê id gerado automaticamente
            if (resultado.next()) {
                idGerado = resultado.getInt(1);
            }
            
            //Fecha o objeto resultset (estrutura de tabela)
            resultado.close();

            //Exibe mensagem de sucesso e Id gerado.
            JOptionPane.showMessageDialog(this, "Conta cadastrada com sucesso.\nId gerado: " + idGerado);
        } 
        //Captura e trata uma exceção de SQL
        catch (SQLException ex) 
        {
            //Exibe mensagem de exceção
            JOptionPane.showMessageDialog(this, "Nao conseguiu cadastrar uma nova conta." + ex.getMessage());
        }
        //Executa independentemente de ocorrer exceção
        finally
        {
            //Desconecta do banco de dados
            bd.Desconectar();
        }
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void PermitirDigitarSomenteNumeros(java.awt.event.KeyEvent evt)
    {
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c))
        {
            evt.consume();
        }
    }
    
        private void PermitirDigitarSomenteNumerosEVirgula(java.awt.event.KeyEvent evt)
    {
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c) && c != ',')
        {
            evt.consume();
        }
    }
    
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
            java.util.logging.Logger.getLogger(CadastroDeContaGUI_RetornaIdGerado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroDeContaGUI_RetornaIdGerado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroDeContaGUI_RetornaIdGerado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroDeContaGUI_RetornaIdGerado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new CadastroDeContaGUI_RetornaIdGerado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel lblLimite;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtLimite;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtSaldo;
    // End of variables declaration//GEN-END:variables
}

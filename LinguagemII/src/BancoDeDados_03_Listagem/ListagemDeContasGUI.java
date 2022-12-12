package BancoDeDados_03_Listagem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListagemDeContasGUI extends javax.swing.JFrame {

    public ListagemDeContasGUI() {
        initComponents();
        
         //Abrir o formulário centralizado na horizontal e vertical
        this.setLocationRelativeTo(null);
        
        CarregarTabelaContas();
    }
    
    private void CarregarTabelaContas() 
    {
        //Cria um gerenciador de conexao
        GerenciadorBD bd = new GerenciadorBD();
        
        //realiza conexão com o banco de dados
        Connection conexao = bd.Conectar();
    
        try 
        { 
            //sql a ser executado no banco de dados
            String sql = "SELECT id, numero, saldo, limite FROM conta;";

            //cria o comando a ser executado no banco de dados
            Statement comando = conexao.createStatement();
            
            //executa o comando no banco de dados e armazena a resposta na memória 
            ResultSet resultado = comando.executeQuery(sql);
            
            //Criando um objeto do tipo DefaultTableModel a partir da JTable tblContas 
            DefaultTableModel tabelaContas = (DefaultTableModel) tblContas.getModel();
        
            //percorre os dados armazenados na memória e apresentam na tela
            while(resultado.next()) {
                
                //Criando vetor com os dados buscados na memória, no ResultSet
                Object[] Conta = new Object[]
                {
                    resultado.getInt("id"),
                    resultado.getInt("numero"),
                    resultado.getDouble("saldo"),
                    resultado.getDouble("limite")
                };
                
                //Adicionando do vetor (registro [conta]) na Jtable
                tabelaContas.addRow(Conta);
            }
        }
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(this, "Nao conseguiu consultar os dados das contas.");
        } 
        finally 
        {
            //Desconecta o banco de dados
            bd.Desconectar();
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblContas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema IFBA");

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTitulo.setText("Listagem de Contas");

        tblContas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblContas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NÚMERO", "SALDO", "LIMITE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblContas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ListagemDeContasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListagemDeContasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListagemDeContasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListagemDeContasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListagemDeContasGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblContas;
    // End of variables declaration//GEN-END:variables


}

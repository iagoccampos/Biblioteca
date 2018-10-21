/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.view;

import enums.Screens;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import library.controller.ScreenController;
import library.db.ConnectionFactory;

/**
 *
 * @author Iago
 */
public class RentBookGUI extends javax.swing.JFrame {

    /**
     * Creates new form RentBook
     */
    public RentBookGUI() {
	initComponents();
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        booknameTf = new javax.swing.JTextField();
        rentBt = new javax.swing.JButton();
        registrationTf = new javax.swing.JFormattedTextField();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alugar Livro");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Alugar Livro"));

        jLabel1.setText("Matrícula:");

        jLabel2.setText("Livro:");

        booknameTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booknameTfActionPerformed(evt);
            }
        });

        rentBt.setText("Alugar");
        rentBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentBtActionPerformed(evt);
            }
        });

        registrationTf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        registrationTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrationTfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(booknameTf, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(registrationTf)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(rentBt)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(registrationTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(booknameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rentBt))
        );

        backButton.setText("Voltar");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backButton)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void booknameTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booknameTfActionPerformed
	// TODO add your handling code here:
    }//GEN-LAST:event_booknameTfActionPerformed

    private void rentBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentBtActionPerformed
	rentBt.setEnabled(false);

	String reg = registrationTf.getText();
	String bookTitle = booknameTf.getText();

	if(reg.equals("") || bookTitle.equals("")) {
	    JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos.");
	    rentBt.setEnabled(true);
	    return;
	}

	if(checkStudentPendencies(reg)) {
	    rentBook(reg, bookTitle);
	}

	rentBt.setEnabled(true);
    }//GEN-LAST:event_rentBtActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
	ScreenController.showScreen(Screens.LIBRARIAN);
    }//GEN-LAST:event_backButtonActionPerformed

    private void registrationTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrationTfActionPerformed
	// TODO add your handling code here:
    }//GEN-LAST:event_registrationTfActionPerformed

    private boolean checkStudentPendencies(String reg) {
	try {
	    Connection connection = ConnectionFactory.getConnection();
	    Statement statement = connection.createStatement();
	    ResultSet result = statement.executeQuery("SELECT count(1) FROM students "
		    + "WHERE registration=" + reg);
	    result.next();

	    //Se a matricula do aluno existe
	    if(result.getInt("count(1)") == 1) {
		result = statement.executeQuery("SELECT * FROM book_rental"
			+ " WHERE student_reg=" + reg);

		//Se o aluno nao possui nenhum livro alugado
		if(!result.next()) {
		    connection.close();
		    statement.close();
		    return true;
		}
		result.beforeFirst();

		Date rentDate;
		Date now = new Date();

		while(result.next()) {
		    rentDate = result.getDate("devolution_date");

		    long diffInMillies = rentDate.getTime() - now.getTime();
		    long dayDif = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

		    if(dayDif > 7) {
			connection.close();
			statement.close();
			JOptionPane.showMessageDialog(this, "Aluno possui pendências.");
			return false;
		    }
		}
	    }
	    else {
		JOptionPane.showMessageDialog(this, "Matrícula inexistente.");
	    }

	    connection.close();
	    statement.close();

	    return true;
	} catch(SQLException e) {
	    JOptionPane.showMessageDialog(this, "Problemas de conexão.");
	    e.printStackTrace();
	}

	return false;
    }

    private void rentBook(String reg, String bookTitle) {
	try {
	    Connection connection = ConnectionFactory.getConnection();
	    Statement statement = connection.createStatement();
	    ResultSet result = statement.executeQuery("SELECT * FROM books "
		    + "WHERE title='" + bookTitle + "'");

	    if(!result.next()) {
		JOptionPane.showMessageDialog(this, "Livro inexistente");
		connection.close();
		statement.close();
		return;
	    }

	    result.beforeFirst();
	    result.next();

	    if(result.getInt("availability") == 0) {
		JOptionPane.showMessageDialog(this, "Livro indisponivel.");
		connection.close();
		statement.close();
		return;
	    }

	    int bookId = result.getInt("book_id");

	    //Calculate devolution date
	    DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	    Date date = new Date();
	    Calendar c = Calendar.getInstance();
	    c.setTime(date);
	    c.add(Calendar.DATE, 7);
	    date = c.getTime();
	    String devolutionDate = format.format(date);

	    PreparedStatement preStatement = connection.prepareStatement("INSERT "
		    + "INTO `library`.`book_rental` (`book_id`, `student_reg`, "
		    + "`devolution_date`) VALUES ('" + bookId + "', '" + reg
		    + "', '" + devolutionDate + "');");

	    if(preStatement.executeUpdate() > 0) {
		JOptionPane.showMessageDialog(rootPane, "Livro alugado!");
	    }

	} catch(SQLException e) {
	    e.printStackTrace();
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
	    for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
		if("Nimbus".equals(info.getName())) {
		    javax.swing.UIManager.setLookAndFeel(info.getClassName());
		    break;
		}
	    }
	} catch(ClassNotFoundException ex) {
	    java.util.logging.Logger.getLogger(RentBookGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch(InstantiationException ex) {
	    java.util.logging.Logger.getLogger(RentBookGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch(IllegalAccessException ex) {
	    java.util.logging.Logger.getLogger(RentBookGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch(javax.swing.UnsupportedLookAndFeelException ex) {
	    java.util.logging.Logger.getLogger(RentBookGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>
	//</editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(new Runnable() {
	    public void run() {
		new RentBookGUI().setVisible(true);
	    }
	});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTextField booknameTf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField registrationTf;
    private javax.swing.JButton rentBt;
    // End of variables declaration//GEN-END:variables
}

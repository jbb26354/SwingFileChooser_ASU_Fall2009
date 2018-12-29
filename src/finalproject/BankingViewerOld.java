/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
  Banking Simulator Project for ACO102

  This is an advanced data-driven GUI that in my opinion we shouldn't be
  seeing until well into a 200-level programming course, but what the hell...

  This thing is like the ByLoan data scrubbing project that I had
  to do for Boeing during my Perfmet days, but I had the luxury of
  doing that project in Visual Basic for Applications for
  Microsoft Access, so it was much easier to do (but Mr. Sinon only
  gave me 3 days to finish that one, so it was stressful anyway!).

 NetBeans, as you can see, likes to have its code placed the way *it* wants.
 So, sorry if the code is not exactly how the instructions say it s/b done.
 This IDE also has a moderately steep learning curve (think: pull hair out
 trying to turn off all those warnings). However, in my opinion,
 trying to do a project like this in Notepad and the command-line java
 compiler is like trying to go deer hunting with a BB-gun...you have to use
 a *real* IDE for stuff like this.
 
 * Created on Nov 4, 2010, 9:57:25 PM
 */

package finalproject;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class BankingViewerOld extends javax.swing.JFrame
{
  // INSTANCE FIELDS
  // ===============

  private ArrayList<BankAccount> BankAccounts = new ArrayList<BankAccount>();

  // CONSTRUCTOR
  // ===========

  /** Creates new form BankingViewer */
  public BankingViewerOld()
  {
    initComponents();
  }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    javax.swing.JComboBox cmbAccounts = new javax.swing.JComboBox();
    javax.swing.JLabel amountLabel = new javax.swing.JLabel();
    javax.swing.JLabel accountidLabel = new javax.swing.JLabel();
    javax.swing.JLabel accounttypeLabel = new javax.swing.JLabel();
    javax.swing.JLabel currentbalanceLabel = new javax.swing.JLabel();
    javax.swing.JTextField amountText = new javax.swing.JTextField();
    javax.swing.JLabel accountidText = new javax.swing.JLabel();
    javax.swing.JLabel accountypeText = new javax.swing.JLabel();
    javax.swing.JLabel currentbalanceText = new javax.swing.JLabel();
    javax.swing.JButton depositButton = new javax.swing.JButton();
    javax.swing.JButton withdrawButton = new javax.swing.JButton();
    javax.swing.JButton addinterestButton = new javax.swing.JButton();
    javax.swing.JButton deductfeeButton = new javax.swing.JButton();
    javax.swing.JButton exitButton = new javax.swing.JButton();
    javax.swing.JMenuBar mnuMain = new javax.swing.JMenuBar();
    javax.swing.JMenu smnuFile = new javax.swing.JMenu();
    javax.swing.JMenuItem mnuiOpen = new javax.swing.JMenuItem();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    cmbAccounts.setMaximumRowCount(32);
    cmbAccounts.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Data Not Loaded" }));
    cmbAccounts.setName("cmbAccounts"); // NOI18N
    cmbAccounts.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        cmbAccountsItemStateChanged(evt);
      }
    });

    amountLabel.setText("Amount:");

    accountidLabel.setText("Account ID:");

    accounttypeLabel.setText("Account Type:");

    currentbalanceLabel.setText("Current Balance:");

    accountidText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    accountypeText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    currentbalanceText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    depositButton.setText("Deposit");
    depositButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        depositButtonActionPerformed(evt);
      }
    });

    withdrawButton.setText("Withdraw");
    withdrawButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        withdrawButtonActionPerformed(evt);
      }
    });

    addinterestButton.setText("Add Interest");
    addinterestButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        addinterestButtonActionPerformed(evt);
      }
    });

    deductfeeButton.setText("Deduct Fee");
    deductfeeButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        deductfeeButtonActionPerformed(evt);
      }
    });

    exitButton.setText("Exit");
    exitButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        exitButtonActionPerformed(evt);
      }
    });

    mnuMain.setName("mnuMain"); // NOI18N

    smnuFile.setText("File");

    mnuiOpen.setText("Open");
    mnuiOpen.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        mnuiOpenActionPerformed(evt);
      }
    });
    smnuFile.add(mnuiOpen);

    mnuMain.add(smnuFile);

    setJMenuBar(mnuMain);

    

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_exitButtonActionPerformed
    {//GEN-HEADEREND:event_exitButtonActionPerformed
      System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void depositButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_depositButtonActionPerformed
    {//GEN-HEADEREND:event_depositButtonActionPerformed
      JOptionPane.showMessageDialog(null, "Deposit Event Code goes here", "Deposit Button", 1);
    }//GEN-LAST:event_depositButtonActionPerformed

    private void withdrawButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_withdrawButtonActionPerformed
    {//GEN-HEADEREND:event_withdrawButtonActionPerformed
      JOptionPane.showMessageDialog(null, "Withdraw Event Code goes here", "Withdraw Button", 1);
    }//GEN-LAST:event_withdrawButtonActionPerformed

    private void addinterestButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_addinterestButtonActionPerformed
    {//GEN-HEADEREND:event_addinterestButtonActionPerformed
      JOptionPane.showMessageDialog(null, "Add Interest Event Code goes here", "Add Interest Button", 1);
    }//GEN-LAST:event_addinterestButtonActionPerformed

    private void deductfeeButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_deductfeeButtonActionPerformed
    {//GEN-HEADEREND:event_deductfeeButtonActionPerformed
      JOptionPane.showMessageDialog(null, "Deduct Fees Event Code goes here", "Deduct Fees Button", 1);
    }//GEN-LAST:event_deductfeeButtonActionPerformed

    private void mnuiOpenActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mnuiOpenActionPerformed
    {//GEN-HEADEREND:event_mnuiOpenActionPerformed
      /*
        OK, this is where all the action is. This event procedure uses the
        AccountReader and BadDataException classes, collectively known as
        the 'engine' of this project, to open the datafile, load and check
        the data, and then load the resulting accounts collection into the
        GUI.
      */

      /*
        The AccountReader class opens the datafile and does some file checking,
        then passes the data to the BadDataException class to verify that the
        data conforms to our business rules.
      */
      AccountReader objAccountReader = new AccountReader();
      if(objAccountReader.ShowStatus().substring(0,19).equals("Datafile records OK"))
      {
        // load the data into a temporary 2-dimensional array
        String[] temp;
        String delimiter = "\n";
        int intCount = 1;
        temp = objAccountReader.ShowData().split(delimiter);
        int intRows = objAccountReader.ShowRecordCount();
        String[][] strBuf = new String [intRows][3];
        int intTemp = 0;
        double dblTemp = 0.0;
        String strTemp = "";

        // load temporary array
        for(int i =0; i < intRows; i++)
        {
          for(int j =0; j < 3; j++)
          {
            strBuf[i][j] = temp[intCount].trim();
            //System.out.println(strBuf[i][j]);
            intCount++;
          }
        }

        /*
          instantiate all the account objects of the BankAccounts Collection,
          and add each account id to the combo box
        */
        for(int i =0; i < intRows; i++)
        {
          intTemp = Integer.parseInt(strBuf[i][0]);
          dblTemp = Double.parseDouble(strBuf[i][2]);

          if(strBuf[i][1].toLowerCase().equals("checking"))
          {
          BankAccounts.add(new CheckingAccount(intTemp, dblTemp));
          }
          else if(strBuf[i][1].toLowerCase().equals("saving"))
          {
            BankAccounts.add(new SavingsAccount(intTemp, dblTemp,12.0));
          }
          else if(strBuf[i][1].toLowerCase().equals("timedeposit"))
          {
            BankAccounts.add(new TimeDepositAccount(intTemp, dblTemp,12.0,5));
          }
          // put impossible to find code here
        }
        JOptionPane.showMessageDialog(null, "If only I could get this to work...", "Main | File | Open", 1);
      }
      else
      {
        JOptionPane.showMessageDialog(null, objAccountReader.ShowStatus(), "Main | File | Open", 1);
      }
    }//GEN-LAST:event_mnuiOpenActionPerformed

    private void cmbAccountsItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_cmbAccountsItemStateChanged
    {//GEN-HEADEREND:event_cmbAccountsItemStateChanged
      // TODO add your handling code here:
    }//GEN-LAST:event_cmbAccountsItemStateChanged

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BankingViewerOld app = new BankingViewerOld();
                app.setTitle("Banking Software User Interface");
                app.setVisible(true);
            }
        });
    }

  /**
   * @return the accounts
   */
  public ArrayList<BankAccount> getAccounts()
  {
    return BankAccounts;
  }

  public void setAccounts(ArrayList<BankAccount> BankAccounts)
  {
    this.BankAccounts = BankAccounts;
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  // End of variables declaration//GEN-END:variables

}
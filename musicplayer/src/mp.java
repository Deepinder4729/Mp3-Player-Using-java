import jaco.mp3.player.MP3Player;
import java.awt.Color;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
public class mp extends javax.swing.JFrame {

    public mp() {
        super("MP3 PLAYER");
        initComponents();  
        getContentPane().setBackground(Color.pink);
        jLabel1.setForeground(Color.black);
        lb.setForeground(Color.black);
        
        setSize(500,300);
        setVisible(true);
    }
    
    JFileChooser chooser=new JFileChooser();
       String song ="";
       MP3Player mp;
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bt1 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        add = new javax.swing.JButton();
        lb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("MP3 PLAYER");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 20, 200, 40);

        bt1.setText("PLAY");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        getContentPane().add(bt1);
        bt1.setBounds(30, 160, 90, 25);

        bt3.setText("STOP");
        bt3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt3MouseClicked(evt);
            }
        });
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });
        getContentPane().add(bt3);
        bt3.setBounds(270, 160, 100, 25);

        bt2.setText("PAUSE");
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });
        getContentPane().add(bt2);
        bt2.setBounds(140, 160, 110, 25);

        add.setText("ADD");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add);
        add.setBounds(30, 120, 90, 25);
        getContentPane().add(lb);
        lb.setBounds(30, 70, 420, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
       String lb1=lb.getText();
        if(lb1.isEmpty())
       {
           JOptionPane.showMessageDialog(this,"select a song");
       } 
        else {
            
            System.out.println(song);
            mp.play();
            System.out.println("play");
    }//GEN-LAST:event_bt1ActionPerformed
    }
    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        String lb1=lb.getText();
        if(lb1.isEmpty())
       {
           JOptionPane.showMessageDialog(this,"select a song");
       } 
        else
        {
        mp.pause();
       System.out.println("pause");
        }
    }//GEN-LAST:event_bt2ActionPerformed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
         String lb1=lb.getText();
        if(lb1.isEmpty())
       {
           JOptionPane.showMessageDialog(this,"select a song");
       }
        else
        {
        mp.stop();
        System.out.println("stop");
        }
    }//GEN-LAST:event_bt3ActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        del();       
        int r=chooser.showOpenDialog(this);
         if(r==JFileChooser.APPROVE_OPTION)
          {
           File f=chooser.getSelectedFile();
           String fl=f.getAbsolutePath();
           lb.setText(fl);
           song=fl;
           mp = new MP3Player(new File(song)); 
          }
    }//GEN-LAST:event_addActionPerformed

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
 
    }//GEN-LAST:event_addMouseClicked

    private void bt3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt3MouseClicked

    }//GEN-LAST:event_bt3MouseClicked
private void del()
{
String lb1=lb.getText();
if(lb1.isEmpty()){}
else
{   mp.pause();
}}
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(() -> {
            new mp().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lb;
    // End of variables declaration//GEN-END:variables
}
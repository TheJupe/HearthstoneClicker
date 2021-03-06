/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hearthstoneclicker;

import static hearthstoneclicker.HomeFrame.dust;
import static hearthstoneclicker.HomeFrame.gold;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author AlexJupe
 */
public class PackFrame extends javax.swing.JFrame {

    private ImageIcon[] cards = new ImageIcon[52];
    private ArrayList<ImageIcon> deck = new ArrayList<ImageIcon>();
    private Component frame;
    HomeFrame home = new HomeFrame();
    private int dustPack;
    
    /**
     * Creates new form PackFrame
     */
    public PackFrame() {
        initComponents();
        jLabelGoldAmtPacks.setText("" + gold);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonOpen = new javax.swing.JButton();
        jLabelCard1 = new javax.swing.JLabel();
        jLabelCard2 = new javax.swing.JLabel();
        jLabelCard3 = new javax.swing.JLabel();
        jLabelCard4 = new javax.swing.JLabel();
        jLabelCard5 = new javax.swing.JLabel();
        jLabelGold = new javax.swing.JLabel();
        jLabelGoldAmtPacks = new javax.swing.JLabel();
        jLabelDustPack = new javax.swing.JLabel();
        jLabelDustPackAmt = new javax.swing.JLabel();
        jLabelDust = new javax.swing.JLabel();
        jLabelDustAmt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });

        jLabel1.setText("Packs");

        jButtonOpen.setText("Open");
        jButtonOpen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonOpenMouseClicked(evt);
            }
        });

        jLabelCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hearthstoneclicker/images/150px-Card_back-Legend.png"))); // NOI18N
        jLabelCard1.setText("Card 1");

        jLabelCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hearthstoneclicker/images/150px-Card_back-Legend.png"))); // NOI18N
        jLabelCard2.setText("Card 2");

        jLabelCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hearthstoneclicker/images/150px-Card_back-Legend.png"))); // NOI18N
        jLabelCard3.setText("Card 3");

        jLabelCard4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hearthstoneclicker/images/150px-Card_back-Legend.png"))); // NOI18N
        jLabelCard4.setText("Card 4");

        jLabelCard5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hearthstoneclicker/images/150px-Card_back-Legend.png"))); // NOI18N
        jLabelCard5.setText("Card 5");

        jLabelGold.setText("Gold");

        jLabelDustPack.setText("Dust from this pack");

        jLabelDust.setText("Dust");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(183, 183, 183)
                            .addComponent(jLabelCard4)
                            .addGap(139, 139, 139)
                            .addComponent(jLabelCard5))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(61, 61, 61)
                            .addComponent(jLabelDust)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabelDustAmt)
                            .addGap(256, 256, 256)
                            .addComponent(jButtonOpen)
                            .addGap(180, 180, 180)
                            .addComponent(jLabelDustPack)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabelGold)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelGoldAmtPacks)
                        .addGap(311, 311, 311)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabelCard1)
                .addGap(84, 84, 84)
                .addComponent(jLabelCard2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(jLabelCard3)
                .addGap(97, 97, 97))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelDustPackAmt)
                .addGap(212, 212, 212))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelGold)
                            .addComponent(jLabelGoldAmtPacks))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonOpen)
                    .addComponent(jLabelDustPack)
                    .addComponent(jLabelDust)
                    .addComponent(jLabelDustAmt))
                .addGap(18, 18, 18)
                .addComponent(jLabelDustPackAmt)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCard1)
                    .addComponent(jLabelCard2)
                    .addComponent(jLabelCard3))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCard4)
                    .addComponent(jLabelCard5))
                .addContainerGap(180, Short.MAX_VALUE))
        );

        jLabelGoldAmtPacks.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonOpenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonOpenMouseClicked

          // TODO add your handling code here:
        // check if theres enough gold
        if (gold > 99) {
            gold = gold - 100;
            jLabelGoldAmtPacks.setText("" + gold);
            home.jLabelGoldAmt.setText("" + gold);
            home.repaint();
            System.out.println("set");

            //set dust pack to 0
             dustPack =0;
            
          //do it for the first card
            //load cards
            ImageIcon card1 = null;
            ImageIcon card2 = null;
            ImageIcon card3 = null;
            ImageIcon card4 = null;
            ImageIcon card5 = null;

            //reset card colors
            jLabelCard1.setForeground(Color.black);
            jLabelCard2.setForeground(Color.black);
            jLabelCard3.setForeground(Color.black);
            jLabelCard4.setForeground(Color.black);
            jLabelCard5.setForeground(Color.black);

            //checks if there has been a rare or better yet
            boolean rareInd = false;
            Random randomGenerator = new Random();

            //first card
            int randomInt = randomGenerator.nextInt(100);

            if (randomInt < 72) {
                jLabelCard1.setText("Common");

                try {
                    //load common card
                    card1 = LoadCommon();

                } catch (IOException ex) {
                    Logger.getLogger(PackFrame.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (randomInt > 71 && randomInt < 94) {
                jLabelCard1.setText("Rare");
                jLabelCard1.setForeground(Color.BLUE);
                try {
                    //load common card
                    card1 = LoadRare();

                } catch (IOException ex) {
                    Logger.getLogger(PackFrame.class.getName()).log(Level.SEVERE, null, ex);
                }

                rareInd = true;
            } else if (randomInt > 93 && randomInt < 99) {
                jLabelCard1.setText("Epic");
                jLabelCard1.setForeground(Color.pink);
                rareInd = true;
                try {
                    //load common card
                    card1 = LoadEpic();

                } catch (IOException ex) {
                    Logger.getLogger(PackFrame.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (randomInt > 98 && randomInt < 101) {
                jLabelCard1.setText("Legendary");
                jLabelCard1.setForeground(Color.YELLOW);
                rareInd = true;
                try {
                    //load common card
                    card1 = LoadLegendary();

                } catch (IOException ex) {
                    Logger.getLogger(PackFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            jLabelCard1.setIcon(card1);
//----------------------------------------------------------------------------------------
            //second card
            randomInt = randomGenerator.nextInt(100);

            if (randomInt < 72) {
                jLabelCard2.setText("Common");
                try {
                    //load common card
                    card2 = LoadCommon();

                } catch (IOException ex) {
                    Logger.getLogger(PackFrame.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (randomInt > 71 && randomInt < 94) {
                jLabelCard2.setText("Rare");
                jLabelCard2.setForeground(Color.BLUE);
                try {
                    //load common card
                    card2 = LoadRare();

                } catch (IOException ex) {
                    Logger.getLogger(PackFrame.class.getName()).log(Level.SEVERE, null, ex);
                }

                rareInd = true;
            } else if (randomInt > 93 && randomInt < 99) {
                jLabelCard2.setText("Epic");
                jLabelCard2.setForeground(Color.pink);
                rareInd = true;
                try {
                    //load common card
                    card2 = LoadEpic();

                } catch (IOException ex) {
                    Logger.getLogger(PackFrame.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (randomInt > 98 && randomInt < 101) {
                jLabelCard2.setText("Legendary");
                jLabelCard2.setForeground(Color.YELLOW);
                rareInd = true;
                try {
                    //load common card
                    card2 = LoadLegendary();

                } catch (IOException ex) {
                    Logger.getLogger(PackFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            jLabelCard2.setIcon(card2);
//----------------------------------------------------------------------------------------

            //third card
            randomInt = randomGenerator.nextInt(100);

            if (randomInt < 72) {
                jLabelCard3.setText("Common");

                try {
                    //load common card
                    card3 = LoadCommon();

                } catch (IOException ex) {
                    Logger.getLogger(PackFrame.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (randomInt > 71 && randomInt < 94) {
                jLabelCard3.setText("Rare");
                jLabelCard3.setForeground(Color.BLUE);

                try {
                    //load common card
                    card3 = LoadRare();

                } catch (IOException ex) {
                    Logger.getLogger(PackFrame.class.getName()).log(Level.SEVERE, null, ex);
                }

                rareInd = true;
            } else if (randomInt > 93 && randomInt < 99) {
                jLabelCard3.setText("Epic");
                jLabelCard5.setForeground(Color.pink);
                rareInd = true;
                try {
                    //load common card
                    card3 = LoadEpic();

                } catch (IOException ex) {
                    Logger.getLogger(PackFrame.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (randomInt > 98 && randomInt < 101) {
                jLabelCard3.setText("Legendary");
                jLabelCard3.setForeground(Color.YELLOW);
                rareInd = true;

                try {
                    //load common card
                    card3 = LoadLegendary();

                } catch (IOException ex) {
                    Logger.getLogger(PackFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            jLabelCard3.setIcon(card3);
//----------------------------------------------------------------------------------------
            //fourth card
            randomInt = randomGenerator.nextInt(100);

            if (randomInt < 72) {
                jLabelCard4.setText("Common");

                try {
                    //load common card
                    card4 = LoadCommon();

                } catch (IOException ex) {
                    Logger.getLogger(PackFrame.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (randomInt > 71 && randomInt < 94) {
                jLabelCard4.setText("Rare");
                jLabelCard4.setForeground(Color.BLUE);

                try {
                    //load common card
                    card4 = LoadRare();

                } catch (IOException ex) {
                    Logger.getLogger(PackFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                rareInd = true;
            } else if (randomInt > 93 && randomInt < 99) {
                jLabelCard4.setText("Epic");
                jLabelCard4.setForeground(Color.pink);
                rareInd = true;

                try {
                    //load common card
                    card4 = LoadEpic();

                } catch (IOException ex) {
                    Logger.getLogger(PackFrame.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (randomInt > 98 && randomInt < 101) {
                jLabelCard4.setText("Legendary");
                jLabelCard4.setForeground(Color.YELLOW);
                rareInd = true;
                try {
                    //load common card
                    card4 = LoadLegendary();

                } catch (IOException ex) {
                    Logger.getLogger(PackFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            jLabelCard4.setIcon(card4);
//----------------------------------------------------------------------------------------
            //fith card
            if (rareInd == false) {
                randomInt = randomGenerator.nextInt(100 - 72) + 72;
                System.out.println("THERE WAS NO RARE");
                System.out.println(randomInt);
            } else {
                System.out.println("There was a rare");
                randomInt = randomGenerator.nextInt(100);
                System.out.println(randomInt);
            }

            if (randomInt < 72) {
                jLabelCard5.setText("Common");
                try {
                    //load common card
                    card5 = LoadCommon();

                } catch (IOException ex) {
                    Logger.getLogger(PackFrame.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (randomInt > 71 && randomInt < 94) {
                jLabelCard5.setText("Rare");
                jLabelCard5.setForeground(Color.BLUE);

                try {
                    //load common card
                    card5 = LoadRare();

                } catch (IOException ex) {
                    Logger.getLogger(PackFrame.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (randomInt > 93 && randomInt < 99) {
                jLabelCard5.setText("Epic");
                jLabelCard5.setForeground(Color.pink);
                try {
                    //load common card
                    card5 = LoadEpic();

                } catch (IOException ex) {
                    Logger.getLogger(PackFrame.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (randomInt > 98 && randomInt < 101) {
                jLabelCard5.setText("Legendary");
                jLabelCard5.setForeground(Color.YELLOW);
                try {
                    //load common card
                    card5 = LoadLegendary();

                } catch (IOException ex) {
                    Logger.getLogger(PackFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            jLabelCard5.setIcon(card5);
            
            jLabelDustPackAmt.setText("" + dustPack);
            dust = dust + dustPack;
            jLabelDustAmt.setText("" + dust);
            
        } else {
            JOptionPane.showMessageDialog(frame,
                    "Not enough gold");
        }
    }//GEN-LAST:event_jButtonOpenMouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:

    }//GEN-LAST:event_formWindowClosed

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        // TODO add your handling code here:
        jLabelGoldAmtPacks.setText("" + gold);
        jLabelDustAmt.setText("" + dust);
    }//GEN-LAST:event_formMouseMoved

    public ImageIcon LoadCommon() throws IOException {
        Random randomGenerator = new Random();

        ImageIcon cardIcon = null;
       
        int randomInt = randomGenerator.nextInt(10 - 1) + 1;
      cardIcon = createImageIcon("images/common/" + randomInt + ".png"); 
       /**
        try {
            cardIcon = (new ImageIcon(ImageIO.read(new File("src\\hearthstoneclicker\\images\\common\\" + randomInt + ".png"))));
        } catch (IOException ex) {
            Logger.getLogger(PackFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        dustPack = dustPack + 5;
        return cardIcon;
    }

    public ImageIcon LoadRare() throws IOException {
        Random randomGenerator = new Random();

        ImageIcon cardIcon = null;
        
        int randomInt = randomGenerator.nextInt(10 - 1) + 1;
         cardIcon = createImageIcon("images/rare/" + randomInt + ".png"); 
        /**
        try {
            cardIcon = (new ImageIcon(ImageIO.read(new File("src\\hearthstoneclicker\\images\\rare\\" + randomInt + ".png"))));
        } catch (IOException ex) {
            Logger.getLogger(PackFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        dustPack = dustPack + 20;
        return cardIcon;
    }

    public ImageIcon LoadEpic() throws IOException {
        Random randomGenerator = new Random();

        ImageIcon cardIcon = null;
        
        int randomInt = randomGenerator.nextInt(5 - 1) + 1;
         cardIcon = createImageIcon("images/epic/" + randomInt + ".png"); 
        
         /**
        try {
            cardIcon = (new ImageIcon(ImageIO.read(new File("src\\hearthstoneclicker\\images\\epic\\" + randomInt + ".png"))));
        } catch (IOException ex) {
            Logger.getLogger(PackFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        * */
        dustPack = dustPack + 100;
        return cardIcon;
    }

    public ImageIcon LoadLegendary() throws IOException {
        Random randomGenerator = new Random();

        ImageIcon cardIcon = null;
        
        int randomInt = randomGenerator.nextInt(5 - 1) + 1;
         cardIcon = createImageIcon("images/legendary/" + randomInt + ".png"); 
         /**
        try {
            cardIcon = (new ImageIcon(ImageIO.read(new File("src\\hearthstoneclicker\\images\\legendary\\" + randomInt + ".png"))));
        } catch (IOException ex) {
            Logger.getLogger(PackFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
*/
        dustPack = dustPack + 400;
        return cardIcon;
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
            java.util.logging.Logger.getLogger(PackFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PackFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PackFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PackFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PackFrame().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonOpen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCard1;
    private javax.swing.JLabel jLabelCard2;
    private javax.swing.JLabel jLabelCard3;
    private javax.swing.JLabel jLabelCard4;
    private javax.swing.JLabel jLabelCard5;
    private javax.swing.JLabel jLabelDust;
    private javax.swing.JLabel jLabelDustAmt;
    private javax.swing.JLabel jLabelDustPack;
    private javax.swing.JLabel jLabelDustPackAmt;
    private javax.swing.JLabel jLabelGold;
    public javax.swing.JLabel jLabelGoldAmtPacks;
    // End of variables declaration//GEN-END:variables

    private ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = getClass().getResource(path);
        if (imgURL != null) {
        return new ImageIcon(imgURL);
    } else {
        System.err.println("Couldn't find file: " + path);
        return null;
    }
}
    
}

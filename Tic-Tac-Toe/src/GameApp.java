import javax.swing.*;
import java.awt.*;

public class GameApp extends javax.swing.JFrame {


    boolean player = true;

    public void setPlayerText(boolean player) {
        if (player) {
            jLabel1.setText("X's Turn");
        } else jLabel1.setText("O's Turn");
    }


    public GameApp() {
        initComponents();
        setResizable(false);
        setPlayerText(player);
    }


    public void restart() {
        jLabel1.setText("");
        resetButtons();
        disableButtons();
        enableButtons();
        player=true;
        setPlayerText(player);
    }


    public void resetButtons() {
        for (Button button : buttons) {
            button.setLabel("");
        }
    }

    public void enableButtons() {
        for (Button button : buttons) {
            button.setEnabled(true);
        }
    }

    public void disableButtons() {
        for (Button button : buttons) {
            button.setEnabled(false);
        }
    }

    Button[] buttons;

    private void initComponents() {

        button7 = new java.awt.Button();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn1 = new java.awt.Button();
        btn2 = new java.awt.Button();
        btn6 = new java.awt.Button();
        btn4 = new java.awt.Button();
        btn5 = new java.awt.Button();
        btn9 = new java.awt.Button();
        btn8 = new java.awt.Button();
        btn7 = new java.awt.Button();
        btn3 = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();

        buttons = new Button[]{btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9};

        button7.setLabel("button2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 0));
        jLabel2.setText("Tic-Tac-Toe");

        btn1.setBackground(new java.awt.Color(255, 153, 0));
        btn1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        btn1.setLabel("");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(255, 153, 0));
        btn2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        btn2.setLabel("");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(255, 153, 0));
        btn6.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        btn6.setLabel("");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(255, 153, 0));
        btn4.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        btn4.setLabel("");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(255, 153, 0));
        btn5.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        btn5.setLabel("");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(255, 153, 0));
        btn9.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        btn9.setLabel("");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(255, 153, 0));
        btn8.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        btn8.setLabel("");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(255, 153, 0));
        btn7.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        btn7.setLabel("");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(255, 153, 0));
        btn3.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        btn3.setLabel("");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addContainerGap())
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addContainerGap()))))))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }


    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {
        if (player) {
            btn3.setLabel("X");
            player = false;
            setPlayerText(player);
        } else {
            btn3.setLabel("O");
            player = true;
            setPlayerText(player);
        }
        btn3.setEnabled(false);
        check();
    }

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {

        if (player) {
            btn2.setLabel("X");
            player = false;
            setPlayerText(player);
        } else {
            btn2.setLabel("O");
            player = true;
            setPlayerText(player);
        }
        btn2.setEnabled(false);
        check();
    }

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {

        if (player) {
            btn1.setLabel("X");
            player = false;
            setPlayerText(player);
        } else {
            btn1.setLabel("O");
            player = true;
            setPlayerText(player);
        }
        btn1.setEnabled(false);
        check();
    }

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {

        if (player) {
            btn4.setLabel("X");
            player = false;
            setPlayerText(player);
        } else {
            btn4.setLabel("O");
            player = true;
            setPlayerText(player);
        }
        btn4.setEnabled(false);
        check();
    }

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {

        if (player) {
            btn5.setLabel("X");
            player = false;
            setPlayerText(player);
        } else {
            btn5.setLabel("O");
            player = true;
            setPlayerText(player);
        }
        btn5.setEnabled(false);
        check();
    }

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {
        if (player) {
            btn6.setLabel("X");
            player = false;
            setPlayerText(player);
        } else {
            btn6.setLabel("O");
            player = true;
            setPlayerText(player);
        }
        btn6.setEnabled(false);
        check();
    }

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {
        if (player) {
            btn7.setLabel("X");
            player = false;
            setPlayerText(player);
        } else {
            btn7.setLabel("O");
            player = true;
            setPlayerText(player);
        }
        btn7.setEnabled(false);
        check();
    }

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {
        if (player) {
            btn8.setLabel("X");
            player = false;
            setPlayerText(player);
        } else {
            btn8.setLabel("O");
            player = true;
            setPlayerText(player);
        }
        btn8.setEnabled(false);
        check();
    }

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {
        if (player) {
            btn9.setLabel("X");
            player = false;
            setPlayerText(player);
        } else {
            btn9.setLabel("O");
            player = true;
            setPlayerText(player);
        }
        btn9.setEnabled(false);
        check();
    }


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    public void run() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameApp().setVisible(true);
                setPlayerText(player);
            }
        });
    }


    private java.awt.Button btn1;
    private java.awt.Button btn2;
    private java.awt.Button btn3;
    private java.awt.Button btn4;
    private java.awt.Button btn5;
    private java.awt.Button btn6;
    private java.awt.Button btn7;
    private java.awt.Button btn8;
    private java.awt.Button btn9;
    private java.awt.Button button7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;


    public void check() {
        char oyuncu;
        if (player) {
            oyuncu = 'O';
        } else {
            oyuncu = 'X';
        }

        int[][] winningConditions = {
                {0, 1, 2}, {3, 4, 5}, {6, 7, 8},
                {0, 3, 6}, {1, 4, 7}, {2, 5, 8},
                {0, 4, 8}, {2, 4, 6}
        };

        boolean checkDraw = true;
        for (int[] condition : winningConditions) {
            String label1 = buttons[condition[0]].getLabel();
            String label2 = buttons[condition[1]].getLabel();
            String label3 = buttons[condition[2]].getLabel();
            if (!label1.equals("") && label1.equals(label2) && label1.equals(label3)) {
                JOptionPane.showMessageDialog(null, "Kazanan = " + oyuncu + " Oyuncusu");
                restart();
                return;
            }
            if (label1.equals("") || label2.equals("") || label3.equals("")) {
                checkDraw = false;
            }
        }
        if (checkDraw) {
            JOptionPane.showMessageDialog(null, "Berabere!");
            restart();
        }
    }

}


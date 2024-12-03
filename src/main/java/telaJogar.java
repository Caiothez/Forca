/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import com.mycompany.forca.Jogo;
import com.mycompany.forca.conexaoSQL;
import com.mycompany.forca.conexao_teste;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Caio
 */
public class telaJogar extends javax.swing.JFrame {
    
    conexaoSQL objCon = new conexaoSQL();
  
        //String palavra = animais[(int)(Math.random() * 50)];
        
        String palavra = Sorteia();
        
        Jogo forca = new Jogo(palavra, 5);
        
    /**
     * Creates new form telaJogar
     */
    public telaJogar() {
        initComponents();
        fimTela.setVisible(false);
        setResizable(false);
        setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        letraQ = new javax.swing.JButton();
        letraR = new javax.swing.JButton();
        letraS = new javax.swing.JButton();
        letraT = new javax.swing.JButton();
        letraL = new javax.swing.JButton();
        letraY = new javax.swing.JButton();
        letraM = new javax.swing.JButton();
        letraZ = new javax.swing.JButton();
        letraG = new javax.swing.JButton();
        letraH = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        letraI = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        letraJ = new javax.swing.JButton();
        letraK = new javax.swing.JButton();
        letraU = new javax.swing.JButton();
        letraV = new javax.swing.JButton();
        letraW = new javax.swing.JButton();
        letraX = new javax.swing.JButton();
        letraN = new javax.swing.JButton();
        letraA = new javax.swing.JButton();
        letraB = new javax.swing.JButton();
        letraC = new javax.swing.JButton();
        letraD = new javax.swing.JButton();
        letraE = new javax.swing.JButton();
        letraF = new javax.swing.JButton();
        letraO = new javax.swing.JButton();
        letraP = new javax.swing.JButton();
        palavraTxt = new javax.swing.JTextField();
        tentativasLb = new javax.swing.JLabel();
        fimTela = new javax.swing.JPanel();
        botaoContinuar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        botaoSair = new javax.swing.JButton();
        letrasIncorretas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        letraQ.setText("Q");
        letraQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraQActionPerformed(evt);
            }
        });

        letraR.setText("R");
        letraR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraRActionPerformed(evt);
            }
        });

        letraS.setText("S");
        letraS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraSActionPerformed(evt);
            }
        });

        letraT.setText("T");
        letraT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraTActionPerformed(evt);
            }
        });

        letraL.setText("L");
        letraL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraLActionPerformed(evt);
            }
        });

        letraY.setText("Y");
        letraY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraYActionPerformed(evt);
            }
        });

        letraM.setText("M");
        letraM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraMActionPerformed(evt);
            }
        });

        letraZ.setText("Z");
        letraZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraZActionPerformed(evt);
            }
        });

        letraG.setText("G");
        letraG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraGActionPerformed(evt);
            }
        });

        letraH.setText("H");
        letraH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraHActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Unispace", 1, 24)); // NOI18N
        jLabel1.setText("Tema:");

        letraI.setText("I");
        letraI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraIActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Unispace", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Animais");

        letraJ.setText("J");
        letraJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraJActionPerformed(evt);
            }
        });

        letraK.setText("K");
        letraK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraKActionPerformed(evt);
            }
        });

        letraU.setText("U");
        letraU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraUActionPerformed(evt);
            }
        });

        letraV.setText("V");
        letraV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraVActionPerformed(evt);
            }
        });

        letraW.setText("W");
        letraW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraWActionPerformed(evt);
            }
        });

        letraX.setText("X");
        letraX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraXActionPerformed(evt);
            }
        });

        letraN.setText("N");
        letraN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraNActionPerformed(evt);
            }
        });

        letraA.setText("A");
        letraA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraA(evt);
            }
        });

        letraB.setText("B");
        letraB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraBActionPerformed(evt);
            }
        });

        letraC.setText("C");
        letraC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraCActionPerformed(evt);
            }
        });

        letraD.setText("D");
        letraD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraDActionPerformed(evt);
            }
        });

        letraE.setText("E");
        letraE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraEActionPerformed(evt);
            }
        });

        letraF.setText("F");
        letraF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraFActionPerformed(evt);
            }
        });

        letraO.setText("O");
        letraO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraOActionPerformed(evt);
            }
        });

        letraP.setText("P");
        letraP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraPActionPerformed(evt);
            }
        });

        palavraTxt.setEditable(false);
        palavraTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                palavraTxtActionPerformed(evt);
            }
        });

        tentativasLb.setText("Tentativas: 5");

        fimTela.setBackground(new java.awt.Color(153, 153, 153));

        botaoContinuar.setText("CONTINUAR");
        botaoContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoContinuarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("FIM DE JOGO!");

        botaoSair.setText("SAIR");

        javax.swing.GroupLayout fimTelaLayout = new javax.swing.GroupLayout(fimTela);
        fimTela.setLayout(fimTelaLayout);
        fimTelaLayout.setHorizontalGroup(
            fimTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fimTelaLayout.createSequentialGroup()
                .addGroup(fimTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fimTelaLayout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel3))
                    .addGroup(fimTelaLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(botaoContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fimTelaLayout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fimTelaLayout.setVerticalGroup(
            fimTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fimTelaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoContinuar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        letrasIncorretas.setText("Letras Incorretas: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(palavraTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                    .addComponent(fimTela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(letrasIncorretas, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tentativasLb))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(letraN, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letraO, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letraP, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letraQ, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letraR, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letraS, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letraT, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letraU, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letraV, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letraW, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letraX, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letraY, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letraZ, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(letraA, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letraB, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letraC, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letraD, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letraE, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letraF, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letraG, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letraH, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letraI, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letraJ, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letraK, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letraL, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letraM, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tentativasLb)
                .addGap(5, 5, 5)
                .addComponent(letrasIncorretas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fimTela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(palavraTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(letraG)
                    .addComponent(letraH)
                    .addComponent(letraI)
                    .addComponent(letraJ)
                    .addComponent(letraK)
                    .addComponent(letraL)
                    .addComponent(letraM)
                    .addComponent(letraA)
                    .addComponent(letraB)
                    .addComponent(letraC)
                    .addComponent(letraD)
                    .addComponent(letraE)
                    .addComponent(letraF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(letraO)
                    .addComponent(letraP)
                    .addComponent(letraQ)
                    .addComponent(letraR)
                    .addComponent(letraS)
                    .addComponent(letraT)
                    .addComponent(letraU)
                    .addComponent(letraV)
                    .addComponent(letraW)
                    .addComponent(letraX)
                    .addComponent(letraY)
                    .addComponent(letraZ)
                    .addComponent(letraN))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void palavraTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_palavraTxtActionPerformed
        // TODO add your handling code here:
        //forca.imprime();
    }//GEN-LAST:event_palavraTxtActionPerformed

    private void letraA(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraA
        // TODO add your handling code here:
        forca.tentaLetra('A');
        tentativasLb.setText(forca.TentativasRestantes()); 
        letrasIncorretas.setText(forca.letraIncorretas());
        palavraTxt.setText(forca.obterEstadoJogo());
        letraA.setEnabled(false);
    }//GEN-LAST:event_letraA

    private void letraBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraBActionPerformed
        // TODO add your handling code here:
        forca.tentaLetra('B');
        tentativasLb.setText(forca.TentativasRestantes()); 
        letrasIncorretas.setText(forca.letraIncorretas());
        palavraTxt.setText(forca.obterEstadoJogo());
        letraB.setEnabled(false);
    }//GEN-LAST:event_letraBActionPerformed

    private void letraCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraCActionPerformed
        // TODO add your handling code here:
        forca.tentaLetra('C');
        tentativasLb.setText(forca.TentativasRestantes()); 
        letrasIncorretas.setText(forca.letraIncorretas());
        palavraTxt.setText(forca.obterEstadoJogo());
        letraC.setEnabled(false);       
    }//GEN-LAST:event_letraCActionPerformed

    private void letraDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraDActionPerformed
        // TODO add your handling code here:
        forca.tentaLetra('D');
        tentativasLb.setText(forca.TentativasRestantes());  
        letrasIncorretas.setText(forca.letraIncorretas());
        palavraTxt.setText(forca.obterEstadoJogo());
        letraD.setEnabled(false);
    }//GEN-LAST:event_letraDActionPerformed

    private void letraEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraEActionPerformed
        // TODO add your handling code here:
        forca.tentaLetra('E');
        tentativasLb.setText(forca.TentativasRestantes());  
        letrasIncorretas.setText(forca.letraIncorretas());
        palavraTxt.setText(forca.obterEstadoJogo());
        letraE.setEnabled(false);
    }//GEN-LAST:event_letraEActionPerformed

    private void letraFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraFActionPerformed
        // TODO add your handling code here:
        forca.tentaLetra('F');
        tentativasLb.setText(forca.TentativasRestantes());  
        letrasIncorretas.setText(forca.letraIncorretas());
        palavraTxt.setText(forca.obterEstadoJogo());
        letraF.setEnabled(false);
    }//GEN-LAST:event_letraFActionPerformed

    private void letraGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraGActionPerformed
        // TODO add your handling code here:
        forca.tentaLetra('G');
        tentativasLb.setText(forca.TentativasRestantes());  
        letrasIncorretas.setText(forca.letraIncorretas());
        palavraTxt.setText(forca.obterEstadoJogo());
        letraG.setEnabled(false);
    }//GEN-LAST:event_letraGActionPerformed

    private void letraHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraHActionPerformed
        // TODO add your handling code here:
        forca.tentaLetra('H');
        tentativasLb.setText(forca.TentativasRestantes());  
        letrasIncorretas.setText(forca.letraIncorretas());
        palavraTxt.setText(forca.obterEstadoJogo());
        letraH.setEnabled(false);
    }//GEN-LAST:event_letraHActionPerformed

    private void letraIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraIActionPerformed
        // TODO add your handling code here:
        forca.tentaLetra('I');
        tentativasLb.setText(forca.TentativasRestantes());  
        letrasIncorretas.setText(forca.letraIncorretas());
        palavraTxt.setText(forca.obterEstadoJogo());
        letraI.setEnabled(false);
    }//GEN-LAST:event_letraIActionPerformed

    private void letraJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraJActionPerformed
        // TODO add your handling code here:
        forca.tentaLetra('J');
        tentativasLb.setText(forca.TentativasRestantes());  
        letrasIncorretas.setText(forca.letraIncorretas());
        palavraTxt.setText(forca.obterEstadoJogo());
        letraJ.setEnabled(false);
    }//GEN-LAST:event_letraJActionPerformed

    private void letraKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraKActionPerformed
        // TODO add your handling code here:
        forca.tentaLetra('K');
        tentativasLb.setText(forca.TentativasRestantes());  
        letrasIncorretas.setText(forca.letraIncorretas());
        palavraTxt.setText(forca.obterEstadoJogo());
        letraK.setEnabled(false);
    }//GEN-LAST:event_letraKActionPerformed

    private void letraLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraLActionPerformed
        // TODO add your handling code here:
        forca.tentaLetra('L');
        tentativasLb.setText(forca.TentativasRestantes());  
        letrasIncorretas.setText(forca.letraIncorretas());
        palavraTxt.setText(forca.obterEstadoJogo());
        letraL.setEnabled(false);
    }//GEN-LAST:event_letraLActionPerformed

    private void letraMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraMActionPerformed
        // TODO add your handling code here:
        forca.tentaLetra('M');
        tentativasLb.setText(forca.TentativasRestantes());  
        letrasIncorretas.setText(forca.letraIncorretas());
        palavraTxt.setText(forca.obterEstadoJogo());
        letraM.setEnabled(false);
    }//GEN-LAST:event_letraMActionPerformed

    private void letraNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraNActionPerformed
        // TODO add your handling code here:
        forca.tentaLetra('N');
        tentativasLb.setText(forca.TentativasRestantes());  
        letrasIncorretas.setText(forca.letraIncorretas());
        palavraTxt.setText(forca.obterEstadoJogo());
        letraN.setEnabled(false);
    }//GEN-LAST:event_letraNActionPerformed

    private void letraOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraOActionPerformed
        // TODO add your handling code here:
        forca.tentaLetra('O');
        tentativasLb.setText(forca.TentativasRestantes());  
        letrasIncorretas.setText(forca.letraIncorretas());
        palavraTxt.setText(forca.obterEstadoJogo());
        letraO.setEnabled(false);
    }//GEN-LAST:event_letraOActionPerformed

    private void letraPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraPActionPerformed
        // TODO add your handling code here:
        forca.tentaLetra('P');
        tentativasLb.setText(forca.TentativasRestantes());  
        letrasIncorretas.setText(forca.letraIncorretas());
        palavraTxt.setText(forca.obterEstadoJogo());
        letraP.setEnabled(false);
    }//GEN-LAST:event_letraPActionPerformed

    private void letraQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraQActionPerformed
        // TODO add your handling code here:
        forca.tentaLetra('Q');
        tentativasLb.setText(forca.TentativasRestantes());  
        letrasIncorretas.setText(forca.letraIncorretas());
        palavraTxt.setText(forca.obterEstadoJogo());
        letraQ.setEnabled(false);
    }//GEN-LAST:event_letraQActionPerformed

    private void letraRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraRActionPerformed
        // TODO add your handling code here:
        forca.tentaLetra('R');
        tentativasLb.setText(forca.TentativasRestantes());  
        letrasIncorretas.setText(forca.letraIncorretas());
        palavraTxt.setText(forca.obterEstadoJogo());
        letraR.setEnabled(false);
    }//GEN-LAST:event_letraRActionPerformed

    private void letraSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraSActionPerformed
        // TODO add your handling code here:
        forca.tentaLetra('S');
        tentativasLb.setText(forca.TentativasRestantes());  
        letrasIncorretas.setText(forca.letraIncorretas());
        palavraTxt.setText(forca.obterEstadoJogo());
        letraS.setEnabled(false);
    }//GEN-LAST:event_letraSActionPerformed

    private void letraTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraTActionPerformed
        // TODO add your handling code here:
        forca.tentaLetra('T');
        tentativasLb.setText(forca.TentativasRestantes());  
        letrasIncorretas.setText(forca.letraIncorretas());
        palavraTxt.setText(forca.obterEstadoJogo());
        letraT.setEnabled(false);
    }//GEN-LAST:event_letraTActionPerformed

    private void letraUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraUActionPerformed
        // TODO add your handling code here:
        forca.tentaLetra('U');
        tentativasLb.setText(forca.TentativasRestantes());  
        letrasIncorretas.setText(forca.letraIncorretas());
        palavraTxt.setText(forca.obterEstadoJogo());
        letraU.setEnabled(false);
    }//GEN-LAST:event_letraUActionPerformed

    private void letraVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraVActionPerformed
        // TODO add your handling code here:
        forca.tentaLetra('V');
        tentativasLb.setText(forca.TentativasRestantes());  
        letrasIncorretas.setText(forca.letraIncorretas());
        palavraTxt.setText(forca.obterEstadoJogo());
        letraV.setEnabled(false);
    }//GEN-LAST:event_letraVActionPerformed

    private void letraWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraWActionPerformed
        // TODO add your handling code here:
        forca.tentaLetra('W');
        tentativasLb.setText(forca.TentativasRestantes());  
        letrasIncorretas.setText(forca.letraIncorretas());
        palavraTxt.setText(forca.obterEstadoJogo());
        letraW.setEnabled(false);
    }//GEN-LAST:event_letraWActionPerformed

    private void letraXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraXActionPerformed
        // TODO add your handling code here:
        forca.tentaLetra('X');
        tentativasLb.setText(forca.TentativasRestantes());  
        letrasIncorretas.setText(forca.letraIncorretas());
        palavraTxt.setText(forca.obterEstadoJogo());
        letraX.setEnabled(false);
    }//GEN-LAST:event_letraXActionPerformed

    private void letraYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraYActionPerformed
        // TODO add your handling code here:
        forca.tentaLetra('Y');
        tentativasLb.setText(forca.TentativasRestantes());  
        letrasIncorretas.setText(forca.letraIncorretas());
        palavraTxt.setText(forca.obterEstadoJogo());
        letraY.setEnabled(false);
    }//GEN-LAST:event_letraYActionPerformed

    private void letraZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraZActionPerformed
        // TODO add your handling code here:
        forca.tentaLetra('Z');
        tentativasLb.setText(forca.TentativasRestantes());  
        letrasIncorretas.setText(forca.letraIncorretas());
        palavraTxt.setText(forca.obterEstadoJogo());
        letraZ.setEnabled(false);
    }//GEN-LAST:event_letraZActionPerformed

    private void botaoContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoContinuarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoContinuarActionPerformed

    /**
     * @param args the command line arguments
     */
        
    public String Sorteia(){
        try {
            palavra = objCon.puxaPalavra();
            //JOptionPane.showMessageDialog(null, "Areré");
            return palavra;
        } catch (SQLException ex) {
            Logger.getLogger(conexao_teste.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
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
            java.util.logging.Logger.getLogger(telaJogar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaJogar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaJogar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaJogar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaJogar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoContinuar;
    private javax.swing.JButton botaoSair;
    private javax.swing.JPanel fimTela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton letraA;
    private javax.swing.JButton letraB;
    private javax.swing.JButton letraC;
    private javax.swing.JButton letraD;
    private javax.swing.JButton letraE;
    private javax.swing.JButton letraF;
    private javax.swing.JButton letraG;
    private javax.swing.JButton letraH;
    private javax.swing.JButton letraI;
    private javax.swing.JButton letraJ;
    private javax.swing.JButton letraK;
    private javax.swing.JButton letraL;
    private javax.swing.JButton letraM;
    private javax.swing.JButton letraN;
    private javax.swing.JButton letraO;
    private javax.swing.JButton letraP;
    private javax.swing.JButton letraQ;
    private javax.swing.JButton letraR;
    private javax.swing.JButton letraS;
    private javax.swing.JButton letraT;
    private javax.swing.JButton letraU;
    private javax.swing.JButton letraV;
    private javax.swing.JButton letraW;
    private javax.swing.JButton letraX;
    private javax.swing.JButton letraY;
    private javax.swing.JButton letraZ;
    private javax.swing.JLabel letrasIncorretas;
    private javax.swing.JTextField palavraTxt;
    private javax.swing.JLabel tentativasLb;
    // End of variables declaration//GEN-END:variables
}

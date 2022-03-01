/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package perceptron;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.geom.Point2D;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;

/**
 *
 * @author galle
 */
public class JFrame_Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana_JFrame
     */
    public JFrame_Ventana() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel_CoordenadaClick = new javax.swing.JLabel();
        jRadioButton_Tipo_0 = new javax.swing.JRadioButton();
        jRadioButton_Tipo_1 = new javax.swing.JRadioButton();
        jButton_Inicializador_opcional = new javax.swing.JButton();
        jPanel_Panel_principal = new javax.swing.JPanel();
        jButton_Restablecer_valores = new javax.swing.JButton();
        learning_rateTXT = new javax.swing.JTextField();
        jLabelZ_Entrada_learning_rate = new javax.swing.JLabel();
        iterationsTXT = new javax.swing.JTextField();
        jLabelZ_Entrada_epocas_maximas = new javax.swing.JLabel();
        jButton_Entrenamiento = new javax.swing.JButton();
        jButton_Clasificar = new javax.swing.JButton();
        jRadioButton_Sin_tipo = new javax.swing.JRadioButton();
        jButton_Debug = new javax.swing.JButton();
        jButton_limpiar = new javax.swing.JButton();
        generatebtn = new javax.swing.JButton();
        thresholdTXT = new javax.swing.JLabel();
        w1TXT = new javax.swing.JLabel();
        w2TXT = new javax.swing.JLabel();
        weight0TXT = new javax.swing.JTextField();
        weight2TXT = new javax.swing.JTextField();
        weight1TXT = new javax.swing.JTextField();
        jLabel_CoordenadaClick_Acotado = new javax.swing.JLabel();
        jButton_Barrido_perceptron = new javax.swing.JButton();
        jButton_Entrenamiento_adalaine = new javax.swing.JButton();
        jButton_Clasificar_adalaine = new javax.swing.JButton();
        jButton_Barrido_adalaine = new javax.swing.JButton();
        jLabel_error = new javax.swing.JLabel();
        jTextField_Error_cuadratico = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(2, 2, 1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_CoordenadaClick.setText("............");
        jLabel_CoordenadaClick.setToolTipText("");
        getContentPane().add(jLabel_CoordenadaClick, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 220, -1));

        buttonGroup1.add(jRadioButton_Tipo_0);
        jRadioButton_Tipo_0.setText("Tipo 0");
        getContentPane().add(jRadioButton_Tipo_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 70, -1, -1));

        buttonGroup1.add(jRadioButton_Tipo_1);
        jRadioButton_Tipo_1.setText("Tipo 1");
        getContentPane().add(jRadioButton_Tipo_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 70, -1, -1));

        jButton_Inicializador_opcional.setText("Auto inicializador opcional");
        jButton_Inicializador_opcional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Inicializador_opcionalActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Inicializador_opcional, new org.netbeans.lib.awtextra.AbsoluteConstraints(744, 34, 220, 40));

        jPanel_Panel_principal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_Panel_principal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_Panel_principalMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_Panel_principalLayout = new javax.swing.GroupLayout(jPanel_Panel_principal);
        jPanel_Panel_principal.setLayout(jPanel_Panel_principalLayout);
        jPanel_Panel_principalLayout.setHorizontalGroup(
            jPanel_Panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );
        jPanel_Panel_principalLayout.setVerticalGroup(
            jPanel_Panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel_Panel_principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jButton_Restablecer_valores.setText("Restablecer valores");
        jButton_Restablecer_valores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Restablecer_valoresActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Restablecer_valores, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 150, 60));

        learning_rateTXT.setText("0.5");
        getContentPane().add(learning_rateTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 170, 80, -1));

        jLabelZ_Entrada_learning_rate.setText("Learning rate: ");
        getContentPane().add(jLabelZ_Entrada_learning_rate, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 180, -1, -1));

        iterationsTXT.setText("100");
        getContentPane().add(iterationsTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 200, 80, -1));

        jLabelZ_Entrada_epocas_maximas.setText("Epocas maximas: ");
        getContentPane().add(jLabelZ_Entrada_epocas_maximas, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 210, -1, -1));

        jButton_Entrenamiento.setText("Entrenar perceptron");
        jButton_Entrenamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EntrenamientoActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Entrenamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 370, -1, 60));

        jButton_Clasificar.setText("Clasificar");
        jButton_Clasificar.setToolTipText("");
        jButton_Clasificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ClasificarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Clasificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, 110, 30));

        buttonGroup1.add(jRadioButton_Sin_tipo);
        jRadioButton_Sin_tipo.setText("Sin tipo");
        jRadioButton_Sin_tipo.setActionCommand("");
        getContentPane().add(jRadioButton_Sin_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 70, -1, -1));

        jButton_Debug.setText("Debug");
        jButton_Debug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DebugActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Debug, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 460, -1, -1));

        jButton_limpiar.setText("Limpiar graficos");
        jButton_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_limpiarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 150, 60));

        generatebtn.setText("Generar Pesos");
        generatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generatebtnActionPerformed(evt);
            }
        });
        getContentPane().add(generatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 240, -1, 60));

        thresholdTXT.setText("W0:");
        getContentPane().add(thresholdTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 230, 30, 20));

        w1TXT.setText("W1:");
        getContentPane().add(w1TXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 260, 30, 20));

        w2TXT.setText("W2:");
        getContentPane().add(w2TXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 290, 30, 20));

        weight0TXT.setText("1");
        getContentPane().add(weight0TXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 230, 80, -1));

        weight2TXT.setText("1");
        getContentPane().add(weight2TXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 290, 80, -1));

        weight1TXT.setText("0");
        getContentPane().add(weight1TXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 260, 80, -1));

        jLabel_CoordenadaClick_Acotado.setText("............");
        jLabel_CoordenadaClick_Acotado.setToolTipText("");
        getContentPane().add(jLabel_CoordenadaClick_Acotado, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 210, -1));

        jButton_Barrido_perceptron.setText("Barrido perceptron");
        jButton_Barrido_perceptron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Barrido_perceptronActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Barrido_perceptron, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 370, -1, -1));

        jButton_Entrenamiento_adalaine.setText("Entrenar adalaine");
        jButton_Entrenamiento_adalaine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Entrenamiento_adalaineActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Entrenamiento_adalaine, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 440, -1, 60));

        jButton_Clasificar_adalaine.setText("Clasificar adalaine");
        jButton_Clasificar_adalaine.setToolTipText("");
        jButton_Clasificar_adalaine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Clasificar_adalaineActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Clasificar_adalaine, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, 140, 30));

        jButton_Barrido_adalaine.setText("Barrido adalaine");
        jButton_Barrido_adalaine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Barrido_adalaineActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Barrido_adalaine, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 400, -1, -1));

        jLabel_error.setText("Error cuadratico acumulado:");
        getContentPane().add(jLabel_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 140, -1, -1));

        jTextField_Error_cuadratico.setText("0.3");
        getContentPane().add(jTextField_Error_cuadratico, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 140, 80, -1));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 460, -1, -1));

        setBounds(0, 0, 967, 551);
    }// </editor-fold>//GEN-END:initComponents

    
    private void jPanel_Panel_principalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_Panel_principalMouseClicked
        // TODO add your handling code here:
        g = jPanel_Panel_principal.getGraphics();
        //g.drawRect(evt.getX(), evt.getY(), 20, 20);
        Point Coordenadas_reales = new Point(evt.getPoint());
        
        Point2D.Double Coordenadas_m1a1 = new Point2D.Double(((double)Coordenadas_reales.getX()-250)/250, ((double)Coordenadas_reales.getY()-250)/250);
        
        Todos_los_click.add(evt.getPoint());
        Click_acotados.add(Coordenadas_m1a1);
        
        jLabel_CoordenadaClick_Acotado.setText("T1 X = "+Coordenadas_m1a1.getX()+" ; Y = "+Coordenadas_m1a1.getY());
        jLabel_CoordenadaClick.setText("T1 X = "+evt.getX()+" ; Y = "+evt.getY());
        if (jRadioButton_Tipo_1.isSelected())
        {
            Click_acotados_tipo1.add(Coordenadas_m1a1);
            g.setColor(Color.red);
        }else
            if (jRadioButton_Tipo_0.isSelected())
            {
                Click_acotados_tipo0.add(Coordenadas_m1a1);
                g.setColor(Color.BLUE);
            }else
            {
                g.setColor(Color.BLACK);
            }
            g.drawOval(evt.getX()-2, evt.getY()-2, 5, 5);
                
         
    }//GEN-LAST:event_jPanel_Panel_principalMouseClicked

    private void jButton_Restablecer_valoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Restablecer_valoresActionPerformed
        // TODO add your handling code here:
        jLabel_CoordenadaClick.setText(".....");
        Todos_los_click.clear();
        
        Click_acotados.clear();
        Click_acotados_tipo1.clear();
        Click_acotados_tipo0.clear();
        
        jRadioButton_Sin_tipo.doClick();
        jPanel_Panel_principal.getGraphics().clearRect(1, 1, jPanel_Panel_principal.getWidth()-2, jPanel_Panel_principal.getHeight()-2);
        //aqui tambien iria la secuencia de limpieza de lo dibujado
    }//GEN-LAST:event_jButton_Restablecer_valoresActionPerformed

    private void jButton_DebugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DebugActionPerformed
        // TODO add your handling code here:
        System.out.println("  Todos "+Todos_los_click.size());
        for(Point click:Todos_los_click)
        {
            System.out.println("X= "+click.getX()+" Y = "+click.getY());
        }
        
        System.out.println("Acotados");
        for(Point2D.Double click:Click_acotados)
        {
            System.out.println("X= "+click.getX()+" Y = "+click.getY());
        }
        System.out.println("Acotados Tipo 1");
        for(Point2D.Double click:Click_acotados_tipo1)
        {
            System.out.println("X= "+click.getX()+" Y = "+click.getY());
        }
        System.out.println("Acotados Tipo 0");
        for(Point2D.Double click:Click_acotados_tipo0)
        {
            System.out.println("X= "+click.getX()+" Y = "+click.getY());
        }
        
        System.out.println("Perceptron W0= "+ perceptron.W[0]+"W1= "+ perceptron.W[1]+"W2= "+perceptron.W[2]);
        System.out.println("Adalaine W0= "+ adalaine.W[0]+"W1= "+ adalaine.W[1]+"W2= "+adalaine.W[2]);
        
        System.out.println("------Final JButton_Debug------");
    }//GEN-LAST:event_jButton_DebugActionPerformed

    private void jButton_Inicializador_opcionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Inicializador_opcionalActionPerformed
        // TODO add your handling code here:
        
        g=jPanel_Panel_principal.getGraphics();
        g.setColor(Color.blue);
        Point2D.Double punto = new Point2D.Double();
        int contador = 0, no_viable=40;
        Perceptron_simple perceptron_objetivo = new Perceptron_simple(.5f, 100);
        perceptron_objetivo.W[0] = ((Math.random()-.5));
        System.out.println("Limite: "+perceptron_objetivo.W[0]);
        perceptron_objetivo.W[1] = (Math.random()-.5);
        System.out.println("W1 : "+perceptron_objetivo.W[1]);
        perceptron_objetivo.W[2] = ((Math.random()-.5));
        System.out.println("W2 : "+perceptron_objetivo.W[2]);
        perceptron_objetivo.Dibujar_linea(jPanel_Panel_principal, Color.BLUE);
        //numero inicial de puntos
        while((Click_acotados_tipo1.size()<1 || Click_acotados_tipo0.size()<1 || contador<20)&&no_viable>0){
            contador++;
            no_viable--;
            punto.x = (Math.random()-.5);
            punto.y = (Math.random()-.5);
            if (perceptron_objetivo.Pw_con_dibujo(punto, jPanel_Panel_principal))
            {
                //Click_tipo_1.add(new Point(punto));
                Click_acotados_tipo1.add(new Point2D.Double(punto.getX(), punto.getY()));
            }
            else
            {
                //Click_tipo_0.add(new Point(punto));
                Click_acotados_tipo0.add(new Point2D.Double(punto.getX(), punto.getY()));
            }
            //Todos_los_click.add(new Point(punto));
            Click_acotados.add(new Point2D.Double(punto.getX(), punto.getY()));
        }
        if (!(no_viable>0)){
            //System.out.println("Se saco un no viable, restablece y repite");
            jButton_Restablecer_valores.doClick();
            jButton_Inicializador_opcional.doClick();
        }
        

        
    }//GEN-LAST:event_jButton_Inicializador_opcionalActionPerformed

    private void jButton_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_limpiarActionPerformed
        // TODO add your handling code here:
        jPanel_Panel_principal.getGraphics().clearRect(1, 1, jPanel_Panel_principal.getWidth()-2, jPanel_Panel_principal.getHeight()-2);
    }//GEN-LAST:event_jButton_limpiarActionPerformed

    private void jButton_ClasificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ClasificarActionPerformed
        // TODO add your handling code here:
          perceptron.Dibujar_linea(jPanel_Panel_principal,Color.YELLOW);
        //for(Point coordenada:Todos_los_click)
        for(Point2D.Double coordenada:Click_acotados)
        {
            perceptron.Pw_con_dibujoBarrido(coordenada, jPanel_Panel_principal);
        }
    }//GEN-LAST:event_jButton_ClasificarActionPerformed
    
    private void jButton_EntrenamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EntrenamientoActionPerformed
        // TODO add your handling code here:
        //perceptron.Entrenar(Click_tipo_1, Click_tipo_0, Todos_los_click,weight0TXT,weight1TXT,weight2TXT,learning_rateTXT,iterationsTXT,jPanel_Panel_principal);
        perceptron.Entrenar(Click_acotados_tipo1, Click_acotados_tipo0, Click_acotados,weight0TXT,weight1TXT,weight2TXT,learning_rateTXT,iterationsTXT,jPanel_Panel_principal);
    }//GEN-LAST:event_jButton_EntrenamientoActionPerformed

    private void generatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generatebtnActionPerformed
        // TODO add your handling code here:
        double a = 0, b = 0, c = 0;
        a = Math.random()-.5;
        b = Math.random()-.5;
        c = Math.random()-.5;

        DecimalFormat formato1 = new DecimalFormat("#.000");
        weight0TXT.setText( String.valueOf(formato1.format(a)));
        weight1TXT.setText( String.valueOf(formato1.format(b)));
        weight2TXT.setText( String.valueOf(formato1.format(c)));
    }//GEN-LAST:event_generatebtnActionPerformed

    private void jButton_Barrido_perceptronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Barrido_perceptronActionPerformed
        Point2D.Double coordenada = new Point2D.Double();
        for(double x = 4; x<500; x+=10)
        {
            for(double y = 4; y<500; y+=10)
            {
                coordenada.x = ((x-250)/250);
                coordenada.y = ((y-250)/250);
                perceptron.Pw_con_dibujo(coordenada, jPanel_Panel_principal);
                //System.out.println(coordenada.toString());
            }
            
        }
    }//GEN-LAST:event_jButton_Barrido_perceptronActionPerformed

    private void jButton_Entrenamiento_adalaineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Entrenamiento_adalaineActionPerformed
        adalaine.Entrenar(Click_acotados_tipo1, Click_acotados_tipo0, Click_acotados,weight0TXT,weight1TXT,weight2TXT,learning_rateTXT,iterationsTXT,jPanel_Panel_principal,jTextField_Error_cuadratico);
    }//GEN-LAST:event_jButton_Entrenamiento_adalaineActionPerformed

    private void jButton_Clasificar_adalaineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Clasificar_adalaineActionPerformed
        adalaine.Dibujar_linea(jPanel_Panel_principal,Color.YELLOW);
        //for(Point coordenada:Todos_los_click)
        for(Point2D.Double coordenada:Click_acotados)
        {
            adalaine.Pw_con_dibujo(coordenada, jPanel_Panel_principal);
        }
    }//GEN-LAST:event_jButton_Clasificar_adalaineActionPerformed

    private void jButton_Barrido_adalaineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Barrido_adalaineActionPerformed
        // TODO add your handling code here:
        Point2D.Double coordenada = new Point2D.Double();
        for(double x = 4; x<500; x+=10)
        {
            for(double y = 4; y<500; y+=10)
            {
                coordenada.x = ((x-250)/250);
                coordenada.y = ((y-250)/250);
                adalaine.Pw_con_dibujoDifuminado(coordenada, jPanel_Panel_principal);
                //System.out.println(coordenada.toString());
            }
            
        }
    }//GEN-LAST:event_jButton_Barrido_adalaineActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame_Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //List<java.awt.event.MouseEvent> Todos_los_click;
        //List<java.awt.event.MouseEvent> Click_tipo_1;
        //List<java.awt.event.MouseEvent> Click_tipo_0;
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_Ventana().setVisible(true);
            }
        });
    }
    
    private List<Point> Todos_los_click = new ArrayList<Point>();
    
    
    private List<Point2D.Double> Click_acotados = new ArrayList<Point2D.Double>();
    private List<Point2D.Double> Click_acotados_tipo1 = new ArrayList<Point2D.Double>();
    private List<Point2D.Double> Click_acotados_tipo0 = new ArrayList<Point2D.Double>();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton generatebtn;
    private javax.swing.JTextField iterationsTXT;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_Barrido_adalaine;
    private javax.swing.JButton jButton_Barrido_perceptron;
    private javax.swing.JButton jButton_Clasificar;
    private javax.swing.JButton jButton_Clasificar_adalaine;
    private javax.swing.JButton jButton_Debug;
    private javax.swing.JButton jButton_Entrenamiento;
    private javax.swing.JButton jButton_Entrenamiento_adalaine;
    private javax.swing.JButton jButton_Inicializador_opcional;
    private javax.swing.JButton jButton_Restablecer_valores;
    private javax.swing.JButton jButton_limpiar;
    private javax.swing.JLabel jLabelZ_Entrada_epocas_maximas;
    private javax.swing.JLabel jLabelZ_Entrada_learning_rate;
    private javax.swing.JLabel jLabel_CoordenadaClick;
    private javax.swing.JLabel jLabel_CoordenadaClick_Acotado;
    private javax.swing.JLabel jLabel_error;
    private javax.swing.JPanel jPanel_Panel_principal;
    private javax.swing.JRadioButton jRadioButton_Sin_tipo;
    private javax.swing.JRadioButton jRadioButton_Tipo_0;
    private javax.swing.JRadioButton jRadioButton_Tipo_1;
    private javax.swing.JTextField jTextField_Error_cuadratico;
    private javax.swing.JTextField learning_rateTXT;
    private javax.swing.JLabel thresholdTXT;
    private javax.swing.JLabel w1TXT;
    private javax.swing.JLabel w2TXT;
    private javax.swing.JTextField weight0TXT;
    private javax.swing.JTextField weight1TXT;
    private javax.swing.JTextField weight2TXT;
    // End of variables declaration//GEN-END:variables
    private Graphics g,graficos_respaldo;
    private Perceptron_simple perceptron = new Perceptron_simple(.2f, 100);
    private Perceptron_adelaine adalaine = new Perceptron_adelaine(.2f, 100,.2);
}


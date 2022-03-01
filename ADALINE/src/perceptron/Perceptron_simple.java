/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perceptron;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JTextField;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author galle
 */
public class Perceptron_simple {

    public double W[], learning_rate;
    public int epocas_maximas;

    public Perceptron_simple(float learning_rate, int epocas) {
        this.W = new double[]{26.0f, 2f, -3f};
        this.learning_rate = learning_rate;
        this.epocas_maximas = epocas;
    }

    public void Dibujar_linea(JPanel El_panel, Color pintura)//inclompleto
    {
        Graphics g;
        g = El_panel.getGraphics();
        Point primer_punto, segundo_punto;
        g.setColor(pintura);
        g.drawLine(0, (int) (((-W[1] * -1 + W[0]) / W[2]) * 250 + 250), 500, (int) (((-W[1] * 1 + W[0]) / W[2]) * 250 + 250));
        //g.drawLine(0, (int) (((W[0])/W[2])*250+250), 500 ,100);

        //System.out.println((int)((W[1]*-500f+W[0])/1f-W[2]));
        //System.out.println((int)((W[1]*1000f+W[0])/1f-W[2]));
        /*
        int Y = 0;
        int X = 0;
        int contador = 0;
        boolean noValido = true;
        
        while (X<500 && contador < this.epocas_maximas)
        {
            
        }
         */
        //g.drawLine(0, (int)(W[1]), epocas_maximas, epocas_maximas);
    }

    public boolean Pw_cambiado(float W[], float X[]) {
        float suma = W[0] * 2;
        for (int i = 1; i < W.length; i++) {
            suma = suma + W[i + 1] * X[i];
        }
        if (suma >= 0) {
            return true;
        } else {
            return false;
        }

    }

    public boolean Pw(Point2D.Double coordenadas) {

        if (this.W[1] * coordenadas.getX() + this.W[2] * coordenadas.getY() >= this.W[0]) {
            return true;
        } else {
            return false;
        }
    }

    public boolean Pw_con_dibujo(Point2D.Double coordenadas, JPanel El_panel) {
        Graphics g;
        g = El_panel.getGraphics();
        double evaluacion;
        evaluacion = this.W[1] * coordenadas.getX() + this.W[2] * coordenadas.getY();

        //System.out.println("Evaluacion dio: "+evaluacion+" se activa con: "+W[0]);
        if (evaluacion >= this.W[0]) {
            g.setColor(Color.red);
            g.drawOval((int) (coordenadas.getX() * 250 + 250) - 2, (int) (coordenadas.getY() * 250 + 250) - 2, 5, 5);
            return true;
        } else {
            g.setColor(Color.BLUE);
            g.drawOval((int) (coordenadas.getX() * 250 + 250) - 2, (int) (coordenadas.getY() * 250 + 250) - 2, 5, 5);
            return false;
        }

    }

    public boolean Pw_con_dibujoBarrido(Point2D.Double coordenadas, JPanel El_panel) {
        Graphics g;
        g = El_panel.getGraphics();
        Color color1 = new Color(156, 0, 0);
        Color color2 = new Color(15, 44, 122);
        double evaluacion;
        evaluacion = this.W[1] * coordenadas.getX() + this.W[2] * coordenadas.getY();

        //System.out.println("Evaluacion dio: "+evaluacion+" se activa con: "+W[0]);
        if (evaluacion >= this.W[0]) {
            g.setColor(Color.red);
            g.fillOval((int) (coordenadas.getX() * 250 + 250) - 2, (int) (coordenadas.getY() * 250 + 250) - 2, 5, 5);
            return true;
        } else {
            g.setColor(Color.BLUE);
            g.fillOval((int) (coordenadas.getX() * 250 + 250) - 2, (int) (coordenadas.getY() * 250 + 250) - 2, 5, 5);
            return false;
        }

    }

    public void Entrenar(List<Point2D.Double> puntos_tipo_1, List<Point2D.Double> puntos_tipo_0, List<Point2D.Double> click, JTextField w0, JTextField w1, JTextField w2, JTextField learning_rateTXT, JTextField iterationsTXT, JPanel JPanel_principal) {
        int verdaderosNegativos = 0;
        int falsosPositivos = 0;
        int falsosNegativos = 0;
        int verdaderosPositivos = 0;

        W[1] = Float.parseFloat(w1.getText()); //PESO 1
        W[2] = Float.parseFloat(w2.getText()); //PESO 2
        W[0] = Float.parseFloat(w0.getText());//PESO 0
        learning_rate = Float.parseFloat(learning_rateTXT.getText()); //learning rate
        int iterMax = Integer.parseInt(iterationsTXT.getText()); // maximas iteraciones

        this.Dibujar_linea(JPanel_principal, Color.ORANGE);

        int contador_iteracion = 0;
        int N = click.size();
        int error = 0;
        int Y = 0;
        int evalPw = 0;
        double[] errorCont = new double[iterMax];

        boolean done = false;
        while (!done && contador_iteracion < iterMax) {
            verdaderosNegativos = 0;
            falsosPositivos = 0;
            falsosNegativos = 0;
            verdaderosPositivos = 0;
            done = true;
            for (int i = 0; i < N; i++) {

                if (puntos_tipo_1.contains(click.get(i))) {
                    if (evalPw > 0.5) {
                        verdaderosPositivos++;
                    } else {
                        falsosNegativos++;
                    }
                    Y = 1;
                } else {
                    if (evalPw > 0.5) {
                        falsosPositivos++;
                    } else {
                        verdaderosNegativos++;

                    }
                    Y = 0;
                }
                if (Pw(new Point2D.Double(click.get(i).x, click.get(i).y))) //if (Pw(new Point2D.Double()))
                {
                    evalPw = 1;
                } else {
                    evalPw = 0;
                }

                error = Y - evalPw;
                if (error != 0) {
                    done = false;
                    W[0] = W[0] + learning_rate * error * -1;
                    W[1] = W[1] + learning_rate * error * (click.get(i).getX());
                    W[2] = W[2] + learning_rate * error * (click.get(i).getY());
                    this.Dibujar_linea(JPanel_principal, Color.pink);
                }
            }
            System.out.println("Iteracion: " + contador_iteracion);
            errorCont[contador_iteracion] = error;
            contador_iteracion++;

        }
        errorGrafica(contador_iteracion, errorCont);
        matrixC(N, verdaderosNegativos, falsosPositivos, falsosNegativos, verdaderosPositivos);

    }

    public void errorGrafica(int contador_iteracion, double[] errorCont) {
        JFreeChart grafico = null;
        DefaultCategoryDataset datos = new DefaultCategoryDataset();

        for (int i = 0; i < contador_iteracion; i++) {
            datos.addValue(errorCont[i], "Error", String.valueOf(i));
        }
        grafico = ChartFactory.createLineChart("ERRORES", "", "", datos, PlotOrientation.VERTICAL, true, true, false);
        ChartPanel cPanel = new ChartPanel(grafico);
        JFrame informacion = new JFrame("Grafica");
        informacion.getContentPane().add(cPanel);
        informacion.pack();
        informacion.setVisible(true);
    }

    public void matrixC(int N, int verdaderosNegativos, int falsosPositivos, int falsosNegativos, int verdaderosPositivos) {
        int total1 = verdaderosNegativos + falsosPositivos;
        int total2 = falsosNegativos + verdaderosPositivos;
        int total3 = verdaderosNegativos + falsosNegativos;
        int total4 = falsosPositivos + verdaderosPositivos;
        int total5 = total1 + total2;

        System.out.print("Numero de datos: " + N + "\n");
        System.out.print("              || Adaline NO ||");
        System.out.print(" Adaline SI ||");
        System.out.print(" TOTAL ||");

        System.out.print("\n || ACTUAL NO ||");
        System.out.print("\t" + verdaderosNegativos + "\t" + falsosPositivos + "\t\t" + total1);
        System.out.print("\n || ACTUAL SI ||");
        System.out.print("\t" + falsosNegativos + "\t" + verdaderosPositivos + "\t\t" + total2);
        System.out.print("\n---------------------------------------------------------");
        System.out.print("\n\t\t\t" + total3 + "\t" + total4 + "\t\t" + total5);

        System.out.print("\n");

    }

}

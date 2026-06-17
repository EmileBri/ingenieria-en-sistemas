/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transformaciones3D;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;


public class Panel extends JPanel {

    int origen = 250;
    int[] x = new int[4];
    int[] y = new int[4];
    int[] z = new int[4];
    double[] xp = new double[4];
    double[] yp = new double[4];
    double[] zp = new double[4];
    double[] xxp = new double[4];
    double[] yyp = new double[4];
    double[] zzp = new double[4];

    Color c1;
    Color c2;
    Color c3;
    int o;

    public Panel(int[] xs, int[] ys, int[] zs, double[] xps, double[] yps, double[] zps, double[] xpps, double[] ypps, double[] zpps, Color ce1, Color ce2, Color ce3, int op) {
        setSize(500, 500);

        x = xs;
        y = ys;
        z = zs;
        
        xp = xps;
        yp = yps;
        zp = zps;
        
        xxp = xpps;
        yyp = ypps;
        zzp = zpps;
        
        c1 = ce1;
        c2 = ce2;
        c3 = ce3;

        o = op;
    }

    private double coord_x(double x) {
        double real_x = -x + this.getWidth() / 2;
        return real_x;
    }

    private double coord_y(double y) {
        double real_y = y + this.getHeight() / 2;
        return (real_y);
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawLine(origen, 0, origen, 500);
        g.drawLine(0, origen, 500, origen);
        g.drawLine(500, 0, 0, 500);

        for (int i = 0, x = 25; i < 100; i++, x += 25) {
            g.drawString(String.valueOf(i + 1), origen + x, origen + 13);
            g.drawString("-" + String.valueOf(i + 1), origen - x, origen + 13);
            g.drawString(String.valueOf(i + 1), origen - 13, origen - x);
            g.drawString("-" + String.valueOf(i + 1), origen - 13, origen + x);
            g.drawLine(origen - (x), origen + (x), (origen - (x)) - 5, (origen + (x)) - 5);
            g.drawString(String.valueOf(i + 1), origen - x + 2, origen + x + 13);
            g.drawLine(origen + (x), origen - (x), (origen + (x)) - 5, (origen - (x)) - 5);
            g.drawString("-" + String.valueOf(i + 1), origen + x + 2, origen - x + 13);
        }

        g.setFont(new Font("Arial", Font.BOLD, 11));
        g.drawString("X", 490, 262);
        g.drawString("Y", 255, 12);
        g.drawString("Z", 12, 499);

        g.setColor(Color.LIGHT_GRAY);
        for (int i = 0, x = 25; i <= 8; i++, x += 25) {
            g.drawLine(origen + x, 0, origen + x, 500);
            g.drawLine(origen - x, 0, origen - x, 500);
            g.drawLine(0, origen - x, 500, origen - x);
            g.drawLine(0, origen + x, 500, origen + x);
        }

        if (o == 1) {
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(c1);

            g2d.setStroke(new BasicStroke(3));
            g2d.drawLine((int) coord_x(25 * (z[0] - x[0])), (int) coord_y(25 * (z[0] - y[0])), (int) coord_x(25 * (z[1] - x[1])), (int) coord_y(25 * (z[1] - y[1])));
            g2d.drawLine((int) coord_x(25 * (z[1] - x[1])), (int) coord_y(25 * (z[1] - y[1])), (int) coord_x(25 * (z[2] - x[2])), (int) coord_y(25 * (z[2] - y[2])));
            g2d.drawLine((int) coord_x(25 * (z[2] - x[2])), (int) coord_y(25 * (z[2] - y[2])), (int) coord_x(25 * (z[3] - x[3])), (int) coord_y(25 * (z[3] - y[3])));
            g2d.drawLine((int) coord_x(25 * (z[3] - x[3])), (int) coord_y(25 * (z[3] - y[3])), (int) coord_x(25 * (z[4] - x[4])), (int) coord_y(25 * (z[4] - y[4])));
              g2d.drawLine((int) coord_x(25 * (z[2] - x[2])), (int) coord_y(25 * (z[2] - y[2])), (int) coord_x(25 * (z[4] - x[4])), (int) coord_y(25 * (z[4] - y[4])));
                g2d.drawLine((int) coord_x(25 * (z[1] - x[1])), (int) coord_y(25 * (z[1] - y[1])), (int) coord_x(25 * (z[4] - x[4])), (int) coord_y(25 * (z[4] - y[4])));
                  g2d.drawLine((int) coord_x(25 * (z[0] - x[0])), (int) coord_y(25 * (z[0] - y[0])), (int) coord_x(25 * (z[4] - x[4])), (int) coord_y(25 * (z[4] - y[4])));
//            g2d.drawLine((int) coord_x(25 * (z[4] - x[4])), (int) coord_y(25 * (z[4] - y[4])), (int) coord_x(25 * (z[5] - x[5])), (int) coord_y(25 * (z[5] - y[5])));
          

            for (int i = 0; i < 5; i++) {
                g2d.fillOval((int) coord_x(25 * (z[i] - x[i]) + 5), (int) coord_y(25 * (z[i] - y[i]) + -5), 10, 10);
            }
            
            g.setColor(Color.black);
            for (int i = 0; i < 5; i++) {
                g.drawString("P" + (i + 1), (int) coord_x(25 * (z[i] - x[i]) + 5), (int) coord_y(25 * (z[i] - y[i]) - 5));
            }
        } else if (o == 2) {
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(c1);

             g2d.setStroke(new BasicStroke(3));
            g2d.drawLine((int) coord_x(25 * (z[0] - x[0])), (int) coord_y(25 * (z[0] - y[0])), (int) coord_x(25 * (z[1] - x[1])), (int) coord_y(25 * (z[1] - y[1])));
            g2d.drawLine((int) coord_x(25 * (z[1] - x[1])), (int) coord_y(25 * (z[1] - y[1])), (int) coord_x(25 * (z[2] - x[2])), (int) coord_y(25 * (z[2] - y[2])));
            g2d.drawLine((int) coord_x(25 * (z[2] - x[2])), (int) coord_y(25 * (z[2] - y[2])), (int) coord_x(25 * (z[3] - x[3])), (int) coord_y(25 * (z[3] - y[3])));
            g2d.drawLine((int) coord_x(25 * (z[3] - x[3])), (int) coord_y(25 * (z[3] - y[3])), (int) coord_x(25 * (z[4] - x[4])), (int) coord_y(25 * (z[4] - y[4])));
             g2d.drawLine((int) coord_x(25 * (z[2] - x[2])), (int) coord_y(25 * (z[2] - y[2])), (int) coord_x(25 * (z[4] - x[4])), (int) coord_y(25 * (z[4] - y[4])));
              g2d.drawLine((int) coord_x(25 * (z[1] - x[1])), (int) coord_y(25 * (z[1] - y[1])), (int) coord_x(25 * (z[4] - x[4])), (int) coord_y(25 * (z[4] - y[4])));
               g2d.drawLine((int) coord_x(25 * (z[0] - x[0])), (int) coord_y(25 * (z[0] - y[0])), (int) coord_x(25 * (z[4] - x[4])), (int) coord_y(25 * (z[4] - y[4])));
          //  g2d.drawLine((int) coord_x(25 * (z[4] - x[4])), (int) coord_y(25 * (z[4] - y[4])), (int) coord_x(25 * (z[5] - x[5])), (int) coord_y(25 * (z[5] - y[5])));
         
           

            for (int i = 0; i < 5; i++) {
                g2d.fillOval((int) coord_x(25 * (z[i] - x[i]) + 5), (int) coord_y(25 * (z[i] - y[i]) + -5), 10, 10);
            }
            
            g.setColor(Color.black);
            for (int i = 0; i < 5; i++) {
                g.drawString("P" + (i + 1), (int) coord_x(25 * (z[i] - x[i]) + 5), (int) coord_y(25 * (z[i] - y[i]) - 5));
            }
            //
            g2d.setColor(c2);

            
             g2d.setStroke(new BasicStroke(3));
            g2d.drawLine((int) coord_x(25 * (zp[0] - xp[0])), (int) coord_y(25 * (zp[0] - yp[0])), (int) coord_x(25 * (zp[1] - xp[1])), (int) coord_y(25 * (zp[1] - yp[1])));
            g2d.drawLine((int) coord_x(25 * (zp[1] - xp[1])), (int) coord_y(25 * (zp[1] - yp[1])), (int) coord_x(25 * (zp[2] - xp[2])), (int) coord_y(25 * (zp[2] - yp[2])));
            g2d.drawLine((int) coord_x(25 * (zp[2] - xp[2])), (int) coord_y(25 * (zp[2] - yp[2])), (int) coord_x(25 * (zp[3] - xp[3])), (int) coord_y(25 * (zp[3] - yp[3])));
            g2d.drawLine((int) coord_x(25 * (zp[3] - xp[3])), (int) coord_y(25 * (zp[3] - yp[3])), (int) coord_x(25 * (zp[4] - xp[4])), (int) coord_y(25 * (zp[4] - yp[4])));
              g2d.drawLine((int) coord_x(25 * (zp[2] - xp[2])), (int) coord_y(25 * (zp[2] - yp[2])), (int) coord_x(25 * (zp[4] - xp[4])), (int) coord_y(25 * (zp[4] - yp[4])));
                g2d.drawLine((int) coord_x(25 * (zp[1] - xp[1])), (int) coord_y(25 * (zp[1] - yp[1])), (int) coord_x(25 * (zp[4] - xp[4])), (int) coord_y(25 * (zp[4] - yp[4])));
                  g2d.drawLine((int) coord_x(25 * (zp[0] - xp[0])), (int) coord_y(25 * (zp[0] - yp[0])), (int) coord_x(25 * (zp[4] - xp[4])), (int) coord_y(25 * (zp[4] - yp[4])));
        //    g2d.drawLine((int) coord_x(25 * (zp[4] - xp[4])), (int) coord_y(25 * (zp[4] - yp[4])), (int) coord_x(25 * (zp[5] - xp[5])), (int) coord_y(25 * (zp[5] - yp[5])));
           

            for (int i = 0; i < 5; i++) {
                g2d.fillOval((int) coord_x(25 * (zp[i] - xp[i]) + 5), (int) coord_y(25 * (zp[i] - yp[i]) + -5), 10, 10);
            }
            
            g.setColor(Color.black);
            for (int i = 0; i < 5; i++) {
                g.drawString("P" + (i + 1) + "'", (int) coord_x(25 * (zp[i] - xp[i]) + 5), (int) coord_y(25 * (zp[i] - yp[i]) - 5));
            }
        } else if (o == 3) {
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(c1);

            g2d.setStroke(new BasicStroke(3));
            g2d.drawLine((int) coord_x(25 * (z[0] - x[0])), (int) coord_y(25 * (z[0] - y[0])), (int) coord_x(25 * (z[1] - x[1])), (int) coord_y(25 * (z[1] - y[1])));
            g2d.drawLine((int) coord_x(25 * (z[1] - x[1])), (int) coord_y(25 * (z[1] - y[1])), (int) coord_x(25 * (z[2] - x[2])), (int) coord_y(25 * (z[2] - y[2])));
            g2d.drawLine((int) coord_x(25 * (z[2] - x[2])), (int) coord_y(25 * (z[2] - y[2])), (int) coord_x(25 * (z[3] - x[3])), (int) coord_y(25 * (z[3] - y[3])));
            g2d.drawLine((int) coord_x(25 * (z[3] - x[3])), (int) coord_y(25 * (z[3] - y[3])), (int) coord_x(25 * (z[4] - x[4])), (int) coord_y(25 * (z[4] - y[4])));
             g2d.drawLine((int) coord_x(25 * (z[2] - x[2])), (int) coord_y(25 * (z[2] - y[2])), (int) coord_x(25 * (z[4] - x[4])), (int) coord_y(25 * (z[4] - y[4])));
              g2d.drawLine((int) coord_x(25 * (z[1] - x[1])), (int) coord_y(25 * (z[1] - y[1])), (int) coord_x(25 * (z[4] - x[4])), (int) coord_y(25 * (z[4] - y[4])));
               g2d.drawLine((int) coord_x(25 * (z[0] - x[0])), (int) coord_y(25 * (z[0] - y[0])), (int) coord_x(25 * (z[4] - x[4])), (int) coord_y(25 * (z[4] - y[4])));
          //  g2d.drawLine((int) coord_x(25 * (z[4] - x[4])), (int) coord_y(25 * (z[4] - y[4])), (int) coord_x(25 * (z[5] - x[5])), (int) coord_y(25 * (z[5] - y[5])));
          

            for (int i = 0; i < 5; i++) {
                g2d.fillOval((int) coord_x(25 * (z[i] - x[i]) + 5), (int) coord_y(25 * (z[i] - y[i]) + -5), 10, 10);
            }
            
            g.setColor(Color.black);
            for (int i = 0; i < 5; i++) {
                g.drawString("P" + (i + 1), (int) coord_x(25 * (z[i] - x[i]) + 5), (int) coord_y(25 * (z[i] - y[i]) - 5));
            }
            //
            g2d.setColor(c2);

            g2d.setStroke(new BasicStroke(3));
            g2d.drawLine((int) coord_x(25 * (zp[0] - xp[0])), (int) coord_y(25 * (zp[0] - yp[0])), (int) coord_x(25 * (zp[1] - xp[1])), (int) coord_y(25 * (zp[1] - yp[1])));
            g2d.drawLine((int) coord_x(25 * (zp[1] - xp[1])), (int) coord_y(25 * (zp[1] - yp[1])), (int) coord_x(25 * (zp[2] - xp[2])), (int) coord_y(25 * (zp[2] - yp[2])));
            g2d.drawLine((int) coord_x(25 * (zp[2] - xp[2])), (int) coord_y(25 * (zp[2] - yp[2])), (int) coord_x(25 * (zp[3] - xp[3])), (int) coord_y(25 * (zp[3] - yp[3])));
            g2d.drawLine((int) coord_x(25 * (zp[3] - xp[3])), (int) coord_y(25 * (zp[3] - yp[3])), (int) coord_x(25 * (zp[4] - xp[4])), (int) coord_y(25 * (zp[4] - yp[4])));
              g2d.drawLine((int) coord_x(25 * (zp[2] - xp[2])), (int) coord_y(25 * (zp[2] - yp[2])), (int) coord_x(25 * (zp[4] - xp[4])), (int) coord_y(25 * (zp[4] - yp[4])));
                g2d.drawLine((int) coord_x(25 * (zp[1] - xp[1])), (int) coord_y(25 * (zp[1] - yp[1])), (int) coord_x(25 * (zp[4] - xp[4])), (int) coord_y(25 * (zp[4] - yp[4])));
                  g2d.drawLine((int) coord_x(25 * (zp[0] - xp[0])), (int) coord_y(25 * (zp[0] - yp[0])), (int) coord_x(25 * (zp[4] - xp[4])), (int) coord_y(25 * (zp[4] - yp[4])));
          //  g2d.drawLine((int) coord_x(25 * (zp[4] - xp[4])), (int) coord_y(25 * (zp[4] - yp[4])), (int) coord_x(25 * (zp[5] - xp[5])), (int) coord_y(25 * (zp[5] - yp[5])));
            
           

            for (int i = 0; i < 4; i++) {
                g2d.fillOval((int) coord_x(25 * (zp[i] - xp[i]) + 5), (int) coord_y(25 * (zp[i] - yp[i]) + -5), 10, 10);
            }
            
            g.setColor(Color.black);
            for (int i = 0; i < 4; i++) {
                g.drawString("P" + (i + 1) + "'", (int) coord_x(25 * (zp[i] - xp[i]) + 5), (int) coord_y(25 * (zp[i] - yp[i]) - 5));
            }
            //
            g2d.setColor(c3);

             g2d.setStroke(new BasicStroke(3));
            g2d.drawLine((int) coord_x(25 * (zzp[0] - xxp[0])), (int) coord_y(25 * (zzp[0] - yyp[0])), (int) coord_x(25 * (zzp[1] - xxp[1])), (int) coord_y(25 * (zzp[1] - yyp[1])));
            g2d.drawLine((int) coord_x(25 * (zzp[1] - xxp[1])), (int) coord_y(25 * (zzp[1] - yyp[1])), (int) coord_x(25 * (zzp[2] - xxp[2])), (int) coord_y(25 * (zzp[2] - yyp[2])));
            g2d.drawLine((int) coord_x(25 * (zzp[2] - xxp[2])), (int) coord_y(25 * (zzp[2] - yyp[2])), (int) coord_x(25 * (zzp[3] - xxp[3])), (int) coord_y(25 * (zzp[3] - yyp[3])));
            g2d.drawLine((int) coord_x(25 * (zzp[3] - xxp[3])), (int) coord_y(25 * (zzp[3] - yyp[3])), (int) coord_x(25 * (zzp[4] - xxp[4])), (int) coord_y(25 * (zzp[4] - yyp[4])));
             g2d.drawLine((int) coord_x(25 * (zzp[2] - xxp[2])), (int) coord_y(25 * (zzp[2] - yyp[2])), (int) coord_x(25 * (zzp[4] - xxp[4])), (int) coord_y(25 * (zzp[4] - yyp[4])));
              g2d.drawLine((int) coord_x(25 * (zzp[1] - xxp[1])), (int) coord_y(25 * (zzp[1] - yyp[1])), (int) coord_x(25 * (zzp[4] - xxp[4])), (int) coord_y(25 * (zzp[4] - yyp[4])));
               g2d.drawLine((int) coord_x(25 * (zzp[0] - xxp[0])), (int) coord_y(25 * (zzp[0] - yyp[0])), (int) coord_x(25 * (zzp[4] - xxp[4])), (int) coord_y(25 * (zzp[4] - yyp[4])));
          //  g2d.drawLine((int) coord_x(25 * (zzp[4] - xxp[4])), (int) coord_y(25 * (zzp[4] - yyp[4])), (int) coord_x(25 * (zzp[5] - xxp[5])), (int) coord_y(25 * (zzp[5] - yyp[5])));
           

            for (int i = 0; i < 5; i++) {
                g2d.fillOval((int) coord_x(25 * (zzp[i] - xxp[i]) + 5), (int) coord_y(25 * (zzp[i] - yyp[i]) + -5), 10, 10);
            }
            
            g.setColor(Color.black);
            for (int i = 0; i < 5; i++) {
                g.drawString("P" + (i + 1) + "''", (int) coord_x(25 * (zzp[i] - xxp[i]) + 5), (int) coord_y(25 * (zzp[i] - yyp[i]) - 5));
            }
        }
    }

}

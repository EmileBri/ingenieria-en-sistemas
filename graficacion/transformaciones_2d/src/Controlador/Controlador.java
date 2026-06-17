package Controlador;

// Importaciones
import Vistas.Creditos;
import Vistas.Escalacion;
import Vistas.Menu;
import Vistas.PlanoEscalacion;
import Vistas.PlanoRotacion;
import Vistas.PlanoTraslaciones;
import Vistas.Portada;
import Vistas.Rotacion_Generica;
import Vistas.Rotacion;
import Vistas.Traslacion_Generica;
import Vistas.Traslacion_Inversa;
import Vistas.Traslaciones;
import Vistas.Vista_Rotacion;
import Vistas.Vista_TraslacionInversa;
import Vistas.Vista_Traslacion_Generica;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Controlador implements ActionListener, MouseListener {

    Portada portadav;
    Menu m;
    Traslaciones tr;
    PlanoTraslaciones ptr;
    Escalacion es;
    PlanoEscalacion pes;
    Rotacion rot;
    PlanoRotacion prt;
    Creditos cr;
    Vista_TraslacionInversa vTrasInv;
    Traslacion_Inversa trasInvGen;
    Vista_Rotacion vRotGen;
    Rotacion_Generica rotGen;
    Vista_Traslacion_Generica vTrasGen;
    Traslacion_Generica trasGen;

    public Controlador(Portada portadav, Menu m, Traslaciones tr, PlanoTraslaciones ptr, Escalacion es, PlanoEscalacion pes,
            Rotacion rot, PlanoRotacion prt, Creditos cr, Vista_TraslacionInversa vTrasInv, Traslacion_Inversa trasInvGen,
            Vista_Rotacion vRotGen, Rotacion_Generica rotGen, Vista_Traslacion_Generica vTrasGen, Traslacion_Generica trasGen) {

        this.cr = cr;
        this.cr.menu.addActionListener(this);
        this.m = m;

        this.m.btnCred.addActionListener(this);

        this.portadav = portadav;
        this.portadav.setVisible(true);

        this.portadav.BtnAv.addActionListener(this);

        this.m.BtnEsca.addActionListener(this);
        this.m.btnTras.addActionListener(this);
        this.m.btnRota.addActionListener(this);
        this.m.btnTrasInv.addActionListener(this);
        this.m.btnRotaGen.addActionListener(this);
        this.m.btnTrasGen.addActionListener(this);
        this.m.btnPortada.addActionListener(this);

        this.vTrasInv = vTrasInv;
        this.trasInvGen = trasInvGen;
        this.vRotGen = vRotGen;
        this.rotGen = rotGen;
        this.trasGen = trasGen;
        this.vTrasGen = vTrasGen;
        this.rot = rot;
        this.prt = prt;
        this.prt.setTamaño(this.rot);
        this.rot.jPlano2.add(this.prt);
        this.rot.btnGraf.addActionListener(this);
        this.rot.btnApl.addActionListener(this);
        this.rot.btnRestaurar.addActionListener(this);

        this.rot.btnMenu.addActionListener(this);

        this.es = es;
        this.pes = pes;
        this.pes.setTamaño(this.es);
        this.es.jPlano2.add(this.pes);
        this.es.btnGraf.addActionListener(this);
        this.es.btnApl.addActionListener(this);
        this.es.btnRestaurar.addActionListener(this);

        this.es.btnMenu.addActionListener(this);

        this.tr = tr;
        this.ptr = ptr;
        this.ptr.setTamaño(this.tr);
        this.tr.jPlano2.add(this.ptr);
        this.tr.btnMenu.addActionListener(this);
        this.tr.btnGraf.addActionListener(this);
        this.tr.btnApl.addActionListener(this);
        this.tr.btnRestaurar.addActionListener(this);

        this.vTrasInv.setVisible(false);
        this.trasInvGen.setTamaño(this.vTrasInv);
        this.vTrasInv.jPlano2.add(this.trasInvGen);
        this.vTrasInv.btnMenu.addActionListener(this);
        this.vTrasInv.btnGraf.addActionListener(this);
        this.vTrasInv.btnApl.addActionListener(this);

        this.vRotGen.setVisible(false);
        this.rotGen.setTamaño(this.vRotGen);
        this.vRotGen.jPlano2.add(this.rotGen);
        this.vRotGen.btnGraf.addActionListener(this);
        this.vRotGen.btnApl.addActionListener(this);
        this.vRotGen.btnMenu.addActionListener(this);

        this.vTrasGen.setVisible(false);
        this.trasGen.setTamaño(this.vTrasGen);
        this.vTrasGen.jPlano2.add(this.trasGen);
        this.vTrasGen.btnMenu.addActionListener(this);
        this.vTrasGen.btnGraf.addActionListener(this);
        this.vTrasGen.btnApl.addActionListener(this);

        this.tr.setVisible(false);
        this.es.setVisible(false);
        this.m.setVisible(false);

    }

    public void tablaTrasOr(JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        modelo.addColumn("Punto");
        modelo.addColumn(" X ");
        modelo.addColumn(" Y ");
        Object[] columna = new Object[3];
        for (int i = 0; i < 5; i++) {
            columna[0] = "P" + (i + 1);
            columna[1] = this.ptr.vectorPuntos[0][i];
            columna[2] = this.ptr.vectorPuntos[1][i];
            modelo.addRow(columna);
        }

    }

    public void tablaTrasTrS(JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        modelo.addColumn("Punto'");
        modelo.addColumn(" X' ");
        modelo.addColumn(" Y' ");
        Object[] columna = new Object[3];
        for (int i = 0; i < 5; i++) {
            columna[0] = "P'" + (i + 1);

            modelo.addRow(columna);
        }
    }

    public void tablaTrasSusOr(JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        modelo.addColumn("Punto");
        modelo.addColumn(" X ");
        modelo.addColumn(" Y ");
        Object[] columna = new Object[3];
        for (int i = 0; i < 5; i++) {
            columna[0] = "P" + (i + 1);

            modelo.addRow(columna);
        }

    }

    public void tablaTrasTrS2(JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        modelo.addColumn("Punto''");
        modelo.addColumn(" X'' ");
        modelo.addColumn(" Y'' ");
        Object[] columna = new Object[3];
        for (int i = 0; i < 5; i++) {
            columna[0] = "P''" + (i + 1);

            modelo.addRow(columna);
        }
    }

    public void tablaTrasVaciar(JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        modelo.addColumn("Punto");
        modelo.addColumn(" X ");
        modelo.addColumn(" Y ");
        Object[] columna = new Object[3];
        for (int i = 0; i < 5; i++) {
            columna[0] = "";
            columna[1] = "";
            columna[2] = "";
            modelo.addRow(columna);
        }

    }

    public void tablaTrasTr(JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        modelo.addColumn("Punto'");
        modelo.addColumn(" X' ");
        modelo.addColumn(" Y' ");
        Object[] columna = new Object[3];
        for (int i = 0; i < 5; i++) {
            columna[0] = "P'" + (i + 1);
            columna[1] = this.ptr.vPuntosTrasladados[0][i];
            columna[2] = this.ptr.vPuntosTrasladados[1][i];

            modelo.addRow(columna);
        }
    }

    public void tablaEscaOr(JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        modelo.addColumn("Punto");
        modelo.addColumn(" X ");
        modelo.addColumn(" Y ");
        Object[] columna = new Object[3];
        for (int i = 0; i < 5; i++) {
            columna[0] = "P" + (i + 1);
            columna[1] = this.pes.vectorPuntos[0][i];
            columna[2] = this.pes.vectorPuntos[1][i];
            modelo.addRow(columna);
        }

    }

    public void tablaEscaEs(JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        modelo.addColumn("Punto'");
        modelo.addColumn(" X' ");
        modelo.addColumn(" Y' ");
        Object[] columna = new Object[3];
        for (int i = 0; i < 5; i++) {
            columna[0] = "P'" + (i + 1);
            columna[1] = this.pes.vPuntosEscalacion[0][i];
            columna[2] = this.pes.vPuntosEscalacion[1][i];
            modelo.addRow(columna);
        }
    }

    public void tablaRotaOr(JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        modelo.addColumn("Punto");
        modelo.addColumn(" X ");
        modelo.addColumn(" Y ");
        Object[] columna = new Object[3];
        for (int i = 0; i < 5; i++) {
            columna[0] = "P" + (i + 1);
            columna[1] = this.prt.vectorPuntos[0][i];
            columna[2] = this.prt.vectorPuntos[1][i];
            modelo.addRow(columna);
        }

    }

    public void tablaRotaRot(JTable tabla) {
        DecimalFormat f = new DecimalFormat("00.0");
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        modelo.addColumn("Punto'");
        modelo.addColumn(" X' ");
        modelo.addColumn(" Y' ");
        Object[] columna = new Object[3];
        for (int i = 0; i < 5; i++) {
            columna[0] = "P'" + (i + 1);
            columna[1] = f.format(this.prt.vPuntosRotacion[0][i]);
            columna[2] = f.format(this.prt.vPuntosRotacion[1][i]);
            modelo.addRow(columna);
        }
    }

    public void tablaEscaSusOr(JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        modelo.addColumn("Punto");
        modelo.addColumn(" X ");
        modelo.addColumn(" Y ");
        Object[] columna = new Object[3];
        for (int i = 0; i < 5; i++) {
            columna[0] = "P" + (i + 1);

            modelo.addRow(columna);
        }

    }

    public void tablaEscaSus(JTable tabla) {
        DecimalFormat f = new DecimalFormat("#.00");
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        modelo.addColumn("Punto'");
        modelo.addColumn(" X' ");
        modelo.addColumn(" Y' ");
        Object[] columna = new Object[3];
        for (int i = 0; i < 5; i++) {
            columna[0] = "P'" + (i + 1);

            modelo.addRow(columna);
        }
    }

    public void tablaEscaSus2(JTable tabla) {
        DecimalFormat f = new DecimalFormat("#.00");
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        modelo.addColumn("Punto''");
        modelo.addColumn(" X'' ");
        modelo.addColumn(" Y'' ");
        Object[] columna = new Object[3];
        for (int i = 0; i < 5; i++) {
            columna[0] = "P''" + (i + 1);

            modelo.addRow(columna);
        }
    }

    //
    public void tablaRotaSusOr(JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        modelo.addColumn("Punto");
        modelo.addColumn(" X ");
        modelo.addColumn(" Y ");
        Object[] columna = new Object[3];
        for (int i = 0; i < 5; i++) {
            columna[0] = "P" + (i + 1);

            modelo.addRow(columna);
        }

    }

    public void tablaRotaSus(JTable tabla) {
        DecimalFormat f = new DecimalFormat("00.00");
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        modelo.addColumn("Punto'");
        modelo.addColumn(" X' ");
        modelo.addColumn(" Y' ");
        Object[] columna = new Object[3];
        for (int i = 0; i < 5; i++) {
            columna[0] = "P'" + (i + 1);

            modelo.addRow(columna);
        }
    }

    public void tablaRotaSus2(JTable tabla) {
        DecimalFormat f = new DecimalFormat("#.00");
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        modelo.addColumn("Punto''");
        modelo.addColumn(" X'' ");
        modelo.addColumn(" Y'' ");
        Object[] columna = new Object[3];
        for (int i = 0; i < 5; i++) {
            columna[0] = "P''" + (i + 1);

            modelo.addRow(columna);
        }
    }

    public void tablaTrasInveTrInv(JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        modelo.addColumn("Punto'");
        modelo.addColumn(" X' ");
        modelo.addColumn(" Y' ");
        Object[] columna = new Object[4];
        for (int i = 0; i < 5; i++) {
            columna[0] = "P'" + (i + 1);
            columna[1] = this.trasInvGen.vPuntosTrasladados[0][i];
            columna[2] = this.trasInvGen.vPuntosTrasladados[1][i];

            modelo.addRow(columna);
        }
    }

    public void tablaTrasInvOr(JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        modelo.addColumn("Punto");
        modelo.addColumn(" X ");
        modelo.addColumn(" Y ");
        Object[] columna = new Object[4];
        for (int i = 0; i < 5; i++) {
            columna[0] = "P" + (i + 1);
            columna[1] = this.trasInvGen.vectorPuntos[0][i];
            columna[2] = this.trasInvGen.vectorPuntos[1][i];
            modelo.addRow(columna);
        }

    }

    public void tablaRotaGenRota(JTable tabla) {
        DecimalFormat f = new DecimalFormat("00.0");
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        modelo.addColumn("Punto''");
        modelo.addColumn(" X'' ");
        modelo.addColumn(" Y'' ");
        Object[] columna = new Object[4];
        for (int i = 0; i < 5; i++) {
            columna[0] = "P''" + (i + 1);
            columna[1] = f.format(this.rotGen.vPuntosRotacion[0][i]);
            columna[2] = f.format(this.rotGen.vPuntosRotacion[1][i]);
            modelo.addRow(columna);
        }
    }

    public void tablaRotaGenOr(JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        modelo.addColumn("Punto'");
        modelo.addColumn(" X' ");
        modelo.addColumn(" Y' ");
        Object[] columna = new Object[4];
        for (int i = 0; i < 5; i++) {
            columna[0] = "P'" + (i + 1);
            columna[1] = this.rotGen.vectorPuntos[0][i];
            columna[2] = this.rotGen.vectorPuntos[1][i];
            modelo.addRow(columna);
        }

    }

    public void tablaTrasTrGen(JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        modelo.addColumn("Punto'''");
        modelo.addColumn(" X''' ");
        modelo.addColumn(" Y''' ");
        Object[] columna = new Object[4];
        for (int i = 0; i < 5; i++) {
            columna[0] = "P'''" + (i + 1);
            columna[1] = this.trasGen.vPuntosTrasladados[0][i];
            columna[2] = this.trasGen.vPuntosTrasladados[1][i];

            modelo.addRow(columna);
        }
    }

    public void tablaTrasOrGen(JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        modelo.addColumn("Punto''");
        modelo.addColumn(" X'' ");
        modelo.addColumn(" Y'' ");
        Object[] columna = new Object[4];
        for (int i = 0; i < 5; i++) {
            columna[0] = "P''" + (i + 1);
            columna[1] = this.trasGen.vectorPuntos[0][i];
            columna[2] = this.trasGen.vectorPuntos[1][i];
            modelo.addRow(columna);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (cr.menu == e.getSource()) {
            m.setVisible(true);
            cr.setVisible(false);
        }
        if (m.btnCred == e.getSource()) {
            m.setVisible(false);
            cr.setVisible(true);
        }
        if (m.btnPortada == e.getSource()) {
            m.setVisible(false);
            portadav.setVisible(true);
        }
        if (portadav.BtnAv == e.getSource()) {
            portadav.setVisible(false);
            m.setVisible(true);
        }
        if (tr.btnMenu == e.getSource()) {
            m.setVisible(true);
            tr.setVisible(false);
            tr.btnGraf.setEnabled(true);
            tr.btnApl.setEnabled(false);
            tr.btnRestaurar.setEnabled(false);
            this.tablaTrasVaciar(tr.jTablaTras);
            this.tablaTrasVaciar(tr.jtablaOr);
            ptr.setBtnGraf(-1);
            ptr.setBtnAplicar(-1);
            ptr.setBtnRestaurar(-1);
            ptr.restaurar();
            tr.repaint();
            tr.txtTx.setEditable(false);
            tr.txtTy.setEditable(false);
        }
        if (rot.btnMenu == e.getSource()) {
            m.setVisible(true);
            rot.setVisible(false);
            rot.btnGraf.setEnabled(true);
            rot.btnApl.setEnabled(false);
            rot.btnRestaurar.setEnabled(false);

            rot.txtAngulo.setEditable(false);

            this.tablaTrasVaciar(rot.jTablaTras);
            this.tablaTrasVaciar(rot.jtablaOr);
            prt.restaurar();
            prt.setBtnGraf(-1);
            prt.setBtnAplicar(-1);
            prt.setBtnRestaurar(-1);
            rot.repaint();
        }
        if (es.btnMenu == e.getSource()) {
            m.setVisible(true);
            es.setVisible(false);
            es.btnGraf.setEnabled(true);
            es.btnApl.setEnabled(false);
            es.btnRestaurar.setEnabled(false);
            es.txtTx.setEditable(false);
            es.txtTy.setEditable(false);
            this.tablaTrasVaciar(es.jTablaTras);
            this.tablaTrasVaciar(es.jtablaOr);
            pes.restaurar();
            pes.setBtnGraf(-1);
            pes.setBtnAplicar(-1);
            pes.setBtnRestaurar(-1);
            es.repaint();
        }
        if (m.btnTras == e.getSource()) {
            m.setVisible(false);
            tr.setVisible(true);
        }
        if (m.BtnEsca == e.getSource()) {
            m.setVisible(false);
            es.setVisible(true);
        }
        if (m.btnRota == e.getSource()) {
            m.setVisible(false);
            rot.setVisible(true);
        }
        if (tr.btnGraf == e.getSource()) {
            ptr.setBtnGraf(1);
            ptr.setBtnAplicar(-1);
            ptr.setBtnRestaurar(-1);
            tr.repaint();
            tr.btnGraf.setEnabled(false);
            tr.btnApl.setEnabled(true);
            tr.btnRestaurar.setEnabled(false);
            tr.txtTx.setEditable(true);
            tr.txtTy.setEditable(true);
            this.tablaTrasOr(tr.jtablaOr);

        }
        if (tr.btnApl == e.getSource()) {
            if (tr.txtTx.getText().isEmpty() == true) {
                System.out.println("Error, Ingresa los datos");
                //JOptionPane.showMessageDialog(null, "Error no a igresado los valores\n de traslación", "Atención", JOptionPane.ERROR);
            } else {

                double tx = Double.parseDouble(tr.txtTx.getText());
                double ty = Double.parseDouble(tr.txtTy.getText());
                if ((tx < 16 && tx > -16) && (ty < 16 && ty > -16)) {
                    ptr.setTx((double) tx);
                    ptr.setTy((double) ty);

                    ptr.setBtnAplicar(1);
                    ptr.setBtnGraf(-1);
                    ptr.setBtnRestaurar(-1);
                    tr.btnGraf.setEnabled(false);
                    tr.btnRestaurar.setEnabled(true);
                    tr.repaint();
                    this.ptr.aplicarTraslacion(tx, ty);
                    this.tablaTrasTr(tr.jTablaTras);

                }
            }
        }
        if (tr.btnRestaurar == e.getSource()) {
            tr.btnGraf.setEnabled(true);
            tr.btnApl.setEnabled(false);
            tr.btnRestaurar.setEnabled(false);
            this.tablaTrasVaciar(tr.jTablaTras);
            this.tablaTrasVaciar(tr.jtablaOr);
            ptr.setBtnGraf(-1);
            ptr.setBtnAplicar(-1);
            ptr.setBtnRestaurar(-1);
            ptr.restaurar();
            tr.repaint();
            tr.txtTx.setEditable(false);
            tr.txtTy.setEditable(false);
        }
        if (es.btnGraf == e.getSource()) {
            pes.setBtnGraf(1);
            pes.setBtnAplicar(-1);
            pes.setBtnRestaurar(-1);
            es.repaint();
            es.btnGraf.setEnabled(false);
            es.btnApl.setEnabled(true);
            es.btnRestaurar.setEnabled(false);
            es.txtTx.setEditable(true);
            es.txtTy.setEditable(true);
            this.tablaEscaOr(es.jtablaOr);

        }
        if (es.btnApl == e.getSource()) {
            if (es.txtTx.getText().isEmpty() == true) {
                System.out.println("Error, Ingresa los datos");
                //  JOptionPane.showMessageDialog(null, "Error no a igresado los valores\n de traslación", "Atención", JOptionPane.ERROR);
            } else {

                double sx = Double.parseDouble(es.txtTx.getText());
                double sy = Double.parseDouble(es.txtTy.getText());
                if ((sx < 16 && sx > -16) && (sy < 16 && sy > -16)) {
                    pes.setSx((double) sx);
                    pes.setSy((double) sy);

                    pes.setBtnAplicar(1);
                    pes.setBtnGraf(-1);
                    pes.setBtnRestaurar(-1);
                    es.btnGraf.setEnabled(false);
                    es.btnRestaurar.setEnabled(true);
                    es.repaint();
                    this.pes.aplicarEscalacion(sx, sy);
                    this.tablaEscaEs(es.jTablaTras);

                }
            }
        }
        if (es.btnRestaurar == e.getSource()) {
            es.btnGraf.setEnabled(true);
            es.btnApl.setEnabled(false);
            es.btnRestaurar.setEnabled(false);

            es.txtTx.setEditable(false);
            es.txtTy.setEditable(false);
            this.tablaTrasVaciar(es.jTablaTras);
            this.tablaTrasVaciar(es.jtablaOr);
            pes.restaurar();
            pes.setBtnGraf(-1);
            pes.setBtnAplicar(-1);
            pes.setBtnRestaurar(-1);
            es.repaint();
        }
        //
        if (rot.btnGraf == e.getSource()) {
            prt.setBtnGraf(1);
            prt.setBtnAplicar(-1);
            prt.setBtnRestaurar(-1);
            rot.repaint();
            rot.btnGraf.setEnabled(false);
            rot.btnApl.setEnabled(true);
            rot.btnRestaurar.setEnabled(false);
            rot.txtAngulo.setEditable(true);

            this.tablaRotaOr(rot.jtablaOr);

        }
        if (rot.btnApl == e.getSource()) {
            if (rot.txtAngulo.getText().isEmpty() == true) {
                System.out.println("Error, Ingresa los datos");

            } else {

                double angulo = Double.parseDouble(rot.txtAngulo.getText());

                prt.setAngulo(angulo);

                prt.establecerAngulosRadios();
                prt.setBtnAplicar(1);
                prt.setBtnGraf(-1);
                prt.setBtnRestaurar(-1);
                rot.btnGraf.setEnabled(false);
                rot.btnRestaurar.setEnabled(true);
                rot.repaint();
                this.prt.aplicarRotacion(angulo);
                this.tablaRotaRot(rot.jTablaTras);

            }
        }
        if (rot.btnRestaurar == e.getSource()) {
            rot.btnGraf.setEnabled(true);
            rot.btnApl.setEnabled(false);
            rot.btnRestaurar.setEnabled(false);

            rot.txtAngulo.setEditable(false);

            this.tablaTrasVaciar(rot.jTablaTras);
            this.tablaTrasVaciar(rot.jtablaOr);
            prt.restaurar();
            prt.setBtnGraf(-1);
            prt.setBtnAplicar(-1);
            prt.setBtnRestaurar(-1);
            rot.repaint();
        }

        if (vTrasInv.btnMenu == e.getSource()) {
            m.setVisible(true);
            vTrasInv.setVisible(false);
            vTrasInv.btnGraf.setEnabled(true);
            vTrasInv.btnApl.setEnabled(false);

            this.tablaTrasVaciar(vTrasInv.jTablaTras);
            this.tablaTrasVaciar(vTrasInv.jtablaOr);
            trasInvGen.setBtnGraf(-1);
            trasInvGen.setBtnAplicar(-1);
            trasInvGen.setBtnRestaurar(-1);
            trasInvGen.restaurar();
            vTrasInv.repaint();
            vTrasInv.txtTx.setEditable(false);
            vTrasInv.txtTy.setEditable(false);
        }

        if (vTrasInv.btnGraf == e.getSource()) {
            trasInvGen.setBtnGraf(1);
            trasInvGen.setBtnAplicar(-1);
            trasInvGen.setBtnRestaurar(-1);
            vTrasInv.repaint();
            vTrasInv.btnGraf.setEnabled(false);
            vTrasInv.btnApl.setEnabled(true);

            vTrasInv.txtTx.setEditable(true);
            vTrasInv.txtTy.setEditable(true);
            this.tablaTrasInvOr(vTrasInv.jtablaOr);

        }

        if (vTrasInv.btnApl == e.getSource()) {
            if (vTrasInv.txtTx.getText().isEmpty() == true) {
                JOptionPane.showMessageDialog(null, "INGRESA LOS DATOS DE TRASLACION",
                        "ERROR!", JOptionPane.ERROR_MESSAGE);
            } else {

                double tx = Double.parseDouble(vTrasInv.txtTx.getText());
                double ty = Double.parseDouble(vTrasInv.txtTy.getText());
                if ((tx < 16 && tx > -16) && (ty < 16 && ty > -16)) {
                    trasInvGen.setTx((double) tx);
                    trasInvGen.setTy((double) ty);

                    trasInvGen.setBtnAplicar(1);
                    trasInvGen.setBtnGraf(-1);
                    trasInvGen.setBtnRestaurar(-1);
                    vTrasInv.btnGraf.setEnabled(false);
                    //vTras.btnRestaurar.setEnabled(true);
                    vTrasInv.repaint();
                    this.trasInvGen.aplicarTraslacion(tx, ty);
                    this.tablaTrasInveTrInv(vTrasInv.jTablaTras);

                }
            }
        }
        if (m.btnTrasInv == e.getSource()) {
            m.setVisible(false);
            vTrasInv.setVisible(true);
        }

        if (vRotGen.btnGraf == e.getSource()) {
            rotGen.setBtnGraf(1);
            rotGen.setBtnAplicar(-1);
            rotGen.setBtnRestaurar(-1);
            vRotGen.repaint();
            vRotGen.btnGraf.setEnabled(false);
            vRotGen.btnApl.setEnabled(true);
            vRotGen.txtAngulo.setEditable(true);

            this.tablaRotaGenOr(vRotGen.jtablaOr);

        }
        if (vRotGen.btnApl == e.getSource()) {
            if (vRotGen.txtAngulo.getText().isEmpty() == true) {
                JOptionPane.showMessageDialog(null, "INGRESA LOS DATOS DE ROTACION",
                        "ERROR!", JOptionPane.ERROR_MESSAGE);
            } else {

                double angulo = Double.parseDouble(vRotGen.txtAngulo.getText());

                rotGen.setAngulo(angulo);

                rotGen.establecerAngulosRadios();
                rotGen.setBtnAplicar(1);
                rotGen.setBtnGraf(-1);
                rotGen.setBtnRestaurar(-1);
                vRotGen.btnGraf.setEnabled(false);

                vRotGen.repaint();
                this.rotGen.aplicarRotacion(angulo);
                this.tablaRotaGenRota(vRotGen.jTablaTras);

            }
        }

        if (vRotGen.btnMenu == e.getSource()) {
            m.setVisible(true);
            vRotGen.setVisible(false);
            vRotGen.btnGraf.setEnabled(true);
            vRotGen.btnApl.setEnabled(false);
            vRotGen.txtAngulo.setText("180");
            vRotGen.txtAngulo.setEditable(false);

            this.tablaTrasVaciar(vRotGen.jTablaTras);
            this.tablaTrasVaciar(vRotGen.jtablaOr);
            rotGen.restaurar();
            rotGen.setBtnGraf(-1);
            rotGen.setBtnAplicar(-1);
            rotGen.setBtnRestaurar(-1);
            vRotGen.repaint();
        }

        if (m.btnRotaGen == e.getSource()) {
            m.setVisible(false);
            vRotGen.setVisible(true);
        }

        if (vTrasGen.btnMenu == e.getSource()) {
            m.setVisible(true);
            vTrasGen.setVisible(false);
            vTrasGen.btnGraf.setEnabled(true);
            vTrasGen.btnApl.setEnabled(false);

            this.tablaTrasVaciar(vTrasGen.jTablaTras);
            this.tablaTrasVaciar(vTrasGen.jtablaOr);
            trasGen.setBtnGraf(-1);
            trasGen.setBtnAplicar(-1);
            trasGen.setBtnRestaurar(-1);
            trasGen.restaurar();
            vTrasGen.repaint();
            vTrasGen.txtTx.setEditable(false);
            vTrasGen.txtTy.setEditable(false);
        }

        if (m.btnTrasGen == e.getSource()) {
            m.setVisible(false);
            vTrasGen.setVisible(true);
        }

        if (vTrasGen.btnGraf == e.getSource()) {
            trasGen.setBtnGraf(1);
            trasGen.setBtnAplicar(-1);
            trasGen.setBtnRestaurar(-1);
            vTrasGen.repaint();
            vTrasGen.btnGraf.setEnabled(false);
            vTrasGen.btnApl.setEnabled(true);
            vTrasGen.txtTx.setEditable(true);
            vTrasGen.txtTy.setEditable(true);
            this.tablaTrasOrGen(vTrasGen.jtablaOr);

        }
        if (vTrasGen.btnApl == e.getSource()) {
            if (vTrasGen.txtTx.getText().isEmpty() == true) {
                JOptionPane.showMessageDialog(null, "INGRESA LOS DATOS DE TRASLACION",
                        "ERROR!", JOptionPane.ERROR_MESSAGE);
            } else {

                double tx = Double.parseDouble(vTrasGen.txtTx.getText());
                double ty = Double.parseDouble(vTrasGen.txtTy.getText());
                if ((tx < 16 && tx > -16) && (ty < 16 && ty > -16)) {
                    trasGen.setTx((double) tx);
                    trasGen.setTy((double) ty);

                    trasGen.setBtnAplicar(1);
                    trasGen.setBtnGraf(-1);
                    trasGen.setBtnRestaurar(-1);
                    vTrasGen.btnGraf.setEnabled(false);

                    vTrasGen.repaint();
                    this.trasGen.aplicarTraslacion(tx, ty);
                    this.tablaTrasTrGen(vTrasGen.jTablaTras);

                }
            }
        }

    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {

    }//

    ///
    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {

    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {

    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {

    }

    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {

    }

}

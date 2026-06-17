
package Transformaciones3D;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class ColorT extends DefaultTableCellRenderer  {
    private Component Componente;

    @Override
    public Component getTableCellRendererComponent(JTable jTable1, Object value, boolean isSelect, boolean hasFocus, int row, int column) {
       Componente = super.getTableCellRendererComponent(jTable1, value, isSelect, hasFocus, row, column);
       if(row>4){
           Componente.setForeground(Color.red);
       }else{
           Componente.setForeground(Color.black);
       }
       return Componente;
    }
    

}

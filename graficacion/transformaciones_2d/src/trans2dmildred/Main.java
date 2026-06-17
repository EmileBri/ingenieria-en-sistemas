package trans2dmildred;

// Importaciones
import Controlador.Controlador;
import Vistas.Creditos;
import Vistas.Escalacion;
import Vistas.Portada;
import Vistas.PlanoEscalacion;
import Vistas.PlanoRotacion;
import Vistas.PlanoTraslaciones;
import Vistas.Menu;
import Vistas.Rotacion_Generica;
import Vistas.Rotacion;
import Vistas.Traslacion_Generica;
import Vistas.Traslacion_Inversa;
import Vistas.Traslaciones;
import Vistas.Vista_Rotacion;
import Vistas.Vista_TraslacionInversa;
import Vistas.Vista_Traslacion_Generica;

public class Main {

    public static void main(String[] args) {
        
        Portada p = new Portada();
        Menu m = new Menu();
        Traslaciones tr = new Traslaciones();
        PlanoTraslaciones ptr = new PlanoTraslaciones();
        Escalacion es = new Escalacion();
        PlanoEscalacion pes = new PlanoEscalacion();
        Rotacion r = new Rotacion();
        PlanoRotacion pr = new PlanoRotacion();
        Creditos cr = new Creditos();
        Vista_TraslacionInversa vTrasInv = new Vista_TraslacionInversa();
        Traslacion_Inversa trasInvGen = new Traslacion_Inversa();
        Vista_Rotacion vRotGen = new Vista_Rotacion();
        Rotacion_Generica rotGen = new Rotacion_Generica();
        Vista_Traslacion_Generica vTrasGen = new Vista_Traslacion_Generica();;
        Traslacion_Generica trasGen = new Traslacion_Generica();;

        Controlador controlador = new Controlador(p, m, tr, ptr, es, pes, r, pr, cr, vTrasInv,
                trasInvGen, vRotGen, rotGen, vTrasGen, trasGen);

    }

}

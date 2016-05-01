import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by francisco on 21/04/16.
 */
public class PrestamosBD extends SQLiteOpenHelper {

    private static final int VERSION_BASEDATOS = 1;

    private static final String PRESTAMOS = "PRESTAMOS.db";

    private static final String Datos_Prestamo = "CREATE TABLE prestamo" +
            "(_id INT PRIMARY KEY, Tipo de articulo TEXT, Nombre de articulo, Fecha inicial DATE, Fecha final DATE, Dias de prestamo INT)";

    private static  final String Datos_Persona = "CREATE TABLE persona"+
            "(_id INT PRIMARY KEY, Nombre TEXT, Edad INT, Correo TEXT, Telefono INT)";

    public PrestamosBD(Context context){
        super(context, PRESTAMOS, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
            db.execSQL(Datos_Prestamo);
            db.execSQL(Datos_Persona);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newView){

    }
}

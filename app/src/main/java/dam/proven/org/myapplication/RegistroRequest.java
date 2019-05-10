package dam.proven.org.myapplication;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class RegistroRequest extends StringRequest {
    private static final String ruta = "https://buckapp.000webhostapp.com/registro.php";
    private Map<String, String> parametros;
    public RegistroRequest(String nombre, String usuario, String password, Response.Listener<String>listener){
        super (Request.Method.POST,ruta, listener, null);
        parametros= new HashMap<>();
        parametros.put("nombre",nombre + " ");
        parametros.put("usuario",usuario + " ");
        parametros.put("password",password + " ");
    }

    @Override
    protected Map<String, String> getParams(){

        return parametros;
    }
}

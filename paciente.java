import java.lang.Comparable;
public class paciente implements Comparable<char> {
    
    private String nombre;
    private String condicion;
    private char codigo;
    
    public paciente(String nombre, String condicion, char codigo){
        nombre = this.nombre;
        condicion = this.condicion;
        codigo = this.codigo;
    }

    @Override
    public int compareTo(char otroCodigo) {
        if (codigo==otroCodigo){
            return 0;
        }
        else if (codigo>otroCodigo){
            return 1;
        }
        else{
            return -1;
        }
    }
    
    
}

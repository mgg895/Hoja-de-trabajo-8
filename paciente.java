import java.lang.Comparable;
public class paciente implements Comparable<String> {
    
    private String nombre;
    private String condicion;
    private String codigo;
    
    public paciente(String nombre, String condicion, String codigo){
        nombre = this.nombre;
        condicion = this.condicion;
        codigo = this.codigo;
    }

    @Override
    public int compareTo(String valor) {
        char esteCodigo = codigo.charAt(0);
        char otroCodigo = valor.charAt(0);
        if (esteCodigo==otroCodigo){
            return 0;
        }
        else if (esteCodigo>otroCodigo){
            return 1;
        }
        else{
            return -1;
        }
    }
    @Override
    public String toString(){
        String a = nombre + " " + condicion + " " + codigo;
        return a;
    }
    
}

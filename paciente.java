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
        return(this.esteCodigo < this.otroCodigo)? -1: (this.esteCodigo < this.otroCodigo)? 1:0;
     
     
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(int nombre){
        this.nombre = nombre;
    }
    public String getCondicion(){
        return condicion;
    }
    
    public void setCondicion(int condicion){
        this.condicion = condicion;
    }
    public String getCodigo(){
        return codigo;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    
    @Override
    public String toString(){
        String a = nombre + " " + condicion + " " + codigo;
        return a;
    }
    
}

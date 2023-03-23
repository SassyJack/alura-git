public class Alumno {
    private String nombre;
    private int codigo;

    public Alumno(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString(){
        return this.nombre;
    }

    @Override
    public boolean equals (Object obj){
        Alumno alumno = (Alumno) obj;
        return this.nombre.equals(alumno.getNombre());
    }

    @Override
    public int hashCode(){
        return this.nombre.hashCode();
    }
    
}

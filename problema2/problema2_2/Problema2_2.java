package Dber2.problema2_2;
class  Profesor{
    private String nombreProfesor;
    private String apellidoProfesor;
    private double suelodBasico ;
    private double sueldoTodal;
    private int id;
    private Provincia provincia;

    public Profesor(){}

    public Profesor(String nombreProfesor, String apellidoProfesor, double suelodBasico, int id,Provincia provincia) {
        this.nombreProfesor = nombreProfesor;
        this.apellidoProfesor = apellidoProfesor;
        this.suelodBasico = suelodBasico;
        this.id = id;
        this.provincia = provincia;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public String getApellidoProfesor() {
        return apellidoProfesor;
    }

    public void setApellidoProfesor(String apellidoProfesor) {
        this.apellidoProfesor = apellidoProfesor;
    }

    public double getSuelodBasico() {
        return suelodBasico;
    }

    public void setSuelodBasico(double suelodBasico) {
        this.suelodBasico = suelodBasico;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public  void  CalcularSueldoTotal(){
        this.sueldoTodal=suelodBasico*0.2;
    }
    public double getSueldoTodal(){
        return this.sueldoTodal;
    }
    public void setProvincia(Provincia provincia){
        this.provincia=provincia;
    }
    public Provincia getProvincia(){
        return this.provincia;
    }


    @Override
    public  String toString(){
        return String.format("\t"+"Profesor"
                        +"\nNombre :%s"
                        +"\nApellido :%s"
                        +"\nSueldo Basico Profesor:%.2f"
                        +"\nSueldo Total Profesor:%.2f"
                        +"\nID Profesor:%d"
                        +"\nProviene de la Provincia:%s"
                        +"\nQue contiene:%d habitantes"
                ,this.getNombreProfesor()
                ,this.getApellidoProfesor()
                ,this.getSuelodBasico()
                ,this.getSueldoTodal()
                ,this.getId()
                ,this.getProvincia().getNombreProvincia()
                ,this.getProvincia().getNumeroHabitantes()
        );
    }
}
class Provincia{
    private String nombreProvincia;
    private int numeroHabitantes;
    public Provincia(){}

    public Provincia(String nombreProvincia,int numeroHabitantes){
        this.nombreProvincia=nombreProvincia;
        this.numeroHabitantes=numeroHabitantes;
    }

    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

    public int getNumeroHabitantes() {
        return numeroHabitantes;
    }

    public void setNumeroHabitantes(int numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }
}

public class Problema2_2{
    public static void main(String[] args) {
        Provincia provincia= new Provincia("Loja",800000);
        Profesor profesor = new Profesor("Richar","Guaya",445.8,1150084661,provincia);
        profesor.CalcularSueldoTotal();
        System.out.println(profesor);
    }
}


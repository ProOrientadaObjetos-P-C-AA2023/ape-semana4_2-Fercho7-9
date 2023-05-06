package Dber2.problema3_3;
    class AutorMotor{
        private int idDuenio;
        private String marcaVehiculo;
        private int anioFabricacion;
        private double valorVehiculo;
        private double valorMatricula;
        private Fabricante fabricante;

        public  AutorMotor(){}
        public AutorMotor(int idDuenio, String marcaVehiculo, int anioFabricacion, double valorVehiculo,Fabricante fabricante) {
            this.idDuenio = idDuenio;
            this.marcaVehiculo = marcaVehiculo;
            this.anioFabricacion = anioFabricacion;
            this.valorVehiculo = valorVehiculo;
            this.fabricante=fabricante;
        }

        public int getIdDuenio() {
            return idDuenio;
        }

        public void setIdDuenio(int idDuenio) {
            this.idDuenio = idDuenio;
        }

        public String getMarcaVehiculo() {
            return marcaVehiculo;
        }

        public void setMarcaVehiculo(String marcaVehiculo) {
            this.marcaVehiculo = marcaVehiculo;
        }

        public int getAnioFabricacion() {
            return anioFabricacion;
        }

        public void setAnioFabricacion(int anioFabricacion) {
            this.anioFabricacion = anioFabricacion;
        }

        public double getValorVehiculo() {
            return valorVehiculo;
        }

        public void setValorVehiculo(double valorVehiculo) {
            this.valorVehiculo = valorVehiculo;
        }
        public  void  CalcularValorMatricula(){
            this.valorMatricula=(valorVehiculo/(100/0.002))*anioFabricacion;
        }
        public double getValorMatricula(){
            return this.valorMatricula;
        }

        public Fabricante getFabricante() {
            return fabricante;
        }

        public void setFabricante(Fabricante fabricante) {
            this.fabricante = fabricante;
        }

        public String toString(){
            return String.format("\t"+"\t"+"AUTOMOVIL"
                            +"\nNúmero de Cédula: %d"
                            +"\nNúmero de la Marca del Vehiculo: %s"
                            +"\nAño del Vehiculo: %d"
                            +"\nValor del Vehiculo: %.2f"
                            +"\nValor de la Matricula del Vehiculo:%.2f"
                            +"\nFabricante:%s"
                            +"\nHecho:%s"
                    ,this.getIdDuenio()
                    ,this.getMarcaVehiculo()
                    ,this.getAnioFabricacion()
                    ,this.getValorVehiculo()
                    ,this.getValorMatricula()
                    ,this.getFabricante().getNombreFabricante()
                    ,this.getFabricante().getCiudadFabricante()
            );
        }
    }
    class Fabricante{
        private String nombreFabricante;
        private String ciudadFabricante;
        public Fabricante(){}
        public Fabricante(String nombreFabricante,String ciudadFabricante){
            this.nombreFabricante=nombreFabricante;
            this.ciudadFabricante=ciudadFabricante;
        }

        public String getNombreFabricante() {
            return nombreFabricante;
        }

        public void setNombreFabricante(String nombreFabricante) {
            this.nombreFabricante = nombreFabricante;
        }

        public String getCiudadFabricante() {
            return ciudadFabricante;
        }

        public void setCiudadFabricante(String ciudadFabricante) {
            this.ciudadFabricante = ciudadFabricante;
        }
    }

    public class Problema3_3 {
        public static void main(String[] args) {
            Fabricante fabricante = new Fabricante("Toyota Motors","Canadá");
            AutorMotor autorMotor = new AutorMotor(1150084661,"PVP 869",2023,38420.50,fabricante);
            autorMotor.CalcularValorMatricula();
            System.out.println(autorMotor);
        }
    }



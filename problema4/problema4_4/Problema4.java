package Dber2.problema4_4;
class EntidadFinanciera{
    private double valorCheque;
    private double comisionCobroBanco;
    private Cliente cliente;
    private Banco banco;

    public EntidadFinanciera(){}
    public EntidadFinanciera(double valorCheque,Cliente cliente,Banco banco){
        this.valorCheque=valorCheque;
        this.cliente =cliente;
        this.banco = banco;
    }

    public double getValorCheque() {
        return valorCheque;
    }

    public void setValorCheque(double valorCheque) {
        this.valorCheque = valorCheque;
    }
    public void CalcularComisionCobroBanco(){
        this.comisionCobroBanco=valorCheque*0.003;
    }
    public double getComisionCobroBanco(){
        return this.comisionCobroBanco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
        }
    public  String toString(){
        return  String.format("\t"+"\t"+"\t"+"Identidad Financiera"
                        +"\nNombre de la Institución Financiera: %s"
                        +"\nNúmero de sucursales de la Institucion Financiera: %s"
                        +"\nNombre Completo del cliente: %s"
                        +"\nCédula del cliente: %d"
                        +"\nValor que tiene el cheque: %.2f"
                        +"\nInteres por comisión: %.2f"
                ,this.getBanco().getNombreBanco()
                ,this.getBanco().getNumeroSucursales()
                ,this.getCliente().getNombreCliente()+" "+ this.getCliente().getApellidoCliente()
                ,this.getCliente().getId()
                ,this.getValorCheque()
                ,this.getComisionCobroBanco()
        );
       }
    }

    class Cliente{
        private String nombreCliente;
        private String apellidoCliente;
        private int id;
        public  Cliente(){}
        public Cliente(String nombreCliente, String apellidoCliente, int id) {
            this.nombreCliente = nombreCliente;
            this.apellidoCliente = apellidoCliente;
            this.id = id;
        }
        public String getNombreCliente() {
            return nombreCliente;
        }
        public void setNombreCliente(String nombreCliente) {
            this.nombreCliente = nombreCliente;
        }
        public String getApellidoCliente() {
            return apellidoCliente;
        }
        public void setApellidoCliente(String apellidoCliente) {
            this.apellidoCliente = apellidoCliente;
        }
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
    }


    class Banco{
        private String nombreBanco;
        private int numeroSucursales;

        public Banco(){}
        public Banco(String nombreBanco, int numeroSucursales) {
            this.nombreBanco = nombreBanco;
            this.numeroSucursales = numeroSucursales;
        }
        public String getNombreBanco() {
            return nombreBanco;
        }

        public void setNombreBanco(String nombreBanco) {
            this.nombreBanco = nombreBanco;
        }

        public int getNumeroSucursales() {
            return numeroSucursales;
        }

        public void setNumeroSucursales(int numeroSucursales) {
            this.numeroSucursales = numeroSucursales;
        }
    }

public class Problema4 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Eddy","Ordoñez",1150084661);
        Banco banco= new Banco("Banco de Loja",20);
        EntidadFinanciera entidadFinanciera = new EntidadFinanciera(350.9,cliente,banco);
        entidadFinanciera.CalcularComisionCobroBanco();
        System.out.println(entidadFinanciera);
    }
}



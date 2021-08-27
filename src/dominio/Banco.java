
package dominio;

public class Banco {
     String Codigo;
     String Nombres;
     String Saldo;
    

    public Banco(String Codigo, String Nombres, String Saldo) {
        this.Codigo = Codigo;
        this.Nombres = Nombres;
        this.Saldo = Saldo;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }
    
    public void Codigo(){
        int contador=0;
    }
    
    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getSaldo() {
        return Saldo;
    }

    public void setSaldo(String Saldo) {
        this.Saldo = Saldo;
    }
}

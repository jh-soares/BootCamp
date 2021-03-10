package pagamento;

public class Funcionario {
    
    private String nome;
    private int matricula;
    private double salario;
    
    public double calculaImposto(){
        
        return this.getSalario() * 0.01;
    }
    
    public double valorSalario(){
        
        return this.salario - calculaImposto();
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    
    
}

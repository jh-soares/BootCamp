
package pagamento;


public class Pagamento {

    
    public static void main(String[] args) {
        
        Funcionario gerente = new Gerente();
        gerente.setNome("Paulo");
        gerente.setMatricula(1010);
        gerente.setSalario(6000.0);
        
        
        
        System.out.println("|+---Pagamento Gerente---+|");
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Matrícula: " + gerente.getMatricula());
        System.out.println("Imposto: " + gerente.calculaImposto());
        System.out.println("Salário: " + gerente.valorSalario());
        
        Funcionario supervisor = new Supervisor();
        supervisor.setNome("Natália");
        supervisor.setMatricula(1120);
        supervisor.setSalario(2800.0);
        
        System.out.println("|+---Pagamento Supervisor---+|");
        System.out.println("Nome: " + supervisor.getNome());
        System.out.println("Matrícula: " + supervisor.getMatricula());
        System.out.println("Imposto: " + supervisor.calculaImposto());
        System.out.println("Salário: " + supervisor.valorSalario());
        
        Funcionario atendente = new Funcionario();
        atendente.setNome("João");
        atendente.setMatricula(1090);
        atendente.setSalario(1500.0);

        System.out.println("|+---Pagamento Atendente---+|");
        System.out.println("Nome: " + atendente.getNome());
        System.out.println("Matrícula: " + atendente.getMatricula());
        System.out.println("Imposto: " + atendente.calculaImposto());
        System.out.println("Salário: " + atendente.valorSalario());
        
    }
    
}

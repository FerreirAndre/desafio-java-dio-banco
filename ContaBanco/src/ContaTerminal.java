public class ContaTerminal {
    private int Numero;
    private String Agencia;
    private String Nome_Cliente = "";
    private double Saldo = 0.0;

    public ContaTerminal(int numero, String agencia, String nome_Cliente, double saldo) {
        Numero = numero;
        Agencia = agencia;
        Nome_Cliente = nome_Cliente;
        Saldo = saldo;
    }

    public int getNumero() {
        return Numero;
    }

    private void setNumero(int numero) {
        Numero = numero;
    }

    public String getAgencia() {
        return Agencia;
    }

    private void setAgencia(String agencia) {
        Agencia = agencia;
    }

    public String getNome_Cliente() {
        return Nome_Cliente;
    }

    private void setNome_Cliente(String nome_Cliente) {
        Nome_Cliente = nome_Cliente;
    }

    public double getSaldo() {
        return Saldo;
    }

    private void setSaldo(double saldo) {
        Saldo = saldo;
    }

    @Override
    public String toString() {
        return String.format("Olá %s, obrigado" +
                " por criar uma conta em nosso banco, " +
                "sua agência é %s, conta %s e seu saldo R$%s " +
                "já está disponível para saque", Nome_Cliente, Agencia, Numero, Saldo);
    }
}

package Lista;

public class Empregados {
    private String nome;
    private Integer id;
    private double salario;

    public Empregados() {

    }

    public Empregados(Integer id, String nome, double salario) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumentarSalario(double percentage) {
        this.salario += this.salario * percentage / 100;
    }

    public String toString() {
        return id + ", " + nome + ", " + String.format("%.2f", salario);
    }

}

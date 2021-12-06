package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity(name = "historico")
public class Historico {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "num1")
    private String num1;

    @Column(name = "num2")
    private String num2;

    @Column(name = "operacao")
    private String operacao;

    @Column(name = "resultado")
    private String resultado;

    @Column(name = "horario")
    private String horario;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNum1(String num1){
        this.num1 = num1;
    }

    public String getNum1(){
        return this.num1;
    }

    public void setNum2(String num2){
        this.num2 = num2;
    }

    public String getNum2(){
        return this.num2;
    }

    public void setOperacao(String operacao){
        this.operacao = operacao;
    }

    public String getOperacao(){
        return this.operacao;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getResultado() {
        return this.resultado;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getHorario() {
        return this.horario;
    }

    @Override
    public String toString() {
        return "Historico{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", num1='" + num1 + '\'' +
                ", num2='" + num2 + '\'' +
                ", operacao='" + operacao + '\'' +
                ", resultado='" + resultado + '\'' +
                ", horario='" + horario + '\'' +
                '}';
    }
}
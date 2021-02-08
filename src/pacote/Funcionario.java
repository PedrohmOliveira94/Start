package pacote;

public class Funcionario extends Pessoa {
    public double salario_inicial;
    double percentual;
    double salario_total;

    public Funcionario(double x, String w, String q){
        salario_inicial = x;
        nome = w;
        rg = q;
        salario_total = x;
    }

    public void dadosAtuais(double percentual){

        for (int i=0; i<3; i++){
            salario_total = salario_total*percentual;
            percentual = percentual+percentual - 1;
        }

        System.out.println("Nome: " + nome +"\nRG: " + rg + "\nSalario em 2020: " + salario_total);
    }
}


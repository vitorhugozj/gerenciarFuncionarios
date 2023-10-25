import br.senai.jandira.sp.Gerente;

public class Main {
    public static void main(String[] args) {
        Gerente gerenteTi = new Gerente("vitor hugo",5000,1, 500);

        System.out.println(gerenteTi.getNome());
        System.out.println(gerenteTi.calcularSalario());
        System.out.println(gerenteTi.idFuncionario());

    }
}
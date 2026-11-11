import modelo.Pessoa;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        p1.setNome("Mayara");
        p1.setIdade(23);
        Pessoa p2 = new Pessoa();
        p2.setNome("Matheus");
        p2.setIdade(24);
        Pessoa p3 = new Pessoa();
        p3.setNome("Samuel");
        p3.setIdade(8);


        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(p1);
        listaDePessoas.add(p2);
        listaDePessoas.add(p3);
        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeira pessoa: " + listaDePessoas.get(0));
        System.out.println("Lista completa: " + listaDePessoas);


        System.out.println("Lista de Pessoas:");
        for (Pessoa pessoa : listaDePessoas) {
            System.out.println(pessoa);
        }





    }
}

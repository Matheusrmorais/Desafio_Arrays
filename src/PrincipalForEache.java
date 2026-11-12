import modelo.Animal;
import modelo.Cachorro;
import modelo.Gato;
import modelo.Produtos;

import java.util.ArrayList;

public class PrincipalForEache {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();
        lista.add("Gato");
        lista.add("Cachorro");
        lista.add("Panda");

        for(String s: lista){
            System.out.println(s);
        }

        Animal animal = new Cachorro();
        Cachorro cachorro = (Cachorro) animal;
        cachorro.setNome("Dog");
        Animal animal1 = new Cachorro();
        animal1.setNome("Cachorro");
        Gato gato = new Gato();
        gato.setNome("Gato");


        ArrayList<Animal> listaCachorro = new ArrayList<>();
        listaCachorro.add(cachorro);
        listaCachorro.add(animal1);
        listaCachorro.add(gato);


        for (Animal item : listaCachorro){


            System.out.println(item.getNome());
            if(item instanceof Cachorro){

                System.out.println("É um cachorro");
            } else  {
                System.out.println("Não é um cachorro");
            }
        }

        Produtos produto = new Produtos("Mouse", 250);
        Produtos produto1 = new Produtos("Teclado", 89.90);
        Produtos produto2 = new Produtos("Mouse", 150.50);

        ArrayList<Produtos> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto);
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);

        double somaPreco = 0;

        for (Produtos p : listaProdutos){
            somaPreco += p.getPreco();
        }

        System.out.println(somaPreco);
        System.out.println(listaProdutos.size());

        double precoMedio = somaPreco  / listaProdutos.size();
        System.out.println("Preço Médio: " + precoMedio);






    }
}

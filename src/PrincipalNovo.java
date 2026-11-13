import modelo.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PrincipalNovo {
    public static void main(String[] args) {
        ArrayList<Integer> listaNumero = new ArrayList<>();

        listaNumero.add(3);
        listaNumero.add(2);
        listaNumero.add(1);
        System.out.println(listaNumero);
        Collections.sort(listaNumero);
        System.out.println(listaNumero);

        Titulo titulo = new Titulo();
        titulo.setNome("Lucas");
        Titulo titulo1 = new Titulo();
        titulo1.setNome("Matheus");
        Titulo titulo2 = new Titulo();
        titulo2.setNome("Amanda");

        ArrayList<Titulo> listaTitulo = new ArrayList<>();
        listaTitulo.add(titulo);
        listaTitulo.add(titulo1);
        listaTitulo.add(titulo2);
        System.out.println(listaTitulo);
        Collections.sort(listaTitulo);
        System.out.println(listaTitulo);


        List<String> Arr = new ArrayList<>();
        Arr.add("Lucas");
        Arr.add("Matheus");
        System.out.println(Arr);



        List<String> list = new ArrayList<>();
        list.add("Amanda");
        list.add("Mayara");
        System.out.println(list);

        List<String> listaPolimorfismo = new ArrayList<>();
        listaPolimorfismo.add("Amanda");
        listaPolimorfismo.add("Mayara");

        System.out.println(listaPolimorfismo);

        listaPolimorfismo = new LinkedList<>();
        listaPolimorfismo.add("Amanda");
        listaPolimorfismo.add("Mayara");
        System.out.println(listaPolimorfismo);






    }




}

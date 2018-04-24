package fiap.com.br.recyclerview;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by logonrm on 24/04/2018.
 */

public class GeraContatos {

    public static List<Contato> geraContato(){
        List<Contato> contatos = new ArrayList<>();

        Contato contato1 = new Contato(
                "Fernando Meyer",
                "11 1234-6789",
                "...",
                R.drawable.p1
        );

        Contato contato2 = new Contato(
                "Paulo Boy",
                "11 1234-6789",
                "No trabalho",
                R.drawable.p2
        );

        Contato contato3 = new Contato(
                "Xoana Xoxo",
                "11 1234-6789",
                "Xoando Po ai",
                R.drawable.p3
        );

        contatos.add(contato1);
        contatos.add(contato2);
        contatos.add(contato3);

        return contatos;
    }
}

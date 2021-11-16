package desafioPaises;

import java.sql.Array;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PaisesMain {
    public static void main(String[] args) {
        Clock baseClock = Clock.systemUTC();

        System.out.println("El codigo inicia a las "+baseClock.instant());
        // Paises argentina = new Argentina(1, "Argentina", 100);
        // Paises bolivia = new Bolivia(2, "Bolivia", 101);
        // Paises brasil = new Brasil(3, "Brasil", 102);
        // Paises chile = new Chile(4, "Chile", 103);
        // Paises colombia = new Colombia(5, "Colombia", 104);
        // Paises ecuador = new Ecuador(6, "Ecuador", 105);
        // Paises paraguay = new Paraguay(7, "Paraguay", 106);
        // Paises peru = new Peru(8, "Peru", 107);
        // Paises venezuela = new Venezuela(9, "Venezuela", 108);
        // Paises uruguay = new Uruguay(10, "Uruguay", 109);
        
        ArrayList<Paises> paises = new ArrayList<Paises>();
        
        // paises.add(argentina);
        // paises.add(bolivia);
        // paises.add(brasil);
        // paises.add(chile);
        // paises.add(colombia);
        // paises.add(ecuador);
        // paises.add(paraguay);
        // paises.add(peru);
        // paises.add(venezuela);
        // paises.add(uruguay);
        
        String lista[] = {"Argentina", "Bolivia", "Brasil", "Chile", "Colombia", "Ecuador", "Paraguay", "Peru", "Venezuela", "Uruguay"};
        
        Integer i = 0;
        for (String string : lista) {
            paises.add(new Pais(i, lista[i], 100+i));
            i++;
        }
        System.out.println(paises);
        System.out.println(paises.get(8));
        System.out.println(paises.size());
        
        List<Integer> codigoDePaises = paises.stream().map(pais -> pais.getCodigo()).collect(Collectors.toList());
        System.out.println("- "+ codigoDePaises);
        
        Paises paisCodigo = paises.stream().filter(pais -> pais.getCodigo() == 105).findFirst().orElse(null);
        List<Paises> paisesCodigo = paises.stream().filter(pais -> pais.getCodigo() > 105).collect(Collectors.toList());
        
        System.out.println(paisCodigo);
        System.out.println(paisesCodigo);
        System.out.println("El codigo finaliza a las "+baseClock.instant());
    }
}

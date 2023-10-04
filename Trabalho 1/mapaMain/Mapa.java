package mapaMain;
import testeColesterol.colesterol;
import testeGlicemico.Glicemia;
import testeTrigli.triglicerideos;

public class Mapa {
    public static void main(String[] args) {
            Glicemia ras = new Glicemia();
            ras.testeGlicemia();

                    colesterol Cc = new colesterol();
                    Cc.colHdl();

             triglicerideos r = new triglicerideos();
                r.testeTrigl();
    }
}

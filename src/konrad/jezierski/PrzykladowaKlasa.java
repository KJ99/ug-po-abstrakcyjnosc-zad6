package konrad.jezierski;

public class PrzykladowaKlasa implements PrzykladowyInterfejs, InnyInterfejs {
    @Override
    public void innaMetoda() {
        System.out.println("Implementacja InnejMetody");
    }

    @Override
    public void przykladowaMetoda() {
        System.out.println("Implementacja przykladowejMetody");
    }
}

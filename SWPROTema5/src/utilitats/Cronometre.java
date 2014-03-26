package utilitats;

public class Cronometre {

    private long inici;
    private long fi;
    private boolean enMarxa;

    public Cronometre() {
        inici = 0;
        fi = 0;
        enMarxa = false;
    }

    public void start() {
        if (!enMarxa) {
            inici = System.currentTimeMillis();
            enMarxa = true;
        }
    }

    public void stop() {
        if (enMarxa) {
            fi = System.currentTimeMillis();
            enMarxa = false;
        }
    }

    public long temps() {
        return fi - inici;
    }
}
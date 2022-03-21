package domæneObjekter;

public class Konto {

    private String navn;
    private String kode;
    private int saldo;


    public Konto(String navn, String kode, int saldo) {
        this.navn = navn;
        this.kode = kode;
        this.saldo = saldo;
    }

    public String getNavn() {
        return navn;
    }

    public String getKode() {
        return kode;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }


    public int indsæt(int i)
    {
        if (1 > 0) {
            saldo = saldo + i;
        }
        return saldo;
    }
}





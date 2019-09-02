public class Predmet {
    private String nazivPredmeta, sifraPredmeta;
    private int maksimalanBrojStudenata, brojRegistrovanihStudenata;
    private Student[] studenti;

    public Predmet(String nazivPredmeta, String sifraPredmeta, int maksimalanBrojStudenata) {
        this.nazivPredmeta = nazivPredmeta;
        this.sifraPredmeta = sifraPredmeta;
        this.maksimalanBrojStudenata = maksimalanBrojStudenata;
        studenti = new Student[maksimalanBrojStudenata];
        brojRegistrovanihStudenata = 0;
    }

    public void setNazivPredmeta(String nazivPredmeta) { this.nazivPredmeta = nazivPredmeta; }
    public String getNazivPredmeta() { return nazivPredmeta; }
    public void setSifraPredmeta(String sifraPredmeta) { this.sifraPredmeta = sifraPredmeta; }
    public String getSifraPredmeta() { return sifraPredmeta; }
    public int getMaksimalanBrojStudenata() { return maksimalanBrojStudenata; }
    public void upisi(Student s) { studenti[brojRegistrovanihStudenata++] = s; }
    public void ispisi(Student s) {
        int i;
        for(i = 0; i < brojRegistrovanihStudenata; i++) {
            if (studenti[i].equals(s)) break;
        }
        for(;i < brojRegistrovanihStudenata - 1; i++) {
            studenti[i] = studenti[i+1];
        }
        brojRegistrovanihStudenata--;

    }

    @Override
    public String toString() {
        StringBuilder toString = new StringBuilder();
        for(int i = 0; i < brojRegistrovanihStudenata; i++)
            toString.append("\n" + studenti[i].toString());
        return toString.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Predmet)) return false;
        Predmet p = (Predmet)obj;
        return this.nazivPredmeta.equals(p.nazivPredmeta) && this.sifraPredmeta.equals(p.sifraPredmeta);
    }
}

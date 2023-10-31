public class Principal {
    public static void main(String[] args) {
        Processo proc1 = new Processo("Renatin",17,3);
        Processo proc2 = new Processo("Beca",17,1);
        Processo proc3 = new Processo("Helô",1,2);
        proc1.start();
        proc2.start();
        proc3.start();
    }
}

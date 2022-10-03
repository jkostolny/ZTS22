public class Hodnotenie {

    public char urciVyslednuZnamku (int pocetBodov) {
        if (pocetBodov < 0){
            throw new IllegalArgumentException("Neviem urcit pre dany pocet bodov.");
        }
        else if (pocetBodov < 60) {
            return 'F';
        }
        else if (pocetBodov < 70) {
            return 'D';
        }
        else if (pocetBodov < 80) {
            return 'C';
        }
        else if (pocetBodov < 90) {
            return 'B';
        }
        else  {
            return 'A';
        }
    }

}

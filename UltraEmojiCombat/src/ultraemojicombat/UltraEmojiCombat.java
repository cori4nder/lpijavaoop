package ultraemojicombat;

public class UltraEmojiCombat {

    public static void main(String[] args) {
        Lutador a[] = new Lutador[6];
        
        a[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        a[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        a[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        a[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        a[4] = new Lutador("UF0Cobol", "Brasil", 37, 1.70f, 119.3f, 12, 2, 4);
        a[5] = new Lutador("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
        
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(a[1], a[5]);
        UEC01.lutar();
    }
    
}

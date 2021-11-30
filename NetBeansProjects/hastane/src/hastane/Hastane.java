package hastane;
import java.util.Scanner;

/**
 *
 * @author student99
 */
public class Hastane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Атынды жаз");
        String at = scanner.nextLine();
        //System.out.println( "сиздин атыныз : " + at);
        System.out.println("Канча жаштасын?");
        int jash = scanner.nextInt();
        System.out.println("Сенин атын   " + at + "  сен " + jash + "  жаштасын" );
        System.out.println("любой число жаз");
        int plus = scanner.nextInt();
        System.out.println("сен " + plus + "  жылдан кийн + " + (jash + plus ) + " жашта болосун");
        
    }
    
}

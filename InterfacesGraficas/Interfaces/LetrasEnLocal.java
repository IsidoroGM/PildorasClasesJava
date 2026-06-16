import java.awt.GraphicsEnvironment;

public class LetrasEnLocal {

    public static void main(String[] args) {
        
        String [] misFuentes=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        for(String nombresFuentes:misFuentes){
            System.out.println(nombresFuentes);
        }
    }
}

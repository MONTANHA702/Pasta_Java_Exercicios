import java.util.Locale;
import java.util.ResourceBundle;

public class ClasseResourceBundle {
    public static void main(String[] args) {

        //usada para internacionalizar projetos
        //usando locale padrão

        Locale locale = Locale.getDefault();
        System.out.println("Local atual: " + locale);
        ResourceBundle rb = ResourceBundle.getBundle("meu-texto");
        System.out.println("Olá: " + rb.getString("hello"));
        System.out.println("Mundo: " + rb.getString("world"));

        Locale.setDefault(Locale.US);
        rb = ResourceBundle.getBundle("meu-texto");
        System.out.println("Olá: " + rb.getString("hello"));
        System.out.println("Mundo: " + rb.getString("world"));

    }
}

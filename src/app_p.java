
import javax.swing.JOptionPane;
public class app_p {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Persona p1 = new Persona("Mauricio",15);  
        System.out.println(p1.getEdad());
        System.out.println(p1.getNombre());        
        p1.setEdad(20);
        System.out.println(p1.getEdad());
        p1.setNombre("Hernan");
        System.out.println(p1.getNombre());        
        System.out.println(p1.NUMERO_OJOS);
        JOptionPane.showMessageDialog(null,"Un mensaje","Misiontic",JOptionPane.INFORMATION_MESSAGE);
        p1.caminar(4);
        System.out.println("LOS KILOMETROS RECORRIDOS SON: ");
        System.out.println(p1.trotarEnLaMontaña(4.5));
        int a = 5;
        float ba = 2.3f;
        System.out.println(a++);
        System.out.println(ba+a);
    }
}

package Views;
import Models.Persona;

public class ViewsConsole {

    public void printPersonaArray(Persona[] personas) {
        System.out.print("[");
        for(int i= 0; i< personas.length;i++){
            System.out.print(personas[i]+ "  ");
        }
        System.out.print("]");
    }
    
    public void printMessage(String message){
        System.out.println(message);
    }
}
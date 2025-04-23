
import Controllers.PersonaController;
import Models.Persona;
import Views.ViewsConsole;

public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[] {

            new Persona("Juan", 25),
            new Persona("Maria", 30),
            new Persona("Carlos", 22),
            new Persona("Ana", 28),
            new Persona("Luis", 35),
            new Persona("Sofia", 27),
            new Persona("Miguel", 40),
            new Persona("Laura", 32),
            new Persona("Pedro", 29),
            new Persona("Elena", 26)
        };

        ViewsConsole vC = new ViewsConsole();
        PersonaController pC = new PersonaController();
        vC.printMessage("Arreglo personas:");
        vC.printPersonaArray(personas);
        pC.ordenarPorEdad(personas);
        vC.printMessage("Arreglo Ordenado por inserion ascendente:");        
        vC.printPersonaArray(personas);
        vC.printMessage("buscar persona con edad 40"); 
        Persona resultado1 = pC.buscarPorEdad(personas, 40);
        int edad1= 40;
        if (resultado1 != null) {
            vC.printMessage("Persona encontrada con edad " + edad1 + ": " + resultado1);
        } else {
            vC.printMessage("No se encontró ninguna persona con edad " + edad1);
        }
        vC.printMessage("buscar persona con edad 99"); 
        Persona resultado2 = pC.buscarPorEdad(personas, 99);
        int edad2= 99;
        if (resultado2 != null) {
            vC.printMessage("Persona encontrada con edad " + edad1 + ": " + resultado2);
        } else {
            vC.printMessage("No se encontró ninguna persona con edad " + edad2);
        }
        /// TODO: GENERAR INSTNACIA DE CONTROLLE Y ORDENAR EL METODO DESPUES BUSCAR POR
        /// LA EDAD



        /*  Instanciar clases necesarias
         * Mensaje = Arreglo personas
         * Imprimimos el arreglo
         * Mensaje = Arreglo Ordenado por inserion ascendente
         * Imprimimos el arreglo ordenado
         * Mensaje = buscar persona con edad 40 
         * Imprimir resultado de busqurda y la persona si se econtro
         * Mensaje = buscar persona con edad 99
         * Imprimir resultado de busqurda y la persona si se encontro         
         */
    }
}

public class Main{
    public static void main(String[] args) {
    Cliente cliente = new Cliente();
    cliente.edad = 23;
    cliente.telefono = 322122334;
    cliente.Nombre = "Jorge";
    cliente.credito = 23342313;
    System.out.println("el nombre de mi cliente es: " + cliente.Nombre);
    System.out.println("su telefono es: " + cliente.telefono);
    System.out.println("su edad es: " + cliente.edad);
    System.out.println("y tiene un credito de: " + cliente.credito);
    Trabajador trabajador = new Trabajador();
    trabajador.Nombre= "Esteban";
    trabajador.edad = 20;
    trabajador.telefono = 311455321;
    trabajador.salario = 200455;
    System.out.println("El nombre del trabajador es: " + trabajador.Nombre);
    System.out.println("Tiene: " + trabajador.edad + " años");
    System.out.println("Su telefono es: " + trabajador.telefono);
    System.out.println("Su salario es de: " + 200455 + " pesos");


}
}
class Persona {
    int edad;
    int telefono;
    String Nombre;
}

class Cliente extends Persona{
    int credito;

}
class Trabajador extends Persona{
    int salario;

}
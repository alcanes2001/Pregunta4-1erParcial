import java.util.Scanner;

public class ImpuestoPropiedad {

    private static String determinarTipoImpuesto(String codigoCatastral) {
        if (codigoCatastral == null || codigoCatastral.isEmpty()) {
            return "Código catastral no válido";
        }

        char primerDigito = codigoCatastral.charAt(0); 
        switch (primerDigito) {
            case '1':
                return "Alto";
            case '2':
                return "Medio";
            case '3':
                return "Bajo";
            default:
                return "No existe tipo de impuesto";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Crear un objeto Scanner para la entrada del usuario

        System.out.print("Ingrese el código catastral: ");
        String codigoCatastral = scanner.nextLine();  // Leer el código catastral ingresado por el usuario

        // Determinar el tipo de impuesto
        String tipoImpuesto = determinarTipoImpuesto(codigoCatastral);

        // Mostrar los resultados
        System.out.println("Código Catastral: " + codigoCatastral);
        System.out.println("Tipo de Impuesto: " + tipoImpuesto);

        scanner.close();  // Cerrar el scanner
    }
}

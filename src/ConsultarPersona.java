
public class ConsultarPersona {

    public ConsultarPersona() {
    }

    private String nombres;
    private int edad;
    private String ciudad;
    private int altura ;

    public void Persona (String n, int e, String c, int t){
        this.nombres = n;
        this.edad = e;
        this.ciudad = c;
        this.altura = t;
    }

    public void Persona (){ //Constructor sin param.
        this.nombres = ""; // nombres vacio
        this.edad = 0; // edad cero
        this.ciudad =""; // ciudad vacia
        this.altura = 0; //  cero
    }

    public void cambiarEdad (int e){
        this.edad = e;
    }

    /**
     *
     * @return
     */
    public  String consultarnombres (){
        return nombres;
    }

    public int consultarEdad (){
        return edad;
    }

    public String consultarCiudad (){
        return ciudad;
    }

    public int consultaraltura (){
        return altura ;
    }
    public static void main (String [] args){
        ConsultarPersona persona1 = new ConsultarPersona();
        persona1.ciudad = "pilar";
        persona1.edad = 11;
        persona1.nombres = "roman";
        persona1.altura = 666;
        System.out.println ("persona1:");
        System.out.println ("nombres: "+persona1.consultarnombres());
        System.out.println ("Edad: "+persona1.consultarEdad());
        System.out.println ("Ciudad: "+persona1.consultarCiudad());
        System.out.println ("altura: "+persona1.consultaraltura());
    }
}


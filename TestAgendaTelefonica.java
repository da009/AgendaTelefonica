
/**
 * Write a description of class a here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestAgendaTelefonica
{
    private int numeroTestsFallados;
    /**
     * Constructor for objects of class a
     */
    public TestAgendaTelefonica()
    {
        numeroTestsFallados = 0;
        
        AgendaTelefonica agendaTelefonica = new AgendaTelefonica();
        numeroTestsFallados += testea(null, agendaTelefonica.lookupNumber("Paco"),
        "lookupNumber(String)-(Agenda vacia)");
        numeroTestsFallados += testea(null, agendaTelefonica.lookupNumber("Jose"),
        "lookupNumber(String)-(Agenda vacia)");
        
        agendaTelefonica.enterNumber("Paco","123 12 12 12");
        numeroTestsFallados += testea("123 12 12 12", agendaTelefonica.lookupNumber("Paco"),
        "enterNumber(String,String)");
        agendaTelefonica.enterNumber("Jose","321 32 32 32");
        numeroTestsFallados += testea("321 32 32 32", agendaTelefonica.lookupNumber("Jose"),
        "enterNumber(String,String)");
        
        numeroTestsFallados += testea("123 12 12 12", agendaTelefonica.lookupNumber("Paco"),
        "lookupNumber(String)");
        numeroTestsFallados += testea("321 32 32 32", agendaTelefonica.lookupNumber("Jose"),
        "lookupNumber(String)");
        
        numeroTestsFallados += testea(null, agendaTelefonica.lookupNumber("Manolo"),
        "lookupNumber(String)-(contactos no exisntentes)");
        numeroTestsFallados += testea(null, agendaTelefonica.lookupNumber("Juán"),
        "lookupNumber(String)-(contactos no exisntentes)");
        
        if (numeroTestsFallados == 0) {
            System.out.println("Todos los test se han pasado correctamente!!");
        }
        else {
            System.out.println("Han fallado " + numeroTestsFallados + " tests!!!");
        }
    }
    
        public int testea(Object valorEsperado, Object valorObtenido, 
                          String nombreFuncion)
    {
        int valorDevuelto = 0;
        if (valorEsperado == valorObtenido) {
            System.out.println("OK: " + nombreFuncion);
        }
        else {
            System.out.println("ERROR!!!!! " + nombreFuncion);
            System.out.println("Valor obtenido: " + valorObtenido + 
                               " / Valor esperado: " + valorEsperado);
            valorDevuelto = 1;
        }
        return valorDevuelto;
    }
}

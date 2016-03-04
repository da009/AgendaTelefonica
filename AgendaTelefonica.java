import java.util.HashMap;
/**
 * Write a description of class TestAgendaTelefonica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AgendaTelefonica
{
    private HashMap<String, String> agendaTelefonica;
    /**
     * Constructor for objects of class TestAgendaTelefonica
     */
    public AgendaTelefonica()
    {
        agendaTelefonica = new HashMap<String, String>();
    }

    /**
     * Permite almacenar un nuevo número en la agenda indicando el nombre del contacto
     * y su numero de telefono asociado
     */
    public void enterNumber(String name, String number)
    {
        agendaTelefonica.put(name, number);
    }

    /**
     * Devuelve el numero de teléfono del contacto indicado. Si el contacto no existe, 
     * devuelve null.
     */
    public String lookupNumber(String name)
    {
        return agendaTelefonica.get(name);
    }
}

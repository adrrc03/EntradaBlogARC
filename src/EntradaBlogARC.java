/**
 * Esta clase sirve para manejar las entradas de un blog.
 * Date 04/02/2023
 * @author Adrián Ruiz Cayuelas
 */
public class EntradaBlogARC{

    /**
     * Carácter que separa la entra del nombre del autor
     */
    public static char separador=':';
    private int id;
    private String texto;
    private String autor;

    /**
     * Constructor de la clase
     * @param id Identificador de la entrada
     * @param autor Autor de la entrada
     * @param texto Contenido de la entrada
     * @throws IllegalArgumentException Si el identifiacdor de entrada es negativo lanza una excepcion
     */
    public EntradaBlogARC(int id,String autor,String texto)throws IllegalArgumentException{
        if(id>=0) throw new IllegalArgumentException("El id no puede ser negativo");
        this.id=id;
        this.autor=autor;
        this.texto=texto;
    }

    /**
     * Convierte en texto todos los parametros del objeto
     * @return String con la informacion del objeto
     */
    @Override
    public String toString(){
        String cad="";
        cad+="\nENTRADA DE"+separador+autor;
        cad+="\n "+texto;
        return cad;
    }

    /**
     * Devueve el identificador de la entrada
     * @return Identificador
     */
    public int getId(){
        return this.id;
    }

    /**
     * Devuelve el contenido de la entrada
     * @return Cuerpo de la entrada
     */
    public String getTexto(){
        return this.texto;
    }

    /**
     * Devuelve el nombre del autor en mayúsculas
     * @return Autor
     */
    public String getAutor(){
        return this.autor.toUpperCase();
    }

    /**
     * Devuelve el nombre del autor
     * @deprecated Reemplazado por {@link #getAutor()}
     * @return Autor
     */
    public String devuelveAutor(){
        return this.autor;
    }


    /**
     * Clase main
     * @param args No obligatorios
     */
    public static void main(String[] args) {
        /**
         *Crea un objeto de la clase EntradaBlogARC
         */
        EntradaBlogARC e1=new EntradaBlogARC (-3,"ana","Últimas noticias, está disponible BixBy 2.0");
        System.out.println(e1);
    }
}
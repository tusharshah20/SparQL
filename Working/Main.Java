import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.util.FileManager;

public class Main {

public static void main(String args[])
{

	/*Reading a turtle file using the FOAF ONtology
        * FOAF ontology: http://xmlns.com/foaf/spec/
         **/
        FileManager.get().addLocatorClassLoader(Main.class.getClassLoader());
        Model model = FileManager.get().loadModel("path to rdf file")
        model.write(System.out,"Turtle");
        //model.write(System.out,"RDF/JSON");
}
/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package JohannaGutierrezTesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    @Test 
    public void testSomeLibraryMethod() {
    	
    	boolean passed = true;
    	int[] var = {};
    	int[] listaOrdenada = Library.ordenar(var);
    	int[] auxVar = {1,2,3,9,11,23};
    	for (int i = 0; i < auxVar.length; i++) {
         if(auxVar[i]!= listaOrdenada[i]) {
        	 passed = false;
        	 break;
         }
        }
        assertEquals(true, passed);
    }
}

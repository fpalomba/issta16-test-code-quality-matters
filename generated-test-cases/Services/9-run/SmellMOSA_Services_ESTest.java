/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 19 05:24:02 GMT 2015
 */


import static org.junit.Assert.*;
import org.junit.Test;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Services_ESTest extends Services_ESTest_scaffolding {

  //Test case number: 0
  @Test
  public void test0()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://*** Rusultat _ \n**rFonctionn\\7ent , :0");
      boolean boolean0 = NetworkHandling.createRemoteTextFile(evoSuiteURL0, "");
      assertTrue(boolean0);
      
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTP("*** Rusultat _ \n**rFonctionn\u0007ent , ", 0);
      assertFalse(services_HTTP_Result0.works);
      assertEquals(0, services_HTTP_Result0.code);
      assertEquals(0, services_HTTP_Result0.page_weight);
      assertEquals(0L, services_HTTP_Result0.time);
      assertNotNull(services_HTTP_Result0);
  }

  //Test case number: 1
  /*
   * 9 covered goals:
   * Goal 1. Services.<init>()V: root-Branch
   * Goal 2. Services$HTTP_Result.reset()V: root-Branch
   * Goal 3. Services$HTTP_Result.<init>()V: root-Branch
   * Goal 4. Services$HTTP_Result.toString()Ljava/lang/String;: root-Branch
   * Goal 5. Services$SIMPLE_Result.<init>()V: root-Branch
   * Goal 6. Services$SIMPLE_Result.reset()V: root-Branch
   * Goal 7. Services$SIMPLE_Result.toString()Ljava/lang/String;: root-Branch
   * Goal 8. Services.testHTTPS(Ljava/lang/String;I)LServices$HTTP_Result;: I103 Branch 2 IFNULL L82 - true
   * Goal 9. Services.testHTTPS(Ljava/lang/String;I)LServices$HTTP_Result;: I103 Branch 2 IFNULL L82 - false
   */

  @Test
  public void test1()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTPS("'K", 1);
      assertEquals(0L, services_HTTP_Result0.time);
      assertFalse(services_HTTP_Result0.works);
      assertEquals(0, services_HTTP_Result0.code);
      assertEquals(0, services_HTTP_Result0.page_weight);
      assertNotNull(services_HTTP_Result0);
      
      Services services0 = new Services();
      assertNotNull(services0);
      
      String string0 = services_HTTP_Result0.toString();
      assertEquals("**** Resultat : \n** Fonctionnement : false\n** Temps : 0 ms\n** Poid de la page : 0 octets\n** Code de page : 0\n** Erreur g\u00E9n\u00E9r\u00E9e : **Erreur d'E/S** (org.evosuite.runtime.mock.java.lang.MockThrowable: Could not find: 'K) **.\n****", string0);
      assertEquals(0L, services_HTTP_Result0.time);
      assertFalse(services_HTTP_Result0.works);
      assertEquals(0, services_HTTP_Result0.code);
      assertEquals(0, services_HTTP_Result0.page_weight);
      assertNotNull(string0);
      
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testSMTP("**Erreur d'E/S** (org.evosuite.runtime.mock.java.lang.MockThrowable: Could not find: 'K) **", 0);
      assertEquals(0L, services_SIMPLE_Result0.time);
      assertFalse(services_SIMPLE_Result0.works);
      assertNotNull(services_SIMPLE_Result0);
      
      String string1 = services_SIMPLE_Result0.toString();
      assertNotSame(string1, string0);
      assertEquals(0L, services_SIMPLE_Result0.time);
      assertFalse(services_SIMPLE_Result0.works);
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("https://**R\u00E9ponse incorrect**:3852");
      boolean boolean0 = NetworkHandling.createRemoteTextFile(evoSuiteURL0, "**Erreur d'E/S** (org.evosuite.runtime.mock.java.lang.MockThrowable: Could not find: 'K) **");
      assertTrue(boolean0);
      
      Services.HTTP_Result services_HTTP_Result1 = Services.testHTTPS("**R\u00E9ponse incorrect**", 3852);
      assertNotSame(services_HTTP_Result1, services_HTTP_Result0);
      assertEquals(92, services_HTTP_Result1.page_weight);
      assertEquals((-1), services_HTTP_Result1.code);
      assertTrue(services_HTTP_Result1.works);
      assertEquals(0L, services_HTTP_Result1.time);
      assertFalse(services_HTTP_Result1.equals((Object)services_HTTP_Result0));
      assertNotNull(services_HTTP_Result1);
  }
}

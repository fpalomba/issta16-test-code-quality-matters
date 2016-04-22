/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 19 05:47:51 GMT 2015
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
  /*
   * 1 covered goal:
   * Goal 1. Services.<init>()V: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("https://I\\;M\\8o;mk=geVw:1679");
      boolean boolean0 = NetworkHandling.createRemoteTextFile(evoSuiteURL0, "I;M8o;mk=geVw");
      assertTrue(boolean0);
      
      Services services0 = new Services();
      assertNotNull(services0);
      
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTPS("I;M8o;mk=geVw", 1679);
      assertNotNull(services_HTTP_Result0);
      assertEquals(0L, services_HTTP_Result0.time);
      assertFalse(services_HTTP_Result0.works);
      assertEquals(0, services_HTTP_Result0.code);
      assertEquals(0, services_HTTP_Result0.page_weight);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. Services$HTTP_Result.toString()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = new Services.HTTP_Result();
      assertNotNull(services_HTTP_Result0);
      assertEquals(0, services_HTTP_Result0.page_weight);
      assertEquals(0L, services_HTTP_Result0.time);
      assertFalse(services_HTTP_Result0.works);
      assertEquals(0, services_HTTP_Result0.code);
      
      String string0 = services_HTTP_Result0.toString();
      assertEquals("**** Resultat : \n** Fonctionnement : false\n** Temps : 0 ms\n** Poid de la page : 0 octets\n** Code de page : 0\n** Erreur g\u00E9n\u00E9r\u00E9e : .\n****", string0);
      assertNotNull(string0);
      assertEquals(0, services_HTTP_Result0.page_weight);
      assertEquals(0L, services_HTTP_Result0.time);
      assertFalse(services_HTTP_Result0.works);
      assertEquals(0, services_HTTP_Result0.code);
  }

  //Test case number: 2
  /*
   * 4 covered goals:
   * Goal 1. Services$HTTP_Result.reset()V: root-Branch
   * Goal 2. Services$HTTP_Result.<init>()V: root-Branch
   * Goal 3. Services.testHTTP(Ljava/lang/String;I)LServices$HTTP_Result;: I103 Branch 1 IFNULL L38 - true
   * Goal 4. Services.testHTTP(Ljava/lang/String;I)LServices$HTTP_Result;: I103 Branch 1 IFNULL L38 - false
   */

  @Test
  public void test2()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://fzJ a<4:2474");
      boolean boolean0 = NetworkHandling.createRemoteTextFile(evoSuiteURL0, "5EAW;");
      assertTrue(boolean0);
      
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTP("5EAW;", 1);
      assertNotNull(services_HTTP_Result0);
      assertEquals(0, services_HTTP_Result0.page_weight);
      assertFalse(services_HTTP_Result0.works);
      assertEquals(0L, services_HTTP_Result0.time);
      assertEquals(0, services_HTTP_Result0.code);
      
      Services.HTTP_Result services_HTTP_Result1 = Services.testHTTP("fzJ a<4", 2474);
      assertNotNull(services_HTTP_Result1);
      assertTrue(services_HTTP_Result1.works);
      assertEquals(6, services_HTTP_Result1.page_weight);
      assertEquals((-1), services_HTTP_Result1.code);
      assertEquals(0L, services_HTTP_Result1.time);
      assertNotSame(services_HTTP_Result1, services_HTTP_Result0);
      assertFalse(services_HTTP_Result1.equals((Object)services_HTTP_Result0));
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. Services$SIMPLE_Result.toString()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test3()  throws Throwable  {
      Services.SIMPLE_Result services_SIMPLE_Result0 = new Services.SIMPLE_Result();
      assertNotNull(services_SIMPLE_Result0);
      assertFalse(services_SIMPLE_Result0.works);
      assertEquals(0L, services_SIMPLE_Result0.time);
      
      String string0 = services_SIMPLE_Result0.toString();
      assertEquals("**** Resultat : \n** Fonctionnement : false\n** Temps : 0 ms\n** Erreur g\u00E9n\u00E9r\u00E9e : .\n****", string0);
      assertNotNull(string0);
      assertFalse(services_SIMPLE_Result0.works);
      assertEquals(0L, services_SIMPLE_Result0.time);
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * Goal 1. Services$SIMPLE_Result.<init>()V: root-Branch
   * Goal 2. Services$SIMPLE_Result.reset()V: root-Branch
   */

  @Test
  public void test4()  throws Throwable  {
      Services.SIMPLE_Result services_SIMPLE_Result0 = new Services.SIMPLE_Result();
      assertNotNull(services_SIMPLE_Result0);
      assertEquals(0L, services_SIMPLE_Result0.time);
      assertFalse(services_SIMPLE_Result0.works);
      
      services_SIMPLE_Result0.reset();
      assertEquals(0L, services_SIMPLE_Result0.time);
      assertFalse(services_SIMPLE_Result0.works);
  }
}

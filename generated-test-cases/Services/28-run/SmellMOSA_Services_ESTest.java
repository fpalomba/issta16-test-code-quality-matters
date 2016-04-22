/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 19 06:05:09 GMT 2015
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
      Services services0 = new Services();
      assertNotNull(services0);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. Services.testHTTP(Ljava/lang/String;I)LServices$HTTP_Result;: I103 Branch 1 IFNULL L38 - true
   * Goal 2. Services.testHTTP(Ljava/lang/String;I)LServices$HTTP_Result;: I103 Branch 1 IFNULL L38 - false
   */

  @Test
  public void test1()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://6* RBl3t 0~\n@ ontionxnt :1412");
      boolean boolean0 = NetworkHandling.createRemoteTextFile(evoSuiteURL0, "6* RBl3t 0~\n@ ontionxnt ");
      assertTrue(boolean0);
      
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTP("6* RBl3t 0~\n@ ontionxnt ", 1412);
      assertNotNull(services_HTTP_Result0);
      assertEquals((-1), services_HTTP_Result0.code);
      assertEquals(26, services_HTTP_Result0.page_weight);
      assertEquals(0L, services_HTTP_Result0.time);
      assertTrue(services_HTTP_Result0.works);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. Services$HTTP_Result.toString()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test2()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = new Services.HTTP_Result();
      assertNotNull(services_HTTP_Result0);
      assertFalse(services_HTTP_Result0.works);
      assertEquals(0, services_HTTP_Result0.page_weight);
      assertEquals(0L, services_HTTP_Result0.time);
      assertEquals(0, services_HTTP_Result0.code);
      
      String string0 = services_HTTP_Result0.toString();
      assertNotNull(string0);
      assertFalse(services_HTTP_Result0.works);
      assertEquals(0, services_HTTP_Result0.page_weight);
      assertEquals(0L, services_HTTP_Result0.time);
      assertEquals(0, services_HTTP_Result0.code);
      assertEquals("**** Resultat : \n** Fonctionnement : false\n** Temps : 0 ms\n** Poid de la page : 0 octets\n** Code de page : 0\n** Erreur g\u00E9n\u00E9r\u00E9e : .\n****", string0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. Services$SIMPLE_Result.reset()V: root-Branch
   */

  @Test
  public void test3()  throws Throwable  {
      Services.SIMPLE_Result services_SIMPLE_Result0 = new Services.SIMPLE_Result();
      assertNotNull(services_SIMPLE_Result0);
      assertEquals(0L, services_SIMPLE_Result0.time);
      assertFalse(services_SIMPLE_Result0.works);
      
      services_SIMPLE_Result0.reset();
      assertEquals(0L, services_SIMPLE_Result0.time);
      assertFalse(services_SIMPLE_Result0.works);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * Goal 1. Services$HTTP_Result.reset()V: root-Branch
   */

  @Test
  public void test4()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = new Services.HTTP_Result();
      assertNotNull(services_HTTP_Result0);
      assertFalse(services_HTTP_Result0.works);
      assertEquals(0, services_HTTP_Result0.page_weight);
      assertEquals(0, services_HTTP_Result0.code);
      assertEquals(0L, services_HTTP_Result0.time);
      
      services_HTTP_Result0.reset();
      assertFalse(services_HTTP_Result0.works);
      assertEquals(0, services_HTTP_Result0.page_weight);
      assertEquals(0, services_HTTP_Result0.code);
      assertEquals(0L, services_HTTP_Result0.time);
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * Goal 1. Services$SIMPLE_Result.<init>()V: root-Branch
   * Goal 2. Services$SIMPLE_Result.toString()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test5()  throws Throwable  {
      Services.SIMPLE_Result services_SIMPLE_Result0 = new Services.SIMPLE_Result();
      assertNotNull(services_SIMPLE_Result0);
      assertEquals(0L, services_SIMPLE_Result0.time);
      assertFalse(services_SIMPLE_Result0.works);
      
      String string0 = services_SIMPLE_Result0.toString();
      assertNotNull(string0);
      assertEquals(0L, services_SIMPLE_Result0.time);
      assertFalse(services_SIMPLE_Result0.works);
      assertEquals("**** Resultat : \n** Fonctionnement : false\n** Temps : 0 ms\n** Erreur g\u00E9n\u00E9r\u00E9e : .\n****", string0);
  }

  //Test case number: 6
  /*
   * 3 covered goals:
   * Goal 1. Services$HTTP_Result.<init>()V: root-Branch
   * Goal 2. Services.testHTTPS(Ljava/lang/String;I)LServices$HTTP_Result;: I103 Branch 2 IFNULL L82 - true
   * Goal 3. Services.testHTTPS(Ljava/lang/String;I)LServices$HTTP_Result;: I103 Branch 2 IFNULL L82 - false
   */

  @Test
  public void test6()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("https://l* ~Code   pa%ge :23");
      boolean boolean0 = NetworkHandling.createRemoteTextFile(evoSuiteURL0, "l* ~Code   pa%ge ");
      assertTrue(boolean0);
      
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTPS("l* ~Code   pa%ge ", 23);
      assertNotNull(services_HTTP_Result0);
      assertEquals(18, services_HTTP_Result0.page_weight);
      assertEquals(0L, services_HTTP_Result0.time);
      assertTrue(services_HTTP_Result0.works);
      assertEquals((-1), services_HTTP_Result0.code);
  }
}
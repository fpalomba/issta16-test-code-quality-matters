/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 18 14:30:44 GMT 2015
 */

package nu.staldal.lagoon;

import static org.junit.Assert.*;
import org.junit.Test;
import nu.staldal.lagoon.LagoonCLI;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class LagoonCLI_ESTest extends LagoonCLI_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. nu.staldal.lagoon.LagoonCLI.main([Ljava/lang/String;)V: I158 Branch 9 IFLE L114 - true
   * Goal 2. nu.staldal.lagoon.LagoonCLI.getProperty(Ljava/lang/String;)Ljava/lang/String;: I12 Branch 31 IFNONNULL L296 - false
   */

  @Test
  public void test0()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/Users/fabiopalomba/Documents/workspace/LunchEvosuite/Ready");
      String[] stringArray0 = new String[1];
      boolean boolean0 = FileSystemHandling.appendLineToFile(evoSuiteFile0, "Ready");
      stringArray0[0] = "Ready";
      LagoonCLI.main(stringArray0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. nu.staldal.lagoon.LagoonCLI.main([Ljava/lang/String;)V: I529 Branch 12 IFEQ L188 - true
   */

  @Test
  public void test1()  throws Throwable  {
      boolean boolean0 = FileSystemHandling.shouldAllThrowIOExceptions();
      String[] stringArray0 = new String[1];
      stringArray0[0] = ".sitemap";
      LagoonCLI.main(stringArray0);
  }

  //Test case number: 2
  /*
   * 4 covered goals:
   * Goal 1. nu.staldal.lagoon.LagoonCLI.main([Ljava/lang/String;)V: I125 Branch 7 IFGE L98 - true
   * Goal 2. nu.staldal.lagoon.LagoonCLI.main([Ljava/lang/String;)V: I149 Branch 8 IFGT L114 - false
   * Goal 3. nu.staldal.lagoon.LagoonCLI.main([Ljava/lang/String;)V: I158 Branch 9 IFLE L114 - false
   * Goal 4. nu.staldal.lagoon.LagoonCLI.main([Ljava/lang/String;)V: I352 Branch 10 IFNONNULL L144 - false
   */

  @Test
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "?CvNHu?IEy.sitemap";
      stringArray0[1] = "2";
      LagoonCLI.main(stringArray0);
  }

  //Test case number: 3
  /*
   * 4 covered goals:
   * Goal 1. nu.staldal.lagoon.LagoonCLI.main([Ljava/lang/String;)V: I37 Branch 2 IF_ICMPLE L84 - true
   * Goal 2. nu.staldal.lagoon.LagoonCLI.main([Ljava/lang/String;)V: I63 Branch 4 IF_ICMPLE L86 - true
   * Goal 3. nu.staldal.lagoon.LagoonCLI.main([Ljava/lang/String;)V: I89 Branch 6 IF_ICMPLE L88 - true
   * Goal 4. nu.staldal.lagoon.LagoonCLI.main([Ljava/lang/String;)V: I149 Branch 8 IFGT L114 - true
   */

  @Test
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "26' .xml";
      LagoonCLI.main(stringArray0);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * Goal 1. nu.staldal.lagoon.LagoonCLI.main([Ljava/lang/String;)V: I72 Branch 5 IFLE L86 - false
   */

  @Test
  public void test4()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[1] = "force";
      // Undeclared exception!
      try {
        LagoonCLI.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * Goal 1. nu.staldal.lagoon.LagoonCLI.main([Ljava/lang/String;)V: I46 Branch 3 IFLE L84 - false
   */

  @Test
  public void test5()  throws Throwable  {
      String[] stringArray0 = new String[10];
      stringArray0[1] = "build";
      // Undeclared exception!
      try {
        LagoonCLI.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 6
  /*
   * 7 covered goals:
   * Goal 1. nu.staldal.lagoon.LagoonCLI.main([Ljava/lang/String;)V: I20 Branch 1 IF_ICMPGE L79 - true
   * Goal 2. nu.staldal.lagoon.LagoonCLI.main([Ljava/lang/String;)V: I37 Branch 2 IF_ICMPLE L84 - false
   * Goal 3. nu.staldal.lagoon.LagoonCLI.main([Ljava/lang/String;)V: I46 Branch 3 IFLE L84 - true
   * Goal 4. nu.staldal.lagoon.LagoonCLI.main([Ljava/lang/String;)V: I63 Branch 4 IF_ICMPLE L86 - false
   * Goal 5. nu.staldal.lagoon.LagoonCLI.main([Ljava/lang/String;)V: I72 Branch 5 IFLE L86 - true
   * Goal 6. nu.staldal.lagoon.LagoonCLI.main([Ljava/lang/String;)V: I89 Branch 6 IF_ICMPLE L88 - false
   * Goal 7. nu.staldal.lagoon.LagoonCLI.main([Ljava/lang/String;)V: I125 Branch 7 IFGE L98 - false
   */

  @Test
  public void test6()  throws Throwable  {
      String[] stringArray0 = new String[10];
      stringArray0[1] = "0";
      LagoonCLI.main(stringArray0);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. nu.staldal.lagoon.LagoonCLI.<init>()V: root-Branch
   */

  @Test
  public void test7()  throws Throwable  {
      LagoonCLI lagoonCLI0 = new LagoonCLI();
  }
}

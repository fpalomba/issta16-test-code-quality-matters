/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 19 04:58:52 GMT 2015
 */

package com.densebrain.rif.client;

import static org.junit.Assert.*;
import org.junit.Test;
import com.densebrain.rif.client.RIFClassLoader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class RIFClassLoader_ESTest extends RIFClassLoader_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. com.densebrain.rif.client.RIFClassLoader.registerClass(Ljava/lang/String;[B)V: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
      RIFClassLoader rIFClassLoader0 = new RIFClassLoader();
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try {
        rIFClassLoader0.registerClass("_EQ c 'L+", byteArray0);
        fail("Expecting exception: ClassFormatError");
      
      } catch(ClassFormatError e) {
         //
         // Truncated class file
         //
      }
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. com.densebrain.rif.client.RIFClassLoader.findClass(Ljava/lang/String;)Ljava/lang/Class;: root-Branch
   * Goal 2. com.densebrain.rif.client.RIFClassLoader.<init>()V: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
      RIFClassLoader rIFClassLoader0 = new RIFClassLoader();
      Class<?> class0 = rIFClassLoader0.loadClass("");
      assertNull(class0);
  }
}

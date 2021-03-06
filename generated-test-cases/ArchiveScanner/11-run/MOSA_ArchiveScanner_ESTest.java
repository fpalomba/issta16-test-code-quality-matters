/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 11 18:45:35 GMT 2015
 */

package com.lts.io;

import static org.junit.Assert.*;
import org.junit.Test;
import com.lts.io.ArchiveScanner;
import com.lts.io.ImprovedFile;
import java.io.File;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ArchiveScanner_ESTest extends ArchiveScanner_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I38 Branch 18 IF_ICMPGE L193 - true
   */

  @Test
  public void test0()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.scandir(improvedFile0, (String) null, true);
      assertEquals(2, archiveScanner0.ARCHIVE);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I11 Branch 17 IFNONNULL L179 - false
   */

  @Test
  public void test1()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("k``??s f");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      try {
        archiveScanner0.scandir(improvedFile0, "k``??s f", true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /Users/fabiopalomba/Documents/workspace/LunchEvosuite/k``??s f
         //
      }
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. com.lts.io.ArchiveScanner.processArchive(Ljava/io/File;Ljava/lang/String;)V: I8 Branch 15 IFNE L163 - true
   * Goal 2. com.lts.io.ArchiveScanner.processArchive(Ljava/io/File;Ljava/lang/String;)V: I27 Branch 16 IFEQ L165 - false
   */

  @Test
  public void test2()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("*");
      ImprovedFile improvedFile1 = ImprovedFile.createTempImprovedFile("A[QBi,Vc.0)rY[q>$~uB.jar", "plCndor", (File) improvedFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile1);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "*";
      stringArray0[1] = "plCndor";
      stringArray0[2] = "*";
      String[] stringArray1 = new String[8];
      stringArray1[0] = "plCndor";
      stringArray1[1] = "plCndor";
      stringArray1[2] = "*";
      stringArray1[3] = "*";
      stringArray1[4] = "*";
      stringArray1[5] = "plCndor";
      stringArray1[6] = "A[QBi,Vc.0)rY[q>$~uB.jar";
      stringArray1[7] = "A[QBi,Vc.0)rY[q>$~uB.jar";
      archiveScanner0.setExcludes(stringArray1);
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try {
        archiveScanner0.scandir(improvedFile0, (String) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 3
  /*
   * 8 covered goals:
   * Goal 1. com.lts.io.ArchiveScanner.isArchive(Ljava/io/File;)Z: I19 Branch 1 IFNE L72 - true
   * Goal 2. com.lts.io.ArchiveScanner.isArchive(Ljava/io/File;)Z: I19 Branch 1 IFNE L72 - false
   * Goal 3. com.lts.io.ArchiveScanner.isArchive(Ljava/io/File;)Z: I26 Branch 2 IF_ICMPGE L72 - false
   * Goal 4. com.lts.io.ArchiveScanner.toFileType(Ljava/io/File;)I: I11 Branch 3 IFEQ L86 - true
   * Goal 5. com.lts.io.ArchiveScanner.toFileType(Ljava/io/File;)I: I28 Branch 4 IFEQ L88 - false
   * Goal 6. com.lts.io.ArchiveScanner.processArchive(Ljava/io/File;Ljava/lang/String;)V: I8 Branch 15 IFNE L163 - false
   * Goal 7. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 20 TABLESWITCH L198 Case 1 - false
   * Goal 8. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 21 TABLESWITCH L198 Case 2 - true
   */

  @Test
  public void test3()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("");
      ImprovedFile improvedFile1 = ImprovedFile.createTempImprovedFile("A[QBi,Vc.0)rY[q>$~uB.jar", "splendor", (File) improvedFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile1);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "splendor";
      stringArray0[2] = "";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try {
        archiveScanner0.scandir(improvedFile0, (String) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * Goal 1. com.lts.io.ArchiveScanner.processFile(Ljava/lang/String;)V: I27 Branch 13 IFEQ L133 - false
   */

  @Test
  public void test4()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("%? [%d] `5> %s [%d]", "K\u0007J[{z=C0:h)l~j89}^Sjhjar0;FocKILt}E\".jar");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.addDefaultExcludes();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "%? [%d] `5> %s [%d]";
      stringArray0[1] = "ug38Hci]!<&TAioD#~";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try {
        archiveScanner0.processFile("ug38Hci]!<&TAioD#~");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * Goal 1. com.lts.io.ArchiveScanner.processFile(Ljava/lang/String;)V: I8 Branch 12 IFNE L131 - true
   * Goal 2. com.lts.io.ArchiveScanner.processFile(Ljava/lang/String;)V: I27 Branch 13 IFEQ L133 - true
   */

  @Test
  public void test5()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("%s [%d] --> %s [%d]", "&;-C8i");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.addDefaultExcludes();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "%s [%d] --> %s [%d]";
      stringArray0[1] = "&;-C8i";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try {
        archiveScanner0.processFile("&;-C8i");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. com.lts.io.ArchiveScanner.processFile(Ljava/lang/String;)V: I8 Branch 12 IFNE L131 - false
   */

  @Test
  public void test6()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("9");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "9";
      stringArray0[1] = "splendor";
      stringArray0[2] = "9";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try {
        archiveScanner0.processFile("F`J");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. com.lts.io.ArchiveScanner.processDirectory(Ljava/io/File;Ljava/lang/String;Z)V: I17 Branch 7 IFNE L103 - false
   */

  @Test
  public void test7()  throws Throwable  {
      ImprovedFile improvedFile0 = ImprovedFile.createTempImprovedFile(".ZIP0.ear.jar", (String) null, (File) null);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = ".ZIP0.ear.jar";
      archiveScanner0.setIncludes(stringArray0);
      String[] stringArray1 = new String[1];
      stringArray1[0] = "ewGrad";
      archiveScanner0.setExcludes(stringArray1);
      // Undeclared exception!
      try {
        archiveScanner0.processDirectory((File) null, ".ZIP0.ear.jar", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 8
  /*
   * 2 covered goals:
   * Goal 1. com.lts.io.ArchiveScanner.processDirectory(Ljava/io/File;Ljava/lang/String;Z)V: I8 Branch 6 IFEQ L101 - false
   * Goal 2. com.lts.io.ArchiveScanner.processDirectory(Ljava/io/File;Ljava/lang/String;Z)V: I17 Branch 7 IFNE L103 - true
   */

  @Test
  public void test8()  throws Throwable  {
      ImprovedFile improvedFile0 = ImprovedFile.createTempImprovedFile(".ZIP0.ear.jar", (String) null, (File) null);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = ".ZIP0.ear.jar";
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.setExcludes(stringArray0);
      // Undeclared exception!
      try {
        archiveScanner0.processDirectory((File) null, ".ZIP0.ear.jar", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 9
  /*
   * 9 covered goals:
   * Goal 1. com.lts.io.ArchiveScanner.<init>(Lcom/lts/io/ImprovedFile;)V: root-Branch
   * Goal 2. com.lts.io.ArchiveScanner.toFileType(Ljava/io/File;)I: I11 Branch 3 IFEQ L86 - false
   * Goal 3. com.lts.io.ArchiveScanner.processDirectory(Ljava/io/File;Ljava/lang/String;Z)V: I8 Branch 6 IFEQ L101 - true
   * Goal 4. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I11 Branch 17 IFNONNULL L179 - true
   * Goal 5. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I38 Branch 18 IF_ICMPGE L193 - false
   * Goal 6. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 19 TABLESWITCH L198 Case 0 - false
   * Goal 7. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 20 TABLESWITCH L198 Case 1 - true
   * Goal 8. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 21 TABLESWITCH L198 Case 2 - false
   * Goal 9. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 22 TABLESWITCH L198 Default-Case - false
   */

  @Test
  public void test9()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile(">77kIpA/~wd");
      ImprovedFile improvedFile1 = ImprovedFile.createTempImprovedFile(">77kIpA/~wd", ">77kIpA/~wd", (File) improvedFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile1);
      String[] stringArray0 = new String[5];
      stringArray0[0] = ">77kIpA/~wd";
      stringArray0[1] = ">77kIpA/~wd";
      stringArray0[2] = ">77kIpA/~wd";
      stringArray0[3] = ">77kIpA/~wd";
      stringArray0[4] = ">77kIpA/~wd";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try {
        archiveScanner0.scandir(improvedFile0, ".ZIP", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}

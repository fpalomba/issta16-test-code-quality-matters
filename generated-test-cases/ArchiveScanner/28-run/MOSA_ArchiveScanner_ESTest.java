/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 11 19:24:09 GMT 2015
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
      ImprovedFile improvedFile0 = new ImprovedFile("MAx6@", "MAx6@");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      ImprovedFile improvedFile1 = improvedFile0.createTempDir("MAx6@", "m.SW4=Qlz'Fs9");
      archiveScanner0.scandir(improvedFile1, "honored", true);
      assertEquals("/Users/fabiopalomba/Documents/workspace/LunchEvosuite/MAx6@/MAx6@", improvedFile1.getParent());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I11 Branch 17 IFNONNULL L179 - false
   */

  @Test
  public void test1()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("MAx6@", "MAx6@");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      try {
        archiveScanner0.scandir(improvedFile0, "Sp:4;&.X3T]**D,lB", true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /Users/fabiopalomba/Documents/workspace/LunchEvosuite/MAx6@/MAx6@
         //
      }
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. com.lts.io.ArchiveScanner.processFile(Ljava/lang/String;)V: I27 Branch 13 IFEQ L133 - false
   */

  @Test
  public void test2()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[11];
      stringArray0[0] = ".EAjar.jar";
      stringArray0[1] = "";
      stringArray0[1] = "Z#i~";
      archiveScanner0.includes = stringArray0;
      archiveScanner0.addDefaultExcludes();
      // Undeclared exception!
      try {
        archiveScanner0.processFile("Z#i~");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * Goal 1. com.lts.io.ArchiveScanner.processFile(Ljava/lang/String;)V: I8 Branch 12 IFNE L131 - true
   * Goal 2. com.lts.io.ArchiveScanner.processFile(Ljava/lang/String;)V: I27 Branch 13 IFEQ L133 - true
   */

  @Test
  public void test3()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[9];
      stringArray0[0] = ".EAjar.jar";
      stringArray0[1] = "";
      stringArray0[2] = "Failed to remove file, ";
      stringArray0[3] = "}Dl}gV{bVUH<cf;DZ5";
      stringArray0[4] = "coormd";
      stringArray0[5] = "useLC";
      stringArray0[6] = "Failed to remove file, ";
      stringArray0[7] = "j\"ar";
      stringArray0[8] = "rel";
      archiveScanner0.includes = stringArray0;
      archiveScanner0.addDefaultExcludes();
      // Undeclared exception!
      try {
        archiveScanner0.processFile("rel");
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
   * Goal 1. com.lts.io.ArchiveScanner.processFile(Ljava/lang/String;)V: I8 Branch 12 IFNE L131 - false
   */

  @Test
  public void test4()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[9];
      stringArray0[0] = ".EAjar.jar";
      stringArray0[1] = "";
      stringArray0[2] = "Failed to remove file, ";
      stringArray0[3] = "}Dl}gV{bVUH<cf;DZ5";
      stringArray0[4] = "colored";
      stringArray0[5] = "useLC";
      stringArray0[6] = "pcc#/y>[erV!2gO";
      stringArray0[7] = "j\"ar";
      stringArray0[8] = "rel";
      archiveScanner0.includes = stringArray0;
      // Undeclared exception!
      try {
        archiveScanner0.processFile("l");
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
   * Goal 1. com.lts.io.ArchiveScanner.processDirectory(Ljava/io/File;Ljava/lang/String;Z)V: I17 Branch 7 IFNE L103 - false
   */

  @Test
  public void test5()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[9];
      stringArray0[0] = ".EAjar.jar";
      stringArray0[1] = "B";
      stringArray0[2] = "Failedto remoe file, ";
      stringArray0[3] = "}Dl}gV{bVUH<cf;DZ5";
      stringArray0[4] = "B";
      stringArray0[5] = "}Dl}gV{bVUH<cf;DZ5";
      stringArray0[6] = "pcc#/y>[erV!2gO";
      archiveScanner0.addDefaultExcludes();
      archiveScanner0.includes = stringArray0;
      ImprovedFile improvedFile0 = new ImprovedFile("Failedto remoe file, ");
      // Undeclared exception!
      try {
        archiveScanner0.processDirectory((File) improvedFile0, "pcc#/y>[erV!2gO", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 6
  /*
   * 2 covered goals:
   * Goal 1. com.lts.io.ArchiveScanner.processDirectory(Ljava/io/File;Ljava/lang/String;Z)V: I8 Branch 6 IFEQ L101 - false
   * Goal 2. com.lts.io.ArchiveScanner.processDirectory(Ljava/io/File;Ljava/lang/String;Z)V: I17 Branch 7 IFNE L103 - true
   */

  @Test
  public void test6()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[9];
      stringArray0[0] = ".EAjar.jar";
      stringArray0[1] = "B";
      stringArray0[2] = "Failedto remoe file, ";
      archiveScanner0.excludes = stringArray0;
      stringArray0[3] = "}Dl}gV{bVUH<cf;DZ5";
      stringArray0[4] = "B";
      stringArray0[5] = "}Dl}gV{bVUH<cf;DZ5";
      stringArray0[6] = "pcc#/y>[erV!2gO";
      archiveScanner0.includes = stringArray0;
      ImprovedFile improvedFile0 = new ImprovedFile("Failedto remoe file, ");
      // Undeclared exception!
      try {
        archiveScanner0.processDirectory((File) improvedFile0, "pcc#/y>[erV!2gO", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 7
  /*
   * 4 covered goals:
   * Goal 1. com.lts.io.ArchiveScanner.toFileType(Ljava/io/File;)I: I11 Branch 3 IFEQ L86 - false
   * Goal 2. com.lts.io.ArchiveScanner.processDirectory(Ljava/io/File;Ljava/lang/String;Z)V: I8 Branch 6 IFEQ L101 - true
   * Goal 3. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 20 TABLESWITCH L198 Case 1 - true
   * Goal 4. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 21 TABLESWITCH L198 Case 2 - false
   */

  @Test
  public void test7()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("MAx6@", "MAx6@");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      ImprovedFile improvedFile1 = ImprovedFile.createTempDirectory("MAx6@", "m.SW4=Qlz'Fs9", (File) improvedFile0);
      String[] stringArray0 = new String[10];
      stringArray0[0] = "0'PW";
      stringArray0[1] = "m.SW4=Qlz'Fs9";
      stringArray0[2] = "m.SW4=Qlz'Fs9";
      stringArray0[3] = "qxK@";
      stringArray0[4] = "Sp:4;&.X3T]**D,lB";
      stringArray0[5] = "MAx6@";
      stringArray0[6] = "abhor";
      stringArray0[7] = "Sp:4;&.X3T]**D,lB";
      stringArray0[8] = "qxK@";
      stringArray0[9] = "x6@";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try {
        archiveScanner0.scandir(improvedFile0, "up", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 8
  /*
   * 12 covered goals:
   * Goal 1. com.lts.io.ArchiveScanner.<init>(Lcom/lts/io/ImprovedFile;)V: root-Branch
   * Goal 2. com.lts.io.ArchiveScanner.isArchive(Ljava/io/File;)Z: I19 Branch 1 IFNE L72 - true
   * Goal 3. com.lts.io.ArchiveScanner.isArchive(Ljava/io/File;)Z: I19 Branch 1 IFNE L72 - false
   * Goal 4. com.lts.io.ArchiveScanner.isArchive(Ljava/io/File;)Z: I26 Branch 2 IF_ICMPGE L72 - false
   * Goal 5. com.lts.io.ArchiveScanner.toFileType(Ljava/io/File;)I: I11 Branch 3 IFEQ L86 - true
   * Goal 6. com.lts.io.ArchiveScanner.toFileType(Ljava/io/File;)I: I28 Branch 4 IFEQ L88 - false
   * Goal 7. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I11 Branch 17 IFNONNULL L179 - true
   * Goal 8. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I38 Branch 18 IF_ICMPGE L193 - false
   * Goal 9. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 19 TABLESWITCH L198 Case 0 - false
   * Goal 10. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 20 TABLESWITCH L198 Case 1 - false
   * Goal 11. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 21 TABLESWITCH L198 Case 2 - true
   * Goal 12. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 22 TABLESWITCH L198 Default-Case - false
   */

  @Test
  public void test8()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      ImprovedFile improvedFile1 = ImprovedFile.createTempDirectory("Vg[XDr':>Mf}z6]7jC4", ".E4~A", (File) improvedFile0);
      // Undeclared exception!
      try {
        archiveScanner0.scandir(improvedFile0, "ri@", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}

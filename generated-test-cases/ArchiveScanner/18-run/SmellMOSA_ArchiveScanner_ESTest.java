/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 11 17:53:49 GMT 2015
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
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ArchiveScanner_ESTest extends ArchiveScanner_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. com.lts.io.ArchiveScanner.processArchive(Ljava/io/File;Ljava/lang/String;)V: I8 Branch 15 IFNE L163 - false
   */

  @Test
  public void test00()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "Fy!Vg0%|K}$";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try {
        archiveScanner0.processArchive((File) null, "Usage: java GrammaticalStructur [ptinsY -stFile|-reeFile|-conllxFRle file] [-t2tGralh].j~r.jar");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * Goal 1. com.lts.io.ArchiveScanner.toFileType(Ljava/io/File;)I: I11 Branch 3 IFEQ L86 - false
   * Goal 2. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 20 TABLESWITCH L198 Case 1 - true
   * Goal 3. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 21 TABLESWITCH L198 Case 2 - false
   */

  @Test
  public void test01()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/Users/fabiopalomba/Documents/workspace/LunchEvosuite/After combineCon p:               /After combineCon p:               ");
      boolean boolean0 = FileSystemHandling.createFolder(evoSuiteFile0);
      ImprovedFile improvedFile0 = new ImprovedFile("After combineCon p:               ", "After combineCon p:               ");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      ImprovedFile improvedFile1 = improvedFile0.createTempDir();
      // Undeclared exception!
      try {
        archiveScanner0.scandir(improvedFile0, "After combineCon p:               ", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 2
  /*
   * 5 covered goals:
   * Goal 1. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I38 Branch 18 IF_ICMPGE L193 - false
   * Goal 2. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 19 TABLESWITCH L198 Case 0 - false
   * Goal 3. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 20 TABLESWITCH L198 Case 1 - false
   * Goal 4. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 21 TABLESWITCH L198 Case 2 - true
   * Goal 5. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 22 TABLESWITCH L198 Default-Case - false
   */

  @Test
  public void test02()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("");
      ImprovedFile improvedFile1 = improvedFile0.createTempDir();
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile1);
      // Undeclared exception!
      try {
        archiveScanner0.scandir(improvedFile0, "", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. com.lts.io.ArchiveScanner.processFile(Ljava/lang/String;)V: I8 Branch 12 IFNE L131 - false
   */

  @Test
  public void test03()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile(".iA5Z0HUqt;ksm=");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = ".iA5Z0HUqt;ksm=";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try {
        archiveScanner0.processFile(", does not exist and could not be created.");
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
   * Goal 1. com.lts.io.ArchiveScanner.processDirectory(Ljava/io/File;Ljava/lang/String;Z)V: I8 Branch 6 IFEQ L101 - true
   */

  @Test
  public void test04()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/Users/fabiopalomba/Documents/workspace/LunchEvosuite/After combineCon p:               /After combineCon p:               ");
      boolean boolean0 = FileSystemHandling.createFolder(evoSuiteFile0);
      ImprovedFile improvedFile0 = new ImprovedFile("After combineon p:               ", "After combineon p:               ");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "After combineon p:               ";
      stringArray0[1] = "After combineon p:               ";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try {
        archiveScanner0.processDirectory((File) improvedFile0, "Usge1 java Gramma`icajSt9ucture [ptins] -stFiue|-eeFile|-conllxFRle filj] [-t2tGraph].j~r.jar.jar", true);
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
  public void test05()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      archiveScanner0.addDefaultExcludes();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "Error trying to write data to output file";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try {
        archiveScanner0.processDirectory((File) null, "Error trying to write data to output file", true);
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
   * Goal 1. com.lts.io.ArchiveScanner.processFile(Ljava/lang/String;)V: I27 Branch 13 IFEQ L133 - true
   */

  @Test
  public void test06()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      archiveScanner0.addDefaultExcludes();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "Error trying to write data to output file";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try {
        archiveScanner0.processFile("Error trying to write data to output file");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 7
  /*
   * 2 covered goals:
   * Goal 1. com.lts.io.ArchiveScanner.processDirectory(Ljava/io/File;Ljava/lang/String;Z)V: I8 Branch 6 IFEQ L101 - false
   * Goal 2. com.lts.io.ArchiveScanner.processDirectory(Ljava/io/File;Ljava/lang/String;Z)V: I17 Branch 7 IFNE L103 - true
   */

  @Test
  public void test07()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      archiveScanner0.addDefaultExcludes();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "#s%[or]du #";
      archiveScanner0.includes = stringArray0;
      // Undeclared exception!
      try {
        archiveScanner0.processDirectory((File) null, "#s%[or]du #", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * Goal 1. com.lts.io.ArchiveScanner.processArchive(Ljava/io/File;Ljava/lang/String;)V: I27 Branch 16 IFEQ L165 - true
   */

  @Test
  public void test08()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      archiveScanner0.addDefaultExcludes();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "y!g0|K";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try {
        archiveScanner0.processArchive((File) null, "y!g0|K");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 9
  /*
   * 2 covered goals:
   * Goal 1. com.lts.io.ArchiveScanner.processFile(Ljava/lang/String;)V: I8 Branch 12 IFNE L131 - true
   * Goal 2. com.lts.io.ArchiveScanner.processFile(Ljava/lang/String;)V: I27 Branch 13 IFEQ L133 - false
   */

  @Test
  public void test09()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("(HQz1(1,wr(ZSD$");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "(HQz1(1,wr(ZSD$";
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.excludes = stringArray0;
      // Undeclared exception!
      try {
        archiveScanner0.processFile("(HQz1(1,wr(ZSD$");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 10
  /*
   * 2 covered goals:
   * Goal 1. com.lts.io.ArchiveScanner.processArchive(Ljava/io/File;Ljava/lang/String;)V: I8 Branch 15 IFNE L163 - true
   * Goal 2. com.lts.io.ArchiveScanner.processArchive(Ljava/io/File;Ljava/lang/String;)V: I27 Branch 16 IFEQ L165 - false
   */

  @Test
  public void test10()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[1];
      archiveScanner0.excludes = stringArray0;
      stringArray0[0] = "y!g0|K";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try {
        archiveScanner0.processArchive((File) null, "y!g0|K");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 11
  /*
   * 2 covered goals:
   * Goal 1. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I11 Branch 17 IFNONNULL L179 - true
   * Goal 2. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I38 Branch 18 IF_ICMPGE L193 - true
   */

  @Test
  public void test11()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/Users/fabiopalomba/Documents/workspace/LunchEvosuite/After combineCon p:               /After combineCon p:               ");
      boolean boolean0 = FileSystemHandling.createFolder(evoSuiteFile0);
      ImprovedFile improvedFile0 = new ImprovedFile("After combine}on p:               ", "After combine}on p:               ");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      ImprovedFile improvedFile1 = improvedFile0.createTempDir();
      archiveScanner0.scandir(improvedFile1, "After combine}on p:               ", true);
      assertEquals("tempdir0", improvedFile1.getName());
  }

  //Test case number: 12
  /*
   * 5 covered goals:
   * Goal 1. com.lts.io.ArchiveScanner.isArchive(Ljava/io/File;)Z: I19 Branch 1 IFNE L72 - true
   * Goal 2. com.lts.io.ArchiveScanner.isArchive(Ljava/io/File;)Z: I19 Branch 1 IFNE L72 - false
   * Goal 3. com.lts.io.ArchiveScanner.isArchive(Ljava/io/File;)Z: I26 Branch 2 IF_ICMPGE L72 - false
   * Goal 4. com.lts.io.ArchiveScanner.toFileType(Ljava/io/File;)I: I11 Branch 3 IFEQ L86 - true
   * Goal 5. com.lts.io.ArchiveScanner.toFileType(Ljava/io/File;)I: I28 Branch 4 IFEQ L88 - false
   */

  @Test
  public void test12()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("After combineCon p:               ", "After combineCon p:               ");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      int int0 = archiveScanner0.toFileType((File) improvedFile0);
      //  // Unstable assertion: assertEquals(2, int0);
  }

  //Test case number: 13
  /*
   * 2 covered goals:
   * Goal 1. com.lts.io.ArchiveScanner.<init>(Lcom/lts/io/ImprovedFile;)V: root-Branch
   * Goal 2. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I11 Branch 17 IFNONNULL L179 - false
   */

  @Test
  public void test13()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("After combineCon p:               ", "After combineCon p:               ");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      try {
        archiveScanner0.scandir(improvedFile0, "After combineCon p:               ", true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /Users/fabiopalomba/Documents/workspace/LunchEvosuite/After combineCon p:               /After combineCon p:               
         //
      }
  }
}

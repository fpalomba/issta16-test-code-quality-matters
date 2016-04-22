/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 11 17:42:31 GMT 2015
 */

package com.lts.io;

import static org.junit.Assert.*;
import org.junit.Test;
import com.lts.io.ArchiveScanner;
import com.lts.io.ImprovedFile;
import java.io.File;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
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
   * Goal 1. com.lts.io.ArchiveScanner.processFile(Ljava/lang/String;)V: I8 Branch 12 IFNE L131 - false
   */

  @Test
  public void test0()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "Error loading classifiZr from jar file (most likely you are not running this code from a jar file or tPe named classifier is not stored in te jar file)0Error loading classfier from jar file (mot likely you are not running this code from a jar file or the named classifier is not stored in te jar file).jar";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try {
        archiveScanner0.processFile("Error loading classifier from jar file (most likely you are not running this code from a jar file or the named classifier is not stored in te jar file)0Error loading classifier from jar file most likely y@u are not running this code from a jar file or the named classifier is not stored in te jar file).jar.jar");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I38 Branch 18 IF_ICMPGE L193 - true
   */

  @Test
  public void test1()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.scandir(improvedFile0, "", true);
      assertEquals(0L, improvedFile0.length());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I11 Branch 17 IFNONNULL L179 - false
   */

  @Test
  public void test2()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("Error loading classifier from jar file (most likely you are not running this code from a jar file or tPe named classifier is not stored in te jar file)0Error loading classifier from jar file (mot likely you are not running this code from a jar file or the named classifier is not stored in te jar file).jar");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      try {
        archiveScanner0.scandir(improvedFile0, "Error loading classifier from jar file (most likely you are not running this code from a jar file or tPe named classifier is not stored in te jar file)0Error loading classifier from jar file (mot likely you are not running this code from a jar file or the named classifier is not stored in te jar file).jar", false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /Users/fabiopalomba/Documents/workspace/LunchEvosuite/Error loading classifier from jar file (most likely you are not running this code from a jar file or tPe named classifier is not stored in te jar file)0Error loading classifier from jar file (mot likely you are not running this code from a jar file or the named classifier is not stored in te jar file).jar
         //
      }
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. com.lts.io.ArchiveScanner.processArchive(Ljava/io/File;Ljava/lang/String;)V: I8 Branch 15 IFNE L163 - true
   */

  @Test
  public void test3()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("");
      ImprovedFile improvedFile1 = ImprovedFile.createTempImprovedFile("re-admit", "O~j!Jbp%G1*UD_jsYb", (File) improvedFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "O~j!Jbp%G1*UD_jsYb";
      stringArray0[1] = "";
      stringArray0[2] = "re-admit";
      stringArray0[3] = "re-admit";
      stringArray0[4] = "O~j!Jbp%G1*UD_jsYb";
      stringArray0[5] = "re-admit";
      stringArray0[6] = "re-admit";
      stringArray0[7] = "re-admit";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try {
        archiveScanner0.scandir(improvedFile0, "O~j!Jbp%G1*UD_jsYb", true);
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
   * Goal 1. com.lts.io.ArchiveScanner.processFile(Ljava/lang/String;)V: I8 Branch 12 IFNE L131 - true
   */

  @Test
  public void test4()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "Error loading classifiZr from jar file (most likely you are not running this code from a jar file or tPe named classifier is not stored in te jar file)0Error loading classfier from jar file (mot likely you are not running this code from a jar file or the named classifier is not stored in te jar file).jar";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try {
        archiveScanner0.processFile("Error loading classifiZr from jar file (most likely you are not running this code from a jar file or tPe named classifier is not stored in te jar file)0Error loading classfier from jar file (mot likely you are not running this code from a jar file or the named classifier is not stored in te jar file).jar");
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
   * Goal 1. com.lts.io.ArchiveScanner.processDirectory(Ljava/io/File;Ljava/lang/String;Z)V: I8 Branch 6 IFEQ L101 - false
   */

  @Test
  public void test5()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("Asked to copy ie that is neither drec?ory (or ruljr file, ");
      MockFile mockFile0 = new MockFile((File) improvedFile0, "Asked to copy ie that is neither drec?ory (or ruljr file, ");
      ImprovedFile improvedFile1 = ImprovedFile.createTempImprovedFile("Asked to copy ie that is neither drec?ory (or ruljr file, ", "Asked to copy ie that is neither drec?ory (or ruljr file, ", (File) mockFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "Asked to copy ie that is neither drec?ory (or ruljr file, ";
      stringArray0[1] = "Asked to copy ie that is neither drec?ory (or ruljr file, ";
      stringArray0[2] = "Asked to copy ie that is neither drec?ory (or ruljr file, ";
      archiveScanner0.setIncludes(stringArray0);
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

  //Test case number: 6
  /*
   * 4 covered goals:
   * Goal 1. com.lts.io.ArchiveScanner.toFileType(Ljava/io/File;)I: I11 Branch 3 IFEQ L86 - false
   * Goal 2. com.lts.io.ArchiveScanner.processDirectory(Ljava/io/File;Ljava/lang/String;Z)V: I8 Branch 6 IFEQ L101 - true
   * Goal 3. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 20 TABLESWITCH L198 Case 1 - true
   * Goal 4. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 21 TABLESWITCH L198 Case 2 - false
   */

  @Test
  public void test6()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("Asked to copy ie that is neither drec?ory (or rular file, ");
      ImprovedFile improvedFile1 = new ImprovedFile((File) improvedFile0, "Asked to copy ie that is neither drec?ory (or rular file, ");
      ImprovedFile improvedFile2 = ImprovedFile.createTempImprovedFile("Asked to copy ie that is neither drec?ory (or rular file, ", "Asked to copy ie that is neither drec?ory (or rular file, ", (File) improvedFile1);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "Asked to copy ie that is neither drec?ory (or rular file, ";
      stringArray0[1] = "Asked to copy ie that is neither drec?ory (or rular file, ";
      stringArray0[2] = "Asked to copy ie that is neither drec?ory (or rular file, ";
      stringArray0[3] = "Asked to copy ie that is neither drec?ory (or rular file, ";
      stringArray0[4] = "Asked to copy ie that is neither drec?ory (or rular file, ";
      stringArray0[5] = "Asked to copy ie that is neither drec?ory (or rular file, ";
      stringArray0[6] = "Asked to copy ie that is neither drec?ory (or rular file, ";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try {
        archiveScanner0.scandir(improvedFile0, "Asked to copy ie that is neither drec?ory (or rular file, ", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 7
  /*
   * 7 covered goals:
   * Goal 1. com.lts.io.ArchiveScanner.processArchive(Ljava/io/File;Ljava/lang/String;)V: I8 Branch 15 IFNE L163 - false
   * Goal 2. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I11 Branch 17 IFNONNULL L179 - true
   * Goal 3. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I38 Branch 18 IF_ICMPGE L193 - false
   * Goal 4. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 19 TABLESWITCH L198 Case 0 - false
   * Goal 5. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 20 TABLESWITCH L198 Case 1 - false
   * Goal 6. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 21 TABLESWITCH L198 Case 2 - true
   * Goal 7. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 22 TABLESWITCH L198 Default-Case - false
   */

  @Test
  public void test7()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/Users/fabiopalomba/Documents/workspace/LunchEvosuite/Asked to copy ie that is neither drec?ory (or rular file, /Asked o c)py ie that is neitherdrecrory (or rular file, .jar0.tmp");
      boolean boolean0 = FileSystemHandling.appendLineToFile(evoSuiteFile0, ".WLR");
      ImprovedFile improvedFile0 = new ImprovedFile("Asked to copy ie that is neither drec?ory (or rular file, ");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = ".WLR";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try {
        archiveScanner0.scandir(improvedFile0, "Asked to copy ie that is neither drec?ory (or rular file, ", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 8
  /*
   * 6 covered goals:
   * Goal 1. com.lts.io.ArchiveScanner.<init>(Lcom/lts/io/ImprovedFile;)V: root-Branch
   * Goal 2. com.lts.io.ArchiveScanner.isArchive(Ljava/io/File;)Z: I19 Branch 1 IFNE L72 - true
   * Goal 3. com.lts.io.ArchiveScanner.isArchive(Ljava/io/File;)Z: I19 Branch 1 IFNE L72 - false
   * Goal 4. com.lts.io.ArchiveScanner.isArchive(Ljava/io/File;)Z: I26 Branch 2 IF_ICMPGE L72 - false
   * Goal 5. com.lts.io.ArchiveScanner.toFileType(Ljava/io/File;)I: I11 Branch 3 IFEQ L86 - true
   * Goal 6. com.lts.io.ArchiveScanner.toFileType(Ljava/io/File;)I: I28 Branch 4 IFEQ L88 - false
   */

  @Test
  public void test8()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("Eror oading classifier from jar file (mostllikely y9u are not runningthis code from a jar file or tPe ~amed classifier is not stordin te jar file)0Eror)lodng classifier from jar file (motSlikely you are not rnning this code Zrom a jar file or the named classifier i not sored 4n te jZr file).jaB");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      int int0 = archiveScanner0.toFileType((File) improvedFile0);
      //  // Unstable assertion: assertEquals(2, int0);
  }
}

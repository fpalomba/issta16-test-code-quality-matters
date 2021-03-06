/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 11 20:16:52 GMT 2015
 */

package com.lts.io;

import static org.junit.Assert.*;
import org.junit.Test;
import com.lts.io.ArchiveScanner;
import com.lts.io.ImprovedFile;
import edu.stanford.nlp.ling.StringLabel;
import edu.stanford.nlp.objectbank.ObjectBank;
import java.io.File;
import java.util.Vector;
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
   * Goal 1. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I11 Branch 17 IFNONNULL L179 - false
   */

  @Test
  public void test0()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("#qIar", "#qIar");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      try {
        archiveScanner0.scandir(improvedFile0, "#qIar", true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /Users/fabiopalomba/Documents/workspace/LunchEvosuite/#qIar/#qIar
         //
      }
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. com.lts.io.ArchiveScanner.processArchive(Ljava/io/File;Ljava/lang/String;)V: I27 Branch 16 IFEQ L165 - false
   */

  @Test
  public void test1()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("n*?%+adW8");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "n*?%+adW8";
      stringArray0[1] = "n*?%+adW8";
      archiveScanner0.setExcludes(stringArray0);
      archiveScanner0.setIncludes(stringArray0);
      MockFile mockFile0 = (MockFile)MockFile.createTempFile("n*?%+adW8", "n*?%+adW8", (File) improvedFile0);
      // Undeclared exception!
      try {
        archiveScanner0.scandir(improvedFile0, "n*?%+adW8", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 2
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
  public void test2()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("Mt|Ph");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "Mt|Ph";
      stringArray0[1] = "Mt|Ph";
      archiveScanner0.setIncludes(stringArray0);
      MockFile mockFile0 = (MockFile)MockFile.createTempFile("Mt|Ph", "Mt|Ph", (File) improvedFile0);
      // Undeclared exception!
      try {
        archiveScanner0.scandir(improvedFile0, "Mt|Ph", false);
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
   * Goal 1. com.lts.io.ArchiveScanner.processFile(Ljava/lang/String;)V: I27 Branch 13 IFEQ L133 - false
   */

  @Test
  public void test3()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[7];
      stringArray0[1] = "5au~;P? xda811)";
      stringArray0[2] = "5au~;P? xda811)";
      stringArray0[3] = "5au~;P? xda811)";
      stringArray0[4] = "5au~;P? xda811)";
      stringArray0[6] = "5au~;P? xda811)";
      stringArray0[0] = "5au~;P? xda811)";
      stringArray0[5] = "5au~;P? xda811)";
      archiveScanner0.setExcludes(stringArray0);
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try {
        archiveScanner0.processFile("5au~;P? xda811)");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * Goal 1. com.lts.io.ArchiveScanner.processFile(Ljava/lang/String;)V: I8 Branch 12 IFNE L131 - true
   * Goal 2. com.lts.io.ArchiveScanner.processFile(Ljava/lang/String;)V: I27 Branch 13 IFEQ L133 - true
   */

  @Test
  public void test4()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      archiveScanner0.addDefaultExcludes();
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try {
        archiveScanner0.processFile("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 5
  /*
   * 3 covered goals:
   * Goal 1. com.lts.io.ArchiveScanner.processDirectory(Ljava/io/File;Ljava/lang/String;Z)V: I8 Branch 6 IFEQ L101 - true
   * Goal 2. com.lts.io.ArchiveScanner.processDirectory(Ljava/io/File;Ljava/lang/String;Z)V: I71 Branch 9 IFEQ L116 - false
   * Goal 3. com.lts.io.ArchiveScanner.processDirectory(Ljava/io/File;Ljava/lang/String;Z)V: I78 Branch 10 IFEQ L116 - true
   */

  @Test
  public void test5()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("", "");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      Vector<StringLabel> vector0 = new Vector<StringLabel>();
      archiveScanner0.dirsNotIncluded = vector0;
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.scandir(improvedFile0, "", true);
      assertTrue(improvedFile0.isAbsolute());
  }

  //Test case number: 6
  /*
   * 6 covered goals:
   * Goal 1. com.lts.io.ArchiveScanner.processDirectory(Ljava/io/File;Ljava/lang/String;Z)V: I17 Branch 7 IFNE L103 - false
   * Goal 2. com.lts.io.ArchiveScanner.processDirectory(Ljava/io/File;Ljava/lang/String;Z)V: I30 Branch 8 IFEQ L105 - false
   * Goal 3. com.lts.io.ArchiveScanner.processDirectory(Ljava/io/File;Ljava/lang/String;Z)V: I99 Branch 11 IFNE L122 - true
   * Goal 4. com.lts.io.ArchiveScanner.processArchive(Ljava/io/File;Ljava/lang/String;)V: I8 Branch 15 IFNE L163 - true
   * Goal 5. com.lts.io.ArchiveScanner.processArchive(Ljava/io/File;Ljava/lang/String;)V: I27 Branch 16 IFEQ L165 - true
   * Goal 6. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I38 Branch 18 IF_ICMPGE L193 - true
   */

  @Test
  public void test6()  throws Throwable  {
      ObjectBank.PathToFileFunction objectBank_PathToFileFunction0 = new ObjectBank.PathToFileFunction();
      MockFile mockFile0 = (MockFile)objectBank_PathToFileFunction0.apply("BqYqbdJn,p?u6Dg");
      ImprovedFile improvedFile0 = ImprovedFile.createTempDirectory("BqYqbdJn,p?u6Dg", "BqYqbdJn,p?u6Dg", (File) mockFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.setBasedir("BqYqbdJn,p?u6Dg");
      archiveScanner0.scan();
      try {
        archiveScanner0.processArchive((File) improvedFile0, "BqYqbdJn,p?u6Dg");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error trying to list archive, /Users/fabiopalomba/Documents/workspace/LunchEvosuite/BqYqbdJn,p?u6Dg/BqYqbdJn,p?u6Dg0BqYqbdJn,p?u6Dg
         //
      }
  }

  //Test case number: 7
  /*
   * 10 covered goals:
   * Goal 1. com.lts.io.ArchiveScanner.<init>(Lcom/lts/io/ImprovedFile;)V: root-Branch
   * Goal 2. com.lts.io.ArchiveScanner.toFileType(Ljava/io/File;)I: I11 Branch 3 IFEQ L86 - false
   * Goal 3. com.lts.io.ArchiveScanner.processDirectory(Ljava/io/File;Ljava/lang/String;Z)V: I8 Branch 6 IFEQ L101 - false
   * Goal 4. com.lts.io.ArchiveScanner.processDirectory(Ljava/io/File;Ljava/lang/String;Z)V: I17 Branch 7 IFNE L103 - true
   * Goal 5. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I11 Branch 17 IFNONNULL L179 - true
   * Goal 6. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I38 Branch 18 IF_ICMPGE L193 - false
   * Goal 7. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 19 TABLESWITCH L198 Case 0 - false
   * Goal 8. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 20 TABLESWITCH L198 Case 1 - true
   * Goal 9. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 21 TABLESWITCH L198 Case 2 - false
   * Goal 10. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 22 TABLESWITCH L198 Default-Case - false
   */

  @Test
  public void test7()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("n*?%+adW8");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "n*?%+adW8";
      stringArray0[1] = "n*?%+adW8";
      archiveScanner0.setExcludes(stringArray0);
      archiveScanner0.setIncludes(stringArray0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/Users/fabiopalomba/Documents/workspace/LunchEvosuite/n*?%+adW8/n*?%+adW80n*?%+adW8");
      boolean boolean0 = FileSystemHandling.createFolder(evoSuiteFile0);
      // Undeclared exception!
      try {
        archiveScanner0.scandir(improvedFile0, "n*?%+adW8", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}

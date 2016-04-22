/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 11 20:05:27 GMT 2015
 */

package com.lts.io;

import static org.junit.Assert.*;
import org.junit.Test;
import com.lts.io.ArchiveScanner;
import com.lts.io.ImprovedFile;
import edu.stanford.nlp.ling.WordTag;
import java.io.File;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
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
      ImprovedFile improvedFile0 = new ImprovedFile("WkEDzdBc IdX}J/29");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      boolean boolean0 = improvedFile0.mkdirs();
      archiveScanner0.scandir(improvedFile0, "WkEDzdBc IdX}J/29", true);
      assertEquals(0L, improvedFile0.length());
  }

  //Test case number: 1
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
  public void test1()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("#5I_");
      MockFile mockFile0 = (MockFile)MockFile.createTempFile("#5I_", ".ear", (File) improvedFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "#5I_";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try {
        archiveScanner0.scandir(improvedFile0, ".ear", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
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
      ImprovedFile improvedFile0 = new ImprovedFile("ocur", "ocur");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "ocur";
      stringArray0[1] = "ocur";
      archiveScanner0.excludes = stringArray0;
      stringArray0[2] = "ocur";
      stringArray0[3] = "ocur";
      stringArray0[4] = "ocur";
      stringArray0[5] = "ocur";
      stringArray0[6] = "ocur";
      stringArray0[7] = "ocur";
      stringArray0[8] = "ocur";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try {
        archiveScanner0.processFile("ocur");
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
      ImprovedFile improvedFile0 = new ImprovedFile("ocur", "ocur");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.addDefaultExcludes();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "ocur";
      stringArray0[1] = "ocur";
      stringArray0[2] = "ocur";
      stringArray0[3] = "ocur";
      stringArray0[4] = "ocur";
      stringArray0[5] = "ocur";
      stringArray0[6] = "ocur";
      stringArray0[7] = "ocur";
      stringArray0[8] = "ocur";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try {
        archiveScanner0.processFile("ocur");
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
   * Goal 1. com.lts.io.ArchiveScanner.processDirectory(Ljava/io/File;Ljava/lang/String;Z)V: I99 Branch 11 IFNE L122 - false
   * Goal 2. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I11 Branch 17 IFNONNULL L179 - false
   */

  @Test
  public void test4()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("]De);\"7:Zq;Iml;0l2W");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      Vector<WordTag> vector0 = new Vector<WordTag>();
      archiveScanner0.dirsExcluded = vector0;
      String[] stringArray0 = new String[1];
      stringArray0[0] = "]De);\"7:Zq;Iml;0l2W";
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.excludes = stringArray0;
      try {
        archiveScanner0.processDirectory((File) improvedFile0, "]De);\"7:Zq;Iml;0l2W", false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /Users/fabiopalomba/Documents/workspace/LunchEvosuite/]De);\"7:Zq;Iml;0l2W
         //
      }
  }

  //Test case number: 5
  /*
   * 3 covered goals:
   * Goal 1. com.lts.io.ArchiveScanner.processDirectory(Ljava/io/File;Ljava/lang/String;Z)V: I8 Branch 6 IFEQ L101 - false
   * Goal 2. com.lts.io.ArchiveScanner.processDirectory(Ljava/io/File;Ljava/lang/String;Z)V: I17 Branch 7 IFNE L103 - true
   * Goal 3. com.lts.io.ArchiveScanner.processDirectory(Ljava/io/File;Ljava/lang/String;Z)V: I99 Branch 11 IFNE L122 - true
   */

  @Test
  public void test5()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("]De;\"7:Zq;Iml;0l2W");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      Vector<WordTag> vector0 = new Vector<WordTag>();
      archiveScanner0.dirsExcluded = vector0;
      String[] stringArray0 = new String[1];
      stringArray0[0] = "]De;\"7:Zq;Iml;0l2W";
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.excludes = stringArray0;
      archiveScanner0.processDirectory((File) improvedFile0, "]De;\"7:Zq;Iml;0l2W", true);
      assertEquals(0L, improvedFile0.lastModified());
  }

  //Test case number: 6
  /*
   * 8 covered goals:
   * Goal 1. com.lts.io.ArchiveScanner.<init>(Lcom/lts/io/ImprovedFile;)V: root-Branch
   * Goal 2. com.lts.io.ArchiveScanner.toFileType(Ljava/io/File;)I: I11 Branch 3 IFEQ L86 - false
   * Goal 3. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I11 Branch 17 IFNONNULL L179 - true
   * Goal 4. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I38 Branch 18 IF_ICMPGE L193 - false
   * Goal 5. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 19 TABLESWITCH L198 Case 0 - false
   * Goal 6. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 20 TABLESWITCH L198 Case 1 - true
   * Goal 7. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 21 TABLESWITCH L198 Case 2 - false
   * Goal 8. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 22 TABLESWITCH L198 Default-Case - false
   */

  @Test
  public void test6()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("7BWYTJ");
      ImprovedFile improvedFile1 = improvedFile0.createTempDir();
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile1);
      // Undeclared exception!
      try {
        archiveScanner0.scandir(improvedFile0, "7BWYTJ", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}

/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 11 17:19:54 GMT 2015
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
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ArchiveScanner_ESTest extends ArchiveScanner_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. com.lts.io.ArchiveScanner.processFile(Ljava/lang/String;)V: I27 Branch 13 IFEQ L133 - false
   */

  @Test
  public void test00()  throws Throwable  {
      MockFile mockFile0 = new MockFile(".wan", ".wan");
      ImprovedFile improvedFile0 = ImprovedFile.createTempImprovedFile(".wan", ".wan", (File) mockFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[5];
      stringArray0[0] = ".wan";
      stringArray0[1] = ".wan";
      stringArray0[2] = ".wan";
      stringArray0[3] = ".wan";
      stringArray0[4] = ".wan";
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.setExcludes(stringArray0);
      // Undeclared exception!
      try {
        archiveScanner0.processFile(".wan");
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
   * Goal 1. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I11 Branch 17 IFNONNULL L179 - false
   */

  @Test
  public void test01()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("wlenZZj/si");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      try {
        archiveScanner0.scandir(improvedFile0, "wlenZZj/si", false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /Users/fabiopalomba/Documents/workspace/LunchEvosuite/wlenZZj/si
         //
      }
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. com.lts.io.ArchiveScanner.processFile(Ljava/lang/String;)V: I8 Branch 12 IFNE L131 - false
   */

  @Test
  public void test02()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("Adiing newz.jar");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "Adiing newz.jar";
      stringArray0[1] = "Adiing newz.jar";
      stringArray0[2] = "Adiing newz.jar";
      stringArray0[3] = "Adiing newz.jar";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try {
        archiveScanner0.processFile(".WAR");
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
   * Goal 1. com.lts.io.ArchiveScanner.processDirectory(Ljava/io/File;Ljava/lang/String;Z)V: I17 Branch 7 IFNE L103 - false
   */

  @Test
  public void test03()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("d\r1");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "wlenZZj/si";
      archiveScanner0.setIncludes(stringArray0);
      boolean boolean0 = archiveScanner0.isArchive((File) improvedFile0);
      String[] stringArray1 = new String[1];
      stringArray1[0] = "d\r1";
      archiveScanner0.setExcludes(stringArray1);
      // Undeclared exception!
      try {
        archiveScanner0.processDirectory((File) improvedFile0, "wlenZZj/si", true);
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
   * Goal 1. com.lts.io.ArchiveScanner.processArchive(Ljava/io/File;Ljava/lang/String;)V: I8 Branch 15 IFNE L163 - false
   */

  @Test
  public void test04()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("Adiing newz.jar");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "Adiing newz.jar";
      stringArray0[1] = "Adiing newz.jar";
      stringArray0[2] = "Adiing newz.jar";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try {
        archiveScanner0.processArchive((File) improvedFile0, "edu.stanforU.nlp.util.Pair");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 5
  /*
   * 4 covered goals:
   * Goal 1. com.lts.io.ArchiveScanner.toFileType(Ljava/io/File;)I: I11 Branch 3 IFEQ L86 - true
   * Goal 2. com.lts.io.ArchiveScanner.toFileType(Ljava/io/File;)I: I28 Branch 4 IFEQ L88 - false
   * Goal 3. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 20 TABLESWITCH L198 Case 1 - false
   * Goal 4. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 21 TABLESWITCH L198 Case 2 - true
   */

  @Test
  public void test05()  throws Throwable  {
      MockFile mockFile0 = new MockFile(".w]", ".w]");
      ImprovedFile improvedFile0 = ImprovedFile.createTempImprovedFile(".w]", ".w]", (File) mockFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      // Undeclared exception!
      try {
        archiveScanner0.scandir(mockFile0, ".w]", true);
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
   * Goal 1. com.lts.io.ArchiveScanner.toFileType(Ljava/io/File;)I: I11 Branch 3 IFEQ L86 - false
   * Goal 2. com.lts.io.ArchiveScanner.processDirectory(Ljava/io/File;Ljava/lang/String;Z)V: I8 Branch 6 IFEQ L101 - true
   * Goal 3. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I38 Branch 18 IF_ICMPGE L193 - false
   * Goal 4. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 19 TABLESWITCH L198 Case 0 - false
   * Goal 5. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 20 TABLESWITCH L198 Case 1 - true
   * Goal 6. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 21 TABLESWITCH L198 Case 2 - false
   * Goal 7. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 22 TABLESWITCH L198 Default-Case - false
   */

  @Test
  public void test06()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("HS.1pKvY^");
      ImprovedFile improvedFile1 = ImprovedFile.createTempDirectory("HS.1pKvY^", "HS.1pKvY^", (File) improvedFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "HS.1pKvY^";
      stringArray0[1] = "HS.1pKvY^";
      stringArray0[2] = "HS.1pKvY^";
      stringArray0[3] = "HS.1pKvY^";
      stringArray0[4] = "HS.1pKvY^";
      stringArray0[5] = "HS.1pKvY^";
      stringArray0[6] = "HS.1pKvY^";
      stringArray0[7] = "HS.1pKvY^";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try {
        archiveScanner0.scandir(improvedFile0, "HS.1pKvY^", false);
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
      ImprovedFile improvedFile0 = new ImprovedFile("HSpKY^");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "HSpKY^";
      stringArray0[1] = "HSpKY^";
      stringArray0[2] = "HSpKY^";
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.setExcludes(stringArray0);
      // Undeclared exception!
      try {
        archiveScanner0.processDirectory((File) improvedFile0, "HSpKY^", true);
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
   * Goal 1. com.lts.io.ArchiveScanner.processArchive(Ljava/io/File;Ljava/lang/String;)V: I8 Branch 15 IFNE L163 - true
   * Goal 2. com.lts.io.ArchiveScanner.processArchive(Ljava/io/File;Ljava/lang/String;)V: I27 Branch 16 IFEQ L165 - false
   */

  @Test
  public void test08()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("{gDnZZj/sG");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "{gDnZZj/sG";
      stringArray0[1] = "{gDnZZj/sG";
      stringArray0[2] = "{gDnZZj/sG";
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.setExcludes(stringArray0);
      // Undeclared exception!
      try {
        archiveScanner0.processArchive((File) improvedFile0, "{gDnZZj/sG");
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
   * Goal 1. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I11 Branch 17 IFNONNULL L179 - true
   * Goal 2. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I38 Branch 18 IF_ICMPGE L193 - true
   */

  @Test
  public void test09()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("HS.1pKvY^");
      ImprovedFile improvedFile1 = ImprovedFile.createTempDirectory("HS.1pKvY^", "HS.1pKvY^", (File) improvedFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.scandir(improvedFile1, "HS.1pKvY^", false);
      assertNotSame(improvedFile0, improvedFile1);
  }

  //Test case number: 10
  /*
   * 6 covered goals:
   * Goal 1. com.lts.io.ArchiveScanner.<init>(Lcom/lts/io/ImprovedFile;)V: root-Branch
   * Goal 2. com.lts.io.ArchiveScanner.isArchive(Ljava/io/File;)Z: I19 Branch 1 IFNE L72 - true
   * Goal 3. com.lts.io.ArchiveScanner.isArchive(Ljava/io/File;)Z: I19 Branch 1 IFNE L72 - false
   * Goal 4. com.lts.io.ArchiveScanner.isArchive(Ljava/io/File;)Z: I26 Branch 2 IF_ICMPGE L72 - false
   * Goal 5. com.lts.io.ArchiveScanner.processFile(Ljava/lang/String;)V: I8 Branch 12 IFNE L131 - true
   * Goal 6. com.lts.io.ArchiveScanner.processFile(Ljava/lang/String;)V: I27 Branch 13 IFEQ L133 - true
   */

  @Test
  public void test10()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("wlenZZj/si");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = " RESULTS          .jar";
      archiveScanner0.setIncludes(stringArray0);
      boolean boolean0 = archiveScanner0.isArchive((File) improvedFile0);
      String[] stringArray1 = new String[1];
      stringArray1[0] = "wlenZZj/si";
      archiveScanner0.setExcludes(stringArray1);
      // Undeclared exception!
      try {
        archiveScanner0.processFile(" RESULTS          .jar");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
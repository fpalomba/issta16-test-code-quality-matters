/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 11 19:35:32 GMT 2015
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
   * Goal 1. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I38 Branch 18 IF_ICMPGE L193 - true
   */

  @Test
  public void test0()  throws Throwable  {
      MockFile mockFile0 = new MockFile("IO error sanning dirctory ", "IO error sanning dirctory ");
      ImprovedFile improvedFile0 = new ImprovedFile((File) mockFile0);
      ImprovedFile improvedFile1 = improvedFile0.createTempDir("IO error sanning dirctory ", "IO error sanning dirctory ");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile1);
      archiveScanner0.scandir(improvedFile1, "IO error sanning dirctory ", true);
      assertEquals(0L, improvedFile1.getFreeSpace());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I11 Branch 17 IFNONNULL L179 - false
   */

  @Test
  public void test1()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile(".war");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      try {
        archiveScanner0.scandir(improvedFile0, ".war", false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /Users/fabiopalomba/Documents/workspace/LunchEvosuite/.war
         //
      }
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. com.lts.io.ArchiveScanner.processArchive(Ljava/io/File;Ljava/lang/String;)V: I27 Branch 16 IFEQ L165 - false
   */

  @Test
  public void test2()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("*$=1cZ9G.jarj@r", "*$=1cZ9G.jarj@r");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "*$=1cZ9G.jarj@r";
      stringArray0[1] = "phraseGazettes";
      stringArray0[2] = "phraseGazettes";
      stringArray0[3] = "phraseGazettes";
      stringArray0[4] = "*$=1cZ9G.jarj@r";
      stringArray0[5] = "phraseGazettes";
      stringArray0[6] = "phraseGazettes";
      stringArray0[7] = "*$=1cZ9G.jarj@r";
      archiveScanner0.setExcludes(stringArray0);
      MockFile mockFile0 = (MockFile)MockFile.createTempFile("phraseGazettes", "*$=1cZ9G.jarj@r", (File) improvedFile0);
      archiveScanner0.includes = stringArray0;
      // Undeclared exception!
      try {
        archiveScanner0.scandir(improvedFile0, "phraseGazettes", false);
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
   * Goal 1. com.lts.io.ArchiveScanner.processArchive(Ljava/io/File;Ljava/lang/String;)V: I8 Branch 15 IFNE L163 - true
   * Goal 2. com.lts.io.ArchiveScanner.processArchive(Ljava/io/File;Ljava/lang/String;)V: I27 Branch 16 IFEQ L165 - true
   */

  @Test
  public void test3()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("*$=1rcL&!OG");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[16];
      stringArray0[0] = "*$=1rcL&!OG";
      archiveScanner0.includes = stringArray0;
      archiveScanner0.addDefaultExcludes();
      // Undeclared exception!
      try {
        archiveScanner0.processArchive((File) improvedFile0, "*$=1rcL&!OG");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 4
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
  public void test4()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("+WH(t{5<r!|t", "+WH(t{5<r!|t");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "+WH(t{5<r!|t";
      stringArray0[1] = "+WH(t{5<r!|t";
      MockFile mockFile0 = (MockFile)MockFile.createTempFile("+WH(t{5<r!|t", "+WH(t{5<r!|t", (File) improvedFile0);
      stringArray0[2] = "+WH(t{5<r!|t";
      stringArray0[3] = "+WH(t{5<r!|t";
      stringArray0[4] = "+WH(t{5<r!|t";
      archiveScanner0.includes = stringArray0;
      // Undeclared exception!
      try {
        archiveScanner0.scandir(improvedFile0, "+WH(t{5<r!|t", false);
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
      ImprovedFile improvedFile0 = new ImprovedFile("*$=1rcL&!OG");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "*$=1rcL&!OG";
      archiveScanner0.includes = stringArray0;
      archiveScanner0.addDefaultExcludes();
      // Undeclared exception!
      try {
        archiveScanner0.processFile("*$=1rcL&!OG");
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
   * Goal 1. com.lts.io.ArchiveScanner.processDirectory(Ljava/io/File;Ljava/lang/String;Z)V: I17 Branch 7 IFNE L103 - false
   */

  @Test
  public void test6()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile(">9|", ">9|");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "*$=1cZ9ZG.jar.jar";
      archiveScanner0.addDefaultExcludes();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/Users/fabiopalomba/Documents/workspace/LunchEvosuite/>9|/>9|/t'6g#C,0*$=1cZ9ZG.jar.jar");
      boolean boolean0 = FileSystemHandling.createFolder(evoSuiteFile0);
      archiveScanner0.includes = stringArray0;
      // Undeclared exception!
      try {
        archiveScanner0.scandir(improvedFile0, ">9|", true);
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
  public void test7()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile(">9|", ">9|");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "*$=1cZ9ZG.jar.jar";
      stringArray0[1] = ">9|";
      stringArray0[2] = "lxjj<Z:8XYR2Rzh";
      stringArray0[3] = "lxjj<Z:8XYR2Rzh";
      stringArray0[4] = "*$=1cZ9ZG.jar.jar";
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/Users/fabiopalomba/Documents/workspace/LunchEvosuite/>9|/>9|/t'6g#C,0*$=1cZ9ZG.jar.jar");
      boolean boolean0 = FileSystemHandling.createFolder(evoSuiteFile0);
      stringArray0[5] = "lxjj<Z:8XYR2Rzh";
      stringArray0[6] = "lxjj<Z:8XYR2Rzh";
      stringArray0[7] = "*$=1cZ9ZG.jar.jar";
      archiveScanner0.setExcludes(stringArray0);
      archiveScanner0.includes = stringArray0;
      // Undeclared exception!
      try {
        archiveScanner0.scandir(improvedFile0, ">9|", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 8
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
  public void test8()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("*$=1cZ9G.jarj@r0*$=1cZ9G.jarj@r.jar", "*$=1cZ9G.jarj@r0*$=1cZ9G.jarj@r.jar");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "*$=1cZ9G.jarj@r0*$=1cZ9G.jarj@r.jar";
      ImprovedFile improvedFile1 = improvedFile0.createTempDir();
      stringArray0[1] = "*$=1cZ9G.jarj@r0*$=1cZ9G.jarj@r.jar";
      stringArray0[2] = "*$=1cZ9G.jarj@r0*$=1cZ9G.jarj@r.jar";
      stringArray0[3] = "*$=1cZ9G.jarj@r0*$=1cZ9G.jarj@r.jar";
      stringArray0[4] = "*$=1cZ9G.jarj@r0*$=1cZ9G.jarj@r.jar";
      stringArray0[5] = "*$=1cZ9G.jarj@r0*$=1cZ9G.jarj@r.jar";
      stringArray0[6] = "*$=1cZ9G.jarj@r0*$=1cZ9G.jarj@r.jar";
      stringArray0[7] = "*$=1cZ9G.jarj@r0*$=1cZ9G.jarj@r.jar";
      archiveScanner0.includes = stringArray0;
      // Undeclared exception!
      try {
        archiveScanner0.scandir(improvedFile0, "*$=1cZ9G.jarj@r0*$=1cZ9G.jarj@r.jar", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}

/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 11 18:50:06 GMT 2015
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
   * Goal 1. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I11 Branch 17 IFNONNULL L179 - false
   */

  @Test
  public void test0()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile(".ZIP.jar", "rab");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      try {
        archiveScanner0.scandir(improvedFile0, "rab", true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /Users/fabiopalomba/Documents/workspace/LunchEvosuite/.ZIP.jar/rab
         //
      }
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. com.lts.io.ArchiveScanner.processDirectory(Ljava/io/File;Ljava/lang/String;Z)V: I71 Branch 9 IFEQ L116 - true
   * Goal 2. com.lts.io.ArchiveScanner.processArchive(Ljava/io/File;Ljava/lang/String;)V: I8 Branch 15 IFNE L163 - false
   */

  @Test
  public void test1()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("&", ",]");
      ImprovedFile improvedFile1 = ImprovedFile.createTempImprovedFile("alignmentDecodeThreshold", "alignmentDecodeThreshold", (File) improvedFile0);
      ImprovedFile improvedFile2 = ImprovedFile.createTempDirectory("~YRVZ-jzYWld`W", "\"`UH", (File) improvedFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile1);
      archiveScanner0.setBasedir((File) improvedFile2);
      archiveScanner0.scan();
      archiveScanner0.scandir(improvedFile0, "/", false);
      assertNotSame(improvedFile0, improvedFile1);
  }

  //Test case number: 2
  /*
   * 9 covered goals:
   * Goal 1. com.lts.io.ArchiveScanner.isArchive(Ljava/io/File;)Z: I19 Branch 1 IFNE L72 - true
   * Goal 2. com.lts.io.ArchiveScanner.isArchive(Ljava/io/File;)Z: I19 Branch 1 IFNE L72 - false
   * Goal 3. com.lts.io.ArchiveScanner.isArchive(Ljava/io/File;)Z: I26 Branch 2 IF_ICMPGE L72 - false
   * Goal 4. com.lts.io.ArchiveScanner.toFileType(Ljava/io/File;)I: I11 Branch 3 IFEQ L86 - true
   * Goal 5. com.lts.io.ArchiveScanner.toFileType(Ljava/io/File;)I: I28 Branch 4 IFEQ L88 - false
   * Goal 6. com.lts.io.ArchiveScanner.processArchive(Ljava/io/File;Ljava/lang/String;)V: I8 Branch 15 IFNE L163 - true
   * Goal 7. com.lts.io.ArchiveScanner.processArchive(Ljava/io/File;Ljava/lang/String;)V: I27 Branch 16 IFEQ L165 - true
   * Goal 8. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 20 TABLESWITCH L198 Case 1 - false
   * Goal 9. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 21 TABLESWITCH L198 Case 2 - true
   */

  @Test
  public void test2()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("&", "@7");
      ImprovedFile improvedFile1 = ImprovedFile.createTempImprovedFile("alignmentDecodeThreshold", "alignmentDecodeThreshold", (File) improvedFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.setBasedir((File) improvedFile0);
      try {
        archiveScanner0.scan();
       //  fail("Expecting exception: Exception");
       // Unstable assertion
      } catch(Exception e) {
         //
         // Error trying to list archive, &/@7/alignmentDecodeThreshold0alignmentDecodeThreshold
         //
      }
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. com.lts.io.ArchiveScanner.processFile(Ljava/lang/String;)V: I8 Branch 12 IFNE L131 - false
   */

  @Test
  public void test3()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "CA  ;#j.";
      stringArray0[1] = ".ZIP";
      stringArray0[2] = "theatre";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try {
        archiveScanner0.processFile(".ear");
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
      ImprovedFile improvedFile0 = new ImprovedFile("&", "rab");
      ImprovedFile improvedFile1 = improvedFile0.createTempDir();
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile1);
      archiveScanner0.setBasedir((File) improvedFile0);
      archiveScanner0.scan();
      archiveScanner0.processFile("M|%F&g{S Cq.jr");
      assertEquals(2, archiveScanner0.ARCHIVE);
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
      ImprovedFile improvedFile0 = new ImprovedFile("&", "analyzed");
      ImprovedFile improvedFile1 = improvedFile0.createTempDir();
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile1);
      archiveScanner0.setBasedir((File) improvedFile0);
      archiveScanner0.scan();
      archiveScanner0.scandir(improvedFile0, "/", true);
      assertEquals("analyzed", improvedFile0.getName());
  }

  //Test case number: 6
  /*
   * 15 covered goals:
   * Goal 1. com.lts.io.ArchiveScanner.<init>(Lcom/lts/io/ImprovedFile;)V: root-Branch
   * Goal 2. com.lts.io.ArchiveScanner.toFileType(Ljava/io/File;)I: I11 Branch 3 IFEQ L86 - false
   * Goal 3. com.lts.io.ArchiveScanner.processDirectory(Ljava/io/File;Ljava/lang/String;Z)V: I8 Branch 6 IFEQ L101 - false
   * Goal 4. com.lts.io.ArchiveScanner.processDirectory(Ljava/io/File;Ljava/lang/String;Z)V: I17 Branch 7 IFNE L103 - false
   * Goal 5. com.lts.io.ArchiveScanner.processDirectory(Ljava/io/File;Ljava/lang/String;Z)V: I30 Branch 8 IFEQ L105 - true
   * Goal 6. com.lts.io.ArchiveScanner.processDirectory(Ljava/io/File;Ljava/lang/String;Z)V: I30 Branch 8 IFEQ L105 - false
   * Goal 7. com.lts.io.ArchiveScanner.processDirectory(Ljava/io/File;Ljava/lang/String;Z)V: I99 Branch 11 IFNE L122 - true
   * Goal 8. com.lts.io.ArchiveScanner.processDirectory(Ljava/io/File;Ljava/lang/String;Z)V: I99 Branch 11 IFNE L122 - false
   * Goal 9. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I11 Branch 17 IFNONNULL L179 - true
   * Goal 10. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I38 Branch 18 IF_ICMPGE L193 - true
   * Goal 11. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I38 Branch 18 IF_ICMPGE L193 - false
   * Goal 12. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 19 TABLESWITCH L198 Case 0 - false
   * Goal 13. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 20 TABLESWITCH L198 Case 1 - true
   * Goal 14. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 21 TABLESWITCH L198 Case 2 - false
   * Goal 15. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 22 TABLESWITCH L198 Default-Case - false
   */

  @Test
  public void test6()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("&", "rab");
      ImprovedFile improvedFile1 = improvedFile0.createTempDir("underlet", "M|9%F&gC{S =q.jar");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile1);
      archiveScanner0.setBasedir((File) improvedFile0);
      archiveScanner0.scan();
      archiveScanner0.scandir(improvedFile0, "~YRVZ-jzYWld`W", false);
      assertEquals("rab", improvedFile0.getName());
  }
}

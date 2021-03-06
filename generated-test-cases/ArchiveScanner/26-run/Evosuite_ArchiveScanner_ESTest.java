/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 11 20:28:09 GMT 2015
 */

package com.lts.io;

import static org.junit.Assert.*;
import org.junit.Test;
import com.lts.io.ArchiveScanner;
import com.lts.io.ImprovedFile;
import edu.stanford.nlp.ling.TaggedWord;
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
  public void test0()  throws Throwable  {
      MockFile mockFile0 = new MockFile("zfQ", "zfQ");
      ImprovedFile improvedFile0 = new ImprovedFile((File) mockFile0);
      ImprovedFile improvedFile1 = ImprovedFile.createTempImprovedFile("zfQ", "zfQ", (File) mockFile0);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "zfQ";
      stringArray0[1] = "zfQ";
      stringArray0[2] = "zfQ";
      stringArray0[3] = "zfQ";
      stringArray0[4] = "zfQ";
      stringArray0[5] = "zfQ";
      stringArray0[6] = "zfQ";
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.includes = stringArray0;
      Vector<TaggedWord> vector0 = new Vector<TaggedWord>();
      archiveScanner0.dirsNotIncluded = vector0;
      // Undeclared exception!
      try {
        archiveScanner0.processDirectory((File) mockFile0, "&zahyvU,w ", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. com.lts.io.ArchiveScanner.processArchive(Ljava/io/File;Ljava/lang/String;)V: I8 Branch 15 IFNE L163 - true
   * Goal 2. com.lts.io.ArchiveScanner.processArchive(Ljava/io/File;Ljava/lang/String;)V: I27 Branch 16 IFEQ L165 - false
   */

  @Test
  public void test1()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "|";
      archiveScanner0.excludes = stringArray0;
      archiveScanner0.includes = archiveScanner0.excludes;
      // Undeclared exception!
      try {
        archiveScanner0.processArchive((File) null, "|");
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
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "m";
      stringArray0[1] = "9r3@l";
      stringArray0[2] = "eoJq7fE0B{cPU";
      stringArray0[3] = "eoJq7fE0B{cPU";
      stringArray0[4] = "eoJq7fE0B{cPU";
      stringArray0[5] = "eoJq7fE0B{cPU";
      archiveScanner0.excludes = stringArray0;
      stringArray0[6] = "m";
      stringArray0[7] = "m";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try {
        archiveScanner0.processFile("eoJq7fE0B{cPU");
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
      String[] stringArray0 = new String[8];
      archiveScanner0.addDefaultExcludes();
      stringArray0[0] = "m";
      stringArray0[1] = "9r3@l";
      stringArray0[2] = "eoJq7fE0B{cPU";
      stringArray0[3] = "eoJq7fE0B{cPU";
      stringArray0[4] = "eoJq7fE0B{cPU";
      stringArray0[5] = "eoJq7fE0B{cPU";
      stringArray0[6] = "m";
      stringArray0[7] = "m";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try {
        archiveScanner0.processFile("eoJq7fE0B{cPU");
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
      String[] stringArray0 = new String[8];
      stringArray0[0] = "Fq6";
      stringArray0[1] = "Fq6";
      stringArray0[2] = "Fq6";
      stringArray0[3] = "Fq6";
      stringArray0[4] = "Fq6";
      stringArray0[5] = "Fq6";
      stringArray0[6] = "Fq6";
      stringArray0[7] = "Fq6";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try {
        archiveScanner0.processFile("*nIkYXp%'");
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
   * Goal 1. com.lts.io.ArchiveScanner.processDirectory(Ljava/io/File;Ljava/lang/String;Z)V: I71 Branch 9 IFEQ L116 - false
   * Goal 2. com.lts.io.ArchiveScanner.processDirectory(Ljava/io/File;Ljava/lang/String;Z)V: I78 Branch 10 IFEQ L116 - true
   * Goal 3. com.lts.io.ArchiveScanner.processDirectory(Ljava/io/File;Ljava/lang/String;Z)V: I99 Branch 11 IFNE L122 - true
   */

  @Test
  public void test5()  throws Throwable  {
      MockFile mockFile0 = new MockFile("zfQ", "zfQ");
      ImprovedFile improvedFile0 = new ImprovedFile((File) mockFile0);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "zfQ";
      stringArray0[1] = "zfQ";
      stringArray0[2] = "zfQ";
      stringArray0[3] = "zfQ";
      stringArray0[4] = "zfQ";
      stringArray0[5] = "zfQ";
      stringArray0[6] = "zfQ";
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.includes = stringArray0;
      Vector<TaggedWord> vector0 = new Vector<TaggedWord>();
      archiveScanner0.dirsNotIncluded = vector0;
      archiveScanner0.processDirectory((File) mockFile0, "#}B.n+&zKxcDWL\"uB ", true);
      assertEquals(0L, mockFile0.getUsableSpace());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. com.lts.io.ArchiveScanner.processDirectory(Ljava/io/File;Ljava/lang/String;Z)V: I17 Branch 7 IFNE L103 - false
   */

  @Test
  public void test6()  throws Throwable  {
      MockFile mockFile0 = new MockFile("zfQ", "zfQ");
      ImprovedFile improvedFile0 = new ImprovedFile((File) mockFile0);
      String[] stringArray0 = new String[12];
      stringArray0[0] = "zfQ";
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.includes = stringArray0;
      archiveScanner0.addDefaultExcludes();
      // Undeclared exception!
      try {
        archiveScanner0.processDirectory((File) mockFile0, "zfQ", false);
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
      MockFile mockFile0 = new MockFile("TfQ", "TfQ");
      ImprovedFile improvedFile0 = new ImprovedFile((File) mockFile0);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "TfQ";
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.excludes = stringArray0;
      archiveScanner0.includes = stringArray0;
      // Undeclared exception!
      try {
        archiveScanner0.processDirectory((File) mockFile0, "TfQ", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 8
  /*
   * 11 covered goals:
   * Goal 1. com.lts.io.ArchiveScanner.toFileType(Ljava/io/File;)I: I11 Branch 3 IFEQ L86 - false
   * Goal 2. com.lts.io.ArchiveScanner.processDirectory(Ljava/io/File;Ljava/lang/String;Z)V: I8 Branch 6 IFEQ L101 - true
   * Goal 3. com.lts.io.ArchiveScanner.processDirectory(Ljava/io/File;Ljava/lang/String;Z)V: I71 Branch 9 IFEQ L116 - true
   * Goal 4. com.lts.io.ArchiveScanner.processDirectory(Ljava/io/File;Ljava/lang/String;Z)V: I99 Branch 11 IFNE L122 - false
   * Goal 5. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I11 Branch 17 IFNONNULL L179 - true
   * Goal 6. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I38 Branch 18 IF_ICMPGE L193 - true
   * Goal 7. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I38 Branch 18 IF_ICMPGE L193 - false
   * Goal 8. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 19 TABLESWITCH L198 Case 0 - false
   * Goal 9. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 20 TABLESWITCH L198 Case 1 - true
   * Goal 10. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 21 TABLESWITCH L198 Case 2 - false
   * Goal 11. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 22 TABLESWITCH L198 Default-Case - false
   */

  @Test
  public void test8()  throws Throwable  {
      MockFile mockFile0 = new MockFile("zfQ", "zfQ");
      ImprovedFile improvedFile0 = new ImprovedFile((File) mockFile0);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "zfQ";
      stringArray0[1] = "zfQ";
      stringArray0[2] = "zfQ";
      stringArray0[3] = "zfQ";
      stringArray0[4] = "zfQ";
      stringArray0[5] = "zfQ";
      stringArray0[6] = "zfQ";
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.includes = stringArray0;
      Vector<TaggedWord> vector0 = new Vector<TaggedWord>();
      archiveScanner0.dirsNotIncluded = vector0;
      ImprovedFile improvedFile1 = improvedFile0.createTempDir();
      archiveScanner0.processDirectory((File) mockFile0, "#}B.n+&zKxcDWL\"uB ", false);
      assertEquals(0L, mockFile0.getTotalSpace());
  }

  //Test case number: 9
  /*
   * 2 covered goals:
   * Goal 1. com.lts.io.ArchiveScanner.<init>(Lcom/lts/io/ImprovedFile;)V: root-Branch
   * Goal 2. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I11 Branch 17 IFNONNULL L179 - false
   */

  @Test
  public void test9()  throws Throwable  {
      ImprovedFile improvedFile0 = ImprovedFile.createTempImprovedFile("Z-7ysx", "Z-7ysx", (File) null);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      try {
        archiveScanner0.scandir(improvedFile0, "Z-7ysx", true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /var/folders/ff/jvqmt14176q7vr5d_h1h729c0000gn/T/Z-7ysx0Z-7ysx
         //
      }
  }
}

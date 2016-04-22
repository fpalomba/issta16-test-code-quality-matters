/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 11 17:15:21 GMT 2015
 */

package com.lts.io;

import static org.junit.Assert.*;
import org.junit.Test;
import com.lts.io.ArchiveScanner;
import com.lts.io.DirectoryScanner;
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
   * Goal 1. com.lts.io.ArchiveScanner.processDirectory(Ljava/io/File;Ljava/lang/String;Z)V: I8 Branch 6 IFEQ L101 - true
   */

  @Test
  public void test00()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[1];
      boolean boolean0 = DirectoryScanner.matchPatternStart("Untokeiz!ble: ?s (U+%s, e$mal: %s) - thcs may be beca@se ytu= text is't !sig _ a a tg eliiter0Unokeiz!ble: ?s (+%s, ecmal: %s) - this may be beca@se you= text is't !sig _ a a tg eliiter0Untokiz!bPe:%s (U+%s, ecmcl %s) - this may be becse you= ext ist isg _ a atg delimiter.jar.jar", "Untokeiz!ble: ?s (U+%s, e$mal: %s) - thcs may be beca@se ytu= text is't !sig _ a a tg eliiter0Unokeiz!ble: ?s (+%s, ecmal: %s) - this may be beca@se you= text is't !sig _ a a tg eliiter0Untokiz!bPe:%s (U+%s, ecmcl %s) - this may be becse you= ext ist isg _ a atg delimiter.jar.jar");
      stringArray0[0] = "RC,*!O)llv@FQbT:wP";
      archiveScanner0.includes = stringArray0;
      // Undeclared exception!
      try {
        archiveScanner0.processDirectory((File) null, "Untokeiz!ble: ?s (U+%s, e$mal: %s) - thcs may be beca@se ytu= text is't !sig _ a a tg eliiter0Unokeiz!ble: ?s (+%s, ecmal: %s) - this may be beca@se you= text is't !sig _ a a tg eliiter0Untokiz!bPe:%s (U+%s, ecmcl %s) - this may be becse you= ext ist isg _ a atg delimiter.jar.jar", true);
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
   * Goal 1. com.lts.io.ArchiveScanner.processDirectory(Ljava/io/File;Ljava/lang/String;Z)V: I17 Branch 7 IFNE L103 - false
   */

  @Test
  public void test01()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[13];
      stringArray0[0] = "7|=%";
      stringArray0[1] = "7|=%";
      archiveScanner0.addDefaultExcludes();
      boolean boolean0 = FileSystemHandling.shouldAllThrowIOExceptions();
      archiveScanner0.includes = stringArray0;
      // Undeclared exception!
      try {
        archiveScanner0.processDirectory((File) null, "7|=%", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 20 TABLESWITCH L198 Case 1 - true
   * Goal 2. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 21 TABLESWITCH L198 Case 2 - false
   */

  @Test
  public void test02()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("", "");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
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
   * Goal 1. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I38 Branch 18 IF_ICMPGE L193 - true
   */

  @Test
  public void test03()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/var/folders/ff/jvqmt14176q7vr5d_h1h729c0000gn/T/Untokeiz!ble: ?s (U+%s, ecmal: %s) - this may be beca@se you= text is't !sig _ a a tg eliiter0Untokiz!bPe:%s (U+%s, ecmcl %s) - this may be becse you= ext ist isg _ a atg delimiter");
      boolean boolean0 = FileSystemHandling.createFolder(evoSuiteFile0);
      MockFile mockFile0 = (MockFile)MockFile.createTempFile("Untokeiz!ble: ?s (U+%s, ecmal: %s) - this may be beca@se you= text is't !sig _ a a tg eliiter", "Untokiz!bPe:%s (U+%s, ecmcl %s) - this may be becse you= ext ist isg _ a atg delimiter");
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      archiveScanner0.scandir(mockFile0, "Untokiz!bPe:%s (U+%s, ecmcl %s) - this may be becse you= ext ist isg _ a atg delimiter", true);
      assertEquals(0L, mockFile0.getUsableSpace());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * Goal 1. com.lts.io.ArchiveScanner.toFileType(Ljava/io/File;)I: I11 Branch 3 IFEQ L86 - false
   */

  @Test
  public void test04()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("", "");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      int int0 = archiveScanner0.toFileType((File) improvedFile0);
      assertEquals(1, int0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * Goal 1. com.lts.io.ArchiveScanner.processArchive(Ljava/io/File;Ljava/lang/String;)V: I27 Branch 16 IFEQ L165 - true
   */

  @Test
  public void test05()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[13];
      stringArray0[0] = "7f|%";
      stringArray0[6] = "7f|%";
      archiveScanner0.addDefaultExcludes();
      archiveScanner0.includes = stringArray0;
      // Undeclared exception!
      try {
        archiveScanner0.processArchive((File) null, "7f|%");
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
   * Goal 1. com.lts.io.ArchiveScanner.processFile(Ljava/lang/String;)V: I8 Branch 12 IFNE L131 - true
   */

  @Test
  public void test06()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "RC,*!O)lklv@FQbT:wP";
      archiveScanner0.includes = stringArray0;
      // Undeclared exception!
      try {
        archiveScanner0.processFile("RC,*!O)lklv@FQbT:wP");
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
   * Goal 1. com.lts.io.ArchiveScanner.processArchive(Ljava/io/File;Ljava/lang/String;)V: I8 Branch 15 IFNE L163 - false
   */

  @Test
  public void test07()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "RC,*!O)lv@FQbT:wP";
      archiveScanner0.includes = stringArray0;
      // Undeclared exception!
      try {
        archiveScanner0.processArchive((File) null, "Ig]@&J");
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
   * Goal 1. com.lts.io.ArchiveScanner.processFile(Ljava/lang/String;)V: I8 Branch 12 IFNE L131 - false
   */

  @Test
  public void test08()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "RC,*!O)llv@FQbT:wP";
      archiveScanner0.includes = stringArray0;
      // Undeclared exception!
      try {
        archiveScanner0.processFile("Graph is not connected for:");
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
   * Goal 1. com.lts.io.ArchiveScanner.processDirectory(Ljava/io/File;Ljava/lang/String;Z)V: I8 Branch 6 IFEQ L101 - false
   * Goal 2. com.lts.io.ArchiveScanner.processDirectory(Ljava/io/File;Ljava/lang/String;Z)V: I17 Branch 7 IFNE L103 - true
   */

  @Test
  public void test09()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[13];
      stringArray0[0] = "7|=%";
      stringArray0[1] = "7|=%";
      boolean boolean0 = FileSystemHandling.shouldAllThrowIOExceptions();
      archiveScanner0.excludes = stringArray0;
      archiveScanner0.includes = stringArray0;
      // Undeclared exception!
      try {
        archiveScanner0.processDirectory((File) null, "7|=%", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 10
  /*
   * 11 covered goals:
   * Goal 1. com.lts.io.ArchiveScanner.isArchive(Ljava/io/File;)Z: I19 Branch 1 IFNE L72 - true
   * Goal 2. com.lts.io.ArchiveScanner.isArchive(Ljava/io/File;)Z: I19 Branch 1 IFNE L72 - false
   * Goal 3. com.lts.io.ArchiveScanner.isArchive(Ljava/io/File;)Z: I26 Branch 2 IF_ICMPGE L72 - false
   * Goal 4. com.lts.io.ArchiveScanner.toFileType(Ljava/io/File;)I: I11 Branch 3 IFEQ L86 - true
   * Goal 5. com.lts.io.ArchiveScanner.toFileType(Ljava/io/File;)I: I28 Branch 4 IFEQ L88 - false
   * Goal 6. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I11 Branch 17 IFNONNULL L179 - true
   * Goal 7. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I38 Branch 18 IF_ICMPGE L193 - false
   * Goal 8. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 19 TABLESWITCH L198 Case 0 - false
   * Goal 9. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 20 TABLESWITCH L198 Case 1 - false
   * Goal 10. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 21 TABLESWITCH L198 Case 2 - true
   * Goal 11. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 22 TABLESWITCH L198 Default-Case - false
   */

  @Test
  public void test10()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      ImprovedFile improvedFile1 = improvedFile0.createTempDir("Z2NxDze~I", "Z2NxDze~I");
      // Undeclared exception!
      try {
        archiveScanner0.scandir(improvedFile0, "", false);
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
   * Goal 1. com.lts.io.ArchiveScanner.processArchive(Ljava/io/File;Ljava/lang/String;)V: I8 Branch 15 IFNE L163 - true
   * Goal 2. com.lts.io.ArchiveScanner.processArchive(Ljava/io/File;Ljava/lang/String;)V: I27 Branch 16 IFEQ L165 - false
   */

  @Test
  public void test11()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[21];
      stringArray0[0] = "7|=%";
      stringArray0[4] = "7|=%";
      archiveScanner0.excludes = stringArray0;
      archiveScanner0.includes = stringArray0;
      // Undeclared exception!
      try {
        archiveScanner0.processArchive((File) null, "7|=%");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 12
  /*
   * 2 covered goals:
   * Goal 1. com.lts.io.ArchiveScanner.<init>(Lcom/lts/io/ImprovedFile;)V: root-Branch
   * Goal 2. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I11 Branch 17 IFNONNULL L179 - false
   */

  @Test
  public void test12()  throws Throwable  {
      MockFile mockFile0 = (MockFile)MockFile.createTempFile("Untokeiz!ble: ?s (U+%s, ecmal: %s) - this may be beca@se you= text is't !sig _ a a tg eliiter0Untokiz!bPe:%s (U+%s, ecmcl %s) - this may be becse you= ext ist isg _ a atg delimiter.jar", "Untokeiz!ble: ?s (U+%s, ecmal: %s) - this may be beca@se you= text is't !sig _ a a tg eliiter0Untokiz!bPe:%s (U+%s, ecmcl %s) - this may be becse you= ext ist isg _ a atg delimiter.jar");
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      try {
        archiveScanner0.scandir(mockFile0, "Untokeiz!ble: ?s (U+%s, ecmal: %s) - this may be beca@se you= text is't !sig _ a a tg eliiter0Untokiz!bPe:%s (U+%s, ecmcl %s) - this may be becse you= ext ist isg _ a atg delimiter.jar", true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /var/folders/ff/jvqmt14176q7vr5d_h1h729c0000gn/T/Untokeiz!ble: ?s (U+%s, ecmal: %s) - this may be beca@se you= text is't !sig _ a a tg eliiter0Untokiz!bPe:%s (U+%s, ecmcl %s) - this may be becse you= ext ist isg _ a atg delimiter.jar0Untokeiz!ble: ?s (U+%s, ecmal: %s) - this may be beca@se you= text is't !sig _ a a tg eliiter0Untokiz!bPe:%s (U+%s, ecmcl %s) - this may be becse you= ext ist isg _ a atg delimiter.jar
         //
      }
  }
}

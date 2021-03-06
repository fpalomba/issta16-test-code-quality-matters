/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 11 19:53:53 GMT 2015
 */

package com.lts.io;

import static org.junit.Assert.*;
import org.junit.Test;
import com.lts.io.ArchiveScanner;
import com.lts.io.ImprovedFile;
import edu.stanford.nlp.objectbank.ObjectBank;
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
   * Goal 1. com.lts.io.ArchiveScanner.processArchive(Ljava/io/File;Ljava/lang/String;)V: I27 Branch 16 IFEQ L165 - false
   */

  @Test
  public void test00()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("PREFIX");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "PREFIX";
      archiveScanner0.excludes = stringArray0;
      archiveScanner0.includes = archiveScanner0.excludes;
      // Undeclared exception!
      try {
        archiveScanner0.processArchive((File) improvedFile0, "PREFIX");
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
   * Goal 2. com.lts.io.ArchiveScanner.processArchive(Ljava/io/File;Ljava/lang/String;)V: I27 Branch 16 IFEQ L165 - true
   */

  @Test
  public void test01()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("PREFIX");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "PREFIX";
      archiveScanner0.includes = stringArray0;
      archiveScanner0.addDefaultExcludes();
      // Undeclared exception!
      try {
        archiveScanner0.processArchive((File) improvedFile0, "PREFIX");
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
  public void test02()  throws Throwable  {
      MockFile mockFile0 = new MockFile("ltQ,&ppX;B>8x$T_t<x.jar.jar");
      ImprovedFile improvedFile0 = ImprovedFile.createTempDirectory("ltQ,&ppX;B>8x$T_t<x.jar.jar", "ltQ,&ppX;B>8x$T_t<x.jar.jar", (File) mockFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "ltQ,&ppX;B>8x$T_t<x.jar.jar";
      stringArray0[1] = "ltQ,&ppX;B>8x$T_t<x.jar.jar";
      stringArray0[2] = "ltQ,&ppX;B>8x$T_t<x.jar.jar";
      archiveScanner0.excludes = stringArray0;
      stringArray0[3] = "ltQ,&ppX;B>8x$T_t<x.jar.jar";
      stringArray0[4] = "ltQ,&ppX;B>8x$T_t<x.jar.jar";
      stringArray0[5] = "ltQ,&ppX;B>8x$T_t<x.jar.jar";
      stringArray0[6] = "ltQ,&ppX;B>8x$T_t<x.jar.jar";
      stringArray0[7] = "ltQ,&ppX;B>8x$T_t<x.jar.jar";
      stringArray0[8] = "ltQ,&ppX;B>8x$T_t<x.jar.jar";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try {
        archiveScanner0.processFile("ltQ,&ppX;B>8x$T_t<x.jar.jar");
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
  public void test03()  throws Throwable  {
      MockFile mockFile0 = new MockFile("A@Rb3Ty|Jeej<");
      ImprovedFile improvedFile0 = ImprovedFile.createTempDirectory("A@Rb3Ty|Jeej<", "A@Rb3Ty|Jeej<", (File) mockFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "A@Rb3Ty|Jeej<";
      stringArray0[1] = "A@Rb3Ty|Jeej<";
      stringArray0[2] = "A@Rb3Ty|Jeej<";
      stringArray0[3] = "A@Rb3Ty|Jeej<";
      stringArray0[4] = "A@Rb3Ty|Jeej<";
      stringArray0[5] = "A@Rb3Ty|Jeej<";
      stringArray0[6] = "A@Rb3Ty|Jeej<";
      stringArray0[7] = ".war";
      stringArray0[8] = "A@Rb3Ty|Jeej<";
      archiveScanner0.addDefaultExcludes();
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try {
        archiveScanner0.processFile("A@Rb3Ty|Jeej<");
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
  public void test04()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("**/*~");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "|Mm ^";
      stringArray0[1] = "|Mm ^";
      stringArray0[2] = "**/*~";
      stringArray0[3] = "|Mm ^";
      stringArray0[4] = "**/*~";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try {
        archiveScanner0.processFile("##n$o.0##n$o..jar");
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
      ImprovedFile improvedFile0 = new ImprovedFile("PRIX");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[17];
      stringArray0[0] = "PRIX";
      archiveScanner0.includes = stringArray0;
      archiveScanner0.addDefaultExcludes();
      // Undeclared exception!
      try {
        archiveScanner0.processDirectory((File) improvedFile0, "PRIX", true);
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
  public void test06()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("PREFIX");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "PREFIX";
      archiveScanner0.excludes = stringArray0;
      archiveScanner0.includes = archiveScanner0.excludes;
      // Undeclared exception!
      try {
        archiveScanner0.processDirectory((File) improvedFile0, "PREFIX", true);
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
   * Goal 1. com.lts.io.ArchiveScanner.processDirectory(Ljava/io/File;Ljava/lang/String;Z)V: I8 Branch 6 IFEQ L101 - true
   */

  @Test
  public void test07()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("fjHjX)>3:sj3-");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "f2Nx;W(VF>o";
      archiveScanner0.includes = stringArray0;
      // Undeclared exception!
      try {
        archiveScanner0.processDirectory((File) improvedFile0, "<E}V.h60D_bD2C8Oh.jar", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 8
  /*
   * 3 covered goals:
   * Goal 1. com.lts.io.ArchiveScanner.toFileType(Ljava/io/File;)I: I11 Branch 3 IFEQ L86 - false
   * Goal 2. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 20 TABLESWITCH L198 Case 1 - true
   * Goal 3. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I86 Branch 21 TABLESWITCH L198 Case 2 - false
   */

  @Test
  public void test08()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile(":iC{%wnzd+!", ":iC{%wnzd+!");
      ImprovedFile improvedFile1 = improvedFile0.createTempDir(":iC{%wnzd+!", ":iC{%wnzd+!");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile1);
      // Undeclared exception!
      try {
        archiveScanner0.scandir(improvedFile0, ":iC{%wnzd+!", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 9
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
  public void test09()  throws Throwable  {
      ObjectBank.PathToFileFunction objectBank_PathToFileFunction0 = new ObjectBank.PathToFileFunction();
      MockFile mockFile0 = (MockFile)objectBank_PathToFileFunction0.apply("##n$Y.");
      ImprovedFile improvedFile0 = ImprovedFile.createTempImprovedFile("##n$Y.", "##n$Y.", (File) mockFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      // Undeclared exception!
      try {
        archiveScanner0.scandir(mockFile0, "##n$Y.", true);
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
   * Goal 1. com.lts.io.ArchiveScanner.<init>(Lcom/lts/io/ImprovedFile;)V: root-Branch
   * Goal 2. com.lts.io.ArchiveScanner.scandir(Ljava/io/File;Ljava/lang/String;Z)V: I11 Branch 17 IFNONNULL L179 - false
   */

  @Test
  public void test10()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("Zct%Bo+puF;j'N=@8*", "Zct%Bo+puF;j'N=@8*");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      try {
        archiveScanner0.scandir(improvedFile0, "Zct%Bo+puF;j'N=@8*", true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /Users/fabiopalomba/Documents/workspace/LunchEvosuite/Zct%Bo+puF;j'N=@8*_/Zct%Bo+puF;j'N=@8*
         //
      }
  }
}

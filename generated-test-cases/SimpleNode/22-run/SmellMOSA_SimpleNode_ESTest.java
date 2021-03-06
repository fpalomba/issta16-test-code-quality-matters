/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 19 12:37:21 GMT 2015
 */

package com.soops.CEN4010.JMCA.JParser;

import static org.junit.Assert.*;
import org.junit.Test;
import com.soops.CEN4010.JMCA.JParser.JavaParser;
import com.soops.CEN4010.JMCA.JParser.Node;
import com.soops.CEN4010.JMCA.JParser.SimpleNode;
import edu.stanford.nlp.objectbank.ObjectBank;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.StringWriter;
import java.io.Writer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SimpleNode_ESTest extends SimpleNode_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I201 Branch 20 IFGT L136 - true
   */

  @Test
  public void test00()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(101);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      simpleNode0.setIdentifier("&");
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      MockFile mockFile0 = new MockFile("&", "&");
      assertEquals("&/&", mockFile0.toString());
      assertFalse(mockFile0.isAbsolute());
      assertFalse(mockFile0.canExecute());
      assertEquals("&", mockFile0.getName());
      assertEquals(0L, mockFile0.length());
      assertFalse(mockFile0.canRead());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertFalse(mockFile0.canWrite());
      assertTrue(mockFile0.isFile());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertEquals(0L, mockFile0.lastModified());
      assertEquals("&", mockFile0.getParent());
      assertFalse(mockFile0.isDirectory());
      assertFalse(mockFile0.exists());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertFalse(mockFile0.isHidden());
      assertNotNull(mockFile0);
      
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter((File) mockFile0);
      assertEquals("&/&", mockFile0.toString());
      assertFalse(mockFile0.isAbsolute());
      assertEquals(1392409281320L, mockFile0.lastModified());
      assertTrue(mockFile0.exists());
      assertEquals("&", mockFile0.getName());
      assertEquals(0L, mockFile0.length());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertTrue(mockFile0.canExecute());
      assertTrue(mockFile0.isFile());
      assertTrue(mockFile0.canRead());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertTrue(mockFile0.canWrite());
      assertEquals("&", mockFile0.getParent());
      assertFalse(mockFile0.isDirectory());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertFalse(mockFile0.isHidden());
      assertNotNull(mockPrintWriter0);
      
      simpleNode0.dump("&", (Writer) mockPrintWriter0);
      assertEquals("&/&", mockFile0.toString());
      assertFalse(mockFile0.isAbsolute());
      assertEquals(1392409281320L, mockFile0.lastModified());
      assertTrue(mockFile0.exists());
      assertEquals("&", mockFile0.getName());
      assertEquals(0L, mockFile0.length());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertTrue(mockFile0.canExecute());
      assertTrue(mockFile0.isFile());
      assertTrue(mockFile0.canRead());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertTrue(mockFile0.canWrite());
      assertEquals("&", mockFile0.getParent());
      assertFalse(mockFile0.isDirectory());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertFalse(mockFile0.isHidden());
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtSetParent(Lcom/soops/CEN4010/JMCA/JParser/Node;)V: root-Branch
   */

  @Test
  public void test01()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-7));
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      simpleNode0.jjtSetParent((Node) simpleNode0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 2
  /*
   * 3 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I291 Branch 25 IF_ICMPGE L152 - true
   * Goal 2. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I341 Branch 28 IFNULL L159 - false
   * Goal 3. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I348 Branch 29 IFLE L159 - false
   */

  @Test
  public void test02()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      simpleNode0.jjtAddChild((Node) null, 0);
      assertEquals(1, simpleNode0.jjtGetNumChildren());
      
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      assertEquals(0, charArrayWriter0.size());
      assertEquals("", charArrayWriter0.toString());
      assertNotNull(charArrayWriter0);
      
      simpleNode0.dump("*lshft", (Writer) charArrayWriter0);
      assertEquals(1, simpleNode0.jjtGetNumChildren());
      assertEquals(36, charArrayWriter0.size());
      assertEquals("<CompilationUnit></CompilationUnit>\n", charArrayWriter0.toString());
  }

  //Test case number: 3
  /*
   * 6 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I246 Branch 22 IFNULL L147 - false
   * Goal 2. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I253 Branch 23 IFLE L147 - false
   * Goal 3. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I278 Branch 24 IFNULL L151 - false
   * Goal 4. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I291 Branch 25 IF_ICMPGE L152 - false
   * Goal 5. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I306 Branch 26 IFNULL L154 - true
   * Goal 6. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I306 Branch 26 IFNULL L154 - false
   */

  @Test
  public void test03()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(4);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      Node[] nodeArray0 = new Node[7];
      nodeArray0[3] = (Node) simpleNode0;
      simpleNode0.children = nodeArray0;
      assertEquals(7, simpleNode0.jjtGetNumChildren());
      
      StringWriter stringWriter0 = new StringWriter();
      assertEquals("", stringWriter0.toString());
      assertNotNull(stringWriter0);
      
      // Undeclared exception!
      try {
        simpleNode0.dump(" ^-%K,=k6:+j7PS", (Writer) stringWriter0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 4
  /*
   * 10 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I95 Branch 11 IFGT L111 - false
   * Goal 2. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I107 Branch 12 IFLE L114 - true
   * Goal 3. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I123 Branch 14 IFLE L118 - true
   * Goal 4. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I136 Branch 15 IFLE L121 - true
   * Goal 5. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I149 Branch 16 IFLE L124 - true
   * Goal 6. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I162 Branch 17 IFLE L127 - true
   * Goal 7. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I175 Branch 18 IFLE L130 - true
   * Goal 8. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I188 Branch 19 IFLE L133 - true
   * Goal 9. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I201 Branch 20 IFGT L136 - false
   * Goal 10. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I208 Branch 21 IFLE L136 - true
   */

  @Test
  public void test04()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(27);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      simpleNode0.setIdentifier(" $+ NP !$+ ADJP)");
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      assertEquals(0, charArrayWriter0.size());
      assertEquals("", charArrayWriter0.toString());
      assertNotNull(charArrayWriter0);
      
      simpleNode0.dump(" $+ NP !$+ ADJP)", (Writer) charArrayWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertEquals("<Initializer>\n  <identifier> $+ NP !$+ ADJP)</identifier>\n</Initializer>\n", charArrayWriter0.toString());
      assertEquals(73, charArrayWriter0.size());
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtGetChild(I)Lcom/soops/CEN4010/JMCA/JParser/Node;: root-Branch
   */

  @Test
  public void test05()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(4);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      // Undeclared exception!
      try {
        Node node0 = simpleNode0.jjtGetChild(4);
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
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I8 Branch 5 IFLE L103 - true
   * Goal 2. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I246 Branch 22 IFNULL L147 - true
   * Goal 3. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I335 Branch 27 IFGT L159 - false
   * Goal 4. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I341 Branch 28 IFNULL L159 - true
   */

  @Test
  public void test06()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(27);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      assertEquals(0, charArrayWriter0.size());
      assertEquals("", charArrayWriter0.toString());
      assertNotNull(charArrayWriter0);
      
      simpleNode0.dump(" $+ NP !$+ ADJP)", (Writer) charArrayWriter0);
      assertEquals(0, charArrayWriter0.size());
      assertEquals("", charArrayWriter0.toString());
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtGetParent()Lcom/soops/CEN4010/JMCA/JParser/Node;: root-Branch
   */

  @Test
  public void test07()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(137);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      Node node0 = simpleNode0.jjtGetParent();
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNull(node0);
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I39 Branch 6 IFLE L106 - false
   */

  @Test
  public void test08()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(63);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      simpleNode0.setIdentifier("c");
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      ObjectBank.PathToFileFunction objectBank_PathToFileFunction0 = new ObjectBank.PathToFileFunction();
      assertNotNull(objectBank_PathToFileFunction0);
      
      MockFile mockFile0 = (MockFile)objectBank_PathToFileFunction0.apply("c");
      assertFalse(mockFile0.exists());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertFalse(mockFile0.canExecute());
      assertTrue(mockFile0.isFile());
      assertFalse(mockFile0.canWrite());
      assertFalse(mockFile0.canRead());
      assertEquals("c", mockFile0.toString());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertEquals("c", mockFile0.getName());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertEquals(0L, mockFile0.length());
      assertFalse(mockFile0.isAbsolute());
      assertEquals(0L, mockFile0.lastModified());
      assertNull(mockFile0.getParent());
      assertFalse(mockFile0.isHidden());
      assertFalse(mockFile0.isDirectory());
      assertNotNull(mockFile0);
      
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter((File) mockFile0);
      assertEquals(1392409281320L, mockFile0.lastModified());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertTrue(mockFile0.isFile());
      assertTrue(mockFile0.canRead());
      assertTrue(mockFile0.exists());
      assertEquals("c", mockFile0.toString());
      assertTrue(mockFile0.canExecute());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertEquals("c", mockFile0.getName());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertEquals(0L, mockFile0.length());
      assertFalse(mockFile0.isAbsolute());
      assertNull(mockFile0.getParent());
      assertFalse(mockFile0.isHidden());
      assertFalse(mockFile0.isDirectory());
      assertTrue(mockFile0.canWrite());
      assertNotNull(mockPrintWriter0);
      
      simpleNode0.dump("c", (Writer) mockPrintWriter0);
      assertEquals(1392409281320L, mockFile0.lastModified());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertTrue(mockFile0.isFile());
      assertTrue(mockFile0.canRead());
      assertTrue(mockFile0.exists());
      assertEquals("c", mockFile0.toString());
      assertTrue(mockFile0.canExecute());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertEquals("c", mockFile0.getName());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertEquals(0L, mockFile0.length());
      assertFalse(mockFile0.isAbsolute());
      assertNull(mockFile0.getParent());
      assertFalse(mockFile0.isHidden());
      assertFalse(mockFile0.isDirectory());
      assertTrue(mockFile0.canWrite());
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 9
  /*
   * 14 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.setIdentifier(Ljava/lang/String;)V: root-Branch
   * Goal 2. com.soops.CEN4010.JMCA.JParser.SimpleNode.toString(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   * Goal 3. com.soops.CEN4010.JMCA.JParser.SimpleNode.toString()Ljava/lang/String;: I19 Branch 4 IFEQ L87 - true
   * Goal 4. com.soops.CEN4010.JMCA.JParser.SimpleNode.toString()Ljava/lang/String;: I19 Branch 4 IFEQ L87 - false
   * Goal 5. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I8 Branch 5 IFLE L103 - false
   * Goal 6. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I39 Branch 6 IFLE L106 - true
   * Goal 7. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I61 Branch 7 IFEQ L110 - true
   * Goal 8. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I61 Branch 7 IFEQ L110 - false
   * Goal 9. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I74 Branch 8 IFGT L111 - false
   * Goal 10. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I81 Branch 9 IFGT L111 - false
   * Goal 11. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I88 Branch 10 IFGT L111 - false
   * Goal 12. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I95 Branch 11 IFGT L111 - true
   * Goal 13. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I278 Branch 24 IFNULL L151 - true
   * Goal 14. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I335 Branch 27 IFGT L159 - true
   */

  @Test
  public void test09()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(103);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      simpleNode0.setIdentifier("");
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      MockFile mockFile0 = new MockFile("3", "");
      assertTrue(mockFile0.isFile());
      assertEquals("3", mockFile0.getName());
      assertFalse(mockFile0.isHidden());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertFalse(mockFile0.canExecute());
      assertFalse(mockFile0.canRead());
      assertFalse(mockFile0.isDirectory());
      assertFalse(mockFile0.exists());
      assertEquals("3", mockFile0.toString());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertNull(mockFile0.getParent());
      assertFalse(mockFile0.isAbsolute());
      assertFalse(mockFile0.canWrite());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertEquals(0L, mockFile0.length());
      assertEquals(0L, mockFile0.lastModified());
      assertNotNull(mockFile0);
      
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter((File) mockFile0);
      assertTrue(mockFile0.canRead());
      assertTrue(mockFile0.isFile());
      assertTrue(mockFile0.canWrite());
      assertTrue(mockFile0.canExecute());
      assertEquals("3", mockFile0.getName());
      assertFalse(mockFile0.isHidden());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertEquals(1392409281320L, mockFile0.lastModified());
      assertTrue(mockFile0.exists());
      assertFalse(mockFile0.isDirectory());
      assertEquals("3", mockFile0.toString());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertNull(mockFile0.getParent());
      assertFalse(mockFile0.isAbsolute());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertEquals(0L, mockFile0.length());
      assertNotNull(mockPrintWriter0);
      
      simpleNode0.dump("", (Writer) mockPrintWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertTrue(mockFile0.canRead());
      assertTrue(mockFile0.isFile());
      assertTrue(mockFile0.canWrite());
      assertTrue(mockFile0.canExecute());
      assertEquals("3", mockFile0.getName());
      assertFalse(mockFile0.isHidden());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertEquals(1392409281320L, mockFile0.lastModified());
      assertTrue(mockFile0.exists());
      assertFalse(mockFile0.isDirectory());
      assertEquals("3", mockFile0.toString());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertNull(mockFile0.getParent());
      assertFalse(mockFile0.isAbsolute());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertEquals(0L, mockFile0.length());
      
      String string0 = simpleNode0.toString("3");
      assertEquals("3AnnotationTypeDeclaration : ", string0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(string0);
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtGetNumChildren()I: I7 Branch 3 IFNONNULL L75 - false
   */

  @Test
  public void test10()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(122);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      int int0 = simpleNode0.jjtGetNumChildren();
      assertEquals(0, int0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 11
  /*
   * 3 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtAddChild(Lcom/soops/CEN4010/JMCA/JParser/Node;I)V: I7 Branch 1 IFNONNULL L60 - false
   * Goal 2. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtAddChild(Lcom/soops/CEN4010/JMCA/JParser/Node;I)V: I29 Branch 2 IF_ICMPLT L62 - false
   * Goal 3. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtGetNumChildren()I: I7 Branch 3 IFNONNULL L75 - true
   */

  @Test
  public void test11()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(3672);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      simpleNode0.jjtAddChild((Node) simpleNode0, 3672);
      assertEquals(3673, simpleNode0.jjtGetNumChildren());
      
      int int0 = simpleNode0.jjtGetNumChildren();
      assertEquals(3673, int0);
      assertEquals(3673, simpleNode0.jjtGetNumChildren());
      
      simpleNode0.jjtAddChild((Node) simpleNode0, 3673);
      assertEquals(3674, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 12
  /*
   * 2 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtAddChild(Lcom/soops/CEN4010/JMCA/JParser/Node;I)V: I7 Branch 1 IFNONNULL L60 - true
   * Goal 2. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtAddChild(Lcom/soops/CEN4010/JMCA/JParser/Node;I)V: I29 Branch 2 IF_ICMPLT L62 - true
   */

  @Test
  public void test12()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(4);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      Node[] nodeArray0 = new Node[7];
      simpleNode0.children = nodeArray0;
      assertEquals(7, simpleNode0.jjtGetNumChildren());
      
      simpleNode0.jjtAddChild(nodeArray0[5], 4);
      assertEquals(7, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 13
  /*
   * 4 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtOpen()V: root-Branch
   * Goal 2. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtClose()V: root-Branch
   * Goal 3. com.soops.CEN4010.JMCA.JParser.SimpleNode.<init>(I)V: root-Branch
   * Goal 4. com.soops.CEN4010.JMCA.JParser.SimpleNode.<init>(Lcom/soops/CEN4010/JMCA/JParser/JavaParser;I)V: root-Branch
   */

  @Test
  public void test13()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      assertEquals(0, pipedInputStream0.available());
      assertNotNull(pipedInputStream0);
      
      JavaParser javaParser0 = new JavaParser((InputStream) pipedInputStream0);
      assertFalse(javaParser0.lookingAhead);
      assertEquals(0, pipedInputStream0.available());
      assertNotNull(javaParser0);
      
      try {
        javaParser0.BreakStatement();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parse error at line 1, column 0.  Encountered: <EOF>
         //
      }
  }
}

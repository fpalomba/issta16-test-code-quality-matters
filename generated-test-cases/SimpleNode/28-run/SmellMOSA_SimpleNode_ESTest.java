/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 19 12:51:20 GMT 2015
 */

package com.soops.CEN4010.JMCA.JParser;

import static org.junit.Assert.*;
import org.junit.Test;
import com.soops.CEN4010.JMCA.JParser.JavaParser;
import com.soops.CEN4010.JMCA.JParser.Node;
import com.soops.CEN4010.JMCA.JParser.SimpleNode;
import java.io.CharArrayWriter;
import java.io.OutputStream;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
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
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtGetChild(I)Lcom/soops/CEN4010/JMCA/JParser/Node;: root-Branch
   */

  @Test
  public void test00()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(6);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      // Undeclared exception!
      try {
        Node node0 = simpleNode0.jjtGetChild(6);
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
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtAddChild(Lcom/soops/CEN4010/JMCA/JParser/Node;I)V: I29 Branch 2 IF_ICMPLT L62 - true
   */

  @Test
  public void test01()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-6));
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      Node[] nodeArray0 = new Node[3];
      simpleNode0.children = nodeArray0;
      assertEquals(3, simpleNode0.jjtGetNumChildren());
      
      // Undeclared exception!
      try {
        simpleNode0.jjtAddChild(nodeArray0[2], (-6));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -6
         //
      }
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtClose()V: root-Branch
   */

  @Test
  public void test02()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-29));
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      simpleNode0.jjtClose();
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtOpen()V: root-Branch
   */

  @Test
  public void test03()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("+j sc03");
      assertFalse(javaParser0.lookingAhead);
      assertNotNull(javaParser0);
      
      try {
        javaParser0.MemberValuePair();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parse error at line 1, column 0.  Encountered: <EOF>
         //
      }
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtAddChild(Lcom/soops/CEN4010/JMCA/JParser/Node;I)V: I7 Branch 1 IFNONNULL L60 - true
   * Goal 2. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtAddChild(Lcom/soops/CEN4010/JMCA/JParser/Node;I)V: I29 Branch 2 IF_ICMPLT L62 - false
   */

  @Test
  public void test04()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(3);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      Node[] nodeArray0 = new Node[3];
      simpleNode0.children = nodeArray0;
      assertEquals(3, simpleNode0.jjtGetNumChildren());
      
      simpleNode0.jjtAddChild(nodeArray0[2], 3);
      assertEquals(4, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I188 Branch 19 IFLE L133 - false
   */

  @Test
  public void test05()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(12);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      simpleNode0.setIdentifier(">=");
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      assertEquals("", charArrayWriter0.toString());
      assertEquals(0, charArrayWriter0.size());
      assertNotNull(charArrayWriter0);
      
      simpleNode0.dump(">=", (Writer) charArrayWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertEquals(64, charArrayWriter0.size());
      assertEquals("<TypeParameter>\n  <identifier>*ge</identifier>\n</TypeParameter>\n", charArrayWriter0.toString());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtGetNumChildren()I: I7 Branch 3 IFNONNULL L75 - false
   */

  @Test
  public void test06()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-23));
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      int int0 = simpleNode0.jjtGetNumChildren();
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertEquals(0, int0);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtGetParent()Lcom/soops/CEN4010/JMCA/JParser/Node;: root-Branch
   */

  @Test
  public void test07()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(11472);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      Node node0 = simpleNode0.jjtGetParent();
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNull(node0);
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I123 Branch 14 IFLE L118 - false
   */

  @Test
  public void test08()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      simpleNode0.setIdentifier("<");
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      assertEquals(0, charArrayWriter0.size());
      assertEquals("", charArrayWriter0.toString());
      assertNotNull(charArrayWriter0);
      
      simpleNode0.dump((String) null, (Writer) charArrayWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertEquals("<VariableDeclaratorId>\n  <identifier>*lt</identifier>\n</VariableDeclaratorId>\n", charArrayWriter0.toString());
      assertEquals(78, charArrayWriter0.size());
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtGetNumChildren()I: I7 Branch 3 IFNONNULL L75 - true
   */

  @Test
  public void test09()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-6));
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      Node[] nodeArray0 = new Node[3];
      simpleNode0.children = nodeArray0;
      assertEquals(3, simpleNode0.jjtGetNumChildren());
      
      int int0 = simpleNode0.jjtGetNumChildren();
      assertEquals(3, simpleNode0.jjtGetNumChildren());
      assertEquals(3, int0);
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I136 Branch 15 IFLE L121 - false
   */

  @Test
  public void test10()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      simpleNode0.setIdentifier(">");
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      MockPrintStream mockPrintStream0 = new MockPrintStream("re-plTt");
      assertNotNull(mockPrintStream0);
      
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter((OutputStream) mockPrintStream0);
      assertNotNull(mockPrintWriter0);
      
      simpleNode0.dump((String) null, (Writer) mockPrintWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I88 Branch 10 IFGT L111 - true
   */

  @Test
  public void test11()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(14);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      simpleNode0.setIdentifier("{");
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      assertEquals(0, charArrayWriter0.size());
      assertEquals("", charArrayWriter0.toString());
      assertNotNull(charArrayWriter0);
      
      simpleNode0.dump((String) null, (Writer) charArrayWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertEquals(47, charArrayWriter0.size());
      assertEquals("<ClassOrInterfaceBody>\n</ClassOrInterfaceBody>\n", charArrayWriter0.toString());
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I95 Branch 11 IFGT L111 - true
   */

  @Test
  public void test12()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(12);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      simpleNode0.setIdentifier("");
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      assertEquals(0, charArrayWriter0.size());
      assertEquals("", charArrayWriter0.toString());
      assertNotNull(charArrayWriter0);
      
      simpleNode0.dump((String) null, (Writer) charArrayWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertEquals(33, charArrayWriter0.size());
      assertEquals("<TypeParameter>\n</TypeParameter>\n", charArrayWriter0.toString());
  }

  //Test case number: 13
  /*
   * 2 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.toString(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   * Goal 2. com.soops.CEN4010.JMCA.JParser.SimpleNode.<init>(Lcom/soops/CEN4010/JMCA/JParser/JavaParser;I)V: root-Branch
   */

  @Test
  public void test13()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("After transformCC:            ");
      assertFalse(javaParser0.lookingAhead);
      assertNotNull(javaParser0);
      
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 26);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertFalse(javaParser0.lookingAhead);
      assertNotNull(simpleNode0);
      
      String string0 = simpleNode0.toString("After transformCC:            ");
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertFalse(javaParser0.lookingAhead);
      assertNotNull(string0);
      assertEquals("After transformCC:            ExplicitConstructorInvocation", string0);
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I306 Branch 26 IFNULL L154 - false
   */

  @Test
  public void test14()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      Node[] nodeArray0 = new Node[8];
      nodeArray0[1] = (Node) simpleNode0;
      simpleNode0.children = nodeArray0;
      assertEquals(8, simpleNode0.jjtGetNumChildren());
      
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      assertEquals("", charArrayWriter0.toString());
      assertEquals(0, charArrayWriter0.size());
      assertNotNull(charArrayWriter0);
      
      // Undeclared exception!
      try {
        simpleNode0.dump("~#", (Writer) charArrayWriter0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 15
  /*
   * 3 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I107 Branch 12 IFLE L114 - false
   * Goal 2. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I114 Branch 13 IFGT L114 - false
   * Goal 3. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I162 Branch 17 IFLE L127 - true
   */

  @Test
  public void test15()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      simpleNode0.setIdentifier("Monday");
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      assertEquals(0, charArrayWriter0.size());
      assertEquals("", charArrayWriter0.toString());
      assertNotNull(charArrayWriter0);
      
      simpleNode0.dump("Monday", (Writer) charArrayWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertEquals("<VariableDeclaratorId>\n  <identifier>Monday</identifier>\n</VariableDeclaratorId>\n", charArrayWriter0.toString());
      assertEquals(81, charArrayWriter0.size());
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtAddChild(Lcom/soops/CEN4010/JMCA/JParser/Node;I)V: I7 Branch 1 IFNONNULL L60 - false
   */

  @Test
  public void test16()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(21);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      simpleNode0.jjtAddChild((Node) simpleNode0, 21);
      assertEquals(22, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 17
  /*
   * 8 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I246 Branch 22 IFNULL L147 - false
   * Goal 2. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I253 Branch 23 IFLE L147 - false
   * Goal 3. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I278 Branch 24 IFNULL L151 - false
   * Goal 4. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I291 Branch 25 IF_ICMPGE L152 - true
   * Goal 5. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I291 Branch 25 IF_ICMPGE L152 - false
   * Goal 6. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I306 Branch 26 IFNULL L154 - true
   * Goal 7. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I341 Branch 28 IFNULL L159 - false
   * Goal 8. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I348 Branch 29 IFLE L159 - false
   */

  @Test
  public void test17()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(16);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      Node[] nodeArray0 = new Node[1];
      simpleNode0.children = nodeArray0;
      assertEquals(1, simpleNode0.jjtGetNumChildren());
      
      StringWriter stringWriter0 = new StringWriter();
      assertEquals("", stringWriter0.toString());
      assertNotNull(stringWriter0);
      
      simpleNode0.dump("~)", (Writer) stringWriter0);
      assertEquals(1, simpleNode0.jjtGetNumChildren());
      assertEquals("<FieldDeclaration></FieldDeclaration>\n", stringWriter0.toString());
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtSetParent(Lcom/soops/CEN4010/JMCA/JParser/Node;)V: root-Branch
   */

  @Test
  public void test18()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-994));
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      simpleNode0.jjtSetParent((Node) simpleNode0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 19
  /*
   * 13 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I74 Branch 8 IFGT L111 - false
   * Goal 2. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I81 Branch 9 IFGT L111 - false
   * Goal 3. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I88 Branch 10 IFGT L111 - false
   * Goal 4. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I95 Branch 11 IFGT L111 - false
   * Goal 5. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I107 Branch 12 IFLE L114 - true
   * Goal 6. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I123 Branch 14 IFLE L118 - true
   * Goal 7. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I136 Branch 15 IFLE L121 - true
   * Goal 8. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I149 Branch 16 IFLE L124 - true
   * Goal 9. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I162 Branch 17 IFLE L127 - false
   * Goal 10. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I175 Branch 18 IFLE L130 - true
   * Goal 11. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I188 Branch 19 IFLE L133 - true
   * Goal 12. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I201 Branch 20 IFGT L136 - false
   * Goal 13. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I208 Branch 21 IFLE L136 - true
   */

  @Test
  public void test19()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      simpleNode0.setIdentifier("<<");
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      assertEquals(0, charArrayWriter0.size());
      assertEquals("", charArrayWriter0.toString());
      assertNotNull(charArrayWriter0);
      
      simpleNode0.dump((String) null, (Writer) charArrayWriter0);
      assertEquals("<CompilationUnit>\n  <identifier>*lshft</identifier>\n</CompilationUnit>\n", charArrayWriter0.toString());
      assertEquals(71, charArrayWriter0.size());
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 20
  /*
   * 9 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.setIdentifier(Ljava/lang/String;)V: root-Branch
   * Goal 2. com.soops.CEN4010.JMCA.JParser.SimpleNode.toString()Ljava/lang/String;: I19 Branch 4 IFEQ L87 - true
   * Goal 3. com.soops.CEN4010.JMCA.JParser.SimpleNode.toString()Ljava/lang/String;: I19 Branch 4 IFEQ L87 - false
   * Goal 4. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I8 Branch 5 IFLE L103 - false
   * Goal 5. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I39 Branch 6 IFLE L106 - true
   * Goal 6. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I61 Branch 7 IFEQ L110 - true
   * Goal 7. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I61 Branch 7 IFEQ L110 - false
   * Goal 8. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I74 Branch 8 IFGT L111 - true
   * Goal 9. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I335 Branch 27 IFGT L159 - true
   */

  @Test
  public void test20()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      simpleNode0.setIdentifier(";");
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      assertEquals("", charArrayWriter0.toString());
      assertEquals(0, charArrayWriter0.size());
      assertNotNull(charArrayWriter0);
      
      Locale locale0 = Locale.ROOT;
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getISO3Language());
      assertNotNull(locale0);
      
      String string0 = locale0.getDisplayScript();
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getISO3Language());
      assertNotNull(string0);
      assertEquals("", string0);
      
      simpleNode0.dump("", (Writer) charArrayWriter0);
      assertEquals("<CompilationUnit>\n</CompilationUnit>\n", charArrayWriter0.toString());
      assertEquals(37, charArrayWriter0.size());
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      String string1 = simpleNode0.toString();
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertEquals("CompilationUnit : ;", string1);
      assertNotSame(string1, string0);
  }

  //Test case number: 21
  /*
   * 5 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I8 Branch 5 IFLE L103 - true
   * Goal 2. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I246 Branch 22 IFNULL L147 - true
   * Goal 3. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I278 Branch 24 IFNULL L151 - true
   * Goal 4. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I335 Branch 27 IFGT L159 - false
   * Goal 5. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I341 Branch 28 IFNULL L159 - true
   */

  @Test
  public void test21()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(11472);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      StringWriter stringWriter0 = new StringWriter();
      assertEquals("", stringWriter0.toString());
      assertNotNull(stringWriter0);
      
      simpleNode0.dump("QP <1 /^RB|JJ|IN/=left  ( < /JJ|IN/=right <3/^CD|D/ ) | ( <2 /^JJ|IN/ <3 ( INAright < /^(?ias|than)$/ ) <4 /^CD|DT/ ) ] ", (Writer) stringWriter0);
      assertEquals("", stringWriter0.toString());
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 22
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.<init>(I)V: root-Branch
   */

  @Test
  public void test22()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-1356));
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
  }
}

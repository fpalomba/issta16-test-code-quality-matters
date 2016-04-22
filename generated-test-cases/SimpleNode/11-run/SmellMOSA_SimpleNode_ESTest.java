/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 19 12:11:22 GMT 2015
 */

package com.soops.CEN4010.JMCA.JParser;

import static org.junit.Assert.*;
import org.junit.Test;
import com.soops.CEN4010.JMCA.JParser.JavaParser;
import com.soops.CEN4010.JMCA.JParser.Node;
import com.soops.CEN4010.JMCA.JParser.SimpleNode;
import java.io.CharArrayWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
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
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtGetNumChildren()I: I7 Branch 3 IFNONNULL L75 - true
   */

  @Test
  public void test00()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((int) (byte) (-61));
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      Node[] nodeArray0 = new Node[21];
      simpleNode0.children = nodeArray0;
      assertEquals(21, simpleNode0.jjtGetNumChildren());
      
      int int0 = simpleNode0.jjtGetNumChildren();
      assertEquals(21, simpleNode0.jjtGetNumChildren());
      assertEquals(21, int0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtGetParent()Lcom/soops/CEN4010/JMCA/JParser/Node;: root-Branch
   */

  @Test
  public void test01()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(7329);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      Node node0 = simpleNode0.jjtGetParent();
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNull(node0);
  }

  //Test case number: 2
  /*
   * 3 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtSetParent(Lcom/soops/CEN4010/JMCA/JParser/Node;)V: root-Branch
   * Goal 2. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtAddChild(Lcom/soops/CEN4010/JMCA/JParser/Node;I)V: I7 Branch 1 IFNONNULL L60 - false
   * Goal 3. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtAddChild(Lcom/soops/CEN4010/JMCA/JParser/Node;I)V: I29 Branch 2 IF_ICMPLT L62 - true
   */

  @Test
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("UnaryExpres|aon");
      assertNotNull(stringReader0);
      
      JavaParser javaParser0 = new JavaParser((Reader) stringReader0);
      assertFalse(javaParser0.lookingAhead);
      assertNotNull(javaParser0);
      
      javaParser0.ConditionalExpression();
      assertFalse(javaParser0.lookingAhead);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I306 Branch 26 IFNULL L154 - false
   */

  @Test
  public void test03()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((int) (byte)15);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      Node[] nodeArray0 = new Node[18];
      nodeArray0[3] = (Node) simpleNode0;
      simpleNode0.children = nodeArray0;
      assertEquals(18, simpleNode0.jjtGetNumChildren());
      
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("w+3");
      assertNotNull(mockPrintWriter0);
      
      // Undeclared exception!
      try {
        simpleNode0.dump("w+3", (Writer) mockPrintWriter0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 4
  /*
   * 6 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I278 Branch 24 IFNULL L151 - false
   * Goal 2. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I291 Branch 25 IF_ICMPGE L152 - true
   * Goal 3. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I291 Branch 25 IF_ICMPGE L152 - false
   * Goal 4. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I306 Branch 26 IFNULL L154 - true
   * Goal 5. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I341 Branch 28 IFNULL L159 - false
   * Goal 6. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I348 Branch 29 IFLE L159 - false
   */

  @Test
  public void test04()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(14);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      Node[] nodeArray0 = new Node[1];
      simpleNode0.children = nodeArray0;
      assertEquals(1, simpleNode0.jjtGetNumChildren());
      
      MockFileWriter mockFileWriter0 = new MockFileWriter(")", false);
      assertNotNull(mockFileWriter0);
      
      simpleNode0.dump("", (Writer) mockFileWriter0);
      assertEquals(1, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I95 Branch 11 IFGT L111 - true
   */

  @Test
  public void test05()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(15);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      simpleNode0.setIdentifier("");
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      StringWriter stringWriter0 = new StringWriter(15);
      assertEquals("", stringWriter0.toString());
      assertNotNull(stringWriter0);
      
      simpleNode0.dump("", (Writer) stringWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertEquals("<ClassOrInterfaceBodyDeclaration>\n</ClassOrInterfaceBodyDeclaration>\n", stringWriter0.toString());
  }

  //Test case number: 6
  /*
   * 2 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtAddChild(Lcom/soops/CEN4010/JMCA/JParser/Node;I)V: I7 Branch 1 IFNONNULL L60 - true
   * Goal 2. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtAddChild(Lcom/soops/CEN4010/JMCA/JParser/Node;I)V: I29 Branch 2 IF_ICMPLT L62 - false
   */

  @Test
  public void test06()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((int) (byte)54);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      Node[] nodeArray0 = new Node[20];
      simpleNode0.children = nodeArray0;
      assertEquals(20, simpleNode0.jjtGetNumChildren());
      
      simpleNode0.jjtAddChild(nodeArray0[1], (int) (byte)54);
      assertEquals(55, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 7
  /*
   * 2 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I246 Branch 22 IFNULL L147 - false
   * Goal 2. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I253 Branch 23 IFLE L147 - false
   */

  @Test
  public void test07()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((int) (byte) (-50));
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      Node[] nodeArray0 = new Node[18];
      simpleNode0.children = nodeArray0;
      assertEquals(18, simpleNode0.jjtGetNumChildren());
      
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("w+3");
      assertNotNull(mockPrintWriter0);
      
      // Undeclared exception!
      try {
        simpleNode0.dump("w+3", (Writer) mockPrintWriter0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -50
         //
      }
  }

  //Test case number: 8
  /*
   * 3 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtOpen()V: root-Branch
   * Goal 2. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtClose()V: root-Branch
   * Goal 3. com.soops.CEN4010.JMCA.JParser.SimpleNode.<init>(Lcom/soops/CEN4010/JMCA/JParser/JavaParser;I)V: root-Branch
   */

  @Test
  public void test08()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("SBARQ < ((WHNP=what < WP) $+ (SQ=sq < (/^VB/=verb < ");
      assertFalse(javaParser0.lookingAhead);
      assertNotNull(javaParser0);
      
      try {
        javaParser0.AssignmentOperator();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parse error at line 1, column 0.  Encountered: <EOF>
         //
      }
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I175 Branch 18 IFLE L130 - false
   */

  @Test
  public void test09()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(70);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      simpleNode0.setIdentifier("<=");
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      StringWriter stringWriter0 = new StringWriter(70);
      assertEquals("", stringWriter0.toString());
      assertNotNull(stringWriter0);
      
      simpleNode0.dump("<=", (Writer) stringWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertEquals("<Statement>\n  <identifier>*le</identifier>\n</Statement>\n", stringWriter0.toString());
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I136 Branch 15 IFLE L121 - false
   */

  @Test
  public void test10()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(68);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      simpleNode0.setIdentifier(">");
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      StringWriter stringWriter0 = new StringWriter(68);
      assertEquals("", stringWriter0.toString());
      assertNotNull(stringWriter0);
      
      simpleNode0.dump(">", (Writer) stringWriter0);
      assertEquals("<AllocationExpression>\n  <identifier>*gt</identifier>\n</AllocationExpression>\n", stringWriter0.toString());
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.toString(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test11()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      String string0 = simpleNode0.toString("PTBTkenizer untokenized %d tokens at %2ftkens per second.%");
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(string0);
      assertEquals("PTBTkenizer untokenized %d tokens at %2ftkens per second.%CompilationUnit", string0);
  }

  //Test case number: 12
  /*
   * 2 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I149 Branch 16 IFLE L124 - false
   * Goal 2. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I188 Branch 19 IFLE L133 - true
   */

  @Test
  public void test12()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(46);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      simpleNode0.setIdentifier(">>");
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      StringWriter stringWriter0 = new StringWriter(46);
      assertEquals("", stringWriter0.toString());
      assertNotNull(stringWriter0);
      
      simpleNode0.dump(">>", (Writer) stringWriter0);
      assertEquals("<EqualityExpression>\n  <identifier>*rshft</identifier>\n</EqualityExpression>\n", stringWriter0.toString());
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 13
  /*
   * 5 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I8 Branch 5 IFLE L103 - true
   * Goal 2. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I74 Branch 8 IFGT L111 - true
   * Goal 3. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I246 Branch 22 IFNULL L147 - true
   * Goal 4. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I335 Branch 27 IFGT L159 - false
   * Goal 5. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I341 Branch 28 IFNULL L159 - true
   */

  @Test
  public void test13()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      simpleNode0.setIdentifier(";");
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      assertEquals("", charArrayWriter0.toString());
      assertEquals(0, charArrayWriter0.size());
      assertNotNull(charArrayWriter0);
      
      simpleNode0.dump(";", (Writer) charArrayWriter0);
      assertEquals(37, charArrayWriter0.size());
      assertEquals("<CompilationUnit>\n</CompilationUnit>\n", charArrayWriter0.toString());
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      SimpleNode simpleNode1 = new SimpleNode(0);
      assertEquals(0, simpleNode1.jjtGetNumChildren());
      assertNotNull(simpleNode1);
      assertNotSame(simpleNode1, simpleNode0);
      assertFalse(simpleNode1.equals((Object)simpleNode0));
      
      simpleNode1.dump(";", (Writer) charArrayWriter0);
      assertEquals(0, simpleNode1.jjtGetNumChildren());
      assertEquals(37, charArrayWriter0.size());
      assertEquals("<CompilationUnit>\n</CompilationUnit>\n", charArrayWriter0.toString());
      assertNotSame(simpleNode1, simpleNode0);
      assertFalse(simpleNode1.equals((Object)simpleNode0));
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtGetNumChildren()I: I7 Branch 3 IFNONNULL L75 - false
   */

  @Test
  public void test14()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(7391);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      int int0 = simpleNode0.jjtGetNumChildren();
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertEquals(0, int0);
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtGetChild(I)Lcom/soops/CEN4010/JMCA/JParser/Node;: root-Branch
   */

  @Test
  public void test15()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(7390);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      // Undeclared exception!
      try {
        Node node0 = simpleNode0.jjtGetChild(7390);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 16
  /*
   * 20 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.toString()Ljava/lang/String;: I19 Branch 4 IFEQ L87 - true
   * Goal 2. com.soops.CEN4010.JMCA.JParser.SimpleNode.toString()Ljava/lang/String;: I19 Branch 4 IFEQ L87 - false
   * Goal 3. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I39 Branch 6 IFLE L106 - true
   * Goal 4. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I61 Branch 7 IFEQ L110 - true
   * Goal 5. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I61 Branch 7 IFEQ L110 - false
   * Goal 6. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I74 Branch 8 IFGT L111 - false
   * Goal 7. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I81 Branch 9 IFGT L111 - false
   * Goal 8. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I88 Branch 10 IFGT L111 - false
   * Goal 9. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I95 Branch 11 IFGT L111 - false
   * Goal 10. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I107 Branch 12 IFLE L114 - true
   * Goal 11. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I123 Branch 14 IFLE L118 - true
   * Goal 12. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I136 Branch 15 IFLE L121 - true
   * Goal 13. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I149 Branch 16 IFLE L124 - true
   * Goal 14. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I162 Branch 17 IFLE L127 - true
   * Goal 15. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I175 Branch 18 IFLE L130 - true
   * Goal 16. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I188 Branch 19 IFLE L133 - false
   * Goal 17. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I201 Branch 20 IFGT L136 - false
   * Goal 18. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I208 Branch 21 IFLE L136 - true
   * Goal 19. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I278 Branch 24 IFNULL L151 - true
   * Goal 20. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I335 Branch 27 IFGT L159 - true
   */

  @Test
  public void test16()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(34);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      simpleNode0.setIdentifier(">=");
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      StringWriter stringWriter0 = new StringWriter(34);
      assertEquals("", stringWriter0.toString());
      assertNotNull(stringWriter0);
      
      simpleNode0.dump(">=", (Writer) stringWriter0);
      assertEquals("<PrimitiveType>\n  <identifier>*ge</identifier>\n</PrimitiveType>\n", stringWriter0.toString());
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      String string0 = simpleNode0.toString();
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(string0);
      assertEquals("PrimitiveType : >=", string0);
  }

  //Test case number: 17
  /*
   * 3 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.<init>(I)V: root-Branch
   * Goal 2. com.soops.CEN4010.JMCA.JParser.SimpleNode.setIdentifier(Ljava/lang/String;)V: root-Branch
   * Goal 3. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I8 Branch 5 IFLE L103 - false
   */

  @Test
  public void test17()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-925));
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      simpleNode0.setIdentifier(" argument constructor to ");
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      // Undeclared exception!
      try {
        simpleNode0.dump(" argument constructor to ", (Writer) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -925
         //
      }
  }
}

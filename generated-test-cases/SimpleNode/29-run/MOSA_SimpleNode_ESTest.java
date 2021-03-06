/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 19 14:04:40 GMT 2015
 */

package com.soops.CEN4010.JMCA.JParser;

import static org.junit.Assert.*;
import org.junit.Test;
import com.soops.CEN4010.JMCA.JParser.JavaParser;
import com.soops.CEN4010.JMCA.JParser.Node;
import com.soops.CEN4010.JMCA.JParser.SimpleNode;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedReader;
import java.io.Reader;
import java.io.Writer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
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
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I306 Branch 26 IFNULL L154 - false
   */

  @Test
  public void test00()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("ZT8q)ms");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 13);
      Node[] nodeArray0 = new Node[5];
      nodeArray0[0] = (Node) simpleNode0;
      simpleNode0.children = nodeArray0;
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("-Q^", false);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter((OutputStream) mockFileOutputStream0, true);
      // Undeclared exception!
      try {
        simpleNode0.dump("hSy`J@", (Writer) mockPrintWriter0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 1
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
  public void test01()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("ZT8q)ms");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 13);
      Node[] nodeArray0 = new Node[24];
      simpleNode0.children = nodeArray0;
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("-QU^", false);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter((OutputStream) mockFileOutputStream0, false);
      simpleNode0.dump(" !KP~!X(?'snqi]b", (Writer) mockPrintWriter0);
      assertEquals(24, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I208 Branch 21 IFLE L136 - false
   */

  @Test
  public void test02()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("ZT8q)ms");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 13);
      simpleNode0.setIdentifier("&&");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("m[y=rgBP", false);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter((OutputStream) mockFileOutputStream0, true);
      simpleNode0.dump("Literal", (Writer) mockPrintWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I136 Branch 15 IFLE L121 - false
   */

  @Test
  public void test03()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("ZT8q)ms");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 13);
      simpleNode0.setIdentifier(">");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(">", true);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter((OutputStream) mockFileOutputStream0, true);
      simpleNode0.dump((String) null, (Writer) mockPrintWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 4
  /*
   * 3 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I107 Branch 12 IFLE L114 - false
   * Goal 2. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I114 Branch 13 IFGT L114 - false
   * Goal 3. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I188 Branch 19 IFLE L133 - true
   */

  @Test
  public void test04()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("ZPo");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 18);
      simpleNode0.setIdentifier("G0K");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("*lshft", true);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter((OutputStream) mockFileOutputStream0, false);
      simpleNode0.dump("me<'CbT2#", (Writer) mockPrintWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I95 Branch 11 IFGT L111 - true
   */

  @Test
  public void test05()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("ZT8q)ms");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 13);
      simpleNode0.setIdentifier("");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("defence", true);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter((OutputStream) mockFileOutputStream0, true);
      simpleNode0.dump("VariableDeclaratorId", (Writer) mockPrintWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I88 Branch 10 IFGT L111 - true
   */

  @Test
  public void test06()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("ZT8q)ms");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 13);
      simpleNode0.setIdentifier("{");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("overwet", true);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter((OutputStream) mockFileOutputStream0, true);
      simpleNode0.dump("</", (Writer) mockPrintWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I81 Branch 9 IFGT L111 - true
   */

  @Test
  public void test07()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("MethodDeclaration");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 28);
      simpleNode0.setIdentifier("}");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("Kjx1D%C%;#[6", true);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter((OutputStream) mockFileOutputStream0, false);
      simpleNode0.dump("VariableDeclaratorId", (Writer) mockPrintWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I74 Branch 8 IFGT L111 - true
   */

  @Test
  public void test08()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("ZT8^1q)s");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 13);
      simpleNode0.setIdentifier(";");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("-Q^", true);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter((OutputStream) mockFileOutputStream0, false);
      simpleNode0.dump("*le", (Writer) mockPrintWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 9
  /*
   * 18 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I8 Branch 5 IFLE L103 - false
   * Goal 2. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I39 Branch 6 IFLE L106 - true
   * Goal 3. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I61 Branch 7 IFEQ L110 - true
   * Goal 4. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I61 Branch 7 IFEQ L110 - false
   * Goal 5. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I74 Branch 8 IFGT L111 - false
   * Goal 6. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I81 Branch 9 IFGT L111 - false
   * Goal 7. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I88 Branch 10 IFGT L111 - false
   * Goal 8. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I95 Branch 11 IFGT L111 - false
   * Goal 9. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I107 Branch 12 IFLE L114 - true
   * Goal 10. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I123 Branch 14 IFLE L118 - true
   * Goal 11. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I136 Branch 15 IFLE L121 - true
   * Goal 12. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I149 Branch 16 IFLE L124 - true
   * Goal 13. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I162 Branch 17 IFLE L127 - true
   * Goal 14. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I175 Branch 18 IFLE L130 - true
   * Goal 15. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I188 Branch 19 IFLE L133 - false
   * Goal 16. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I201 Branch 20 IFGT L136 - false
   * Goal 17. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I208 Branch 21 IFLE L136 - true
   * Goal 18. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I335 Branch 27 IFGT L159 - true
   */

  @Test
  public void test09()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("ZT8q)ms");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 13);
      simpleNode0.setIdentifier(">=");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("-Q^", false);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter((OutputStream) mockFileOutputStream0, true);
      simpleNode0.dump("hSy`J@", (Writer) mockPrintWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 10
  /*
   * 5 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I8 Branch 5 IFLE L103 - true
   * Goal 2. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I246 Branch 22 IFNULL L147 - true
   * Goal 3. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I278 Branch 24 IFNULL L151 - true
   * Goal 4. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I335 Branch 27 IFGT L159 - false
   * Goal 5. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I341 Branch 28 IFNULL L159 - true
   */

  @Test
  public void test10()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("ZT8q)ms");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 13);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("-QU^", false);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter((OutputStream) mockFileOutputStream0, false);
      simpleNode0.dump(" !KP~!X(?'snqi]b", (Writer) mockPrintWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtGetNumChildren()I: I7 Branch 3 IFNONNULL L75 - false
   */

  @Test
  public void test11()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-2067));
      int int0 = simpleNode0.jjtGetNumChildren();
      assertEquals(0, int0);
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtAddChild(Lcom/soops/CEN4010/JMCA/JParser/Node;I)V: I29 Branch 2 IF_ICMPLT L62 - true
   */

  @Test
  public void test12()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-2035));
      simpleNode0.jjtAddChild((Node) null, 527);
      // Undeclared exception!
      try {
        simpleNode0.jjtAddChild((Node) null, (-2067));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2067
         //
      }
  }

  //Test case number: 13
  /*
   * 2 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtAddChild(Lcom/soops/CEN4010/JMCA/JParser/Node;I)V: I7 Branch 1 IFNONNULL L60 - false
   * Goal 2. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtGetNumChildren()I: I7 Branch 3 IFNONNULL L75 - true
   */

  @Test
  public void test13()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-2067));
      simpleNode0.jjtAddChild((Node) null, 527);
      int int0 = simpleNode0.jjtGetNumChildren();
      assertEquals(528, int0);
  }

  //Test case number: 14
  /*
   * 2 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtAddChild(Lcom/soops/CEN4010/JMCA/JParser/Node;I)V: I7 Branch 1 IFNONNULL L60 - true
   * Goal 2. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtAddChild(Lcom/soops/CEN4010/JMCA/JParser/Node;I)V: I29 Branch 2 IF_ICMPLT L62 - false
   */

  @Test
  public void test14()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(1012);
      Node[] nodeArray0 = new Node[8];
      simpleNode0.children = nodeArray0;
      simpleNode0.jjtAddChild((Node) null, 1012);
      assertEquals(1013, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtGetChild(I)Lcom/soops/CEN4010/JMCA/JParser/Node;: root-Branch
   */

  @Test
  public void test15()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("ZT8q)ms");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 13);
      // Undeclared exception!
      try {
        Node node0 = simpleNode0.jjtGetChild((-1195));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtGetParent()Lcom/soops/CEN4010/JMCA/JParser/Node;: root-Branch
   */

  @Test
  public void test16()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("ZT8q)ms");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 13);
      Node node0 = simpleNode0.jjtGetParent();
      assertNull(node0);
  }

  //Test case number: 17
  @Test
  public void test17()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("ZT8q)ms");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 13);
      String string0 = simpleNode0.toString("ZT8q)ms");
      assertEquals("ZT8q)msTypeBound", string0);
  }

  //Test case number: 18
  /*
   * 4 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.setIdentifier(Ljava/lang/String;)V: root-Branch
   * Goal 2. com.soops.CEN4010.JMCA.JParser.SimpleNode.toString(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   * Goal 3. com.soops.CEN4010.JMCA.JParser.SimpleNode.toString()Ljava/lang/String;: I19 Branch 4 IFEQ L87 - true
   * Goal 4. com.soops.CEN4010.JMCA.JParser.SimpleNode.toString()Ljava/lang/String;: I19 Branch 4 IFEQ L87 - false
   */

  @Test
  public void test18()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("ZT8q)ms");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 13);
      simpleNode0.setIdentifier(">=");
      String string0 = simpleNode0.toString("ZT8q)ms");
      assertEquals("ZT8q)msTypeBound : >=", string0);
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtClose()V: root-Branch
   */

  @Test
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (int) (byte)67, (-1535));
      JavaParser javaParser0 = new JavaParser((InputStream) byteArrayInputStream0);
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 7);
      simpleNode0.jjtClose();
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtSetParent(Lcom/soops/CEN4010/JMCA/JParser/Node;)V: root-Branch
   */

  @Test
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (int) (byte)67, (-1535));
      JavaParser javaParser0 = new JavaParser((InputStream) byteArrayInputStream0);
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 7);
      simpleNode0.jjtSetParent((Node) simpleNode0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 21
  /*
   * 3 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtOpen()V: root-Branch
   * Goal 2. com.soops.CEN4010.JMCA.JParser.SimpleNode.<init>(I)V: root-Branch
   * Goal 3. com.soops.CEN4010.JMCA.JParser.SimpleNode.<init>(Lcom/soops/CEN4010/JMCA/JParser/JavaParser;I)V: root-Branch
   */

  @Test
  public void test21()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      JavaParser javaParser0 = new JavaParser((Reader) pipedReader0);
      try {
        javaParser0.TypeArgument();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parse error at line 1, column 0.  Encountered: <EOF>
         //
      }
  }
}

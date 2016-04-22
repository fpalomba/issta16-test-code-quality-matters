/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 19 13:38:38 GMT 2015
 */

package com.soops.CEN4010.JMCA.JParser;

import static org.junit.Assert.*;
import org.junit.Test;
import com.soops.CEN4010.JMCA.JParser.JavaParser;
import com.soops.CEN4010.JMCA.JParser.Node;
import com.soops.CEN4010.JMCA.JParser.SimpleNode;
import java.io.File;
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
   * 13 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I8 Branch 5 IFLE L103 - true
   * Goal 2. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I246 Branch 22 IFNULL L147 - true
   * Goal 3. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I246 Branch 22 IFNULL L147 - false
   * Goal 4. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I253 Branch 23 IFLE L147 - false
   * Goal 5. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I278 Branch 24 IFNULL L151 - false
   * Goal 6. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I291 Branch 25 IF_ICMPGE L152 - true
   * Goal 7. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I291 Branch 25 IF_ICMPGE L152 - false
   * Goal 8. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I306 Branch 26 IFNULL L154 - true
   * Goal 9. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I306 Branch 26 IFNULL L154 - false
   * Goal 10. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I335 Branch 27 IFGT L159 - false
   * Goal 11. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I341 Branch 28 IFNULL L159 - true
   * Goal 12. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I341 Branch 28 IFNULL L159 - false
   * Goal 13. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I348 Branch 29 IFLE L159 - false
   */

  @Test
  public void test00()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      JavaParser javaParser0 = new JavaParser("");
      SimpleNode simpleNode1 = new SimpleNode(javaParser0, 18);
      simpleNode0.jjtAddChild((Node) simpleNode1, 2);
      MockFile mockFile0 = new MockFile("_,4MT=");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter((File) mockFile0);
      simpleNode0.dump("sighanPostProcessing", (Writer) mockPrintWriter0);
      assertEquals(3, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I208 Branch 21 IFLE L136 - false
   */

  @Test
  public void test01()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(5);
      simpleNode0.setIdentifier("&&");
      MockFile mockFile0 = new MockFile("b");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter((File) mockFile0);
      simpleNode0.dump("------------- CCprocessed dependencies --------", (Writer) mockPrintWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I201 Branch 20 IFGT L136 - true
   */

  @Test
  public void test02()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(5);
      simpleNode0.setIdentifier("&");
      MockFile mockFile0 = new MockFile("b");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter((File) mockFile0);
      simpleNode0.dump("------------- CCprocessed dependencies --------", (Writer) mockPrintWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I188 Branch 19 IFLE L133 - false
   */

  @Test
  public void test03()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 9);
      simpleNode0.setIdentifier(">=");
      MockFile mockFile0 = new MockFile(">1");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter((File) mockFile0);
      simpleNode0.dump("a&", (Writer) mockPrintWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I175 Branch 18 IFLE L130 - false
   */

  @Test
  public void test04()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 9);
      simpleNode0.setIdentifier("<=");
      MockFile mockFile0 = new MockFile("&&");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter((File) mockFile0);
      simpleNode0.dump(".", (Writer) mockPrintWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I149 Branch 16 IFLE L124 - false
   */

  @Test
  public void test05()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.setIdentifier(">>");
      MockFile mockFile0 = new MockFile(">>");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter((File) mockFile0);
      simpleNode0.dump("EnumDeclaration", (Writer) mockPrintWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I136 Branch 15 IFLE L121 - false
   */

  @Test
  public void test06()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 9);
      simpleNode0.setIdentifier(">");
      MockFile mockFile0 = new MockFile(">1");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter((File) mockFile0);
      simpleNode0.dump("a&", (Writer) mockPrintWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I123 Branch 14 IFLE L118 - false
   */

  @Test
  public void test07()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 9);
      simpleNode0.setIdentifier("<");
      MockFile mockFile0 = new MockFile("&&");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter((File) mockFile0);
      simpleNode0.dump("rZ<j&&rb", (Writer) mockPrintWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 8
  /*
   * 2 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I107 Branch 12 IFLE L114 - true
   * Goal 2. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I162 Branch 17 IFLE L127 - false
   */

  @Test
  public void test08()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.setIdentifier("<<");
      MockFile mockFile0 = new MockFile("endeavoured");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter((File) mockFile0);
      simpleNode0.dump("YQ@y&e>X)vw5uQ^n:;", (Writer) mockPrintWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I95 Branch 11 IFGT L111 - true
   */

  @Test
  public void test09()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      simpleNode0.setIdentifier("");
      MockFile mockFile0 = new MockFile("_,4MT=");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter((File) mockFile0);
      simpleNode0.dump("sighanPostPoessing", (Writer) mockPrintWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I88 Branch 10 IFGT L111 - true
   */

  @Test
  public void test10()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.setIdentifier("{");
      MockFile mockFile0 = new MockFile("erde5avoured");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter((File) mockFile0);
      simpleNode0.dump("YQ@y&e>X)vw5uQ^n:;", (Writer) mockPrintWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I81 Branch 9 IFGT L111 - true
   */

  @Test
  public void test11()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      simpleNode0.setIdentifier("}");
      MockFile mockFile0 = new MockFile("_,4MT=");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter((File) mockFile0);
      simpleNode0.dump("sighanPostPoessing", (Writer) mockPrintWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I74 Branch 8 IFGT L111 - true
   */

  @Test
  public void test12()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      simpleNode0.setIdentifier(";");
      MockFile mockFile0 = new MockFile("F^Q+)v");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter((File) mockFile0);
      simpleNode0.dump("&&", (Writer) mockPrintWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 13
  /*
   * 20 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I8 Branch 5 IFLE L103 - false
   * Goal 2. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I39 Branch 6 IFLE L106 - true
   * Goal 3. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I61 Branch 7 IFEQ L110 - true
   * Goal 4. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I61 Branch 7 IFEQ L110 - false
   * Goal 5. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I74 Branch 8 IFGT L111 - false
   * Goal 6. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I81 Branch 9 IFGT L111 - false
   * Goal 7. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I88 Branch 10 IFGT L111 - false
   * Goal 8. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I95 Branch 11 IFGT L111 - false
   * Goal 9. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I107 Branch 12 IFLE L114 - false
   * Goal 10. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I114 Branch 13 IFGT L114 - false
   * Goal 11. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I123 Branch 14 IFLE L118 - true
   * Goal 12. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I136 Branch 15 IFLE L121 - true
   * Goal 13. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I149 Branch 16 IFLE L124 - true
   * Goal 14. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I162 Branch 17 IFLE L127 - true
   * Goal 15. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I175 Branch 18 IFLE L130 - true
   * Goal 16. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I188 Branch 19 IFLE L133 - true
   * Goal 17. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I201 Branch 20 IFGT L136 - false
   * Goal 18. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I208 Branch 21 IFLE L136 - true
   * Goal 19. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I278 Branch 24 IFNULL L151 - true
   * Goal 20. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I335 Branch 27 IFGT L159 - true
   */

  @Test
  public void test13()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      simpleNode0.setIdentifier("/7+lM");
      MockFile mockFile0 = new MockFile("_,4MT=");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter((File) mockFile0);
      simpleNode0.dump("sighanPostProcessing", (Writer) mockPrintWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtGetNumChildren()I: I7 Branch 3 IFNONNULL L75 - false
   */

  @Test
  public void test14()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("}_akZ (!X>`yl,QWz");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 918);
      int int0 = simpleNode0.jjtGetNumChildren();
      assertEquals(0, int0);
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtGetNumChildren()I: I7 Branch 3 IFNONNULL L75 - true
   */

  @Test
  public void test15()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.jjtAddChild((Node) simpleNode0, 2);
      int int0 = simpleNode0.jjtGetNumChildren();
      assertEquals(3, int0);
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtAddChild(Lcom/soops/CEN4010/JMCA/JParser/Node;I)V: I29 Branch 2 IF_ICMPLT L62 - true
   */

  @Test
  public void test16()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.jjtAddChild((Node) simpleNode0, 2);
      simpleNode0.jjtAddChild((Node) null, 0);
      assertEquals(3, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 17
  /*
   * 3 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtAddChild(Lcom/soops/CEN4010/JMCA/JParser/Node;I)V: I7 Branch 1 IFNONNULL L60 - true
   * Goal 2. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtAddChild(Lcom/soops/CEN4010/JMCA/JParser/Node;I)V: I7 Branch 1 IFNONNULL L60 - false
   * Goal 3. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtAddChild(Lcom/soops/CEN4010/JMCA/JParser/Node;I)V: I29 Branch 2 IF_ICMPLT L62 - false
   */

  @Test
  public void test17()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      simpleNode0.jjtAddChild((Node) simpleNode0, 2);
      simpleNode0.jjtAddChild((Node) null, 18);
      assertEquals(19, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtGetChild(I)Lcom/soops/CEN4010/JMCA/JParser/Node;: root-Branch
   */

  @Test
  public void test18()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(34);
      // Undeclared exception!
      try {
        Node node0 = simpleNode0.jjtGetChild((-163));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtGetParent()Lcom/soops/CEN4010/JMCA/JParser/Node;: root-Branch
   */

  @Test
  public void test19()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      Node node0 = simpleNode0.jjtGetParent();
      assertNull(node0);
  }

  //Test case number: 20
  @Test
  public void test20()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      String string0 = simpleNode0.toString("yoikf eXMgB'Kwb&");
      assertEquals("yoikf eXMgB'Kwb&VariableDeclaratorId", string0);
  }

  //Test case number: 21
  /*
   * 4 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.setIdentifier(Ljava/lang/String;)V: root-Branch
   * Goal 2. com.soops.CEN4010.JMCA.JParser.SimpleNode.toString(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   * Goal 3. com.soops.CEN4010.JMCA.JParser.SimpleNode.toString()Ljava/lang/String;: I19 Branch 4 IFEQ L87 - true
   * Goal 4. com.soops.CEN4010.JMCA.JParser.SimpleNode.toString()Ljava/lang/String;: I19 Branch 4 IFEQ L87 - false
   */

  @Test
  public void test21()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      simpleNode0.setIdentifier("/7+lM");
      String string0 = simpleNode0.toString("yoikf eXMgB'Kwb&");
      assertEquals("yoikf eXMgB'Kwb&VariableDeclaratorId : /7+lM", string0);
  }

  //Test case number: 22
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtClose()V: root-Branch
   */

  @Test
  public void test22()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      simpleNode0.jjtClose();
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 23
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtSetParent(Lcom/soops/CEN4010/JMCA/JParser/Node;)V: root-Branch
   */

  @Test
  public void test23()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 9);
      simpleNode0.jjtSetParent((Node) simpleNode0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 24
  /*
   * 3 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtOpen()V: root-Branch
   * Goal 2. com.soops.CEN4010.JMCA.JParser.SimpleNode.<init>(I)V: root-Branch
   * Goal 3. com.soops.CEN4010.JMCA.JParser.SimpleNode.<init>(Lcom/soops/CEN4010/JMCA/JParser/JavaParser;I)V: root-Branch
   */

  @Test
  public void test24()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("FormalParameters");
      try {
        javaParser0.ArrayDimsAndInits();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parse error at line 1, column 0.  Encountered: <EOF>
         //
      }
  }
}
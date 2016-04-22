/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 19 12:39:41 GMT 2015
 */

package com.soops.CEN4010.JMCA.JParser;

import static org.junit.Assert.*;
import org.junit.Test;
import com.soops.CEN4010.JMCA.JParser.JavaParser;
import com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager;
import com.soops.CEN4010.JMCA.JParser.Node;
import com.soops.CEN4010.JMCA.JParser.SimpleNode;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.TooManyResourcesException;
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
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I188 Branch 19 IFLE L133 - false
   */

  @Test
  public void test00()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser((Reader) null);
      assertNotNull(javaParser0);
      assertFalse(javaParser0.lookingAhead);
      
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 21);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      assertFalse(javaParser0.lookingAhead);
      
      simpleNode0.setIdentifier(">=");
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertFalse(javaParser0.lookingAhead);
      
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("Y");
      assertNotNull(mockPrintWriter0);
      
      simpleNode0.dump(">=", (Writer) mockPrintWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertFalse(javaParser0.lookingAhead);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I306 Branch 26 IFNULL L154 - true
   */

  @Test
  public void test01()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(60);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      simpleNode0.jjtAddChild((Node) simpleNode0, 596);
      assertEquals(597, simpleNode0.jjtGetNumChildren());
      
      MockFileWriter mockFileWriter0 = new MockFileWriter("g");
      assertNotNull(mockFileWriter0);
      
      // Undeclared exception!
      try {
        simpleNode0.dump("g", (Writer) mockFileWriter0);
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 100000
         //
      }
  }

  //Test case number: 2
  /*
   * 4 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtAddChild(Lcom/soops/CEN4010/JMCA/JParser/Node;I)V: I7 Branch 1 IFNONNULL L60 - true
   * Goal 2. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtAddChild(Lcom/soops/CEN4010/JMCA/JParser/Node;I)V: I29 Branch 2 IF_ICMPLT L62 - true
   * Goal 3. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtAddChild(Lcom/soops/CEN4010/JMCA/JParser/Node;I)V: I29 Branch 2 IF_ICMPLT L62 - false
   * Goal 4. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtGetNumChildren()I: I7 Branch 3 IFNONNULL L75 - true
   */

  @Test
  public void test02()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(1674);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      simpleNode0.jjtAddChild((Node) simpleNode0, 1674);
      assertEquals(1675, simpleNode0.jjtGetNumChildren());
      
      simpleNode0.jjtAddChild((Node) simpleNode0, 1674);
      assertEquals(1675, simpleNode0.jjtGetNumChildren());
      
      int int0 = simpleNode0.jjtGetNumChildren();
      assertEquals(1675, simpleNode0.jjtGetNumChildren());
      assertEquals(1675, int0);
      
      simpleNode0.jjtAddChild((Node) simpleNode0, 1675);
      assertEquals(1676, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I175 Branch 18 IFLE L130 - false
   */

  @Test
  public void test03()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(46);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      simpleNode0.setIdentifier("<=");
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("<=");
      assertNotNull(mockPrintWriter0);
      
      simpleNode0.dump("<=", (Writer) mockPrintWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I162 Branch 17 IFLE L127 - false
   */

  @Test
  public void test04()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(36);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      String string0 = simpleNode0.toString();
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(string0);
      assertEquals("Name", string0);
      
      simpleNode0.setIdentifier("<<");
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("Name");
      assertNotNull(mockPrintWriter0);
      
      simpleNode0.dump("Name", (Writer) mockPrintWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I201 Branch 20 IFGT L136 - true
   */

  @Test
  public void test05()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(36);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      String string0 = simpleNode0.toString();
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(string0);
      assertEquals("Name", string0);
      
      simpleNode0.setIdentifier("&");
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("Name");
      assertNotNull(mockPrintWriter0);
      
      simpleNode0.dump("Name", (Writer) mockPrintWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtGetNumChildren()I: I7 Branch 3 IFNONNULL L75 - false
   */

  @Test
  public void test06()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-4081));
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      int int0 = simpleNode0.jjtGetNumChildren();
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertEquals(0, int0);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I136 Branch 15 IFLE L121 - false
   */

  @Test
  public void test07()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser((Reader) null);
      assertNotNull(javaParser0);
      assertFalse(javaParser0.lookingAhead);
      
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 22);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      assertFalse(javaParser0.lookingAhead);
      
      simpleNode0.setIdentifier(">");
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertFalse(javaParser0.lookingAhead);
      
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(">");
      assertNotNull(mockPrintWriter0);
      
      simpleNode0.dump(">", (Writer) mockPrintWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertFalse(javaParser0.lookingAhead);
  }

  //Test case number: 8
  /*
   * 2 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtOpen()V: root-Branch
   * Goal 2. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtClose()V: root-Branch
   */

  @Test
  public void test08()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("z");
      assertNotNull(javaParser0);
      assertFalse(javaParser0.lookingAhead);
      
      try {
        javaParser0.ContinueStatement();
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
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtGetParent()Lcom/soops/CEN4010/JMCA/JParser/Node;: root-Branch
   */

  @Test
  public void test09()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(13);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      Node node0 = simpleNode0.jjtGetParent();
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNull(node0);
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtGetChild(I)Lcom/soops/CEN4010/JMCA/JParser/Node;: root-Branch
   */

  @Test
  public void test10()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      // Undeclared exception!
      try {
        Node node0 = simpleNode0.jjtGetChild(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I95 Branch 11 IFGT L111 - true
   */

  @Test
  public void test11()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser((Reader) null);
      assertNotNull(javaParser0);
      assertFalse(javaParser0.lookingAhead);
      
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 43);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      assertFalse(javaParser0.lookingAhead);
      
      simpleNode0.setIdentifier("");
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertFalse(javaParser0.lookingAhead);
      
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("!7<' z#Mn");
      assertNotNull(mockPrintWriter0);
      
      simpleNode0.dump("!7<' z#Mn", (Writer) mockPrintWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertFalse(javaParser0.lookingAhead);
  }

  //Test case number: 12
  /*
   * 16 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I39 Branch 6 IFLE L106 - true
   * Goal 2. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I61 Branch 7 IFEQ L110 - true
   * Goal 3. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I61 Branch 7 IFEQ L110 - false
   * Goal 4. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I74 Branch 8 IFGT L111 - false
   * Goal 5. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I81 Branch 9 IFGT L111 - false
   * Goal 6. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I88 Branch 10 IFGT L111 - false
   * Goal 7. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I95 Branch 11 IFGT L111 - false
   * Goal 8. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I107 Branch 12 IFLE L114 - true
   * Goal 9. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I123 Branch 14 IFLE L118 - true
   * Goal 10. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I136 Branch 15 IFLE L121 - true
   * Goal 11. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I149 Branch 16 IFLE L124 - true
   * Goal 12. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I162 Branch 17 IFLE L127 - true
   * Goal 13. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I175 Branch 18 IFLE L130 - true
   * Goal 14. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I188 Branch 19 IFLE L133 - true
   * Goal 15. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I201 Branch 20 IFGT L136 - false
   * Goal 16. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I208 Branch 21 IFLE L136 - true
   */

  @Test
  public void test12()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser((Reader) null);
      assertNotNull(javaParser0);
      assertFalse(javaParser0.lookingAhead);
      
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 40);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      assertFalse(javaParser0.lookingAhead);
      
      simpleNode0.setIdentifier("M");
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertFalse(javaParser0.lookingAhead);
      
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("M");
      assertNotNull(mockPrintWriter0);
      
      simpleNode0.dump("M", (Writer) mockPrintWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertFalse(javaParser0.lookingAhead);
  }

  //Test case number: 13
  /*
   * 3 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I8 Branch 5 IFLE L103 - false
   * Goal 2. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I39 Branch 6 IFLE L106 - false
   * Goal 3. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I335 Branch 27 IFGT L159 - true
   */

  @Test
  public void test13()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser((Reader) null);
      assertNotNull(javaParser0);
      assertFalse(javaParser0.lookingAhead);
      
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 63);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      assertFalse(javaParser0.lookingAhead);
      
      simpleNode0.setIdentifier("{");
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertFalse(javaParser0.lookingAhead);
      
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("{");
      assertNotNull(mockPrintWriter0);
      
      simpleNode0.dump("{", (Writer) mockPrintWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertFalse(javaParser0.lookingAhead);
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtSetParent(Lcom/soops/CEN4010/JMCA/JParser/Node;)V: root-Branch
   */

  @Test
  public void test14()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(13);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      simpleNode0.jjtSetParent((Node) simpleNode0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 15
  /*
   * 10 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.<init>(Lcom/soops/CEN4010/JMCA/JParser/JavaParser;I)V: root-Branch
   * Goal 2. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtAddChild(Lcom/soops/CEN4010/JMCA/JParser/Node;I)V: I7 Branch 1 IFNONNULL L60 - false
   * Goal 3. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I246 Branch 22 IFNULL L147 - false
   * Goal 4. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I253 Branch 23 IFLE L147 - false
   * Goal 5. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I278 Branch 24 IFNULL L151 - false
   * Goal 6. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I291 Branch 25 IF_ICMPGE L152 - true
   * Goal 7. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I291 Branch 25 IF_ICMPGE L152 - false
   * Goal 8. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I306 Branch 26 IFNULL L154 - false
   * Goal 9. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I341 Branch 28 IFNULL L159 - false
   * Goal 10. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I348 Branch 29 IFLE L159 - false
   */

  @Test
  public void test15()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      JavaParser javaParser0 = new JavaParser((JavaParserTokenManager) null);
      assertNotNull(javaParser0);
      assertFalse(javaParser0.lookingAhead);
      
      SimpleNode simpleNode1 = new SimpleNode(javaParser0, 0);
      assertEquals(0, simpleNode1.jjtGetNumChildren());
      assertNotNull(simpleNode1);
      assertNotSame(simpleNode1, simpleNode0);
      assertFalse(simpleNode1.equals((Object)simpleNode0));
      assertFalse(javaParser0.lookingAhead);
      
      simpleNode1.jjtAddChild((Node) simpleNode0, 0);
      assertEquals(1, simpleNode1.jjtGetNumChildren());
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotSame(simpleNode1, simpleNode0);
      assertNotSame(simpleNode0, simpleNode1);
      assertFalse(simpleNode1.equals((Object)simpleNode0));
      assertFalse(simpleNode0.equals((Object)simpleNode1));
      assertFalse(javaParser0.lookingAhead);
      
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("!7<' z#Mn");
      assertNotNull(mockPrintWriter0);
      
      simpleNode1.dump("!7<' z#Mn", (Writer) mockPrintWriter0);
      assertEquals(1, simpleNode1.jjtGetNumChildren());
      assertNotSame(simpleNode1, simpleNode0);
      assertFalse(simpleNode1.equals((Object)simpleNode0));
      assertFalse(javaParser0.lookingAhead);
  }

  //Test case number: 16
  /*
   * 4 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.setIdentifier(Ljava/lang/String;)V: root-Branch
   * Goal 2. com.soops.CEN4010.JMCA.JParser.SimpleNode.toString(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   * Goal 3. com.soops.CEN4010.JMCA.JParser.SimpleNode.toString()Ljava/lang/String;: I19 Branch 4 IFEQ L87 - true
   * Goal 4. com.soops.CEN4010.JMCA.JParser.SimpleNode.toString()Ljava/lang/String;: I19 Branch 4 IFEQ L87 - false
   */

  @Test
  public void test16()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(23);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      simpleNode0.setIdentifier(">3@HNhAheHA1==m7t-,S");
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      String string0 = simpleNode0.toString(">3@HNhAheHA1==m7t-,S");
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(string0);
      assertEquals(">3@HNhAheHA1==m7t-,SFormalParameters : >3@HNhAheHA1==m7t-,S", string0);
  }

  //Test case number: 17
  /*
   * 6 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.<init>(I)V: root-Branch
   * Goal 2. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I8 Branch 5 IFLE L103 - true
   * Goal 3. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I246 Branch 22 IFNULL L147 - true
   * Goal 4. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I278 Branch 24 IFNULL L151 - true
   * Goal 5. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I335 Branch 27 IFGT L159 - false
   * Goal 6. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I341 Branch 28 IFNULL L159 - true
   */

  @Test
  public void test17()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-4081));
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertNotNull(simpleNode0);
      
      StringWriter stringWriter0 = new StringWriter(2605);
      assertEquals("", stringWriter0.toString());
      assertNotNull(stringWriter0);
      
      simpleNode0.dump(">", (Writer) stringWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertEquals("", stringWriter0.toString());
  }
}

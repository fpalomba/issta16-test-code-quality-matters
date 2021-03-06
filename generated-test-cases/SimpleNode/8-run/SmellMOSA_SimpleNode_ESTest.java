/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 19 12:04:23 GMT 2015
 */

package com.soops.CEN4010.JMCA.JParser;

import static org.junit.Assert.*;
import org.junit.Test;
import com.soops.CEN4010.JMCA.JParser.JavaParser;
import com.soops.CEN4010.JMCA.JParser.Node;
import com.soops.CEN4010.JMCA.JParser.SimpleNode;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
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
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtGetParent()Lcom/soops/CEN4010/JMCA/JParser/Node;: root-Branch
   */

  @Test
  public void test00()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(1412);
      assertNotNull(simpleNode0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      Node node0 = simpleNode0.jjtGetParent();
      assertNull(node0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtGetNumChildren()I: I7 Branch 3 IFNONNULL L75 - false
   */

  @Test
  public void test01()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(1412);
      assertNotNull(simpleNode0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      int int0 = simpleNode0.jjtGetNumChildren();
      assertEquals(0, int0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I88 Branch 10 IFGT L111 - true
   */

  @Test
  public void test02()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      assertNotNull(simpleNode0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      assertNotNull(arrayList0);
      assertEquals(0, arrayList0.size());
      assertTrue(arrayList0.isEmpty());
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      assertNotNull(charArrayWriter0);
      assertEquals("", charArrayWriter0.toString());
      assertEquals(0, charArrayWriter0.size());
      
      boolean boolean0 = arrayList0.add("{");
      assertTrue(boolean0);
      assertEquals(1, arrayList0.size());
      assertFalse(arrayList0.isEmpty());
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      simpleNode0.dump("{", (Writer) charArrayWriter0);
      assertEquals(47, charArrayWriter0.size());
      assertEquals("<VariableDeclaratorId>\n</VariableDeclaratorId>\n", charArrayWriter0.toString());
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I306 Branch 26 IFNULL L154 - false
   */

  @Test
  public void test03()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(17);
      assertNotNull(simpleNode0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      simpleNode0.jjtAddChild((Node) simpleNode0, 17);
      assertEquals(18, simpleNode0.jjtGetNumChildren());
      
      StringWriter stringWriter0 = new StringWriter();
      assertNotNull(stringWriter0);
      assertEquals("", stringWriter0.toString());
      
      // Undeclared exception!
      try {
        simpleNode0.dump("ba^Sh{kdq'OCm", (Writer) stringWriter0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I201 Branch 20 IFGT L136 - true
   */

  @Test
  public void test04()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      assertNotNull(simpleNode0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      assertNotNull(arrayList0);
      assertEquals(0, arrayList0.size());
      assertTrue(arrayList0.isEmpty());
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      assertNotNull(charArrayWriter0);
      assertEquals(0, charArrayWriter0.size());
      assertEquals("", charArrayWriter0.toString());
      
      boolean boolean0 = arrayList0.add("&");
      assertTrue(boolean0);
      assertFalse(arrayList0.isEmpty());
      assertEquals(1, arrayList0.size());
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      simpleNode0.dump("&", (Writer) charArrayWriter0);
      assertEquals("<CompilationUnit>\n  <identifier>*amp</identifier>\n</CompilationUnit>\n", charArrayWriter0.toString());
      assertEquals(69, charArrayWriter0.size());
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.toString()Ljava/lang/String;: I19 Branch 4 IFEQ L87 - false
   */

  @Test
  public void test05()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      assertNotNull(simpleNode0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      assertNotNull(arrayList0);
      assertTrue(arrayList0.isEmpty());
      assertEquals(0, arrayList0.size());
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      boolean boolean0 = arrayList0.add("");
      assertTrue(boolean0);
      assertEquals(1, arrayList0.size());
      assertFalse(arrayList0.isEmpty());
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      String string0 = simpleNode0.toString();
      assertEquals("VariableDeclaratorId : ", string0);
      assertNotNull(string0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I95 Branch 11 IFGT L111 - true
   */

  @Test
  public void test06()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      assertNotNull(simpleNode0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      assertNotNull(arrayList0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertEquals(0, arrayList0.size());
      assertTrue(arrayList0.isEmpty());
      
      boolean boolean0 = arrayList0.add("");
      assertTrue(boolean0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertFalse(arrayList0.isEmpty());
      assertEquals(1, arrayList0.size());
      
      StringWriter stringWriter0 = new StringWriter();
      assertNotNull(stringWriter0);
      assertEquals("", stringWriter0.toString());
      
      simpleNode0.dump("", (Writer) stringWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertEquals("<VariableDeclaratorId>\n</VariableDeclaratorId>\n", stringWriter0.toString());
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I162 Branch 17 IFLE L127 - false
   */

  @Test
  public void test07()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(21);
      assertNotNull(simpleNode0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      assertNotNull(arrayList0);
      assertTrue(arrayList0.isEmpty());
      assertEquals(0, arrayList0.size());
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      assertNotNull(charArrayWriter0);
      assertEquals(0, charArrayWriter0.size());
      assertEquals("", charArrayWriter0.toString());
      
      boolean boolean0 = arrayList0.add("<<");
      assertTrue(boolean0);
      assertEquals(1, arrayList0.size());
      assertFalse(arrayList0.isEmpty());
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      simpleNode0.dump("<<", (Writer) charArrayWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertEquals("<MethodDeclaration>\n  <identifier>*lshft</identifier>\n</MethodDeclaration>\n", charArrayWriter0.toString());
      assertEquals(75, charArrayWriter0.size());
  }

  //Test case number: 8
  /*
   * 2 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I107 Branch 12 IFLE L114 - false
   * Goal 2. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I114 Branch 13 IFGT L114 - false
   */

  @Test
  public void test08()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      assertNotNull(simpleNode0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      assertNotNull(arrayList0);
      assertTrue(arrayList0.isEmpty());
      assertEquals(0, arrayList0.size());
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      assertNotNull(charArrayWriter0);
      assertEquals("", charArrayWriter0.toString());
      assertEquals(0, charArrayWriter0.size());
      
      boolean boolean0 = arrayList0.add("I");
      assertTrue(boolean0);
      assertEquals(1, arrayList0.size());
      assertFalse(arrayList0.isEmpty());
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      simpleNode0.dump("I", (Writer) charArrayWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertEquals(76, charArrayWriter0.size());
      assertEquals("<VariableDeclaratorId>\n  <identifier>I</identifier>\n</VariableDeclaratorId>\n", charArrayWriter0.toString());
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I149 Branch 16 IFLE L124 - false
   */

  @Test
  public void test09()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(36);
      assertNotNull(simpleNode0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      assertNotNull(arrayList0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertEquals(0, arrayList0.size());
      assertTrue(arrayList0.isEmpty());
      
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      assertNotNull(charArrayWriter0);
      assertEquals("", charArrayWriter0.toString());
      assertEquals(0, charArrayWriter0.size());
      
      boolean boolean0 = arrayList0.add(">>");
      assertTrue(boolean0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertFalse(arrayList0.isEmpty());
      assertEquals(1, arrayList0.size());
      
      simpleNode0.dump(">>", (Writer) charArrayWriter0);
      assertEquals("<Name>\n  <identifier>*rshft</identifier>\n</Name>\n", charArrayWriter0.toString());
      assertEquals(49, charArrayWriter0.size());
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtAddChild(Lcom/soops/CEN4010/JMCA/JParser/Node;I)V: I29 Branch 2 IF_ICMPLT L62 - true
   */

  @Test
  public void test10()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      assertNotNull(simpleNode0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      simpleNode0.jjtAddChild((Node) simpleNode0, 0);
      assertEquals(1, simpleNode0.jjtGetNumChildren());
      
      simpleNode0.jjtAddChild((Node) simpleNode0, 0);
      assertEquals(1, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 11
  /*
   * 2 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I246 Branch 22 IFNULL L147 - true
   * Goal 2. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I341 Branch 28 IFNULL L159 - true
   */

  @Test
  public void test11()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(1417);
      assertNotNull(simpleNode0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      PipedWriter pipedWriter0 = new PipedWriter();
      assertNotNull(pipedWriter0);
      
      simpleNode0.dump(" : ", (Writer) pipedWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtGetChild(I)Lcom/soops/CEN4010/JMCA/JParser/Node;: root-Branch
   */

  @Test
  public void test12()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(583);
      assertNotNull(simpleNode0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      // Undeclared exception!
      try {
        Node node0 = simpleNode0.jjtGetChild(583);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 13
  /*
   * 2 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtAddChild(Lcom/soops/CEN4010/JMCA/JParser/Node;I)V: I7 Branch 1 IFNONNULL L60 - true
   * Goal 2. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtAddChild(Lcom/soops/CEN4010/JMCA/JParser/Node;I)V: I29 Branch 2 IF_ICMPLT L62 - false
   */

  @Test
  public void test13()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(7892);
      assertNotNull(simpleNode0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      simpleNode0.jjtAddChild((Node) simpleNode0, 0);
      assertEquals(1, simpleNode0.jjtGetNumChildren());
      
      simpleNode0.jjtAddChild((Node) simpleNode0, 7892);
      assertEquals(7893, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.toString(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test14()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(3954);
      assertNotNull(simpleNode0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      // Undeclared exception!
      try {
        String string0 = simpleNode0.toString(" ");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3954
         //
      }
  }

  //Test case number: 15
  /*
   * 3 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtOpen()V: root-Branch
   * Goal 2. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtClose()V: root-Branch
   * Goal 3. com.soops.CEN4010.JMCA.JParser.SimpleNode.setIdentifier(Ljava/lang/String;)V: root-Branch
   */

  @Test
  public void test15()  throws Throwable  {
      char[] charArray0 = new char[10];
      charArray0[0] = 'a';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      assertNotNull(charArrayReader0);
      assertArrayEquals(new char[] {'a', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
      
      JavaParser javaParser0 = new JavaParser((Reader) charArrayReader0);
      assertNotNull(javaParser0);
      assertFalse(javaParser0.lookingAhead);
      assertArrayEquals(new char[] {'a', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
      
      // Undeclared exception!
      try {
        javaParser0.VariableDeclaratorId();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Lexical error at line 1, column 2.  Encountered: \"\" (0), after : \"\"
         //
      }
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I81 Branch 9 IFGT L111 - true
   */

  @Test
  public void test16()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(82);
      assertNotNull(simpleNode0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      assertNotNull(arrayList0);
      assertEquals(0, arrayList0.size());
      assertTrue(arrayList0.isEmpty());
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      assertNotNull(charArrayWriter0);
      assertEquals("", charArrayWriter0.toString());
      assertEquals(0, charArrayWriter0.size());
      
      boolean boolean0 = arrayList0.add("}");
      assertTrue(boolean0);
      assertEquals(1, arrayList0.size());
      assertFalse(arrayList0.isEmpty());
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      simpleNode0.dump("}", (Writer) charArrayWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertEquals(29, charArrayWriter0.size());
      assertEquals("<DoStatement>\n</DoStatement>\n", charArrayWriter0.toString());
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I123 Branch 14 IFLE L118 - false
   */

  @Test
  public void test17()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(36);
      assertNotNull(simpleNode0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      assertNotNull(arrayList0);
      assertTrue(arrayList0.isEmpty());
      assertEquals(0, arrayList0.size());
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      assertNotNull(charArrayWriter0);
      assertEquals("", charArrayWriter0.toString());
      assertEquals(0, charArrayWriter0.size());
      
      boolean boolean0 = arrayList0.add("<");
      assertTrue(boolean0);
      assertEquals(1, arrayList0.size());
      assertFalse(arrayList0.isEmpty());
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      simpleNode0.dump("<", (Writer) charArrayWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertEquals(46, charArrayWriter0.size());
      assertEquals("<Name>\n  <identifier>*lt</identifier>\n</Name>\n", charArrayWriter0.toString());
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtGetNumChildren()I: I7 Branch 3 IFNONNULL L75 - true
   */

  @Test
  public void test18()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(10);
      assertNotNull(simpleNode0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      simpleNode0.jjtAddChild((Node) simpleNode0, 10);
      assertEquals(11, simpleNode0.jjtGetNumChildren());
      
      int int0 = simpleNode0.jjtGetNumChildren();
      assertEquals(11, int0);
      assertEquals(11, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 19
  /*
   * 11 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtAddChild(Lcom/soops/CEN4010/JMCA/JParser/Node;I)V: I7 Branch 1 IFNONNULL L60 - false
   * Goal 2. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I8 Branch 5 IFLE L103 - true
   * Goal 3. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I246 Branch 22 IFNULL L147 - false
   * Goal 4. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I253 Branch 23 IFLE L147 - false
   * Goal 5. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I278 Branch 24 IFNULL L151 - false
   * Goal 6. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I291 Branch 25 IF_ICMPGE L152 - true
   * Goal 7. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I291 Branch 25 IF_ICMPGE L152 - false
   * Goal 8. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I306 Branch 26 IFNULL L154 - true
   * Goal 9. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I335 Branch 27 IFGT L159 - false
   * Goal 10. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I341 Branch 28 IFNULL L159 - false
   * Goal 11. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I348 Branch 29 IFLE L159 - false
   */

  @Test
  public void test19()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      assertNotNull(simpleNode0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      simpleNode0.jjtAddChild((Node) null, 0);
      assertEquals(1, simpleNode0.jjtGetNumChildren());
      
      StringWriter stringWriter0 = new StringWriter();
      assertNotNull(stringWriter0);
      assertEquals("", stringWriter0.toString());
      
      simpleNode0.dump("Y=I", (Writer) stringWriter0);
      assertEquals(1, simpleNode0.jjtGetNumChildren());
      assertEquals("<CompilationUnit></CompilationUnit>\n", stringWriter0.toString());
  }

  //Test case number: 20
  /*
   * 2 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I136 Branch 15 IFLE L121 - true
   * Goal 2. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I188 Branch 19 IFLE L133 - false
   */

  @Test
  public void test20()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(27);
      assertNotNull(simpleNode0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      assertNotNull(arrayList0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertTrue(arrayList0.isEmpty());
      assertEquals(0, arrayList0.size());
      
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      assertNotNull(charArrayWriter0);
      assertEquals(0, charArrayWriter0.size());
      assertEquals("", charArrayWriter0.toString());
      
      boolean boolean0 = arrayList0.add(">=");
      assertTrue(boolean0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertFalse(arrayList0.isEmpty());
      assertEquals(1, arrayList0.size());
      
      simpleNode0.dump(">=", (Writer) charArrayWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertEquals("<Initializer>\n  <identifier>*ge</identifier>\n</Initializer>\n", charArrayWriter0.toString());
      assertEquals(60, charArrayWriter0.size());
  }

  //Test case number: 21
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.toString()Ljava/lang/String;: I19 Branch 4 IFEQ L87 - true
   */

  @Test
  public void test21()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(37);
      assertNotNull(simpleNode0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      String string0 = simpleNode0.toString();
      assertEquals("NameList", string0);
      assertNotNull(string0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  //Test case number: 22
  /*
   * 19 covered goals:
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
   * Goal 11. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I136 Branch 15 IFLE L121 - false
   * Goal 12. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I149 Branch 16 IFLE L124 - true
   * Goal 13. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I162 Branch 17 IFLE L127 - true
   * Goal 14. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I175 Branch 18 IFLE L130 - true
   * Goal 15. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I188 Branch 19 IFLE L133 - true
   * Goal 16. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I201 Branch 20 IFGT L136 - false
   * Goal 17. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I208 Branch 21 IFLE L136 - true
   * Goal 18. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I278 Branch 24 IFNULL L151 - true
   * Goal 19. com.soops.CEN4010.JMCA.JParser.SimpleNode.dump(Ljava/lang/String;Ljava/io/Writer;)V: I335 Branch 27 IFGT L159 - true
   */

  @Test
  public void test22()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(27);
      assertNotNull(simpleNode0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      assertNotNull(arrayList0);
      assertTrue(arrayList0.isEmpty());
      assertEquals(0, arrayList0.size());
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      assertNotNull(charArrayWriter0);
      assertEquals("", charArrayWriter0.toString());
      assertEquals(0, charArrayWriter0.size());
      
      boolean boolean0 = arrayList0.add(">");
      assertTrue(boolean0);
      assertFalse(arrayList0.isEmpty());
      assertEquals(1, arrayList0.size());
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      simpleNode0.dump(">", (Writer) charArrayWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      assertEquals(60, charArrayWriter0.size());
      assertEquals("<Initializer>\n  <identifier>*gt</identifier>\n</Initializer>\n", charArrayWriter0.toString());
  }

  //Test case number: 23
  /*
   * 3 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.SimpleNode.jjtSetParent(Lcom/soops/CEN4010/JMCA/JParser/Node;)V: root-Branch
   * Goal 2. com.soops.CEN4010.JMCA.JParser.SimpleNode.<init>(I)V: root-Branch
   * Goal 3. com.soops.CEN4010.JMCA.JParser.SimpleNode.<init>(Lcom/soops/CEN4010/JMCA/JParser/JavaParser;I)V: root-Branch
   */

  @Test
  public void test23()  throws Throwable  {
      PipedWriter pipedWriter0 = new PipedWriter();
      assertNotNull(pipedWriter0);
      
      PipedReader pipedReader0 = new PipedReader(pipedWriter0, 264);
      assertNotNull(pipedReader0);
      
      JavaParser javaParser0 = new JavaParser((Reader) pipedReader0);
      assertNotNull(javaParser0);
      assertFalse(javaParser0.lookingAhead);
      
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 264);
      assertNotNull(simpleNode0);
      assertFalse(javaParser0.lookingAhead);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
      
      simpleNode0.jjtSetParent((Node) simpleNode0);
      assertFalse(javaParser0.lookingAhead);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }
}

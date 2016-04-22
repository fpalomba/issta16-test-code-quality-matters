/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 17 23:39:10 GMT 2015
 */

package com.soops.CEN4010.JMCA.JParser;

import static org.junit.Assert.*;
import org.junit.Test;
import com.soops.CEN4010.JMCA.JParser.JavaCharStream;
import com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager;
import com.soops.CEN4010.JMCA.JParser.Token;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.PrintStream;
import java.io.PushbackInputStream;
import java.io.Reader;
import java.io.StringBufferInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class JavaParserTokenManager_ESTest extends JavaParserTokenManager_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager.MoreLexicalActions()V: I18 Branch 841 LOOKUPSWITCH L1724 Case 7 - false
   * Goal 2. com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager.MoreLexicalActions()V: I18 Branch 842 LOOKUPSWITCH L1724 Default-Case - true
   */

  @Test
  public void test0()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      JavaCharStream javaCharStream0 = new JavaCharStream((InputStream) mockFileInputStream0, (-1148), (-1148), (-1148));
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.MoreLexicalActions();
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager.SkipLexicalActions(Lcom/soops/CEN4010/JMCA/JParser/Token;)V: I4 Branch 840 LOOKUPSWITCH L1715 Default-Case - true
   */

  @Test
  public void test1()  throws Throwable  {
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager((JavaCharStream) null);
      Token.GTToken token_GTToken0 = new Token.GTToken();
      javaParserTokenManager0.SkipLexicalActions(token_GTToken0);
      assertEquals(0, token_GTToken0.endLine);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager.jjFillToken()Lcom/soops/CEN4010/JMCA/JParser/Token;: I26 Branch 812 IFNONNULL L1564 - true
   */

  @Test
  public void test2()  throws Throwable  {
      PipedWriter pipedWriter0 = new PipedWriter();
      PipedReader pipedReader0 = new PipedReader(pipedWriter0);
      JavaCharStream javaCharStream0 = new JavaCharStream((Reader) pipedReader0, 0, 0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      // Undeclared exception!
      try {
        Token token0 = javaParserTokenManager0.jjFillToken();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
      }
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager.SwitchTo(I)V: I12 Branch 811 IFGE L1553 - false
   */

  @Test
  public void test3()  throws Throwable  {
      StringBufferInputStream stringBufferInputStream0 = new StringBufferInputStream("'EbEZ-08z");
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) stringBufferInputStream0, 1420);
      JavaCharStream javaCharStream0 = new JavaCharStream((InputStream) pushbackInputStream0);
      JavaParserTokenManager javaParserTokenManager0 = null;
      try {
        javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0, (-1));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -1. State unchanged.
         //
      }
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager.SwitchTo(I)V: I7 Branch 810 IF_ICMPGE L1553 - true
   */

  @Test
  public void test4()  throws Throwable  {
      JavaParserTokenManager javaParserTokenManager0 = null;
      try {
        javaParserTokenManager0 = new JavaParserTokenManager((JavaCharStream) null, 2007);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 2007. State unchanged.
         //
      }
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager.setDebugStream(Ljava/io/PrintStream;)V: root-Branch
   */

  @Test
  public void test5()  throws Throwable  {
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager((JavaCharStream) null);
      MockPrintStream mockPrintStream0 = new MockPrintStream((OutputStream) javaParserTokenManager0.debugStream);
      javaParserTokenManager0.setDebugStream((PrintStream) mockPrintStream0);
  }

  //Test case number: 6
  /*
   * 4 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager.ReInit(Lcom/soops/CEN4010/JMCA/JParser/JavaCharStream;)V: root-Branch
   * Goal 2. com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager.ReInit(Lcom/soops/CEN4010/JMCA/JParser/JavaCharStream;I)V: root-Branch
   * Goal 3. com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager.ReInitRounds()V: I15 Branch 809 IFLE L1543 - true
   * Goal 4. com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager.ReInitRounds()V: I15 Branch 809 IFLE L1543 - false
   */

  @Test
  public void test6()  throws Throwable  {
      StringBufferInputStream stringBufferInputStream0 = new StringBufferInputStream("'EbEZ-08z");
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) stringBufferInputStream0, 1420);
      JavaCharStream javaCharStream0 = new JavaCharStream((InputStream) pushbackInputStream0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0, 0);
      javaParserTokenManager0.ReInit(javaCharStream0, 0);
      assertEquals(0, javaCharStream0.getBeginColumn());
  }

  //Test case number: 7
  /*
   * 7 covered goals:
   * Goal 1. com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager.<init>(Lcom/soops/CEN4010/JMCA/JParser/JavaCharStream;)V: root-Branch
   * Goal 2. com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager.<init>(Lcom/soops/CEN4010/JMCA/JParser/JavaCharStream;I)V: root-Branch
   * Goal 3. com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager.SwitchTo(I)V: I7 Branch 810 IF_ICMPGE L1553 - false
   * Goal 4. com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager.SwitchTo(I)V: I12 Branch 811 IFGE L1553 - true
   * Goal 5. com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager.TokenLexicalActions(Lcom/soops/CEN4010/JMCA/JParser/Token;)V: I4 Branch 844 LOOKUPSWITCH L1740 Case 122 - false
   * Goal 6. com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager.TokenLexicalActions(Lcom/soops/CEN4010/JMCA/JParser/Token;)V: I4 Branch 845 LOOKUPSWITCH L1740 Case 123 - false
   * Goal 7. com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager.TokenLexicalActions(Lcom/soops/CEN4010/JMCA/JParser/Token;)V: I4 Branch 846 LOOKUPSWITCH L1740 Default-Case - true
   */

  @Test
  public void test7()  throws Throwable  {
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager((JavaCharStream) null, 0);
      Token token0 = Token.newToken(0);
      javaParserTokenManager0.TokenLexicalActions(token0);
      assertEquals(0, token0.endColumn);
  }
}
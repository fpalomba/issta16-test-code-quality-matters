/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 15 04:31:50 GMT 2015
 */

package org.dom4j.io;

import static org.junit.Assert.*;
import org.junit.Test;
import org.dom4j.io.OutputFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class OutputFormat_ESTest extends OutputFormat_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 3 covered goals:
   * Goal 1. org.dom4j.io.OutputFormat.setOmitEncoding(Z)V: root-Branch
   * Goal 2. org.dom4j.io.OutputFormat.parseOptions([Ljava/lang/String;I)I: I42 Branch 10 IFLE L482 - false
   * Goal 3. org.dom4j.io.OutputFormat.parseOptions([Ljava/lang/String;I)I: I237 Branch 19 IFLE L500 - true
   */

  @Test
  public void test00()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("HMS", true);
      assertFalse(outputFormat0.isOmitEncoding());
      
      String[] stringArray0 = new String[17];
      stringArray0[0] = "-omitEncoding";
      stringArray0[1] = "HMS";
      int int0 = outputFormat0.parseOptions(stringArray0, 0);
      assertTrue(outputFormat0.isOmitEncoding());
      assertEquals(1, int0);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. org.dom4j.io.OutputFormat.parseOptions([Ljava/lang/String;I)I: I153 Branch 15 IFLE L492 - false
   * Goal 2. org.dom4j.io.OutputFormat.parseOptions([Ljava/lang/String;I)I: I216 Branch 18 IFLE L498 - false
   */

  @Test
  public void test01()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-newlines";
      stringArray0[1] = "-expandEmpty1R%k)`&xQ@.l";
      stringArray0[2] = "-expandEmpty1R%k)`&xQ@.l";
      stringArray0[2] = "-padText";
      // Undeclared exception!
      try {
        int int0 = outputFormat0.parseOptions(stringArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // StringEquals is not supposed to work on a null caller
         //
      }
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. org.dom4j.io.OutputFormat.parseOptions([Ljava/lang/String;I)I: I196 Branch 17 IFLE L496 - false
   */

  @Test
  public void test02()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-trimText", true);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-trimText";
      // Undeclared exception!
      try {
        int int0 = outputFormat0.parseOptions(stringArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // StringEquals is not supposed to work on a null caller
         //
      }
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * Goal 1. org.dom4j.io.OutputFormat.setLineSeparator(Ljava/lang/String;)V: root-Branch
   * Goal 2. org.dom4j.io.OutputFormat.parseOptions([Ljava/lang/String;I)I: I173 Branch 16 IFLE L494 - false
   */

  @Test
  public void test03()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("i&<X&jW.O781s>4+}i");
      String[] stringArray0 = new String[10];
      stringArray0[0] = "-lineSeparator";
      // Undeclared exception!
      try {
        int int0 = outputFormat0.parseOptions(stringArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // StringEquals is not supposed to work on a null caller
         //
      }
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * Goal 1. org.dom4j.io.OutputFormat.setEncoding(Ljava/lang/String;)V: I6 Branch 1 IFNULL L188 - true
   * Goal 2. org.dom4j.io.OutputFormat.parseOptions([Ljava/lang/String;I)I: I130 Branch 14 IFLE L490 - false
   */

  @Test
  public void test04()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-encoding";
      int int0 = outputFormat0.parseOptions(stringArray0, 0);
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals(2, int0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * Goal 1. org.dom4j.io.OutputFormat.parseOptions([Ljava/lang/String;I)I: I85 Branch 12 IFLE L486 - false
   */

  @Test
  public void test05()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-indentSize", false);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-indentSize";
      // Undeclared exception!
      try {
        int int0 = outputFormat0.parseOptions(stringArray0, 0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // null
         //
      }
  }

  //Test case number: 6
  /*
   * 2 covered goals:
   * Goal 1. org.dom4j.io.OutputFormat.setIndent(Ljava/lang/String;)V: I6 Branch 2 IFNULL L350 - true
   * Goal 2. org.dom4j.io.OutputFormat.parseOptions([Ljava/lang/String;I)I: I62 Branch 11 IFLE L484 - false
   */

  @Test
  public void test06()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-indent", false, "-indent");
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-indent";
      // Undeclared exception!
      try {
        int int0 = outputFormat0.parseOptions(stringArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // StringEquals is not supposed to work on a null caller
         //
      }
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. org.dom4j.io.OutputFormat.setAttributeQuoteCharacter(C)V: I13 Branch 7 IF_ICMPNE L462 - false
   */

  @Test
  public void test07()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-indent", false, "-indent");
      outputFormat0.setAttributeQuoteCharacter('\"');
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isSuppressDeclaration());
  }

  //Test case number: 8
  /*
   * 2 covered goals:
   * Goal 1. org.dom4j.io.OutputFormat.setAttributeQuoteCharacter(C)V: I7 Branch 6 IF_ICMPEQ L462 - false
   * Goal 2. org.dom4j.io.OutputFormat.setAttributeQuoteCharacter(C)V: I13 Branch 7 IF_ICMPNE L462 - true
   */

  @Test
  public void test08()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("HMS", true);
      // Undeclared exception!
      try {
        outputFormat0.setAttributeQuoteCharacter('.');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (.)
         //
      }
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * Goal 1. org.dom4j.io.OutputFormat.setAttributeQuoteCharacter(C)V: I7 Branch 6 IF_ICMPEQ L462 - true
   */

  @Test
  public void test09()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("IDYd4)0xq3 =k\"");
      outputFormat0.setAttributeQuoteCharacter('\'');
      assertEquals('\'', outputFormat0.getAttributeQuoteCharacter());
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * Goal 1. org.dom4j.io.OutputFormat.setIndent(Z)V: I6 Branch 4 IFEQ L364 - false
   */

  @Test
  public void test10()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("RQuoC");
      outputFormat0.setIndent(true);
      assertEquals("  ", outputFormat0.getIndent());
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * Goal 1. org.dom4j.io.OutputFormat.setIndent(Ljava/lang/String;)V: I12 Branch 3 IFGT L350 - false
   */

  @Test
  public void test11()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("{!l}Ce{Q,TGy", false);
      outputFormat0.setIndent("");
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isSuppressDeclaration());
  }

  //Test case number: 12
  /*
   * 2 covered goals:
   * Goal 1. org.dom4j.io.OutputFormat.setIndent(Ljava/lang/String;)V: I6 Branch 2 IFNULL L350 - false
   * Goal 2. org.dom4j.io.OutputFormat.setIndent(Ljava/lang/String;)V: I12 Branch 3 IFGT L350 - true
   */

  @Test
  public void test12()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      outputFormat0.setIndent("1696-09-01T00:00:00Z");
      assertEquals("1696-09-01T00:00:00Z", outputFormat0.getIndent());
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * Goal 1. org.dom4j.io.OutputFormat.setEncoding(Ljava/lang/String;)V: I6 Branch 1 IFNULL L188 - false
   */

  @Test
  public void test13()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      outputFormat0.setEncoding("-xhtmlR\"wi^");
      assertEquals("-xhtmlR\"wi^", outputFormat0.getEncoding());
  }

  //Test case number: 14
  /*
   * 15 covered goals:
   * Goal 1. org.dom4j.io.OutputFormat.setXHTML(Z)V: root-Branch
   * Goal 2. org.dom4j.io.OutputFormat.setExpandEmptyElements(Z)V: root-Branch
   * Goal 3. org.dom4j.io.OutputFormat.parseOptions([Ljava/lang/String;I)I: I11 Branch 8 IF_ICMPGE L479 - true
   * Goal 4. org.dom4j.io.OutputFormat.parseOptions([Ljava/lang/String;I)I: I22 Branch 9 IFLE L480 - true
   * Goal 5. org.dom4j.io.OutputFormat.parseOptions([Ljava/lang/String;I)I: I42 Branch 10 IFLE L482 - true
   * Goal 6. org.dom4j.io.OutputFormat.parseOptions([Ljava/lang/String;I)I: I62 Branch 11 IFLE L484 - true
   * Goal 7. org.dom4j.io.OutputFormat.parseOptions([Ljava/lang/String;I)I: I85 Branch 12 IFLE L486 - true
   * Goal 8. org.dom4j.io.OutputFormat.parseOptions([Ljava/lang/String;I)I: I110 Branch 13 IFLE L488 - true
   * Goal 9. org.dom4j.io.OutputFormat.parseOptions([Ljava/lang/String;I)I: I110 Branch 13 IFLE L488 - false
   * Goal 10. org.dom4j.io.OutputFormat.parseOptions([Ljava/lang/String;I)I: I130 Branch 14 IFLE L490 - true
   * Goal 11. org.dom4j.io.OutputFormat.parseOptions([Ljava/lang/String;I)I: I153 Branch 15 IFLE L492 - true
   * Goal 12. org.dom4j.io.OutputFormat.parseOptions([Ljava/lang/String;I)I: I173 Branch 16 IFLE L494 - true
   * Goal 13. org.dom4j.io.OutputFormat.parseOptions([Ljava/lang/String;I)I: I196 Branch 17 IFLE L496 - true
   * Goal 14. org.dom4j.io.OutputFormat.parseOptions([Ljava/lang/String;I)I: I216 Branch 18 IFLE L498 - true
   * Goal 15. org.dom4j.io.OutputFormat.parseOptions([Ljava/lang/String;I)I: I237 Branch 19 IFLE L500 - false
   */

  @Test
  public void test14()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-xhtmlR\"wi^";
      stringArray0[1] = "-expandEmptydgzaUdZB1X";
      int int0 = outputFormat0.parseOptions(stringArray0, 0);
      assertTrue(outputFormat0.isXHTML());
      assertEquals(2, int0);
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * Goal 1. org.dom4j.io.OutputFormat.isSuppressDeclaration()Z: root-Branch
   */

  @Test
  public void test15()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("HMS", true);
      boolean boolean0 = outputFormat0.isSuppressDeclaration();
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(boolean0);
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isExpandEmptyElements());
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * Goal 1. org.dom4j.io.OutputFormat.isOmitEncoding()Z: root-Branch
   */

  @Test
  public void test16()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("HMS", true);
      boolean boolean0 = outputFormat0.isOmitEncoding();
      assertFalse(boolean0);
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isSuppressDeclaration());
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * Goal 1. org.dom4j.io.OutputFormat.getEncoding()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test17()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("  ", false, "");
      String string0 = outputFormat0.getEncoding();
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertEquals("", string0);
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isOmitEncoding());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * Goal 1. org.dom4j.io.OutputFormat.getLineSeparator()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test18()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("  ", false, "");
      String string0 = outputFormat0.getLineSeparator();
      assertEquals("\n", string0);
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isSuppressDeclaration());
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * Goal 1. org.dom4j.io.OutputFormat.setNewLineAfterNTags(I)V: root-Branch
   */

  @Test
  public void test19()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      outputFormat0.setNewLineAfterNTags(7);
      assertEquals(7, outputFormat0.getNewLineAfterNTags());
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * Goal 1. org.dom4j.io.OutputFormat.isExpandEmptyElements()Z: root-Branch
   */

  @Test
  public void test20()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("HMS", true);
      boolean boolean0 = outputFormat0.isExpandEmptyElements();
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(boolean0);
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isSuppressDeclaration());
  }

  //Test case number: 21
  /*
   * 1 covered goal:
   * Goal 1. org.dom4j.io.OutputFormat.isNewlines()Z: root-Branch
   */

  @Test
  public void test21()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("RQuoC");
      boolean boolean0 = outputFormat0.isNewlines();
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals("UTF-8", outputFormat0.getEncoding());
  }

  //Test case number: 22
  /*
   * 1 covered goal:
   * Goal 1. org.dom4j.io.OutputFormat.getAttributeQuoteCharacter()C: root-Branch
   */

  @Test
  public void test22()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-indent", false, "-indent");
      char char0 = outputFormat0.getAttributeQuoteCharacter();
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
  }

  //Test case number: 23
  /*
   * 1 covered goal:
   * Goal 1. org.dom4j.io.OutputFormat.isXHTML()Z: root-Branch
   */

  @Test
  public void test23()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("RQuoC");
      boolean boolean0 = outputFormat0.isXHTML();
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isOmitEncoding());
  }

  //Test case number: 24
  /*
   * 1 covered goal:
   * Goal 1. org.dom4j.io.OutputFormat.isNewLineAfterDeclaration()Z: root-Branch
   */

  @Test
  public void test24()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("IDYd4)0xq3 =k\"");
      boolean boolean0 = outputFormat0.isNewLineAfterDeclaration();
      assertTrue(boolean0);
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isSuppressDeclaration());
  }

  //Test case number: 25
  /*
   * 2 covered goals:
   * Goal 1. org.dom4j.io.OutputFormat.isPadText()Z: root-Branch
   * Goal 2. org.dom4j.io.OutputFormat.<init>(Ljava/lang/String;ZLjava/lang/String;)V: root-Branch
   */

  @Test
  public void test25()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-indent", false, "-indent");
      boolean boolean0 = outputFormat0.isPadText();
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
  }

  //Test case number: 26
  /*
   * 3 covered goals:
   * Goal 1. org.dom4j.io.OutputFormat.setSuppressDeclaration(Z)V: root-Branch
   * Goal 2. org.dom4j.io.OutputFormat.parseOptions([Ljava/lang/String;I)I: I11 Branch 8 IF_ICMPGE L479 - false
   * Goal 3. org.dom4j.io.OutputFormat.parseOptions([Ljava/lang/String;I)I: I22 Branch 9 IFLE L480 - false
   */

  @Test
  public void test26()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("RQuoC");
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-suppressDeclaration";
      // Undeclared exception!
      try {
        int int0 = outputFormat0.parseOptions(stringArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // StringEquals is not supposed to work on a null caller
         //
      }
  }

  //Test case number: 27
  /*
   * 1 covered goal:
   * Goal 1. org.dom4j.io.OutputFormat.getNewLineAfterNTags()I: root-Branch
   */

  @Test
  public void test27()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("HMS", true);
      int int0 = outputFormat0.getNewLineAfterNTags();
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals(0, int0);
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals("UTF-8", outputFormat0.getEncoding());
  }

  //Test case number: 28
  /*
   * 5 covered goals:
   * Goal 1. org.dom4j.io.OutputFormat.setPadText(Z)V: root-Branch
   * Goal 2. org.dom4j.io.OutputFormat.createPrettyPrint()Lorg/dom4j/io/OutputFormat;: root-Branch
   * Goal 3. org.dom4j.io.OutputFormat.getIndent()Ljava/lang/String;: root-Branch
   * Goal 4. org.dom4j.io.OutputFormat.setIndentSize(I)V: I16 Branch 5 IF_ICMPGE L383 - true
   * Goal 5. org.dom4j.io.OutputFormat.setIndentSize(I)V: I16 Branch 5 IF_ICMPGE L383 - false
   */

  @Test
  public void test28()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      String string0 = outputFormat0.getIndent();
      assertTrue(outputFormat0.isNewlines());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertTrue(outputFormat0.isPadText());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertTrue(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertEquals("  ", string0);
  }

  //Test case number: 29
  /*
   * 2 covered goals:
   * Goal 1. org.dom4j.io.OutputFormat.setNewLineAfterDeclaration(Z)V: root-Branch
   * Goal 2. org.dom4j.io.OutputFormat.<init>(Ljava/lang/String;)V: root-Branch
   */

  @Test
  public void test29()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("RQuoC");
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      
      outputFormat0.setNewLineAfterDeclaration(false);
      assertFalse(outputFormat0.isNewLineAfterDeclaration());
  }

  //Test case number: 30
  /*
   * 5 covered goals:
   * Goal 1. org.dom4j.io.OutputFormat.setTrimText(Z)V: root-Branch
   * Goal 2. org.dom4j.io.OutputFormat.<init>()V: root-Branch
   * Goal 3. org.dom4j.io.OutputFormat.setNewlines(Z)V: root-Branch
   * Goal 4. org.dom4j.io.OutputFormat.createCompactFormat()Lorg/dom4j/io/OutputFormat;: root-Branch
   * Goal 5. org.dom4j.io.OutputFormat.setIndent(Z)V: I6 Branch 4 IFEQ L364 - true
   */

  @Test
  public void test30()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertTrue(outputFormat0.isTrimText());
  }

  //Test case number: 31
  /*
   * 2 covered goals:
   * Goal 1. org.dom4j.io.OutputFormat.isTrimText()Z: root-Branch
   * Goal 2. org.dom4j.io.OutputFormat.<init>(Ljava/lang/String;Z)V: root-Branch
   */

  @Test
  public void test31()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("HMS", true);
      boolean boolean0 = outputFormat0.isTrimText();
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isOmitEncoding());
  }
}

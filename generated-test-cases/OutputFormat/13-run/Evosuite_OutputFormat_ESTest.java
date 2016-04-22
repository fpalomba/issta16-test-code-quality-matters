/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 15 04:43:23 GMT 2015
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
   * 2 covered goals:
   * Goal 1. org.dom4j.io.OutputFormat.parseOptions([Ljava/lang/String;I)I: I153 Branch 15 IFLE L492 - false
   * Goal 2. org.dom4j.io.OutputFormat.parseOptions([Ljava/lang/String;I)I: I237 Branch 19 IFLE L500 - true
   */

  @Test
  public void test00()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "-expandEmpty-encoding";
      stringArray0[1] = "-newlines";
      stringArray0[2] = "2BZAQONbt/uA\u0006Zm>";
      int int0 = outputFormat0.parseOptions(stringArray0, 0);
      assertTrue(outputFormat0.isNewlines());
      assertEquals(2, int0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. org.dom4j.io.OutputFormat.parseOptions([Ljava/lang/String;I)I: I196 Branch 17 IFLE L496 - false
   */

  @Test
  public void test01()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-trimText");
      String[] stringArray0 = new String[8];
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

  //Test case number: 2
  /*
   * 4 covered goals:
   * Goal 1. org.dom4j.io.OutputFormat.setExpandEmptyElements(Z)V: root-Branch
   * Goal 2. org.dom4j.io.OutputFormat.parseOptions([Ljava/lang/String;I)I: I85 Branch 12 IFLE L486 - false
   * Goal 3. org.dom4j.io.OutputFormat.parseOptions([Ljava/lang/String;I)I: I110 Branch 13 IFLE L488 - false
   * Goal 4. org.dom4j.io.OutputFormat.parseOptions([Ljava/lang/String;I)I: I216 Branch 18 IFLE L498 - false
   */

  @Test
  public void test02()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      String[] stringArray0 = new String[31];
      stringArray0[0] = "-expandEmptyY^\"U'Q`N\u00078rb}*";
      stringArray0[2] = "-padText";
      stringArray0[3] = "-padText";
      stringArray0[4] = "-padText";
      stringArray0[5] = "-expandEmptyY^\"U'Q`N\u00078rb}*";
      stringArray0[7] = "-indentSize";
      stringArray0[1] = "-expandEmptyY^\"U'Q`N\u00078rb}*";
      stringArray0[6] = "-padText";
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

  //Test case number: 3
  /*
   * 5 covered goals:
   * Goal 1. org.dom4j.io.OutputFormat.<init>(Ljava/lang/String;ZLjava/lang/String;)V: root-Branch
   * Goal 2. org.dom4j.io.OutputFormat.setOmitEncoding(Z)V: root-Branch
   * Goal 3. org.dom4j.io.OutputFormat.setLineSeparator(Ljava/lang/String;)V: root-Branch
   * Goal 4. org.dom4j.io.OutputFormat.parseOptions([Ljava/lang/String;I)I: I42 Branch 10 IFLE L482 - false
   * Goal 5. org.dom4j.io.OutputFormat.parseOptions([Ljava/lang/String;I)I: I173 Branch 16 IFLE L494 - false
   */

  @Test
  public void test03()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-lineSeparator", true, "-omitEncoding");
      assertFalse(outputFormat0.isOmitEncoding());
      
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-lineSeparator";
      stringArray0[2] = "-omitEncoding";
      int int0 = outputFormat0.parseOptions(stringArray0, 0);
      assertTrue(outputFormat0.isOmitEncoding());
      assertEquals(3, int0);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * Goal 1. org.dom4j.io.OutputFormat.setAttributeQuoteCharacter(C)V: I13 Branch 7 IF_ICMPNE L462 - false
   */

  @Test
  public void test04()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      outputFormat0.setAttributeQuoteCharacter('\"');
      assertTrue(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertTrue(outputFormat0.isNewlines());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertEquals("  ", outputFormat0.getIndent());
      assertTrue(outputFormat0.isPadText());
      assertFalse(outputFormat0.isSuppressDeclaration());
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * Goal 1. org.dom4j.io.OutputFormat.setAttributeQuoteCharacter(C)V: I7 Branch 6 IF_ICMPEQ L462 - false
   * Goal 2. org.dom4j.io.OutputFormat.setAttributeQuoteCharacter(C)V: I13 Branch 7 IF_ICMPNE L462 - true
   */

  @Test
  public void test05()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-xhtml-CJ,I(");
      // Undeclared exception!
      try {
        outputFormat0.setAttributeQuoteCharacter('R');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (R)
         //
      }
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. org.dom4j.io.OutputFormat.setAttributeQuoteCharacter(C)V: I7 Branch 6 IF_ICMPEQ L462 - true
   */

  @Test
  public void test06()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      outputFormat0.setAttributeQuoteCharacter('\'');
      assertEquals('\'', outputFormat0.getAttributeQuoteCharacter());
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. org.dom4j.io.OutputFormat.setIndent(Z)V: I6 Branch 4 IFEQ L364 - false
   */

  @Test
  public void test07()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setIndent(true);
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertEquals("  ", outputFormat0.getIndent());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isExpandEmptyElements());
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * Goal 1. org.dom4j.io.OutputFormat.setIndent(Ljava/lang/String;)V: I12 Branch 3 IFGT L350 - false
   */

  @Test
  public void test08()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      outputFormat0.setIndent("");
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertTrue(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isSuppressDeclaration());
  }

  //Test case number: 9
  /*
   * 2 covered goals:
   * Goal 1. org.dom4j.io.OutputFormat.setIndent(Ljava/lang/String;)V: I6 Branch 2 IFNULL L350 - false
   * Goal 2. org.dom4j.io.OutputFormat.setIndent(Ljava/lang/String;)V: I12 Branch 3 IFGT L350 - true
   */

  @Test
  public void test09()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-indent";
      stringArray0[1] = "-indent";
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

  //Test case number: 10
  /*
   * 1 covered goal:
   * Goal 1. org.dom4j.io.OutputFormat.setEncoding(Ljava/lang/String;)V: I6 Branch 1 IFNULL L188 - false
   */

  @Test
  public void test10()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      outputFormat0.setEncoding("4+3Sit%*5,2ER|=");
      assertEquals("4+3Sit%*5,2ER|=", outputFormat0.getEncoding());
  }

  //Test case number: 11
  /*
   * 4 covered goals:
   * Goal 1. org.dom4j.io.OutputFormat.setEncoding(Ljava/lang/String;)V: I6 Branch 1 IFNULL L188 - true
   * Goal 2. org.dom4j.io.OutputFormat.setIndent(Ljava/lang/String;)V: I6 Branch 2 IFNULL L350 - true
   * Goal 3. org.dom4j.io.OutputFormat.parseOptions([Ljava/lang/String;I)I: I62 Branch 11 IFLE L484 - false
   * Goal 4. org.dom4j.io.OutputFormat.parseOptions([Ljava/lang/String;I)I: I130 Branch 14 IFLE L490 - false
   */

  @Test
  public void test11()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-indent";
      stringArray0[2] = "-encoding";
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

  //Test case number: 12
  /*
   * 1 covered goal:
   * Goal 1. org.dom4j.io.OutputFormat.<init>(Ljava/lang/String;Z)V: root-Branch
   */

  @Test
  public void test12()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("*of0im", false);
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * Goal 1. org.dom4j.io.OutputFormat.isSuppressDeclaration()Z: root-Branch
   */

  @Test
  public void test13()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      boolean boolean0 = outputFormat0.isSuppressDeclaration();
      assertFalse(boolean0);
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isOmitEncoding());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isNewlines());
      assertTrue(outputFormat0.isTrimText());
  }

  //Test case number: 14
  /*
   * 12 covered goals:
   * Goal 1. org.dom4j.io.OutputFormat.setXHTML(Z)V: root-Branch
   * Goal 2. org.dom4j.io.OutputFormat.parseOptions([Ljava/lang/String;I)I: I22 Branch 9 IFLE L480 - true
   * Goal 3. org.dom4j.io.OutputFormat.parseOptions([Ljava/lang/String;I)I: I42 Branch 10 IFLE L482 - true
   * Goal 4. org.dom4j.io.OutputFormat.parseOptions([Ljava/lang/String;I)I: I62 Branch 11 IFLE L484 - true
   * Goal 5. org.dom4j.io.OutputFormat.parseOptions([Ljava/lang/String;I)I: I85 Branch 12 IFLE L486 - true
   * Goal 6. org.dom4j.io.OutputFormat.parseOptions([Ljava/lang/String;I)I: I110 Branch 13 IFLE L488 - true
   * Goal 7. org.dom4j.io.OutputFormat.parseOptions([Ljava/lang/String;I)I: I130 Branch 14 IFLE L490 - true
   * Goal 8. org.dom4j.io.OutputFormat.parseOptions([Ljava/lang/String;I)I: I153 Branch 15 IFLE L492 - true
   * Goal 9. org.dom4j.io.OutputFormat.parseOptions([Ljava/lang/String;I)I: I173 Branch 16 IFLE L494 - true
   * Goal 10. org.dom4j.io.OutputFormat.parseOptions([Ljava/lang/String;I)I: I196 Branch 17 IFLE L496 - true
   * Goal 11. org.dom4j.io.OutputFormat.parseOptions([Ljava/lang/String;I)I: I216 Branch 18 IFLE L498 - true
   * Goal 12. org.dom4j.io.OutputFormat.parseOptions([Ljava/lang/String;I)I: I237 Branch 19 IFLE L500 - false
   */

  @Test
  public void test14()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-xhtml-CJ,I(");
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-xhtml-CJ,I(";
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

  //Test case number: 15
  /*
   * 1 covered goal:
   * Goal 1. org.dom4j.io.OutputFormat.isOmitEncoding()Z: root-Branch
   */

  @Test
  public void test15()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      boolean boolean0 = outputFormat0.isOmitEncoding();
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(boolean0);
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isExpandEmptyElements());
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * Goal 1. org.dom4j.io.OutputFormat.getEncoding()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test16()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("Timezone");
      String string0 = outputFormat0.getEncoding();
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals("UTF-8", string0);
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isExpandEmptyElements());
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * Goal 1. org.dom4j.io.OutputFormat.getLineSeparator()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test17()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      String string0 = outputFormat0.getLineSeparator();
      assertTrue(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals("\n", string0);
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isSuppressDeclaration());
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * Goal 1. org.dom4j.io.OutputFormat.setNewLineAfterNTags(I)V: root-Branch
   */

  @Test
  public void test18()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("Timezone");
      outputFormat0.setNewLineAfterNTags(5);
      assertEquals(5, outputFormat0.getNewLineAfterNTags());
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * Goal 1. org.dom4j.io.OutputFormat.isExpandEmptyElements()Z: root-Branch
   */

  @Test
  public void test19()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      boolean boolean0 = outputFormat0.isExpandEmptyElements();
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(boolean0);
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * Goal 1. org.dom4j.io.OutputFormat.isNewlines()Z: root-Branch
   */

  @Test
  public void test20()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-xhtml-CJ,I(");
      boolean boolean0 = outputFormat0.isNewlines();
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
  }

  //Test case number: 21
  /*
   * 1 covered goal:
   * Goal 1. org.dom4j.io.OutputFormat.getIndent()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test21()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("Timezone");
      String string0 = outputFormat0.getIndent();
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals("Timezone", string0);
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isSuppressDeclaration());
  }

  //Test case number: 22
  /*
   * 1 covered goal:
   * Goal 1. org.dom4j.io.OutputFormat.getAttributeQuoteCharacter()C: root-Branch
   */

  @Test
  public void test22()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      char char0 = outputFormat0.getAttributeQuoteCharacter();
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertTrue(outputFormat0.isNewlines());
      assertTrue(outputFormat0.isPadText());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals("  ", outputFormat0.getIndent());
      assertTrue(outputFormat0.isTrimText());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isExpandEmptyElements());
  }

  //Test case number: 23
  /*
   * 1 covered goal:
   * Goal 1. org.dom4j.io.OutputFormat.isXHTML()Z: root-Branch
   */

  @Test
  public void test23()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      boolean boolean0 = outputFormat0.isXHTML();
      assertEquals("  ", outputFormat0.getIndent());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertTrue(outputFormat0.isTrimText());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertTrue(outputFormat0.isPadText());
      assertTrue(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isSuppressDeclaration());
  }

  //Test case number: 24
  /*
   * 1 covered goal:
   * Goal 1. org.dom4j.io.OutputFormat.isNewLineAfterDeclaration()Z: root-Branch
   */

  @Test
  public void test24()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("Timezone");
      boolean boolean0 = outputFormat0.isNewLineAfterDeclaration();
      assertFalse(outputFormat0.isOmitEncoding());
      assertTrue(boolean0);
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isExpandEmptyElements());
  }

  //Test case number: 25
  /*
   * 4 covered goals:
   * Goal 1. org.dom4j.io.OutputFormat.setSuppressDeclaration(Z)V: root-Branch
   * Goal 2. org.dom4j.io.OutputFormat.parseOptions([Ljava/lang/String;I)I: I11 Branch 8 IF_ICMPGE L479 - true
   * Goal 3. org.dom4j.io.OutputFormat.parseOptions([Ljava/lang/String;I)I: I11 Branch 8 IF_ICMPGE L479 - false
   * Goal 4. org.dom4j.io.OutputFormat.parseOptions([Ljava/lang/String;I)I: I22 Branch 9 IFLE L480 - false
   */

  @Test
  public void test25()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      assertFalse(outputFormat0.isSuppressDeclaration());
      
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-suppressDeclaration";
      int int0 = outputFormat0.parseOptions(stringArray0, 0);
      assertTrue(outputFormat0.isSuppressDeclaration());
      assertEquals(1, int0);
  }

  //Test case number: 26
  /*
   * 1 covered goal:
   * Goal 1. org.dom4j.io.OutputFormat.getNewLineAfterNTags()I: root-Branch
   */

  @Test
  public void test26()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      int int0 = outputFormat0.getNewLineAfterNTags();
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertEquals(0, int0);
      assertFalse(outputFormat0.isOmitEncoding());
  }

  //Test case number: 27
  /*
   * 5 covered goals:
   * Goal 1. org.dom4j.io.OutputFormat.setPadText(Z)V: root-Branch
   * Goal 2. org.dom4j.io.OutputFormat.isPadText()Z: root-Branch
   * Goal 3. org.dom4j.io.OutputFormat.createPrettyPrint()Lorg/dom4j/io/OutputFormat;: root-Branch
   * Goal 4. org.dom4j.io.OutputFormat.setIndentSize(I)V: I16 Branch 5 IF_ICMPGE L383 - true
   * Goal 5. org.dom4j.io.OutputFormat.setIndentSize(I)V: I16 Branch 5 IF_ICMPGE L383 - false
   */

  @Test
  public void test27()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      boolean boolean0 = outputFormat0.isPadText();
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals("  ", outputFormat0.getIndent());
      assertTrue(boolean0);
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertTrue(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertTrue(outputFormat0.isTrimText());
  }

  //Test case number: 28
  /*
   * 6 covered goals:
   * Goal 1. org.dom4j.io.OutputFormat.setTrimText(Z)V: root-Branch
   * Goal 2. org.dom4j.io.OutputFormat.setNewLineAfterDeclaration(Z)V: root-Branch
   * Goal 3. org.dom4j.io.OutputFormat.<init>()V: root-Branch
   * Goal 4. org.dom4j.io.OutputFormat.setNewlines(Z)V: root-Branch
   * Goal 5. org.dom4j.io.OutputFormat.createCompactFormat()Lorg/dom4j/io/OutputFormat;: root-Branch
   * Goal 6. org.dom4j.io.OutputFormat.setIndent(Z)V: I6 Branch 4 IFEQ L364 - true
   */

  @Test
  public void test28()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      outputFormat0.setNewLineAfterDeclaration(true);
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertTrue(outputFormat0.isTrimText());
  }

  //Test case number: 29
  /*
   * 2 covered goals:
   * Goal 1. org.dom4j.io.OutputFormat.isTrimText()Z: root-Branch
   * Goal 2. org.dom4j.io.OutputFormat.<init>(Ljava/lang/String;)V: root-Branch
   */

  @Test
  public void test29()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-xhtml-CJ,I(");
      boolean boolean0 = outputFormat0.isTrimText();
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isOmitEncoding());
  }
}

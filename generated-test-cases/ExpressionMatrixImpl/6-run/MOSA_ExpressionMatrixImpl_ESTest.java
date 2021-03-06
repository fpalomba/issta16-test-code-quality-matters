/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 13 08:33:04 GMT 2015
 */

package com.browsersoft.openhre.hl7.impl.regular;

import static org.junit.Assert.*;
import org.junit.Test;
import com.browsersoft.openhre.hl7.api.regular.ExpressionElementMapper;
import com.browsersoft.openhre.hl7.impl.regular.ExpressionElementMapperImpl;
import com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ExpressionMatrixImpl_ESTest extends ExpressionMatrixImpl_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.outNoStandardConnections(ZLcom/browsersoft/openhre/hl7/api/regular/ExpressionElementMapper;)Ljava/lang/String;: I39 Branch 12 IFNONNULL L87 - true
   */

  @Test
  public void test00()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(2188);
      int int0 = expressionMatrixImpl0.addNewNode();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      // Undeclared exception!
      try {
        String string0 = expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) expressionElementMapperImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 1
  /*
   * 7 covered goals:
   * Goal 1. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.getValue(II)I: I37 Branch 8 IF_ICMPGE L65 - true
   * Goal 2. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.outNoStandardConnections(ZLcom/browsersoft/openhre/hl7/api/regular/ExpressionElementMapper;)Ljava/lang/String;: I16 Branch 10 IF_ICMPGE L83 - true
   * Goal 3. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.outNoStandardConnections(ZLcom/browsersoft/openhre/hl7/api/regular/ExpressionElementMapper;)Ljava/lang/String;: I16 Branch 10 IF_ICMPGE L83 - false
   * Goal 4. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.outNoStandardConnections(ZLcom/browsersoft/openhre/hl7/api/regular/ExpressionElementMapper;)Ljava/lang/String;: I28 Branch 11 IF_ICMPGE L84 - true
   * Goal 5. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.outNoStandardConnections(ZLcom/browsersoft/openhre/hl7/api/regular/ExpressionElementMapper;)Ljava/lang/String;: I28 Branch 11 IF_ICMPGE L84 - false
   * Goal 6. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.outNoStandardConnections(ZLcom/browsersoft/openhre/hl7/api/regular/ExpressionElementMapper;)Ljava/lang/String;: I39 Branch 12 IFNONNULL L87 - false
   * Goal 7. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.outNoStandardConnections(ZLcom/browsersoft/openhre/hl7/api/regular/ExpressionElementMapper;)Ljava/lang/String;: I73 Branch 13 IF_ICMPEQ L94 - true
   */

  @Test
  public void test01()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(2072);
      String string0 = expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      assertEquals(2072, expressionMatrixImpl0.getNumberOfElements());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.getValue(II)I: I30 Branch 7 IFLT L65 - true
   */

  @Test
  public void test02()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.addNewNode();
      int int1 = expressionMatrixImpl0.getValue(0, (-730));
      assertFalse(int1 == int0);
  }

  //Test case number: 3
  /*
   * 19 covered goals:
   * Goal 1. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.getValue(II)I: I14 Branch 6 IF_ICMPGE L63 - false
   * Goal 2. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.getValue(II)I: I30 Branch 7 IFLT L65 - false
   * Goal 3. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.getValue(II)I: I37 Branch 8 IF_ICMPGE L65 - false
   * Goal 4. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I41 Branch 18 IF_ICMPGE L117 - true
   * Goal 5. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I41 Branch 18 IF_ICMPGE L117 - false
   * Goal 6. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I70 Branch 19 IF_ICMPEQ L120 - true
   * Goal 7. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I70 Branch 19 IF_ICMPEQ L120 - false
   * Goal 8. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I112 Branch 20 IF_ICMPGE L125 - true
   * Goal 9. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I112 Branch 20 IF_ICMPGE L125 - false
   * Goal 10. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I137 Branch 21 IF_ICMPGE L127 - true
   * Goal 11. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I137 Branch 21 IF_ICMPGE L127 - false
   * Goal 12. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I152 Branch 22 IF_ICMPNE L129 - false
   * Goal 13. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I192 Branch 23 IF_ICMPEQ L134 - true
   * Goal 14. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I192 Branch 23 IF_ICMPEQ L134 - false
   * Goal 15. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I263 Branch 24 IF_ICMPGE L145 - true
   * Goal 16. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I263 Branch 24 IF_ICMPGE L145 - false
   * Goal 17. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I275 Branch 25 IF_ICMPGE L146 - true
   * Goal 18. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I275 Branch 25 IF_ICMPGE L146 - false
   * Goal 19. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I290 Branch 26 IF_ICMPEQ L148 - true
   */

  @Test
  public void test03()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(2188);
      int int0 = expressionMatrixImpl0.addNewNode();
      String string0 = expressionMatrixImpl0.toString();
      assertEquals(2188, expressionMatrixImpl0.getNumberOfElements());
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * Goal 1. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.getValue(II)I: I6 Branch 5 IFLT L63 - false
   * Goal 2. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.getValue(II)I: I14 Branch 6 IF_ICMPGE L63 - true
   */

  @Test
  public void test04()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.getValue(0, 2188);
      assertEquals((-1), int0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * Goal 1. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.getValue(II)I: I6 Branch 5 IFLT L63 - true
   */

  @Test
  public void test05()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.getValue((-300), 27);
      assertEquals((-1), int0);
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.setValue(III)V: I30 Branch 3 IFLT L56 - true
   */

  @Test
  public void test06()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, (-1833), (-2252));
      assertEquals(1, expressionMatrixImpl0.getNumberOfNodes());
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.setValue(III)V: I37 Branch 4 IF_ICMPGE L56 - true
   */

  @Test
  public void test07()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 1212, (-1));
      assertEquals(1, expressionMatrixImpl0.getNumberOfNodes());
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * Goal 1. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.setValue(III)V: I14 Branch 2 IF_ICMPGE L53 - true
   */

  @Test
  public void test08()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.setValue(0, 1341, 4420);
      assertEquals(0, expressionMatrixImpl0.getNumberOfNodes());
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * Goal 1. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.setValue(III)V: I6 Branch 1 IFLT L53 - true
   */

  @Test
  public void test09()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.setValue((-1), (-946), (-1));
      assertEquals(0, expressionMatrixImpl0.getNumberOfElements());
  }

  //Test case number: 10
  /*
   * 7 covered goals:
   * Goal 1. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.creatMatrix(I)V: root-Branch
   * Goal 2. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.setValue(III)V: I6 Branch 1 IFLT L53 - false
   * Goal 3. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.setValue(III)V: I14 Branch 2 IF_ICMPGE L53 - false
   * Goal 4. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.setValue(III)V: I30 Branch 3 IFLT L56 - false
   * Goal 5. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.setValue(III)V: I37 Branch 4 IF_ICMPGE L56 - false
   * Goal 6. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.addNewNode()I: I17 Branch 9 IF_ICMPGE L74 - true
   * Goal 7. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.addNewNode()I: I17 Branch 9 IF_ICMPGE L74 - false
   */

  @Test
  public void test10()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(2188);
      int int0 = expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 1212, (-1));
      assertEquals(2188, expressionMatrixImpl0.getNumberOfElements());
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * Goal 1. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.getNumberOfNodes()I: root-Branch
   */

  @Test
  public void test11()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.getNumberOfNodes();
      assertEquals(0, int0);
  }

  //Test case number: 12
  /*
   * 2 covered goals:
   * Goal 1. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.<init>()V: root-Branch
   * Goal 2. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.getNumberOfElements()I: root-Branch
   */

  @Test
  public void test12()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.getNumberOfElements();
      assertEquals(0, int0);
  }
}

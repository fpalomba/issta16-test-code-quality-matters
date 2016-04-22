/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 13 06:35:43 GMT 2015
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
   * Goal 1. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.getValue(II)I: I30 Branch 7 IFLT L65 - true
   */

  @Test
  public void test0()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.addNewNode();
      int int1 = expressionMatrixImpl0.getValue(0, (-493));
      assertEquals((-1), int1);
  }

  //Test case number: 1
  /*
   * 5 covered goals:
   * Goal 1. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.getNumberOfNodes()I: root-Branch
   * Goal 2. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.getValue(II)I: I6 Branch 5 IFLT L63 - true
   * Goal 3. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I152 Branch 22 IF_ICMPNE L129 - true
   * Goal 4. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I290 Branch 26 IF_ICMPEQ L148 - false
   * Goal 5. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I296 Branch 27 IF_ICMPEQ L148 - true
   */

  @Test
  public void test1()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(7605);
      int int0 = expressionMatrixImpl0.getNumberOfNodes();
      int int1 = expressionMatrixImpl0.getValue(7605, 7605);
      int int2 = expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 0, 0);
      String string0 = expressionMatrixImpl0.toString();
      int int3 = expressionMatrixImpl0.getValue((-1), 7605);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.setValue(III)V: I37 Branch 4 IF_ICMPGE L56 - false
   */

  @Test
  public void test2()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(11326);
      int int0 = expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 0, 0);
      assertEquals(11326, expressionMatrixImpl0.getNumberOfElements());
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * Goal 1. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.setValue(III)V: I30 Branch 3 IFLT L56 - false
   * Goal 2. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.setValue(III)V: I37 Branch 4 IF_ICMPGE L56 - true
   */

  @Test
  public void test3()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 0, 0);
      assertEquals(1, expressionMatrixImpl0.getNumberOfNodes());
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * Goal 1. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.setValue(III)V: I14 Branch 2 IF_ICMPGE L53 - true
   * Goal 2. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.outNoStandardConnections(ZLcom/browsersoft/openhre/hl7/api/regular/ExpressionElementMapper;)Ljava/lang/String;: I39 Branch 12 IFNONNULL L87 - true
   */

  @Test
  public void test4()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.setValue(23, 23, 23);
      expressionMatrixImpl0.creatMatrix(23);
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      int int0 = expressionMatrixImpl0.addNewNode();
      // Undeclared exception!
      try {
        String string0 = expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) expressionElementMapperImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * Goal 1. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.setValue(III)V: I6 Branch 1 IFLT L53 - true
   * Goal 2. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.getValue(II)I: I14 Branch 6 IF_ICMPGE L63 - true
   */

  @Test
  public void test5()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.getValue(11332, 11332);
      expressionMatrixImpl0.setValue((-1), (-1), (-1));
      assertEquals(0, expressionMatrixImpl0.getNumberOfNodes());
  }

  //Test case number: 6
  /*
   * 25 covered goals:
   * Goal 1. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.creatMatrix(I)V: root-Branch
   * Goal 2. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.getValue(II)I: I37 Branch 8 IF_ICMPGE L65 - false
   * Goal 3. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.addNewNode()I: I17 Branch 9 IF_ICMPGE L74 - false
   * Goal 4. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.outNoStandardConnections(ZLcom/browsersoft/openhre/hl7/api/regular/ExpressionElementMapper;)Ljava/lang/String;: I16 Branch 10 IF_ICMPGE L83 - true
   * Goal 5. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.outNoStandardConnections(ZLcom/browsersoft/openhre/hl7/api/regular/ExpressionElementMapper;)Ljava/lang/String;: I16 Branch 10 IF_ICMPGE L83 - false
   * Goal 6. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.outNoStandardConnections(ZLcom/browsersoft/openhre/hl7/api/regular/ExpressionElementMapper;)Ljava/lang/String;: I28 Branch 11 IF_ICMPGE L84 - true
   * Goal 7. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.outNoStandardConnections(ZLcom/browsersoft/openhre/hl7/api/regular/ExpressionElementMapper;)Ljava/lang/String;: I28 Branch 11 IF_ICMPGE L84 - false
   * Goal 8. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.outNoStandardConnections(ZLcom/browsersoft/openhre/hl7/api/regular/ExpressionElementMapper;)Ljava/lang/String;: I39 Branch 12 IFNONNULL L87 - false
   * Goal 9. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.outNoStandardConnections(ZLcom/browsersoft/openhre/hl7/api/regular/ExpressionElementMapper;)Ljava/lang/String;: I73 Branch 13 IF_ICMPEQ L94 - true
   * Goal 10. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I41 Branch 18 IF_ICMPGE L117 - true
   * Goal 11. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I41 Branch 18 IF_ICMPGE L117 - false
   * Goal 12. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I70 Branch 19 IF_ICMPEQ L120 - true
   * Goal 13. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I70 Branch 19 IF_ICMPEQ L120 - false
   * Goal 14. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I112 Branch 20 IF_ICMPGE L125 - true
   * Goal 15. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I112 Branch 20 IF_ICMPGE L125 - false
   * Goal 16. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I137 Branch 21 IF_ICMPGE L127 - true
   * Goal 17. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I137 Branch 21 IF_ICMPGE L127 - false
   * Goal 18. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I152 Branch 22 IF_ICMPNE L129 - false
   * Goal 19. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I192 Branch 23 IF_ICMPEQ L134 - true
   * Goal 20. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I192 Branch 23 IF_ICMPEQ L134 - false
   * Goal 21. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I263 Branch 24 IF_ICMPGE L145 - true
   * Goal 22. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I263 Branch 24 IF_ICMPGE L145 - false
   * Goal 23. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I275 Branch 25 IF_ICMPGE L146 - true
   * Goal 24. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I275 Branch 25 IF_ICMPGE L146 - false
   * Goal 25. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I290 Branch 26 IF_ICMPEQ L148 - true
   */

  @Test
  public void test6()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(27);
      int int0 = expressionMatrixImpl0.addNewNode();
      String string0 = expressionMatrixImpl0.toString();
      String string1 = expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      assertEquals(27, expressionMatrixImpl0.getNumberOfElements());
  }

  //Test case number: 7
  /*
   * 8 covered goals:
   * Goal 1. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.setValue(III)V: I6 Branch 1 IFLT L53 - false
   * Goal 2. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.setValue(III)V: I14 Branch 2 IF_ICMPGE L53 - false
   * Goal 3. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.setValue(III)V: I30 Branch 3 IFLT L56 - true
   * Goal 4. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.getValue(II)I: I6 Branch 5 IFLT L63 - false
   * Goal 5. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.getValue(II)I: I14 Branch 6 IF_ICMPGE L63 - false
   * Goal 6. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.getValue(II)I: I30 Branch 7 IFLT L65 - false
   * Goal 7. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.getValue(II)I: I37 Branch 8 IF_ICMPGE L65 - true
   * Goal 8. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.addNewNode()I: I17 Branch 9 IF_ICMPGE L74 - true
   */

  @Test
  public void test7()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.addNewNode();
      int int1 = expressionMatrixImpl0.getValue(0, 0);
      int int2 = expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(1, (-1), (-1));
      assertEquals(0, expressionMatrixImpl0.getNumberOfElements());
  }

  //Test case number: 8
  /*
   * 2 covered goals:
   * Goal 1. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.<init>()V: root-Branch
   * Goal 2. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.getNumberOfElements()I: root-Branch
   */

  @Test
  public void test8()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.getNumberOfElements();
      assertEquals(0, int0);
  }
}

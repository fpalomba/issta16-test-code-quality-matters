/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 13 07:31:18 GMT 2015
 */

package com.browsersoft.openhre.hl7.impl.regular;

import static org.junit.Assert.*;
import org.junit.Test;
import com.browsersoft.openhre.hl7.api.regular.ExpressionElementMapper;
import com.browsersoft.openhre.hl7.impl.regular.ExpressionElementMapperImpl;
import com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl;
import com.browsersoft.openhre.hl7.impl.regular.MessageTracerImpl;
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
   * Goal 1. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I296 Branch 27 IF_ICMPEQ L148 - true
   */

  @Test
  public void test00()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      assertEquals(0, expressionMatrixImpl0.getNumberOfElements());
      
      expressionMatrixImpl0.creatMatrix(6243);
      int int0 = expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 0, 0);
      String string0 = expressionMatrixImpl0.toString();
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.outNoStandardConnections(ZLcom/browsersoft/openhre/hl7/api/regular/ExpressionElementMapper;)Ljava/lang/String;: I39 Branch 12 IFNONNULL L87 - true
   */

  @Test
  public void test01()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(9725);
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

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.getNumberOfNodes()I: root-Branch
   */

  @Test
  public void test02()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.getNumberOfNodes();
      assertEquals(0, int0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.setValue(III)V: I30 Branch 3 IFLT L56 - true
   */

  @Test
  public void test03()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, (-3886), 0);
      assertEquals(1, expressionMatrixImpl0.getNumberOfNodes());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * Goal 1. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.outNoStandardConnections(ZLcom/browsersoft/openhre/hl7/api/regular/ExpressionElementMapper;)Ljava/lang/String;: I136 Branch 17 IF_ICMPLT L101 - false
   */

  @Test
  public void test04()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(6243);
      int int0 = expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 14, 0);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      ExpressionElementMapper expressionElementMapper0 = messageTracerImpl0.getMapper();
      String string0 = expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      assertEquals(6243, expressionMatrixImpl0.getNumberOfElements());
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * Goal 1. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.outNoStandardConnections(ZLcom/browsersoft/openhre/hl7/api/regular/ExpressionElementMapper;)Ljava/lang/String;: I94 Branch 16 IF_ICMPGE L96 - true
   */

  @Test
  public void test05()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(6233);
      int int0 = expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 1431, 0);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      ExpressionElementMapper expressionElementMapper0 = messageTracerImpl0.getMapper();
      String string0 = expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      assertEquals("", string0);
  }

  //Test case number: 6
  /*
   * 2 covered goals:
   * Goal 1. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.outNoStandardConnections(ZLcom/browsersoft/openhre/hl7/api/regular/ExpressionElementMapper;)Ljava/lang/String;: I86 Branch 15 IFEQ L95 - true
   * Goal 2. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.outNoStandardConnections(ZLcom/browsersoft/openhre/hl7/api/regular/ExpressionElementMapper;)Ljava/lang/String;: I136 Branch 17 IF_ICMPLT L101 - true
   */

  @Test
  public void test06()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(360);
      int int0 = expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 10, 360);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      ExpressionElementMapper expressionElementMapper0 = messageTracerImpl0.getMapper();
      String string0 = expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      assertEquals(360, expressionMatrixImpl0.getNumberOfElements());
  }

  //Test case number: 7
  /*
   * 3 covered goals:
   * Goal 1. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.outNoStandardConnections(ZLcom/browsersoft/openhre/hl7/api/regular/ExpressionElementMapper;)Ljava/lang/String;: I79 Branch 14 IF_ICMPEQ L94 - false
   * Goal 2. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.outNoStandardConnections(ZLcom/browsersoft/openhre/hl7/api/regular/ExpressionElementMapper;)Ljava/lang/String;: I86 Branch 15 IFEQ L95 - false
   * Goal 3. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.outNoStandardConnections(ZLcom/browsersoft/openhre/hl7/api/regular/ExpressionElementMapper;)Ljava/lang/String;: I94 Branch 16 IF_ICMPGE L96 - false
   */

  @Test
  public void test07()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(6243);
      int int0 = expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 14, 360);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      ExpressionElementMapper expressionElementMapper0 = messageTracerImpl0.getMapper();
      String string0 = expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      assertEquals(6243, expressionMatrixImpl0.getNumberOfElements());
  }

  //Test case number: 8
  /*
   * 8 covered goals:
   * Goal 1. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.outNoStandardConnections(ZLcom/browsersoft/openhre/hl7/api/regular/ExpressionElementMapper;)Ljava/lang/String;: I16 Branch 10 IF_ICMPGE L83 - true
   * Goal 2. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.outNoStandardConnections(ZLcom/browsersoft/openhre/hl7/api/regular/ExpressionElementMapper;)Ljava/lang/String;: I16 Branch 10 IF_ICMPGE L83 - false
   * Goal 3. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.outNoStandardConnections(ZLcom/browsersoft/openhre/hl7/api/regular/ExpressionElementMapper;)Ljava/lang/String;: I28 Branch 11 IF_ICMPGE L84 - true
   * Goal 4. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.outNoStandardConnections(ZLcom/browsersoft/openhre/hl7/api/regular/ExpressionElementMapper;)Ljava/lang/String;: I28 Branch 11 IF_ICMPGE L84 - false
   * Goal 5. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.outNoStandardConnections(ZLcom/browsersoft/openhre/hl7/api/regular/ExpressionElementMapper;)Ljava/lang/String;: I39 Branch 12 IFNONNULL L87 - false
   * Goal 6. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.outNoStandardConnections(ZLcom/browsersoft/openhre/hl7/api/regular/ExpressionElementMapper;)Ljava/lang/String;: I73 Branch 13 IF_ICMPEQ L94 - true
   * Goal 7. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.outNoStandardConnections(ZLcom/browsersoft/openhre/hl7/api/regular/ExpressionElementMapper;)Ljava/lang/String;: I73 Branch 13 IF_ICMPEQ L94 - false
   * Goal 8. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.outNoStandardConnections(ZLcom/browsersoft/openhre/hl7/api/regular/ExpressionElementMapper;)Ljava/lang/String;: I79 Branch 14 IF_ICMPEQ L94 - true
   */

  @Test
  public void test08()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(1591);
      int int0 = expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 0, 0);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      ExpressionElementMapper expressionElementMapper0 = messageTracerImpl0.getMapper();
      String string0 = expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      assertEquals(1591, expressionMatrixImpl0.getNumberOfElements());
  }

  //Test case number: 9
  /*
   * 2 covered goals:
   * Goal 1. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.setValue(III)V: I6 Branch 1 IFLT L53 - true
   * Goal 2. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.getValue(II)I: I30 Branch 7 IFLT L65 - true
   */

  @Test
  public void test09()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.addNewNode();
      int int1 = expressionMatrixImpl0.getValue(0, (-1180));
      expressionMatrixImpl0.setValue((-1180), (-1180), (-1180));
      assertEquals(0, expressionMatrixImpl0.getNumberOfElements());
  }

  //Test case number: 10
  /*
   * 3 covered goals:
   * Goal 1. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.setValue(III)V: I14 Branch 2 IF_ICMPGE L53 - true
   * Goal 2. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.setValue(III)V: I37 Branch 4 IF_ICMPGE L56 - true
   * Goal 3. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.getValue(II)I: I37 Branch 8 IF_ICMPGE L65 - true
   */

  @Test
  public void test10()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 0, 0);
      expressionMatrixImpl0.setValue(5224, 0, 0);
      int int1 = expressionMatrixImpl0.getValue(0, 0);
      assertEquals((-1), int1);
  }

  //Test case number: 11
  /*
   * 33 covered goals:
   * Goal 1. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.getNumberOfElements()I: root-Branch
   * Goal 2. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.creatMatrix(I)V: root-Branch
   * Goal 3. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.setValue(III)V: I6 Branch 1 IFLT L53 - false
   * Goal 4. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.setValue(III)V: I14 Branch 2 IF_ICMPGE L53 - false
   * Goal 5. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.setValue(III)V: I30 Branch 3 IFLT L56 - false
   * Goal 6. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.setValue(III)V: I37 Branch 4 IF_ICMPGE L56 - false
   * Goal 7. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.getValue(II)I: I6 Branch 5 IFLT L63 - true
   * Goal 8. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.getValue(II)I: I6 Branch 5 IFLT L63 - false
   * Goal 9. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.getValue(II)I: I14 Branch 6 IF_ICMPGE L63 - true
   * Goal 10. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.getValue(II)I: I14 Branch 6 IF_ICMPGE L63 - false
   * Goal 11. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.getValue(II)I: I30 Branch 7 IFLT L65 - false
   * Goal 12. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.getValue(II)I: I37 Branch 8 IF_ICMPGE L65 - false
   * Goal 13. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.addNewNode()I: I17 Branch 9 IF_ICMPGE L74 - true
   * Goal 14. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.addNewNode()I: I17 Branch 9 IF_ICMPGE L74 - false
   * Goal 15. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I41 Branch 18 IF_ICMPGE L117 - true
   * Goal 16. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I41 Branch 18 IF_ICMPGE L117 - false
   * Goal 17. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I70 Branch 19 IF_ICMPEQ L120 - true
   * Goal 18. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I70 Branch 19 IF_ICMPEQ L120 - false
   * Goal 19. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I112 Branch 20 IF_ICMPGE L125 - true
   * Goal 20. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I112 Branch 20 IF_ICMPGE L125 - false
   * Goal 21. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I137 Branch 21 IF_ICMPGE L127 - true
   * Goal 22. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I137 Branch 21 IF_ICMPGE L127 - false
   * Goal 23. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I152 Branch 22 IF_ICMPNE L129 - true
   * Goal 24. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I152 Branch 22 IF_ICMPNE L129 - false
   * Goal 25. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I192 Branch 23 IF_ICMPEQ L134 - true
   * Goal 26. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I192 Branch 23 IF_ICMPEQ L134 - false
   * Goal 27. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I263 Branch 24 IF_ICMPGE L145 - true
   * Goal 28. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I263 Branch 24 IF_ICMPGE L145 - false
   * Goal 29. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I275 Branch 25 IF_ICMPGE L146 - true
   * Goal 30. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I275 Branch 25 IF_ICMPGE L146 - false
   * Goal 31. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I290 Branch 26 IF_ICMPEQ L148 - true
   * Goal 32. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I290 Branch 26 IF_ICMPEQ L148 - false
   * Goal 33. com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl.toString()Ljava/lang/String;: I296 Branch 27 IF_ICMPEQ L148 - false
   */

  @Test
  public void test11()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.getValue((-536), (-536));
      int int1 = expressionMatrixImpl0.getValue(0, (-536));
      expressionMatrixImpl0.creatMatrix(164);
      int int2 = expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 14, 0);
      String string0 = expressionMatrixImpl0.toString();
      int int3 = expressionMatrixImpl0.getNumberOfElements();
      assertEquals(164, int3);
  }
}

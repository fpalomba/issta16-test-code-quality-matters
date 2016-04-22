/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 14 15:38:04 GMT 2015
 */

package com.lts.application.international;

import static org.junit.Assert.*;
import org.junit.Test;
import com.lts.application.ApplicationException;
import com.lts.application.international.MessageFormatter;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.sequences.TrueCasingForNISTDocumentReaderAndWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class MessageFormatter_ESTest extends MessageFormatter_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. com.lts.application.international.MessageFormatter.listResources(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/util/List;: root-Branch
   */

  @Test
  public void test00()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      List list0 = messageFormatter0.listResources("QP <1 /^RB|JJ|IN/=left [ ( <2 /^JJ|IN/=right <3 /^CD|DT/ ) | ( <2 /^JJ|IN/ <3 ( IN=right < /^(?i:us|than)$/ ) <4 /^CD|DT/ ) ] ", classLoader0);
      assertTrue(list0.isEmpty());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. com.lts.application.international.MessageFormatter.getMessage(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test01()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try {
        String string0 = messageFormatter0.getMessage("QP <1 /^RB|JJ|IN/=left [ ( <2 /^JJ|IN/=right <3 /^CD|DT/ ) | ( <2 /^JJ|IN/ <3 ( IN=right < /^(?i:us|than)$/ ) <4 /^CD|DT/ ) ] ", (Object) "QP <1 /^RB|JJ|IN/=left [ ( <2 /^JJ|IN/=right <3 /^CD|DT/ ) | ( <2 /^JJ|IN/ <3 ( IN=right < /^(?i:us|than)$/ ) <4 /^CD|DT/ ) ] ", (Object) "QP <1 /^RB|JJ|IN/=left [ ( <2 /^JJ|IN/=right <3 /^CD|DT/ ) | ( <2 /^JJ|IN/ <3 ( IN=right < /^(?i:us|than)$/ ) <4 /^CD|DT/ ) ] ");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
      }
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. com.lts.application.international.MessageFormatter.getMessage(Ljava/lang/Throwable;)Ljava/lang/String;: I20 Branch 8 IFEQ L372 - true
   */

  @Test
  public void test02()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try {
        String string0 = messageFormatter0.getMessage((Throwable) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
      }
  }

  //Test case number: 3
  /*
   * 3 covered goals:
   * Goal 1. com.lts.application.international.MessageFormatter.buildList([Ljava/lang/Object;)Ljava/util/List;: I13 Branch 1 IF_ACMPEQ L122 - false
   * Goal 2. com.lts.application.international.MessageFormatter.buildList([Ljava/lang/Object;)Ljava/util/List;: I25 Branch 2 IF_ICMPGE L124 - true
   * Goal 3. com.lts.application.international.MessageFormatter.buildList([Ljava/lang/Object;)Ljava/util/List;: I25 Branch 2 IF_ICMPGE L124 - false
   */

  @Test
  public void test03()  throws Throwable  {
      Object[] objectArray0 = new Object[14];
      List list0 = MessageFormatter.buildList(objectArray0);
      assertEquals(14, list0.size());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * Goal 1. com.lts.application.international.MessageFormatter.formatMessage(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;: I16 Branch 5 IFEQ L300 - false
   */

  @Test
  public void test04()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      messageFormatter0.addBundle((ResourceBundle) null);
      Integer integer0 = new Integer((-34));
      // Undeclared exception!
      try {
        String string0 = messageFormatter0.getMessage((String) null, (Object) integer0, (Object) integer0, (Object) integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * Goal 1. com.lts.application.international.MessageFormatter.tryLoad(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ResourceBundle;: I18 Branch 17 IFGT L485 - true
   */

  @Test
  public void test05()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try {
        ResourceBundle resourceBundle0 = messageFormatter0.tryLoad("", "After UCPTrrnsormer:  B       ] ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. com.lts.application.international.MessageFormatter.initializeResourceBundle()V: root-Branch
   */

  @Test
  public void test06()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      messageFormatter0.initializeResourceBundle();
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. com.lts.application.international.MessageFormatter.formatMessage(Ljava/lang/String;[Ljava/lang/Object;Ljava/util/ResourceBundle;)Ljava/lang/String;: I16 Branch 4 IF_ACMPNE L277 - true
   */

  @Test
  public void test07()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      Object[] objectArray0 = new Object[7];
      // Undeclared exception!
      try {
        String string0 = messageFormatter0.formatMessage((String) null, objectArray0, (ResourceBundle) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * Goal 1. com.lts.application.international.MessageFormatter.listToString(Ljava/util/List;)Ljava/lang/String;: I7 Branch 13 IF_ACMPNE L459 - false
   */

  @Test
  public void test08()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      String string0 = messageFormatter0.listToString((List<String>) null);
      assertEquals("null", string0);
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * Goal 1. com.lts.application.international.MessageFormatter.getMessage(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test09()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try {
        String string0 = messageFormatter0.getMessage("buseSMD", (Object) "buseSMD", (Object) messageFormatter0, (Object) "buseSMD");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
      }
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * Goal 1. com.lts.application.international.MessageFormatter.getLastException()Ljava/lang/Throwable;: root-Branch
   */

  @Test
  public void test10()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      Throwable throwable0 = messageFormatter0.getLastException();
      assertNull(throwable0);
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * Goal 1. com.lts.application.international.MessageFormatter.getMessage(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test11()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try {
        String string0 = messageFormatter0.getMessage("QP <1 /^RB|JJ|IN/=left[ ( <2 /^JJ|IN/=right <3 /^CD|DT/ ) | ( <2 /^JJ|IN/ <3 ( IN=right < /^(?i:us|than)$/ ) <4 /^CD|DT/ ) ] ");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
      }
  }

  //Test case number: 12
  /*
   * 2 covered goals:
   * Goal 1. com.lts.application.international.MessageFormatter$LoadBundleError.<init>(Ljava/lang/String;Ljava/lang/Throwable;)V: root-Branch
   * Goal 2. com.lts.application.international.MessageFormatter.createLoadException(Ljava/util/List;)Lcom/lts/application/ApplicationException;: I21 Branch 3 IFEQ L180 - true
   */

  @Test
  public void test12()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      MessageFormatter.LoadBundleError messageFormatter_LoadBundleError0 = new MessageFormatter.LoadBundleError("#Tx`X;]T6Z&G9;-\"kP", (Throwable) mockThrowable0);
      MessageFormatter messageFormatter0 = new MessageFormatter();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      ApplicationException applicationException0 = messageFormatter0.createLoadException(arrayList0);
      assertEquals("critical.com.lts.application.errors.resourceBundle.load", applicationException0.getKey());
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * Goal 1. com.lts.application.international.MessageFormatter.buildList([Ljava/lang/Object;)Ljava/util/List;: I13 Branch 1 IF_ACMPEQ L122 - true
   */

  @Test
  public void test13()  throws Throwable  {
      List list0 = MessageFormatter.buildList((Object[]) null);
      assertEquals(0, list0.size());
  }

  //Test case number: 14
  /*
   * 13 covered goals:
   * Goal 1. com.lts.application.international.MessageFormatter.initializeResourceBundle(Ljava/util/List;Ljava/util/List;)V: root-Branch
   * Goal 2. com.lts.application.international.MessageFormatter.initializeResourceBundle(Ljava/util/List;)V: root-Branch
   * Goal 3. com.lts.application.international.MessageFormatter.initializeResourceBundle(Ljava/util/List;Ljava/util/List;Ljava/util/Locale;Ljava/lang/ClassLoader;)V: I40 Branch 9 IF_ICMPGE L430 - false
   * Goal 4. com.lts.application.international.MessageFormatter.addResourceBundles()V: I12 Branch 10 IFEQ L445 - true
   * Goal 5. com.lts.application.international.MessageFormatter.addResourceBundles()V: I12 Branch 10 IFEQ L445 - false
   * Goal 6. com.lts.application.international.MessageFormatter.addResourceBundles()V: I29 Branch 11 IFEQ L447 - true
   * Goal 7. com.lts.application.international.MessageFormatter.addResourceBundles()V: I29 Branch 11 IFEQ L447 - false
   * Goal 8. com.lts.application.international.MessageFormatter.addResourceBundles()V: I48 Branch 12 IF_ACMPEQ L450 - true
   * Goal 9. com.lts.application.international.MessageFormatter.listToString(Ljava/util/List;)Ljava/lang/String;: I7 Branch 13 IF_ACMPNE L459 - true
   * Goal 10. com.lts.application.international.MessageFormatter.listToString(Ljava/util/List;)Ljava/lang/String;: I33 Branch 14 IFEQ L465 - true
   * Goal 11. com.lts.application.international.MessageFormatter.listToString(Ljava/util/List;)Ljava/lang/String;: I33 Branch 14 IFEQ L465 - false
   * Goal 12. com.lts.application.international.MessageFormatter.listToString(Ljava/util/List;)Ljava/lang/String;: I44 Branch 15 IFEQ L467 - true
   * Goal 13. com.lts.application.international.MessageFormatter.listToString(Ljava/util/List;)Ljava/lang/String;: I44 Branch 15 IFEQ L467 - false
   */

  @Test
  public void test14()  throws Throwable  {
      List<String> list0 = ResourceBundle.Control.FORMAT_DEFAULT;
      MessageFormatter messageFormatter0 = new MessageFormatter();
      try {
        messageFormatter0.initializeResourceBundle(list0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Could not find any resource bundle give names: messages; and resource path: java.class, java.properties
         //
      }
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * Goal 1. com.lts.application.international.MessageFormatter.createLoadException(Ljava/util/List;)Lcom/lts/application/ApplicationException;: I21 Branch 3 IFEQ L180 - false
   */

  @Test
  public void test15()  throws Throwable  {
      TrueCasingForNISTDocumentReaderAndWriter.LineToTrueCasesParser trueCasingForNISTDocumentReaderAndWriter_LineToTrueCasesParser0 = new TrueCasingForNISTDocumentReaderAndWriter.LineToTrueCasesParser();
      List<CoreLabel> list0 = trueCasingForNISTDocumentReaderAndWriter_LineToTrueCasesParser0.apply("QP <1 /^RB|JJ|IN/=left [ ( <2 /^JJ|IN/=right <3 /^CD|DT/ ) | ( <2 /^JJ|IN/ <3 ( IN=right < /^(?i:us|than)$/ ) <4 /^CD|DT/ ) ] ");
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try {
        ApplicationException applicationException0 = messageFormatter0.createLoadException(list0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // edu.stanford.nlp.ling.CoreLabel cannot be cast to com.lts.application.international.MessageFormatter$LoadBundleError
         //
      }
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * Goal 1. com.lts.application.international.MessageFormatter.temp()V: root-Branch
   */

  @Test
  public void test16()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      messageFormatter0.temp();
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * Goal 1. com.lts.application.international.MessageFormatter.getMessage(Ljava/lang/Throwable;)Ljava/lang/String;: I20 Branch 8 IFEQ L372 - false
   */

  @Test
  public void test17()  throws Throwable  {
      ApplicationException applicationException0 = new ApplicationException("After UCPTrrnsormer:  B       ] ", "After UCPTrrnsormer:  B       ] ", "After UCPTrrnsormer:  B       ] ");
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try {
        String string0 = messageFormatter0.getMessage((Throwable) applicationException0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
      }
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * Goal 1. com.lts.application.international.MessageFormatter.loadCriticalBundles()Ljava/util/List;: root-Branch
   */

  @Test
  public void test18()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      List list0 = messageFormatter0.loadCriticalBundles();
      assertTrue(list0.isEmpty());
  }

  //Test case number: 19
  /*
   * 3 covered goals:
   * Goal 1. com.lts.application.international.MessageFormatter.getMessage(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;: root-Branch
   * Goal 2. com.lts.application.international.MessageFormatter.formatMessage(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;: I16 Branch 5 IFEQ L300 - true
   * Goal 3. com.lts.application.international.MessageFormatter.formatMessage(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;: I55 Branch 7 IF_ACMPNE L307 - false
   */

  @Test
  public void test19()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      try {
        String string0 = messageFormatter0.getMessage("&$;.fyM:FaO", (Object[]) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
      }
  }

  //Test case number: 20
  /*
   * 2 covered goals:
   * Goal 1. com.lts.application.international.MessageFormatter.tryLoad(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ResourceBundle;: I11 Branch 16 IF_ACMPEQ L485 - false
   * Goal 2. com.lts.application.international.MessageFormatter.tryLoad(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ResourceBundle;: I18 Branch 17 IFGT L485 - false
   */

  @Test
  public void test20()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try {
        ResourceBundle resourceBundle0 = messageFormatter0.tryLoad("(This is used when getting Dataset from adaptation set.We want to make the idex consistent.)", "(This is used when getting Dataset from adaptation set.We want to make the idex consistent.)");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 21
  /*
   * 1 covered goal:
   * Goal 1. com.lts.application.international.MessageFormatter.formatMessage(Ljava/lang/String;[Ljava/lang/Object;Ljava/util/ResourceBundle;)Ljava/lang/String;: I16 Branch 4 IF_ACMPNE L277 - false
   */

  @Test
  public void test21()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try {
        String string0 = messageFormatter0.formatMessage((String) null, (Object[]) null, (ResourceBundle) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 22
  /*
   * 2 covered goals:
   * Goal 1. com.lts.application.international.MessageFormatter.<init>()V: root-Branch
   * Goal 2. com.lts.application.international.MessageFormatter.tryLoad(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ResourceBundle;: I11 Branch 16 IF_ACMPEQ L485 - true
   */

  @Test
  public void test22()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try {
        ResourceBundle resourceBundle0 = messageFormatter0.tryLoad((String) null, "(This is used when getting Dataset from adaptation set.We want to make the idex consistent.)");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}

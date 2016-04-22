/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 14 19:39:07 GMT 2015
 */

package com.lts.application.international;

import static org.junit.Assert.*;
import org.junit.Test;
import com.lts.application.ApplicationException;
import com.lts.application.international.MessageFormatter;
import edu.stanford.nlp.ling.IndexedWord;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.LineNumberInputStream;
import java.util.List;
import java.util.PropertyResourceBundle;
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
   * Goal 1. com.lts.application.international.MessageFormatter.tryLoad(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ResourceBundle;: I18 Branch 17 IFGT L485 - true
   */

  @Test
  public void test00()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try {
        ResourceBundle resourceBundle0 = messageFormatter0.tryLoad("", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. com.lts.application.international.MessageFormatter.tryLoad(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ResourceBundle;: I11 Branch 16 IF_ACMPEQ L485 - true
   */

  @Test
  public void test01()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try {
        ResourceBundle resourceBundle0 = messageFormatter0.tryLoad((String) null, (String) null);
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
   * Goal 1. com.lts.application.international.MessageFormatter.listToString(Ljava/util/List;)Ljava/lang/String;: I7 Branch 13 IF_ACMPNE L459 - false
   */

  @Test
  public void test02()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      String string0 = messageFormatter0.listToString((List<String>) null);
      assertEquals("null", string0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. com.lts.application.international.MessageFormatter.getMessage(Ljava/lang/Throwable;)Ljava/lang/String;: I20 Branch 8 IFEQ L372 - false
   */

  @Test
  public void test03()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      Object[] objectArray0 = new Object[14];
      ApplicationException applicationException0 = new ApplicationException((Throwable) null, "prog", objectArray0);
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

  //Test case number: 4
  /*
   * 1 covered goal:
   * Goal 1. com.lts.application.international.MessageFormatter.getMessage(Ljava/lang/Throwable;)Ljava/lang/String;: I20 Branch 8 IFEQ L372 - true
   */

  @Test
  public void test04()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      MockThrowable mockThrowable0 = new MockThrowable("Cp5C");
      // Undeclared exception!
      try {
        String string0 = messageFormatter0.getMessage((Throwable) mockThrowable0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
      }
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * Goal 1. com.lts.application.international.MessageFormatter.formatMessage(Ljava/lang/String;[Ljava/lang/Object;Ljava/util/ResourceBundle;)Ljava/lang/String;: I16 Branch 4 IF_ACMPNE L277 - true
   * Goal 2. com.lts.application.international.MessageFormatter.formatMessage(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;: I36 Branch 6 IF_ACMPEQ L303 - true
   */

  @Test
  public void test05()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      MessageFormatter messageFormatter0 = new MessageFormatter();
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, 0);
      LineNumberInputStream lineNumberInputStream0 = new LineNumberInputStream((InputStream) byteArrayInputStream0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) lineNumberInputStream0);
      PropertyResourceBundle propertyResourceBundle0 = new PropertyResourceBundle((InputStream) bufferedInputStream0);
      messageFormatter0.addBundle((ResourceBundle) propertyResourceBundle0);
      try {
        String string0 = messageFormatter0.formatMessage("", objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
      }
  }

  //Test case number: 6
  /*
   * 4 covered goals:
   * Goal 1. com.lts.application.international.MessageFormatter.buildList([Ljava/lang/Object;)Ljava/util/List;: I13 Branch 1 IF_ACMPEQ L122 - false
   * Goal 2. com.lts.application.international.MessageFormatter.buildList([Ljava/lang/Object;)Ljava/util/List;: I25 Branch 2 IF_ICMPGE L124 - true
   * Goal 3. com.lts.application.international.MessageFormatter.buildList([Ljava/lang/Object;)Ljava/util/List;: I25 Branch 2 IF_ICMPGE L124 - false
   * Goal 4. com.lts.application.international.MessageFormatter.createLoadException(Ljava/util/List;)Lcom/lts/application/ApplicationException;: I21 Branch 3 IFEQ L180 - false
   */

  @Test
  public void test06()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      Object[] objectArray0 = new Object[2];
      List list0 = MessageFormatter.buildList(objectArray0);
      // Undeclared exception!
      try {
        ApplicationException applicationException0 = messageFormatter0.createLoadException(list0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. com.lts.application.international.MessageFormatter.buildList([Ljava/lang/Object;)Ljava/util/List;: I13 Branch 1 IF_ACMPEQ L122 - true
   */

  @Test
  public void test07()  throws Throwable  {
      List list0 = MessageFormatter.buildList((Object[]) null);
      assertTrue(list0.isEmpty());
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * Goal 1. com.lts.application.international.MessageFormatter$LoadBundleError.<init>(Ljava/lang/String;Ljava/lang/Throwable;)V: root-Branch
   */

  @Test
  public void test08()  throws Throwable  {
      MessageFormatter.LoadBundleError messageFormatter_LoadBundleError0 = new MessageFormatter.LoadBundleError("edu.stanford.nlp.process.Morphology", (Throwable) null);
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * Goal 1. com.lts.application.international.MessageFormatter.getMessage(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test09()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      Object object0 = new Object();
      // Undeclared exception!
      try {
        String string0 = messageFormatter0.getMessage("com.lts.application.international.MessageFormatter", (Object) "com.lts.application.international.MessageFormatter", object0);
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
   * Goal 1. com.lts.application.international.MessageFormatter.initializeResourceBundle(Ljava/util/List;)V: root-Branch
   */

  @Test
  public void test10()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      List<String> list0 = ResourceBundle.Control.FORMAT_CLASS;
      try {
        messageFormatter0.initializeResourceBundle(list0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Could not find any resource bundle give names: messages; and resource path: java.class
         //
      }
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * Goal 1. com.lts.application.international.MessageFormatter.initializeResourceBundle()V: root-Branch
   */

  @Test
  public void test11()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      messageFormatter0.initializeResourceBundle();
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * Goal 1. com.lts.application.international.MessageFormatter.getMessage(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test12()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      Object[] objectArray0 = new Object[10];
      try {
        String string0 = messageFormatter0.getMessage("", objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
      }
  }

  //Test case number: 13
  /*
   * 2 covered goals:
   * Goal 1. com.lts.application.international.MessageFormatter.loadCriticalBundles()Ljava/util/List;: root-Branch
   * Goal 2. com.lts.application.international.MessageFormatter.createLoadException(Ljava/util/List;)Lcom/lts/application/ApplicationException;: I21 Branch 3 IFEQ L180 - true
   */

  @Test
  public void test13()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      List list0 = messageFormatter0.loadCriticalBundles();
      ApplicationException applicationException0 = messageFormatter0.createLoadException(list0);
      assertEquals("critical.com.lts.application.errors.resourceBundle.load", applicationException0.getKey());
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * Goal 1. com.lts.application.international.MessageFormatter.getMessage(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test14()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try {
        String string0 = messageFormatter0.getMessage("shit");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
      }
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * Goal 1. com.lts.application.international.MessageFormatter.getLastException()Ljava/lang/Throwable;: root-Branch
   */

  @Test
  public void test15()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      Throwable throwable0 = messageFormatter0.getLastException();
      assertNull(throwable0);
  }

  //Test case number: 16
  /*
   * 14 covered goals:
   * Goal 1. com.lts.application.international.MessageFormatter.initializeResourceBundle(Ljava/util/List;Ljava/util/List;)V: root-Branch
   * Goal 2. com.lts.application.international.MessageFormatter.initializeResourceBundle(Ljava/util/List;Ljava/util/List;Ljava/util/Locale;Ljava/lang/ClassLoader;)V: I40 Branch 9 IF_ICMPGE L430 - false
   * Goal 3. com.lts.application.international.MessageFormatter.addResourceBundles()V: I12 Branch 10 IFEQ L445 - true
   * Goal 4. com.lts.application.international.MessageFormatter.addResourceBundles()V: I12 Branch 10 IFEQ L445 - false
   * Goal 5. com.lts.application.international.MessageFormatter.addResourceBundles()V: I29 Branch 11 IFEQ L447 - true
   * Goal 6. com.lts.application.international.MessageFormatter.addResourceBundles()V: I29 Branch 11 IFEQ L447 - false
   * Goal 7. com.lts.application.international.MessageFormatter.addResourceBundles()V: I48 Branch 12 IF_ACMPEQ L450 - true
   * Goal 8. com.lts.application.international.MessageFormatter.listToString(Ljava/util/List;)Ljava/lang/String;: I7 Branch 13 IF_ACMPNE L459 - true
   * Goal 9. com.lts.application.international.MessageFormatter.listToString(Ljava/util/List;)Ljava/lang/String;: I33 Branch 14 IFEQ L465 - true
   * Goal 10. com.lts.application.international.MessageFormatter.listToString(Ljava/util/List;)Ljava/lang/String;: I33 Branch 14 IFEQ L465 - false
   * Goal 11. com.lts.application.international.MessageFormatter.listToString(Ljava/util/List;)Ljava/lang/String;: I44 Branch 15 IFEQ L467 - true
   * Goal 12. com.lts.application.international.MessageFormatter.listToString(Ljava/util/List;)Ljava/lang/String;: I44 Branch 15 IFEQ L467 - false
   * Goal 13. com.lts.application.international.MessageFormatter.tryLoad(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ResourceBundle;: I11 Branch 16 IF_ACMPEQ L485 - false
   * Goal 14. com.lts.application.international.MessageFormatter.tryLoad(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ResourceBundle;: I18 Branch 17 IFGT L485 - false
   */

  @Test
  public void test16()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      List<String> list0 = ResourceBundle.Control.FORMAT_DEFAULT;
      try {
        messageFormatter0.initializeResourceBundle(list0, list0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Could not find any resource bundle give names: java.class, java.properties; and resource path: java.class, java.properties
         //
      }
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * Goal 1. com.lts.application.international.MessageFormatter.temp()V: root-Branch
   */

  @Test
  public void test17()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      messageFormatter0.temp();
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * Goal 1. com.lts.application.international.MessageFormatter.listResources(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/util/List;: root-Branch
   */

  @Test
  public void test18()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      List list0 = messageFormatter0.listResources(" : ", classLoader0);
      assertTrue(list0.isEmpty());
  }

  //Test case number: 19
  /*
   * 3 covered goals:
   * Goal 1. com.lts.application.international.MessageFormatter.addBundle(Ljava/util/ResourceBundle;)V: root-Branch
   * Goal 2. com.lts.application.international.MessageFormatter.formatMessage(Ljava/lang/String;[Ljava/lang/Object;Ljava/util/ResourceBundle;)Ljava/lang/String;: I16 Branch 4 IF_ACMPNE L277 - false
   * Goal 3. com.lts.application.international.MessageFormatter.formatMessage(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;: I16 Branch 5 IFEQ L300 - false
   */

  @Test
  public void test19()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      messageFormatter0.addBundle((ResourceBundle) null);
      // Undeclared exception!
      try {
        String string0 = messageFormatter0.formatMessage("", (Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 20
  /*
   * 4 covered goals:
   * Goal 1. com.lts.application.international.MessageFormatter.getMessage(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;: root-Branch
   * Goal 2. com.lts.application.international.MessageFormatter.<init>()V: root-Branch
   * Goal 3. com.lts.application.international.MessageFormatter.formatMessage(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;: I16 Branch 5 IFEQ L300 - true
   * Goal 4. com.lts.application.international.MessageFormatter.formatMessage(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;: I55 Branch 7 IF_ACMPNE L307 - false
   */

  @Test
  public void test20()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      IndexedWord indexedWord0 = new IndexedWord((String) null, (-3310), (-3310));
      // Undeclared exception!
      try {
        String string0 = messageFormatter0.getMessage((String) null, (Object) messageFormatter0, (Object) null, (Object) indexedWord0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
      }
  }
}

/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 14 17:25:58 GMT 2015
 */

package com.lts.application.international;

import static org.junit.Assert.*;
import org.junit.Test;
import com.lts.application.ApplicationException;
import com.lts.application.international.MessageFormatter;
import edu.stanford.nlp.ling.WordLemmaTag;
import edu.stanford.nlp.pipeline.Annotation;
import java.io.InputStream;
import java.io.StringBufferInputStream;
import java.util.LinkedList;
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
        ResourceBundle resourceBundle0 = messageFormatter0.tryLoad((String) null, " Ln1K.?FT_k~.N!");
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
      LinkedList<WordLemmaTag> linkedList0 = new LinkedList<WordLemmaTag>();
      ApplicationException applicationException0 = messageFormatter0.createLoadException(linkedList0);
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
      MockThrowable mockThrowable0 = new MockThrowable();
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
   * 3 covered goals:
   * Goal 1. com.lts.application.international.MessageFormatter.getMessage(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   * Goal 2. com.lts.application.international.MessageFormatter.formatMessage(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;: I36 Branch 6 IF_ACMPEQ L303 - false
   * Goal 3. com.lts.application.international.MessageFormatter.formatMessage(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;: I55 Branch 7 IF_ACMPNE L307 - true
   */

  @Test
  public void test05()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      StringBufferInputStream stringBufferInputStream0 = new StringBufferInputStream("`2[q");
      PropertyResourceBundle propertyResourceBundle0 = new PropertyResourceBundle((InputStream) stringBufferInputStream0);
      messageFormatter0.addBundle((ResourceBundle) propertyResourceBundle0);
      String string0 = messageFormatter0.getMessage("`2[q");
      assertEquals("", string0);
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. com.lts.application.international.MessageFormatter.formatMessage(Ljava/lang/String;[Ljava/lang/Object;Ljava/util/ResourceBundle;)Ljava/lang/String;: I16 Branch 4 IF_ACMPNE L277 - false
   */

  @Test
  public void test06()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try {
        String string0 = messageFormatter0.formatMessage("yA3W", (Object[]) null, (ResourceBundle) null);
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
   * Goal 1. com.lts.application.international.MessageFormatter.createLoadException(Ljava/util/List;)Lcom/lts/application/ApplicationException;: I21 Branch 3 IFEQ L180 - false
   */

  @Test
  public void test07()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      List<String> list0 = ResourceBundle.Control.FORMAT_DEFAULT;
      // Undeclared exception!
      try {
        ApplicationException applicationException0 = messageFormatter0.createLoadException(list0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to com.lts.application.international.MessageFormatter$LoadBundleError
         //
      }
  }

  //Test case number: 8
  /*
   * 3 covered goals:
   * Goal 1. com.lts.application.international.MessageFormatter.buildList([Ljava/lang/Object;)Ljava/util/List;: I13 Branch 1 IF_ACMPEQ L122 - false
   * Goal 2. com.lts.application.international.MessageFormatter.buildList([Ljava/lang/Object;)Ljava/util/List;: I25 Branch 2 IF_ICMPGE L124 - true
   * Goal 3. com.lts.application.international.MessageFormatter.buildList([Ljava/lang/Object;)Ljava/util/List;: I25 Branch 2 IF_ICMPGE L124 - false
   */

  @Test
  public void test08()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      List list0 = MessageFormatter.buildList(objectArray0);
      assertEquals(3, list0.size());
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * Goal 1. com.lts.application.international.MessageFormatter.buildList([Ljava/lang/Object;)Ljava/util/List;: I13 Branch 1 IF_ACMPEQ L122 - true
   */

  @Test
  public void test09()  throws Throwable  {
      List list0 = MessageFormatter.buildList((Object[]) null);
      assertEquals(0, list0.size());
  }

  //Test case number: 10
  /*
   * 2 covered goals:
   * Goal 1. com.lts.application.international.MessageFormatter$LoadBundleError.<init>(Ljava/lang/String;Ljava/lang/Throwable;)V: root-Branch
   * Goal 2. com.lts.application.international.MessageFormatter.createLoadException(Ljava/util/List;)Lcom/lts/application/ApplicationException;: I21 Branch 3 IFEQ L180 - true
   */

  @Test
  public void test10()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      LinkedList<WordLemmaTag> linkedList0 = new LinkedList<WordLemmaTag>();
      ApplicationException applicationException0 = messageFormatter0.createLoadException(linkedList0);
      MessageFormatter.LoadBundleError messageFormatter_LoadBundleError0 = new MessageFormatter.LoadBundleError("", (Throwable) applicationException0);
      assertEquals("critical.com.lts.application.errors.resourceBundle.load", applicationException0.getKey());
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * Goal 1. com.lts.application.international.MessageFormatter.getMessage(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test11()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      Annotation annotation0 = new Annotation();
      // Undeclared exception!
      try {
        String string0 = messageFormatter0.getMessage("|Cp2C", (Object) annotation0, (Object) messageFormatter0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
      }
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * Goal 1. com.lts.application.international.MessageFormatter.initializeResourceBundle()V: root-Branch
   */

  @Test
  public void test12()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      messageFormatter0.initializeResourceBundle();
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * Goal 1. com.lts.application.international.MessageFormatter.getMessage(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test13()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      Object[] objectArray0 = new Object[4];
      try {
        String string0 = messageFormatter0.getMessage("", objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
      }
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * Goal 1. com.lts.application.international.MessageFormatter.loadCriticalBundles()Ljava/util/List;: root-Branch
   */

  @Test
  public void test14()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      List list0 = messageFormatter0.loadCriticalBundles();
      assertEquals(0, list0.size());
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
   * 15 covered goals:
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
   * Goal 14. com.lts.application.international.MessageFormatter.tryLoad(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ResourceBundle;: I11 Branch 16 IF_ACMPEQ L485 - false
   * Goal 15. com.lts.application.international.MessageFormatter.tryLoad(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ResourceBundle;: I18 Branch 17 IFGT L485 - false
   */

  @Test
  public void test16()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      List<String> list0 = ResourceBundle.Control.FORMAT_DEFAULT;
      try {
        messageFormatter0.initializeResourceBundle(list0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Could not find any resource bundle give names: messages; and resource path: java.class, java.properties
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
      List list0 = messageFormatter0.listResources("", classLoader0);
      assertFalse(list0.isEmpty());
  }

  //Test case number: 19
  /*
   * 8 covered goals:
   * Goal 1. com.lts.application.international.MessageFormatter.getMessage(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;: root-Branch
   * Goal 2. com.lts.application.international.MessageFormatter.addBundle(Ljava/util/ResourceBundle;)V: root-Branch
   * Goal 3. com.lts.application.international.MessageFormatter.<init>()V: root-Branch
   * Goal 4. com.lts.application.international.MessageFormatter.formatMessage(Ljava/lang/String;[Ljava/lang/Object;Ljava/util/ResourceBundle;)Ljava/lang/String;: I16 Branch 4 IF_ACMPNE L277 - true
   * Goal 5. com.lts.application.international.MessageFormatter.formatMessage(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;: I16 Branch 5 IFEQ L300 - true
   * Goal 6. com.lts.application.international.MessageFormatter.formatMessage(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;: I16 Branch 5 IFEQ L300 - false
   * Goal 7. com.lts.application.international.MessageFormatter.formatMessage(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;: I36 Branch 6 IF_ACMPEQ L303 - true
   * Goal 8. com.lts.application.international.MessageFormatter.formatMessage(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;: I55 Branch 7 IF_ACMPNE L307 - false
   */

  @Test
  public void test19()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      StringBufferInputStream stringBufferInputStream0 = new StringBufferInputStream("`2[q");
      PropertyResourceBundle propertyResourceBundle0 = new PropertyResourceBundle((InputStream) stringBufferInputStream0);
      messageFormatter0.addBundle((ResourceBundle) propertyResourceBundle0);
      // Undeclared exception!
      try {
        String string0 = messageFormatter0.getMessage("critical.com.lts.application.errors.resourceBundle.load", (Object) messageFormatter0, (Object) stringBufferInputStream0, (Object) "critical.com.lts.application.errors.resourceBundle.load");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
      }
  }
}

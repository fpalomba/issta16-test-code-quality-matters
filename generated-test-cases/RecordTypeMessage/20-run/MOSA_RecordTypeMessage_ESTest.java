/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 20 00:43:10 GMT 2015
 */

package net.sf.xbus.protocol.records;

import static org.junit.Assert.*;
import org.junit.Test;
import net.sf.xbus.base.bytearraylist.ByteArrayList;
import net.sf.xbus.base.xbussystem.XBUSSystem;
import net.sf.xbus.protocol.records.RecordTypeMessage;
import org.apache.html.dom.HTMLDocumentImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.junit.runner.RunWith;
import org.w3c.dom.Document;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class RecordTypeMessage_ESTest extends RecordTypeMessage_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. net.sf.xbus.protocol.records.RecordTypeMessage.getResponseObject()Ljava/lang/Object;: I15 Branch 11 IFNULL L279 - false
   * Goal 2. net.sf.xbus.protocol.records.RecordTypeMessage.getResponseObject()Ljava/lang/Object;: I21 Branch 12 IFNULL L279 - true
   */

  @Test
  public void test00()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      HTMLDocumentImpl hTMLDocumentImpl0 = new HTMLDocumentImpl();
      recordTypeMessage0.setResponseDocument((Document) hTMLDocumentImpl0, (XBUSSystem) null);
      Object object0 = recordTypeMessage0.getResponseObject();
      assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. net.sf.xbus.protocol.records.RecordTypeMessage.getResponseObject()Ljava/lang/Object;: I15 Branch 11 IFNULL L279 - true
   */

  @Test
  public void test01()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      Object object0 = recordTypeMessage0.getResponseObject();
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. net.sf.xbus.protocol.records.RecordTypeMessage.setResponseObject(Ljava/lang/Object;Lnet/sf/xbus/base/xbussystem/XBUSSystem;)V: I21 Branch 9 IFNONNULL L239 - true
   * Goal 2. net.sf.xbus.protocol.records.RecordTypeMessage.setResponseObject(Ljava/lang/Object;Lnet/sf/xbus/base/xbussystem/XBUSSystem;)V: I44 Branch 10 IFNE L247 - false
   */

  @Test
  public void test02()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      ByteArrayList byteArrayList0 = new ByteArrayList();
      recordTypeMessage0.setResponseObject((Object) byteArrayList0, (XBUSSystem) null);
      assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      assertEquals(0, recordTypeMessage0.getErrorcode());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. net.sf.xbus.protocol.records.RecordTypeMessage.getRequestObject(Lnet/sf/xbus/base/xbussystem/XBUSSystem;)Ljava/lang/Object;: I16 Branch 8 IFNULL L216 - true
   */

  @Test
  public void test03()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("", (XBUSSystem) null, "");
      Object object0 = recordTypeMessage0.getRequestObject((XBUSSystem) null);
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * Goal 1. net.sf.xbus.protocol.records.RecordTypeMessage.setRequestObject(Ljava/lang/Object;Lnet/sf/xbus/base/xbussystem/XBUSSystem;)V: I6 Branch 6 IFNONNULL L173 - false
   */

  @Test
  public void test04()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.setRequestObject((Object) null, (XBUSSystem) null);
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * Goal 1. net.sf.xbus.protocol.records.RecordTypeMessage.setRequestObject(Ljava/lang/Object;Lnet/sf/xbus/base/xbussystem/XBUSSystem;)V: I6 Branch 6 IFNONNULL L173 - true
   */

  @Test
  public void test05()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("\r", (XBUSSystem) null, "02");
      try {
        recordTypeMessage0.setRequestObject((Object) "", (XBUSSystem) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // I_02_003_0 java.lang.String cannot be cast to net.sf.xbus.base.bytearraylist.ByteArrayList
         //
      }
  }

  //Test case number: 6
  /*
   * 2 covered goals:
   * Goal 1. net.sf.xbus.protocol.records.RecordTypeMessage.getResponseText()Ljava/lang/String;: I15 Branch 4 IFNULL L153 - false
   * Goal 2. net.sf.xbus.protocol.records.RecordTypeMessage.getResponseText()Ljava/lang/String;: I21 Branch 5 IFNULL L153 - true
   */

  @Test
  public void test06()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      HTMLDocumentImpl hTMLDocumentImpl0 = new HTMLDocumentImpl();
      recordTypeMessage0.setResponseDocument((Document) hTMLDocumentImpl0, (XBUSSystem) null);
      String string0 = recordTypeMessage0.getResponseText();
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      assertEquals("RC_OK", recordTypeMessage0.getReturncode());
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. net.sf.xbus.protocol.records.RecordTypeMessage.getResponseText()Ljava/lang/String;: I15 Branch 4 IFNULL L153 - true
   */

  @Test
  public void test07()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      String string0 = recordTypeMessage0.getResponseText();
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * Goal 1. net.sf.xbus.protocol.records.RecordTypeMessage.setResponseText(Ljava/lang/String;Lnet/sf/xbus/base/xbussystem/XBUSSystem;)V: I21 Branch 3 IFNONNULL L132 - false
   */

  @Test
  public void test08()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.setResponseText((String) null, (XBUSSystem) null);
      assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      assertEquals(0, recordTypeMessage0.getErrorcode());
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * Goal 1. net.sf.xbus.protocol.records.RecordTypeMessage.setResponseText(Ljava/lang/String;Lnet/sf/xbus/base/xbussystem/XBUSSystem;)V: I21 Branch 3 IFNONNULL L132 - true
   */

  @Test
  public void test09()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      // Undeclared exception!
      try {
        recordTypeMessage0.setResponseText("", (XBUSSystem) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 10
  /*
   * 2 covered goals:
   * Goal 1. net.sf.xbus.protocol.records.RecordTypeMessage.<init>(Ljava/lang/String;Lnet/sf/xbus/base/xbussystem/XBUSSystem;Ljava/lang/String;)V: root-Branch
   * Goal 2. net.sf.xbus.protocol.records.RecordTypeMessage.getRequestText(Lnet/sf/xbus/base/xbussystem/XBUSSystem;)Ljava/lang/String;: I16 Branch 2 IFNULL L110 - true
   */

  @Test
  public void test10()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("\r", (XBUSSystem) null, "02");
      String string0 = recordTypeMessage0.getRequestText((XBUSSystem) null);
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }

  //Test case number: 11
  /*
   * 2 covered goals:
   * Goal 1. net.sf.xbus.protocol.records.RecordTypeMessage.setRequestText(Ljava/lang/String;Lnet/sf/xbus/base/xbussystem/XBUSSystem;)V: I6 Branch 1 IFNONNULL L87 - true
   * Goal 2. net.sf.xbus.protocol.records.RecordTypeMessage.parseRecordsFromString(Ljava/lang/String;Lnet/sf/xbus/base/xbussystem/XBUSSystem;)Lorg/w3c/dom/Document;: I10 Branch 13 IFNULL L336 - false
   */

  @Test
  public void test11()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      // Undeclared exception!
      try {
        recordTypeMessage0.setRequestText("", (XBUSSystem) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * Goal 1. net.sf.xbus.protocol.records.RecordTypeMessage.getRequestTextAsXML(Lnet/sf/xbus/base/xbussystem/XBUSSystem;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test12()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      String string0 = recordTypeMessage0.getRequestTextAsXML((XBUSSystem) null);
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }

  //Test case number: 13
  /*
   * 2 covered goals:
   * Goal 1. net.sf.xbus.protocol.records.RecordTypeMessage.synchronizeRequestFields(Lnet/sf/xbus/base/xbussystem/XBUSSystem;)V: root-Branch
   * Goal 2. net.sf.xbus.protocol.records.RecordTypeMessage.setRequestText(Ljava/lang/String;Lnet/sf/xbus/base/xbussystem/XBUSSystem;)V: I6 Branch 1 IFNONNULL L87 - false
   */

  @Test
  public void test13()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.setRequestText((String) null, (XBUSSystem) null);
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }

  //Test case number: 14
  /*
   * 4 covered goals:
   * Goal 1. net.sf.xbus.protocol.records.RecordTypeMessage.setResponseDocument(Lorg/w3c/dom/Document;Lnet/sf/xbus/base/xbussystem/XBUSSystem;)V: root-Branch
   * Goal 2. net.sf.xbus.protocol.records.RecordTypeMessage.synchronizeResponseFields(Lnet/sf/xbus/base/xbussystem/XBUSSystem;)V: root-Branch
   * Goal 3. net.sf.xbus.protocol.records.RecordTypeMessage.<init>(Lnet/sf/xbus/base/xbussystem/XBUSSystem;)V: root-Branch
   * Goal 4. net.sf.xbus.protocol.records.RecordTypeMessage.setResponseObject(Ljava/lang/Object;Lnet/sf/xbus/base/xbussystem/XBUSSystem;)V: I21 Branch 9 IFNONNULL L239 - false
   */

  @Test
  public void test14()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.setResponseObject((Object) null, (XBUSSystem) null);
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      assertEquals(0, recordTypeMessage0.getErrorcode());
      assertEquals("RC_OK", recordTypeMessage0.getReturncode());
  }
}

/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 19 22:50:08 GMT 2015
 */

package net.sf.xbus.protocol.records;

import static org.junit.Assert.*;
import org.junit.Test;
import net.sf.xbus.base.bytearraylist.ByteArrayList;
import net.sf.xbus.base.xbussystem.XBUSSystem;
import net.sf.xbus.protocol.records.RecordTypeMessage;
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
   * 1 covered goal:
   * Goal 1. net.sf.xbus.protocol.records.RecordTypeMessage.setResponseObject(Ljava/lang/Object;Lnet/sf/xbus/base/xbussystem/XBUSSystem;)V: I44 Branch 10 IFNE L247 - true
   */

  @Test
  public void test00()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      //  // Unstable assertion: assertNull(recordTypeMessage0.getErrortext());
      //  // Unstable assertion: assertEquals("TEST_EXECUTION_THREAD_1_1392409281320", recordTypeMessage0.getId());
      //  // Unstable assertion: assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      //  // Unstable assertion: assertEquals("Default", recordTypeMessage0.getFunction());
      //  // Unstable assertion: assertEquals(0, recordTypeMessage0.getErrorcode());
      //  // Unstable assertion: assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      //  // Unstable assertion: assertNotNull(recordTypeMessage0);
      
      byte[] byteArray0 = new byte[2];
      ByteArrayList byteArrayList0 = ByteArrayList.createByteArrayList(byteArray0, 0);
      //  // Unstable assertion: assertEquals(2, byteArrayList0.length());
      //  // Unstable assertion: assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray0);
      //  // Unstable assertion: assertNotNull(byteArrayList0);
      
      // Undeclared exception!
      try {
        recordTypeMessage0.setResponseObject((Object) byteArrayList0, (XBUSSystem) null);
       //  fail("Expecting exception: NullPointerException");
       // Unstable assertion
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. net.sf.xbus.protocol.records.RecordTypeMessage.setResponseObject(Ljava/lang/Object;Lnet/sf/xbus/base/xbussystem/XBUSSystem;)V: I44 Branch 10 IFNE L247 - false
   */

  @Test
  public void test01()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      //  // Unstable assertion: assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      //  // Unstable assertion: assertNull(recordTypeMessage0.getErrortext());
      //  // Unstable assertion: assertEquals("Default", recordTypeMessage0.getFunction());
      //  // Unstable assertion: assertEquals(0, recordTypeMessage0.getErrorcode());
      //  // Unstable assertion: assertEquals("TEST_EXECUTION_THREAD_1_1392409281320", recordTypeMessage0.getId());
      //  // Unstable assertion: assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      //  // Unstable assertion: assertNotNull(recordTypeMessage0);
      
      ByteArrayList byteArrayList0 = new ByteArrayList();
      //  // Unstable assertion: assertEquals(0, byteArrayList0.length());
      //  // Unstable assertion: assertNotNull(byteArrayList0);
      
      recordTypeMessage0.setResponseObject((Object) byteArrayList0, (XBUSSystem) null);
      //  // Unstable assertion: assertEquals(0, byteArrayList0.length());
      //  // Unstable assertion: assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      //  // Unstable assertion: assertNull(recordTypeMessage0.getErrortext());
      //  // Unstable assertion: assertEquals("Default", recordTypeMessage0.getFunction());
      //  // Unstable assertion: assertEquals(0, recordTypeMessage0.getErrorcode());
      //  // Unstable assertion: assertEquals("TEST_EXECUTION_THREAD_1_1392409281320", recordTypeMessage0.getId());
      //  // Unstable assertion: assertEquals("RC_OK", recordTypeMessage0.getReturncode());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. net.sf.xbus.protocol.records.RecordTypeMessage.setRequestText(Ljava/lang/String;Lnet/sf/xbus/base/xbussystem/XBUSSystem;)V: I6 Branch 1 IFNONNULL L87 - false
   */

  @Test
  public void test02()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      //  // Unstable assertion: assertEquals(0, recordTypeMessage0.getErrorcode());
      //  // Unstable assertion: assertEquals("Default", recordTypeMessage0.getFunction());
      //  // Unstable assertion: assertNull(recordTypeMessage0.getErrortext());
      //  // Unstable assertion: assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      //  // Unstable assertion: assertEquals("TEST_EXECUTION_THREAD_1_1392409281320", recordTypeMessage0.getId());
      //  // Unstable assertion: assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      //  // Unstable assertion: assertNotNull(recordTypeMessage0);
      
      recordTypeMessage0.setRequestText((String) null, (XBUSSystem) null);
      //  // Unstable assertion: assertEquals(0, recordTypeMessage0.getErrorcode());
      //  // Unstable assertion: assertEquals("Default", recordTypeMessage0.getFunction());
      //  // Unstable assertion: assertNull(recordTypeMessage0.getErrortext());
      //  // Unstable assertion: assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      //  // Unstable assertion: assertEquals("TEST_EXECUTION_THREAD_1_1392409281320", recordTypeMessage0.getId());
      //  // Unstable assertion: assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. net.sf.xbus.protocol.records.RecordTypeMessage.setRequestObject(Ljava/lang/Object;Lnet/sf/xbus/base/xbussystem/XBUSSystem;)V: I29 Branch 7 IFNE L181 - false
   */

  @Test
  public void test03()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      //  // Unstable assertion: assertEquals("TEST_EXECUTION_THREAD_1_1392409281320", recordTypeMessage0.getId());
      //  // Unstable assertion: assertEquals(0, recordTypeMessage0.getErrorcode());
      //  // Unstable assertion: assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      //  // Unstable assertion: assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      //  // Unstable assertion: assertNull(recordTypeMessage0.getErrortext());
      //  // Unstable assertion: assertEquals("Default", recordTypeMessage0.getFunction());
      //  // Unstable assertion: assertNotNull(recordTypeMessage0);
      
      ByteArrayList byteArrayList0 = new ByteArrayList();
      //  // Unstable assertion: assertEquals(0, byteArrayList0.length());
      //  // Unstable assertion: assertNotNull(byteArrayList0);
      
      recordTypeMessage0.setRequestObject((Object) byteArrayList0, (XBUSSystem) null);
      //  // Unstable assertion: assertEquals("TEST_EXECUTION_THREAD_1_1392409281320", recordTypeMessage0.getId());
      //  // Unstable assertion: assertEquals(0, recordTypeMessage0.getErrorcode());
      //  // Unstable assertion: assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      //  // Unstable assertion: assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      //  // Unstable assertion: assertNull(recordTypeMessage0.getErrortext());
      //  // Unstable assertion: assertEquals("Default", recordTypeMessage0.getFunction());
      //  // Unstable assertion: assertEquals(0, byteArrayList0.length());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * Goal 1. net.sf.xbus.protocol.records.RecordTypeMessage.getRequestText(Lnet/sf/xbus/base/xbussystem/XBUSSystem;)Ljava/lang/String;: I16 Branch 2 IFNULL L110 - true
   */

  @Test
  public void test04()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      //  // Unstable assertion: assertNull(recordTypeMessage0.getErrortext());
      //  // Unstable assertion: assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      //  // Unstable assertion: assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      //  // Unstable assertion: assertEquals("Default", recordTypeMessage0.getFunction());
      //  // Unstable assertion: assertEquals(0, recordTypeMessage0.getErrorcode());
      //  // Unstable assertion: assertEquals("TEST_EXECUTION_THREAD_1_1392409281320", recordTypeMessage0.getId());
      //  // Unstable assertion: assertNotNull(recordTypeMessage0);
      
      String string0 = recordTypeMessage0.getRequestText((XBUSSystem) null);
      //  // Unstable assertion: assertNull(recordTypeMessage0.getErrortext());
      //  // Unstable assertion: assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      //  // Unstable assertion: assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      //  // Unstable assertion: assertEquals("Default", recordTypeMessage0.getFunction());
      //  // Unstable assertion: assertEquals(0, recordTypeMessage0.getErrorcode());
      //  // Unstable assertion: assertEquals("TEST_EXECUTION_THREAD_1_1392409281320", recordTypeMessage0.getId());
      //  // Unstable assertion: assertNull(string0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * Goal 1. net.sf.xbus.protocol.records.RecordTypeMessage.setResponseText(Ljava/lang/String;Lnet/sf/xbus/base/xbussystem/XBUSSystem;)V: I21 Branch 3 IFNONNULL L132 - true
   */

  @Test
  public void test05()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      //  // Unstable assertion: assertEquals("Default", recordTypeMessage0.getFunction());
      //  // Unstable assertion: assertNull(recordTypeMessage0.getErrortext());
      //  // Unstable assertion: assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      //  // Unstable assertion: assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      //  // Unstable assertion: assertEquals("TEST_EXECUTION_THREAD_1_1392409281320", recordTypeMessage0.getId());
      //  // Unstable assertion: assertEquals(0, recordTypeMessage0.getErrorcode());
      //  // Unstable assertion: assertNotNull(recordTypeMessage0);
      
      // Undeclared exception!
      try {
        recordTypeMessage0.setResponseText("After rearra%eNowTat!         ", (XBUSSystem) null);
       //  fail("Expecting exception: NullPointerException");
       // Unstable assertion
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. net.sf.xbus.protocol.records.RecordTypeMessage.getResponseObject()Ljava/lang/Object;: I15 Branch 11 IFNULL L279 - true
   */

  @Test
  public void test06()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      //  // Unstable assertion: assertEquals(0, recordTypeMessage0.getErrorcode());
      //  // Unstable assertion: assertEquals("Default", recordTypeMessage0.getFunction());
      //  // Unstable assertion: assertEquals("TEST_EXECUTION_THREAD_1_1392409281320", recordTypeMessage0.getId());
      //  // Unstable assertion: assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      //  // Unstable assertion: assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      //  // Unstable assertion: assertNull(recordTypeMessage0.getErrortext());
      //  // Unstable assertion: assertNotNull(recordTypeMessage0);
      
      Object object0 = recordTypeMessage0.getResponseObject();
      //  // Unstable assertion: assertEquals(0, recordTypeMessage0.getErrorcode());
      //  // Unstable assertion: assertEquals("Default", recordTypeMessage0.getFunction());
      //  // Unstable assertion: assertEquals("TEST_EXECUTION_THREAD_1_1392409281320", recordTypeMessage0.getId());
      //  // Unstable assertion: assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      //  // Unstable assertion: assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      //  // Unstable assertion: assertNull(recordTypeMessage0.getErrortext());
      //  // Unstable assertion: assertNull(object0);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. net.sf.xbus.protocol.records.RecordTypeMessage.setResponseObject(Ljava/lang/Object;Lnet/sf/xbus/base/xbussystem/XBUSSystem;)V: I21 Branch 9 IFNONNULL L239 - true
   */

  @Test
  public void test07()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      //  // Unstable assertion: assertEquals("Default", recordTypeMessage0.getFunction());
      //  // Unstable assertion: assertEquals(0, recordTypeMessage0.getErrorcode());
      //  // Unstable assertion: assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      //  // Unstable assertion: assertNull(recordTypeMessage0.getErrortext());
      //  // Unstable assertion: assertEquals("TEST_EXECUTION_THREAD_1_1392409281320", recordTypeMessage0.getId());
      //  // Unstable assertion: assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      //  // Unstable assertion: assertNotNull(recordTypeMessage0);
      
      try {
        recordTypeMessage0.setResponseObject((Object) "/^ADSP/ < (/^ADVP/ $++ (/^(,|CC|CONJP)$/ [$+ (RB=adv [ < not | < then ]) | $+ (ADVP=adv < RB)])) : (=adv $+ /^NP-ADV|ADVP|PP/=dest)", (XBUSSystem) null);
       //  fail("Expecting exception: Exception");
       // Unstable assertion
      } catch(Exception e) {
         //
         // I_02_003_0 java.lang.String cannot be cast to net.sf.xbus.base.bytearraylist.ByteArrayList
         //
      }
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * Goal 1. net.sf.xbus.protocol.records.RecordTypeMessage.setRequestObject(Ljava/lang/Object;Lnet/sf/xbus/base/xbussystem/XBUSSystem;)V: I6 Branch 6 IFNONNULL L173 - false
   */

  @Test
  public void test08()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      //  // Unstable assertion: assertNull(recordTypeMessage0.getErrortext());
      //  // Unstable assertion: assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      //  // Unstable assertion: assertEquals("Default", recordTypeMessage0.getFunction());
      //  // Unstable assertion: assertEquals(0, recordTypeMessage0.getErrorcode());
      //  // Unstable assertion: assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      //  // Unstable assertion: assertEquals("TEST_EXECUTION_THREAD_1_1392409281320", recordTypeMessage0.getId());
      //  // Unstable assertion: assertNotNull(recordTypeMessage0);
      
      recordTypeMessage0.setRequestObject((Object) null, (XBUSSystem) null);
      //  // Unstable assertion: assertNull(recordTypeMessage0.getErrortext());
      //  // Unstable assertion: assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      //  // Unstable assertion: assertEquals("Default", recordTypeMessage0.getFunction());
      //  // Unstable assertion: assertEquals(0, recordTypeMessage0.getErrorcode());
      //  // Unstable assertion: assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      //  // Unstable assertion: assertEquals("TEST_EXECUTION_THREAD_1_1392409281320", recordTypeMessage0.getId());
  }

  //Test case number: 9
  /*
   * 2 covered goals:
   * Goal 1. net.sf.xbus.protocol.records.RecordTypeMessage.setRequestText(Ljava/lang/String;Lnet/sf/xbus/base/xbussystem/XBUSSystem;)V: I6 Branch 1 IFNONNULL L87 - true
   * Goal 2. net.sf.xbus.protocol.records.RecordTypeMessage.parseRecordsFromString(Ljava/lang/String;Lnet/sf/xbus/base/xbussystem/XBUSSystem;)Lorg/w3c/dom/Document;: I10 Branch 13 IFNULL L336 - false
   */

  @Test
  public void test09()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      //  // Unstable assertion: assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      //  // Unstable assertion: assertEquals("Default", recordTypeMessage0.getFunction());
      //  // Unstable assertion: assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      //  // Unstable assertion: assertNull(recordTypeMessage0.getErrortext());
      //  // Unstable assertion: assertEquals(0, recordTypeMessage0.getErrorcode());
      //  // Unstable assertion: assertEquals("TEST_EXECUTION_THREAD_1_1392409281320", recordTypeMessage0.getId());
      //  // Unstable assertion: assertNotNull(recordTypeMessage0);
      
      // Undeclared exception!
      try {
        recordTypeMessage0.setRequestText("Sal", (XBUSSystem) null);
       //  fail("Expecting exception: NullPointerException");
       // Unstable assertion
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * Goal 1. net.sf.xbus.protocol.records.RecordTypeMessage.<init>(Ljava/lang/String;Lnet/sf/xbus/base/xbussystem/XBUSSystem;Ljava/lang/String;)V: root-Branch
   */

  @Test
  public void test10()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("After rearra%eNowTat!         ", (XBUSSystem) null, "After rearra%eNowTat!         ");
      assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      assertEquals("After rearra%eNowTat!         ", recordTypeMessage0.getFunction());
      assertEquals(0, recordTypeMessage0.getErrorcode());
      assertNull(recordTypeMessage0.getErrortext());
      assertEquals("After rearra%eNowTat!         ", recordTypeMessage0.getId());
      assertNotNull(recordTypeMessage0);
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * Goal 1. net.sf.xbus.protocol.records.RecordTypeMessage.synchronizeRequestFields(Lnet/sf/xbus/base/xbussystem/XBUSSystem;)V: root-Branch
   */

  @Test
  public void test11()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      //  // Unstable assertion: assertNull(recordTypeMessage0.getErrortext());
      //  // Unstable assertion: assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      //  // Unstable assertion: assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      //  // Unstable assertion: assertEquals("TEST_EXECUTION_THREAD_1_1392409281320", recordTypeMessage0.getId());
      //  // Unstable assertion: assertEquals(0, recordTypeMessage0.getErrorcode());
      //  // Unstable assertion: assertEquals("Default", recordTypeMessage0.getFunction());
      //  // Unstable assertion: assertNotNull(recordTypeMessage0);
      
      recordTypeMessage0.setRequestDocument((Document) null, (XBUSSystem) null);
      //  // Unstable assertion: assertNull(recordTypeMessage0.getErrortext());
      //  // Unstable assertion: assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      //  // Unstable assertion: assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      //  // Unstable assertion: assertEquals("TEST_EXECUTION_THREAD_1_1392409281320", recordTypeMessage0.getId());
      //  // Unstable assertion: assertEquals(0, recordTypeMessage0.getErrorcode());
      //  // Unstable assertion: assertEquals("Default", recordTypeMessage0.getFunction());
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * Goal 1. net.sf.xbus.protocol.records.RecordTypeMessage.setResponseObject(Ljava/lang/Object;Lnet/sf/xbus/base/xbussystem/XBUSSystem;)V: I21 Branch 9 IFNONNULL L239 - false
   */

  @Test
  public void test12()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      //  // Unstable assertion: assertEquals(0, recordTypeMessage0.getErrorcode());
      //  // Unstable assertion: assertNull(recordTypeMessage0.getErrortext());
      //  // Unstable assertion: assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      //  // Unstable assertion: assertEquals("Default", recordTypeMessage0.getFunction());
      //  // Unstable assertion: assertEquals("TEST_EXECUTION_THREAD_1_1392409281320", recordTypeMessage0.getId());
      //  // Unstable assertion: assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      //  // Unstable assertion: assertNotNull(recordTypeMessage0);
      
      recordTypeMessage0.setResponseObject((Object) null, (XBUSSystem) null);
      //  // Unstable assertion: assertEquals(0, recordTypeMessage0.getErrorcode());
      //  // Unstable assertion: assertNull(recordTypeMessage0.getErrortext());
      //  // Unstable assertion: assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      //  // Unstable assertion: assertEquals("Default", recordTypeMessage0.getFunction());
      //  // Unstable assertion: assertEquals("TEST_EXECUTION_THREAD_1_1392409281320", recordTypeMessage0.getId());
      //  // Unstable assertion: assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }

  //Test case number: 13
  /*
   * 3 covered goals:
   * Goal 1. net.sf.xbus.protocol.records.RecordTypeMessage.setRequestObject(Ljava/lang/Object;Lnet/sf/xbus/base/xbussystem/XBUSSystem;)V: I6 Branch 6 IFNONNULL L173 - true
   * Goal 2. net.sf.xbus.protocol.records.RecordTypeMessage.setRequestObject(Ljava/lang/Object;Lnet/sf/xbus/base/xbussystem/XBUSSystem;)V: I29 Branch 7 IFNE L181 - true
   * Goal 3. net.sf.xbus.protocol.records.RecordTypeMessage.parseRecordsFromByteArrayList(Lnet/sf/xbus/base/bytearraylist/ByteArrayList;Lnet/sf/xbus/base/xbussystem/XBUSSystem;)Lorg/w3c/dom/Document;: I10 Branch 14 IFNULL L360 - false
   */

  @Test
  public void test13()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      //  // Unstable assertion: assertNull(recordTypeMessage0.getErrortext());
      //  // Unstable assertion: assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      //  // Unstable assertion: assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      //  // Unstable assertion: assertEquals("TEST_EXECUTION_THREAD_1_1392409281320", recordTypeMessage0.getId());
      //  // Unstable assertion: assertEquals(0, recordTypeMessage0.getErrorcode());
      //  // Unstable assertion: assertEquals("Default", recordTypeMessage0.getFunction());
      //  // Unstable assertion: assertNotNull(recordTypeMessage0);
      
      byte[] byteArray0 = new byte[4];
      ByteArrayList byteArrayList0 = ByteArrayList.createByteArrayList(byteArray0, (int) (byte)0);
      //  // Unstable assertion: assertEquals(4, byteArrayList0.length());
      //  // Unstable assertion: assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      //  // Unstable assertion: assertNotNull(byteArrayList0);
      
      XBUSSystem xBUSSystem0 = recordTypeMessage0.getSource();
      //  // Unstable assertion: assertNull(recordTypeMessage0.getErrortext());
      //  // Unstable assertion: assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      //  // Unstable assertion: assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      //  // Unstable assertion: assertEquals("TEST_EXECUTION_THREAD_1_1392409281320", recordTypeMessage0.getId());
      //  // Unstable assertion: assertEquals(0, recordTypeMessage0.getErrorcode());
      //  // Unstable assertion: assertEquals("Default", recordTypeMessage0.getFunction());
      //  // Unstable assertion: assertNull(xBUSSystem0);
      
      // Undeclared exception!
      try {
        recordTypeMessage0.setRequestObject((Object) byteArrayList0, (XBUSSystem) null);
       //  fail("Expecting exception: NullPointerException");
       // Unstable assertion
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * Goal 1. net.sf.xbus.protocol.records.RecordTypeMessage.getRequestObject(Lnet/sf/xbus/base/xbussystem/XBUSSystem;)Ljava/lang/Object;: I16 Branch 8 IFNULL L216 - true
   */

  @Test
  public void test14()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      //  // Unstable assertion: assertEquals("TEST_EXECUTION_THREAD_1_1392409281320", recordTypeMessage0.getId());
      //  // Unstable assertion: assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      //  // Unstable assertion: assertEquals("Default", recordTypeMessage0.getFunction());
      //  // Unstable assertion: assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      //  // Unstable assertion: assertEquals(0, recordTypeMessage0.getErrorcode());
      //  // Unstable assertion: assertNull(recordTypeMessage0.getErrortext());
      //  // Unstable assertion: assertNotNull(recordTypeMessage0);
      
      Object object0 = recordTypeMessage0.getRequestObject((XBUSSystem) null);
      //  // Unstable assertion: assertEquals("TEST_EXECUTION_THREAD_1_1392409281320", recordTypeMessage0.getId());
      //  // Unstable assertion: assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      //  // Unstable assertion: assertEquals("Default", recordTypeMessage0.getFunction());
      //  // Unstable assertion: assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      //  // Unstable assertion: assertEquals(0, recordTypeMessage0.getErrorcode());
      //  // Unstable assertion: assertNull(recordTypeMessage0.getErrortext());
      //  // Unstable assertion: assertNull(object0);
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * Goal 1. net.sf.xbus.protocol.records.RecordTypeMessage.getResponseText()Ljava/lang/String;: I15 Branch 4 IFNULL L153 - true
   */

  @Test
  public void test15()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      //  // Unstable assertion: assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      //  // Unstable assertion: assertNull(recordTypeMessage0.getErrortext());
      //  // Unstable assertion: assertEquals("Default", recordTypeMessage0.getFunction());
      //  // Unstable assertion: assertEquals("TEST_EXECUTION_THREAD_1_1392409281320", recordTypeMessage0.getId());
      //  // Unstable assertion: assertEquals(0, recordTypeMessage0.getErrorcode());
      //  // Unstable assertion: assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      //  // Unstable assertion: assertNotNull(recordTypeMessage0);
      
      String string0 = recordTypeMessage0.getResponseText();
      //  // Unstable assertion: assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      //  // Unstable assertion: assertNull(recordTypeMessage0.getErrortext());
      //  // Unstable assertion: assertEquals("Default", recordTypeMessage0.getFunction());
      //  // Unstable assertion: assertEquals("TEST_EXECUTION_THREAD_1_1392409281320", recordTypeMessage0.getId());
      //  // Unstable assertion: assertEquals(0, recordTypeMessage0.getErrorcode());
      //  // Unstable assertion: assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      //  // Unstable assertion: assertNull(string0);
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * Goal 1. net.sf.xbus.protocol.records.RecordTypeMessage.getRequestTextAsXML(Lnet/sf/xbus/base/xbussystem/XBUSSystem;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test16()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      //  // Unstable assertion: assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      //  // Unstable assertion: assertEquals("TEST_EXECUTION_THREAD_1_1392409281320", recordTypeMessage0.getId());
      //  // Unstable assertion: assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      //  // Unstable assertion: assertEquals(0, recordTypeMessage0.getErrorcode());
      //  // Unstable assertion: assertEquals("Default", recordTypeMessage0.getFunction());
      //  // Unstable assertion: assertNull(recordTypeMessage0.getErrortext());
      //  // Unstable assertion: assertNotNull(recordTypeMessage0);
      
      String string0 = recordTypeMessage0.getRequestTextAsXML((XBUSSystem) null);
      //  // Unstable assertion: assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      //  // Unstable assertion: assertEquals("TEST_EXECUTION_THREAD_1_1392409281320", recordTypeMessage0.getId());
      //  // Unstable assertion: assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      //  // Unstable assertion: assertEquals(0, recordTypeMessage0.getErrorcode());
      //  // Unstable assertion: assertEquals("Default", recordTypeMessage0.getFunction());
      //  // Unstable assertion: assertNull(recordTypeMessage0.getErrortext());
      //  // Unstable assertion: assertNull(string0);
  }

  //Test case number: 17
  /*
   * 4 covered goals:
   * Goal 1. net.sf.xbus.protocol.records.RecordTypeMessage.setResponseDocument(Lorg/w3c/dom/Document;Lnet/sf/xbus/base/xbussystem/XBUSSystem;)V: root-Branch
   * Goal 2. net.sf.xbus.protocol.records.RecordTypeMessage.synchronizeResponseFields(Lnet/sf/xbus/base/xbussystem/XBUSSystem;)V: root-Branch
   * Goal 3. net.sf.xbus.protocol.records.RecordTypeMessage.<init>(Lnet/sf/xbus/base/xbussystem/XBUSSystem;)V: root-Branch
   * Goal 4. net.sf.xbus.protocol.records.RecordTypeMessage.setResponseText(Ljava/lang/String;Lnet/sf/xbus/base/xbussystem/XBUSSystem;)V: I21 Branch 3 IFNONNULL L132 - false
   */

  @Test
  public void test17()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      //  // Unstable assertion: assertEquals(0, recordTypeMessage0.getErrorcode());
      //  // Unstable assertion: assertEquals("TEST_EXECUTION_THREAD_1_1392409281320", recordTypeMessage0.getId());
      //  // Unstable assertion: assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      //  // Unstable assertion: assertEquals("Default", recordTypeMessage0.getFunction());
      //  // Unstable assertion: assertNull(recordTypeMessage0.getErrortext());
      //  // Unstable assertion: assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      //  // Unstable assertion: assertNotNull(recordTypeMessage0);
      
      recordTypeMessage0.setResponseText((String) null, (XBUSSystem) null);
      //  // Unstable assertion: assertEquals(0, recordTypeMessage0.getErrorcode());
      //  // Unstable assertion: assertEquals("TEST_EXECUTION_THREAD_1_1392409281320", recordTypeMessage0.getId());
      //  // Unstable assertion: assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      //  // Unstable assertion: assertEquals("Default", recordTypeMessage0.getFunction());
      //  // Unstable assertion: assertNull(recordTypeMessage0.getErrortext());
      //  // Unstable assertion: assertEquals("RC_OK", recordTypeMessage0.getReturncode());
  }
}

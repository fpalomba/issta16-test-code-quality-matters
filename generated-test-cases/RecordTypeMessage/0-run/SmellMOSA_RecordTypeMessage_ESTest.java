/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 19 22:42:51 GMT 2015
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

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class RecordTypeMessage_ESTest extends RecordTypeMessage_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. net.sf.xbus.protocol.records.RecordTypeMessage.setResponseObject(Ljava/lang/Object;Lnet/sf/xbus/base/xbussystem/XBUSSystem;)V: I21 Branch 9 IFNONNULL L239 - false
   */

  @Test
  public void test00()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("^RleZ0r.6imjdwTM]eB", (XBUSSystem) null, "^RleZ0r.6imjdwTM]eB");
      assertNotNull(recordTypeMessage0);
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      assertEquals(0, recordTypeMessage0.getErrorcode());
      assertEquals("^RleZ0r.6imjdwTM]eB", recordTypeMessage0.getId());
      assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      assertEquals("^RleZ0r.6imjdwTM]eB", recordTypeMessage0.getFunction());
      assertNull(recordTypeMessage0.getErrortext());
      
      recordTypeMessage0.setResponseObject((Object) null, (XBUSSystem) null);
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      assertEquals(0, recordTypeMessage0.getErrorcode());
      assertEquals("^RleZ0r.6imjdwTM]eB", recordTypeMessage0.getId());
      assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      assertEquals("^RleZ0r.6imjdwTM]eB", recordTypeMessage0.getFunction());
      assertNull(recordTypeMessage0.getErrortext());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. net.sf.xbus.protocol.records.RecordTypeMessage.setResponseText(Ljava/lang/String;Lnet/sf/xbus/base/xbussystem/XBUSSystem;)V: I21 Branch 3 IFNONNULL L132 - true
   */

  @Test
  public void test01()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("gong to buffer esonse Wdy of l>gO or'ujknown size Uyv( getRe`ponseBoyAsStrm insthad i recomended.", (XBUSSystem) null, "gong to buffer esonse Wdy of l>gO or'ujknown size Uyv( getRe`ponseBoyAsStrm insthad i recomended.");
      assertNotNull(recordTypeMessage0);
      assertEquals("gong to buffer esonse Wdy of l>gO or'ujknown size Uyv( getRe`ponseBoyAsStrm insthad i recomended.", recordTypeMessage0.getId());
      assertEquals("gong to buffer esonse Wdy of l>gO or'ujknown size Uyv( getRe`ponseBoyAsStrm insthad i recomended.", recordTypeMessage0.getFunction());
      assertEquals(0, recordTypeMessage0.getErrorcode());
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      assertNull(recordTypeMessage0.getErrortext());
      assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      
      // Undeclared exception!
      try {
        recordTypeMessage0.setResponseText("gong to buffer esonse Wdy of l>gO or'ujknown size Uyv( getRe`ponseBoyAsStrm insthad i recomended.", (XBUSSystem) null);
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
   * Goal 1. net.sf.xbus.protocol.records.RecordTypeMessage.getRequestText(Lnet/sf/xbus/base/xbussystem/XBUSSystem;)Ljava/lang/String;: I16 Branch 2 IFNULL L110 - true
   */

  @Test
  public void test02()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      //  // Unstable assertion: assertNotNull(recordTypeMessage0);
      //  // Unstable assertion: assertNull(recordTypeMessage0.getErrortext());
      //  // Unstable assertion: assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      //  // Unstable assertion: assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      //  // Unstable assertion: assertEquals("Default", recordTypeMessage0.getFunction());
      //  // Unstable assertion: assertEquals(0, recordTypeMessage0.getErrorcode());
      //  // Unstable assertion: assertEquals("TEST_EXECUTION_THREAD_1_1392409281320", recordTypeMessage0.getId());
      
      String string0 = recordTypeMessage0.getRequestText((XBUSSystem) null);
      //  // Unstable assertion: assertNull(string0);
      //  // Unstable assertion: assertNull(recordTypeMessage0.getErrortext());
      //  // Unstable assertion: assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      //  // Unstable assertion: assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      //  // Unstable assertion: assertEquals("Default", recordTypeMessage0.getFunction());
      //  // Unstable assertion: assertEquals(0, recordTypeMessage0.getErrorcode());
      //  // Unstable assertion: assertEquals("TEST_EXECUTION_THREAD_1_1392409281320", recordTypeMessage0.getId());
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * Goal 1. net.sf.xbus.protocol.records.RecordTypeMessage.setRequestText(Ljava/lang/String;Lnet/sf/xbus/base/xbussystem/XBUSSystem;)V: I6 Branch 1 IFNONNULL L87 - true
   * Goal 2. net.sf.xbus.protocol.records.RecordTypeMessage.parseRecordsFromString(Ljava/lang/String;Lnet/sf/xbus/base/xbussystem/XBUSSystem;)Lorg/w3c/dom/Document;: I10 Branch 13 IFNULL L336 - false
   */

  @Test
  public void test03()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("__ [ < (CC=taret !< /(?i:either|neither|both)$/ ) | < (CONJP=target !< (RB < /^(?i:not)$/ $+ (RB|JJ < /^(?Ponly|just|merely)$/))) ]", (XBUSSystem) null, "__ [ < (CC=taret !< /(?i:either|neither|both)$/ ) | < (CONJP=target !< (RB < /^(?i:not)$/ $+ (RB|JJ < /^(?Ponly|just|merely)$/))) ]");
      assertNotNull(recordTypeMessage0);
      assertEquals("__ [ < (CC=taret !< /(?i:either|neither|both)$/ ) | < (CONJP=target !< (RB < /^(?i:not)$/ $+ (RB|JJ < /^(?Ponly|just|merely)$/))) ]", recordTypeMessage0.getId());
      assertEquals(0, recordTypeMessage0.getErrorcode());
      assertEquals("__ [ < (CC=taret !< /(?i:either|neither|both)$/ ) | < (CONJP=target !< (RB < /^(?i:not)$/ $+ (RB|JJ < /^(?Ponly|just|merely)$/))) ]", recordTypeMessage0.getFunction());
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      assertNull(recordTypeMessage0.getErrortext());
      
      // Undeclared exception!
      try {
        recordTypeMessage0.setRequestText("__ [ < (CC=taret !< /(?i:either|neither|both)$/ ) | < (CONJP=target !< (RB < /^(?i:not)$/ $+ (RB|JJ < /^(?Ponly|just|merely)$/))) ]", (XBUSSystem) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * Goal 1. net.sf.xbus.protocol.records.RecordTypeMessage.setRequestObject(Ljava/lang/Object;Lnet/sf/xbus/base/xbussystem/XBUSSystem;)V: I29 Branch 7 IFNE L181 - false
   * Goal 2. net.sf.xbus.protocol.records.RecordTypeMessage.setResponseObject(Ljava/lang/Object;Lnet/sf/xbus/base/xbussystem/XBUSSystem;)V: I44 Branch 10 IFNE L247 - false
   */

  @Test
  public void test04()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      //  // Unstable assertion: assertNotNull(recordTypeMessage0);
      //  // Unstable assertion: assertEquals("TEST_EXECUTION_THREAD_1_1392409281320", recordTypeMessage0.getId());
      //  // Unstable assertion: assertEquals(0, recordTypeMessage0.getErrorcode());
      //  // Unstable assertion: assertEquals("Default", recordTypeMessage0.getFunction());
      //  // Unstable assertion: assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      //  // Unstable assertion: assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      //  // Unstable assertion: assertNull(recordTypeMessage0.getErrortext());
      
      XBUSSystem xBUSSystem0 = recordTypeMessage0.getSource();
      //  // Unstable assertion: assertNull(xBUSSystem0);
      //  // Unstable assertion: assertEquals("TEST_EXECUTION_THREAD_1_1392409281320", recordTypeMessage0.getId());
      //  // Unstable assertion: assertEquals(0, recordTypeMessage0.getErrorcode());
      //  // Unstable assertion: assertEquals("Default", recordTypeMessage0.getFunction());
      //  // Unstable assertion: assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      //  // Unstable assertion: assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      //  // Unstable assertion: assertNull(recordTypeMessage0.getErrortext());
      
      ByteArrayList byteArrayList0 = new ByteArrayList();
      //  // Unstable assertion: assertNotNull(byteArrayList0);
      //  // Unstable assertion: assertEquals(0, byteArrayList0.length());
      
      recordTypeMessage0.setResponseObject((Object) byteArrayList0, (XBUSSystem) null);
      //  // Unstable assertion: assertEquals(0, byteArrayList0.length());
      //  // Unstable assertion: assertEquals("TEST_EXECUTION_THREAD_1_1392409281320", recordTypeMessage0.getId());
      //  // Unstable assertion: assertEquals(0, recordTypeMessage0.getErrorcode());
      //  // Unstable assertion: assertEquals("Default", recordTypeMessage0.getFunction());
      //  // Unstable assertion: assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      //  // Unstable assertion: assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      //  // Unstable assertion: assertNull(recordTypeMessage0.getErrortext());
      
      recordTypeMessage0.setRequestObject((Object) byteArrayList0, (XBUSSystem) null);
      //  // Unstable assertion: assertEquals(0, byteArrayList0.length());
      //  // Unstable assertion: assertEquals("TEST_EXECUTION_THREAD_1_1392409281320", recordTypeMessage0.getId());
      //  // Unstable assertion: assertEquals(0, recordTypeMessage0.getErrorcode());
      //  // Unstable assertion: assertEquals("Default", recordTypeMessage0.getFunction());
      //  // Unstable assertion: assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      //  // Unstable assertion: assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      //  // Unstable assertion: assertNull(recordTypeMessage0.getErrortext());
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * Goal 1. net.sf.xbus.protocol.records.RecordTypeMessage.setResponseText(Ljava/lang/String;Lnet/sf/xbus/base/xbussystem/XBUSSystem;)V: I21 Branch 3 IFNONNULL L132 - false
   */

  @Test
  public void test05()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      //  // Unstable assertion: assertNotNull(recordTypeMessage0);
      //  // Unstable assertion: assertEquals(0, recordTypeMessage0.getErrorcode());
      //  // Unstable assertion: assertEquals("Default", recordTypeMessage0.getFunction());
      //  // Unstable assertion: assertNull(recordTypeMessage0.getErrortext());
      //  // Unstable assertion: assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      //  // Unstable assertion: assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      //  // Unstable assertion: assertEquals("TEST_EXECUTION_THREAD_1_1392409281320", recordTypeMessage0.getId());
      
      recordTypeMessage0.setResponseText((String) null, (XBUSSystem) null);
      //  // Unstable assertion: assertEquals(0, recordTypeMessage0.getErrorcode());
      //  // Unstable assertion: assertEquals("Default", recordTypeMessage0.getFunction());
      //  // Unstable assertion: assertNull(recordTypeMessage0.getErrortext());
      //  // Unstable assertion: assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      //  // Unstable assertion: assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      //  // Unstable assertion: assertEquals("TEST_EXECUTION_THREAD_1_1392409281320", recordTypeMessage0.getId());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. net.sf.xbus.protocol.records.RecordTypeMessage.getRequestTextAsXML(Lnet/sf/xbus/base/xbussystem/XBUSSystem;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test06()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      //  // Unstable assertion: assertNotNull(recordTypeMessage0);
      //  // Unstable assertion: assertEquals("TEST_EXECUTION_THREAD_1_1392409281320", recordTypeMessage0.getId());
      //  // Unstable assertion: assertEquals(0, recordTypeMessage0.getErrorcode());
      //  // Unstable assertion: assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      //  // Unstable assertion: assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      //  // Unstable assertion: assertEquals("Default", recordTypeMessage0.getFunction());
      //  // Unstable assertion: assertNull(recordTypeMessage0.getErrortext());
      
      String string0 = recordTypeMessage0.getRequestTextAsXML((XBUSSystem) null);
      //  // Unstable assertion: assertNull(string0);
      //  // Unstable assertion: assertEquals("TEST_EXECUTION_THREAD_1_1392409281320", recordTypeMessage0.getId());
      //  // Unstable assertion: assertEquals(0, recordTypeMessage0.getErrorcode());
      //  // Unstable assertion: assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      //  // Unstable assertion: assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      //  // Unstable assertion: assertEquals("Default", recordTypeMessage0.getFunction());
      //  // Unstable assertion: assertNull(recordTypeMessage0.getErrortext());
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. net.sf.xbus.protocol.records.RecordTypeMessage.getResponseText()Ljava/lang/String;: I15 Branch 4 IFNULL L153 - true
   */

  @Test
  public void test07()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("^RleZ0r.6imjdwTM]eB", (XBUSSystem) null, "^RleZ0r.6imjdwTM]eB");
      assertNotNull(recordTypeMessage0);
      assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      assertEquals("^RleZ0r.6imjdwTM]eB", recordTypeMessage0.getFunction());
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      assertNull(recordTypeMessage0.getErrortext());
      assertEquals("^RleZ0r.6imjdwTM]eB", recordTypeMessage0.getId());
      assertEquals(0, recordTypeMessage0.getErrorcode());
      
      String string0 = recordTypeMessage0.getResponseText();
      assertNull(string0);
      assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      assertEquals("^RleZ0r.6imjdwTM]eB", recordTypeMessage0.getFunction());
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      assertNull(recordTypeMessage0.getErrortext());
      assertEquals("^RleZ0r.6imjdwTM]eB", recordTypeMessage0.getId());
      assertEquals(0, recordTypeMessage0.getErrorcode());
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * Goal 1. net.sf.xbus.protocol.records.RecordTypeMessage.setRequestObject(Ljava/lang/Object;Lnet/sf/xbus/base/xbussystem/XBUSSystem;)V: I6 Branch 6 IFNONNULL L173 - false
   */

  @Test
  public void test08()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("__ [ < (CC=target !< /^(?i:either|neither|both)$/ ) | < (CONJP=target !< (RB < /^(?i:not)$/ $+ (RB|JJ < /^(?i:only|just|merely)$/))) ]", (XBUSSystem) null, "__ [ < (CC=target !< /^(?i:either|neither|both)$/ ) | < (CONJP=target !< (RB < /^(?i:not)$/ $+ (RB|JJ < /^(?i:only|just|merely)$/))) ]");
      assertNotNull(recordTypeMessage0);
      assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      assertNull(recordTypeMessage0.getErrortext());
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      assertEquals(0, recordTypeMessage0.getErrorcode());
      assertEquals("__ [ < (CC=target !< /^(?i:either|neither|both)$/ ) | < (CONJP=target !< (RB < /^(?i:not)$/ $+ (RB|JJ < /^(?i:only|just|merely)$/))) ]", recordTypeMessage0.getId());
      assertEquals("__ [ < (CC=target !< /^(?i:either|neither|both)$/ ) | < (CONJP=target !< (RB < /^(?i:not)$/ $+ (RB|JJ < /^(?i:only|just|merely)$/))) ]", recordTypeMessage0.getFunction());
      
      recordTypeMessage0.setRequestObject((Object) null, (XBUSSystem) null);
      assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      assertNull(recordTypeMessage0.getErrortext());
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      assertEquals(0, recordTypeMessage0.getErrorcode());
      assertEquals("__ [ < (CC=target !< /^(?i:either|neither|both)$/ ) | < (CONJP=target !< (RB < /^(?i:not)$/ $+ (RB|JJ < /^(?i:only|just|merely)$/))) ]", recordTypeMessage0.getId());
      assertEquals("__ [ < (CC=target !< /^(?i:either|neither|both)$/ ) | < (CONJP=target !< (RB < /^(?i:not)$/ $+ (RB|JJ < /^(?i:only|just|merely)$/))) ]", recordTypeMessage0.getFunction());
  }

  //Test case number: 9
  /*
   * 2 covered goals:
   * Goal 1. net.sf.xbus.protocol.records.RecordTypeMessage.setResponseObject(Ljava/lang/Object;Lnet/sf/xbus/base/xbussystem/XBUSSystem;)V: I21 Branch 9 IFNONNULL L239 - true
   * Goal 2. net.sf.xbus.protocol.records.RecordTypeMessage.setResponseObject(Ljava/lang/Object;Lnet/sf/xbus/base/xbussystem/XBUSSystem;)V: I44 Branch 10 IFNE L247 - true
   */

  @Test
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayList byteArrayList0 = ByteArrayList.createByteArrayList(byteArray0, (int) (byte)0);
      assertNotNull(byteArrayList0);
      assertEquals(9, byteArrayList0.length());
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("Expression has no target: ", (XBUSSystem) null, "Expression has no target: ");
      assertNotNull(recordTypeMessage0);
      assertEquals(0, recordTypeMessage0.getErrorcode());
      assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      assertEquals("Expression has no target: ", recordTypeMessage0.getId());
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      assertNull(recordTypeMessage0.getErrortext());
      assertEquals("Expression has no target: ", recordTypeMessage0.getFunction());
      
      // Undeclared exception!
      try {
        recordTypeMessage0.setResponseObject((Object) byteArrayList0, (XBUSSystem) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * Goal 1. net.sf.xbus.protocol.records.RecordTypeMessage.getResponseObject()Ljava/lang/Object;: I15 Branch 11 IFNULL L279 - true
   */

  @Test
  public void test10()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      //  // Unstable assertion: assertNotNull(recordTypeMessage0);
      //  // Unstable assertion: assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      //  // Unstable assertion: assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      //  // Unstable assertion: assertEquals("Default", recordTypeMessage0.getFunction());
      //  // Unstable assertion: assertEquals(0, recordTypeMessage0.getErrorcode());
      //  // Unstable assertion: assertEquals("TEST_EXECUTION_THREAD_1_1392409281320", recordTypeMessage0.getId());
      //  // Unstable assertion: assertNull(recordTypeMessage0.getErrortext());
      
      Object object0 = recordTypeMessage0.getResponseObject();
      //  // Unstable assertion: assertNull(object0);
      //  // Unstable assertion: assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      //  // Unstable assertion: assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      //  // Unstable assertion: assertEquals("Default", recordTypeMessage0.getFunction());
      //  // Unstable assertion: assertEquals(0, recordTypeMessage0.getErrorcode());
      //  // Unstable assertion: assertEquals("TEST_EXECUTION_THREAD_1_1392409281320", recordTypeMessage0.getId());
      //  // Unstable assertion: assertNull(recordTypeMessage0.getErrortext());
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * Goal 1. net.sf.xbus.protocol.records.RecordTypeMessage.getRequestObject(Lnet/sf/xbus/base/xbussystem/XBUSSystem;)Ljava/lang/Object;: I16 Branch 8 IFNULL L216 - true
   */

  @Test
  public void test11()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      //  // Unstable assertion: assertNotNull(recordTypeMessage0);
      //  // Unstable assertion: assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      //  // Unstable assertion: assertEquals("Default", recordTypeMessage0.getFunction());
      //  // Unstable assertion: assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      //  // Unstable assertion: assertEquals("TEST_EXECUTION_THREAD_1_1392409281320", recordTypeMessage0.getId());
      //  // Unstable assertion: assertEquals(0, recordTypeMessage0.getErrorcode());
      //  // Unstable assertion: assertNull(recordTypeMessage0.getErrortext());
      
      Object object0 = recordTypeMessage0.getRequestObject((XBUSSystem) null);
      //  // Unstable assertion: assertNull(object0);
      //  // Unstable assertion: assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      //  // Unstable assertion: assertEquals("Default", recordTypeMessage0.getFunction());
      //  // Unstable assertion: assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      //  // Unstable assertion: assertEquals("TEST_EXECUTION_THREAD_1_1392409281320", recordTypeMessage0.getId());
      //  // Unstable assertion: assertEquals(0, recordTypeMessage0.getErrorcode());
      //  // Unstable assertion: assertNull(recordTypeMessage0.getErrortext());
  }

  //Test case number: 12
  /*
   * 3 covered goals:
   * Goal 1. net.sf.xbus.protocol.records.RecordTypeMessage.synchronizeRequestFields(Lnet/sf/xbus/base/xbussystem/XBUSSystem;)V: root-Branch
   * Goal 2. net.sf.xbus.protocol.records.RecordTypeMessage.<init>(Lnet/sf/xbus/base/xbussystem/XBUSSystem;)V: root-Branch
   * Goal 3. net.sf.xbus.protocol.records.RecordTypeMessage.setRequestText(Ljava/lang/String;Lnet/sf/xbus/base/xbussystem/XBUSSystem;)V: I6 Branch 1 IFNONNULL L87 - false
   */

  @Test
  public void test12()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      //  // Unstable assertion: assertNotNull(recordTypeMessage0);
      //  // Unstable assertion: assertNull(recordTypeMessage0.getErrortext());
      //  // Unstable assertion: assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      //  // Unstable assertion: assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      //  // Unstable assertion: assertEquals(0, recordTypeMessage0.getErrorcode());
      //  // Unstable assertion: assertEquals("Default", recordTypeMessage0.getFunction());
      //  // Unstable assertion: assertEquals("TEST_EXECUTION_THREAD_1_1392409281320", recordTypeMessage0.getId());
      
      recordTypeMessage0.setRequestText((String) null, (XBUSSystem) null);
      //  // Unstable assertion: assertNull(recordTypeMessage0.getErrortext());
      //  // Unstable assertion: assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      //  // Unstable assertion: assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      //  // Unstable assertion: assertEquals(0, recordTypeMessage0.getErrorcode());
      //  // Unstable assertion: assertEquals("Default", recordTypeMessage0.getFunction());
      //  // Unstable assertion: assertEquals("TEST_EXECUTION_THREAD_1_1392409281320", recordTypeMessage0.getId());
  }

  //Test case number: 13
  /*
   * 4 covered goals:
   * Goal 1. net.sf.xbus.protocol.records.RecordTypeMessage.<init>(Ljava/lang/String;Lnet/sf/xbus/base/xbussystem/XBUSSystem;Ljava/lang/String;)V: root-Branch
   * Goal 2. net.sf.xbus.protocol.records.RecordTypeMessage.setRequestObject(Ljava/lang/Object;Lnet/sf/xbus/base/xbussystem/XBUSSystem;)V: I6 Branch 6 IFNONNULL L173 - true
   * Goal 3. net.sf.xbus.protocol.records.RecordTypeMessage.setRequestObject(Ljava/lang/Object;Lnet/sf/xbus/base/xbussystem/XBUSSystem;)V: I29 Branch 7 IFNE L181 - true
   * Goal 4. net.sf.xbus.protocol.records.RecordTypeMessage.parseRecordsFromByteArrayList(Lnet/sf/xbus/base/bytearraylist/ByteArrayList;Lnet/sf/xbus/base/xbussystem/XBUSSystem;)Lorg/w3c/dom/Document;: I10 Branch 14 IFNULL L360 - false
   */

  @Test
  public void test13()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("Going to buffer resonse Wdy of lagO or ujknown size Usv( getResponseBoyAsStrm insthad i recomended.", (XBUSSystem) null, "Going to buffer resonse Wdy of lagO or ujknown size Usv( getResponseBoyAsStrm insthad i recomended.");
      assertNotNull(recordTypeMessage0);
      assertEquals(0, recordTypeMessage0.getErrorcode());
      assertEquals("Going to buffer resonse Wdy of lagO or ujknown size Usv( getResponseBoyAsStrm insthad i recomended.", recordTypeMessage0.getId());
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      assertNull(recordTypeMessage0.getErrortext());
      assertEquals("Going to buffer resonse Wdy of lagO or ujknown size Usv( getResponseBoyAsStrm insthad i recomended.", recordTypeMessage0.getFunction());
      assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      
      byte[] byteArray0 = new byte[10];
      ByteArrayList byteArrayList0 = ByteArrayList.createByteArrayList(byteArray0, (int) (byte)0);
      assertNotNull(byteArrayList0);
      assertEquals(10, byteArrayList0.length());
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      
      // Undeclared exception!
      try {
        recordTypeMessage0.setRequestObject((Object) byteArrayList0, (XBUSSystem) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}

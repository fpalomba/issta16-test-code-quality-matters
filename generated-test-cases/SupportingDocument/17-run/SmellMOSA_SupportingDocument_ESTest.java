/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 16 13:32:44 GMT 2015
 */

package macaw.businessLayer;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import macaw.businessLayer.SupportingDocument;
import macaw.businessLayer.User;
import macaw.system.MacawChangeEvent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SupportingDocument_ESTest extends SupportingDocument_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. macaw.businessLayer.SupportingDocument.validateFields(Lmacaw/businessLayer/SupportingDocument;)V: I106 Branch 4 IFLE L238 - true
   */

  @Test
  public void test0()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      assertNotNull(supportingDocument0);
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals("", supportingDocument0.getFilePath());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertEquals("", supportingDocument0.getDocumentCode());
      assertEquals("", supportingDocument0.getFileName());
      assertEquals("", supportingDocument0.getTitle());
      assertEquals("", supportingDocument0.getDescription());
      
      supportingDocument0.setTitle("L\"L");
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals("", supportingDocument0.getFilePath());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertEquals("", supportingDocument0.getDocumentCode());
      assertEquals("", supportingDocument0.getFileName());
      assertEquals("L\"L", supportingDocument0.getTitle());
      assertEquals("", supportingDocument0.getDescription());
      
      supportingDocument0.setDocumentCode("L\"L");
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals("", supportingDocument0.getFilePath());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertEquals("L\"L", supportingDocument0.getDocumentCode());
      assertEquals("", supportingDocument0.getFileName());
      assertEquals("L\"L", supportingDocument0.getTitle());
      assertEquals("", supportingDocument0.getDescription());
      
      supportingDocument0.setFileName("L\"L");
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals("", supportingDocument0.getFilePath());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertEquals("L\"L", supportingDocument0.getDocumentCode());
      assertEquals("L\"L", supportingDocument0.getTitle());
      assertEquals("L\"L", supportingDocument0.getFileName());
      assertEquals("", supportingDocument0.getDescription());
      
      SupportingDocument.validateFields(supportingDocument0);
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals("", supportingDocument0.getFilePath());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertEquals("L\"L", supportingDocument0.getDocumentCode());
      assertEquals("L\"L", supportingDocument0.getTitle());
      assertEquals("L\"L", supportingDocument0.getFileName());
      assertEquals("", supportingDocument0.getDescription());
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. macaw.businessLayer.SupportingDocument.validateFields(Lmacaw/businessLayer/SupportingDocument;)V: I50 Branch 2 IF_ICMPNE L210 - true
   * Goal 2. macaw.businessLayer.SupportingDocument.validateFields(Lmacaw/businessLayer/SupportingDocument;)V: I81 Branch 3 IF_ICMPNE L230 - true
   */

  @Test
  public void test1()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      assertNotNull(supportingDocument0);
      assertEquals("", supportingDocument0.getTitle());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertEquals("", supportingDocument0.getFileName());
      assertEquals("", supportingDocument0.getDocumentCode());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals("", supportingDocument0.getFilePath());
      assertEquals("", supportingDocument0.getDescription());
      
      supportingDocument0.setDocumentCode("L\"L");
      assertEquals("", supportingDocument0.getTitle());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertEquals("", supportingDocument0.getFileName());
      assertEquals("L\"L", supportingDocument0.getDocumentCode());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals("", supportingDocument0.getFilePath());
      assertEquals("", supportingDocument0.getDescription());
      
      supportingDocument0.setFileName("L\"L");
      assertEquals("", supportingDocument0.getTitle());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertEquals("L\"L", supportingDocument0.getDocumentCode());
      assertEquals("L\"L", supportingDocument0.getFileName());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals("", supportingDocument0.getFilePath());
      assertEquals("", supportingDocument0.getDescription());
      
      try {
        SupportingDocument.validateFields(supportingDocument0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 2
  /*
   * 3 covered goals:
   * Goal 1. macaw.businessLayer.SupportingDocument.detectFieldChanges(Lmacaw/businessLayer/User;Lmacaw/businessLayer/SupportingDocument;Lmacaw/businessLayer/SupportingDocument;)Ljava/util/ArrayList;: I29 Branch 6 IFGT L287 - false
   * Goal 2. macaw.businessLayer.SupportingDocument.detectFieldChanges(Lmacaw/businessLayer/User;Lmacaw/businessLayer/SupportingDocument;Lmacaw/businessLayer/SupportingDocument;)Ljava/util/ArrayList;: I76 Branch 7 IFGT L302 - false
   * Goal 3. macaw.businessLayer.SupportingDocument.detectFieldChanges(Lmacaw/businessLayer/User;Lmacaw/businessLayer/SupportingDocument;Lmacaw/businessLayer/SupportingDocument;)Ljava/util/ArrayList;: I170 Branch 9 IFGT L333 - false
   */

  @Test
  public void test2()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      assertNotNull(supportingDocument0);
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals("", supportingDocument0.getDescription());
      assertEquals("", supportingDocument0.getFilePath());
      assertEquals("", supportingDocument0.getTitle());
      assertEquals("", supportingDocument0.getFileName());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertEquals("", supportingDocument0.getDocumentCode());
      
      supportingDocument0.setFileName("+*+Zq:J6ps9");
      assertEquals("+*+Zq:J6ps9", supportingDocument0.getFileName());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals("", supportingDocument0.getDescription());
      assertEquals("", supportingDocument0.getFilePath());
      assertEquals("", supportingDocument0.getTitle());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertEquals("", supportingDocument0.getDocumentCode());
      
      supportingDocument0.setTitle("+*+Zq:J6ps9");
      assertEquals("+*+Zq:J6ps9", supportingDocument0.getFileName());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals("", supportingDocument0.getDescription());
      assertEquals("", supportingDocument0.getFilePath());
      assertEquals("+*+Zq:J6ps9", supportingDocument0.getTitle());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertEquals("", supportingDocument0.getDocumentCode());
      
      String string0 = supportingDocument0.getDisplayName();
      assertNotNull(string0);
      assertEquals("+*+Zq:J6ps9-", string0);
      assertEquals("+*+Zq:J6ps9", supportingDocument0.getFileName());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals("", supportingDocument0.getDescription());
      assertEquals("", supportingDocument0.getFilePath());
      assertEquals("+*+Zq:J6ps9", supportingDocument0.getTitle());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertEquals("", supportingDocument0.getDocumentCode());
      
      SupportingDocument supportingDocument1 = new SupportingDocument();
      assertNotNull(supportingDocument1);
      assertEquals(0, supportingDocument1.getIdentifier());
      assertEquals("", supportingDocument1.getFilePath());
      assertEquals("", supportingDocument1.getDocumentCode());
      assertFalse(supportingDocument1.isNewRecord());
      assertEquals("", supportingDocument1.getFileName());
      assertEquals("", supportingDocument1.getDescription());
      assertEquals("", supportingDocument1.getTitle());
      assertEquals("0", supportingDocument1.getDisplayItemIdentifier());
      assertFalse(supportingDocument1.equals((Object)supportingDocument0));
      assertNotSame(supportingDocument1, supportingDocument0);
      
      supportingDocument1.setDocumentCode("+*+Zq:J6ps9");
      assertEquals(0, supportingDocument1.getIdentifier());
      assertEquals("", supportingDocument1.getFilePath());
      assertFalse(supportingDocument1.isNewRecord());
      assertEquals("", supportingDocument1.getFileName());
      assertEquals("", supportingDocument1.getDescription());
      assertEquals("", supportingDocument1.getTitle());
      assertEquals("0", supportingDocument1.getDisplayItemIdentifier());
      assertEquals("+*+Zq:J6ps9", supportingDocument1.getDocumentCode());
      assertFalse(supportingDocument1.equals((Object)supportingDocument0));
      assertNotSame(supportingDocument1, supportingDocument0);
      
      User user0 = new User("+*+Zq:J6ps9-", "+*+Zq:J6ps9-");
      assertNotNull(user0);
      assertEquals("UNVERIFIED", user0.getStatus());
      assertEquals("", user0.getCounty());
      assertEquals("", user0.getAddressLine1());
      assertEquals("", user0.getCity());
      assertEquals("", user0.getFirstName());
      assertEquals("", user0.getPostCode());
      assertEquals("+*+Zq:J6ps9-", user0.getUserID());
      assertEquals("", user0.getEmail());
      assertEquals(0, user0.getIdentifier());
      assertEquals("", user0.getLastName());
      assertEquals("+*+Zq:J6ps9-", user0.getDisplayName());
      assertEquals("0", user0.getDisplayItemIdentifier());
      assertEquals("", user0.getAddressLine2());
      assertEquals("", user0.getPhone());
      assertEquals("", user0.getAffiliation());
      assertEquals("+*+Zq:J6ps9-", user0.getPassword());
      
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument0);
      assertNotNull(arrayList0);
      assertEquals(0, supportingDocument1.getIdentifier());
      assertEquals("", supportingDocument1.getFilePath());
      assertFalse(supportingDocument1.isNewRecord());
      assertEquals("", supportingDocument1.getFileName());
      assertEquals("", supportingDocument1.getDescription());
      assertEquals("", supportingDocument1.getTitle());
      assertEquals("0", supportingDocument1.getDisplayItemIdentifier());
      assertEquals("+*+Zq:J6ps9", supportingDocument1.getDocumentCode());
      assertEquals("UNVERIFIED", user0.getStatus());
      assertEquals("", user0.getCounty());
      assertEquals("", user0.getAddressLine1());
      assertEquals("", user0.getCity());
      assertEquals("", user0.getFirstName());
      assertEquals("", user0.getPostCode());
      assertEquals("+*+Zq:J6ps9-", user0.getUserID());
      assertEquals("", user0.getEmail());
      assertEquals(0, user0.getIdentifier());
      assertEquals("", user0.getLastName());
      assertEquals("+*+Zq:J6ps9-", user0.getDisplayName());
      assertEquals("0", user0.getDisplayItemIdentifier());
      assertEquals("", user0.getAddressLine2());
      assertEquals("", user0.getPhone());
      assertEquals("", user0.getAffiliation());
      assertEquals("+*+Zq:J6ps9-", user0.getPassword());
      assertEquals(3, arrayList0.size());
      assertFalse(arrayList0.isEmpty());
      assertEquals("+*+Zq:J6ps9", supportingDocument0.getFileName());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals("", supportingDocument0.getDescription());
      assertEquals("", supportingDocument0.getFilePath());
      assertEquals("+*+Zq:J6ps9", supportingDocument0.getTitle());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertEquals("", supportingDocument0.getDocumentCode());
      assertFalse(supportingDocument1.equals((Object)supportingDocument0));
      assertFalse(supportingDocument0.equals((Object)supportingDocument1));
      assertNotSame(supportingDocument1, supportingDocument0);
      assertNotSame(supportingDocument0, supportingDocument1);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. macaw.businessLayer.SupportingDocument.getDisplayName()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test3()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      assertNotNull(supportingDocument0);
      assertEquals("", supportingDocument0.getTitle());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertEquals("", supportingDocument0.getFileName());
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals("", supportingDocument0.getDocumentCode());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("", supportingDocument0.getFilePath());
      assertEquals("", supportingDocument0.getDescription());
      
      String string0 = supportingDocument0.getDisplayName();
      assertNotNull(string0);
      assertEquals("-", string0);
      assertEquals("", supportingDocument0.getTitle());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertEquals("", supportingDocument0.getFileName());
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals("", supportingDocument0.getDocumentCode());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("", supportingDocument0.getFilePath());
      assertEquals("", supportingDocument0.getDescription());
  }

  //Test case number: 4
  /*
   * 5 covered goals:
   * Goal 1. macaw.businessLayer.SupportingDocument.getIdentifier()I: root-Branch
   * Goal 2. macaw.businessLayer.SupportingDocument.setIsNewRecord(Z)V: root-Branch
   * Goal 3. macaw.businessLayer.SupportingDocument.getDisplayItemIdentifier()Ljava/lang/String;: root-Branch
   * Goal 4. macaw.businessLayer.SupportingDocument.detectFieldChanges(Lmacaw/businessLayer/User;Lmacaw/businessLayer/SupportingDocument;Lmacaw/businessLayer/SupportingDocument;)Ljava/util/ArrayList;: I123 Branch 8 IFGT L318 - false
   * Goal 5. macaw.businessLayer.SupportingDocument.detectFieldChanges(Lmacaw/businessLayer/User;Lmacaw/businessLayer/SupportingDocument;Lmacaw/businessLayer/SupportingDocument;)Ljava/util/ArrayList;: I217 Branch 10 IFGT L348 - false
   */

  @Test
  public void test4()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      assertNotNull(supportingDocument0);
      assertEquals("", supportingDocument0.getTitle());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertEquals("", supportingDocument0.getDocumentCode());
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals("", supportingDocument0.getFilePath());
      assertEquals("", supportingDocument0.getDescription());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("", supportingDocument0.getFileName());
      
      SupportingDocument supportingDocument1 = new SupportingDocument();
      assertNotNull(supportingDocument1);
      assertEquals("", supportingDocument1.getDescription());
      assertEquals("", supportingDocument1.getFileName());
      assertEquals("", supportingDocument1.getDocumentCode());
      assertFalse(supportingDocument1.isNewRecord());
      assertEquals(0, supportingDocument1.getIdentifier());
      assertEquals("", supportingDocument1.getFilePath());
      assertEquals("", supportingDocument1.getTitle());
      assertEquals("0", supportingDocument1.getDisplayItemIdentifier());
      assertFalse(supportingDocument1.equals((Object)supportingDocument0));
      assertNotSame(supportingDocument1, supportingDocument0);
      
      supportingDocument1.setDescription("Ruc8D5X");
      assertEquals("", supportingDocument1.getFileName());
      assertEquals("", supportingDocument1.getDocumentCode());
      assertFalse(supportingDocument1.isNewRecord());
      assertEquals(0, supportingDocument1.getIdentifier());
      assertEquals("", supportingDocument1.getFilePath());
      assertEquals("", supportingDocument1.getTitle());
      assertEquals("0", supportingDocument1.getDisplayItemIdentifier());
      assertEquals("Ruc8D5X", supportingDocument1.getDescription());
      assertFalse(supportingDocument1.equals((Object)supportingDocument0));
      assertNotSame(supportingDocument1, supportingDocument0);
      
      supportingDocument1.setFilePath("Ruc8D5X");
      assertEquals("", supportingDocument1.getFileName());
      assertEquals("", supportingDocument1.getDocumentCode());
      assertFalse(supportingDocument1.isNewRecord());
      assertEquals(0, supportingDocument1.getIdentifier());
      assertEquals("", supportingDocument1.getTitle());
      assertEquals("0", supportingDocument1.getDisplayItemIdentifier());
      assertEquals("Ruc8D5X", supportingDocument1.getDescription());
      assertEquals("Ruc8D5X", supportingDocument1.getFilePath());
      assertFalse(supportingDocument1.equals((Object)supportingDocument0));
      assertNotSame(supportingDocument1, supportingDocument0);
      
      boolean boolean0 = supportingDocument1.isNewRecord();
      assertFalse(boolean0);
      assertEquals("", supportingDocument1.getFileName());
      assertEquals("", supportingDocument1.getDocumentCode());
      assertFalse(supportingDocument1.isNewRecord());
      assertEquals(0, supportingDocument1.getIdentifier());
      assertEquals("", supportingDocument1.getTitle());
      assertEquals("0", supportingDocument1.getDisplayItemIdentifier());
      assertEquals("Ruc8D5X", supportingDocument1.getDescription());
      assertEquals("Ruc8D5X", supportingDocument1.getFilePath());
      assertFalse(supportingDocument1.equals((Object)supportingDocument0));
      assertNotSame(supportingDocument1, supportingDocument0);
      
      supportingDocument0.setIsNewRecord(false);
      assertEquals("", supportingDocument0.getTitle());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertEquals("", supportingDocument0.getDocumentCode());
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals("", supportingDocument0.getFilePath());
      assertEquals("", supportingDocument0.getDescription());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("", supportingDocument0.getFileName());
      assertFalse(supportingDocument0.equals((Object)supportingDocument1));
      assertNotSame(supportingDocument0, supportingDocument1);
      
      String string0 = supportingDocument1.getDisplayItemIdentifier();
      assertNotNull(string0);
      assertEquals("0", string0);
      assertEquals("", supportingDocument1.getFileName());
      assertEquals("", supportingDocument1.getDocumentCode());
      assertFalse(supportingDocument1.isNewRecord());
      assertEquals(0, supportingDocument1.getIdentifier());
      assertEquals("", supportingDocument1.getTitle());
      assertEquals("0", supportingDocument1.getDisplayItemIdentifier());
      assertEquals("Ruc8D5X", supportingDocument1.getDescription());
      assertEquals("Ruc8D5X", supportingDocument1.getFilePath());
      assertFalse(supportingDocument1.equals((Object)supportingDocument0));
      assertNotSame(supportingDocument1, supportingDocument0);
      
      User user0 = new User("Ruc8D5X", "0");
      assertNotNull(user0);
      assertEquals("", user0.getEmail());
      assertEquals("", user0.getCounty());
      assertEquals("", user0.getAddressLine1());
      assertEquals("UNVERIFIED", user0.getStatus());
      assertEquals("0", user0.getPassword());
      assertEquals("", user0.getAddressLine2());
      assertEquals("", user0.getPhone());
      assertEquals("Ruc8D5X", user0.getDisplayName());
      assertEquals("", user0.getLastName());
      assertEquals(0, user0.getIdentifier());
      assertEquals("0", user0.getDisplayItemIdentifier());
      assertEquals("", user0.getAffiliation());
      assertEquals("", user0.getCity());
      assertEquals("", user0.getPostCode());
      assertEquals("Ruc8D5X", user0.getUserID());
      assertEquals("", user0.getFirstName());
      
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument1);
      assertNotNull(arrayList0);
      assertEquals("", user0.getEmail());
      assertEquals("", user0.getCounty());
      assertEquals("", user0.getAddressLine1());
      assertEquals("UNVERIFIED", user0.getStatus());
      assertEquals("0", user0.getPassword());
      assertEquals("", user0.getAddressLine2());
      assertEquals("", user0.getPhone());
      assertEquals("Ruc8D5X", user0.getDisplayName());
      assertEquals("", user0.getLastName());
      assertEquals(0, user0.getIdentifier());
      assertEquals("0", user0.getDisplayItemIdentifier());
      assertEquals("", user0.getAffiliation());
      assertEquals("", user0.getCity());
      assertEquals("", user0.getPostCode());
      assertEquals("Ruc8D5X", user0.getUserID());
      assertEquals("", user0.getFirstName());
      assertEquals("", supportingDocument1.getFileName());
      assertEquals("", supportingDocument1.getDocumentCode());
      assertFalse(supportingDocument1.isNewRecord());
      assertEquals(0, supportingDocument1.getIdentifier());
      assertEquals("", supportingDocument1.getTitle());
      assertEquals("0", supportingDocument1.getDisplayItemIdentifier());
      assertEquals("Ruc8D5X", supportingDocument1.getDescription());
      assertEquals("Ruc8D5X", supportingDocument1.getFilePath());
      assertFalse(arrayList0.isEmpty());
      assertEquals(2, arrayList0.size());
      assertEquals("", supportingDocument0.getTitle());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertEquals("", supportingDocument0.getDocumentCode());
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals("", supportingDocument0.getFilePath());
      assertEquals("", supportingDocument0.getDescription());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("", supportingDocument0.getFileName());
      assertFalse(supportingDocument1.equals((Object)supportingDocument0));
      assertFalse(supportingDocument0.equals((Object)supportingDocument1));
      assertNotSame(supportingDocument1, supportingDocument0);
      assertNotSame(supportingDocument0, supportingDocument1);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * Goal 1. macaw.businessLayer.SupportingDocument.isNewRecord()Z: root-Branch
   */

  @Test
  public void test5()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      assertNotNull(supportingDocument0);
      assertEquals("", supportingDocument0.getDescription());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("", supportingDocument0.getFileName());
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals("", supportingDocument0.getFilePath());
      assertEquals("", supportingDocument0.getDocumentCode());
      assertEquals("", supportingDocument0.getTitle());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      
      boolean boolean0 = supportingDocument0.isNewRecord();
      assertFalse(boolean0);
      assertEquals("", supportingDocument0.getDescription());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("", supportingDocument0.getFileName());
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals("", supportingDocument0.getFilePath());
      assertEquals("", supportingDocument0.getDocumentCode());
      assertEquals("", supportingDocument0.getTitle());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. macaw.businessLayer.SupportingDocument.validateFields(Lmacaw/businessLayer/SupportingDocument;)V: I19 Branch 1 IF_ICMPNE L190 - true
   */

  @Test
  public void test6()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      assertNotNull(supportingDocument0);
      assertEquals("", supportingDocument0.getFileName());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertEquals("", supportingDocument0.getDocumentCode());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals("", supportingDocument0.getDescription());
      assertEquals("", supportingDocument0.getFilePath());
      assertEquals("", supportingDocument0.getTitle());
      
      supportingDocument0.setTitle("-");
      assertEquals("-", supportingDocument0.getTitle());
      assertEquals("", supportingDocument0.getFileName());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertEquals("", supportingDocument0.getDocumentCode());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals("", supportingDocument0.getDescription());
      assertEquals("", supportingDocument0.getFilePath());
      
      try {
        SupportingDocument.validateFields(supportingDocument0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 7
  /*
   * 7 covered goals:
   * Goal 1. macaw.businessLayer.SupportingDocument.getDescription()Ljava/lang/String;: root-Branch
   * Goal 2. macaw.businessLayer.SupportingDocument.getFilePath()Ljava/lang/String;: root-Branch
   * Goal 3. macaw.businessLayer.SupportingDocument.detectFieldChanges(Lmacaw/businessLayer/User;Lmacaw/businessLayer/SupportingDocument;Lmacaw/businessLayer/SupportingDocument;)Ljava/util/ArrayList;: I29 Branch 6 IFGT L287 - true
   * Goal 4. macaw.businessLayer.SupportingDocument.detectFieldChanges(Lmacaw/businessLayer/User;Lmacaw/businessLayer/SupportingDocument;Lmacaw/businessLayer/SupportingDocument;)Ljava/util/ArrayList;: I76 Branch 7 IFGT L302 - true
   * Goal 5. macaw.businessLayer.SupportingDocument.detectFieldChanges(Lmacaw/businessLayer/User;Lmacaw/businessLayer/SupportingDocument;Lmacaw/businessLayer/SupportingDocument;)Ljava/util/ArrayList;: I123 Branch 8 IFGT L318 - true
   * Goal 6. macaw.businessLayer.SupportingDocument.detectFieldChanges(Lmacaw/businessLayer/User;Lmacaw/businessLayer/SupportingDocument;Lmacaw/businessLayer/SupportingDocument;)Ljava/util/ArrayList;: I170 Branch 9 IFGT L333 - true
   * Goal 7. macaw.businessLayer.SupportingDocument.detectFieldChanges(Lmacaw/businessLayer/User;Lmacaw/businessLayer/SupportingDocument;Lmacaw/businessLayer/SupportingDocument;)Ljava/util/ArrayList;: I217 Branch 10 IFGT L348 - true
   */

  @Test
  public void test7()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      assertNotNull(supportingDocument0);
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals("", supportingDocument0.getDocumentCode());
      assertEquals("", supportingDocument0.getFilePath());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertEquals("", supportingDocument0.getTitle());
      assertEquals("", supportingDocument0.getDescription());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("", supportingDocument0.getFileName());
      
      User user0 = new User();
      assertNotNull(user0);
      assertEquals("", user0.getFirstName());
      assertEquals("", user0.getEmail());
      assertEquals("UNVERIFIED", user0.getStatus());
      assertEquals("", user0.getCounty());
      assertEquals("", user0.getPostCode());
      assertEquals("", user0.getPassword());
      assertEquals("", user0.getCity());
      assertEquals(0, user0.getIdentifier());
      assertEquals("", user0.getDisplayName());
      assertEquals("", user0.getAffiliation());
      assertEquals("", user0.getAddressLine2());
      assertEquals("0", user0.getDisplayItemIdentifier());
      assertEquals("", user0.getPhone());
      assertEquals("", user0.getAddressLine1());
      assertEquals("", user0.getUserID());
      assertEquals("", user0.getLastName());
      
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      assertNotNull(arrayList0);
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals("", supportingDocument0.getDocumentCode());
      assertEquals("", supportingDocument0.getFilePath());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertEquals("", supportingDocument0.getTitle());
      assertEquals("", supportingDocument0.getDescription());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("", supportingDocument0.getFileName());
      assertTrue(arrayList0.isEmpty());
      assertEquals(0, arrayList0.size());
      assertEquals("", user0.getFirstName());
      assertEquals("", user0.getEmail());
      assertEquals("UNVERIFIED", user0.getStatus());
      assertEquals("", user0.getCounty());
      assertEquals("", user0.getPostCode());
      assertEquals("", user0.getPassword());
      assertEquals("", user0.getCity());
      assertEquals(0, user0.getIdentifier());
      assertEquals("", user0.getDisplayName());
      assertEquals("", user0.getAffiliation());
      assertEquals("", user0.getAddressLine2());
      assertEquals("0", user0.getDisplayItemIdentifier());
      assertEquals("", user0.getPhone());
      assertEquals("", user0.getAddressLine1());
      assertEquals("", user0.getUserID());
      assertEquals("", user0.getLastName());
  }

  //Test case number: 8
  /*
   * 7 covered goals:
   * Goal 1. macaw.businessLayer.SupportingDocument.setDescription(Ljava/lang/String;)V: root-Branch
   * Goal 2. macaw.businessLayer.SupportingDocument.setFilePath(Ljava/lang/String;)V: root-Branch
   * Goal 3. macaw.businessLayer.SupportingDocument.setTitle(Ljava/lang/String;)V: root-Branch
   * Goal 4. macaw.businessLayer.SupportingDocument.clone()Ljava/lang/Object;: root-Branch
   * Goal 5. macaw.businessLayer.SupportingDocument.setFileName(Ljava/lang/String;)V: root-Branch
   * Goal 6. macaw.businessLayer.SupportingDocument.setIdentifier(I)V: root-Branch
   * Goal 7. macaw.businessLayer.SupportingDocument.setDocumentCode(Ljava/lang/String;)V: root-Branch
   */

  @Test
  public void test8()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      assertNotNull(supportingDocument0);
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals("", supportingDocument0.getFilePath());
      assertEquals("", supportingDocument0.getDocumentCode());
      assertEquals("", supportingDocument0.getTitle());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("", supportingDocument0.getDescription());
      assertEquals("", supportingDocument0.getFileName());
      
      SupportingDocument supportingDocument1 = (SupportingDocument)supportingDocument0.clone();
      assertNotNull(supportingDocument1);
      assertFalse(supportingDocument1.isNewRecord());
      assertEquals(0, supportingDocument1.getIdentifier());
      assertEquals("", supportingDocument1.getFilePath());
      assertEquals("", supportingDocument1.getDescription());
      assertEquals("", supportingDocument1.getFileName());
      assertEquals("", supportingDocument1.getTitle());
      assertEquals("0", supportingDocument1.getDisplayItemIdentifier());
      assertEquals("", supportingDocument1.getDocumentCode());
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals("", supportingDocument0.getFilePath());
      assertEquals("", supportingDocument0.getDocumentCode());
      assertEquals("", supportingDocument0.getTitle());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("", supportingDocument0.getDescription());
      assertEquals("", supportingDocument0.getFileName());
      assertFalse(supportingDocument1.equals((Object)supportingDocument0));
      assertFalse(supportingDocument0.equals((Object)supportingDocument1));
      assertNotSame(supportingDocument1, supportingDocument0);
      assertNotSame(supportingDocument0, supportingDocument1);
  }

  //Test case number: 9
  /*
   * 10 covered goals:
   * Goal 1. macaw.businessLayer.SupportingDocument.<init>()V: root-Branch
   * Goal 2. macaw.businessLayer.SupportingDocument.getFileName()Ljava/lang/String;: root-Branch
   * Goal 3. macaw.businessLayer.SupportingDocument.getDocumentCode()Ljava/lang/String;: root-Branch
   * Goal 4. macaw.businessLayer.SupportingDocument.getTitle()Ljava/lang/String;: root-Branch
   * Goal 5. macaw.businessLayer.SupportingDocument.validateFields(Lmacaw/businessLayer/SupportingDocument;)V: I19 Branch 1 IF_ICMPNE L190 - false
   * Goal 6. macaw.businessLayer.SupportingDocument.validateFields(Lmacaw/businessLayer/SupportingDocument;)V: I50 Branch 2 IF_ICMPNE L210 - false
   * Goal 7. macaw.businessLayer.SupportingDocument.validateFields(Lmacaw/businessLayer/SupportingDocument;)V: I81 Branch 3 IF_ICMPNE L230 - false
   * Goal 8. macaw.businessLayer.SupportingDocument.validateFields(Lmacaw/businessLayer/SupportingDocument;)V: I106 Branch 4 IFLE L238 - false
   * Goal 9. macaw.businessLayer.SupportingDocument.validateFields(Lmacaw/businessLayer/SupportingDocument;)V: I124 Branch 5 IFEQ L241 - true
   * Goal 10. macaw.businessLayer.SupportingDocument.validateFields(Lmacaw/businessLayer/SupportingDocument;)V: I124 Branch 5 IFEQ L241 - false
   */

  @Test
  public void test9()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      assertNotNull(supportingDocument0);
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals("", supportingDocument0.getFilePath());
      assertEquals("", supportingDocument0.getTitle());
      assertEquals("", supportingDocument0.getDescription());
      assertEquals("", supportingDocument0.getFileName());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertEquals("", supportingDocument0.getDocumentCode());
      
      try {
        SupportingDocument.validateFields(supportingDocument0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}

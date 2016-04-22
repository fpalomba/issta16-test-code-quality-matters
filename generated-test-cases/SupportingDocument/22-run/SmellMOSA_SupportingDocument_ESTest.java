/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 16 13:35:11 GMT 2015
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
   * Goal 1. macaw.businessLayer.SupportingDocument.isNewRecord()Z: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      assertNotNull(supportingDocument0);
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertEquals("", supportingDocument0.getDocumentCode());
      assertEquals("", supportingDocument0.getTitle());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("", supportingDocument0.getFileName());
      assertEquals("", supportingDocument0.getDescription());
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals("", supportingDocument0.getFilePath());
      
      boolean boolean0 = supportingDocument0.isNewRecord();
      assertFalse(boolean0);
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertEquals("", supportingDocument0.getDocumentCode());
      assertEquals("", supportingDocument0.getTitle());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("", supportingDocument0.getFileName());
      assertEquals("", supportingDocument0.getDescription());
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals("", supportingDocument0.getFilePath());
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. macaw.businessLayer.SupportingDocument.clone()Ljava/lang/Object;: root-Branch
   * Goal 2. macaw.businessLayer.SupportingDocument.setIdentifier(I)V: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      assertNotNull(supportingDocument0);
      assertEquals("", supportingDocument0.getTitle());
      assertEquals("", supportingDocument0.getDocumentCode());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals("", supportingDocument0.getFilePath());
      assertEquals("", supportingDocument0.getDescription());
      assertEquals("", supportingDocument0.getFileName());
      
      SupportingDocument supportingDocument1 = (SupportingDocument)supportingDocument0.clone();
      assertNotNull(supportingDocument1);
      assertEquals("", supportingDocument0.getTitle());
      assertEquals("", supportingDocument0.getDocumentCode());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals("", supportingDocument0.getFilePath());
      assertEquals("", supportingDocument0.getDescription());
      assertEquals("", supportingDocument0.getFileName());
      assertEquals("", supportingDocument1.getDocumentCode());
      assertEquals("", supportingDocument1.getTitle());
      assertEquals("", supportingDocument1.getFileName());
      assertFalse(supportingDocument1.isNewRecord());
      assertEquals("", supportingDocument1.getDescription());
      assertEquals("0", supportingDocument1.getDisplayItemIdentifier());
      assertEquals("", supportingDocument1.getFilePath());
      assertEquals(0, supportingDocument1.getIdentifier());
      assertNotSame(supportingDocument0, supportingDocument1);
      assertNotSame(supportingDocument1, supportingDocument0);
      assertFalse(supportingDocument0.equals((Object)supportingDocument1));
      assertFalse(supportingDocument1.equals((Object)supportingDocument0));
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. macaw.businessLayer.SupportingDocument.getDisplayItemIdentifier()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test2()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      assertNotNull(supportingDocument0);
      assertEquals("", supportingDocument0.getTitle());
      assertEquals("", supportingDocument0.getDocumentCode());
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals("", supportingDocument0.getFilePath());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertEquals("", supportingDocument0.getDescription());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("", supportingDocument0.getFileName());
      
      String string0 = supportingDocument0.getDisplayItemIdentifier();
      assertEquals("0", string0);
      assertNotNull(string0);
      assertEquals("", supportingDocument0.getTitle());
      assertEquals("", supportingDocument0.getDocumentCode());
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals("", supportingDocument0.getFilePath());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertEquals("", supportingDocument0.getDescription());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("", supportingDocument0.getFileName());
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
      assertEquals("", supportingDocument0.getDocumentCode());
      assertEquals("", supportingDocument0.getTitle());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("", supportingDocument0.getFileName());
      assertEquals("", supportingDocument0.getDescription());
      assertEquals("", supportingDocument0.getFilePath());
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      
      String string0 = supportingDocument0.getDisplayName();
      assertEquals("-", string0);
      assertNotNull(string0);
      assertEquals("", supportingDocument0.getDocumentCode());
      assertEquals("", supportingDocument0.getTitle());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("", supportingDocument0.getFileName());
      assertEquals("", supportingDocument0.getDescription());
      assertEquals("", supportingDocument0.getFilePath());
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * Goal 1. macaw.businessLayer.SupportingDocument.validateFields(Lmacaw/businessLayer/SupportingDocument;)V: I19 Branch 1 IF_ICMPNE L190 - false
   */

  @Test
  public void test4()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      assertNotNull(supportingDocument0);
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertEquals("", supportingDocument0.getTitle());
      assertEquals("", supportingDocument0.getDocumentCode());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("", supportingDocument0.getFileName());
      assertEquals("", supportingDocument0.getDescription());
      assertEquals(0, supportingDocument0.getIdentifier());
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

  //Test case number: 5
  /*
   * 3 covered goals:
   * Goal 1. macaw.businessLayer.SupportingDocument.validateFields(Lmacaw/businessLayer/SupportingDocument;)V: I50 Branch 2 IF_ICMPNE L210 - true
   * Goal 2. macaw.businessLayer.SupportingDocument.validateFields(Lmacaw/businessLayer/SupportingDocument;)V: I81 Branch 3 IF_ICMPNE L230 - true
   * Goal 3. macaw.businessLayer.SupportingDocument.validateFields(Lmacaw/businessLayer/SupportingDocument;)V: I106 Branch 4 IFLE L238 - true
   */

  @Test
  public void test5()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      assertNotNull(supportingDocument0);
      assertEquals("", supportingDocument0.getDescription());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertEquals("", supportingDocument0.getTitle());
      assertEquals("", supportingDocument0.getDocumentCode());
      assertEquals("", supportingDocument0.getFileName());
      assertEquals("", supportingDocument0.getFilePath());
      assertEquals(0, supportingDocument0.getIdentifier());
      
      supportingDocument0.setDocumentCode("j?3mG");
      assertEquals("", supportingDocument0.getDescription());
      assertEquals("j?3mG", supportingDocument0.getDocumentCode());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertEquals("", supportingDocument0.getTitle());
      assertEquals("", supportingDocument0.getFileName());
      assertEquals("", supportingDocument0.getFilePath());
      assertEquals(0, supportingDocument0.getIdentifier());
      
      supportingDocument0.setFileName("j?3mG");
      assertEquals("j?3mG", supportingDocument0.getFileName());
      assertEquals("", supportingDocument0.getDescription());
      assertEquals("j?3mG", supportingDocument0.getDocumentCode());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertEquals("", supportingDocument0.getTitle());
      assertEquals("", supportingDocument0.getFilePath());
      assertEquals(0, supportingDocument0.getIdentifier());
      
      supportingDocument0.setTitle("j?3mG");
      assertEquals("j?3mG", supportingDocument0.getFileName());
      assertEquals("", supportingDocument0.getDescription());
      assertEquals("j?3mG", supportingDocument0.getTitle());
      assertEquals("j?3mG", supportingDocument0.getDocumentCode());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertEquals("", supportingDocument0.getFilePath());
      assertEquals(0, supportingDocument0.getIdentifier());
      
      SupportingDocument.validateFields(supportingDocument0);
      assertEquals("j?3mG", supportingDocument0.getFileName());
      assertEquals("", supportingDocument0.getDescription());
      assertEquals("j?3mG", supportingDocument0.getTitle());
      assertEquals("j?3mG", supportingDocument0.getDocumentCode());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertEquals("", supportingDocument0.getFilePath());
      assertEquals(0, supportingDocument0.getIdentifier());
  }

  //Test case number: 6
  /*
   * 10 covered goals:
   * Goal 1. macaw.businessLayer.SupportingDocument.setDescription(Ljava/lang/String;)V: root-Branch
   * Goal 2. macaw.businessLayer.SupportingDocument.setTitle(Ljava/lang/String;)V: root-Branch
   * Goal 3. macaw.businessLayer.SupportingDocument.validateFields(Lmacaw/businessLayer/SupportingDocument;)V: I19 Branch 1 IF_ICMPNE L190 - true
   * Goal 4. macaw.businessLayer.SupportingDocument.validateFields(Lmacaw/businessLayer/SupportingDocument;)V: I50 Branch 2 IF_ICMPNE L210 - false
   * Goal 5. macaw.businessLayer.SupportingDocument.validateFields(Lmacaw/businessLayer/SupportingDocument;)V: I81 Branch 3 IF_ICMPNE L230 - false
   * Goal 6. macaw.businessLayer.SupportingDocument.validateFields(Lmacaw/businessLayer/SupportingDocument;)V: I106 Branch 4 IFLE L238 - false
   * Goal 7. macaw.businessLayer.SupportingDocument.validateFields(Lmacaw/businessLayer/SupportingDocument;)V: I124 Branch 5 IFEQ L241 - true
   * Goal 8. macaw.businessLayer.SupportingDocument.validateFields(Lmacaw/businessLayer/SupportingDocument;)V: I124 Branch 5 IFEQ L241 - false
   * Goal 9. macaw.businessLayer.SupportingDocument.detectFieldChanges(Lmacaw/businessLayer/User;Lmacaw/businessLayer/SupportingDocument;Lmacaw/businessLayer/SupportingDocument;)Ljava/util/ArrayList;: I29 Branch 6 IFGT L287 - false
   * Goal 10. macaw.businessLayer.SupportingDocument.detectFieldChanges(Lmacaw/businessLayer/User;Lmacaw/businessLayer/SupportingDocument;Lmacaw/businessLayer/SupportingDocument;)Ljava/util/ArrayList;: I123 Branch 8 IFGT L318 - false
   */

  @Test
  public void test6()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      assertNotNull(supportingDocument0);
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertEquals("", supportingDocument0.getTitle());
      assertEquals("", supportingDocument0.getDocumentCode());
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals("", supportingDocument0.getFilePath());
      assertEquals("", supportingDocument0.getDescription());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("", supportingDocument0.getFileName());
      
      supportingDocument0.setTitle("T");
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertEquals("", supportingDocument0.getDocumentCode());
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals("", supportingDocument0.getFilePath());
      assertEquals("T", supportingDocument0.getTitle());
      assertEquals("", supportingDocument0.getDescription());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("", supportingDocument0.getFileName());
      
      supportingDocument0.setDescription("T");
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertEquals("", supportingDocument0.getDocumentCode());
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals("", supportingDocument0.getFilePath());
      assertEquals("T", supportingDocument0.getTitle());
      assertEquals("T", supportingDocument0.getDescription());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("", supportingDocument0.getFileName());
      
      SupportingDocument supportingDocument1 = new SupportingDocument();
      assertNotNull(supportingDocument1);
      assertEquals("0", supportingDocument1.getDisplayItemIdentifier());
      assertEquals("", supportingDocument1.getTitle());
      assertFalse(supportingDocument1.isNewRecord());
      assertEquals("", supportingDocument1.getFileName());
      assertEquals("", supportingDocument1.getDescription());
      assertEquals(0, supportingDocument1.getIdentifier());
      assertEquals("", supportingDocument1.getFilePath());
      assertEquals("", supportingDocument1.getDocumentCode());
      assertNotSame(supportingDocument1, supportingDocument0);
      assertFalse(supportingDocument1.equals((Object)supportingDocument0));
      
      User user0 = new User("T", "T");
      assertNotNull(user0);
      assertEquals("", user0.getEmail());
      assertEquals("", user0.getCounty());
      assertEquals("UNVERIFIED", user0.getStatus());
      assertEquals("", user0.getAddressLine2());
      assertEquals("T", user0.getDisplayName());
      assertEquals("0", user0.getDisplayItemIdentifier());
      assertEquals("", user0.getAffiliation());
      assertEquals("T", user0.getPassword());
      assertEquals("", user0.getPhone());
      assertEquals("", user0.getAddressLine1());
      assertEquals("", user0.getLastName());
      assertEquals(0, user0.getIdentifier());
      assertEquals("T", user0.getUserID());
      assertEquals("", user0.getPostCode());
      assertEquals("", user0.getFirstName());
      assertEquals("", user0.getCity());
      
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument0);
      assertNotNull(arrayList0);
      assertEquals("", user0.getEmail());
      assertEquals("", user0.getCounty());
      assertEquals("UNVERIFIED", user0.getStatus());
      assertEquals("", user0.getAddressLine2());
      assertEquals("T", user0.getDisplayName());
      assertEquals("0", user0.getDisplayItemIdentifier());
      assertEquals("", user0.getAffiliation());
      assertEquals("T", user0.getPassword());
      assertEquals("", user0.getPhone());
      assertEquals("", user0.getAddressLine1());
      assertEquals("", user0.getLastName());
      assertEquals(0, user0.getIdentifier());
      assertEquals("T", user0.getUserID());
      assertEquals("", user0.getPostCode());
      assertEquals("", user0.getFirstName());
      assertEquals("", user0.getCity());
      assertFalse(arrayList0.isEmpty());
      assertEquals(2, arrayList0.size());
      assertEquals("0", supportingDocument1.getDisplayItemIdentifier());
      assertEquals("", supportingDocument1.getTitle());
      assertFalse(supportingDocument1.isNewRecord());
      assertEquals("", supportingDocument1.getFileName());
      assertEquals("", supportingDocument1.getDescription());
      assertEquals(0, supportingDocument1.getIdentifier());
      assertEquals("", supportingDocument1.getFilePath());
      assertEquals("", supportingDocument1.getDocumentCode());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertEquals("", supportingDocument0.getDocumentCode());
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals("", supportingDocument0.getFilePath());
      assertEquals("T", supportingDocument0.getTitle());
      assertEquals("T", supportingDocument0.getDescription());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("", supportingDocument0.getFileName());
      assertNotSame(supportingDocument1, supportingDocument0);
      assertNotSame(supportingDocument0, supportingDocument1);
      assertFalse(supportingDocument1.equals((Object)supportingDocument0));
      assertFalse(supportingDocument0.equals((Object)supportingDocument1));
      
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
   * 17 covered goals:
   * Goal 1. macaw.businessLayer.SupportingDocument.getDescription()Ljava/lang/String;: root-Branch
   * Goal 2. macaw.businessLayer.SupportingDocument.getFileName()Ljava/lang/String;: root-Branch
   * Goal 3. macaw.businessLayer.SupportingDocument.setFilePath(Ljava/lang/String;)V: root-Branch
   * Goal 4. macaw.businessLayer.SupportingDocument.getFilePath()Ljava/lang/String;: root-Branch
   * Goal 5. macaw.businessLayer.SupportingDocument.getDocumentCode()Ljava/lang/String;: root-Branch
   * Goal 6. macaw.businessLayer.SupportingDocument.getIdentifier()I: root-Branch
   * Goal 7. macaw.businessLayer.SupportingDocument.getTitle()Ljava/lang/String;: root-Branch
   * Goal 8. macaw.businessLayer.SupportingDocument.setFileName(Ljava/lang/String;)V: root-Branch
   * Goal 9. macaw.businessLayer.SupportingDocument.setDocumentCode(Ljava/lang/String;)V: root-Branch
   * Goal 10. macaw.businessLayer.SupportingDocument.detectFieldChanges(Lmacaw/businessLayer/User;Lmacaw/businessLayer/SupportingDocument;Lmacaw/businessLayer/SupportingDocument;)Ljava/util/ArrayList;: I29 Branch 6 IFGT L287 - true
   * Goal 11. macaw.businessLayer.SupportingDocument.detectFieldChanges(Lmacaw/businessLayer/User;Lmacaw/businessLayer/SupportingDocument;Lmacaw/businessLayer/SupportingDocument;)Ljava/util/ArrayList;: I76 Branch 7 IFGT L302 - true
   * Goal 12. macaw.businessLayer.SupportingDocument.detectFieldChanges(Lmacaw/businessLayer/User;Lmacaw/businessLayer/SupportingDocument;Lmacaw/businessLayer/SupportingDocument;)Ljava/util/ArrayList;: I76 Branch 7 IFGT L302 - false
   * Goal 13. macaw.businessLayer.SupportingDocument.detectFieldChanges(Lmacaw/businessLayer/User;Lmacaw/businessLayer/SupportingDocument;Lmacaw/businessLayer/SupportingDocument;)Ljava/util/ArrayList;: I123 Branch 8 IFGT L318 - true
   * Goal 14. macaw.businessLayer.SupportingDocument.detectFieldChanges(Lmacaw/businessLayer/User;Lmacaw/businessLayer/SupportingDocument;Lmacaw/businessLayer/SupportingDocument;)Ljava/util/ArrayList;: I170 Branch 9 IFGT L333 - true
   * Goal 15. macaw.businessLayer.SupportingDocument.detectFieldChanges(Lmacaw/businessLayer/User;Lmacaw/businessLayer/SupportingDocument;Lmacaw/businessLayer/SupportingDocument;)Ljava/util/ArrayList;: I170 Branch 9 IFGT L333 - false
   * Goal 16. macaw.businessLayer.SupportingDocument.detectFieldChanges(Lmacaw/businessLayer/User;Lmacaw/businessLayer/SupportingDocument;Lmacaw/businessLayer/SupportingDocument;)Ljava/util/ArrayList;: I217 Branch 10 IFGT L348 - true
   * Goal 17. macaw.businessLayer.SupportingDocument.detectFieldChanges(Lmacaw/businessLayer/User;Lmacaw/businessLayer/SupportingDocument;Lmacaw/businessLayer/SupportingDocument;)Ljava/util/ArrayList;: I217 Branch 10 IFGT L348 - false
   */

  @Test
  public void test7()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      assertNotNull(supportingDocument0);
      assertEquals("", supportingDocument0.getFileName());
      assertEquals("", supportingDocument0.getTitle());
      assertEquals("", supportingDocument0.getDescription());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("", supportingDocument0.getFilePath());
      assertEquals("", supportingDocument0.getDocumentCode());
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      
      supportingDocument0.setDocumentCode("j?3mG");
      assertEquals("", supportingDocument0.getFileName());
      assertEquals("", supportingDocument0.getTitle());
      assertEquals("", supportingDocument0.getDescription());
      assertEquals("j?3mG", supportingDocument0.getDocumentCode());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("", supportingDocument0.getFilePath());
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      
      supportingDocument0.setFileName("j?3mG");
      assertEquals("", supportingDocument0.getTitle());
      assertEquals("", supportingDocument0.getDescription());
      assertEquals("j?3mG", supportingDocument0.getDocumentCode());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("j?3mG", supportingDocument0.getFileName());
      assertEquals("", supportingDocument0.getFilePath());
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      
      supportingDocument0.setFilePath("j?3mG");
      assertEquals("j?3mG", supportingDocument0.getFilePath());
      assertEquals("", supportingDocument0.getTitle());
      assertEquals("", supportingDocument0.getDescription());
      assertEquals("j?3mG", supportingDocument0.getDocumentCode());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("j?3mG", supportingDocument0.getFileName());
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      
      User user0 = new User();
      assertNotNull(user0);
      assertEquals("UNVERIFIED", user0.getStatus());
      assertEquals("", user0.getEmail());
      assertEquals("", user0.getDisplayName());
      assertEquals("", user0.getCounty());
      assertEquals("0", user0.getDisplayItemIdentifier());
      assertEquals("", user0.getPhone());
      assertEquals("", user0.getAffiliation());
      assertEquals("", user0.getAddressLine2());
      assertEquals("", user0.getAddressLine1());
      assertEquals("", user0.getLastName());
      assertEquals("", user0.getUserID());
      assertEquals(0, user0.getIdentifier());
      assertEquals("", user0.getPassword());
      assertEquals("", user0.getPostCode());
      assertEquals("", user0.getFirstName());
      assertEquals("", user0.getCity());
      
      SupportingDocument supportingDocument1 = new SupportingDocument();
      assertNotNull(supportingDocument1);
      assertEquals("", supportingDocument1.getDocumentCode());
      assertEquals(0, supportingDocument1.getIdentifier());
      assertEquals("0", supportingDocument1.getDisplayItemIdentifier());
      assertEquals("", supportingDocument1.getFilePath());
      assertEquals("", supportingDocument1.getTitle());
      assertEquals("", supportingDocument1.getDescription());
      assertEquals("", supportingDocument1.getFileName());
      assertFalse(supportingDocument1.isNewRecord());
      assertNotSame(supportingDocument1, supportingDocument0);
      assertFalse(supportingDocument1.equals((Object)supportingDocument0));
      
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument1);
      assertNotNull(arrayList0);
      assertFalse(arrayList0.isEmpty());
      assertEquals(3, arrayList0.size());
      assertEquals("UNVERIFIED", user0.getStatus());
      assertEquals("", user0.getEmail());
      assertEquals("", user0.getDisplayName());
      assertEquals("", user0.getCounty());
      assertEquals("0", user0.getDisplayItemIdentifier());
      assertEquals("", user0.getPhone());
      assertEquals("", user0.getAffiliation());
      assertEquals("", user0.getAddressLine2());
      assertEquals("", user0.getAddressLine1());
      assertEquals("", user0.getLastName());
      assertEquals("", user0.getUserID());
      assertEquals(0, user0.getIdentifier());
      assertEquals("", user0.getPassword());
      assertEquals("", user0.getPostCode());
      assertEquals("", user0.getFirstName());
      assertEquals("", user0.getCity());
      assertEquals("j?3mG", supportingDocument0.getFilePath());
      assertEquals("", supportingDocument0.getTitle());
      assertEquals("", supportingDocument0.getDescription());
      assertEquals("j?3mG", supportingDocument0.getDocumentCode());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("j?3mG", supportingDocument0.getFileName());
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertEquals("", supportingDocument1.getDocumentCode());
      assertEquals(0, supportingDocument1.getIdentifier());
      assertEquals("0", supportingDocument1.getDisplayItemIdentifier());
      assertEquals("", supportingDocument1.getFilePath());
      assertEquals("", supportingDocument1.getTitle());
      assertEquals("", supportingDocument1.getDescription());
      assertEquals("", supportingDocument1.getFileName());
      assertFalse(supportingDocument1.isNewRecord());
      assertNotSame(supportingDocument0, supportingDocument1);
      assertNotSame(supportingDocument1, supportingDocument0);
      assertFalse(supportingDocument0.equals((Object)supportingDocument1));
      assertFalse(supportingDocument1.equals((Object)supportingDocument0));
      
      ArrayList<MacawChangeEvent> arrayList1 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      assertNotNull(arrayList1);
      assertTrue(arrayList1.isEmpty());
      assertEquals(0, arrayList1.size());
      assertEquals("UNVERIFIED", user0.getStatus());
      assertEquals("", user0.getEmail());
      assertEquals("", user0.getDisplayName());
      assertEquals("", user0.getCounty());
      assertEquals("0", user0.getDisplayItemIdentifier());
      assertEquals("", user0.getPhone());
      assertEquals("", user0.getAffiliation());
      assertEquals("", user0.getAddressLine2());
      assertEquals("", user0.getAddressLine1());
      assertEquals("", user0.getLastName());
      assertEquals("", user0.getUserID());
      assertEquals(0, user0.getIdentifier());
      assertEquals("", user0.getPassword());
      assertEquals("", user0.getPostCode());
      assertEquals("", user0.getFirstName());
      assertEquals("", user0.getCity());
      assertEquals("j?3mG", supportingDocument0.getFilePath());
      assertEquals("", supportingDocument0.getTitle());
      assertEquals("", supportingDocument0.getDescription());
      assertEquals("j?3mG", supportingDocument0.getDocumentCode());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("j?3mG", supportingDocument0.getFileName());
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertNotSame(arrayList1, arrayList0);
      assertNotSame(supportingDocument0, supportingDocument1);
      assertFalse(arrayList1.equals((Object)arrayList0));
      assertFalse(supportingDocument0.equals((Object)supportingDocument1));
  }

  //Test case number: 8
  /*
   * 2 covered goals:
   * Goal 1. macaw.businessLayer.SupportingDocument.<init>()V: root-Branch
   * Goal 2. macaw.businessLayer.SupportingDocument.setIsNewRecord(Z)V: root-Branch
   */

  @Test
  public void test8()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      assertNotNull(supportingDocument0);
      assertEquals("", supportingDocument0.getDocumentCode());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals("", supportingDocument0.getFilePath());
      assertEquals("", supportingDocument0.getFileName());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("", supportingDocument0.getDescription());
      assertEquals("", supportingDocument0.getTitle());
      
      supportingDocument0.setIsNewRecord(false);
      assertEquals("", supportingDocument0.getDocumentCode());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals("", supportingDocument0.getFilePath());
      assertEquals("", supportingDocument0.getFileName());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("", supportingDocument0.getDescription());
      assertEquals("", supportingDocument0.getTitle());
  }
}

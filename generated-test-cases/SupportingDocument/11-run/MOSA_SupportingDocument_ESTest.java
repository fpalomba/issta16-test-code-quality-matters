/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 16 13:41:25 GMT 2015
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
   * Goal 1. macaw.businessLayer.SupportingDocument.detectFieldChanges(Lmacaw/businessLayer/User;Lmacaw/businessLayer/SupportingDocument;Lmacaw/businessLayer/SupportingDocument;)Ljava/util/ArrayList;: I217 Branch 10 IFGT L348 - false
   */

  @Test
  public void test00()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFilePath("5HaO");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      User user0 = new User();
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument1);
      assertEquals(0, supportingDocument1.getIdentifier());
      assertEquals(1, arrayList0.size());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. macaw.businessLayer.SupportingDocument.detectFieldChanges(Lmacaw/businessLayer/User;Lmacaw/businessLayer/SupportingDocument;Lmacaw/businessLayer/SupportingDocument;)Ljava/util/ArrayList;: I170 Branch 9 IFGT L333 - false
   */

  @Test
  public void test01()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument1.setFileName("5HaO");
      User user0 = new User();
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument1);
      assertEquals(1, arrayList0.size());
      assertEquals(0, supportingDocument1.getIdentifier());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. macaw.businessLayer.SupportingDocument.detectFieldChanges(Lmacaw/businessLayer/User;Lmacaw/businessLayer/SupportingDocument;Lmacaw/businessLayer/SupportingDocument;)Ljava/util/ArrayList;: I123 Branch 8 IFGT L318 - false
   */

  @Test
  public void test02()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument1.setDescription("honored");
      User user0 = new User();
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument1);
      assertEquals(1, arrayList0.size());
      assertEquals(0, supportingDocument1.getIdentifier());
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * Goal 1. macaw.businessLayer.SupportingDocument.detectFieldChanges(Lmacaw/businessLayer/User;Lmacaw/businessLayer/SupportingDocument;Lmacaw/businessLayer/SupportingDocument;)Ljava/util/ArrayList;: I29 Branch 6 IFGT L287 - true
   * Goal 2. macaw.businessLayer.SupportingDocument.detectFieldChanges(Lmacaw/businessLayer/User;Lmacaw/businessLayer/SupportingDocument;Lmacaw/businessLayer/SupportingDocument;)Ljava/util/ArrayList;: I76 Branch 7 IFGT L302 - false
   */

  @Test
  public void test03()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument1.setDocumentCode("cF\"A,[!)i$|L/FP1lP");
      User user0 = new User((String) null, ".5");
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument0);
      assertEquals(1, arrayList0.size());
      assertEquals(0, supportingDocument1.getIdentifier());
  }

  //Test case number: 4
  /*
   * 8 covered goals:
   * Goal 1. macaw.businessLayer.SupportingDocument.getDescription()Ljava/lang/String;: root-Branch
   * Goal 2. macaw.businessLayer.SupportingDocument.getFilePath()Ljava/lang/String;: root-Branch
   * Goal 3. macaw.businessLayer.SupportingDocument.getIdentifier()I: root-Branch
   * Goal 4. macaw.businessLayer.SupportingDocument.detectFieldChanges(Lmacaw/businessLayer/User;Lmacaw/businessLayer/SupportingDocument;Lmacaw/businessLayer/SupportingDocument;)Ljava/util/ArrayList;: I29 Branch 6 IFGT L287 - false
   * Goal 5. macaw.businessLayer.SupportingDocument.detectFieldChanges(Lmacaw/businessLayer/User;Lmacaw/businessLayer/SupportingDocument;Lmacaw/businessLayer/SupportingDocument;)Ljava/util/ArrayList;: I76 Branch 7 IFGT L302 - true
   * Goal 6. macaw.businessLayer.SupportingDocument.detectFieldChanges(Lmacaw/businessLayer/User;Lmacaw/businessLayer/SupportingDocument;Lmacaw/businessLayer/SupportingDocument;)Ljava/util/ArrayList;: I123 Branch 8 IFGT L318 - true
   * Goal 7. macaw.businessLayer.SupportingDocument.detectFieldChanges(Lmacaw/businessLayer/User;Lmacaw/businessLayer/SupportingDocument;Lmacaw/businessLayer/SupportingDocument;)Ljava/util/ArrayList;: I170 Branch 9 IFGT L333 - true
   * Goal 8. macaw.businessLayer.SupportingDocument.detectFieldChanges(Lmacaw/businessLayer/User;Lmacaw/businessLayer/SupportingDocument;Lmacaw/businessLayer/SupportingDocument;)Ljava/util/ArrayList;: I217 Branch 10 IFGT L348 - true
   */

  @Test
  public void test04()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      User user0 = new User((String) null, ".5");
      supportingDocument0.setTitle(".5");
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument1);
      assertEquals(1, arrayList0.size());
      assertEquals(0, supportingDocument1.getIdentifier());
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * Goal 1. macaw.businessLayer.SupportingDocument.validateFields(Lmacaw/businessLayer/SupportingDocument;)V: I19 Branch 1 IF_ICMPNE L190 - true
   * Goal 2. macaw.businessLayer.SupportingDocument.validateFields(Lmacaw/businessLayer/SupportingDocument;)V: I106 Branch 4 IFLE L238 - true
   */

  @Test
  public void test05()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFileName("supportingDocument.documentCode.label");
      supportingDocument0.setDocumentCode("69}i@'#< ,8l");
      supportingDocument0.setTitle("general.error.blankField");
      SupportingDocument.validateFields(supportingDocument0);
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
  }

  //Test case number: 6
  /*
   * 2 covered goals:
   * Goal 1. macaw.businessLayer.SupportingDocument.validateFields(Lmacaw/businessLayer/SupportingDocument;)V: I50 Branch 2 IF_ICMPNE L210 - false
   * Goal 2. macaw.businessLayer.SupportingDocument.validateFields(Lmacaw/businessLayer/SupportingDocument;)V: I81 Branch 3 IF_ICMPNE L230 - true
   */

  @Test
  public void test06()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFileName("initViterbi");
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
   * 9 covered goals:
   * Goal 1. macaw.businessLayer.SupportingDocument.getFileName()Ljava/lang/String;: root-Branch
   * Goal 2. macaw.businessLayer.SupportingDocument.getDocumentCode()Ljava/lang/String;: root-Branch
   * Goal 3. macaw.businessLayer.SupportingDocument.getTitle()Ljava/lang/String;: root-Branch
   * Goal 4. macaw.businessLayer.SupportingDocument.validateFields(Lmacaw/businessLayer/SupportingDocument;)V: I19 Branch 1 IF_ICMPNE L190 - false
   * Goal 5. macaw.businessLayer.SupportingDocument.validateFields(Lmacaw/businessLayer/SupportingDocument;)V: I50 Branch 2 IF_ICMPNE L210 - true
   * Goal 6. macaw.businessLayer.SupportingDocument.validateFields(Lmacaw/businessLayer/SupportingDocument;)V: I81 Branch 3 IF_ICMPNE L230 - false
   * Goal 7. macaw.businessLayer.SupportingDocument.validateFields(Lmacaw/businessLayer/SupportingDocument;)V: I106 Branch 4 IFLE L238 - false
   * Goal 8. macaw.businessLayer.SupportingDocument.validateFields(Lmacaw/businessLayer/SupportingDocument;)V: I124 Branch 5 IFEQ L241 - true
   * Goal 9. macaw.businessLayer.SupportingDocument.validateFields(Lmacaw/businessLayer/SupportingDocument;)V: I124 Branch 5 IFEQ L241 - false
   */

  @Test
  public void test07()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDocumentCode("-");
      try {
        SupportingDocument.validateFields(supportingDocument0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * Goal 1. macaw.businessLayer.SupportingDocument.getDisplayItemIdentifier()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test08()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      String string0 = supportingDocument0.getDisplayItemIdentifier();
      assertEquals("0", string0);
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * Goal 1. macaw.businessLayer.SupportingDocument.setIsNewRecord(Z)V: root-Branch
   */

  @Test
  public void test09()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setIsNewRecord(true);
      assertTrue(supportingDocument0.isNewRecord());
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * Goal 1. macaw.businessLayer.SupportingDocument.isNewRecord()Z: root-Branch
   */

  @Test
  public void test10()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      boolean boolean0 = supportingDocument0.isNewRecord();
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * Goal 1. macaw.businessLayer.SupportingDocument.getDisplayName()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test11()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      String string0 = supportingDocument0.getDisplayName();
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertEquals("-", string0);
  }

  //Test case number: 12
  /*
   * 8 covered goals:
   * Goal 1. macaw.businessLayer.SupportingDocument.<init>()V: root-Branch
   * Goal 2. macaw.businessLayer.SupportingDocument.setDescription(Ljava/lang/String;)V: root-Branch
   * Goal 3. macaw.businessLayer.SupportingDocument.setFilePath(Ljava/lang/String;)V: root-Branch
   * Goal 4. macaw.businessLayer.SupportingDocument.setTitle(Ljava/lang/String;)V: root-Branch
   * Goal 5. macaw.businessLayer.SupportingDocument.clone()Ljava/lang/Object;: root-Branch
   * Goal 6. macaw.businessLayer.SupportingDocument.setFileName(Ljava/lang/String;)V: root-Branch
   * Goal 7. macaw.businessLayer.SupportingDocument.setIdentifier(I)V: root-Branch
   * Goal 8. macaw.businessLayer.SupportingDocument.setDocumentCode(Ljava/lang/String;)V: root-Branch
   */

  @Test
  public void test12()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      SupportingDocument supportingDocument1 = (SupportingDocument)supportingDocument0.clone();
      assertEquals("0", supportingDocument1.getDisplayItemIdentifier());
  }
}

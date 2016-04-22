/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 20 09:18:13 GMT 2015
 */

package org.pdfsam.guiclient.commons.models;

import static org.junit.Assert.*;
import org.junit.Test;
import edu.stanford.nlp.util.HashIndex;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.junit.runner.RunWith;
import org.pdfsam.guiclient.commons.models.VisualListModel;
import org.pdfsam.guiclient.dto.VisualPageListItem;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class VisualListModel_ESTest extends VisualListModel_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.getValidElements()Ljava/util/List;: I18 Branch 67 IFLE L432 - false
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.getValidElements()Ljava/util/List;: I40 Branch 68 IF_ICMPGE L434 - false
   */

  @Test
  public void test00()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.addElement((VisualPageListItem) null);
      // Undeclared exception!
      try {
        List<VisualPageListItem> list0 = visualListModel0.getValidElements();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.getValidElements()Ljava/util/List;: I11 Branch 66 IFNULL L432 - false
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.getValidElements()Ljava/util/List;: I18 Branch 67 IFLE L432 - true
   */

  @Test
  public void test01()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      List<VisualPageListItem> list0 = visualListModel0.getValidElements();
      assertNull(list0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.getValidElements()Ljava/util/List;: I11 Branch 66 IFNULL L432 - true
   */

  @Test
  public void test02()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.data = null;
      List<VisualPageListItem> list0 = visualListModel0.getValidElements();
      assertNull(list0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.moveDownIndexes([I)V: I33 Branch 63 IF_ICMPGE L414 - true
   */

  @Test
  public void test03()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      VisualPageListItem[] visualPageListItemArray0 = new VisualPageListItem[5];
      visualListModel0.setData(visualPageListItemArray0);
      int[] intArray0 = new int[3];
      intArray0[2] = 1714;
      visualListModel0.moveDownIndexes(intArray0);
      assertEquals(5, visualListModel0.getSize());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.moveDownIndexes([I)V: I16 Branch 62 IF_ICMPGE L412 - true
   */

  @Test
  public void test04()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[3];
      visualListModel0.moveDownIndexes(intArray0);
      assertArrayEquals(new int[] {0, 0, 0}, intArray0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.moveDownIndex(I)V: I16 Branch 60 IF_ICMPGE L399 - false
   */

  @Test
  public void test05()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.addElement((VisualPageListItem) null);
      visualListModel0.addElement((VisualPageListItem) null);
      visualListModel0.moveDownIndex(0);
      assertEquals(2, visualListModel0.getSize());
  }

  //Test case number: 6
  /*
   * 2 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.moveDownIndex(I)V: I6 Branch 59 IFLT L399 - false
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.moveDownIndex(I)V: I16 Branch 60 IF_ICMPGE L399 - true
   */

  @Test
  public void test06()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.moveDownIndex(6889);
      assertEquals(0, visualListModel0.getSize());
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.moveDownIndex(I)V: I6 Branch 59 IFLT L399 - true
   */

  @Test
  public void test07()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.moveDownIndex((-4035));
      assertEquals(0, visualListModel0.getSize());
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.moveUpIndexes([I)V: I25 Branch 56 IFLE L381 - false
   */

  @Test
  public void test08()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[1];
      intArray0[0] = 385;
      visualListModel0.addElement((VisualPageListItem) null);
      visualListModel0.addElement((VisualPageListItem) null);
      try {
        visualListModel0.moveUpIndexes(intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 384
         //
      }
  }

  //Test case number: 9
  /*
   * 2 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.moveUpIndexes([I)V: I16 Branch 55 IF_ICMPGE L379 - false
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.moveUpIndexes([I)V: I25 Branch 56 IFLE L381 - true
   */

  @Test
  public void test09()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[1];
      visualListModel0.addElement((VisualPageListItem) null);
      visualListModel0.addElement((VisualPageListItem) null);
      visualListModel0.moveUpIndexes(intArray0);
      assertArrayEquals(new int[] {0}, intArray0);
  }

  //Test case number: 10
  /*
   * 2 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.moveUpIndexes([I)V: I7 Branch 54 IFLE L379 - false
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.moveUpIndexes([I)V: I16 Branch 55 IF_ICMPGE L379 - true
   */

  @Test
  public void test10()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[3];
      visualListModel0.moveUpIndexes(intArray0);
      assertEquals(0, visualListModel0.getSize());
  }

  //Test case number: 11
  /*
   * 2 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.moveUpIndex(I)V: I7 Branch 52 IF_ICMPLT L366 - false
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.moveUpIndex(I)V: I15 Branch 53 IF_ICMPGE L366 - true
   */

  @Test
  public void test11()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.moveUpIndex(86);
      assertEquals(0, visualListModel0.getSize());
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.moveUpIndex(I)V: I7 Branch 52 IF_ICMPLT L366 - true
   */

  @Test
  public void test12()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.moveUpIndex((-969));
      assertEquals(0, visualListModel0.getSize());
  }

  //Test case number: 13
  /*
   * 2 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.rotateAnticlockwiseElements([I)V: I16 Branch 50 IF_ICMPGT L352 - false
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.rotateAnticlockwiseElements([I)V: I28 Branch 51 IF_ICMPGE L353 - false
   */

  @Test
  public void test13()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[1];
      visualListModel0.addElement((VisualPageListItem) null);
      // Undeclared exception!
      try {
        visualListModel0.rotateAnticlockwiseElements(intArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 14
  /*
   * 2 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.rotateAnticlockwiseElements([I)V: I7 Branch 49 IFLE L352 - false
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.rotateAnticlockwiseElements([I)V: I16 Branch 50 IF_ICMPGT L352 - true
   */

  @Test
  public void test14()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[10];
      visualListModel0.rotateAnticlockwiseElements(intArray0);
      assertEquals(0, visualListModel0.getSize());
  }

  //Test case number: 15
  /*
   * 2 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.rotateClockwiseElements([I)V: I16 Branch 47 IF_ICMPGT L337 - false
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.rotateClockwiseElements([I)V: I28 Branch 48 IF_ICMPGE L338 - false
   */

  @Test
  public void test15()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[1];
      visualListModel0.addElement((VisualPageListItem) null);
      // Undeclared exception!
      try {
        visualListModel0.rotateClockwiseElements(intArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 16
  /*
   * 2 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.rotateClockwiseElements([I)V: I7 Branch 46 IFLE L337 - false
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.rotateClockwiseElements([I)V: I16 Branch 47 IF_ICMPGT L337 - true
   */

  @Test
  public void test16()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[2];
      visualListModel0.rotateClockwiseElements(intArray0);
      assertEquals(0, visualListModel0.getSize());
  }

  //Test case number: 17
  /*
   * 5 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.reverseElements([I)V: I16 Branch 43 IF_ICMPGT L319 - false
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.reverseElements([I)V: I37 Branch 44 IF_ICMPGE L321 - true
   * Goal 3. org.pdfsam.guiclient.commons.models.VisualListModel.reverseElements([I)V: I37 Branch 44 IF_ICMPGE L321 - false
   * Goal 4. org.pdfsam.guiclient.commons.models.VisualListModel.reverseElements([I)V: I71 Branch 45 IF_ICMPGE L325 - true
   * Goal 5. org.pdfsam.guiclient.commons.models.VisualListModel.reverseElements([I)V: I71 Branch 45 IF_ICMPGE L325 - false
   */

  @Test
  public void test17()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[1];
      visualListModel0.addElement((VisualPageListItem) null);
      visualListModel0.reverseElements(intArray0);
      assertArrayEquals(new int[] {0}, intArray0);
  }

  //Test case number: 18
  /*
   * 2 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.reverseElements([I)V: I7 Branch 42 IFLE L319 - false
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.reverseElements([I)V: I16 Branch 43 IF_ICMPGT L319 - true
   */

  @Test
  public void test18()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[5];
      visualListModel0.reverseElements(intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0}, intArray0);
  }

  //Test case number: 19
  /*
   * 2 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.undeleteElements([I)V: I16 Branch 40 IF_ICMPGT L305 - false
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.undeleteElements([I)V: I28 Branch 41 IF_ICMPGE L306 - false
   */

  @Test
  public void test19()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[1];
      visualListModel0.addElement((VisualPageListItem) null);
      // Undeclared exception!
      try {
        visualListModel0.undeleteElements(intArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 20
  /*
   * 2 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.undeleteElements([I)V: I7 Branch 39 IFLE L305 - false
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.undeleteElements([I)V: I16 Branch 40 IF_ICMPGT L305 - true
   */

  @Test
  public void test20()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[2];
      visualListModel0.undeleteElements(intArray0);
      assertArrayEquals(new int[] {0, 0}, intArray0);
  }

  //Test case number: 21
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.elementChanged(Lorg/pdfsam/guiclient/dto/VisualPageListItem;)V: I6 Branch 36 IFNULL L284 - true
   */

  @Test
  public void test21()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.elementChanged((VisualPageListItem) null);
      assertEquals(0, visualListModel0.getSize());
  }

  //Test case number: 22
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.updateElementAt(ILorg/pdfsam/guiclient/dto/VisualPageListItem;)V: I6 Branch 33 IFNULL L273 - true
   */

  @Test
  public void test22()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.updateElementAt((-375), (VisualPageListItem) null);
      assertEquals(0, visualListModel0.getSize());
  }

  //Test case number: 23
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.getElements()[Lorg/pdfsam/guiclient/dto/VisualPageListItem;: I11 Branch 32 IFNULL L261 - true
   */

  @Test
  public void test23()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.data = null;
      VisualPageListItem[] visualPageListItemArray0 = visualListModel0.getElements();
      assertNull(visualPageListItemArray0);
  }

  //Test case number: 24
  /*
   * 2 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.subList(IIZ)Ljava/util/Collection;: I46 Branch 30 IFLE L240 - false
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.subList(IIZ)Ljava/util/Collection;: I66 Branch 31 IFEQ L242 - false
   */

  @Test
  public void test24()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.addElement((VisualPageListItem) null);
      // Undeclared exception!
      try {
        Collection<VisualPageListItem> collection0 = visualListModel0.subList(0, 1, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 25
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.subList(IIZ)Ljava/util/Collection;: I25 Branch 28 IFEQ L238 - true
   */

  @Test
  public void test25()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Collection<VisualPageListItem> collection0 = visualListModel0.subList(0, 0, false);
      assertNotNull(collection0);
  }

  //Test case number: 26
  /*
   * 4 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.subList(IIZ)Ljava/util/Collection;: I18 Branch 27 IF_ICMPGT L237 - false
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.subList(IIZ)Ljava/util/Collection;: I25 Branch 28 IFEQ L238 - false
   * Goal 3. org.pdfsam.guiclient.commons.models.VisualListModel.subList(IIZ)Ljava/util/Collection;: I40 Branch 29 IFNULL L240 - false
   * Goal 4. org.pdfsam.guiclient.commons.models.VisualListModel.subList(IIZ)Ljava/util/Collection;: I46 Branch 30 IFLE L240 - true
   */

  @Test
  public void test26()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Collection<VisualPageListItem> collection0 = visualListModel0.subList(0, 0, true);
      assertNotNull(collection0);
  }

  //Test case number: 27
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.subList(IIZ)Ljava/util/Collection;: I10 Branch 26 IFLT L237 - true
   */

  @Test
  public void test27()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Collection<VisualPageListItem> collection0 = visualListModel0.subList((-6169), 2572, true);
      assertNull(collection0);
  }

  //Test case number: 28
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.addAllElements(ILjava/util/Collection;)V: I35 Branch 25 IFEQ L209 - false
   */

  @Test
  public void test28()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Vector<VisualPageListItem> vector0 = visualListModel0.data;
      boolean boolean0 = vector0.add((VisualPageListItem) null);
      // Undeclared exception!
      try {
        visualListModel0.addAllElements(0, (Collection<VisualPageListItem>) vector0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 29
  /*
   * 2 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.addAllElements(ILjava/util/Collection;)V: I19 Branch 24 IF_ICMPGT L207 - false
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.addAllElements(ILjava/util/Collection;)V: I35 Branch 25 IFEQ L209 - true
   */

  @Test
  public void test29()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      HashIndex<VisualPageListItem> hashIndex0 = new HashIndex<VisualPageListItem>(4318);
      visualListModel0.addAllElements(0, (Collection<VisualPageListItem>) hashIndex0);
      assertEquals(0, visualListModel0.getSize());
  }

  //Test case number: 30
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.addAllElements(ILjava/util/Collection;)V: I11 Branch 23 IFLT L207 - true
   */

  @Test
  public void test30()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      ArrayList<VisualPageListItem> arrayList0 = new ArrayList<VisualPageListItem>();
      visualListModel0.addAllElements((-655), (Collection<VisualPageListItem>) arrayList0);
      assertEquals(0, arrayList0.size());
  }

  //Test case number: 31
  /*
   * 3 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.addAllElements(ILjava/util/Collection;)V: I6 Branch 22 IFNULL L207 - false
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.addAllElements(ILjava/util/Collection;)V: I11 Branch 23 IFLT L207 - false
   * Goal 3. org.pdfsam.guiclient.commons.models.VisualListModel.addAllElements(ILjava/util/Collection;)V: I19 Branch 24 IF_ICMPGT L207 - true
   */

  @Test
  public void test31()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      ArrayList<VisualPageListItem> arrayList0 = new ArrayList<VisualPageListItem>();
      visualListModel0.addAllElements(1060, (Collection<VisualPageListItem>) arrayList0);
      assertEquals(0, visualListModel0.getSize());
  }

  //Test case number: 32
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.addAllElements(ILjava/util/Collection;)V: I6 Branch 22 IFNULL L207 - true
   */

  @Test
  public void test32()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.addAllElements(909, (Collection<VisualPageListItem>) null);
      assertEquals(0, visualListModel0.getSize());
  }

  //Test case number: 33
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.prependAllElements(Ljava/util/Collection;)V: I12 Branch 21 IFLE L195 - false
   */

  @Test
  public void test33()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Vector<VisualPageListItem> vector0 = visualListModel0.data;
      boolean boolean0 = vector0.add((VisualPageListItem) null);
      visualListModel0.prependAllElements((Collection<VisualPageListItem>) vector0);
      assertEquals(2, visualListModel0.getSize());
  }

  //Test case number: 34
  /*
   * 2 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.prependAllElements(Ljava/util/Collection;)V: I6 Branch 20 IFNULL L195 - false
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.prependAllElements(Ljava/util/Collection;)V: I12 Branch 21 IFLE L195 - true
   */

  @Test
  public void test34()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Vector<VisualPageListItem> vector0 = visualListModel0.data;
      visualListModel0.prependAllElements((Collection<VisualPageListItem>) vector0);
      assertEquals(0, vector0.size());
  }

  //Test case number: 35
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.prependAllElements(Ljava/util/Collection;)V: I6 Branch 20 IFNULL L195 - true
   */

  @Test
  public void test35()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.prependAllElements((Collection<VisualPageListItem>) null);
      assertEquals(0, visualListModel0.getSize());
  }

  //Test case number: 36
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.addAllElements(Ljava/util/Collection;)V: I22 Branch 19 IFEQ L174 - false
   */

  @Test
  public void test36()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.addElement((VisualPageListItem) null);
      Vector<VisualPageListItem> vector0 = visualListModel0.data;
      // Undeclared exception!
      try {
        visualListModel0.appendAllElements((Collection<VisualPageListItem>) vector0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 37
  /*
   * 2 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.addAllElements(Ljava/util/Collection;)V: I6 Branch 18 IFNULL L172 - false
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.addAllElements(Ljava/util/Collection;)V: I22 Branch 19 IFEQ L174 - true
   */

  @Test
  public void test37()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      HashIndex<VisualPageListItem> hashIndex0 = new HashIndex<VisualPageListItem>(4318);
      visualListModel0.addAllElements((Collection<VisualPageListItem>) hashIndex0);
      assertEquals(0, hashIndex0.size());
  }

  //Test case number: 38
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.addElementAt(Lorg/pdfsam/guiclient/dto/VisualPageListItem;I)V: I6 Branch 17 IFNULL L151 - true
   */

  @Test
  public void test38()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.addElementAt((VisualPageListItem) null, 4318);
      assertEquals(0, visualListModel0.getSize());
  }

  //Test case number: 39
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.removeElements(IIZ)V: I52 Branch 16 IF_ICMPGE L137 - false
   */

  @Test
  public void test39()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      VisualPageListItem[] visualPageListItemArray0 = new VisualPageListItem[34];
      visualListModel0.setData(visualPageListItemArray0);
      // Undeclared exception!
      try {
        visualListModel0.removeElements(0, 2, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 40
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.removeElements(IIZ)V: I27 Branch 15 IFEQ L134 - false
   */

  @Test
  public void test40()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.addElement((VisualPageListItem) null);
      visualListModel0.removeElements(0, 0, true);
      assertEquals(0, visualListModel0.getSize());
  }

  //Test case number: 41
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.removeElements(IIZ)V: I20 Branch 14 IF_ICMPGT L133 - true
   */

  @Test
  public void test41()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.removeElements(6889, (-2568), true);
      assertEquals(0, visualListModel0.getSize());
  }

  //Test case number: 42
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.removeElements(IIZ)V: I14 Branch 13 IF_ICMPGE L133 - true
   */

  @Test
  public void test42()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.removeElements(0, 506, true);
      assertEquals(0, visualListModel0.getSize());
  }

  //Test case number: 43
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.removeElements(IIZ)V: I6 Branch 12 IFLT L133 - true
   */

  @Test
  public void test43()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.removeElements((-2568), 69, true);
      assertEquals(0, visualListModel0.getSize());
  }

  //Test case number: 44
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.removeElements([IZ)V: I23 Branch 10 IFEQ L113 - false
   */

  @Test
  public void test44()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[1];
      visualListModel0.addElement((VisualPageListItem) null);
      visualListModel0.removeElements(intArray0, true);
      assertEquals(0, visualListModel0.getSize());
  }

  //Test case number: 45
  /*
   * 3 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.removeElements([IZ)V: I16 Branch 9 IF_ICMPGT L112 - false
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.removeElements([IZ)V: I23 Branch 10 IFEQ L113 - true
   * Goal 3. org.pdfsam.guiclient.commons.models.VisualListModel.removeElements([IZ)V: I56 Branch 11 IF_ICMPGE L116 - false
   */

  @Test
  public void test45()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[1];
      visualListModel0.addElement((VisualPageListItem) null);
      // Undeclared exception!
      try {
        visualListModel0.removeElements(intArray0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 46
  /*
   * 2 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.removeElements([IZ)V: I7 Branch 8 IFLE L112 - false
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.removeElements([IZ)V: I16 Branch 9 IF_ICMPGT L112 - true
   */

  @Test
  public void test46()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[3];
      visualListModel0.removeElements(intArray0, false);
      assertEquals(0, visualListModel0.getSize());
  }

  //Test case number: 47
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.removeElementAt(IZ)V: I6 Branch 7 IFEQ L96 - false
   */

  @Test
  public void test47()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      // Undeclared exception!
      try {
        visualListModel0.removeElementAt((-283), true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -283
         //
      }
  }

  //Test case number: 48
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.removeElementAt(IZ)V: I6 Branch 7 IFEQ L96 - true
   */

  @Test
  public void test48()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      // Undeclared exception!
      try {
        visualListModel0.removeElementAt((-22), false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -22
         //
      }
  }

  //Test case number: 49
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.clearData()V: I17 Branch 6 IFLE L85 - false
   */

  @Test
  public void test49()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Vector<VisualPageListItem> vector0 = visualListModel0.data;
      boolean boolean0 = vector0.add((VisualPageListItem) null);
      visualListModel0.clearData();
      assertEquals(0, visualListModel0.getSize());
  }

  //Test case number: 50
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.setData(Ljava/util/Vector;)V: I15 Branch 5 IFLE L74 - true
   */

  @Test
  public void test50()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Vector<VisualPageListItem> vector0 = new Vector<VisualPageListItem>();
      visualListModel0.setData(vector0);
      assertEquals(10, vector0.capacity());
  }

  //Test case number: 51
  /*
   * 9 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.setData([Lorg/pdfsam/guiclient/dto/VisualPageListItem;)V: I15 Branch 3 IFLE L59 - false
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.setData([Lorg/pdfsam/guiclient/dto/VisualPageListItem;)V: I26 Branch 4 IF_ICMPGE L60 - true
   * Goal 3. org.pdfsam.guiclient.commons.models.VisualListModel.setData([Lorg/pdfsam/guiclient/dto/VisualPageListItem;)V: I26 Branch 4 IF_ICMPGE L60 - false
   * Goal 4. org.pdfsam.guiclient.commons.models.VisualListModel.moveDownIndexes([I)V: I7 Branch 61 IFLE L412 - false
   * Goal 5. org.pdfsam.guiclient.commons.models.VisualListModel.moveDownIndexes([I)V: I16 Branch 62 IF_ICMPGE L412 - false
   * Goal 6. org.pdfsam.guiclient.commons.models.VisualListModel.moveDownIndexes([I)V: I33 Branch 63 IF_ICMPGE L414 - false
   * Goal 7. org.pdfsam.guiclient.commons.models.VisualListModel.moveDownIndexes([I)V: I61 Branch 64 IFLT L416 - true
   * Goal 8. org.pdfsam.guiclient.commons.models.VisualListModel.moveDownIndexes([I)V: I61 Branch 64 IFLT L416 - false
   * Goal 9. org.pdfsam.guiclient.commons.models.VisualListModel.moveDownIndexes([I)V: I78 Branch 65 IF_ICMPGE L417 - false
   */

  @Test
  public void test51()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      VisualPageListItem[] visualPageListItemArray0 = new VisualPageListItem[5];
      visualListModel0.setData(visualPageListItemArray0);
      int[] intArray0 = new int[3];
      visualListModel0.moveDownIndexes(intArray0);
      assertEquals(5, visualListModel0.getSize());
  }

  //Test case number: 52
  /*
   * 3 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.setData([Lorg/pdfsam/guiclient/dto/VisualPageListItem;)V: I15 Branch 3 IFLE L59 - true
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.clearData()V: I17 Branch 6 IFLE L85 - true
   * Goal 3. org.pdfsam.guiclient.commons.models.VisualListModel.getElements()[Lorg/pdfsam/guiclient/dto/VisualPageListItem;: I11 Branch 32 IFNULL L261 - false
   */

  @Test
  public void test52()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      VisualPageListItem[] visualPageListItemArray0 = visualListModel0.getElements();
      visualListModel0.setData(visualPageListItemArray0);
      assertEquals(0, visualListModel0.getSize());
  }

  //Test case number: 53
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.getSize()I: I7 Branch 2 IFNULL L49 - false
   */

  @Test
  public void test53()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int int0 = visualListModel0.getSize();
      assertEquals(0, int0);
  }

  //Test case number: 54
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.getSize()I: I7 Branch 2 IFNULL L49 - true
   */

  @Test
  public void test54()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.data = null;
      int int0 = visualListModel0.getSize();
      assertEquals(0, int0);
  }

  //Test case number: 55
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.getElementAt(I)Ljava/lang/Object;: I13 Branch 1 IF_ICMPGE L39 - false
   */

  @Test
  public void test55()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      // Undeclared exception!
      try {
        Object object0 = visualListModel0.getElementAt((-1290));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1290
         //
      }
  }

  //Test case number: 56
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.getElementAt(I)Ljava/lang/Object;: I13 Branch 1 IF_ICMPGE L39 - true
   */

  @Test
  public void test56()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Object object0 = visualListModel0.getElementAt(3956);
      assertNull(object0);
  }

  //Test case number: 57
  /*
   * 3 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.subList(II)Ljava/util/Collection;: root-Branch
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.subList(IIZ)Ljava/util/Collection;: I10 Branch 26 IFLT L237 - false
   * Goal 3. org.pdfsam.guiclient.commons.models.VisualListModel.subList(IIZ)Ljava/util/Collection;: I18 Branch 27 IF_ICMPGT L237 - true
   */

  @Test
  public void test57()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Collection<VisualPageListItem> collection0 = visualListModel0.subList(1626, 1857);
      assertNull(collection0);
  }

  //Test case number: 58
  /*
   * 2 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.appendAllElements(Ljava/util/Collection;)V: root-Branch
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.addAllElements(Ljava/util/Collection;)V: I6 Branch 18 IFNULL L172 - true
   */

  @Test
  public void test58()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.appendAllElements((Collection<VisualPageListItem>) null);
      assertEquals(0, visualListModel0.getSize());
  }

  //Test case number: 59
  /*
   * 6 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.addElement(Lorg/pdfsam/guiclient/dto/VisualPageListItem;)V: root-Branch
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.removeElements(IIZ)V: I6 Branch 12 IFLT L133 - false
   * Goal 3. org.pdfsam.guiclient.commons.models.VisualListModel.removeElements(IIZ)V: I14 Branch 13 IF_ICMPGE L133 - false
   * Goal 4. org.pdfsam.guiclient.commons.models.VisualListModel.removeElements(IIZ)V: I20 Branch 14 IF_ICMPGT L133 - false
   * Goal 5. org.pdfsam.guiclient.commons.models.VisualListModel.removeElements(IIZ)V: I27 Branch 15 IFEQ L134 - true
   * Goal 6. org.pdfsam.guiclient.commons.models.VisualListModel.removeElements(IIZ)V: I52 Branch 16 IF_ICMPGE L137 - true
   */

  @Test
  public void test59()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.addElement((VisualPageListItem) null);
      visualListModel0.removeElements(0, 0, false);
      assertEquals(1, visualListModel0.getSize());
  }

  //Test case number: 60
  /*
   * 2 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.elementsChanged()V: root-Branch
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.<init>()V: root-Branch
   */

  @Test
  public void test60()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.elementsChanged();
      assertEquals(0, visualListModel0.getSize());
  }
}

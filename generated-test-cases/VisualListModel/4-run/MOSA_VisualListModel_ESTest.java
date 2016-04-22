/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 20 09:23:53 GMT 2015
 */

package org.pdfsam.guiclient.commons.models;

import static org.junit.Assert.*;
import org.junit.Test;
import edu.stanford.nlp.util.DeltaIndex;
import edu.stanford.nlp.util.HashIndex;
import edu.stanford.nlp.util.Index;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
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
      int[] intArray0 = new int[7];
      intArray0[6] = 7726;
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(2691, 0);
      Vector vector0 = defaultTableModel0.getDataVector();
      visualListModel0.data = vector0;
      visualListModel0.moveDownIndexes(intArray0);
  }

  //Test case number: 4
  /*
   * 5 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.moveDownIndexes([I)V: I16 Branch 62 IF_ICMPGE L412 - false
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.moveDownIndexes([I)V: I33 Branch 63 IF_ICMPGE L414 - false
   * Goal 3. org.pdfsam.guiclient.commons.models.VisualListModel.moveDownIndexes([I)V: I61 Branch 64 IFLT L416 - true
   * Goal 4. org.pdfsam.guiclient.commons.models.VisualListModel.moveDownIndexes([I)V: I61 Branch 64 IFLT L416 - false
   * Goal 5. org.pdfsam.guiclient.commons.models.VisualListModel.moveDownIndexes([I)V: I78 Branch 65 IF_ICMPGE L417 - false
   */

  @Test
  public void test04()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      VisualPageListItem[] visualPageListItemArray0 = new VisualPageListItem[7];
      visualListModel0.setData(visualPageListItemArray0);
      int[] intArray0 = new int[3];
      visualListModel0.moveDownIndexes(intArray0);
      assertEquals(7, visualListModel0.getSize());
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.moveDownIndexes([I)V: I7 Branch 61 IFLE L412 - false
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.moveDownIndexes([I)V: I16 Branch 62 IF_ICMPGE L412 - true
   */

  @Test
  public void test05()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[8];
      visualListModel0.moveDownIndexes(intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.moveDownIndex(I)V: I16 Branch 60 IF_ICMPGE L399 - false
   */

  @Test
  public void test06()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      VisualPageListItem[] visualPageListItemArray0 = new VisualPageListItem[7];
      visualListModel0.setData(visualPageListItemArray0);
      visualListModel0.moveDownIndex(0);
      assertEquals(7, visualListModel0.getSize());
  }

  //Test case number: 7
  /*
   * 2 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.moveDownIndex(I)V: I6 Branch 59 IFLT L399 - false
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.moveDownIndex(I)V: I16 Branch 60 IF_ICMPGE L399 - true
   */

  @Test
  public void test07()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.moveDownIndex(2811);
      assertEquals(0, visualListModel0.getSize());
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.moveDownIndex(I)V: I6 Branch 59 IFLT L399 - true
   */

  @Test
  public void test08()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.moveDownIndex((-2484));
      assertEquals(0, visualListModel0.getSize());
  }

  //Test case number: 9
  /*
   * 5 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.moveUpIndexes([I)V: I25 Branch 56 IFLE L381 - false
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.moveUpIndexes([I)V: I49 Branch 57 IF_ICMPGE L383 - true
   * Goal 3. org.pdfsam.guiclient.commons.models.VisualListModel.moveUpIndexes([I)V: I49 Branch 57 IF_ICMPGE L383 - false
   * Goal 4. org.pdfsam.guiclient.commons.models.VisualListModel.moveUpIndexes([I)V: I58 Branch 58 IFLE L384 - true
   * Goal 5. org.pdfsam.guiclient.commons.models.VisualListModel.moveUpIndexes([I)V: I58 Branch 58 IFLE L384 - false
   */

  @Test
  public void test09()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[4];
      intArray0[0] = 4;
      VisualPageListItem[] visualPageListItemArray0 = new VisualPageListItem[8];
      visualListModel0.setData(visualPageListItemArray0);
      visualListModel0.moveUpIndexes(intArray0);
      assertEquals(8, visualListModel0.getSize());
  }

  //Test case number: 10
  /*
   * 2 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.moveUpIndexes([I)V: I16 Branch 55 IF_ICMPGE L379 - false
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.moveUpIndexes([I)V: I25 Branch 56 IFLE L381 - true
   */

  @Test
  public void test10()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[4];
      VisualPageListItem[] visualPageListItemArray0 = new VisualPageListItem[6];
      visualListModel0.setData(visualPageListItemArray0);
      visualListModel0.moveUpIndexes(intArray0);
      assertEquals(6, visualListModel0.getSize());
  }

  //Test case number: 11
  /*
   * 2 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.moveUpIndexes([I)V: I7 Branch 54 IFLE L379 - false
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.moveUpIndexes([I)V: I16 Branch 55 IF_ICMPGE L379 - true
   */

  @Test
  public void test11()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[6];
      visualListModel0.moveUpIndexes(intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0}, intArray0);
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.moveUpIndex(I)V: I15 Branch 53 IF_ICMPGE L366 - false
   */

  @Test
  public void test12()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      VisualPageListItem[] visualPageListItemArray0 = new VisualPageListItem[32];
      visualListModel0.setData(visualPageListItemArray0);
      visualListModel0.moveUpIndex(11);
      assertEquals(32, visualListModel0.getSize());
  }

  //Test case number: 13
  /*
   * 2 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.moveUpIndex(I)V: I7 Branch 52 IF_ICMPLT L366 - false
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.moveUpIndex(I)V: I15 Branch 53 IF_ICMPGE L366 - true
   */

  @Test
  public void test13()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.moveUpIndex(11);
      assertEquals(0, visualListModel0.getSize());
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.moveUpIndex(I)V: I7 Branch 52 IF_ICMPLT L366 - true
   */

  @Test
  public void test14()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.moveUpIndex((-33));
      assertEquals(0, visualListModel0.getSize());
  }

  //Test case number: 15
  /*
   * 2 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.rotateAnticlockwiseElements([I)V: I16 Branch 50 IF_ICMPGT L352 - false
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.rotateAnticlockwiseElements([I)V: I28 Branch 51 IF_ICMPGE L353 - false
   */

  @Test
  public void test15()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[7];
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(2691, 0);
      Vector vector0 = defaultTableModel0.getDataVector();
      visualListModel0.data = vector0;
      // Undeclared exception!
      try {
        visualListModel0.rotateAnticlockwiseElements(intArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.Vector cannot be cast to org.pdfsam.guiclient.dto.VisualPageListItem
         //
      }
  }

  //Test case number: 16
  /*
   * 2 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.rotateAnticlockwiseElements([I)V: I7 Branch 49 IFLE L352 - false
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.rotateAnticlockwiseElements([I)V: I16 Branch 50 IF_ICMPGT L352 - true
   */

  @Test
  public void test16()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[8];
      visualListModel0.rotateAnticlockwiseElements(intArray0);
      assertEquals(0, visualListModel0.getSize());
  }

  //Test case number: 17
  /*
   * 2 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.rotateClockwiseElements([I)V: I16 Branch 47 IF_ICMPGT L337 - false
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.rotateClockwiseElements([I)V: I28 Branch 48 IF_ICMPGE L338 - false
   */

  @Test
  public void test17()  throws Throwable  {
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

  //Test case number: 18
  /*
   * 2 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.rotateClockwiseElements([I)V: I7 Branch 46 IFLE L337 - false
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.rotateClockwiseElements([I)V: I16 Branch 47 IF_ICMPGT L337 - true
   */

  @Test
  public void test18()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[6];
      visualListModel0.rotateClockwiseElements(intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0}, intArray0);
  }

  //Test case number: 19
  /*
   * 5 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.reverseElements([I)V: I16 Branch 43 IF_ICMPGT L319 - false
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.reverseElements([I)V: I37 Branch 44 IF_ICMPGE L321 - true
   * Goal 3. org.pdfsam.guiclient.commons.models.VisualListModel.reverseElements([I)V: I37 Branch 44 IF_ICMPGE L321 - false
   * Goal 4. org.pdfsam.guiclient.commons.models.VisualListModel.reverseElements([I)V: I71 Branch 45 IF_ICMPGE L325 - true
   * Goal 5. org.pdfsam.guiclient.commons.models.VisualListModel.reverseElements([I)V: I71 Branch 45 IF_ICMPGE L325 - false
   */

  @Test
  public void test19()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      VisualPageListItem[] visualPageListItemArray0 = new VisualPageListItem[7];
      visualListModel0.setData(visualPageListItemArray0);
      int[] intArray0 = new int[7];
      visualListModel0.reverseElements(intArray0);
      assertEquals(7, visualListModel0.getSize());
  }

  //Test case number: 20
  /*
   * 2 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.reverseElements([I)V: I7 Branch 42 IFLE L319 - false
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.reverseElements([I)V: I16 Branch 43 IF_ICMPGT L319 - true
   */

  @Test
  public void test20()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[8];
      visualListModel0.reverseElements(intArray0);
      assertEquals(0, visualListModel0.getSize());
  }

  //Test case number: 21
  /*
   * 2 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.undeleteElements([I)V: I16 Branch 40 IF_ICMPGT L305 - false
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.undeleteElements([I)V: I28 Branch 41 IF_ICMPGE L306 - false
   */

  @Test
  public void test21()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      VisualPageListItem[] visualPageListItemArray0 = new VisualPageListItem[7];
      visualListModel0.setData(visualPageListItemArray0);
      int[] intArray0 = new int[7];
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

  //Test case number: 22
  /*
   * 2 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.undeleteElements([I)V: I7 Branch 39 IFLE L305 - false
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.undeleteElements([I)V: I16 Branch 40 IF_ICMPGT L305 - true
   */

  @Test
  public void test22()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[8];
      visualListModel0.undeleteElements(intArray0);
      assertEquals(0, visualListModel0.getSize());
  }

  //Test case number: 23
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.elementChanged(Lorg/pdfsam/guiclient/dto/VisualPageListItem;)V: I6 Branch 36 IFNULL L284 - true
   */

  @Test
  public void test23()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.elementChanged((VisualPageListItem) null);
      assertEquals(0, visualListModel0.getSize());
  }

  //Test case number: 24
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.updateElementAt(ILorg/pdfsam/guiclient/dto/VisualPageListItem;)V: I6 Branch 33 IFNULL L273 - true
   */

  @Test
  public void test24()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.updateElementAt(0, (VisualPageListItem) null);
      assertEquals(0, visualListModel0.getSize());
  }

  //Test case number: 25
  /*
   * 3 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.subList(IIZ)Ljava/util/Collection;: I25 Branch 28 IFEQ L238 - false
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.subList(IIZ)Ljava/util/Collection;: I40 Branch 29 IFNULL L240 - false
   * Goal 3. org.pdfsam.guiclient.commons.models.VisualListModel.subList(IIZ)Ljava/util/Collection;: I46 Branch 30 IFLE L240 - true
   */

  @Test
  public void test25()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Collection<VisualPageListItem> collection0 = visualListModel0.subList(0, 0, true);
      assertNotNull(collection0);
  }

  //Test case number: 26
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.subList(IIZ)Ljava/util/Collection;: I18 Branch 27 IF_ICMPGT L237 - true
   */

  @Test
  public void test26()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Collection<VisualPageListItem> collection0 = visualListModel0.subList(0, 497);
      assertNull(collection0);
  }

  //Test case number: 27
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.subList(IIZ)Ljava/util/Collection;: I10 Branch 26 IFLT L237 - true
   */

  @Test
  public void test27()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Collection<VisualPageListItem> collection0 = visualListModel0.subList((-461), (-1861), false);
      assertNull(collection0);
  }

  //Test case number: 28
  /*
   * 3 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.addAllElements(ILjava/util/Collection;)V: I19 Branch 24 IF_ICMPGT L207 - false
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.addAllElements(ILjava/util/Collection;)V: I35 Branch 25 IFEQ L209 - true
   * Goal 3. org.pdfsam.guiclient.commons.models.VisualListModel.addAllElements(ILjava/util/Collection;)V: I35 Branch 25 IFEQ L209 - false
   */

  @Test
  public void test28()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      ArrayList<VisualPageListItem> arrayList0 = new ArrayList<VisualPageListItem>();
      boolean boolean0 = arrayList0.add((VisualPageListItem) null);
      HashIndex<VisualPageListItem> hashIndex0 = new HashIndex<VisualPageListItem>((Collection<? extends VisualPageListItem>) arrayList0);
      visualListModel0.addAllElements(0, (Collection<VisualPageListItem>) hashIndex0);
      assertEquals(1, visualListModel0.getSize());
  }

  //Test case number: 29
  /*
   * 2 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.addAllElements(ILjava/util/Collection;)V: I11 Branch 23 IFLT L207 - false
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.addAllElements(ILjava/util/Collection;)V: I19 Branch 24 IF_ICMPGT L207 - true
   */

  @Test
  public void test29()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      ArrayList<VisualPageListItem> arrayList0 = new ArrayList<VisualPageListItem>();
      visualListModel0.addAllElements(1954, (Collection<VisualPageListItem>) arrayList0);
      assertEquals(0, arrayList0.size());
  }

  //Test case number: 30
  /*
   * 2 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.addAllElements(ILjava/util/Collection;)V: I6 Branch 22 IFNULL L207 - false
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.addAllElements(ILjava/util/Collection;)V: I11 Branch 23 IFLT L207 - true
   */

  @Test
  public void test30()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      ArrayList<VisualPageListItem> arrayList0 = new ArrayList<VisualPageListItem>();
      visualListModel0.addAllElements((-1631), (Collection<VisualPageListItem>) arrayList0);
      assertTrue(arrayList0.isEmpty());
  }

  //Test case number: 31
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.addAllElements(ILjava/util/Collection;)V: I6 Branch 22 IFNULL L207 - true
   */

  @Test
  public void test31()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.addAllElements(1090, (Collection<VisualPageListItem>) null);
      assertEquals(0, visualListModel0.getSize());
  }

  //Test case number: 32
  /*
   * 2 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.prependAllElements(Ljava/util/Collection;)V: I6 Branch 20 IFNULL L195 - false
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.prependAllElements(Ljava/util/Collection;)V: I12 Branch 21 IFLE L195 - true
   */

  @Test
  public void test32()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Vector<VisualPageListItem> vector0 = new Vector<VisualPageListItem>();
      HashIndex<VisualPageListItem> hashIndex0 = new HashIndex<VisualPageListItem>((Collection<? extends VisualPageListItem>) vector0);
      DeltaIndex<VisualPageListItem> deltaIndex0 = new DeltaIndex<VisualPageListItem>((Index<VisualPageListItem>) hashIndex0, (Index<VisualPageListItem>) hashIndex0);
      visualListModel0.prependAllElements((Collection<VisualPageListItem>) deltaIndex0);
      assertEquals(0, visualListModel0.getSize());
  }

  //Test case number: 33
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.prependAllElements(Ljava/util/Collection;)V: I6 Branch 20 IFNULL L195 - true
   */

  @Test
  public void test33()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.prependAllElements((Collection<VisualPageListItem>) null);
      assertEquals(0, visualListModel0.getSize());
  }

  //Test case number: 34
  /*
   * 3 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.addAllElements(Ljava/util/Collection;)V: I6 Branch 18 IFNULL L172 - false
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.addAllElements(Ljava/util/Collection;)V: I22 Branch 19 IFEQ L174 - true
   * Goal 3. org.pdfsam.guiclient.commons.models.VisualListModel.addAllElements(Ljava/util/Collection;)V: I22 Branch 19 IFEQ L174 - false
   */

  @Test
  public void test34()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      ArrayList<VisualPageListItem> arrayList0 = new ArrayList<VisualPageListItem>();
      boolean boolean0 = arrayList0.add((VisualPageListItem) null);
      visualListModel0.appendAllElements((Collection<VisualPageListItem>) arrayList0);
      assertEquals(1, visualListModel0.getSize());
  }

  //Test case number: 35
  /*
   * 2 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.appendAllElements(Ljava/util/Collection;)V: root-Branch
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.addAllElements(Ljava/util/Collection;)V: I6 Branch 18 IFNULL L172 - true
   */

  @Test
  public void test35()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.appendAllElements((Collection<VisualPageListItem>) null);
      assertEquals(0, visualListModel0.getSize());
  }

  //Test case number: 36
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.addElementAt(Lorg/pdfsam/guiclient/dto/VisualPageListItem;I)V: I6 Branch 17 IFNULL L151 - true
   */

  @Test
  public void test36()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.addElementAt((VisualPageListItem) null, 0);
      assertEquals(0, visualListModel0.getSize());
  }

  //Test case number: 37
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.removeElements(IIZ)V: I27 Branch 15 IFEQ L134 - false
   */

  @Test
  public void test37()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      VisualPageListItem[] visualPageListItemArray0 = new VisualPageListItem[7];
      visualListModel0.setData(visualPageListItemArray0);
      visualListModel0.removeElements(0, 0, true);
      assertEquals(6, visualListModel0.getSize());
  }

  //Test case number: 38
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.removeElements(IIZ)V: I20 Branch 14 IF_ICMPGT L133 - true
   */

  @Test
  public void test38()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.removeElements(34, (-37), true);
      assertEquals(0, visualListModel0.getSize());
  }

  //Test case number: 39
  /*
   * 4 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.removeElements(IIZ)V: I14 Branch 13 IF_ICMPGE L133 - false
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.removeElements(IIZ)V: I20 Branch 14 IF_ICMPGT L133 - false
   * Goal 3. org.pdfsam.guiclient.commons.models.VisualListModel.removeElements(IIZ)V: I27 Branch 15 IFEQ L134 - true
   * Goal 4. org.pdfsam.guiclient.commons.models.VisualListModel.removeElements(IIZ)V: I52 Branch 16 IF_ICMPGE L137 - true
   */

  @Test
  public void test39()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      VisualPageListItem[] visualPageListItemArray0 = new VisualPageListItem[7];
      visualListModel0.setData(visualPageListItemArray0);
      visualListModel0.removeElements(0, 0, false);
      assertEquals(7, visualListModel0.getSize());
  }

  //Test case number: 40
  /*
   * 2 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.removeElements(IIZ)V: I6 Branch 12 IFLT L133 - false
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.removeElements(IIZ)V: I14 Branch 13 IF_ICMPGE L133 - true
   */

  @Test
  public void test40()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.removeElements(0, 0, false);
      assertEquals(0, visualListModel0.getSize());
  }

  //Test case number: 41
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.removeElements(IIZ)V: I6 Branch 12 IFLT L133 - true
   */

  @Test
  public void test41()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.removeElements((-862), 0, false);
      assertEquals(0, visualListModel0.getSize());
  }

  //Test case number: 42
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.removeElements([IZ)V: I23 Branch 10 IFEQ L113 - false
   */

  @Test
  public void test42()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[7];
      VisualPageListItem[] visualPageListItemArray0 = new VisualPageListItem[32];
      visualListModel0.setData(visualPageListItemArray0);
      visualListModel0.removeElements(intArray0, true);
      assertEquals(31, visualListModel0.getSize());
  }

  //Test case number: 43
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.removeElements([IZ)V: I16 Branch 9 IF_ICMPGT L112 - true
   */

  @Test
  public void test43()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[7];
      visualListModel0.removeElements(intArray0, true);
      assertEquals(0, visualListModel0.getSize());
  }

  //Test case number: 44
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.removeElementAt(IZ)V: I6 Branch 7 IFEQ L96 - false
   */

  @Test
  public void test44()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      // Undeclared exception!
      try {
        visualListModel0.removeElementAt(0, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 0
         //
      }
  }

  //Test case number: 45
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.removeElementAt(IZ)V: I6 Branch 7 IFEQ L96 - true
   */

  @Test
  public void test45()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      // Undeclared exception!
      try {
        visualListModel0.removeElementAt(2577, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 2577
         //
      }
  }

  //Test case number: 46
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.setData(Ljava/util/Vector;)V: I15 Branch 5 IFLE L74 - true
   */

  @Test
  public void test46()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Vector<VisualPageListItem> vector0 = new Vector<VisualPageListItem>();
      visualListModel0.setData(vector0);
      assertEquals(0, vector0.size());
  }

  //Test case number: 47
  /*
   * 7 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.setData([Lorg/pdfsam/guiclient/dto/VisualPageListItem;)V: I15 Branch 3 IFLE L59 - false
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.setData([Lorg/pdfsam/guiclient/dto/VisualPageListItem;)V: I26 Branch 4 IF_ICMPGE L60 - true
   * Goal 3. org.pdfsam.guiclient.commons.models.VisualListModel.setData([Lorg/pdfsam/guiclient/dto/VisualPageListItem;)V: I26 Branch 4 IF_ICMPGE L60 - false
   * Goal 4. org.pdfsam.guiclient.commons.models.VisualListModel.removeElements([IZ)V: I7 Branch 8 IFLE L112 - false
   * Goal 5. org.pdfsam.guiclient.commons.models.VisualListModel.removeElements([IZ)V: I16 Branch 9 IF_ICMPGT L112 - false
   * Goal 6. org.pdfsam.guiclient.commons.models.VisualListModel.removeElements([IZ)V: I23 Branch 10 IFEQ L113 - true
   * Goal 7. org.pdfsam.guiclient.commons.models.VisualListModel.removeElements([IZ)V: I56 Branch 11 IF_ICMPGE L116 - false
   */

  @Test
  public void test47()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      VisualPageListItem[] visualPageListItemArray0 = new VisualPageListItem[7];
      visualListModel0.setData(visualPageListItemArray0);
      int[] intArray0 = new int[7];
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

  //Test case number: 48
  /*
   * 3 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.setData([Lorg/pdfsam/guiclient/dto/VisualPageListItem;)V: I15 Branch 3 IFLE L59 - true
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.clearData()V: I17 Branch 6 IFLE L85 - true
   * Goal 3. org.pdfsam.guiclient.commons.models.VisualListModel.getElements()[Lorg/pdfsam/guiclient/dto/VisualPageListItem;: I11 Branch 32 IFNULL L261 - false
   */

  @Test
  public void test48()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      VisualPageListItem[] visualPageListItemArray0 = visualListModel0.getElements();
      visualListModel0.setData(visualPageListItemArray0);
      assertEquals(0, visualListModel0.getSize());
  }

  //Test case number: 49
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.getSize()I: I7 Branch 2 IFNULL L49 - false
   */

  @Test
  public void test49()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int int0 = visualListModel0.getSize();
      assertEquals(0, int0);
  }

  //Test case number: 50
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.getElementAt(I)Ljava/lang/Object;: I13 Branch 1 IF_ICMPGE L39 - false
   */

  @Test
  public void test50()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      // Undeclared exception!
      try {
        Object object0 = visualListModel0.getElementAt((-377));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 51
  /*
   * 1 covered goal:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.getElementAt(I)Ljava/lang/Object;: I13 Branch 1 IF_ICMPGE L39 - true
   */

  @Test
  public void test51()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Object object0 = visualListModel0.getElementAt(84);
      assertNull(object0);
  }

  //Test case number: 52
  /*
   * 4 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.subList(II)Ljava/util/Collection;: root-Branch
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.subList(IIZ)Ljava/util/Collection;: I10 Branch 26 IFLT L237 - false
   * Goal 3. org.pdfsam.guiclient.commons.models.VisualListModel.subList(IIZ)Ljava/util/Collection;: I18 Branch 27 IF_ICMPGT L237 - false
   * Goal 4. org.pdfsam.guiclient.commons.models.VisualListModel.subList(IIZ)Ljava/util/Collection;: I25 Branch 28 IFEQ L238 - true
   */

  @Test
  public void test52()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Collection<VisualPageListItem> collection0 = visualListModel0.subList(0, 0);
      assertNotNull(collection0);
  }

  //Test case number: 53
  /*
   * 2 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.addElement(Lorg/pdfsam/guiclient/dto/VisualPageListItem;)V: root-Branch
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.clearData()V: I17 Branch 6 IFLE L85 - false
   */

  @Test
  public void test53()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.addElement((VisualPageListItem) null);
      visualListModel0.clearData();
      assertEquals(0, visualListModel0.getSize());
  }

  //Test case number: 54
  /*
   * 2 covered goals:
   * Goal 1. org.pdfsam.guiclient.commons.models.VisualListModel.elementsChanged()V: root-Branch
   * Goal 2. org.pdfsam.guiclient.commons.models.VisualListModel.<init>()V: root-Branch
   */

  @Test
  public void test54()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.elementsChanged();
      assertEquals(0, visualListModel0.getSize());
  }
}

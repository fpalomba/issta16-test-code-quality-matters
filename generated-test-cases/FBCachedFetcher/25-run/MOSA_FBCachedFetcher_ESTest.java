/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 13 15:02:53 GMT 2015
 */

package org.firebirdsql.jdbc;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.firebirdsql.jdbc.FBCachedFetcher;
import org.firebirdsql.jdbc.FBObjectListener;
import org.firebirdsql.jdbc.FBSQLException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class FBCachedFetcher_ESTest extends FBCachedFetcher_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. org.firebirdsql.jdbc.FBCachedFetcher.updateRow([[B)V: I13 Branch 54 IFNE L328 - true
   */

  @Test
  public void test00()  throws Throwable  {
      ArrayList<byte[][]> arrayList0 = new ArrayList<byte[][]>();
      byte[][] byteArray0 = new byte[8][7];
      boolean boolean0 = arrayList0.add(byteArray0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(arrayList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.updateRow(byteArray0);
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * Goal 1. org.firebirdsql.jdbc.FBCachedFetcher.insertRow([[B)V: I16 Branch 50 IFNE L306 - false
   * Goal 2. org.firebirdsql.jdbc.FBCachedFetcher.insertRow([[B)V: I78 Branch 51 IFEQ L315 - true
   * Goal 3. org.firebirdsql.jdbc.FBCachedFetcher.insertRow([[B)V: I98 Branch 52 IFEQ L318 - true
   */

  @Test
  public void test01()  throws Throwable  {
      ArrayList<byte[][]> arrayList0 = new ArrayList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(arrayList0, (FBObjectListener.FetcherListener) null);
      byte[][] byteArray0 = new byte[8][7];
      // Undeclared exception!
      try {
        fBCachedFetcher0.insertRow(byteArray0);
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
   * Goal 1. org.firebirdsql.jdbc.FBCachedFetcher.isLast()Z: I16 Branch 45 IF_ICMPNE L273 - true
   */

  @Test
  public void test02()  throws Throwable  {
      ArrayList<byte[][]> arrayList0 = new ArrayList<byte[][]>();
      byte[][] byteArray0 = new byte[8][7];
      boolean boolean0 = arrayList0.add(byteArray0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(arrayList0, (FBObjectListener.FetcherListener) null);
      boolean boolean1 = fBCachedFetcher0.isLast();
      assertFalse(boolean1);
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * Goal 1. org.firebirdsql.jdbc.FBCachedFetcher.isLast()Z: I7 Branch 44 IFNULL L273 - false
   * Goal 2. org.firebirdsql.jdbc.FBCachedFetcher.isLast()Z: I16 Branch 45 IF_ICMPNE L273 - false
   */

  @Test
  public void test03()  throws Throwable  {
      ArrayList<byte[][]> arrayList0 = new ArrayList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(arrayList0, (FBObjectListener.FetcherListener) null);
      boolean boolean0 = fBCachedFetcher0.isLast();
      assertTrue(boolean0);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * Goal 1. org.firebirdsql.jdbc.FBCachedFetcher.isFirst()Z: I8 Branch 43 IF_ICMPNE L270 - true
   */

  @Test
  public void test04()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      boolean boolean0 = fBCachedFetcher0.isFirst();
      assertFalse(boolean0);
  }

  //Test case number: 5
  /*
   * 3 covered goals:
   * Goal 1. org.firebirdsql.jdbc.FBCachedFetcher.isBeforeFirst()Z: I7 Branch 41 IFNE L267 - true
   * Goal 2. org.firebirdsql.jdbc.FBCachedFetcher.updateRow([[B)V: I7 Branch 53 IFNE L328 - false
   * Goal 3. org.firebirdsql.jdbc.FBCachedFetcher.updateRow([[B)V: I13 Branch 54 IFNE L328 - false
   */

  @Test
  public void test05()  throws Throwable  {
      ArrayList<byte[][]> arrayList0 = new ArrayList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(arrayList0, (FBObjectListener.FetcherListener) null);
      byte[][] byteArray0 = new byte[1][7];
      // Undeclared exception!
      try {
        fBCachedFetcher0.updateRow(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
      }
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. org.firebirdsql.jdbc.FBCachedFetcher.absolute(IZ)Z: I105 Branch 35 IFEQ L208 - true
   */

  @Test
  public void test06()  throws Throwable  {
      ArrayList<byte[][]> arrayList0 = new ArrayList<byte[][]>();
      byte[][] byteArray0 = new byte[6][10];
      boolean boolean0 = arrayList0.add(byteArray0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(arrayList0, (FBObjectListener.FetcherListener) null);
      // Undeclared exception!
      try {
        boolean boolean1 = fBCachedFetcher0.last();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 7
  /*
   * 4 covered goals:
   * Goal 1. org.firebirdsql.jdbc.FBCachedFetcher.absolute(IZ)Z: I80 Branch 34 IFEQ L200 - true
   * Goal 2. org.firebirdsql.jdbc.FBCachedFetcher.absolute(IZ)Z: I105 Branch 35 IFEQ L208 - false
   * Goal 3. org.firebirdsql.jdbc.FBCachedFetcher.isBeforeFirst()Z: I14 Branch 42 IF_ICMPGE L267 - true
   * Goal 4. org.firebirdsql.jdbc.FBCachedFetcher.isAfterLast()Z: I10 Branch 46 IF_ICMPLE L276 - false
   */

  @Test
  public void test07()  throws Throwable  {
      ArrayList<byte[][]> arrayList0 = new ArrayList<byte[][]>();
      byte[][] byteArray0 = new byte[2][7];
      boolean boolean0 = arrayList0.add(byteArray0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(arrayList0, (FBObjectListener.FetcherListener) null);
      // Undeclared exception!
      try {
        boolean boolean1 = fBCachedFetcher0.absolute(601);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 8
  /*
   * 3 covered goals:
   * Goal 1. org.firebirdsql.jdbc.FBCachedFetcher.absolute(IZ)Z: I63 Branch 33 IFEQ L195 - true
   * Goal 2. org.firebirdsql.jdbc.FBCachedFetcher.absolute(IZ)Z: I80 Branch 34 IFEQ L200 - false
   * Goal 3. org.firebirdsql.jdbc.FBCachedFetcher.relative(I)Z: I7 Branch 38 IFEQ L238 - true
   */

  @Test
  public void test08()  throws Throwable  {
      ArrayList<byte[][]> arrayList0 = new ArrayList<byte[][]>();
      byte[][] byteArray0 = new byte[8][7];
      boolean boolean0 = arrayList0.add(byteArray0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(arrayList0, (FBObjectListener.FetcherListener) null);
      // Undeclared exception!
      try {
        boolean boolean1 = fBCachedFetcher0.relative(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * Goal 1. org.firebirdsql.jdbc.FBCachedFetcher.absolute(IZ)Z: I48 Branch 32 IFNE L191 - false
   */

  @Test
  public void test09()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      try {
        boolean boolean0 = fBCachedFetcher0.absolute(0);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // You cannot position to the row 0 with absolute() method.
         //
      }
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * Goal 1. org.firebirdsql.jdbc.FBCachedFetcher.absolute(I)Z: I7 Branch 27 IFEQ L175 - true
   */

  @Test
  public void test10()  throws Throwable  {
      ArrayList<byte[][]> arrayList0 = new ArrayList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(arrayList0, (FBObjectListener.FetcherListener) null);
      boolean boolean0 = fBCachedFetcher0.absolute(601);
      assertFalse(boolean0);
  }

  //Test case number: 11
  /*
   * 4 covered goals:
   * Goal 1. org.firebirdsql.jdbc.FBCachedFetcher.previous()Z: I22 Branch 25 IFEQ L156 - true
   * Goal 2. org.firebirdsql.jdbc.FBCachedFetcher.previous()Z: I42 Branch 26 IFEQ L161 - false
   * Goal 3. org.firebirdsql.jdbc.FBCachedFetcher.isBeforeFirst()Z: I7 Branch 41 IFNE L267 - false
   * Goal 4. org.firebirdsql.jdbc.FBCachedFetcher.isBeforeFirst()Z: I14 Branch 42 IF_ICMPGE L267 - false
   */

  @Test
  public void test11()  throws Throwable  {
      ArrayList<byte[][]> arrayList0 = new ArrayList<byte[][]>();
      byte[][] byteArray0 = new byte[6][2];
      boolean boolean0 = arrayList0.add(byteArray0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(arrayList0, (FBObjectListener.FetcherListener) null);
      // Undeclared exception!
      try {
        boolean boolean1 = fBCachedFetcher0.previous();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 12
  /*
   * 4 covered goals:
   * Goal 1. org.firebirdsql.jdbc.FBCachedFetcher.next()Z: I7 Branch 22 IFEQ L132 - true
   * Goal 2. org.firebirdsql.jdbc.FBCachedFetcher.next()Z: I27 Branch 23 IFEQ L137 - true
   * Goal 3. org.firebirdsql.jdbc.FBCachedFetcher.isEmpty()Z: I14 Branch 40 IFNE L264 - true
   * Goal 4. org.firebirdsql.jdbc.FBCachedFetcher.isAfterLast()Z: I10 Branch 46 IF_ICMPLE L276 - true
   */

  @Test
  public void test12()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[4][7];
      boolean boolean0 = linkedList0.add(byteArray0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      // Undeclared exception!
      try {
        boolean boolean1 = fBCachedFetcher0.next();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * Goal 1. org.firebirdsql.jdbc.FBCachedFetcher.setFetchSize(I)V: root-Branch
   */

  @Test
  public void test13()  throws Throwable  {
      ArrayList<byte[][]> arrayList0 = new ArrayList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(arrayList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.setFetchSize(1570);
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * Goal 1. org.firebirdsql.jdbc.FBCachedFetcher.getFetchSize()I: root-Branch
   */

  @Test
  public void test14()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      int int0 = fBCachedFetcher0.getFetchSize();
      assertEquals(0, int0);
  }

  //Test case number: 15
  /*
   * 6 covered goals:
   * Goal 1. org.firebirdsql.jdbc.FBCachedFetcher.beforeFirst()V: root-Branch
   * Goal 2. org.firebirdsql.jdbc.FBCachedFetcher.previous()Z: I7 Branch 24 IFEQ L152 - true
   * Goal 3. org.firebirdsql.jdbc.FBCachedFetcher.previous()Z: I22 Branch 25 IFEQ L156 - false
   * Goal 4. org.firebirdsql.jdbc.FBCachedFetcher.absolute(IZ)Z: I26 Branch 30 IFGE L188 - true
   * Goal 5. org.firebirdsql.jdbc.FBCachedFetcher.absolute(IZ)Z: I43 Branch 31 IFNE L191 - true
   * Goal 6. org.firebirdsql.jdbc.FBCachedFetcher.first()Z: I7 Branch 36 IFEQ L220 - true
   */

  @Test
  public void test15()  throws Throwable  {
      ArrayList<byte[][]> arrayList0 = new ArrayList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(arrayList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.beforeFirst();
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * Goal 1. org.firebirdsql.jdbc.FBCachedFetcher.getRowNum()I: root-Branch
   */

  @Test
  public void test16()  throws Throwable  {
      ArrayList<byte[][]> arrayList0 = new ArrayList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(arrayList0, (FBObjectListener.FetcherListener) null);
      int int0 = fBCachedFetcher0.getRowNum();
      assertEquals(0, int0);
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * Goal 1. org.firebirdsql.jdbc.FBCachedFetcher.close()V: root-Branch
   */

  @Test
  public void test17()  throws Throwable  {
      ArrayList<byte[][]> arrayList0 = new ArrayList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(arrayList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.close();
  }

  //Test case number: 18
  /*
   * 11 covered goals:
   * Goal 1. org.firebirdsql.jdbc.FBCachedFetcher.afterLast()V: root-Branch
   * Goal 2. org.firebirdsql.jdbc.FBCachedFetcher.<init>(Ljava/util/List;Lorg/firebirdsql/jdbc/FBObjectListener$FetcherListener;)V: root-Branch
   * Goal 3. org.firebirdsql.jdbc.FBCachedFetcher.next()Z: I7 Branch 22 IFEQ L132 - false
   * Goal 4. org.firebirdsql.jdbc.FBCachedFetcher.absolute(IZ)Z: I7 Branch 28 IFEQ L184 - true
   * Goal 5. org.firebirdsql.jdbc.FBCachedFetcher.absolute(IZ)Z: I26 Branch 30 IFGE L188 - false
   * Goal 6. org.firebirdsql.jdbc.FBCachedFetcher.absolute(IZ)Z: I43 Branch 31 IFNE L191 - false
   * Goal 7. org.firebirdsql.jdbc.FBCachedFetcher.absolute(IZ)Z: I48 Branch 32 IFNE L191 - true
   * Goal 8. org.firebirdsql.jdbc.FBCachedFetcher.absolute(IZ)Z: I63 Branch 33 IFEQ L195 - false
   * Goal 9. org.firebirdsql.jdbc.FBCachedFetcher.last()Z: I7 Branch 37 IFEQ L229 - true
   * Goal 10. org.firebirdsql.jdbc.FBCachedFetcher.isEmpty()Z: I7 Branch 39 IFNULL L264 - false
   * Goal 11. org.firebirdsql.jdbc.FBCachedFetcher.isEmpty()Z: I14 Branch 40 IFNE L264 - false
   */

  @Test
  public void test18()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.afterLast();
  }
}

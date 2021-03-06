/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 16 05:17:57 GMT 2015
 */

package org.jcvi.jillion.core.residue.nt;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.jcvi.jillion.core.Range;
import org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec;
import org.jcvi.jillion.core.residue.nt.Nucleotide;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DefaultNucleotideCodec_ESTest extends DefaultNucleotideCodec_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getGappedOffsetFor([BI)I: I36 Branch 25 IF_ACMPEQ L303 - false
   * Goal 2. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.next()Lorg/jcvi/jillion/core/residue/nt/Nucleotide;: I75 Branch 9 IFEQ L405 - true
   */

  @Test
  public void test00()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.Weak;
      Set<Nucleotide> set0 = nucleotide0.getBasesFor();
      assertNotNull(set0);
      assertFalse(set0.isEmpty());
      assertEquals(2, set0.size());
      
      byte[] byteArray0 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) set0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)2, (byte)30}, byteArray0);
      assertNotNull(byteArray0);
      assertFalse(set0.isEmpty());
      assertEquals(2, set0.size());
      
      int int0 = defaultNucleotideCodec0.getGappedOffsetFor(byteArray0, (-925));
      assertEquals(2, int0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)2, (byte)30}, byteArray0);
      assertFalse(set0.isEmpty());
      assertEquals(2, set0.size());
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getNumberOfGaps([B)I: I17 Branch 20 IFEQ L262 - false
   * Goal 2. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getNumberOfGaps([B)I: I26 Branch 21 IF_ACMPNE L263 - true
   * Goal 3. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getNumberOfGaps([B)I: I26 Branch 21 IF_ACMPNE L263 - false
   */

  @Test
  public void test01()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      assertEquals(DefaultNucleotideCodec.INSTANCE, defaultNucleotideCodec0);
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      
      byte[] byteArray0 = new byte[6];
      byteArray0[3] = (byte) (-123);
      byteArray0[4] = (byte) (-123);
      // Undeclared exception!
      try {
        long long0 = defaultNucleotideCodec0.getUngappedLength(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
      }
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.computeEncodedIndexForGlyph(J)I: I8 Branch 12 IFGE L136 - false
   */

  @Test
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      // Undeclared exception!
      try {
        Nucleotide nucleotide0 = defaultNucleotideCodec0.decode(byteArray0, (long) (byte) (-102));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // index can not be negative: -102
         //
      }
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getGappedOffsetFor([BI)I: I27 Branch 24 IF_ICMPGE L302 - true
   */

  @Test
  public void test03()  throws Throwable  {
      Nucleotide nucleotide0 = Nucleotide.NotCytosine;
      Set<Nucleotide> set0 = nucleotide0.getBasesFor();
      assertNotNull(set0);
      assertEquals(3, set0.size());
      assertFalse(set0.isEmpty());
      
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) set0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)3, (byte)18, (byte) (-32)}, byteArray0);
      assertNotNull(byteArray0);
      assertEquals(3, set0.size());
      assertFalse(set0.isEmpty());
      
      int int0 = defaultNucleotideCodec0.getGappedOffsetFor(byteArray0, 3608);
      assertEquals(0, int0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)3, (byte)18, (byte) (-32)}, byteArray0);
      assertEquals(3, set0.size());
      assertFalse(set0.isEmpty());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.<init>(Lorg/jcvi/jillion/core/residue/nt/DefaultNucleotideCodec;[BLorg/jcvi/jillion/core/Range;)V: I88 Branch 3 IFEQ L374 - true
   */

  @Test
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Range range0 = Range.ofLength(0L);
      assertNotNull(range0);
      assertTrue(range0.isEmpty());
      
      Iterator<Nucleotide> iterator0 = defaultNucleotideCodec0.iterator(byteArray0, range0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertNotNull(iterator0);
      assertTrue(range0.isEmpty());
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.<init>(Lorg/jcvi/jillion/core/residue/nt/DefaultNucleotideCodec;[BLorg/jcvi/jillion/core/Range;)V: I41 Branch 2 IFLT L369 - false
   */

  @Test
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      assertEquals(DefaultNucleotideCodec.INSTANCE, defaultNucleotideCodec0);
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.ZERO_BASED;
      Range range0 = Range.of(range_CoordinateSystem0, (long) 595, (long) 595);
      assertNotNull(range0);
      assertFalse(range0.isEmpty());
      
      // Undeclared exception!
      try {
        Iterator<Nucleotide> iterator0 = defaultNucleotideCodec0.iterator(byteArray0, range0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // range [ 595 .. 595 ]/0B is out of range of sequence which is only [ 0 .. -1 ]/0B
         //
      }
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getUngappedOffsetFor([BI)I: root-Branch
   */

  @Test
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      int int0 = defaultNucleotideCodec0.getUngappedOffsetFor(byteArray0, 5555);
      assertEquals(5555, int0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  //Test case number: 7
  /*
   * 2 covered goals:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.toString([B)Ljava/lang/String;: I37 Branch 29 IF_ICMPGE L344 - true
   * Goal 2. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.toString([B)Ljava/lang/String;: I114 Branch 30 IFEQ L354 - true
   */

  @Test
  public void test07()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      assertEquals(DefaultNucleotideCodec.INSTANCE, defaultNucleotideCodec0);
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      
      Nucleotide nucleotide0 = Nucleotide.Cytosine;
      byte[] byteArray0 = defaultNucleotideCodec0.encode(nucleotide0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)1, (byte) (-48)}, byteArray0);
      assertNotNull(byteArray0);
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      
      String string0 = defaultNucleotideCodec0.toString(byteArray0);
      assertEquals("C", string0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)1, (byte) (-48)}, byteArray0);
      assertNotNull(string0);
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
  }

  //Test case number: 8
  /*
   * 4 covered goals:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getGappedOffsetFor([BI)I: I21 Branch 23 IFEQ L302 - true
   * Goal 2. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getGappedOffsetFor([BI)I: I21 Branch 23 IFEQ L302 - false
   * Goal 3. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getGappedOffsetFor([BI)I: I27 Branch 24 IF_ICMPGE L302 - false
   * Goal 4. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getGappedOffsetFor([BI)I: I36 Branch 25 IF_ACMPEQ L303 - true
   */

  @Test
  public void test08()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      //  // Unstable assertion: assertEquals(DefaultNucleotideCodec.INSTANCE, defaultNucleotideCodec0);
      //  // Unstable assertion: assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      //  // Unstable assertion: assertEquals(0, defaultNucleotideCodec0.ordinal());
      //  // Unstable assertion: assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      //  // Unstable assertion: assertEquals(DefaultNucleotideCodec.INSTANCE, defaultNucleotideCodec0);
      
      Nucleotide nucleotide0 = Nucleotide.Gap;
      Set<Nucleotide> set0 = nucleotide0.getBasesFor();
      //  // Unstable assertion: assertNull(set0);
      
      // Undeclared exception!
      try {
        byte[] byteArray0 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) set0);
       //  fail("Expecting exception: NullPointerException");
       // Unstable assertion
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 9
  /*
   * 3 covered goals:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getUngappedLength([B)J: root-Branch
   * Goal 2. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getNumberOfGaps([B)I: I17 Branch 20 IFEQ L262 - true
   * Goal 3. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.toString([B)Ljava/lang/String;: I12 Branch 28 IFNE L337 - false
   */

  @Test
  public void test09()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[18];
      String string0 = defaultNucleotideCodec0.toString(byteArray0);
      assertEquals("", string0);
      assertNotNull(string0);
      
      long long0 = defaultNucleotideCodec0.getUngappedLength(byteArray0);
      assertEquals(0L, long0);
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.encodeFinalByte(Ljava/util/Iterator;ILjava/nio/ByteBuffer;)V: I6 Branch 14 IFLE L200 - true
   */

  @Test
  public void test10()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      assertEquals(DefaultNucleotideCodec.INSTANCE, defaultNucleotideCodec0);
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      
      ArrayList<Nucleotide> arrayList0 = new ArrayList<Nucleotide>(0);
      assertNotNull(arrayList0);
      assertTrue(arrayList0.isEmpty());
      assertEquals(0, arrayList0.size());
      
      byte[] byteArray0 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) arrayList0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertNotNull(byteArray0);
      assertTrue(arrayList0.isEmpty());
      assertEquals(0, arrayList0.size());
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
  }

  //Test case number: 11
  /*
   * 3 covered goals:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.encode(ILjava/util/Iterator;)[B: root-Branch
   * Goal 2. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.encodeAllButTheLastByte(Ljava/util/Iterator;ILjava/nio/ByteBuffer;)V: I12 Branch 13 IF_ICMPGE L186 - false
   * Goal 3. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.next()Lorg/jcvi/jillion/core/residue/nt/Nucleotide;: I7 Branch 6 IFNE L395 - false
   */

  @Test
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      assertEquals(DefaultNucleotideCodec.INSTANCE, defaultNucleotideCodec0);
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      
      Iterator<Nucleotide> iterator0 = defaultNucleotideCodec0.iterator(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertNotNull(iterator0);
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      
      // Undeclared exception!
      try {
        byte[] byteArray1 = defaultNucleotideCodec0.encode(495, iterator0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no more elements
         //
      }
  }

  //Test case number: 12
  /*
   * 10 covered goals:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getGapOffsets([B)Ljava/util/List;: I23 Branch 18 IFEQ L245 - false
   * Goal 2. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getGapOffsets([B)Ljava/util/List;: I32 Branch 19 IF_ACMPNE L246 - true
   * Goal 3. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getGapOffsets([B)Ljava/util/List;: I32 Branch 19 IF_ACMPNE L246 - false
   * Goal 4. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.<init>(Lorg/jcvi/jillion/core/residue/nt/DefaultNucleotideCodec;[B)V: I31 Branch 4 IFEQ L382 - false
   * Goal 5. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.next()Lorg/jcvi/jillion/core/residue/nt/Nucleotide;: I7 Branch 6 IFNE L395 - true
   * Goal 6. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.next()Lorg/jcvi/jillion/core/residue/nt/Nucleotide;: I26 Branch 7 IFEQ L399 - true
   * Goal 7. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.next()Lorg/jcvi/jillion/core/residue/nt/Nucleotide;: I26 Branch 7 IFEQ L399 - false
   * Goal 8. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.next()Lorg/jcvi/jillion/core/residue/nt/Nucleotide;: I69 Branch 8 IFEQ L405 - true
   * Goal 9. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.next()Lorg/jcvi/jillion/core/residue/nt/Nucleotide;: I69 Branch 8 IFEQ L405 - false
   * Goal 10. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.next()Lorg/jcvi/jillion/core/residue/nt/Nucleotide;: I75 Branch 9 IFEQ L405 - false
   */

  @Test
  public void test12()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      assertEquals(DefaultNucleotideCodec.INSTANCE, defaultNucleotideCodec0);
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      
      byte[] byteArray0 = new byte[6];
      byteArray0[3] = (byte) (-123);
      byteArray0[4] = (byte) (-123);
      // Undeclared exception!
      try {
        boolean boolean0 = defaultNucleotideCodec0.isGap(byteArray0, (int) (byte) (-123));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
      }
  }

  //Test case number: 13
  /*
   * 4 covered goals:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.<init>(Lorg/jcvi/jillion/core/residue/nt/DefaultNucleotideCodec;[BLorg/jcvi/jillion/core/Range;)V: I32 Branch 1 IFLT L369 - false
   * Goal 2. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.<init>(Lorg/jcvi/jillion/core/residue/nt/DefaultNucleotideCodec;[BLorg/jcvi/jillion/core/Range;)V: I41 Branch 2 IFLT L369 - true
   * Goal 3. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.<init>(Lorg/jcvi/jillion/core/residue/nt/DefaultNucleotideCodec;[BLorg/jcvi/jillion/core/Range;)V: I88 Branch 3 IFEQ L374 - false
   * Goal 4. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.hasNext()Z: I9 Branch 5 IF_ICMPGE L390 - false
   */

  @Test
  public void test13()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      assertEquals(DefaultNucleotideCodec.INSTANCE, defaultNucleotideCodec0);
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)66;
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.ZERO_BASED;
      Range range0 = Range.of(range_CoordinateSystem0, (long) (byte)0, (long) (byte)66);
      assertNotNull(range0);
      assertFalse(range0.isEmpty());
      
      Iterator<Nucleotide> iterator0 = defaultNucleotideCodec0.iterator(byteArray0, range0);
      assertArrayEquals(new byte[] {(byte)66, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertNotNull(iterator0);
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertFalse(range0.isEmpty());
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.isGap([BI)Z: I11 Branch 22 IFLE L274 - true
   */

  @Test
  public void test14()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      assertEquals(DefaultNucleotideCodec.INSTANCE, defaultNucleotideCodec0);
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      
      byte[] byteArray0 = new byte[6];
      boolean boolean0 = defaultNucleotideCodec0.isGap(byteArray0, (int) (byte)0);
      assertFalse(boolean0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getNumberOfGapsUntil([BI)I: I17 Branch 26 IFEQ L317 - true
   */

  @Test
  public void test15()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      assertEquals(DefaultNucleotideCodec.INSTANCE, defaultNucleotideCodec0);
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      
      byte[] byteArray0 = new byte[6];
      int int0 = defaultNucleotideCodec0.getNumberOfGapsUntil(byteArray0, 0);
      assertEquals(0, int0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
  }

  //Test case number: 16
  /*
   * 3 covered goals:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.encodeNext2Values(Ljava/util/Iterator;Ljava/nio/ByteBuffer;)V: root-Branch
   * Goal 2. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.encodeFinalByte(Ljava/util/Iterator;ILjava/nio/ByteBuffer;)V: I20 Branch 15 IFEQ L202 - false
   * Goal 3. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.computeEncodedSize(I)I: I14 Branch 16 IFEQ L211 - false
   */

  @Test
  public void test16()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      assertEquals(DefaultNucleotideCodec.INSTANCE, defaultNucleotideCodec0);
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      
      Nucleotide nucleotide0 = Nucleotide.Keto;
      Set<Nucleotide> set0 = nucleotide0.getBasesFor();
      assertNotNull(set0);
      assertEquals(2, set0.size());
      assertFalse(set0.isEmpty());
      
      byte[] byteArray0 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) set0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)2, (byte)46}, byteArray0);
      assertNotNull(byteArray0);
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals(2, set0.size());
      assertFalse(set0.isEmpty());
  }

  //Test case number: 17
  /*
   * 2 covered goals:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.iterator([BLorg/jcvi/jillion/core/Range;)Ljava/util/Iterator;: root-Branch
   * Goal 2. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.<init>(Lorg/jcvi/jillion/core/residue/nt/DefaultNucleotideCodec;[BLorg/jcvi/jillion/core/Range;)V: I32 Branch 1 IFLT L369 - true
   */

  @Test
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      assertEquals(DefaultNucleotideCodec.INSTANCE, defaultNucleotideCodec0);
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      
      Range range0 = Range.of((long) (byte) (-26), (long) (byte) (-26));
      assertNotNull(range0);
      assertFalse(range0.isEmpty());
      
      // Undeclared exception!
      try {
        Iterator<Nucleotide> iterator0 = defaultNucleotideCodec0.iterator(byteArray0, range0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // range [ -26 .. -26 ]/0B is out of range of sequence which is only [ 0 .. -1 ]/0B
         //
      }
  }

  //Test case number: 18
  /*
   * 2 covered goals:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.decode(BZ)Lorg/jcvi/jillion/core/residue/nt/Nucleotide;: I12 Branch 10 IFEQ L123 - false
   * Goal 2. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.isEven(J)Z: I10 Branch 17 IFNE L214 - false
   */

  @Test
  public void test18()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[5];
      Nucleotide nucleotide0 = defaultNucleotideCodec0.decode(byteArray0, (long) (byte)0);
      assertEquals(Nucleotide.Gap, nucleotide0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(11, nucleotide0.ordinal());
      assertTrue(nucleotide0.isGap());
      assertEquals("-", nucleotide0.toString());
      assertEquals("Gap", nucleotide0.name());
      assertFalse(nucleotide0.isAmbiguity());
  }

  //Test case number: 19
  /*
   * 2 covered goals:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.toString([B)Ljava/lang/String;: I12 Branch 28 IFNE L337 - true
   * Goal 2. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.toString([B)Ljava/lang/String;: I37 Branch 29 IF_ICMPGE L344 - false
   */

  @Test
  public void test19()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[26];
      byteArray0[1] = (byte)50;
      // Undeclared exception!
      try {
        String string0 = defaultNucleotideCodec0.toString(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 26
         //
      }
  }

  //Test case number: 20
  /*
   * 4 covered goals:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.decodeNext2Values(B)[B: root-Branch
   * Goal 2. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.decode(BZ)Lorg/jcvi/jillion/core/residue/nt/Nucleotide;: I12 Branch 10 IFEQ L123 - true
   * Goal 3. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getEncodedByteForGlyph([BJ)B: I14 Branch 11 IF_ICMPLT L130 - true
   * Goal 4. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.isEven(J)Z: I10 Branch 17 IFNE L214 - true
   */

  @Test
  public void test20()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      assertEquals(DefaultNucleotideCodec.INSTANCE, defaultNucleotideCodec0);
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      
      byte[] byteArray0 = new byte[5];
      Nucleotide nucleotide0 = defaultNucleotideCodec0.decode(byteArray0, 1L);
      assertEquals(Nucleotide.Gap, nucleotide0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertTrue(nucleotide0.isGap());
      assertEquals("-", nucleotide0.toString());
      assertEquals(11, nucleotide0.ordinal());
      assertFalse(nucleotide0.isAmbiguity());
      assertEquals("Gap", nucleotide0.name());
  }

  //Test case number: 21
  /*
   * 7 covered goals:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.decodedLengthOf([B)I: root-Branch
   * Goal 2. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.iterator([B)Ljava/util/Iterator;: root-Branch
   * Goal 3. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.encodeLastValue(Lorg/jcvi/jillion/core/residue/nt/Nucleotide;Ljava/nio/ByteBuffer;)V: root-Branch
   * Goal 4. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.encode(Lorg/jcvi/jillion/core/residue/nt/Nucleotide;)[B: root-Branch
   * Goal 5. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getGapOffsets([B)Ljava/util/List;: I23 Branch 18 IFEQ L245 - true
   * Goal 6. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.<init>(Lorg/jcvi/jillion/core/residue/nt/DefaultNucleotideCodec;[B)V: I31 Branch 4 IFEQ L382 - true
   * Goal 7. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.hasNext()Z: I9 Branch 5 IF_ICMPGE L390 - true
   */

  @Test
  public void test21()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      assertEquals(DefaultNucleotideCodec.INSTANCE, defaultNucleotideCodec0);
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      
      byte[] byteArray0 = new byte[6];
      List<Integer> list0 = defaultNucleotideCodec0.getGapOffsets(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertNotNull(list0);
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      
      Nucleotide nucleotide0 = Nucleotide.Keto;
      byte[] byteArray1 = defaultNucleotideCodec0.encode(nucleotide0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)1, (byte)80}, byteArray1);
      assertNotNull(byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
  }

  //Test case number: 22
  /*
   * 3 covered goals:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.decode([BJ)Lorg/jcvi/jillion/core/residue/nt/Nucleotide;: root-Branch
   * Goal 2. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getEncodedByteForGlyph([BJ)B: I14 Branch 11 IF_ICMPLT L130 - false
   * Goal 3. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.computeEncodedIndexForGlyph(J)I: I8 Branch 12 IFGE L136 - true
   */

  @Test
  public void test22()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try {
        Nucleotide nucleotide0 = defaultNucleotideCodec0.decode(byteArray0, (long) (byte)0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // index 0 corresponds to encodedIndex 4  encodedglyph length is 4
         //
      }
  }
}

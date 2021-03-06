/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 16 05:26:53 GMT 2015
 */

package org.jcvi.jillion.core.residue.nt;

import static org.junit.Assert.*;
import org.junit.Test;
import edu.stanford.nlp.util.HashIndex;
import java.util.Collection;
import java.util.Iterator;
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
   * 1 covered goal:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.encodeAllButTheLastByte(Ljava/util/Iterator;ILjava/nio/ByteBuffer;)V: I12 Branch 13 IF_ICMPGE L186 - false
   */

  @Test
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[13];
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Iterator<Nucleotide> iterator0 = defaultNucleotideCodec0.iterator(byteArray0);
      assertNotNull(iterator0);
      
      // Undeclared exception!
      try {
        byte[] byteArray1 = defaultNucleotideCodec0.encode((int) (byte)36, iterator0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no more elements
         //
      }
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.<init>(Lorg/jcvi/jillion/core/residue/nt/DefaultNucleotideCodec;[BLorg/jcvi/jillion/core/Range;)V: I88 Branch 3 IFEQ L374 - false
   */

  @Test
  public void test01()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      assertEquals(DefaultNucleotideCodec.INSTANCE, defaultNucleotideCodec0);
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      
      Nucleotide nucleotide0 = Nucleotide.NotGuanine;
      byte[] byteArray0 = defaultNucleotideCodec0.encode(nucleotide0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)1, (byte) (-112)}, byteArray0);
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertNotNull(byteArray0);
      
      Range range0 = Range.of((long) (byte)0);
      assertFalse(range0.isEmpty());
      assertNotNull(range0);
      
      Iterator<Nucleotide> iterator0 = defaultNucleotideCodec0.iterator(byteArray0, range0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)1, (byte) (-112)}, byteArray0);
      assertFalse(range0.isEmpty());
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertNotNull(iterator0);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.<init>(Lorg/jcvi/jillion/core/residue/nt/DefaultNucleotideCodec;[BLorg/jcvi/jillion/core/Range;)V: I41 Branch 2 IFLT L369 - true
   * Goal 2. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.<init>(Lorg/jcvi/jillion/core/residue/nt/DefaultNucleotideCodec;[BLorg/jcvi/jillion/core/Range;)V: I88 Branch 3 IFEQ L374 - true
   */

  @Test
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[11];
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.SPACE_BASED;
      Range range0 = Range.of(range_CoordinateSystem0, (long) (byte)0, (long) (byte)0);
      assertTrue(range0.isEmpty());
      assertNotNull(range0);
      
      Iterator<Nucleotide> iterator0 = defaultNucleotideCodec0.iterator(byteArray0, range0);
      assertTrue(range0.isEmpty());
      assertNotNull(iterator0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getGappedOffsetFor([BI)I: I36 Branch 25 IF_ACMPEQ L303 - false
   */

  @Test
  public void test03()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      assertEquals(DefaultNucleotideCodec.INSTANCE, defaultNucleotideCodec0);
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      
      Nucleotide nucleotide0 = Nucleotide.Strong;
      Set<Nucleotide> set0 = nucleotide0.getBasesFor();
      assertEquals(2, set0.size());
      assertFalse(set0.isEmpty());
      assertNotNull(set0);
      
      byte[] byteArray0 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) set0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)2, (byte) (-46)}, byteArray0);
      assertEquals(2, set0.size());
      assertFalse(set0.isEmpty());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertNotNull(byteArray0);
      
      int int0 = defaultNucleotideCodec0.getGappedOffsetFor(byteArray0, (-16));
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)2, (byte) (-46)}, byteArray0);
      assertEquals(2, int0);
      assertEquals(2, set0.size());
      assertFalse(set0.isEmpty());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getGappedOffsetFor([BI)I: I27 Branch 24 IF_ICMPGE L302 - true
   */

  @Test
  public void test04()  throws Throwable  {
      Nucleotide nucleotide0 = Nucleotide.Thymine;
      Set<Nucleotide> set0 = nucleotide0.getBasesFor();
      assertFalse(set0.isEmpty());
      assertEquals(1, set0.size());
      assertNotNull(set0);
      
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) set0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)1, (byte) (-32)}, byteArray0);
      assertFalse(set0.isEmpty());
      assertEquals(1, set0.size());
      assertNotNull(byteArray0);
      
      int int0 = defaultNucleotideCodec0.getGappedOffsetFor(byteArray0, 0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)1, (byte) (-32)}, byteArray0);
      assertEquals(0, int0);
      assertFalse(set0.isEmpty());
      assertEquals(1, set0.size());
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.<init>(Lorg/jcvi/jillion/core/residue/nt/DefaultNucleotideCodec;[BLorg/jcvi/jillion/core/Range;)V: I32 Branch 1 IFLT L369 - true
   */

  @Test
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.RESIDUE_BASED;
      Range range0 = Range.of(range_CoordinateSystem0, (long) (byte)0, (long) (byte)0);
      assertFalse(range0.isEmpty());
      assertNotNull(range0);
      
      // Undeclared exception!
      try {
        Iterator<Nucleotide> iterator0 = defaultNucleotideCodec0.iterator(byteArray0, range0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // range [ -1 .. -1 ]/0B is out of range of sequence which is only [ 0 .. -1 ]/0B
         //
      }
  }

  //Test case number: 6
  /*
   * 2 covered goals:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.encodeFinalByte(Ljava/util/Iterator;ILjava/nio/ByteBuffer;)V: I20 Branch 15 IFEQ L202 - true
   * Goal 2. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.next()Lorg/jcvi/jillion/core/residue/nt/Nucleotide;: I7 Branch 6 IFNE L395 - false
   */

  @Test
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Iterator<Nucleotide> iterator0 = defaultNucleotideCodec0.iterator(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertNotNull(iterator0);
      
      // Undeclared exception!
      try {
        byte[] byteArray1 = defaultNucleotideCodec0.encode((int) (byte)1, iterator0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no more elements
         //
      }
  }

  //Test case number: 7
  /*
   * 2 covered goals:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getGappedOffsetFor([BI)I: I21 Branch 23 IFEQ L302 - true
   * Goal 2. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.toString([B)Ljava/lang/String;: I12 Branch 28 IFNE L337 - false
   */

  @Test
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[17];
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      int int0 = defaultNucleotideCodec0.getGappedOffsetFor(byteArray0, 130);
      assertEquals(0, int0);
      
      String string0 = defaultNucleotideCodec0.toString(byteArray0);
      assertEquals("", string0);
      assertNotNull(string0);
  }

  //Test case number: 8
  /*
   * 3 covered goals:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.iterator([BLorg/jcvi/jillion/core/Range;)Ljava/util/Iterator;: root-Branch
   * Goal 2. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.<init>(Lorg/jcvi/jillion/core/residue/nt/DefaultNucleotideCodec;[BLorg/jcvi/jillion/core/Range;)V: I32 Branch 1 IFLT L369 - false
   * Goal 3. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.<init>(Lorg/jcvi/jillion/core/residue/nt/DefaultNucleotideCodec;[BLorg/jcvi/jillion/core/Range;)V: I41 Branch 2 IFLT L369 - false
   */

  @Test
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Range.CoordinateSystem range_CoordinateSystem0 = Range.CoordinateSystem.ZERO_BASED;
      Range range0 = Range.of(range_CoordinateSystem0, (long) (byte)0, (long) (byte)0);
      assertFalse(range0.isEmpty());
      assertNotNull(range0);
      
      // Undeclared exception!
      try {
        Iterator<Nucleotide> iterator0 = defaultNucleotideCodec0.iterator(byteArray0, range0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // range [ 0 .. 0 ]/0B is out of range of sequence which is only [ 0 .. -1 ]/0B
         //
      }
  }

  //Test case number: 9
  /*
   * 2 covered goals:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.encode(ILjava/util/Iterator;)[B: root-Branch
   * Goal 2. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.computeEncodedSize(I)I: I14 Branch 16 IFEQ L211 - true
   */

  @Test
  public void test09()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      assertEquals(DefaultNucleotideCodec.INSTANCE, defaultNucleotideCodec0);
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      
      // Undeclared exception!
      try {
        byte[] byteArray0 = defaultNucleotideCodec0.encode((-4945), (Iterator<Nucleotide>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.computeEncodedIndexForGlyph(J)I: I8 Branch 12 IFGE L136 - false
   */

  @Test
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[17];
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      // Undeclared exception!
      try {
        Nucleotide nucleotide0 = defaultNucleotideCodec0.decode(byteArray0, (long) (byte) (-100));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // index can not be negative: -100
         //
      }
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getEncodedByteForGlyph([BJ)B: I14 Branch 11 IF_ICMPLT L130 - false
   */

  @Test
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      // Undeclared exception!
      try {
        Nucleotide nucleotide0 = defaultNucleotideCodec0.decode(byteArray0, (long) (byte)100);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // index 100 corresponds to encodedIndex 54  encodedglyph length is 10
         //
      }
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getNumberOfGaps([B)I: I26 Branch 21 IF_ACMPNE L263 - false
   */

  @Test
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      byteArray0[2] = (byte) (-24);
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      // Undeclared exception!
      try {
        long long0 = defaultNucleotideCodec0.getUngappedLength(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 10
         //
      }
  }

  //Test case number: 13
  /*
   * 5 covered goals:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getUngappedLength([B)J: root-Branch
   * Goal 2. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getNumberOfGaps([B)I: I17 Branch 20 IFEQ L262 - true
   * Goal 3. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getNumberOfGaps([B)I: I17 Branch 20 IFEQ L262 - false
   * Goal 4. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getNumberOfGaps([B)I: I26 Branch 21 IF_ACMPNE L263 - true
   * Goal 5. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.toString([B)Ljava/lang/String;: I114 Branch 30 IFEQ L354 - true
   */

  @Test
  public void test13()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      assertEquals(DefaultNucleotideCodec.INSTANCE, defaultNucleotideCodec0);
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      
      Nucleotide nucleotide0 = Nucleotide.Unknown;
      byte[] byteArray0 = defaultNucleotideCodec0.encode(nucleotide0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)1, (byte) (-16)}, byteArray0);
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertNotNull(byteArray0);
      
      long long0 = defaultNucleotideCodec0.getUngappedLength(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)1, (byte) (-16)}, byteArray0);
      assertEquals(1L, long0);
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      
      String string0 = defaultNucleotideCodec0.toString(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)1, (byte) (-16)}, byteArray0);
      assertEquals("N", string0);
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertNotNull(string0);
  }

  //Test case number: 14
  /*
   * 3 covered goals:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.decode(BZ)Lorg/jcvi/jillion/core/residue/nt/Nucleotide;: I12 Branch 10 IFEQ L123 - false
   * Goal 2. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.isGap([BI)Z: I11 Branch 22 IFLE L274 - true
   * Goal 3. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.<init>(Lorg/jcvi/jillion/core/residue/nt/DefaultNucleotideCodec;[B)V: I31 Branch 4 IFEQ L382 - true
   */

  @Test
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = defaultNucleotideCodec0.decode(byteArray0, (long) 0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(Nucleotide.Gap, nucleotide0);
      assertEquals("Gap", nucleotide0.name());
      assertFalse(nucleotide0.isAmbiguity());
      assertEquals(11, nucleotide0.ordinal());
      assertEquals("-", nucleotide0.toString());
      assertTrue(nucleotide0.isGap());
      
      boolean boolean0 = defaultNucleotideCodec0.isGap(byteArray0, (int) (byte) (-100));
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertFalse(boolean0);
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.isGap([BI)Z: I11 Branch 22 IFLE L274 - false
   */

  @Test
  public void test15()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      assertEquals(DefaultNucleotideCodec.INSTANCE, defaultNucleotideCodec0);
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      
      byte[] byteArray0 = new byte[20];
      byteArray0[3] = (byte)24;
      boolean boolean0 = defaultNucleotideCodec0.isGap(byteArray0, 0);
      assertTrue(boolean0);
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.toString([B)Ljava/lang/String;: I37 Branch 29 IF_ICMPGE L344 - false
   */

  @Test
  public void test16()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      assertEquals(DefaultNucleotideCodec.INSTANCE, defaultNucleotideCodec0);
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      
      byte[] byteArray0 = new byte[20];
      byteArray0[3] = (byte) (-42);
      // Undeclared exception!
      try {
        String string0 = defaultNucleotideCodec0.toString(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 20
         //
      }
  }

  //Test case number: 17
  /*
   * 3 covered goals:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getGappedOffsetFor([BI)I: I21 Branch 23 IFEQ L302 - false
   * Goal 2. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getGappedOffsetFor([BI)I: I27 Branch 24 IF_ICMPGE L302 - false
   * Goal 3. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getGappedOffsetFor([BI)I: I36 Branch 25 IF_ACMPEQ L303 - true
   */

  @Test
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      byteArray0[2] = (byte) (-21);
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      // Undeclared exception!
      try {
        int int0 = defaultNucleotideCodec0.getGappedOffsetFor(byteArray0, (int) (byte) (-21));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 10
         //
      }
  }

  //Test case number: 18
  /*
   * 3 covered goals:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.decode([BJ)Lorg/jcvi/jillion/core/residue/nt/Nucleotide;: root-Branch
   * Goal 2. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.decode(BZ)Lorg/jcvi/jillion/core/residue/nt/Nucleotide;: I12 Branch 10 IFEQ L123 - true
   * Goal 3. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getEncodedByteForGlyph([BJ)B: I14 Branch 11 IF_ICMPLT L130 - true
   */

  @Test
  public void test18()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      assertEquals(DefaultNucleotideCodec.INSTANCE, defaultNucleotideCodec0);
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      
      byte[] byteArray0 = new byte[20];
      Nucleotide nucleotide0 = defaultNucleotideCodec0.decode(byteArray0, (long) (byte)29);
      assertEquals(Nucleotide.Gap, nucleotide0);
      assertEquals("Gap", nucleotide0.name());
      assertEquals(11, nucleotide0.ordinal());
      assertEquals("-", nucleotide0.toString());
      assertTrue(nucleotide0.isGap());
      assertFalse(nucleotide0.isAmbiguity());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
  }

  //Test case number: 19
  /*
   * 3 covered goals:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.encodeLastValue(Lorg/jcvi/jillion/core/residue/nt/Nucleotide;Ljava/nio/ByteBuffer;)V: root-Branch
   * Goal 2. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.encode(Lorg/jcvi/jillion/core/residue/nt/Nucleotide;)[B: root-Branch
   * Goal 3. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.encodeFinalByte(Ljava/util/Iterator;ILjava/nio/ByteBuffer;)V: I6 Branch 14 IFLE L200 - true
   */

  @Test
  public void test19()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Nucleotide nucleotide0 = Nucleotide.Unknown;
      byte[] byteArray0 = defaultNucleotideCodec0.encode(nucleotide0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)1, (byte) (-16)}, byteArray0);
      assertNotNull(byteArray0);
      
      HashIndex<Nucleotide> hashIndex0 = new HashIndex<Nucleotide>(8486);
      assertEquals(0, hashIndex0.size());
      assertFalse(hashIndex0.isLocked());
      assertNotNull(hashIndex0);
      
      byte[] byteArray1 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) hashIndex0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertEquals(0, hashIndex0.size());
      assertFalse(hashIndex0.isLocked());
      assertNotNull(byteArray1);
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getGapOffsets([B)Ljava/util/List;: I32 Branch 19 IF_ACMPNE L246 - true
   */

  @Test
  public void test20()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      assertEquals(DefaultNucleotideCodec.INSTANCE, defaultNucleotideCodec0);
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      
      Nucleotide nucleotide0 = Nucleotide.Strong;
      Set<Nucleotide> set0 = nucleotide0.getBasesFor();
      assertFalse(set0.isEmpty());
      assertEquals(2, set0.size());
      assertNotNull(set0);
      
      byte[] byteArray0 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) set0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)2, (byte) (-46)}, byteArray0);
      assertFalse(set0.isEmpty());
      assertEquals(2, set0.size());
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertNotNull(byteArray0);
      
      int int0 = defaultNucleotideCodec0.getUngappedOffsetFor(byteArray0, (-2219));
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)2, (byte) (-46)}, byteArray0);
      assertEquals((-2219), int0);
      assertFalse(set0.isEmpty());
      assertEquals(2, set0.size());
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
  }

  //Test case number: 21
  /*
   * 20 covered goals:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.iterator([B)Ljava/util/Iterator;: root-Branch
   * Goal 2. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getUngappedOffsetFor([BI)I: root-Branch
   * Goal 3. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.isEven(J)Z: I10 Branch 17 IFNE L214 - true
   * Goal 4. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getGapOffsets([B)Ljava/util/List;: I23 Branch 18 IFEQ L245 - true
   * Goal 5. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getGapOffsets([B)Ljava/util/List;: I23 Branch 18 IFEQ L245 - false
   * Goal 6. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getGapOffsets([B)Ljava/util/List;: I32 Branch 19 IF_ACMPNE L246 - false
   * Goal 7. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getNumberOfGapsUntil([BI)I: I17 Branch 26 IFEQ L317 - true
   * Goal 8. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getNumberOfGapsUntil([BI)I: I17 Branch 26 IFEQ L317 - false
   * Goal 9. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getNumberOfGapsUntil([BI)I: I30 Branch 27 IF_ICMPGT L318 - true
   * Goal 10. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getNumberOfGapsUntil([BI)I: I30 Branch 27 IF_ICMPGT L318 - false
   * Goal 11. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.<init>(Lorg/jcvi/jillion/core/residue/nt/DefaultNucleotideCodec;[B)V: I31 Branch 4 IFEQ L382 - false
   * Goal 12. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.hasNext()Z: I9 Branch 5 IF_ICMPGE L390 - true
   * Goal 13. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.hasNext()Z: I9 Branch 5 IF_ICMPGE L390 - false
   * Goal 14. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.next()Lorg/jcvi/jillion/core/residue/nt/Nucleotide;: I7 Branch 6 IFNE L395 - true
   * Goal 15. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.next()Lorg/jcvi/jillion/core/residue/nt/Nucleotide;: I26 Branch 7 IFEQ L399 - true
   * Goal 16. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.next()Lorg/jcvi/jillion/core/residue/nt/Nucleotide;: I26 Branch 7 IFEQ L399 - false
   * Goal 17. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.next()Lorg/jcvi/jillion/core/residue/nt/Nucleotide;: I69 Branch 8 IFEQ L405 - true
   * Goal 18. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.next()Lorg/jcvi/jillion/core/residue/nt/Nucleotide;: I69 Branch 8 IFEQ L405 - false
   * Goal 19. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.next()Lorg/jcvi/jillion/core/residue/nt/Nucleotide;: I75 Branch 9 IFEQ L405 - true
   * Goal 20. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.next()Lorg/jcvi/jillion/core/residue/nt/Nucleotide;: I75 Branch 9 IFEQ L405 - false
   */

  @Test
  public void test21()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      assertEquals(DefaultNucleotideCodec.INSTANCE, defaultNucleotideCodec0);
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      
      byte[] byteArray0 = new byte[27];
      byteArray0[3] = (byte)12;
      int int0 = defaultNucleotideCodec0.getUngappedOffsetFor(byteArray0, 0);
      assertEquals((-1), int0);
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
  }

  //Test case number: 22
  /*
   * 14 covered goals:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.decodedLengthOf([B)I: root-Branch
   * Goal 2. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.encodeGlyphs(Ljava/util/Iterator;II)[B: root-Branch
   * Goal 3. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.decodeNext2Values(B)[B: root-Branch
   * Goal 4. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.encodeNext2Values(Ljava/util/Iterator;Ljava/nio/ByteBuffer;)V: root-Branch
   * Goal 5. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.encode(Ljava/util/Collection;)[B: root-Branch
   * Goal 6. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.computeEncodedIndexForGlyph(J)I: I8 Branch 12 IFGE L136 - true
   * Goal 7. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.encodeAllButTheLastByte(Ljava/util/Iterator;ILjava/nio/ByteBuffer;)V: I12 Branch 13 IF_ICMPGE L186 - true
   * Goal 8. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.encodeFinalByte(Ljava/util/Iterator;ILjava/nio/ByteBuffer;)V: I6 Branch 14 IFLE L200 - false
   * Goal 9. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.encodeFinalByte(Ljava/util/Iterator;ILjava/nio/ByteBuffer;)V: I20 Branch 15 IFEQ L202 - false
   * Goal 10. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.computeEncodedSize(I)I: I14 Branch 16 IFEQ L211 - false
   * Goal 11. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.isEven(J)Z: I10 Branch 17 IFNE L214 - false
   * Goal 12. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.toString([B)Ljava/lang/String;: I12 Branch 28 IFNE L337 - true
   * Goal 13. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.toString([B)Ljava/lang/String;: I37 Branch 29 IF_ICMPGE L344 - true
   * Goal 14. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.toString([B)Ljava/lang/String;: I114 Branch 30 IFEQ L354 - false
   */

  @Test
  public void test22()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      assertEquals(DefaultNucleotideCodec.INSTANCE, defaultNucleotideCodec0);
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      
      Nucleotide nucleotide0 = Nucleotide.Purine;
      Set<Nucleotide> set0 = nucleotide0.getBasesFor();
      assertEquals(2, set0.size());
      assertFalse(set0.isEmpty());
      assertNotNull(set0);
      
      byte[] byteArray0 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) set0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)2, (byte)18}, byteArray0);
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals(2, set0.size());
      assertFalse(set0.isEmpty());
      assertNotNull(byteArray0);
      
      String string0 = defaultNucleotideCodec0.toString(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)2, (byte)18}, byteArray0);
      assertEquals("AG", string0);
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals(2, set0.size());
      assertFalse(set0.isEmpty());
      assertNotNull(string0);
  }
}

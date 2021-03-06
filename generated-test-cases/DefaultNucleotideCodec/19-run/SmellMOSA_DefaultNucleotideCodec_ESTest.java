/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 16 05:33:33 GMT 2015
 */

package org.jcvi.jillion.core.residue.nt;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
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
   * 1 covered goal:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getEncodedByteForGlyph([BJ)B: I14 Branch 11 IF_ICMPLT L130 - false
   */

  @Test
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      assertEquals(DefaultNucleotideCodec.INSTANCE, defaultNucleotideCodec0);
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      
      // Undeclared exception!
      try {
        Nucleotide nucleotide0 = defaultNucleotideCodec0.decode(byteArray0, 144L);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // index 144 corresponds to encodedIndex 76  encodedglyph length is 8
         //
      }
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.encodeFinalByte(Ljava/util/Iterator;ILjava/nio/ByteBuffer;)V: I20 Branch 15 IFEQ L202 - true
   */

  @Test
  public void test01()  throws Throwable  {
      Nucleotide nucleotide0 = Nucleotide.NotCytosine;
      Set<Nucleotide> set0 = nucleotide0.getBasesFor();
      assertFalse(set0.isEmpty());
      assertEquals(3, set0.size());
      assertNotNull(set0);
      
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) set0);
      assertFalse(set0.isEmpty());
      assertEquals(3, set0.size());
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)3, (byte)18, (byte) (-32)}, byteArray0);
      assertNotNull(byteArray0);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.encodeFinalByte(Ljava/util/Iterator;ILjava/nio/ByteBuffer;)V: I6 Branch 14 IFLE L200 - false
   * Goal 2. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.encodeFinalByte(Ljava/util/Iterator;ILjava/nio/ByteBuffer;)V: I20 Branch 15 IFEQ L202 - false
   */

  @Test
  public void test02()  throws Throwable  {
      Nucleotide nucleotide0 = Nucleotide.Unknown;
      Set<Nucleotide> set0 = nucleotide0.getBasesFor();
      assertFalse(set0.isEmpty());
      assertEquals(4, set0.size());
      assertNotNull(set0);
      
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) set0);
      assertFalse(set0.isEmpty());
      assertEquals(4, set0.size());
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)4, (byte)29, (byte)46}, byteArray0);
      assertNotNull(byteArray0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.<init>(Lorg/jcvi/jillion/core/residue/nt/DefaultNucleotideCodec;[BLorg/jcvi/jillion/core/Range;)V: I32 Branch 1 IFLT L369 - true
   */

  @Test
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      Range range0 = Range.of((long) (byte) (-13), (long) (byte) (-13));
      assertFalse(range0.isEmpty());
      assertNotNull(range0);
      
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      // Undeclared exception!
      try {
        Iterator<Nucleotide> iterator0 = defaultNucleotideCodec0.iterator(byteArray0, range0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // range [ -13 .. -13 ]/0B is out of range of sequence which is only [ 0 .. -1 ]/0B
         //
      }
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.<init>(Lorg/jcvi/jillion/core/residue/nt/DefaultNucleotideCodec;[BLorg/jcvi/jillion/core/Range;)V: I88 Branch 3 IFEQ L374 - false
   */

  @Test
  public void test04()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      assertEquals(DefaultNucleotideCodec.INSTANCE, defaultNucleotideCodec0);
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      
      Nucleotide nucleotide0 = Nucleotide.NotThymine;
      byte[] byteArray0 = defaultNucleotideCodec0.encode(nucleotide0);
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)1, (byte)112}, byteArray0);
      assertNotNull(byteArray0);
      
      Range range0 = Range.of(0L);
      assertFalse(range0.isEmpty());
      assertNotNull(range0);
      
      Iterator<Nucleotide> iterator0 = defaultNucleotideCodec0.iterator(byteArray0, range0);
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertFalse(range0.isEmpty());
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)1, (byte)112}, byteArray0);
      assertNotNull(iterator0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getGappedOffsetFor([BI)I: I21 Branch 23 IFEQ L302 - true
   */

  @Test
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      Integer integer0 = new Integer((int) (byte)0);
      assertEquals(0, (int)integer0);
      
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      int int0 = defaultNucleotideCodec0.getGappedOffsetFor(byteArray0, (int) integer0);
      assertEquals(0, int0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertTrue(integer0.equals((Object)int0));
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getNumberOfGaps([B)I: I26 Branch 21 IF_ACMPNE L263 - true
   */

  @Test
  public void test06()  throws Throwable  {
      Nucleotide nucleotide0 = Nucleotide.Unknown;
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = defaultNucleotideCodec0.encode(nucleotide0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)1, (byte) (-16)}, byteArray0);
      assertNotNull(byteArray0);
      
      long long0 = defaultNucleotideCodec0.getUngappedLength(byteArray0);
      assertEquals(1L, long0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)1, (byte) (-16)}, byteArray0);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.computeEncodedIndexForGlyph(J)I: I8 Branch 12 IFGE L136 - false
   */

  @Test
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      // Undeclared exception!
      try {
        Nucleotide nucleotide0 = defaultNucleotideCodec0.decode(byteArray0, (-786L));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // index can not be negative: -786
         //
      }
  }

  //Test case number: 8
  /*
   * 3 covered goals:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getGapOffsets([B)Ljava/util/List;: I23 Branch 18 IFEQ L245 - false
   * Goal 2. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getGapOffsets([B)Ljava/util/List;: I32 Branch 19 IF_ACMPNE L246 - true
   * Goal 3. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getGapOffsets([B)Ljava/util/List;: I32 Branch 19 IF_ACMPNE L246 - false
   */

  @Test
  public void test08()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = new byte[13];
      byteArray0[0] = (byte)85;
      byteArray0[11] = (byte)85;
      // Undeclared exception!
      try {
        List<Integer> list0 = defaultNucleotideCodec0.getGapOffsets(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 13
         //
      }
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.decode(BZ)Lorg/jcvi/jillion/core/residue/nt/Nucleotide;: I12 Branch 10 IFEQ L123 - true
   */

  @Test
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      assertEquals(DefaultNucleotideCodec.INSTANCE, defaultNucleotideCodec0);
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      
      Nucleotide nucleotide0 = defaultNucleotideCodec0.decode(byteArray0, 1L);
      assertEquals(Nucleotide.Gap, nucleotide0);
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("Gap", nucleotide0.name());
      assertEquals("-", nucleotide0.toString());
      assertFalse(nucleotide0.isAmbiguity());
      assertEquals(11, nucleotide0.ordinal());
      assertTrue(nucleotide0.isGap());
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.toString([B)Ljava/lang/String;: I12 Branch 28 IFNE L337 - false
   */

  @Test
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      String string0 = defaultNucleotideCodec0.toString(byteArray0);
      assertEquals("", string0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertNotNull(string0);
  }

  //Test case number: 11
  /*
   * 4 covered goals:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.encode(Ljava/util/Collection;)[B: root-Branch
   * Goal 2. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.encodeAllButTheLastByte(Ljava/util/Iterator;ILjava/nio/ByteBuffer;)V: I12 Branch 13 IF_ICMPGE L186 - true
   * Goal 3. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.encodeFinalByte(Ljava/util/Iterator;ILjava/nio/ByteBuffer;)V: I6 Branch 14 IFLE L200 - true
   * Goal 4. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.computeEncodedSize(I)I: I14 Branch 16 IFEQ L211 - false
   */

  @Test
  public void test11()  throws Throwable  {
      LinkedList<Nucleotide> linkedList0 = new LinkedList<Nucleotide>();
      assertEquals(0, linkedList0.size());
      assertNotNull(linkedList0);
      
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) linkedList0);
      assertEquals(0, linkedList0.size());
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertNotNull(byteArray0);
  }

  //Test case number: 12
  /*
   * 6 covered goals:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getGappedOffsetFor([BI)I: I27 Branch 24 IF_ICMPGE L302 - false
   * Goal 2. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getGappedOffsetFor([BI)I: I36 Branch 25 IF_ACMPEQ L303 - true
   * Goal 3. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getGappedOffsetFor([BI)I: I36 Branch 25 IF_ACMPEQ L303 - false
   * Goal 4. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.next()Lorg/jcvi/jillion/core/residue/nt/Nucleotide;: I26 Branch 7 IFEQ L399 - true
   * Goal 5. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.next()Lorg/jcvi/jillion/core/residue/nt/Nucleotide;: I69 Branch 8 IFEQ L405 - false
   * Goal 6. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.next()Lorg/jcvi/jillion/core/residue/nt/Nucleotide;: I75 Branch 9 IFEQ L405 - false
   */

  @Test
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte) (-83);
      byteArray0[5] = (byte) (-83);
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      // Undeclared exception!
      try {
        int int0 = defaultNucleotideCodec0.getGappedOffsetFor(byteArray0, (int) (byte) (-83));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
      }
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.isGap([BI)Z: I11 Branch 22 IFLE L274 - true
   */

  @Test
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      Integer integer0 = new Integer((int) (byte)0);
      assertEquals(0, (int)integer0);
      
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      boolean boolean0 = defaultNucleotideCodec0.isGap(byteArray0, (int) integer0);
      assertFalse(boolean0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  //Test case number: 14
  /*
   * 2 covered goals:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getGappedOffsetFor([BI)I: I21 Branch 23 IFEQ L302 - false
   * Goal 2. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getGappedOffsetFor([BI)I: I27 Branch 24 IF_ICMPGE L302 - true
   */

  @Test
  public void test14()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      assertEquals(DefaultNucleotideCodec.INSTANCE, defaultNucleotideCodec0);
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      
      byte[] byteArray0 = new byte[6];
      byteArray0[2] = (byte)108;
      int int0 = defaultNucleotideCodec0.getGappedOffsetFor(byteArray0, (int) (byte)0);
      assertEquals(0, int0);
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)108, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  //Test case number: 15
  /*
   * 9 covered goals:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getUngappedLength([B)J: root-Branch
   * Goal 2. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getNumberOfGaps([B)I: I17 Branch 20 IFEQ L262 - true
   * Goal 3. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getNumberOfGaps([B)I: I17 Branch 20 IFEQ L262 - false
   * Goal 4. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getNumberOfGaps([B)I: I26 Branch 21 IF_ACMPNE L263 - false
   * Goal 5. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.<init>(Lorg/jcvi/jillion/core/residue/nt/DefaultNucleotideCodec;[B)V: I31 Branch 4 IFEQ L382 - false
   * Goal 6. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.hasNext()Z: I9 Branch 5 IF_ICMPGE L390 - false
   * Goal 7. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.next()Lorg/jcvi/jillion/core/residue/nt/Nucleotide;: I7 Branch 6 IFNE L395 - true
   * Goal 8. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.next()Lorg/jcvi/jillion/core/residue/nt/Nucleotide;: I26 Branch 7 IFEQ L399 - false
   * Goal 9. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.next()Lorg/jcvi/jillion/core/residue/nt/Nucleotide;: I69 Branch 8 IFEQ L405 - true
   */

  @Test
  public void test15()  throws Throwable  {
      Nucleotide nucleotide0 = Nucleotide.Gap;
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = defaultNucleotideCodec0.encode(nucleotide0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)1, (byte)0}, byteArray0);
      assertNotNull(byteArray0);
      
      long long0 = defaultNucleotideCodec0.getUngappedLength(byteArray0);
      assertEquals(0L, long0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)1, (byte)0}, byteArray0);
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.<init>(Lorg/jcvi/jillion/core/residue/nt/DefaultNucleotideCodec;[BLorg/jcvi/jillion/core/Range;)V: I41 Branch 2 IFLT L369 - false
   */

  @Test
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      Range range0 = Range.of((long) (byte)9, (long) (byte)9);
      assertFalse(range0.isEmpty());
      assertNotNull(range0);
      
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      // Undeclared exception!
      try {
        Iterator<Nucleotide> iterator0 = defaultNucleotideCodec0.iterator(byteArray0, range0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // range [ 9 .. 9 ]/0B is out of range of sequence which is only [ 0 .. -1 ]/0B
         //
      }
  }

  //Test case number: 17
  /*
   * 3 covered goals:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getUngappedOffsetFor([BI)I: root-Branch
   * Goal 2. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getGapOffsets([B)Ljava/util/List;: I23 Branch 18 IFEQ L245 - true
   * Goal 3. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getNumberOfGapsUntil([BI)I: I17 Branch 26 IFEQ L317 - true
   */

  @Test
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      Integer integer0 = new Integer((int) (byte)0);
      assertEquals(0, (int)integer0);
      
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      int int0 = defaultNucleotideCodec0.getUngappedOffsetFor(byteArray0, (int) integer0);
      assertEquals(0, int0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertTrue(integer0.equals((Object)int0));
  }

  //Test case number: 18
  /*
   * 2 covered goals:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.toString([B)Ljava/lang/String;: I37 Branch 29 IF_ICMPGE L344 - true
   * Goal 2. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.toString([B)Ljava/lang/String;: I114 Branch 30 IFEQ L354 - true
   */

  @Test
  public void test18()  throws Throwable  {
      Nucleotide nucleotide0 = Nucleotide.Thymine;
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = defaultNucleotideCodec0.encode(nucleotide0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)1, (byte) (-32)}, byteArray0);
      assertNotNull(byteArray0);
      
      String string0 = defaultNucleotideCodec0.toString(byteArray0);
      assertEquals("T", string0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)1, (byte) (-32)}, byteArray0);
      assertNotNull(string0);
  }

  //Test case number: 19
  /*
   * 6 covered goals:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.decode([BJ)Lorg/jcvi/jillion/core/residue/nt/Nucleotide;: root-Branch
   * Goal 2. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.encodeLastValue(Lorg/jcvi/jillion/core/residue/nt/Nucleotide;Ljava/nio/ByteBuffer;)V: root-Branch
   * Goal 3. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.encode(Lorg/jcvi/jillion/core/residue/nt/Nucleotide;)[B: root-Branch
   * Goal 4. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.decode(BZ)Lorg/jcvi/jillion/core/residue/nt/Nucleotide;: I12 Branch 10 IFEQ L123 - false
   * Goal 5. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getEncodedByteForGlyph([BJ)B: I14 Branch 11 IF_ICMPLT L130 - true
   * Goal 6. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.isEven(J)Z: I10 Branch 17 IFNE L214 - false
   */

  @Test
  public void test19()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      //  // Unstable assertion: assertEquals(DefaultNucleotideCodec.INSTANCE, defaultNucleotideCodec0);
      //  // Unstable assertion: assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      //  // Unstable assertion: assertEquals(0, defaultNucleotideCodec0.ordinal());
      //  // Unstable assertion: assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      
      Nucleotide nucleotide0 = Nucleotide.Thymine;
      byte[] byteArray0 = defaultNucleotideCodec0.encode(nucleotide0);
      //  // Unstable assertion: assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      //  // Unstable assertion: assertEquals(0, defaultNucleotideCodec0.ordinal());
      //  // Unstable assertion: assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      //  // Unstable assertion: assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)1, (byte) (-32)}, byteArray0);
      //  // Unstable assertion: assertNotNull(byteArray0);
      
      Nucleotide nucleotide1 = defaultNucleotideCodec0.decode(byteArray0, 0L);
      //  // Unstable assertion: assertEquals(Nucleotide.Thymine, nucleotide1);
      //  // Unstable assertion: assertNotSame(nucleotide0, nucleotide1);
      //  // Unstable assertion: assertNotSame(nucleotide1, nucleotide0);
      //  // Unstable assertion: assertEquals("Thymine", nucleotide1.name());
      //  // Unstable assertion: assertEquals(15, nucleotide1.ordinal());
      //  // Unstable assertion: assertEquals("T", nucleotide1.toString());
      //  // Unstable assertion: assertFalse(nucleotide1.isGap());
      //  // Unstable assertion: assertFalse(nucleotide1.isAmbiguity());
      //  // Unstable assertion: assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      //  // Unstable assertion: assertEquals(0, defaultNucleotideCodec0.ordinal());
      //  // Unstable assertion: assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      //  // Unstable assertion: assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)1, (byte) (-32)}, byteArray0);
      //  // Unstable assertion: assertFalse(nucleotide0.equals((Object)nucleotide1));
      //  // Unstable assertion: assertFalse(nucleotide1.equals((Object)nucleotide0));
  }

  //Test case number: 20
  /*
   * 4 covered goals:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.iterator([BLorg/jcvi/jillion/core/Range;)Ljava/util/Iterator;: root-Branch
   * Goal 2. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.<init>(Lorg/jcvi/jillion/core/residue/nt/DefaultNucleotideCodec;[BLorg/jcvi/jillion/core/Range;)V: I32 Branch 1 IFLT L369 - false
   * Goal 3. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.<init>(Lorg/jcvi/jillion/core/residue/nt/DefaultNucleotideCodec;[BLorg/jcvi/jillion/core/Range;)V: I41 Branch 2 IFLT L369 - true
   * Goal 4. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.<init>(Lorg/jcvi/jillion/core/residue/nt/DefaultNucleotideCodec;[BLorg/jcvi/jillion/core/Range;)V: I88 Branch 3 IFEQ L374 - true
   */

  @Test
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      Integer integer0 = new Integer((int) (byte)0);
      assertEquals(0, (int)integer0);
      
      Range range0 = Range.ofLength((long) integer0);
      assertTrue(range0.isEmpty());
      assertNotNull(range0);
      
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Iterator<Nucleotide> iterator0 = defaultNucleotideCodec0.iterator(byteArray0, range0);
      assertTrue(range0.isEmpty());
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertNotNull(iterator0);
  }

  //Test case number: 21
  /*
   * 10 covered goals:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.encodeGlyphs(Ljava/util/Iterator;II)[B: root-Branch
   * Goal 2. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.iterator([B)Ljava/util/Iterator;: root-Branch
   * Goal 3. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.encodeNext2Values(Ljava/util/Iterator;Ljava/nio/ByteBuffer;)V: root-Branch
   * Goal 4. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.encode(ILjava/util/Iterator;)[B: root-Branch
   * Goal 5. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.encodeAllButTheLastByte(Ljava/util/Iterator;ILjava/nio/ByteBuffer;)V: I12 Branch 13 IF_ICMPGE L186 - false
   * Goal 6. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.computeEncodedSize(I)I: I14 Branch 16 IFEQ L211 - true
   * Goal 7. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.isEven(J)Z: I10 Branch 17 IFNE L214 - true
   * Goal 8. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.<init>(Lorg/jcvi/jillion/core/residue/nt/DefaultNucleotideCodec;[B)V: I31 Branch 4 IFEQ L382 - true
   * Goal 9. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.hasNext()Z: I9 Branch 5 IF_ICMPGE L390 - true
   * Goal 10. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.next()Lorg/jcvi/jillion/core/residue/nt/Nucleotide;: I7 Branch 6 IFNE L395 - false
   */

  @Test
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      Integer integer0 = new Integer(1627);
      assertEquals(1627, (int)integer0);
      
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Iterator<Nucleotide> iterator0 = defaultNucleotideCodec0.iterator(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertNotNull(iterator0);
      
      // Undeclared exception!
      try {
        byte[] byteArray1 = defaultNucleotideCodec0.encode((int) integer0, iterator0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no more elements
         //
      }
  }

  //Test case number: 22
  /*
   * 5 covered goals:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.decodedLengthOf([B)I: root-Branch
   * Goal 2. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.decodeNext2Values(B)[B: root-Branch
   * Goal 3. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.computeEncodedIndexForGlyph(J)I: I8 Branch 12 IFGE L136 - true
   * Goal 4. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.toString([B)Ljava/lang/String;: I12 Branch 28 IFNE L337 - true
   * Goal 5. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.toString([B)Ljava/lang/String;: I37 Branch 29 IF_ICMPGE L344 - false
   */

  @Test
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte) (-70);
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      // Undeclared exception!
      try {
        String string0 = defaultNucleotideCodec0.toString(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
      }
  }
}

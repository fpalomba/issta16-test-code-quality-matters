/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 16 05:15:42 GMT 2015
 */

package org.jcvi.jillion.core.residue.nt;

import static org.junit.Assert.*;
import org.junit.Test;
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
   * 2 covered goals:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getGappedOffsetFor([BI)I: I21 Branch 23 IFEQ L302 - true
   * Goal 2. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getGappedOffsetFor([BI)I: I36 Branch 25 IF_ACMPEQ L303 - false
   */

  @Test
  public void test00()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals(DefaultNucleotideCodec.INSTANCE, defaultNucleotideCodec0);
      
      Nucleotide nucleotide0 = Nucleotide.Guanine;
      byte[] byteArray0 = defaultNucleotideCodec0.encode(nucleotide0);
      assertNotNull(byteArray0);
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)1, (byte)32}, byteArray0);
      
      int int0 = defaultNucleotideCodec0.getGappedOffsetFor(byteArray0, (-1493));
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals(1, int0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)1, (byte)32}, byteArray0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.isGap([BI)Z: I11 Branch 22 IFLE L274 - false
   */

  @Test
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[3] = (byte)8;
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      boolean boolean0 = defaultNucleotideCodec0.isGap(byteArray0, 6);
      assertTrue(boolean0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)8, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.<init>(Lorg/jcvi/jillion/core/residue/nt/DefaultNucleotideCodec;[BLorg/jcvi/jillion/core/Range;)V: I88 Branch 3 IFEQ L374 - false
   */

  @Test
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[3] = (byte) (-96);
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Range range0 = Range.of((long) (byte)0, (long) (byte)0);
      assertNotNull(range0);
      assertFalse(range0.isEmpty());
      
      // Undeclared exception!
      try {
        Iterator<Nucleotide> iterator0 = defaultNucleotideCodec0.iterator(byteArray0, range0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
      }
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.<init>(Lorg/jcvi/jillion/core/residue/nt/DefaultNucleotideCodec;[BLorg/jcvi/jillion/core/Range;)V: I41 Branch 2 IFLT L369 - true
   * Goal 2. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.<init>(Lorg/jcvi/jillion/core/residue/nt/DefaultNucleotideCodec;[BLorg/jcvi/jillion/core/Range;)V: I88 Branch 3 IFEQ L374 - true
   */

  @Test
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Range range0 = Range.ofLength((long) 0);
      assertNotNull(range0);
      assertTrue(range0.isEmpty());
      
      Iterator<Nucleotide> iterator0 = defaultNucleotideCodec0.iterator(byteArray0, range0);
      assertNotNull(iterator0);
      assertTrue(range0.isEmpty());
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getGappedOffsetFor([BI)I: I27 Branch 24 IF_ICMPGE L302 - false
   * Goal 2. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getGappedOffsetFor([BI)I: I36 Branch 25 IF_ACMPEQ L303 - true
   */

  @Test
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte) (-61);
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      // Undeclared exception!
      try {
        int int0 = defaultNucleotideCodec0.getGappedOffsetFor(byteArray0, (int) (byte) (-61));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
      }
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.toString([B)Ljava/lang/String;: I114 Branch 30 IFEQ L354 - false
   */

  @Test
  public void test05()  throws Throwable  {
      Nucleotide nucleotide0 = Nucleotide.Purine;
      Set<Nucleotide> set0 = nucleotide0.getBasesFor();
      assertNotNull(set0);
      assertEquals(2, set0.size());
      assertFalse(set0.isEmpty());
      
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) set0);
      assertNotNull(byteArray0);
      assertEquals(2, set0.size());
      assertFalse(set0.isEmpty());
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)2, (byte)18}, byteArray0);
      
      String string0 = defaultNucleotideCodec0.toString(byteArray0);
      assertNotNull(string0);
      assertEquals(2, set0.size());
      assertFalse(set0.isEmpty());
      assertEquals("AG", string0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)2, (byte)18}, byteArray0);
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getEncodedByteForGlyph([BJ)B: I14 Branch 11 IF_ICMPLT L130 - false
   */

  @Test
  public void test06()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals(DefaultNucleotideCodec.INSTANCE, defaultNucleotideCodec0);
      
      Nucleotide nucleotide0 = Nucleotide.Cytosine;
      byte[] byteArray0 = defaultNucleotideCodec0.encode(nucleotide0);
      assertNotNull(byteArray0);
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)1, (byte) (-48)}, byteArray0);
      
      // Undeclared exception!
      try {
        Nucleotide nucleotide1 = defaultNucleotideCodec0.decode(byteArray0, 28L);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // index 28 corresponds to encodedIndex 18  encodedglyph length is 5
         //
      }
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.toString([B)Ljava/lang/String;: I37 Branch 29 IF_ICMPGE L344 - false
   */

  @Test
  public void test07()  throws Throwable  {
      Nucleotide nucleotide0 = Nucleotide.NotCytosine;
      Set<Nucleotide> set0 = nucleotide0.getBasesFor();
      assertNotNull(set0);
      assertFalse(set0.isEmpty());
      assertEquals(3, set0.size());
      
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) set0);
      assertNotNull(byteArray0);
      assertFalse(set0.isEmpty());
      assertEquals(3, set0.size());
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)3, (byte)18, (byte) (-32)}, byteArray0);
      
      String string0 = defaultNucleotideCodec0.toString(byteArray0);
      assertNotNull(string0);
      assertFalse(set0.isEmpty());
      assertEquals(3, set0.size());
      assertEquals("AGT", string0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)3, (byte)18, (byte) (-32)}, byteArray0);
  }

  //Test case number: 8
  /*
   * 2 covered goals:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getGappedOffsetFor([BI)I: I21 Branch 23 IFEQ L302 - false
   * Goal 2. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getGappedOffsetFor([BI)I: I27 Branch 24 IF_ICMPGE L302 - true
   */

  @Test
  public void test08()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals(DefaultNucleotideCodec.INSTANCE, defaultNucleotideCodec0);
      
      Nucleotide nucleotide0 = Nucleotide.Cytosine;
      byte[] byteArray0 = defaultNucleotideCodec0.encode(nucleotide0);
      assertNotNull(byteArray0);
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)1, (byte) (-48)}, byteArray0);
      
      int int0 = defaultNucleotideCodec0.getGappedOffsetFor(byteArray0, 4761);
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals(0, int0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)1, (byte) (-48)}, byteArray0);
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.<init>(Lorg/jcvi/jillion/core/residue/nt/DefaultNucleotideCodec;[BLorg/jcvi/jillion/core/Range;)V: I32 Branch 1 IFLT L369 - true
   */

  @Test
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Range range0 = Range.of((long) (byte) (-91), (long) (byte)0);
      assertNotNull(range0);
      assertFalse(range0.isEmpty());
      
      // Undeclared exception!
      try {
        Iterator<Nucleotide> iterator0 = defaultNucleotideCodec0.iterator(byteArray0, range0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // range [ -91 .. 0 ]/0B is out of range of sequence which is only [ 0 .. -1 ]/0B
         //
      }
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getNumberOfGaps([B)I: I26 Branch 21 IF_ACMPNE L263 - false
   */

  @Test
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[3] = (byte) (-15);
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      // Undeclared exception!
      try {
        long long0 = defaultNucleotideCodec0.getUngappedLength(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
      }
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.toString([B)Ljava/lang/String;: I12 Branch 28 IFNE L337 - false
   */

  @Test
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[13];
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      String string0 = defaultNucleotideCodec0.toString(byteArray0);
      assertNotNull(string0);
      assertEquals("", string0);
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.computeEncodedIndexForGlyph(J)I: I8 Branch 12 IFGE L136 - false
   */

  @Test
  public void test12()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals(DefaultNucleotideCodec.INSTANCE, defaultNucleotideCodec0);
      
      Nucleotide nucleotide0 = Nucleotide.Guanine;
      byte[] byteArray0 = defaultNucleotideCodec0.encode(nucleotide0);
      assertNotNull(byteArray0);
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)1, (byte)32}, byteArray0);
      
      // Undeclared exception!
      try {
        Nucleotide nucleotide1 = defaultNucleotideCodec0.decode(byteArray0, (-2L));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // index can not be negative: -2
         //
      }
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getNumberOfGapsUntil([BI)I: I30 Branch 27 IF_ICMPGT L318 - true
   */

  @Test
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[3] = (byte)8;
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      int int0 = defaultNucleotideCodec0.getUngappedOffsetFor(byteArray0, (-20));
      assertEquals((-20), int0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)8, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.decode(BZ)Lorg/jcvi/jillion/core/residue/nt/Nucleotide;: I12 Branch 10 IFEQ L123 - true
   */

  @Test
  public void test14()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals(DefaultNucleotideCodec.INSTANCE, defaultNucleotideCodec0);
      
      Nucleotide nucleotide0 = Nucleotide.Cytosine;
      byte[] byteArray0 = defaultNucleotideCodec0.encode(nucleotide0);
      assertNotNull(byteArray0);
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)1, (byte) (-48)}, byteArray0);
      
      long long0 = defaultNucleotideCodec0.getUngappedLength(byteArray0);
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals(1L, long0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)1, (byte) (-48)}, byteArray0);
      
      Nucleotide nucleotide1 = defaultNucleotideCodec0.decode(byteArray0, 1L);
      assertFalse(nucleotide1.equals((Object)nucleotide0));
      assertFalse(nucleotide0.equals((Object)nucleotide1));
      assertTrue(nucleotide1.isGap());
      assertEquals(11, nucleotide1.ordinal());
      assertEquals("-", nucleotide1.toString());
      assertEquals("Gap", nucleotide1.name());
      assertFalse(nucleotide1.isAmbiguity());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertNotSame(nucleotide1, nucleotide0);
      assertNotSame(nucleotide0, nucleotide1);
      assertEquals(Nucleotide.Gap, nucleotide1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)1, (byte) (-48)}, byteArray0);
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.encodeFinalByte(Ljava/util/Iterator;ILjava/nio/ByteBuffer;)V: I6 Branch 14 IFLE L200 - true
   */

  @Test
  public void test15()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals(DefaultNucleotideCodec.INSTANCE, defaultNucleotideCodec0);
      
      Nucleotide nucleotide0 = Nucleotide.Gap;
      Set<Nucleotide> set0 = nucleotide0.getAllPossibleAmbiguities();
      assertNotNull(set0);
      assertTrue(set0.isEmpty());
      assertEquals(0, set0.size());
      
      byte[] byteArray0 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) set0);
      assertNotNull(byteArray0);
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertTrue(set0.isEmpty());
      assertEquals(0, set0.size());
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.encodeFinalByte(Ljava/util/Iterator;ILjava/nio/ByteBuffer;)V: I20 Branch 15 IFEQ L202 - false
   */

  @Test
  public void test16()  throws Throwable  {
      Nucleotide nucleotide0 = Nucleotide.Weak;
      Set<Nucleotide> set0 = nucleotide0.getBasesFor();
      assertNotNull(set0);
      assertFalse(set0.isEmpty());
      assertEquals(2, set0.size());
      
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      byte[] byteArray0 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) set0);
      assertNotNull(byteArray0);
      assertFalse(set0.isEmpty());
      assertEquals(2, set0.size());
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)2, (byte)30}, byteArray0);
  }

  //Test case number: 17
  /*
   * 7 covered goals:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getGapOffsets([B)Ljava/util/List;: I32 Branch 19 IF_ACMPNE L246 - false
   * Goal 2. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getNumberOfGapsUntil([BI)I: I17 Branch 26 IFEQ L317 - false
   * Goal 3. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getNumberOfGapsUntil([BI)I: I30 Branch 27 IF_ICMPGT L318 - false
   * Goal 4. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.next()Lorg/jcvi/jillion/core/residue/nt/Nucleotide;: I26 Branch 7 IFEQ L399 - true
   * Goal 5. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.next()Lorg/jcvi/jillion/core/residue/nt/Nucleotide;: I69 Branch 8 IFEQ L405 - false
   * Goal 6. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.next()Lorg/jcvi/jillion/core/residue/nt/Nucleotide;: I75 Branch 9 IFEQ L405 - true
   * Goal 7. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.next()Lorg/jcvi/jillion/core/residue/nt/Nucleotide;: I75 Branch 9 IFEQ L405 - false
   */

  @Test
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[3] = (byte)8;
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      int int0 = defaultNucleotideCodec0.getUngappedOffsetFor(byteArray0, (int) (byte)8);
      assertEquals(0, int0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)8, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  //Test case number: 18
  /*
   * 4 covered goals:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.encode(ILjava/util/Iterator;)[B: root-Branch
   * Goal 2. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.computeEncodedSize(I)I: I14 Branch 16 IFEQ L211 - false
   * Goal 3. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.<init>(Lorg/jcvi/jillion/core/residue/nt/DefaultNucleotideCodec;[B)V: I31 Branch 4 IFEQ L382 - true
   * Goal 4. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.next()Lorg/jcvi/jillion/core/residue/nt/Nucleotide;: I7 Branch 6 IFNE L395 - false
   */

  @Test
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Iterator<Nucleotide> iterator0 = defaultNucleotideCodec0.iterator(byteArray0);
      assertNotNull(iterator0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      
      // Undeclared exception!
      try {
        byte[] byteArray1 = defaultNucleotideCodec0.encode(8, iterator0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no more elements
         //
      }
  }

  //Test case number: 19
  /*
   * 15 covered goals:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.encodeGlyphs(Ljava/util/Iterator;II)[B: root-Branch
   * Goal 2. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getUngappedLength([B)J: root-Branch
   * Goal 3. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.encodeNext2Values(Ljava/util/Iterator;Ljava/nio/ByteBuffer;)V: root-Branch
   * Goal 4. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.encode(Ljava/util/Collection;)[B: root-Branch
   * Goal 5. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.encodeAllButTheLastByte(Ljava/util/Iterator;ILjava/nio/ByteBuffer;)V: I12 Branch 13 IF_ICMPGE L186 - true
   * Goal 6. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.encodeAllButTheLastByte(Ljava/util/Iterator;ILjava/nio/ByteBuffer;)V: I12 Branch 13 IF_ICMPGE L186 - false
   * Goal 7. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.encodeFinalByte(Ljava/util/Iterator;ILjava/nio/ByteBuffer;)V: I6 Branch 14 IFLE L200 - false
   * Goal 8. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.encodeFinalByte(Ljava/util/Iterator;ILjava/nio/ByteBuffer;)V: I20 Branch 15 IFEQ L202 - true
   * Goal 9. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.computeEncodedSize(I)I: I14 Branch 16 IFEQ L211 - true
   * Goal 10. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getNumberOfGaps([B)I: I17 Branch 20 IFEQ L262 - true
   * Goal 11. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getNumberOfGaps([B)I: I17 Branch 20 IFEQ L262 - false
   * Goal 12. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getNumberOfGaps([B)I: I26 Branch 21 IF_ACMPNE L263 - true
   * Goal 13. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.toString([B)Ljava/lang/String;: I12 Branch 28 IFNE L337 - true
   * Goal 14. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.toString([B)Ljava/lang/String;: I37 Branch 29 IF_ICMPGE L344 - true
   * Goal 15. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.toString([B)Ljava/lang/String;: I114 Branch 30 IFEQ L354 - true
   */

  @Test
  public void test19()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals(DefaultNucleotideCodec.INSTANCE, defaultNucleotideCodec0);
      
      Nucleotide nucleotide0 = Nucleotide.Cytosine;
      byte[] byteArray0 = defaultNucleotideCodec0.encode(nucleotide0);
      assertNotNull(byteArray0);
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)1, (byte) (-48)}, byteArray0);
      
      Set<Nucleotide> set0 = nucleotide0.getAllPossibleAmbiguities();
      assertNotNull(set0);
      assertFalse(set0.isEmpty());
      assertEquals(7, set0.size());
      
      byte[] byteArray1 = defaultNucleotideCodec0.encode((Collection<Nucleotide>) set0);
      assertNotNull(byteArray1);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertFalse(set0.isEmpty());
      assertEquals(7, set0.size());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertNotSame(byteArray1, byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)7, (byte) (-9), (byte) (-104), (byte) (-85), (byte)48}, byteArray1);
      
      String string0 = defaultNucleotideCodec0.toString(byteArray0);
      assertNotNull(string0);
      assertFalse(byteArray0.equals((Object)byteArray1));
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertNotSame(byteArray0, byteArray1);
      assertEquals("C", string0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)1, (byte) (-48)}, byteArray0);
      
      long long0 = defaultNucleotideCodec0.getUngappedLength(byteArray0);
      assertFalse(byteArray0.equals((Object)byteArray1));
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertNotSame(byteArray0, byteArray1);
      assertEquals(1L, long0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)1, (byte) (-48)}, byteArray0);
  }

  //Test case number: 20
  /*
   * 14 covered goals:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.iterator([B)Ljava/util/Iterator;: root-Branch
   * Goal 2. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getUngappedOffsetFor([BI)I: root-Branch
   * Goal 3. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.isEven(J)Z: I10 Branch 17 IFNE L214 - true
   * Goal 4. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getGapOffsets([B)Ljava/util/List;: I23 Branch 18 IFEQ L245 - true
   * Goal 5. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getGapOffsets([B)Ljava/util/List;: I23 Branch 18 IFEQ L245 - false
   * Goal 6. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getGapOffsets([B)Ljava/util/List;: I32 Branch 19 IF_ACMPNE L246 - true
   * Goal 7. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.isGap([BI)Z: I11 Branch 22 IFLE L274 - true
   * Goal 8. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getNumberOfGapsUntil([BI)I: I17 Branch 26 IFEQ L317 - true
   * Goal 9. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.<init>(Lorg/jcvi/jillion/core/residue/nt/DefaultNucleotideCodec;[B)V: I31 Branch 4 IFEQ L382 - false
   * Goal 10. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.hasNext()Z: I9 Branch 5 IF_ICMPGE L390 - true
   * Goal 11. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.hasNext()Z: I9 Branch 5 IF_ICMPGE L390 - false
   * Goal 12. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.next()Lorg/jcvi/jillion/core/residue/nt/Nucleotide;: I7 Branch 6 IFNE L395 - true
   * Goal 13. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.next()Lorg/jcvi/jillion/core/residue/nt/Nucleotide;: I26 Branch 7 IFEQ L399 - false
   * Goal 14. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.next()Lorg/jcvi/jillion/core/residue/nt/Nucleotide;: I69 Branch 8 IFEQ L405 - true
   */

  @Test
  public void test20()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals(DefaultNucleotideCodec.INSTANCE, defaultNucleotideCodec0);
      
      Nucleotide nucleotide0 = Nucleotide.Cytosine;
      byte[] byteArray0 = defaultNucleotideCodec0.encode(nucleotide0);
      assertNotNull(byteArray0);
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)1, (byte) (-48)}, byteArray0);
      
      boolean boolean0 = defaultNucleotideCodec0.isGap(byteArray0, 8769);
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertFalse(boolean0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)1, (byte) (-48)}, byteArray0);
      
      int int0 = defaultNucleotideCodec0.getUngappedOffsetFor(byteArray0, 8769);
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals(8769, int0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)1, (byte) (-48)}, byteArray0);
  }

  //Test case number: 21
  /*
   * 4 covered goals:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.decodedLengthOf([B)I: root-Branch
   * Goal 2. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.iterator([BLorg/jcvi/jillion/core/Range;)Ljava/util/Iterator;: root-Branch
   * Goal 3. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.<init>(Lorg/jcvi/jillion/core/residue/nt/DefaultNucleotideCodec;[BLorg/jcvi/jillion/core/Range;)V: I32 Branch 1 IFLT L369 - false
   * Goal 4. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec$IteratorImpl.<init>(Lorg/jcvi/jillion/core/residue/nt/DefaultNucleotideCodec;[BLorg/jcvi/jillion/core/Range;)V: I41 Branch 2 IFLT L369 - false
   */

  @Test
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[13];
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      Range range0 = Range.ofLength((long) 15);
      assertNotNull(range0);
      assertFalse(range0.isEmpty());
      
      // Undeclared exception!
      try {
        Iterator<Nucleotide> iterator0 = defaultNucleotideCodec0.iterator(byteArray0, range0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // range [ 0 .. 14 ]/0B is out of range of sequence which is only [ 0 .. -1 ]/0B
         //
      }
  }

  //Test case number: 22
  /*
   * 8 covered goals:
   * Goal 1. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.decode([BJ)Lorg/jcvi/jillion/core/residue/nt/Nucleotide;: root-Branch
   * Goal 2. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.encodeLastValue(Lorg/jcvi/jillion/core/residue/nt/Nucleotide;Ljava/nio/ByteBuffer;)V: root-Branch
   * Goal 3. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.decodeNext2Values(B)[B: root-Branch
   * Goal 4. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.encode(Lorg/jcvi/jillion/core/residue/nt/Nucleotide;)[B: root-Branch
   * Goal 5. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.decode(BZ)Lorg/jcvi/jillion/core/residue/nt/Nucleotide;: I12 Branch 10 IFEQ L123 - false
   * Goal 6. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.getEncodedByteForGlyph([BJ)B: I14 Branch 11 IF_ICMPLT L130 - true
   * Goal 7. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.computeEncodedIndexForGlyph(J)I: I8 Branch 12 IFGE L136 - true
   * Goal 8. org.jcvi.jillion.core.residue.nt.DefaultNucleotideCodec.isEven(J)Z: I10 Branch 17 IFNE L214 - false
   */

  @Test
  public void test22()  throws Throwable  {
      DefaultNucleotideCodec defaultNucleotideCodec0 = DefaultNucleotideCodec.INSTANCE;
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals(DefaultNucleotideCodec.INSTANCE, defaultNucleotideCodec0);
      
      Nucleotide nucleotide0 = Nucleotide.Cytosine;
      byte[] byteArray0 = defaultNucleotideCodec0.encode(nucleotide0);
      assertNotNull(byteArray0);
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)1, (byte) (-48)}, byteArray0);
      
      Nucleotide nucleotide1 = defaultNucleotideCodec0.decode(byteArray0, 0L);
      assertEquals("INSTANCE", defaultNucleotideCodec0.toString());
      assertEquals("INSTANCE", defaultNucleotideCodec0.name());
      assertEquals(0, defaultNucleotideCodec0.ordinal());
      assertEquals(13, nucleotide1.ordinal());
      assertEquals("Cytosine", nucleotide1.name());
      assertFalse(nucleotide1.isGap());
      assertFalse(nucleotide1.isAmbiguity());
      assertEquals("C", nucleotide1.toString());
      assertSame(nucleotide1, nucleotide0);
      assertSame(nucleotide0, nucleotide1);
      assertEquals(Nucleotide.Cytosine, nucleotide1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)1, (byte) (-48)}, byteArray0);
  }
}

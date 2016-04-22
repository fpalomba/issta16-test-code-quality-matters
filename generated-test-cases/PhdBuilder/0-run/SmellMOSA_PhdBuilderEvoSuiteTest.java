/*
 * This file was automatically generated by EvoSuite
 */

package org.jcvi.jillion.assembly.consed.phd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jcvi.jillion.assembly.consed.phd.Phd;
import org.jcvi.jillion.assembly.consed.phd.PhdBuilder;
import org.jcvi.jillion.assembly.consed.phd.PhdReadTag;
import org.jcvi.jillion.assembly.consed.phd.PhdWholeReadItem;
import org.jcvi.jillion.core.pos.PositionSequence;
import org.jcvi.jillion.core.qual.QualitySequence;
import org.jcvi.jillion.core.residue.nt.NucleotideSequence;
import org.jcvi.jillion.internal.trace.chromat.BasicChromatogram;
import org.jcvi.jillion.internal.trace.chromat.DefaultChannel;
import org.jcvi.jillion.internal.trace.chromat.DefaultChannelGroup;
import org.jcvi.jillion.trace.chromat.Channel;
import org.jcvi.jillion.trace.chromat.ChannelGroup;
import org.jcvi.jillion.trace.chromat.Chromatogram;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class PhdBuilderEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      short[] shortArray0 = new short[9];
      DefaultChannel defaultChannel0 = new DefaultChannel(byteArray0, shortArray0);
      PositionSequence positionSequence0 = defaultChannel0.getPositions();
      DefaultChannelGroup defaultChannelGroup0 = new DefaultChannelGroup((Channel) defaultChannel0, (Channel) defaultChannel0, (Channel) defaultChannel0, (Channel) defaultChannel0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      BasicChromatogram basicChromatogram0 = new BasicChromatogram("", "", byteArray0, positionSequence0, (ChannelGroup) defaultChannelGroup0, (Map<String, String>) hashMap0);
      PhdBuilder phdBuilder0 = new PhdBuilder((Chromatogram) basicChromatogram0);
      ArrayList<PhdReadTag> arrayList0 = new ArrayList<PhdReadTag>();
      PhdBuilder phdBuilder1 = phdBuilder0.readTags((List<PhdReadTag>) arrayList0);
      assertSame(phdBuilder1, phdBuilder0);
  }

  @Test
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      short[] shortArray0 = new short[5];
      DefaultChannel defaultChannel0 = new DefaultChannel(byteArray0, shortArray0);
      PositionSequence positionSequence0 = defaultChannel0.getPositions();
      DefaultChannelGroup defaultChannelGroup0 = new DefaultChannelGroup((Channel) defaultChannel0, (Channel) defaultChannel0, (Channel) defaultChannel0, (Channel) defaultChannel0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      BasicChromatogram basicChromatogram0 = new BasicChromatogram("", "", byteArray0, positionSequence0, (ChannelGroup) defaultChannelGroup0, (Map<String, String>) hashMap0);
      PhdBuilder phdBuilder0 = new PhdBuilder((Chromatogram) basicChromatogram0);
      PhdBuilder phdBuilder1 = phdBuilder0.comments((Map<String, String>) hashMap0);
      assertSame(phdBuilder1, phdBuilder0);
  }

  @Test
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      short[] shortArray0 = new short[5];
      DefaultChannel defaultChannel0 = new DefaultChannel(byteArray0, shortArray0);
      PositionSequence positionSequence0 = defaultChannel0.getPositions();
      DefaultChannelGroup defaultChannelGroup0 = new DefaultChannelGroup((Channel) defaultChannel0, (Channel) defaultChannel0, (Channel) defaultChannel0, (Channel) defaultChannel0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      BasicChromatogram basicChromatogram0 = new BasicChromatogram("", "", byteArray0, positionSequence0, (ChannelGroup) defaultChannelGroup0, (Map<String, String>) hashMap0);
      PhdBuilder phdBuilder0 = new PhdBuilder((Chromatogram) basicChromatogram0);
      PhdBuilder phdBuilder1 = phdBuilder0.copy();
      assertFalse(phdBuilder1.equals(phdBuilder0));
  }

  @Test
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      short[] shortArray0 = new short[5];
      DefaultChannel defaultChannel0 = new DefaultChannel(byteArray0, shortArray0);
      PositionSequence positionSequence0 = defaultChannel0.getPositions();
      DefaultChannelGroup defaultChannelGroup0 = new DefaultChannelGroup((Channel) defaultChannel0, (Channel) defaultChannel0, (Channel) defaultChannel0, (Channel) defaultChannel0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      BasicChromatogram basicChromatogram0 = new BasicChromatogram("", "", byteArray0, positionSequence0, (ChannelGroup) defaultChannelGroup0, (Map<String, String>) hashMap0);
      PhdBuilder phdBuilder0 = new PhdBuilder((Chromatogram) basicChromatogram0);
      ArrayList<PhdWholeReadItem> arrayList0 = new ArrayList<PhdWholeReadItem>();
      PhdBuilder phdBuilder1 = phdBuilder0.wholeReadItems((List<PhdWholeReadItem>) arrayList0);
      assertSame(phdBuilder1, phdBuilder0);
  }

  @Test
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      short[] shortArray0 = new short[5];
      DefaultChannel defaultChannel0 = new DefaultChannel(byteArray0, shortArray0);
      PositionSequence positionSequence0 = defaultChannel0.getPositions();
      DefaultChannelGroup defaultChannelGroup0 = new DefaultChannelGroup((Channel) defaultChannel0, (Channel) defaultChannel0, (Channel) defaultChannel0, (Channel) defaultChannel0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      BasicChromatogram basicChromatogram0 = new BasicChromatogram("", "", byteArray0, positionSequence0, (ChannelGroup) defaultChannelGroup0, (Map<String, String>) hashMap0);
      PhdBuilder phdBuilder0 = new PhdBuilder((Chromatogram) basicChromatogram0);
      PhdBuilder phdBuilder1 = phdBuilder0.fakePeaks();
      assertSame(phdBuilder1, phdBuilder0);
  }

  @Test
  public void test5()  throws Throwable  {
      PhdBuilder phdBuilder0 = null;
      try {
        phdBuilder0 = new PhdBuilder("cgT", (NucleotideSequence) null, (QualitySequence) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
        /*
         * sequence can not be null
         */
      }
  }

  @Test
  public void test6()  throws Throwable  {
      PhdBuilder phdBuilder0 = null;
      try {
        phdBuilder0 = new PhdBuilder((String) null, (NucleotideSequence) null, (QualitySequence) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
        /*
         * id can not be null
         */
      }
  }

  @Test
  public void test7()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      short[] shortArray0 = new short[1];
      DefaultChannel defaultChannel0 = new DefaultChannel(byteArray0, shortArray0);
      PositionSequence positionSequence0 = defaultChannel0.getPositions();
      DefaultChannelGroup defaultChannelGroup0 = new DefaultChannelGroup((Channel) defaultChannel0, (Channel) defaultChannel0, (Channel) defaultChannel0, (Channel) defaultChannel0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      BasicChromatogram basicChromatogram0 = new BasicChromatogram("", "", byteArray0, positionSequence0, (ChannelGroup) defaultChannelGroup0, (Map<String, String>) hashMap0);
      NucleotideSequence nucleotideSequence0 = basicChromatogram0.getNucleotideSequence();
      PhdBuilder phdBuilder0 = null;
      try {
        phdBuilder0 = new PhdBuilder("", nucleotideSequence0, (QualitySequence) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
        /*
         * qualities can not be null
         */
      }
  }

  @Test
  public void test8()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      short[] shortArray0 = new short[2];
      DefaultChannel defaultChannel0 = new DefaultChannel(byteArray0, shortArray0);
      PositionSequence positionSequence0 = defaultChannel0.getPositions();
      DefaultChannelGroup defaultChannelGroup0 = new DefaultChannelGroup((Channel) defaultChannel0, (Channel) defaultChannel0, (Channel) defaultChannel0, (Channel) defaultChannel0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      QualitySequence qualitySequence0 = defaultChannel0.getConfidence();
      BasicChromatogram basicChromatogram0 = new BasicChromatogram("", "", byteArray0, positionSequence0, (ChannelGroup) defaultChannelGroup0, (Map<String, String>) hashMap0);
      NucleotideSequence nucleotideSequence0 = basicChromatogram0.getNucleotideSequence();
      PhdBuilder phdBuilder0 = null;
      try {
        phdBuilder0 = new PhdBuilder("", nucleotideSequence0, qualitySequence0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * sequence and qualities have unequal lengths
         */
      }
  }

  @Test
  public void test9()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      short[] shortArray0 = new short[9];
      DefaultChannel defaultChannel0 = new DefaultChannel(byteArray0, shortArray0);
      PositionSequence positionSequence0 = defaultChannel0.getPositions();
      DefaultChannelGroup defaultChannelGroup0 = new DefaultChannelGroup((Channel) defaultChannel0, (Channel) defaultChannel0, (Channel) defaultChannel0, (Channel) defaultChannel0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      BasicChromatogram basicChromatogram0 = new BasicChromatogram("m", "m", byteArray0, positionSequence0, (ChannelGroup) defaultChannelGroup0, (Map<String, String>) hashMap0);
      NucleotideSequence nucleotideSequence0 = basicChromatogram0.getNucleotideSequence();
      QualitySequence qualitySequence0 = defaultChannel0.getConfidence();
      PhdBuilder phdBuilder0 = new PhdBuilder("", nucleotideSequence0, qualitySequence0);
      assertNotNull(phdBuilder0);
  }

  @Test
  public void test10()  throws Throwable  {
      PhdBuilder phdBuilder0 = null;
      try {
        phdBuilder0 = new PhdBuilder((Chromatogram) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
        /*
         * chromatogram can not be null
         */
      }
  }

  @Test
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      short[] shortArray0 = new short[5];
      DefaultChannel defaultChannel0 = new DefaultChannel(byteArray0, shortArray0);
      PositionSequence positionSequence0 = defaultChannel0.getPositions();
      DefaultChannelGroup defaultChannelGroup0 = new DefaultChannelGroup((Channel) defaultChannel0, (Channel) defaultChannel0, (Channel) defaultChannel0, (Channel) defaultChannel0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      BasicChromatogram basicChromatogram0 = new BasicChromatogram("", "", byteArray0, positionSequence0, (ChannelGroup) defaultChannelGroup0, (Map<String, String>) hashMap0);
      PhdBuilder phdBuilder0 = new PhdBuilder((Chromatogram) basicChromatogram0);
      Phd phd0 = (Phd)phdBuilder0.build();
      PhdBuilder phdBuilder1 = new PhdBuilder(phd0);
      assertFalse(phdBuilder1.equals(phdBuilder0));
  }

  @Test
  public void test12()  throws Throwable  {
      PhdBuilder phdBuilder0 = null;
      try {
        phdBuilder0 = new PhdBuilder((Phd) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
        /*
         * phd to copy can not be null
         */
      }
  }

  @Test
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      short[] shortArray0 = new short[4];
      DefaultChannel defaultChannel0 = new DefaultChannel(byteArray0, shortArray0);
      PositionSequence positionSequence0 = defaultChannel0.getPositions();
      DefaultChannelGroup defaultChannelGroup0 = new DefaultChannelGroup((Channel) defaultChannel0, (Channel) defaultChannel0, (Channel) defaultChannel0, (Channel) defaultChannel0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      BasicChromatogram basicChromatogram0 = new BasicChromatogram("", "", byteArray0, positionSequence0, (ChannelGroup) defaultChannelGroup0, (Map<String, String>) hashMap0);
      PhdBuilder phdBuilder0 = new PhdBuilder((Chromatogram) basicChromatogram0);
      PhdBuilder phdBuilder1 = phdBuilder0.peaks((PositionSequence) null);
      assertSame(phdBuilder1, phdBuilder0);
  }

  @Test
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      short[] shortArray0 = new short[1];
      DefaultChannel defaultChannel0 = new DefaultChannel(byteArray0, shortArray0);
      PositionSequence positionSequence0 = defaultChannel0.getPositions();
      DefaultChannelGroup defaultChannelGroup0 = new DefaultChannelGroup((Channel) defaultChannel0, (Channel) defaultChannel0, (Channel) defaultChannel0, (Channel) defaultChannel0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      BasicChromatogram basicChromatogram0 = new BasicChromatogram("", "", byteArray0, positionSequence0, (ChannelGroup) defaultChannelGroup0, (Map<String, String>) hashMap0);
      PhdBuilder phdBuilder0 = new PhdBuilder((Chromatogram) basicChromatogram0);
      PhdBuilder phdBuilder1 = phdBuilder0.peaks(positionSequence0);
      assertSame(phdBuilder1, phdBuilder0);
  }

  @Test
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      short[] shortArray0 = new short[5];
      DefaultChannel defaultChannel0 = new DefaultChannel(byteArray0, shortArray0);
      PositionSequence positionSequence0 = defaultChannel0.getPositions();
      DefaultChannelGroup defaultChannelGroup0 = new DefaultChannelGroup((Channel) defaultChannel0, (Channel) defaultChannel0, (Channel) defaultChannel0, (Channel) defaultChannel0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      BasicChromatogram basicChromatogram0 = new BasicChromatogram("", "", byteArray0, positionSequence0, (ChannelGroup) defaultChannelGroup0, (Map<String, String>) hashMap0);
      PhdBuilder phdBuilder0 = new PhdBuilder((Chromatogram) basicChromatogram0);
      // Undeclared exception!
      try {
        phdBuilder0.peaks(positionSequence0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * peaks and qualities have unequal lengths
         */
      }
  }

  @Test
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      short[] shortArray0 = new short[9];
      DefaultChannel defaultChannel0 = new DefaultChannel(byteArray0, shortArray0);
      PositionSequence positionSequence0 = defaultChannel0.getPositions();
      DefaultChannelGroup defaultChannelGroup0 = new DefaultChannelGroup((Channel) defaultChannel0, (Channel) defaultChannel0, (Channel) defaultChannel0, (Channel) defaultChannel0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      BasicChromatogram basicChromatogram0 = new BasicChromatogram("", "", byteArray0, positionSequence0, (ChannelGroup) defaultChannelGroup0, (Map<String, String>) hashMap0);
      PhdBuilder phdBuilder0 = new PhdBuilder((Chromatogram) basicChromatogram0);
      // Undeclared exception!
      try {
        phdBuilder0.fakePeaks((int) (short)0, (int) (short)0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * first peak position must be >0
         */
      }
  }

  @Test
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      short[] shortArray0 = new short[4];
      DefaultChannel defaultChannel0 = new DefaultChannel(byteArray0, shortArray0);
      PositionSequence positionSequence0 = defaultChannel0.getPositions();
      DefaultChannelGroup defaultChannelGroup0 = new DefaultChannelGroup((Channel) defaultChannel0, (Channel) defaultChannel0, (Channel) defaultChannel0, (Channel) defaultChannel0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      BasicChromatogram basicChromatogram0 = new BasicChromatogram("", "", byteArray0, positionSequence0, (ChannelGroup) defaultChannelGroup0, (Map<String, String>) hashMap0);
      PhdBuilder phdBuilder0 = new PhdBuilder((Chromatogram) basicChromatogram0);
      // Undeclared exception!
      try {
        phdBuilder0.fakePeaks((int) (short)15, (int) (short)0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * peak spacing must be >0
         */
      }
  }

  @Test
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      short[] shortArray0 = new short[5];
      DefaultChannel defaultChannel0 = new DefaultChannel(byteArray0, shortArray0);
      PositionSequence positionSequence0 = defaultChannel0.getPositions();
      DefaultChannelGroup defaultChannelGroup0 = new DefaultChannelGroup((Channel) defaultChannel0, (Channel) defaultChannel0, (Channel) defaultChannel0, (Channel) defaultChannel0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      BasicChromatogram basicChromatogram0 = new BasicChromatogram("", "", byteArray0, positionSequence0, (ChannelGroup) defaultChannelGroup0, (Map<String, String>) hashMap0);
      PhdBuilder phdBuilder0 = new PhdBuilder((Chromatogram) basicChromatogram0);
      phdBuilder0.fakePeaks(1, (int) (byte)106);
      Phd phd0 = (Phd)phdBuilder0.build();
      assertEquals("", phd0.getId());
  }
}

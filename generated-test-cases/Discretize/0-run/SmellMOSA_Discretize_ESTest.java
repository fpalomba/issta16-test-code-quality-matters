/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 12 21:06:33 GMT 2015
 */

package weka.filters.unsupervised.attribute;

import static org.junit.Assert.*;
import org.junit.Test;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import weka.core.BinarySparseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.Discretize;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Discretize_ESTest extends Discretize_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.invertSelectionTipText()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test00()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.invertSelectionTipText();
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertEquals("Set attribute selection mode. If false, only selected (numeric) attributes in the range will be discretized; if true, only non-selected attributes will be discretized.", string0);
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01D);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.getBinRangesString(I)Ljava/lang/String;: I7 Branch 26 IFNONNULL L756 - false
   */

  @Test
  public void test01()  throws Throwable  {
      Discretize discretize0 = new Discretize("Set attribute selection mode.If false,only selectId(numeric) attributes i0 the range will be discretized; if true,only non-seleDted attributes will6be discFetized.");
      String string0 = discretize0.getBinRangesString((-4109));
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01D);
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseBinNumbers());
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.getCapabilities()Lweka/core/Capabilities;: I34 Branch 13 IFNE L347 - false
   * Goal 2. weka.filters.unsupervised.attribute.Discretize.setInputFormat(Lweka/core/Instances;)Z: I7 Branch 14 IFEQ L364 - true
   */

  @Test
  public void test02()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      try {
        boolean boolean0 = discretize0.setInputFormat((Instances) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.batchFinished()Z: I7 Branch 21 IFNONNULL L423 - false
   */

  @Test
  public void test03()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      // Undeclared exception!
      try {
        boolean boolean0 = discretize0.batchFinished();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No input instance format defined
         //
      }
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.findNumBinsTipText()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test04()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.findNumBinsTipText();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01D);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getMakeBinary());
      assertEquals(10, discretize0.getBins());
      assertEquals("Optimize number of equal-width bins using leave-one-out. Doesn't work for equal-frequency binning", string0);
  }

  //Test case number: 5
  /*
   * 3 covered goals:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.getCapabilities()Lweka/core/Capabilities;: I34 Branch 13 IFNE L347 - true
   * Goal 2. weka.filters.unsupervised.attribute.Discretize.setInputFormat(Lweka/core/Instances;)Z: I7 Branch 14 IFEQ L364 - false
   * Goal 3. weka.filters.unsupervised.attribute.Discretize.setInputFormat(Lweka/core/Instances;)Z: I13 Branch 15 IFEQ L364 - true
   */

  @Test
  public void test05()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.m_MakeBinary = true;
      try {
        boolean boolean0 = discretize0.setInputFormat((Instances) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.getCutPoints(I)[D: I7 Branch 25 IFNONNULL L741 - true
   */

  @Test
  public void test06()  throws Throwable  {
      Discretize discretize0 = new Discretize("Set attribute selection mode. If false,only selectId (numeric) attributes i0 the range will be discretized; if true,only non-seleDted attributes will6be discFetized.");
      double[][] doubleArray0 = new double[4][2];
      discretize0.m_CutPoints = doubleArray0;
      double[] doubleArray1 = discretize0.getCutPoints(0);
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01D);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.getCutPoints(I)[D: I7 Branch 25 IFNONNULL L741 - false
   */

  @Test
  public void test07()  throws Throwable  {
      Discretize discretize0 = new Discretize("NP < (NP $ SBAsba < (N < /^(?:afte|before|util|sine|during)$/ ++ S)))");
      double[] doubleArray0 = discretize0.getCutPoints(3484);
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01D);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.attributeIndicesTipText()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test08()  throws Throwable  {
      Discretize discretize0 = new Discretize("heckig for remaing HptonH..");
      String string0 = discretize0.attributeIndicesTipText();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01D);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals("Specify range of attributes to act on. This is a comma separated list of attribute indices, with \"first\" and \"last\" valid values. Specify an inclusive range with \"-\". E.g: \"first-3,5,6-10,last\".", string0);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.makeBinaryTipText()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test09()  throws Throwable  {
      Discretize discretize0 = new Discretize("NP < (NP $+ SBARsbar < (N < /^(?i:afte|before|until|since|during)/ ++ S)))");
      String string0 = discretize0.makeBinaryTipText();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01D);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals("Make resulting attributes binary.", string0);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.useBinNumbersTipText()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test10()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.useBinNumbersTipText();
      assertEquals(10, discretize0.getBins());
      assertEquals("Use bin numbers (eg BXofY) rather than ranges for for discretized attributes", string0);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getMakeBinary());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01D);
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.main([Ljava/lang/String;)V: root-Branch
   */

  @Test
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[5];
      Discretize.main(stringArray0);
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.getOptions()[Ljava/lang/String;: I45 Branch 7 IFEQ L301 - false
   */

  @Test
  public void test12()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      assertFalse(discretize0.getMakeBinary());
      
      discretize0.setMakeBinary(true);
      String[] stringArray0 = discretize0.getOptions();
      assertTrue(discretize0.getMakeBinary());
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.getOptions()[Ljava/lang/String;: I73 Branch 9 IFEQ L307 - false
   */

  @Test
  public void test13()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      boolean boolean0 = FileSystemHandling.shouldAllThrowIOExceptions();
      discretize0.m_UseEqualFrequency = true;
      String[] stringArray0 = discretize0.getOptions();
      assertTrue(discretize0.getUseEqualFrequency());
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.getOptions()[Ljava/lang/String;: I59 Branch 8 IFEQ L304 - false
   */

  @Test
  public void test14()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      assertFalse(discretize0.getUseBinNumbers());
      
      discretize0.setUseBinNumbers(true);
      String[] stringArray0 = discretize0.getOptions();
      assertTrue(discretize0.getUseBinNumbers());
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.getRevision()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test15()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.getRevision();
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getMakeBinary());
      assertEquals("8964", string0);
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01D);
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.setOutputFormat()V: I7 Branch 79 IFNONNULL L1047 - true
   */

  @Test
  public void test16()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      double[][] doubleArray0 = new double[7][8];
      discretize0.m_CutPoints = doubleArray0;
      // Undeclared exception!
      try {
        discretize0.setOutputFormat();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.getOptions()[Ljava/lang/String;: I101 Branch 11 IFEQ L313 - false
   */

  @Test
  public void test17()  throws Throwable  {
      Discretize discretize0 = new Discretize("Set attribute selection mode. If false,only selectId (numeric) attributes i0 the range will be discretized; if true,only noe-seleDted attributes will6be discFetized.");
      discretize0.setInvertSelection(true);
      String[] stringArray0 = discretize0.getOptions();
      assertTrue(discretize0.getInvertSelection());
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.getOptions()[Ljava/lang/String;: I157 Branch 12 IFGT L322 - true
   */

  @Test
  public void test18()  throws Throwable  {
      Discretize discretize0 = new Discretize("");
      String[] stringArray0 = discretize0.getOptions();
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getMakeBinary());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01D);
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.desiredWeightOfInstancesPerIntervalTipText()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test19()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.desiredWeightOfInstancesPerIntervalTipText();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01D);
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals("Sets the desired weight of instances per interval for equal-frequency binning.", string0);
      assertEquals(10, discretize0.getBins());
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.getBinRangesString(I)Ljava/lang/String;: I7 Branch 26 IFNONNULL L756 - true
   */

  @Test
  public void test20()  throws Throwable  {
      Discretize discretize0 = new Discretize("pram");
      double[][] doubleArray0 = new double[4][4];
      discretize0.m_CutPoints = doubleArray0;
      // Undeclared exception!
      try {
        String string0 = discretize0.getBinRangesString(798);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 798
         //
      }
  }

  //Test case number: 21
  /*
   * 1 covered goal:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.useEqualFrequencyTipText()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test21()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.useEqualFrequencyTipText();
      assertEquals(10, discretize0.getBins());
      assertEquals("If set to true, equal-frequency binning will be used instead of equal-width binning.", string0);
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01D);
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseBinNumbers());
  }

  //Test case number: 22
  /*
   * 1 covered goal:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.binsTipText()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test22()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.binsTipText();
      assertEquals("Number of bins.", string0);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01D);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
  }

  //Test case number: 23
  /*
   * 1 covered goal:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.input(Lweka/core/Instance;)Z: I7 Branch 18 IFNONNULL L396 - false
   */

  @Test
  public void test23()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(229);
      // Undeclared exception!
      try {
        boolean boolean0 = discretize0.input((Instance) binarySparseInstance0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No input instance format defined
         //
      }
  }

  //Test case number: 24
  /*
   * 1 covered goal:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.setAttributeIndicesArray([I)V: root-Branch
   */

  @Test
  public void test24()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      int[] intArray0 = new int[2];
      discretize0.setAttributeIndicesArray(intArray0);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01D);
      assertFalse(discretize0.getUseBinNumbers());
  }

  //Test case number: 25
  /*
   * 1 covered goal:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.setOutputFormat()V: I7 Branch 79 IFNONNULL L1047 - false
   */

  @Test
  public void test25()  throws Throwable  {
      Discretize discretize0 = new Discretize("Set attribute selection mode. If false,only selectId (numeric) attributes i0 the range will be discretized; if true,only non-seleDted attributes will6be discFetized.");
      discretize0.setOutputFormat();
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getMakeBinary());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01D);
  }

  //Test case number: 26
  /*
   * 1 covered goal:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.globalInfo()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test26()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.globalInfo();
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals("An instance filter that discretizes a range of numeric attributes in the dataset into nominal attributes. Discretization is by simple binning. Skips the class attribute if set.", string0);
      assertFalse(discretize0.getMakeBinary());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01D);
  }

  //Test case number: 27
  /*
   * 1 covered goal:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.getOptions()[Ljava/lang/String;: I87 Branch 10 IFEQ L310 - false
   */

  @Test
  public void test27()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.m_FindNumBins = true;
      String[] stringArray0 = discretize0.getOptions();
      assertTrue(discretize0.getFindNumBins());
  }

  //Test case number: 28
  /*
   * 20 covered goals:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.getDesiredWeightOfInstancesPerInterval()D: root-Branch
   * Goal 2. weka.filters.unsupervised.attribute.Discretize.<init>(Ljava/lang/String;)V: root-Branch
   * Goal 3. weka.filters.unsupervised.attribute.Discretize.getFindNumBins()Z: root-Branch
   * Goal 4. weka.filters.unsupervised.attribute.Discretize.getBins()I: root-Branch
   * Goal 5. weka.filters.unsupervised.attribute.Discretize.getInvertSelection()Z: root-Branch
   * Goal 6. weka.filters.unsupervised.attribute.Discretize.getUseEqualFrequency()Z: root-Branch
   * Goal 7. weka.filters.unsupervised.attribute.Discretize.getAttributeIndices()Ljava/lang/String;: root-Branch
   * Goal 8. weka.filters.unsupervised.attribute.Discretize.getUseBinNumbers()Z: root-Branch
   * Goal 9. weka.filters.unsupervised.attribute.Discretize.getMakeBinary()Z: root-Branch
   * Goal 10. weka.filters.unsupervised.attribute.Discretize.setOptions([Ljava/lang/String;)V: I53 Branch 2 IFEQ L260 - false
   * Goal 11. weka.filters.unsupervised.attribute.Discretize.setOptions([Ljava/lang/String;)V: I85 Branch 3 IFEQ L267 - false
   * Goal 12. weka.filters.unsupervised.attribute.Discretize.setOptions([Ljava/lang/String;)V: I114 Branch 4 IFEQ L274 - false
   * Goal 13. weka.filters.unsupervised.attribute.Discretize.getOptions()[Ljava/lang/String;: I22 Branch 6 IF_ICMPGE L298 - true
   * Goal 14. weka.filters.unsupervised.attribute.Discretize.getOptions()[Ljava/lang/String;: I22 Branch 6 IF_ICMPGE L298 - false
   * Goal 15. weka.filters.unsupervised.attribute.Discretize.getOptions()[Ljava/lang/String;: I45 Branch 7 IFEQ L301 - true
   * Goal 16. weka.filters.unsupervised.attribute.Discretize.getOptions()[Ljava/lang/String;: I59 Branch 8 IFEQ L304 - true
   * Goal 17. weka.filters.unsupervised.attribute.Discretize.getOptions()[Ljava/lang/String;: I73 Branch 9 IFEQ L307 - true
   * Goal 18. weka.filters.unsupervised.attribute.Discretize.getOptions()[Ljava/lang/String;: I87 Branch 10 IFEQ L310 - true
   * Goal 19. weka.filters.unsupervised.attribute.Discretize.getOptions()[Ljava/lang/String;: I101 Branch 11 IFEQ L313 - true
   * Goal 20. weka.filters.unsupervised.attribute.Discretize.getOptions()[Ljava/lang/String;: I157 Branch 12 IFGT L322 - false
   */

  @Test
  public void test28()  throws Throwable  {
      Discretize discretize0 = new Discretize("Optimize umber of eual-width bins us]ng leave-one-out. Dosn't work for equal-frequenct binning");
      discretize0.setIgnoreClass(true);
      String[] stringArray0 = discretize0.getOptions();
      Filter.runFilter((Filter) discretize0, stringArray0);
      assertTrue(discretize0.getIgnoreClass());
  }

  //Test case number: 29
  /*
   * 15 covered goals:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.setAttributeIndices(Ljava/lang/String;)V: root-Branch
   * Goal 2. weka.filters.unsupervised.attribute.Discretize.<init>()V: root-Branch
   * Goal 3. weka.filters.unsupervised.attribute.Discretize.setUseBinNumbers(Z)V: root-Branch
   * Goal 4. weka.filters.unsupervised.attribute.Discretize.setUseEqualFrequency(Z)V: root-Branch
   * Goal 5. weka.filters.unsupervised.attribute.Discretize.setDesiredWeightOfInstancesPerInterval(D)V: root-Branch
   * Goal 6. weka.filters.unsupervised.attribute.Discretize.setMakeBinary(Z)V: root-Branch
   * Goal 7. weka.filters.unsupervised.attribute.Discretize.setInvertSelection(Z)V: root-Branch
   * Goal 8. weka.filters.unsupervised.attribute.Discretize.setBins(I)V: root-Branch
   * Goal 9. weka.filters.unsupervised.attribute.Discretize.setFindNumBins(Z)V: root-Branch
   * Goal 10. weka.filters.unsupervised.attribute.Discretize.listOptions()Ljava/util/Enumeration;: I18 Branch 1 IFEQ L154 - true
   * Goal 11. weka.filters.unsupervised.attribute.Discretize.listOptions()Ljava/util/Enumeration;: I18 Branch 1 IFEQ L154 - false
   * Goal 12. weka.filters.unsupervised.attribute.Discretize.setOptions([Ljava/lang/String;)V: I53 Branch 2 IFEQ L260 - true
   * Goal 13. weka.filters.unsupervised.attribute.Discretize.setOptions([Ljava/lang/String;)V: I85 Branch 3 IFEQ L267 - true
   * Goal 14. weka.filters.unsupervised.attribute.Discretize.setOptions([Ljava/lang/String;)V: I114 Branch 4 IFEQ L274 - true
   * Goal 15. weka.filters.unsupervised.attribute.Discretize.setOptions([Ljava/lang/String;)V: I137 Branch 5 IFNULL L280 - true
   */

  @Test
  public void test29()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      try {
        Filter.filterFile((Filter) discretize0, (String[]) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 
         // Unable to determine structure as arff (Reason: org.evosuite.runtime.mock.java.lang.MockThrowable: premature end of file, read Token[EOF], line 1).
         // Filter options:
         // 
         // -unset-class-temporarily
         // \tUnsets the class index temporarily before the filter is
         // \tapplied to the data.
         // \t(default: no)
         // -B <num>
         // \tSpecifies the (maximum) number of bins to divide numeric attributes into.
         // \t(default = 10)
         // -M <num>
         // \tSpecifies the desired weight of instances per bin for
         // \tequal-frequency binning. If this is set to a positive
         // \tnumber then the -B option will be ignored.
         // \t(default = -1)
         // -F
         // \tUse equal-frequency instead of equal-width discretization.
         // -O
         // \tOptimize number of bins using leave-one-out estimate
         // \tof estimated entropy (for equal-width discretization).
         // \tIf this is set then the -B option will be ignored.
         // -R <col1,col2-col4,...>
         // \tSpecifies list of columns to Discretize. First and last are valid indexes.
         // \t(default: first-last)
         // -V
         // \tInvert matching sense of column indexes.
         // -D
         // \tOutput binary attributes for discretized attributes.
         // -Y
         // \tUse bin numbers rather than ranges for discretized attributes.
         // 
         // General options:
         // 
         // -h
         // \tGet help on available options.
         // \t(use -b -h for help on batch mode.)
         // -i <file>
         // \tThe name of the file containing input instances.
         // \tIf not supplied then instances will be read from stdin.
         // -o <file>
         // \tThe name of the file output instances will be written to.
         // \tIf not supplied then instances will be written to stdout.
         // -c <class index>
         // \tThe number of the attribute to use as the class.
         // \t\"first\" and \"last\" are also valid entries.
         // \tIf not supplied then no class is assigned.
         //
      }
  }
}

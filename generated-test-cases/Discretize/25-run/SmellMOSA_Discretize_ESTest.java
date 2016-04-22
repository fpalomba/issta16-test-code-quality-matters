/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 12 22:29:07 GMT 2015
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
import org.junit.runner.RunWith;
import weka.core.Attribute;
import weka.core.Capabilities;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.Discretize;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Discretize_ESTest extends Discretize_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 3 covered goals:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.getCapabilities()Lweka/core/Capabilities;: I34 Branch 13 IFNE L347 - true
   * Goal 2. weka.filters.unsupervised.attribute.Discretize.setInputFormat(Lweka/core/Instances;)Z: I7 Branch 14 IFEQ L364 - false
   * Goal 3. weka.filters.unsupervised.attribute.Discretize.setInputFormat(Lweka/core/Instances;)Z: I13 Branch 15 IFEQ L364 - true
   */

  @Test
  public void test00()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setMakeBinary(true);
      Attribute attribute0 = new Attribute("first-last");
      Instances instances0 = attribute0.relation();
      try {
        boolean boolean0 = discretize0.setInputFormat((Instances) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.desiredWeightOfInstancesPerIntervalTipText()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test01()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.desiredWeightOfInstancesPerIntervalTipText();
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01D);
      assertEquals("Sets the desired weight of instances per interval for equal-frequency binning.", string0);
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseBinNumbers());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.setAttributeIndicesArray([I)V: root-Branch
   */

  @Test
  public void test02()  throws Throwable  {
      Discretize discretize0 = new Discretize("+4~qi4]@\u0000aA");
      int[] intArray0 = new int[10];
      discretize0.setAttributeIndicesArray(intArray0);
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01D);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.getOptions()[Ljava/lang/String;: I73 Branch 9 IFEQ L307 - false
   */

  @Test
  public void test03()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getMakeBinary());
      
      discretize0.m_UseEqualFrequency = true;
      String[] stringArray0 = discretize0.getOptions();
      assertTrue(discretize0.getUseEqualFrequency());
      assertTrue(discretize0.getUseBinNumbers());
      assertTrue(discretize0.getMakeBinary());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.globalInfo()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test04()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.globalInfo();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01D);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals("An instance filter that discretizes a range of numeric attributes in the dataset into nominal attributes. Discretization is by simple binning. Skips the class attribute if set.", string0);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.main([Ljava/lang/String;)V: root-Branch
   */

  @Test
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[10];
      Discretize.main(stringArray0);
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.getBinRangesString(I)Ljava/lang/String;: I7 Branch 26 IFNONNULL L756 - false
   */

  @Test
  public void test06()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.getBinRangesString((-1847));
      assertFalse(discretize0.getMakeBinary());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01D);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.getOptions()[Ljava/lang/String;: I157 Branch 12 IFGT L322 - true
   */

  @Test
  public void test07()  throws Throwable  {
      Discretize discretize0 = new Discretize("");
      String[] stringArray0 = discretize0.getOptions();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01D);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.getOptions()[Ljava/lang/String;: I87 Branch 10 IFEQ L310 - false
   */

  @Test
  public void test08()  throws Throwable  {
      Discretize discretize0 = new Discretize("\tSpecifies list of columns to Discretize. First and last are valid indexes.\n\t(default: first-last)");
      discretize0.setFindNumBins(true);
      String[] stringArray0 = discretize0.getOptions();
      assertTrue(discretize0.getFindNumBins());
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.useBinNumbersTipText()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test09()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.useBinNumbersTipText();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01D);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getMakeBinary());
      assertEquals(10, discretize0.getBins());
      assertEquals("Use bin numbers (eg BXofY) rather than ranges for for discretized attributes", string0);
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.input(Lweka/core/Instance;)Z: I7 Branch 18 IFNONNULL L396 - false
   */

  @Test
  public void test10()  throws Throwable  {
      DenseInstance denseInstance0 = new DenseInstance(680);
      Discretize discretize0 = new Discretize();
      // Undeclared exception!
      try {
        boolean boolean0 = discretize0.input((Instance) denseInstance0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No input instance format defined
         //
      }
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.getCutPoints(I)[D: I7 Branch 25 IFNONNULL L741 - false
   */

  @Test
  public void test11()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      double[] doubleArray0 = discretize0.getCutPoints(529);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01D);
      assertFalse(discretize0.getUseBinNumbers());
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.useEqualFrequencyTipText()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test12()  throws Throwable  {
      Discretize discretize0 = new Discretize("Specify range of atributjs to act on. This is a commaseparated list ofaattribute indices, with \"first\" and \"last\" valbd vaEues. Specify an`inclusive range with \"-\". E.g: \"first-3,U,6-10,last\".");
      String string0 = discretize0.useEqualFrequencyTipText();
      assertEquals(10, discretize0.getBins());
      assertEquals("If set to true, equal-frequency binning will be used instead of equal-width binning.", string0);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getMakeBinary());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01D);
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.setInputFormat(Lweka/core/Instances;)Z: I7 Branch 14 IFEQ L364 - true
   */

  @Test
  public void test13()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      Attribute attribute0 = new Attribute("rfterWQPTreeTranOformer:          ");
      Instances instances0 = attribute0.relation(210);
      try {
        boolean boolean0 = discretize0.setInputFormat((Instances) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.setOutputFormat()V: I7 Branch 79 IFNONNULL L1047 - false
   */

  @Test
  public void test14()  throws Throwable  {
      Discretize discretize0 = new Discretize("\tSpecifies list of columns to Discretize. First and last are valid indexes.\n\t(default: first-last)");
      discretize0.setOutputFormat();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01D);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.attributeIndicesTipText()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test15()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.attributeIndicesTipText();
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getMakeBinary());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01D);
      assertEquals("Specify range of attributes to act on. This is a comma separated list of attribute indices, with \"first\" and \"last\" valid values. Specify an inclusive range with \"-\". E.g: \"first-3,5,6-10,last\".", string0);
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.binsTipText()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test16()  throws Throwable  {
      Discretize discretize0 = new Discretize("[if exists adjp relabel ucp /^UCP(.*)$/ADJP$X/] [if exists np relabel ucp /^UCP(.)$/NP$1/] [if exists advp relabel ucp /^UCP(.*)$/ADVP/]");
      String string0 = discretize0.binsTipText();
      assertEquals(10, discretize0.getBins());
      assertEquals("Number of bins.", string0);
      assertFalse(discretize0.getMakeBinary());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01D);
      assertFalse(discretize0.getUseBinNumbers());
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.getOptions()[Ljava/lang/String;: I22 Branch 6 IF_ICMPGE L298 - false
   */

  @Test
  public void test17()  throws Throwable  {
      Discretize discretize0 = new Discretize("Specify range of attributes to act on. mhis is a comma separated list of attribute indices, with \"first\" and \"la~t\" valid values. Specify an inclusive range with \"-\". E.g: \"first-3,5,6-10,last\".");
      discretize0.setIgnoreClass(true);
      String[] stringArray0 = discretize0.getOptions();
      assertFalse(discretize0.getFindNumBins());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01D);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getUseEqualFrequency());
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.invertSelectionTipText()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test18()  throws Throwable  {
      Discretize discretize0 = new Discretize("rfterWQPTreeTansformBr:          ");
      String string0 = discretize0.invertSelectionTipText();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01D);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
      assertEquals("Set attribute selection mode. If false, only selected (numeric) attributes in the range will be discretized; if true, only non-selected attributes will be discretized.", string0);
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.batchFinished()Z: I7 Branch 21 IFNONNULL L423 - false
   */

  @Test
  public void test19()  throws Throwable  {
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

  //Test case number: 20
  /*
   * 1 covered goal:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.makeBinaryTipText()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test20()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.makeBinaryTipText();
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertEquals("Make resulting attributes binary.", string0);
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01D);
  }

  //Test case number: 21
  /*
   * 1 covered goal:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.getRevision()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test21()  throws Throwable  {
      Discretize discretize0 = new Discretize("Specify range of atributjs to act on. This is a commaseparated list ofaattribute indices, with \"first\" and \"last\" valbd vaEues. Specify an`inclusive range with \"-\". E.g: \"first-3,U,6-10,last\".");
      String string0 = discretize0.getRevision();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01D);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals("8964", string0);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
  }

  //Test case number: 22
  /*
   * 2 covered goals:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.setOptions([Ljava/lang/String;)V: I85 Branch 3 IFEQ L267 - false
   * Goal 2. weka.filters.unsupervised.attribute.Discretize.setOptions([Ljava/lang/String;)V: I114 Branch 4 IFEQ L274 - true
   */

  @Test
  public void test22()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String[] stringArray0 = discretize0.getOptions();
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01D);
      assertFalse(discretize0.getMakeBinary());
      
      Filter.runFilter((Filter) discretize0, stringArray0);
      Filter.runFilter((Filter) discretize0, stringArray0);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getInvertSelection());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01D);
  }

  //Test case number: 23
  /*
   * 1 covered goal:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.setOptions([Ljava/lang/String;)V: I53 Branch 2 IFEQ L260 - false
   */

  @Test
  public void test23()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "$CIeKK%vXY-ri";
      stringArray0[1] = "$CIeKK%vXY-ri";
      stringArray0[2] = "$CIeKK%vXY-ri";
      stringArray0[3] = "$CIeKK%vXY-ri";
      stringArray0[4] = "$CIeKK%vXY-ri";
      stringArray0[5] = "$CIeKK%vXY-ri";
      stringArray0[6] = "$CIeKK%vXY-ri";
      stringArray0[7] = "-M";
      stringArray0[8] = "$CIeKK%vXY-ri";
      Filter.runFilter((Filter) discretize0, stringArray0);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getFindNumBins());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getInvertSelection());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01D);
  }

  //Test case number: 24
  /*
   * 1 covered goal:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.getCapabilities()Lweka/core/Capabilities;: I34 Branch 13 IFNE L347 - false
   */

  @Test
  public void test24()  throws Throwable  {
      Discretize discretize0 = new Discretize("rfwer]TreeTransformer:          ");
      Capabilities capabilities0 = discretize0.getCapabilities();
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getMakeBinary());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01D);
  }

  //Test case number: 25
  /*
   * 14 covered goals:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.<init>()V: root-Branch
   * Goal 2. weka.filters.unsupervised.attribute.Discretize.setUseBinNumbers(Z)V: root-Branch
   * Goal 3. weka.filters.unsupervised.attribute.Discretize.setUseEqualFrequency(Z)V: root-Branch
   * Goal 4. weka.filters.unsupervised.attribute.Discretize.setDesiredWeightOfInstancesPerInterval(D)V: root-Branch
   * Goal 5. weka.filters.unsupervised.attribute.Discretize.setMakeBinary(Z)V: root-Branch
   * Goal 6. weka.filters.unsupervised.attribute.Discretize.setInvertSelection(Z)V: root-Branch
   * Goal 7. weka.filters.unsupervised.attribute.Discretize.setBins(I)V: root-Branch
   * Goal 8. weka.filters.unsupervised.attribute.Discretize.setFindNumBins(Z)V: root-Branch
   * Goal 9. weka.filters.unsupervised.attribute.Discretize.listOptions()Ljava/util/Enumeration;: I18 Branch 1 IFEQ L154 - true
   * Goal 10. weka.filters.unsupervised.attribute.Discretize.listOptions()Ljava/util/Enumeration;: I18 Branch 1 IFEQ L154 - false
   * Goal 11. weka.filters.unsupervised.attribute.Discretize.setOptions([Ljava/lang/String;)V: I53 Branch 2 IFEQ L260 - true
   * Goal 12. weka.filters.unsupervised.attribute.Discretize.setOptions([Ljava/lang/String;)V: I85 Branch 3 IFEQ L267 - true
   * Goal 13. weka.filters.unsupervised.attribute.Discretize.setOptions([Ljava/lang/String;)V: I114 Branch 4 IFEQ L274 - false
   * Goal 14. weka.filters.unsupervised.attribute.Discretize.setOptions([Ljava/lang/String;)V: I137 Branch 5 IFNULL L280 - true
   */

  @Test
  public void test25()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-R";
      stringArray0[1] = "-R";
      stringArray0[2] = "-R";
      stringArray0[3] = "-R";
      stringArray0[4] = "-R";
      stringArray0[5] = "-R";
      Filter.runFilter((Filter) discretize0, stringArray0);
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01D);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getInvertSelection());
  }

  //Test case number: 26
  /*
   * 3 covered goals:
   * Goal 1. weka.filters.unsupervised.attribute.Discretize.setAttributeIndices(Ljava/lang/String;)V: root-Branch
   * Goal 2. weka.filters.unsupervised.attribute.Discretize.<init>(Ljava/lang/String;)V: root-Branch
   * Goal 3. weka.filters.unsupervised.attribute.Discretize.findNumBinsTipText()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test26()  throws Throwable  {
      Discretize discretize0 = new Discretize("rfterWQPTreeTransformer:          ");
      String string0 = discretize0.findNumBinsTipText();
      assertFalse(discretize0.getMakeBinary());
      assertEquals("Optimize number of equal-width bins using leave-one-out. Doesn't work for equal-frequency binning", string0);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01D);
  }
}
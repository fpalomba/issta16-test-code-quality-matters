/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 10 12:19:07 GMT 2015
 */

package weka.classifiers.bayes;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.File;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.junit.runner.RunWith;
import weka.classifiers.AbstractClassifier;
import weka.classifiers.Classifier;
import weka.classifiers.bayes.NaiveBayesMultinomialText;
import weka.classifiers.meta.CostSensitiveClassifier;
import weka.classifiers.misc.SerializedClassifier;
import weka.core.BinarySparseInstance;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.SparseInstance;
import weka.core.TestInstances;
import weka.core.stemmers.SnowballStemmer;
import weka.core.stemmers.Stemmer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class NaiveBayesMultinomialText_ESTest extends NaiveBayesMultinomialText_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. weka.classifiers.bayes.NaiveBayesMultinomialText.toString()Ljava/lang/String;: I7 Branch 70 IFNONNULL L1084 - false
   */

  @Test
  public void test00()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      String string0 = naiveBayesMultinomialText0.toString();
      assertEquals(3.0, naiveBayesMultinomialText0.getMinWordFrequency(), 0.01D);
      assertEquals("NaiveBayesMultinomialText: No model built yet.\n", string0);
      assertEquals(2.0, naiveBayesMultinomialText0.getLNorm(), 0.01D);
      assertFalse(naiveBayesMultinomialText0.getNormalizeDocLength());
      assertEquals(0, naiveBayesMultinomialText0.getPeriodicPruning());
      assertEquals(1.0, naiveBayesMultinomialText0.getNorm(), 0.01D);
      assertFalse(naiveBayesMultinomialText0.getUseWordFrequencies());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. weka.classifiers.bayes.NaiveBayesMultinomialText.toString()Ljava/lang/String;: I7 Branch 70 IFNONNULL L1084 - true
   */

  @Test
  public void test01()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      double[] doubleArray0 = new double[2];
      naiveBayesMultinomialText0.m_probOfClass = doubleArray0;
      // Undeclared exception!
      try {
        String string0 = naiveBayesMultinomialText0.toString();
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
   * Goal 1. weka.classifiers.bayes.NaiveBayesMultinomialText.getOptions()[Ljava/lang/String;: I142 Branch 66 IFNE L1053 - false
   */

  @Test
  public void test02()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      MockFile mockFile0 = new MockFile("");
      MockFile mockFile1 = new MockFile((File) mockFile0, "user.dir");
      naiveBayesMultinomialText0.m_stopwordsFile = (File) mockFile1;
      String[] stringArray0 = naiveBayesMultinomialText0.getOptions();
      assertEquals(3.0, naiveBayesMultinomialText0.getMinWordFrequency(), 0.01D);
      assertFalse(naiveBayesMultinomialText0.getUseWordFrequencies());
      assertEquals(0, naiveBayesMultinomialText0.getPeriodicPruning());
      assertEquals(1.0, naiveBayesMultinomialText0.getNorm(), 0.01D);
      assertFalse(naiveBayesMultinomialText0.getNormalizeDocLength());
      assertEquals(2.0, naiveBayesMultinomialText0.getLNorm(), 0.01D);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. weka.classifiers.bayes.NaiveBayesMultinomialText.getOptions()[Ljava/lang/String;: I63 Branch 63 IFEQ L1042 - false
   */

  @Test
  public void test03()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      assertFalse(naiveBayesMultinomialText0.getNormalizeDocLength());
      
      naiveBayesMultinomialText0.m_normalize = true;
      String[] stringArray0 = naiveBayesMultinomialText0.getOptions();
      assertTrue(naiveBayesMultinomialText0.getNormalizeDocLength());
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * Goal 1. weka.classifiers.bayes.NaiveBayesMultinomialText.setOptions([Ljava/lang/String;)V: I338 Branch 61 IFEQ L1022 - false
   * Goal 2. weka.classifiers.bayes.NaiveBayesMultinomialText.getOptions()[Ljava/lang/String;: I229 Branch 69 IFEQ L1067 - false
   */

  @Test
  public void test04()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      SnowballStemmer snowballStemmer0 = new SnowballStemmer("The stemming algorithm to use on the words.");
      naiveBayesMultinomialText0.setStemmer((Stemmer) snowballStemmer0);
      String[] stringArray0 = naiveBayesMultinomialText0.getOptions();
      naiveBayesMultinomialText0.setOptions(stringArray0);
      assertEquals(2.0, naiveBayesMultinomialText0.getLNorm(), 0.01D);
      assertFalse(naiveBayesMultinomialText0.getNormalizeDocLength());
      assertFalse(naiveBayesMultinomialText0.getUseWordFrequencies());
      assertFalse(naiveBayesMultinomialText0.getLowercaseTokens());
      assertEquals(1.0, naiveBayesMultinomialText0.getNorm(), 0.01D);
      assertEquals(3.0, naiveBayesMultinomialText0.getMinWordFrequency(), 0.01D);
      assertEquals(0, naiveBayesMultinomialText0.getPeriodicPruning());
      assertFalse(naiveBayesMultinomialText0.getUseStopList());
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * Goal 1. weka.classifiers.bayes.NaiveBayesMultinomialText.setStopwords(Ljava/io/File;)V: I46 Branch 50 IFEQ L832 - false
   */

  @Test
  public void test05()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      CostSensitiveClassifier costSensitiveClassifier0 = new CostSensitiveClassifier();
      MockFile mockFile0 = (MockFile)costSensitiveClassifier0.getOnDemandDirectory();
      MockFile mockFile1 = (MockFile)MockFile.createTempFile("*)PN_", "L/KLpNBnR>i[HQB`)F", (File) mockFile0);
      naiveBayesMultinomialText0.setStopwords((File) mockFile1);
      assertTrue(naiveBayesMultinomialText0.getUseStopList());
  }

  //Test case number: 6
  /*
   * 2 covered goals:
   * Goal 1. weka.classifiers.bayes.NaiveBayesMultinomialText.setStopwords(Ljava/io/File;)V: I6 Branch 48 IFNONNULL L828 - true
   * Goal 2. weka.classifiers.bayes.NaiveBayesMultinomialText.setStopwords(Ljava/io/File;)V: I40 Branch 49 IFEQ L832 - true
   */

  @Test
  public void test06()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      MockFile mockFile0 = new MockFile("Empty nominal class");
      naiveBayesMultinomialText0.setStopwords((File) mockFile0);
      assertEquals(3.0, naiveBayesMultinomialText0.getMinWordFrequency(), 0.01D);
      assertEquals(1.0, naiveBayesMultinomialText0.getNorm(), 0.01D);
      assertFalse(naiveBayesMultinomialText0.getUseWordFrequencies());
      assertEquals(2.0, naiveBayesMultinomialText0.getLNorm(), 0.01D);
      assertFalse(naiveBayesMultinomialText0.getNormalizeDocLength());
      assertEquals(0, naiveBayesMultinomialText0.getPeriodicPruning());
      assertFalse(naiveBayesMultinomialText0.getUseStopList());
  }

  //Test case number: 7
  /*
   * 7 covered goals:
   * Goal 1. weka.classifiers.bayes.NaiveBayesMultinomialText.setStemmer(Lweka/core/stemmers/Stemmer;)V: I6 Branch 47 IFNULL L524 - true
   * Goal 2. weka.classifiers.bayes.NaiveBayesMultinomialText.setOptions([Ljava/lang/String;)V: I29 Branch 51 IFLE L968 - true
   * Goal 3. weka.classifiers.bayes.NaiveBayesMultinomialText.setOptions([Ljava/lang/String;)V: I49 Branch 52 IFLE L972 - true
   * Goal 4. weka.classifiers.bayes.NaiveBayesMultinomialText.setOptions([Ljava/lang/String;)V: I76 Branch 53 IFLE L979 - true
   * Goal 5. weka.classifiers.bayes.NaiveBayesMultinomialText.setOptions([Ljava/lang/String;)V: I96 Branch 54 IFLE L983 - true
   * Goal 6. weka.classifiers.bayes.NaiveBayesMultinomialText.setOptions([Ljava/lang/String;)V: I174 Branch 56 IFNE L998 - false
   * Goal 7. weka.classifiers.bayes.NaiveBayesMultinomialText.setOptions([Ljava/lang/String;)V: I269 Branch 59 IFNE L1013 - false
   */

  @Test
  public void test07()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "XH+$!g";
      naiveBayesMultinomialText0.setOptions(stringArray0);
      assertEquals(2.0, naiveBayesMultinomialText0.getLNorm(), 0.01D);
      assertEquals(1.0, naiveBayesMultinomialText0.getNorm(), 0.01D);
      assertFalse(naiveBayesMultinomialText0.getLowercaseTokens());
      assertEquals(3.0, naiveBayesMultinomialText0.getMinWordFrequency(), 0.01D);
      assertFalse(naiveBayesMultinomialText0.getUseWordFrequencies());
      assertFalse(naiveBayesMultinomialText0.getUseStopList());
      assertFalse(naiveBayesMultinomialText0.getNormalizeDocLength());
  }

  //Test case number: 8
  /*
   * 2 covered goals:
   * Goal 1. weka.classifiers.bayes.NaiveBayesMultinomialText.pruneDictionary()V: I7 Branch 42 IFLE L487 - false
   * Goal 2. weka.classifiers.bayes.NaiveBayesMultinomialText.pruneDictionary()V: I19 Branch 43 IFLE L487 - false
   */

  @Test
  public void test08()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      assertEquals(0, naiveBayesMultinomialText0.getPeriodicPruning());
      
      naiveBayesMultinomialText0.m_periodicP = 86;
      naiveBayesMultinomialText0.reset();
      naiveBayesMultinomialText0.pruneDictionary();
      assertEquals(3.0, naiveBayesMultinomialText0.getMinWordFrequency(), 0.01D);
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * Goal 1. weka.classifiers.bayes.NaiveBayesMultinomialText.tokenizeInstance(Lweka/core/Instance;Z)V: I60 Branch 24 IFNE L398 - false
   */

  @Test
  public void test09()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      naiveBayesMultinomialText0.m_useStopList = true;
      double[] doubleArray0 = new double[10];
      SerializedClassifier serializedClassifier0 = new SerializedClassifier();
      MockFile mockFile0 = (MockFile)serializedClassifier0.getModelFile();
      MockFile mockFile1 = (MockFile)MockFile.createTempFile("If true then document length is normalized according to the settings for norm and lnorm", "N)5X", (File) mockFile0);
      naiveBayesMultinomialText0.m_stopwordsFile = (File) mockFile1;
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(2.0, doubleArray0);
      try {
        double[] doubleArray1 = naiveBayesMultinomialText0.distributionForInstance((Instance) binarySparseInstance0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // DenseInstance doesn't have access to a dataset!
         //
      }
  }

  //Test case number: 10
  /*
   * 5 covered goals:
   * Goal 1. weka.classifiers.bayes.NaiveBayesMultinomialText.tokenizeInstance(Lweka/core/Instance;Z)V: I31 Branch 21 IFEQ L395 - false
   * Goal 2. weka.classifiers.bayes.NaiveBayesMultinomialText.tokenizeInstance(Lweka/core/Instance;Z)V: I37 Branch 22 IFNONNULL L395 - false
   * Goal 3. weka.classifiers.bayes.NaiveBayesMultinomialText.tokenizeInstance(Lweka/core/Instance;Z)V: I53 Branch 23 IFEQ L398 - false
   * Goal 4. weka.classifiers.bayes.NaiveBayesMultinomialText.tokenizeInstance(Lweka/core/Instance;Z)V: I60 Branch 24 IFNE L398 - true
   * Goal 5. weka.classifiers.bayes.NaiveBayesMultinomialText.tokenizeInstance(Lweka/core/Instance;Z)V: I92 Branch 25 IF_ICMPGE L406 - false
   */

  @Test
  public void test10()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      naiveBayesMultinomialText0.m_useStopList = true;
      double[] doubleArray0 = new double[10];
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(2.0, doubleArray0);
      try {
        double[] doubleArray1 = naiveBayesMultinomialText0.distributionForInstance((Instance) binarySparseInstance0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // DenseInstance doesn't have access to a dataset!
         //
      }
  }

  //Test case number: 11
  /*
   * 5 covered goals:
   * Goal 1. weka.classifiers.bayes.NaiveBayesMultinomialText.tokenizeInstance(Lweka/core/Instance;Z)V: I7 Branch 20 IFNONNULL L389 - true
   * Goal 2. weka.classifiers.bayes.NaiveBayesMultinomialText.tokenizeInstance(Lweka/core/Instance;Z)V: I7 Branch 20 IFNONNULL L389 - false
   * Goal 3. weka.classifiers.bayes.NaiveBayesMultinomialText.tokenizeInstance(Lweka/core/Instance;Z)V: I31 Branch 21 IFEQ L395 - true
   * Goal 4. weka.classifiers.bayes.NaiveBayesMultinomialText.tokenizeInstance(Lweka/core/Instance;Z)V: I92 Branch 25 IF_ICMPGE L406 - true
   * Goal 5. weka.classifiers.bayes.NaiveBayesMultinomialText.tokenizeInstance(Lweka/core/Instance;Z)V: I239 Branch 33 IFEQ L434 - true
   */

  @Test
  public void test11()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      SparseInstance sparseInstance0 = new SparseInstance(0);
      naiveBayesMultinomialText0.tokenizeInstance(sparseInstance0, false);
      naiveBayesMultinomialText0.tokenizeInstance(sparseInstance0, false);
      assertEquals(0, naiveBayesMultinomialText0.getPeriodicPruning());
      assertEquals(1.0, naiveBayesMultinomialText0.getNorm(), 0.01D);
      assertFalse(naiveBayesMultinomialText0.getNormalizeDocLength());
      assertFalse(naiveBayesMultinomialText0.getUseWordFrequencies());
      assertEquals(2.0, naiveBayesMultinomialText0.getLNorm(), 0.01D);
      assertEquals(3.0, naiveBayesMultinomialText0.getMinWordFrequency(), 0.01D);
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * Goal 1. weka.classifiers.bayes.NaiveBayesMultinomialText.tokenizerTipText()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test12()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      String string0 = naiveBayesMultinomialText0.tokenizerTipText();
      assertEquals("The tokenizing algorithm to use on the strings.", string0);
      assertFalse(naiveBayesMultinomialText0.getUseWordFrequencies());
      assertEquals(0, naiveBayesMultinomialText0.getPeriodicPruning());
      assertEquals(2.0, naiveBayesMultinomialText0.getLNorm(), 0.01D);
      assertFalse(naiveBayesMultinomialText0.getNormalizeDocLength());
      assertEquals(1.0, naiveBayesMultinomialText0.getNorm(), 0.01D);
      assertEquals(3.0, naiveBayesMultinomialText0.getMinWordFrequency(), 0.01D);
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * Goal 1. weka.classifiers.bayes.NaiveBayesMultinomialText.normalizeDocLengthTipText()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test13()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      String string0 = naiveBayesMultinomialText0.normalizeDocLengthTipText();
      assertEquals(2.0, naiveBayesMultinomialText0.getLNorm(), 0.01D);
      assertFalse(naiveBayesMultinomialText0.getNormalizeDocLength());
      assertEquals("If true then document length is normalized according to the settings for norm and lnorm", string0);
      assertEquals(1.0, naiveBayesMultinomialText0.getNorm(), 0.01D);
      assertEquals(3.0, naiveBayesMultinomialText0.getMinWordFrequency(), 0.01D);
      assertFalse(naiveBayesMultinomialText0.getUseWordFrequencies());
      assertEquals(0, naiveBayesMultinomialText0.getPeriodicPruning());
  }

  //Test case number: 14
  /*
   * 2 covered goals:
   * Goal 1. weka.classifiers.bayes.NaiveBayesMultinomialText.updateClassifier(Lweka/core/Instance;)V: root-Branch
   * Goal 2. weka.classifiers.bayes.NaiveBayesMultinomialText.updateClassifier(Lweka/core/Instance;Z)V: I7 Branch 3 IFNE L276 - false
   */

  @Test
  public void test14()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      TestInstances testInstances0 = new TestInstances();
      Instances instances0 = testInstances0.generate();
      DenseInstance denseInstance0 = (DenseInstance)instances0.lastInstance();
      try {
        naiveBayesMultinomialText0.updateClassifier((Instance) denseInstance0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * Goal 1. weka.classifiers.bayes.NaiveBayesMultinomialText.useStopListTipText()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test15()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      String string0 = naiveBayesMultinomialText0.useStopListTipText();
      assertFalse(naiveBayesMultinomialText0.getNormalizeDocLength());
      assertEquals(3.0, naiveBayesMultinomialText0.getMinWordFrequency(), 0.01D);
      assertEquals(2.0, naiveBayesMultinomialText0.getLNorm(), 0.01D);
      assertEquals(1.0, naiveBayesMultinomialText0.getNorm(), 0.01D);
      assertEquals("If true, ignores all words that are on the stoplist.", string0);
      assertEquals(0, naiveBayesMultinomialText0.getPeriodicPruning());
      assertFalse(naiveBayesMultinomialText0.getUseWordFrequencies());
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * Goal 1. weka.classifiers.bayes.NaiveBayesMultinomialText.useWordFrequenciesTipText()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test16()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      String string0 = naiveBayesMultinomialText0.useWordFrequenciesTipText();
      assertEquals(2.0, naiveBayesMultinomialText0.getLNorm(), 0.01D);
      assertEquals(0, naiveBayesMultinomialText0.getPeriodicPruning());
      assertFalse(naiveBayesMultinomialText0.getNormalizeDocLength());
      assertEquals(1.0, naiveBayesMultinomialText0.getNorm(), 0.01D);
      assertFalse(naiveBayesMultinomialText0.getUseWordFrequencies());
      assertEquals(3.0, naiveBayesMultinomialText0.getMinWordFrequency(), 0.01D);
      assertEquals("Use word frequencies rather than binary bag of words representation", string0);
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * Goal 1. weka.classifiers.bayes.NaiveBayesMultinomialText.getRevision()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test17()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      String string0 = naiveBayesMultinomialText0.getRevision();
      assertEquals(2.0, naiveBayesMultinomialText0.getLNorm(), 0.01D);
      assertEquals("9122", string0);
      assertFalse(naiveBayesMultinomialText0.getUseWordFrequencies());
      assertEquals(0, naiveBayesMultinomialText0.getPeriodicPruning());
      assertFalse(naiveBayesMultinomialText0.getNormalizeDocLength());
      assertEquals(3.0, naiveBayesMultinomialText0.getMinWordFrequency(), 0.01D);
      assertEquals(1.0, naiveBayesMultinomialText0.getNorm(), 0.01D);
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * Goal 1. weka.classifiers.bayes.NaiveBayesMultinomialText.globalInfo()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test18()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      String string0 = naiveBayesMultinomialText0.globalInfo();
      assertEquals(0, naiveBayesMultinomialText0.getPeriodicPruning());
      assertEquals(2.0, naiveBayesMultinomialText0.getLNorm(), 0.01D);
      assertEquals("Multinomial naive bayes for text data. Operates directly (and only) on String attributes. Other types of input attributes are accepted but ignored during training and classification", string0);
      assertFalse(naiveBayesMultinomialText0.getNormalizeDocLength());
      assertFalse(naiveBayesMultinomialText0.getUseWordFrequencies());
      assertEquals(3.0, naiveBayesMultinomialText0.getMinWordFrequency(), 0.01D);
      assertEquals(1.0, naiveBayesMultinomialText0.getNorm(), 0.01D);
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * Goal 1. weka.classifiers.bayes.NaiveBayesMultinomialText.normTipText()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test19()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      String string0 = naiveBayesMultinomialText0.normTipText();
      assertFalse(naiveBayesMultinomialText0.getNormalizeDocLength());
      assertEquals("The norm of the instances after normalization.", string0);
      assertEquals(0, naiveBayesMultinomialText0.getPeriodicPruning());
      assertFalse(naiveBayesMultinomialText0.getUseWordFrequencies());
      assertEquals(1.0, naiveBayesMultinomialText0.getNorm(), 0.01D);
      assertEquals(2.0, naiveBayesMultinomialText0.getLNorm(), 0.01D);
      assertEquals(3.0, naiveBayesMultinomialText0.getMinWordFrequency(), 0.01D);
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * Goal 1. weka.classifiers.bayes.NaiveBayesMultinomialText.lowercaseTokensTipText()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test20()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      String string0 = naiveBayesMultinomialText0.lowercaseTokensTipText();
      assertFalse(naiveBayesMultinomialText0.getUseWordFrequencies());
      assertEquals(3.0, naiveBayesMultinomialText0.getMinWordFrequency(), 0.01D);
      assertEquals(2.0, naiveBayesMultinomialText0.getLNorm(), 0.01D);
      assertFalse(naiveBayesMultinomialText0.getNormalizeDocLength());
      assertEquals(0, naiveBayesMultinomialText0.getPeriodicPruning());
      assertEquals("Whether to convert all tokens to lowercase", string0);
      assertEquals(1.0, naiveBayesMultinomialText0.getNorm(), 0.01D);
  }

  //Test case number: 21
  /*
   * 1 covered goal:
   * Goal 1. weka.classifiers.bayes.NaiveBayesMultinomialText.LNormTipText()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test21()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      String string0 = naiveBayesMultinomialText0.LNormTipText();
      assertEquals(0, naiveBayesMultinomialText0.getPeriodicPruning());
      assertEquals(1.0, naiveBayesMultinomialText0.getNorm(), 0.01D);
      assertFalse(naiveBayesMultinomialText0.getNormalizeDocLength());
      assertEquals("The LNorm to use for document length normalization.", string0);
      assertFalse(naiveBayesMultinomialText0.getUseWordFrequencies());
      assertEquals(2.0, naiveBayesMultinomialText0.getLNorm(), 0.01D);
      assertEquals(3.0, naiveBayesMultinomialText0.getMinWordFrequency(), 0.01D);
  }

  //Test case number: 22
  /*
   * 1 covered goal:
   * Goal 1. weka.classifiers.bayes.NaiveBayesMultinomialText.listOptions()Ljava/util/Enumeration;: root-Branch
   */

  @Test
  public void test22()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      String[] stringArray0 = new String[10];
      stringArray0[0] = "|";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "$JPLiJVZ];\"*K.<{";
      stringArray0[4] = "";
      stringArray0[5] = "v";
      stringArray0[6] = "Invalid stemmer specification string";
      stringArray0[7] = "|";
      stringArray0[8] = "+l[!9]";
      stringArray0[9] = "$JPLiJVZ];\"*K.<{";
      AbstractClassifier.runClassifier((Classifier) naiveBayesMultinomialText0, stringArray0);
      assertEquals(0, naiveBayesMultinomialText0.getPeriodicPruning());
      assertEquals(2.0, naiveBayesMultinomialText0.getLNorm(), 0.01D);
      assertEquals(1.0, naiveBayesMultinomialText0.getNorm(), 0.01D);
      assertEquals(3.0, naiveBayesMultinomialText0.getMinWordFrequency(), 0.01D);
      assertFalse(naiveBayesMultinomialText0.getUseWordFrequencies());
      assertFalse(naiveBayesMultinomialText0.getNormalizeDocLength());
  }

  //Test case number: 23
  /*
   * 1 covered goal:
   * Goal 1. weka.classifiers.bayes.NaiveBayesMultinomialText.main([Ljava/lang/String;)V: root-Branch
   */

  @Test
  public void test23()  throws Throwable  {
      String[] stringArray0 = new String[10];
      NaiveBayesMultinomialText.main(stringArray0);
  }

  //Test case number: 24
  /*
   * 1 covered goal:
   * Goal 1. weka.classifiers.bayes.NaiveBayesMultinomialText.minWordFrequencyTipText()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test24()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      String string0 = naiveBayesMultinomialText0.minWordFrequencyTipText();
      assertFalse(naiveBayesMultinomialText0.getUseWordFrequencies());
      assertEquals(3.0, naiveBayesMultinomialText0.getMinWordFrequency(), 0.01D);
      assertEquals("Ignore any words that don't occur at least min frequency times in the training data. If periodic pruning is turned on, then the dictionary is pruned according to this value", string0);
      assertEquals(1.0, naiveBayesMultinomialText0.getNorm(), 0.01D);
      assertEquals(0, naiveBayesMultinomialText0.getPeriodicPruning());
      assertEquals(2.0, naiveBayesMultinomialText0.getLNorm(), 0.01D);
      assertFalse(naiveBayesMultinomialText0.getNormalizeDocLength());
  }

  //Test case number: 25
  /*
   * 1 covered goal:
   * Goal 1. weka.classifiers.bayes.NaiveBayesMultinomialText.periodicPruningTipText()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test25()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      String string0 = naiveBayesMultinomialText0.periodicPruningTipText();
      assertEquals(1.0, naiveBayesMultinomialText0.getNorm(), 0.01D);
      assertEquals("How often (number of instances) to prune the dictionary of low frequency terms. 0 means don't prune. Setting a positive integer n means prune after every n instances", string0);
      assertEquals(3.0, naiveBayesMultinomialText0.getMinWordFrequency(), 0.01D);
      assertEquals(2.0, naiveBayesMultinomialText0.getLNorm(), 0.01D);
      assertFalse(naiveBayesMultinomialText0.getUseWordFrequencies());
      assertEquals(0, naiveBayesMultinomialText0.getPeriodicPruning());
      assertFalse(naiveBayesMultinomialText0.getNormalizeDocLength());
  }

  //Test case number: 26
  /*
   * 1 covered goal:
   * Goal 1. weka.classifiers.bayes.NaiveBayesMultinomialText.stopwordsTipText()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test26()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      String string0 = naiveBayesMultinomialText0.stopwordsTipText();
      assertEquals(3.0, naiveBayesMultinomialText0.getMinWordFrequency(), 0.01D);
      assertFalse(naiveBayesMultinomialText0.getUseWordFrequencies());
      assertEquals("The file containing the stopwords (if this is a directory then the default ones are used).", string0);
      assertEquals(1.0, naiveBayesMultinomialText0.getNorm(), 0.01D);
      assertEquals(2.0, naiveBayesMultinomialText0.getLNorm(), 0.01D);
      assertFalse(naiveBayesMultinomialText0.getNormalizeDocLength());
      assertEquals(0, naiveBayesMultinomialText0.getPeriodicPruning());
  }

  //Test case number: 27
  /*
   * 1 covered goal:
   * Goal 1. weka.classifiers.bayes.NaiveBayesMultinomialText.stemmerTipText()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test27()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      String string0 = naiveBayesMultinomialText0.stemmerTipText();
      assertFalse(naiveBayesMultinomialText0.getNormalizeDocLength());
      assertEquals(3.0, naiveBayesMultinomialText0.getMinWordFrequency(), 0.01D);
      assertEquals(2.0, naiveBayesMultinomialText0.getLNorm(), 0.01D);
      assertEquals("The stemming algorithm to use on the words.", string0);
      assertEquals(1.0, naiveBayesMultinomialText0.getNorm(), 0.01D);
      assertEquals(0, naiveBayesMultinomialText0.getPeriodicPruning());
      assertFalse(naiveBayesMultinomialText0.getUseWordFrequencies());
  }

  //Test case number: 28
  /*
   * 1 covered goal:
   * Goal 1. weka.classifiers.bayes.NaiveBayesMultinomialText.getCapabilities()Lweka/core/Capabilities;: root-Branch
   */

  @Test
  public void test28()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      // Undeclared exception!
      try {
        naiveBayesMultinomialText0.buildClassifier((Instances) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // weka/core/WekaPackageManager
         //
      }
  }

  //Test case number: 29
  /*
   * 45 covered goals:
   * Goal 1. weka.classifiers.bayes.NaiveBayesMultinomialText.getNorm()D: root-Branch
   * Goal 2. weka.classifiers.bayes.NaiveBayesMultinomialText.getStemmer()Lweka/core/stemmers/Stemmer;: root-Branch
   * Goal 3. weka.classifiers.bayes.NaiveBayesMultinomialText.setMinWordFrequency(D)V: root-Branch
   * Goal 4. weka.classifiers.bayes.NaiveBayesMultinomialText.getUseWordFrequencies()Z: root-Branch
   * Goal 5. weka.classifiers.bayes.NaiveBayesMultinomialText.getMinWordFrequency()D: root-Branch
   * Goal 6. weka.classifiers.bayes.NaiveBayesMultinomialText.getLNorm()D: root-Branch
   * Goal 7. weka.classifiers.bayes.NaiveBayesMultinomialText.setLNorm(D)V: root-Branch
   * Goal 8. weka.classifiers.bayes.NaiveBayesMultinomialText.<init>()V: root-Branch
   * Goal 9. weka.classifiers.bayes.NaiveBayesMultinomialText.reset()V: root-Branch
   * Goal 10. weka.classifiers.bayes.NaiveBayesMultinomialText.getPeriodicPruning()I: root-Branch
   * Goal 11. weka.classifiers.bayes.NaiveBayesMultinomialText.getStopwords()Ljava/io/File;: root-Branch
   * Goal 12. weka.classifiers.bayes.NaiveBayesMultinomialText.setTokenizer(Lweka/core/tokenizers/Tokenizer;)V: root-Branch
   * Goal 13. weka.classifiers.bayes.NaiveBayesMultinomialText.setPeriodicPruning(I)V: root-Branch
   * Goal 14. weka.classifiers.bayes.NaiveBayesMultinomialText.setUseWordFrequencies(Z)V: root-Branch
   * Goal 15. weka.classifiers.bayes.NaiveBayesMultinomialText.getUseStopList()Z: root-Branch
   * Goal 16. weka.classifiers.bayes.NaiveBayesMultinomialText.setUseStopList(Z)V: root-Branch
   * Goal 17. weka.classifiers.bayes.NaiveBayesMultinomialText.setLowercaseTokens(Z)V: root-Branch
   * Goal 18. weka.classifiers.bayes.NaiveBayesMultinomialText.getNormalizeDocLength()Z: root-Branch
   * Goal 19. weka.classifiers.bayes.NaiveBayesMultinomialText.getTokenizer()Lweka/core/tokenizers/Tokenizer;: root-Branch
   * Goal 20. weka.classifiers.bayes.NaiveBayesMultinomialText.setNorm(D)V: root-Branch
   * Goal 21. weka.classifiers.bayes.NaiveBayesMultinomialText.getLowercaseTokens()Z: root-Branch
   * Goal 22. weka.classifiers.bayes.NaiveBayesMultinomialText.setNormalizeDocLength(Z)V: root-Branch
   * Goal 23. weka.classifiers.bayes.NaiveBayesMultinomialText.setStemmer(Lweka/core/stemmers/Stemmer;)V: I6 Branch 47 IFNULL L524 - false
   * Goal 24. weka.classifiers.bayes.NaiveBayesMultinomialText.setStopwords(Ljava/io/File;)V: I6 Branch 48 IFNONNULL L828 - false
   * Goal 25. weka.classifiers.bayes.NaiveBayesMultinomialText.setStopwords(Ljava/io/File;)V: I40 Branch 49 IFEQ L832 - false
   * Goal 26. weka.classifiers.bayes.NaiveBayesMultinomialText.setStopwords(Ljava/io/File;)V: I46 Branch 50 IFEQ L832 - true
   * Goal 27. weka.classifiers.bayes.NaiveBayesMultinomialText.setOptions([Ljava/lang/String;)V: I29 Branch 51 IFLE L968 - false
   * Goal 28. weka.classifiers.bayes.NaiveBayesMultinomialText.setOptions([Ljava/lang/String;)V: I49 Branch 52 IFLE L972 - false
   * Goal 29. weka.classifiers.bayes.NaiveBayesMultinomialText.setOptions([Ljava/lang/String;)V: I76 Branch 53 IFLE L979 - false
   * Goal 30. weka.classifiers.bayes.NaiveBayesMultinomialText.setOptions([Ljava/lang/String;)V: I96 Branch 54 IFLE L983 - false
   * Goal 31. weka.classifiers.bayes.NaiveBayesMultinomialText.setOptions([Ljava/lang/String;)V: I130 Branch 55 IFLE L991 - true
   * Goal 32. weka.classifiers.bayes.NaiveBayesMultinomialText.setOptions([Ljava/lang/String;)V: I174 Branch 56 IFNE L998 - true
   * Goal 33. weka.classifiers.bayes.NaiveBayesMultinomialText.setOptions([Ljava/lang/String;)V: I198 Branch 57 IFNE L1002 - true
   * Goal 34. weka.classifiers.bayes.NaiveBayesMultinomialText.setOptions([Ljava/lang/String;)V: I245 Branch 58 IFEQ L1007 - false
   * Goal 35. weka.classifiers.bayes.NaiveBayesMultinomialText.setOptions([Ljava/lang/String;)V: I269 Branch 59 IFNE L1013 - true
   * Goal 36. weka.classifiers.bayes.NaiveBayesMultinomialText.setOptions([Ljava/lang/String;)V: I291 Branch 60 IFNE L1017 - true
   * Goal 37. weka.classifiers.bayes.NaiveBayesMultinomialText.setOptions([Ljava/lang/String;)V: I338 Branch 61 IFEQ L1022 - true
   * Goal 38. weka.classifiers.bayes.NaiveBayesMultinomialText.getOptions()[Ljava/lang/String;: I13 Branch 62 IFEQ L1036 - true
   * Goal 39. weka.classifiers.bayes.NaiveBayesMultinomialText.getOptions()[Ljava/lang/String;: I63 Branch 63 IFEQ L1042 - true
   * Goal 40. weka.classifiers.bayes.NaiveBayesMultinomialText.getOptions()[Ljava/lang/String;: I113 Branch 64 IFEQ L1047 - true
   * Goal 41. weka.classifiers.bayes.NaiveBayesMultinomialText.getOptions()[Ljava/lang/String;: I127 Branch 65 IFEQ L1050 - true
   * Goal 42. weka.classifiers.bayes.NaiveBayesMultinomialText.getOptions()[Ljava/lang/String;: I142 Branch 66 IFNE L1053 - true
   * Goal 43. weka.classifiers.bayes.NaiveBayesMultinomialText.getOptions()[Ljava/lang/String;: I176 Branch 67 IFEQ L1059 - false
   * Goal 44. weka.classifiers.bayes.NaiveBayesMultinomialText.getOptions()[Ljava/lang/String;: I207 Branch 68 IFNULL L1064 - false
   * Goal 45. weka.classifiers.bayes.NaiveBayesMultinomialText.getOptions()[Ljava/lang/String;: I229 Branch 69 IFEQ L1067 - true
   */

  @Test
  public void test29()  throws Throwable  {
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      String[] stringArray0 = naiveBayesMultinomialText0.getOptions();
      naiveBayesMultinomialText0.setOptions(stringArray0);
      assertEquals(1.0, naiveBayesMultinomialText0.getNorm(), 0.01D);
      assertFalse(naiveBayesMultinomialText0.getLowercaseTokens());
      assertEquals(0, naiveBayesMultinomialText0.getPeriodicPruning());
      assertFalse(naiveBayesMultinomialText0.getUseWordFrequencies());
      assertFalse(naiveBayesMultinomialText0.getNormalizeDocLength());
      assertEquals(3.0, naiveBayesMultinomialText0.getMinWordFrequency(), 0.01D);
      assertEquals(2.0, naiveBayesMultinomialText0.getLNorm(), 0.01D);
  }
}

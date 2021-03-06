/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 12 20:22:26 GMT 2015
 */

package org.exolab.jms.config;

import static org.junit.Assert.*;
import org.junit.Test;
import edu.stanford.nlp.objectbank.ObjectBank;
import java.io.File;
import java.io.Writer;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.exolab.jms.config.ConnectionFactories;
import org.exolab.jms.config.ConnectionFactory;
import org.exolab.jms.config.QueueConnectionFactory;
import org.exolab.jms.config.TopicConnectionFactory;
import org.exolab.jms.config.XAConnectionFactory;
import org.exolab.jms.config.XAQueueConnectionFactory;
import org.exolab.jms.config.XATopicConnectionFactory;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ConnectionFactories_ESTest extends ConnectionFactories_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.setXAQueueConnectionFactory(ILorg/exolab/jms/config/XAQueueConnectionFactory;)V: I6 Branch 31 IFLT L781 - false
   * Goal 2. org.exolab.jms.config.ConnectionFactories.setXAQueueConnectionFactory(ILorg/exolab/jms/config/XAQueueConnectionFactory;)V: I14 Branch 32 IF_ICMPLE L781 - true
   */

  @Test
  public void test00()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      XAQueueConnectionFactory xAQueueConnectionFactory0 = new XAQueueConnectionFactory();
      try {
        connectionFactories0.setXAQueueConnectionFactory(0, xAQueueConnectionFactory0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
      }
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.setXAConnectionFactory([Lorg/exolab/jms/config/XAConnectionFactory;)V: I16 Branch 30 IF_ICMPGE L766 - true
   * Goal 2. org.exolab.jms.config.ConnectionFactories.setXAConnectionFactory([Lorg/exolab/jms/config/XAConnectionFactory;)V: I16 Branch 30 IF_ICMPGE L766 - false
   */

  @Test
  public void test01()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      XAConnectionFactory[] xAConnectionFactoryArray0 = new XAConnectionFactory[7];
      connectionFactories0.setXAConnectionFactory(xAConnectionFactoryArray0);
      assertEquals(7, connectionFactories0.getXAConnectionFactoryCount());
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.getXATopicConnectionFactory(I)Lorg/exolab/jms/config/XATopicConnectionFactory;: I6 Branch 16 IFLT L519 - false
   * Goal 2. org.exolab.jms.config.ConnectionFactories.getXATopicConnectionFactory(I)Lorg/exolab/jms/config/XATopicConnectionFactory;: I14 Branch 17 IF_ICMPLE L519 - true
   */

  @Test
  public void test02()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      try {
        XATopicConnectionFactory xATopicConnectionFactory0 = connectionFactories0.getXATopicConnectionFactory(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
      }
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.getTopicConnectionFactory(I)Lorg/exolab/jms/config/TopicConnectionFactory;: I6 Branch 7 IFLT L408 - true
   */

  @Test
  public void test03()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      try {
        TopicConnectionFactory topicConnectionFactory0 = connectionFactories0.getTopicConnectionFactory((-1331));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.getQueueConnectionFactory(I)Lorg/exolab/jms/config/QueueConnectionFactory;: I6 Branch 4 IFLT L371 - false
   * Goal 2. org.exolab.jms.config.ConnectionFactories.getQueueConnectionFactory(I)Lorg/exolab/jms/config/QueueConnectionFactory;: I14 Branch 5 IF_ICMPLE L371 - true
   */

  @Test
  public void test04()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      try {
        QueueConnectionFactory queueConnectionFactory0 = connectionFactories0.getQueueConnectionFactory(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
      }
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.getConnectionFactory(I)Lorg/exolab/jms/config/ConnectionFactory;: I6 Branch 1 IFLT L334 - false
   * Goal 2. org.exolab.jms.config.ConnectionFactories.getConnectionFactory(I)Lorg/exolab/jms/config/ConnectionFactory;: I14 Branch 2 IF_ICMPLE L334 - false
   */

  @Test
  public void test05()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      try {
        ConnectionFactory connectionFactory0 = connectionFactories0.getConnectionFactory(1031);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 6
  /*
   * 7 covered goals:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.marshal(Ljava/io/Writer;)V: root-Branch
   * Goal 2. org.exolab.jms.config.ConnectionFactories.getConnectionFactory()[Lorg/exolab/jms/config/ConnectionFactory;: I21 Branch 3 IF_ICMPGE L348 - true
   * Goal 3. org.exolab.jms.config.ConnectionFactories.getQueueConnectionFactory()[Lorg/exolab/jms/config/QueueConnectionFactory;: I21 Branch 6 IF_ICMPGE L385 - true
   * Goal 4. org.exolab.jms.config.ConnectionFactories.getTopicConnectionFactory()[Lorg/exolab/jms/config/TopicConnectionFactory;: I21 Branch 9 IF_ICMPGE L422 - true
   * Goal 5. org.exolab.jms.config.ConnectionFactories.getXAConnectionFactory()[Lorg/exolab/jms/config/XAConnectionFactory;: I21 Branch 12 IF_ICMPGE L459 - true
   * Goal 6. org.exolab.jms.config.ConnectionFactories.getXAQueueConnectionFactory()[Lorg/exolab/jms/config/XAQueueConnectionFactory;: I21 Branch 15 IF_ICMPGE L496 - true
   * Goal 7. org.exolab.jms.config.ConnectionFactories.getXATopicConnectionFactory()[Lorg/exolab/jms/config/XATopicConnectionFactory;: I21 Branch 18 IF_ICMPGE L533 - true
   */

  @Test
  public void test06()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      ObjectBank.PathToFileFunction objectBank_PathToFileFunction0 = new ObjectBank.PathToFileFunction();
      MockFile mockFile0 = (MockFile)objectBank_PathToFileFunction0.apply(" nE o+");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter((File) mockFile0);
      connectionFactories0.marshal((Writer) mockPrintWriter0);
      assertEquals(0, connectionFactories0.getConnectionFactoryCount());
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.clearTopicConnectionFactory()V: root-Branch
   */

  @Test
  public void test07()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      connectionFactories0.clearTopicConnectionFactory();
      assertEquals(0, connectionFactories0.getConnectionFactoryCount());
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.clearXAConnectionFactory()V: root-Branch
   */

  @Test
  public void test08()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      connectionFactories0.clearXAConnectionFactory();
      assertEquals(0, connectionFactories0.getTopicConnectionFactoryCount());
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.getXAQueueConnectionFactoryCount()I: root-Branch
   */

  @Test
  public void test09()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      int int0 = connectionFactories0.getXAQueueConnectionFactoryCount();
      assertEquals(0, int0);
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.getConnectionFactoryCount()I: root-Branch
   */

  @Test
  public void test10()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      int int0 = connectionFactories0.getConnectionFactoryCount();
      assertEquals(0, int0);
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.addXAConnectionFactory(ILorg/exolab/jms/config/XAConnectionFactory;)V: root-Branch
   */

  @Test
  public void test11()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      XAConnectionFactory xAConnectionFactory0 = new XAConnectionFactory();
      connectionFactories0.addXAConnectionFactory(0, xAConnectionFactory0);
      assertEquals(0, connectionFactories0.getXAQueueConnectionFactoryCount());
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.enumerateQueueConnectionFactory()Ljava/util/Enumeration;: root-Branch
   */

  @Test
  public void test12()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      Enumeration enumeration0 = connectionFactories0.enumerateQueueConnectionFactory();
      assertNotNull(enumeration0);
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.enumerateXAQueueConnectionFactory()Ljava/util/Enumeration;: root-Branch
   */

  @Test
  public void test13()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      Enumeration enumeration0 = connectionFactories0.enumerateXAQueueConnectionFactory();
      assertNotNull(enumeration0);
  }

  //Test case number: 14
  /*
   * 2 covered goals:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.enumerateTopicConnectionFactory()Ljava/util/Enumeration;: root-Branch
   * Goal 2. org.exolab.jms.config.ConnectionFactories.<init>()V: root-Branch
   */

  @Test
  public void test14()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      Enumeration enumeration0 = connectionFactories0.enumerateTopicConnectionFactory();
      assertNotNull(enumeration0);
  }
}

/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 12 20:33:38 GMT 2015
 */

package org.exolab.jms.config;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
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
   * Goal 1. org.exolab.jms.config.ConnectionFactories.setXAConnectionFactory(ILorg/exolab/jms/config/XAConnectionFactory;)V: I6 Branch 28 IFLT L751 - false
   * Goal 2. org.exolab.jms.config.ConnectionFactories.setXAConnectionFactory(ILorg/exolab/jms/config/XAConnectionFactory;)V: I14 Branch 29 IF_ICMPLE L751 - true
   */

  @Test
  public void test00()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      try {
        connectionFactories0.setXAConnectionFactory(0, (XAConnectionFactory) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
      }
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.setTopicConnectionFactory(ILorg/exolab/jms/config/TopicConnectionFactory;)V: I6 Branch 25 IFLT L721 - true
   */

  @Test
  public void test01()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      try {
        connectionFactories0.setTopicConnectionFactory((-1499), (TopicConnectionFactory) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.getXATopicConnectionFactory(I)Lorg/exolab/jms/config/XATopicConnectionFactory;: I6 Branch 16 IFLT L519 - false
   * Goal 2. org.exolab.jms.config.ConnectionFactories.getXATopicConnectionFactory(I)Lorg/exolab/jms/config/XATopicConnectionFactory;: I14 Branch 17 IF_ICMPLE L519 - false
   */

  @Test
  public void test02()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      try {
        XATopicConnectionFactory xATopicConnectionFactory0 = connectionFactories0.getXATopicConnectionFactory(113);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.getXATopicConnectionFactory(I)Lorg/exolab/jms/config/XATopicConnectionFactory;: I6 Branch 16 IFLT L519 - true
   */

  @Test
  public void test03()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      try {
        XATopicConnectionFactory xATopicConnectionFactory0 = connectionFactories0.getXATopicConnectionFactory((-3008));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.getXAQueueConnectionFactory(I)Lorg/exolab/jms/config/XAQueueConnectionFactory;: I14 Branch 14 IF_ICMPLE L482 - false
   */

  @Test
  public void test04()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      try {
        XAQueueConnectionFactory xAQueueConnectionFactory0 = connectionFactories0.getXAQueueConnectionFactory(175);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.getXAQueueConnectionFactory(I)Lorg/exolab/jms/config/XAQueueConnectionFactory;: I6 Branch 13 IFLT L482 - false
   * Goal 2. org.exolab.jms.config.ConnectionFactories.getXAQueueConnectionFactory(I)Lorg/exolab/jms/config/XAQueueConnectionFactory;: I14 Branch 14 IF_ICMPLE L482 - true
   */

  @Test
  public void test05()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      try {
        XAQueueConnectionFactory xAQueueConnectionFactory0 = connectionFactories0.getXAQueueConnectionFactory(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
      }
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.getXAConnectionFactory(I)Lorg/exolab/jms/config/XAConnectionFactory;: I14 Branch 11 IF_ICMPLE L445 - true
   */

  @Test
  public void test06()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      try {
        XAConnectionFactory xAConnectionFactory0 = connectionFactories0.getXAConnectionFactory(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
      }
  }

  //Test case number: 7
  /*
   * 2 covered goals:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.getXAConnectionFactory(I)Lorg/exolab/jms/config/XAConnectionFactory;: I6 Branch 10 IFLT L445 - false
   * Goal 2. org.exolab.jms.config.ConnectionFactories.getXAConnectionFactory(I)Lorg/exolab/jms/config/XAConnectionFactory;: I14 Branch 11 IF_ICMPLE L445 - false
   */

  @Test
  public void test07()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      try {
        XAConnectionFactory xAConnectionFactory0 = connectionFactories0.getXAConnectionFactory(800);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 8
  /*
   * 2 covered goals:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.getTopicConnectionFactory(I)Lorg/exolab/jms/config/TopicConnectionFactory;: I6 Branch 7 IFLT L408 - false
   * Goal 2. org.exolab.jms.config.ConnectionFactories.getTopicConnectionFactory(I)Lorg/exolab/jms/config/TopicConnectionFactory;: I14 Branch 8 IF_ICMPLE L408 - true
   */

  @Test
  public void test08()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      try {
        TopicConnectionFactory topicConnectionFactory0 = connectionFactories0.getTopicConnectionFactory(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
      }
  }

  //Test case number: 9
  /*
   * 2 covered goals:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.getQueueConnectionFactory(I)Lorg/exolab/jms/config/QueueConnectionFactory;: I6 Branch 4 IFLT L371 - false
   * Goal 2. org.exolab.jms.config.ConnectionFactories.getQueueConnectionFactory(I)Lorg/exolab/jms/config/QueueConnectionFactory;: I14 Branch 5 IF_ICMPLE L371 - true
   */

  @Test
  public void test09()  throws Throwable  {
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

  //Test case number: 10
  /*
   * 2 covered goals:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.getConnectionFactory(I)Lorg/exolab/jms/config/ConnectionFactory;: I6 Branch 1 IFLT L334 - false
   * Goal 2. org.exolab.jms.config.ConnectionFactories.getConnectionFactory(I)Lorg/exolab/jms/config/ConnectionFactory;: I14 Branch 2 IF_ICMPLE L334 - true
   */

  @Test
  public void test10()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      try {
        ConnectionFactory connectionFactory0 = connectionFactories0.getConnectionFactory(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
      }
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.clearConnectionFactory()V: root-Branch
   */

  @Test
  public void test11()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      connectionFactories0.clearConnectionFactory();
      assertEquals(0, connectionFactories0.getQueueConnectionFactoryCount());
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.addXATopicConnectionFactory(Lorg/exolab/jms/config/XATopicConnectionFactory;)V: root-Branch
   */

  @Test
  public void test12()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      XATopicConnectionFactory xATopicConnectionFactory0 = new XATopicConnectionFactory();
      connectionFactories0.addXATopicConnectionFactory(xATopicConnectionFactory0);
      assertEquals(0, connectionFactories0.getQueueConnectionFactoryCount());
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.addQueueConnectionFactory(Lorg/exolab/jms/config/QueueConnectionFactory;)V: root-Branch
   */

  @Test
  public void test13()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      QueueConnectionFactory queueConnectionFactory0 = new QueueConnectionFactory();
      connectionFactories0.addQueueConnectionFactory(queueConnectionFactory0);
      assertEquals(0, connectionFactories0.getXAConnectionFactoryCount());
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.enumerateXATopicConnectionFactory()Ljava/util/Enumeration;: root-Branch
   */

  @Test
  public void test14()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      Enumeration enumeration0 = connectionFactories0.enumerateXATopicConnectionFactory();
      assertNotNull(enumeration0);
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.addConnectionFactory(Lorg/exolab/jms/config/ConnectionFactory;)V: root-Branch
   */

  @Test
  public void test15()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      connectionFactories0.addConnectionFactory((ConnectionFactory) null);
      assertEquals(1, connectionFactories0.getConnectionFactoryCount());
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.addTopicConnectionFactory(ILorg/exolab/jms/config/TopicConnectionFactory;)V: root-Branch
   */

  @Test
  public void test16()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      connectionFactories0.addTopicConnectionFactory(0, (TopicConnectionFactory) null);
      assertEquals(0, connectionFactories0.getXATopicConnectionFactoryCount());
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.enumerateConnectionFactory()Ljava/util/Enumeration;: root-Branch
   */

  @Test
  public void test17()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      Enumeration enumeration0 = connectionFactories0.enumerateConnectionFactory();
      assertNotNull(enumeration0);
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.clearTopicConnectionFactory()V: root-Branch
   */

  @Test
  public void test18()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      connectionFactories0.clearTopicConnectionFactory();
      assertEquals(0, connectionFactories0.getXAQueueConnectionFactoryCount());
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.getXAQueueConnectionFactoryCount()I: root-Branch
   */

  @Test
  public void test19()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      int int0 = connectionFactories0.getXAQueueConnectionFactoryCount();
      assertEquals(0, int0);
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.removeXATopicConnectionFactory(Lorg/exolab/jms/config/XATopicConnectionFactory;)Z: root-Branch
   */

  @Test
  public void test20()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      XATopicConnectionFactory xATopicConnectionFactory0 = new XATopicConnectionFactory();
      boolean boolean0 = connectionFactories0.removeXATopicConnectionFactory(xATopicConnectionFactory0);
      assertFalse(boolean0);
  }

  //Test case number: 21
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.getTopicConnectionFactoryCount()I: root-Branch
   */

  @Test
  public void test21()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      int int0 = connectionFactories0.getTopicConnectionFactoryCount();
      assertEquals(0, int0);
  }

  //Test case number: 22
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.getXATopicConnectionFactoryCount()I: root-Branch
   */

  @Test
  public void test22()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      int int0 = connectionFactories0.getXATopicConnectionFactoryCount();
      assertEquals(0, int0);
  }

  //Test case number: 23
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.clearXATopicConnectionFactory()V: root-Branch
   */

  @Test
  public void test23()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      connectionFactories0.clearXATopicConnectionFactory();
      assertEquals(0, connectionFactories0.getXAConnectionFactoryCount());
  }

  //Test case number: 24
  /*
   * 8 covered goals:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.isValid()Z: root-Branch
   * Goal 2. org.exolab.jms.config.ConnectionFactories.validate()V: root-Branch
   * Goal 3. org.exolab.jms.config.ConnectionFactories.getConnectionFactory()[Lorg/exolab/jms/config/ConnectionFactory;: I21 Branch 3 IF_ICMPGE L348 - true
   * Goal 4. org.exolab.jms.config.ConnectionFactories.getQueueConnectionFactory()[Lorg/exolab/jms/config/QueueConnectionFactory;: I21 Branch 6 IF_ICMPGE L385 - true
   * Goal 5. org.exolab.jms.config.ConnectionFactories.getTopicConnectionFactory()[Lorg/exolab/jms/config/TopicConnectionFactory;: I21 Branch 9 IF_ICMPGE L422 - true
   * Goal 6. org.exolab.jms.config.ConnectionFactories.getXAConnectionFactory()[Lorg/exolab/jms/config/XAConnectionFactory;: I21 Branch 12 IF_ICMPGE L459 - true
   * Goal 7. org.exolab.jms.config.ConnectionFactories.getXAQueueConnectionFactory()[Lorg/exolab/jms/config/XAQueueConnectionFactory;: I21 Branch 15 IF_ICMPGE L496 - true
   * Goal 8. org.exolab.jms.config.ConnectionFactories.getXATopicConnectionFactory()[Lorg/exolab/jms/config/XATopicConnectionFactory;: I21 Branch 18 IF_ICMPGE L533 - true
   */

  @Test
  public void test24()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      boolean boolean0 = connectionFactories0.isValid();
      assertTrue(boolean0);
  }

  //Test case number: 25
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.enumerateXAConnectionFactory()Ljava/util/Enumeration;: root-Branch
   */

  @Test
  public void test25()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      Enumeration enumeration0 = connectionFactories0.enumerateXAConnectionFactory();
      assertNotNull(enumeration0);
  }

  //Test case number: 26
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.addXAConnectionFactory(Lorg/exolab/jms/config/XAConnectionFactory;)V: root-Branch
   */

  @Test
  public void test26()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      connectionFactories0.addXAConnectionFactory((XAConnectionFactory) null);
      assertEquals(0, connectionFactories0.getConnectionFactoryCount());
  }

  //Test case number: 27
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.getQueueConnectionFactoryCount()I: root-Branch
   */

  @Test
  public void test27()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      int int0 = connectionFactories0.getQueueConnectionFactoryCount();
      assertEquals(0, int0);
  }

  //Test case number: 28
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.enumerateXAQueueConnectionFactory()Ljava/util/Enumeration;: root-Branch
   */

  @Test
  public void test28()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      Enumeration enumeration0 = connectionFactories0.enumerateXAQueueConnectionFactory();
      assertNotNull(enumeration0);
  }

  //Test case number: 29
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.removeQueueConnectionFactory(Lorg/exolab/jms/config/QueueConnectionFactory;)Z: root-Branch
   */

  @Test
  public void test29()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      boolean boolean0 = connectionFactories0.removeQueueConnectionFactory((QueueConnectionFactory) null);
      assertFalse(boolean0);
  }

  //Test case number: 30
  /*
   * 2 covered goals:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.enumerateTopicConnectionFactory()Ljava/util/Enumeration;: root-Branch
   * Goal 2. org.exolab.jms.config.ConnectionFactories.<init>()V: root-Branch
   */

  @Test
  public void test30()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      Enumeration enumeration0 = connectionFactories0.enumerateTopicConnectionFactory();
      assertNotNull(enumeration0);
  }
}

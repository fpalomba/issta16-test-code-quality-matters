/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 12 21:03:19 GMT 2015
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
   * Goal 1. org.exolab.jms.config.ConnectionFactories.setConnectionFactory(ILorg/exolab/jms/config/ConnectionFactory;)V: I6 Branch 19 IFLT L661 - false
   * Goal 2. org.exolab.jms.config.ConnectionFactories.setConnectionFactory(ILorg/exolab/jms/config/ConnectionFactory;)V: I14 Branch 20 IF_ICMPLE L661 - false
   */

  @Test
  public void test00()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      ConnectionFactory connectionFactory0 = new ConnectionFactory();
      try {
        connectionFactories0.setConnectionFactory(472, connectionFactory0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.getXATopicConnectionFactory(I)Lorg/exolab/jms/config/XATopicConnectionFactory;: I6 Branch 16 IFLT L519 - false
   * Goal 2. org.exolab.jms.config.ConnectionFactories.getXATopicConnectionFactory(I)Lorg/exolab/jms/config/XATopicConnectionFactory;: I14 Branch 17 IF_ICMPLE L519 - false
   */

  @Test
  public void test01()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      try {
        XATopicConnectionFactory xATopicConnectionFactory0 = connectionFactories0.getXATopicConnectionFactory(1201);
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
   * Goal 1. org.exolab.jms.config.ConnectionFactories.getXAQueueConnectionFactory(I)Lorg/exolab/jms/config/XAQueueConnectionFactory;: I6 Branch 13 IFLT L482 - false
   * Goal 2. org.exolab.jms.config.ConnectionFactories.getXAQueueConnectionFactory(I)Lorg/exolab/jms/config/XAQueueConnectionFactory;: I14 Branch 14 IF_ICMPLE L482 - false
   */

  @Test
  public void test02()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      try {
        XAQueueConnectionFactory xAQueueConnectionFactory0 = connectionFactories0.getXAQueueConnectionFactory(1031);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.getXAConnectionFactory(I)Lorg/exolab/jms/config/XAConnectionFactory;: I6 Branch 10 IFLT L445 - false
   * Goal 2. org.exolab.jms.config.ConnectionFactories.getXAConnectionFactory(I)Lorg/exolab/jms/config/XAConnectionFactory;: I14 Branch 11 IF_ICMPLE L445 - false
   */

  @Test
  public void test03()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      try {
        XAConnectionFactory xAConnectionFactory0 = connectionFactories0.getXAConnectionFactory(947);
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
   * Goal 2. org.exolab.jms.config.ConnectionFactories.getQueueConnectionFactory(I)Lorg/exolab/jms/config/QueueConnectionFactory;: I14 Branch 5 IF_ICMPLE L371 - false
   */

  @Test
  public void test04()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      try {
        QueueConnectionFactory queueConnectionFactory0 = connectionFactories0.getQueueConnectionFactory(4900);
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
   * Goal 1. org.exolab.jms.config.ConnectionFactories.getConnectionFactory(I)Lorg/exolab/jms/config/ConnectionFactory;: I6 Branch 1 IFLT L334 - false
   * Goal 2. org.exolab.jms.config.ConnectionFactories.getConnectionFactory(I)Lorg/exolab/jms/config/ConnectionFactory;: I14 Branch 2 IF_ICMPLE L334 - true
   */

  @Test
  public void test05()  throws Throwable  {
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

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.getConnectionFactory(I)Lorg/exolab/jms/config/ConnectionFactory;: I6 Branch 1 IFLT L334 - true
   */

  @Test
  public void test06()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      try {
        ConnectionFactory connectionFactory0 = connectionFactories0.getConnectionFactory((-2114));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.addQueueConnectionFactory(Lorg/exolab/jms/config/QueueConnectionFactory;)V: root-Branch
   */

  @Test
  public void test07()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      QueueConnectionFactory queueConnectionFactory0 = new QueueConnectionFactory();
      connectionFactories0.addQueueConnectionFactory(queueConnectionFactory0);
      assertEquals(0, connectionFactories0.getXAQueueConnectionFactoryCount());
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.addTopicConnectionFactory(ILorg/exolab/jms/config/TopicConnectionFactory;)V: root-Branch
   */

  @Test
  public void test08()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      TopicConnectionFactory topicConnectionFactory0 = new TopicConnectionFactory();
      connectionFactories0.addTopicConnectionFactory(0, topicConnectionFactory0);
      assertEquals(0, connectionFactories0.getXAQueueConnectionFactoryCount());
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.clearTopicConnectionFactory()V: root-Branch
   */

  @Test
  public void test09()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      connectionFactories0.clearTopicConnectionFactory();
      assertEquals(0, connectionFactories0.getQueueConnectionFactoryCount());
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.getXAQueueConnectionFactoryCount()I: root-Branch
   */

  @Test
  public void test10()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      int int0 = connectionFactories0.getXAQueueConnectionFactoryCount();
      assertEquals(0, int0);
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.getConnectionFactoryCount()I: root-Branch
   */

  @Test
  public void test11()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      int int0 = connectionFactories0.getConnectionFactoryCount();
      assertEquals(0, int0);
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.getTopicConnectionFactoryCount()I: root-Branch
   */

  @Test
  public void test12()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      int int0 = connectionFactories0.getTopicConnectionFactoryCount();
      assertEquals(0, int0);
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.getXATopicConnectionFactoryCount()I: root-Branch
   */

  @Test
  public void test13()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      int int0 = connectionFactories0.getXATopicConnectionFactoryCount();
      assertEquals(0, int0);
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.getXATopicConnectionFactory()[Lorg/exolab/jms/config/XATopicConnectionFactory;: I21 Branch 18 IF_ICMPGE L533 - true
   */

  @Test
  public void test14()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      boolean boolean0 = connectionFactories0.isValid();
      assertTrue(boolean0);
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.enumerateQueueConnectionFactory()Ljava/util/Enumeration;: root-Branch
   */

  @Test
  public void test15()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      Enumeration enumeration0 = connectionFactories0.enumerateQueueConnectionFactory();
      assertNotNull(enumeration0);
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.clearQueueConnectionFactory()V: root-Branch
   */

  @Test
  public void test16()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      connectionFactories0.clearQueueConnectionFactory();
      assertEquals(0, connectionFactories0.getTopicConnectionFactoryCount());
  }

  //Test case number: 17
  /*
   * 10 covered goals:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.<init>()V: root-Branch
   * Goal 2. org.exolab.jms.config.ConnectionFactories.addXAQueueConnectionFactory(Lorg/exolab/jms/config/XAQueueConnectionFactory;)V: root-Branch
   * Goal 3. org.exolab.jms.config.ConnectionFactories.isValid()Z: root-Branch
   * Goal 4. org.exolab.jms.config.ConnectionFactories.validate()V: root-Branch
   * Goal 5. org.exolab.jms.config.ConnectionFactories.getConnectionFactory()[Lorg/exolab/jms/config/ConnectionFactory;: I21 Branch 3 IF_ICMPGE L348 - true
   * Goal 6. org.exolab.jms.config.ConnectionFactories.getQueueConnectionFactory()[Lorg/exolab/jms/config/QueueConnectionFactory;: I21 Branch 6 IF_ICMPGE L385 - true
   * Goal 7. org.exolab.jms.config.ConnectionFactories.getTopicConnectionFactory()[Lorg/exolab/jms/config/TopicConnectionFactory;: I21 Branch 9 IF_ICMPGE L422 - true
   * Goal 8. org.exolab.jms.config.ConnectionFactories.getXAConnectionFactory()[Lorg/exolab/jms/config/XAConnectionFactory;: I21 Branch 12 IF_ICMPGE L459 - true
   * Goal 9. org.exolab.jms.config.ConnectionFactories.getXAQueueConnectionFactory()[Lorg/exolab/jms/config/XAQueueConnectionFactory;: I21 Branch 15 IF_ICMPGE L496 - true
   * Goal 10. org.exolab.jms.config.ConnectionFactories.getXAQueueConnectionFactory()[Lorg/exolab/jms/config/XAQueueConnectionFactory;: I21 Branch 15 IF_ICMPGE L496 - false
   */

  @Test
  public void test17()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      XAQueueConnectionFactory xAQueueConnectionFactory0 = new XAQueueConnectionFactory();
      connectionFactories0.addXAQueueConnectionFactory(xAQueueConnectionFactory0);
      boolean boolean0 = connectionFactories0.isValid();
      assertFalse(boolean0);
  }
}

/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 12 16:17:46 GMT 2015
 */

package org.exolab.jms.config;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.PipedWriter;
import java.io.Writer;
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
import org.xml.sax.ContentHandler;
import org.xml.sax.helpers.XMLReaderAdapter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ConnectionFactories_ESTest extends ConnectionFactories_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.setXATopicConnectionFactory(ILorg/exolab/jms/config/XATopicConnectionFactory;)V: I6 Branch 34 IFLT L811 - false
   * Goal 2. org.exolab.jms.config.ConnectionFactories.setXATopicConnectionFactory(ILorg/exolab/jms/config/XATopicConnectionFactory;)V: I14 Branch 35 IF_ICMPLE L811 - false
   */

  @Test
  public void test00()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      XATopicConnectionFactory xATopicConnectionFactory0 = new XATopicConnectionFactory();
      try {
        connectionFactories0.setXATopicConnectionFactory(33, xATopicConnectionFactory0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.getTopicConnectionFactory(I)Lorg/exolab/jms/config/TopicConnectionFactory;: I14 Branch 8 IF_ICMPLE L408 - true
   */

  @Test
  public void test01()  throws Throwable  {
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

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.removeQueueConnectionFactory(Lorg/exolab/jms/config/QueueConnectionFactory;)Z: root-Branch
   */

  @Test
  public void test02()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      boolean boolean0 = connectionFactories0.removeQueueConnectionFactory((QueueConnectionFactory) null);
      assertFalse(boolean0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.addXAQueueConnectionFactory(ILorg/exolab/jms/config/XAQueueConnectionFactory;)V: root-Branch
   */

  @Test
  public void test03()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      XAQueueConnectionFactory xAQueueConnectionFactory0 = new XAQueueConnectionFactory();
      try {
        connectionFactories0.addXAQueueConnectionFactory((-1917), xAQueueConnectionFactory0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -1917, Size: 0
         //
      }
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.setXAConnectionFactory([Lorg/exolab/jms/config/XAConnectionFactory;)V: I16 Branch 30 IF_ICMPGE L766 - true
   * Goal 2. org.exolab.jms.config.ConnectionFactories.setXAConnectionFactory([Lorg/exolab/jms/config/XAConnectionFactory;)V: I16 Branch 30 IF_ICMPGE L766 - false
   */

  @Test
  public void test04()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      XAConnectionFactory[] xAConnectionFactoryArray0 = new XAConnectionFactory[3];
      connectionFactories0.setXAConnectionFactory(xAConnectionFactoryArray0);
      assertEquals(3, connectionFactories0.getXAConnectionFactoryCount());
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.clearXAConnectionFactory()V: root-Branch
   * Goal 2. org.exolab.jms.config.ConnectionFactories.setTopicConnectionFactory(ILorg/exolab/jms/config/TopicConnectionFactory;)V: I6 Branch 25 IFLT L721 - true
   */

  @Test
  public void test05()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      connectionFactories0.clearXAConnectionFactory();
      TopicConnectionFactory topicConnectionFactory0 = new TopicConnectionFactory();
      try {
        connectionFactories0.setTopicConnectionFactory((-3639), topicConnectionFactory0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.getXATopicConnectionFactory(I)Lorg/exolab/jms/config/XATopicConnectionFactory;: I14 Branch 17 IF_ICMPLE L519 - true
   */

  @Test
  public void test06()  throws Throwable  {
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

  //Test case number: 7
  /*
   * 3 covered goals:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.enumerateQueueConnectionFactory()Ljava/util/Enumeration;: root-Branch
   * Goal 2. org.exolab.jms.config.ConnectionFactories.addXATopicConnectionFactory(Lorg/exolab/jms/config/XATopicConnectionFactory;)V: root-Branch
   * Goal 3. org.exolab.jms.config.ConnectionFactories.getConnectionFactory(I)Lorg/exolab/jms/config/ConnectionFactory;: I14 Branch 2 IF_ICMPLE L334 - false
   */

  @Test
  public void test07()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      connectionFactories0.addXATopicConnectionFactory((XATopicConnectionFactory) null);
      Enumeration enumeration0 = connectionFactories0.enumerateQueueConnectionFactory();
      try {
        ConnectionFactory connectionFactory0 = connectionFactories0.getConnectionFactory((int) '|');
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.marshal(Lorg/xml/sax/ContentHandler;)V: root-Branch
   */

  @Test
  public void test08()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      XMLReaderAdapter xMLReaderAdapter0 = new XMLReaderAdapter();
      // Undeclared exception!
      try {
        connectionFactories0.marshal((ContentHandler) xMLReaderAdapter0);
        fail("Expecting exception: VerifyError");
      
      } catch(VerifyError e) {
         //
         // (class: org/exolab/castor/util/NestedIOException, method: printStackTrace signature: ()V) Illegal use of nonvirtual function call
         //
      }
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.getXAQueueConnectionFactory(I)Lorg/exolab/jms/config/XAQueueConnectionFactory;: I14 Branch 14 IF_ICMPLE L482 - false
   */

  @Test
  public void test09()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      try {
        XAQueueConnectionFactory xAQueueConnectionFactory0 = connectionFactories0.getXAQueueConnectionFactory(6671);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 10
  /*
   * 3 covered goals:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.enumerateXAQueueConnectionFactory()Ljava/util/Enumeration;: root-Branch
   * Goal 2. org.exolab.jms.config.ConnectionFactories.addTopicConnectionFactory(Lorg/exolab/jms/config/TopicConnectionFactory;)V: root-Branch
   * Goal 3. org.exolab.jms.config.ConnectionFactories.getQueueConnectionFactory(I)Lorg/exolab/jms/config/QueueConnectionFactory;: I14 Branch 5 IF_ICMPLE L371 - true
   */

  @Test
  public void test10()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      Enumeration enumeration0 = connectionFactories0.enumerateXAQueueConnectionFactory();
      int int0 = connectionFactories0.getTopicConnectionFactoryCount();
      TopicConnectionFactory topicConnectionFactory0 = new TopicConnectionFactory();
      connectionFactories0.addTopicConnectionFactory(topicConnectionFactory0);
      try {
        QueueConnectionFactory queueConnectionFactory0 = connectionFactories0.getQueueConnectionFactory(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
      }
  }

  //Test case number: 11
  /*
   * 2 covered goals:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.setXAConnectionFactory(ILorg/exolab/jms/config/XAConnectionFactory;)V: I6 Branch 28 IFLT L751 - false
   * Goal 2. org.exolab.jms.config.ConnectionFactories.setXAConnectionFactory(ILorg/exolab/jms/config/XAConnectionFactory;)V: I14 Branch 29 IF_ICMPLE L751 - false
   */

  @Test
  public void test11()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      XAConnectionFactory xAConnectionFactory0 = new XAConnectionFactory();
      try {
        connectionFactories0.setXAConnectionFactory((int) (byte)73, xAConnectionFactory0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.setConnectionFactory(ILorg/exolab/jms/config/ConnectionFactory;)V: I14 Branch 20 IF_ICMPLE L661 - true
   */

  @Test
  public void test12()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      int int0 = connectionFactories0.getXAConnectionFactoryCount();
      assertEquals(0, int0);
      
      try {
        connectionFactories0.setConnectionFactory(0, (ConnectionFactory) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
      }
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.removeConnectionFactory(Lorg/exolab/jms/config/ConnectionFactory;)Z: root-Branch
   */

  @Test
  public void test13()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      boolean boolean0 = connectionFactories0.removeConnectionFactory((ConnectionFactory) null);
      assertFalse(boolean0);
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.addXAQueueConnectionFactory(Lorg/exolab/jms/config/XAQueueConnectionFactory;)V: root-Branch
   */

  @Test
  public void test14()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      XAQueueConnectionFactory xAQueueConnectionFactory0 = new XAQueueConnectionFactory();
      connectionFactories0.addXAQueueConnectionFactory(xAQueueConnectionFactory0);
      assertEquals(0, connectionFactories0.getTopicConnectionFactoryCount());
  }

  //Test case number: 15
  /*
   * 2 covered goals:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.setTopicConnectionFactory([Lorg/exolab/jms/config/TopicConnectionFactory;)V: I16 Branch 27 IF_ICMPGE L736 - true
   * Goal 2. org.exolab.jms.config.ConnectionFactories.setTopicConnectionFactory([Lorg/exolab/jms/config/TopicConnectionFactory;)V: I16 Branch 27 IF_ICMPGE L736 - false
   */

  @Test
  public void test15()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      TopicConnectionFactory[] topicConnectionFactoryArray0 = new TopicConnectionFactory[3];
      connectionFactories0.setTopicConnectionFactory(topicConnectionFactoryArray0);
      assertEquals(3, connectionFactories0.getTopicConnectionFactoryCount());
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.getXAConnectionFactory(I)Lorg/exolab/jms/config/XAConnectionFactory;: I14 Branch 11 IF_ICMPLE L445 - true
   */

  @Test
  public void test16()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      int int0 = connectionFactories0.getXATopicConnectionFactoryCount();
      try {
        XAConnectionFactory xAConnectionFactory0 = connectionFactories0.getXAConnectionFactory(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
      }
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.getTopicConnectionFactory(I)Lorg/exolab/jms/config/TopicConnectionFactory;: I6 Branch 7 IFLT L408 - true
   */

  @Test
  public void test17()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      try {
        TopicConnectionFactory topicConnectionFactory0 = connectionFactories0.getTopicConnectionFactory((int) (byte) (-4));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 18
  /*
   * 3 covered goals:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.enumerateTopicConnectionFactory()Ljava/util/Enumeration;: root-Branch
   * Goal 2. org.exolab.jms.config.ConnectionFactories.getQueueConnectionFactoryCount()I: root-Branch
   * Goal 3. org.exolab.jms.config.ConnectionFactories.enumerateXAConnectionFactory()Ljava/util/Enumeration;: root-Branch
   */

  @Test
  public void test18()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      Enumeration enumeration0 = connectionFactories0.enumerateXAConnectionFactory();
      Enumeration enumeration1 = connectionFactories0.enumerateTopicConnectionFactory();
      int int0 = connectionFactories0.getQueueConnectionFactoryCount();
      assertEquals(0, int0);
  }

  //Test case number: 19
  /*
   * 2 covered goals:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.isValid()Z: root-Branch
   * Goal 2. org.exolab.jms.config.ConnectionFactories.validate()V: root-Branch
   */

  @Test
  public void test19()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      boolean boolean0 = connectionFactories0.isValid();
      assertTrue(boolean0);
  }

  //Test case number: 20
  /*
   * 2 covered goals:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.getXATopicConnectionFactory(I)Lorg/exolab/jms/config/XATopicConnectionFactory;: I6 Branch 16 IFLT L519 - false
   * Goal 2. org.exolab.jms.config.ConnectionFactories.getXATopicConnectionFactory(I)Lorg/exolab/jms/config/XATopicConnectionFactory;: I14 Branch 17 IF_ICMPLE L519 - false
   */

  @Test
  public void test20()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      try {
        XATopicConnectionFactory xATopicConnectionFactory0 = connectionFactories0.getXATopicConnectionFactory(5);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 21
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.enumerateConnectionFactory()Ljava/util/Enumeration;: root-Branch
   */

  @Test
  public void test21()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      Enumeration enumeration0 = connectionFactories0.enumerateConnectionFactory();
      assertNotNull(enumeration0);
  }

  //Test case number: 22
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.clearTopicConnectionFactory()V: root-Branch
   */

  @Test
  public void test22()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      connectionFactories0.clearTopicConnectionFactory();
      assertEquals(0, connectionFactories0.getQueueConnectionFactoryCount());
  }

  //Test case number: 23
  /*
   * 2 covered goals:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.getQueueConnectionFactory(I)Lorg/exolab/jms/config/QueueConnectionFactory;: I6 Branch 4 IFLT L371 - false
   * Goal 2. org.exolab.jms.config.ConnectionFactories.getQueueConnectionFactory(I)Lorg/exolab/jms/config/QueueConnectionFactory;: I14 Branch 5 IF_ICMPLE L371 - false
   */

  @Test
  public void test23()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      try {
        QueueConnectionFactory queueConnectionFactory0 = connectionFactories0.getQueueConnectionFactory(7989);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 24
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.clearConnectionFactory()V: root-Branch
   */

  @Test
  public void test24()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      connectionFactories0.clearConnectionFactory();
      assertEquals(0, connectionFactories0.getXAQueueConnectionFactoryCount());
  }

  //Test case number: 25
  /*
   * 2 covered goals:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.enumerateXATopicConnectionFactory()Ljava/util/Enumeration;: root-Branch
   * Goal 2. org.exolab.jms.config.ConnectionFactories.getQueueConnectionFactory(I)Lorg/exolab/jms/config/QueueConnectionFactory;: I6 Branch 4 IFLT L371 - true
   */

  @Test
  public void test25()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      Enumeration enumeration0 = connectionFactories0.enumerateXATopicConnectionFactory();
      try {
        QueueConnectionFactory queueConnectionFactory0 = connectionFactories0.getQueueConnectionFactory((-3607));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 26
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.addConnectionFactory(ILorg/exolab/jms/config/ConnectionFactory;)V: root-Branch
   */

  @Test
  public void test26()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      ConnectionFactory connectionFactory0 = new ConnectionFactory();
      try {
        connectionFactories0.addConnectionFactory(2049, connectionFactory0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2049, Size: 0
         //
      }
  }

  //Test case number: 27
  /*
   * 2 covered goals:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.setConnectionFactory([Lorg/exolab/jms/config/ConnectionFactory;)V: I16 Branch 21 IF_ICMPGE L676 - true
   * Goal 2. org.exolab.jms.config.ConnectionFactories.setConnectionFactory([Lorg/exolab/jms/config/ConnectionFactory;)V: I16 Branch 21 IF_ICMPGE L676 - false
   */

  @Test
  public void test27()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      ConnectionFactory[] connectionFactoryArray0 = new ConnectionFactory[8];
      connectionFactories0.setConnectionFactory(connectionFactoryArray0);
      assertEquals(8, connectionFactories0.getConnectionFactoryCount());
  }

  //Test case number: 28
  /*
   * 4 covered goals:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.marshal(Ljava/io/Writer;)V: root-Branch
   * Goal 2. org.exolab.jms.config.ConnectionFactories.getQueueConnectionFactory()[Lorg/exolab/jms/config/QueueConnectionFactory;: I21 Branch 6 IF_ICMPGE L385 - true
   * Goal 3. org.exolab.jms.config.ConnectionFactories.getTopicConnectionFactory()[Lorg/exolab/jms/config/TopicConnectionFactory;: I21 Branch 9 IF_ICMPGE L422 - true
   * Goal 4. org.exolab.jms.config.ConnectionFactories.getXAConnectionFactory()[Lorg/exolab/jms/config/XAConnectionFactory;: I21 Branch 12 IF_ICMPGE L459 - true
   */

  @Test
  public void test28()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      PipedWriter pipedWriter0 = new PipedWriter();
      // Undeclared exception!
      try {
        connectionFactories0.marshal((Writer) pipedWriter0);
        fail("Expecting exception: VerifyError");
      
      } catch(VerifyError e) {
         //
         // (class: org/exolab/castor/xml/XMLException, method: printStackTrace signature: ()V) Illegal use of nonvirtual function call
         //
      }
  }

  //Test case number: 29
  /*
   * 3 covered goals:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.getConnectionFactoryCount()I: root-Branch
   * Goal 2. org.exolab.jms.config.ConnectionFactories.getConnectionFactory(I)Lorg/exolab/jms/config/ConnectionFactory;: I6 Branch 1 IFLT L334 - false
   * Goal 3. org.exolab.jms.config.ConnectionFactories.getConnectionFactory(I)Lorg/exolab/jms/config/ConnectionFactory;: I14 Branch 2 IF_ICMPLE L334 - true
   */

  @Test
  public void test29()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      int int0 = connectionFactories0.getConnectionFactoryCount();
      try {
        ConnectionFactory connectionFactory0 = connectionFactories0.getConnectionFactory(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
      }
  }

  //Test case number: 30
  /*
   * 2 covered goals:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.getTopicConnectionFactory(I)Lorg/exolab/jms/config/TopicConnectionFactory;: I6 Branch 7 IFLT L408 - false
   * Goal 2. org.exolab.jms.config.ConnectionFactories.getTopicConnectionFactory(I)Lorg/exolab/jms/config/TopicConnectionFactory;: I14 Branch 8 IF_ICMPLE L408 - false
   */

  @Test
  public void test30()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      try {
        TopicConnectionFactory topicConnectionFactory0 = connectionFactories0.getTopicConnectionFactory((int) (byte)62);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 31
  /*
   * 2 covered goals:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.getXAConnectionFactory(I)Lorg/exolab/jms/config/XAConnectionFactory;: I6 Branch 10 IFLT L445 - false
   * Goal 2. org.exolab.jms.config.ConnectionFactories.getXAConnectionFactory(I)Lorg/exolab/jms/config/XAConnectionFactory;: I14 Branch 11 IF_ICMPLE L445 - false
   */

  @Test
  public void test31()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      try {
        XAConnectionFactory xAConnectionFactory0 = connectionFactories0.getXAConnectionFactory(8);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 32
  /*
   * 2 covered goals:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.clearQueueConnectionFactory()V: root-Branch
   * Goal 2. org.exolab.jms.config.ConnectionFactories.getXAConnectionFactory(I)Lorg/exolab/jms/config/XAConnectionFactory;: I6 Branch 10 IFLT L445 - true
   */

  @Test
  public void test32()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      connectionFactories0.clearQueueConnectionFactory();
      try {
        XAConnectionFactory xAConnectionFactory0 = connectionFactories0.getXAConnectionFactory((-28));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 33
  /*
   * 2 covered goals:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.clearXAQueueConnectionFactory()V: root-Branch
   * Goal 2. org.exolab.jms.config.ConnectionFactories.addQueueConnectionFactory(Lorg/exolab/jms/config/QueueConnectionFactory;)V: root-Branch
   */

  @Test
  public void test33()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      connectionFactories0.clearXAQueueConnectionFactory();
      connectionFactories0.addQueueConnectionFactory((QueueConnectionFactory) null);
      assertEquals(0, connectionFactories0.getXAQueueConnectionFactoryCount());
  }

  //Test case number: 34
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.setXAConnectionFactory(ILorg/exolab/jms/config/XAConnectionFactory;)V: I6 Branch 28 IFLT L751 - true
   */

  @Test
  public void test34()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      XAConnectionFactory xAConnectionFactory0 = new XAConnectionFactory();
      try {
        connectionFactories0.setXAConnectionFactory((int) (byte) (-73), xAConnectionFactory0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 35
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.getXAQueueConnectionFactory(I)Lorg/exolab/jms/config/XAQueueConnectionFactory;: I6 Branch 13 IFLT L482 - true
   */

  @Test
  public void test35()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      try {
        XAQueueConnectionFactory xAQueueConnectionFactory0 = connectionFactories0.getXAQueueConnectionFactory((-1633));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 36
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.getConnectionFactory(I)Lorg/exolab/jms/config/ConnectionFactory;: I6 Branch 1 IFLT L334 - true
   */

  @Test
  public void test36()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      try {
        ConnectionFactory connectionFactory0 = connectionFactories0.getConnectionFactory((-3468));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 37
  /*
   * 4 covered goals:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.getConnectionFactory()[Lorg/exolab/jms/config/ConnectionFactory;: I21 Branch 3 IF_ICMPGE L348 - true
   * Goal 2. org.exolab.jms.config.ConnectionFactories.getXAQueueConnectionFactory()[Lorg/exolab/jms/config/XAQueueConnectionFactory;: I21 Branch 15 IF_ICMPGE L496 - true
   * Goal 3. org.exolab.jms.config.ConnectionFactories.setConnectionFactory(ILorg/exolab/jms/config/ConnectionFactory;)V: I6 Branch 19 IFLT L661 - false
   * Goal 4. org.exolab.jms.config.ConnectionFactories.setConnectionFactory(ILorg/exolab/jms/config/ConnectionFactory;)V: I14 Branch 20 IF_ICMPLE L661 - false
   */

  @Test
  public void test37()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      XAQueueConnectionFactory[] xAQueueConnectionFactoryArray0 = connectionFactories0.getXAQueueConnectionFactory();
      ConnectionFactory[] connectionFactoryArray0 = connectionFactories0.getConnectionFactory();
      try {
        connectionFactories0.setConnectionFactory(33, (ConnectionFactory) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 38
  /*
   * 1 covered goal:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.setXATopicConnectionFactory(ILorg/exolab/jms/config/XATopicConnectionFactory;)V: I6 Branch 34 IFLT L811 - true
   */

  @Test
  public void test38()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      XATopicConnectionFactory xATopicConnectionFactory0 = new XATopicConnectionFactory();
      try {
        connectionFactories0.setXATopicConnectionFactory((-2504), xATopicConnectionFactory0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 39
  /*
   * 5 covered goals:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.getXATopicConnectionFactoryCount()I: root-Branch
   * Goal 2. org.exolab.jms.config.ConnectionFactories.getXAQueueConnectionFactoryCount()I: root-Branch
   * Goal 3. org.exolab.jms.config.ConnectionFactories.addXATopicConnectionFactory(ILorg/exolab/jms/config/XATopicConnectionFactory;)V: root-Branch
   * Goal 4. org.exolab.jms.config.ConnectionFactories.getXAQueueConnectionFactory(I)Lorg/exolab/jms/config/XAQueueConnectionFactory;: I6 Branch 13 IFLT L482 - false
   * Goal 5. org.exolab.jms.config.ConnectionFactories.getXAQueueConnectionFactory(I)Lorg/exolab/jms/config/XAQueueConnectionFactory;: I14 Branch 14 IF_ICMPLE L482 - true
   */

  @Test
  public void test39()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      int int0 = connectionFactories0.getXATopicConnectionFactoryCount();
      int int1 = connectionFactories0.getXAQueueConnectionFactoryCount();
      connectionFactories0.addXATopicConnectionFactory(0, (XATopicConnectionFactory) null);
      try {
        XAQueueConnectionFactory xAQueueConnectionFactory0 = connectionFactories0.getXAQueueConnectionFactory(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
      }
  }

  //Test case number: 40
  /*
   * 4 covered goals:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.removeXAQueueConnectionFactory(Lorg/exolab/jms/config/XAQueueConnectionFactory;)Z: root-Branch
   * Goal 2. org.exolab.jms.config.ConnectionFactories.clearXATopicConnectionFactory()V: root-Branch
   * Goal 3. org.exolab.jms.config.ConnectionFactories.getTopicConnectionFactoryCount()I: root-Branch
   * Goal 4. org.exolab.jms.config.ConnectionFactories.getXATopicConnectionFactory()[Lorg/exolab/jms/config/XATopicConnectionFactory;: I21 Branch 18 IF_ICMPGE L533 - true
   */

  @Test
  public void test40()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      connectionFactories0.clearXATopicConnectionFactory();
      XAQueueConnectionFactory xAQueueConnectionFactory0 = new XAQueueConnectionFactory();
      boolean boolean0 = connectionFactories0.removeXAQueueConnectionFactory(xAQueueConnectionFactory0);
      int int0 = connectionFactories0.getTopicConnectionFactoryCount();
      XATopicConnectionFactory[] xATopicConnectionFactoryArray0 = connectionFactories0.getXATopicConnectionFactory();
      assertNotNull(xATopicConnectionFactoryArray0);
  }

  //Test case number: 41
  /*
   * 2 covered goals:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.removeXATopicConnectionFactory(Lorg/exolab/jms/config/XATopicConnectionFactory;)Z: root-Branch
   * Goal 2. org.exolab.jms.config.ConnectionFactories.addQueueConnectionFactory(ILorg/exolab/jms/config/QueueConnectionFactory;)V: root-Branch
   */

  @Test
  public void test41()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      XATopicConnectionFactory xATopicConnectionFactory0 = new XATopicConnectionFactory();
      boolean boolean0 = connectionFactories0.removeXATopicConnectionFactory(xATopicConnectionFactory0);
      try {
        connectionFactories0.addQueueConnectionFactory((-1407), (QueueConnectionFactory) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -1407, Size: 0
         //
      }
  }

  //Test case number: 42
  /*
   * 2 covered goals:
   * Goal 1. org.exolab.jms.config.ConnectionFactories.<init>()V: root-Branch
   * Goal 2. org.exolab.jms.config.ConnectionFactories.getXATopicConnectionFactory(I)Lorg/exolab/jms/config/XATopicConnectionFactory;: I6 Branch 16 IFLT L519 - true
   */

  @Test
  public void test42()  throws Throwable  {
      ConnectionFactories connectionFactories0 = new ConnectionFactories();
      try {
        XATopicConnectionFactory xATopicConnectionFactory0 = connectionFactories0.getXATopicConnectionFactory((-538));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}

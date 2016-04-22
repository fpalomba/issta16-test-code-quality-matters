/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 11 16:34:05 GMT 2015
 */

package org.quickserver.util.xmlreader;

import static org.junit.Assert.*;
import org.junit.Test;
import java.nio.charset.UnsupportedCharsetException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.junit.runner.RunWith;
import org.quickserver.util.xmlreader.AdvancedSettings;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class AdvancedSettings_ESTest extends AdvancedSettings_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.toXML(Ljava/lang/String;)Ljava/lang/String;: I225 Branch 11 IFEQ L289 - false
   */

  @Test
  public void test00()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      int int0 = advancedSettings0.getSocketLinger();
      advancedSettings0.setClientSocketReceiveBufferSize((-1));
      String string0 = advancedSettings0.getQSObjectPoolMaker();
      String string1 = advancedSettings0.toXML("org.quickserver.util.pool.MakeQSObjectPool");
      assertEquals(-1, advancedSettings0.getClientSocketReceiveBufferSize());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setCharset(Ljava/lang/String;)V: I6 Branch 1 IFNULL L76 - true
   */

  @Test
  public void test01()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      String string0 = advancedSettings0.getClientSocketTrafficClass();
      advancedSettings0.setCharset((String) null);
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(-1, advancedSettings0.getSocketLinger());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setClientIdentifier(Ljava/lang/String;)V: I13 Branch 7 IFNE L192 - false
   */

  @Test
  public void test02()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientIdentifier("");
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(0, advancedSettings0.getBacklog());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(-1, advancedSettings0.getSocketLinger());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setQSObjectPoolMaker(Ljava/lang/String;)V: root-Branch
   */

  @Test
  public void test03()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      String string0 = advancedSettings0.getCharset();
      assertEquals("ISO-8859-1", string0);
      
      advancedSettings0.setQSObjectPoolMaker("ISO-8859-1");
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(-1, advancedSettings0.getSocketLinger());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.toXML(Ljava/lang/String;)Ljava/lang/String;: I204 Branch 10 IFNULL L283 - false
   */

  @Test
  public void test04()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      String string0 = advancedSettings0.toXML("_");
      advancedSettings0.setClientSocketTrafficClass("_<advanced-settings>\n_\t<charset>ISO-8859-1</charset>\n_\t<use-direct-byte-buffer>true</use-direct-byte-buffer>\n_\t<byte-buffer-size>65536</byte-buffer-size>\n_\t<backlog>0</backlog>\n_\t<socket-linger>-1</socket-linger>\n_\t<debug-non-blocking-mode>false</debug-non-blocking-mode>\n_\t<client-identifier>org.quickserver.net.server.impl.OptimisticClientIdentifier</client-identifier>\n_\t<qsobject-pool-maker>org.quickserver.util.pool.MakeQSObjectPool</qsobject-pool-maker>\n_\t<max-threads-for-nio-write>10</max-threads-for-nio-write>\n_\t<performance-preferences-connection-time>0</performance-preferences-connection-time>\n_\t<performance-preferences-latency>0</performance-preferences-latency>\n_\t<performance-preferences-bandwidth>0</performance-preferences-bandwidth>\n_\t<client-socket-tcp-no-delay>false</client-socket-tcp-no-delay>\n_</advanced-settings>\n");
      String string1 = advancedSettings0.toXML("_");
      assertEquals("_<advanced-settings>\n_\t<charset>ISO-8859-1</charset>\n_\t<use-direct-byte-buffer>true</use-direct-byte-buffer>\n_\t<byte-buffer-size>65536</byte-buffer-size>\n_\t<backlog>0</backlog>\n_\t<socket-linger>-1</socket-linger>\n_\t<debug-non-blocking-mode>false</debug-non-blocking-mode>\n_\t<client-identifier>org.quickserver.net.server.impl.OptimisticClientIdentifier</client-identifier>\n_\t<qsobject-pool-maker>org.quickserver.util.pool.MakeQSObjectPool</qsobject-pool-maker>\n_\t<max-threads-for-nio-write>10</max-threads-for-nio-write>\n_\t<performance-preferences-connection-time>0</performance-preferences-connection-time>\n_\t<performance-preferences-latency>0</performance-preferences-latency>\n_\t<performance-preferences-bandwidth>0</performance-preferences-bandwidth>\n_\t<client-socket-tcp-no-delay>false</client-socket-tcp-no-delay>\n_\t<client-socket-traffic-class>_<advanced-settings>\n_\t<charset>ISO-8859-1</charset>\n_\t<use-direct-byte-buffer>true</use-direct-byte-buffer>\n_\t<byte-buffer-size>65536</byte-buffer-size>\n_\t<backlog>0</backlog>\n_\t<socket-linger>-1</socket-linger>\n_\t<debug-non-blocking-mode>false</debug-non-blocking-mode>\n_\t<client-identifier>org.quickserver.net.server.impl.OptimisticClientIdentifier</client-identifier>\n_\t<qsobject-pool-maker>org.quickserver.util.pool.MakeQSObjectPool</qsobject-pool-maker>\n_\t<max-threads-for-nio-write>10</max-threads-for-nio-write>\n_\t<performance-preferences-connection-time>0</performance-preferences-connection-time>\n_\t<performance-preferences-latency>0</performance-preferences-latency>\n_\t<performance-preferences-bandwidth>0</performance-preferences-bandwidth>\n_\t<client-socket-tcp-no-delay>false</client-socket-tcp-no-delay>\n_</advanced-settings>\n</client-socket-traffic-class>\n_</advanced-settings>\n", string1);
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setClientSocketTrafficClass(Ljava/lang/String;)V: root-Branch
   */

  @Test
  public void test05()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketTrafficClass("**ti~r\"?)p");
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(-1, advancedSettings0.getSocketLinger());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setUseDirectByteBuffer(Z)V: root-Branch
   */

  @Test
  public void test06()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      
      advancedSettings0.setUseDirectByteBuffer(false);
      assertFalse(advancedSettings0.getUseDirectByteBuffer());
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setMaxThreadsForNioWrite(I)V: root-Branch
   */

  @Test
  public void test07()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setMaxThreadsForNioWrite(4701);
      assertEquals(4701, advancedSettings0.getMaxThreadsForNioWrite());
  }

  //Test case number: 8
  /*
   * 2 covered goals:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setClientIdentifier(Ljava/lang/String;)V: I6 Branch 6 IFNULL L192 - false
   * Goal 2. org.quickserver.util.xmlreader.AdvancedSettings.setClientIdentifier(Ljava/lang/String;)V: I13 Branch 7 IFNE L192 - true
   */

  @Test
  public void test08()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientIdentifier("tA|EET");
      assertEquals("tA|EET", advancedSettings0.getClientIdentifier());
  }

  //Test case number: 9
  /*
   * 3 covered goals:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setDebugNonBlockingMode(Z)V: root-Branch
   * Goal 2. org.quickserver.util.xmlreader.AdvancedSettings.setPerformancePreferencesLatency(I)V: root-Branch
   * Goal 3. org.quickserver.util.xmlreader.AdvancedSettings.setCharset(Ljava/lang/String;)V: I24 Branch 3 IFNE L78 - false
   */

  @Test
  public void test09()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      int int0 = advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.setPerformancePreferencesLatency(0);
      String string0 = advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setDebugNonBlockingMode(true);
      // Undeclared exception!
      try {
        advancedSettings0.setCharset("org.quickserver.util.pool.MakeQSObjectPool");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // org.quickserver.util.pool.MakeQSObjectPool
         //
      }
  }

  //Test case number: 10
  /*
   * 3 covered goals:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setSocketLinger(I)V: root-Branch
   * Goal 2. org.quickserver.util.xmlreader.AdvancedSettings.setCharset(Ljava/lang/String;)V: I13 Branch 2 IFNE L76 - true
   * Goal 3. org.quickserver.util.xmlreader.AdvancedSettings.setCharset(Ljava/lang/String;)V: I24 Branch 3 IFNE L78 - true
   */

  @Test
  public void test10()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      int int0 = advancedSettings0.getClientSocketReceiveBufferSize();
      String string0 = advancedSettings0.getCharset();
      assertEquals(-1, advancedSettings0.getSocketLinger());
      
      advancedSettings0.setSocketLinger(0);
      advancedSettings0.setCharset("ISO-8859-1");
      assertEquals(0, advancedSettings0.getSocketLinger());
  }

  //Test case number: 11
  /*
   * 2 covered goals:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setCharset(Ljava/lang/String;)V: I6 Branch 1 IFNULL L76 - false
   * Goal 2. org.quickserver.util.xmlreader.AdvancedSettings.setCharset(Ljava/lang/String;)V: I13 Branch 2 IFNE L76 - false
   */

  @Test
  public void test11()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setCharset("");
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals(-1, advancedSettings0.getSocketLinger());
  }

  //Test case number: 12
  /*
   * 3 covered goals:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setBacklog(I)V: I6 Branch 5 IFLT L118 - false
   * Goal 2. org.quickserver.util.xmlreader.AdvancedSettings.toXML(Ljava/lang/String;)Ljava/lang/String;: I6 Branch 9 IFNONNULL L251 - true
   * Goal 3. org.quickserver.util.xmlreader.AdvancedSettings.toXML(Ljava/lang/String;)Ljava/lang/String;: I246 Branch 12 IFEQ L294 - true
   */

  @Test
  public void test12()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setBacklog(0);
      String string0 = advancedSettings0.toXML("iga*ueL(%kjz:4L#+w");
      assertEquals("iga*ueL(%kjz:4L#+w<advanced-settings>\niga*ueL(%kjz:4L#+w\t<charset>ISO-8859-1</charset>\niga*ueL(%kjz:4L#+w\t<use-direct-byte-buffer>true</use-direct-byte-buffer>\niga*ueL(%kjz:4L#+w\t<byte-buffer-size>65536</byte-buffer-size>\niga*ueL(%kjz:4L#+w\t<backlog>0</backlog>\niga*ueL(%kjz:4L#+w\t<socket-linger>-1</socket-linger>\niga*ueL(%kjz:4L#+w\t<debug-non-blocking-mode>false</debug-non-blocking-mode>\niga*ueL(%kjz:4L#+w\t<client-identifier>org.quickserver.net.server.impl.OptimisticClientIdentifier</client-identifier>\niga*ueL(%kjz:4L#+w\t<qsobject-pool-maker>org.quickserver.util.pool.MakeQSObjectPool</qsobject-pool-maker>\niga*ueL(%kjz:4L#+w\t<max-threads-for-nio-write>10</max-threads-for-nio-write>\niga*ueL(%kjz:4L#+w\t<performance-preferences-connection-time>0</performance-preferences-connection-time>\niga*ueL(%kjz:4L#+w\t<performance-preferences-latency>0</performance-preferences-latency>\niga*ueL(%kjz:4L#+w\t<performance-preferences-bandwidth>0</performance-preferences-bandwidth>\niga*ueL(%kjz:4L#+w\t<client-socket-tcp-no-delay>false</client-socket-tcp-no-delay>\niga*ueL(%kjz:4L#+w</advanced-settings>\n", string0);
      assertEquals(0, advancedSettings0.getBacklog());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setClientSocketTcpNoDelay(Z)V: root-Branch
   */

  @Test
  public void test13()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      boolean boolean0 = advancedSettings0.getClientSocketTcpNoDelay();
      advancedSettings0.setClientSocketTcpNoDelay(false);
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(-1, advancedSettings0.getSocketLinger());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
  }

  //Test case number: 14
  /*
   * 21 covered goals:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.getUseDirectByteBuffer()Z: root-Branch
   * Goal 2. org.quickserver.util.xmlreader.AdvancedSettings.getDebugNonBlockingMode()Z: root-Branch
   * Goal 3. org.quickserver.util.xmlreader.AdvancedSettings.getPerformancePreferencesLatency()I: root-Branch
   * Goal 4. org.quickserver.util.xmlreader.AdvancedSettings.getCharset()Ljava/lang/String;: root-Branch
   * Goal 5. org.quickserver.util.xmlreader.AdvancedSettings.getByteBufferSize()I: root-Branch
   * Goal 6. org.quickserver.util.xmlreader.AdvancedSettings.setPerformancePreferencesConnectionTime(I)V: root-Branch
   * Goal 7. org.quickserver.util.xmlreader.AdvancedSettings.getPerformancePreferencesConnectionTime()I: root-Branch
   * Goal 8. org.quickserver.util.xmlreader.AdvancedSettings.getBacklog()I: root-Branch
   * Goal 9. org.quickserver.util.xmlreader.AdvancedSettings.getSocketLinger()I: root-Branch
   * Goal 10. org.quickserver.util.xmlreader.AdvancedSettings.getClientIdentifier()Ljava/lang/String;: root-Branch
   * Goal 11. org.quickserver.util.xmlreader.AdvancedSettings.getClientSocketTcpNoDelay()Z: root-Branch
   * Goal 12. org.quickserver.util.xmlreader.AdvancedSettings.getClientSocketTrafficClass()Ljava/lang/String;: root-Branch
   * Goal 13. org.quickserver.util.xmlreader.AdvancedSettings.getClientSocketReceiveBufferSize()I: root-Branch
   * Goal 14. org.quickserver.util.xmlreader.AdvancedSettings.setByteBufferSize(I)V: I6 Branch 4 IFLE L98 - false
   * Goal 15. org.quickserver.util.xmlreader.AdvancedSettings.setClientIdentifier(Ljava/lang/String;)V: I6 Branch 6 IFNULL L192 - true
   * Goal 16. org.quickserver.util.xmlreader.AdvancedSettings.getQSObjectPoolMaker()Ljava/lang/String;: I7 Branch 8 IFNONNULL L222 - true
   * Goal 17. org.quickserver.util.xmlreader.AdvancedSettings.getQSObjectPoolMaker()Ljava/lang/String;: I7 Branch 8 IFNONNULL L222 - false
   * Goal 18. org.quickserver.util.xmlreader.AdvancedSettings.toXML(Ljava/lang/String;)Ljava/lang/String;: I6 Branch 9 IFNONNULL L251 - false
   * Goal 19. org.quickserver.util.xmlreader.AdvancedSettings.toXML(Ljava/lang/String;)Ljava/lang/String;: I204 Branch 10 IFNULL L283 - true
   * Goal 20. org.quickserver.util.xmlreader.AdvancedSettings.toXML(Ljava/lang/String;)Ljava/lang/String;: I225 Branch 11 IFEQ L289 - true
   * Goal 21. org.quickserver.util.xmlreader.AdvancedSettings.toXML(Ljava/lang/String;)Ljava/lang/String;: I246 Branch 12 IFEQ L294 - false
   */

  @Test
  public void test14()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      String string0 = advancedSettings0.getQSObjectPoolMaker();
      int int0 = advancedSettings0.getPerformancePreferencesConnectionTime();
      advancedSettings0.setPerformancePreferencesConnectionTime(0);
      advancedSettings0.setClientSocketSendBufferSize(836);
      advancedSettings0.setClientIdentifier((String) null);
      advancedSettings0.setByteBufferSize(836);
      String string1 = advancedSettings0.toXML((String) null);
      assertEquals(836, advancedSettings0.getClientSocketSendBufferSize());
  }

  //Test case number: 15
  /*
   * 6 covered goals:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setClientSocketReceiveBufferSize(I)V: root-Branch
   * Goal 2. org.quickserver.util.xmlreader.AdvancedSettings.getPerformancePreferencesBandwidth()I: root-Branch
   * Goal 3. org.quickserver.util.xmlreader.AdvancedSettings.getClientSocketSendBufferSize()I: root-Branch
   * Goal 4. org.quickserver.util.xmlreader.AdvancedSettings.setClientSocketSendBufferSize(I)V: root-Branch
   * Goal 5. org.quickserver.util.xmlreader.AdvancedSettings.getMaxThreadsForNioWrite()I: root-Branch
   * Goal 6. org.quickserver.util.xmlreader.AdvancedSettings.setByteBufferSize(I)V: I6 Branch 4 IFLE L98 - true
   */

  @Test
  public void test15()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      int int0 = advancedSettings0.getClientSocketSendBufferSize();
      int int1 = advancedSettings0.getPerformancePreferencesBandwidth();
      int int2 = advancedSettings0.getMaxThreadsForNioWrite();
      advancedSettings0.setClientSocketReceiveBufferSize(0);
      advancedSettings0.setByteBufferSize(0);
      advancedSettings0.setClientSocketSendBufferSize(10);
      assertEquals(10, advancedSettings0.getClientSocketSendBufferSize());
  }

  //Test case number: 16
  /*
   * 3 covered goals:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.<init>()V: root-Branch
   * Goal 2. org.quickserver.util.xmlreader.AdvancedSettings.setPerformancePreferencesBandwidth(I)V: root-Branch
   * Goal 3. org.quickserver.util.xmlreader.AdvancedSettings.setBacklog(I)V: I6 Branch 5 IFLT L118 - true
   */

  @Test
  public void test16()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesBandwidth(8);
      advancedSettings0.setBacklog((-3319));
      assertEquals(8, advancedSettings0.getPerformancePreferencesBandwidth());
  }
}
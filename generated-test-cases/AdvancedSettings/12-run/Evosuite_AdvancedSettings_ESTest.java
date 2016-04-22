/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 11 16:54:30 GMT 2015
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
   * 2 covered goals:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setClientSocketSendBufferSize(I)V: root-Branch
   * Goal 2. org.quickserver.util.xmlreader.AdvancedSettings.toXML(Ljava/lang/String;)Ljava/lang/String;: I246 Branch 12 IFEQ L294 - false
   */

  @Test
  public void test00()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketSendBufferSize((-1));
      String string0 = advancedSettings0.toXML(",*:");
      assertEquals(-1, advancedSettings0.getClientSocketSendBufferSize());
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setClientSocketReceiveBufferSize(I)V: root-Branch
   * Goal 2. org.quickserver.util.xmlreader.AdvancedSettings.toXML(Ljava/lang/String;)Ljava/lang/String;: I225 Branch 11 IFEQ L289 - false
   */

  @Test
  public void test01()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketReceiveBufferSize(9);
      String string0 = advancedSettings0.toXML("\"<0s'");
      assertEquals(9, advancedSettings0.getClientSocketReceiveBufferSize());
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setClientSocketTrafficClass(Ljava/lang/String;)V: root-Branch
   * Goal 2. org.quickserver.util.xmlreader.AdvancedSettings.toXML(Ljava/lang/String;)Ljava/lang/String;: I204 Branch 10 IFNULL L283 - false
   */

  @Test
  public void test02()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketTrafficClass("org.quickserver.net.server.impl.OptimisticClientIdentifier");
      String string0 = advancedSettings0.toXML("org.quickserver.net.server.impl.OptimisticClientIdentifier");
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier<advanced-settings>\norg.quickserver.net.server.impl.OptimisticClientIdentifier\t<charset>ISO-8859-1</charset>\norg.quickserver.net.server.impl.OptimisticClientIdentifier\t<use-direct-byte-buffer>true</use-direct-byte-buffer>\norg.quickserver.net.server.impl.OptimisticClientIdentifier\t<byte-buffer-size>65536</byte-buffer-size>\norg.quickserver.net.server.impl.OptimisticClientIdentifier\t<backlog>0</backlog>\norg.quickserver.net.server.impl.OptimisticClientIdentifier\t<socket-linger>-1</socket-linger>\norg.quickserver.net.server.impl.OptimisticClientIdentifier\t<debug-non-blocking-mode>false</debug-non-blocking-mode>\norg.quickserver.net.server.impl.OptimisticClientIdentifier\t<client-identifier>org.quickserver.net.server.impl.OptimisticClientIdentifier</client-identifier>\norg.quickserver.net.server.impl.OptimisticClientIdentifier\t<qsobject-pool-maker>org.quickserver.util.pool.MakeQSObjectPool</qsobject-pool-maker>\norg.quickserver.net.server.impl.OptimisticClientIdentifier\t<max-threads-for-nio-write>10</max-threads-for-nio-write>\norg.quickserver.net.server.impl.OptimisticClientIdentifier\t<performance-preferences-connection-time>0</performance-preferences-connection-time>\norg.quickserver.net.server.impl.OptimisticClientIdentifier\t<performance-preferences-latency>0</performance-preferences-latency>\norg.quickserver.net.server.impl.OptimisticClientIdentifier\t<performance-preferences-bandwidth>0</performance-preferences-bandwidth>\norg.quickserver.net.server.impl.OptimisticClientIdentifier\t<client-socket-tcp-no-delay>false</client-socket-tcp-no-delay>\norg.quickserver.net.server.impl.OptimisticClientIdentifier\t<client-socket-traffic-class>org.quickserver.net.server.impl.OptimisticClientIdentifier</client-socket-traffic-class>\norg.quickserver.net.server.impl.OptimisticClientIdentifier</advanced-settings>\n", string0);
  }

  //Test case number: 3
  /*
   * 22 covered goals:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.getPerformancePreferencesBandwidth()I: root-Branch
   * Goal 2. org.quickserver.util.xmlreader.AdvancedSettings.getUseDirectByteBuffer()Z: root-Branch
   * Goal 3. org.quickserver.util.xmlreader.AdvancedSettings.getDebugNonBlockingMode()Z: root-Branch
   * Goal 4. org.quickserver.util.xmlreader.AdvancedSettings.getPerformancePreferencesLatency()I: root-Branch
   * Goal 5. org.quickserver.util.xmlreader.AdvancedSettings.getCharset()Ljava/lang/String;: root-Branch
   * Goal 6. org.quickserver.util.xmlreader.AdvancedSettings.getClientSocketSendBufferSize()I: root-Branch
   * Goal 7. org.quickserver.util.xmlreader.AdvancedSettings.getByteBufferSize()I: root-Branch
   * Goal 8. org.quickserver.util.xmlreader.AdvancedSettings.getMaxThreadsForNioWrite()I: root-Branch
   * Goal 9. org.quickserver.util.xmlreader.AdvancedSettings.getPerformancePreferencesConnectionTime()I: root-Branch
   * Goal 10. org.quickserver.util.xmlreader.AdvancedSettings.getBacklog()I: root-Branch
   * Goal 11. org.quickserver.util.xmlreader.AdvancedSettings.getSocketLinger()I: root-Branch
   * Goal 12. org.quickserver.util.xmlreader.AdvancedSettings.getClientIdentifier()Ljava/lang/String;: root-Branch
   * Goal 13. org.quickserver.util.xmlreader.AdvancedSettings.getClientSocketTcpNoDelay()Z: root-Branch
   * Goal 14. org.quickserver.util.xmlreader.AdvancedSettings.getClientSocketTrafficClass()Ljava/lang/String;: root-Branch
   * Goal 15. org.quickserver.util.xmlreader.AdvancedSettings.getClientSocketReceiveBufferSize()I: root-Branch
   * Goal 16. org.quickserver.util.xmlreader.AdvancedSettings.getQSObjectPoolMaker()Ljava/lang/String;: I7 Branch 8 IFNONNULL L222 - true
   * Goal 17. org.quickserver.util.xmlreader.AdvancedSettings.getQSObjectPoolMaker()Ljava/lang/String;: I7 Branch 8 IFNONNULL L222 - false
   * Goal 18. org.quickserver.util.xmlreader.AdvancedSettings.toXML(Ljava/lang/String;)Ljava/lang/String;: I6 Branch 9 IFNONNULL L251 - true
   * Goal 19. org.quickserver.util.xmlreader.AdvancedSettings.toXML(Ljava/lang/String;)Ljava/lang/String;: I6 Branch 9 IFNONNULL L251 - false
   * Goal 20. org.quickserver.util.xmlreader.AdvancedSettings.toXML(Ljava/lang/String;)Ljava/lang/String;: I204 Branch 10 IFNULL L283 - true
   * Goal 21. org.quickserver.util.xmlreader.AdvancedSettings.toXML(Ljava/lang/String;)Ljava/lang/String;: I225 Branch 11 IFEQ L289 - true
   * Goal 22. org.quickserver.util.xmlreader.AdvancedSettings.toXML(Ljava/lang/String;)Ljava/lang/String;: I246 Branch 12 IFEQ L294 - true
   */

  @Test
  public void test03()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      String string0 = advancedSettings0.toXML("V]");
      String string1 = advancedSettings0.toXML((String) null);
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals("<advanced-settings>\n\t<charset>ISO-8859-1</charset>\n\t<use-direct-byte-buffer>true</use-direct-byte-buffer>\n\t<byte-buffer-size>65536</byte-buffer-size>\n\t<backlog>0</backlog>\n\t<socket-linger>-1</socket-linger>\n\t<debug-non-blocking-mode>false</debug-non-blocking-mode>\n\t<client-identifier>org.quickserver.net.server.impl.OptimisticClientIdentifier</client-identifier>\n\t<qsobject-pool-maker>org.quickserver.util.pool.MakeQSObjectPool</qsobject-pool-maker>\n\t<max-threads-for-nio-write>10</max-threads-for-nio-write>\n\t<performance-preferences-connection-time>0</performance-preferences-connection-time>\n\t<performance-preferences-latency>0</performance-preferences-latency>\n\t<performance-preferences-bandwidth>0</performance-preferences-bandwidth>\n\t<client-socket-tcp-no-delay>false</client-socket-tcp-no-delay>\n</advanced-settings>\n", string1);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setClientIdentifier(Ljava/lang/String;)V: I13 Branch 7 IFNE L192 - true
   */

  @Test
  public void test04()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientIdentifier("%}B~{{ND<S5");
      assertEquals("%}B~{{ND<S5", advancedSettings0.getClientIdentifier());
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setClientIdentifier(Ljava/lang/String;)V: I6 Branch 6 IFNULL L192 - false
   * Goal 2. org.quickserver.util.xmlreader.AdvancedSettings.setClientIdentifier(Ljava/lang/String;)V: I13 Branch 7 IFNE L192 - false
   */

  @Test
  public void test05()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientIdentifier("");
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(-1, advancedSettings0.getSocketLinger());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setClientIdentifier(Ljava/lang/String;)V: I6 Branch 6 IFNULL L192 - true
   */

  @Test
  public void test06()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientIdentifier((String) null);
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(-1, advancedSettings0.getSocketLinger());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setBacklog(I)V: I6 Branch 5 IFLT L118 - false
   */

  @Test
  public void test07()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      assertEquals(0, advancedSettings0.getBacklog());
      
      advancedSettings0.setBacklog(1);
      assertEquals(1, advancedSettings0.getBacklog());
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setBacklog(I)V: I6 Branch 5 IFLT L118 - true
   */

  @Test
  public void test08()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setBacklog((-3739));
      assertEquals(-1, advancedSettings0.getSocketLinger());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setByteBufferSize(I)V: I6 Branch 4 IFLE L98 - false
   */

  @Test
  public void test09()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setByteBufferSize(1967);
      assertEquals(1967, advancedSettings0.getByteBufferSize());
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setByteBufferSize(I)V: I6 Branch 4 IFLE L98 - true
   */

  @Test
  public void test10()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setByteBufferSize((-1));
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(-1, advancedSettings0.getSocketLinger());
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setCharset(Ljava/lang/String;)V: I24 Branch 3 IFNE L78 - false
   */

  @Test
  public void test11()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      // Undeclared exception!
      try {
        advancedSettings0.setCharset("3N0");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // 3N0
         //
      }
  }

  //Test case number: 12
  /*
   * 2 covered goals:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setCharset(Ljava/lang/String;)V: I13 Branch 2 IFNE L76 - true
   * Goal 2. org.quickserver.util.xmlreader.AdvancedSettings.setCharset(Ljava/lang/String;)V: I24 Branch 3 IFNE L78 - true
   */

  @Test
  public void test12()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      
      advancedSettings0.setCharset("ISO-8859-1");
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(-1, advancedSettings0.getSocketLinger());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
  }

  //Test case number: 13
  /*
   * 2 covered goals:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setCharset(Ljava/lang/String;)V: I6 Branch 1 IFNULL L76 - false
   * Goal 2. org.quickserver.util.xmlreader.AdvancedSettings.setCharset(Ljava/lang/String;)V: I13 Branch 2 IFNE L76 - false
   */

  @Test
  public void test13()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setCharset("");
      assertEquals(-1, advancedSettings0.getSocketLinger());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setCharset(Ljava/lang/String;)V: I6 Branch 1 IFNULL L76 - true
   */

  @Test
  public void test14()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setCharset((String) null);
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals(-1, advancedSettings0.getSocketLinger());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setQSObjectPoolMaker(Ljava/lang/String;)V: root-Branch
   */

  @Test
  public void test15()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setQSObjectPoolMaker("UQ`gG;jI%llf+n{6");
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(-1, advancedSettings0.getSocketLinger());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setPerformancePreferencesBandwidth(I)V: root-Branch
   */

  @Test
  public void test16()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesBandwidth(0);
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getBacklog());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(-1, advancedSettings0.getSocketLinger());
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setPerformancePreferencesLatency(I)V: root-Branch
   */

  @Test
  public void test17()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesLatency(0);
      assertEquals(-1, advancedSettings0.getSocketLinger());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setDebugNonBlockingMode(Z)V: root-Branch
   */

  @Test
  public void test18()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setDebugNonBlockingMode(false);
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertFalse(advancedSettings0.getDebugNonBlockingMode());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(-1, advancedSettings0.getSocketLinger());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setClientSocketTcpNoDelay(Z)V: root-Branch
   */

  @Test
  public void test19()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketTcpNoDelay(true);
      assertTrue(advancedSettings0.getClientSocketTcpNoDelay());
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setPerformancePreferencesConnectionTime(I)V: root-Branch
   */

  @Test
  public void test20()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesConnectionTime(0);
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals(-1, advancedSettings0.getSocketLinger());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
  }

  //Test case number: 21
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setUseDirectByteBuffer(Z)V: root-Branch
   */

  @Test
  public void test21()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      
      advancedSettings0.setUseDirectByteBuffer(false);
      assertFalse(advancedSettings0.getUseDirectByteBuffer());
  }

  //Test case number: 22
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setSocketLinger(I)V: root-Branch
   */

  @Test
  public void test22()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setSocketLinger((-1176));
      assertEquals(-1176, advancedSettings0.getSocketLinger());
  }

  //Test case number: 23
  /*
   * 2 covered goals:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setMaxThreadsForNioWrite(I)V: root-Branch
   * Goal 2. org.quickserver.util.xmlreader.AdvancedSettings.<init>()V: root-Branch
   */

  @Test
  public void test23()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setMaxThreadsForNioWrite(3575);
      assertEquals(3575, advancedSettings0.getMaxThreadsForNioWrite());
  }
}

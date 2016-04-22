/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 11 16:35:37 GMT 2015
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
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.toXML(Ljava/lang/String;)Ljava/lang/String;: I204 Branch 10 IFNULL L283 - false
   */

  @Test
  public void test00()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      String string0 = advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setClientSocketTrafficClass("");
      String string1 = advancedSettings0.toXML("org.quickserver.util.pool.MakeQSObjectPool");
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals("org.quickserver.util.pool.MakeQSObjectPool<advanced-settings>\norg.quickserver.util.pool.MakeQSObjectPool\t<charset>ISO-8859-1</charset>\norg.quickserver.util.pool.MakeQSObjectPool\t<use-direct-byte-buffer>true</use-direct-byte-buffer>\norg.quickserver.util.pool.MakeQSObjectPool\t<byte-buffer-size>65536</byte-buffer-size>\norg.quickserver.util.pool.MakeQSObjectPool\t<backlog>0</backlog>\norg.quickserver.util.pool.MakeQSObjectPool\t<socket-linger>-1</socket-linger>\norg.quickserver.util.pool.MakeQSObjectPool\t<debug-non-blocking-mode>false</debug-non-blocking-mode>\norg.quickserver.util.pool.MakeQSObjectPool\t<client-identifier>org.quickserver.net.server.impl.OptimisticClientIdentifier</client-identifier>\norg.quickserver.util.pool.MakeQSObjectPool\t<qsobject-pool-maker>org.quickserver.util.pool.MakeQSObjectPool</qsobject-pool-maker>\norg.quickserver.util.pool.MakeQSObjectPool\t<max-threads-for-nio-write>10</max-threads-for-nio-write>\norg.quickserver.util.pool.MakeQSObjectPool\t<performance-preferences-connection-time>0</performance-preferences-connection-time>\norg.quickserver.util.pool.MakeQSObjectPool\t<performance-preferences-latency>0</performance-preferences-latency>\norg.quickserver.util.pool.MakeQSObjectPool\t<performance-preferences-bandwidth>0</performance-preferences-bandwidth>\norg.quickserver.util.pool.MakeQSObjectPool\t<client-socket-tcp-no-delay>false</client-socket-tcp-no-delay>\norg.quickserver.util.pool.MakeQSObjectPool\t<client-socket-traffic-class></client-socket-traffic-class>\norg.quickserver.util.pool.MakeQSObjectPool</advanced-settings>\n", string1);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.toXML(Ljava/lang/String;)Ljava/lang/String;: I246 Branch 12 IFEQ L294 - false
   */

  @Test
  public void test01()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketSendBufferSize((-124));
      String string0 = advancedSettings0.getClientSocketTrafficClass();
      String string1 = advancedSettings0.toXML((String) null);
      assertEquals(-124, advancedSettings0.getClientSocketSendBufferSize());
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setCharset(Ljava/lang/String;)V: I13 Branch 2 IFNE L76 - false
   * Goal 2. org.quickserver.util.xmlreader.AdvancedSettings.toXML(Ljava/lang/String;)Ljava/lang/String;: I6 Branch 9 IFNONNULL L251 - false
   */

  @Test
  public void test02()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setCharset("");
      String string0 = advancedSettings0.toXML((String) null);
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals("<advanced-settings>\n\t<charset>ISO-8859-1</charset>\n\t<use-direct-byte-buffer>true</use-direct-byte-buffer>\n\t<byte-buffer-size>65536</byte-buffer-size>\n\t<backlog>0</backlog>\n\t<socket-linger>-1</socket-linger>\n\t<debug-non-blocking-mode>false</debug-non-blocking-mode>\n\t<client-identifier>org.quickserver.net.server.impl.OptimisticClientIdentifier</client-identifier>\n\t<qsobject-pool-maker>org.quickserver.util.pool.MakeQSObjectPool</qsobject-pool-maker>\n\t<max-threads-for-nio-write>10</max-threads-for-nio-write>\n\t<performance-preferences-connection-time>0</performance-preferences-connection-time>\n\t<performance-preferences-latency>0</performance-preferences-latency>\n\t<performance-preferences-bandwidth>0</performance-preferences-bandwidth>\n\t<client-socket-tcp-no-delay>false</client-socket-tcp-no-delay>\n</advanced-settings>\n", string0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setCharset(Ljava/lang/String;)V: I6 Branch 1 IFNULL L76 - true
   */

  @Test
  public void test03()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setCharset((String) null);
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(-1, advancedSettings0.getSocketLinger());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setBacklog(I)V: I6 Branch 5 IFLT L118 - false
   * Goal 2. org.quickserver.util.xmlreader.AdvancedSettings.toXML(Ljava/lang/String;)Ljava/lang/String;: I225 Branch 11 IFEQ L289 - false
   */

  @Test
  public void test04()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setBacklog(0);
      advancedSettings0.setClientSocketReceiveBufferSize((-2934));
      String string0 = advancedSettings0.toXML("w'x#@iI@09Xs[");
      assertEquals(-2934, advancedSettings0.getClientSocketReceiveBufferSize());
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setUseDirectByteBuffer(Z)V: root-Branch
   * Goal 2. org.quickserver.util.xmlreader.AdvancedSettings.setClientIdentifier(Ljava/lang/String;)V: I6 Branch 6 IFNULL L192 - true
   */

  @Test
  public void test05()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientIdentifier((String) null);
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      
      advancedSettings0.setUseDirectByteBuffer(false);
      assertFalse(advancedSettings0.getUseDirectByteBuffer());
  }

  //Test case number: 6
  /*
   * 2 covered goals:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setClientSocketTcpNoDelay(Z)V: root-Branch
   * Goal 2. org.quickserver.util.xmlreader.AdvancedSettings.setByteBufferSize(I)V: I6 Branch 4 IFLE L98 - true
   */

  @Test
  public void test06()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setByteBufferSize(0);
      boolean boolean0 = advancedSettings0.getUseDirectByteBuffer();
      advancedSettings0.setClientSocketTcpNoDelay(true);
      assertTrue(advancedSettings0.getClientSocketTcpNoDelay());
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setByteBufferSize(I)V: I6 Branch 4 IFLE L98 - false
   */

  @Test
  public void test07()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      int int0 = advancedSettings0.getByteBufferSize();
      advancedSettings0.setByteBufferSize(65536);
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(-1, advancedSettings0.getSocketLinger());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
  }

  //Test case number: 8
  /*
   * 2 covered goals:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setCharset(Ljava/lang/String;)V: I24 Branch 3 IFNE L78 - true
   * Goal 2. org.quickserver.util.xmlreader.AdvancedSettings.setClientIdentifier(Ljava/lang/String;)V: I13 Branch 7 IFNE L192 - true
   */

  @Test
  public void test08()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      String string0 = advancedSettings0.getCharset();
      advancedSettings0.setClientIdentifier("ISO-8859-1");
      advancedSettings0.setCharset("ISO-8859-1");
      assertEquals("ISO-8859-1", advancedSettings0.getClientIdentifier());
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setBacklog(I)V: I6 Branch 5 IFLT L118 - true
   */

  @Test
  public void test09()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      int int0 = advancedSettings0.getSocketLinger();
      assertEquals((-1), int0);
      
      advancedSettings0.setBacklog((-1));
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setMaxThreadsForNioWrite(I)V: root-Branch
   */

  @Test
  public void test10()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setMaxThreadsForNioWrite(620);
      assertEquals(620, advancedSettings0.getMaxThreadsForNioWrite());
  }

  //Test case number: 11
  /*
   * 15 covered goals:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.getPerformancePreferencesLatency()I: root-Branch
   * Goal 2. org.quickserver.util.xmlreader.AdvancedSettings.getCharset()Ljava/lang/String;: root-Branch
   * Goal 3. org.quickserver.util.xmlreader.AdvancedSettings.getByteBufferSize()I: root-Branch
   * Goal 4. org.quickserver.util.xmlreader.AdvancedSettings.setClientSocketSendBufferSize(I)V: root-Branch
   * Goal 5. org.quickserver.util.xmlreader.AdvancedSettings.getMaxThreadsForNioWrite()I: root-Branch
   * Goal 6. org.quickserver.util.xmlreader.AdvancedSettings.getBacklog()I: root-Branch
   * Goal 7. org.quickserver.util.xmlreader.AdvancedSettings.getSocketLinger()I: root-Branch
   * Goal 8. org.quickserver.util.xmlreader.AdvancedSettings.setPerformancePreferencesLatency(I)V: root-Branch
   * Goal 9. org.quickserver.util.xmlreader.AdvancedSettings.getClientSocketTcpNoDelay()Z: root-Branch
   * Goal 10. org.quickserver.util.xmlreader.AdvancedSettings.getClientSocketTrafficClass()Ljava/lang/String;: root-Branch
   * Goal 11. org.quickserver.util.xmlreader.AdvancedSettings.getClientSocketReceiveBufferSize()I: root-Branch
   * Goal 12. org.quickserver.util.xmlreader.AdvancedSettings.toXML(Ljava/lang/String;)Ljava/lang/String;: I6 Branch 9 IFNONNULL L251 - true
   * Goal 13. org.quickserver.util.xmlreader.AdvancedSettings.toXML(Ljava/lang/String;)Ljava/lang/String;: I204 Branch 10 IFNULL L283 - true
   * Goal 14. org.quickserver.util.xmlreader.AdvancedSettings.toXML(Ljava/lang/String;)Ljava/lang/String;: I225 Branch 11 IFEQ L289 - true
   * Goal 15. org.quickserver.util.xmlreader.AdvancedSettings.toXML(Ljava/lang/String;)Ljava/lang/String;: I246 Branch 12 IFEQ L294 - true
   */

  @Test
  public void test11()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      AdvancedSettings advancedSettings1 = new AdvancedSettings();
      advancedSettings0.setClientSocketSendBufferSize(956);
      String string0 = advancedSettings1.toXML("");
      advancedSettings0.setPerformancePreferencesLatency(956);
      assertEquals(956, advancedSettings0.getPerformancePreferencesLatency());
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setClientSocketTrafficClass(Ljava/lang/String;)V: root-Branch
   */

  @Test
  public void test12()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketTrafficClass("gK3+U");
      assertEquals(-1, advancedSettings0.getSocketLinger());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
  }

  //Test case number: 13
  /*
   * 20 covered goals:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setClientSocketReceiveBufferSize(I)V: root-Branch
   * Goal 2. org.quickserver.util.xmlreader.AdvancedSettings.getPerformancePreferencesBandwidth()I: root-Branch
   * Goal 3. org.quickserver.util.xmlreader.AdvancedSettings.getUseDirectByteBuffer()Z: root-Branch
   * Goal 4. org.quickserver.util.xmlreader.AdvancedSettings.getDebugNonBlockingMode()Z: root-Branch
   * Goal 5. org.quickserver.util.xmlreader.AdvancedSettings.getClientSocketSendBufferSize()I: root-Branch
   * Goal 6. org.quickserver.util.xmlreader.AdvancedSettings.setSocketLinger(I)V: root-Branch
   * Goal 7. org.quickserver.util.xmlreader.AdvancedSettings.setPerformancePreferencesConnectionTime(I)V: root-Branch
   * Goal 8. org.quickserver.util.xmlreader.AdvancedSettings.getPerformancePreferencesConnectionTime()I: root-Branch
   * Goal 9. org.quickserver.util.xmlreader.AdvancedSettings.<init>()V: root-Branch
   * Goal 10. org.quickserver.util.xmlreader.AdvancedSettings.setDebugNonBlockingMode(Z)V: root-Branch
   * Goal 11. org.quickserver.util.xmlreader.AdvancedSettings.setPerformancePreferencesBandwidth(I)V: root-Branch
   * Goal 12. org.quickserver.util.xmlreader.AdvancedSettings.getClientIdentifier()Ljava/lang/String;: root-Branch
   * Goal 13. org.quickserver.util.xmlreader.AdvancedSettings.setQSObjectPoolMaker(Ljava/lang/String;)V: root-Branch
   * Goal 14. org.quickserver.util.xmlreader.AdvancedSettings.setCharset(Ljava/lang/String;)V: I6 Branch 1 IFNULL L76 - false
   * Goal 15. org.quickserver.util.xmlreader.AdvancedSettings.setCharset(Ljava/lang/String;)V: I13 Branch 2 IFNE L76 - true
   * Goal 16. org.quickserver.util.xmlreader.AdvancedSettings.setCharset(Ljava/lang/String;)V: I24 Branch 3 IFNE L78 - false
   * Goal 17. org.quickserver.util.xmlreader.AdvancedSettings.setClientIdentifier(Ljava/lang/String;)V: I6 Branch 6 IFNULL L192 - false
   * Goal 18. org.quickserver.util.xmlreader.AdvancedSettings.setClientIdentifier(Ljava/lang/String;)V: I13 Branch 7 IFNE L192 - false
   * Goal 19. org.quickserver.util.xmlreader.AdvancedSettings.getQSObjectPoolMaker()Ljava/lang/String;: I7 Branch 8 IFNONNULL L222 - true
   * Goal 20. org.quickserver.util.xmlreader.AdvancedSettings.getQSObjectPoolMaker()Ljava/lang/String;: I7 Branch 8 IFNONNULL L222 - false
   */

  @Test
  public void test13()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesConnectionTime(817);
      String string0 = advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setDebugNonBlockingMode(true);
      boolean boolean0 = advancedSettings0.getDebugNonBlockingMode();
      advancedSettings0.setSocketLinger(817);
      int int0 = advancedSettings0.getPerformancePreferencesBandwidth();
      String string1 = advancedSettings0.getQSObjectPoolMaker();
      boolean boolean1 = advancedSettings0.getUseDirectByteBuffer();
      advancedSettings0.setClientSocketReceiveBufferSize(0);
      advancedSettings0.setClientIdentifier("");
      int int1 = advancedSettings0.getPerformancePreferencesConnectionTime();
      advancedSettings0.setQSObjectPoolMaker("org.quickserver.util.pool.MakeQSObjectPool");
      advancedSettings0.setPerformancePreferencesBandwidth(817);
      String string2 = advancedSettings0.getClientIdentifier();
      int int2 = advancedSettings0.getClientSocketSendBufferSize();
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
}

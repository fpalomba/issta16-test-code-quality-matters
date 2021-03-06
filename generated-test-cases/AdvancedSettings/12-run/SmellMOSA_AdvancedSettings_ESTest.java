/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 11 16:37:17 GMT 2015
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
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setCharset(Ljava/lang/String;)V: I13 Branch 2 IFNE L76 - false
   */

  @Test
  public void test00()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setCharset("");
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(-1, advancedSettings0.getSocketLinger());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.toXML(Ljava/lang/String;)Ljava/lang/String;: I204 Branch 10 IFNULL L283 - false
   */

  @Test
  public void test01()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketTrafficClass("@cV");
      String string0 = advancedSettings0.toXML("@cV");
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals("@cV<advanced-settings>\n@cV\t<charset>ISO-8859-1</charset>\n@cV\t<use-direct-byte-buffer>true</use-direct-byte-buffer>\n@cV\t<byte-buffer-size>65536</byte-buffer-size>\n@cV\t<backlog>0</backlog>\n@cV\t<socket-linger>-1</socket-linger>\n@cV\t<debug-non-blocking-mode>false</debug-non-blocking-mode>\n@cV\t<client-identifier>org.quickserver.net.server.impl.OptimisticClientIdentifier</client-identifier>\n@cV\t<qsobject-pool-maker>org.quickserver.util.pool.MakeQSObjectPool</qsobject-pool-maker>\n@cV\t<max-threads-for-nio-write>10</max-threads-for-nio-write>\n@cV\t<performance-preferences-connection-time>0</performance-preferences-connection-time>\n@cV\t<performance-preferences-latency>0</performance-preferences-latency>\n@cV\t<performance-preferences-bandwidth>0</performance-preferences-bandwidth>\n@cV\t<client-socket-tcp-no-delay>false</client-socket-tcp-no-delay>\n@cV\t<client-socket-traffic-class>@cV</client-socket-traffic-class>\n@cV</advanced-settings>\n", string0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setPerformancePreferencesConnectionTime(I)V: root-Branch
   */

  @Test
  public void test02()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesConnectionTime((-708));
      assertEquals(-708, advancedSettings0.getPerformancePreferencesConnectionTime());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setMaxThreadsForNioWrite(I)V: root-Branch
   */

  @Test
  public void test03()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setMaxThreadsForNioWrite(2255);
      assertEquals(2255, advancedSettings0.getMaxThreadsForNioWrite());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.toXML(Ljava/lang/String;)Ljava/lang/String;: I225 Branch 11 IFEQ L289 - false
   */

  @Test
  public void test04()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketReceiveBufferSize((-4));
      String string0 = advancedSettings0.toXML("ikr=aExB'^oj2mp");
      assertEquals(-4, advancedSettings0.getClientSocketReceiveBufferSize());
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setUseDirectByteBuffer(Z)V: root-Branch
   * Goal 2. org.quickserver.util.xmlreader.AdvancedSettings.setCharset(Ljava/lang/String;)V: I6 Branch 1 IFNULL L76 - true
   */

  @Test
  public void test05()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setCharset((String) null);
      assertFalse(advancedSettings0.getUseDirectByteBuffer());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setCharset(Ljava/lang/String;)V: I24 Branch 3 IFNE L78 - true
   */

  @Test
  public void test06()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      String string0 = advancedSettings0.getCharset();
      assertEquals("ISO-8859-1", string0);
      
      advancedSettings0.setCharset("ISO-8859-1");
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(-1, advancedSettings0.getSocketLinger());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setBacklog(I)V: I6 Branch 5 IFLT L118 - false
   */

  @Test
  public void test07()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setBacklog(0);
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(-1, advancedSettings0.getSocketLinger());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
  }

  //Test case number: 8
  /*
   * 2 covered goals:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setDebugNonBlockingMode(Z)V: root-Branch
   * Goal 2. org.quickserver.util.xmlreader.AdvancedSettings.getQSObjectPoolMaker()Ljava/lang/String;: I7 Branch 8 IFNONNULL L222 - true
   */

  @Test
  public void test08()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      String string0 = advancedSettings0.toXML((String) null);
      advancedSettings0.setDebugNonBlockingMode(true);
      String string1 = advancedSettings0.toXML((String) null);
      assertTrue(advancedSettings0.getDebugNonBlockingMode());
  }

  //Test case number: 9
  /*
   * 2 covered goals:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setSocketLinger(I)V: root-Branch
   * Goal 2. org.quickserver.util.xmlreader.AdvancedSettings.setClientSocketTcpNoDelay(Z)V: root-Branch
   */

  @Test
  public void test09()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      int int0 = advancedSettings0.getClientSocketReceiveBufferSize();
      assertEquals(-1, advancedSettings0.getSocketLinger());
      
      advancedSettings0.setSocketLinger(0);
      advancedSettings0.setClientSocketTcpNoDelay(false);
      assertEquals(0, advancedSettings0.getSocketLinger());
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setClientSocketTrafficClass(Ljava/lang/String;)V: root-Branch
   */

  @Test
  public void test10()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketTrafficClass("Bh,;=[/ JAu2T");
      assertEquals(-1, advancedSettings0.getSocketLinger());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setQSObjectPoolMaker(Ljava/lang/String;)V: root-Branch
   */

  @Test
  public void test11()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setQSObjectPoolMaker("wp`V,)#7");
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals(-1, advancedSettings0.getSocketLinger());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setByteBufferSize(I)V: I6 Branch 4 IFLE L98 - false
   */

  @Test
  public void test12()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setByteBufferSize(2286);
      assertEquals(2286, advancedSettings0.getByteBufferSize());
  }

  //Test case number: 13
  /*
   * 5 covered goals:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setBacklog(I)V: I6 Branch 5 IFLT L118 - true
   * Goal 2. org.quickserver.util.xmlreader.AdvancedSettings.setClientIdentifier(Ljava/lang/String;)V: I6 Branch 6 IFNULL L192 - true
   * Goal 3. org.quickserver.util.xmlreader.AdvancedSettings.setClientIdentifier(Ljava/lang/String;)V: I13 Branch 7 IFNE L192 - true
   * Goal 4. org.quickserver.util.xmlreader.AdvancedSettings.toXML(Ljava/lang/String;)Ljava/lang/String;: I6 Branch 9 IFNONNULL L251 - false
   * Goal 5. org.quickserver.util.xmlreader.AdvancedSettings.toXML(Ljava/lang/String;)Ljava/lang/String;: I246 Branch 12 IFEQ L294 - true
   */

  @Test
  public void test13()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientIdentifier((String) null);
      advancedSettings0.setBacklog((-1781));
      String string0 = advancedSettings0.toXML((String) null);
      advancedSettings0.setClientIdentifier("<advanced-settings>\n\t<charset>ISO-8859-1</charset>\n\t<use-direct-byte-buffer>true</use-direct-byte-buffer>\n\t<byte-buffer-size>65536</byte-buffer-size>\n\t<backlog>0</backlog>\n\t<socket-linger>-1</socket-linger>\n\t<debug-non-blocking-mode>false</debug-non-blocking-mode>\n\t<client-identifier>org.quickserver.net.server.impl.OptimisticClientIdentifier</client-identifier>\n\t<qsobject-pool-maker>org.quickserver.util.pool.MakeQSObjectPool</qsobject-pool-maker>\n\t<max-threads-for-nio-write>10</max-threads-for-nio-write>\n\t<performance-preferences-connection-time>0</performance-preferences-connection-time>\n\t<performance-preferences-latency>0</performance-preferences-latency>\n\t<performance-preferences-bandwidth>0</performance-preferences-bandwidth>\n\t<client-socket-tcp-no-delay>false</client-socket-tcp-no-delay>\n</advanced-settings>\n");
      assertEquals("<advanced-settings>\n\t<charset>ISO-8859-1</charset>\n\t<use-direct-byte-buffer>true</use-direct-byte-buffer>\n\t<byte-buffer-size>65536</byte-buffer-size>\n\t<backlog>0</backlog>\n\t<socket-linger>-1</socket-linger>\n\t<debug-non-blocking-mode>false</debug-non-blocking-mode>\n\t<client-identifier>org.quickserver.net.server.impl.OptimisticClientIdentifier</client-identifier>\n\t<qsobject-pool-maker>org.quickserver.util.pool.MakeQSObjectPool</qsobject-pool-maker>\n\t<max-threads-for-nio-write>10</max-threads-for-nio-write>\n\t<performance-preferences-connection-time>0</performance-preferences-connection-time>\n\t<performance-preferences-latency>0</performance-preferences-latency>\n\t<performance-preferences-bandwidth>0</performance-preferences-bandwidth>\n\t<client-socket-tcp-no-delay>false</client-socket-tcp-no-delay>\n</advanced-settings>\n", advancedSettings0.getClientIdentifier());
  }

  //Test case number: 14
  /*
   * 2 covered goals:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setClientIdentifier(Ljava/lang/String;)V: I6 Branch 6 IFNULL L192 - false
   * Goal 2. org.quickserver.util.xmlreader.AdvancedSettings.setClientIdentifier(Ljava/lang/String;)V: I13 Branch 7 IFNE L192 - false
   */

  @Test
  public void test14()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientIdentifier("");
      assertEquals(-1, advancedSettings0.getSocketLinger());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
  }

  //Test case number: 15
  /*
   * 3 covered goals:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setCharset(Ljava/lang/String;)V: I6 Branch 1 IFNULL L76 - false
   * Goal 2. org.quickserver.util.xmlreader.AdvancedSettings.setCharset(Ljava/lang/String;)V: I13 Branch 2 IFNE L76 - true
   * Goal 3. org.quickserver.util.xmlreader.AdvancedSettings.setCharset(Ljava/lang/String;)V: I24 Branch 3 IFNE L78 - false
   */

  @Test
  public void test15()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      String string0 = advancedSettings0.getClientIdentifier();
      // Undeclared exception!
      try {
        advancedSettings0.setCharset("org.quickserver.net.server.impl.OptimisticClientIdentifier");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // org.quickserver.net.server.impl.OptimisticClientIdentifier
         //
      }
  }

  //Test case number: 16
  /*
   * 26 covered goals:
   * Goal 1. org.quickserver.util.xmlreader.AdvancedSettings.setClientSocketReceiveBufferSize(I)V: root-Branch
   * Goal 2. org.quickserver.util.xmlreader.AdvancedSettings.getPerformancePreferencesBandwidth()I: root-Branch
   * Goal 3. org.quickserver.util.xmlreader.AdvancedSettings.getUseDirectByteBuffer()Z: root-Branch
   * Goal 4. org.quickserver.util.xmlreader.AdvancedSettings.getDebugNonBlockingMode()Z: root-Branch
   * Goal 5. org.quickserver.util.xmlreader.AdvancedSettings.getPerformancePreferencesLatency()I: root-Branch
   * Goal 6. org.quickserver.util.xmlreader.AdvancedSettings.getCharset()Ljava/lang/String;: root-Branch
   * Goal 7. org.quickserver.util.xmlreader.AdvancedSettings.getClientSocketSendBufferSize()I: root-Branch
   * Goal 8. org.quickserver.util.xmlreader.AdvancedSettings.getByteBufferSize()I: root-Branch
   * Goal 9. org.quickserver.util.xmlreader.AdvancedSettings.setClientSocketSendBufferSize(I)V: root-Branch
   * Goal 10. org.quickserver.util.xmlreader.AdvancedSettings.getMaxThreadsForNioWrite()I: root-Branch
   * Goal 11. org.quickserver.util.xmlreader.AdvancedSettings.getPerformancePreferencesConnectionTime()I: root-Branch
   * Goal 12. org.quickserver.util.xmlreader.AdvancedSettings.getBacklog()I: root-Branch
   * Goal 13. org.quickserver.util.xmlreader.AdvancedSettings.getSocketLinger()I: root-Branch
   * Goal 14. org.quickserver.util.xmlreader.AdvancedSettings.<init>()V: root-Branch
   * Goal 15. org.quickserver.util.xmlreader.AdvancedSettings.setPerformancePreferencesLatency(I)V: root-Branch
   * Goal 16. org.quickserver.util.xmlreader.AdvancedSettings.setPerformancePreferencesBandwidth(I)V: root-Branch
   * Goal 17. org.quickserver.util.xmlreader.AdvancedSettings.getClientIdentifier()Ljava/lang/String;: root-Branch
   * Goal 18. org.quickserver.util.xmlreader.AdvancedSettings.getClientSocketTcpNoDelay()Z: root-Branch
   * Goal 19. org.quickserver.util.xmlreader.AdvancedSettings.getClientSocketTrafficClass()Ljava/lang/String;: root-Branch
   * Goal 20. org.quickserver.util.xmlreader.AdvancedSettings.getClientSocketReceiveBufferSize()I: root-Branch
   * Goal 21. org.quickserver.util.xmlreader.AdvancedSettings.setByteBufferSize(I)V: I6 Branch 4 IFLE L98 - true
   * Goal 22. org.quickserver.util.xmlreader.AdvancedSettings.getQSObjectPoolMaker()Ljava/lang/String;: I7 Branch 8 IFNONNULL L222 - false
   * Goal 23. org.quickserver.util.xmlreader.AdvancedSettings.toXML(Ljava/lang/String;)Ljava/lang/String;: I6 Branch 9 IFNONNULL L251 - true
   * Goal 24. org.quickserver.util.xmlreader.AdvancedSettings.toXML(Ljava/lang/String;)Ljava/lang/String;: I204 Branch 10 IFNULL L283 - true
   * Goal 25. org.quickserver.util.xmlreader.AdvancedSettings.toXML(Ljava/lang/String;)Ljava/lang/String;: I225 Branch 11 IFEQ L289 - true
   * Goal 26. org.quickserver.util.xmlreader.AdvancedSettings.toXML(Ljava/lang/String;)Ljava/lang/String;: I246 Branch 12 IFEQ L294 - false
   */

  @Test
  public void test16()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      int int0 = advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.setClientSocketSendBufferSize((-10));
      advancedSettings0.setClientSocketReceiveBufferSize(0);
      advancedSettings0.setPerformancePreferencesLatency((-10));
      advancedSettings0.setPerformancePreferencesBandwidth(0);
      advancedSettings0.setByteBufferSize(0);
      String string0 = advancedSettings0.toXML("ikUr=aExB'^oj2mp");
      assertEquals(-10, advancedSettings0.getClientSocketSendBufferSize());
  }
}

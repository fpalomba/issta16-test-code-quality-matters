/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 16 15:07:38 GMT 2015
 */

package org.jsecurity.authc;

import static org.junit.Assert.*;
import org.junit.Test;
import java.net.Inet4Address;
import java.net.InetAddress;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.jsecurity.authc.UsernamePasswordToken;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class UsernamePasswordToken_ESTest extends UsernamePasswordToken_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.setRememberMe(Z)V: root-Branch
   */

  @Test
  public void test00()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      assertNotNull(usernamePasswordToken0);
      assertNull(usernamePasswordToken0.getUsername());
      assertFalse(usernamePasswordToken0.isRememberMe());
      
      usernamePasswordToken0.setRememberMe(false);
      assertNull(usernamePasswordToken0.getUsername());
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.getPassword()[C: root-Branch
   * Goal 2. org.jsecurity.authc.UsernamePasswordToken.getCredentials()Ljava/lang/Object;: root-Branch
   */

  @Test
  public void test01()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      assertNotNull(usernamePasswordToken0);
      assertNull(usernamePasswordToken0.getUsername());
      assertFalse(usernamePasswordToken0.isRememberMe());
      
      Object object0 = usernamePasswordToken0.getCredentials();
      assertNull(object0);
      assertNull(usernamePasswordToken0.getUsername());
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.setUsername(Ljava/lang/String;)V: root-Branch
   */

  @Test
  public void test02()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("H/$ - ", "H/$ - ");
      assertNotNull(usernamePasswordToken0);
      assertEquals("H/$ - ", usernamePasswordToken0.getUsername());
      assertFalse(usernamePasswordToken0.isRememberMe());
      
      usernamePasswordToken0.setUsername("H/$ - ");
      assertEquals("H/$ - ", usernamePasswordToken0.getUsername());
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.setPassword([C)V: root-Branch
   */

  @Test
  public void test03()  throws Throwable  {
      char[] charArray0 = new char[14];
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      assertNotNull(usernamePasswordToken0);
      assertNull(usernamePasswordToken0.getUsername());
      assertFalse(usernamePasswordToken0.isRememberMe());
      
      usernamePasswordToken0.setPassword(charArray0);
      assertNull(usernamePasswordToken0.getUsername());
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.<init>(Ljava/lang/String;[C)V: root-Branch
   */

  @Test
  public void test04()  throws Throwable  {
      char[] charArray0 = new char[4];
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("H $ Y; ", charArray0);
      assertNotNull(usernamePasswordToken0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
      assertEquals("H $ Y; ", usernamePasswordToken0.getUsername());
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.getPrincipal()Ljava/lang/Object;: root-Branch
   * Goal 2. org.jsecurity.authc.UsernamePasswordToken.getUsername()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test05()  throws Throwable  {
      Inet4Address inet4Address0 = (Inet4Address)MockInetAddress.getLoopbackAddress();
      assertNotNull(inet4Address0);
      assertEquals("/127.0.0.1", inet4Address0.toString());
      assertTrue(inet4Address0.isLoopbackAddress());
      assertFalse(inet4Address0.isMCLinkLocal());
      assertFalse(inet4Address0.isAnyLocalAddress());
      assertFalse(inet4Address0.isMCSiteLocal());
      assertFalse(inet4Address0.isMCOrgLocal());
      assertFalse(inet4Address0.isMulticastAddress());
      assertFalse(inet4Address0.isMCGlobal());
      assertFalse(inet4Address0.isLinkLocalAddress());
      assertFalse(inet4Address0.isSiteLocalAddress());
      assertFalse(inet4Address0.isMCNodeLocal());
      assertEquals("127.0.0.1", inet4Address0.getHostAddress());
      
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken((String) null, (String) null, (InetAddress) inet4Address0);
      assertNotNull(usernamePasswordToken0);
      assertEquals("/127.0.0.1", inet4Address0.toString());
      assertTrue(inet4Address0.isLoopbackAddress());
      assertFalse(inet4Address0.isMCLinkLocal());
      assertFalse(inet4Address0.isAnyLocalAddress());
      assertFalse(inet4Address0.isMCSiteLocal());
      assertFalse(inet4Address0.isMCOrgLocal());
      assertFalse(inet4Address0.isMulticastAddress());
      assertFalse(inet4Address0.isMCGlobal());
      assertFalse(inet4Address0.isLinkLocalAddress());
      assertFalse(inet4Address0.isSiteLocalAddress());
      assertFalse(inet4Address0.isMCNodeLocal());
      assertEquals("127.0.0.1", inet4Address0.getHostAddress());
      assertFalse(usernamePasswordToken0.isRememberMe());
      assertNull(usernamePasswordToken0.getUsername());
      
      Object object0 = usernamePasswordToken0.getPrincipal();
      assertNull(object0);
      assertEquals("/127.0.0.1", inet4Address0.toString());
      assertTrue(inet4Address0.isLoopbackAddress());
      assertFalse(inet4Address0.isMCLinkLocal());
      assertFalse(inet4Address0.isAnyLocalAddress());
      assertFalse(inet4Address0.isMCSiteLocal());
      assertFalse(inet4Address0.isMCOrgLocal());
      assertFalse(inet4Address0.isMulticastAddress());
      assertFalse(inet4Address0.isMCGlobal());
      assertFalse(inet4Address0.isLinkLocalAddress());
      assertFalse(inet4Address0.isSiteLocalAddress());
      assertFalse(inet4Address0.isMCNodeLocal());
      assertEquals("127.0.0.1", inet4Address0.getHostAddress());
      assertFalse(usernamePasswordToken0.isRememberMe());
      assertNull(usernamePasswordToken0.getUsername());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.toString()Ljava/lang/String;: I43 Branch 7 IFNULL L363 - false
   */

  @Test
  public void test06()  throws Throwable  {
      Inet4Address inet4Address0 = (Inet4Address)MockInetAddress.anyLocalAddress();
      assertNotNull(inet4Address0);
      assertFalse(inet4Address0.isLinkLocalAddress());
      assertEquals("192.168.1.42", inet4Address0.getHostAddress());
      assertFalse(inet4Address0.isMCLinkLocal());
      assertFalse(inet4Address0.isAnyLocalAddress());
      assertFalse(inet4Address0.isMCSiteLocal());
      assertFalse(inet4Address0.isMCGlobal());
      assertFalse(inet4Address0.isLoopbackAddress());
      assertFalse(inet4Address0.isMCNodeLocal());
      assertEquals("/192.168.1.42", inet4Address0.toString());
      assertFalse(inet4Address0.isMCOrgLocal());
      assertTrue(inet4Address0.isSiteLocalAddress());
      assertFalse(inet4Address0.isMulticastAddress());
      
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken((String) null, (String) null, (InetAddress) inet4Address0);
      assertNotNull(usernamePasswordToken0);
      assertFalse(inet4Address0.isLinkLocalAddress());
      assertEquals("192.168.1.42", inet4Address0.getHostAddress());
      assertFalse(inet4Address0.isMCLinkLocal());
      assertFalse(inet4Address0.isAnyLocalAddress());
      assertFalse(inet4Address0.isMCSiteLocal());
      assertFalse(inet4Address0.isMCGlobal());
      assertFalse(inet4Address0.isLoopbackAddress());
      assertFalse(inet4Address0.isMCNodeLocal());
      assertEquals("/192.168.1.42", inet4Address0.toString());
      assertFalse(inet4Address0.isMCOrgLocal());
      assertTrue(inet4Address0.isSiteLocalAddress());
      assertFalse(inet4Address0.isMulticastAddress());
      assertNull(usernamePasswordToken0.getUsername());
      assertFalse(usernamePasswordToken0.isRememberMe());
      
      String string0 = usernamePasswordToken0.toString();
      assertNotNull(string0);
      assertFalse(inet4Address0.isLinkLocalAddress());
      assertEquals("192.168.1.42", inet4Address0.getHostAddress());
      assertFalse(inet4Address0.isMCLinkLocal());
      assertFalse(inet4Address0.isAnyLocalAddress());
      assertFalse(inet4Address0.isMCSiteLocal());
      assertFalse(inet4Address0.isMCGlobal());
      assertFalse(inet4Address0.isLoopbackAddress());
      assertFalse(inet4Address0.isMCNodeLocal());
      assertEquals("/192.168.1.42", inet4Address0.toString());
      assertFalse(inet4Address0.isMCOrgLocal());
      assertTrue(inet4Address0.isSiteLocalAddress());
      assertFalse(inet4Address0.isMulticastAddress());
      assertNull(usernamePasswordToken0.getUsername());
      assertFalse(usernamePasswordToken0.isRememberMe());
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - null, rememberMe=false (/192.168.1.42)", string0);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.setInetAddress(Ljava/net/InetAddress;)V: root-Branch
   */

  @Test
  public void test07()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      assertNotNull(usernamePasswordToken0);
      assertNull(usernamePasswordToken0.getUsername());
      assertFalse(usernamePasswordToken0.isRememberMe());
      
      Inet4Address inet4Address0 = (Inet4Address)MockInetAddress.getLocalHost();
      assertNotNull(inet4Address0);
      assertFalse(inet4Address0.isMCNodeLocal());
      assertFalse(inet4Address0.isLoopbackAddress());
      assertTrue(inet4Address0.isSiteLocalAddress());
      assertFalse(inet4Address0.isMCSiteLocal());
      assertEquals("/192.168.1.42", inet4Address0.toString());
      assertFalse(inet4Address0.isMCOrgLocal());
      assertFalse(inet4Address0.isLinkLocalAddress());
      assertFalse(inet4Address0.isMCGlobal());
      assertFalse(inet4Address0.isMulticastAddress());
      assertEquals("192.168.1.42", inet4Address0.getHostAddress());
      assertFalse(inet4Address0.isMCLinkLocal());
      assertFalse(inet4Address0.isAnyLocalAddress());
      
      usernamePasswordToken0.setInetAddress((InetAddress) inet4Address0);
      assertFalse(inet4Address0.isMCNodeLocal());
      assertFalse(inet4Address0.isLoopbackAddress());
      assertTrue(inet4Address0.isSiteLocalAddress());
      assertFalse(inet4Address0.isMCSiteLocal());
      assertEquals("/192.168.1.42", inet4Address0.toString());
      assertFalse(inet4Address0.isMCOrgLocal());
      assertFalse(inet4Address0.isLinkLocalAddress());
      assertFalse(inet4Address0.isMCGlobal());
      assertFalse(inet4Address0.isMulticastAddress());
      assertEquals("192.168.1.42", inet4Address0.getHostAddress());
      assertFalse(inet4Address0.isMCLinkLocal());
      assertFalse(inet4Address0.isAnyLocalAddress());
      assertNull(usernamePasswordToken0.getUsername());
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.isRememberMe()Z: root-Branch
   */

  @Test
  public void test08()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      assertNotNull(usernamePasswordToken0);
      assertNull(usernamePasswordToken0.getUsername());
      assertFalse(usernamePasswordToken0.isRememberMe());
      
      boolean boolean0 = usernamePasswordToken0.isRememberMe();
      assertNull(usernamePasswordToken0.getUsername());
      assertFalse(usernamePasswordToken0.isRememberMe());
      assertFalse(boolean0);
  }

  //Test case number: 9
  /*
   * 3 covered goals:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.clear()V: I22 Branch 5 IFNULL L340 - false
   * Goal 2. org.jsecurity.authc.UsernamePasswordToken.clear()V: I35 Branch 6 IF_ICMPGE L341 - true
   * Goal 3. org.jsecurity.authc.UsernamePasswordToken.clear()V: I35 Branch 6 IF_ICMPGE L341 - false
   */

  @Test
  public void test09()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("   eT\"ert(=", "   eT\"ert(=");
      assertNotNull(usernamePasswordToken0);
      assertFalse(usernamePasswordToken0.isRememberMe());
      assertEquals("   eT\"ert(=", usernamePasswordToken0.getUsername());
      
      usernamePasswordToken0.clear();
      assertNull(usernamePasswordToken0.getUsername());
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.clear()V: I22 Branch 5 IFNULL L340 - true
   */

  @Test
  public void test10()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      assertNotNull(usernamePasswordToken0);
      assertNull(usernamePasswordToken0.getUsername());
      assertFalse(usernamePasswordToken0.isRememberMe());
      
      usernamePasswordToken0.clear();
      assertNull(usernamePasswordToken0.getUsername());
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.toString()Ljava/lang/String;: I43 Branch 7 IFNULL L363 - true
   */

  @Test
  public void test11()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      assertNotNull(usernamePasswordToken0);
      assertFalse(usernamePasswordToken0.isRememberMe());
      assertNull(usernamePasswordToken0.getUsername());
      
      String string0 = usernamePasswordToken0.toString();
      assertNotNull(string0);
      assertFalse(usernamePasswordToken0.isRememberMe());
      assertNull(usernamePasswordToken0.getUsername());
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - null, rememberMe=false", string0);
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.<init>(Ljava/lang/String;[CZ)V: root-Branch
   */

  @Test
  public void test12()  throws Throwable  {
      char[] charArray0 = new char[9];
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken(" - ", charArray0, true);
      assertNotNull(usernamePasswordToken0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
      assertTrue(usernamePasswordToken0.isRememberMe());
      assertEquals(" - ", usernamePasswordToken0.getUsername());
  }

  //Test case number: 13
  /*
   * 2 covered goals:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.<init>()V: root-Branch
   * Goal 2. org.jsecurity.authc.UsernamePasswordToken.getInetAddress()Ljava/net/InetAddress;: root-Branch
   */

  @Test
  public void test13()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      assertNotNull(usernamePasswordToken0);
      assertFalse(usernamePasswordToken0.isRememberMe());
      assertNull(usernamePasswordToken0.getUsername());
      
      InetAddress inetAddress0 = usernamePasswordToken0.getInetAddress();
      assertNull(inetAddress0);
      assertFalse(usernamePasswordToken0.isRememberMe());
      assertNull(usernamePasswordToken0.getUsername());
  }

  //Test case number: 14
  /*
   * 2 covered goals:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.<init>(Ljava/lang/String;[CLjava/net/InetAddress;)V: root-Branch
   * Goal 2. org.jsecurity.authc.UsernamePasswordToken.<init>(Ljava/lang/String;[CZLjava/net/InetAddress;)V: root-Branch
   */

  @Test
  public void test14()  throws Throwable  {
      char[] charArray0 = new char[6];
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken(" ", charArray0, (InetAddress) null);
      assertNotNull(usernamePasswordToken0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
      assertEquals(" ", usernamePasswordToken0.getUsername());
      assertFalse(usernamePasswordToken0.isRememberMe());
  }
}

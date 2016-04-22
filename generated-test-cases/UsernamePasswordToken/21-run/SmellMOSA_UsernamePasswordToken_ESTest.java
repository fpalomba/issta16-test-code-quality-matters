/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 16 15:51:36 GMT 2015
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
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.getInetAddress()Ljava/net/InetAddress;: root-Branch
   */

  @Test
  public void test00()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken(" >IsXZ ", " >IsXZ ");
      assertFalse(usernamePasswordToken0.isRememberMe());
      assertEquals(" >IsXZ ", usernamePasswordToken0.getUsername());
      assertNotNull(usernamePasswordToken0);
      
      InetAddress inetAddress0 = usernamePasswordToken0.getInetAddress();
      assertFalse(usernamePasswordToken0.isRememberMe());
      assertEquals(" >IsXZ ", usernamePasswordToken0.getUsername());
      assertNull(inetAddress0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.setUsername(Ljava/lang/String;)V: root-Branch
   */

  @Test
  public void test01()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      assertNull(usernamePasswordToken0.getUsername());
      assertFalse(usernamePasswordToken0.isRememberMe());
      assertNotNull(usernamePasswordToken0);
      
      usernamePasswordToken0.setUsername("n rem w*erMe=");
      assertEquals("n rem w*erMe=", usernamePasswordToken0.getUsername());
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.setPassword([C)V: root-Branch
   */

  @Test
  public void test02()  throws Throwable  {
      char[] charArray0 = new char[1];
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      assertFalse(usernamePasswordToken0.isRememberMe());
      assertNull(usernamePasswordToken0.getUsername());
      assertNotNull(usernamePasswordToken0);
      
      usernamePasswordToken0.setPassword(charArray0);
      assertFalse(usernamePasswordToken0.isRememberMe());
      assertNull(usernamePasswordToken0.getUsername());
      assertArrayEquals(new char[] {'\u0000'}, charArray0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.<init>(Ljava/lang/String;[CZ)V: root-Branch
   */

  @Test
  public void test03()  throws Throwable  {
      char[] charArray0 = new char[18];
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken(", rememberMe=", charArray0, true);
      assertTrue(usernamePasswordToken0.isRememberMe());
      assertEquals(", rememberMe=", usernamePasswordToken0.getUsername());
      assertNotNull(usernamePasswordToken0);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.isRememberMe()Z: root-Branch
   */

  @Test
  public void test04()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      assertNull(usernamePasswordToken0.getUsername());
      assertFalse(usernamePasswordToken0.isRememberMe());
      assertNotNull(usernamePasswordToken0);
      
      boolean boolean0 = usernamePasswordToken0.isRememberMe();
      assertNull(usernamePasswordToken0.getUsername());
      assertFalse(usernamePasswordToken0.isRememberMe());
      assertFalse(boolean0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.<init>(Ljava/lang/String;[CLjava/net/InetAddress;)V: root-Branch
   */

  @Test
  public void test05()  throws Throwable  {
      char[] charArray0 = new char[1];
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("y=cg {}", charArray0, (InetAddress) null);
      assertEquals("y=cg {}", usernamePasswordToken0.getUsername());
      assertFalse(usernamePasswordToken0.isRememberMe());
      assertNotNull(usernamePasswordToken0);
      assertArrayEquals(new char[] {'\u0000'}, charArray0);
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.toString()Ljava/lang/String;: I43 Branch 7 IFNULL L363 - true
   */

  @Test
  public void test06()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken(" GIsXY ", " GIsXY ");
      assertFalse(usernamePasswordToken0.isRememberMe());
      assertEquals(" GIsXY ", usernamePasswordToken0.getUsername());
      assertNotNull(usernamePasswordToken0);
      
      String string0 = usernamePasswordToken0.toString();
      assertFalse(usernamePasswordToken0.isRememberMe());
      assertEquals(" GIsXY ", usernamePasswordToken0.getUsername());
      assertNotNull(string0);
      assertEquals("org.jsecurity.authc.UsernamePasswordToken -  GIsXY , rememberMe=false", string0);
  }

  //Test case number: 7
  /*
   * 3 covered goals:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.clear()V: I22 Branch 5 IFNULL L340 - false
   * Goal 2. org.jsecurity.authc.UsernamePasswordToken.clear()V: I35 Branch 6 IF_ICMPGE L341 - true
   * Goal 3. org.jsecurity.authc.UsernamePasswordToken.clear()V: I35 Branch 6 IF_ICMPGE L341 - false
   */

  @Test
  public void test07()  throws Throwable  {
      Inet4Address inet4Address0 = (Inet4Address)MockInetAddress.getLocalHost();
      assertFalse(inet4Address0.isMCNodeLocal());
      assertEquals("/192.168.1.42", inet4Address0.toString());
      assertTrue(inet4Address0.isSiteLocalAddress());
      assertFalse(inet4Address0.isMulticastAddress());
      assertFalse(inet4Address0.isMCGlobal());
      assertFalse(inet4Address0.isLinkLocalAddress());
      assertFalse(inet4Address0.isAnyLocalAddress());
      assertFalse(inet4Address0.isMCOrgLocal());
      assertFalse(inet4Address0.isMCLinkLocal());
      assertFalse(inet4Address0.isLoopbackAddress());
      assertFalse(inet4Address0.isMCSiteLocal());
      assertEquals("192.168.1.42", inet4Address0.getHostAddress());
      assertNotNull(inet4Address0);
      
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("V$(r#&7get~]W3", "V$(r#&7get~]W3", (InetAddress) inet4Address0);
      assertFalse(inet4Address0.isMCNodeLocal());
      assertEquals("/192.168.1.42", inet4Address0.toString());
      assertTrue(inet4Address0.isSiteLocalAddress());
      assertFalse(inet4Address0.isMulticastAddress());
      assertFalse(inet4Address0.isMCGlobal());
      assertFalse(inet4Address0.isLinkLocalAddress());
      assertFalse(inet4Address0.isAnyLocalAddress());
      assertFalse(inet4Address0.isMCOrgLocal());
      assertFalse(inet4Address0.isMCLinkLocal());
      assertFalse(inet4Address0.isLoopbackAddress());
      assertFalse(inet4Address0.isMCSiteLocal());
      assertEquals("192.168.1.42", inet4Address0.getHostAddress());
      assertEquals("V$(r#&7get~]W3", usernamePasswordToken0.getUsername());
      assertFalse(usernamePasswordToken0.isRememberMe());
      assertNotNull(usernamePasswordToken0);
      
      usernamePasswordToken0.clear();
      assertFalse(inet4Address0.isMCNodeLocal());
      assertEquals("/192.168.1.42", inet4Address0.toString());
      assertTrue(inet4Address0.isSiteLocalAddress());
      assertFalse(inet4Address0.isMulticastAddress());
      assertFalse(inet4Address0.isMCGlobal());
      assertFalse(inet4Address0.isLinkLocalAddress());
      assertFalse(inet4Address0.isAnyLocalAddress());
      assertFalse(inet4Address0.isMCOrgLocal());
      assertFalse(inet4Address0.isMCLinkLocal());
      assertFalse(inet4Address0.isLoopbackAddress());
      assertFalse(inet4Address0.isMCSiteLocal());
      assertEquals("192.168.1.42", inet4Address0.getHostAddress());
      assertFalse(usernamePasswordToken0.isRememberMe());
      assertNull(usernamePasswordToken0.getUsername());
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.toString()Ljava/lang/String;: I43 Branch 7 IFNULL L363 - false
   */

  @Test
  public void test08()  throws Throwable  {
      Inet4Address inet4Address0 = (Inet4Address)MockInetAddress.getLocalHost();
      assertFalse(inet4Address0.isLinkLocalAddress());
      assertEquals("192.168.1.42", inet4Address0.getHostAddress());
      assertFalse(inet4Address0.isMCLinkLocal());
      assertFalse(inet4Address0.isMCSiteLocal());
      assertFalse(inet4Address0.isAnyLocalAddress());
      assertFalse(inet4Address0.isMCGlobal());
      assertFalse(inet4Address0.isLoopbackAddress());
      assertFalse(inet4Address0.isMCNodeLocal());
      assertEquals("/192.168.1.42", inet4Address0.toString());
      assertFalse(inet4Address0.isMCOrgLocal());
      assertFalse(inet4Address0.isMulticastAddress());
      assertTrue(inet4Address0.isSiteLocalAddress());
      assertNotNull(inet4Address0);
      
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("%$(r#&7g&q]W3", "%$(r#&7g&q]W3", (InetAddress) inet4Address0);
      assertFalse(inet4Address0.isLinkLocalAddress());
      assertEquals("192.168.1.42", inet4Address0.getHostAddress());
      assertFalse(inet4Address0.isMCLinkLocal());
      assertFalse(inet4Address0.isMCSiteLocal());
      assertFalse(inet4Address0.isAnyLocalAddress());
      assertFalse(inet4Address0.isMCGlobal());
      assertFalse(inet4Address0.isLoopbackAddress());
      assertFalse(inet4Address0.isMCNodeLocal());
      assertEquals("/192.168.1.42", inet4Address0.toString());
      assertFalse(inet4Address0.isMCOrgLocal());
      assertFalse(inet4Address0.isMulticastAddress());
      assertTrue(inet4Address0.isSiteLocalAddress());
      assertEquals("%$(r#&7g&q]W3", usernamePasswordToken0.getUsername());
      assertFalse(usernamePasswordToken0.isRememberMe());
      assertNotNull(usernamePasswordToken0);
      
      String string0 = usernamePasswordToken0.toString();
      assertFalse(inet4Address0.isLinkLocalAddress());
      assertEquals("192.168.1.42", inet4Address0.getHostAddress());
      assertFalse(inet4Address0.isMCLinkLocal());
      assertFalse(inet4Address0.isMCSiteLocal());
      assertFalse(inet4Address0.isAnyLocalAddress());
      assertFalse(inet4Address0.isMCGlobal());
      assertFalse(inet4Address0.isLoopbackAddress());
      assertFalse(inet4Address0.isMCNodeLocal());
      assertEquals("/192.168.1.42", inet4Address0.toString());
      assertFalse(inet4Address0.isMCOrgLocal());
      assertFalse(inet4Address0.isMulticastAddress());
      assertTrue(inet4Address0.isSiteLocalAddress());
      assertEquals("%$(r#&7g&q]W3", usernamePasswordToken0.getUsername());
      assertFalse(usernamePasswordToken0.isRememberMe());
      assertNotNull(string0);
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - %$(r#&7g&q]W3, rememberMe=false (/192.168.1.42)", string0);
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.clear()V: I22 Branch 5 IFNULL L340 - true
   */

  @Test
  public void test09()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      assertNull(usernamePasswordToken0.getUsername());
      assertFalse(usernamePasswordToken0.isRememberMe());
      assertNotNull(usernamePasswordToken0);
      
      usernamePasswordToken0.clear();
      assertNull(usernamePasswordToken0.getUsername());
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  //Test case number: 10
  /*
   * 2 covered goals:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.getPrincipal()Ljava/lang/Object;: root-Branch
   * Goal 2. org.jsecurity.authc.UsernamePasswordToken.getUsername()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test10()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      assertFalse(usernamePasswordToken0.isRememberMe());
      assertNull(usernamePasswordToken0.getUsername());
      assertNotNull(usernamePasswordToken0);
      
      Object object0 = usernamePasswordToken0.getPrincipal();
      assertFalse(usernamePasswordToken0.isRememberMe());
      assertNull(usernamePasswordToken0.getUsername());
      assertNull(object0);
  }

  //Test case number: 11
  /*
   * 2 covered goals:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.getPassword()[C: root-Branch
   * Goal 2. org.jsecurity.authc.UsernamePasswordToken.getCredentials()Ljava/lang/Object;: root-Branch
   */

  @Test
  public void test11()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken(" >IsXZ ", " >IsXZ ");
      assertEquals(" >IsXZ ", usernamePasswordToken0.getUsername());
      assertFalse(usernamePasswordToken0.isRememberMe());
      assertNotNull(usernamePasswordToken0);
      
      Object object0 = usernamePasswordToken0.getCredentials();
      assertEquals(" >IsXZ ", usernamePasswordToken0.getUsername());
      assertFalse(usernamePasswordToken0.isRememberMe());
      assertNotNull(object0);
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.<init>(Ljava/lang/String;[C)V: root-Branch
   */

  @Test
  public void test12()  throws Throwable  {
      char[] charArray0 = new char[10];
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken(", rememberMe=", charArray0);
      assertEquals(", rememberMe=", usernamePasswordToken0.getUsername());
      assertFalse(usernamePasswordToken0.isRememberMe());
      assertNotNull(usernamePasswordToken0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  //Test case number: 13
  /*
   * 2 covered goals:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.setRememberMe(Z)V: root-Branch
   * Goal 2. org.jsecurity.authc.UsernamePasswordToken.<init>()V: root-Branch
   */

  @Test
  public void test13()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      assertNull(usernamePasswordToken0.getUsername());
      assertFalse(usernamePasswordToken0.isRememberMe());
      assertNotNull(usernamePasswordToken0);
      
      usernamePasswordToken0.setRememberMe(false);
      assertNull(usernamePasswordToken0.getUsername());
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.setInetAddress(Ljava/net/InetAddress;)V: root-Branch
   */

  @Test
  public void test14()  throws Throwable  {
      Inet4Address inet4Address0 = (Inet4Address)MockInetAddress.getLocalHost();
      assertFalse(inet4Address0.isMCNodeLocal());
      assertFalse(inet4Address0.isAnyLocalAddress());
      assertTrue(inet4Address0.isSiteLocalAddress());
      assertFalse(inet4Address0.isMCGlobal());
      assertFalse(inet4Address0.isLinkLocalAddress());
      assertEquals("192.168.1.42", inet4Address0.getHostAddress());
      assertFalse(inet4Address0.isMCLinkLocal());
      assertFalse(inet4Address0.isMulticastAddress());
      assertFalse(inet4Address0.isMCOrgLocal());
      assertFalse(inet4Address0.isMCSiteLocal());
      assertEquals("/192.168.1.42", inet4Address0.toString());
      assertFalse(inet4Address0.isLoopbackAddress());
      assertNotNull(inet4Address0);
      
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("B + [z", "B + [z", (InetAddress) inet4Address0);
      assertFalse(usernamePasswordToken0.isRememberMe());
      assertEquals("B + [z", usernamePasswordToken0.getUsername());
      assertFalse(inet4Address0.isMCNodeLocal());
      assertFalse(inet4Address0.isAnyLocalAddress());
      assertTrue(inet4Address0.isSiteLocalAddress());
      assertFalse(inet4Address0.isMCGlobal());
      assertFalse(inet4Address0.isLinkLocalAddress());
      assertEquals("192.168.1.42", inet4Address0.getHostAddress());
      assertFalse(inet4Address0.isMCLinkLocal());
      assertFalse(inet4Address0.isMulticastAddress());
      assertFalse(inet4Address0.isMCOrgLocal());
      assertFalse(inet4Address0.isMCSiteLocal());
      assertEquals("/192.168.1.42", inet4Address0.toString());
      assertFalse(inet4Address0.isLoopbackAddress());
      assertNotNull(usernamePasswordToken0);
      
      usernamePasswordToken0.setInetAddress((InetAddress) inet4Address0);
      assertFalse(usernamePasswordToken0.isRememberMe());
      assertEquals("B + [z", usernamePasswordToken0.getUsername());
      assertFalse(inet4Address0.isMCNodeLocal());
      assertFalse(inet4Address0.isAnyLocalAddress());
      assertTrue(inet4Address0.isSiteLocalAddress());
      assertFalse(inet4Address0.isMCGlobal());
      assertFalse(inet4Address0.isLinkLocalAddress());
      assertEquals("192.168.1.42", inet4Address0.getHostAddress());
      assertFalse(inet4Address0.isMCLinkLocal());
      assertFalse(inet4Address0.isMulticastAddress());
      assertFalse(inet4Address0.isMCOrgLocal());
      assertFalse(inet4Address0.isMCSiteLocal());
      assertEquals("/192.168.1.42", inet4Address0.toString());
      assertFalse(inet4Address0.isLoopbackAddress());
  }
}
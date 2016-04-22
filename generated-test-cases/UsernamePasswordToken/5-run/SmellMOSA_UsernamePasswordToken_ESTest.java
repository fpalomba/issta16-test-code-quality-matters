/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 16 15:16:25 GMT 2015
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
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.<init>(Ljava/lang/String;[C)V: root-Branch
   */

  @Test
  public void test00()  throws Throwable  {
      char[] charArray0 = new char[2];
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("yT% & ", charArray0);
      assertNotNull(usernamePasswordToken0);
      assertEquals("yT% & ", usernamePasswordToken0.getUsername());
      assertFalse(usernamePasswordToken0.isRememberMe());
      assertArrayEquals(new char[] {'\u0000', '\u0000'}, charArray0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.<init>(Ljava/lang/String;[CLjava/net/InetAddress;)V: root-Branch
   */

  @Test
  public void test01()  throws Throwable  {
      char[] charArray0 = new char[18];
      Inet4Address inet4Address0 = (Inet4Address)MockInetAddress.anyLocalAddress();
      assertNotNull(inet4Address0);
      assertEquals("/192.168.1.42", inet4Address0.toString());
      assertFalse(inet4Address0.isMCNodeLocal());
      assertFalse(inet4Address0.isLinkLocalAddress());
      assertTrue(inet4Address0.isSiteLocalAddress());
      assertFalse(inet4Address0.isMulticastAddress());
      assertFalse(inet4Address0.isAnyLocalAddress());
      assertFalse(inet4Address0.isMCSiteLocal());
      assertFalse(inet4Address0.isMCOrgLocal());
      assertEquals("192.168.1.42", inet4Address0.getHostAddress());
      assertFalse(inet4Address0.isLoopbackAddress());
      assertFalse(inet4Address0.isMCLinkLocal());
      assertFalse(inet4Address0.isMCGlobal());
      
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("}:jSO!Ho /2= T34W", charArray0, (InetAddress) inet4Address0);
      assertNotNull(usernamePasswordToken0);
      assertFalse(usernamePasswordToken0.isRememberMe());
      assertEquals("}:jSO!Ho /2= T34W", usernamePasswordToken0.getUsername());
      assertEquals("/192.168.1.42", inet4Address0.toString());
      assertFalse(inet4Address0.isMCNodeLocal());
      assertFalse(inet4Address0.isLinkLocalAddress());
      assertTrue(inet4Address0.isSiteLocalAddress());
      assertFalse(inet4Address0.isMulticastAddress());
      assertFalse(inet4Address0.isAnyLocalAddress());
      assertFalse(inet4Address0.isMCSiteLocal());
      assertFalse(inet4Address0.isMCOrgLocal());
      assertEquals("192.168.1.42", inet4Address0.getHostAddress());
      assertFalse(inet4Address0.isLoopbackAddress());
      assertFalse(inet4Address0.isMCLinkLocal());
      assertFalse(inet4Address0.isMCGlobal());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.clear()V: I22 Branch 5 IFNULL L340 - true
   */

  @Test
  public void test02()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      assertNotNull(usernamePasswordToken0);
      assertNull(usernamePasswordToken0.getUsername());
      assertFalse(usernamePasswordToken0.isRememberMe());
      
      usernamePasswordToken0.clear();
      assertNull(usernamePasswordToken0.getUsername());
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.setInetAddress(Ljava/net/InetAddress;)V: root-Branch
   */

  @Test
  public void test03()  throws Throwable  {
      Inet4Address inet4Address0 = (Inet4Address)MockInetAddress.getLoopbackAddress();
      assertNotNull(inet4Address0);
      assertFalse(inet4Address0.isMulticastAddress());
      assertFalse(inet4Address0.isMCGlobal());
      assertEquals("127.0.0.1", inet4Address0.getHostAddress());
      assertFalse(inet4Address0.isAnyLocalAddress());
      assertFalse(inet4Address0.isMCLinkLocal());
      assertFalse(inet4Address0.isLinkLocalAddress());
      assertFalse(inet4Address0.isMCOrgLocal());
      assertFalse(inet4Address0.isMCSiteLocal());
      assertFalse(inet4Address0.isSiteLocalAddress());
      assertFalse(inet4Address0.isMCNodeLocal());
      assertEquals("/127.0.0.1", inet4Address0.toString());
      assertTrue(inet4Address0.isLoopbackAddress());
      
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      assertNotNull(usernamePasswordToken0);
      assertFalse(usernamePasswordToken0.isRememberMe());
      assertNull(usernamePasswordToken0.getUsername());
      
      usernamePasswordToken0.setInetAddress((InetAddress) inet4Address0);
      assertFalse(usernamePasswordToken0.isRememberMe());
      assertNull(usernamePasswordToken0.getUsername());
      assertFalse(inet4Address0.isMulticastAddress());
      assertFalse(inet4Address0.isMCGlobal());
      assertEquals("127.0.0.1", inet4Address0.getHostAddress());
      assertFalse(inet4Address0.isAnyLocalAddress());
      assertFalse(inet4Address0.isMCLinkLocal());
      assertFalse(inet4Address0.isLinkLocalAddress());
      assertFalse(inet4Address0.isMCOrgLocal());
      assertFalse(inet4Address0.isMCSiteLocal());
      assertFalse(inet4Address0.isSiteLocalAddress());
      assertFalse(inet4Address0.isMCNodeLocal());
      assertEquals("/127.0.0.1", inet4Address0.toString());
      assertTrue(inet4Address0.isLoopbackAddress());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.setRememberMe(Z)V: root-Branch
   */

  @Test
  public void test04()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      assertNotNull(usernamePasswordToken0);
      assertNull(usernamePasswordToken0.getUsername());
      assertFalse(usernamePasswordToken0.isRememberMe());
      
      usernamePasswordToken0.setRememberMe(false);
      assertNull(usernamePasswordToken0.getUsername());
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.toString()Ljava/lang/String;: I43 Branch 7 IFNULL L363 - false
   */

  @Test
  public void test05()  throws Throwable  {
      Inet4Address inet4Address0 = (Inet4Address)MockInetAddress.getLoopbackAddress();
      assertNotNull(inet4Address0);
      assertFalse(inet4Address0.isMCNodeLocal());
      assertEquals("/127.0.0.1", inet4Address0.toString());
      assertTrue(inet4Address0.isLoopbackAddress());
      assertFalse(inet4Address0.isMulticastAddress());
      assertFalse(inet4Address0.isMCGlobal());
      assertFalse(inet4Address0.isAnyLocalAddress());
      assertFalse(inet4Address0.isLinkLocalAddress());
      assertFalse(inet4Address0.isMCLinkLocal());
      assertFalse(inet4Address0.isMCOrgLocal());
      assertEquals("127.0.0.1", inet4Address0.getHostAddress());
      assertFalse(inet4Address0.isSiteLocalAddress());
      assertFalse(inet4Address0.isMCSiteLocal());
      
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("] d|F?G-OW qso @", "] d|F?G-OW qso @", true, (InetAddress) inet4Address0);
      assertNotNull(usernamePasswordToken0);
      assertFalse(inet4Address0.isMCNodeLocal());
      assertEquals("/127.0.0.1", inet4Address0.toString());
      assertTrue(inet4Address0.isLoopbackAddress());
      assertFalse(inet4Address0.isMulticastAddress());
      assertFalse(inet4Address0.isMCGlobal());
      assertFalse(inet4Address0.isAnyLocalAddress());
      assertFalse(inet4Address0.isLinkLocalAddress());
      assertFalse(inet4Address0.isMCLinkLocal());
      assertFalse(inet4Address0.isMCOrgLocal());
      assertEquals("127.0.0.1", inet4Address0.getHostAddress());
      assertFalse(inet4Address0.isSiteLocalAddress());
      assertFalse(inet4Address0.isMCSiteLocal());
      assertEquals("] d|F?G-OW qso @", usernamePasswordToken0.getUsername());
      assertTrue(usernamePasswordToken0.isRememberMe());
      
      String string0 = usernamePasswordToken0.toString();
      assertNotNull(string0);
      assertFalse(inet4Address0.isMCNodeLocal());
      assertEquals("/127.0.0.1", inet4Address0.toString());
      assertTrue(inet4Address0.isLoopbackAddress());
      assertFalse(inet4Address0.isMulticastAddress());
      assertFalse(inet4Address0.isMCGlobal());
      assertFalse(inet4Address0.isAnyLocalAddress());
      assertFalse(inet4Address0.isLinkLocalAddress());
      assertFalse(inet4Address0.isMCLinkLocal());
      assertFalse(inet4Address0.isMCOrgLocal());
      assertEquals("127.0.0.1", inet4Address0.getHostAddress());
      assertFalse(inet4Address0.isSiteLocalAddress());
      assertFalse(inet4Address0.isMCSiteLocal());
      assertEquals("] d|F?G-OW qso @", usernamePasswordToken0.getUsername());
      assertTrue(usernamePasswordToken0.isRememberMe());
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - ] d|F?G-OW qso @, rememberMe=true (/127.0.0.1)", string0);
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.isRememberMe()Z: root-Branch
   */

  @Test
  public void test06()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      assertNotNull(usernamePasswordToken0);
      assertFalse(usernamePasswordToken0.isRememberMe());
      assertNull(usernamePasswordToken0.getUsername());
      
      boolean boolean0 = usernamePasswordToken0.isRememberMe();
      assertFalse(usernamePasswordToken0.isRememberMe());
      assertNull(usernamePasswordToken0.getUsername());
      assertFalse(boolean0);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.setUsername(Ljava/lang/String;)V: root-Branch
   */

  @Test
  public void test07()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken(" - ", " - ");
      assertNotNull(usernamePasswordToken0);
      assertEquals(" - ", usernamePasswordToken0.getUsername());
      assertFalse(usernamePasswordToken0.isRememberMe());
      
      usernamePasswordToken0.setUsername(" - ");
      assertEquals(" - ", usernamePasswordToken0.getUsername());
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  //Test case number: 8
  /*
   * 2 covered goals:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.getPrincipal()Ljava/lang/Object;: root-Branch
   * Goal 2. org.jsecurity.authc.UsernamePasswordToken.getUsername()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test08()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken(" - ", " - ");
      assertNotNull(usernamePasswordToken0);
      assertEquals(" - ", usernamePasswordToken0.getUsername());
      assertFalse(usernamePasswordToken0.isRememberMe());
      
      String string0 = (String)usernamePasswordToken0.getPrincipal();
      assertNotNull(string0);
      assertEquals(" - ", usernamePasswordToken0.getUsername());
      assertFalse(usernamePasswordToken0.isRememberMe());
      assertEquals(" - ", string0);
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.getInetAddress()Ljava/net/InetAddress;: root-Branch
   */

  @Test
  public void test09()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      assertNotNull(usernamePasswordToken0);
      assertNull(usernamePasswordToken0.getUsername());
      assertFalse(usernamePasswordToken0.isRememberMe());
      
      InetAddress inetAddress0 = usernamePasswordToken0.getInetAddress();
      assertNull(inetAddress0);
      assertNull(usernamePasswordToken0.getUsername());
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  //Test case number: 10
  /*
   * 3 covered goals:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.clear()V: I22 Branch 5 IFNULL L340 - false
   * Goal 2. org.jsecurity.authc.UsernamePasswordToken.clear()V: I35 Branch 6 IF_ICMPGE L341 - true
   * Goal 3. org.jsecurity.authc.UsernamePasswordToken.clear()V: I35 Branch 6 IF_ICMPGE L341 - false
   */

  @Test
  public void test10()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("#T%  ^", "#T%  ^");
      assertNotNull(usernamePasswordToken0);
      assertFalse(usernamePasswordToken0.isRememberMe());
      assertEquals("#T%  ^", usernamePasswordToken0.getUsername());
      
      usernamePasswordToken0.clear();
      assertNull(usernamePasswordToken0.getUsername());
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.setPassword([C)V: root-Branch
   */

  @Test
  public void test11()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      assertNotNull(usernamePasswordToken0);
      assertNull(usernamePasswordToken0.getUsername());
      assertFalse(usernamePasswordToken0.isRememberMe());
      
      char[] charArray0 = new char[1];
      usernamePasswordToken0.setPassword(charArray0);
      assertNull(usernamePasswordToken0.getUsername());
      assertFalse(usernamePasswordToken0.isRememberMe());
      assertArrayEquals(new char[] {'\u0000'}, charArray0);
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.<init>(Ljava/lang/String;[CZ)V: root-Branch
   */

  @Test
  public void test12()  throws Throwable  {
      char[] charArray0 = new char[2];
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("yT5 & ", charArray0, false);
      assertNotNull(usernamePasswordToken0);
      assertFalse(usernamePasswordToken0.isRememberMe());
      assertEquals("yT5 & ", usernamePasswordToken0.getUsername());
      assertArrayEquals(new char[] {'\u0000', '\u0000'}, charArray0);
  }

  //Test case number: 13
  /*
   * 2 covered goals:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.<init>(Ljava/lang/String;[CZLjava/net/InetAddress;)V: root-Branch
   * Goal 2. org.jsecurity.authc.UsernamePasswordToken.toString()Ljava/lang/String;: I43 Branch 7 IFNULL L363 - true
   */

  @Test
  public void test13()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken(" - ", " - ");
      assertNotNull(usernamePasswordToken0);
      assertEquals(" - ", usernamePasswordToken0.getUsername());
      assertFalse(usernamePasswordToken0.isRememberMe());
      
      String string0 = usernamePasswordToken0.toString();
      assertNotNull(string0);
      assertEquals(" - ", usernamePasswordToken0.getUsername());
      assertFalse(usernamePasswordToken0.isRememberMe());
      assertEquals("org.jsecurity.authc.UsernamePasswordToken -  - , rememberMe=false", string0);
  }

  //Test case number: 14
  /*
   * 3 covered goals:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.<init>()V: root-Branch
   * Goal 2. org.jsecurity.authc.UsernamePasswordToken.getPassword()[C: root-Branch
   * Goal 3. org.jsecurity.authc.UsernamePasswordToken.getCredentials()Ljava/lang/Object;: root-Branch
   */

  @Test
  public void test14()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      assertNotNull(usernamePasswordToken0);
      assertFalse(usernamePasswordToken0.isRememberMe());
      assertNull(usernamePasswordToken0.getUsername());
      
      Object object0 = usernamePasswordToken0.getCredentials();
      assertNull(object0);
      assertFalse(usernamePasswordToken0.isRememberMe());
      assertNull(usernamePasswordToken0.getUsername());
  }
}

/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 16 17:35:18 GMT 2015
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
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.toString()Ljava/lang/String;: I43 Branch 7 IFNULL L363 - false
   */

  @Test
  public void test00()  throws Throwable  {
      Inet4Address inet4Address0 = (Inet4Address)MockInetAddress.getByName("gG0'G/((vdxtYn6QD");
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("gG0'G/((vdxtYn6QD", "gG0'G/((vdxtYn6QD", true, (InetAddress) inet4Address0);
      String string0 = usernamePasswordToken0.toString();
      assertTrue(usernamePasswordToken0.isRememberMe());
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - gG0'G/((vdxtYn6QD, rememberMe=true (gG0'G/((vdxtYn6QD/200.42.42.0)", string0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.toString()Ljava/lang/String;: I43 Branch 7 IFNULL L363 - true
   */

  @Test
  public void test01()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      String string0 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - null, rememberMe=false", string0);
  }

  //Test case number: 2
  /*
   * 3 covered goals:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.clear()V: I22 Branch 5 IFNULL L340 - false
   * Goal 2. org.jsecurity.authc.UsernamePasswordToken.clear()V: I35 Branch 6 IF_ICMPGE L341 - true
   * Goal 3. org.jsecurity.authc.UsernamePasswordToken.clear()V: I35 Branch 6 IF_ICMPGE L341 - false
   */

  @Test
  public void test02()  throws Throwable  {
      Inet4Address inet4Address0 = (Inet4Address)MockInetAddress.anyLocalAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken((String) null, "C8=,O", (InetAddress) inet4Address0);
      usernamePasswordToken0.clear();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.clear()V: I22 Branch 5 IFNULL L340 - true
   */

  @Test
  public void test03()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      usernamePasswordToken0.clear();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.isRememberMe()Z: root-Branch
   */

  @Test
  public void test04()  throws Throwable  {
      Inet4Address inet4Address0 = (Inet4Address)MockInetAddress.anyLocalAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken((String) null, "C8=,O", (InetAddress) inet4Address0);
      boolean boolean0 = usernamePasswordToken0.isRememberMe();
      assertFalse(boolean0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.<init>(Ljava/lang/String;[CZ)V: root-Branch
   */

  @Test
  public void test05()  throws Throwable  {
      char[] charArray0 = new char[8];
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", charArray0, true);
      assertTrue(usernamePasswordToken0.isRememberMe());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.<init>(Ljava/lang/String;[C)V: root-Branch
   */

  @Test
  public void test06()  throws Throwable  {
      char[] charArray0 = new char[3];
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("M'[{&8Q#?Z*E3nKr>h", charArray0);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.getInetAddress()Ljava/net/InetAddress;: root-Branch
   */

  @Test
  public void test07()  throws Throwable  {
      Inet4Address inet4Address0 = (Inet4Address)MockInetAddress.anyLocalAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken((String) null, "C8=,O", (InetAddress) inet4Address0);
      Inet4Address inet4Address1 = (Inet4Address)usernamePasswordToken0.getInetAddress();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.setUsername(Ljava/lang/String;)V: root-Branch
   */

  @Test
  public void test08()  throws Throwable  {
      Inet4Address inet4Address0 = (Inet4Address)MockInetAddress.anyLocalAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken((String) null, "C8=,O", (InetAddress) inet4Address0);
      usernamePasswordToken0.setUsername(", rememberMe=");
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.setPassword([C)V: root-Branch
   */

  @Test
  public void test09()  throws Throwable  {
      char[] charArray0 = new char[8];
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "%mg>zi^S@7<V_j9 hm", false);
      usernamePasswordToken0.setPassword(charArray0);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  //Test case number: 10
  /*
   * 2 covered goals:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.getPassword()[C: root-Branch
   * Goal 2. org.jsecurity.authc.UsernamePasswordToken.getCredentials()Ljava/lang/Object;: root-Branch
   */

  @Test
  public void test10()  throws Throwable  {
      Inet4Address inet4Address0 = (Inet4Address)MockInetAddress.anyLocalAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken((String) null, "C8=,O", (InetAddress) inet4Address0);
      Object object0 = usernamePasswordToken0.getCredentials();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  //Test case number: 11
  /*
   * 3 covered goals:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.<init>(Ljava/lang/String;[CLjava/net/InetAddress;)V: root-Branch
   * Goal 2. org.jsecurity.authc.UsernamePasswordToken.getPrincipal()Ljava/lang/Object;: root-Branch
   * Goal 3. org.jsecurity.authc.UsernamePasswordToken.getUsername()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test11()  throws Throwable  {
      char[] charArray0 = new char[5];
      Inet4Address inet4Address0 = (Inet4Address)MockInetAddress.getByName((String) null);
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken((String) null, charArray0, (InetAddress) inet4Address0);
      Object object0 = usernamePasswordToken0.getPrincipal();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  //Test case number: 12
  /*
   * 2 covered goals:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.setInetAddress(Ljava/net/InetAddress;)V: root-Branch
   * Goal 2. org.jsecurity.authc.UsernamePasswordToken.<init>()V: root-Branch
   */

  @Test
  public void test12()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      usernamePasswordToken0.setInetAddress((InetAddress) null);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }

  //Test case number: 13
  /*
   * 2 covered goals:
   * Goal 1. org.jsecurity.authc.UsernamePasswordToken.setRememberMe(Z)V: root-Branch
   * Goal 2. org.jsecurity.authc.UsernamePasswordToken.<init>(Ljava/lang/String;[CZLjava/net/InetAddress;)V: root-Branch
   */

  @Test
  public void test13()  throws Throwable  {
      Inet4Address inet4Address0 = (Inet4Address)MockInetAddress.anyLocalAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken((String) null, "C8=,O", (InetAddress) inet4Address0);
      usernamePasswordToken0.setRememberMe(false);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }
}

/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 16 14:33:06 GMT 2015
 */

package org.quickserver.net.server;

import static org.junit.Assert.*;
import org.junit.Test;
import java.net.Socket;
import java.nio.channels.SocketChannel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.junit.runner.RunWith;
import org.quickserver.net.qsadmin.Data;
import org.quickserver.net.server.Authenticator;
import org.quickserver.net.server.ClientAuthenticationHandler;
import org.quickserver.net.server.ClientBinaryHandler;
import org.quickserver.net.server.ClientCommandHandler;
import org.quickserver.net.server.ClientData;
import org.quickserver.net.server.ClientEvent;
import org.quickserver.net.server.ClientEventHandler;
import org.quickserver.net.server.ClientExtendedEventHandler;
import org.quickserver.net.server.ClientObjectHandler;
import org.quickserver.net.server.ClientWriteHandler;
import org.quickserver.net.server.QuickServer;
import org.quickserver.net.server.TheClient;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class TheClient_ESTest extends TheClient_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.net.server.TheClient.toString()Ljava/lang/String;: I19 Branch 1 IFNULL L396 - true
   */

  @Test
  public void test00()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      String string0 = theClient0.toString();
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", string0);
      assertFalse(theClient0.getTrusted());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.net.server.TheClient.getClientObjectHandler()Lorg/quickserver/net/server/ClientObjectHandler;: root-Branch
   */

  @Test
  public void test01()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      ClientObjectHandler clientObjectHandler0 = theClient0.getClientObjectHandler();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.net.server.TheClient.getMaxAuthTryMsg()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test02()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      String string0 = theClient0.getMaxAuthTryMsg();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.net.server.TheClient.setMaxAuthTry(I)V: root-Branch
   */

  @Test
  public void test03()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxAuthTry((-1319));
      assertEquals(-1319, theClient0.getMaxAuthTry());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.net.server.TheClient.setClientCommandHandler(Lorg/quickserver/net/server/ClientCommandHandler;)V: root-Branch
   */

  @Test
  public void test04()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setClientCommandHandler((ClientCommandHandler) null);
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.net.server.TheClient.getTimeoutMsg()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test05()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      String string0 = theClient0.getTimeoutMsg();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.net.server.TheClient.setClientBinaryHandler(Lorg/quickserver/net/server/ClientBinaryHandler;)V: root-Branch
   */

  @Test
  public void test06()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setClientBinaryHandler((ClientBinaryHandler) null);
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.net.server.TheClient.getSocket()Ljava/net/Socket;: root-Branch
   */

  @Test
  public void test07()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      Socket socket0 = theClient0.getSocket();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.net.server.TheClient.getMaxAuthTry()I: root-Branch
   */

  @Test
  public void test08()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      int int0 = theClient0.getMaxAuthTry();
      assertEquals(0, int0);
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.net.server.TheClient.setTimeout(I)V: root-Branch
   */

  @Test
  public void test09()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setTimeout(4463);
      assertEquals(4463, theClient0.getTimeout());
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.net.server.TheClient.setClientObjectHandler(Lorg/quickserver/net/server/ClientObjectHandler;)V: root-Branch
   */

  @Test
  public void test10()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.net.server.TheClient.getServer()Lorg/quickserver/net/server/QuickServer;: root-Branch
   */

  @Test
  public void test11()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      QuickServer quickServer0 = theClient0.getServer();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.net.server.TheClient.getAuthenticator()Lorg/quickserver/net/server/Authenticator;: root-Branch
   */

  @Test
  public void test12()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      Authenticator authenticator0 = theClient0.getAuthenticator();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.net.server.TheClient.getTimeout()I: root-Branch
   */

  @Test
  public void test13()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      int int0 = theClient0.getTimeout();
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals(0, int0);
      assertFalse(theClient0.getTrusted());
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.net.server.TheClient.setMaxAuthTryMsg(Ljava/lang/String;)V: root-Branch
   */

  @Test
  public void test14()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxAuthTryMsg("-eh1T.=\"mJ/z");
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.net.server.TheClient.setMaxConnectionMsg(Ljava/lang/String;)V: root-Branch
   */

  @Test
  public void test15()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxConnectionMsg("IjQT_");
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.net.server.TheClient.getClientExtendedEventHandler()Lorg/quickserver/net/server/ClientExtendedEventHandler;: root-Branch
   */

  @Test
  public void test16()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      ClientExtendedEventHandler clientExtendedEventHandler0 = theClient0.getClientExtendedEventHandler();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.net.server.TheClient.getClientWriteHandler()Lorg/quickserver/net/server/ClientWriteHandler;: root-Branch
   */

  @Test
  public void test17()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      ClientWriteHandler clientWriteHandler0 = theClient0.getClientWriteHandler();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.net.server.TheClient.getMaxConnectionMsg()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test18()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      String string0 = theClient0.getMaxConnectionMsg();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.net.server.TheClient.getClientData()Lorg/quickserver/net/server/ClientData;: root-Branch
   */

  @Test
  public void test19()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      ClientData clientData0 = theClient0.getClientData();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.net.server.TheClient.setClientWriteHandler(Lorg/quickserver/net/server/ClientWriteHandler;)V: root-Branch
   */

  @Test
  public void test20()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setClientWriteHandler((ClientWriteHandler) null);
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  //Test case number: 21
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.net.server.TheClient.getClientAuthenticationHandler()Lorg/quickserver/net/server/ClientAuthenticationHandler;: root-Branch
   */

  @Test
  public void test21()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      ClientAuthenticationHandler clientAuthenticationHandler0 = theClient0.getClientAuthenticationHandler();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  //Test case number: 22
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.net.server.TheClient.getClientBinaryHandler()Lorg/quickserver/net/server/ClientBinaryHandler;: root-Branch
   */

  @Test
  public void test22()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      ClientBinaryHandler clientBinaryHandler0 = theClient0.getClientBinaryHandler();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  //Test case number: 23
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.net.server.TheClient.setClientData(Lorg/quickserver/net/server/ClientData;)V: root-Branch
   */

  @Test
  public void test23()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      Data data0 = new Data();
      theClient0.setClientData((ClientData) data0);
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  //Test case number: 24
  /*
   * 2 covered goals:
   * Goal 1. org.quickserver.net.server.TheClient.setSocket(Ljava/net/Socket;)V: root-Branch
   * Goal 2. org.quickserver.net.server.TheClient.toString()Ljava/lang/String;: I19 Branch 1 IFNULL L396 - false
   */

  @Test
  public void test24()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      MockSocket mockSocket0 = new MockSocket();
      theClient0.setSocket((Socket) mockSocket0);
      String string0 = theClient0.toString();
      assertFalse(theClient0.getTrusted());
      assertEquals("{TheClient Socket[unconnected], Event: (ClientEvent-Run Blocking)}", string0);
      assertTrue(theClient0.getCommunicationLogging());
  }

  //Test case number: 25
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.net.server.TheClient.getClientEventHandler()Lorg/quickserver/net/server/ClientEventHandler;: root-Branch
   */

  @Test
  public void test25()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      ClientEventHandler clientEventHandler0 = theClient0.getClientEventHandler();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  //Test case number: 26
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.net.server.TheClient.setAuthenticator(Lorg/quickserver/net/server/Authenticator;)V: root-Branch
   */

  @Test
  public void test26()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setAuthenticator((Authenticator) null);
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  //Test case number: 27
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.net.server.TheClient.getSocketChannel()Ljava/nio/channels/SocketChannel;: root-Branch
   */

  @Test
  public void test27()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      SocketChannel socketChannel0 = theClient0.getSocketChannel();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  //Test case number: 28
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.net.server.TheClient.setSocketChannel(Ljava/nio/channels/SocketChannel;)V: root-Branch
   */

  @Test
  public void test28()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setSocketChannel((SocketChannel) null);
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  //Test case number: 29
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.net.server.TheClient.setCommunicationLogging(Z)V: root-Branch
   */

  @Test
  public void test29()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setCommunicationLogging(true);
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  //Test case number: 30
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.net.server.TheClient.getCommunicationLogging()Z: root-Branch
   */

  @Test
  public void test30()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      boolean boolean0 = theClient0.getCommunicationLogging();
      assertFalse(theClient0.getTrusted());
      assertTrue(boolean0);
  }

  //Test case number: 31
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.net.server.TheClient.setClientAuthenticationHandler(Lorg/quickserver/net/server/ClientAuthenticationHandler;)V: root-Branch
   */

  @Test
  public void test31()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      org.quickserver.net.qsadmin.Authenticator authenticator0 = new org.quickserver.net.qsadmin.Authenticator();
      theClient0.setClientAuthenticationHandler((ClientAuthenticationHandler) authenticator0);
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  //Test case number: 32
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.net.server.TheClient.setTimeoutMsg(Ljava/lang/String;)V: root-Branch
   */

  @Test
  public void test32()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setTimeoutMsg("IjQT_");
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  //Test case number: 33
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.net.server.TheClient.setServer(Lorg/quickserver/net/server/QuickServer;)V: root-Branch
   */

  @Test
  public void test33()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      QuickServer quickServer0 = new QuickServer();
      theClient0.setServer(quickServer0);
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  //Test case number: 34
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.net.server.TheClient.getTrusted()Z: root-Branch
   */

  @Test
  public void test34()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      boolean boolean0 = theClient0.getTrusted();
      assertFalse(boolean0);
      assertTrue(theClient0.getCommunicationLogging());
  }

  //Test case number: 35
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.net.server.TheClient.setClientExtendedEventHandler(Lorg/quickserver/net/server/ClientExtendedEventHandler;)V: root-Branch
   */

  @Test
  public void test35()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  //Test case number: 36
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.net.server.TheClient.getClientCommandHandler()Lorg/quickserver/net/server/ClientCommandHandler;: root-Branch
   */

  @Test
  public void test36()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      ClientCommandHandler clientCommandHandler0 = theClient0.getClientCommandHandler();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  //Test case number: 37
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.net.server.TheClient.setTrusted(Z)V: root-Branch
   */

  @Test
  public void test37()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      assertFalse(theClient0.getTrusted());
      
      theClient0.setTrusted(true);
      assertTrue(theClient0.getTrusted());
  }

  //Test case number: 38
  /*
   * 2 covered goals:
   * Goal 1. org.quickserver.net.server.TheClient.setClientEvent(Lorg/quickserver/net/server/ClientEvent;)V: root-Branch
   * Goal 2. org.quickserver.net.server.TheClient.getClientEvent()Lorg/quickserver/net/server/ClientEvent;: root-Branch
   */

  @Test
  public void test38()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      ClientEvent clientEvent0 = theClient0.getClientEvent();
      theClient0.setClientEvent(clientEvent0);
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  //Test case number: 39
  /*
   * 2 covered goals:
   * Goal 1. org.quickserver.net.server.TheClient.setClientEventHandler(Lorg/quickserver/net/server/ClientEventHandler;)V: root-Branch
   * Goal 2. org.quickserver.net.server.TheClient.<init>()V: root-Branch
   */

  @Test
  public void test39()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setClientEventHandler((ClientEventHandler) null);
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }
}

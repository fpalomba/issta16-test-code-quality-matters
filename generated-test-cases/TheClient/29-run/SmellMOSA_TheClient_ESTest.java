/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 16 14:18:51 GMT 2015
 */

package org.quickserver.net.server;

import static org.junit.Assert.*;
import org.junit.Test;
import java.net.Proxy;
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
   * Goal 1. org.quickserver.net.server.TheClient.getSocketChannel()Ljava/nio/channels/SocketChannel;: root-Branch
   */

  @Test
  public void test00()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      assertEquals(0, theClient0.getMaxAuthTry());
      assertFalse(theClient0.getTrusted());
      assertNull(theClient0.getMaxConnectionMsg());
      assertEquals(0, theClient0.getTimeout());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertTrue(theClient0.getCommunicationLogging());
      assertNull(theClient0.getTimeoutMsg());
      assertNotNull(theClient0);
      
      SocketChannel socketChannel0 = theClient0.getSocketChannel();
      assertEquals(0, theClient0.getMaxAuthTry());
      assertFalse(theClient0.getTrusted());
      assertNull(theClient0.getMaxConnectionMsg());
      assertEquals(0, theClient0.getTimeout());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertTrue(theClient0.getCommunicationLogging());
      assertNull(theClient0.getTimeoutMsg());
      assertNull(socketChannel0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.net.server.TheClient.setCommunicationLogging(Z)V: root-Branch
   */

  @Test
  public void test01()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      assertNull(theClient0.getTimeoutMsg());
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals(0, theClient0.getTimeout());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertFalse(theClient0.getTrusted());
      assertNull(theClient0.getMaxConnectionMsg());
      assertNotNull(theClient0);
      
      theClient0.setCommunicationLogging(true);
      assertNull(theClient0.getTimeoutMsg());
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals(0, theClient0.getTimeout());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertFalse(theClient0.getTrusted());
      assertNull(theClient0.getMaxConnectionMsg());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.net.server.TheClient.setTimeoutMsg(Ljava/lang/String;)V: root-Branch
   */

  @Test
  public void test02()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      assertNull(theClient0.getTimeoutMsg());
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertEquals(0, theClient0.getTimeout());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertFalse(theClient0.getTrusted());
      assertNull(theClient0.getMaxConnectionMsg());
      assertNotNull(theClient0);
      
      theClient0.setTimeoutMsg(", Event: ");
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals(", Event: ", theClient0.getTimeoutMsg());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertEquals(0, theClient0.getTimeout());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertFalse(theClient0.getTrusted());
      assertNull(theClient0.getMaxConnectionMsg());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.net.server.TheClient.getCommunicationLogging()Z: root-Branch
   */

  @Test
  public void test03()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      assertNull(theClient0.getTimeoutMsg());
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals(0, theClient0.getTimeout());
      assertNull(theClient0.getMaxConnectionMsg());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertFalse(theClient0.getTrusted());
      assertNotNull(theClient0);
      
      boolean boolean0 = theClient0.getCommunicationLogging();
      assertTrue(boolean0);
      assertNull(theClient0.getTimeoutMsg());
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals(0, theClient0.getTimeout());
      assertNull(theClient0.getMaxConnectionMsg());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertFalse(theClient0.getTrusted());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.net.server.TheClient.setSocketChannel(Ljava/nio/channels/SocketChannel;)V: root-Branch
   */

  @Test
  public void test04()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals(0, theClient0.getTimeout());
      assertNull(theClient0.getMaxConnectionMsg());
      assertNull(theClient0.getTimeoutMsg());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertFalse(theClient0.getTrusted());
      assertNotNull(theClient0);
      
      SocketChannel socketChannel0 = SocketChannel.open();
      assertEquals(13, socketChannel0.validOps());
      assertFalse(socketChannel0.isConnectionPending());
      assertFalse(socketChannel0.isRegistered());
      assertFalse(socketChannel0.isConnected());
      assertTrue(socketChannel0.isOpen());
      assertTrue(socketChannel0.isBlocking());
      assertNotNull(socketChannel0);
      
      theClient0.setSocketChannel(socketChannel0);
      assertEquals(13, socketChannel0.validOps());
      assertFalse(socketChannel0.isConnectionPending());
      assertFalse(socketChannel0.isRegistered());
      assertFalse(socketChannel0.isConnected());
      assertTrue(socketChannel0.isOpen());
      assertTrue(socketChannel0.isBlocking());
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals(0, theClient0.getTimeout());
      assertNull(theClient0.getMaxConnectionMsg());
      assertNull(theClient0.getTimeoutMsg());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertFalse(theClient0.getTrusted());
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * Goal 1. org.quickserver.net.server.TheClient.setTrusted(Z)V: root-Branch
   * Goal 2. org.quickserver.net.server.TheClient.getTimeout()I: root-Branch
   */

  @Test
  public void test05()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      assertEquals(0, theClient0.getTimeout());
      assertTrue(theClient0.getCommunicationLogging());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertFalse(theClient0.getTrusted());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertNull(theClient0.getTimeoutMsg());
      assertNull(theClient0.getMaxConnectionMsg());
      assertNotNull(theClient0);
      
      int int0 = theClient0.getTimeout();
      assertEquals(0, int0);
      assertEquals(0, theClient0.getTimeout());
      assertTrue(theClient0.getCommunicationLogging());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertFalse(theClient0.getTrusted());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertNull(theClient0.getTimeoutMsg());
      assertNull(theClient0.getMaxConnectionMsg());
      
      theClient0.setTrusted(true);
      assertEquals(0, theClient0.getTimeout());
      assertTrue(theClient0.getCommunicationLogging());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertTrue(theClient0.getTrusted());
      assertNull(theClient0.getTimeoutMsg());
      assertNull(theClient0.getMaxConnectionMsg());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.net.server.TheClient.getSocket()Ljava/net/Socket;: root-Branch
   */

  @Test
  public void test06()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      assertNull(theClient0.getTimeoutMsg());
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals(0, theClient0.getTimeout());
      assertFalse(theClient0.getTrusted());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertNull(theClient0.getMaxConnectionMsg());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertNotNull(theClient0);
      
      Socket socket0 = theClient0.getSocket();
      assertNull(theClient0.getTimeoutMsg());
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals(0, theClient0.getTimeout());
      assertFalse(theClient0.getTrusted());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertNull(theClient0.getMaxConnectionMsg());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertNull(socket0);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.net.server.TheClient.setTimeout(I)V: root-Branch
   */

  @Test
  public void test07()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      assertNull(theClient0.getTimeoutMsg());
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals(0, theClient0.getTimeout());
      assertFalse(theClient0.getTrusted());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertNull(theClient0.getMaxConnectionMsg());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertNotNull(theClient0);
      
      theClient0.setTimeout(1);
      assertNull(theClient0.getTimeoutMsg());
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals(1, theClient0.getTimeout());
      assertFalse(theClient0.getTrusted());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertNull(theClient0.getMaxConnectionMsg());
      assertNull(theClient0.getMaxAuthTryMsg());
  }

  //Test case number: 8
  /*
   * 2 covered goals:
   * Goal 1. org.quickserver.net.server.TheClient.getTrusted()Z: root-Branch
   * Goal 2. org.quickserver.net.server.TheClient.getMaxConnectionMsg()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test08()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      assertNull(theClient0.getMaxAuthTryMsg());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertNull(theClient0.getMaxConnectionMsg());
      assertFalse(theClient0.getTrusted());
      assertNull(theClient0.getTimeoutMsg());
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals(0, theClient0.getTimeout());
      assertNotNull(theClient0);
      
      boolean boolean0 = theClient0.getTrusted();
      assertFalse(boolean0);
      assertNull(theClient0.getMaxAuthTryMsg());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertNull(theClient0.getMaxConnectionMsg());
      assertFalse(theClient0.getTrusted());
      assertNull(theClient0.getTimeoutMsg());
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals(0, theClient0.getTimeout());
      
      String string0 = theClient0.getMaxConnectionMsg();
      assertNull(theClient0.getMaxAuthTryMsg());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertNull(theClient0.getMaxConnectionMsg());
      assertFalse(theClient0.getTrusted());
      assertNull(theClient0.getTimeoutMsg());
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals(0, theClient0.getTimeout());
      assertNull(string0);
  }

  //Test case number: 9
  /*
   * 3 covered goals:
   * Goal 1. org.quickserver.net.server.TheClient.setClientData(Lorg/quickserver/net/server/ClientData;)V: root-Branch
   * Goal 2. org.quickserver.net.server.TheClient.getClientEvent()Lorg/quickserver/net/server/ClientEvent;: root-Branch
   * Goal 3. org.quickserver.net.server.TheClient.getTimeoutMsg()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test09()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertNull(theClient0.getMaxConnectionMsg());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertNull(theClient0.getTimeoutMsg());
      assertEquals(0, theClient0.getTimeout());
      assertNotNull(theClient0);
      
      String string0 = theClient0.getTimeoutMsg();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertNull(theClient0.getMaxConnectionMsg());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertNull(theClient0.getTimeoutMsg());
      assertEquals(0, theClient0.getTimeout());
      assertNull(string0);
      
      theClient0.setClientData((ClientData) null);
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertNull(theClient0.getMaxConnectionMsg());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertNull(theClient0.getTimeoutMsg());
      assertEquals(0, theClient0.getTimeout());
      
      ClientEvent clientEvent0 = theClient0.getClientEvent();
      assertEquals("(ClientEvent-Run Blocking)", clientEvent0.toString());
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertNull(theClient0.getMaxConnectionMsg());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertNull(theClient0.getTimeoutMsg());
      assertEquals(0, theClient0.getTimeout());
      assertNotNull(clientEvent0);
  }

  //Test case number: 10
  /*
   * 2 covered goals:
   * Goal 1. org.quickserver.net.server.TheClient.setSocket(Ljava/net/Socket;)V: root-Branch
   * Goal 2. org.quickserver.net.server.TheClient.toString()Ljava/lang/String;: I19 Branch 1 IFNULL L396 - false
   */

  @Test
  public void test10()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      assertNull(theClient0.getTimeoutMsg());
      assertEquals(0, theClient0.getTimeout());
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertFalse(theClient0.getTrusted());
      assertNull(theClient0.getMaxConnectionMsg());
      assertNotNull(theClient0);
      
      Proxy proxy0 = Proxy.NO_PROXY;
      assertEquals(Proxy.Type.DIRECT, proxy0.type());
      assertEquals("DIRECT", proxy0.toString());
      assertNotNull(proxy0);
      
      MockSocket mockSocket0 = new MockSocket(proxy0);
      assertEquals(Proxy.Type.DIRECT, proxy0.type());
      assertEquals("DIRECT", proxy0.toString());
      assertEquals("Socket[unconnected]", mockSocket0.toString());
      assertFalse(mockSocket0.isInputShutdown());
      assertFalse(mockSocket0.isOutputShutdown());
      assertFalse(mockSocket0.isBound());
      assertFalse(mockSocket0.isClosed());
      assertFalse(mockSocket0.isConnected());
      assertNotNull(mockSocket0);
      
      theClient0.setSocket((Socket) mockSocket0);
      assertNull(theClient0.getTimeoutMsg());
      assertEquals(0, theClient0.getTimeout());
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertFalse(theClient0.getTrusted());
      assertNull(theClient0.getMaxConnectionMsg());
      assertEquals(Proxy.Type.DIRECT, proxy0.type());
      assertEquals("DIRECT", proxy0.toString());
      assertEquals("Socket[unconnected]", mockSocket0.toString());
      assertFalse(mockSocket0.isInputShutdown());
      assertFalse(mockSocket0.isOutputShutdown());
      assertFalse(mockSocket0.isBound());
      assertFalse(mockSocket0.isClosed());
      assertFalse(mockSocket0.isConnected());
      
      String string0 = theClient0.toString();
      assertEquals("{TheClient Socket[unconnected], Event: (ClientEvent-Run Blocking)}", string0);
      assertNull(theClient0.getTimeoutMsg());
      assertEquals(0, theClient0.getTimeout());
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertFalse(theClient0.getTrusted());
      assertNull(theClient0.getMaxConnectionMsg());
      assertNotNull(string0);
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.net.server.TheClient.getMaxAuthTry()I: root-Branch
   */

  @Test
  public void test11()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertFalse(theClient0.getTrusted());
      assertNull(theClient0.getMaxConnectionMsg());
      assertNull(theClient0.getTimeoutMsg());
      assertEquals(0, theClient0.getTimeout());
      assertNotNull(theClient0);
      
      int int0 = theClient0.getMaxAuthTry();
      assertEquals(0, int0);
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertFalse(theClient0.getTrusted());
      assertNull(theClient0.getMaxConnectionMsg());
      assertNull(theClient0.getTimeoutMsg());
      assertEquals(0, theClient0.getTimeout());
  }

  //Test case number: 12
  /*
   * 2 covered goals:
   * Goal 1. org.quickserver.net.server.TheClient.setClientAuthenticationHandler(Lorg/quickserver/net/server/ClientAuthenticationHandler;)V: root-Branch
   * Goal 2. org.quickserver.net.server.TheClient.setMaxAuthTry(I)V: root-Branch
   */

  @Test
  public void test12()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      assertFalse(theClient0.getTrusted());
      assertEquals(0, theClient0.getTimeout());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertNull(theClient0.getMaxConnectionMsg());
      assertNull(theClient0.getTimeoutMsg());
      assertTrue(theClient0.getCommunicationLogging());
      assertNotNull(theClient0);
      
      org.quickserver.net.qsadmin.Authenticator authenticator0 = new org.quickserver.net.qsadmin.Authenticator();
      assertNotNull(authenticator0);
      
      theClient0.setClientAuthenticationHandler((ClientAuthenticationHandler) authenticator0);
      assertFalse(theClient0.getTrusted());
      assertEquals(0, theClient0.getTimeout());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertNull(theClient0.getMaxConnectionMsg());
      assertNull(theClient0.getTimeoutMsg());
      assertTrue(theClient0.getCommunicationLogging());
      
      theClient0.setMaxAuthTry((-773));
      assertFalse(theClient0.getTrusted());
      assertEquals(0, theClient0.getTimeout());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertNull(theClient0.getMaxConnectionMsg());
      assertNull(theClient0.getTimeoutMsg());
      assertEquals(-773, theClient0.getMaxAuthTry());
      assertTrue(theClient0.getCommunicationLogging());
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * Goal 1. org.quickserver.net.server.TheClient.setClientBinaryHandler(Lorg/quickserver/net/server/ClientBinaryHandler;)V: root-Branch
   */

  @Test
  public void test13()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      assertEquals(0, theClient0.getTimeout());
      assertFalse(theClient0.getTrusted());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertNull(theClient0.getTimeoutMsg());
      assertNull(theClient0.getMaxConnectionMsg());
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertNotNull(theClient0);
      
      ClientBinaryHandler clientBinaryHandler0 = theClient0.getClientBinaryHandler();
      assertEquals(0, theClient0.getTimeout());
      assertFalse(theClient0.getTrusted());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertNull(theClient0.getTimeoutMsg());
      assertNull(theClient0.getMaxConnectionMsg());
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertNull(clientBinaryHandler0);
      
      theClient0.setClientBinaryHandler((ClientBinaryHandler) null);
      assertEquals(0, theClient0.getTimeout());
      assertFalse(theClient0.getTrusted());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertNull(theClient0.getTimeoutMsg());
      assertNull(theClient0.getMaxConnectionMsg());
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals(0, theClient0.getMaxAuthTry());
  }

  //Test case number: 14
  /*
   * 4 covered goals:
   * Goal 1. org.quickserver.net.server.TheClient.setServer(Lorg/quickserver/net/server/QuickServer;)V: root-Branch
   * Goal 2. org.quickserver.net.server.TheClient.setMaxConnectionMsg(Ljava/lang/String;)V: root-Branch
   * Goal 3. org.quickserver.net.server.TheClient.setMaxAuthTryMsg(Ljava/lang/String;)V: root-Branch
   * Goal 4. org.quickserver.net.server.TheClient.getMaxAuthTryMsg()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test14()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      assertNull(theClient0.getMaxAuthTryMsg());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertFalse(theClient0.getTrusted());
      assertEquals(0, theClient0.getTimeout());
      assertNull(theClient0.getMaxConnectionMsg());
      assertNull(theClient0.getTimeoutMsg());
      assertTrue(theClient0.getCommunicationLogging());
      assertNotNull(theClient0);
      
      theClient0.setMaxAuthTryMsg("");
      assertEquals("", theClient0.getMaxAuthTryMsg());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertFalse(theClient0.getTrusted());
      assertEquals(0, theClient0.getTimeout());
      assertNull(theClient0.getMaxConnectionMsg());
      assertNull(theClient0.getTimeoutMsg());
      assertTrue(theClient0.getCommunicationLogging());
      
      theClient0.setServer((QuickServer) null);
      assertEquals("", theClient0.getMaxAuthTryMsg());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertFalse(theClient0.getTrusted());
      assertEquals(0, theClient0.getTimeout());
      assertNull(theClient0.getMaxConnectionMsg());
      assertNull(theClient0.getTimeoutMsg());
      assertTrue(theClient0.getCommunicationLogging());
      
      String string0 = theClient0.getMaxAuthTryMsg();
      assertEquals("", string0);
      assertEquals("", theClient0.getMaxAuthTryMsg());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertFalse(theClient0.getTrusted());
      assertEquals(0, theClient0.getTimeout());
      assertNull(theClient0.getMaxConnectionMsg());
      assertNull(theClient0.getTimeoutMsg());
      assertTrue(theClient0.getCommunicationLogging());
      assertNotNull(string0);
      
      theClient0.setMaxConnectionMsg("");
      assertEquals("", theClient0.getMaxAuthTryMsg());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertFalse(theClient0.getTrusted());
      assertEquals(0, theClient0.getTimeout());
      assertEquals("", theClient0.getMaxConnectionMsg());
      assertNull(theClient0.getTimeoutMsg());
      assertTrue(theClient0.getCommunicationLogging());
  }

  //Test case number: 15
  /*
   * 3 covered goals:
   * Goal 1. org.quickserver.net.server.TheClient.setAuthenticator(Lorg/quickserver/net/server/Authenticator;)V: root-Branch
   * Goal 2. org.quickserver.net.server.TheClient.getClientData()Lorg/quickserver/net/server/ClientData;: root-Branch
   * Goal 3. org.quickserver.net.server.TheClient.getAuthenticator()Lorg/quickserver/net/server/Authenticator;: root-Branch
   */

  @Test
  public void test15()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      assertFalse(theClient0.getTrusted());
      assertEquals(0, theClient0.getTimeout());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertNull(theClient0.getTimeoutMsg());
      assertNull(theClient0.getMaxConnectionMsg());
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertNotNull(theClient0);
      
      Authenticator authenticator0 = theClient0.getAuthenticator();
      assertFalse(theClient0.getTrusted());
      assertEquals(0, theClient0.getTimeout());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertNull(theClient0.getTimeoutMsg());
      assertNull(theClient0.getMaxConnectionMsg());
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertNull(authenticator0);
      
      theClient0.setAuthenticator((Authenticator) null);
      assertFalse(theClient0.getTrusted());
      assertEquals(0, theClient0.getTimeout());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertNull(theClient0.getTimeoutMsg());
      assertNull(theClient0.getMaxConnectionMsg());
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals(0, theClient0.getMaxAuthTry());
      
      ClientData clientData0 = theClient0.getClientData();
      assertFalse(theClient0.getTrusted());
      assertEquals(0, theClient0.getTimeout());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertNull(theClient0.getTimeoutMsg());
      assertNull(theClient0.getMaxConnectionMsg());
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertNull(clientData0);
  }

  //Test case number: 16
  /*
   * 9 covered goals:
   * Goal 1. org.quickserver.net.server.TheClient.setClientEventHandler(Lorg/quickserver/net/server/ClientEventHandler;)V: root-Branch
   * Goal 2. org.quickserver.net.server.TheClient.setClientEvent(Lorg/quickserver/net/server/ClientEvent;)V: root-Branch
   * Goal 3. org.quickserver.net.server.TheClient.getClientCommandHandler()Lorg/quickserver/net/server/ClientCommandHandler;: root-Branch
   * Goal 4. org.quickserver.net.server.TheClient.getClientBinaryHandler()Lorg/quickserver/net/server/ClientBinaryHandler;: root-Branch
   * Goal 5. org.quickserver.net.server.TheClient.getClientAuthenticationHandler()Lorg/quickserver/net/server/ClientAuthenticationHandler;: root-Branch
   * Goal 6. org.quickserver.net.server.TheClient.setClientWriteHandler(Lorg/quickserver/net/server/ClientWriteHandler;)V: root-Branch
   * Goal 7. org.quickserver.net.server.TheClient.getClientWriteHandler()Lorg/quickserver/net/server/ClientWriteHandler;: root-Branch
   * Goal 8. org.quickserver.net.server.TheClient.setClientCommandHandler(Lorg/quickserver/net/server/ClientCommandHandler;)V: root-Branch
   * Goal 9. org.quickserver.net.server.TheClient.toString()Ljava/lang/String;: I19 Branch 1 IFNULL L396 - true
   */

  @Test
  public void test16()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      assertNull(theClient0.getTimeoutMsg());
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertFalse(theClient0.getTrusted());
      assertEquals(0, theClient0.getTimeout());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertNull(theClient0.getMaxConnectionMsg());
      assertNotNull(theClient0);
      
      ClientCommandHandler clientCommandHandler0 = theClient0.getClientCommandHandler();
      assertNull(theClient0.getTimeoutMsg());
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertFalse(theClient0.getTrusted());
      assertEquals(0, theClient0.getTimeout());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertNull(theClient0.getMaxConnectionMsg());
      assertNull(clientCommandHandler0);
      
      theClient0.setClientCommandHandler((ClientCommandHandler) null);
      assertNull(theClient0.getTimeoutMsg());
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertFalse(theClient0.getTrusted());
      assertEquals(0, theClient0.getTimeout());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertNull(theClient0.getMaxConnectionMsg());
      
      ClientBinaryHandler clientBinaryHandler0 = theClient0.getClientBinaryHandler();
      assertNull(theClient0.getTimeoutMsg());
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertFalse(theClient0.getTrusted());
      assertEquals(0, theClient0.getTimeout());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertNull(theClient0.getMaxConnectionMsg());
      assertNull(clientBinaryHandler0);
      
      ClientWriteHandler clientWriteHandler0 = theClient0.getClientWriteHandler();
      assertNull(theClient0.getTimeoutMsg());
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertFalse(theClient0.getTrusted());
      assertEquals(0, theClient0.getTimeout());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertNull(theClient0.getMaxConnectionMsg());
      assertNull(clientWriteHandler0);
      
      theClient0.setClientWriteHandler((ClientWriteHandler) null);
      assertNull(theClient0.getTimeoutMsg());
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertFalse(theClient0.getTrusted());
      assertEquals(0, theClient0.getTimeout());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertNull(theClient0.getMaxConnectionMsg());
      
      String string0 = theClient0.toString();
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", string0);
      assertNull(theClient0.getTimeoutMsg());
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertFalse(theClient0.getTrusted());
      assertEquals(0, theClient0.getTimeout());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertNull(theClient0.getMaxConnectionMsg());
      assertNotNull(string0);
      
      ClientEvent clientEvent0 = ClientEvent.RUN_BLOCKING;
      assertEquals("(ClientEvent-Run Blocking)", clientEvent0.toString());
      assertNotNull(clientEvent0);
      
      theClient0.setClientEvent(clientEvent0);
      assertNull(theClient0.getTimeoutMsg());
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertFalse(theClient0.getTrusted());
      assertEquals(0, theClient0.getTimeout());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertNull(theClient0.getMaxConnectionMsg());
      assertEquals("(ClientEvent-Run Blocking)", clientEvent0.toString());
      
      ClientEventHandler clientEventHandler0 = theClient0.getClientEventHandler();
      assertNull(theClient0.getTimeoutMsg());
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertFalse(theClient0.getTrusted());
      assertEquals(0, theClient0.getTimeout());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertNull(theClient0.getMaxConnectionMsg());
      assertNull(clientEventHandler0);
      
      ClientAuthenticationHandler clientAuthenticationHandler0 = theClient0.getClientAuthenticationHandler();
      assertNull(theClient0.getTimeoutMsg());
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertFalse(theClient0.getTrusted());
      assertEquals(0, theClient0.getTimeout());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertNull(theClient0.getMaxConnectionMsg());
      assertNull(clientAuthenticationHandler0);
      
      theClient0.setClientEventHandler((ClientEventHandler) null);
      assertNull(theClient0.getTimeoutMsg());
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertFalse(theClient0.getTrusted());
      assertEquals(0, theClient0.getTimeout());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertNull(theClient0.getMaxConnectionMsg());
  }

  //Test case number: 17
  /*
   * 5 covered goals:
   * Goal 1. org.quickserver.net.server.TheClient.setClientExtendedEventHandler(Lorg/quickserver/net/server/ClientExtendedEventHandler;)V: root-Branch
   * Goal 2. org.quickserver.net.server.TheClient.getClientEventHandler()Lorg/quickserver/net/server/ClientEventHandler;: root-Branch
   * Goal 3. org.quickserver.net.server.TheClient.getClientExtendedEventHandler()Lorg/quickserver/net/server/ClientExtendedEventHandler;: root-Branch
   * Goal 4. org.quickserver.net.server.TheClient.setClientObjectHandler(Lorg/quickserver/net/server/ClientObjectHandler;)V: root-Branch
   * Goal 5. org.quickserver.net.server.TheClient.getClientObjectHandler()Lorg/quickserver/net/server/ClientObjectHandler;: root-Branch
   */

  @Test
  public void test17()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      assertNull(theClient0.getMaxConnectionMsg());
      assertNull(theClient0.getTimeoutMsg());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals(0, theClient0.getTimeout());
      assertNotNull(theClient0);
      
      ClientEventHandler clientEventHandler0 = theClient0.getClientEventHandler();
      assertNull(theClient0.getMaxConnectionMsg());
      assertNull(theClient0.getTimeoutMsg());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals(0, theClient0.getTimeout());
      assertNull(clientEventHandler0);
      
      ClientObjectHandler clientObjectHandler0 = theClient0.getClientObjectHandler();
      assertNull(theClient0.getMaxConnectionMsg());
      assertNull(theClient0.getTimeoutMsg());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals(0, theClient0.getTimeout());
      assertNull(clientObjectHandler0);
      
      ClientExtendedEventHandler clientExtendedEventHandler0 = theClient0.getClientExtendedEventHandler();
      assertNull(theClient0.getMaxConnectionMsg());
      assertNull(theClient0.getTimeoutMsg());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals(0, theClient0.getTimeout());
      assertNull(clientExtendedEventHandler0);
      
      theClient0.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
      assertNull(theClient0.getMaxConnectionMsg());
      assertNull(theClient0.getTimeoutMsg());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals(0, theClient0.getTimeout());
      
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      assertNull(theClient0.getMaxConnectionMsg());
      assertNull(theClient0.getTimeoutMsg());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals(0, theClient0.getTimeout());
  }

  //Test case number: 18
  /*
   * 2 covered goals:
   * Goal 1. org.quickserver.net.server.TheClient.<init>()V: root-Branch
   * Goal 2. org.quickserver.net.server.TheClient.getServer()Lorg/quickserver/net/server/QuickServer;: root-Branch
   */

  @Test
  public void test18()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals(0, theClient0.getTimeout());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertNull(theClient0.getMaxConnectionMsg());
      assertNull(theClient0.getTimeoutMsg());
      assertFalse(theClient0.getTrusted());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertNotNull(theClient0);
      
      QuickServer quickServer0 = theClient0.getServer();
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals(0, theClient0.getTimeout());
      assertNull(theClient0.getMaxAuthTryMsg());
      assertNull(theClient0.getMaxConnectionMsg());
      assertNull(theClient0.getTimeoutMsg());
      assertFalse(theClient0.getTrusted());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertNull(quickServer0);
  }
}

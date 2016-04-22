/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 19 20:26:49 GMT 2015
 */

package client.network;

import static org.junit.Assert.*;
import org.junit.Test;
import client.BomberClient;
import client.network.ClientMsgReceiver;
import java.awt.HeadlessException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import messages.Message;
import messages.session.SessionParticipationMsg;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockException;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.mock.java.net.MockInetSocketAddress;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ClientMsgReceiver_ESTest extends ClientMsgReceiver_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. client.network.ClientMsgReceiver.processMsg(Lmessages/Message;)V: I8 Branch 1 IFEQ L68 - false
   */

  @Test
  public void test0()  throws Throwable  {
      Proxy.Type proxy_Type0 = Proxy.Type.SOCKS;
      Inet4Address inet4Address0 = (Inet4Address)MockInetAddress.getByName("");
      MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress((InetAddress) inet4Address0, 19);
      Proxy proxy0 = new Proxy(proxy_Type0, (SocketAddress) mockInetSocketAddress0);
      MockSocket mockSocket0 = new MockSocket(proxy0);
      BomberClient bomberClient0 = BomberClient.getInstance();
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver((Socket) mockSocket0, bomberClient0);
      SessionParticipationMsg sessionParticipationMsg0 = new SessionParticipationMsg(false, 19, "");
      clientMsgReceiver0.processMsg(sessionParticipationMsg0);
      assertFalse(clientMsgReceiver0.isInterrupted());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. client.network.ClientMsgReceiver.closeConnection()V: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
      Proxy.Type proxy_Type0 = Proxy.Type.SOCKS;
      Inet4Address inet4Address0 = (Inet4Address)MockInetAddress.getByName("");
      MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress((InetAddress) inet4Address0, 19);
      Proxy proxy0 = new Proxy(proxy_Type0, (SocketAddress) mockInetSocketAddress0);
      MockSocket mockSocket0 = new MockSocket(proxy0);
      BomberClient bomberClient0 = BomberClient.getInstance();
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver((Socket) mockSocket0, bomberClient0);
      // Undeclared exception!
      try {
        clientMsgReceiver0.closeConnection();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. client.network.ClientMsgReceiver.handleConnectionLoss(Ljava/lang/Exception;)V: root-Branch
   * Goal 2. client.network.ClientMsgReceiver.displayErrorMessage()V: I7 Branch 6 IFNE L100 - false
   */

  @Test
  public void test2()  throws Throwable  {
      Proxy.Type proxy_Type0 = Proxy.Type.SOCKS;
      Inet4Address inet4Address0 = (Inet4Address)MockInetAddress.getByName("");
      MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress((InetAddress) inet4Address0, 19);
      Proxy proxy0 = new Proxy(proxy_Type0, (SocketAddress) mockInetSocketAddress0);
      MockSocket mockSocket0 = new MockSocket(proxy0);
      BomberClient bomberClient0 = BomberClient.getInstance();
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver((Socket) mockSocket0, bomberClient0);
      MockException mockException0 = new MockException("");
      // Undeclared exception!
      try {
        clientMsgReceiver0.handleConnectionLoss(mockException0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 3
  /*
   * 3 covered goals:
   * Goal 1. client.network.ClientMsgReceiver.<init>(Ljava/net/Socket;Lclient/BomberClient;)V: root-Branch
   * Goal 2. client.network.ClientMsgReceiver.processMsg(Lmessages/Message;)V: I8 Branch 1 IFEQ L68 - true
   * Goal 3. client.network.ClientMsgReceiver.processMsg(Lmessages/Message;)V: I38 Branch 2 IFNULL L74 - true
   */

  @Test
  public void test3()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      BomberClient bomberClient0 = BomberClient.getInstance();
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver((Socket) mockSocket0, bomberClient0);
      clientMsgReceiver0.processMsg((Message) null);
      assertEquals(0, clientMsgReceiver0.countStackFrames());
  }
}
/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 19 19:35:21 GMT 2015
 */

package client.network;

import static org.junit.Assert.*;
import org.junit.Test;
import client.BomberClient;
import client.network.ClientMsgReceiver;
import java.awt.HeadlessException;
import java.awt.event.InvocationEvent;
import java.net.Proxy;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;
import messages.global.MapInfo;
import messages.global.MapListMsg;
import messages.session.SessionStateMsg;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
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
   * Goal 1. client.network.ClientMsgReceiver.closeConnection()V: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      assertFalse(mockSocket0.isInputShutdown());
      assertFalse(mockSocket0.isBound());
      assertFalse(mockSocket0.isOutputShutdown());
      assertFalse(mockSocket0.isClosed());
      assertFalse(mockSocket0.isConnected());
      assertEquals("Socket[unconnected]", mockSocket0.toString());
      assertNotNull(mockSocket0);
      
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver((Socket) mockSocket0, (BomberClient) null);
      assertFalse(mockSocket0.isInputShutdown());
      assertFalse(mockSocket0.isBound());
      assertFalse(mockSocket0.isOutputShutdown());
      assertFalse(mockSocket0.isClosed());
      assertFalse(mockSocket0.isConnected());
      assertEquals("Socket[unconnected]", mockSocket0.toString());
      assertFalse(clientMsgReceiver0.isDaemon());
      assertFalse(clientMsgReceiver0.isInterrupted());
      assertEquals(0, clientMsgReceiver0.countStackFrames());
      assertNotNull(clientMsgReceiver0);
      
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

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. client.network.ClientMsgReceiver.handleConnectionLoss(Ljava/lang/Exception;)V: root-Branch
   * Goal 2. client.network.ClientMsgReceiver.displayErrorMessage()V: I7 Branch 6 IFNE L100 - false
   */

  @Test
  public void test1()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      //  // Unstable assertion: assertEquals("Socket[unconnected]", mockSocket0.toString());
      //  // Unstable assertion: assertFalse(mockSocket0.isClosed());
      //  // Unstable assertion: assertFalse(mockSocket0.isOutputShutdown());
      //  // Unstable assertion: assertFalse(mockSocket0.isBound());
      //  // Unstable assertion: assertFalse(mockSocket0.isInputShutdown());
      //  // Unstable assertion: assertFalse(mockSocket0.isConnected());
      //  // Unstable assertion: assertNotNull(mockSocket0);
      
      BomberClient bomberClient0 = BomberClient.getInstance();
      //  // Unstable assertion: assertFalse(bomberClient0.hasChanged());
      //  // Unstable assertion: assertEquals("client", bomberClient0.getPlayerName());
      //  // Unstable assertion: assertEquals(0, bomberClient0.countObservers());
      //  // Unstable assertion: assertNotNull(bomberClient0);
      
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver((Socket) mockSocket0, bomberClient0);
      //  // Unstable assertion: assertEquals("Socket[unconnected]", mockSocket0.toString());
      //  // Unstable assertion: assertFalse(mockSocket0.isClosed());
      //  // Unstable assertion: assertFalse(mockSocket0.isOutputShutdown());
      //  // Unstable assertion: assertFalse(mockSocket0.isBound());
      //  // Unstable assertion: assertFalse(mockSocket0.isInputShutdown());
      //  // Unstable assertion: assertFalse(mockSocket0.isConnected());
      //  // Unstable assertion: assertFalse(bomberClient0.hasChanged());
      //  // Unstable assertion: assertEquals("client", bomberClient0.getPlayerName());
      //  // Unstable assertion: assertEquals(0, bomberClient0.countObservers());
      //  // Unstable assertion: assertFalse(clientMsgReceiver0.isInterrupted());
      //  // Unstable assertion: assertFalse(clientMsgReceiver0.isDaemon());
      //  // Unstable assertion: assertEquals(0, clientMsgReceiver0.countStackFrames());
      //  // Unstable assertion: assertNotNull(clientMsgReceiver0);
      
      InvocationEvent invocationEvent0 = new InvocationEvent((Object) clientMsgReceiver0, (Runnable) clientMsgReceiver0, (Runnable) clientMsgReceiver0, true);
      //  // Unstable assertion: assertEquals("Socket[unconnected]", mockSocket0.toString());
      //  // Unstable assertion: assertFalse(mockSocket0.isClosed());
      //  // Unstable assertion: assertFalse(mockSocket0.isOutputShutdown());
      //  // Unstable assertion: assertFalse(mockSocket0.isBound());
      //  // Unstable assertion: assertFalse(mockSocket0.isInputShutdown());
      //  // Unstable assertion: assertFalse(mockSocket0.isConnected());
      //  // Unstable assertion: assertFalse(bomberClient0.hasChanged());
      //  // Unstable assertion: assertEquals("client", bomberClient0.getPlayerName());
      //  // Unstable assertion: assertEquals(0, bomberClient0.countObservers());
      //  // Unstable assertion: assertFalse(clientMsgReceiver0.isInterrupted());
      //  // Unstable assertion: assertFalse(clientMsgReceiver0.isDaemon());
      //  // Unstable assertion: assertEquals(0, clientMsgReceiver0.countStackFrames());
      //  // Unstable assertion: assertEquals("INVOCATION_DEFAULT,runnable=Thread[Thread-0,5,Test_Execution_Group],notifier=null,catchExceptions=true,when=1450553718263", invocationEvent0.paramString());
      //  // Unstable assertion: assertEquals(1200, invocationEvent0.getID());
      //  // Unstable assertion: assertNotNull(invocationEvent0);
      
      Exception exception0 = invocationEvent0.getException();
      //  // Unstable assertion: assertEquals("Socket[unconnected]", mockSocket0.toString());
      //  // Unstable assertion: assertFalse(mockSocket0.isClosed());
      //  // Unstable assertion: assertFalse(mockSocket0.isOutputShutdown());
      //  // Unstable assertion: assertFalse(mockSocket0.isBound());
      //  // Unstable assertion: assertFalse(mockSocket0.isInputShutdown());
      //  // Unstable assertion: assertFalse(mockSocket0.isConnected());
      //  // Unstable assertion: assertFalse(bomberClient0.hasChanged());
      //  // Unstable assertion: assertEquals("client", bomberClient0.getPlayerName());
      //  // Unstable assertion: assertEquals(0, bomberClient0.countObservers());
      //  // Unstable assertion: assertFalse(clientMsgReceiver0.isInterrupted());
      //  // Unstable assertion: assertFalse(clientMsgReceiver0.isDaemon());
      //  // Unstable assertion: assertEquals(0, clientMsgReceiver0.countStackFrames());
      //  // Unstable assertion: assertEquals("INVOCATION_DEFAULT,runnable=Thread[Thread-0,5,Test_Execution_Group],notifier=null,catchExceptions=true,when=1450553718263", invocationEvent0.paramString());
      //  // Unstable assertion: assertEquals(1200, invocationEvent0.getID());
      //  // Unstable assertion: assertNull(exception0);
      
      // Undeclared exception!
      try {
        clientMsgReceiver0.handleConnectionLoss((Exception) null);
       //  fail("Expecting exception: HeadlessException");
       // Unstable assertion
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. client.network.ClientMsgReceiver.processMsg(Lmessages/Message;)V: I8 Branch 1 IFEQ L68 - true
   * Goal 2. client.network.ClientMsgReceiver.processMsg(Lmessages/Message;)V: I38 Branch 2 IFNULL L74 - true
   */

  @Test
  public void test2()  throws Throwable  {
      Proxy proxy0 = Proxy.NO_PROXY;
      assertEquals("DIRECT", proxy0.toString());
      assertEquals(Proxy.Type.DIRECT, proxy0.type());
      assertNotNull(proxy0);
      
      MockSocket mockSocket0 = new MockSocket(proxy0);
      assertEquals("DIRECT", proxy0.toString());
      assertEquals(Proxy.Type.DIRECT, proxy0.type());
      assertEquals("Socket[unconnected]", mockSocket0.toString());
      assertFalse(mockSocket0.isInputShutdown());
      assertFalse(mockSocket0.isConnected());
      assertFalse(mockSocket0.isClosed());
      assertFalse(mockSocket0.isOutputShutdown());
      assertFalse(mockSocket0.isBound());
      assertNotNull(mockSocket0);
      
      BomberClient bomberClient0 = BomberClient.getInstance();
      assertFalse(bomberClient0.hasChanged());
      assertEquals(0, bomberClient0.countObservers());
      assertEquals("client", bomberClient0.getPlayerName());
      assertNotNull(bomberClient0);
      
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver((Socket) mockSocket0, bomberClient0);
      assertEquals("DIRECT", proxy0.toString());
      assertEquals(Proxy.Type.DIRECT, proxy0.type());
      assertEquals("Socket[unconnected]", mockSocket0.toString());
      assertFalse(mockSocket0.isInputShutdown());
      assertFalse(mockSocket0.isConnected());
      assertFalse(mockSocket0.isClosed());
      assertFalse(mockSocket0.isOutputShutdown());
      assertFalse(mockSocket0.isBound());
      assertFalse(bomberClient0.hasChanged());
      assertEquals(0, bomberClient0.countObservers());
      assertEquals("client", bomberClient0.getPlayerName());
      assertFalse(clientMsgReceiver0.isInterrupted());
      assertFalse(clientMsgReceiver0.isDaemon());
      assertEquals(0, clientMsgReceiver0.countStackFrames());
      assertNotNull(clientMsgReceiver0);
      
      SessionStateMsg sessionStateMsg0 = new SessionStateMsg(3452);
      assertEquals(1, sessionStateMsg0.READY_FOR_NEXT_ROUND);
      assertNotNull(sessionStateMsg0);
      
      clientMsgReceiver0.processMsg(sessionStateMsg0);
      assertEquals("DIRECT", proxy0.toString());
      assertEquals(Proxy.Type.DIRECT, proxy0.type());
      assertEquals("Socket[unconnected]", mockSocket0.toString());
      assertFalse(mockSocket0.isInputShutdown());
      assertFalse(mockSocket0.isConnected());
      assertFalse(mockSocket0.isClosed());
      assertFalse(mockSocket0.isOutputShutdown());
      assertFalse(mockSocket0.isBound());
      assertFalse(bomberClient0.hasChanged());
      assertEquals(0, bomberClient0.countObservers());
      assertEquals("client", bomberClient0.getPlayerName());
      assertFalse(clientMsgReceiver0.isInterrupted());
      assertFalse(clientMsgReceiver0.isDaemon());
      assertEquals(0, clientMsgReceiver0.countStackFrames());
      assertEquals(1, sessionStateMsg0.READY_FOR_NEXT_ROUND);
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * Goal 1. client.network.ClientMsgReceiver.<init>(Ljava/net/Socket;Lclient/BomberClient;)V: root-Branch
   * Goal 2. client.network.ClientMsgReceiver.processMsg(Lmessages/Message;)V: I8 Branch 1 IFEQ L68 - false
   */

  @Test
  public void test3()  throws Throwable  {
      BomberClient bomberClient0 = BomberClient.getInstance();
      assertEquals(0, bomberClient0.countObservers());
      assertFalse(bomberClient0.hasChanged());
      assertEquals("client", bomberClient0.getPlayerName());
      assertNotNull(bomberClient0);
      
      MockSocket mockSocket0 = new MockSocket();
      assertEquals("Socket[unconnected]", mockSocket0.toString());
      assertFalse(mockSocket0.isInputShutdown());
      assertFalse(mockSocket0.isClosed());
      assertFalse(mockSocket0.isBound());
      assertFalse(mockSocket0.isOutputShutdown());
      assertFalse(mockSocket0.isConnected());
      assertNotNull(mockSocket0);
      
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver((Socket) mockSocket0, bomberClient0);
      assertEquals(0, bomberClient0.countObservers());
      assertFalse(bomberClient0.hasChanged());
      assertEquals("client", bomberClient0.getPlayerName());
      assertEquals("Socket[unconnected]", mockSocket0.toString());
      assertFalse(mockSocket0.isInputShutdown());
      assertFalse(mockSocket0.isClosed());
      assertFalse(mockSocket0.isBound());
      assertFalse(mockSocket0.isOutputShutdown());
      assertFalse(mockSocket0.isConnected());
      assertFalse(clientMsgReceiver0.isDaemon());
      assertFalse(clientMsgReceiver0.isInterrupted());
      assertEquals(0, clientMsgReceiver0.countStackFrames());
      assertNotNull(clientMsgReceiver0);
      
      LinkedList<MapInfo> linkedList0 = new LinkedList<MapInfo>();
      assertEquals(0, linkedList0.size());
      assertNotNull(linkedList0);
      
      MapListMsg mapListMsg0 = new MapListMsg((List<MapInfo>) linkedList0);
      assertEquals(0, linkedList0.size());
      assertNotNull(mapListMsg0);
      
      // Undeclared exception!
      try {
        clientMsgReceiver0.processMsg(mapListMsg0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
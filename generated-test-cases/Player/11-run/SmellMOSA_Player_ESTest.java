/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 15 08:37:32 GMT 2015
 */

package state;

import static org.junit.Assert.*;
import org.junit.Test;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.junit.runner.RunWith;
import state.Player;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Player_ESTest extends Player_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. state.Player.isJoinOK(Lstate/Player;Z)Z: I48 Branch 6 IF_ICMPNE L267 - true
   */

  @Test
  public void test00()  throws Throwable  {
      Player player0 = new Player();
      player0.setJoinOK(player0, true);
      boolean boolean0 = player0.isJoinOK(player0, false);
      assertFalse(boolean0);
      assertEquals(0, player0.getPictureId());
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. state.Player.type()I: root-Branch
   */

  @Test
  public void test01()  throws Throwable  {
      Player player0 = new Player();
      int int0 = player0.type();
      assertEquals(0, player0.getPictureId());
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertEquals(5, int0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. state.Player.unpack(Ljava/io/DataInputStream;)Z: I12 Branch 7 IF_ICMPEQ L307 - true
   */

  @Test
  public void test02()  throws Throwable  {
      Player player0 = new Player();
      byte[] byteArray0 = player0.pack();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(0, player0.getPictureId());
      assertEquals(1, player0.getStrength());
      
      player0.unpack(byteArray0);
      assertEquals(1, player0.getStrength());
      assertEquals(0, player0.getPictureId());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(-1, player0.getId());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. state.Player.isDead()Z: I7 Branch 3 IFNE L191 - false
   */

  @Test
  public void test03()  throws Throwable  {
      Player player0 = new Player();
      player0.setDead(711L);
      boolean boolean0 = player0.isDead();
      assertEquals(711L, player0.getTimeOfDeath());
      assertTrue(boolean0);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * Goal 1. state.Player.setMoney(F)V: root-Branch
   */

  @Test
  public void test04()  throws Throwable  {
      Player player0 = new Player((-740), "Player.pack(): ** ERROR ***R[IO] pack failed! curr#nt state is inconsistent: ", "Player.pack(): ** ERROR ***R[IO] pack failed! curr#nt state is inconsistent: ", (-740));
      player0.setMoney((float) (-740));
      assertEquals((-740.0F), player0.getMoney(), 0.01F);
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * Goal 1. state.Player.gangStrength()I: I21 Branch 2 IFEQ L171 - true
   * Goal 2. state.Player.gangStrength()I: I21 Branch 2 IFEQ L171 - false
   */

  @Test
  public void test05()  throws Throwable  {
      Player player0 = new Player();
      int int0 = player0.gangStrength();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, int0);
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0, player0.getPictureId());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. state.Player.isJoinOK(Lstate/Player;Z)Z: I11 Branch 4 IFEQ L263 - true
   */

  @Test
  public void test06()  throws Throwable  {
      Player player0 = new Player((-783), "Player.pack(): ** ERROR ***R[IO] pack failed! curr#nt state is incosistent: ", "Player.pack(): ** ERROR ***R[IO] pack failed! curr#nt state is incosistent: ", (-783));
      boolean boolean0 = player0.isJoinOK(player0, true);
      assertEquals(1, player0.getStrength());
      assertEquals(-783, player0.getPictureId());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. state.Player.setZ(F)V: root-Branch
   */

  @Test
  public void test07()  throws Throwable  {
      Player player0 = new Player((-759), "Player.pack(): ** ERROR ***R[IO] pack failed! curr#nt state is incosistent: ", "Player.pack(): ** ERROR ***R[IO] pack failed! curr#nt state is incosistent: ", (-759));
      player0.setZ((float) (-759));
      assertEquals((-759.0F), player0.getZ(), 0.01F);
  }

  //Test case number: 8
  /*
   * 3 covered goals:
   * Goal 1. state.Player.<init>(ILjava/lang/String;Ljava/lang/String;I)V: root-Branch
   * Goal 2. state.Player.<init>(ILjava/lang/String;I)V: root-Branch
   * Goal 3. state.Player.<init>(ILjava/lang/String;Ljava/lang/String;II)V: root-Branch
   */

  @Test
  public void test08()  throws Throwable  {
      Player player0 = new Player((-783), "Player.pack(): ** ERROR ***R[IO] pack failed! curr#nt state is incosistent: ", "Player.pack(): ** ERROR ***R[IO] pack failed! curr#nt state is incosistent: ", (-783), (-783));
      assertEquals(-783, player0.getStrength());
      assertEquals(-783, player0.getPictureId());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(player0.isDead());
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * Goal 1. state.Player.setConnected(Z)V: root-Branch
   */

  @Test
  public void test09()  throws Throwable  {
      Player player0 = new Player();
      player0.setConnected(true);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(0, player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals(1, player0.getStrength());
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * Goal 1. state.Player.getY()F: root-Branch
   */

  @Test
  public void test10()  throws Throwable  {
      Player player0 = new Player();
      float float0 = player0.getY();
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(0, player0.getPictureId());
      assertEquals(1, player0.getStrength());
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * Goal 1. state.Player.reset(Z)V: I48 Branch 1 IFEQ L127 - true
   */

  @Test
  public void test11()  throws Throwable  {
      Player player0 = new Player();
      player0.reset(false);
      assertEquals(1, player0.getStrength());
      assertEquals(0, player0.getPictureId());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * Goal 1. state.Player.isDead()Z: I7 Branch 3 IFNE L191 - true
   */

  @Test
  public void test12()  throws Throwable  {
      Player player0 = new Player();
      boolean boolean0 = player0.isDead();
      assertEquals(0, player0.getPictureId());
      assertFalse(boolean0);
      assertEquals(1, player0.getStrength());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * Goal 1. state.Player.toString()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test13()  throws Throwable  {
      Player player0 = new Player();
      String string0 = player0.toString();
      assertEquals(0, player0.getPictureId());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * Goal 1. state.Player.setY(F)V: root-Branch
   */

  @Test
  public void test14()  throws Throwable  {
      Player player0 = new Player();
      player0.setY((float) 0L);
      assertEquals(0, player0.getPictureId());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
  }

  //Test case number: 15
  /*
   * 5 covered goals:
   * Goal 1. state.Player.setJoinOK(Lstate/Player;Z)V: root-Branch
   * Goal 2. state.Player$JoinInfo.<init>(Lstate/Player;Z)V: root-Branch
   * Goal 3. state.Player.isJoinOK(Lstate/Player;Z)Z: I11 Branch 4 IFEQ L263 - false
   * Goal 4. state.Player.isJoinOK(Lstate/Player;Z)Z: I41 Branch 5 IFLE L267 - false
   * Goal 5. state.Player.isJoinOK(Lstate/Player;Z)Z: I48 Branch 6 IF_ICMPNE L267 - false
   */

  @Test
  public void test15()  throws Throwable  {
      Player player0 = new Player();
      player0.setJoinOK(player0, false);
      boolean boolean0 = player0.isJoinOK(player0, false);
      assertEquals(1, player0.getStrength());
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertTrue(boolean0);
      assertEquals(0, player0.getPictureId());
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * Goal 1. state.Player.getMoney()F: root-Branch
   */

  @Test
  public void test16()  throws Throwable  {
      Player player0 = new Player();
      float float0 = player0.getMoney();
      assertEquals(0, player0.getPictureId());
      assertEquals(1, player0.getStrength());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * Goal 1. state.Player.setX(F)V: root-Branch
   */

  @Test
  public void test17()  throws Throwable  {
      Player player0 = new Player();
      player0.setX((-14.654133F));
      assertEquals((-14.654133F), player0.getX(), 0.01F);
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * Goal 1. state.Player.getX()F: root-Branch
   */

  @Test
  public void test18()  throws Throwable  {
      Player player0 = new Player();
      float float0 = player0.getX();
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertEquals(0, player0.getPictureId());
      assertEquals(10.0F, float0, 0.01F);
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * Goal 1. state.Player.getTimeOfDeath()J: root-Branch
   */

  @Test
  public void test19()  throws Throwable  {
      Player player0 = new Player();
      long long0 = player0.getTimeOfDeath();
      assertEquals(1, player0.getStrength());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0, player0.getPictureId());
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * Goal 1. state.Player.getName()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test20()  throws Throwable  {
      Player player0 = new Player();
      String string0 = player0.getName();
      assertEquals(0, player0.getPictureId());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
  }

  //Test case number: 21
  /*
   * 1 covered goal:
   * Goal 1. state.Player.isConnected()Z: root-Branch
   */

  @Test
  public void test21()  throws Throwable  {
      Player player0 = new Player();
      boolean boolean0 = player0.isConnected();
      assertTrue(boolean0);
      assertFalse(player0.isDead());
      assertEquals(0, player0.getPictureId());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
  }

  //Test case number: 22
  /*
   * 1 covered goal:
   * Goal 1. state.Player.getStrength()I: root-Branch
   */

  @Test
  public void test22()  throws Throwable  {
      Player player0 = new Player();
      int int0 = player0.getStrength();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0, player0.getPictureId());
      assertEquals(1, int0);
  }

  //Test case number: 23
  /*
   * 2 covered goals:
   * Goal 1. state.Player.unpack([B)V: root-Branch
   * Goal 2. state.Player.unpack(Ljava/io/DataInputStream;)Z: I12 Branch 7 IF_ICMPEQ L307 - false
   */

  @Test
  public void test23()  throws Throwable  {
      Player player0 = new Player();
      byte[] byteArray0 = new byte[2];
      player0.unpack(byteArray0);
      assertEquals(0, player0.getPictureId());
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
  }

  //Test case number: 24
  /*
   * 1 covered goal:
   * Goal 1. state.Player.getZ()F: root-Branch
   */

  @Test
  public void test24()  throws Throwable  {
      Player player0 = new Player();
      float float0 = player0.getZ();
      assertEquals(1, player0.getStrength());
      assertEquals(0, player0.getPictureId());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0.0F, float0, 0.01F);
  }

  //Test case number: 25
  /*
   * 3 covered goals:
   * Goal 1. state.Player.setDead()V: root-Branch
   * Goal 2. state.Player.setDead(JZ)V: root-Branch
   * Goal 3. state.Player.setDead(J)V: root-Branch
   */

  @Test
  public void test25()  throws Throwable  {
      Player player0 = new Player();
      player0.setDead();
      assertEquals(1392409281320L, player0.getTimeOfDeath());
  }

  //Test case number: 26
  /*
   * 1 covered goal:
   * Goal 1. state.Player.getPictureId()I: root-Branch
   */

  @Test
  public void test26()  throws Throwable  {
      Player player0 = new Player();
      int int0 = player0.getPictureId();
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(1, player0.getStrength());
      assertEquals(0, int0);
  }

  //Test case number: 27
  /*
   * 1 covered goal:
   * Goal 1. state.Player.getIP()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test27()  throws Throwable  {
      Player player0 = new Player();
      String string0 = player0.getIP();
      assertEquals(1, player0.getStrength());
      assertEquals(0, player0.getPictureId());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
  }

  //Test case number: 28
  /*
   * 3 covered goals:
   * Goal 1. state.Player.<init>()V: root-Branch
   * Goal 2. state.Player.<init>(I)V: root-Branch
   * Goal 3. state.Player.reset(Z)V: I48 Branch 1 IFEQ L127 - false
   */

  @Test
  public void test28()  throws Throwable  {
      Player player0 = new Player();
      player0.reset(true);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertFalse(player0.isDead());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0, player0.getPictureId());
  }
}
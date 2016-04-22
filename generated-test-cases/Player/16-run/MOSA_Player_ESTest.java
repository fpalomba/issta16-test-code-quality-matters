/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 15 10:01:42 GMT 2015
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
   * Goal 1. state.Player.isJoinOK(Lstate/Player;Z)Z: I48 Branch 6 IF_ICMPNE L267 - false
   */

  @Test
  public void test00()  throws Throwable  {
      Player player0 = new Player(1233, "A", (-4634));
      player0.setJoinOK(player0, true);
      boolean boolean0 = player0.isJoinOK(player0, true);
      assertTrue(boolean0);
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(-4634, player0.getPictureId());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. state.Player.isJoinOK(Lstate/Player;Z)Z: I11 Branch 4 IFEQ L263 - true
   */

  @Test
  public void test01()  throws Throwable  {
      Player player0 = new Player((-1));
      boolean boolean0 = player0.isJoinOK(player0, true);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0, player0.getPictureId());
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. state.Player.isDead()Z: I7 Branch 3 IFNE L191 - false
   */

  @Test
  public void test02()  throws Throwable  {
      Player player0 = new Player((-1));
      player0.setDead(1858L);
      boolean boolean0 = player0.isDead();
      assertEquals(1858L, player0.getTimeOfDeath());
      assertTrue(boolean0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. state.Player.isDead()Z: I7 Branch 3 IFNE L191 - true
   */

  @Test
  public void test03()  throws Throwable  {
      Player player0 = new Player(1233, "A", (-4634));
      boolean boolean0 = player0.isDead();
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(boolean0);
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(-4634, player0.getPictureId());
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * Goal 1. state.Player.gangStrength()I: I21 Branch 2 IFEQ L171 - true
   * Goal 2. state.Player.gangStrength()I: I21 Branch 2 IFEQ L171 - false
   */

  @Test
  public void test04()  throws Throwable  {
      Player player0 = new Player((-1));
      int int0 = player0.gangStrength();
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(0, player0.getPictureId());
      assertEquals(1, int0);
      assertEquals(0.0F, player0.getY(), 0.01F);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * Goal 1. state.Player.reset(Z)V: I48 Branch 1 IFEQ L127 - false
   */

  @Test
  public void test05()  throws Throwable  {
      Player player0 = new Player();
      player0.reset(true);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(0, player0.getPictureId());
      assertEquals(1, player0.getStrength());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. state.Player.reset(Z)V: I48 Branch 1 IFEQ L127 - true
   */

  @Test
  public void test06()  throws Throwable  {
      Player player0 = new Player(6912, "", "", (-1589));
      player0.reset(false);
      assertEquals(1, player0.getStrength());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(-1589, player0.getPictureId());
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. state.Player.getZ()F: root-Branch
   */

  @Test
  public void test07()  throws Throwable  {
      Player player0 = new Player((-1));
      float float0 = player0.getZ();
      assertFalse(player0.isDead());
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(0, player0.getPictureId());
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * Goal 1. state.Player.getX()F: root-Branch
   */

  @Test
  public void test08()  throws Throwable  {
      Player player0 = new Player(1235, "A", (-4634));
      float float0 = player0.getX();
      assertFalse(player0.isDead());
      assertEquals(-4634, player0.getPictureId());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, float0, 0.01F);
      assertEquals(1, player0.getStrength());
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * Goal 1. state.Player.isConnected()Z: root-Branch
   */

  @Test
  public void test09()  throws Throwable  {
      Player player0 = new Player(0);
      boolean boolean0 = player0.isConnected();
      assertEquals(0, player0.getPictureId());
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertTrue(boolean0);
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * Goal 1. state.Player.setConnected(Z)V: root-Branch
   */

  @Test
  public void test10()  throws Throwable  {
      Player player0 = new Player();
      player0.setConnected(false);
      assertFalse(player0.isConnected());
  }

  //Test case number: 11
  /*
   * 5 covered goals:
   * Goal 1. state.Player.setJoinOK(Lstate/Player;Z)V: root-Branch
   * Goal 2. state.Player$JoinInfo.<init>(Lstate/Player;Z)V: root-Branch
   * Goal 3. state.Player.isJoinOK(Lstate/Player;Z)Z: I11 Branch 4 IFEQ L263 - false
   * Goal 4. state.Player.isJoinOK(Lstate/Player;Z)Z: I41 Branch 5 IFLE L267 - false
   * Goal 5. state.Player.isJoinOK(Lstate/Player;Z)Z: I48 Branch 6 IF_ICMPNE L267 - true
   */

  @Test
  public void test11()  throws Throwable  {
      Player player0 = new Player(1235, "A", (-4634));
      player0.setJoinOK(player0, false);
      boolean boolean0 = player0.isJoinOK(player0, true);
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(boolean0);
      assertEquals(-4634, player0.getPictureId());
      assertEquals(1, player0.getStrength());
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * Goal 1. state.Player.getStrength()I: root-Branch
   */

  @Test
  public void test12()  throws Throwable  {
      Player player0 = new Player(0);
      int int0 = player0.getStrength();
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, int0);
      assertEquals(0, player0.getPictureId());
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * Goal 1. state.Player.unpack(Ljava/io/DataInputStream;)Z: I12 Branch 7 IF_ICMPEQ L307 - false
   */

  @Test
  public void test13()  throws Throwable  {
      Player player0 = new Player((-1));
      byte[] byteArray0 = new byte[9];
      player0.unpack(byteArray0);
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertEquals(0, player0.getPictureId());
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * Goal 1. state.Player.getIP()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test14()  throws Throwable  {
      Player player0 = new Player((-1));
      String string0 = player0.getIP();
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertEquals(0, player0.getPictureId());
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * Goal 1. state.Player.setMoney(F)V: root-Branch
   */

  @Test
  public void test15()  throws Throwable  {
      Player player0 = new Player(6912, "", "", (-1589));
      player0.setMoney(0.0F);
      assertEquals(0.0F, player0.getMoney(), 0.01F);
      assertEquals(-1589, player0.getPictureId());
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(1, player0.getStrength());
  }

  //Test case number: 16
  /*
   * 2 covered goals:
   * Goal 1. state.Player.getName()Ljava/lang/String;: root-Branch
   * Goal 2. state.Player.<init>(ILjava/lang/String;Ljava/lang/String;II)V: root-Branch
   */

  @Test
  public void test16()  throws Throwable  {
      Player player0 = new Player(0, (String) null, "separateASCIIandRange", (-1011), (-2242));
      String string0 = player0.getName();
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(-2242, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(-1011, player0.getPictureId());
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * Goal 1. state.Player.toString()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test17()  throws Throwable  {
      Player player0 = new Player(0);
      String string0 = player0.toString();
      assertEquals(0, player0.getPictureId());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
  }

  //Test case number: 18
  /*
   * 4 covered goals:
   * Goal 1. state.Player.pack()[B: root-Branch
   * Goal 2. state.Player.pack(Ljava/io/DataOutputStream;)V: root-Branch
   * Goal 3. state.Player.unpack([B)V: root-Branch
   * Goal 4. state.Player.unpack(Ljava/io/DataInputStream;)Z: I12 Branch 7 IF_ICMPEQ L307 - true
   */

  @Test
  public void test18()  throws Throwable  {
      Player player0 = new Player(0);
      byte[] byteArray0 = player0.pack();
      player0.unpack(byteArray0);
      assertEquals(0, player0.getId());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0, player0.getPictureId());
      assertFalse(player0.isDead());
      assertEquals(1, player0.getStrength());
  }

  //Test case number: 19
  /*
   * 3 covered goals:
   * Goal 1. state.Player.setDead()V: root-Branch
   * Goal 2. state.Player.setDead(JZ)V: root-Branch
   * Goal 3. state.Player.setDead(J)V: root-Branch
   */

  @Test
  public void test19()  throws Throwable  {
      Player player0 = new Player(0);
      player0.setDead();
      assertEquals(1392409281320L, player0.getTimeOfDeath());
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * Goal 1. state.Player.getY()F: root-Branch
   */

  @Test
  public void test20()  throws Throwable  {
      Player player0 = new Player(6912, "", "", (-1589));
      float float0 = player0.getY();
      assertEquals(1, player0.getStrength());
      assertEquals(-1589, player0.getPictureId());
      assertFalse(player0.isDead());
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
  }

  //Test case number: 21
  /*
   * 1 covered goal:
   * Goal 1. state.Player.type()I: root-Branch
   */

  @Test
  public void test21()  throws Throwable  {
      Player player0 = new Player();
      int int0 = player0.type();
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0, player0.getPictureId());
      assertEquals(1, player0.getStrength());
      assertEquals(5, int0);
  }

  //Test case number: 22
  /*
   * 1 covered goal:
   * Goal 1. state.Player.setX(F)V: root-Branch
   */

  @Test
  public void test22()  throws Throwable  {
      Player player0 = new Player((-1));
      player0.setX(3514.0F);
      assertEquals(3514.0F, player0.getX(), 0.01F);
  }

  //Test case number: 23
  /*
   * 2 covered goals:
   * Goal 1. state.Player.getTimeOfDeath()J: root-Branch
   * Goal 2. state.Player.<init>(ILjava/lang/String;Ljava/lang/String;I)V: root-Branch
   */

  @Test
  public void test23()  throws Throwable  {
      Player player0 = new Player((-1367), "P*BT?", "P*BT?", (-1367));
      long long0 = player0.getTimeOfDeath();
      assertEquals(-1367, player0.getPictureId());
      assertEquals(1, player0.getStrength());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(player0.isDead());
  }

  //Test case number: 24
  /*
   * 1 covered goal:
   * Goal 1. state.Player.setZ(F)V: root-Branch
   */

  @Test
  public void test24()  throws Throwable  {
      Player player0 = new Player();
      player0.setZ((float) 8);
      assertEquals(8.0F, player0.getZ(), 0.01F);
  }

  //Test case number: 25
  /*
   * 2 covered goals:
   * Goal 1. state.Player.setY(F)V: root-Branch
   * Goal 2. state.Player.<init>()V: root-Branch
   */

  @Test
  public void test25()  throws Throwable  {
      Player player0 = new Player();
      player0.setY((float) 2162);
      assertEquals(2162.0F, player0.getY(), 0.01F);
  }

  //Test case number: 26
  /*
   * 1 covered goal:
   * Goal 1. state.Player.getPictureId()I: root-Branch
   */

  @Test
  public void test26()  throws Throwable  {
      Player player0 = new Player(0, "two", 0);
      int int0 = player0.getPictureId();
      assertEquals(0, int0);
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
  }

  //Test case number: 27
  /*
   * 3 covered goals:
   * Goal 1. state.Player.getMoney()F: root-Branch
   * Goal 2. state.Player.<init>(I)V: root-Branch
   * Goal 3. state.Player.<init>(ILjava/lang/String;I)V: root-Branch
   */

  @Test
  public void test27()  throws Throwable  {
      Player player0 = new Player(1235, "A", (-4634));
      float float0 = player0.getMoney();
      assertEquals(1, player0.getStrength());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, float0, 0.01F);
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(-4634, player0.getPictureId());
  }
}

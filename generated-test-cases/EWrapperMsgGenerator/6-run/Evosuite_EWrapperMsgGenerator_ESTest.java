/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 13 04:56:10 GMT 2015
 */

package com.ib.client;

import static org.junit.Assert.*;
import org.junit.Test;
import com.ib.client.Contract;
import com.ib.client.ContractDetails;
import com.ib.client.EWrapperMsgGenerator;
import com.ib.client.Execution;
import com.ib.client.Order;
import com.ib.client.OrderState;
import com.ib.client.UnderComp;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class EWrapperMsgGenerator_ESTest extends EWrapperMsgGenerator_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 3 covered goals:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.openOrder(ILcom/ib/client/Contract;Lcom/ib/client/Order;Lcom/ib/client/OrderState;)Ljava/lang/String;: I303 Branch 10 IFLE L137 - false
   * Goal 2. com.ib.client.EWrapperMsgGenerator.openOrder(ILcom/ib/client/Contract;Lcom/ib/client/Order;Lcom/ib/client/OrderState;)Ljava/lang/String;: I311 Branch 11 IFNULL L138 - true
   * Goal 3. com.ib.client.EWrapperMsgGenerator.openOrder(ILcom/ib/client/Contract;Lcom/ib/client/Order;Lcom/ib/client/OrderState;)Ljava/lang/String;: I335 Branch 12 IFEQ L141 - true
   */

  @Test
  public void test00()  throws Throwable  {
      Contract contract0 = new Contract();
      Contract contract1 = new Contract(2800, "7T", "BAG", "7T", (double) 0, "{P8~", (String) null, (String) null, "", "BAG", (Vector) contract0.m_comboLegs, " faProile", false, (String) null, "BAG");
      Order order0 = new Order();
      OrderState orderState0 = new OrderState("{P8~", "BAG", "BAG", "flab", 1.7976931348623157E308, 0, 0, "reqId = 120 =============== end ===============", "useRad2b");
      String string0 = EWrapperMsgGenerator.openOrder(2800, contract1, order0, orderState0);
      assertEquals("open order: orderId=2800 action=null quantity=0 symbol=7T exchange=null secType=BAG type=null lmtPrice=0.0 auxPrice=0.0 TIF=null localSymbol=BAG client Id=0 parent Id=0 permId=0 outsideRth=false hidden=false discretionaryAmt=0.0 triggerMethod=0 goodAfterTime=null goodTillDate=null faGroup=null faMethod=null faPercentage=null faProfile=null shortSaleSlot=0 designatedLocation= ocaGroup=null ocaType=0 rule80A=null allOrNone=false minQty=2147483647 percentOffset=1.7976931348623157E308 eTradeOnly=false firmQuoteOnly=false nbboPriceCap=1.7976931348623157E308 auctionStrategy=0 startingPrice=1.7976931348623157E308 stockRefPrice=1.7976931348623157E308 delta=1.7976931348623157E308 stockRangeLower=1.7976931348623157E308 stockRangeUpper=1.7976931348623157E308 volatility=1.7976931348623157E308 volatilityType=2147483647 deltaNeutralOrderType= deltaNeutralAuxPrice=1.7976931348623157E308 continuousUpdate=0 referencePriceType=2147483647 trailStopPrice=1.7976931348623157E308 scaleInitLevelSize= scaleSubsLevelSize= scalePriceIncrement= account=null settlingFirm=null clearingAccount=null clearingIntent=null notHeld=false whatIf=false status=null initMargin=BAG maintMargin=BAG equityWithLoan=flab commission= minCommission=0.0 maxCommission=0.0 commissionCurrency=reqId = 120 =============== end =============== warningText=useRad2b", string0);
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.openOrder(ILcom/ib/client/Contract;Lcom/ib/client/Order;Lcom/ib/client/OrderState;)Ljava/lang/String;: I303 Branch 10 IFLE L137 - true
   * Goal 2. com.ib.client.EWrapperMsgGenerator.openOrder(ILcom/ib/client/Contract;Lcom/ib/client/Order;Lcom/ib/client/OrderState;)Ljava/lang/String;: I371 Branch 13 IFNULL L147 - true
   * Goal 3. com.ib.client.EWrapperMsgGenerator.openOrder(ILcom/ib/client/Contract;Lcom/ib/client/Order;Lcom/ib/client/OrderState;)Ljava/lang/String;: I409 Branch 14 IFNE L155 - true
   */

  @Test
  public void test01()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      Order order0 = new Order();
      OrderState orderState0 = new OrderState("h[z&:kipZkihdWJYd]J", (String) null, (String) null, "pELGO5", 0, Integer.MAX_VALUE, 0.0, "", (String) null);
      String string0 = EWrapperMsgGenerator.openOrder(0, contractDetails0.m_summary, order0, orderState0);
      assertEquals("open order: orderId=0 action=null quantity=0 symbol=null exchange=null secType=null type=null lmtPrice=0.0 auxPrice=0.0 TIF=null localSymbol=null client Id=0 parent Id=0 permId=0 outsideRth=false hidden=false discretionaryAmt=0.0 triggerMethod=0 goodAfterTime=null goodTillDate=null faGroup=null faMethod=null faPercentage=null faProfile=null shortSaleSlot=0 designatedLocation= ocaGroup=null ocaType=0 rule80A=null allOrNone=false minQty=2147483647 percentOffset=1.7976931348623157E308 eTradeOnly=false firmQuoteOnly=false nbboPriceCap=1.7976931348623157E308 auctionStrategy=0 startingPrice=1.7976931348623157E308 stockRefPrice=1.7976931348623157E308 delta=1.7976931348623157E308 stockRangeLower=1.7976931348623157E308 stockRangeUpper=1.7976931348623157E308 volatility=1.7976931348623157E308 volatilityType=2147483647 deltaNeutralOrderType= deltaNeutralAuxPrice=1.7976931348623157E308 continuousUpdate=0 referencePriceType=2147483647 trailStopPrice=1.7976931348623157E308 scaleInitLevelSize= scaleSubsLevelSize= scalePriceIncrement= account=null settlingFirm=null clearingAccount=null clearingIntent=null notHeld=false whatIf=false status=null initMargin=null maintMargin=null equityWithLoan=pELGO5 commission=0.0 minCommission=2.147483647E9 maxCommission=0.0 commissionCurrency= warningText=null", string0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I29 Branch 3 IFEQ L40 - false
   */

  @Test
  public void test02()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(15, 15, (double) 15, (double) (-2074), (double) 15, (double) 15);
      assertEquals("id=15  13WeekLow: vol = 15.0 delta = N/A", string0);
  }

  //Test case number: 3
  /*
   * 3 covered goals:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I22 Branch 2 IFLT L40 - false
   * Goal 2. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I29 Branch 3 IFEQ L40 - true
   * Goal 3. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I49 Branch 4 IFGT L40 - true
   */

  @Test
  public void test03()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(4052, 4052, 1.7976931348623157E308, 3153.3412, (double) 4052, 1.7976931348623157E308);
      assertEquals("id=4052  unknown: vol = N/A delta = N/A", string0);
  }

  //Test case number: 4
  /*
   * 3 covered goals:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I22 Branch 2 IFLT L40 - true
   * Goal 2. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I49 Branch 4 IFGT L40 - false
   * Goal 3. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I69 Branch 5 IF_ICMPNE L43 - true
   */

  @Test
  public void test04()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation((-16), (-805), (double) (-805), (double) 0, 0.0, 0.0);
      assertEquals("id=-16  unknown: vol = N/A delta = 0.0", string0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickPrice(IIDI)Ljava/lang/String;: I24 Branch 1 IFEQ L30 - false
   */

  @Test
  public void test05()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice(0, 0, 0.0, (-2953));
      assertEquals("id=0  bidSize=0.0  canAutoExecute", string0);
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickPrice(IIDI)Ljava/lang/String;: I24 Branch 1 IFEQ L30 - true
   */

  @Test
  public void test06()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice(0, 0, 0.0, 0);
      assertEquals("id=0  bidSize=0.0  noAutoExecute", string0);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updateMktDepth(IIIIDI)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test07()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepth(0, 0, Integer.MAX_VALUE, 4616, (-935.3454695199831), 0);
      assertEquals("updateMktDepth: 0 0 2147483647 4616 -935.3454695199831 0", string0);
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickString(IILjava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test08()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickString(0, 0, "");
      assertEquals("id=0  bidSize=", string0);
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.deltaNeutralValidation(ILcom/ib/client/UnderComp;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test09()  throws Throwable  {
      UnderComp underComp0 = new UnderComp();
      String string0 = EWrapperMsgGenerator.deltaNeutralValidation(0, underComp0);
      assertEquals("id = 0 underComp.conId =0 underComp.delta =0.0 underComp.price =0.0", string0);
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updateNewsBulletin(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test10()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateNewsBulletin(0, 0, "Connection Closed", "");
      assertEquals("MsgId=0 :: MsgType=0 :: Origin= :: Message=Connection Closed", string0);
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.fundamentalData(ILjava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test11()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.fundamentalData(0, "M*");
      assertEquals("id  = 0 len = 2\nM*", string0);
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updatePortfolio(Lcom/ib/client/Contract;IDDDDDLjava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try {
        String string0 = EWrapperMsgGenerator.updatePortfolio((Contract) null, 2030, (-1217.2), (double) 4052, (double) 4052, (double) 4052, 1.0, "id=4052  unknown: vol = N/A delta = N/A");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updateAccountValue(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test13()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountValue("qQumv5|(op)v;", "qQumv5|(op)v;", "qQumv5|(op)v;", "M*");
      assertEquals("updateAccountValue: qQumv5|(op)v; qQumv5|(op)v; qQumv5|(op)v; M*", string0);
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.receiveFA(ILjava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test14()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.receiveFA(15, (String) null);
      assertEquals("FA: null null", string0);
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.contractDetailsEnd(I)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test15()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.contractDetailsEnd((-1659));
      assertEquals("reqId = -1659 =============== end ===============", string0);
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickSnapshotEnd(I)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test16()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSnapshotEnd(0);
      assertEquals("id=0 =============== end ===============", string0);
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.orderStatus(ILjava/lang/String;IIDIIDILjava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test17()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.orderStatus(0, "ydB~@Z9B9TyxybZR)/p", 1488, 0, (double) 1488, (-805), 6440, (double) 6440, (-805), "demit");
      assertEquals("order status: orderId=0 clientId=-805 permId=-805 status=ydB~@Z9B9TyxybZR)/p filled=1488 remaining=0 avgFillPrice=1488.0 lastFillPrice=6440.0 parent Id=6440 whyHeld=demit", string0);
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.scannerDataEnd(I)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test18()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerDataEnd((-862));
      assertEquals("id = -862 =============== end ===============", string0);
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickGeneric(IID)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test19()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickGeneric(15, 15, 2293.824);
      assertEquals("id=15  13WeekLow=2293.824", string0);
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.managedAccounts(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test20()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.managedAccounts("c`&-y^'ac|%3<");
      assertEquals("Connected : The list of managed accounts are : [c`&-y^'ac|%3<]", string0);
  }

  //Test case number: 21
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.<init>()V: root-Branch
   */

  @Test
  public void test21()  throws Throwable  {
      EWrapperMsgGenerator eWrapperMsgGenerator0 = new EWrapperMsgGenerator();
      assertEquals(" =============== end ===============", eWrapperMsgGenerator0.openOrderEnd());
  }

  //Test case number: 22
  /*
   * 3 covered goals:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.contractDetails(ILcom/ib/client/ContractDetails;)Ljava/lang/String;: root-Branch
   * Goal 2. com.ib.client.EWrapperMsgGenerator.contractDetailsMsg(Lcom/ib/client/ContractDetails;)Ljava/lang/String;: root-Branch
   * Goal 3. com.ib.client.EWrapperMsgGenerator.contractMsg(Lcom/ib/client/Contract;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test22()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.contractDetails(0, contractDetails0);
      assertEquals("reqId = 0 ===================================\n ---- Contract Details begin ----\nconid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\nmarketName = null\ntradingClass = null\nminTick = 0.0\nprice magnifier = 0\norderTypes = null\nvalidExchanges = null\nunderConId = 0\nlongName = null\ncontractMonth = null\nindustry = null\ncategory = null\nsubcategory = null\ntimeZoneId = null\ntradingHours = null\nliquidHours = null\n ---- Contract Details End ----\n", string0);
  }

  //Test case number: 23
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.accountDownloadEnd(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test23()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.accountDownloadEnd((String) null);
      assertEquals("accountDownloadEnd: null", string0);
  }

  //Test case number: 24
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updateMktDepthL2(IILjava/lang/String;IIDI)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test24()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepthL2(0, (-1807), "tieOutputLayer", 0, 0, 122.1331890612, 15);
      assertEquals("updateMktDepth: 0 -1807 tieOutputLayer 0 0 122.1331890612 15", string0);
  }

  //Test case number: 25
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.bondContractDetails(ILcom/ib/client/ContractDetails;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test25()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.bondContractDetails((-2231), contractDetails0);
      assertEquals("reqId = -2231 ===================================\n ---- Bond Contract Details begin ----\nsymbol = null\nsecType = null\ncusip = null\ncoupon = 0.0\nmaturity = null\nissueDate = null\nratings = null\nbondType = null\ncouponType = null\nconvertible = false\ncallable = false\nputable = false\ndescAppend = null\nexchange = null\ncurrency = null\nmarketName = null\ntradingClass = null\nconid = 0\nminTick = 0.0\norderTypes = null\nvalidExchanges = null\nnextOptionDate = null\nnextOptionType = null\nnextOptionPartial = false\nnotes = null\nlongName = null\n ---- Bond Contract Details End ----\n", string0);
  }

  //Test case number: 26
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.scannerData(IILcom/ib/client/ContractDetails;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test26()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.scannerData(4, (-699), contractDetails0, "id=4  lastPrice=4.0  canAutoExecute", (String) null, (String) null, "(n*");
      assertEquals("id = 4 rank=-699 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance=id=4  lastPrice=4.0  canAutoExecute benchmark=null projection=null legsStr=(n*", string0);
  }

  //Test case number: 27
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.realtimeBar(IJDDDDJDI)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test27()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.realtimeBar(18, (long) 0, 0.0, 0.0, 0.0, 0.0, (long) 0, 0.0, 2);
      assertEquals("id=18 time = 0 open=0.0 high=0.0 low=0.0 close=0.0 volume=0 count=2 WAP=0.0", string0);
  }

  //Test case number: 28
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.nextValidId(I)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test28()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.nextValidId(4052);
      assertEquals("Next Valid Order ID: 4052", string0);
  }

  //Test case number: 29
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.execDetailsEnd(I)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test29()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.execDetailsEnd(0);
      assertEquals("reqId = 0 =============== end ===============", string0);
  }

  //Test case number: 30
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.currentTime(J)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test30()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.currentTime((long) 18);
      assertEquals("current time = 18 (Jan 1, 1970 12:00:18 AM)", string0);
  }

  //Test case number: 31
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.openOrderEnd()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test31()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.openOrderEnd();
      assertEquals(" =============== end ===============", string0);
  }

  //Test case number: 32
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickEFP(IIDLjava/lang/String;DILjava/lang/String;DD)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test32()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickEFP(4052, 4052, (-1217.2), "id=4052  unknown: vol = N/A delta = N/A", (-1217.2), 4052, "m[-K84hrb.b", (double) 4052, (-1217.2));
      assertEquals("id=4052  unknown: basisPoints = -1217.2/id=4052  unknown: vol = N/A delta = N/A impliedFuture = -1217.2 holdDays = 4052 futureExpiry = m[-K84hrb.b dividendImpact = 4052.0 dividends to expiry = -1217.2", string0);
  }

  //Test case number: 33
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.execDetails(ILcom/ib/client/Contract;Lcom/ib/client/Execution;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test33()  throws Throwable  {
      Contract contract0 = new Contract();
      Execution execution0 = new Execution(3222, 0, "", "SAq{TRu.H)}}", (String) null, " =============== end ===============", "\"8fHqR", 0, 0.0, 0, 0, (-1908), 0.0);
      String string0 = EWrapperMsgGenerator.execDetails(11, contract0, execution0);
      assertEquals(" ---- Execution Details begin ----\nreqId = 11\norderId = 3222\nclientId = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\ncontractExchange = null\ncurrency = null\nlocalSymbol = null\nexecId = \ntime = SAq{TRu.H)}}\nacctNumber = null\nexecutionExchange =  =============== end ===============\nside = \"8fHqR\nshares = 0\nprice = 0.0\npermId = 0\nliquidation = 0\ncumQty = -1908\navgPrice = 0.0\n ---- Execution Details end ----\n", string0);
  }

  //Test case number: 34
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickSize(III)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test34()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSize(0, 0, 0);
      assertEquals("id=0  bidSize=0", string0);
  }

  //Test case number: 35
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.scannerParameters(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test35()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerParameters((String) null);
      assertEquals("SCANNER PARAMETERS:\nnull", string0);
  }

  //Test case number: 36
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.historicalData(ILjava/lang/String;DDDDIIDZ)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test36()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.historicalData(0, (String) null, (double) 0, 0.0, 1.7976931348623157E308, 1.7976931348623157E308, 0, (-1807), (-378.2534363488), false);
      assertEquals("id=0 date = null open=0.0 high=0.0 low=1.7976931348623157E308 close=1.7976931348623157E308 volume=0 count=-1807 WAP=-378.2534363488 hasGaps=false", string0);
  }

  //Test case number: 37
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updateAccountTime(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test37()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountTime("reqId = 0 =============== end ===============");
      assertEquals("updateAccountTime: reqId = 0 =============== end ===============", string0);
  }
}
/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 13 05:34:12 GMT 2015
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
   * Goal 1. com.ib.client.EWrapperMsgGenerator.openOrder(ILcom/ib/client/Contract;Lcom/ib/client/Order;Lcom/ib/client/OrderState;)Ljava/lang/String;: I303 Branch 10 IFLE L137 - true
   * Goal 2. com.ib.client.EWrapperMsgGenerator.openOrder(ILcom/ib/client/Contract;Lcom/ib/client/Order;Lcom/ib/client/OrderState;)Ljava/lang/String;: I371 Branch 13 IFNULL L147 - true
   * Goal 3. com.ib.client.EWrapperMsgGenerator.openOrder(ILcom/ib/client/Contract;Lcom/ib/client/Order;Lcom/ib/client/OrderState;)Ljava/lang/String;: I409 Branch 14 IFNE L155 - true
   */

  @Test
  public void test00()  throws Throwable  {
      Contract contract0 = new Contract(4332, "summit", "summit", "", 1.7976931348623157E308, "", "", " volatility=", "", "", (Vector) null, (String) null, false, "}", "");
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.openOrder(4332, contract0, order0, orderState0);
      assertEquals("open order: orderId=4332 action=null quantity=0 symbol=summit exchange= volatility= secType=summit type=null lmtPrice=0.0 auxPrice=0.0 TIF=null localSymbol= client Id=0 parent Id=0 permId=0 outsideRth=false hidden=false discretionaryAmt=0.0 triggerMethod=0 goodAfterTime=null goodTillDate=null faGroup=null faMethod=null faPercentage=null faProfile=null shortSaleSlot=0 designatedLocation= ocaGroup=null ocaType=0 rule80A=null allOrNone=false minQty=2147483647 percentOffset=1.7976931348623157E308 eTradeOnly=false firmQuoteOnly=false nbboPriceCap=1.7976931348623157E308 auctionStrategy=0 startingPrice=1.7976931348623157E308 stockRefPrice=1.7976931348623157E308 delta=1.7976931348623157E308 stockRangeLower=1.7976931348623157E308 stockRangeUpper=1.7976931348623157E308 volatility=1.7976931348623157E308 volatilityType=2147483647 deltaNeutralOrderType= deltaNeutralAuxPrice=1.7976931348623157E308 continuousUpdate=0 referencePriceType=2147483647 trailStopPrice=1.7976931348623157E308 scaleInitLevelSize= scaleSubsLevelSize= scalePriceIncrement= account=null settlingFirm=null clearingAccount=null clearingIntent=null notHeld=false whatIf=false status=null initMargin=null maintMargin=null equityWithLoan=null commission=0.0 minCommission=0.0 maxCommission=0.0 commissionCurrency=null warningText=null", string0);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I85 Branch 6 IFLT L44 - true
   * Goal 2. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I120 Branch 8 IFLT L45 - true
   */

  @Test
  public void test01()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, (-5.114879088863647), (-5.114879088863647), (-5.114879088863647), (-5.114879088863647));
      assertEquals("id=13  modelOptComp: vol = N/A delta = N/A: modelPrice = N/A: pvDividend = N/A", string0);
  }

  //Test case number: 2
  /*
   * 6 covered goals:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I29 Branch 3 IFEQ L40 - false
   * Goal 2. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I69 Branch 5 IF_ICMPNE L43 - false
   * Goal 3. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I85 Branch 6 IFLT L44 - false
   * Goal 4. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I92 Branch 7 IFEQ L44 - false
   * Goal 5. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I120 Branch 8 IFLT L45 - false
   * Goal 6. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I127 Branch 9 IFEQ L45 - false
   */

  @Test
  public void test02()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, (double) 22, (double) 22, 0.0, 0.0);
      assertEquals("id=13  modelOptComp: vol = 22.0 delta = N/A: modelPrice = 0.0: pvDividend = 0.0", string0);
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
      String string0 = EWrapperMsgGenerator.tickOptionComputation(2328, 2328, 1.7976931348623157E308, (double) 2328, (double) 2328, (double) 2328);
      assertEquals("id=2328  unknown: vol = N/A delta = N/A", string0);
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
      String string0 = EWrapperMsgGenerator.tickOptionComputation(4629, 4629, (-1.0), (-1.0), (-1.0), (double) 4629);
      assertEquals("id=4629  unknown: vol = N/A delta = -1.0", string0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickPrice(IIDI)Ljava/lang/String;: I24 Branch 1 IFEQ L30 - false
   */

  @Test
  public void test05()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice((-925), 499, (double) 499, (-925));
      assertEquals("id=-925  unknown=499.0  canAutoExecute", string0);
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickPrice(IIDI)Ljava/lang/String;: I24 Branch 1 IFEQ L30 - true
   */

  @Test
  public void test06()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice(1621, (-2876), (double) (-2876), 0);
      assertEquals("id=1621  unknown=-2876.0  noAutoExecute", string0);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updateMktDepth(IIIIDI)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test07()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepth(499, (-925), 499, 499, (double) 499, (-925));
      assertEquals("updateMktDepth: 499 -925 499 499 499.0 -925", string0);
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickString(IILjava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test08()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickString(0, 0, " discretionaryAmt=");
      assertEquals("id=0  bidSize= discretionaryAmt=", string0);
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
      String string0 = EWrapperMsgGenerator.updateNewsBulletin(4332, (-1), (String) null, "p_(4F<qC");
      assertEquals("MsgId=4332 :: MsgType=-1 :: Origin=p_(4F<qC :: Message=null", string0);
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.fundamentalData(ILjava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test11()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.fundamentalData(2328, "R-b`_!XAVW");
      assertEquals("id  = 2328 len = 10\nR-b`_!XAVW", string0);
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updatePortfolio(Lcom/ib/client/Contract;IDDDDDLjava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test12()  throws Throwable  {
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.updatePortfolio(contract0, 0, 728.3181, (-4311.9883), 0.0, 0.0, (double) (-925), "H)rv");
      assertEquals("updatePortfolio: conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n0 728.3181 -4311.9883 0.0 0.0 -925.0 H)rv", string0);
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updateAccountValue(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test13()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountValue("", "DQG-p8jb54yG.CmR\"", "DQG-p8jb54yG.CmR\"", (String) null);
      assertEquals("updateAccountValue:  DQG-p8jb54yG.CmR\" DQG-p8jb54yG.CmR\" null", string0);
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.receiveFA(ILjava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test14()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.receiveFA(0, " =============== end ===============");
      assertEquals("FA: null  =============== end ===============", string0);
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.contractDetailsEnd(I)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test15()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.contractDetailsEnd(0);
      assertEquals("reqId = 0 =============== end ===============", string0);
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickSnapshotEnd(I)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test16()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSnapshotEnd(4332);
      assertEquals("id=4332 =============== end ===============", string0);
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.orderStatus(ILjava/lang/String;IIDIIDILjava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test17()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.orderStatus(3543, "=Di0 %2i", 4629, 3543, (double) 4629, 3543, 3543, (-1381.381739), 3543, "4629 | 4629 |  remaining=");
      assertEquals("order status: orderId=3543 clientId=3543 permId=3543 status==Di0 %2i filled=4629 remaining=3543 avgFillPrice=4629.0 lastFillPrice=-1381.381739 parent Id=3543 whyHeld=4629 | 4629 |  remaining=", string0);
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.scannerDataEnd(I)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test18()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerDataEnd((-793));
      assertEquals("id = -793 =============== end ===============", string0);
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickGeneric(IID)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test19()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickGeneric(4332, 4332, 1.0);
      assertEquals("id=4332  unknown=1.0", string0);
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.managedAccounts(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test20()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.managedAccounts((String) null);
      assertEquals("Connected : The list of managed accounts are : [null]", string0);
  }

  //Test case number: 21
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.<init>()V: root-Branch
   */

  @Test
  public void test21()  throws Throwable  {
      EWrapperMsgGenerator eWrapperMsgGenerator0 = new EWrapperMsgGenerator();
      assertEquals("Connection Closed", eWrapperMsgGenerator0.connectionClosed());
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
      String string0 = EWrapperMsgGenerator.contractDetails((-1993), contractDetails0);
      assertEquals("reqId = -1993 ===================================\n ---- Contract Details begin ----\nconid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\nmarketName = null\ntradingClass = null\nminTick = 0.0\nprice magnifier = 0\norderTypes = null\nvalidExchanges = null\nunderConId = 0\nlongName = null\ncontractMonth = null\nindustry = null\ncategory = null\nsubcategory = null\ntimeZoneId = null\ntradingHours = null\nliquidHours = null\n ---- Contract Details End ----\n", string0);
  }

  //Test case number: 23
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.accountDownloadEnd(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test23()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.accountDownloadEnd("");
      assertEquals("accountDownloadEnd: ", string0);
  }

  //Test case number: 24
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updateMktDepthL2(IILjava/lang/String;IIDI)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test24()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepthL2((-793), (-793), (String) null, (-793), (-793), (double) (-793), (-3631));
      assertEquals("updateMktDepth: -793 -793 null -793 -793 -793.0 -3631", string0);
  }

  //Test case number: 25
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.bondContractDetails(ILcom/ib/client/ContractDetails;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test25()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.bondContractDetails(1095, contractDetails0);
      assertEquals("reqId = 1095 ===================================\n ---- Bond Contract Details begin ----\nsymbol = null\nsecType = null\ncusip = null\ncoupon = 0.0\nmaturity = null\nissueDate = null\nratings = null\nbondType = null\ncouponType = null\nconvertible = false\ncallable = false\nputable = false\ndescAppend = null\nexchange = null\ncurrency = null\nmarketName = null\ntradingClass = null\nconid = 0\nminTick = 0.0\norderTypes = null\nvalidExchanges = null\nnextOptionDate = null\nnextOptionType = null\nnextOptionPartial = false\nnotes = null\nlongName = null\n ---- Bond Contract Details End ----\n", string0);
  }

  //Test case number: 26
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.scannerData(IILcom/ib/client/ContractDetails;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test26()  throws Throwable  {
      Contract contract0 = new Contract(4332, "summit", "summit", "", 1.7976931348623157E308, "", "", " volatility=", "", "", (Vector) null, (String) null, false, "}", "");
      ContractDetails contractDetails0 = new ContractDetails(contract0, "summit", (String) null, 1.7976931348623157E308, "id=4332  unknown=1.0", "summit", 13, (String) null, " currency=", (String) null, (String) null, (String) null, "E;0P+mN/!h5:\"", "p_(4F<qC", "open order: orderId=4332 action=null quantity=0 symbol=summit exchange= volatility= secType=summit type=null lmtPrice=0.0 auxPrice=0.0 TIF=null localSymbol= client Id=0 parent Id=0 permId=0 outsideRth=false hidden=false discretionaryAmt=0.0 triggerMethod=0 goodAfterTime=null goodTillDate=null faGroup=null faMethod=null faPercentage=null faProfile=null shortSaleSlot=0 designatedLocation= ocaGroup=null ocaType=0 rule80A=null allOrNone=false minQty=2147483647 percentOffset=1.7976931348623157E308 eTradeOnly=false firmQuoteOnly=false nbboPriceCap=1.7976931348623157E308 auctionStrategy=0 startingPrice=1.7976931348623157E308 stockRefPrice=1.7976931348623157E308 delta=1.7976931348623157E308 stockRangeLower=1.7976931348623157E308 stockRangeUpper=1.7976931348623157E308 volatility=1.7976931348623157E308 volatilityType=2147483647 deltaNeutralOrderType= deltaNeutralAuxPrice=1.7976931348623157E308 continuousUpdate=0 referencePriceType=2147483647 trailStopPrice=1.7976931348623157E308 scaleInitLevelSize= scaleSubsLevelSize= scalePriceIncrement= account=null settlingFirm=null clearingAccount=null clearingIntent=null notHeld=false whatIf=false status=null initMargin=null maintMargin=null equityWithLoan=null commission=0.0 minCommission=0.0 maxCommission=0.0 commissionCurrency=null warningText=null");
      String string0 = EWrapperMsgGenerator.scannerData((-1), 4332, contractDetails0, "0?S", " volatility=", "p_(4F<qC", (String) null);
      assertEquals("id = -1 rank=4332 symbol=summit secType=summit expiry= strike=1.7976931348623157E308 right= exchange= volatility= currency= localSymbol= marketName=summit tradingClass=null distance=0?S benchmark= volatility= projection=p_(4F<qC legsStr=null", string0);
  }

  //Test case number: 27
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.realtimeBar(IJDDDDJDI)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test27()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.realtimeBar(13, (long) 13, 0.0, 0.0, (double) 13, 0.0, (long) 22, (double) 13, 22);
      assertEquals("id=13 time = 13 open=0.0 high=0.0 low=13.0 close=0.0 volume=22 count=22 WAP=13.0", string0);
  }

  //Test case number: 28
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.nextValidId(I)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test28()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.nextValidId(0);
      assertEquals("Next Valid Order ID: 0", string0);
  }

  //Test case number: 29
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.execDetailsEnd(I)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test29()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.execDetailsEnd(272);
      assertEquals("reqId = 272 =============== end ===============", string0);
  }

  //Test case number: 30
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.currentTime(J)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test30()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.currentTime((long) (-1993));
      assertEquals("current time = -1993 (Dec 31, 1969 11:26:47 PM)", string0);
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
      String string0 = EWrapperMsgGenerator.tickEFP(1095, 1095, (double) 1095, "id=1095  unknown=1095", 0.0, 0, "id=1095  unknown=1095", 0.0, (double) 0);
      assertEquals("id=1095  unknown: basisPoints = 1095.0/id=1095  unknown=1095 impliedFuture = 0.0 holdDays = 0 futureExpiry = id=1095  unknown=1095 dividendImpact = 0.0 dividends to expiry = 0.0", string0);
  }

  //Test case number: 33
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.execDetails(ILcom/ib/client/Contract;Lcom/ib/client/Execution;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test33()  throws Throwable  {
      Contract contract0 = new Contract();
      // Undeclared exception!
      try {
        String string0 = EWrapperMsgGenerator.execDetails(499, contract0, (Execution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 34
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickSize(III)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test34()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSize(1095, 1095, 1095);
      assertEquals("id=1095  unknown=1095", string0);
  }

  //Test case number: 35
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.scannerParameters(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test35()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerParameters("updateAccountTime: 1%Sr0Q");
      assertEquals("SCANNER PARAMETERS:\nupdateAccountTime: 1%Sr0Q", string0);
  }

  //Test case number: 36
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.historicalData(ILjava/lang/String;DDDDIIDZ)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test36()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.historicalData(0, "&,]z59{P&zYX#`n(TJ", (double) 0, (double) 0, 0.0, 0.0, 0, 0, 0.0, false);
      assertEquals("id=0 date = &,]z59{P&zYX#`n(TJ open=0.0 high=0.0 low=0.0 close=0.0 volume=0 count=0 WAP=0.0 hasGaps=false", string0);
  }

  //Test case number: 37
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updateAccountTime(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test37()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountTime("1%Sr0Q");
      assertEquals("updateAccountTime: 1%Sr0Q", string0);
  }
}

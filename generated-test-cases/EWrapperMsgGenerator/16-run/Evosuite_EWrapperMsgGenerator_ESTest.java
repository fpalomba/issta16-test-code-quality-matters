/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 13 05:25:23 GMT 2015
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
      ContractDetails contractDetails0 = new ContractDetails();
      Order order0 = new Order();
      OrderState orderState0 = new OrderState("{0HLGhX,GPw/", (String) null, (String) null, (String) null, 1.7976931348623157E308, 0.0, 0, "", "repour");
      String string0 = EWrapperMsgGenerator.openOrder((-2174), contractDetails0.m_summary, order0, orderState0);
      assertEquals("open order: orderId=-2174 action=null quantity=0 symbol=null exchange=null secType=null type=null lmtPrice=0.0 auxPrice=0.0 TIF=null localSymbol=null client Id=0 parent Id=0 permId=0 outsideRth=false hidden=false discretionaryAmt=0.0 triggerMethod=0 goodAfterTime=null goodTillDate=null faGroup=null faMethod=null faPercentage=null faProfile=null shortSaleSlot=0 designatedLocation= ocaGroup=null ocaType=0 rule80A=null allOrNone=false minQty=2147483647 percentOffset=1.7976931348623157E308 eTradeOnly=false firmQuoteOnly=false nbboPriceCap=1.7976931348623157E308 auctionStrategy=0 startingPrice=1.7976931348623157E308 stockRefPrice=1.7976931348623157E308 delta=1.7976931348623157E308 stockRangeLower=1.7976931348623157E308 stockRangeUpper=1.7976931348623157E308 volatility=1.7976931348623157E308 volatilityType=2147483647 deltaNeutralOrderType= deltaNeutralAuxPrice=1.7976931348623157E308 continuousUpdate=0 referencePriceType=2147483647 trailStopPrice=1.7976931348623157E308 scaleInitLevelSize= scaleSubsLevelSize= scalePriceIncrement= account=null settlingFirm=null clearingAccount=null clearingIntent=null notHeld=false whatIf=false status=null initMargin=null maintMargin=null equityWithLoan=null commission= minCommission=0.0 maxCommission=0.0 commissionCurrency= warningText=repour", string0);
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I85 Branch 6 IFLT L44 - false
   * Goal 2. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I92 Branch 7 IFEQ L44 - false
   * Goal 3. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I120 Branch 8 IFLT L45 - true
   */

  @Test
  public void test01()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, (double) 13, (-2.099436006433769), (double) 13, (-2.099436006433769));
      assertEquals("id=13  modelOptComp: vol = 13.0 delta = N/A: modelPrice = 13.0: pvDividend = N/A", string0);
  }

  //Test case number: 2
  /*
   * 5 covered goals:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I29 Branch 3 IFEQ L40 - false
   * Goal 2. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I69 Branch 5 IF_ICMPNE L43 - false
   * Goal 3. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I85 Branch 6 IFLT L44 - true
   * Goal 4. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I120 Branch 8 IFLT L45 - false
   * Goal 5. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I127 Branch 9 IFEQ L45 - false
   */

  @Test
  public void test02()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, (double) 13, (double) 13, (-2.099436006433769), (double) 13);
      assertEquals("id=13  modelOptComp: vol = 13.0 delta = N/A: modelPrice = N/A: pvDividend = 13.0", string0);
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
      String string0 = EWrapperMsgGenerator.tickOptionComputation((-534), (-534), 1.7976931348623157E308, (double) (-534), (-3003.779877854292), 1.7976931348623157E308);
      assertEquals("id=-534  unknown: vol = N/A delta = N/A", string0);
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
      String string0 = EWrapperMsgGenerator.tickOptionComputation((-129), 0, (double) (-129), 0.0, 1.7976931348623157E308, 0.0);
      assertEquals("id=-129  bidSize: vol = N/A delta = 0.0", string0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickPrice(IIDI)Ljava/lang/String;: I24 Branch 1 IFEQ L30 - false
   */

  @Test
  public void test05()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice((-662), (-662), (double) (-662), (-662));
      assertEquals("id=-662  unknown=-662.0  canAutoExecute", string0);
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickPrice(IIDI)Ljava/lang/String;: I24 Branch 1 IFEQ L30 - true
   */

  @Test
  public void test06()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice(0, 0, (double) 0, 0);
      assertEquals("id=0  bidSize=0.0  noAutoExecute", string0);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updateMktDepth(IIIIDI)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test07()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepth(0, 0, 0, 0, 0.0, 674);
      assertEquals("updateMktDepth: 0 0 0 0 0.0 674", string0);
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
      String string0 = EWrapperMsgGenerator.deltaNeutralValidation(3880, underComp0);
      assertEquals("id = 3880 underComp.conId =0 underComp.delta =0.0 underComp.price =0.0", string0);
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updateNewsBulletin(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test10()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateNewsBulletin(1572, 2250, "A0gII:qn1b j", "71(i");
      assertEquals("MsgId=1572 :: MsgType=2250 :: Origin=71(i :: Message=A0gII:qn1b j", string0);
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.fundamentalData(ILjava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test11()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.fundamentalData((-662), "updateAccountTime: *P*");
      assertEquals("id  = -662 len = 22\nupdateAccountTime: *P*", string0);
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updatePortfolio(Lcom/ib/client/Contract;IDDDDDLjava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test12()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      Contract contract0 = new Contract(2250, "uNi1Os<'INCvn!gi", "uNi1Os<'INCvn!gi", "E^i3uB/u)M", (double) 1572, "q>6LN%\"", "q>6LN%\"", "q>6LN%\"", "]z{Pz'L=s DtJMA=-\"", "]z{Pz'L=s DtJMA=-\"", (Vector) vector0, (String) null, false, "G&fw>", "]z{Pz'L=s DtJMA=-\"");
      String string0 = EWrapperMsgGenerator.updatePortfolio(contract0, 2250, 1572.0, (double) 1572, 0.0, (double) 1572, 1572.0, "]z{Pz'L=s DtJMA=-\"");
      assertEquals("updatePortfolio: conid = 2250\nsymbol = uNi1Os<'INCvn!gi\nsecType = uNi1Os<'INCvn!gi\nexpiry = E^i3uB/u)M\nstrike = 1572.0\nright = q>6LN%\"\nmultiplier = q>6LN%\"\nexchange = q>6LN%\"\nprimaryExch = null\ncurrency = ]z{Pz'L=s DtJMA=-\"\nlocalSymbol = ]z{Pz'L=s DtJMA=-\"\n2250 1572.0 1572.0 0.0 1572.0 1572.0 ]z{Pz'L=s DtJMA=-\"", string0);
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updateAccountValue(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test13()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountValue((String) null, "Next Valid Order ID: 1856", "id = ", "Next Valid Order ID: 1856");
      assertEquals("updateAccountValue: null Next Valid Order ID: 1856 id =  Next Valid Order ID: 1856", string0);
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.receiveFA(ILjava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test14()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.receiveFA(1462, "id=-662  unknown=-662.0  canAutoExecute");
      assertEquals("FA: null id=-662  unknown=-662.0  canAutoExecute", string0);
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.contractDetailsEnd(I)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test15()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.contractDetailsEnd(3880);
      assertEquals("reqId = 3880 =============== end ===============", string0);
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickSnapshotEnd(I)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test16()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSnapshotEnd(13);
      assertEquals("id=13 =============== end ===============", string0);
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.orderStatus(ILjava/lang/String;IIDIIDILjava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test17()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.orderStatus(0, (String) null, 33, 33, (double) 33, 33, 0, (double) 33, 0, "Error - org.evosuite.runtime.mock.java.lang.MockThrowable");
      assertEquals("order status: orderId=0 clientId=0 permId=33 status=null filled=33 remaining=33 avgFillPrice=33.0 lastFillPrice=33.0 parent Id=0 whyHeld=Error - org.evosuite.runtime.mock.java.lang.MockThrowable", string0);
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.scannerDataEnd(I)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test18()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerDataEnd(3670);
      assertEquals("id = 3670 =============== end ===============", string0);
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickGeneric(IID)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test19()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickGeneric(0, 0, (double) 0);
      assertEquals("id=0  bidSize=0.0", string0);
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
      String string0 = EWrapperMsgGenerator.contractDetails(3880, contractDetails0);
      assertEquals("reqId = 3880 ===================================\n ---- Contract Details begin ----\nconid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\nmarketName = null\ntradingClass = null\nminTick = 0.0\nprice magnifier = 0\norderTypes = null\nvalidExchanges = null\nunderConId = 0\nlongName = null\ncontractMonth = null\nindustry = null\ncategory = null\nsubcategory = null\ntimeZoneId = null\ntradingHours = null\nliquidHours = null\n ---- Contract Details End ----\n", string0);
  }

  //Test case number: 23
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.accountDownloadEnd(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test23()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.accountDownloadEnd("_LP");
      assertEquals("accountDownloadEnd: _LP", string0);
  }

  //Test case number: 24
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updateMktDepthL2(IILjava/lang/String;IIDI)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test24()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepthL2(0, 0, (String) null, (-90), 0, (double) 0, 0);
      assertEquals("updateMktDepth: 0 0 null -90 0 0.0 0", string0);
  }

  //Test case number: 25
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.bondContractDetails(ILcom/ib/client/ContractDetails;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test25()  throws Throwable  {
      Contract contract0 = new Contract();
      ContractDetails contractDetails0 = new ContractDetails(contract0, (String) null, (String) null, 18.83846978375212, (String) null, "twA`~:", 1856, " =============== end ===============", "_LP", (String) null, " scaleInitLevelSize=", " AH?oG", (String) null, (String) null, (String) null);
      String string0 = EWrapperMsgGenerator.bondContractDetails(1856, contractDetails0);
      assertEquals("reqId = 1856 ===================================\n ---- Bond Contract Details begin ----\nsymbol = null\nsecType = null\ncusip = null\ncoupon = 0.0\nmaturity = null\nissueDate = null\nratings = null\nbondType = null\ncouponType = null\nconvertible = false\ncallable = false\nputable = false\ndescAppend = null\nexchange = null\ncurrency = null\nmarketName = null\ntradingClass = null\nconid = 0\nminTick = 18.83846978375212\norderTypes = null\nvalidExchanges = twA`~:\nnextOptionDate = null\nnextOptionType = null\nnextOptionPartial = false\nnotes = null\nlongName =  =============== end ===============\n ---- Bond Contract Details End ----\n", string0);
  }

  //Test case number: 26
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.scannerData(IILcom/ib/client/ContractDetails;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test26()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.scannerData(372, 372, contractDetails0, (String) null, (String) null, "0Q+(", (String) null);
      assertEquals("id = 372 rank=372 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance=null benchmark=null projection=0Q+( legsStr=null", string0);
  }

  //Test case number: 27
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.realtimeBar(IJDDDDJDI)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test27()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.realtimeBar(0, (long) 0, (double) 0, (-1158.204170828092), (double) 0, (double) (-2205), (long) 0, (double) 0, 22);
      assertEquals("id=0 time = 0 open=0.0 high=-1158.204170828092 low=0.0 close=-2205.0 volume=0 count=22 WAP=0.0", string0);
  }

  //Test case number: 28
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.nextValidId(I)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test28()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.nextValidId(1856);
      assertEquals("Next Valid Order ID: 1856", string0);
  }

  //Test case number: 29
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.execDetailsEnd(I)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test29()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.execDetailsEnd((-2904));
      assertEquals("reqId = -2904 =============== end ===============", string0);
  }

  //Test case number: 30
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.currentTime(J)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test30()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.currentTime(404L);
      assertEquals("current time = 404 (Jan 1, 1970 12:06:44 AM)", string0);
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
      String string0 = EWrapperMsgGenerator.tickEFP(13, 13, (-2.099436006433769), ".{", (-2.099436006433769), 13, "id=13  modelOptComp: vol = 13.0 delta = N/A: modelPrice = 13.0: pvDividend = N/A", (double) 0, (double) 0);
      assertEquals("id=13  modelOptComp: basisPoints = -2.099436006433769/.{ impliedFuture = -2.099436006433769 holdDays = 13 futureExpiry = id=13  modelOptComp: vol = 13.0 delta = N/A: modelPrice = 13.0: pvDividend = N/A dividendImpact = 0.0 dividends to expiry = 0.0", string0);
  }

  //Test case number: 33
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.execDetails(ILcom/ib/client/Contract;Lcom/ib/client/Execution;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test33()  throws Throwable  {
      Contract contract0 = new Contract();
      ContractDetails contractDetails0 = new ContractDetails(contract0, (String) null, (String) null, 18.83846978375212, (String) null, "twA`~:", 1856, " =============== end ===============", "_LP", (String) null, " scaleInitLevelSize=", " AH?oG", (String) null, (String) null, (String) null);
      Execution execution0 = new Execution(0, 1856, "\",OzC,.", (String) null, (String) null, (String) null, (String) null, 1856, (double) 0, 0, 3052, 1856, (-5074.2282936686));
      String string0 = EWrapperMsgGenerator.execDetails(0, contractDetails0.m_summary, execution0);
      assertEquals(" ---- Execution Details begin ----\nreqId = 0\norderId = 0\nclientId = 1856\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\ncontractExchange = null\ncurrency = null\nlocalSymbol = null\nexecId = \",OzC,.\ntime = null\nacctNumber = null\nexecutionExchange = null\nside = null\nshares = 1856\nprice = 0.0\npermId = 0\nliquidation = 3052\ncumQty = 1856\navgPrice = -5074.2282936686\n ---- Execution Details end ----\n", string0);
  }

  //Test case number: 34
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickSize(III)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test34()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSize(396, (-2854), (-2854));
      assertEquals("id=396  unknown=-2854", string0);
  }

  //Test case number: 35
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.scannerParameters(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test35()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerParameters("Error - org.evosuite.runtime.mock.java.lang.MockThrowable");
      assertEquals("SCANNER PARAMETERS:\nError - org.evosuite.runtime.mock.java.lang.MockThrowable", string0);
  }

  //Test case number: 36
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.historicalData(ILjava/lang/String;DDDDIIDZ)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test36()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.historicalData(0, (String) null, (double) 0, (double) 0, 1.0E-100, (double) 0, 372, 0, (double) 0, false);
      assertEquals("id=0 date = null open=0.0 high=0.0 low=1.0E-100 close=0.0 volume=372 count=0 WAP=0.0 hasGaps=false", string0);
  }

  //Test case number: 37
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updateAccountTime(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test37()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountTime("*P*");
      assertEquals("updateAccountTime: *P*", string0);
  }
}

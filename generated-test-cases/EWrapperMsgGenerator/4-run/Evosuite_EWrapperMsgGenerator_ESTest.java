/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 13 04:50:49 GMT 2015
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
import edu.stanford.nlp.ling.WordLemmaTag;
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
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.openOrder(ILcom/ib/client/Contract;Lcom/ib/client/Order;Lcom/ib/client/OrderState;)Ljava/lang/String;: I371 Branch 13 IFNULL L147 - false
   */

  @Test
  public void test00()  throws Throwable  {
      Contract contract0 = new Contract();
      UnderComp underComp0 = new UnderComp();
      contract0.m_underComp = underComp0;
      Order order0 = new Order();
      // Undeclared exception!
      try {
        String string0 = EWrapperMsgGenerator.openOrder((-940), contract0, order0, (OrderState) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
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
      Vector<WordLemmaTag> vector0 = new Vector<WordLemmaTag>();
      Contract contract0 = new Contract(1702, "jet", "", "", 0.0, "", "jet", "current time = 1702 (Jan 1, 1970 12:28:22 AM)", "jet", "", (Vector) vector0, "bondType = ", true, "jet", "bondType = ");
      ContractDetails contractDetails0 = new ContractDetails(contract0, "jet", "U1", 0.0, " expiry=", "JJ", (-1395), "twoStage", "bondType = ", "&LEB7s)?,<ql|@/)#K", "MU3R7rpz::%nC30", "jet", "next", "jet", "MsgId=");
      Order order0 = new Order();
      OrderState orderState0 = new OrderState("", "", "subcategory = ", "jet", 0.0, 0.0, 0.0, "twoStage", "=.2w1y:");
      String string0 = EWrapperMsgGenerator.openOrder((-1395), contractDetails0.m_summary, order0, orderState0);
      assertEquals("open order: orderId=-1395 action=null quantity=0 symbol=jet exchange=current time = 1702 (Jan 1, 1970 12:28:22 AM) secType= type=null lmtPrice=0.0 auxPrice=0.0 TIF=null localSymbol= client Id=0 parent Id=0 permId=0 outsideRth=false hidden=false discretionaryAmt=0.0 triggerMethod=0 goodAfterTime=null goodTillDate=null faGroup=null faMethod=null faPercentage=null faProfile=null shortSaleSlot=0 designatedLocation= ocaGroup=null ocaType=0 rule80A=null allOrNone=false minQty=2147483647 percentOffset=1.7976931348623157E308 eTradeOnly=false firmQuoteOnly=false nbboPriceCap=1.7976931348623157E308 auctionStrategy=0 startingPrice=1.7976931348623157E308 stockRefPrice=1.7976931348623157E308 delta=1.7976931348623157E308 stockRangeLower=1.7976931348623157E308 stockRangeUpper=1.7976931348623157E308 volatility=1.7976931348623157E308 volatilityType=2147483647 deltaNeutralOrderType= deltaNeutralAuxPrice=1.7976931348623157E308 continuousUpdate=0 referencePriceType=2147483647 trailStopPrice=1.7976931348623157E308 scaleInitLevelSize= scaleSubsLevelSize= scalePriceIncrement= account=null settlingFirm=null clearingAccount=null clearingIntent=null notHeld=false whatIf=false status=null initMargin= maintMargin=subcategory =  equityWithLoan=jet commission=0.0 minCommission=0.0 maxCommission=0.0 commissionCurrency=twoStage warningText==.2w1y:", string0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I92 Branch 7 IFEQ L44 - true
   */

  @Test
  public void test02()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, 0.0, (-3.458729253436735E10), 1.7976931348623157E308, (double) 14);
      assertEquals("id=13  modelOptComp: vol = 0.0 delta = N/A: modelPrice = N/A: pvDividend = 14.0", string0);
  }

  //Test case number: 3
  /*
   * 3 covered goals:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I85 Branch 6 IFLT L44 - true
   * Goal 2. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I120 Branch 8 IFLT L45 - false
   * Goal 3. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I127 Branch 9 IFEQ L45 - false
   */

  @Test
  public void test03()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 13, (double) 0, (-2873.4646008696477), (-2873.4646008696477), (double) 0);
      assertEquals("id=0  modelOptComp: vol = 0.0 delta = N/A: modelPrice = N/A: pvDividend = 0.0", string0);
  }

  //Test case number: 4
  /*
   * 5 covered goals:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I22 Branch 2 IFLT L40 - true
   * Goal 2. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I69 Branch 5 IF_ICMPNE L43 - false
   * Goal 3. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I85 Branch 6 IFLT L44 - false
   * Goal 4. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I92 Branch 7 IFEQ L44 - false
   * Goal 5. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I120 Branch 8 IFLT L45 - true
   */

  @Test
  public void test04()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation((-31), 13, (double) (-31), 1.0, 1.0, (double) (-31));
      assertEquals("id=-31  modelOptComp: vol = N/A delta = 1.0: modelPrice = 1.0: pvDividend = N/A", string0);
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I29 Branch 3 IFEQ L40 - false
   * Goal 2. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I49 Branch 4 IFGT L40 - true
   */

  @Test
  public void test05()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation((-2721), (-2721), 0.0, (-3.4587292534E10), 1.7976931348623157E308, 1.0);
      assertEquals("id=-2721  unknown: vol = 0.0 delta = N/A", string0);
  }

  //Test case number: 6
  /*
   * 4 covered goals:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I22 Branch 2 IFLT L40 - false
   * Goal 2. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I29 Branch 3 IFEQ L40 - true
   * Goal 3. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I49 Branch 4 IFGT L40 - false
   * Goal 4. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I69 Branch 5 IF_ICMPNE L43 - true
   */

  @Test
  public void test06()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(2338, 0, 1.7976931348623157E308, (double) 0, 0.0, 0.0);
      assertEquals("id=2338  bidSize: vol = N/A delta = 0.0", string0);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickPrice(IIDI)Ljava/lang/String;: I24 Branch 1 IFEQ L30 - false
   */

  @Test
  public void test07()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice(3065, 3065, (double) 3065, 3065);
      assertEquals("id=3065  unknown=3065.0  canAutoExecute", string0);
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickPrice(IIDI)Ljava/lang/String;: I24 Branch 1 IFEQ L30 - true
   */

  @Test
  public void test08()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice(36, 36, (double) 36, 0);
      assertEquals("id=36  auctionImbalance=36.0  noAutoExecute", string0);
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updateMktDepth(IIIIDI)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test09()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepth((-823), (-823), 929, (-823), (double) 929, (-1226));
      assertEquals("updateMktDepth: -823 -823 929 -823 929.0 -1226", string0);
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickString(IILjava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test10()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickString(3065, 3065, "id=3065  unknown=3065");
      assertEquals("id=3065  unknown=id=3065  unknown=3065", string0);
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.deltaNeutralValidation(ILcom/ib/client/UnderComp;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test11()  throws Throwable  {
      UnderComp underComp0 = new UnderComp();
      String string0 = EWrapperMsgGenerator.deltaNeutralValidation(0, underComp0);
      assertEquals("id = 0 underComp.conId =0 underComp.delta =0.0 underComp.price =0.0", string0);
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updateNewsBulletin(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test12()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateNewsBulletin(0, 2486, "id=0  bidSize=0.0", "id=3964  bidSize: vol = 0.0 delta = 0.0");
      assertEquals("MsgId=0 :: MsgType=2486 :: Origin=id=3964  bidSize: vol = 0.0 delta = 0.0 :: Message=id=0  bidSize=0.0", string0);
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.fundamentalData(ILjava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test13()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.fundamentalData((-795), "id=3065  unknown=3065.0  canAutoExecute");
      assertEquals("id  = -795 len = 39\nid=3065  unknown=3065.0  canAutoExecute", string0);
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updatePortfolio(Lcom/ib/client/Contract;IDDDDDLjava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test14()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.updatePortfolio(contractDetails0.m_summary, (-1398), 0.0, (double) (-1398), 0.0, (double) (-1398), 1193.75842864, "f/sXxh-Ex{");
      assertEquals("updatePortfolio: conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n-1398 0.0 -1398.0 0.0 -1398.0 1193.75842864 f/sXxh-Ex{", string0);
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updateAccountValue(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test15()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountValue("Next Valid Order ID: 0", "MsgId=0 :: MsgType=2486 :: Origin=id=3964  bidSize: vol = 0.0 delta = 0.0 :: Message=id=0  bidSize=0.0", "orderId = ", "MsgId=0 :: MsgType=2486 :: Origin=id=3964  bidSize: vol = 0.0 delta = 0.0 :: Message=id=0  bidSize=0.0");
      assertEquals("updateAccountValue: Next Valid Order ID: 0 MsgId=0 :: MsgType=2486 :: Origin=id=3964  bidSize: vol = 0.0 delta = 0.0 :: Message=id=0  bidSize=0.0 orderId =  MsgId=0 :: MsgType=2486 :: Origin=id=3964  bidSize: vol = 0.0 delta = 0.0 :: Message=id=0  bidSize=0.0", string0);
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.receiveFA(ILjava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test16()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.receiveFA((-823), "");
      assertEquals("FA: null ", string0);
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.contractDetailsEnd(I)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test17()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.contractDetailsEnd(0);
      assertEquals("reqId = 0 =============== end ===============", string0);
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickSnapshotEnd(I)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test18()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSnapshotEnd((-4808));
      assertEquals("id=-4808 =============== end ===============", string0);
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.orderStatus(ILjava/lang/String;IIDIIDILjava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test19()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.orderStatus(3065, (String) null, (-1202), 0, (-3121.3469771319596), 0, 3065, (double) 0, (-554), (String) null);
      assertEquals("order status: orderId=3065 clientId=-554 permId=0 status=null filled=-1202 remaining=0 avgFillPrice=-3121.3469771319596 lastFillPrice=0.0 parent Id=3065 whyHeld=null", string0);
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.scannerDataEnd(I)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test20()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerDataEnd(929);
      assertEquals("id = 929 =============== end ===============", string0);
  }

  //Test case number: 21
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickGeneric(IID)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test21()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickGeneric(3632, (-1398), 0.0);
      assertEquals("id=3632  unknown=0.0", string0);
  }

  //Test case number: 22
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.managedAccounts(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test22()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.managedAccounts("");
      assertEquals("Connected : The list of managed accounts are : []", string0);
  }

  //Test case number: 23
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.<init>()V: root-Branch
   */

  @Test
  public void test23()  throws Throwable  {
      EWrapperMsgGenerator eWrapperMsgGenerator0 = new EWrapperMsgGenerator();
      assertEquals(" =============== end ===============", eWrapperMsgGenerator0.openOrderEnd());
  }

  //Test case number: 24
  /*
   * 3 covered goals:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.contractDetails(ILcom/ib/client/ContractDetails;)Ljava/lang/String;: root-Branch
   * Goal 2. com.ib.client.EWrapperMsgGenerator.contractDetailsMsg(Lcom/ib/client/ContractDetails;)Ljava/lang/String;: root-Branch
   * Goal 3. com.ib.client.EWrapperMsgGenerator.contractMsg(Lcom/ib/client/Contract;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test24()  throws Throwable  {
      Contract contract0 = new Contract();
      ContractDetails contractDetails0 = new ContractDetails(contract0, "orderId = ", (String) null, (double) 0, "Next Valid Order ID: 0", "MsgId=0 :: MsgType=2486 :: Origin=id=3964  bidSize: vol = 0.0 delta = 0.0 :: Message=id=0  bidSize=0.0", 0, "FA,0d$sM`/qKe:7_+R", (String) null, "clientId = ", (String) null, (String) null, "kl", (String) null, "FA,0d$sM`/qKe:7_+R");
      String string0 = EWrapperMsgGenerator.contractDetails(0, contractDetails0);
      assertEquals("reqId = 0 ===================================\n ---- Contract Details begin ----\nconid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\nmarketName = orderId = \ntradingClass = null\nminTick = 0.0\nprice magnifier = 0\norderTypes = Next Valid Order ID: 0\nvalidExchanges = MsgId=0 :: MsgType=2486 :: Origin=id=3964  bidSize: vol = 0.0 delta = 0.0 :: Message=id=0  bidSize=0.0\nunderConId = 0\nlongName = FA,0d$sM`/qKe:7_+R\ncontractMonth = null\nindustry = clientId = \ncategory = null\nsubcategory = null\ntimeZoneId = kl\ntradingHours = null\nliquidHours = FA,0d$sM`/qKe:7_+R\n ---- Contract Details End ----\n", string0);
  }

  //Test case number: 25
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.accountDownloadEnd(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test25()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.accountDownloadEnd("S%_.q");
      assertEquals("accountDownloadEnd: S%_.q", string0);
  }

  //Test case number: 26
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updateMktDepthL2(IILjava/lang/String;IIDI)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test26()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepthL2((-823), (-823), "", (-823), (-823), (double) (-823), 929);
      assertEquals("updateMktDepth: -823 -823  -823 -823 -823.0 929", string0);
  }

  //Test case number: 27
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.bondContractDetails(ILcom/ib/client/ContractDetails;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test27()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.bondContractDetails(2457, contractDetails0);
      assertEquals("reqId = 2457 ===================================\n ---- Bond Contract Details begin ----\nsymbol = null\nsecType = null\ncusip = null\ncoupon = 0.0\nmaturity = null\nissueDate = null\nratings = null\nbondType = null\ncouponType = null\nconvertible = false\ncallable = false\nputable = false\ndescAppend = null\nexchange = null\ncurrency = null\nmarketName = null\ntradingClass = null\nconid = 0\nminTick = 0.0\norderTypes = null\nvalidExchanges = null\nnextOptionDate = null\nnextOptionType = null\nnextOptionPartial = false\nnotes = null\nlongName = null\n ---- Bond Contract Details End ----\n", string0);
  }

  //Test case number: 28
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.scannerData(IILcom/ib/client/ContractDetails;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test28()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.scannerData(0, 0, contractDetails0, (String) null, (String) null, (String) null, (String) null);
      assertEquals("id = 0 rank=0 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance=null benchmark=null projection=null legsStr=null", string0);
  }

  //Test case number: 29
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.realtimeBar(IJDDDDJDI)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test29()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.realtimeBar(0, (long) 0, (double) 0, (double) 0, (double) 0, (double) 24L, 24L, (-3376.9668787977), 0);
      assertEquals("id=0 time = 0 open=0.0 high=0.0 low=0.0 close=24.0 volume=24 count=0 WAP=-3376.9668787977", string0);
  }

  //Test case number: 30
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.nextValidId(I)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test30()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.nextValidId(3065);
      assertEquals("Next Valid Order ID: 3065", string0);
  }

  //Test case number: 31
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.execDetailsEnd(I)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test31()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.execDetailsEnd((-795));
      assertEquals("reqId = -795 =============== end ===============", string0);
  }

  //Test case number: 32
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.currentTime(J)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test32()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.currentTime((long) 1702);
      assertEquals("current time = 1702 (Jan 1, 1970 12:28:22 AM)", string0);
  }

  //Test case number: 33
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.openOrderEnd()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test33()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.openOrderEnd();
      assertEquals(" =============== end ===============", string0);
  }

  //Test case number: 34
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickEFP(IIDLjava/lang/String;DILjava/lang/String;DD)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test34()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickEFP(504, 740, 1.7976931348623157E308, "", 0.0, 740, (String) null, 1.7976931348623157E308, (double) 0);
      assertEquals("id=504  unknown: basisPoints = 1.7976931348623157E308/ impliedFuture = 0.0 holdDays = 740 futureExpiry = null dividendImpact = 1.7976931348623157E308 dividends to expiry = 0.0", string0);
  }

  //Test case number: 35
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.execDetails(ILcom/ib/client/Contract;Lcom/ib/client/Execution;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test35()  throws Throwable  {
      Contract contract0 = new Contract();
      Execution execution0 = new Execution();
      String string0 = EWrapperMsgGenerator.execDetails(3065, contract0, execution0);
      assertEquals(" ---- Execution Details begin ----\nreqId = 3065\norderId = 0\nclientId = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\ncontractExchange = null\ncurrency = null\nlocalSymbol = null\nexecId = null\ntime = null\nacctNumber = null\nexecutionExchange = null\nside = null\nshares = 0\nprice = 0.0\npermId = 0\nliquidation = 0\ncumQty = 0\navgPrice = 0.0\n ---- Execution Details end ----\n", string0);
  }

  //Test case number: 36
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickSize(III)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test36()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSize(3065, 3065, 3065);
      assertEquals("id=3065  unknown=3065", string0);
  }

  //Test case number: 37
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.scannerParameters(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test37()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerParameters("Next Valid Order ID: 0");
      assertEquals("SCANNER PARAMETERS:\nNext Valid Order ID: 0", string0);
  }

  //Test case number: 38
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.historicalData(ILjava/lang/String;DDDDIIDZ)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test38()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.historicalData(2457, "Next Valid Order ID: 2457", (double) 2457, (double) 2457, (double) 2457, (double) 2457, 2457, 2457, (double) 2457, true);
      assertEquals("id=2457 date = Next Valid Order ID: 2457 open=2457.0 high=2457.0 low=2457.0 close=2457.0 volume=2457 count=2457 WAP=2457.0 hasGaps=true", string0);
  }

  //Test case number: 39
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updateAccountTime(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test39()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountTime("terminateOnEalImprovementNumOfEpoch");
      assertEquals("updateAccountTime: terminateOnEalImprovementNumOfEpoch", string0);
  }
}
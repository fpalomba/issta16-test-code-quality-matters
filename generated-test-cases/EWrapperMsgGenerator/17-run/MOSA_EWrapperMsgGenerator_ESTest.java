/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 13 04:05:08 GMT 2015
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
import edu.stanford.nlp.ling.IndexedWord;
import edu.stanford.nlp.ling.LabeledWord;
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
      Vector<IndexedWord> vector0 = new Vector<IndexedWord>();
      Contract contract0 = new Contract((-1554), "Next Valid Order ID: ", (String) null, (String) null, (-1.0), (String) null, "W'7&)HUI^u", "$5J'&^/MDG", (String) null, "YUDc38 2<~+", (Vector) vector0, "victual", true, "Next Valid Order ID: ", "");
      Order order0 = new Order();
      OrderState orderState0 = new OrderState("updateAccountValue: ", (String) null, (String) null, "", 1.7976931348623157E308, 0, 1.7976931348623157E308, (String) null, "~d'\"WQ@Y#T&nAi]d");
      String string0 = EWrapperMsgGenerator.openOrder((-1554), contract0, order0, orderState0);
      assertEquals("open order: orderId=-1554 action=null quantity=0 symbol=Next Valid Order ID:  exchange=$5J'&^/MDG secType=null type=null lmtPrice=0.0 auxPrice=0.0 TIF=null localSymbol=YUDc38 2<~+ client Id=0 parent Id=0 permId=0 outsideRth=false hidden=false discretionaryAmt=0.0 triggerMethod=0 goodAfterTime=null goodTillDate=null faGroup=null faMethod=null faPercentage=null faProfile=null shortSaleSlot=0 designatedLocation= ocaGroup=null ocaType=0 rule80A=null allOrNone=false minQty=2147483647 percentOffset=1.7976931348623157E308 eTradeOnly=false firmQuoteOnly=false nbboPriceCap=1.7976931348623157E308 auctionStrategy=0 startingPrice=1.7976931348623157E308 stockRefPrice=1.7976931348623157E308 delta=1.7976931348623157E308 stockRangeLower=1.7976931348623157E308 stockRangeUpper=1.7976931348623157E308 volatility=1.7976931348623157E308 volatilityType=2147483647 deltaNeutralOrderType= deltaNeutralAuxPrice=1.7976931348623157E308 continuousUpdate=0 referencePriceType=2147483647 trailStopPrice=1.7976931348623157E308 scaleInitLevelSize= scaleSubsLevelSize= scalePriceIncrement= account=null settlingFirm=null clearingAccount=null clearingIntent=null notHeld=false whatIf=false status=null initMargin=null maintMargin=null equityWithLoan= commission= minCommission=0.0 maxCommission= commissionCurrency=null warningText=~d'\"WQ@Y#T&nAi]d", string0);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I85 Branch 6 IFLT L44 - true
   * Goal 2. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I120 Branch 8 IFLT L45 - true
   */

  @Test
  public void test01()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 13, (double) 0, 10.0, (-3071.13417069865), (-3071.13417069865));
      assertEquals("id=0  modelOptComp: vol = 0.0 delta = N/A: modelPrice = N/A: pvDividend = N/A", string0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I49 Branch 4 IFGT L40 - false
   */

  @Test
  public void test02()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 2675, 0.0, (-1.0), 3096.372, 470.951052);
      assertEquals("id=0  unknown: vol = 0.0 delta = -1.0", string0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I29 Branch 3 IFEQ L40 - true
   */

  @Test
  public void test03()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(6, 10, 1.7976931348623157E308, (double) 6, 1.0575279937485924, 0.0);
      assertEquals("id=6  bidOptComp: vol = N/A delta = N/A", string0);
  }

  //Test case number: 4
  /*
   * 7 covered goals:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I22 Branch 2 IFLT L40 - false
   * Goal 2. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I29 Branch 3 IFEQ L40 - false
   * Goal 3. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I69 Branch 5 IF_ICMPNE L43 - false
   * Goal 4. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I85 Branch 6 IFLT L44 - false
   * Goal 5. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I92 Branch 7 IFEQ L44 - false
   * Goal 6. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I120 Branch 8 IFLT L45 - false
   * Goal 7. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I127 Branch 9 IFEQ L45 - false
   */

  @Test
  public void test04()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 13, Double.POSITIVE_INFINITY, 10.0, 2702.455080719562, 2702.455080719562);
      assertEquals("id=0  modelOptComp: vol = Infinity delta = N/A: modelPrice = 2702.455080719562: pvDividend = 2702.455080719562", string0);
  }

  //Test case number: 5
  /*
   * 3 covered goals:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I22 Branch 2 IFLT L40 - true
   * Goal 2. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I49 Branch 4 IFGT L40 - true
   * Goal 3. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I69 Branch 5 IF_ICMPNE L43 - true
   */

  @Test
  public void test05()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(1002, 2091, (-31.5637394), 241.61, (double) 2091, 0.0);
      assertEquals("id=1002  unknown: vol = N/A delta = N/A", string0);
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickPrice(IIDI)Ljava/lang/String;: I24 Branch 1 IFEQ L30 - false
   */

  @Test
  public void test06()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice((-2257), (-2257), (double) (-2257), (-2257));
      assertEquals("id=-2257  unknown=-2257.0  canAutoExecute", string0);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickPrice(IIDI)Ljava/lang/String;: I24 Branch 1 IFEQ L30 - true
   */

  @Test
  public void test07()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice(1051, 1187, (double) 1187, 0);
      assertEquals("id=1051  unknown=1187.0  noAutoExecute", string0);
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updateMktDepth(IIIIDI)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test08()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepth(414, (-354), 0, (-2085), 0.0, (-354));
      assertEquals("updateMktDepth: 414 -354 0 -2085 0.0 -354", string0);
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickString(IILjava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test09()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickString(4133, 4133, "W2ZL^#");
      assertEquals("id=4133  unknown=W2ZL^#", string0);
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.deltaNeutralValidation(ILcom/ib/client/UnderComp;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test10()  throws Throwable  {
      Contract contract0 = new Contract((-2801), "primaryExch = ", "primaryExch = ", "{", (-994.922968036), "id=-3319  unknown=-3319.0", "primaryExch = ", "primaryExch = ", "id=-3319  unknown=-3319.0", "8(D4O,4W\"h", (Vector) null, "", true, "", "");
      ContractDetails contractDetails0 = new ContractDetails(contract0, (String) null, "time = ", 0.0, "After rearrangeNowThat:           ", "augmentedDateChars", (-3319), "primaryExch = ", " =============== end ===============", (String) null, (String) null, "{", "primaryExch = ", "", "primaryExch = ");
      // Undeclared exception!
      try {
        String string0 = EWrapperMsgGenerator.deltaNeutralValidation(552, contractDetails0.m_summary.m_underComp);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updateNewsBulletin(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test11()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateNewsBulletin(2790, (-1204), "-+jw", "-+jw");
      assertEquals("MsgId=2790 :: MsgType=-1204 :: Origin=-+jw :: Message=-+jw", string0);
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.fundamentalData(ILjava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test12()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.fundamentalData(0, "I+aylt$^Xw_'W_+4");
      assertEquals("id  = 0 len = 16\nI+aylt$^Xw_'W_+4", string0);
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updatePortfolio(Lcom/ib/client/Contract;IDDDDDLjava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test13()  throws Throwable  {
      Contract contract0 = new Contract((-2801), "primaryExch = ", "primaryExch = ", "{", (-994.922968036), "id=-3319  unknown=-3319.0", "primaryExch = ", "primaryExch = ", "id=-3319  unknown=-3319.0", "8(D4O,4W\"h", (Vector) null, "", true, "", "");
      String string0 = EWrapperMsgGenerator.updatePortfolio(contract0, 0, (double) (-2801), 0.0, (double) (-2801), 0.001, 0.0, (String) null);
      assertEquals("updatePortfolio: conid = -2801\nsymbol = primaryExch = \nsecType = primaryExch = \nexpiry = {\nstrike = -994.922968036\nright = id=-3319  unknown=-3319.0\nmultiplier = primaryExch = \nexchange = primaryExch = \nprimaryExch = \ncurrency = id=-3319  unknown=-3319.0\nlocalSymbol = 8(D4O,4W\"h\n0 -2801.0 0.0 -2801.0 0.001 0.0 null", string0);
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updateAccountValue(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test14()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountValue("HVDn^x/P", "de-mob", "#", "de-mob");
      assertEquals("updateAccountValue: HVDn^x/P de-mob # de-mob", string0);
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.receiveFA(ILjava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test15()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.receiveFA(8, (String) null);
      assertEquals("FA: null null", string0);
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.contractDetailsEnd(I)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test16()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.contractDetailsEnd(6);
      assertEquals("reqId = 6 =============== end ===============", string0);
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickSnapshotEnd(I)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test17()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSnapshotEnd(0);
      assertEquals("id=0 =============== end ===============", string0);
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.orderStatus(ILjava/lang/String;IIDIIDILjava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test18()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.orderStatus(0, "u", 6972, 0, 0.0, 2541, (-1045), 423.7834515428486, 2541, (String) null);
      assertEquals("order status: orderId=0 clientId=2541 permId=2541 status=u filled=6972 remaining=0 avgFillPrice=0.0 lastFillPrice=423.7834515428486 parent Id=-1045 whyHeld=null", string0);
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.scannerDataEnd(I)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test19()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerDataEnd((-681));
      assertEquals("id = -681 =============== end ===============", string0);
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickGeneric(IID)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test20()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickGeneric(3621, 21, (-142.2));
      assertEquals("id=3621  AvgVolume=-142.2", string0);
  }

  //Test case number: 21
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.managedAccounts(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test21()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.managedAccounts("#*v");
      assertEquals("Connected : The list of managed accounts are : [#*v]", string0);
  }

  //Test case number: 22
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.<init>()V: root-Branch
   */

  @Test
  public void test22()  throws Throwable  {
      EWrapperMsgGenerator eWrapperMsgGenerator0 = new EWrapperMsgGenerator();
      assertEquals(" =============== end ===============", eWrapperMsgGenerator0.openOrderEnd());
  }

  //Test case number: 23
  /*
   * 3 covered goals:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.contractDetails(ILcom/ib/client/ContractDetails;)Ljava/lang/String;: root-Branch
   * Goal 2. com.ib.client.EWrapperMsgGenerator.contractDetailsMsg(Lcom/ib/client/ContractDetails;)Ljava/lang/String;: root-Branch
   * Goal 3. com.ib.client.EWrapperMsgGenerator.contractMsg(Lcom/ib/client/Contract;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test23()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.contractDetails(0, contractDetails0);
      assertEquals("reqId = 0 ===================================\n ---- Contract Details begin ----\nconid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\nmarketName = null\ntradingClass = null\nminTick = 0.0\nprice magnifier = 0\norderTypes = null\nvalidExchanges = null\nunderConId = 0\nlongName = null\ncontractMonth = null\nindustry = null\ncategory = null\nsubcategory = null\ntimeZoneId = null\ntradingHours = null\nliquidHours = null\n ---- Contract Details End ----\n", string0);
  }

  //Test case number: 24
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.accountDownloadEnd(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test24()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.accountDownloadEnd("zuAr5Hb^z9w.u)yAg?");
      assertEquals("accountDownloadEnd: zuAr5Hb^z9w.u)yAg?", string0);
  }

  //Test case number: 25
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updateMktDepthL2(IILjava/lang/String;IIDI)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test25()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepthL2((-2801), (-3319), "\"/", (-3319), 3539, 0.0, 3539);
      assertEquals("updateMktDepth: -2801 -3319 \"/ -3319 3539 0.0 3539", string0);
  }

  //Test case number: 26
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.bondContractDetails(ILcom/ib/client/ContractDetails;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test26()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.bondContractDetails(0, contractDetails0);
      assertEquals("reqId = 0 ===================================\n ---- Bond Contract Details begin ----\nsymbol = null\nsecType = null\ncusip = null\ncoupon = 0.0\nmaturity = null\nissueDate = null\nratings = null\nbondType = null\ncouponType = null\nconvertible = false\ncallable = false\nputable = false\ndescAppend = null\nexchange = null\ncurrency = null\nmarketName = null\ntradingClass = null\nconid = 0\nminTick = 0.0\norderTypes = null\nvalidExchanges = null\nnextOptionDate = null\nnextOptionType = null\nnextOptionPartial = false\nnotes = null\nlongName = null\n ---- Bond Contract Details End ----\n", string0);
  }

  //Test case number: 27
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.scannerData(IILcom/ib/client/ContractDetails;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test27()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.scannerData(0, 0, contractDetails0, (String) null, (String) null, "", "reqId = 0 ===================================\n ---- Bond Contract Details begin ----\nsymbol = null\nsecType = null\ncusip = null\ncoupon = 0.0\nmaturity = null\nissueDate = null\nratings = null\nbondType = null\ncouponType = null\nconvertible = false\ncallable = false\nputable = false\ndescAppend = null\nexchange = null\ncurrency = null\nmarketName = null\ntradingClass = null\nconid = 0\nminTick = 0.0\norderTypes = null\nvalidExchanges = null\nnextOptionDate = null\nnextOptionType = null\nnextOptionPartial = false\nnotes = null\nlongName = null\n ---- Bond Contract Details End ----\n");
      assertEquals("id = 0 rank=0 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance=null benchmark=null projection= legsStr=reqId = 0 ===================================\n ---- Bond Contract Details begin ----\nsymbol = null\nsecType = null\ncusip = null\ncoupon = 0.0\nmaturity = null\nissueDate = null\nratings = null\nbondType = null\ncouponType = null\nconvertible = false\ncallable = false\nputable = false\ndescAppend = null\nexchange = null\ncurrency = null\nmarketName = null\ntradingClass = null\nconid = 0\nminTick = 0.0\norderTypes = null\nvalidExchanges = null\nnextOptionDate = null\nnextOptionType = null\nnextOptionPartial = false\nnotes = null\nlongName = null\n ---- Bond Contract Details End ----\n", string0);
  }

  //Test case number: 28
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.realtimeBar(IJDDDDJDI)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test28()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.realtimeBar(0, (long) 0, 3294.082087678657, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, 2702.455080719562, 0L, Double.POSITIVE_INFINITY, 0);
      assertEquals("id=0 time = 0 open=3294.082087678657 high=Infinity low=Infinity close=2702.455080719562 volume=0 count=0 WAP=Infinity", string0);
  }

  //Test case number: 29
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.nextValidId(I)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test29()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.nextValidId(0);
      assertEquals("Next Valid Order ID: 0", string0);
  }

  //Test case number: 30
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.execDetailsEnd(I)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test30()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.execDetailsEnd((-839));
      assertEquals("reqId = -839 =============== end ===============", string0);
  }

  //Test case number: 31
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.currentTime(J)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test31()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.currentTime((long) (-681));
      assertEquals("current time = -681 (Dec 31, 1969 11:48:39 PM)", string0);
  }

  //Test case number: 32
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.openOrderEnd()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test32()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.openOrderEnd();
      assertEquals(" =============== end ===============", string0);
  }

  //Test case number: 33
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickEFP(IIDLjava/lang/String;DILjava/lang/String;DD)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test33()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickEFP(0, 0, (double) 0, "updateAccountValue: ", 3294.082087678657, 0, "updateAccountValue: ", (double) 0, 10.0);
      assertEquals("id=0  bidSize: basisPoints = 0.0/updateAccountValue:  impliedFuture = 3294.082087678657 holdDays = 0 futureExpiry = updateAccountValue:  dividendImpact = 0.0 dividends to expiry = 10.0", string0);
  }

  //Test case number: 34
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.execDetails(ILcom/ib/client/Contract;Lcom/ib/client/Execution;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test34()  throws Throwable  {
      Vector<LabeledWord> vector0 = new Vector<LabeledWord>();
      Contract contract0 = new Contract(1207, "", "", "", (double) 1207, "", "HWD(.MEJ)", "", "", "", (Vector) vector0, "HWD(.MEJ)", true, "", "");
      // Undeclared exception!
      try {
        String string0 = EWrapperMsgGenerator.execDetails(1207, contract0, (Execution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 35
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickSize(III)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test35()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSize(0, 3461, (-715));
      assertEquals("id=0  unknown=-715", string0);
  }

  //Test case number: 36
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.scannerParameters(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test36()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerParameters("BAG");
      assertEquals("SCANNER PARAMETERS:\nBAG", string0);
  }

  //Test case number: 37
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.historicalData(ILjava/lang/String;DDDDIIDZ)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test37()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.historicalData(1112, "putable = ", 0.0, (double) 1112, 0.0, (-1.0), 1112, 1112, (double) 1112, false);
      assertEquals("id=1112 date = putable =  open=0.0 high=1112.0 low=0.0 close=-1.0 volume=1112 count=1112 WAP=1112.0 hasGaps=false", string0);
  }

  //Test case number: 38
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updateAccountTime(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test38()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountTime("/Mh;#)");
      assertEquals("updateAccountTime: /Mh;#)", string0);
  }
}

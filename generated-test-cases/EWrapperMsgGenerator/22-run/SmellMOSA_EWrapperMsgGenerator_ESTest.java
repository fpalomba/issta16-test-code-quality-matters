/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 13 03:00:28 GMT 2015
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
import edu.stanford.nlp.ling.CategoryWordTag;
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
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickPrice(IIDI)Ljava/lang/String;: I24 Branch 1 IFEQ L30 - true
   */

  @Test
  public void test00()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.tickPrice(0, 0, 0.0, 0);
      assertEquals("id=0  bidSize=0.0  noAutoExecute", string0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.accountDownloadEnd(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test01()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.accountDownloadEnd("QP;< (CC $- __=r1 $+ __=l2 ?$-- /^[$]|CC$/=lnum ?$++ /^[$]|CC$/=rnum) <1 __=l1 <- __=r2 !< (__ < (__ 2 _0)");
      assertEquals("accountDownloadEnd: QP;< (CC $- __=r1 $+ __=l2 ?$-- /^[$]|CC$/=lnum ?$++ /^[$]|CC$/=rnum) <1 __=l1 <- __=r2 !< (__ < (__ 2 _0)", string0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updateAccountValue(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test02()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountValue("updateMktDepth: -1 -1 -1 -1 -1.0 0", "updateMktDepth: -1 -1 -1 -1 -1.0 0", "updateMktDepth: -1 -1 -1 -1 -1.0 0", "updateMktDepth: -1 -1 -1 -1 -1.0 0");
      assertEquals("updateAccountValue: updateMktDepth: -1 -1 -1 -1 -1.0 0 updateMktDepth: -1 -1 -1 -1 -1.0 0 updateMktDepth: -1 -1 -1 -1 -1.0 0 updateMktDepth: -1 -1 -1 -1 -1.0 0", string0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.execDetails(ILcom/ib/client/Contract;Lcom/ib/client/Execution;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try {
        String string0 = EWrapperMsgGenerator.execDetails(0, (Contract) null, (Execution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickSnapshotEnd(I)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test04()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSnapshotEnd((-1090));
      assertEquals("id=-1090 =============== end ===============", string0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I120 Branch 8 IFLT L45 - true
   */

  @Test
  public void test05()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, (double) 13, (double) 13, (-1.0), (-1.0));
      assertEquals("id=13  modelOptComp: vol = 13.0 delta = N/A: modelPrice = N/A: pvDividend = N/A", string0);
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updatePortfolio(Lcom/ib/client/Contract;IDDDDDLjava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test06()  throws Throwable  {
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.updatePortfolio(contract0, 0, 0.0, (double) 0, 0.0, 0.0, 0.0, (String) null);
      assertEquals("updatePortfolio: conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n0 0.0 0.0 0.0 0.0 0.0 null", string0);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickPrice(IIDI)Ljava/lang/String;: I24 Branch 1 IFEQ L30 - false
   */

  @Test
  public void test07()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice(20, 20, (double) 20, 20);
      assertEquals("id=20  52WeekHigh=20.0  canAutoExecute", string0);
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.openOrder(ILcom/ib/client/Contract;Lcom/ib/client/Order;Lcom/ib/client/OrderState;)Ljava/lang/String;: I371 Branch 13 IFNULL L147 - false
   */

  @Test
  public void test08()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      UnderComp underComp0 = new UnderComp();
      contract0.m_underComp = underComp0;
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.openOrder(Integer.MAX_VALUE, contract0, order0, orderState0);
      assertEquals("open order: orderId=2147483647 action=null quantity=0 symbol=null exchange=null secType=null type=null lmtPrice=0.0 auxPrice=0.0 TIF=null localSymbol=null client Id=0 parent Id=0 permId=0 outsideRth=false hidden=false discretionaryAmt=0.0 triggerMethod=0 goodAfterTime=null goodTillDate=null faGroup=null faMethod=null faPercentage=null faProfile=null shortSaleSlot=0 designatedLocation= ocaGroup=null ocaType=0 rule80A=null allOrNone=false minQty=2147483647 percentOffset=1.7976931348623157E308 eTradeOnly=false firmQuoteOnly=false nbboPriceCap=1.7976931348623157E308 auctionStrategy=0 startingPrice=1.7976931348623157E308 stockRefPrice=1.7976931348623157E308 delta=1.7976931348623157E308 stockRangeLower=1.7976931348623157E308 stockRangeUpper=1.7976931348623157E308 volatility=1.7976931348623157E308 volatilityType=2147483647 deltaNeutralOrderType= deltaNeutralAuxPrice=1.7976931348623157E308 continuousUpdate=0 referencePriceType=2147483647 trailStopPrice=1.7976931348623157E308 scaleInitLevelSize= scaleSubsLevelSize= scalePriceIncrement= account=null settlingFirm=null clearingAccount=null clearingIntent=null notHeld=false whatIf=false underComp.conId =0 underComp.delta =0.0 underComp.price =0.0 status=null initMargin=null maintMargin=null equityWithLoan=null commission=0.0 minCommission=0.0 maxCommission=0.0 commissionCurrency=null warningText=null", string0);
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.bondContractDetails(ILcom/ib/client/ContractDetails;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try {
        String string0 = EWrapperMsgGenerator.bondContractDetails(7, (ContractDetails) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 10
  /*
   * 3 covered goals:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.openOrder(ILcom/ib/client/Contract;Lcom/ib/client/Order;Lcom/ib/client/OrderState;)Ljava/lang/String;: I303 Branch 10 IFLE L137 - false
   * Goal 2. com.ib.client.EWrapperMsgGenerator.openOrder(ILcom/ib/client/Contract;Lcom/ib/client/Order;Lcom/ib/client/OrderState;)Ljava/lang/String;: I311 Branch 11 IFNULL L138 - true
   * Goal 3. com.ib.client.EWrapperMsgGenerator.openOrder(ILcom/ib/client/Contract;Lcom/ib/client/Order;Lcom/ib/client/OrderState;)Ljava/lang/String;: I335 Branch 12 IFEQ L141 - true
   */

  @Test
  public void test10()  throws Throwable  {
      Vector<CategoryWordTag> vector0 = new Vector<CategoryWordTag>();
      Contract contract0 = new Contract(980, "BAG", "BAG", "BAG", (double) 980, "BAG", "BAG", "BAG", "BAG", "BAG", (Vector) vector0, "BAG", false, "BAG", "BAG");
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.openOrder(980, contract0, order0, orderState0);
      assertEquals("open order: orderId=980 action=null quantity=0 symbol=BAG exchange=BAG secType=BAG type=null lmtPrice=0.0 auxPrice=0.0 TIF=null localSymbol=BAG client Id=0 parent Id=0 permId=0 outsideRth=false hidden=false discretionaryAmt=0.0 triggerMethod=0 goodAfterTime=null goodTillDate=null faGroup=null faMethod=null faPercentage=null faProfile=null shortSaleSlot=0 designatedLocation= ocaGroup=null ocaType=0 rule80A=null allOrNone=false minQty=2147483647 percentOffset=1.7976931348623157E308 eTradeOnly=false firmQuoteOnly=false nbboPriceCap=1.7976931348623157E308 auctionStrategy=0 startingPrice=1.7976931348623157E308 stockRefPrice=1.7976931348623157E308 delta=1.7976931348623157E308 stockRangeLower=1.7976931348623157E308 stockRangeUpper=1.7976931348623157E308 volatility=1.7976931348623157E308 volatilityType=2147483647 deltaNeutralOrderType= deltaNeutralAuxPrice=1.7976931348623157E308 continuousUpdate=0 referencePriceType=2147483647 trailStopPrice=1.7976931348623157E308 scaleInitLevelSize= scaleSubsLevelSize= scalePriceIncrement= account=null settlingFirm=null clearingAccount=null clearingIntent=null notHeld=false whatIf=false status=null initMargin=null maintMargin=null equityWithLoan=null commission=0.0 minCommission=0.0 maxCommission=0.0 commissionCurrency=null warningText=null", string0);
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.scannerData(IILcom/ib/client/ContractDetails;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test11()  throws Throwable  {
      Contract contract0 = new Contract();
      ContractDetails contractDetails0 = new ContractDetails(contract0, (String) null, (String) null, 0.0, (String) null, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
      String string0 = EWrapperMsgGenerator.scannerData(0, 0, contractDetails0, (String) null, (String) null, (String) null, (String) null);
      assertEquals("id = 0 rank=0 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance=null benchmark=null projection=null legsStr=null", string0);
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I92 Branch 7 IFEQ L44 - true
   */

  @Test
  public void test12()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(Integer.MAX_VALUE, 13, (double) Integer.MAX_VALUE, 1.7976931348623157E308, 1.7976931348623157E308, 1.7976931348623157E308);
      assertEquals("id=2147483647  modelOptComp: vol = 2.147483647E9 delta = N/A: modelPrice = N/A: pvDividend = N/A", string0);
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I127 Branch 9 IFEQ L45 - true
   */

  @Test
  public void test13()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(34, 13, (double) 13, (double) 34, (double) 34, 1.7976931348623157E308);
      assertEquals("id=34  modelOptComp: vol = 13.0 delta = N/A: modelPrice = 34.0: pvDividend = N/A", string0);
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.contractDetailsEnd(I)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test14()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.contractDetailsEnd((-765));
      assertEquals("reqId = -765 =============== end ===============", string0);
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.<init>()V: root-Branch
   */

  @Test
  public void test15()  throws Throwable  {
      EWrapperMsgGenerator eWrapperMsgGenerator0 = new EWrapperMsgGenerator();
      assertEquals("Connection Closed", eWrapperMsgGenerator0.connectionClosed());
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.scannerDataEnd(I)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test16()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerDataEnd(1477);
      assertEquals("id = 1477 =============== end ===============", string0);
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.orderStatus(ILjava/lang/String;IIDIIDILjava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test17()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.orderStatus((-478), "f4c)bp\"", (-478), (-478), (double) (-478), (-478), (-478), (double) (-478), (-478), "f4c)bp\"");
      assertEquals("order status: orderId=-478 clientId=-478 permId=-478 status=f4c)bp\" filled=-478 remaining=-478 avgFillPrice=-478.0 lastFillPrice=-478.0 parent Id=-478 whyHeld=f4c)bp\"", string0);
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.openOrderEnd()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test18()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.openOrderEnd();
      assertEquals(" =============== end ===============", string0);
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.realtimeBar(IJDDDDJDI)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test19()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.realtimeBar(11, (long) 11, (double) 11, (double) 11, (double) 11, (double) 11, (long) 11, (double) 11, 11);
      assertEquals("id=11 time = 11 open=11.0 high=11.0 low=11.0 close=11.0 volume=11 count=11 WAP=11.0", string0);
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updateMktDepthL2(IILjava/lang/String;IIDI)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test20()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepthL2(29, 29, "Afer changrSbarToP:             ", 29, 29, (double) 29, 29);
      assertEquals("updateMktDepth: 29 29 Afer changrSbarToP:              29 29 29.0 29", string0);
  }

  //Test case number: 21
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.nextValidId(I)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test21()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.nextValidId(8);
      assertEquals("Next Valid Order ID: 8", string0);
  }

  //Test case number: 22
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I49 Branch 4 IFGT L40 - false
   */

  @Test
  public void test22()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 0, 0.0, (double) 0, (double) 0, (double) 0);
      assertEquals("id=0  bidSize: vol = 0.0 delta = 0.0", string0);
  }

  //Test case number: 23
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.execDetailsEnd(I)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test23()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.execDetailsEnd(1309);
      assertEquals("reqId = 1309 =============== end ===============", string0);
  }

  //Test case number: 24
  /*
   * 3 covered goals:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I29 Branch 3 IFEQ L40 - false
   * Goal 2. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I85 Branch 6 IFLT L44 - false
   * Goal 3. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I92 Branch 7 IFEQ L44 - false
   */

  @Test
  public void test24()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, (double) 13L, (double) 13, (double) 13L, (double) 13);
      assertEquals("id=13  modelOptComp: vol = 13.0 delta = N/A: modelPrice = 13.0: pvDividend = 13.0", string0);
  }

  //Test case number: 25
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.scannerParameters(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test25()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerParameters("Afer changeSbarToPP:             ");
      assertEquals("SCANNER PARAMETERS:\nAfer changeSbarToPP:             ", string0);
  }

  //Test case number: 26
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.receiveFA(ILjava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test26()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.receiveFA(187, "updateMktDepth: 1 -1 -1 -1 -1.0 0");
      assertEquals("FA: null updateMktDepth: 1 -1 -1 -1 -1.0 0", string0);
  }

  //Test case number: 27
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.historicalData(ILjava/lang/String;DDDDIIDZ)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test27()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.historicalData(0, "leaf value=\"", (double) 0, (double) 0, (double) 0, (double) 0, 0, 0, (double) 0, true);
      assertEquals("id=0 date = leaf value=\" open=0.0 high=0.0 low=0.0 close=0.0 volume=0 count=0 WAP=0.0 hasGaps=true", string0);
  }

  //Test case number: 28
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.deltaNeutralValidation(ILcom/ib/client/UnderComp;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test28()  throws Throwable  {
      UnderComp underComp0 = new UnderComp();
      String string0 = EWrapperMsgGenerator.deltaNeutralValidation(0, underComp0);
      assertEquals("id = 0 underComp.conId =0 underComp.delta =0.0 underComp.price =0.0", string0);
  }

  //Test case number: 29
  /*
   * 3 covered goals:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.contractDetails(ILcom/ib/client/ContractDetails;)Ljava/lang/String;: root-Branch
   * Goal 2. com.ib.client.EWrapperMsgGenerator.contractDetailsMsg(Lcom/ib/client/ContractDetails;)Ljava/lang/String;: root-Branch
   * Goal 3. com.ib.client.EWrapperMsgGenerator.contractMsg(Lcom/ib/client/Contract;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test29()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.contractDetails(1, contractDetails0);
      assertEquals("reqId = 1 ===================================\n ---- Contract Details begin ----\nconid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\nmarketName = null\ntradingClass = null\nminTick = 0.0\nprice magnifier = 0\norderTypes = null\nvalidExchanges = null\nunderConId = 0\nlongName = null\ncontractMonth = null\nindustry = null\ncategory = null\nsubcategory = null\ntimeZoneId = null\ntradingHours = null\nliquidHours = null\n ---- Contract Details End ----\n", string0);
  }

  //Test case number: 30
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickString(IILjava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test30()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickString(0, 0, (String) null);
      assertEquals("id=0  bidSize=null", string0);
  }

  //Test case number: 31
  /*
   * 3 covered goals:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.openOrder(ILcom/ib/client/Contract;Lcom/ib/client/Order;Lcom/ib/client/OrderState;)Ljava/lang/String;: I303 Branch 10 IFLE L137 - true
   * Goal 2. com.ib.client.EWrapperMsgGenerator.openOrder(ILcom/ib/client/Contract;Lcom/ib/client/Order;Lcom/ib/client/OrderState;)Ljava/lang/String;: I371 Branch 13 IFNULL L147 - true
   * Goal 3. com.ib.client.EWrapperMsgGenerator.openOrder(ILcom/ib/client/Contract;Lcom/ib/client/Order;Lcom/ib/client/OrderState;)Ljava/lang/String;: I409 Branch 14 IFNE L155 - true
   */

  @Test
  public void test31()  throws Throwable  {
      OrderState orderState0 = new OrderState();
      Contract contract0 = new Contract();
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.openOrder((-765), contract0, order0, orderState0);
      assertEquals("open order: orderId=-765 action=null quantity=0 symbol=null exchange=null secType=null type=null lmtPrice=0.0 auxPrice=0.0 TIF=null localSymbol=null client Id=0 parent Id=0 permId=0 outsideRth=false hidden=false discretionaryAmt=0.0 triggerMethod=0 goodAfterTime=null goodTillDate=null faGroup=null faMethod=null faPercentage=null faProfile=null shortSaleSlot=0 designatedLocation= ocaGroup=null ocaType=0 rule80A=null allOrNone=false minQty=2147483647 percentOffset=1.7976931348623157E308 eTradeOnly=false firmQuoteOnly=false nbboPriceCap=1.7976931348623157E308 auctionStrategy=0 startingPrice=1.7976931348623157E308 stockRefPrice=1.7976931348623157E308 delta=1.7976931348623157E308 stockRangeLower=1.7976931348623157E308 stockRangeUpper=1.7976931348623157E308 volatility=1.7976931348623157E308 volatilityType=2147483647 deltaNeutralOrderType= deltaNeutralAuxPrice=1.7976931348623157E308 continuousUpdate=0 referencePriceType=2147483647 trailStopPrice=1.7976931348623157E308 scaleInitLevelSize= scaleSubsLevelSize= scalePriceIncrement= account=null settlingFirm=null clearingAccount=null clearingIntent=null notHeld=false whatIf=false status=null initMargin=null maintMargin=null equityWithLoan=null commission=0.0 minCommission=0.0 maxCommission=0.0 commissionCurrency=null warningText=null", string0);
  }

  //Test case number: 32
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updateAccountTime(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test32()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountTime("Afer changeSbarToPP:             ");
      assertEquals("updateAccountTime: Afer changeSbarToPP:             ", string0);
  }

  //Test case number: 33
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickEFP(IIDLjava/lang/String;DILjava/lang/String;DD)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test33()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickEFP(4352, 4352, (double) 4352, (String) null, (double) 4352, 4352, (String) null, (double) 4352, (double) 4352);
      assertEquals("id=4352  unknown: basisPoints = 4352.0/null impliedFuture = 4352.0 holdDays = 4352 futureExpiry = null dividendImpact = 4352.0 dividends to expiry = 4352.0", string0);
  }

  //Test case number: 34
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.currentTime(J)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test34()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.currentTime((-2927L));
      assertEquals("current time = -2927 (Dec 31, 1969 11:11:13 PM)", string0);
  }

  //Test case number: 35
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updateMktDepth(IIIIDI)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test35()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepth((-765), (-765), (-765), (-765), (double) (-765), (-765));
      assertEquals("updateMktDepth: -765 -765 -765 -765 -765.0 -765", string0);
  }

  //Test case number: 36
  /*
   * 3 covered goals:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I22 Branch 2 IFLT L40 - false
   * Goal 2. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I29 Branch 3 IFEQ L40 - true
   * Goal 3. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I69 Branch 5 IF_ICMPNE L43 - true
   */

  @Test
  public void test36()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 0, 1.7976931348623157E308, 1.7976931348623157E308, (double) 0, 1.7976931348623157E308);
      assertEquals("id=0  bidSize: vol = N/A delta = N/A", string0);
  }

  //Test case number: 37
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.fundamentalData(ILjava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test37()  throws Throwable  {
      Contract contract0 = new Contract();
      // Undeclared exception!
      try {
        String string0 = EWrapperMsgGenerator.fundamentalData(0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 38
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickGeneric(IID)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test38()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickGeneric(3081, 3081, (double) 3081);
      assertEquals("id=3081  unknown=3081.0", string0);
  }

  //Test case number: 39
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.managedAccounts(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test39()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.managedAccounts("QP;< (CC $- __=r1 $+ __=l2 ?$-- /^[$]|CC$/=lnum ?$++ /^[$]|CC$/=rnum) <1 __=l1C<- __=r2 !< (__ < (__ 2 _0)");
      assertEquals("Connected : The list of managed accounts are : [QP;< (CC $- __=r1 $+ __=l2 ?$-- /^[$]|CC$/=lnum ?$++ /^[$]|CC$/=rnum) <1 __=l1C<- __=r2 !< (__ < (__ 2 _0)]", string0);
  }

  //Test case number: 40
  /*
   * 6 covered goals:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I22 Branch 2 IFLT L40 - true
   * Goal 2. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I49 Branch 4 IFGT L40 - true
   * Goal 3. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I69 Branch 5 IF_ICMPNE L43 - false
   * Goal 4. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I85 Branch 6 IFLT L44 - true
   * Goal 5. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I120 Branch 8 IFLT L45 - false
   * Goal 6. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I127 Branch 9 IFEQ L45 - false
   */

  @Test
  public void test40()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, (double) (-4L), (double) 13, (double) (-4L), (double) 13);
      assertEquals("id=13  modelOptComp: vol = N/A delta = N/A: modelPrice = N/A: pvDividend = 13.0", string0);
  }

  //Test case number: 41
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickSize(III)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test41()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSize(1, 1, 1);
      assertEquals("id=1  bidPrice=1", string0);
  }

  //Test case number: 42
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updateNewsBulletin(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test42()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateNewsBulletin((-765), (-765), "Afer changeSbarToPP:             ", "Afer changeSbarToPP:             ");
      assertEquals("MsgId=-765 :: MsgType=-765 :: Origin=Afer changeSbarToPP:              :: Message=Afer changeSbarToPP:             ", string0);
  }
}

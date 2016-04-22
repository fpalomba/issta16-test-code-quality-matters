/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 13 02:06:02 GMT 2015
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
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickSize(III)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test00()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickSize(Integer.MAX_VALUE, 0, 0);
      assertEquals("id=2147483647  bidSize=0", string0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.orderStatus(ILjava/lang/String;IIDIIDILjava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test01()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.orderStatus(2658, "Ci1Du'liH%+vY8cs", 2658, 2658, (double) 2658, 2658, 2658, (double) 2658, 2658, "Ci1Du'liH%+vY8cs");
      assertEquals("order status: orderId=2658 clientId=2658 permId=2658 status=Ci1Du'liH%+vY8cs filled=2658 remaining=2658 avgFillPrice=2658.0 lastFillPrice=2658.0 parent Id=2658 whyHeld=Ci1Du'liH%+vY8cs", string0);
  }

  //Test case number: 2
  /*
   * 3 covered goals:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.openOrder(ILcom/ib/client/Contract;Lcom/ib/client/Order;Lcom/ib/client/OrderState;)Ljava/lang/String;: I303 Branch 10 IFLE L137 - false
   * Goal 2. com.ib.client.EWrapperMsgGenerator.openOrder(ILcom/ib/client/Contract;Lcom/ib/client/Order;Lcom/ib/client/OrderState;)Ljava/lang/String;: I311 Branch 11 IFNULL L138 - true
   * Goal 3. com.ib.client.EWrapperMsgGenerator.openOrder(ILcom/ib/client/Contract;Lcom/ib/client/Order;Lcom/ib/client/OrderState;)Ljava/lang/String;: I335 Branch 12 IFEQ L141 - true
   */

  @Test
  public void test02()  throws Throwable  {
      Vector<CategoryWordTag> vector0 = new Vector<CategoryWordTag>();
      Contract contract0 = new Contract((-35), " legsStr=", "BAG", "BAG", (double) (-35), "BAG", " legsStr=", " legsStr=", " legsStr=", " legsStr=", (Vector) vector0, " legsStr=", true, "BAG", " legsStr=");
      Order order0 = new Order();
      OrderState orderState0 = new OrderState((String) null, (String) null, (String) null, " legsStr=", 0, 1.7976931348623157E308, 0, "BAG", (String) null);
      String string0 = EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      assertEquals("open order: orderId=0 action=null quantity=0 symbol= legsStr= exchange= legsStr= secType=BAG type=null lmtPrice=0.0 auxPrice=0.0 TIF=null localSymbol= legsStr= client Id=0 parent Id=0 permId=0 outsideRth=false hidden=false discretionaryAmt=0.0 triggerMethod=0 goodAfterTime=null goodTillDate=null faGroup=null faMethod=null faPercentage=null faProfile=null shortSaleSlot=0 designatedLocation= ocaGroup=null ocaType=0 rule80A=null allOrNone=false minQty=2147483647 percentOffset=1.7976931348623157E308 eTradeOnly=false firmQuoteOnly=false nbboPriceCap=1.7976931348623157E308 auctionStrategy=0 startingPrice=1.7976931348623157E308 stockRefPrice=1.7976931348623157E308 delta=1.7976931348623157E308 stockRangeLower=1.7976931348623157E308 stockRangeUpper=1.7976931348623157E308 volatility=1.7976931348623157E308 volatilityType=2147483647 deltaNeutralOrderType= deltaNeutralAuxPrice=1.7976931348623157E308 continuousUpdate=0 referencePriceType=2147483647 trailStopPrice=1.7976931348623157E308 scaleInitLevelSize= scaleSubsLevelSize= scalePriceIncrement= account=null settlingFirm=null clearingAccount=null clearingIntent=null notHeld=false whatIf=false status=null initMargin=null maintMargin=null equityWithLoan= legsStr= commission=0.0 minCommission= maxCommission=0.0 commissionCurrency=BAG warningText=null", string0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.realtimeBar(IJDDDDJDI)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test03()  throws Throwable  {
      UnderComp underComp0 = new UnderComp();
      String string0 = EWrapperMsgGenerator.realtimeBar(0, (long) 0, 0.0, 0.0, (double) 0, 0.0, (long) 0, 0.0, 0);
      assertEquals("id=0 time = 0 open=0.0 high=0.0 low=0.0 close=0.0 volume=0 count=0 WAP=0.0", string0);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.openOrderEnd()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test04()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.openOrderEnd();
      assertEquals(" =============== end ===============", string0);
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.contractDetails(ILcom/ib/client/ContractDetails;)Ljava/lang/String;: root-Branch
   * Goal 2. com.ib.client.EWrapperMsgGenerator.contractDetailsMsg(Lcom/ib/client/ContractDetails;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test05()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.contractDetails(0, contractDetails0);
      assertEquals("reqId = 0 ===================================\n ---- Contract Details begin ----\nconid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\nmarketName = null\ntradingClass = null\nminTick = 0.0\nprice magnifier = 0\norderTypes = null\nvalidExchanges = null\nunderConId = 0\nlongName = null\ncontractMonth = null\nindustry = null\ncategory = null\nsubcategory = null\ntimeZoneId = null\ntradingHours = null\nliquidHours = null\n ---- Contract Details End ----\n", string0);
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.scannerData(IILcom/ib/client/ContractDetails;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test06()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.scannerData(21, 21, contractDetails0, (String) null, (String) null, (String) null, (String) null);
      assertEquals("id = 21 rank=21 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance=null benchmark=null projection=null legsStr=null", string0);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I29 Branch 3 IFEQ L40 - true
   */

  @Test
  public void test07()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, Integer.MAX_VALUE, 1.7976931348623157E308, (double) 0, (double) Integer.MAX_VALUE, (double) Integer.MAX_VALUE);
      assertEquals("id=0  unknown: vol = N/A delta = 0.0", string0);
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickPrice(IIDI)Ljava/lang/String;: I24 Branch 1 IFEQ L30 - true
   */

  @Test
  public void test08()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice(0, 0, (double) 0, 0);
      assertEquals("id=0  bidSize=0.0  noAutoExecute", string0);
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updateAccountTime(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test09()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountTime("1");
      assertEquals("updateAccountTime: 1", string0);
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.historicalData(ILjava/lang/String;DDDDIIDZ)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test10()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.historicalData(0, (String) null, (double) Integer.MAX_VALUE, (double) 0, (double) Integer.MAX_VALUE, 0.0, 0, Integer.MAX_VALUE, 1.7976931348623157E308, false);
      assertEquals("id=0 date = null open=2.147483647E9 high=0.0 low=2.147483647E9 close=0.0 volume=0 count=2147483647 WAP=1.7976931348623157E308 hasGaps=false", string0);
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updateNewsBulletin(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test11()  throws Throwable  {
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.updateNewsBulletin(0, 0, (String) null, (String) null);
      assertEquals("MsgId=0 :: MsgType=0 :: Origin=null :: Message=null", string0);
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.contractDetailsEnd(I)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test12()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.contractDetailsEnd(2904);
      assertEquals("reqId = 2904 =============== end ===============", string0);
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickEFP(IIDLjava/lang/String;DILjava/lang/String;DD)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test13()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickEFP(0, 0, (double) 0, "-~U9h,)&:~}(1^KWw<", (double) 0, 0, "-~U9h,)&:~}(1^KWw<", (double) 0, (double) 0);
      assertEquals("id=0  bidSize: basisPoints = 0.0/-~U9h,)&:~}(1^KWw< impliedFuture = 0.0 holdDays = 0 futureExpiry = -~U9h,)&:~}(1^KWw< dividendImpact = 0.0 dividends to expiry = 0.0", string0);
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.execDetails(ILcom/ib/client/Contract;Lcom/ib/client/Execution;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test14()  throws Throwable  {
      Execution execution0 = new Execution();
      // Undeclared exception!
      try {
        String string0 = EWrapperMsgGenerator.execDetails(0, (Contract) null, execution0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickGeneric(IID)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test15()  throws Throwable  {
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.tickGeneric(0, 0, 0.0);
      assertEquals("id=0  bidSize=0.0", string0);
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.managedAccounts(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test16()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.managedAccounts("SBARQ < ((WHNP=what < WP) $+ (SQ=sq < (/^VB/=verb < ");
      assertEquals("Connected : The list of managed accounts are : [SBARQ < ((WHNP=what < WP) $+ (SQ=sq < (/^VB/=verb < ]", string0);
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickString(IILjava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test17()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickString(11, 11, "[if exists lnum createSubtree QP l1 r1] [if notexists lnum createSubtree NP l1 r1] [if xistsrnum createSubtree QP l2 r2] [if not exists rnum creatSubtree NP l2 r2]");
      assertEquals("id=11  askOptComp=[if exists lnum createSubtree QP l1 r1] [if notexists lnum createSubtree NP l1 r1] [if xistsrnum createSubtree QP l2 r2] [if not exists rnum creatSubtree NP l2 r2]", string0);
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.receiveFA(ILjava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test18()  throws Throwable  {
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.receiveFA(0, (String) null);
      assertEquals("FA: null null", string0);
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.<init>()V: root-Branch
   */

  @Test
  public void test19()  throws Throwable  {
      EWrapperMsgGenerator eWrapperMsgGenerator0 = new EWrapperMsgGenerator();
      assertEquals(" =============== end ===============", eWrapperMsgGenerator0.openOrderEnd());
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.openOrder(ILcom/ib/client/Contract;Lcom/ib/client/Order;Lcom/ib/client/OrderState;)Ljava/lang/String;: I371 Branch 13 IFNULL L147 - true
   */

  @Test
  public void test20()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.openOrder(Integer.MAX_VALUE, contractDetails0.m_summary, order0, orderState0);
      assertEquals("open order: orderId=2147483647 action=null quantity=0 symbol=null exchange=null secType=null type=null lmtPrice=0.0 auxPrice=0.0 TIF=null localSymbol=null client Id=0 parent Id=0 permId=0 outsideRth=false hidden=false discretionaryAmt=0.0 triggerMethod=0 goodAfterTime=null goodTillDate=null faGroup=null faMethod=null faPercentage=null faProfile=null shortSaleSlot=0 designatedLocation= ocaGroup=null ocaType=0 rule80A=null allOrNone=false minQty=2147483647 percentOffset=1.7976931348623157E308 eTradeOnly=false firmQuoteOnly=false nbboPriceCap=1.7976931348623157E308 auctionStrategy=0 startingPrice=1.7976931348623157E308 stockRefPrice=1.7976931348623157E308 delta=1.7976931348623157E308 stockRangeLower=1.7976931348623157E308 stockRangeUpper=1.7976931348623157E308 volatility=1.7976931348623157E308 volatilityType=2147483647 deltaNeutralOrderType= deltaNeutralAuxPrice=1.7976931348623157E308 continuousUpdate=0 referencePriceType=2147483647 trailStopPrice=1.7976931348623157E308 scaleInitLevelSize= scaleSubsLevelSize= scalePriceIncrement= account=null settlingFirm=null clearingAccount=null clearingIntent=null notHeld=false whatIf=false status=null initMargin=null maintMargin=null equityWithLoan=null commission=0.0 minCommission=0.0 maxCommission=0.0 commissionCurrency=null warningText=null", string0);
  }

  //Test case number: 21
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.deltaNeutralValidation(ILcom/ib/client/UnderComp;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test21()  throws Throwable  {
      UnderComp underComp0 = new UnderComp();
      String string0 = EWrapperMsgGenerator.deltaNeutralValidation(21, underComp0);
      assertEquals("id = 21 underComp.conId =0 underComp.delta =0.0 underComp.price =0.0", string0);
  }

  //Test case number: 22
  /*
   * 4 covered goals:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updateMktDepthL2(IILjava/lang/String;IIDI)Ljava/lang/String;: root-Branch
   * Goal 2. com.ib.client.EWrapperMsgGenerator.openOrder(ILcom/ib/client/Contract;Lcom/ib/client/Order;Lcom/ib/client/OrderState;)Ljava/lang/String;: I303 Branch 10 IFLE L137 - true
   * Goal 3. com.ib.client.EWrapperMsgGenerator.openOrder(ILcom/ib/client/Contract;Lcom/ib/client/Order;Lcom/ib/client/OrderState;)Ljava/lang/String;: I371 Branch 13 IFNULL L147 - false
   * Goal 4. com.ib.client.EWrapperMsgGenerator.openOrder(ILcom/ib/client/Contract;Lcom/ib/client/Order;Lcom/ib/client/OrderState;)Ljava/lang/String;: I409 Branch 14 IFNE L155 - true
   */

  @Test
  public void test22()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepthL2(6091, 6091, "Uh90)'@ :|", 6091, 6091, (double) 6091, 6091);
      assertEquals("updateMktDepth: 6091 6091 Uh90)'@ :| 6091 6091 6091.0 6091", string0);
      
      Contract contract0 = new Contract();
      Order order0 = new Order();
      OrderState orderState0 = new OrderState((String) null, (String) null, (String) null, (String) null, 1.7976931348623157E308, 6091, 6091, (String) null, (String) null);
      UnderComp underComp0 = new UnderComp();
      contract0.m_underComp = underComp0;
      String string1 = EWrapperMsgGenerator.openOrder(6091, contract0, order0, orderState0);
      assertEquals("open order: orderId=6091 action=null quantity=0 symbol=null exchange=null secType=null type=null lmtPrice=0.0 auxPrice=0.0 TIF=null localSymbol=null client Id=0 parent Id=0 permId=0 outsideRth=false hidden=false discretionaryAmt=0.0 triggerMethod=0 goodAfterTime=null goodTillDate=null faGroup=null faMethod=null faPercentage=null faProfile=null shortSaleSlot=0 designatedLocation= ocaGroup=null ocaType=0 rule80A=null allOrNone=false minQty=2147483647 percentOffset=1.7976931348623157E308 eTradeOnly=false firmQuoteOnly=false nbboPriceCap=1.7976931348623157E308 auctionStrategy=0 startingPrice=1.7976931348623157E308 stockRefPrice=1.7976931348623157E308 delta=1.7976931348623157E308 stockRangeLower=1.7976931348623157E308 stockRangeUpper=1.7976931348623157E308 volatility=1.7976931348623157E308 volatilityType=2147483647 deltaNeutralOrderType= deltaNeutralAuxPrice=1.7976931348623157E308 continuousUpdate=0 referencePriceType=2147483647 trailStopPrice=1.7976931348623157E308 scaleInitLevelSize= scaleSubsLevelSize= scalePriceIncrement= account=null settlingFirm=null clearingAccount=null clearingIntent=null notHeld=false whatIf=false underComp.conId =0 underComp.delta =0.0 underComp.price =0.0 status=null initMargin=null maintMargin=null equityWithLoan=null commission= minCommission=6091.0 maxCommission=6091.0 commissionCurrency=null warningText=null", string1);
  }

  //Test case number: 23
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updateAccountValue(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test23()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountValue("SBARQ < (WHNP=what < W) $+ (=sq < (/^VB/=verb < ", "SBARQ < (WHNP=what < W) $+ (=sq < (/^VB/=verb < ", "SBARQ < (WHNP=what < W) $+ (=sq < (/^VB/=verb < ", "SBARQ < (WHNP=what < W) $+ (=sq < (/^VB/=verb < ");
      assertEquals("updateAccountValue: SBARQ < (WHNP=what < W) $+ (=sq < (/^VB/=verb <  SBARQ < (WHNP=what < W) $+ (=sq < (/^VB/=verb <  SBARQ < (WHNP=what < W) $+ (=sq < (/^VB/=verb <  SBARQ < (WHNP=what < W) $+ (=sq < (/^VB/=verb < ", string0);
  }

  //Test case number: 24
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.accountDownloadEnd(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test24()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.accountDownloadEnd("[if exists lnum createSubtree QP l1 r1] [if notexists lnum createSubtree NP l1 r1] [if xistsrnum createSubtree QP l2 r2] [if not exists rnum createSubtree NP l2 r2]");
      assertEquals("accountDownloadEnd: [if exists lnum createSubtree QP l1 r1] [if notexists lnum createSubtree NP l1 r1] [if xistsrnum createSubtree QP l2 r2] [if not exists rnum createSubtree NP l2 r2]", string0);
  }

  //Test case number: 25
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickPrice(IIDI)Ljava/lang/String;: I24 Branch 1 IFEQ L30 - false
   */

  @Test
  public void test25()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice((-14), (-14), (double) (-14), (-14));
      assertEquals("id=-14  unknown=-14.0  canAutoExecute", string0);
  }

  //Test case number: 26
  /*
   * 2 covered goals:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updatePortfolio(Lcom/ib/client/Contract;IDDDDDLjava/lang/String;)Ljava/lang/String;: root-Branch
   * Goal 2. com.ib.client.EWrapperMsgGenerator.contractMsg(Lcom/ib/client/Contract;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test26()  throws Throwable  {
      Contract contract0 = new Contract();
      ContractDetails contractDetails0 = new ContractDetails(contract0, (String) null, (String) null, (double) 0, (String) null, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
      String string0 = EWrapperMsgGenerator.updatePortfolio(contractDetails0.m_summary, 0, 0.0, 0.0, 0.0, (double) 0, 0.0, (String) null);
      assertEquals("updatePortfolio: conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n0 0.0 0.0 0.0 0.0 0.0 null", string0);
  }

  //Test case number: 27
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickSnapshotEnd(I)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test27()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSnapshotEnd(6);
      assertEquals("id=6 =============== end ===============", string0);
  }

  //Test case number: 28
  /*
   * 2 covered goals:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I22 Branch 2 IFLT L40 - true
   * Goal 2. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I69 Branch 5 IF_ICMPNE L43 - true
   */

  @Test
  public void test28()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation((-2719), (-2719), (double) (-2719), (double) (-2719), (double) (-2719), (double) (-2719));
      assertEquals("id=-2719  unknown: vol = N/A delta = N/A", string0);
  }

  //Test case number: 29
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.scannerParameters(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test29()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerParameters("[if exists lnum createSubtree QP l1 r1] [if notexists lnum createSubtree NP l1 r1] [if xistsrnum createSubtree QP l2 r2] [if not exists rnum createSubtree NP l2 r2]");
      assertEquals("SCANNER PARAMETERS:\n[if exists lnum createSubtree QP l1 r1] [if notexists lnum createSubtree NP l1 r1] [if xistsrnum createSubtree QP l2 r2] [if not exists rnum createSubtree NP l2 r2]", string0);
  }

  //Test case number: 30
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.fundamentalData(ILjava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test30()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.fundamentalData((-2718), "SBARQ < ((WHNP=what < WP) $+ (SQ=sq < (/^VB/=verb < ");
      assertEquals("id  = -2718 len = 52\nSBARQ < ((WHNP=what < WP) $+ (SQ=sq < (/^VB/=verb < ", string0);
  }

  //Test case number: 31
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.scannerDataEnd(I)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test31()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerDataEnd(902);
      assertEquals("id = 902 =============== end ===============", string0);
  }

  //Test case number: 32
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.bondContractDetails(ILcom/ib/client/ContractDetails;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test32()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.bondContractDetails(0, contractDetails0);
      assertEquals("reqId = 0 ===================================\n ---- Bond Contract Details begin ----\nsymbol = null\nsecType = null\ncusip = null\ncoupon = 0.0\nmaturity = null\nissueDate = null\nratings = null\nbondType = null\ncouponType = null\nconvertible = false\ncallable = false\nputable = false\ndescAppend = null\nexchange = null\ncurrency = null\nmarketName = null\ntradingClass = null\nconid = 0\nminTick = 0.0\norderTypes = null\nvalidExchanges = null\nnextOptionDate = null\nnextOptionType = null\nnextOptionPartial = false\nnotes = null\nlongName = null\n ---- Bond Contract Details End ----\n", string0);
  }

  //Test case number: 33
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.execDetailsEnd(I)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test33()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.execDetailsEnd(19);
      assertEquals("reqId = 19 =============== end ===============", string0);
  }

  //Test case number: 34
  /*
   * 2 covered goals:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I49 Branch 4 IFGT L40 - false
   * Goal 2. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I85 Branch 6 IFLT L44 - true
   */

  @Test
  public void test34()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 13, (double) 0, (-0.33217768613162), (-0.33217768613162), (-0.33217768613162));
      assertEquals("id=0  modelOptComp: vol = 0.0 delta = -0.33217768613162: modelPrice = N/A: pvDividend = N/A", string0);
  }

  //Test case number: 35
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updateMktDepth(IIIIDI)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test35()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepth((-1440), (-1440), (-1440), (-1440), (double) (-1440), (-1440));
      assertEquals("updateMktDepth: -1440 -1440 -1440 -1440 -1440.0 -1440", string0);
  }

  //Test case number: 36
  /*
   * 2 covered goals:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I92 Branch 7 IFEQ L44 - true
   * Goal 2. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I120 Branch 8 IFLT L45 - true
   */

  @Test
  public void test36()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 13, (double) 0, (double) 13, 1.7976931348623157E308, (-3114.78348));
      assertEquals("id=0  modelOptComp: vol = 0.0 delta = N/A: modelPrice = N/A: pvDividend = N/A", string0);
  }

  //Test case number: 37
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.nextValidId(I)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test37()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.nextValidId(2886);
      assertEquals("Next Valid Order ID: 2886", string0);
  }

  //Test case number: 38
  /*
   * 8 covered goals:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I22 Branch 2 IFLT L40 - false
   * Goal 2. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I29 Branch 3 IFEQ L40 - false
   * Goal 3. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I49 Branch 4 IFGT L40 - true
   * Goal 4. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I69 Branch 5 IF_ICMPNE L43 - false
   * Goal 5. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I85 Branch 6 IFLT L44 - false
   * Goal 6. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I92 Branch 7 IFEQ L44 - false
   * Goal 7. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I120 Branch 8 IFLT L45 - false
   * Goal 8. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I127 Branch 9 IFEQ L45 - false
   */

  @Test
  public void test38()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, (double) 13, (double) 13, (double) 13, (double) 13);
      assertEquals("id=13  modelOptComp: vol = 13.0 delta = N/A: modelPrice = 13.0: pvDividend = 13.0", string0);
  }

  //Test case number: 39
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.currentTime(J)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test39()  throws Throwable  {
      Contract contract0 = new Contract();
      ContractDetails contractDetails0 = new ContractDetails(contract0, (String) null, (String) null, (double) 0, (String) null, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
      String string0 = EWrapperMsgGenerator.currentTime((long) 0);
      assertEquals("current time = 0 (Jan 1, 1970 12:00:00 AM)", string0);
  }
}

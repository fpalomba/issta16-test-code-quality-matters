/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 13 03:35:53 GMT 2015
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
import edu.stanford.nlp.ling.WordTag;
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
      Vector<WordTag> vector0 = new Vector<WordTag>();
      Contract contract0 = new Contract(0, "id = 2517 =============== end ===============", "y[6", "`,)6;9g= n/<*rc9\"nh", (double) 0, "id=2517  unknown=2517.0", "`,)6;9g= n/<*rc9\"nh", "^ONKphGO'%85!\"MCabo", "id = 2517 =============== end ===============", " open=", (Vector) vector0, "^ONKphGO'%85!\"MCabo", true, "id=2517  unknown=2517.0", "`,)6;9g= n/<*rc9\"nh");
      Order order0 = new Order();
      OrderState orderState0 = new OrderState((String) null, "Sunday", "armbar", "^ONKphGO'%85!\"MCabo", 1.7976931348623157E308, 0.0, 613.1, "%>_", "");
      String string0 = EWrapperMsgGenerator.openOrder(18, contract0, order0, orderState0);
      assertEquals("open order: orderId=18 action=null quantity=0 symbol=id = 2517 =============== end =============== exchange=^ONKphGO'%85!\"MCabo secType=y[6 type=null lmtPrice=0.0 auxPrice=0.0 TIF=null localSymbol= open= client Id=0 parent Id=0 permId=0 outsideRth=false hidden=false discretionaryAmt=0.0 triggerMethod=0 goodAfterTime=null goodTillDate=null faGroup=null faMethod=null faPercentage=null faProfile=null shortSaleSlot=0 designatedLocation= ocaGroup=null ocaType=0 rule80A=null allOrNone=false minQty=2147483647 percentOffset=1.7976931348623157E308 eTradeOnly=false firmQuoteOnly=false nbboPriceCap=1.7976931348623157E308 auctionStrategy=0 startingPrice=1.7976931348623157E308 stockRefPrice=1.7976931348623157E308 delta=1.7976931348623157E308 stockRangeLower=1.7976931348623157E308 stockRangeUpper=1.7976931348623157E308 volatility=1.7976931348623157E308 volatilityType=2147483647 deltaNeutralOrderType= deltaNeutralAuxPrice=1.7976931348623157E308 continuousUpdate=0 referencePriceType=2147483647 trailStopPrice=1.7976931348623157E308 scaleInitLevelSize= scaleSubsLevelSize= scalePriceIncrement= account=null settlingFirm=null clearingAccount=null clearingIntent=null notHeld=false whatIf=false status=null initMargin=Sunday maintMargin=armbar equityWithLoan=^ONKphGO'%85!\"MCabo commission= minCommission=0.0 maxCommission=613.1 commissionCurrency=%>_ warningText=", string0);
  }

  //Test case number: 1
  /*
   * 7 covered goals:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I29 Branch 3 IFEQ L40 - false
   * Goal 2. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I49 Branch 4 IFGT L40 - false
   * Goal 3. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I69 Branch 5 IF_ICMPNE L43 - false
   * Goal 4. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I85 Branch 6 IFLT L44 - false
   * Goal 5. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I92 Branch 7 IFEQ L44 - false
   * Goal 6. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I120 Branch 8 IFLT L45 - false
   * Goal 7. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I127 Branch 9 IFEQ L45 - false
   */

  @Test
  public void test01()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, 0.9, 0.0, (double) 0, (double) 13);
      assertEquals("id=13  modelOptComp: vol = 0.9 delta = 0.0: modelPrice = 0.0: pvDividend = 13.0", string0);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I22 Branch 2 IFLT L40 - false
   * Goal 2. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I29 Branch 3 IFEQ L40 - true
   */

  @Test
  public void test02()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(737, (-1450), 1.7976931348623157E308, 20.654433080202903, 20.654433080202903, (-1736.733255));
      assertEquals("id=737  unknown: vol = N/A delta = N/A", string0);
  }

  //Test case number: 3
  /*
   * 3 covered goals:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I22 Branch 2 IFLT L40 - true
   * Goal 2. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I49 Branch 4 IFGT L40 - true
   * Goal 3. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I69 Branch 5 IF_ICMPNE L43 - true
   */

  @Test
  public void test03()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 0, (-393.164499430246), (-393.164499430246), 0.0, (-393.164499430246));
      assertEquals("id=0  bidSize: vol = N/A delta = N/A", string0);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickPrice(IIDI)Ljava/lang/String;: I24 Branch 1 IFEQ L30 - false
   */

  @Test
  public void test04()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice(634, 1981, (double) 634, 634);
      assertEquals("id=634  unknown=634.0  canAutoExecute", string0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickPrice(IIDI)Ljava/lang/String;: I24 Branch 1 IFEQ L30 - true
   */

  @Test
  public void test05()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice((-1), 0, (double) (-1), 0);
      assertEquals("id=-1  bidSize=-1.0  noAutoExecute", string0);
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updateMktDepth(IIIIDI)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test06()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepth(3731, 0, 4818, 0, 1.0, 5);
      assertEquals("updateMktDepth: 3731 0 4818 0 1.0 5", string0);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickString(IILjava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test07()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickString((-627), 13, "id=13  modelOptComp=-1693.0");
      assertEquals("id=-627  modelOptComp=id=13  modelOptComp=-1693.0", string0);
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.deltaNeutralValidation(ILcom/ib/client/UnderComp;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test08()  throws Throwable  {
      UnderComp underComp0 = new UnderComp();
      String string0 = EWrapperMsgGenerator.deltaNeutralValidation(1303, underComp0);
      assertEquals("id = 1303 underComp.conId =0 underComp.delta =0.0 underComp.price =0.0", string0);
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updateNewsBulletin(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test09()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateNewsBulletin((-1693), 13, "EmbeddingFeatureFactory", "EmbeddingFeatureFactory");
      assertEquals("MsgId=-1693 :: MsgType=13 :: Origin=EmbeddingFeatureFactory :: Message=EmbeddingFeatureFactory", string0);
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.fundamentalData(ILjava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try {
        String string0 = EWrapperMsgGenerator.fundamentalData(742, (String) null);
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
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updatePortfolio(Lcom/ib/client/Contract;IDDDDDLjava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test11()  throws Throwable  {
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.updatePortfolio(contract0, 0, (-3.4587292534E10), 0.0, (-2555.88506545611), (-3.4587292534E10), (-296.9302203508), ":a=QW/");
      assertEquals("updatePortfolio: conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n0 -3.4587292534E10 0.0 -2555.88506545611 -3.4587292534E10 -296.9302203508 :a=QW/", string0);
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updateAccountValue(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test12()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountValue("", "'d$zQE:pQ]$UKo@", "liquidation = ", "L!2`&uxB~");
      assertEquals("updateAccountValue:  'd$zQE:pQ]$UKo@ liquidation =  L!2`&uxB~", string0);
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.receiveFA(ILjava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test13()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.receiveFA(0, "");
      assertEquals("FA: null ", string0);
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.contractDetailsEnd(I)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test14()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.contractDetailsEnd((-1839));
      assertEquals("reqId = -1839 =============== end ===============", string0);
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickSnapshotEnd(I)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test15()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSnapshotEnd(13);
      assertEquals("id=13 =============== end ===============", string0);
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.orderStatus(ILjava/lang/String;IIDIIDILjava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test16()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.orderStatus(0, "id=0  bidSize: basisPoints = 2053.6/9 impliedFuture = 288.3187199523263 holdDays = -144 futureExpiry =  dividendImpact = 0.0 dividends to expiry = 288.3187199523263", 1699, 2793, 1.0, 0, 0, 0.95, 0, "");
      assertEquals("order status: orderId=0 clientId=0 permId=0 status=id=0  bidSize: basisPoints = 2053.6/9 impliedFuture = 288.3187199523263 holdDays = -144 futureExpiry =  dividendImpact = 0.0 dividends to expiry = 288.3187199523263 filled=1699 remaining=2793 avgFillPrice=1.0 lastFillPrice=0.95 parent Id=0 whyHeld=", string0);
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.scannerDataEnd(I)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test17()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerDataEnd(2517);
      assertEquals("id = 2517 =============== end ===============", string0);
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickGeneric(IID)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test18()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickGeneric(13, 13, (double) (-1693));
      assertEquals("id=13  modelOptComp=-1693.0", string0);
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.managedAccounts(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test19()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.managedAccounts("*_");
      assertEquals("Connected : The list of managed accounts are : [*_]", string0);
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.<init>()V: root-Branch
   */

  @Test
  public void test20()  throws Throwable  {
      EWrapperMsgGenerator eWrapperMsgGenerator0 = new EWrapperMsgGenerator();
      assertEquals(" =============== end ===============", eWrapperMsgGenerator0.openOrderEnd());
  }

  //Test case number: 21
  /*
   * 3 covered goals:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.contractDetails(ILcom/ib/client/ContractDetails;)Ljava/lang/String;: root-Branch
   * Goal 2. com.ib.client.EWrapperMsgGenerator.contractDetailsMsg(Lcom/ib/client/ContractDetails;)Ljava/lang/String;: root-Branch
   * Goal 3. com.ib.client.EWrapperMsgGenerator.contractMsg(Lcom/ib/client/Contract;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test21()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.contractDetails(634, contractDetails0);
      assertEquals("reqId = 634 ===================================\n ---- Contract Details begin ----\nconid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\nmarketName = null\ntradingClass = null\nminTick = 0.0\nprice magnifier = 0\norderTypes = null\nvalidExchanges = null\nunderConId = 0\nlongName = null\ncontractMonth = null\nindustry = null\ncategory = null\nsubcategory = null\ntimeZoneId = null\ntradingHours = null\nliquidHours = null\n ---- Contract Details End ----\n", string0);
  }

  //Test case number: 22
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.accountDownloadEnd(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test22()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.accountDownloadEnd("tolm-j3MNEKCE3x");
      assertEquals("accountDownloadEnd: tolm-j3MNEKCE3x", string0);
  }

  //Test case number: 23
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updateMktDepthL2(IILjava/lang/String;IIDI)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test23()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepthL2(1113, 2517, "}", (-173), 674, (double) 1113, (-1603));
      assertEquals("updateMktDepth: 1113 2517 } -173 674 1113.0 -1603", string0);
  }

  //Test case number: 24
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.bondContractDetails(ILcom/ib/client/ContractDetails;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test24()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.bondContractDetails(634, contractDetails0);
      assertEquals("reqId = 634 ===================================\n ---- Bond Contract Details begin ----\nsymbol = null\nsecType = null\ncusip = null\ncoupon = 0.0\nmaturity = null\nissueDate = null\nratings = null\nbondType = null\ncouponType = null\nconvertible = false\ncallable = false\nputable = false\ndescAppend = null\nexchange = null\ncurrency = null\nmarketName = null\ntradingClass = null\nconid = 0\nminTick = 0.0\norderTypes = null\nvalidExchanges = null\nnextOptionDate = null\nnextOptionType = null\nnextOptionPartial = false\nnotes = null\nlongName = null\n ---- Bond Contract Details End ----\n", string0);
  }

  //Test case number: 25
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.scannerData(IILcom/ib/client/ContractDetails;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test25()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.scannerData(0, 1774, contractDetails0, "", "q$R`MIeM4UO4WiR*/", (String) null, "shot");
      assertEquals("id = 0 rank=1774 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance= benchmark=q$R`MIeM4UO4WiR*/ projection=null legsStr=shot", string0);
  }

  //Test case number: 26
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.realtimeBar(IJDDDDJDI)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test26()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.realtimeBar(0, (long) 0, 1.0E-100, (double) 0, 0.0, (double) 1981, 0L, 0.0, 0);
      assertEquals("id=0 time = 0 open=1.0E-100 high=0.0 low=0.0 close=1981.0 volume=0 count=0 WAP=0.0", string0);
  }

  //Test case number: 27
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.nextValidId(I)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test27()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.nextValidId((-1));
      assertEquals("Next Valid Order ID: -1", string0);
  }

  //Test case number: 28
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.execDetailsEnd(I)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test28()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.execDetailsEnd(0);
      assertEquals("reqId = 0 =============== end ===============", string0);
  }

  //Test case number: 29
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.currentTime(J)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test29()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.currentTime((long) 1391);
      assertEquals("current time = 1391 (Jan 1, 1970 12:23:11 AM)", string0);
  }

  //Test case number: 30
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.openOrderEnd()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test30()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.openOrderEnd();
      assertEquals(" =============== end ===============", string0);
  }

  //Test case number: 31
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickEFP(IIDLjava/lang/String;DILjava/lang/String;DD)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test31()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickEFP(0, 0, 2053.6, "9", 288.3187199523263, (-144), "", (double) 0, 288.3187199523263);
      assertEquals("id=0  bidSize: basisPoints = 2053.6/9 impliedFuture = 288.3187199523263 holdDays = -144 futureExpiry =  dividendImpact = 0.0 dividends to expiry = 288.3187199523263", string0);
  }

  //Test case number: 32
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.execDetails(ILcom/ib/client/Contract;Lcom/ib/client/Execution;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test32()  throws Throwable  {
      Contract contract0 = new Contract();
      ContractDetails contractDetails0 = new ContractDetails(contract0, "2/- g/`vN?Up,\"", "p;[F1", (-1.0), (String) null, "p;[F1", 2, "[pF+al_'EQ\"T~i", "r?g#a#)ji&aLsHjCs&", "", "SK[B%LArV@5!=K", "oS!jE=Xfcq+\"5_D ", "4d>D8uXU", (String) null, "[pF+al_'EQ\"T~i");
      Execution execution0 = new Execution(2, 0, " legsStr=", " legsStr=", "5?Qmb|ZUpQ[=`_3mN", (String) null, (String) null, 2, 50.0, 0, 0, 0, 2775.5090878);
      String string0 = EWrapperMsgGenerator.execDetails(4904, contractDetails0.m_summary, execution0);
      assertEquals(" ---- Execution Details begin ----\nreqId = 4904\norderId = 2\nclientId = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\ncontractExchange = null\ncurrency = null\nlocalSymbol = null\nexecId =  legsStr=\ntime =  legsStr=\nacctNumber = 5?Qmb|ZUpQ[=`_3mN\nexecutionExchange = null\nside = null\nshares = 2\nprice = 50.0\npermId = 0\nliquidation = 0\ncumQty = 0\navgPrice = 2775.5090878\n ---- Execution Details end ----\n", string0);
  }

  //Test case number: 33
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickSize(III)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test33()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSize(891, 2527, (-1));
      assertEquals("id=891  unknown=-1", string0);
  }

  //Test case number: 34
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.scannerParameters(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test34()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerParameters("i;;4*^32E2bz@-qL");
      assertEquals("SCANNER PARAMETERS:\ni;;4*^32E2bz@-qL", string0);
  }

  //Test case number: 35
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.historicalData(ILjava/lang/String;DDDDIIDZ)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test35()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.historicalData(0, " remaining=", (-1901.0), (-1017.2747), 0.0, 0.0, 4838, 0, 1982.9936985913, false);
      assertEquals("id=0 date =  remaining= open=-1901.0 high=-1017.2747 low=0.0 close=0.0 volume=4838 count=0 WAP=1982.9936985913 hasGaps=false", string0);
  }

  //Test case number: 36
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updateAccountTime(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test36()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountTime("%*9P;{");
      assertEquals("updateAccountTime: %*9P;{", string0);
  }
}

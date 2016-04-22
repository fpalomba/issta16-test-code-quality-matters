/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 13 03:47:59 GMT 2015
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
      Order order0 = new Order();
      OrderState orderState0 = new OrderState((String) null, (String) null, "af-k!", "", 0, 1.7976931348623157E308, (-0.7537357043874071), "X", "updateAccountTime: 2\"x||NN5_W_");
      Contract contract0 = new Contract(0, (String) null, "BAG", (String) null, (-0.7537357043874071), "updateAccountTime: 2\"x||NN5_W_", "WOc0/9XgS", (String) null, (String) null, "G0U59B>o;,h{", (Vector) null, "KWC@w\"E^6GN", false, "BAG", "updateAccountTime: 2\"x||NN5_W_");
      String string0 = EWrapperMsgGenerator.openOrder(320, contract0, order0, orderState0);
      assertEquals("open order: orderId=320 action=null quantity=0 symbol=null exchange=null secType=BAG type=null lmtPrice=0.0 auxPrice=0.0 TIF=null localSymbol=G0U59B>o;,h{ client Id=0 parent Id=0 permId=0 outsideRth=false hidden=false discretionaryAmt=0.0 triggerMethod=0 goodAfterTime=null goodTillDate=null faGroup=null faMethod=null faPercentage=null faProfile=null shortSaleSlot=0 designatedLocation= ocaGroup=null ocaType=0 rule80A=null allOrNone=false minQty=2147483647 percentOffset=1.7976931348623157E308 eTradeOnly=false firmQuoteOnly=false nbboPriceCap=1.7976931348623157E308 auctionStrategy=0 startingPrice=1.7976931348623157E308 stockRefPrice=1.7976931348623157E308 delta=1.7976931348623157E308 stockRangeLower=1.7976931348623157E308 stockRangeUpper=1.7976931348623157E308 volatility=1.7976931348623157E308 volatilityType=2147483647 deltaNeutralOrderType= deltaNeutralAuxPrice=1.7976931348623157E308 continuousUpdate=0 referencePriceType=2147483647 trailStopPrice=1.7976931348623157E308 scaleInitLevelSize= scaleSubsLevelSize= scalePriceIncrement= account=null settlingFirm=null clearingAccount=null clearingIntent=null notHeld=false whatIf=false status=null initMargin=null maintMargin=af-k! equityWithLoan= commission=0.0 minCommission= maxCommission=-0.7537357043874071 commissionCurrency=X warningText=updateAccountTime: 2\"x||NN5_W_", string0);
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
      Contract contract0 = new Contract();
      Order order0 = new Order();
      OrderState orderState0 = new OrderState("R ZG<.[i;d0/1.m", "j0an`H=];+", "Next Valid Order ID: -2389", "OA.p|`&h|^", 0.0, 463.5253573, 1.7976931348623157E308, (String) null, "");
      String string0 = EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      assertEquals("open order: orderId=0 action=null quantity=0 symbol=null exchange=null secType=null type=null lmtPrice=0.0 auxPrice=0.0 TIF=null localSymbol=null client Id=0 parent Id=0 permId=0 outsideRth=false hidden=false discretionaryAmt=0.0 triggerMethod=0 goodAfterTime=null goodTillDate=null faGroup=null faMethod=null faPercentage=null faProfile=null shortSaleSlot=0 designatedLocation= ocaGroup=null ocaType=0 rule80A=null allOrNone=false minQty=2147483647 percentOffset=1.7976931348623157E308 eTradeOnly=false firmQuoteOnly=false nbboPriceCap=1.7976931348623157E308 auctionStrategy=0 startingPrice=1.7976931348623157E308 stockRefPrice=1.7976931348623157E308 delta=1.7976931348623157E308 stockRangeLower=1.7976931348623157E308 stockRangeUpper=1.7976931348623157E308 volatility=1.7976931348623157E308 volatilityType=2147483647 deltaNeutralOrderType= deltaNeutralAuxPrice=1.7976931348623157E308 continuousUpdate=0 referencePriceType=2147483647 trailStopPrice=1.7976931348623157E308 scaleInitLevelSize= scaleSubsLevelSize= scalePriceIncrement= account=null settlingFirm=null clearingAccount=null clearingIntent=null notHeld=false whatIf=false status=null initMargin=j0an`H=];+ maintMargin=Next Valid Order ID: -2389 equityWithLoan=OA.p|`&h|^ commission=0.0 minCommission=463.5253573 maxCommission= commissionCurrency=null warningText=", string0);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I92 Branch 7 IFEQ L44 - false
   * Goal 2. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I120 Branch 8 IFLT L45 - true
   */

  @Test
  public void test02()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, (double) (-2950), (double) 13, (double) 13, (-887.911102));
      assertEquals("id=13  modelOptComp: vol = N/A delta = N/A: modelPrice = 13.0: pvDividend = N/A", string0);
  }

  //Test case number: 3
  /*
   * 4 covered goals:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I29 Branch 3 IFEQ L40 - true
   * Goal 2. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I85 Branch 6 IFLT L44 - false
   * Goal 3. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I92 Branch 7 IFEQ L44 - true
   * Goal 4. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I127 Branch 9 IFEQ L45 - true
   */

  @Test
  public void test03()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation((-7139), 13, 1.7976931348623157E308, (double) (-7139), 1.7976931348623157E308, 1.7976931348623157E308);
      assertEquals("id=-7139  modelOptComp: vol = N/A delta = N/A: modelPrice = N/A: pvDividend = N/A", string0);
  }

  //Test case number: 4
  /*
   * 6 covered goals:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I22 Branch 2 IFLT L40 - true
   * Goal 2. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I49 Branch 4 IFGT L40 - false
   * Goal 3. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I69 Branch 5 IF_ICMPNE L43 - false
   * Goal 4. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I85 Branch 6 IFLT L44 - true
   * Goal 5. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I120 Branch 8 IFLT L45 - false
   * Goal 6. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I127 Branch 9 IFEQ L45 - false
   */

  @Test
  public void test04()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(6760, 13, (-1292.07790819), (-1.0), (-1292.07790819), (double) 3);
      assertEquals("id=6760  modelOptComp: vol = N/A delta = -1.0: modelPrice = N/A: pvDividend = 3.0", string0);
  }

  //Test case number: 5
  /*
   * 4 covered goals:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I22 Branch 2 IFLT L40 - false
   * Goal 2. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I29 Branch 3 IFEQ L40 - false
   * Goal 3. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I49 Branch 4 IFGT L40 - true
   * Goal 4. com.ib.client.EWrapperMsgGenerator.tickOptionComputation(IIDDDD)Ljava/lang/String;: I69 Branch 5 IF_ICMPNE L43 - true
   */

  @Test
  public void test05()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(6, 0, 0.0, (double) 6, 0.0, 0.0);
      assertEquals("id=6  bidSize: vol = 0.0 delta = N/A", string0);
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickPrice(IIDI)Ljava/lang/String;: I24 Branch 1 IFEQ L30 - false
   */

  @Test
  public void test06()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice(177, 177, 0.0, (-1205));
      assertEquals("id=177  unknown=0.0  canAutoExecute", string0);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickPrice(IIDI)Ljava/lang/String;: I24 Branch 1 IFEQ L30 - true
   */

  @Test
  public void test07()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice(0, (-791), 0.0, 0);
      assertEquals("id=0  unknown=0.0  noAutoExecute", string0);
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updateMktDepth(IIIIDI)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test08()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepth(22, 15, 6760, 15, (-1.0), 0);
      assertEquals("updateMktDepth: 22 15 6760 15 -1.0 0", string0);
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickString(IILjava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test09()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickString(1239, 463, "id=0 date = $zA7k*iCk3D open=0.0 high=1.0 low=1.0 close=0.0 volume=15 count=1239 WAP=15.0 hasGaps=false");
      assertEquals("id=1239  unknown=id=0 date = $zA7k*iCk3D open=0.0 high=1.0 low=1.0 close=0.0 volume=15 count=1239 WAP=15.0 hasGaps=false", string0);
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.deltaNeutralValidation(ILcom/ib/client/UnderComp;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test10()  throws Throwable  {
      UnderComp underComp0 = new UnderComp();
      String string0 = EWrapperMsgGenerator.deltaNeutralValidation(1682, underComp0);
      assertEquals("id = 1682 underComp.conId =0 underComp.delta =0.0 underComp.price =0.0", string0);
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updateNewsBulletin(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test11()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateNewsBulletin((-783), 0, (String) null, (String) null);
      assertEquals("MsgId=-783 :: MsgType=0 :: Origin=null :: Message=null", string0);
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.fundamentalData(ILjava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test12()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.fundamentalData(1239, "conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n");
      assertEquals("id  = 1239 len = 167\nconid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n", string0);
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updatePortfolio(Lcom/ib/client/Contract;IDDDDDLjava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test13()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.updatePortfolio(contractDetails0.m_summary, 0, (-1.0), (-1.0), (double) (-783), (-410.0), (double) 0, "nC2|\"MzHv%cFT");
      assertEquals("updatePortfolio: conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n0 -1.0 -1.0 -783.0 -410.0 0.0 nC2|\"MzHv%cFT", string0);
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updateAccountValue(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test14()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountValue((String) null, (String) null, (String) null, "contractMonth = ");
      assertEquals("updateAccountValue: null null null contractMonth = ", string0);
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.receiveFA(ILjava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test15()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.receiveFA(6760, "id=6760  13WeekLow: vol = N/A delta = -1.0");
      assertEquals("FA: null id=6760  13WeekLow: vol = N/A delta = -1.0", string0);
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.contractDetailsEnd(I)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test16()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.contractDetailsEnd((-326));
      assertEquals("reqId = -326 =============== end ===============", string0);
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickSnapshotEnd(I)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test17()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSnapshotEnd(2345);
      assertEquals("id=2345 =============== end ===============", string0);
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.orderStatus(ILjava/lang/String;IIDIIDILjava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test18()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.orderStatus(631, "wlFs>s:*14(dU?ffe", 631, 631, (double) 631, 631, 631, 403.993662028285, 631, "wlFs>s:*14(dU?ffe");
      assertEquals("order status: orderId=631 clientId=631 permId=631 status=wlFs>s:*14(dU?ffe filled=631 remaining=631 avgFillPrice=631.0 lastFillPrice=403.993662028285 parent Id=631 whyHeld=wlFs>s:*14(dU?ffe", string0);
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.scannerDataEnd(I)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test19()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerDataEnd(0);
      assertEquals("id = 0 =============== end ===============", string0);
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickGeneric(IID)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test20()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickGeneric(0, 3697, (-1.0));
      assertEquals("id=0  unknown=-1.0", string0);
  }

  //Test case number: 21
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.managedAccounts(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test21()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.managedAccounts("");
      assertEquals("Connected : The list of managed accounts are : []", string0);
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
      String string0 = EWrapperMsgGenerator.contractDetails(5932, contractDetails0);
      assertEquals("reqId = 5932 ===================================\n ---- Contract Details begin ----\nconid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\nmarketName = null\ntradingClass = null\nminTick = 0.0\nprice magnifier = 0\norderTypes = null\nvalidExchanges = null\nunderConId = 0\nlongName = null\ncontractMonth = null\nindustry = null\ncategory = null\nsubcategory = null\ntimeZoneId = null\ntradingHours = null\nliquidHours = null\n ---- Contract Details End ----\n", string0);
  }

  //Test case number: 24
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.accountDownloadEnd(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test24()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.accountDownloadEnd("Oj4QN");
      assertEquals("accountDownloadEnd: Oj4QN", string0);
  }

  //Test case number: 25
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updateMktDepthL2(IILjava/lang/String;IIDI)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test25()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepthL2(0, 0, "R3o0?-({LWaTZsG", 0, 0, (-970.47868), 0);
      assertEquals("updateMktDepth: 0 0 R3o0?-({LWaTZsG 0 0 -970.47868 0", string0);
  }

  //Test case number: 26
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.bondContractDetails(ILcom/ib/client/ContractDetails;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test26()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.bondContractDetails((-791), contractDetails0);
      assertEquals("reqId = -791 ===================================\n ---- Bond Contract Details begin ----\nsymbol = null\nsecType = null\ncusip = null\ncoupon = 0.0\nmaturity = null\nissueDate = null\nratings = null\nbondType = null\ncouponType = null\nconvertible = false\ncallable = false\nputable = false\ndescAppend = null\nexchange = null\ncurrency = null\nmarketName = null\ntradingClass = null\nconid = 0\nminTick = 0.0\norderTypes = null\nvalidExchanges = null\nnextOptionDate = null\nnextOptionType = null\nnextOptionPartial = false\nnotes = null\nlongName = null\n ---- Bond Contract Details End ----\n", string0);
  }

  //Test case number: 27
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.scannerData(IILcom/ib/client/ContractDetails;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test27()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.scannerData((-3231), (-3231), contractDetails0, "H]|Y,$NIbv5", (String) null, (String) null, (String) null);
      assertEquals("id = -3231 rank=-3231 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance=H]|Y,$NIbv5 benchmark=null projection=null legsStr=null", string0);
  }

  //Test case number: 28
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.realtimeBar(IJDDDDJDI)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test28()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.realtimeBar(0, (-2278L), (double) 6760, 0.0, 0.0, (double) (-2278L), (long) 6760, (double) (-2278L), (-795));
      assertEquals("id=0 time = -2278 open=6760.0 high=0.0 low=0.0 close=-2278.0 volume=6760 count=-795 WAP=-2278.0", string0);
  }

  //Test case number: 29
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.nextValidId(I)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test29()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.nextValidId((-2389));
      assertEquals("Next Valid Order ID: -2389", string0);
  }

  //Test case number: 30
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.execDetailsEnd(I)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test30()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.execDetailsEnd(3);
      assertEquals("reqId = 3 =============== end ===============", string0);
  }

  //Test case number: 31
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.currentTime(J)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test31()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.currentTime((long) (-2389));
      assertEquals("current time = -2389 (Dec 31, 1969 11:20:11 PM)", string0);
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
      String string0 = EWrapperMsgGenerator.tickEFP((-2852), (-2852), 3.0, "com.ib.client.EWrapperMsgGenerator", 9.102208134432635, 0, "T^AES", (double) 0, 1.7976931348623157E308);
      assertEquals("id=-2852  unknown: basisPoints = 3.0/com.ib.client.EWrapperMsgGenerator impliedFuture = 9.102208134432635 holdDays = 0 futureExpiry = T^AES dividendImpact = 0.0 dividends to expiry = 1.7976931348623157E308", string0);
  }

  //Test case number: 34
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.execDetails(ILcom/ib/client/Contract;Lcom/ib/client/Execution;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test34()  throws Throwable  {
      Contract contract0 = new Contract();
      Execution execution0 = new Execution();
      String string0 = EWrapperMsgGenerator.execDetails((-1), contract0, execution0);
      assertEquals(" ---- Execution Details begin ----\nreqId = -1\norderId = 0\nclientId = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\ncontractExchange = null\ncurrency = null\nlocalSymbol = null\nexecId = null\ntime = null\nacctNumber = null\nexecutionExchange = null\nside = null\nshares = 0\nprice = 0.0\npermId = 0\nliquidation = 0\ncumQty = 0\navgPrice = 0.0\n ---- Execution Details end ----\n", string0);
  }

  //Test case number: 35
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickSize(III)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test35()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSize(10, 10, 16);
      assertEquals("id=10  bidOptComp=16", string0);
  }

  //Test case number: 36
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.scannerParameters(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test36()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerParameters("");
      assertEquals("SCANNER PARAMETERS:\n", string0);
  }

  //Test case number: 37
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.historicalData(ILjava/lang/String;DDDDIIDZ)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test37()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.historicalData(0, " faGroup=", (-1292.07790819), 1.2, (double) 0, 0.0, 3396, 22, 1.2, true);
      assertEquals("id=0 date =  faGroup= open=-1292.07790819 high=1.2 low=0.0 close=0.0 volume=3396 count=22 WAP=1.2 hasGaps=true", string0);
  }

  //Test case number: 38
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updateAccountTime(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test38()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountTime("QAHaZ");
      assertEquals("updateAccountTime: QAHaZ", string0);
  }
}

/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 13 04:27:42 GMT 2015
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
      Contract contract0 = new Contract();
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      assertEquals("open order: orderId=0 action=null quantity=0 symbol=null exchange=null secType=null type=null lmtPrice=0.0 auxPrice=0.0 TIF=null localSymbol=null client Id=0 parent Id=0 permId=0 outsideRth=false hidden=false discretionaryAmt=0.0 triggerMethod=0 goodAfterTime=null goodTillDate=null faGroup=null faMethod=null faPercentage=null faProfile=null shortSaleSlot=0 designatedLocation= ocaGroup=null ocaType=0 rule80A=null allOrNone=false minQty=2147483647 percentOffset=1.7976931348623157E308 eTradeOnly=false firmQuoteOnly=false nbboPriceCap=1.7976931348623157E308 auctionStrategy=0 startingPrice=1.7976931348623157E308 stockRefPrice=1.7976931348623157E308 delta=1.7976931348623157E308 stockRangeLower=1.7976931348623157E308 stockRangeUpper=1.7976931348623157E308 volatility=1.7976931348623157E308 volatilityType=2147483647 deltaNeutralOrderType= deltaNeutralAuxPrice=1.7976931348623157E308 continuousUpdate=0 referencePriceType=2147483647 trailStopPrice=1.7976931348623157E308 scaleInitLevelSize= scaleSubsLevelSize= scalePriceIncrement= account=null settlingFirm=null clearingAccount=null clearingIntent=null notHeld=false whatIf=false status=null initMargin=null maintMargin=null equityWithLoan=null commission=0.0 minCommission=0.0 maxCommission=0.0 commissionCurrency=null warningText=null", string0);
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
      String string0 = EWrapperMsgGenerator.tickOptionComputation((-502), 13, (double) 0, 577.99, 0.0, (-0.7845642815356012));
      assertEquals("id=-502  modelOptComp: vol = 0.0 delta = N/A: modelPrice = 0.0: pvDividend = N/A", string0);
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
      String string0 = EWrapperMsgGenerator.tickOptionComputation((-502), 13, (double) 0, 577.99, (-0.19452434082531259), 0.0);
      assertEquals("id=-502  modelOptComp: vol = 0.0 delta = N/A: modelPrice = N/A: pvDividend = 0.0", string0);
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
      String string0 = EWrapperMsgGenerator.tickOptionComputation(6918, 0, 1.7976931348623157E308, (double) 2001, 1741.1960337501785, 1.7976931348623157E308);
      assertEquals("id=6918  bidSize: vol = N/A delta = N/A", string0);
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
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 2563, (-693.59362055), (-1.0), (-693.59362055), 0.001);
      assertEquals("id=0  unknown: vol = N/A delta = -1.0", string0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickPrice(IIDI)Ljava/lang/String;: I24 Branch 1 IFEQ L30 - false
   */

  @Test
  public void test05()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice(6918, 6918, 1.7976931348623157E308, 2001);
      assertEquals("id=6918  unknown=1.7976931348623157E308  canAutoExecute", string0);
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickPrice(IIDI)Ljava/lang/String;: I24 Branch 1 IFEQ L30 - true
   */

  @Test
  public void test06()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice(0, 0, (-1.0), 0);
      assertEquals("id=0  bidSize=-1.0  noAutoExecute", string0);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updateMktDepth(IIIIDI)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test07()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepth(0, 1509, 0, 0, (double) 0, 1509);
      assertEquals("updateMktDepth: 0 1509 0 0 0.0 1509", string0);
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickString(IILjava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test08()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickString((-2496), (-2496), ")Xk0XpkzB@]~");
      assertEquals("id=-2496  unknown=)Xk0XpkzB@]~", string0);
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.deltaNeutralValidation(ILcom/ib/client/UnderComp;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test09()  throws Throwable  {
      UnderComp underComp0 = new UnderComp();
      String string0 = EWrapperMsgGenerator.deltaNeutralValidation(16, underComp0);
      assertEquals("id = 16 underComp.conId =0 underComp.delta =0.0 underComp.price =0.0", string0);
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updateNewsBulletin(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test10()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateNewsBulletin(0, (-130), ">NW\"x`", ".K(4w1c^C");
      assertEquals("MsgId=0 :: MsgType=-130 :: Origin=.K(4w1c^C :: Message=>NW\"x`", string0);
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.fundamentalData(ILjava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test11()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.fundamentalData(0, ",");
      assertEquals("id  = 0 len = 1\n,", string0);
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updatePortfolio(Lcom/ib/client/Contract;IDDDDDLjava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test12()  throws Throwable  {
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.updatePortfolio(contract0, 16, (double) 0L, (-1798.561305065536), 0.0, 0.0, (double) 0L, "");
      assertEquals("updatePortfolio: conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n16 0.0 -1798.561305065536 0.0 0.0 0.0 ", string0);
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updateAccountValue(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test13()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountValue("", "", "", "");
      assertEquals("updateAccountValue:    ", string0);
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.receiveFA(ILjava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test14()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.receiveFA(1088, "");
      assertEquals("FA: null ", string0);
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.contractDetailsEnd(I)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test15()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.contractDetailsEnd(855);
      assertEquals("reqId = 855 =============== end ===============", string0);
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickSnapshotEnd(I)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test16()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSnapshotEnd(4155);
      assertEquals("id=4155 =============== end ===============", string0);
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.orderStatus(ILjava/lang/String;IIDIIDILjava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test17()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.orderStatus(738, "}3{N", (-2085), (-2085), (double) 738, 738, 0, (-19.83945476280903), (-2085), "");
      assertEquals("order status: orderId=738 clientId=-2085 permId=738 status=}3{N filled=-2085 remaining=-2085 avgFillPrice=738.0 lastFillPrice=-19.83945476280903 parent Id=0 whyHeld=", string0);
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.scannerDataEnd(I)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test18()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerDataEnd(15);
      assertEquals("id = 15 =============== end ===============", string0);
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickGeneric(IID)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test19()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickGeneric(1157, (-36), (-291.35035904436));
      assertEquals("id=1157  unknown=-291.35035904436", string0);
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.managedAccounts(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test20()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.managedAccounts("");
      assertEquals("Connected : The list of managed accounts are : []", string0);
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
      Contract contract0 = new Contract();
      ContractDetails contractDetails0 = new ContractDetails(contract0, "\u0001\b\u0007\u0000 \u0001\u0001\tQ\u0001\u0001\u0000\u0001\t\u0106\u0001\u0001\u0000\u013F\u0001\u0002\u0000\u0186\u0001\u0001\u0000\u0001\u0001\u000F\u0000\u0001\u0001\b\u0000\u037D\u0001\u0001\u0000@\u0001\u0001\u0000\u0211\u0001\u0001\u0000\u01E4\u0001\u0002\u0000\u0666\u0001\u0001\u0000\u0001\t\u0001\u0001\u0001\u0000\u0001\u0001\u0003\u0000\u0002\u0001\u0005\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\t\u0001\u0000\u0002\u0001\u0001\u0000\u0003\u0001\u0001\u0000\u0001\t\u048F\u0001\u0002\u0000%\u0001\u0001\u0000\u01AC\u0001\u0001\u0000\u00E5\u0001\u0001\t\u026B\u0001\u0001\u0000\u08C7\u0001\u0001\t\u0001\u0001\u0002\t\u0002\u0000\u0004\u0001\u0002\t\u0003\u0001\u0004\u0000\u0005\u0001\u0001\t\u0002\u0001\u0001\u0000\u0001\u0001\u0002\u0000\u0001\u0001\u0001\t\u02A7\u0001\u0001\u0000\u00DB\u0001\u0001\t\u0001\u0000\u0012\u0001\u0001\u0000\u01D5\u0001\u0002\u0000@\u0001\u0001\u0000\u01F5\u0001\u0001\t\u073C\u0001\u0004\t\u0003\u0000\u0002\u0001\u0001\u0000\u0001\u0001\u0001\t\u0001\u0001\u0001\u0000\u0001\t\u0001\u0000\u0001\u0001\u0003\t\u0001\u0000\u0001\t\u0005\u0000\u0090\u0001\u0001\u0000n\u0001\u0002\u0000s\u0001\u0001\u0000\u00AD\u0001\u0001\u0000\u001B\u0001\u0001\u0000\u0018\u0001\u0001\u0000 \u0001\u0002\u0000\u0094\u0001\u0001\u0000\u0007\u0001\u0001\u00001\u0001\u0002\u00004\u0001\u0001\u0000\u00A4\u0001\u0001\u0000\u053C\u0001\u0004\t\u0002\u0001\u0001\u0000\u0001\t\u0001\u0000\u0003\t2\u0001\u0001\u0000E\u0001\u0001\t\u0003\u0001\u0001\u00001\u0001\u0002\u0000'\u0001\u0001\u00007\u0001\u0001\t\r\u0001\u0001\u0000\u000F\u0001\u0001\u0000\u0015\u0001\u0001\u0000\u0004\u0001\u0001\u00001\u0001\u0001\u0000-\u0001\u0001\u0000\t\u0001\u0002\u0000\u0017\u0001\u0002\u0000\u001D\u0001\u0001\u0000-\u0001\u0002\u0000\u0002\u0001\u0001\u0000\r\u0001\u0001\u0000,\u0001\u0001\u0000\u008B\u0001\u0001\u0000\u026C\u0001\u0001\t\u0001\u0000\u0001\u0001\u0001\t\r\u0001\u0001\u0000\u0002\u0001\u0001\u0000 \u0001\u0001\u0000\u0002\u0001\u0001\u0000\u001C\u0001\u0001\t\u0001\u0000\t\u0001\u0001\u0000\u0017\u0001\u0002\u0000\u0007\u0001\u0001\u0000\u000B\u0001\u0001\u0000\u0004\u0001\u0001\u0000#\u0001\u0002\u0000\u0011\u0001\u0001\u0000\u0004\u0001\u0001\u0000\u0005\u0001\u0001\u0000\u0007\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0003\u0001\u0002\u0000\u000F\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u001C\u0001\u0002\u0000\u0002\u0001\u0001\u0000\u0015\u0001\u0001\u0000&\u0001\u0001\u0000!\u0001\u0001\u0000\u0129\u0001\u0001\t\u0004\u0001\u0002\u0000\u0001\t\f\u0001\u0001\t\u0003\u0000\f\u0001\u0002\u0000\u0007\u0001\u0003\u0000\u0003\u0001\u0001\u0000\u0003\u0001\u0002\u0000\u0014\u0001\u0002\u0000\u0003\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0002\u0000\u0002\u0001\u0001\t\u0001\u0000\u0002\u0001\u0002\u0000\u000B\u0001\u0003\u0000\r\u0001\u0003\u0000\u0007\u0001\u0001\u0000\u0002\u0001\u0001\u0000\u0004\u0001\u0001\u0000\u0016\u0001\u0001\u0000\u0013\u0001\u0001\u0000\u0084\u0001\u0001\t\u0002\u0000\u0003\u0001\u0001\t\u0001\u0000\u0001\u0001\u0002\t\u0003\u0001\u0006\u0000\u000B\u0001\u0002\u0000\u0004\u0001\u0001\u0000\u0002\u0001\u0001\u0000\u0001\t\u0001\u0000\u0001\u0001\u0001\u0000\u0002\u0001\u0001\t\u0001\u0000\u0007\u0001\u0002\u0000\u0006\u0001\u0002\u0000\u0001\t\u0005\u0001\u0001\u0000\u0002\u0001\u0002\u0000\u0002\u0001\u0001\u0000\u0007\u0001\u0001\u0000\b\u0001\u0001\u0000<\u0001\u0001\t\u0001\u0000\u0003\u0001\u0003\u0000\u0001\t\u0002\u0000\u0004\u0001\u0001\u0000\u0001\t\u0002\u0001\u0003\u0000\u0003\u0001\u0001\t\u0003\u0001\u0001\u0000\u0006\u0001\u0002\u0000\u0004\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\t\b\u0001\u0001\t\u0005\u0001\u0001\u0000\u001F\u0001\u0001\t\u0002\u0000\u0001\t\u0002\u0000\u0001\u0001\u0003\u0000\u0003\u0001\u0001\u0000\u0001\u0001\u0002\u0000\u0004\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0006\u0001\u0001\u0000\u000E\u0001\u0002\u0000\u0002\t\u0003\u0000\u0002\u0001\u0001\u0000\u0002\t\u0003\u0001\u0003\u0000\u0002\u0001\u0001\t\u0006\u0001\u0002\t\u0003\u0000\u0003\u0001\u0001\u0000\u0003\u0001\u0001\t\u0001\u0000\u0007\u0001\u0002\u0000\u0001\t\u0001\u0000\u0001\u0001\u0001\t\u0002\u0000\u0001\t\u0002\u0000\u0001\t", "S x7+Frl-]#tZVNF", 0.0, (String) null, "A_%X2#/[6*Qpm8", 9, (String) null, "", (String) null, "Caching jar as ", "", "shares = ", "Z*", " goodTillDate=");
      String string0 = EWrapperMsgGenerator.contractDetails(0, contractDetails0);
      assertEquals("reqId = 0 ===================================\n ---- Contract Details begin ----\nconid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\nmarketName = \u0001\b\u0007\u0000 \u0001\u0001\tQ\u0001\u0001\u0000\u0001\t\u0106\u0001\u0001\u0000\u013F\u0001\u0002\u0000\u0186\u0001\u0001\u0000\u0001\u0001\u000F\u0000\u0001\u0001\b\u0000\u037D\u0001\u0001\u0000@\u0001\u0001\u0000\u0211\u0001\u0001\u0000\u01E4\u0001\u0002\u0000\u0666\u0001\u0001\u0000\u0001\t\u0001\u0001\u0001\u0000\u0001\u0001\u0003\u0000\u0002\u0001\u0005\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\t\u0001\u0000\u0002\u0001\u0001\u0000\u0003\u0001\u0001\u0000\u0001\t\u048F\u0001\u0002\u0000%\u0001\u0001\u0000\u01AC\u0001\u0001\u0000\u00E5\u0001\u0001\t\u026B\u0001\u0001\u0000\u08C7\u0001\u0001\t\u0001\u0001\u0002\t\u0002\u0000\u0004\u0001\u0002\t\u0003\u0001\u0004\u0000\u0005\u0001\u0001\t\u0002\u0001\u0001\u0000\u0001\u0001\u0002\u0000\u0001\u0001\u0001\t\u02A7\u0001\u0001\u0000\u00DB\u0001\u0001\t\u0001\u0000\u0012\u0001\u0001\u0000\u01D5\u0001\u0002\u0000@\u0001\u0001\u0000\u01F5\u0001\u0001\t\u073C\u0001\u0004\t\u0003\u0000\u0002\u0001\u0001\u0000\u0001\u0001\u0001\t\u0001\u0001\u0001\u0000\u0001\t\u0001\u0000\u0001\u0001\u0003\t\u0001\u0000\u0001\t\u0005\u0000\u0090\u0001\u0001\u0000n\u0001\u0002\u0000s\u0001\u0001\u0000\u00AD\u0001\u0001\u0000\u001B\u0001\u0001\u0000\u0018\u0001\u0001\u0000 \u0001\u0002\u0000\u0094\u0001\u0001\u0000\u0007\u0001\u0001\u00001\u0001\u0002\u00004\u0001\u0001\u0000\u00A4\u0001\u0001\u0000\u053C\u0001\u0004\t\u0002\u0001\u0001\u0000\u0001\t\u0001\u0000\u0003\t2\u0001\u0001\u0000E\u0001\u0001\t\u0003\u0001\u0001\u00001\u0001\u0002\u0000'\u0001\u0001\u00007\u0001\u0001\t\r\u0001\u0001\u0000\u000F\u0001\u0001\u0000\u0015\u0001\u0001\u0000\u0004\u0001\u0001\u00001\u0001\u0001\u0000-\u0001\u0001\u0000\t\u0001\u0002\u0000\u0017\u0001\u0002\u0000\u001D\u0001\u0001\u0000-\u0001\u0002\u0000\u0002\u0001\u0001\u0000\r\u0001\u0001\u0000,\u0001\u0001\u0000\u008B\u0001\u0001\u0000\u026C\u0001\u0001\t\u0001\u0000\u0001\u0001\u0001\t\r\u0001\u0001\u0000\u0002\u0001\u0001\u0000 \u0001\u0001\u0000\u0002\u0001\u0001\u0000\u001C\u0001\u0001\t\u0001\u0000\t\u0001\u0001\u0000\u0017\u0001\u0002\u0000\u0007\u0001\u0001\u0000\u000B\u0001\u0001\u0000\u0004\u0001\u0001\u0000#\u0001\u0002\u0000\u0011\u0001\u0001\u0000\u0004\u0001\u0001\u0000\u0005\u0001\u0001\u0000\u0007\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0003\u0001\u0002\u0000\u000F\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u001C\u0001\u0002\u0000\u0002\u0001\u0001\u0000\u0015\u0001\u0001\u0000&\u0001\u0001\u0000!\u0001\u0001\u0000\u0129\u0001\u0001\t\u0004\u0001\u0002\u0000\u0001\t\f\u0001\u0001\t\u0003\u0000\f\u0001\u0002\u0000\u0007\u0001\u0003\u0000\u0003\u0001\u0001\u0000\u0003\u0001\u0002\u0000\u0014\u0001\u0002\u0000\u0003\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0002\u0000\u0002\u0001\u0001\t\u0001\u0000\u0002\u0001\u0002\u0000\u000B\u0001\u0003\u0000\r\u0001\u0003\u0000\u0007\u0001\u0001\u0000\u0002\u0001\u0001\u0000\u0004\u0001\u0001\u0000\u0016\u0001\u0001\u0000\u0013\u0001\u0001\u0000\u0084\u0001\u0001\t\u0002\u0000\u0003\u0001\u0001\t\u0001\u0000\u0001\u0001\u0002\t\u0003\u0001\u0006\u0000\u000B\u0001\u0002\u0000\u0004\u0001\u0001\u0000\u0002\u0001\u0001\u0000\u0001\t\u0001\u0000\u0001\u0001\u0001\u0000\u0002\u0001\u0001\t\u0001\u0000\u0007\u0001\u0002\u0000\u0006\u0001\u0002\u0000\u0001\t\u0005\u0001\u0001\u0000\u0002\u0001\u0002\u0000\u0002\u0001\u0001\u0000\u0007\u0001\u0001\u0000\b\u0001\u0001\u0000<\u0001\u0001\t\u0001\u0000\u0003\u0001\u0003\u0000\u0001\t\u0002\u0000\u0004\u0001\u0001\u0000\u0001\t\u0002\u0001\u0003\u0000\u0003\u0001\u0001\t\u0003\u0001\u0001\u0000\u0006\u0001\u0002\u0000\u0004\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\t\b\u0001\u0001\t\u0005\u0001\u0001\u0000\u001F\u0001\u0001\t\u0002\u0000\u0001\t\u0002\u0000\u0001\u0001\u0003\u0000\u0003\u0001\u0001\u0000\u0001\u0001\u0002\u0000\u0004\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0006\u0001\u0001\u0000\u000E\u0001\u0002\u0000\u0002\t\u0003\u0000\u0002\u0001\u0001\u0000\u0002\t\u0003\u0001\u0003\u0000\u0002\u0001\u0001\t\u0006\u0001\u0002\t\u0003\u0000\u0003\u0001\u0001\u0000\u0003\u0001\u0001\t\u0001\u0000\u0007\u0001\u0002\u0000\u0001\t\u0001\u0000\u0001\u0001\u0001\t\u0002\u0000\u0001\t\u0002\u0000\u0001\t\ntradingClass = S x7+Frl-]#tZVNF\nminTick = 0.0\nprice magnifier = 0\norderTypes = null\nvalidExchanges = A_%X2#/[6*Qpm8\nunderConId = 9\nlongName = null\ncontractMonth = \nindustry = null\ncategory = Caching jar as \nsubcategory = \ntimeZoneId = shares = \ntradingHours = Z*\nliquidHours =  goodTillDate=\n ---- Contract Details End ----\n", string0);
  }

  //Test case number: 23
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.accountDownloadEnd(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test23()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.accountDownloadEnd("3Ig");
      assertEquals("accountDownloadEnd: 3Ig", string0);
  }

  //Test case number: 24
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updateMktDepthL2(IILjava/lang/String;IIDI)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test24()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepthL2(0, 12, " stockRangeLower=", 0, 15, (double) 0, 1735);
      assertEquals("updateMktDepth: 0 12  stockRangeLower= 0 15 0.0 1735", string0);
  }

  //Test case number: 25
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.bondContractDetails(ILcom/ib/client/ContractDetails;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test25()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.bondContractDetails(1088, contractDetails0);
      assertEquals("reqId = 1088 ===================================\n ---- Bond Contract Details begin ----\nsymbol = null\nsecType = null\ncusip = null\ncoupon = 0.0\nmaturity = null\nissueDate = null\nratings = null\nbondType = null\ncouponType = null\nconvertible = false\ncallable = false\nputable = false\ndescAppend = null\nexchange = null\ncurrency = null\nmarketName = null\ntradingClass = null\nconid = 0\nminTick = 0.0\norderTypes = null\nvalidExchanges = null\nnextOptionDate = null\nnextOptionType = null\nnextOptionPartial = false\nnotes = null\nlongName = null\n ---- Bond Contract Details End ----\n", string0);
  }

  //Test case number: 26
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.scannerData(IILcom/ib/client/ContractDetails;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test26()  throws Throwable  {
      Contract contract0 = new Contract();
      ContractDetails contractDetails0 = new ContractDetails(contract0, (String) null, (String) null, 1.7976931348623157E308, "", (String) null, 0, "~", "#BI% R.", (String) null, "U 9~n{d8khJXF2?SHj", (String) null, "CLj>jYuG}mfBm!$g", "", "negcc");
      String string0 = EWrapperMsgGenerator.scannerData(0, Integer.MAX_VALUE, contractDetails0, "atag", (String) null, (String) null, (String) null);
      assertEquals("id = 0 rank=2147483647 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance=atag benchmark=null projection=null legsStr=null", string0);
  }

  //Test case number: 27
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.realtimeBar(IJDDDDJDI)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test27()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.realtimeBar(12, 3000L, 0.0, 0.0, 0.0, 3.0E9, 3000L, 1.0, 2159);
      assertEquals("id=12 time = 3000 open=0.0 high=0.0 low=0.0 close=3.0E9 volume=3000 count=2159 WAP=1.0", string0);
  }

  //Test case number: 28
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.nextValidId(I)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test28()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.nextValidId(2563);
      assertEquals("Next Valid Order ID: 2563", string0);
  }

  //Test case number: 29
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.execDetailsEnd(I)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test29()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.execDetailsEnd(5177);
      assertEquals("reqId = 5177 =============== end ===============", string0);
  }

  //Test case number: 30
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.currentTime(J)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test30()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.currentTime(0L);
      assertEquals("current time = 0 (Jan 1, 1970 12:00:00 AM)", string0);
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
      String string0 = EWrapperMsgGenerator.tickEFP((-130), (-130), (double) (-130), "atag", (-4712.687580467188), (-130), "atag", 0.0, (double) (-130));
      assertEquals("id=-130  unknown: basisPoints = -130.0/atag impliedFuture = -4712.687580467188 holdDays = -130 futureExpiry = atag dividendImpact = 0.0 dividends to expiry = -130.0", string0);
  }

  //Test case number: 33
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.execDetails(ILcom/ib/client/Contract;Lcom/ib/client/Execution;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test33()  throws Throwable  {
      Contract contract0 = new Contract();
      Execution execution0 = new Execution();
      String string0 = EWrapperMsgGenerator.execDetails(11, contract0, execution0);
      assertEquals(" ---- Execution Details begin ----\nreqId = 11\norderId = 0\nclientId = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\ncontractExchange = null\ncurrency = null\nlocalSymbol = null\nexecId = null\ntime = null\nacctNumber = null\nexecutionExchange = null\nside = null\nshares = 0\nprice = 0.0\npermId = 0\nliquidation = 0\ncumQty = 0\navgPrice = 0.0\n ---- Execution Details end ----\n", string0);
  }

  //Test case number: 34
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.tickSize(III)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test34()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSize(783, 783, 783);
      assertEquals("id=783  unknown=783", string0);
  }

  //Test case number: 35
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.scannerParameters(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test35()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerParameters("");
      assertEquals("SCANNER PARAMETERS:\n", string0);
  }

  //Test case number: 36
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.historicalData(ILjava/lang/String;DDDDIIDZ)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test36()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.historicalData(12, "V(kPcq lL*`", 0.0, 132.73, (double) 3000L, 2382.894088145619, 12, 12, 1940.22486, false);
      assertEquals("id=12 date = V(kPcq lL*` open=0.0 high=132.73 low=3000.0 close=2382.894088145619 volume=12 count=12 WAP=1940.22486 hasGaps=false", string0);
  }

  //Test case number: 37
  /*
   * 1 covered goal:
   * Goal 1. com.ib.client.EWrapperMsgGenerator.updateAccountTime(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

  @Test
  public void test37()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountTime("3{20^G&");
      assertEquals("updateAccountTime: 3{20^G&", string0);
  }
}

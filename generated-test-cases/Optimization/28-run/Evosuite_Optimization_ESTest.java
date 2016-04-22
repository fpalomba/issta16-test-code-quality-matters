/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 18 21:53:39 GMT 2015
 */

package weka.core;

import static org.junit.Assert.*;
import org.junit.Test;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.junit.runner.RunWith;
import weka.core.Optimization;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Optimization_ESTest extends Optimization_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 8 covered goals:
   * Goal 1. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I187 Branch 192 IFEQ L1136 - true
   * Goal 2. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I203 Branch 193 IFLT L1138 - false
   * Goal 3. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I223 Branch 194 IFLT L1141 - true
   * Goal 4. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I223 Branch 194 IFLT L1141 - false
   * Goal 5. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I232 Branch 195 IFNE L1142 - true
   * Goal 6. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I232 Branch 195 IFNE L1142 - false
   * Goal 7. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I251 Branch 196 IF_ICMPGE L1144 - true
   * Goal 8. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I251 Branch 196 IF_ICMPGE L1144 - false
   */

  @Test
  public void test0()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(94, 94);
      double[] doubleArray0 = new double[3];
      boolean[] booleanArray0 = new boolean[4];
      booleanArray0[1] = true;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
      assertArrayEquals(new double[] {Double.NaN, 0.0, Double.NaN}, doubleArray1, 0.01);
  }

  //Test case number: 1
  /*
   * 5 covered goals:
   * Goal 1. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I28 Branch 184 IFEQ L1115 - true
   * Goal 2. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I180 Branch 191 IFLT L1136 - true
   * Goal 3. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I180 Branch 191 IFLT L1136 - false
   * Goal 4. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I187 Branch 192 IFEQ L1136 - false
   * Goal 5. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I203 Branch 193 IFLT L1138 - true
   */

  @Test
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      boolean[] booleanArray0 = new boolean[4];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      double[] doubleArray1 = Optimization.solveTriangle((weka.core.matrix.Matrix) null, doubleArray0, false, booleanArray0);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray1, 0.01);
  }

  //Test case number: 2
  /*
   * 8 covered goals:
   * Goal 1. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I47 Branch 186 IFEQ L1117 - true
   * Goal 2. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I64 Branch 187 IF_ICMPGE L1119 - false
   * Goal 3. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I85 Branch 188 IF_ICMPGE L1122 - true
   * Goal 4. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I85 Branch 188 IF_ICMPGE L1122 - false
   * Goal 5. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I94 Branch 189 IFNE L1123 - true
   * Goal 6. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I94 Branch 189 IFNE L1123 - false
   * Goal 7. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I111 Branch 190 IF_ICMPGE L1125 - true
   * Goal 8. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I111 Branch 190 IF_ICMPGE L1125 - false
   */

  @Test
  public void test2()  throws Throwable  {
      double[][] doubleArray0 = new double[24][10];
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0, 4259, 4259);
      boolean[] booleanArray0 = new boolean[11];
      booleanArray0[6] = true;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0[1], true, booleanArray0);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, 0.0, Double.NaN, Double.NaN, Double.NaN}, doubleArray1, 0.01);
  }

  //Test case number: 3
  /*
   * 6 covered goals:
   * Goal 1. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I16 Branch 183 IFNONNULL L1112 - true
   * Goal 2. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I28 Branch 184 IFEQ L1115 - false
   * Goal 3. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I40 Branch 185 IF_ICMPGE L1117 - true
   * Goal 4. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I40 Branch 185 IF_ICMPGE L1117 - false
   * Goal 5. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I47 Branch 186 IFEQ L1117 - false
   * Goal 6. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I64 Branch 187 IF_ICMPGE L1119 - true
   */

  @Test
  public void test3()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      boolean[] booleanArray0 = new boolean[8];
      booleanArray0[0] = true;
      double[] doubleArray1 = Optimization.solveTriangle((weka.core.matrix.Matrix) null, doubleArray0, true, booleanArray0);
      assertArrayEquals(new double[] {0.0}, doubleArray1, 0.01);
  }
}

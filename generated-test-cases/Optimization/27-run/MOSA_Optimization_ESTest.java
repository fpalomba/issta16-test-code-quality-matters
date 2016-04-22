/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 18 20:40:43 GMT 2015
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
   * 1 covered goal:
   * Goal 1. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I232 Branch 195 IFNE L1142 - true
   */

  @Test
  public void test0()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(19, 19, 0.2);
      double[] doubleArray0 = new double[11];
      boolean[] booleanArray0 = new boolean[21];
      booleanArray0[0] = true;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * Goal 1. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I180 Branch 191 IFLT L1136 - true
   * Goal 2. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I187 Branch 192 IFEQ L1136 - false
   * Goal 3. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I203 Branch 193 IFLT L1138 - true
   */

  @Test
  public void test1()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(19, 19, 0.0);
      double[] doubleArray0 = new double[1];
      boolean[] booleanArray0 = new boolean[1];
      booleanArray0[0] = true;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
      assertArrayEquals(new double[] {0.0}, doubleArray1, 0.01);
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
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(19, 19, 0.2);
      double[] doubleArray0 = new double[6];
      boolean[] booleanArray0 = new boolean[21];
      booleanArray0[4] = true;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, true, booleanArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
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
      double[][] doubleArray0 = new double[1][7];
      double[] doubleArray1 = new double[7];
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0);
      boolean[] booleanArray0 = new boolean[7];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      booleanArray0[2] = true;
      booleanArray0[3] = true;
      booleanArray0[4] = true;
      booleanArray0[5] = true;
      booleanArray0[6] = true;
      double[] doubleArray2 = Optimization.solveTriangle(matrix0, doubleArray1, true, booleanArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray2, 0.01);
  }

  //Test case number: 4
  /*
   * 10 covered goals:
   * Goal 1. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I16 Branch 183 IFNONNULL L1112 - false
   * Goal 2. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I28 Branch 184 IFEQ L1115 - true
   * Goal 3. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I180 Branch 191 IFLT L1136 - false
   * Goal 4. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I187 Branch 192 IFEQ L1136 - true
   * Goal 5. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I203 Branch 193 IFLT L1138 - false
   * Goal 6. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I223 Branch 194 IFLT L1141 - true
   * Goal 7. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I223 Branch 194 IFLT L1141 - false
   * Goal 8. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I232 Branch 195 IFNE L1142 - false
   * Goal 9. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I251 Branch 196 IF_ICMPGE L1144 - true
   * Goal 10. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I251 Branch 196 IF_ICMPGE L1144 - false
   */

  @Test
  public void test4()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(19, 19, 0.2);
      double[] doubleArray0 = new double[11];
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, (boolean[]) null);
      assertFalse(doubleArray0.equals((Object)doubleArray1));
  }
}
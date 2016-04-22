/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 18 18:39:14 GMT 2015
 */

package weka.core;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;
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
   * 2 covered goals:
   * Goal 1. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I180 Branch 191 IFLT L1136 - true
   * Goal 2. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I203 Branch 193 IFLT L1138 - true
   */

  @Test
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      boolean[] booleanArray0 = new boolean[2];
      booleanArray0[0] = true;
      double[] doubleArray1 = Optimization.solveTriangle((weka.core.matrix.Matrix) null, doubleArray0, false, booleanArray0);
      assertNotSame(doubleArray0, doubleArray1);
      assertNotSame(doubleArray1, doubleArray0);
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
      assertArrayEquals(new double[] {0.0}, doubleArray1, 0.01);
      assertNotNull(doubleArray1);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I40 Branch 185 IF_ICMPGE L1117 - true
   * Goal 2. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I64 Branch 187 IF_ICMPGE L1119 - true
   */

  @Test
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      boolean[] booleanArray0 = new boolean[2];
      booleanArray0[0] = true;
      double[] doubleArray1 = Optimization.solveTriangle((weka.core.matrix.Matrix) null, doubleArray0, true, booleanArray0);
      assertNotSame(doubleArray1, doubleArray0);
      assertNotSame(doubleArray0, doubleArray1);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      assertArrayEquals(new double[] {0.0}, doubleArray1, 0.01);
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertNotNull(doubleArray1);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I16 Branch 183 IFNONNULL L1112 - false
   */

  @Test
  public void test2()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(789, 789);
      assertEquals(789, matrix0.getRowDimension());
      assertTrue(matrix0.isSquare());
      assertEquals(789, matrix0.getColumnDimension());
      assertEquals(0.0, matrix0.trace(), 0.01D);
      assertNotNull(matrix0);
      
      double[] doubleArray0 = new double[39];
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, true, (boolean[]) null);
      assertNotSame(doubleArray1, doubleArray0);
      assertNotSame(doubleArray0, doubleArray1);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      assertEquals(789, matrix0.getRowDimension());
      assertTrue(matrix0.isSquare());
      assertEquals(789, matrix0.getColumnDimension());
      assertEquals(0.0, matrix0.trace(), 0.01D);
      assertNotNull(doubleArray1);
  }

  //Test case number: 3
  /*
   * 23 covered goals:
   * Goal 1. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I16 Branch 183 IFNONNULL L1112 - true
   * Goal 2. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I28 Branch 184 IFEQ L1115 - true
   * Goal 3. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I28 Branch 184 IFEQ L1115 - false
   * Goal 4. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I40 Branch 185 IF_ICMPGE L1117 - false
   * Goal 5. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I47 Branch 186 IFEQ L1117 - true
   * Goal 6. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I47 Branch 186 IFEQ L1117 - false
   * Goal 7. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I64 Branch 187 IF_ICMPGE L1119 - false
   * Goal 8. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I85 Branch 188 IF_ICMPGE L1122 - true
   * Goal 9. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I85 Branch 188 IF_ICMPGE L1122 - false
   * Goal 10. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I94 Branch 189 IFNE L1123 - true
   * Goal 11. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I94 Branch 189 IFNE L1123 - false
   * Goal 12. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I111 Branch 190 IF_ICMPGE L1125 - true
   * Goal 13. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I111 Branch 190 IF_ICMPGE L1125 - false
   * Goal 14. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I180 Branch 191 IFLT L1136 - false
   * Goal 15. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I187 Branch 192 IFEQ L1136 - true
   * Goal 16. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I187 Branch 192 IFEQ L1136 - false
   * Goal 17. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I203 Branch 193 IFLT L1138 - false
   * Goal 18. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I223 Branch 194 IFLT L1141 - true
   * Goal 19. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I223 Branch 194 IFLT L1141 - false
   * Goal 20. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I232 Branch 195 IFNE L1142 - true
   * Goal 21. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I232 Branch 195 IFNE L1142 - false
   * Goal 22. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I251 Branch 196 IF_ICMPGE L1144 - true
   * Goal 23. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I251 Branch 196 IF_ICMPGE L1144 - false
   */

  @Test
  public void test3()  throws Throwable  {
      double[][] doubleArray0 = new double[4][2];
      double[] doubleArray1 = new double[3];
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0, 1097, 1097);
      assertTrue(matrix0.isSquare());
      assertFalse(matrix0.isSymmetric());
      assertEquals(1097, matrix0.getColumnDimension());
      assertEquals(1097, matrix0.getRowDimension());
      assertNotNull(matrix0);
      
      boolean[] booleanArray0 = new boolean[18];
      booleanArray0[0] = true;
      booleanArray0[2] = true;
      double[] doubleArray2 = Optimization.solveTriangle(matrix0, doubleArray1, true, booleanArray0);
      assertNotSame(doubleArray2, doubleArray1);
      assertNotSame(doubleArray1, doubleArray2);
      assertFalse(doubleArray2.equals((Object)doubleArray1));
      assertFalse(doubleArray1.equals((Object)doubleArray2));
      assertArrayEquals(new double[] {0.0, Double.NaN, 0.0}, doubleArray2, 0.01);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray1, 0.01);
      assertTrue(matrix0.isSquare());
      assertFalse(matrix0.isSymmetric());
      assertEquals(1097, matrix0.getColumnDimension());
      assertEquals(1097, matrix0.getRowDimension());
      assertNotNull(doubleArray2);
      
      double[] doubleArray3 = Optimization.solveTriangle(matrix0, doubleArray1, false, booleanArray0);
      assertNotSame(doubleArray3, doubleArray1);
      assertNotSame(doubleArray3, doubleArray2);
      assertNotSame(doubleArray1, doubleArray2);
      assertNotSame(doubleArray1, doubleArray3);
      assertFalse(doubleArray3.equals((Object)doubleArray1));
      assertFalse(doubleArray3.equals((Object)doubleArray2));
      assertFalse(doubleArray1.equals((Object)doubleArray2));
      assertFalse(doubleArray1.equals((Object)doubleArray3));
      assertArrayEquals(new double[] {0.0, Double.NaN, 0.0}, doubleArray3, 0.01);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray1, 0.01);
      assertTrue(matrix0.isSquare());
      assertFalse(matrix0.isSymmetric());
      assertEquals(1097, matrix0.getColumnDimension());
      assertEquals(1097, matrix0.getRowDimension());
      assertNotNull(doubleArray3);
  }
}

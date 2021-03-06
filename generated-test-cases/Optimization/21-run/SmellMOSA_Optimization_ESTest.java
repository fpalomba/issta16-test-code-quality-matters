/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 18 19:15:53 GMT 2015
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
import org.evosuite.runtime.testdata.FileSystemHandling;
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
      double[][] doubleArray0 = new double[3][3];
      double[] doubleArray1 = new double[3];
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.constructWithCopy(doubleArray0);
      assertEquals(3, matrix0.getColumnDimension());
      assertEquals(0.0, matrix0.normInf(), 0.01D);
      assertEquals(0.0, matrix0.norm1(), 0.01D);
      assertTrue(matrix0.isSquare());
      assertEquals(0.0, matrix0.trace(), 0.01D);
      assertTrue(matrix0.isSymmetric());
      assertEquals(3, matrix0.getRowDimension());
      assertNotNull(matrix0);
      
      boolean[] booleanArray0 = new boolean[3];
      booleanArray0[1] = true;
      double[] doubleArray2 = Optimization.solveTriangle(matrix0, doubleArray1, false, booleanArray0);
      assertTrue(Arrays.equals(new boolean[] {false, true, false}, booleanArray0));
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray1, 0.01);
      assertArrayEquals(new double[] {Double.NaN, 0.0, Double.NaN}, doubleArray2, 0.01);
      assertEquals(3, matrix0.getColumnDimension());
      assertEquals(0.0, matrix0.normInf(), 0.01D);
      assertEquals(0.0, matrix0.norm1(), 0.01D);
      assertTrue(matrix0.isSquare());
      assertEquals(0.0, matrix0.trace(), 0.01D);
      assertTrue(matrix0.isSymmetric());
      assertEquals(3, matrix0.getRowDimension());
      assertFalse(doubleArray1.equals((Object)doubleArray2));
      assertFalse(doubleArray2.equals((Object)doubleArray1));
      assertNotNull(doubleArray2);
      assertNotSame(doubleArray1, doubleArray2);
      assertNotSame(doubleArray2, doubleArray1);
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
      double[] doubleArray0 = new double[1];
      boolean[] booleanArray0 = new boolean[1];
      booleanArray0[0] = true;
      double[] doubleArray1 = Optimization.solveTriangle((weka.core.matrix.Matrix) null, doubleArray0, false, booleanArray0);
      assertArrayEquals(new double[] {0.0}, doubleArray1, 0.01);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertTrue(Arrays.equals(new boolean[] {true}, booleanArray0));
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      assertNotNull(doubleArray1);
      assertNotSame(doubleArray1, doubleArray0);
      assertNotSame(doubleArray0, doubleArray1);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I94 Branch 189 IFNE L1123 - true
   */

  @Test
  public void test2()  throws Throwable  {
      double[][] doubleArray0 = new double[3][3];
      double[] doubleArray1 = new double[3];
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.constructWithCopy(doubleArray0);
      assertEquals(0.0, matrix0.trace(), 0.01D);
      assertEquals(3, matrix0.getColumnDimension());
      assertTrue(matrix0.isSquare());
      assertEquals(3, matrix0.getRowDimension());
      assertEquals(0.0, matrix0.norm1(), 0.01D);
      assertEquals(0.0, matrix0.normInf(), 0.01D);
      assertTrue(matrix0.isSymmetric());
      assertNotNull(matrix0);
      
      boolean[] booleanArray0 = new boolean[3];
      booleanArray0[1] = true;
      double[] doubleArray2 = Optimization.solveTriangle(matrix0, doubleArray1, true, booleanArray0);
      assertTrue(Arrays.equals(new boolean[] {false, true, false}, booleanArray0));
      assertArrayEquals(new double[] {Double.NaN, 0.0, Double.NaN}, doubleArray2, 0.01);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray1, 0.01);
      assertEquals(0.0, matrix0.trace(), 0.01D);
      assertEquals(3, matrix0.getColumnDimension());
      assertTrue(matrix0.isSquare());
      assertEquals(3, matrix0.getRowDimension());
      assertEquals(0.0, matrix0.norm1(), 0.01D);
      assertEquals(0.0, matrix0.normInf(), 0.01D);
      assertTrue(matrix0.isSymmetric());
      assertFalse(doubleArray2.equals((Object)doubleArray1));
      assertFalse(doubleArray1.equals((Object)doubleArray2));
      assertNotNull(doubleArray2);
      assertNotSame(doubleArray2, doubleArray1);
      assertNotSame(doubleArray1, doubleArray2);
  }

  //Test case number: 3
  /*
   * 3 covered goals:
   * Goal 1. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I40 Branch 185 IF_ICMPGE L1117 - true
   * Goal 2. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I47 Branch 186 IFEQ L1117 - false
   * Goal 3. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I64 Branch 187 IF_ICMPGE L1119 - true
   */

  @Test
  public void test3()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      boolean[] booleanArray0 = new boolean[8];
      booleanArray0[0] = true;
      double[] doubleArray1 = Optimization.solveTriangle((weka.core.matrix.Matrix) null, doubleArray0, true, booleanArray0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertArrayEquals(new double[] {0.0}, doubleArray1, 0.01);
      assertTrue(Arrays.equals(new boolean[] {true, false, false, false, false, false, false, false}, booleanArray0));
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertNotNull(doubleArray1);
      assertNotSame(doubleArray0, doubleArray1);
      assertNotSame(doubleArray1, doubleArray0);
  }

  //Test case number: 4
  /*
   * 9 covered goals:
   * Goal 1. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I28 Branch 184 IFEQ L1115 - false
   * Goal 2. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I40 Branch 185 IF_ICMPGE L1117 - false
   * Goal 3. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I47 Branch 186 IFEQ L1117 - true
   * Goal 4. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I64 Branch 187 IF_ICMPGE L1119 - false
   * Goal 5. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I85 Branch 188 IF_ICMPGE L1122 - true
   * Goal 6. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I85 Branch 188 IF_ICMPGE L1122 - false
   * Goal 7. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I94 Branch 189 IFNE L1123 - false
   * Goal 8. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I111 Branch 190 IF_ICMPGE L1125 - true
   * Goal 9. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I111 Branch 190 IF_ICMPGE L1125 - false
   */

  @Test
  public void test4()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.random(164, 164);
      assertEquals(41.0, matrix0.trace(), 0.01D);
      assertFalse(matrix0.isSymmetric());
      assertEquals(75.0, matrix0.normInf(), 0.01D);
      assertEquals(82.4, matrix0.norm1(), 0.01D);
      assertEquals(164, matrix0.getColumnDimension());
      assertTrue(matrix0.isSquare());
      assertEquals(164, matrix0.getRowDimension());
      assertNotNull(matrix0);
      
      double[] doubleArray0 = new double[20];
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, true, (boolean[]) null);
      assertEquals(41.0, matrix0.trace(), 0.01D);
      assertFalse(matrix0.isSymmetric());
      assertEquals(75.0, matrix0.normInf(), 0.01D);
      assertEquals(82.4, matrix0.norm1(), 0.01D);
      assertEquals(164, matrix0.getColumnDimension());
      assertTrue(matrix0.isSquare());
      assertEquals(164, matrix0.getRowDimension());
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertNotNull(doubleArray1);
      assertNotSame(doubleArray0, doubleArray1);
      assertNotSame(doubleArray1, doubleArray0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * Goal 1. weka.core.Optimization.solveTriangle(Lweka/core/matrix/Matrix;[DZ[Z)[D: I16 Branch 183 IFNONNULL L1112 - true
   */

  @Test
  public void test5()  throws Throwable  {
      double[][] doubleArray0 = new double[1][3];
      double[] doubleArray1 = new double[3];
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.constructWithCopy(doubleArray0);
      assertEquals(3, matrix0.getColumnDimension());
      assertEquals(0.0, matrix0.normInf(), 0.01D);
      assertEquals(0.0, matrix0.norm1(), 0.01D);
      assertFalse(matrix0.isSymmetric());
      assertFalse(matrix0.isSquare());
      assertEquals(1, matrix0.getRowDimension());
      assertEquals(0.0, matrix0.trace(), 0.01D);
      assertNotNull(matrix0);
      
      boolean[] booleanArray0 = new boolean[3];
      // Undeclared exception!
      try {
        double[] doubleArray2 = Optimization.solveTriangle(matrix0, doubleArray1, false, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
      }
  }

  //Test case number: 6
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
  public void test6()  throws Throwable  {
      boolean boolean0 = FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "`MZ=rq=>~");
      assertFalse(boolean0);
      
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.random(149, 149);
      assertTrue(matrix0.isSquare());
      assertEquals(149, matrix0.getColumnDimension());
      assertFalse(matrix0.isSymmetric());
      assertEquals(67.5, matrix0.normInf(), 0.01D);
      assertEquals(149, matrix0.getRowDimension());
      assertEquals(67.5, matrix0.norm1(), 0.01D);
      assertEquals(0.0, matrix0.trace(), 0.01D);
      assertNotNull(matrix0);
      
      double[] doubleArray0 = new double[20];
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, (boolean[]) null);
      assertTrue(matrix0.isSquare());
      assertEquals(149, matrix0.getColumnDimension());
      assertFalse(matrix0.isSymmetric());
      assertEquals(67.5, matrix0.normInf(), 0.01D);
      assertEquals(149, matrix0.getRowDimension());
      assertEquals(67.5, matrix0.norm1(), 0.01D);
      assertEquals(0.0, matrix0.trace(), 0.01D);
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertNotNull(doubleArray1);
      assertNotSame(doubleArray0, doubleArray1);
      assertNotSame(doubleArray1, doubleArray0);
  }
}

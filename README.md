# issta16-test-code-quality-matters
Online Appendix of the ISSTA'16 paper named "Automatic Test Case Generation: What if Test Code Quality Matters?" by Fabio Palomba, Annibale Panichella, Andy Zaidman, Rocco Oliveto and Andrea De Lucia

The repository contains 3 artifacts, described in the following:

1) The file named "issta16-paper.pdf" is the original paper accepted at the International Symposium on Software Testing and Analysis (ISSTA), Saarland University, Saarbrücken, Germany. July 18–20, 2016;

2) The folder named "generated-test-cases" contains the test suites generated by Evosuite, MOSA, and Q-MOSA when testing the 43 classes considered in the paper. Specifically, the folder contains the test suites generated in each of the 30 runs by the three experimented algorithms. It is worth noting that the test suites having the suffix "SmellMOSA" refer to the Q-MOSA algorithm;

3) The file named "q-mosa.jar" is the runnable jar file which can be used to replicate the study, as well as to use the tool in other contexts. Since Q-MOSA is plugged into Evosuite (http://www.evosuite.org), it is possible to run the tool by following the instructions available at https://github.com/EvoSuite/evosuite and add the option -Dalgorithm=SmellMOSA.
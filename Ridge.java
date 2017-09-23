import Jama.*;

public class Ridge {
	static int p = 9; // the power of 9
	static double[] xData = {0,0.0100,0.0200,0.0300,0.0400,0.0500,0.0600,0.0700,0.0800,0.0900,0.1000,0.1100,0.1200,0.1300,0.1400,0.1500,0.1600,0.1700,0.1800,0.1900,0.2000,0.2100,0.2200,0.2300,0.2400,0.2500,0.2600,0.2700,0.2800,0.2900,
			0.3000,0.3100,0.3200,0.3300,0.3400,0.3500,0.3600,0.3700,0.3800,0.3900,0.4000,0.4100,0.4200,0.4300,0.4400,0.4500,0.4600,0.4700,0.4800,0.4900,0.5000,0.5100,0.5200,0.5300,0.5400,0.5500,0.5600,0.5700,0.5800,0.5900,
			0.6000,0.6100,0.6200,0.6300,0.6400,0.6500,0.6600,0.6700,0.6800,0.6900,0.7000,0.7100,0.7200,0.7300,0.7400,0.7500,0.7600,0.7700,0.7800,0.7900,0.8000,0.8100,0.8200,0.8300,0.8400,0.8500,0.8600,0.8700,0.8800,0.8900,
			0.9000,0.9100,0.9200,0.9300,0.9400,0.9500,0.9600,0.9700,0.9800,0.9900,1.0000};
	
	
	//this double for loop takes the values of x and creates an array (later on to be formed into a matrix) so that it fits the polynomial power of 9
	public static void main(String args[]){
		double [][] arrayX = new double [xData.length][p+1];
		for(int i =0; i < xData.length; i++ ){
			for(int j =0; j < p+1; j++){
				arrayX [i][j] = Math.pow(xData[i], j);
			}
		}
		// the next array was done manually since it had significantly less data than the testing data
		double x1= 0;
		double x2= .1;
		double x3= .2;
		double x4= .3;
		double x5= .4;
		double x6= .5;
		double x7= .6;
		double x8= .7;
		double x9= .8;
		double x10=.9;
		double x11= 1;
		
		double[][] XX = {
		  {1, x1 , (Math.pow(x1, 2)),(Math.pow(x1, 3)),(Math.pow(x1, 4)),(Math.pow(x1, 5)),(Math.pow(x1, 6)), (Math.pow(x1, 7)),(Math.pow(x1, 8)),(Math.pow(x1, 9))},	
		  {1, x2 , (Math.pow(x2, 2)),(Math.pow(x2, 3)),(Math.pow(x2, 4)),(Math.pow(x2, 5)),(Math.pow(x2, 6)), (Math.pow(x2, 7)),(Math.pow(x2, 8)),(Math.pow(x2, 9))},	
		  {1, x3 , (Math.pow(x2, 2)),(Math.pow(x3, 3)),(Math.pow(x3, 4)),(Math.pow(x3, 5)),(Math.pow(x3, 6)), (Math.pow(x3, 7)),(Math.pow(x3, 8)),(Math.pow(x3, 9))},	
		  {1, x4 , (Math.pow(x4, 2)),(Math.pow(x4, 3)),(Math.pow(x4, 4)),(Math.pow(x4, 5)),(Math.pow(x4, 6)), (Math.pow(x4, 7)),(Math.pow(x4, 8)),(Math.pow(x4, 9))},
		  {1, x5 , (Math.pow(x5, 2)),(Math.pow(x5, 3)),(Math.pow(x5, 4)),(Math.pow(x5, 5)),(Math.pow(x5, 6)), (Math.pow(x5, 7)),(Math.pow(x5, 8)),(Math.pow(x5, 9))},
		  {1, x6 , (Math.pow(x6, 2)),(Math.pow(x6, 3)),(Math.pow(x6, 4)),(Math.pow(x6, 5)),(Math.pow(x6, 6)), (Math.pow(x6, 7)),(Math.pow(x6, 8)),(Math.pow(x6, 9))},
		  {1, x7 , (Math.pow(x7, 2)),(Math.pow(x7, 3)),(Math.pow(x7, 4)),(Math.pow(x7, 5)),(Math.pow(x7, 6)), (Math.pow(x7, 7)),(Math.pow(x7, 8)),(Math.pow(x7, 9))},
		  {1, x8 , (Math.pow(x8, 2)),(Math.pow(x8, 3)),(Math.pow(x8, 4)),(Math.pow(x8, 5)),(Math.pow(x8, 6)), (Math.pow(x8, 7)),(Math.pow(x8, 8)),(Math.pow(x8, 9))},
		  {1, x9 , (Math.pow(x9, 2)),(Math.pow(x9, 3)),(Math.pow(x9, 4)),(Math.pow(x9, 5)),(Math.pow(x9, 6)), (Math.pow(x9, 7)),(Math.pow(x9, 8)),(Math.pow(x9, 9))},
		  {1, x10 ,(Math.pow(x10,2)),(Math.pow(x10,3)),(Math.pow(x10,4)),(Math.pow(x10,5)),(Math.pow(x10,6)), (Math.pow(x10,7)),(Math.pow(x10,8)),(Math.pow(x10,9))},
		  {1, x11 ,(Math.pow(x11,2)),(Math.pow(x11,3)),(Math.pow(x11,4)),(Math.pow(x11,5)),(Math.pow(x11,6)), (Math.pow(x11,7)),(Math.pow(x11,8)),(Math.pow(x11,9))},
		};

		double[][] YY = {
		  { .0840}, 
		  { .4990},	
		  { .9611},	
		  { .8966},	
		  { .6181},	
		  { -.0600}, 
		  { -.5388}, 
		  { -.8771}, 
		  { -.7799}, 
		  { -.6072}, 
		  { -.2138}, 
		};
		
		double [][] y2 = {
				{0.0601},
				{0.1060},
				{0.2088},
				{0.3850},
				{0.3846},
				{0.1664},
				{0.1094},
				{0.5260},
				{0.2778},
				{0.5432},
				{0.5917},
				{0.8849},
				{0.6769},
				{0.6726},
				{0.7967},
				{0.8363},
				{0.8521},
				{0.8087},
				{0.7690},
				{0.9649},
				{0.8018},
				{0.8539},
				{1.1302},
				{0.9456},
				{0.9824},
				{1.1000},
				{0.9647},
				{1.1065},
				{0.9439},
				{1.0811},
				{1.0210},
				{0.9061},
				{0.8086},
				{0.7604},
				{0.8143},
				{0.7603},
				{0.7251},
				{0.8383},
				{0.6515},
				{0.7645},
				{0.5287},
				{0.6439},
				{0.4237},
				{0.4454},
				{0.4760},
				{0.2630},
				{0.2000},
				{0.4100},
				{0.2310},
				{0.0148},
				{0.0721},
				{-0.1028},
				{-0.0469},
				{-0.0301},
				{-0.4270},
				{-0.1947},
				{-0.2061},
				    {-0.4205},
				    {-0.2877},
				    {-0.5186},
				    {-0.7252},
				    {-0.8811},
				    {-0.7216},
				    {-0.6497},
				    {-0.7352},
				    {-0.7631},
				    {-0.9084},
				    {-0.8603},
				    {-1.0869},
				    {-1.0142},
				    {-1.0420},
				    {-0.9108},
				   {-0.9839},
				    {-1.1205},
				    {-0.9991},
				    {-1.0766},
				    {-1.0721},
				    {-0.8961},
				    {-0.9697},
				    {-0.9243},
				    {-0.8528},
				    {-0.9097},
				    {-0.8436},
				    {-0.8004},
				    {-0.7143},
				    {-0.7561},
				    {-0.6136},
				    {-0.7265},
				    {-0.6899},
				    {-0.4484},
				    {-0.6444},
				    {-0.5361},
				    {-0.3795},
				    {-0.4091},
				    {-0.2120},
				    {-0.1941},
				    {-0.2163},
				    {-0.2738},
				    {-0.0624},
				    {-0.2164},
				     {0.0272}
		};
		// take all the arrays formed above and convert them into matricies 
		Matrix YMatrix = new Matrix(YY);
		Matrix XMatrix = new Matrix(XX);
		Matrix Y2Matrix = new Matrix(y2);
		Matrix X2Matrix = new Matrix(arrayX);
		
		//calls the method that will solve the linear equation system
		//this will be for the training data
		System.out.println("Training Data:");
		double Ermsval1 = mathErms(XMatrix, YMatrix, 6);
		double Ermsval2 = mathErms(XMatrix, YMatrix, 26);
		double Ermsval3 = mathErms(XMatrix, YMatrix, 46);	
		double Ermsval4 = mathErms(XMatrix, YMatrix, 66);		
		double Ermsval5 = mathErms(XMatrix, YMatrix, 86);		
		double Ermsval6 = mathErms(XMatrix, YMatrix, 106);		
		double Ermsval7 = mathErms(XMatrix, YMatrix, 126);		
		double Ermsval8 = mathErms(XMatrix, YMatrix, 146);		
		double Ermsval9 = mathErms(XMatrix, YMatrix, 166);		
		double Ermsval10 = mathErms(XMatrix, YMatrix, 186);
		
		//this will be for the testing data 
		System.out.println("Testing Data:");
		double Ermsval11 = mathErms(X2Matrix, Y2Matrix, 6);
		double Ermsval12 = mathErms(X2Matrix, Y2Matrix, 26);
		double Ermsval13 = mathErms(X2Matrix, Y2Matrix, 46);
		double Ermsval14 = mathErms(X2Matrix, Y2Matrix, 66);
		double Ermsval15 = mathErms(X2Matrix, Y2Matrix, 86);
		double Ermsval16 = mathErms(X2Matrix, Y2Matrix, 106);
		double Ermsval17 = mathErms(X2Matrix, Y2Matrix, 126);
		double Ermsval18 = mathErms(X2Matrix, Y2Matrix, 146);
		double Ermsval19 = mathErms(X2Matrix, Y2Matrix, 166);
		double Ermsval20 = mathErms(X2Matrix, Y2Matrix, 186);
	}
	    //method to find the w from the equation given on the slides
		public static double mathErms(Matrix XMatrix, Matrix YMatrix, double lambda){
		Matrix XTranspose = XMatrix.transpose();
		Matrix identityMatrix = Matrix.identity(10, 10);
		Matrix XTransposetimesX = XTranspose.times(XMatrix);
		Matrix lambdatimesIdentity = identityMatrix.times(lambda);
		Matrix addMatricies = XTransposetimesX.plus(lambdatimesIdentity);
		Matrix inverseMatrix = addMatricies.inverse();
		Matrix inMtimesXT = inverseMatrix.times(XTranspose);
		Matrix w = inMtimesXT.times(YMatrix); // w matrix
		Matrix Ycalc = XMatrix.times(w);     // y(xn, w) matrix
		
		//start the E(w) calculations. Ycalc is the y(xn, w) matrix whereas YMatrix is the tn in the equation E(w) = Sum(y(xn,w) - tn)^2
		
		Matrix subMatrix = Ycalc.minus(YMatrix);
		Matrix copysub = subMatrix.copy();
		Matrix subMatrixSquared = subMatrix.arrayTimes(copysub); //square the result
		double[][] arrayEw = subMatrixSquared.getArray(); //get the elements from the matrix and put it into an array
		// sum the elements in the array to get the sum of E(w)
		double arrayEwsum = 0;
		for(int i = 0; i<arrayEw.length; i++){
			for(int j = 0; j <arrayEw[i].length; j++){
				arrayEwsum += arrayEw[i][j];}
		}
		double div = arrayEwsum / YMatrix.getRowDimension(); // Erms = sum of E(w) / N
		double Erms = Math.sqrt(div);
		System.out.println(Erms);
		return Erms;
		}
	}
	
	



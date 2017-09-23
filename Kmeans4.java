public class Kmeans4 {
	
	static int randomRange(int min, int max){
		int range = (max - min) +1;
		return (int)(Math.random() * range ) + min;
	}
	
	static double distance(double x1, double y1, double x2, double y2){
		double first = (x1 - x2);
		double square1 = Math.pow(first, 2);
		double second = (y1 - y2);
		double square2 = Math.pow(second, 2);
		double addBoth = square1 + square2;
		double finalDist = Math.sqrt(addBoth);
		return finalDist;
	}
	
	static void centroid1Calc(double x2, double y2, double x3, double y3, double x4, double y4, double x5, double y5){
		System.out.println("centroid 1 cluster values:");
		for( int i = 0; i<60; i++){
			double x1 = X[i];
			double y1 =  Y[i];
			double distance = distance(x1, y1, x2, y2);
			double distance2 = distance(x1, y1, x3, y3);
			double distance3 = distance(x1, y1, x4,y4);
			double distance4 = distance(x1,y1,x5,y5);
			
			if(distance < distance2 && distance < distance3 && distance < distance4){
				System.out.println(x1 + "," + y1);
		}
		
	}
	}
	
	static void centroid2Calc(double x2, double y2, double x3, double y3, double x4, double y4, double x5, double y5){
		System.out.println("centroid 2 cluster values:");
		for(int i = 0; i<60; i++){
			double x1 = X[i];
			double y1 = Y[i];
			double distance = distance(x1, y1, x2, y2);
			double distance2 = distance(x1, y1, x3, y3);
			double distance3 = distance(x1, y1, x4,y4);
			double distance4 = distance(x1,y1,x5,y5);
			
			if(distance2 < distance && distance2 < distance3 && distance2<distance4){
				System.out.println(x1 + "," + y1);
			}
			
	}
	}
	
	static void centroid3Calc(double x2, double y2, double x3, double y3, double x4, double y4, double x5, double y5){
		System.out.println("centroid 3 cluster values:");
		for(int i = 0; i<60; i++){
			double x1 = X[i];
			double y1 = Y[i];
			double distance = distance(x1, y1, x2, y2);
			double distance2 = distance(x1, y1, x3, y3);
			double distance3 = distance(x1, y1, x4,y4);
			double distance4 = distance(x1,y1,x5,y5);
			
			if(distance3 < distance && distance3 < distance2 && distance3 < distance4){
				System.out.println(x1 + "," + y1);
			}
			
	}
	}
	
	static void centroid4Calc(double x2, double y2, double x3, double y3, double x4, double y4, double x5, double y5){
		System.out.println("centroid 4 cluster values:");
		for(int i = 0; i<60; i++){
			double x1 = X[i];
			double y1 = Y[i];
			double distance = distance(x1, y1, x2, y2);
			double distance2 = distance(x1, y1, x3, y3);
			double distance3 = distance(x1, y1, x4,y4);
			double distance4 = distance(x1,y1,x5,y5);
			
			if(distance4 < distance && distance4 < distance2 && distance4 < distance3){
				System.out.println(x1 + "," + y1);
			}
			
	}
	}
	
	static int recursiveCentroid(int centroid1, int centroid2, int centroid3, int centroid4){
	if(centroid2 == centroid1){
		centroid2 = randomRange(0,59);
		recursiveCentroid(centroid1, centroid2, centroid3, centroid4);}
	else if(centroid3 == centroid2 | centroid3 == centroid1){
		centroid3 = randomRange(0,59);
		recursiveCentroid(centroid1, centroid2, centroid3, centroid4);}
	else if(centroid4 == centroid2 | centroid4 == centroid1 | centroid4 == centroid3){
			centroid4 = randomRange(0,59);
		}
	
		else {
			return centroid2;
		
	}
	return centroid2;
		}
	
	static double [] X = new double [60];
	static double [] Y = new double [60];
	
	public static void main(String args[]){
		
		
		X[0] = 0.7822;
		X[1] = 1.0065;
		X[2] = 1.1105;
		X[3] = 1.2201;
		X[4] = 1.3088;
		X[5] = 1.0172;
		X[6] =  0.7017;
		X[7] = 0.8515;
		X[8] = 0.7877;
		X[9] =  1.4701;
		X[10] = 0.8769;
		X[11] =   1.1496;
		X[12] = 0.9615;
		X[13] =  1.1777;
		X[14] = 0.8470;
		X[15] =    0.7195;
		X[16] = 0.7155;
		X[17] = 1.0976;
		X[18] = 0.9645;
		X[19] =  0.9608;
		X[20] =  -0.7899;
		X[21] = -1.2220;
		X[22] =  -0.9750;
		X[23] = -1.1361;
		X[24] = -0.9241;
		X[25] = -1.1501;
		X[26] = -0.8775;
		X[27] = -0.8152;
		X[28] = -0.5720;
		X[29] = -1.0485;
		X[30] = -1.5346;
		X[31] = -1.2099;
		X[32] = -0.6614;
		X[33] = -1.2680;
		X[34] = -0.7598;
		X[35] = -0.9690;
		X[36] = -0.6408;
		X[37] = -1.4902;
		X[38] = -1.0494;
		X[39] = -1.3020;
		X[40] = 0.0076;
		X[41] = -0.0873;
		X[42] = -0.5834;
		X[43] = -0.0952;
		X[44] = -0.2771;
		X[45] = -0.3264;
		X[46] = -0.3855;
		X[47] = -0.1779;
		X[48] = -0.6675;
		X[49] = 0.3214;
		X[50] = 0.1734;
		X[51] = -0.0067;
		X[52]= -0.0116;
		X[53] = -0.2661;
		X[54] = 0.3396;
		X[55] = -0.0444;
		X[56] = -0.2382;
		X[57] = 0.4505;
		X[58] = -0.0749;
		X[59]= -0.1963;
		
		
		Y[0] = 1.2839;
		Y[1] = 1.0583;
		Y[2] = 1.0396;
		Y[3] = 1.3175;
		Y[4] = 0.8391;
		Y[5] = 1.1393;
		Y[6] =  1.1670;
		Y[7] = 0.9513;
		Y[8] = 1.0431;
		Y[9] = 0.7668;
		Y[10] = 0.7704;
		Y[11] = 1.0210;
		Y[12] = 1.1445;
		Y[13] = 1.5171;
		Y[14] = 0.8666;
		Y[15] = 1.0375;
		Y[16] = 0.9835;
		Y[17] = 0.6134;
		Y[18] = 0.9122;
		Y[19] = 0.6411;
		Y[20] = 1.7270;
		Y[21] = 1.2063;
		Y[22] = 1.3447;
		Y[23] = 0.7355;
		Y[24] = 0.8828;
		Y[25] = 0.9319;
		Y[26] = 1.2746;
		Y[27] = 0.9305;
		Y[28] = 1.1754;
		Y[29] = 0.4870;
		Y[30] = 0.9115;
		Y[31] = 0.7941;
		Y[32] = 0.6057;
		Y[33] = 1.1270;
		Y[34] = 1.0705;
		Y[35] = 1.0084;
		Y[36] = 0.6666;
		Y[37] = 1.2819;
		Y[38] = 1.0875;
		Y[39] = 0.9252;
		Y[40] = -1.0979;
		Y[41] = -1.2826;
		Y[42] = -1.3734;
		Y[43] = -0.1580;
		Y[44] =  -0.4482;
		Y[45] = -0.8975;
		Y[46] = -1.4190;
		Y[47] =  -1.2885;
		Y[48] = -1.0588;
		Y[49] = -0.7362;
		Y[50] = -1.4440;
		Y[51] =  -1.7766;
		Y[52] = -1.4830;
		Y[53] = -0.8888;
		Y[54] = -0.8695;
		Y[55] = -0.8494;
		Y[56] = -1.0434;
		Y[57] = -0.9388;
		Y[58] = -1.1587;
		Y[59] = -0.7127;
		
		
		int centroid1 = randomRange(0,59);
		System.out.println("centroid:" + centroid1);
		System.out.println(X[centroid1] +"," + Y[centroid1]);
		int centroid2 = randomRange(0,59);
		int centroid3 = randomRange(0,59);
		int centroid4 = randomRange(0,59);
		recursiveCentroid(centroid1,centroid2, centroid3, centroid4);
		
		
			
		
		System.out.println("centroid2:" + centroid2);
		System.out.println(X[centroid2] +"," + Y[centroid2]);
		System.out.println("centroid3:" + centroid3);
		System.out.println(X[centroid3] +"," + Y[centroid3]);
		System.out.println("centroid4:" + centroid4);
		System.out.println(X[centroid4] +"," + Y[centroid4]);
		
		
		
		double x2 = X[centroid1];
		double y2 = Y[centroid1];
		
		double x3 = X[centroid2];
		double y3 = Y[centroid2];
		
		double x4 =  X[centroid3];
		double y4 = Y[centroid3];
		
		double x5 = X[centroid4];
		double y5 = Y[centroid4];
		
		//System.out.println("centroid actual value:" + x +"," + y);
		
		centroid1Calc(x2, y2, x3, y3, x4, y4, x5, y5);
		centroid2Calc(x2,y2,x3,y3, x4, y4, x5, y5);
		centroid3Calc(x2, y2, x3, y3, x4, y4, x5, y5);
		centroid4Calc(x2, y2, x3, y3, x4, y4, x5, y5);
			
			
		}
		
	}
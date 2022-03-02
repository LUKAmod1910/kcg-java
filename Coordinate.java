package point;

import java.util.Random;

public class Coordinate {
	static Random ran = new Random();
	int xPoint;
	int yPoint;
	
	Coordinate(){
		this.xPoint = ran.nextInt(10) + 1;
		this.yPoint = ran.nextInt(10) + 1;
	}
	
	void coordinateShow(int i) {
		System.out.printf("point%dの座標(%d,%d)%n",i + 1, xPoint, yPoint);
	}
	
//	インスタンスごとの処理ではないのでクラスメソッド
	static double pointDistance(Coordinate points) {
		return Math.sqrt(Math.pow(points.xPoint,2) + Math.pow(points.yPoint,2));
	}
	
	
	static boolean pointExistance(Coordinate[] points) {
		 if(points[0].xPoint >= points[1].xPoint && points[0].yPoint >= points[1].yPoint) {
			 return true;
		 }else {
			 return false;
		 }
	}
	
	static double pointDistance(Coordinate[] points) {
		return Math.sqrt(Math.pow(points[0].xPoint-points[1].xPoint, 2) + Math.pow(points[0].yPoint-points[1].yPoint, 2));
	}
	
	
	
}

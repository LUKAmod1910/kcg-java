package point;
public class Last01 {
	public static void main(String[] args) {
		Coordinate[] points = new Coordinate[2];
		
		for(int i = 0; i < points.length; i++ ) {
			points[i] = new Coordinate();
			points[i].coordinateShow(i);
		}
		
		System.out.printf("原点(0,0)とpoint1の2点距離は%.3f%n",Coordinate.pointDistance(points[0]));
		
		System.out.printf("point2は,原点とpoint1で形成される四角形の%sにあります%n",Coordinate.pointExistance(points) ? "内" : "外");
		
		System.out.printf("point1とpoint2の2点距離は%.3f%n",Coordinate.pointDistance(points));
	}

}

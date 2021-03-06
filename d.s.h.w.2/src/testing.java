import java.util.Arrays;

public class testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DataStructure ds = new DataStructure();
		ds.addPoint(new Point(-8,-7));
		ds.addPoint(new Point(-2,-4));
		ds.addPoint(new Point(-1,-2));
		ds.addPoint(new Point(-4,0));
		ds.addPoint(new Point(1,1));
		ds.addPoint(new Point(2,-5));
		ds.addPoint(new Point(3,-3));
		System.out.println(ds.toString());
		System.out.println("*********tests************");
		System.out.println("ds size:"+ds.size());
		System.out.println("density:"+ds.getDensity());
		System.out.println("largest axis:"+ds.getLargestAxis());
		System.out.println("get points check x:"+Arrays.toString(ds.getPointsInRangeRegAxis(-9, -1, true)));
		System.out.println("get points check y:"+Arrays.toString(ds.getPointsInRangeRegAxis(-3, 2, false)));
		System.out.println("get points opp check, axis=x:"+Arrays.toString(ds.getPointsInRangeOppAxis(-9, -1, true)));
		System.out.println("get points opp check, axis=y:"+Arrays.toString(ds.getPointsInRangeOppAxis(-3, 2, false)));
	}

}

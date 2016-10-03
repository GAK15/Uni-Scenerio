package kletech.ac.in;

import kletech.ac.in.University.autonomousCollege;
import kletech.ac.in.University.nonautonomousCollege;
public class UniversityDemo {

	public static void main(String[] args) {
		autonomousCollege bvb  = new autonomousCollege("2K16BVB","BVB");	//creating object
		nonautonomousCollege kls = new nonautonomousCollege("2K19GOGTE", "KLSGOGTE");	//object creation
		bvb.createDept("BVB_CS", 250, 15);					
		bvb.createDept("BVB_EC", 300, 8);
		bvb.createDept("BVB_EE", 150, 12);
		bvb.createDept("BVB_BT", 150, 7);
		bvb.createDept("BVB_ME", 300, 8);
		((autonomousCollege)bvb).CreateSplDept("SocialInnovation", 400, 10);
		((autonomousCollege)bvb).CreateSplDept("ProfessionalCommunication", 200, 8);

		kls.createDept("KLE2_CS", 250, 18);
		kls.createDept("KLE2_EC", 300, 12);
		kls.createDept("KLE2_EE", 150, 19);
		kls.createDept("KLE2_BT", 120, 16);
		kls.createDept("KLE2_ME", 300, 9);

		((autonomousCollege)bvb).PrintInfo();
		System.out.println("\tTotal number of staff in college "+bvb.collName+" are "+bvb.noOfStaff());
		System.out.println("\n\n");
		kls.PrintInfo();
		System.out.println("\tTotal number of staff in college "+kls.collName+" are "+kls.noOfStaff());        


	}
}



















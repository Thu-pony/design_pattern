 	package CompositePattern;

public class CompositeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//构建总部
		OraganizationCompsite head = new OraganizationCompsite("总部");
		ItPartment itpart1 = new ItPartment("总公司IT分部");
		ItPartment adminpartCompsite = new ItPartment("总公司行政部");
		
		head.Add(adminpartCompsite);
		head.Add(itpart1);
		
		//构建分公司
		
		OraganizationCompsite brach1 = new OraganizationCompsite("上海分公司");
		ItPartment  branchitCompsite = new ItPartment("上海 IT");
		ItPartment branchadmimCompsite = new ItPartment("上海 行政");
		
		brach1.Add(branchitCompsite);
		brach1.Add(branchadmimCompsite);
		
		head.Add(brach1);
		
		System.out.println("总公司多少人" + head.getStaffCount());
		System.out.println("上海分公司多少人" + brach1.getStaffCount());
	}

}

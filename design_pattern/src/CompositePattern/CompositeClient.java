 	package CompositePattern;

public class CompositeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����ܲ�
		OraganizationCompsite head = new OraganizationCompsite("�ܲ�");
		ItPartment itpart1 = new ItPartment("�ܹ�˾IT�ֲ�");
		ItPartment adminpartCompsite = new ItPartment("�ܹ�˾������");
		
		head.Add(adminpartCompsite);
		head.Add(itpart1);
		
		//�����ֹ�˾
		
		OraganizationCompsite brach1 = new OraganizationCompsite("�Ϻ��ֹ�˾");
		ItPartment  branchitCompsite = new ItPartment("�Ϻ� IT");
		ItPartment branchadmimCompsite = new ItPartment("�Ϻ� ����");
		
		brach1.Add(branchitCompsite);
		brach1.Add(branchadmimCompsite);
		
		head.Add(brach1);
		
		System.out.println("�ܹ�˾������" + head.getStaffCount());
		System.out.println("�Ϻ��ֹ�˾������" + brach1.getStaffCount());
	}

}

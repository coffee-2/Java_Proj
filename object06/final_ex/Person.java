package object06.final_ex;

public class Person {
	final String nation = "Korea";
	//final : ���� �տ� <== ���(�� ���� X)
	//final : Ŭ���� �տ� <== �ڽİ�ü�� ������� ����(��� X)
	//final : �޼ҵ� �տ� <== �޼ҵ� �������̵� �Ұ�(��� X)
		//�޼ҵ� �������̵� : ��� ���迡�� �θ� Ŭ�������� ����� �޼ҵ带 �ڽ� Ŭ�������� ������
		//�޼ҵ� �����ε� : ������ �޼ҵ� �̸����� �Ű������� �޸��ؼ� �޼ҵ带 ����
final String ssn;
 String name;

public Person(String ssn, String name) {
	this.ssn = ssn;
	this.name = name;}
}

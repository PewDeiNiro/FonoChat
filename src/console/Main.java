package console;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	//����� ��������� �� 1 �� 5 (����� �������<2,5  ������ �������> 3,5)
	//������� ������
	//������� ���������
	//������ ������
	//����������� ������������
	//������� ������
	//�������� ���������
	//������� � �������
	//������� ������
	//������� � ��������
	//������� ���������
	//������� � ��������
	//�������� �������������
	//������� �����������
	//������ �������
	//���������� �����������
	//�������������� ���������
	//����� �������
	//�������� ���������
	//��������� ���������
	//������� �����
	//������ ����
	//������� � �������� 
	//������� � ���������
	//������� �����
	//��������� ������������
	
	//������� ������ ���������������� ������
	//1. �� ����� ������� - ��������
	static final HashMap <String, Double> vg = new HashMap<>();
	static{
	vg.put("�", 3.0);
	vg.put("�", 3.9);
	vg.put("�", 2.0);
	vg.put("��", 2.7);
	vg.put("�", 4.0);
	vg.put("�", 2.8);
	vg.put("�", 1.6);
	vg.put("��", 3.6);
	vg.put("�", 3.5);
	vg.put("�", 2.8);
	vg.put("�", 2.0);
	vg.put("��", 3.6);
	vg.put("�", 3.0);
	vg.put("��", 2.9);
	vg.put("�", 2.1);
	vg.put("�", 3.2);
	vg.put("��", 3.2);
	vg.put("��", 3.1);
	vg.put("�", 3.1);
	vg.put("�", 2.1);
	vg.put("�", 3.5);
	vg.put("��", 3.6);
	vg.put("��", 4.1);
	vg.put("�", 3.4);
	vg.put("��", 2.9);
	vg.put("�", 1.9);
	vg.put("��", 2.4);
	vg.put("�", 3.5);
	vg.put("�", 3.9);
	vg.put("�", 2.6);
	vg.put("�", 2.4);
	vg.put("��", 1.9);
	vg.put("�", 3.7);
	vg.put("��", 3.4);
	vg.put("��", 3.3);
	vg.put("��", 3.2);
	vg.put("�", 2.6);
	vg.put("�", 2.9);
	vg.put("��", 3.4);
	vg.put("�", 3.9);
	vg.put("�", 2.3);
	vg.put("�", 3.2);
	vg.put("�", 1.7);
	vg.put("�", 3.0);
	vg.put("�", 3.7);
	vg.put("�", 1.9);	
	//��� ������
	vg.put("��", 2.5);
	}
	
	//����������� �����
	static final HashMap <String, Double> p = new HashMap<>();
	static{
	p.put("�", 0.049);
	p.put("�", 0.013);
	p.put("��", 0.005);
	p.put("�", 0.028);
	p.put("��", 0.011);
	p.put("�", 0.012);
	p.put("��", 0.003);
	p.put("�", 0.020);
	p.put("��", 0.017);
	p.put("�", 0.050);
	p.put("�", 0.008);
	p.put("�", 0.013);
	p.put("��", 0.002);
	p.put("�", 0.041);
	p.put("�", 0.013);
	p.put("�", 0.030);
	p.put("��", 0.003);
	p.put("�", 0.020);
	p.put("��", 0.017);
	p.put("�", 0.025);
	p.put("��", 0.007);
	p.put("�", 0.040);
	p.put("��", 0.024);
	p.put("�", 0.067);
	p.put("�", 0.020);
	p.put("��", 0.006);
	p.put("�", 0.024);
	p.put("��", 0.014);
	p.put("�", 0.032);
	p.put("��", 0.017);
	p.put("�", 0.055);
	p.put("��", 0.020);
	p.put("�", 0.017);
	p.put("�", 0.002);
	p.put("��", 0.001);
	p.put("�", 0.008);
	p.put("��", 0.001);
	p.put("�", 0.004);
	p.put("�", 0.020);
	p.put("�", 0.012);
	p.put("�", 0.003);
	p.put("�", 0.010);
	p.put("�", 0.004);
	p.put("�", 0.004);
	p.put("�", 0.013);	
	p.put("�", 0.039);
	
	p.put("��", 0.046);
	p.put("��", 0.015);
	p.put("��", 0.039);
	p.put("��", 0.037);
	p.put("��", 0.012);
	p.put("��", 0.011);
	p.put("��", 0.002);
	p.put("��", 0.001);
	p.put("��", 0.006);	
	}
	
	//������ ������� ���������
	static final ArrayList<Character> ts = new ArrayList<>();
	static{
		ts.add('�');
		ts.add('�');
		ts.add('�');
		ts.add('�');
		ts.add('�');
		ts.add('�');
		ts.add('�');
		ts.add('�');
		ts.add('�');
		ts.add('�');
		ts.add('�');
		ts.add('�');
		ts.add('�');
		ts.add('�');
		ts.add('�');
	}
	//������ ���������� �������
	static final ArrayList<Character> sg = new ArrayList<>();
	static{
		sg.add('�');
		sg.add('�');
		sg.add('�');
		sg.add('�');
		sg.add('�');
		sg.add('�');
	}
	
	//����������������� ����� �����
	double fs;
	//������� ������ ���������������� �����
	ArrayList<Double> fi = new ArrayList<>();
	//����������� ����� � ����
	ArrayList<Double> pi = new ArrayList<>();
	//����������� ���� �����
	ArrayList<Double> ki = new ArrayList<>();
	
	
	private Scanner scanner;
	//������������ �����
	String word;
	//������ ������ �� �����
	ArrayList<String> sounds;
	
	public Main() {
		printWord();
	}

	public static void main(String[] args) {
		new Main();
	}

	public void printWord(){
		System.out.println("������� �����, ��������� �������� *");
		scanner = new Scanner(System.in);
		word = scanner.nextLine();
		compFunnySad();
	}

	private void compFunnySad() {
		//�������� ������ ������ �� ���������� �����
		sounds = new ArrayList<>();
		//����������
		String z;
		for(int i=0; i< word.length(); i++){	
			if(word.charAt(i)=='*' || word.charAt(i) == '�' || word.charAt(i) == '�'){
				System.out.println("�������� ��� ������ ����");
				//?
				
			}else
			//���� ������� ���������, � ��������� ���������� �������
			if(i<word.length()-1 && ts.contains(word.charAt(i)) && sg.contains(word.charAt(i+1))){
				System.out.println("������");	
				z = word.charAt(i)+"�";
				sounds.add(z);	
				//����� ���������� ����� �� ��� �����
			}else{
				z = ""+word.charAt(i);
				sounds.add(z);	
			}
		//System.out.println(sounds.get(i));			
		}
		
		//��������� ������ ���� ��������� �� ����� "�������-��������"
		for(int i=0; i< sounds.size(); i++){
			fi.add(vg.get(sounds.get(i)));
			System.out.println(fi.get(i));
		}
		
		//��������� ������ ������ ���������
		for(int i=0; i< sounds.size(); i++){
			//��������� �������
			if(word.charAt(i+1)=='*'){
				String gud = word.charAt(i)+"�";
				pi.add(p.get(gud));
			}else
			//����������
			pi.add(p.get(sounds.get(i)));
			System.out.println(pi.get(i));
		}
		
	double pm=0;
	//������� ������������ �������
	System.out.println("������������ �������");
	for(int i=0; i< sounds.size(); i++){
		if(pm<pi.get(i)){
		pm=pi.get(i);
		}
	}
	System.out.println(pm);
	
	ArrayList<Double> pmpi = new ArrayList<>();
	//������� ��������� ������
	System.out.println("��������� ������");
	for(int i=0; i< sounds.size(); i++){
		pmpi.add(pm/pi.get(i));
		System.out.println(pmpi.get(i));
	}
	
	//������� ������������ ki � �� �����
	System.out.println("������������");
	double sumKi=0;
	for(int i=0; i< sounds.size(); i++){
		//������ ���� *4
		if(i==0){
			ki.add(pmpi.get(i)*4);
		}
		//������� ���� *2
		else if(word.charAt(i+1)=='*'){
			ki.add(pmpi.get(i)*2);
		}else{
			ki.add(pmpi.get(i));
		}
		sumKi+=ki.get(i);
		System.out.println(ki.get(i));
	}
	System.out.println("����� ������������� "+sumKi);
	
	//������� ������������ fiki
	ArrayList<Double> fiki = new ArrayList<>();
	double sumFiKi=0;
	for(int i=0; i< sounds.size(); i++){
		fiki.add(ki.get(i)*fi.get(i));
		sumFiKi+=fiki.get(i);
	}
	System.out.println("����� ������������ "+sumFiKi);
	
	//����������������� ����� ����� �� ����� "�������-��������"
	 fs = sumFiKi/sumKi;
	System.out.println("����������������� ����� ����� �� ����� \"�������-��������\" ");
	System.out.format("%f%n", fs);
	 if (fs <= 2.5){		 
		 System.out.println("����� " + word + " ������");
	 }
	 else if (fs >= 3.5){
		 System.out.println("����� " + word + " ��������");
	 }
	 else{
		 System.out.println("����� " + word + " �����������");
	 }
}
}

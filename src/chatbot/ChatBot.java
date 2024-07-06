package chatbot;


public class ChatBot {
	
	final String[] COMMON = {
			"��, ����� ����",
			"����� �������� �����",
			"��������, ��� ��-�� ������",
			"�������",
			"��� �������, � ��� �������"
			};
	
	//TODO ����������� DONE
	final String[] FOR_ASK= {
			"� ������ ��������",
			"������, � �� ��������� ������",
			"�� ����� ������ ����� ���",
			"������ ����� � Google"
	};
	
	final String[] FUNNY = {
			"�� ��, ��� ������",
			"���������������������",
			"����, ��� ������?",
			"� ������� ������",
			"������� �������"
	};
	
	final String[] AFUNNY = {
			"����� �������� � ����� ��������",
			"����-����",
			"�� ������",
			"����� ��� ��������",
			"������ �����"
	};
	
	String getAnswer(String user, double fs) {
		int rand = (int)(Math.random() * (COMMON.length-1));
		
		//������� �� �������� �����
		if (user.contains("������")) {
			return "������ - ���� ����� �����";
		}
		if (user.contains("������")) {
			return "������ - ��� ������ ����� (������� ����� ���������)";
		}
		if (user.contains("������")) {
			return "��������� � ���������� �����";
		}
		if (user.contains("�����") || user.contains("������") || user.contains("������") || user.contains("������")) {
			return "����� ���� ����� � ����� ������� �����?";
		}
		if (user.contains("���-��") || user.contains("�����������") || user.contains("�����")) {
			return "������ ���� �� ���-�� �����";
		}
		if (user.contains("������") || user.contains("����")) {
			return "��� ���� �������";
		}
		if (user.contains("���") || user.contains("���")) {
			return "��� ����� ������ 1000%";
		}
					
		//����� ������������ �� ������
			if (fs < 2.5) {
				return FUNNY[(int)(Math.random() *( FUNNY.length-1))];
			}
			else if (fs > 3.5) {
				return AFUNNY[(int)(Math.random() * ( AFUNNY.length-1))];
			}
			else {
				return COMMON[rand];
			}
		}
		
		}


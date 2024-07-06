package chatbot;


public class ChatBot {
	
	final String[] COMMON = {
			"да, такие дела",
			"жизнь странная штука",
			"наверное, это из-за погоды",
			"понимаю",
			"все пройдет, и это пройдет"
			};
	
	//TODO разобраться DONE
	final String[] FOR_ASK= {
			"я должен подумать",
			"извини, я не расслышал вопрос",
			"ты точно хочешь знать это",
			"спроси лучше у Google"
	};
	
	final String[] FUNNY = {
			"да уж, это весело",
			"аххахаххахахахаххахах",
			"тебе, что весело?",
			"и вправду весело",
			"приятно слышать"
	};
	
	final String[] AFUNNY = {
			"зачем говорить о столь грустном",
			"плак-плак",
			"не грусти",
			"зачем так печально",
			"такова жизнь"
	};
	
	String getAnswer(String user, double fs) {
		int rand = (int)(Math.random() * (COMMON.length-1));
		
		//реакция на ключевые слова
		if (user.contains("дружба")) {
			return "дружба - всем такое нужно";
		}
		if (user.contains("любовь")) {
			return "любовь - это эгоизм вдвоём (Большая Книга Афоризмов)";
		}
		if (user.contains("погода")) {
			return "солнечная с элементами дождя";
		}
		if (user.contains("школа") || user.contains("шарага") || user.contains("универ") || user.contains("работа")) {
			return "зачем тебе знать о столь ужасном месте?";
		}
		if (user.contains("физ-ра") || user.contains("физкультура") || user.contains("физра")) {
			return "охапку дров на физ-ру готов";
		}
		if (user.contains("привет") || user.contains("дела")) {
			return "рад тебя слышать";
		}
		if (user.contains("егэ") || user.contains("огэ")) {
			return "все будет хорошо 1000%";
		}
					
		//общее реагирование на эмоции
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


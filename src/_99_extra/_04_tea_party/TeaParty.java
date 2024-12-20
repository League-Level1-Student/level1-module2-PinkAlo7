package _99_extra._04_tea_party;

public class TeaParty {
	public String welcome(String name, boolean isWoman, boolean isWeirdo) {

		String greeting = "Hello ";
		
		
		if(isWeirdo == true) {
			greeting+="weird ";
		}
	
	
		if(isWoman == true) {
		greeting+="Ms. ";
		}
	
	
		else {
			greeting+="Mr. ";
		}




		return greeting+=name;	


	}
}



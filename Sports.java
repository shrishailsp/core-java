class Sports {
    
	static String topTenCricketBatsman[] = {"mahandarSingh Dhoni","virat kohli","rohit sharma","haedik pandya","KL rahul","rishab pant","ashwin","ravander jadeja",
	    "MD siraj","jaspreet bumbra",};
		static String topTenCricketTeams[] ={"INDIA","Austrilya","West indies","SriLanka","Newzeland","England","Irland","Afganistan","pakistan","Bangaldesh",};
		static String topHockeyTeams[] ={"INDIA","Australya","Belgim","Netherland","Germany","England","argentina","Spain","Newzeland","malaysia",};
		static String topTenTennisPlayers[] ={"lvan lendi","jimmy connors","john mcenror","rod laver","bjorn borg","pete sampras","novack djokovic",
		  "rafael nadal","roger federer",};
		  static String topTenCricketBowlers[] ={"Ravichandran Ashwin","ravindra jadeja","jaspreet bumbra","yuzi chahal","MD shami","bhuvainashwar kumar",
		  "aasish nehra","kapil dev","harbajan singh","umesh yadav",};
		     public static void main (String SportsMania[]){
				 System.out.println("Main started");
				    
					System.out.println("topTenCricketBatsman are");
					System.out.println(topTenCricketBatsman.length);
					for(int bat=0;bat<topTenCricketBatsman.length;bat++)
					{
						System.out.println(topTenCricketBatsman[bat]);
						
					}
					System.out.println("Main ended");
			 }
}
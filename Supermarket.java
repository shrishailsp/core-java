class Supermarket{

static String chocolate[]={"cadbury","dairymilk","milkeybar","snikkers","neslay","mintos","5star","galaxy","centerfresh","parle","kissme","mangobyte","laktoking","campko","kises"};
    
static String vegitabal[]={"carret","petato","tomato","onion","cabbage","coliflower","betroot","ladyFinger","garlic","brinjol","capsicam","chilli","haagalakaye","cavalikai","hireykai"};
     
static String softDrinks[]={"cocacola","pepsi","string","thumpsup","hell","monster","limca","tropicana","slice","maagga","primr","bindu","fanta","mirinda"};
	 
static String snacks[]={"layz","bingo","kurkurai","tooyum","saltedpenuts","kattamitta","alloBhujiya","ratlamsew","doritos","oreo","cheetos","pringals","papad","popcorn","bananaChips","tortillaChips"};
	  
static String soaps[]={"dove","pears","lifebouy","mysoreSandal","cintol","dettol","santoor","hamam","medimex","himalaya","liril","jonson","patanjali","nivya","lux","venus","fiama","vivel"};
   
static String biscuits[]={"parle-G","hide&seek","UNIBIC","sunfeast","milano","keackjack","monaco","goodday","oreo","marilite","tiger","marieGold","5050","chaskamaska","darkfantaci"};
 
static  String purfume[]={"fogg","denver","parkavinue","KS","villan","skinn","beelavita","Engage","yadley","beardo","envy","he","axe","wildstone","isak"};

static String masalas[]={"chickenSmasala","sabjiMasala","cholaymasala","garamMasala","chatMasala","pannermasaa","eggmasala","muttanMasala","biryanimasala","teamasala","chudaMasala","chakalimasala","chanaMasala","kichankingMasala"};

static String dalls[]={"chanadal","moongdal","udaddal","toordal","moosurdal","motedal","moong","mote","loba","chana","kabulichana","akkamasur","toor","avarikal","rajmaa","udad"};

static String dairyItem[]={"Milk","curd","chees","ghee","butter","buttermilk","lassi","shreekhand","amarkhand","milkshake","chocolatemilkshake","peada","kunda","burfi","milkcake"};

	  

   public static void main(String args[]){
	   System.out.println("main started");
	   getchoclate();
	   getvegitabal();
	   getsoftDrins();
	   getsnacks();
	   getsoaps();
	   getbiscuits();
	   getpurfume();
	   getmasalas();
	   getdalls();
	   getdairyItem();
	   
	   System.out.println("main ended");
   }

    public static void getchoclate(){
		
		System.out.println("the collection of chockleats are");
		System.out.println(chocolate.length);
		for(int cho=0;cho<chocolate.length;cho++){
			System.out.println(chocolate[cho]);
		
	}
	
System.out.println("------------------------------------------");
   
   for(int cho=chocolate.length-1;cho>=0;cho--){
	   System.out.println(chocolate[cho]);
   }
	}
     

 
     public static void getvegitabal(){
		
		System.out.println("the collection of vegitables are");
		System.out.println(vegitabal.length);
		
	 for(int veg=0;veg<vegitabal.length;veg++){
		 System.out.println(vegitabal[veg]);
	 }
System.out.println("------------------------------------------");
   
	for(int veg=vegitabal.length-1;veg>=0;veg--){
		System.out.println(vegitabal[veg]);
	} 
	 
 }
 

 
 
 public static void getsoftDrins(){
	 
	 System.out.println("the collection of SoftDrinks  are");
		System.out.println(softDrinks.length);
	 
	 for(int soft=0;soft<softDrinks.length;soft++){
		 
		System.out.println(softDrinks[soft]);
	 }
	 
System.out.println("--------------------------------------------------------------");
 
 for(int soft=softDrinks.length-1;soft>=0;soft--){
		System.out.println(softDrinks[soft]);
	} 
 }


 
 
 public static void  getsnacks(){
	 
	 System.out.println("the collection snacks  are");
		System.out.println(snacks.length);
	 
	 for(int sn=0;sn<snacks.length;sn++){
		 
		System.out.println(snacks[sn]);
	 }
	 
System.out.println("--------------------------------------------------------------");
 
 for(int sn=snacks.length-1;sn>=0;sn--){
		System.out.println(snacks[sn]);
	} 
 }
 
  public static void getsoaps(){
		
		System.out.println("the collection of soaps  are");
		System.out.println(soaps.length);
		for(int so=0;so<soaps.length;so++){
			System.out.println(soaps[so]);
		
	}
System.out.println("------------------------------------------");
   
   for(int so=soaps.length-1;so>=0;so--){
	   System.out.println(soaps[so]);
   }
 
  }

 
  
	
 
  public static void getbiscuits(){
		
		System.out.println("the collection of biscuits  are");
		System.out.println(biscuits.length);
		for(int bis=0;bis<biscuits.length;bis++){
			System.out.println(biscuits[bis]);
		
	}
System.out.println("------------------------------------------");
   
   for(int bis=biscuits.length-1;bis>=0;bis--){
	   System.out.println(biscuits[bis]);
   }
 
  }
 
 
 
 
 
  public static void getpurfume(){
		
		System.out.println("the collection of purfume are");
		System.out.println(purfume.length);
		for(int pur=0;pur<purfume.length;pur++){
			System.out.println(purfume[pur]);
		
	}
System.out.println("------------------------------------------");
   
   for(int pur=purfume.length-1;pur>=0;pur--){
	   System.out.println(purfume[pur]);
   }
  }
 
  
 
 
 
  public static void getmasalas(){
		
		System.out.println("the collection of Masalas are");
		System.out.println(masalas.length);
		for(int mas=0;mas<masalas.length;mas++){
			System.out.println(masalas[mas]);
		
	}
System.out.println("------------------------------------------");
   
   for(int mas=masalas.length-1;mas>=0;mas--){
	   System.out.println(masalas[mas]);
   }
  }



 
  public static void getdalls(){
		System.out.println("the collection of Dalls are");
		System.out.println(dalls.length);
		for(int da=0;da<dalls.length;da++){
			System.out.println(dalls[da]);
		
	}
System.out.println("------------------------------------------");
   
   for(int da=dalls.length-1;da>=0;da--){
	   System.out.println(dalls[da]);
   }
  }

 
 
 
  public static void getdairyItem(){
		
		System.out.println("the collection of Dairyitem are");
		System.out.println(dairyItem.length);
		for(int milk=0;milk<dairyItem.length;milk++){
			System.out.println(dairyItem[milk]);
		
	}
System.out.println("------------------------------------------");
   
   for(int milk=dairyItem.length-1;milk>=0;milk--){
	   System.out.println(dairyItem[milk]);
   }
  }



}
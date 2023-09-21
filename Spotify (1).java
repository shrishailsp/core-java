class Spotify{

     String songNames[] = new String [10];
	 int index;
	 
	 public boolean addSongs(String songName){
	        boolean isAdded = false;
			
			if(index<songNames.length){
			 boolean exists =duplicateValue(songName);
			 if(exists==false){
			 if( songName != null){
			   songNames[index] = songName;
			   index++;
			   }else{System.out.println("Null values are not allowed");}
			}
			}
			else{System.out.println("List is full...");}
			return isAdded;
	     }
	 
	 public void getDetails(){
	 System.out.println("The Songs in the list are : ");
	     for(index = 0; index < songNames.length ; index++){
		 System.out.println(songNames[index]+ " is added to the playlist");
		}
		
	   
	 }
	 public boolean duplicateValue(String songName){
		 boolean exists=false;
		 for( String value:songNames){
 
			 if(songName == value){
				 System.out.println("The Value is already present");
				 exists=true;
			 }
		 }
		 return exists;
		 
		
	 }
	 public String search(String name){
		 for(String value:songNames){
			 if(value==name){
				 System.out.println("The song is present the list");
				 System.out.println(value);
				 return value;
				 
			 }
		 }
		 return null;
	 }
	 
	 String afterDelete[];
	 public boolean delete(String name){
		 boolean isDeleted=false;
		 
		 int count=0;
		 int ind =0;
		 for(String songsList:songNames){
		  if(songsList!=name){
			  count++;
		  }
	  }
		  afterDelete=new String[count];
		  
		  
		  for(int i=0;i<songNames.length;i++){
			  if(songNames[i]!=name){
				 afterDelete[ind++]=songNames[i];
				 isDeleted=true;
			  }
		  }
		  return isDeleted;
		 
	 }  
	 public void deletedList(){
		 for(String afterDeleteList:afterDelete){
			  System.out.println(afterDeleteList);
			  } 
	 }
	
}
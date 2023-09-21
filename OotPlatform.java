class OotPlatform{

	String movieName[]=new String[5];
	//String movieNameAfterDelete[]=new String[movieName.length-1];
	int index;
	
	public boolean addMovieName(String name){
		//System.out.println();
		boolean isAdded =false;
		
		
		if(movieName.length>index)
		{
			if(movieName != null){
			boolean exists=checkMovie(name);
			if(exists==false){
				movieName[index]=name;
				index ++;
				isAdded=true;
				}
				else{
				System.out.println(name+" Already exists");
			}
			}
			}else{System.out.println("Array Index Out Of BoundsException:"+movieName.length);}
		return isAdded;
	}
	public boolean checkMovie(String name){
		boolean exists=false;
		//System.out.println("inside checking ");
		for(int index=0;index< movieName.length;index++){
			if(movieName[index]==name){
				exists=true;
			}
		}
		return exists;
	}
	
	public boolean deleteMovieNames(String name){
		boolean isDeleted =false;
		String movieNameAfterDelete[]=new String[movieName.length-1];
		int ind=0;
		for(int index=0;index<movieName.length;index++){
			if(movieName[index]!=name){
				movieNameAfterDelete[ind++]=movieName[index];
				isDeleted=true;
			}
		}
		System.out.println("the deleted movie : "+name);
		System.out.println("Updated  of movies list:");
		for(int index=0;index< movieNameAfterDelete.length;index++){
			System.out.println(movieNameAfterDelete[index]);
			
		}
		return isDeleted;
	}
	
	/*public void getDisplayAfter(){
		System.out.println("Updated  of movies list:");
		for(int index=0;index< movieNameAfterDelete.length;index++){
			System.out.println(movieNameAfterDelete[index]);
			
		}	
	}*/
	
	
	public String searchMovie(String name){
		String exists=null;
		//System.out.println("inside checking ");
		for(int index=0;index< movieName.length;index++){
			if(movieName[index]==name){
				exists=movieName[index];
			}
		
		}
		return exists;
	}
	
	
	public void getDisplay(){
		System.out.println("list of movies:");
		for(int index=0;index< movieName.length;index++){
			System.out.println(movieName[index]);
			
		}	
	}	
}
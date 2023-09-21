class ottPlatformExicouter{

public static void main(String[] ottp){
		
		Hotstar ott=new Hotstar();
		
		ott.addMovieName("RRR");
		ott.addMovieName("KGF");
		ott.addMovieName("KGF 2");
		ott.addMovieName("PUSHPA");
		ott.addMovieName("Kantara");
		ott.getDisplay();
		String a=ott.searchMovie("RRR");
		System.out.println("Serched  Movie "+a);
		boolean delete=ott.deleteMovieNames("RRR");
		//System.out.println("Deleted movie"+delete);
		//ott.getDisplayAfter();
		
	}
}
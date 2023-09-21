class SpotExe{

     public static void main (String args[]){
	 
	  MyMusic mm = new MyMusic();
	  mm.addSongs("Kai Kahele Kannada Kali");
	  mm.addSongs("Ninna Nodalentho");
	  mm.addSongs("Hukum");
	  mm.addSongs("Toofan");
	  mm.addSongs("Sulthana");
	  mm.addSongs("Pailwan");
	  mm.addSongs("Gaja");
	  mm.addSongs("Tum Hi Ho");
	   mm.addSongs("Suyodhana");
	  mm.addSongs("Dheera");
	  
	 // mm.getDetails();
	 // mm.search("Dheera");
	   mm.delete("Gaja");
	   mm.deletedList();
	 }
}	 
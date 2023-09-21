class ChatExicouter{

public static void main(String[]args){

Chat ch=new Chat();
ch.addChatName("panipure");
ch.addChatName("vadapaw");
ch.addChatName("bhalpuri");
ch.addChatName("kachori");
ch.addChatName("ragada");

ch.getchatList();

boolean deleat=ch.deleteByName("kachori");
System.out.println(deleat);
}

}
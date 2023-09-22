class ApplicalionExicouter{

public static void main(){

Applicalion app=new Applicalion();

app.setName("phonepe");


PlayStore store =new PlayStore();
store.application=app;
store.managedBy ="google";

System.out.println(store.application.getName());
}

}
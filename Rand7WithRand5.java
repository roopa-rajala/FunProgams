class Rand7{
public int rand7(){
int sum=0;
do{
sum=5*rand5()+rand5();
}while(sum>20);
return sum%7;
}
public static void main(String args[]){
Rand7 obj=new Rand7();
System.out.println(obj.rand7());
}
}

public class Holiday{
private String name;
private int day;
private String month;

public Holiday(String a,int b,String c){
name=a;
day=b;
month=c;
}

public static inSameMonth(){


public String getMonth(){
return month;
public boolean equals(inSameMonth other){
if(other.getMonth().equals(this.getMonth())){
if(other.getMonth()!=this.getMOnth()){
return false;
}
else{
 return true;
}
}
}
}
}
public static double avgDate(Holiday[] excuse){
int sum = 0;
for(int i = 0;i<excuse.length;i++){
sum = sum + excuse(i).day;
}
return((double)sum)/excuse.length;
}
Holiday excuse = new Holiday(“Independence Day”, 4, “July”);
}


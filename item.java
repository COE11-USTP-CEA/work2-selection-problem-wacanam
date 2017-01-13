class item{
	String name;
	String cname;
	Float price;

public void Setname(String n){
	name = n;
	}
public void Setcname(String c){
	cname = c;
	}
public void Setprice(float p){
	price = p;
	}
public String Getname(){
	return name;
	}
public String Getcname(){
	return cname;
	}
public float Getprice(){
	return price;
}
public item(String n, String c, float p){
	name = n;
	cname = c;
	price = p;
}
}
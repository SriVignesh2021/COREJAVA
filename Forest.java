class Forest{

String name="AMAZON";
String location="NEWYORK";
Reserved reserved;
State state;

Forest(String name,String location)
{
this.name=name;
this.location=location;
}


Forest(Reserved reserved,State state)
{
this.reserved=reserved;
this.state=state;
}


Forest()
{

}

}
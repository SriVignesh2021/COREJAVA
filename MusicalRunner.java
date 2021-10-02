class MusicRunner{
public static void main(String[] args){

MusicType type=MusicType.WESTERN;
String[] instruments={"TABLA","GUITAR","PEON"};

Music music=new Music(type,instruments);
music.MusicalDirector="VIGNESH";

System.out.println(music.type);
System.out.println(music.MusicalDirector);
System.out.println(music.price);
System.out.println(music.instruments);


Music music1=new Music(type,instruments);
music.MusicalDirector="VIGNESH";

System.out.println(music.type);
System.out.println(music.MusicalDirector);
System.out.println(music.price);
System.out.println(music.instruments);



}


}
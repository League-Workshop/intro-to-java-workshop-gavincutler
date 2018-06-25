PImage mustache;
  PImage friend;
void setup(){
friend = loadImage("shrek.jpg");
  size(600,368);
  friend.resize(600,368);
  mustache = loadImage("mustache.png");
}
void draw(){
  background(friend);
  if(mousePressed){
    image(mustache,mouseX,mouseY);
    mustache.resize(250,100);
  }
}
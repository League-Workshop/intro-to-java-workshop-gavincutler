PImage rainbow;
PImage unicorn;
void setup() {
  rainbow = loadImage("rainbow.jpg");
  unicorn = loadImage("unicorn.png");
  size(900, 900);

  rainbow.resize(900, 900);
}
void draw() {
  background(rainbow);
  image (unicorn, mouseX,mouseY);
}
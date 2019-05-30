void setup(){

size(800,800);
noFill();
 }
 int x1 = 700;
 int x2 = 100;
 int speed1 = -1;
 int speed2 = 1;
 
 void draw(){
 background(255);  
 for (int circle = 0; circle<200; circle+=10){
ellipse(x1,400,circle,circle);
 }
for (int circle2 = 0; circle2<200; circle2+=10){
ellipse(x2,400,circle2,circle2);
}
 x1 +=speed1;
 x2 +=speed2;
if( x2 == 700){
 speed2 = -speed2; 
}
if(x1 == 701){
speed1 = -speed1;

}
if(x2 <= 100){
  speed2 = -speed2;
}
if(x1 <= 100){
  speed1 = -speed1;
}
 }
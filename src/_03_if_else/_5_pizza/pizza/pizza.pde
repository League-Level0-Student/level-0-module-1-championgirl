PImage pepperoni;
PImage olive;
void setup() {
    size(500,500);
    
    fill(#D3C053);
ellipse(240,200,300 ,300 );

    fill(#EA002B);
ellipse(240,200,250 ,250 );

fill(#F4F514);
ellipse(240,200,200 ,200 );


pepperoni = loadImage("pepperoni.gif");
olive = loadImage("olive.jpg");
pepperoni.resize(30, 30);
olive.resize(30,30);

}
void draw() {
    
    
if (mousePressed && (mouseButton == RIGHT)) {image(olive, 200, 140);}
if (mousePressed && (mouseButton == LEFT)) {image(pepperoni, 160, 140);
    }

}

 

int diam = 10;
float centX, centY;

void setup() {
  size(500, 300);
  frameRate(24);
  
  smooth();
  background(180);
  centX = width/2;
  centY = height/2;
  stroke(0);
  strokeWeight(5);
  fill(72, 50);
}

void draw() {
  if (diam <= 400) {
    background(180);
    
    strokeWeight(5);
    fill(21, 50);
    ellipse(centX, centY, diam, diam);
    
   
    
    int tempdiam = diam;
    while (tempdiam > 10) {
      ellipse(centX, centY, tempdiam, tempdiam);
    tempdiam -= 10;
  }
    
    diam += 10;
  }
}

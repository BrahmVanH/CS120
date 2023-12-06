// package org.final_project.components;

// import java.io.File;
// import java.net.*;
// import javafx.scene.image.*;
// import javafx.animation.*;
// import javafx.scene.*;
// import javafx.scene.shape.*;
// import javafx.util.Duration;
// import javafx.scene.paint.*;

// public class Dog extends Group {
//   private Image dogTreatImg;
//   private double biscuitWidth = 50;
//   private double biscuitHeight = 70;
//   String[] itemsArr = { "dogTreat" };

//   private ImageView getItemImgView(String itemString) {
//     String imagePath = "/image/odin_temp_png.png";
//     URL imageUrl = getClass().getResource(imagePath);

//     if (imageUrl != null) {
//       Image image = new Image(imageUrl.toExternalForm());
//       System.out.println(image);
//       System.out.println(imagePath);
//       System.out.println(imageUrl);

//       return new ImageView(image);
//     } else {
//       System.out.println("Image not found: " + imagePath);
//       return null;
//     }
//   }

//   public RandomItem() {
//     int rand = (int) Math.floor((Math.random() * itemsArr.length));
//     String randomItemString = itemsArr[rand];
//     ImageView randomItemImg = getItemImgView(randomItemString);
//     randomItemImg.setFitWidth(biscuitWidth);
//     randomItemImg.setFitHeight(biscuitHeight);
//     Rectangle rect = new Rectangle();
//     rect.setWidth(100);
//     rect.setHeight(50);
//     // randomItemImg.setTranslateX(400);
//     // randomItemImg.setTranslateY(300);
//     this.getChildren().add(rect);
//     this.getChildren().add(randomItemImg);

//   }
// }

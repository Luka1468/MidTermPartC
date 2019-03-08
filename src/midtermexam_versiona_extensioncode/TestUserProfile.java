/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author gunar
 */
public class TestUserProfile {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Please print your name");
    String name=scan.nextLine();
    System.out.println("Please enter an int and choose your favorite genre");
    boolean flag=true;
    String favGenre;
    do{
    int favGenreint=scan.nextInt();
    switch(favGenreint) {
  case 1:
      favGenre="Country";
      System.out.println("your Profile has been created");
      flag=false;
    break;
  case 2:
    favGenre="Rock";
    System.out.println("your Profile has been created");
    flag=false;
    break;
    case 3:
    favGenre="Pop";
    System.out.println("your Profile has been created");
    flag=false;
    break;
  default:
System.out.println("your number is not in the range given, please try again");
}
    }while(flag);
    
    
    
    }
    
}

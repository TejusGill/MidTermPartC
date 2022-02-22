/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author gillt
 */
public class TestUserProfile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        UserProfile user1 = new UserProfile("","");
        Scanner scanner = new Scanner(System.in );
        System.out.println("Enter UserId:");
        String user = scanner.nextLine();
        
        
        System.out.println("Choose a Genre from the following list:");
        System.out.println("Genres are:");
        for(int i=0; i< user1.genres.length ; i++){
            System.out.println((i+1)+ ")" + user1.genres[i]);
        
    }
        System.out.println("Choose your Genre:");
        String genre = scanner.nextLine();
        System.out.println("");
        System.out.println("User Profile created:");
        System.out.println("User Name: " + user);
        System.out.println("Genre selected" + genre);
    
}
}

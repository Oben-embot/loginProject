import java.util.Scanner;
class Person {
Person () {}
public static void main (String [] args) {
Scanner scan = new Scanner (System.in);
for(int userAttempts = 0; userAttempts < 3; userAttempts++) {
System.out.print ("Enter your password:");
String password = "123#!";
String pass = scan.nextLine ();
System.out.print ("Enter your username:");
String username = "admin";
String user = scan.nextLine ();
if(userAttempts == 2) {
}
if(username.equals(user) && password.equals(pass)) {
System.out.println("login successful");
userAttempts = userAttempts + 5;
}
else {
System.out.println("Incorrect username or password; Try again you have " + (3 - userAttempts) +" more trails");
}
for(int i = 2;  i == userAttempts; i++) {
System.out.println("your account has been blocked");
}
}
}
}


import java.io.*;
import java.util.Scanner;
import java.io.IOException;


public class SEW {
    Scanner sc = new Scanner(System.in);

    public void filewritter(String filename) {
        try {
            String file;
            FileWriter fr = new FileWriter(filename);
            System.out.println("write your note");
            System.out.println("PLEASE DON'T FORGET TO ENTER TAB KEY PLUS ENTER WHEN YOU FINISH YOUR WRITING");
            sc.useDelimiter("\\t");
            while (true) {
                file = sc.next();
                break;
            }
            fr.write(file);
            System.out.println("File writting completed");
            fr.close();
        } catch (IOException fn) {
            System.out.println(fn.getMessage());
        }
    }

    public void filedelete(String filepath) {
        try {
            File f = new File(filepath); //file to be delete
            if (f.delete()) //returns Boolean value
            {
                System.out.println("File " + f.getName() + " is deleted");
                //getting and printing the file name
            } else {
                System.out.println("Delete operation failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void filereader(String filename) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String sf;
            StringBuffer sb = new StringBuffer("");
            sf = br.readLine();
            while (sf != null) {
                sb.append(sf + "\n");
                sf = br.readLine();
            }
            br.close();
            System.out.println(sb);
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }

    }
    public void addtoexistingnote(String filename){
        try {
            String file;
            FileWriter fr = new FileWriter(filename,true);
            System.out.println("write your note to be added");
            System.out.println("PLEASE DON'T FORGET TO ENTER TAB KEY PLUS ENTER WHEN YOU FINISH YOUR WRITING");
            sc.useDelimiter("\\t");
            while (true) {
                file = sc.next();
                break;
            }
            fr.write(file);
            System.out.println("Updating  completed");
            fr.close();
        } catch (
                IOException fn) {
            System.out.println(fn.getMessage());
        }
    }

    public static void main(String[] args) {
        SEW rwf = new SEW();
        Scanner sc = new Scanner(System.in);
        char rep;
        String wfilename, newfilename, filepath1, filepath2, filepath3, rfilename, rnewfilename;
        int choice;
        do {
            System.out.println("=================HOME================= ");
            System.out.println("Enter '1' to create new Note ");
            System.out.println("Enter '2' to open Existing  Note ");
            System.out.println("Enter '3' to delete Existing  Note ");
            System.out.println("Enter '4' to add text Existing  Note ");
            System.out.println("PLEASE insert choice of your operation");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Please Enter the name of the new text file");
                    wfilename = sc.next();
                    System.out.println("File has been created successfully on Documents");
                    newfilename = "C:\\Users\\hp\\Documents\\" + wfilename + ".txt";
                    rwf.filewritter(newfilename);

                    break;
                case 2:
                    System.out.println("Please Enter the name of text file ,You want to open");
                    rfilename = sc.next();
                    rnewfilename = rfilename + ".txt";
                    rwf.filereader(rnewfilename);
                    break;
                case 3:
                    String filepath;
                    String filename;
                    System.out.println("Enter the the name text you want to delete");
                    filename = sc.next();
                    filepath = "C:\\Users\\hp\\Documents\\" + filename + ".txt";
                    rwf.filedelete(filepath);
                    break;
                case 4:
                    String nfilepath,nfilename;
                    System.out.println("Enter the the name of text file you want to add yuo new text");
                    nfilename= sc.next();
                    filepath = "C:\\Users\\hp\\Documents\\" + nfilename + ".txt";
                    rwf.addtoexistingnote(filepath);
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
            System.out.println("press 'y' to continue");
            rep = sc.next().charAt(0);
        } while (rep == 'y'||rep=='Y');
    }
}


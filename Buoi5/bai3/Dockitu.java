package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Dockitu {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập kí tự bắt đầu thứ n: ");
		int n = sc.nextInt();
		System.out.print("Nhập kí tự kết thúc m: ");
		int m = sc.nextInt();

		FileReader fr = new FileReader("student.txt");        
		String content ="";
		int i;
        while ((i = fr.read()) != -1) {
        	content += String.valueOf((char) i);
            
        }
        if(m> content.length()) {
    		System.out.println("không có kí tự thứ m");
        }
        else {
        	System.out.println(content.substring(n,m));
        }
    }
}
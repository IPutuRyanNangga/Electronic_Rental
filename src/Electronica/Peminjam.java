/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Electronica;
import java.util.ArrayList;
/**
 *
 * @author Administrator
 */
public class Peminjam extends Costumer {
    String nim;
        ArrayList barang;
        ArrayList<Barang> barangObj=new ArrayList<>();
        public Peminjam(String nim,  String name) {
            this.nim = nim;
            this.name = name;
            this.barang = new ArrayList();
        }
        public String getNim(){
            return this.nim;
        }
        public String getName(){
            return this.name;
        }
        public void printStudentDetails() {
            System.out.println("NIM: " + nim);
            System.out.println("Name: " + name);
        }
          // Method to get the courses of the student
        public ArrayList getBooks() {
            return barang;
        }
        // Method to add a course to the student's course list
        public void addBook(String book) {
            barang.add(book);
        }
        
         public void addBookObj(Barang barang){
            barangObj.add(barang);
        }
        public String getBooksObj(){
            String struct="Student Name: " + name+"\n";
            for (Barang item : barangObj) {
                struct+="Book Code "+ item.code+ ", Book Name "+item.bookName+"\n";
            }
            return struct;
        }

}


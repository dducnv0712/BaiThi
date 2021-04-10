package pactical;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        boolean flag = true;
        ArrayList<Customer> ds =  new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (flag){
            System.out.println("Vui long chon :");
            System.out.println("1. Them");
            System.out.println("2. Sua thong tin");
            System.out.println("3. Hien Thi Khach Hang");
            System.out.println("4. Exit");
            int c = sc.nextInt();
             if(c == 1){
                System.out.println("Nhap id:");
                Integer id = sc.nextInt();
                System.out.println("Nhap ten:");
                sc.nextLine();
                String fullName = sc.nextLine();
                System.out.println("Nhap So Dien Thoai:");
                Integer numberPhone = sc.nextInt();
                System.out.println("Nhap dia chi:");
                String Adress = sc.next();
                System.out.println("Nhap Ngay di :");
                String dateOD = sc.next();
                System.out.println("Nhap Ngay Về :");
                String datePQ = sc.next();

                ds.add(new Customer(id,fullName,numberPhone,Adress,dateOD,datePQ));
            }else if(c == 2){
                System.out.println("Nhap id sv muon sua thong tin:");
                int id = sc.nextInt();
                for(Customer s:ds){
                    if(s.getId()== id){
                        System.out.println("Nhap ten :");
                        String name = sc.nextLine();
                        s.setFullName(name);
                        System.out.println("Nhap Số dien Thoai:");
                        Integer age = sc.nextInt();
                        s.setNumberPhone(age);
                        System.out.println("Nhap dia chi:");
                        sc.nextLine();
                        s.setAdress(sc.next());
                        System.out.println("Nhap ngay di:");
                        s.setDateOD(sc.next());
                        System.out.println("Nhap ngay tro ve :");
                        s.setDateReturn(sc.next());
                        break;
                    }
                }
            }else if(c==3){
                for(Customer s:ds){
                    System.out.println(s.getId()+"\n"+s.getFullName()+"\n"+s.getNumberPhone()+"\n"+s.getDateOD()+"\n"+s.getDateReturn());
                }
             }else if (c ==4){
                     flag = false;
            }
                }
            }
        }

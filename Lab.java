/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorium;
import StafAkademik.*;
import java.util.Scanner;
/**
 *
 * @author Ardaha
 */
public class Lab {
    Scanner sc = new Scanner(System.in);
    Dosen[] dosenlab = new Dosen[100];
    Karyawan[] karyawanlab = new Karyawan[100];
    String nama;
            int countdos,countkar, jumlah[], juDos, juKar;
    public Lab(String nama){
        this.nama=nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void diTempati(Dosen dosenlab){
        this.dosenlab[countdos]=dosenlab;
        this.dosenlab[countdos].Menempati2(this);
        countdos++;
    }
    
    
    public void diTempati2(Dosen dosenlab){
        this.dosenlab[countdos]=dosenlab;
        countdos++;
    }
    
    
    public void bekerja2(Karyawan karyawanlab){
        this.karyawanlab[countkar]=karyawanlab;
        countkar++;
    }
    
    
    public void bekerja(Karyawan karyawanlab){
        this.karyawanlab[countkar]=karyawanlab;
        this.karyawanlab[countkar].Menempati2(this);
        countkar++;
    }
    public void soutEquals(){
        System.out.println("==========================================================");
    }
    public int chLab(){
        soutEquals();
        System.out.println("Pilihan lab: ");
        System.out.println("1. KCV          3. Game");
        System.out.println("2. Mobile       4. RPL");
        System.out.println("5. Robotik      6. Semua Lab");
        System.out.print("Pilih lab: ");
        int n = sc.nextInt();
        soutEquals();
        return n;
    }
    
    public void sumDosDanKar(Lab[] sd){
        int n=chLab();
        String lab[]=kd();
        String doskar="Dosen : ";
                    System.out.print("Jumlah dosen dan karyawan di"+lab[n-1]+"sebanyak ");
                    switch(n){
                        case 1: 
                            System.out.println(sd[0].countdos+sd[0].countkar);
                            System.out.println("Dosen\t\t: "+sd[0].countdos);
                            System.out.println("Karyawan\t: "+sd[0].countkar);
                            break;
                        case 2: System.out.println(sd[4].countdos+sd[4].countkar);
                            System.out.println("Dosen\t\t: "+sd[4].countdos);
                            System.out.println("Karyawan\t: "+sd[4].countkar);
                            break;
                        case 3: 
                            System.out.println(sd[3].countdos+sd[3].countkar);
                            System.out.println("Dosen\t\t: "+sd[3].countdos);
                            System.out.println("Karyawan\t: "+sd[3].countkar);
                            break;
                        case 4: System.out.println(sd[1].countdos+sd[1].countkar);
                            System.out.println("Dosen\t\t: "+sd[1].countdos);
                            System.out.println("Karyawan\t: "+sd[1].countkar); break;
                        case 5: System.out.println(sd[2].countdos+sd[2].countkar);
                            System.out.println("Dosen\t\t: "+sd[2].countdos);
                            System.out.println("Karyawan\t: "+sd[2].countkar); break;
                        case 6: System.out.println(sd[0].countdos+sd[0].countkar
                                +sd[1].countdos+sd[1].countkar
                                +sd[2].countdos+sd[2].countkar
                                +sd[3].countdos+sd[3].countkar
                                +sd[4].countdos+sd[4].countkar);
                            System.out.println("Dosen\t\t: "+(sd[0].countdos+sd[1].countdos+sd[2].countdos+sd[3].countdos+sd[4].countdos));
                            System.out.println("Karyawan\t: "+(sd[0].countkar+sd[1].countkar+sd[2].countkar+sd[3].countkar+sd[4].countkar)); break;
                        default: System.out.println("Pilihan tidak ada di menu"); break;
                    }
    }
    
    public void MuchandLess(Lab[] lab){
        System.out.println("Pilihan menu: ");
        System.out.println("1. Paling banyak");
        System.out.println("2. Paling sedikit");
        System.out.print("Pilih menu: ");
        int n=sc.nextInt();
        int much=lab[0].countdos+lab[0].countkar ,h=0,k=0,less=lab[0].countdos+lab[0].countkar,countmuch[]=new int[lab.length],countless[]=new int[lab.length];
        for(int i=0;i<lab.length;i++){
            if(lab[i].countdos+lab[i].countkar>much){
                much=lab[i].countdos+lab[i].countkar;
            }else if(lab[i].countdos+lab[i].countkar==much){
                countmuch[h]=i;
                h++;
            }
            
            if(lab[i].countdos+lab[i].countkar<less){
                less=lab[i].countdos+lab[i].countkar;
                countless[k]=i;
                k++;
            }else if(lab[i].countdos+lab[i].countkar==less){
                countless[k]=i;
                k++;
            }
        }
        int tmuch=0,tless=0;
        if(n==1){
            for (int i = 0; i < lab.length; i++) {
                if(countmuch[i]==0){
                    tmuch++;
                }
            }
            if(tmuch>1){
                System.out.println("Anggota lab paling banyak dengan total "+much+" orang");
                for(int i=0;i<lab.length;i++){
                    if(i>1 && countmuch[i]!=0){
                    System.out.println((i+1)+". "+lab[countmuch[i]].getNama());
                    }else if(i==0){
                    System.out.println((i+1)+". "+lab[countmuch[i]].getNama());
                        
                    }
                }
            }else{
                System.out.println("Anggota lab paling banyak ialah lab "+lab[countmuch[0]].getNama()+" sebanyak: "+much+" orang");
            }
            
        }else if(n==2){
            
            for (int i = 0; i < lab.length; i++) {
                if(countless[i]==0){
                    tless++;
                }
            }
            if(tless>1){
                System.out.println("Anggota lab paling sedikit dengan total "+less+" orang");
                for(int i=0,g=0;i<lab.length;i++){
                    if(tless>1 && countless[i]!=0){
                    System.out.println((g+1)+". "+lab[countless[i]].getNama());
                    g++;
                    }
                }
            }else{
                System.out.println("Anggota lab paling banyak ialah lab "+lab[countless[0]].getNama()+" sebanyak: "+less+" orang");
            }
            
        }else{
            System.out.println("Tidak ada pilihan di menu");
        }
    }
    
    public String[] kd(){
                    String[] prod={" KCV "," Mobile "," Game "," RPL "," Robotik "," Semua lab "};
    return prod;
    }
}

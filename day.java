public class thr { 
public static void main(String[] args) { 
 
System.out.println("N1"); 
Thread FirstThread = new FirstThread(); 
FirstThread.start(); 
try { 
FirstThread.join(); 
FirstThread.interrupt(); 
} catch (InterruptedException e) { 
e.printStackTrace(); 
} 
  
System.out.println("N2"); 
Thread secondThread = new SecondThread(); 


secondThread.start(); 


} 
} 
class FirstThread extends Thread{ 
int sum ; 
public void run(){ 
for (int i = 0; i <= 100; i++) 
{ sum+=i; 
} 
System.out.println(sum); 
} 

} 
class SecondThread extends Thread { 
public void run(){ 

Thread thirdThread = new ThirdThread(); 
thirdThread.start(); 
for (int i = 0; i <=20 ; i++) { 
System.out.println("Hello from SecondThread "+i); 
try { 
Thread.sleep(1); 
} catch (InterruptedException e) { 
e.printStackTrace(); 
} 
if (thirdThread.isAlive()==false){ 
break; 
} 
} 

} 

} 
class ThirdThread extends Thread { 
int rnd; 
boolean simp; 

public void run() { 
System.out.println("Start ThirdThread"); 
rnd = (int) ((Math.random() * 1000000) + 100000); 
for (int i = 2; i <= Math.sqrt(rnd); i++) { 
if (rnd % i == 0) { 
simp = false; 
} 
} 
if (simp == true) { 
System.out.println(rnd + " - простое"); 
} else { 
System.out.println(rnd + " - не простое"); 
} 
} 
}

import java.util.*;
class subset
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c[]=new int[a];
int d[]=new int[b];
String s="";
String s2="";
for(int i=0;i<a;i++)
{
c[i]=sc.nextInt();
s=s+String.valueOf(c[i]);
}
for(int j=0;j<b;j++)
{
d[j]=sc.nextInt();
s2=s2+String.valueOf(d[j]);
}
if(s.contains(s2))
System.out.println("d is subset of c");
else
System.out.println("d is not subset of c");
}}

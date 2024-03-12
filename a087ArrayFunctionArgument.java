//passing arrays as argument 
// In java array ,value is  passed by reference 
//not as pass by value
//where as in case of variable it is done through pass by value 

public class a087ArrayFunctionArgument {

public static void Update(int marks[],int nonChangable){
for (int i = 0; i < marks.length; i++) {
    marks[i]=marks[i]+1;
}
nonChangable=10;
}
    public static void main(String[] args) {
     int marks[]={97,98,99};   
     int nonChangable=5;
     Update(marks,nonChangable);
     for (int i = 0; i < marks.length; i++) {
        System.out.println(marks[i]+" ");
     }
     System.out.println(nonChangable);// the value will not be change
    }
}

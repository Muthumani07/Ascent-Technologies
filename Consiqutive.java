public class Consiqutive {
    public static void main(String[] args){
        String str = "Muthumani nmae is muthuu maa name is appa amma";
        for(int i = 0,j =i+1 ; i < str.length()-1; i++,j++){
            if(str.charAt(i)==str.charAt(j)){
                System.out.print(str.charAt(i));
                System.out.print(str.charAt(i)+ " ");
            }
        }
    }
}

/*aprt from this thre is multiple question asked together
here are:
    1.sorting array
    2.find smallest element , second smallest element
    3.occurrence in the array how many times
    4.remove vowels in the string as well reverse that.




*/

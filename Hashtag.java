class Hashtag{
    public static void main(String args[]){
        String name = "hello muthu thiru #google worls #zoho adjasn miaj #apple ";
        int val1 = Character.valueOf(' ');
        int val2 = Character.valueOf('#');
        for(int i=0; i<name.length(); i++){
            if(name.charAt(i) == val2){
                while(name.charAt(i)!=val1){
                    System.out.print(name.charAt(i));
                    i++;
                }
            }
        }
    }
}
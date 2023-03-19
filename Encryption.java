class Encryption{
    public static void main(String[] args){

        char encrypted[]={'d','n','o','t','q'};
        int len = encrypted.length;
        char[] decrypted =new char[len];
        int prev=1;
        for(int i=0;i<encrypted.length;i++){
            int ascival = encrypted[i];

            int temp = ascival-prev;

            while(temp<97){
                temp=temp+26;
            }
            decrypted[i]=(char)(temp);
            prev=ascival;
        }
        System.out.println(decrypted);
    }
}

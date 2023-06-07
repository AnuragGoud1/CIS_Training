public class ArrayExample {
    public static void main(String[] args) {

        int[] array = { 20,21,18,24,45,10};
        int minNumber;
        int maxNumber;
        int temp =0;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                  temp=array[i];
                  array[i]=array[j];
                  array[j]=temp;
                }
            }
        }

        for(int i =0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        minNumber= array[0];
        maxNumber=array[array.length-1];

        System.out.println("Minimum Number: "+minNumber+ " Maximum Number: "+maxNumber);

    }

}

public class ArrayReverse {
    public static void main(String[] args) {
        int[] array = { 20,21,18,24,45,10};
        int temp =0;
        for(int i=0;i<array.length;i++)
        {
            for(int j=i+1;j<array.length;j++){

                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;

            }
        }
        for(int i =0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}

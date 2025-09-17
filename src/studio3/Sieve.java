public class Sieve {
    public static void main(String[]args){
        int baseCase = 0;
        int[] array = new int[40];
        for(int index = 2; index < array.length; index++){
            array[index-2] = index;
            System.out.println(array[index]);
        }
        for(int index = 0; index < array.length; index++) {
            if(array [index] != 0){
                baseCase = array[index];
            }
            for (int sieveIndex = baseCase*2; sieveIndex < array.length; sieveIndex+=(baseCase)){
                array[sieveIndex] = 0;
                }
            }
          for(int index = 2; index < array.length; index++){
            System.out.println(array[index]);
        }
    } 
}

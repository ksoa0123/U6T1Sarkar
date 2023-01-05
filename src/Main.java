public class Main {
    public static void main(String[] args){
        int[] heights = new int[3];
        for (int i =0; i < heights.length;i++){
            System.out.println(heights[i]);
        }

        boolean[] bools = {true, false, true, false, true, false};
        bools[0] = bools[3];
        System.out.println(bools.length);
        System.out.println(bools[0]);
        System.out.println(bools[5]);




        Dog dog1 = new Dog("Sparky", 4);
        Dog dog2 = new Dog("Toby", 7);
        Dog dog3 = new Dog("Fionna", 12);

        Dog[] dogs = {dog1, dog2, dog3};

        for (int i = 0; i < dogs.length; i++){
            System.out.println(dogs[i].getName());
        }


    }
}

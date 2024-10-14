public class Electronic_shop {
    public Electronic_shop(int[] keyboard, int[] USB){
        this.keyboard = keyboard;
        this.USB = USB;
    }
    int[] keyboard;
    int[] USB;

    public static int cheapest_keyboard(int[] keyboard){
        int min=keyboard[0];
        for(int i = 0; i < keyboard.length; i++){
            if(keyboard[i]<min)
                min=keyboard[i];
        }
        return min;
    }

    public static int expensive_thing(int[] keyboard,int[] USB){
        int max=keyboard[0];
        for(int i = 1; i < keyboard.length; i++){
            if(keyboard[i]>max)
                max=keyboard[i];
        }
        for(int j=0; j < USB.length; j++){
            if(USB[j]>max)
                max=USB[j];
        }
        return max;
    }

    public static int most_expensive_afford(int[] USB,int budget){
        int max=0;
        for(int i=0; i<USB.length; i++){
            if(USB[i]>max && budget>USB[i])
                max=USB[i];
        }
        return max;
    }

    public static int buy(int budget, int[]keyboard, int[] USB){
        int max=0;
        for(int i=0; i<USB.length; i++){
            for(int j=0; j<keyboard.length; j++){
                if (USB[i]+keyboard[j]<budget && USB[i]+keyboard[j]>max){
                    max=USB[i]+keyboard[j];
                }
            }
        }
        if (max!=0) {
            return max;
        }
        else{
            return -1;
        }
    }

}

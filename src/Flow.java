public class Flow {
   private int count = 0;
    public void methodA(String name){


        if (name.isEmpty() && count < 2){

            System.out.print("a");
            count++;
        }
        if (count == 1 && name.isEmpty()){
            System.out.print("v");
            Flow flow = new Flow();
            flow.methodA("Hiiiiii");
        }
        if (!name.isEmpty()){
            System.out.print("a ");
            Flow flow = new Flow();
            setCount(2);
            flow.methodB("We really doing this again?");

        } else {
            setCount(2);
            methodC();
        }
    }
    public void methodB(String name){
        if (name.isEmpty()){

            System.out.print("J");


        } else if (name.equals("We really doing this again?")){
            System.out.print("e");
            Flow flow = new Flow();
            flow.methodC();

        } else if (name.equals("toLowerCase")) {
            System.out.print("j");
        }
    }
    public void methodC(){
        if (count == 2){
            System.out.print("r ");
            setCount(3);
            methodD();
        }

    }
    public void methodD(){
        switch (count){
            case 1:
                System.out.println("mega bait");
                break;
            case 2:
                System.out.println("giga bait");
                break;
            case 3:
                System.out.print("s");
                count++;
                methodD();
                break;
            case 4:
                methodB("toLowerCase");
                count++;
                methodD();
                break;
            case 5:
                System.out.print("o");

                count++;
                methodD();

                break;
            case 6:
                System.out.print("v");
                count++;
                methodD();
                break;
            case 7:
                System.out.println("t");

        }
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

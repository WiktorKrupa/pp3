public class Count {

        //list of atributes
        int value = 0;
        
        public void addOne()
        {
            value+=1;
            
        }
        public void subOne()
        {
            value-=1;
        }
        public void addTen()
        {
            value+=10;
        }
        public void subTen()
        {
            value-=10;
        }
        
        public static void main(String[] args) {
            Count c1 = new Count();
            Count c2 = new Count();
            
            c1.addTen();
            c1.addTen();
            c1.addOne();
            c1.addOne();
            c1.addOne();
            
            c2.subTen();
            c2.subTen();
            c2.subTen();
            c2.subTen();
            c2.subTen();
            c2.addOne();
            c2.addOne();
            c2.addOne();
            
            System.out.print(c1.value);
            System.out.print(c2.value);
            
            
        }
}
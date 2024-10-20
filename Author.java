public class Author{

    private String name;
    private char sex;//M OR F
    private int age;
    
    Author(String name, char sex, int age){
            this.name = name;
            this.sex=sex;
            this.age-=age;
    }

        public int getAge(){
            return age;
        }
        public char getSex(){
            return sex;
        }

        public String getname(){
            return name;
        }

        public void authorDetails (){
            System.out.println("Name : "+name);
            System.out.println("Sex : "+sex);
            System.out.println("Age : "+age);
        }


    }


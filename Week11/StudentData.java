package Week11;



    public class StudentData{

        public String name;
        public int age;
        public double GPA;

        public StudentData(){}

        public StudentData(String name ,int age, double GPA ){
        this.name=name;
        this.age=age;
        this.GPA=GPA;

        }

        public String getname(){
            return name;
        }
        public int getage(){
            return age;
        }
        public double getGPA(){
            return GPA;
        }

      @Override
        public boolean equals(Object obj){
          if (obj == null) {
              
            return false;
              
          }
          if (obj == this) {
              return true;
          }
       
            StudentData gueat=(StudentData)obj;
            return name==gueat.name;
          
        }
        
        public boolean equalsAge(Object obj){
            if (obj == null) {
                
              return false;
                
            }
            if (obj == this) {
                return true;
            }
         
              StudentData gueat=(StudentData)obj;
              return age==gueat.age;
            
          }

          public boolean equalsGPA(Object obj){
            if (obj == null) {
                
              return false;
                
            }
            if (obj == this) {
                return true;
            }
         
              StudentData gueat=(StudentData)obj;
              return GPA==gueat.GPA;
            
          }
         
       
        
    
      


    

    }

    


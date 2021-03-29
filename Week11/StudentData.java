package Week11;



    public class StudentData{

        public String name;
        public Integer age;
        public Double GPA;

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
      
        public boolean equals(Double obj){
            if (obj == null) {
                
              return false;
                
            }
            if (obj == this.GPA) {
              return true;
          }
           
         
              StudentData gueat= new StudentData();
              return GPA==gueat.getGPA();
            
          }

          public boolean equals(Integer obj){
            if (obj == null) {
                
              return false;
                
            }
            if (obj == this.age) {
                return true;
            }
         
            StudentData gueat= new StudentData();
              return age==gueat.age;
            
          }

          
         
       
        
    
      


    

    }

    


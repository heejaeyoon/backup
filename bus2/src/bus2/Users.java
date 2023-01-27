package bus2;


public class Users {
   String userid;
   String password;
   String name;
   String birth;
   int money;
   int paynum;
   int paynum2;
   int paynum3;
   int paysum;
   
   
   
   public Users() {
      
   }



   public Users(String userid, String password, String name, String birth, int money, int paynum, int paynum2,
         int paynum3, int paysum) {
      this.userid = userid;
      this.password = password;
      this.name = name;
      this.birth = birth;
      this.money = money;
      this.paynum = paynum;
      this.paynum2 = paynum2;
      this.paynum3 = paynum3;
      this.paysum = paysum;
   }



   @Override
   public String toString() {
      return "Users [userid=" + userid + ", password=" + password + ", name=" + name + ", birth=" + birth + ", money="
            + money + ", paynum=" + paynum + ", paynum2=" + paynum2 + ", paynum3=" + paynum3 + ", paysum=" + paysum
            + "]";
   }
  }
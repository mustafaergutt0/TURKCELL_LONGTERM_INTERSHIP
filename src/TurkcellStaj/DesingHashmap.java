package TurkcellStaj;

// HASHPMAP DESİNG

import java.util.HashMap;
//
//// hızlı ve key value operaiton hascode çalışıyro arkasın o1 complexirty bulma çıkarma
public class DesingHashmap {
   static void main() {
//// is part of colleciton implemetne as key value


UserDto user = new UserDto("admin", "admin");
UserDto user1 = new UserDto("admin1", "admin");
UserDto user2 = new UserDto("admin2", "admin");
        HashMap<Integer, UserDto> map = new HashMap<>();
        map.put(1,user);
        map.put(2,user1);
        map.put(3,user2);
        System.out.println(map.get(1));
        System.out.println(map.containsKey(3));




    }
}

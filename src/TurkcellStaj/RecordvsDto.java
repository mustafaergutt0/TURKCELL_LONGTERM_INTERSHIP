package TurkcellStaj;

public class RecordvsDto {

    public class CreateUserRequestDto {
        private String name;
        private int age;

        public CreateUserRequestDto() {} // no-args (Jackson kolaylığı)

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public int getAge() { return age; }
        public void setAge(int age) { this.age = age; }
    }

    // get ve set ile mutable oldu


UserDto user=new UserDto("hey dude","hyemana");
    // BÖylece record immutable oldu

}





record UserDto(String username,String password){
    // Record (Java 16+): “Bu sınıf saf veri taşıyor” dediğinde Java’nın otomatik ürettiği sınıf tipi.




    /*

     public LoginResponse login(LoginRequest request) {

        User user = userRepository.findByEmail(request.email())
                .orElseThrow(() -> new RuntimeException("User not found"));

        if (!passwordEncoder.matches(request.password(), user.getPasswordHash())) {
            throw new RuntimeException("Invalid credentials");
        }

        String token = generateToken(user);

                user.getId(),
        return new LoginResponse(   // Consturctor hali  oluşturoyr çünkü immutable
                user.getEmail(),
                token
        );
    }


     */
}

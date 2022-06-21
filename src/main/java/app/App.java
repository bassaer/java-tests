package app;

public class App {
    public static void main(String[] args) {
        NameCreator nameCreator = new NameCreatorImpl();
        UserRepository repository = new UserRepositoryImpl((nameCreator));
        System.out.println(repository.find("123"));
        System.out.println(CodeGenerator.generate("1234"));
    }
}

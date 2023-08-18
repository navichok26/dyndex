package ru.x5113nc3x.dexclassloaderdemo;

public class DexFile {
    static public String getHelloworld() {
        secretLogic();
        return "hello world";
    }
    static private void secretLogic() {
        String secretEncKey = "DONT LOOK HERE";
        System.out.println(secretEncKey);
    }
}

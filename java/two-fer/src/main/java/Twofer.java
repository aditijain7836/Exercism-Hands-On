public class Twofer {
    public String twofer(String name) {
        String str = "";
        if(name == null)
        {
            str = "One for you, one for me.";
            return str;
        }
        str = "One for " + name + ", one for me.";
        return str;
    }
}

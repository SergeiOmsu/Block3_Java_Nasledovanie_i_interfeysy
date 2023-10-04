public class LengthStringFilter implements Filter{
    private String pattern;

    public LengthStringFilter(String pattern){
        this.pattern = pattern;
    }

    @Override
    public boolean apply(String str) {
        return str.length() == pattern.length();
    }
}

class Hourglass{
    public static String make_line(int p_length){
        String my_string = "* ".repeat(p_length);
        return my_string;
    }
    public static String make_hourglass(int p_height){
        String pattern = "";
        for(int i=0;i<p_height-1;i++){
            pattern += " ".repeat(i) + make_line(p_height-i) + "\n";
        }
        for(int i=p_height-1;i>=0;i--){
            pattern += " ".repeat(i) + make_line(p_height-i) + "\n";
        }
        return pattern;
    }
    public static void main(String[] args) {
        System.out.print(make_hourglass(12));
    }
}
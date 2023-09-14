public class GetPath {
    private String path="";
    private String filename;
    public GetPath(String filename) {
        this.filename=filename;
    }
    public String getPath()
    {
        Integer LastIndex = this.filename.lastIndexOf("\\");
        if(LastIndex != -1){
            path = String.valueOf(this.filename.toCharArray(),0, LastIndex+1);
        }
        return path;
    }
}

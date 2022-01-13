public class Symbol
{
    String id;
    String type;
    String scope;
    String d_type;

    public Symbol (String id, String type, String scope, String kind) {
        this.id = id;
        this.type = type;
        this.scope = scope;
        this.d_type = d_type;
    }
}
package Characters;

import java.util.Objects;
public class They extends Characters{
    public They(String name, String description){
        setName(name);
        setDescription(description);
    }    
    public They(String name) {
        setName(name);
    }
    public String love(){
        return "любят ";
    }
    public String tocut(){
        return "рубить ";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        They mumitroll = (They) o;
        return Objects.equals(name, mumitroll.name) &&
                Objects.equals(description, mumitroll.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, description);
    }
}

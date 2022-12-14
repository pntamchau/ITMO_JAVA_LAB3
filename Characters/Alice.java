package Characters;

import java.util.Objects;
public class Alice extends Characters{
    public Alice(String name, String description){
        setName(name);
        setDescription(description);
    }    
    public Alice(String name) {
        setName(name);
    }
    public String thought(){
        return "думала ";
    }
    public String slipAway(){
        return "улизнуть ";
    }
    public String toThink(){
        return "подумывать, ";
    }
    public String lookingAround(){
        return "озираясь, ";
    }
    public String noticed(){
        return "заметила ";
    }
    public String notUnderstand(){
        return "не могла понять ";
    }
    public String watching(){
        return "понаблюдав ";
    }
    public String guessed(){
        return "догадалась ";
    }
    public String began(){
        return "начала ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Alice mumitroll = (Alice) o;
        return Objects.equals(name, mumitroll.name) &&
                Objects.equals(description, mumitroll.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, description);
    }

}

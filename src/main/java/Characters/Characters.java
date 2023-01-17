package Characters;

import Interfaces.Describable;
import Interfaces.Nameable;
import Interfaces.Pronounceable;

import java.util.Objects;
public abstract class Characters implements Nameable, Describable, Pronounceable{
    protected String name;
    protected String description;
    protected String pronoun;
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }
    @Override
    public String getPronoun() {
        return pronoun;
    }

    @Override
    public void setPronoun(String pronoun) {
        this.pronoun = pronoun;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Characters that = (Characters) o;
        return Objects.equals(name, that.name) &&
            Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description);
    }

    @Override
    public String toString() {
        return  this.getClass() + "{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

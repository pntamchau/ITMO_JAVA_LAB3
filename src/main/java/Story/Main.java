package Story;

import Characters.Alice;
import Characters.They;
import Enum.EnumLocation;
import NonAnimals.Head;
import NonAnimals.Phenonemon;
import NonAnimals.Smile;
public class Main {
    public static void main(String[] args) {
        Alice a = new Alice("она");
        System.out.println("\"А что же тогда со мной будет?\"- " + a.thought()+a.getName()+". ");
        They t = new They("они");
        Head h = new Head();
        h.setName(" головы");
        h.setDescription(" людям");
        System.out.println("Ведь это ужас как "+t.getName()+" тут "+t.love()+t.tocut()+h.getDescription()+h.getName()+"; прямо чудо, что кто-то еще в живых остался! ");
        System.out.println(a.getName()+" "+a.began()+a.toThink()+"как бы незаметно "+a.slipAway()+"подобру поздорову.");
        Phenonemon p = new Phenonemon();
        p.setName("явление");
        p.setDescription("странное ");
        System.out.println("И, "+a.lookingAround()+a.getName()+" вдруг "+a.noticed()+EnumLocation.AIR.getName()+"какое-то "+p.getDescription()+p.getName()+".");
        a.setName("Алиса");
        Smile s = new Smile();
        s.setName("улыбка");
        System.out.println("Сначала "+a.getName()+"никак "+a.notUnderstand()+", что это такое, но,"+a.watching()+"некоторое время, "+a.guessed()+", что это-просто "+s.getName()+".");
    }
}

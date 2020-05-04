package ch2;

public class Film {

    private Integer anAparitie;
    private String name;
    private Actor[] actors;

    public Film(Integer anAparitie, String name, Actor[] actors) {
        this.anAparitie = anAparitie;
        this.name = name;
        this.actors = actors;
    }


    public Actor[] getActors() {
        return actors;
    }

    public Integer getAnAparitie() {
        return anAparitie;
    }

    public void setAnAparitie(Integer anAparitie) {
        this.anAparitie = anAparitie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setActors(Actor[] actors) {
        this.actors = actors;
    }

    public Actor getActorByName(String actorName){
        for (Actor actor:actors){
            if(actor!=null && actor.getName().equals(actorName))
            {
                return actor;
            }
        }
     return null;
}

public boolean hasActorsAboveAge(int age)
{
    for(Actor actor:actors)
    {
        if(actor!=null && actor.getAge()>age)
        {
            return true;
        }
    }
    return false;
}

}

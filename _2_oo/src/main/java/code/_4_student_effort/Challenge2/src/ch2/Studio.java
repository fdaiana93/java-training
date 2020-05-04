package ch2;

public class Studio {
    private String name;
    private Film[] filme;

    public Studio(String name, Film[] filme) {
        this.name = name;
        this.filme = filme;
    }

    public int count()
    {
        int count=0;
        for(Film film:filme)
        {
            if(film!=null)
                count++;
        }
        return count;
    }

    public boolean hasActor(String actorName)
    {
      for(Film film:filme)
      {
          if(film!=null && film.getActorByName(actorName)!=null){
              return true;
          }
      }
      return false;
    }

    public String[] getFilmNameWithActorAboveAge(int age){
        String[] toReturn=new String[10];
        int i=0;
        for(Film film:filme)
        {
            if(film!=null && film.hasActorsAboveAge(age))
            {
                toReturn[i++]=film.getName();
            }
        }
       return toReturn;
    }

    public Film[] getFilme()
    {
        return filme;
    }
    public String getName()
    {
        return name;
    }

}


public class initiativecontainer implements Comparable <initiativecontainer>{
public creature Creatureheld;
public int Initativenumber;
public int Initativeroll;
@Override
public int compareTo(initiativecontainer o)

{
     return(Initativeroll - o.Initativeroll);
}

	


}

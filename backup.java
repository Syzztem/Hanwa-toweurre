import java.lang.StringBuilder;
public class Hanoi
{
    public static boolean isNotDone(String tab)
    {
		return (tab.contains("1") || (tab.contains("2") && tab.contains("3")));
    }
    public static boolean isValid(String tab, byte i)
    {
		return !(tab.indexOf(tab.charAt(i)) < i);
	}
    public static char move(String tab, byte i)
	{
	    switch (tab.charAt(i))
		{
			case '1':
			    if (tab.indexOf('2') < i)
					return '3';
			    return '2';
			case '2':
			    if (tab.indexOf('3') < i)
					return '1';
			    return '3';
			case '3':
			    if (tab.indexOf('1') < i)
					return '2';
			    return '1';
		}
		return 0;
    }
    public static void main(String... args)
    {
		System.out.println(Integer.parseInt(args[0]));
		byte i = 0;
		StringBuilder disk = new StringBuilder("");
		for(int sz = Integer.parseInt(args[0]); sz > 0; sz--)
			disk.append("1");
		while(isNotDone(disk.toString()))
		{
		    if (isValid(disk.toString(), i))
				disk.setCharAt(i, move(disk.toString(), i));
		    i++;
		}
		System.out.println(disk.toString());
    }
}

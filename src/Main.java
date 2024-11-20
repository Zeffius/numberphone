import java.util.regex.Matcher;
import java.util.regex.Pattern;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        String number = "+79050112230+79050112231 +79050112232+79050112233, +79050112234+7905011223579050112236+7905011223789050112238";
        String number2 = "+79050112200+79050112211 +79050112222+79050112243, +79050112234+7905011223579050112236+7905011223789050112238";
        System.out.println(number);
        Pattern p = Pattern.compile("(\\+7|8)\\d{10}");
        Matcher m = p.matcher(number);
        Pattern p2 = Pattern.compile("(\\+7|8)\\d{10}");
        Matcher m2 = p.matcher(number2);
        int i = 0; int j = 0;

        String string = "";
        String string2 = "";

        while(m.find())
        {
            System.out.println("НОМЕР, КОТОРЫЙ СОВПАЛ ПО УСЛОВИЮ ИЗ 1 СПИСКА:" + m.group());
            string = m.group() + " " + string;
            i++;
        }

        while(m2.find())
        {
            System.out.println("НОМЕР, КОТОРЫЙ СОВПАЛ ПО УСЛОВИЮ ИЗ 2 СПИСКА:" + m2.group());
            string2 = m2.group() + " " + string2;
            j++;
        }

        String[] separate = string.split(" ");

        String[] separate2 = string2.split(" ");


        for(int y=0; y<i; y++)
        {
            for(int r=0; r<j; r++)
            {
                if (separate[y].equals(separate2[r]))
                {
                    System.out.println(" ПОВТОРЯЮЩИЙСЯ НОМЕР: " + separate[y]);
                }

            }
        }

    }
}
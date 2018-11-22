import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Encorypt {


    public List<String> encoryptMessage(String message){

        String letter="abcdefghijklmnopqrstvwxyz";
        List<String> alphabet= Arrays.asList(letter.split(""));
        List<String> mutableLetter=new ArrayList <>(alphabet);


        List<String> text=Arrays.asList(message.split(""));
        List<String> mutableMessage=new ArrayList <>(text);


        System.out.println(mutableMessage);
        //System.out.println(letterList);
        Integer size=mutableMessage.size();
        List<String> encryptMessage=new ArrayList <>();
        for (int i = 0; i <size; i++) {
            while (mutableMessage.isEmpty()){
                if(mutableLetter.contains(mutableMessage.get(i))){
                    // System.out.println(listLetter.get(i));

                      encryptMessage.add(mutableMessage.get());
                }

            }


        }
       return encryptMessage;
    }


}

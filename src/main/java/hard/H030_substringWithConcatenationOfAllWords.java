package hard;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

/**
 * @author 郭朝彤
 * @date 2017/12/6.
 */
public class H030_substringWithConcatenationOfAllWords {
    public static List<Integer> findSubstring(String s, String[] words) {
        HashSet<Integer> list = new HashSet<>();
        if(words.length == 0){
            return new ArrayList<>();
        }
        HashSet<StringBuffer> list1 = arrangeAll(words);
        if(list1.size() == 0){
            return new ArrayList<>(list);
        }
        for(StringBuffer stringBuffer : list1){
            String temp = s;
            int i = 0;
            while (temp.indexOf(stringBuffer.toString()) != -1){
                list.add(temp.indexOf(stringBuffer.toString())+i);
                i = i+temp.indexOf(stringBuffer.toString())+1;
                temp = s.substring(i);
            }
        }
        return new ArrayList<>(list);
    }

    public static HashSet<StringBuffer> arrangeAll(String[] words){
        HashSet<StringBuffer> list = new HashSet<>();
        list.add(new StringBuffer(words[0]));
        for(int i = 1; i < words.length; i++){
            list = arrangeOne(list, words[i]);
        }
        return list;
    }

    public static HashSet<StringBuffer> arrangeOne (HashSet<StringBuffer> list, String s){
        HashSet<StringBuffer> res = new HashSet<>();
        int size = list.toArray()[0].toString().length();
        int len = s.length();
        int times = size/len;
        for(StringBuffer stringBuffer : list){
            for(int i = 0; i <= times; i++){
                StringBuffer sb = new StringBuffer(stringBuffer);
                res.add(new StringBuffer(sb.insert(i*len, s)));
            }
        }
        return res;
    }
    public static void main(String[] args){
//        List<StringBuffer> list = new ArrayList<>();
//        list.add(new StringBuffer("abcdef"));
//        list.add(new StringBuffer("defabc"));
//        String s = "ghi";
//        List<StringBuffer> res = arrangeOne(list, s);
//        String s = "foobar";
//        String words[] = {"aa", "aa", "aa"};
//        System.out.println(findSubstring(s, words));
        String s = "pjzkrkevzztxductzzxmxsvwjkxpvukmfjywwetvfnujhweiybwvvsrfequzkhossmootkmyxgjgfordrpapjuunmqnxxdrqrfgkrsjqbszgiqlcfnrpjlcwdrvbumtotzylshdvccdmsqoadfrpsvnwpizlwszrtyclhgilklydbmfhuywotjmktnwrfvizvnmfvvqfiokkdprznnnjycttprkxpuykhmpchiksyucbmtabiqkisgbhxngmhezrrqvayfsxauampdpxtafniiwfvdufhtwajrbkxtjzqjnfocdhekumttuqwovfjrgulhekcpjszyynadxhnttgmnxkduqmmyhzfnjhducesctufqbumxbamalqudeibljgbspeotkgvddcwgxidaiqcvgwykhbysjzlzfbupkqunuqtraxrlptivshhbihtsigtpipguhbhctcvubnhqipncyxfjebdnjyetnlnvmuxhzsdahkrscewabejifmxombiamxvauuitoltyymsarqcuuoezcbqpdaprxmsrickwpgwpsoplhugbikbkotzrtqkscekkgwjycfnvwfgdzogjzjvpcvixnsqsxacfwndzvrwrycwxrcismdhqapoojegggkocyrdtkzmiekhxoppctytvphjynrhtcvxcobxbcjjivtfjiwmduhzjokkbctweqtigwfhzorjlkpuuliaipbtfldinyetoybvugevwvhhhweejogrghllsouipabfafcxnhukcbtmxzshoyyufjhzadhrelweszbfgwpkzlwxkogyogutscvuhcllphshivnoteztpxsaoaacgxyaztuixhunrowzljqfqrahosheukhahhbiaxqzfmmwcjxountkevsvpbzjnilwpoermxrtlfroqoclexxisrdhvfsindffslyekrzwzqkpeocilatftymodgztjgybtyheqgcpwogdcjlnlesefgvimwbxcbzvaibspdjnrpqtyeilkcspknyylbwndvkffmzuriilxagyerjptbgeqgebiaqnvdubrtxibhvakcyotkfonmseszhczapxdlauexehhaireihxsplgdgmxfvaevrbadbwjbdrkfbbjjkgcztkcbwagtcnrtqryuqixtzhaakjlurnumzyovawrcjiwabuwretmdamfkxrgqgcdgbrdbnugzecbgyxxdqmisaqcyjkqrntxqmdrczxbebemcblftxplafnyoxqimkhcykwamvdsxjezkpgdpvopddptdfbprjustquhlazkjfluxrzopqdstulybnqvyknrchbphcarknnhhovweaqawdyxsqsqahkepluypwrzjegqtdoxfgzdkydeoxvrfhxusrujnmjzqrrlxglcmkiykldbiasnhrjbjekystzilrwkzhontwmehrfsrzfaqrbbxncphbzuuxeteshyrveamjsfiaharkcqxefghgceeixkdgkuboupxnwhnfigpkwnqdvzlydpidcljmflbccarbiegsmweklwngvygbqpescpeichmfidgsjmkvkofvkuehsmkkbocgejoiqcnafvuokelwuqsgkyoekaroptuvekfvmtxtqshcwsztkrzwrpabqrrhnlerxjojemcxel";
        String[] words = {"dhvf","sind","ffsl","yekr","zwzq","kpeo","cila","tfty","modg","ztjg","ybty","heqg","cpwo","gdcj","lnle","sefg","vimw","bxcb"};
        Date date1 = new Date();
        List<Integer> list = findSubstring(s, words);
        Date date2 = new Date();
        System.out.println(list);
        System.out.println(date2.getTime() - date1.getTime());
    }
}

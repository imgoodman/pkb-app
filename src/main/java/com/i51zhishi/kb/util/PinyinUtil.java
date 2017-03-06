package com.i51zhishi.kb.util;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

/**
 * Created by User on 2017/3/6.
 */
public class PinyinUtil
{
    public static String converterToFirstSpell(String chinese)
    {
        String pinyinName="";
        char[] nameChar=chinese.toCharArray();
        HanyuPinyinOutputFormat defaultFormat=new HanyuPinyinOutputFormat();
        defaultFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);
        defaultFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
        for(int i=0;i<nameChar.length;i++){
            if(nameChar[i]>128){
                try{
                    pinyinName+= PinyinHelper.toHanyuPinyinStringArray(nameChar[i],defaultFormat)[0].charAt(0);
                }
                catch (BadHanyuPinyinOutputFormatCombination e){
                    e.printStackTrace();
                }
            }else{
                pinyinName+=nameChar[i];
            }
        }
        return pinyinName;
    }
}

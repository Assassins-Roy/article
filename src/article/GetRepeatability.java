package article;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.seg.common.Term;



public class GetRepeatability {
	public static double getRepeatability(String s1,String s2) {
	
		List<Term> termList1 = HanLP.segment(s1);
		List<Term> termList2 = HanLP.segment(s2);
	  
		//处理第一个文本
	    int freq=0;
	    List<String> map1 = new ArrayList<>();
	    for (Term term : termList1) {
	        String s = term.toString(), paper = "";
	        String c = s.replaceAll("[^a-zA\u4e00-\u9fa5]", "");//筛选出中英文
	            paper += c;
	            map1.remove("");
	            map1.add(paper);
	     
	    } 
	    //System.out.println(map1);
	 
	    Map<String,Object> frequency1 = new HashMap(); //将词语及其出现频率用map储存
	    
	          for(String obj: map1){
	                 if(frequency1.containsKey(obj)){//判断是否已经有该数值，如有，则将次数加1
	                  frequency1.put(obj, ((Integer)frequency1.get(obj)).intValue() + 1);
	               }else{
	                    frequency1.put(obj, 1);
	               }
	            }
	        
	              //System.out.println(frequency1.values());
	          
	            //处理第二个文本
	               freq=0;
	              List<String> map2 = new ArrayList<>();
	              for (Term term : termList2) {
	                  String s = term.toString(), paper = "";
	                  String c = s.replaceAll("[^a-zA\u4e00-\u9fa5]", "");
	                      paper += c;
	                      map2.remove("");
	                      map2.add(paper);
	               
	              }  
	             // System.out.println(map2);
	              Map<String,Object> frequency2 = new HashMap();
	                    for(String obj: map2){
	                           if(frequency2.containsKey(obj)){//判断是否已经有该数值，如有，则将次数加1
	                            frequency2.put(obj, ((Integer)frequency2.get(obj)).intValue() + 1);
	                         }else{
	                              frequency2.put(obj, 1);
	                         }
	                      }
	                        //System.out.println(frequency2.values());
	      
	                        int number=0; double dividend =0, divisor1 =0, divisor2 =0,sum=0;
	    
	                    			 for(String key:frequency1.keySet()){
	                    				 Object value1=frequency1.getOrDefault(key, 0);
	                    				 Object value2=frequency2.getOrDefault(key, 0);
	                    				// System.out.println(value2);
	                                            	dividend+= (Integer)value1*(Integer)value2;
	                                            	divisor1+= (Integer)value1*(Integer)value1;
	                                                divisor2+=(Integer)value2*(Integer)value2;
	                                               // System.out.println(divisor2);
	                    			 }
	                                            divisor1 = Math.sqrt(divisor1);
	                                            divisor2 = Math.sqrt(divisor2);
	                                            double divisor = divisor1 * divisor2;
	              
											return dividend/divisor;
	}               
}

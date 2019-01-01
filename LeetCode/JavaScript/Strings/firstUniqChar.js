var firstUniqChar = function(s) {
    var split = s.split("");
    for(i=0;i<s.length;i++){
        for(j=0;j<s.length;j++){
            if(s[i]==s[j] && i!=j){
                break; 
            }
            else if(j==s.length-1){
                return i;
            }
        }
    }
    return -1;
};
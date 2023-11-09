public class MyClass {
    public static void main(String args[]) {
        String str = "HelloWorld";
        char charArr[] = str.toCharArray();
        for(int i=0; i<charArr.length; i++){
            System.out.println(charArr[i]);
            String str1 = "";
            for(int j=i+1; j<charArr.length; j++){
                
                System.out.print(charArr[i]);
                str1 = str1+charArr[j];
                System.out.println(str1);
            }
        }
    }
}



/*
Output:
H
He
Hel
Hell
Hello
HelloW
HelloWo
HelloWor
HelloWorl
HelloWorld
e
el
ell
ello
elloW
elloWo
elloWor
elloWorl
elloWorld
l
ll
llo
lloW
lloWo
lloWor
lloWorl
lloWorld
l
lo
loW
loWo
loWor
loWorl
loWorld
o
oW
oWo
oWor
oWorl
oWorld
W
Wo
Wor
Worl
World
o
or
orl
orld
r
rl
rld
l
ld
d
*/

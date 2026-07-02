package com.company.lessonFourSwitch.lessonFiveLogicOperation;

public class C03_Cyper {
    public static void main(String[] args) {

        //Побитовые логические операции ^
        //Используя операцию ХOR можно защифровать сообщение
        //в таком шифровании используется один секретный ключ, как для шифрования так и для расшифровки
        //криптостойкость такого ключа можно увеличить, если увеличить его длину
        short secretKey = 0b0101;//секретный ключ
        char character = 'A';// исходный символ для шифрования

        System.out.println("Исходный символ: "+ character + " его код в кодовой таблице " + (byte)character);

        //зашифровываем символ : character = 0100 0001 (65)
        character = (char)(character ^ secretKey); // 0100 0001 ^ 0000 0101
        System.out.println("Защифрованный символ " + character + " его код в кодовой таблице " + (byte)character);

        //расшифровываем символ character = 0100 0100 (68)
        character = (char)(character ^ secretKey);// 0100 0100 ^ 0000 0101
        System.out.println("Защифрованный символ " + character + " его код в кодовой таблице " + (byte)character);

    }
}

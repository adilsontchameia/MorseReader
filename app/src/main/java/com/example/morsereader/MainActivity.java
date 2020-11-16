package com.example.morsereader;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // initialize variables

    EditText etinput,

    etoutput;

    Button btnEncode,

    btnDecode,

    btnclear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ligacoes();


        // initializing string arrays

        final String[] AlphaNumeric = new String[37];


        // string array for storing alphabets and numbers

        final String[] AlphaNumeric1 = new String[37];


        // string array for storing corresponding morse code

        // assigning alphabets to the string array Alphanumeric[]

        AlphaNumeric[0] = "A";

        AlphaNumeric[1] = "B";

        AlphaNumeric[2] = "C";

        AlphaNumeric[3] = "D";

        AlphaNumeric[4] = "E";

        AlphaNumeric[5] = "F";

        AlphaNumeric[6] = "G";

        AlphaNumeric[7] = "H";

        AlphaNumeric[8] = "I";

        AlphaNumeric[9] = "J";

        AlphaNumeric[10] = "K";

        AlphaNumeric[11] = "L";

        AlphaNumeric[12] = "M";

        AlphaNumeric[13] = "N";

        AlphaNumeric[14] = "O";

        AlphaNumeric[15] = "P";

        AlphaNumeric[16] = "Q";

        AlphaNumeric[17] = "R";

        AlphaNumeric[18] = "S";

        AlphaNumeric[19] = "T";

        AlphaNumeric[20] = "U";

        AlphaNumeric[21] = "V";

        AlphaNumeric[22] = "W";

        AlphaNumeric[23] = "X";

        AlphaNumeric[24] = "Y";

        AlphaNumeric[25] = "Z";

        AlphaNumeric[26] = "0";

        AlphaNumeric[27] = "1";

        AlphaNumeric[28] = "2";

        AlphaNumeric[29] = "3";

        AlphaNumeric[30] = "4";

        AlphaNumeric[31] = "5";

        AlphaNumeric[32] = "6";

        AlphaNumeric[33] = "7";

        AlphaNumeric[34] = "8";

        AlphaNumeric[35] = "9";

        AlphaNumeric[36] = " ";


        // assigning the corresponding morse code

        // for each letter and number to

        // Alphanumeric1[] array

        AlphaNumeric1[0] = ".-";

        AlphaNumeric1[1] = "-...";

        AlphaNumeric1[2] = "-.-.";

        AlphaNumeric1[3] = "-..";

        AlphaNumeric1[4] = ".";

        AlphaNumeric1[5] = "..-.";

        AlphaNumeric1[6] = "--.";

        AlphaNumeric1[7] = "....";

        AlphaNumeric1[8] = "..";

        AlphaNumeric1[9] = ".---";

        AlphaNumeric1[10] = "-.-";

        AlphaNumeric1[11] = ".-..";

        AlphaNumeric1[12] = "--";

        AlphaNumeric1[13] = "-.";

        AlphaNumeric1[14] = "---";

        AlphaNumeric1[15] = ".--.";

        AlphaNumeric1[16] = "--.-";

        AlphaNumeric1[17] = ".-.";

        AlphaNumeric1[18] = "...";

        AlphaNumeric1[19] = "-";

        AlphaNumeric1[20] = "..-";

        AlphaNumeric1[21] = "...-";

        AlphaNumeric1[22] = ".--";

        AlphaNumeric1[23] = "-..-";

        AlphaNumeric1[24] = "-.--";

        AlphaNumeric1[25] = "--..";

        AlphaNumeric1[26] = "-----";

        AlphaNumeric1[27] = ".----";

        AlphaNumeric1[28] = "..---";

        AlphaNumeric1[29] = "...--";

        AlphaNumeric1[30] = "....-";

        AlphaNumeric1[31] = ".....";

        AlphaNumeric1[32] = "-....";

        AlphaNumeric1[33] = "--...";

        AlphaNumeric1[34] = "---..";

        AlphaNumeric1[35] = "----.";

        AlphaNumeric1[36] = "/";


        btnEncode.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {


                // When button encode is clicked then the

                // following lines inside this curly

                // braces will be executed


                // to get the input as string which the user wants to encode

                String input = etinput.getText().toString();


                String output = "";


                // variable used to compute the output

                // to get the length of the input string

                int l = input.length();


                // variables used in loops

                int i, j;


                for (i = 0; i < l; i++) {


                    // to extract each Token of the string at a time

                    String ch = input.substring(i, i + 1);


                    // the loop to check the extracted token with

                    // each letter and store the morse code in

                    // the output variable accordingly

                    for (j = 0; j < 37; j++) {


                        if (ch.equalsIgnoreCase(AlphaNumeric[j])) {


                            // concat space is used to separate

                            // the morse code of each token

                            output = output.concat(AlphaNumeric1[j]).concat(" ");


                        }

                    }

                }


                // to display the output

                etoutput.setText(output);

            }

        });

        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                // When button clear is clicked then the

                // following lines inside this curly

                // braces will be executed


                // to clear the etinput

                etinput.setText("");


                // to clear etoutput

                etoutput.setText("");

            }

        });

        btnDecode.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                // When button decode is clicked then the

                // following lines inside this curly

                // braces will be executed


                // to get the input given by the user as string

                String input1 = etinput.getText().toString();


                // to add space to the end of the string

                // because of the logic used in decoding

                String input = input1.concat(" ");


                // to get the length of the input string

                int l = input.length();


                // i and j are integer variables used in loops.

                // Variable p is used as the end index of

                // substring() function

                int i, j, p = 0;


                // variable used as a starting

                // index of substring() function

                int pos = 0;


                // to store the extracted morse code

                // for each Alphabet,number or space

                String letter = "";


                // a to store the output in it

                String output = "";


                for (i = 0; i < l; i++) {


                    // a variable used to trigger the j loop only

                    // when the complete morse code of a letter

                    // or number is extracted

                    int flag = 0;


                    // to extract each token at a time

                    String ch = input.substring(i, i + 1);


                    // if the extracted token is a space

                    if (ch.equalsIgnoreCase(" ")) {


                        // to store the value of i in p

                        p = i;


                        // to extract the morse code for each letter or number

                        letter = input.substring(pos, p);


                        // to update the value of pos so that next

                        // time the morse code for the next letter

                        // or digit is extracted

                        pos = p + 1;


                        flag = 1;

                    }

                    String letter1 = letter.trim();

                    // to delete extra whitespaces at

                    // both ends in case there are any

                    if (flag == 1) {

                        for (j = 0; j <= 36; j++) {

                            if (letter1.equalsIgnoreCase(AlphaNumeric1[j])) {

                                output = output.concat(AlphaNumeric[j]);

                                break;

                            }

                        }

                    }

                }

                // to display the output

                etoutput.setText(output);

            }

        });

    }

    public void ligacoes() {
        // Assign variables

        etinput = findViewById(R.id.etinput);

        etoutput = findViewById(R.id.etoutput);

        btnDecode = findViewById(R.id.btndecode);

        btnEncode = findViewById(R.id.btnencode);

        btnclear = findViewById(R.id.btnclear);
    }
}
package com.ballthe.calculatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Calculatrice";
    private Button BT_1;
    private Button BT_2;
    private Button BT_3;
    private Button BT_4;
    private Button BT_5;
    private Button BT_6;
    private Button BT_7;
    private Button BT_8;
    private Button BT_9;
    private Button BT_0;
    private Button BT_clear;
    private Button BT_additionner;
    private Button BT_soustraire;
    private Button BT_multiplier;
    private Button BT_diviser;
    private Button BT_egal;
    private Button BT_virgule;
    private Button BT_invisible;
    private Button BT_supprimer;
    private TextView TV_affiche;
    String dernierCarac = "";
    String resultat = "";
    Boolean virguleOK = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BT_0 = findViewById(R.id.bt_0);
        BT_1 = findViewById(R.id.bt_1);
        BT_2 = findViewById(R.id.bt_2);
        BT_3 = findViewById(R.id.bt_3);
        BT_4 = findViewById(R.id.bt_4);
        BT_5 = findViewById(R.id.bt_5);
        BT_6 = findViewById(R.id.bt_6);
        BT_7 = findViewById(R.id.bt_7);
        BT_8 = findViewById(R.id.bt_8);
        BT_9 = findViewById(R.id.bt_9);
        BT_clear = findViewById(R.id.bt_clear);
        BT_additionner = findViewById(R.id.bt_additionner);
        BT_soustraire = findViewById(R.id.bt_soustraire);
        BT_multiplier = findViewById(R.id.bt_multiplier);
        BT_diviser = findViewById(R.id.bt_diviser);
        BT_egal = findViewById(R.id.bt_egal);
        BT_virgule = findViewById(R.id.bt_virgule);
        BT_invisible = findViewById(R.id.bt_invisible);
        BT_supprimer = findViewById(R.id.bt_supprimer);
        TV_affiche = findViewById(R.id.TV_affiche);


    }

    public void clickButton(View view) {
        switch (view.getId()) {
            case R.id.bt_0:
                dernierCarac = "0";
                TV_affiche.setText(TV_affiche.getText() + dernierCarac);
                break;
            case R.id.bt_1:
                dernierCarac = "1";
                TV_affiche.setText(TV_affiche.getText() + dernierCarac);
                break;
            case R.id.bt_2:
                dernierCarac = "2";
                TV_affiche.setText(TV_affiche.getText() + dernierCarac);
                break;
            case R.id.bt_3:
                dernierCarac = "3";
                TV_affiche.setText(TV_affiche.getText() + dernierCarac);
                break;
            case R.id.bt_4:
                dernierCarac = "4";
                TV_affiche.setText(TV_affiche.getText() + dernierCarac);
                break;
            case R.id.bt_5:
                dernierCarac = "5";
                TV_affiche.setText(TV_affiche.getText() + dernierCarac);
                break;
            case R.id.bt_6:
                dernierCarac = "6";
                TV_affiche.setText(TV_affiche.getText() + dernierCarac);
                break;
            case R.id.bt_7:
                dernierCarac = "7";
                TV_affiche.setText(TV_affiche.getText() + dernierCarac);
                break;
            case R.id.bt_8:
                dernierCarac = "8";
                TV_affiche.setText(TV_affiche.getText() + dernierCarac);
                break;
            case R.id.bt_9:
                dernierCarac = "9";
                TV_affiche.setText(TV_affiche.getText() + dernierCarac);
                break;
            case R.id.bt_virgule:
                if (TV_affiche.getText().toString().length() > 0 && virguleOK) {
                    switch (dernierCarac) {
                        case "+":
                        case "-":
                        case "*":
                        case "/":
                        case ".":
                            break;
                        default :
                            dernierCarac = ".";
                            TV_affiche.setText(TV_affiche.getText() + dernierCarac);
                            virguleOK = false;
                            break;
                    }
                }
                break;
            case R.id.bt_additionner:
                if (TV_affiche.getText().toString().length() > 0) {
                    switch (dernierCarac) {
                        case "+":
                        case "-":
                        case "*":
                        case "/":
                        case ".":
                            TV_affiche.setText(TV_affiche.getText().toString().substring(0, TV_affiche.getText().toString().length() - 1));
                            break;
                    }
                    dernierCarac = "+";
                    TV_affiche.setText(TV_affiche.getText() + dernierCarac);
                    virguleOK = true;
                }
                break;
            case R.id.bt_soustraire:
                if (TV_affiche.getText().toString().length() > 0) {
                    switch (dernierCarac) {
                        case "+":
                        case "-":
                        case "*":
                        case "/":
                        case ".":
                            TV_affiche.setText(TV_affiche.getText().toString().substring(0, TV_affiche.getText().toString().length() - 1));
                            break;
                    }

                    dernierCarac = "-";
                    TV_affiche.setText(TV_affiche.getText() + dernierCarac);
                    virguleOK = true;
                }
                break;
            case R.id.bt_multiplier:
                if (TV_affiche.getText().toString().length() > 0) {
                    switch (dernierCarac) {
                        case "+":
                        case "-":
                        case "*":
                        case "/":
                        case ".":
                            TV_affiche.setText(TV_affiche.getText().toString().substring(0, TV_affiche.getText().toString().length() - 1));
                            break;
                    }
                    dernierCarac = "*";
                    TV_affiche.setText(TV_affiche.getText() + dernierCarac);
                    virguleOK = true;
                }
                break;
            case R.id.bt_diviser:
                if (TV_affiche.getText().toString().length() > 0) {
                    switch (dernierCarac) {
                        case "+":
                        case "-":
                        case "*":
                        case "/":
                        case ".":
                            TV_affiche.setText(TV_affiche.getText().toString().substring(0, TV_affiche.getText().toString().length() - 1));
                            break;
                    }
                    dernierCarac = "/";
                    TV_affiche.setText(TV_affiche.getText() + dernierCarac);
                    virguleOK = true;
                }
                break;
            case R.id.bt_clear:
                TV_affiche.setText("");
                virguleOK = true;
                break;
            case R.id.bt_egal:
                Double calcul = eval(TV_affiche.getText().toString());
                TV_affiche.setText(String.valueOf(calcul));
                break;
            case R.id.bt_supprimer:
                if (TV_affiche.getText().toString().length() > 0) {
                    TV_affiche.setText(TV_affiche.getText().toString().substring(0, TV_affiche.getText().toString().length()-1));
                }
                dernierCarac = "";
                break;

            default:
                TV_affiche.setText("Error");
                break;
        }
    }


    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;
            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor
            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus
                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    switch (func) {
                        case "sqrt":
                            x = Math.sqrt(x);
                            break;
                        case "sin":
                            x = Math.sin(Math.toRadians(x));
                            break;
                        case "cos":
                            x = Math.cos(Math.toRadians(x));
                            break;
                        case "tan":
                            x = Math.tan(Math.toRadians(x));
                            break;
                        default:
                            throw new RuntimeException("Unknown function: " + func);
                    }
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation
                return x;
            }
        }.parse();
    }
}
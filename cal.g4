grammar                 cal;
prog:                   decl_list function_list main;

decl_list:              decl SemiColon decl_list
                        |;

decl:                   var_decl
                        | const_decl;

var_decl:               Var ID Colon type;

const_decl:             Const ID Colon type ASSIGNMENT expression;

function_list:          function function_list
                        |;

function:               type ID Lb param_list Rb
                        Lbrace
                        decl_list
                        statement_block
                        Return Lb ( expression | ) Rb SemiColon
                        Rbrace;

type:                   Integer | Boolean | Void;

param_list:             nemp_parameter_list
                        |;

nemp_parameter_list:    ID Colon type
                        | ID Colon type Comma nemp_parameter_list;

main:                   Main Lbrace decl_list statement_block Rbrace;

statement_block:        statement statement_block | empty_statement;

statement:              ID ASSIGNMENT expression SemiColon
                        | ID ( arg_list ) SemiColon
                        | Lbrace statement_block Rbrace
                        | If condition Lbrace statement_block Rbrace Else Lbrace statement_block Rbrace
                        | While condition Lbrace statement_block Rbrace
                        | Skip SemiColon;

expression:             frgmnt binary_arith_op frgmnt
                        | Lb expression Rb
                        | ID Lb arg_list Rb
                        | frgmnt;


binary_arith_op:        PLUS | <assoc=right> MINUS;

comp_op:                EQUAL
                        | NOTEQUAL
                        | Less_Than
                        | Less_ThanE
                        | Greater
                        | GreaterE;

frgmnt:                   ID
                        | MINUS ID
                        | NUMBER
                        | True
                        | False
                        | frgmnt binary_arith_op frgmnt 
                        | Lb expression Rb 
                        | ID Lb arg_list Rb;

condition:              NEGATION condition
                        | Lb condition Rb
                        | expression comp_op expression
                        | condition (OR | AND) condition;

arg_list:               nemp_arg_list
                        | empty_arg_list;

nemp_arg_list:          ID
                        | ID Comma nemp_arg_list;

empty_statement:        ;

empty_arg_list:         ;

Var:                    V A R;
Const:                  C O N S T;
Return:                 R E T U R N;
Integer:                I N T E G E R;
Boolean:                B O O L E A N;
Void:                   V O I D;
Main:                   M A I N;
If:                     I F;
Else:                   E L S E;
True:                   T R U E;
False:                  F A L S E;
While:                  W H I L E;
Skip:                   S K I P;

SemiColon:              ';';
Colon:                  ':';
Comma:                  ',';
Lbrace:                 '{';
Rbrace:                 '}';
Lsb:                    '[';
RSb:                    ']';
Lb:                     '(';
Rb:                     ')';
MINUS:                  '-';
PLUS:                   '+';
ASSIGNMENT:             '=';
NEGATION:               '~';
OR:                     '||';
AND:                    '&&';
EQUAL:                  '==';
NOTEQUAL:               '!=';
Less_Than:              '<';
Less_ThanE:             '<=';
Greater:                '>';
GreaterE:               '>=';
ID:                     Letter (Letter | Digit | UnderScore)*;
NUMBER:                 MINUS? ( Digit | NonZero Digit+ );
BOOLEAN:                'true' | 'false';
Multi_Comment:          '/*' (Multi_Comment|.)*? '*/' -> skip;
Single_Comment:         '//' .*? '\n' -> skip;
WhiteSpace:             [ \t\n\r]+ -> skip;

fragment A:             'a' | 'A';
fragment B:             'b' | 'B';
fragment C:             'c' | 'C';
fragment D:             'd' | 'D';
fragment E:             'e' | 'E';
fragment F:             'f' | 'F';
fragment G:             'g' | 'G';
fragment H:             'h' | 'H';
fragment I:             'i' | 'I';
fragment K:             'k' | 'K';
fragment L:             'l' | 'L';
fragment M:             'm' | 'M';
fragment N:             'n' | 'N';
fragment O:             'o' | 'O';
fragment P:             'p' | 'P';
fragment R:             'r' | 'R';
fragment S:             's' | 'S';
fragment T:             't' | 'T';
fragment U:             'u' | 'U';
fragment V:             'v' | 'V';
fragment W:             'w' | 'W';

fragment Letter:        [a-zA-Z];
fragment Digit:         [0-9];
fragment NonZero:       [1-9];
fragment UnderScore:    '_';
fragment Dot:           '.';

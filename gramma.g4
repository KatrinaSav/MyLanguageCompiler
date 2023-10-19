grammar gramma;

program : func* (assign N)* START ':' N ( stat)* EOF;

stat: TAB+ (assign|action) N;
math: ID (INCR|DECR);
expr: expr binary expr|form|par;

const: d = '{' (STRING | ID) '}'                        // задание констант
    | n ='[' (STRING | ID) ':'( STRING  | ID) ']'
    | a = '<' ( STRING | ID) ':'( STRING  | ID) '>'
    | s = STRING
    | i = INT
    | YES
    | NO ;
func : type ID '(' (type ID(',' type ID)*)? ')'N stat+ ; // объявление функции
return: RETURN expr;                                       // return

call: ID '('( expr(','expr)*)? ')';                     // вызов функции
cast: (ND|DOC|TXT)'('(ID|const|cast)')';                // приведение типов
infunc: '.' funcname'('(form (',' form)*)?')';          // вызов встроенной функции
funcname: SETROOT|GETROOT|EDIT|FIND;                    // перечень встроенных функций
par: '(' expr ')';
comand:'.' namecom = (VALUE|INTEXT|CHILDREN|ATTRS|NAME); // вызов встроенных
if: IF '(' boolexpr ')' THEN N (stat)+ TAB+ END else?;
else: N TAB+ ELSE N (stat)+ TAB+ END;
part:ID'=' expr|math;
for: FOR '(' part ',' boolexpr ','
part ')' N (stat)+ TAB+ END ;

binary: '+'|'-';
in: type '.' READ '('form?')';
out: (ID|form) '.' WRITE
'('form?')';
boolexpr: boolexpr (AND|OR) boolexpr| expr logop = ('=='|'!='|'<'|'>'
|'>='|'<=') expr;
while: WHILE '('boolexpr ')' DO N
(stat)* TAB+ END  ;
until:  UNTIL '('boolexpr ')' DO N
(stat)* TAB+ END  ;
type: 'number'
    | 'document'
    | 'text'
    | 'node'
    | 'attribute'
    | 'bool' ;
chindex: '[' expr ']';
atindex: '<' expr '>';
assign: ID(','ID)*'='
(in|math|expr|call)(','(in|math|expr|call))*;
action: return|math|if|for|while|until|out;
form: (ID|cast|call|const|allindex)
(comand|infunc)?;
allindex: ID(chindex|atindex|chindex atindex);


AND : 'and' ;
OR : 'or' ;
NOT : '!=' ;
EQ : '=' ;
COMPARE: '==';
EQGR: '>=';
EQLT: '<=';
INCR: '>>';
DECR: '<<';
COMMA : ',' ;
SEMI : ';' ;
DOT : '.';
LPAREN : '(' ;
RPAREN : ')' ;
LCURLY : '{' ;
RCURLY : '}' ;
LANGLE : '<' ;
RANGLE : '>' ;
QUOTES : '"' ;
DOC: 'doc';
ND: 'nd';
TXT: 'txt';
STRING: '"'[a-zA-Z_.: 0-9]*'"';
PLUS : '+';
MINUS : '-';
MULT : '*';
DEVISION : '/';
LSQUARE : '[';
RSQUARE : ']';
COLON: ':';
NUMBER : 'number' ;
DOCUMENT : 'document';
NODE : 'node';
ATTR : 'attribute';
TEXT : 'text' ;
BOOL : 'bool';
YES : 'yes';
NO : 'net';
IF: 'if';
FOR: 'for';
THEN: 'then';
ELSE: 'else';
START: 'Start';
VALUE: 'value';
NAME: 'name';
INTEXT: 'in_text';
SETROOT: 'set_root';
GETROOT: 'get_root';
RETURN: 'return';
WHILE: 'while';
UNTIL: 'until';
EDIT: 'edit';
FIND: 'find';
END: 'end';
DO: 'do';

CHILDREN: 'children';
ATTRS: 'attributes';
READ: 'read';
WRITE: 'write';
ID: [a-zA-Z_][a-zA-Z_0-9]* ;
INT : [0-9]+ ;
TAB: '    '|'\t';
N: ('\n')+ ;
WSS: '\r' -> skip;
WS: ' ' -> skip;
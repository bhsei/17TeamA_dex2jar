// $ANTLR 3.5.2 com\\googlecode\\d2j\\jasmin\\Jasmin.g 2017-03-13 17:13:00

package com.googlecode.d2j.jasmin;
import java.util.List;
import java.util.ArrayList;
import java.math.BigInteger;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import static org.objectweb.asm.Opcodes.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class JasminParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACC", "AND", "ANNOTATION_VISIBLITY", 
		"ARRAY_AND", "ARRAY_AT", "ARRAY_B", "ARRAY_C", "ARRAY_D", "ARRAY_F", "ARRAY_I", 
		"ARRAY_J", "ARRAY_LOW_C", "ARRAY_LOW_E", "ARRAY_LOW_S", "ARRAY_S", "ARRAY_Z", 
		"AT", "COMMENT", "DEFAULT", "DOUBLE", "DSTRING", "ESC_SEQ", "EXPONENT", 
		"FLOAT", "FLOAT_NENT", "FRAGMENT_OBJECT_TYPE", "FRAGMENT_PRIMITIVE_TYPE", 
		"FROM", "F_DOUBLE", "F_FLOAT", "F_ID_FOLLOWS", "F_INFINITY", "F_NAN", 
		"HEX_DIGIT", "HIGH", "ID", "IIOP", "INNER", "INT", "INT_NENT", "INVOKEDYNAMIC", 
		"INVOKEINTERFACE", "IOP", "JOP", "LDC", "LEFT_PAREN", "LOCALS", "LONG", 
		"LOOKUPSWITCH", "METHOD_ANNOTATION_VISIBLITY", "METHOD_DESC_WITHOUT_RET", 
		"MULTIANEWARRAY", "OBJECT_TYPE", "OP0", "OUTTER", "PARRAY_TYPE", "RIGHT_PAREN", 
		"STACK", "STRING", "TABLESWITCH", "TO", "UP_B", "UP_C", "UP_D", "UP_F", 
		"UP_I", "UP_J", "UP_S", "UP_Z", "USING", "VOID_TYPE", "WBOOLEAN", "WBYTE", 
		"WCHAR", "WDOUBLE", "WFLOAT", "WINTEGER", "WLONG", "WS", "WSHORT", "XFIELD", 
		"XINVOKE", "XNEWARRAY", "XTYPE", "','", "'->'", "'.ann_kind'", "'.annot_elem'", 
		"'.annotation'", "'.annotation_attr'", "'.annotation_default'", "'.arr_elem'", 
		"'.arr_kind'", "'.attribute'", "'.bool_kind'", "'.byte_kind'", "'.bytecode'", 
		"'.catch'", "'.char_kind'", "'.class'", "'.class_attribute'", "'.cls_kind'", 
		"'.code_attribute'", "'.debug'", "'.deprecated'", "'.doub_kind'", "'.elem'", 
		"'.enclosing method'", "'.enclosing_method_attr'", "'.end annotation'", 
		"'.end field'", "'.end method'", "'.end'", "'.enum_kind'", "'.field'", 
		"'.field_attribute'", "'.float_kind'", "'.implements'", "'.inner class'", 
		"'.inner_class_attr'", "'.inner_class_spec_attr'", "'.int_kind'", "'.interface'", 
		"'.limit'", "'.line'", "'.long_kind'", "'.method'", "'.method_attribute'", 
		"'.no_super'", "'.param'", "'.runtime_invisible_annotation'", "'.runtime_visible_annotation'", 
		"'.short_kind'", "'.signature'", "'.signature_attr'", "'.source'", "'.str_kind'", 
		"'.super'", "'.synthetic'", "'.throws'", "'.var'", "'/'", "':'", "';'", 
		"'='", "'?'", "'is'", "'signature'"
	};
	public static final int EOF=-1;
	public static final int T__88=88;
	public static final int T__89=89;
	public static final int T__90=90;
	public static final int T__91=91;
	public static final int T__92=92;
	public static final int T__93=93;
	public static final int T__94=94;
	public static final int T__95=95;
	public static final int T__96=96;
	public static final int T__97=97;
	public static final int T__98=98;
	public static final int T__99=99;
	public static final int T__100=100;
	public static final int T__101=101;
	public static final int T__102=102;
	public static final int T__103=103;
	public static final int T__104=104;
	public static final int T__105=105;
	public static final int T__106=106;
	public static final int T__107=107;
	public static final int T__108=108;
	public static final int T__109=109;
	public static final int T__110=110;
	public static final int T__111=111;
	public static final int T__112=112;
	public static final int T__113=113;
	public static final int T__114=114;
	public static final int T__115=115;
	public static final int T__116=116;
	public static final int T__117=117;
	public static final int T__118=118;
	public static final int T__119=119;
	public static final int T__120=120;
	public static final int T__121=121;
	public static final int T__122=122;
	public static final int T__123=123;
	public static final int T__124=124;
	public static final int T__125=125;
	public static final int T__126=126;
	public static final int T__127=127;
	public static final int T__128=128;
	public static final int T__129=129;
	public static final int T__130=130;
	public static final int T__131=131;
	public static final int T__132=132;
	public static final int T__133=133;
	public static final int T__134=134;
	public static final int T__135=135;
	public static final int T__136=136;
	public static final int T__137=137;
	public static final int T__138=138;
	public static final int T__139=139;
	public static final int T__140=140;
	public static final int T__141=141;
	public static final int T__142=142;
	public static final int T__143=143;
	public static final int T__144=144;
	public static final int T__145=145;
	public static final int T__146=146;
	public static final int T__147=147;
	public static final int T__148=148;
	public static final int T__149=149;
	public static final int T__150=150;
	public static final int T__151=151;
	public static final int ACC=4;
	public static final int AND=5;
	public static final int ANNOTATION_VISIBLITY=6;
	public static final int ARRAY_AND=7;
	public static final int ARRAY_AT=8;
	public static final int ARRAY_B=9;
	public static final int ARRAY_C=10;
	public static final int ARRAY_D=11;
	public static final int ARRAY_F=12;
	public static final int ARRAY_I=13;
	public static final int ARRAY_J=14;
	public static final int ARRAY_LOW_C=15;
	public static final int ARRAY_LOW_E=16;
	public static final int ARRAY_LOW_S=17;
	public static final int ARRAY_S=18;
	public static final int ARRAY_Z=19;
	public static final int AT=20;
	public static final int COMMENT=21;
	public static final int DEFAULT=22;
	public static final int DOUBLE=23;
	public static final int DSTRING=24;
	public static final int ESC_SEQ=25;
	public static final int EXPONENT=26;
	public static final int FLOAT=27;
	public static final int FLOAT_NENT=28;
	public static final int FRAGMENT_OBJECT_TYPE=29;
	public static final int FRAGMENT_PRIMITIVE_TYPE=30;
	public static final int FROM=31;
	public static final int F_DOUBLE=32;
	public static final int F_FLOAT=33;
	public static final int F_ID_FOLLOWS=34;
	public static final int F_INFINITY=35;
	public static final int F_NAN=36;
	public static final int HEX_DIGIT=37;
	public static final int HIGH=38;
	public static final int ID=39;
	public static final int IIOP=40;
	public static final int INNER=41;
	public static final int INT=42;
	public static final int INT_NENT=43;
	public static final int INVOKEDYNAMIC=44;
	public static final int INVOKEINTERFACE=45;
	public static final int IOP=46;
	public static final int JOP=47;
	public static final int LDC=48;
	public static final int LEFT_PAREN=49;
	public static final int LOCALS=50;
	public static final int LONG=51;
	public static final int LOOKUPSWITCH=52;
	public static final int METHOD_ANNOTATION_VISIBLITY=53;
	public static final int METHOD_DESC_WITHOUT_RET=54;
	public static final int MULTIANEWARRAY=55;
	public static final int OBJECT_TYPE=56;
	public static final int OP0=57;
	public static final int OUTTER=58;
	public static final int PARRAY_TYPE=59;
	public static final int RIGHT_PAREN=60;
	public static final int STACK=61;
	public static final int STRING=62;
	public static final int TABLESWITCH=63;
	public static final int TO=64;
	public static final int UP_B=65;
	public static final int UP_C=66;
	public static final int UP_D=67;
	public static final int UP_F=68;
	public static final int UP_I=69;
	public static final int UP_J=70;
	public static final int UP_S=71;
	public static final int UP_Z=72;
	public static final int USING=73;
	public static final int VOID_TYPE=74;
	public static final int WBOOLEAN=75;
	public static final int WBYTE=76;
	public static final int WCHAR=77;
	public static final int WDOUBLE=78;
	public static final int WFLOAT=79;
	public static final int WINTEGER=80;
	public static final int WLONG=81;
	public static final int WS=82;
	public static final int WSHORT=83;
	public static final int XFIELD=84;
	public static final int XINVOKE=85;
	public static final int XNEWARRAY=86;
	public static final int XTYPE=87;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public JasminParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public JasminParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return JasminParser.tokenNames; }
	@Override public String getGrammarFileName() { return "com\\googlecode\\d2j\\jasmin\\Jasmin.g"; }


	    private static int versions[] = { 0, V1_1, V1_2, V1_3, V1_4, V1_5, V1_6, V1_7, 52 // V1_8 ?
	            , 53 // V1_9 ?
	    };
	    private ClassNode cn;
	    private FieldNode fn;
	    private MethodNode mn;
	    private String tmp;
	    private int tmpInt;
	    private String tmp2;
	    public boolean rebuildLine=false;
	    private java.util.Map<String, Label> labelMap = new java.util.HashMap<>();
	    private void reset0() {
	        cn = new ClassNode(ASM4);
	        fn = null;
	        mn = null;
	    }

	    static private int parseInt(String str, int start, int end) {
	        int sof = start;
	        int x = 1;
	        if (str.charAt(sof) == '+') {
	            sof++;
	        } else if (str.charAt(sof) == '-') {
	            sof++;
	            x = -1;
	        }
	        long v;
	        if (str.charAt(sof) == '0') {
	            sof++;
	            if (sof >= end) {
	                return 0;
	            }
	            char c = str.charAt(sof);
	            if (c == 'x' || c == 'X') {// hex
	                sof++;
	                v = Long.parseLong(str.substring(sof, end), 16);
	            } else {// oct
	                v = Long.parseLong(str.substring(sof, end), 8);
	            }
	        } else {
	            v = Long.parseLong(str.substring(sof, end), 10);
	        }
	        return (int) (v * x);
	    }

	    static private int parseInt(String str) {
	        return parseInt(str, 0, str.length());
	    }

	    static private Long parseLong(String str) {
	        int sof = 0;
	        int end = str.length() - 1;
	        int x = 1;
	        if (str.charAt(sof) == '+') {
	            sof++;
	        } else if (str.charAt(sof) == '-') {
	            sof++;
	            x = -1;
	        }
	        BigInteger v;
	        if (str.charAt(sof) == '0') {
	            sof++;
	            if (sof >= end) {
	                return 0L;
	            }
	            char c = str.charAt(sof);
	            if (c == 'x' || c == 'X') {// hex
	                sof++;
	                v = new BigInteger(str.substring(sof, end), 16);
	            } else {// oct
	                v = new BigInteger(str.substring(sof, end), 8);
	            }
	        } else {
	            v = new BigInteger(str.substring(sof, end), 10);
	        }
	        if (x == -1) {
	            return v.negate().longValue();
	        } else {
	            return v.longValue();
	        }
	    }

	    static private float parseFloat(String str) {
	        str = str.toLowerCase();
	        int s = 0;
	        float x = 1f;
	        if (str.charAt(s) == '+') {
	            s++;
	        } else if (str.charAt(s) == '-') {
	            s++;
	            x = -1;
	        }
	        int e = str.length() - 1;
	        if (str.charAt(e) == 'f') {
	            e--;
	        }
	        str = str.substring(s, e + 1);
	        if (str.equals("floatnan")) {
	            return Float.NaN;
	        }
	        if (str.equals("floatinfinity")) {
	            return x < 0 ? Float.NEGATIVE_INFINITY : Float.POSITIVE_INFINITY;
	        }
	        return (float) x * Float.parseFloat(str);
	    }

	    static private double parseDouble(String str) {
	        str = str.toLowerCase();
	        int s = 0;
	        double x = 1;
	        if (str.charAt(s) == '+') {
	            s++;
	        } else if (str.charAt(s) == '-') {
	            s++;
	            x = -1;
	        }
	        int e = str.length() - 1;
	        if (str.charAt(e) == 'd') {
	            e--;
	        }
	        str = str.substring(s, e + 1);
	        if (str.equals("doublenan")) {
	            return Double.NaN;
	        }
	        if (str.equals("doubleinfinity")) {
	            return x < 0 ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;
	        }
	        return x * Double.parseDouble(str);
	    }

	    private void line(int ln){
	         if(rebuildLine) {
	            Label label=new Label();
	            mn.visitLabel(label);
	            mn.visitLineNumber(ln, label);
	         }
	    }
	    private static String unEscapeString(String str) {
	        return unEscape0(str, 1, str.length() - 1);
	    }
	    private static String unEscape(String str) {
	            return unEscape0(str, 0, str.length());
	    }

	    private static String unEscape0(String str, int start, int end) {

	        StringBuilder sb = new StringBuilder();
	        for (int i = start; i < end;) {
	            char c = str.charAt(i);
	            if (c == '\\') {
	                char d = str.charAt(i + 1);
	                switch (d) {
	                // ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
	                case 'b':
	                    sb.append('\b');
	                    i += 2;
	                    break;
	                case 't':
	                    sb.append('\t');
	                    i += 2;
	                    break;
	                case 'n':
	                    sb.append('\n');
	                    i += 2;
	                    break;
	                case 'f':
	                    sb.append('\f');
	                    i += 2;
	                    break;
	                case 'r':
	                    sb.append('\r');
	                    i += 2;
	                    break;
	                case '\"':
	                    sb.append('\"');
	                    i += 2;
	                    break;
	                case '\'':
	                    sb.append('\'');
	                    i += 2;
	                    break;
	                case '\\':
	                    sb.append('\\');
	                    i += 2;
	                    break;
	                case 'u':
	                    String sub = str.substring(i + 2, i + 6);
	                    sb.append((char) Integer.parseInt(sub, 16));
	                    i += 6;
	                    break;
	                default:
	                    int x = 0;
	                    while (x < 3) {
	                        char e = str.charAt(i + 1 + x);
	                        if (e >= '0' && e <= '7') {
	                            x++;
	                        } else {
	                            break;
	                        }
	                    }
	                    if (x == 0) {
	                        throw new RuntimeException("can't pase string");
	                    }
	                    sb.append((char) Integer.parseInt(str.substring(i + 1, i + 1 + x), 8));
	                    i += 1 + x;
	                }

	            } else {
	                sb.append(c);
	                i++;
	            }
	        }
	        return sb.toString();
	    }

	    private static int getAcc(String name) {
	        if (name.equals("public")) {
	            return ACC_PUBLIC;
	        } else if (name.equals("private")) {
	            return ACC_PRIVATE;
	        } else if (name.equals("protected")) {
	            return ACC_PROTECTED;
	        } else if (name.equals("static")) {
	            return ACC_STATIC;
	        } else if (name.equals("final")) {
	            return ACC_FINAL;
	        } else if (name.equals("synchronized")) {
	            return ACC_SYNCHRONIZED;
	        } else if (name.equals("volatile")) {
	            return ACC_VOLATILE;
	        } else if (name.equals("bridge")) {
	            return ACC_BRIDGE;
	        } else if (name.equals("varargs")) {
	            return ACC_VARARGS;
	        } else if (name.equals("transient")) {
	            return ACC_TRANSIENT;
	        } else if (name.equals("native")) {
	            return ACC_NATIVE;
	        } else if (name.equals("interface")) {
	            return ACC_INTERFACE;
	        } else if (name.equals("abstract")) {
	            return ACC_ABSTRACT;
	        } else if (name.equals("strict")) {
	            return ACC_STRICT;
	        } else if (name.equals("strictfp")) {
	            return ACC_STRICT;
	        } else if (name.equals("synthetic")) {
	            return ACC_SYNTHETIC;
	        } else if (name.equals("annotation")) {
	            return ACC_ANNOTATION;
	        } else if (name.equals("enum")) {
	            return ACC_ENUM;
	        } else if (name.equals("super")) {
	            return ACC_SUPER;
	        }
	        throw new RuntimeException("not support access flags " + name);
	    }
	    private static int getOp(String str) {
	            switch (str) {
	            case "nop":
	                return Opcodes.NOP;
	            case "aconst_null":
	                return Opcodes.ACONST_NULL;
	            case "iconst_m1":
	                return Opcodes.ICONST_M1;
	            case "iconst_0":
	                return Opcodes.ICONST_0;
	            case "iconst_1":
	                return Opcodes.ICONST_1;
	            case "iconst_2":
	                return Opcodes.ICONST_2;
	            case "iconst_3":
	                return Opcodes.ICONST_3;
	            case "iconst_4":
	                return Opcodes.ICONST_4;
	            case "iconst_5":
	                return Opcodes.ICONST_5;
	            case "lconst_0":
	                return Opcodes.LCONST_0;
	            case "lconst_1":
	                return Opcodes.LCONST_1;
	            case "fconst_0":
	                return Opcodes.FCONST_0;
	            case "fconst_1":
	                return Opcodes.FCONST_1;
	            case "fconst_2":
	                return Opcodes.FCONST_2;
	            case "dconst_0":
	                return Opcodes.DCONST_0;
	            case "dconst_1":
	                return Opcodes.DCONST_1;
	            case "bipush":
	                return Opcodes.BIPUSH;
	            case "sipush":
	                return Opcodes.SIPUSH;
	            case "ldc_w":
	            case "ldc2_w":
	            case "ldc":
	                return Opcodes.LDC;
	            case "iload":
	                return Opcodes.ILOAD;
	            case "lload":
	                return Opcodes.LLOAD;
	            case "fload":
	                return Opcodes.FLOAD;
	            case "dload":
	                return Opcodes.DLOAD;
	            case "aload":
	                return Opcodes.ALOAD;
	            case "iaload":
	                return Opcodes.IALOAD;
	            case "laload":
	                return Opcodes.LALOAD;
	            case "faload":
	                return Opcodes.FALOAD;
	            case "daload":
	                return Opcodes.DALOAD;
	            case "aaload":
	                return Opcodes.AALOAD;
	            case "baload":
	                return Opcodes.BALOAD;
	            case "caload":
	                return Opcodes.CALOAD;
	            case "saload":
	                return Opcodes.SALOAD;
	            case "istore":
	                return Opcodes.ISTORE;
	            case "lstore":
	                return Opcodes.LSTORE;
	            case "fstore":
	                return Opcodes.FSTORE;
	            case "dstore":
	                return Opcodes.DSTORE;
	            case "astore":
	                return Opcodes.ASTORE;
	            case "iastore":
	                return Opcodes.IASTORE;
	            case "lastore":
	                return Opcodes.LASTORE;
	            case "fastore":
	                return Opcodes.FASTORE;
	            case "dastore":
	                return Opcodes.DASTORE;
	            case "aastore":
	                return Opcodes.AASTORE;
	            case "bastore":
	                return Opcodes.BASTORE;
	            case "castore":
	                return Opcodes.CASTORE;
	            case "sastore":
	                return Opcodes.SASTORE;
	            case "pop":
	                return Opcodes.POP;
	            case "pop2":
	                return Opcodes.POP2;
	            case "dup":
	                return Opcodes.DUP;
	            case "dup_x1":
	                return Opcodes.DUP_X1;
	            case "dup_x2":
	                return Opcodes.DUP_X2;
	            case "dup2":
	                return Opcodes.DUP2;
	            case "dup2_x1":
	                return Opcodes.DUP2_X1;
	            case "dup2_x2":
	                return Opcodes.DUP2_X2;
	            case "swap":
	                return Opcodes.SWAP;
	            case "iadd":
	                return Opcodes.IADD;
	            case "ladd":
	                return Opcodes.LADD;
	            case "fadd":
	                return Opcodes.FADD;
	            case "dadd":
	                return Opcodes.DADD;
	            case "isub":
	                return Opcodes.ISUB;
	            case "lsub":
	                return Opcodes.LSUB;
	            case "fsub":
	                return Opcodes.FSUB;
	            case "dsub":
	                return Opcodes.DSUB;
	            case "imul":
	                return Opcodes.IMUL;
	            case "lmul":
	                return Opcodes.LMUL;
	            case "fmul":
	                return Opcodes.FMUL;
	            case "dmul":
	                return Opcodes.DMUL;
	            case "idiv":
	                return Opcodes.IDIV;
	            case "ldiv":
	                return Opcodes.LDIV;
	            case "fdiv":
	                return Opcodes.FDIV;
	            case "ddiv":
	                return Opcodes.DDIV;
	            case "irem":
	                return Opcodes.IREM;
	            case "lrem":
	                return Opcodes.LREM;
	            case "frem":
	                return Opcodes.FREM;
	            case "drem":
	                return Opcodes.DREM;
	            case "ineg":
	                return Opcodes.INEG;
	            case "lneg":
	                return Opcodes.LNEG;
	            case "fneg":
	                return Opcodes.FNEG;
	            case "dneg":
	                return Opcodes.DNEG;
	            case "ishl":
	                return Opcodes.ISHL;
	            case "lshl":
	                return Opcodes.LSHL;
	            case "ishr":
	                return Opcodes.ISHR;
	            case "lshr":
	                return Opcodes.LSHR;
	            case "iushr":
	                return Opcodes.IUSHR;
	            case "lushr":
	                return Opcodes.LUSHR;
	            case "iand":
	                return Opcodes.IAND;
	            case "land":
	                return Opcodes.LAND;
	            case "ior":
	                return Opcodes.IOR;
	            case "lor":
	                return Opcodes.LOR;
	            case "ixor":
	                return Opcodes.IXOR;
	            case "lxor":
	                return Opcodes.LXOR;
	            case "iinc":
	                return Opcodes.IINC;
	            case "i2l":
	                return Opcodes.I2L;
	            case "i2f":
	                return Opcodes.I2F;
	            case "i2d":
	                return Opcodes.I2D;
	            case "l2i":
	                return Opcodes.L2I;
	            case "l2f":
	                return Opcodes.L2F;
	            case "l2d":
	                return Opcodes.L2D;
	            case "f2i":
	                return Opcodes.F2I;
	            case "f2l":
	                return Opcodes.F2L;
	            case "f2d":
	                return Opcodes.F2D;
	            case "d2i":
	                return Opcodes.D2I;
	            case "d2l":
	                return Opcodes.D2L;
	            case "d2f":
	                return Opcodes.D2F;
	            case "i2b":
	                return Opcodes.I2B;
	            case "i2c":
	                return Opcodes.I2C;
	            case "i2s":
	                return Opcodes.I2S;
	            case "lcmp":
	                return Opcodes.LCMP;
	            case "fcmpl":
	                return Opcodes.FCMPL;
	            case "fcmpg":
	                return Opcodes.FCMPG;
	            case "dcmpl":
	                return Opcodes.DCMPL;
	            case "dcmpg":
	                return Opcodes.DCMPG;
	            case "ifeq":
	                return Opcodes.IFEQ;
	            case "ifne":
	                return Opcodes.IFNE;
	            case "iflt":
	                return Opcodes.IFLT;
	            case "ifge":
	                return Opcodes.IFGE;
	            case "ifgt":
	                return Opcodes.IFGT;
	            case "ifle":
	                return Opcodes.IFLE;
	            case "if_icmpeq":
	                return Opcodes.IF_ICMPEQ;
	            case "if_icmpne":
	                return Opcodes.IF_ICMPNE;
	            case "if_icmplt":
	                return Opcodes.IF_ICMPLT;
	            case "if_icmpge":
	                return Opcodes.IF_ICMPGE;
	            case "if_icmpgt":
	                return Opcodes.IF_ICMPGT;
	            case "if_icmple":
	                return Opcodes.IF_ICMPLE;
	            case "if_acmpeq":
	                return Opcodes.IF_ACMPEQ;
	            case "if_acmpne":
	                return Opcodes.IF_ACMPNE;
	            case "goto":
	                return Opcodes.GOTO;
	            case "jsr":
	                return Opcodes.JSR;
	            case "ret":
	                return Opcodes.RET;
	            case "tableswitch":
	                return Opcodes.TABLESWITCH;
	            case "lookupswitch":
	                return Opcodes.LOOKUPSWITCH;
	            case "ireturn":
	                return Opcodes.IRETURN;
	            case "lreturn":
	                return Opcodes.LRETURN;
	            case "freturn":
	                return Opcodes.FRETURN;
	            case "dreturn":
	                return Opcodes.DRETURN;
	            case "areturn":
	                return Opcodes.ARETURN;
	            case "return":
	                return Opcodes.RETURN;
	            case "getstatic":
	                return Opcodes.GETSTATIC;
	            case "putstatic":
	                return Opcodes.PUTSTATIC;
	            case "getfield":
	                return Opcodes.GETFIELD;
	            case "putfield":
	                return Opcodes.PUTFIELD;
	            case "invokevirtual":
	                return Opcodes.INVOKEVIRTUAL;
	            case "invokespecial":
	                return Opcodes.INVOKESPECIAL;
	            case "invokestatic":
	                return Opcodes.INVOKESTATIC;
	            case "invokeinterface":
	                return Opcodes.INVOKEINTERFACE;
	            case "invokedynamic":
	                return Opcodes.INVOKEDYNAMIC;
	            case "new":
	                return Opcodes.NEW;
	            case "newarray":
	                return Opcodes.NEWARRAY;
	            case "anewarray":
	                return Opcodes.ANEWARRAY;
	            case "arraylength":
	                return Opcodes.ARRAYLENGTH;
	            case "athrow":
	                return Opcodes.ATHROW;
	            case "checkcast":
	                return Opcodes.CHECKCAST;
	            case "instanceof":
	                return Opcodes.INSTANCEOF;
	            case "monitorenter":
	                return Opcodes.MONITORENTER;
	            case "monitorexit":
	                return Opcodes.MONITOREXIT;
	            case "multianewarray":
	                return Opcodes.MULTIANEWARRAY;
	            case "ifnull":
	                return Opcodes.IFNULL;
	            case "ifnonnull":
	                return Opcodes.IFNONNULL;
	            case "iload_0":
	                return 26;
	            case "iload_1":
	                return 27;
	            case "iload_2":
	                return 28;
	            case "iload_3":
	                return 29;
	            case "lload_0":
	                return 30;
	            case "lload_1":
	                return 31;
	            case "lload_2":
	                return 32;
	            case "lload_3":
	                return 33;
	            case "fload_0":
	                return 34;
	            case "fload_1":
	                return 35;
	            case "fload_2":
	                return 36;
	            case "fload_3":
	                return 37;
	            case "dload_0":
	                return 38;
	            case "dload_1":
	                return 39;
	            case "dload_2":
	                return 40;
	            case "dload_3":
	                return 41;
	            case "aload_0":
	                return 42;
	            case "aload_1":
	                return 43;
	            case "aload_2":
	                return 44;
	            case "aload_3":
	                return 45;
	            case "istore_0":
	                return 59;
	            case "istore_1":
	                return 60;
	            case "istore_2":
	                return 61;
	            case "istore_3":
	                return 62;
	            case "lstore_0":
	                return 63;
	            case "lstore_1":
	                return 64;
	            case "lstore_2":
	                return 65;
	            case "lstore_3":
	                return 66;
	            case "fstore_0":
	                return 67;
	            case "fstore_1":
	                return 68;
	            case "fstore_2":
	                return 69;
	            case "fstore_3":
	                return 70;
	            case "dstore_0":
	                return 71;
	            case "dstore_1":
	                return 72;
	            case "dstore_2":
	                return 73;
	            case "dstore_3":
	                return 74;
	            case "astore_0":
	                return 75;
	            case "astore_1":
	                return 76;
	            case "astore_2":
	                return 77;
	            case "astore_3":
	                return 78;
	            }
	            return 0;
	        }

	    private String[] parseOwnerAndName(String str) {
	        int x=str.lastIndexOf('/');
	        if(x>0){
	        return new String[]{ unEscape0(str,0,x), unEscape0(str,x+1,str.length()) };
	        }
	        throw new RuntimeException("can't get owner and type from '"+str+"'");
	    }

	    public Object parseValue(String desc, Object v) {
	        switch(desc) {
	        case "Z": return ((Number)v).intValue()!=0;
	        case "B": return ((Number)v).byteValue();
	        case "S": return ((Number)v).shortValue();
	        case "I": return ((Number)v).intValue();
	        case "F": return ((Number)v).floatValue();
	        case "D": return ((Number)v).doubleValue();
	        case "J": return ((Number)v).longValue();
	        case "C": return (char)((Number)v).intValue();
	        }
	        return v;
	    }

	    static class AV {
	        public AnnotationNode visitAnnotation(final String desc, final boolean visible) {
	            return null;
	        };

	        public AnnotationNode visitParameterAnnotation(final int parameter, final String desc, final boolean visible) {
	            return null;
	        }
	    }

	    AV cnv = new AV() {
	        public AnnotationNode visitAnnotation(final String desc, final boolean visible) {
	            return (AnnotationNode) cn.visitAnnotation(desc, visible);
	        }
	    };
	    AV fnv = new AV() {
	        public AnnotationNode visitAnnotation(final String desc, final boolean visible) {
	            return (AnnotationNode) fn.visitAnnotation(desc, visible);
	        }
	    };
	    AV mnv = new AV() {
	        public AnnotationNode visitAnnotation(final String desc, final boolean visible) {
	            return (AnnotationNode) mn.visitAnnotation(desc, visible);
	        }

	        public AnnotationNode visitParameterAnnotation(final int parameter, final String desc, final boolean visible) {
	            return (AnnotationNode) mn.visitParameterAnnotation(parameter, desc, visible);
	        }
	    };
	    private void visitOP0(int op){
	    if(op>=26&&op<=45){    // xload_y
	            int x=op-26;
	            mn.visitVarInsn(ILOAD+x/4,x%4);
	            }else if(op>=59&&op<=78){    // xstore_y
	                     int x=op-26;
	                     mn.visitVarInsn(ISTORE+x/4,x%4);
	            }else{
	        mn.visitInsn(op);
	        }
	    }
	    private void visitIOP(int op, int a){
	         // xstore
	         // xload
	         if(op>=21&&op<=58){
	         mn.visitVarInsn(op,a);
	         }  else {
	         // xipush
	         mn.visitIntInsn(op,a);
	         }
	    }
	    private void visitJOP(int op, Label label){
	        mn.visitJumpInsn(op,label);
	    }
	    private void visitIIOP(int op, int a, int b){
	        mn.visitIincInsn(a,b);
	    }
	    private Label getLabel(String name){
	    Label label=labelMap.get(name);
	    if(label==null){
	    label= new Label();
	    labelMap.put(name,label);
	    }
	        return  label;
	    }
	    public void accept(ClassVisitor cv) throws RecognitionException{
	        sFile();
	        cn.accept(cv);
	    }
	    public ClassNode parse() throws RecognitionException {
	        sFile();
	        ClassNode cn=this.cn;
	        reset0();
	        return cn;
	    }
	    AV currentAv;
	    AnnotationNode currentAnnotationVisitor;



	// $ANTLR start "sFile"
	// com\\googlecode\\d2j\\jasmin\\Jasmin.g:962:1: sFile : ( sHead )+ ( sAnnotation | sVisibiltyAnnotation )* ( sField | sMethod )* ;
	public final void sFile() throws RecognitionException {
		try {
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:962:7: ( ( sHead )+ ( sAnnotation | sVisibiltyAnnotation )* ( sField | sMethod )* )
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:962:9: ( sHead )+ ( sAnnotation | sVisibiltyAnnotation )* ( sField | sMethod )*
			{
			 reset0(); currentAv=cnv; 
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:963:1: ( sHead )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==97||LA1_0==100||(LA1_0 >= 103 && LA1_0 <= 104)||(LA1_0 >= 107 && LA1_0 <= 108)||(LA1_0 >= 111 && LA1_0 <= 112)||(LA1_0 >= 121 && LA1_0 <= 123)||LA1_0==126||LA1_0==132||(LA1_0 >= 137 && LA1_0 <= 139)||(LA1_0 >= 141 && LA1_0 <= 142)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:963:1: sHead
					{
					pushFollow(FOLLOW_sHead_in_sFile2092);
					sHead();
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:963:8: ( sAnnotation | sVisibiltyAnnotation )*
			loop2:
			while (true) {
				int alt2=3;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==92) ) {
					alt2=1;
				}
				else if ( ((LA2_0 >= 134 && LA2_0 <= 135)) ) {
					alt2=2;
				}

				switch (alt2) {
				case 1 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:963:9: sAnnotation
					{
					pushFollow(FOLLOW_sAnnotation_in_sFile2096);
					sAnnotation();
					state._fsp--;

					}
					break;
				case 2 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:963:21: sVisibiltyAnnotation
					{
					pushFollow(FOLLOW_sVisibiltyAnnotation_in_sFile2098);
					sVisibiltyAnnotation();
					state._fsp--;

					}
					break;

				default :
					break loop2;
				}
			}

			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:963:44: ( sField | sMethod )*
			loop3:
			while (true) {
				int alt3=3;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==118) ) {
					alt3=1;
				}
				else if ( (LA3_0==130) ) {
					alt3=2;
				}

				switch (alt3) {
				case 1 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:963:45: sField
					{
					pushFollow(FOLLOW_sField_in_sFile2103);
					sField();
					state._fsp--;

					}
					break;
				case 2 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:963:52: sMethod
					{
					pushFollow(FOLLOW_sMethod_in_sFile2105);
					sMethod();
					state._fsp--;

					}
					break;

				default :
					break loop3;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "sFile"



	// $ANTLR start "sHead"
	// com\\googlecode\\d2j\\jasmin\\Jasmin.g:965:1: sHead : ( '.bytecode' (a= INT |a= DOUBLE ) | '.source' aa4= sAnyIdOrString | '.class' i= sAccList a1= sInternalNameOrDesc | '.interface' i= sAccList a1= sInternalNameOrDesc | '.super' a1= sInternalNameOrDescACC | '.implements' a1= sInternalNameOrDescACC | '.enclosing method' ownerAndName= sOwnerAndName (b= sMethodDesc )? | sDeprecateAttr | '.debug' a= STRING | '.attribute' sId STRING | '.inner class' (i= sAccList sId )? ( 'inner' a3= sId )? ( 'outer' a4= sId )? | '.no_super' | '.class_attribute' sId STRING | '.enclosing_method_attr' a= STRING b1= STRING c= STRING | '.inner_class_attr' ( '.inner_class_spec_attr' a= STRING b2= STRING i= sAccList '.end' '.inner_class_spec_attr' )* '.end' '.inner_class_attr' |s= sSigAttr | sSynthetic );
	public final void sHead() throws RecognitionException {
		Token a=null;
		Token b1=null;
		Token c=null;
		Token b2=null;
		String aa4 =null;
		int i =0;
		String a1 =null;
		ParserRuleReturnScope ownerAndName =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope a3 =null;
		ParserRuleReturnScope a4 =null;
		String s =null;

		try {
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:965:9: ( '.bytecode' (a= INT |a= DOUBLE ) | '.source' aa4= sAnyIdOrString | '.class' i= sAccList a1= sInternalNameOrDesc | '.interface' i= sAccList a1= sInternalNameOrDesc | '.super' a1= sInternalNameOrDescACC | '.implements' a1= sInternalNameOrDescACC | '.enclosing method' ownerAndName= sOwnerAndName (b= sMethodDesc )? | sDeprecateAttr | '.debug' a= STRING | '.attribute' sId STRING | '.inner class' (i= sAccList sId )? ( 'inner' a3= sId )? ( 'outer' a4= sId )? | '.no_super' | '.class_attribute' sId STRING | '.enclosing_method_attr' a= STRING b1= STRING c= STRING | '.inner_class_attr' ( '.inner_class_spec_attr' a= STRING b2= STRING i= sAccList '.end' '.inner_class_spec_attr' )* '.end' '.inner_class_attr' |s= sSigAttr | sSynthetic )
			int alt10=17;
			switch ( input.LA(1) ) {
			case 100:
				{
				alt10=1;
				}
				break;
			case 139:
				{
				alt10=2;
				}
				break;
			case 103:
				{
				alt10=3;
				}
				break;
			case 126:
				{
				alt10=4;
				}
				break;
			case 141:
				{
				alt10=5;
				}
				break;
			case 121:
				{
				alt10=6;
				}
				break;
			case 111:
				{
				alt10=7;
				}
				break;
			case 108:
				{
				alt10=8;
				}
				break;
			case 107:
				{
				alt10=9;
				}
				break;
			case 97:
				{
				alt10=10;
				}
				break;
			case 122:
				{
				alt10=11;
				}
				break;
			case 132:
				{
				alt10=12;
				}
				break;
			case 104:
				{
				alt10=13;
				}
				break;
			case 112:
				{
				alt10=14;
				}
				break;
			case 123:
				{
				alt10=15;
				}
				break;
			case 137:
			case 138:
				{
				alt10=16;
				}
				break;
			case 142:
				{
				alt10=17;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:965:12: '.bytecode' (a= INT |a= DOUBLE )
					{
					match(input,100,FOLLOW_100_in_sHead2119); 
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:965:24: (a= INT |a= DOUBLE )
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==INT) ) {
						alt4=1;
					}
					else if ( (LA4_0==DOUBLE) ) {
						alt4=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 4, 0, input);
						throw nvae;
					}

					switch (alt4) {
						case 1 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:965:26: a= INT
							{
							a=(Token)match(input,INT,FOLLOW_INT_in_sHead2125); 
							 int v=parseInt((a!=null?a.getText():null)); cn.version=versions[v>=45?v-45:v];
							}
							break;
						case 2 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:966:26: a= DOUBLE
							{
							a=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_sHead2156); 
							double v=parseDouble((a!=null?a.getText():null)); cn.version=versions[(int)(v<2.0?(v*10)%10:(v-44))]; 
							}
							break;

					}

					}
					break;
				case 2 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:968:12: '.source' aa4= sAnyIdOrString
					{
					match(input,139,FOLLOW_139_in_sHead2196); 
					pushFollow(FOLLOW_sAnyIdOrString_in_sHead2200);
					aa4=sAnyIdOrString();
					state._fsp--;

					 cn.sourceFile=aa4; 
					}
					break;
				case 3 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:969:6: '.class' i= sAccList a1= sInternalNameOrDesc
					{
					match(input,103,FOLLOW_103_in_sHead2210); 
					pushFollow(FOLLOW_sAccList_in_sHead2214);
					i=sAccList();
					state._fsp--;

					cn.access|=i; if ((cn.access & Opcodes.ACC_INTERFACE) == 0) {cn.access |= Opcodes.ACC_SUPER;} else { cn.access &= ~Opcodes.ACC_SUPER; } 
					pushFollow(FOLLOW_sInternalNameOrDesc_in_sHead2220);
					a1=sInternalNameOrDesc();
					state._fsp--;

					 cn.name=Type.getType(a1).getInternalName(); 
					}
					break;
				case 4 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:970:6: '.interface' i= sAccList a1= sInternalNameOrDesc
					{
					match(input,126,FOLLOW_126_in_sHead2229); 
					pushFollow(FOLLOW_sAccList_in_sHead2233);
					i=sAccList();
					state._fsp--;

					cn.access|=ACC_INTERFACE|i;
					pushFollow(FOLLOW_sInternalNameOrDesc_in_sHead2239);
					a1=sInternalNameOrDesc();
					state._fsp--;

					 cn.name=Type.getType(a1).getInternalName(); 
					}
					break;
				case 5 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:971:6: '.super' a1= sInternalNameOrDescACC
					{
					match(input,141,FOLLOW_141_in_sHead2248); 
					pushFollow(FOLLOW_sInternalNameOrDescACC_in_sHead2252);
					a1=sInternalNameOrDescACC();
					state._fsp--;

					  cn.superName=Type.getType(a1).getInternalName(); 
					}
					break;
				case 6 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:972:6: '.implements' a1= sInternalNameOrDescACC
					{
					match(input,121,FOLLOW_121_in_sHead2262); 
					pushFollow(FOLLOW_sInternalNameOrDescACC_in_sHead2266);
					a1=sInternalNameOrDescACC();
					state._fsp--;

					 if(cn.interfaces==null){cn.interfaces=new ArrayList<>();}  cn.interfaces.add(Type.getType(a1).getInternalName()); 
					}
					break;
				case 7 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:973:6: '.enclosing method' ownerAndName= sOwnerAndName (b= sMethodDesc )?
					{
					match(input,111,FOLLOW_111_in_sHead2275); 
					pushFollow(FOLLOW_sOwnerAndName_in_sHead2279);
					ownerAndName=sOwnerAndName();
					state._fsp--;

					tmp=null;
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:973:65: (b= sMethodDesc )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==METHOD_DESC_WITHOUT_RET) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:973:66: b= sMethodDesc
							{
							pushFollow(FOLLOW_sMethodDesc_in_sHead2286);
							b=sMethodDesc();
							state._fsp--;

							tmp=(b!=null?input.toString(b.start,b.stop):null);
							}
							break;

					}

					cn.visitOuterClass((ownerAndName!=null?((JasminParser.sOwnerAndName_return)ownerAndName).ownerInternalName:null),(ownerAndName!=null?((JasminParser.sOwnerAndName_return)ownerAndName).memberName:null),tmp);
					}
					break;
				case 8 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:974:6: sDeprecateAttr
					{
					pushFollow(FOLLOW_sDeprecateAttr_in_sHead2298);
					sDeprecateAttr();
					state._fsp--;

					 cn.access|=ACC_DEPRECATED; 
					}
					break;
				case 9 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:975:6: '.debug' a= STRING
					{
					match(input,107,FOLLOW_107_in_sHead2308); 
					a=(Token)match(input,STRING,FOLLOW_STRING_in_sHead2312); 
					 cn.sourceDebug=unEscapeString((a!=null?a.getText():null)); 
					}
					break;
				case 10 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:976:6: '.attribute' sId STRING
					{
					match(input,97,FOLLOW_97_in_sHead2322); 
					pushFollow(FOLLOW_sId_in_sHead2324);
					sId();
					state._fsp--;

					match(input,STRING,FOLLOW_STRING_in_sHead2326); 
					 System.err.println("ignore .attribute"); 
					}
					break;
				case 11 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:977:6: '.inner class' (i= sAccList sId )? ( 'inner' a3= sId )? ( 'outer' a4= sId )?
					{
					match(input,122,FOLLOW_122_in_sHead2339); 
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:977:21: (i= sAccList sId )?
					int alt6=2;
					switch ( input.LA(1) ) {
						case ACC:
						case AND:
						case ANNOTATION_VISIBLITY:
						case AT:
						case DEFAULT:
						case FROM:
						case HIGH:
						case ID:
						case IIOP:
						case INVOKEDYNAMIC:
						case INVOKEINTERFACE:
						case IOP:
						case JOP:
						case LDC:
						case LOCALS:
						case LOOKUPSWITCH:
						case METHOD_ANNOTATION_VISIBLITY:
						case MULTIANEWARRAY:
						case OP0:
						case STACK:
						case TABLESWITCH:
						case TO:
						case UP_B:
						case UP_C:
						case UP_D:
						case UP_F:
						case UP_I:
						case UP_J:
						case UP_S:
						case UP_Z:
						case USING:
						case VOID_TYPE:
						case WBOOLEAN:
						case WBYTE:
						case WCHAR:
						case WDOUBLE:
						case WFLOAT:
						case WINTEGER:
						case WLONG:
						case WSHORT:
						case XFIELD:
						case XINVOKE:
						case XNEWARRAY:
						case XTYPE:
							{
							alt6=1;
							}
							break;
						case INNER:
							{
							switch ( input.LA(2) ) {
								case INNER:
									{
									int LA6_5 = input.LA(3);
									if ( (LA6_5==OUTTER) ) {
										int LA6_9 = input.LA(4);
										if ( (LA6_9==OUTTER) ) {
											int LA6_8 = input.LA(5);
											if ( ((LA6_8 >= AND && LA6_8 <= ANNOTATION_VISIBLITY)||LA6_8==AT||LA6_8==DEFAULT||LA6_8==FROM||(LA6_8 >= HIGH && LA6_8 <= INNER)||(LA6_8 >= INVOKEDYNAMIC && LA6_8 <= LDC)||LA6_8==LOCALS||(LA6_8 >= LOOKUPSWITCH && LA6_8 <= METHOD_ANNOTATION_VISIBLITY)||LA6_8==MULTIANEWARRAY||(LA6_8 >= OP0 && LA6_8 <= OUTTER)||LA6_8==STACK||(LA6_8 >= TABLESWITCH && LA6_8 <= WLONG)||(LA6_8 >= WSHORT && LA6_8 <= XTYPE)) ) {
												alt6=1;
											}
										}
										else if ( (LA6_9==EOF||LA6_9==92||LA6_9==97||LA6_9==100||(LA6_9 >= 103 && LA6_9 <= 104)||(LA6_9 >= 107 && LA6_9 <= 108)||(LA6_9 >= 111 && LA6_9 <= 112)||LA6_9==118||(LA6_9 >= 121 && LA6_9 <= 123)||LA6_9==126||LA6_9==130||LA6_9==132||(LA6_9 >= 134 && LA6_9 <= 135)||(LA6_9 >= 137 && LA6_9 <= 139)||(LA6_9 >= 141 && LA6_9 <= 142)) ) {
											alt6=1;
										}
									}
									else if ( ((LA6_5 >= AND && LA6_5 <= ANNOTATION_VISIBLITY)||LA6_5==AT||LA6_5==DEFAULT||LA6_5==FROM||(LA6_5 >= HIGH && LA6_5 <= INNER)||(LA6_5 >= INVOKEDYNAMIC && LA6_5 <= LDC)||LA6_5==LOCALS||(LA6_5 >= LOOKUPSWITCH && LA6_5 <= METHOD_ANNOTATION_VISIBLITY)||LA6_5==MULTIANEWARRAY||LA6_5==OP0||LA6_5==STACK||(LA6_5 >= TABLESWITCH && LA6_5 <= WLONG)||(LA6_5 >= WSHORT && LA6_5 <= XTYPE)) ) {
										alt6=1;
									}
									}
									break;
								case OUTTER:
									{
									int LA6_6 = input.LA(3);
									if ( (LA6_6==OUTTER) ) {
										int LA6_10 = input.LA(4);
										if ( (LA6_10==EOF||LA6_10==92||LA6_10==97||LA6_10==100||(LA6_10 >= 103 && LA6_10 <= 104)||(LA6_10 >= 107 && LA6_10 <= 108)||(LA6_10 >= 111 && LA6_10 <= 112)||LA6_10==118||(LA6_10 >= 121 && LA6_10 <= 123)||LA6_10==126||LA6_10==130||LA6_10==132||(LA6_10 >= 134 && LA6_10 <= 135)||(LA6_10 >= 137 && LA6_10 <= 139)||(LA6_10 >= 141 && LA6_10 <= 142)) ) {
											alt6=1;
										}
									}
									else if ( ((LA6_6 >= AND && LA6_6 <= ANNOTATION_VISIBLITY)||LA6_6==AT||LA6_6==DEFAULT||LA6_6==FROM||(LA6_6 >= HIGH && LA6_6 <= INNER)||(LA6_6 >= INVOKEDYNAMIC && LA6_6 <= LDC)||LA6_6==LOCALS||(LA6_6 >= LOOKUPSWITCH && LA6_6 <= METHOD_ANNOTATION_VISIBLITY)||LA6_6==MULTIANEWARRAY||LA6_6==OP0||LA6_6==STACK||(LA6_6 >= TABLESWITCH && LA6_6 <= WLONG)||(LA6_6 >= WSHORT && LA6_6 <= XTYPE)) ) {
										alt6=1;
									}
									}
									break;
								case EOF:
								case 92:
								case 97:
								case 100:
								case 103:
								case 104:
								case 107:
								case 108:
								case 111:
								case 112:
								case 118:
								case 121:
								case 122:
								case 123:
								case 126:
								case 130:
								case 132:
								case 134:
								case 135:
								case 137:
								case 138:
								case 139:
								case 141:
								case 142:
									{
									alt6=1;
									}
									break;
							}
							}
							break;
						case OUTTER:
							{
							switch ( input.LA(2) ) {
								case INNER:
									{
									int LA6_7 = input.LA(3);
									if ( ((LA6_7 >= AND && LA6_7 <= ANNOTATION_VISIBLITY)||LA6_7==AT||LA6_7==DEFAULT||LA6_7==FROM||(LA6_7 >= HIGH && LA6_7 <= INNER)||(LA6_7 >= INVOKEDYNAMIC && LA6_7 <= LDC)||LA6_7==LOCALS||(LA6_7 >= LOOKUPSWITCH && LA6_7 <= METHOD_ANNOTATION_VISIBLITY)||LA6_7==MULTIANEWARRAY||(LA6_7 >= OP0 && LA6_7 <= OUTTER)||LA6_7==STACK||(LA6_7 >= TABLESWITCH && LA6_7 <= WLONG)||(LA6_7 >= WSHORT && LA6_7 <= XTYPE)) ) {
										alt6=1;
									}
									}
									break;
								case OUTTER:
									{
									int LA6_8 = input.LA(3);
									if ( ((LA6_8 >= AND && LA6_8 <= ANNOTATION_VISIBLITY)||LA6_8==AT||LA6_8==DEFAULT||LA6_8==FROM||(LA6_8 >= HIGH && LA6_8 <= INNER)||(LA6_8 >= INVOKEDYNAMIC && LA6_8 <= LDC)||LA6_8==LOCALS||(LA6_8 >= LOOKUPSWITCH && LA6_8 <= METHOD_ANNOTATION_VISIBLITY)||LA6_8==MULTIANEWARRAY||(LA6_8 >= OP0 && LA6_8 <= OUTTER)||LA6_8==STACK||(LA6_8 >= TABLESWITCH && LA6_8 <= WLONG)||(LA6_8 >= WSHORT && LA6_8 <= XTYPE)) ) {
										alt6=1;
									}
									}
									break;
								case EOF:
								case 92:
								case 97:
								case 100:
								case 103:
								case 104:
								case 107:
								case 108:
								case 111:
								case 112:
								case 118:
								case 121:
								case 122:
								case 123:
								case 126:
								case 130:
								case 132:
								case 134:
								case 135:
								case 137:
								case 138:
								case 139:
								case 141:
								case 142:
									{
									alt6=1;
									}
									break;
							}
							}
							break;
					}
					switch (alt6) {
						case 1 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:977:22: i= sAccList sId
							{
							pushFollow(FOLLOW_sAccList_in_sHead2344);
							i=sAccList();
							state._fsp--;

							pushFollow(FOLLOW_sId_in_sHead2346);
							sId();
							state._fsp--;

							tmpInt=i;
							}
							break;

					}

					tmp=null;tmp2=null;
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:977:77: ( 'inner' a3= sId )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==INNER) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:977:78: 'inner' a3= sId
							{
							match(input,INNER,FOLLOW_INNER_in_sHead2354); 
							pushFollow(FOLLOW_sId_in_sHead2358);
							a3=sId();
							state._fsp--;

							tmp=(a3!=null?input.toString(a3.start,a3.stop):null);
							}
							break;

					}

					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:977:110: ( 'outer' a4= sId )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==OUTTER) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:977:111: 'outer' a4= sId
							{
							match(input,OUTTER,FOLLOW_OUTTER_in_sHead2364); 
							pushFollow(FOLLOW_sId_in_sHead2368);
							a4=sId();
							state._fsp--;

							tmp2=(a4!=null?input.toString(a4.start,a4.stop):null);
							}
							break;

					}

					 cn.visitInnerClass(null,tmp2,tmp,tmpInt); 
					}
					break;
				case 12 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:978:6: '.no_super'
					{
					match(input,132,FOLLOW_132_in_sHead2382); 
					cn.superName=null;
					}
					break;
				case 13 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:979:6: '.class_attribute' sId STRING
					{
					match(input,104,FOLLOW_104_in_sHead2391); 
					pushFollow(FOLLOW_sId_in_sHead2393);
					sId();
					state._fsp--;

					match(input,STRING,FOLLOW_STRING_in_sHead2395); 
					 System.err.println("ignore .class_attribute"); 
					}
					break;
				case 14 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:980:6: '.enclosing_method_attr' a= STRING b1= STRING c= STRING
					{
					match(input,112,FOLLOW_112_in_sHead2407); 
					a=(Token)match(input,STRING,FOLLOW_STRING_in_sHead2411); 
					b1=(Token)match(input,STRING,FOLLOW_STRING_in_sHead2415); 
					c=(Token)match(input,STRING,FOLLOW_STRING_in_sHead2419); 
					cn.visitOuterClass((a!=null?a.getText():null),(b1!=null?b1.getText():null),(c!=null?c.getText():null));
					}
					break;
				case 15 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:981:6: '.inner_class_attr' ( '.inner_class_spec_attr' a= STRING b2= STRING i= sAccList '.end' '.inner_class_spec_attr' )* '.end' '.inner_class_attr'
					{
					match(input,123,FOLLOW_123_in_sHead2430); 
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:981:26: ( '.inner_class_spec_attr' a= STRING b2= STRING i= sAccList '.end' '.inner_class_spec_attr' )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==124) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:981:27: '.inner_class_spec_attr' a= STRING b2= STRING i= sAccList '.end' '.inner_class_spec_attr'
							{
							match(input,124,FOLLOW_124_in_sHead2433); 
							a=(Token)match(input,STRING,FOLLOW_STRING_in_sHead2437); 
							b2=(Token)match(input,STRING,FOLLOW_STRING_in_sHead2441); 
							pushFollow(FOLLOW_sAccList_in_sHead2445);
							i=sAccList();
							state._fsp--;

							match(input,116,FOLLOW_116_in_sHead2447); 
							match(input,124,FOLLOW_124_in_sHead2449); 
							 cn.visitInnerClass(null,unEscape((a!=null?a.getText():null)),unEscape((b2!=null?b2.getText():null)),i); 
							}
							break;

						default :
							break loop9;
						}
					}

					match(input,116,FOLLOW_116_in_sHead2456); 
					match(input,123,FOLLOW_123_in_sHead2458); 
					}
					break;
				case 16 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:982:6: s= sSigAttr
					{
					pushFollow(FOLLOW_sSigAttr_in_sHead2467);
					s=sSigAttr();
					state._fsp--;

					 cn.signature=s; 
					}
					break;
				case 17 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:983:6: sSynthetic
					{
					pushFollow(FOLLOW_sSynthetic_in_sHead2477);
					sSynthetic();
					state._fsp--;

					cn.access|=ACC_SYNTHETIC;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "sHead"



	// $ANTLR start "sSigAttr"
	// com\\googlecode\\d2j\\jasmin\\Jasmin.g:985:1: sSigAttr returns [String sig] : ( '.signature_attr' | '.signature' ) a= STRING ;
	public final String sSigAttr() throws RecognitionException {
		String sig = null;


		Token a=null;

		try {
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:985:29: ( ( '.signature_attr' | '.signature' ) a= STRING )
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:985:31: ( '.signature_attr' | '.signature' ) a= STRING
			{
			if ( (input.LA(1) >= 137 && input.LA(1) <= 138) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			a=(Token)match(input,STRING,FOLLOW_STRING_in_sSigAttr2503); 
			 sig =unEscapeString((a!=null?a.getText():null)); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return sig;
	}
	// $ANTLR end "sSigAttr"



	// $ANTLR start "sDeprecateAttr"
	// com\\googlecode\\d2j\\jasmin\\Jasmin.g:986:1: sDeprecateAttr : '.deprecated' ;
	public final void sDeprecateAttr() throws RecognitionException {
		try {
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:986:15: ( '.deprecated' )
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:986:17: '.deprecated'
			{
			match(input,108,FOLLOW_108_in_sDeprecateAttr2510); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "sDeprecateAttr"



	// $ANTLR start "sSynthetic"
	// com\\googlecode\\d2j\\jasmin\\Jasmin.g:987:1: sSynthetic : '.synthetic' ;
	public final void sSynthetic() throws RecognitionException {
		try {
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:988:2: ( '.synthetic' )
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:988:4: '.synthetic'
			{
			match(input,142,FOLLOW_142_in_sSynthetic2518); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "sSynthetic"


	public static class sArrayType_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "sArrayType"
	// com\\googlecode\\d2j\\jasmin\\Jasmin.g:990:1: sArrayType : ( PARRAY_TYPE | ARRAY_Z | ARRAY_B | ARRAY_S | ARRAY_C | ARRAY_I | ARRAY_F | ARRAY_D | ARRAY_J );
	public final JasminParser.sArrayType_return sArrayType() throws RecognitionException {
		JasminParser.sArrayType_return retval = new JasminParser.sArrayType_return();
		retval.start = input.LT(1);

		try {
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:991:2: ( PARRAY_TYPE | ARRAY_Z | ARRAY_B | ARRAY_S | ARRAY_C | ARRAY_I | ARRAY_F | ARRAY_D | ARRAY_J )
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:
			{
			if ( (input.LA(1) >= ARRAY_B && input.LA(1) <= ARRAY_J)||(input.LA(1) >= ARRAY_S && input.LA(1) <= ARRAY_Z)||input.LA(1)==PARRAY_TYPE ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sArrayType"


	public static class sClassDesc_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "sClassDesc"
	// com\\googlecode\\d2j\\jasmin\\Jasmin.g:993:1: sClassDesc : ( sArrayType | OBJECT_TYPE | UP_Z | UP_B | UP_S | UP_C | UP_I | UP_J | UP_D | UP_F );
	public final JasminParser.sClassDesc_return sClassDesc() throws RecognitionException {
		JasminParser.sClassDesc_return retval = new JasminParser.sClassDesc_return();
		retval.start = input.LT(1);

		try {
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:994:2: ( sArrayType | OBJECT_TYPE | UP_Z | UP_B | UP_S | UP_C | UP_I | UP_J | UP_D | UP_F )
			int alt11=10;
			switch ( input.LA(1) ) {
			case ARRAY_B:
			case ARRAY_C:
			case ARRAY_D:
			case ARRAY_F:
			case ARRAY_I:
			case ARRAY_J:
			case ARRAY_S:
			case ARRAY_Z:
			case PARRAY_TYPE:
				{
				alt11=1;
				}
				break;
			case OBJECT_TYPE:
				{
				alt11=2;
				}
				break;
			case UP_Z:
				{
				alt11=3;
				}
				break;
			case UP_B:
				{
				alt11=4;
				}
				break;
			case UP_S:
				{
				alt11=5;
				}
				break;
			case UP_C:
				{
				alt11=6;
				}
				break;
			case UP_I:
				{
				alt11=7;
				}
				break;
			case UP_J:
				{
				alt11=8;
				}
				break;
			case UP_D:
				{
				alt11=9;
				}
				break;
			case UP_F:
				{
				alt11=10;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:994:4: sArrayType
					{
					pushFollow(FOLLOW_sArrayType_in_sClassDesc2554);
					sArrayType();
					state._fsp--;

					}
					break;
				case 2 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:994:15: OBJECT_TYPE
					{
					match(input,OBJECT_TYPE,FOLLOW_OBJECT_TYPE_in_sClassDesc2556); 
					}
					break;
				case 3 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:994:27: UP_Z
					{
					match(input,UP_Z,FOLLOW_UP_Z_in_sClassDesc2558); 
					}
					break;
				case 4 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:994:32: UP_B
					{
					match(input,UP_B,FOLLOW_UP_B_in_sClassDesc2560); 
					}
					break;
				case 5 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:994:37: UP_S
					{
					match(input,UP_S,FOLLOW_UP_S_in_sClassDesc2562); 
					}
					break;
				case 6 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:994:42: UP_C
					{
					match(input,UP_C,FOLLOW_UP_C_in_sClassDesc2564); 
					}
					break;
				case 7 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:994:47: UP_I
					{
					match(input,UP_I,FOLLOW_UP_I_in_sClassDesc2566); 
					}
					break;
				case 8 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:994:52: UP_J
					{
					match(input,UP_J,FOLLOW_UP_J_in_sClassDesc2568); 
					}
					break;
				case 9 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:994:57: UP_D
					{
					match(input,UP_D,FOLLOW_UP_D_in_sClassDesc2570); 
					}
					break;
				case 10 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:994:62: UP_F
					{
					match(input,UP_F,FOLLOW_UP_F_in_sClassDesc2572); 
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sClassDesc"


	public static class sId_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "sId"
	// com\\googlecode\\d2j\\jasmin\\Jasmin.g:996:1: sId : ( ID | AT | AND | UP_Z | UP_B | UP_S | UP_C | UP_I | UP_F | UP_D | UP_J | ANNOTATION_VISIBLITY | METHOD_ANNOTATION_VISIBLITY | INNER | OUTTER | IIOP | IOP | JOP | OP0 | LDC | XFIELD | XTYPE | XINVOKE | INVOKEINTERFACE | MULTIANEWARRAY | LOOKUPSWITCH | TABLESWITCH | DEFAULT | FROM | TO | USING | STACK | LOCALS | HIGH | INVOKEDYNAMIC | VOID_TYPE | WBOOLEAN | WBYTE | WSHORT | WCHAR | WINTEGER | WLONG | WFLOAT | WDOUBLE | XNEWARRAY );
	public final JasminParser.sId_return sId() throws RecognitionException {
		JasminParser.sId_return retval = new JasminParser.sId_return();
		retval.start = input.LT(1);

		try {
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:996:5: ( ID | AT | AND | UP_Z | UP_B | UP_S | UP_C | UP_I | UP_F | UP_D | UP_J | ANNOTATION_VISIBLITY | METHOD_ANNOTATION_VISIBLITY | INNER | OUTTER | IIOP | IOP | JOP | OP0 | LDC | XFIELD | XTYPE | XINVOKE | INVOKEINTERFACE | MULTIANEWARRAY | LOOKUPSWITCH | TABLESWITCH | DEFAULT | FROM | TO | USING | STACK | LOCALS | HIGH | INVOKEDYNAMIC | VOID_TYPE | WBOOLEAN | WBYTE | WSHORT | WCHAR | WINTEGER | WLONG | WFLOAT | WDOUBLE | XNEWARRAY )
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:
			{
			if ( (input.LA(1) >= AND && input.LA(1) <= ANNOTATION_VISIBLITY)||input.LA(1)==AT||input.LA(1)==DEFAULT||input.LA(1)==FROM||(input.LA(1) >= HIGH && input.LA(1) <= INNER)||(input.LA(1) >= INVOKEDYNAMIC && input.LA(1) <= LDC)||input.LA(1)==LOCALS||(input.LA(1) >= LOOKUPSWITCH && input.LA(1) <= METHOD_ANNOTATION_VISIBLITY)||input.LA(1)==MULTIANEWARRAY||(input.LA(1) >= OP0 && input.LA(1) <= OUTTER)||input.LA(1)==STACK||(input.LA(1) >= TABLESWITCH && input.LA(1) <= WLONG)||(input.LA(1) >= WSHORT && input.LA(1) <= XTYPE) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sId"


	public static class sWord_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "sWord"
	// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1000:1: sWord : sId ;
	public final JasminParser.sWord_return sWord() throws RecognitionException {
		JasminParser.sWord_return retval = new JasminParser.sWord_return();
		retval.start = input.LT(1);

		try {
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1000:7: ( sId )
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1000:9: sId
			{
			pushFollow(FOLLOW_sId_in_sWord2688);
			sId();
			state._fsp--;

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sWord"



	// $ANTLR start "sAnnotation"
	// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1001:1: sAnnotation : '.annotation' (b= ANNOTATION_VISIBLITY aInternalOrDesc= sInternalNameOrDescACC |b= METHOD_ANNOTATION_VISIBLITY c= INT a= sId ) ( ( sAnnotationElement )* '.end annotation' )? ;
	public final void sAnnotation() throws RecognitionException {
		Token b=null;
		Token c=null;
		String aInternalOrDesc =null;
		ParserRuleReturnScope a =null;

		try {
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1002:2: ( '.annotation' (b= ANNOTATION_VISIBLITY aInternalOrDesc= sInternalNameOrDescACC |b= METHOD_ANNOTATION_VISIBLITY c= INT a= sId ) ( ( sAnnotationElement )* '.end annotation' )? )
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1002:4: '.annotation' (b= ANNOTATION_VISIBLITY aInternalOrDesc= sInternalNameOrDescACC |b= METHOD_ANNOTATION_VISIBLITY c= INT a= sId ) ( ( sAnnotationElement )* '.end annotation' )?
			{
			match(input,92,FOLLOW_92_in_sAnnotation2697); 
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1002:18: (b= ANNOTATION_VISIBLITY aInternalOrDesc= sInternalNameOrDescACC |b= METHOD_ANNOTATION_VISIBLITY c= INT a= sId )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==ANNOTATION_VISIBLITY) ) {
				alt12=1;
			}
			else if ( (LA12_0==METHOD_ANNOTATION_VISIBLITY) ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1002:19: b= ANNOTATION_VISIBLITY aInternalOrDesc= sInternalNameOrDescACC
					{
					b=(Token)match(input,ANNOTATION_VISIBLITY,FOLLOW_ANNOTATION_VISIBLITY_in_sAnnotation2702); 
					pushFollow(FOLLOW_sInternalNameOrDescACC_in_sAnnotation2706);
					aInternalOrDesc=sInternalNameOrDescACC();
					state._fsp--;

					 currentAnnotationVisitor= currentAv.visitAnnotation(aInternalOrDesc,!(b!=null?b.getText():null).contains("invisible")); 
					}
					break;
				case 2 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1003:20: b= METHOD_ANNOTATION_VISIBLITY c= INT a= sId
					{
					b=(Token)match(input,METHOD_ANNOTATION_VISIBLITY,FOLLOW_METHOD_ANNOTATION_VISIBLITY_in_sAnnotation2733); 
					c=(Token)match(input,INT,FOLLOW_INT_in_sAnnotation2737); 
					pushFollow(FOLLOW_sId_in_sAnnotation2741);
					a=sId();
					state._fsp--;

					currentAnnotationVisitor=currentAv.visitParameterAnnotation(parseInt((c!=null?c.getText():null)),(a!=null?input.toString(a.start,a.stop):null),!(b!=null?b.getText():null).contains("invisible"));
					}
					break;

			}

			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1005:6: ( ( sAnnotationElement )* '.end annotation' )?
			int alt14=2;
			alt14 = dfa14.predict(input);
			switch (alt14) {
				case 1 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1005:7: ( sAnnotationElement )* '.end annotation'
					{
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1005:7: ( sAnnotationElement )*
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( ((LA13_0 >= AND && LA13_0 <= ANNOTATION_VISIBLITY)||LA13_0==AT||LA13_0==DEFAULT||LA13_0==FROM||(LA13_0 >= HIGH && LA13_0 <= INNER)||(LA13_0 >= INVOKEDYNAMIC && LA13_0 <= LDC)||LA13_0==LOCALS||(LA13_0 >= LOOKUPSWITCH && LA13_0 <= METHOD_ANNOTATION_VISIBLITY)||LA13_0==MULTIANEWARRAY||(LA13_0 >= OP0 && LA13_0 <= OUTTER)||LA13_0==STACK||(LA13_0 >= TABLESWITCH && LA13_0 <= WLONG)||(LA13_0 >= WSHORT && LA13_0 <= XTYPE)) ) {
							alt13=1;
						}

						switch (alt13) {
						case 1 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1005:7: sAnnotationElement
							{
							pushFollow(FOLLOW_sAnnotationElement_in_sAnnotation2770);
							sAnnotationElement();
							state._fsp--;

							}
							break;

						default :
							break loop13;
						}
					}

					match(input,113,FOLLOW_113_in_sAnnotation2773); 
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "sAnnotation"



	// $ANTLR start "sVisibiltyAnnotation"
	// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1007:1: sVisibiltyAnnotation : ( '.runtime_visible_annotation' | '.runtime_invisible_annotation' ) a= STRING ( sAnnotationSoot )* '.end' '.annotation_attr' ;
	public final void sVisibiltyAnnotation() throws RecognitionException {
		Token a=null;

		try {
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1008:2: ( ( '.runtime_visible_annotation' | '.runtime_invisible_annotation' ) a= STRING ( sAnnotationSoot )* '.end' '.annotation_attr' )
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1008:4: ( '.runtime_visible_annotation' | '.runtime_invisible_annotation' ) a= STRING ( sAnnotationSoot )* '.end' '.annotation_attr'
			{
			boolean visible=false;
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1008:29: ( '.runtime_visible_annotation' | '.runtime_invisible_annotation' )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==135) ) {
				alt15=1;
			}
			else if ( (LA15_0==134) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1008:30: '.runtime_visible_annotation'
					{
					match(input,135,FOLLOW_135_in_sVisibiltyAnnotation2788); 
					visible=true;
					}
					break;
				case 2 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1008:76: '.runtime_invisible_annotation'
					{
					match(input,134,FOLLOW_134_in_sVisibiltyAnnotation2792); 
					visible=false;
					}
					break;

			}

			a=(Token)match(input,STRING,FOLLOW_STRING_in_sVisibiltyAnnotation2798); 
			 currentAnnotationVisitor= currentAv.visitAnnotation(unEscape((a!=null?a.getText():null)),visible); 
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1009:2: ( sAnnotationSoot )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==92) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1009:2: sAnnotationSoot
					{
					pushFollow(FOLLOW_sAnnotationSoot_in_sVisibiltyAnnotation2808);
					sAnnotationSoot();
					state._fsp--;

					}
					break;

				default :
					break loop16;
				}
			}

			match(input,116,FOLLOW_116_in_sVisibiltyAnnotation2813); 
			match(input,93,FOLLOW_93_in_sVisibiltyAnnotation2815); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "sVisibiltyAnnotation"



	// $ANTLR start "sAnnotationSoot"
	// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1012:1: sAnnotationSoot : '.annotation' (t= sAnnotationElementSoot )* '.end' '.annotation' ;
	public final void sAnnotationSoot() throws RecognitionException {
		ParserRuleReturnScope t =null;

		try {
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1013:2: ( '.annotation' (t= sAnnotationElementSoot )* '.end' '.annotation' )
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1013:4: '.annotation' (t= sAnnotationElementSoot )* '.end' '.annotation'
			{
			match(input,92,FOLLOW_92_in_sAnnotationSoot2825); 
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1014:2: (t= sAnnotationElementSoot )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==110) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1014:3: t= sAnnotationElementSoot
					{
					pushFollow(FOLLOW_sAnnotationElementSoot_in_sAnnotationSoot2832);
					t=sAnnotationElementSoot();
					state._fsp--;

					currentAnnotationVisitor.visit((t!=null?((JasminParser.sAnnotationElementSoot_return)t).nn:null),(t!=null?((JasminParser.sAnnotationElementSoot_return)t).v:null));
					}
					break;

				default :
					break loop17;
				}
			}

			match(input,116,FOLLOW_116_in_sAnnotationSoot2840); 
			match(input,92,FOLLOW_92_in_sAnnotationSoot2842); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "sAnnotationSoot"


	public static class sAnnotationElementSoot_return extends ParserRuleReturnScope {
		public String nn;
		public Object v;
	};


	// $ANTLR start "sAnnotationElementSoot"
	// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1017:1: sAnnotationElementSoot returns [String nn,Object v] : '.elem' ( '.bool_kind' a= STRING b= INT | '.short_kind' a= STRING b= INT | '.byte_kind' a= STRING b= INT | '.char_kind' a= STRING b= INT | '.int_kind' a= STRING b= INT | '.long_kind' a= STRING b= ( INT | LONG ) | '.float_kind' a= STRING b= INT | '.doub_kind' a= STRING b= ( INT | LONG ) | '.str_kind' a= STRING b= STRING | '.enum_kind' a= STRING b= STRING | '.cls_kind' a= STRING b= STRING | '.arr_kind' a= STRING (t= sAnnotationElementSoot )* '.end' '.arr_elem' | '.ann_kind' a= STRING q= sSubannotationSoot '.end' '.annot_elem' ) ;
	public final JasminParser.sAnnotationElementSoot_return sAnnotationElementSoot() throws RecognitionException {
		JasminParser.sAnnotationElementSoot_return retval = new JasminParser.sAnnotationElementSoot_return();
		retval.start = input.LT(1);

		Token a=null;
		Token b=null;
		ParserRuleReturnScope t =null;
		AnnotationNode q =null;

		try {
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1018:2: ( '.elem' ( '.bool_kind' a= STRING b= INT | '.short_kind' a= STRING b= INT | '.byte_kind' a= STRING b= INT | '.char_kind' a= STRING b= INT | '.int_kind' a= STRING b= INT | '.long_kind' a= STRING b= ( INT | LONG ) | '.float_kind' a= STRING b= INT | '.doub_kind' a= STRING b= ( INT | LONG ) | '.str_kind' a= STRING b= STRING | '.enum_kind' a= STRING b= STRING | '.cls_kind' a= STRING b= STRING | '.arr_kind' a= STRING (t= sAnnotationElementSoot )* '.end' '.arr_elem' | '.ann_kind' a= STRING q= sSubannotationSoot '.end' '.annot_elem' ) )
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1018:3: '.elem' ( '.bool_kind' a= STRING b= INT | '.short_kind' a= STRING b= INT | '.byte_kind' a= STRING b= INT | '.char_kind' a= STRING b= INT | '.int_kind' a= STRING b= INT | '.long_kind' a= STRING b= ( INT | LONG ) | '.float_kind' a= STRING b= INT | '.doub_kind' a= STRING b= ( INT | LONG ) | '.str_kind' a= STRING b= STRING | '.enum_kind' a= STRING b= STRING | '.cls_kind' a= STRING b= STRING | '.arr_kind' a= STRING (t= sAnnotationElementSoot )* '.end' '.arr_elem' | '.ann_kind' a= STRING q= sSubannotationSoot '.end' '.annot_elem' )
			{
			match(input,110,FOLLOW_110_in_sAnnotationElementSoot2854); 
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1018:11: ( '.bool_kind' a= STRING b= INT | '.short_kind' a= STRING b= INT | '.byte_kind' a= STRING b= INT | '.char_kind' a= STRING b= INT | '.int_kind' a= STRING b= INT | '.long_kind' a= STRING b= ( INT | LONG ) | '.float_kind' a= STRING b= INT | '.doub_kind' a= STRING b= ( INT | LONG ) | '.str_kind' a= STRING b= STRING | '.enum_kind' a= STRING b= STRING | '.cls_kind' a= STRING b= STRING | '.arr_kind' a= STRING (t= sAnnotationElementSoot )* '.end' '.arr_elem' | '.ann_kind' a= STRING q= sSubannotationSoot '.end' '.annot_elem' )
			int alt19=13;
			switch ( input.LA(1) ) {
			case 98:
				{
				alt19=1;
				}
				break;
			case 136:
				{
				alt19=2;
				}
				break;
			case 99:
				{
				alt19=3;
				}
				break;
			case 102:
				{
				alt19=4;
				}
				break;
			case 125:
				{
				alt19=5;
				}
				break;
			case 129:
				{
				alt19=6;
				}
				break;
			case 120:
				{
				alt19=7;
				}
				break;
			case 109:
				{
				alt19=8;
				}
				break;
			case 140:
				{
				alt19=9;
				}
				break;
			case 117:
				{
				alt19=10;
				}
				break;
			case 105:
				{
				alt19=11;
				}
				break;
			case 96:
				{
				alt19=12;
				}
				break;
			case 90:
				{
				alt19=13;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1018:12: '.bool_kind' a= STRING b= INT
					{
					match(input,98,FOLLOW_98_in_sAnnotationElementSoot2857); 
					a=(Token)match(input,STRING,FOLLOW_STRING_in_sAnnotationElementSoot2861); 
					b=(Token)match(input,INT,FOLLOW_INT_in_sAnnotationElementSoot2865); 
					retval.nn =unEscapeString((a!=null?a.getText():null)); retval.v =0!=parseInt((b!=null?b.getText():null));
					}
					break;
				case 2 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1019:22: '.short_kind' a= STRING b= INT
					{
					match(input,136,FOLLOW_136_in_sAnnotationElementSoot2899); 
					a=(Token)match(input,STRING,FOLLOW_STRING_in_sAnnotationElementSoot2903); 
					b=(Token)match(input,INT,FOLLOW_INT_in_sAnnotationElementSoot2907); 
					retval.nn =unEscapeString((a!=null?a.getText():null)); retval.v =(short)parseInt((b!=null?b.getText():null));
					}
					break;
				case 3 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1020:22: '.byte_kind' a= STRING b= INT
					{
					match(input,99,FOLLOW_99_in_sAnnotationElementSoot2939); 
					a=(Token)match(input,STRING,FOLLOW_STRING_in_sAnnotationElementSoot2943); 
					b=(Token)match(input,INT,FOLLOW_INT_in_sAnnotationElementSoot2947); 
					retval.nn =unEscapeString((a!=null?a.getText():null)); retval.v =(byte)parseInt((b!=null?b.getText():null));
					}
					break;
				case 4 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1021:22: '.char_kind' a= STRING b= INT
					{
					match(input,102,FOLLOW_102_in_sAnnotationElementSoot2980); 
					a=(Token)match(input,STRING,FOLLOW_STRING_in_sAnnotationElementSoot2984); 
					b=(Token)match(input,INT,FOLLOW_INT_in_sAnnotationElementSoot2988); 
					retval.nn =unEscapeString((a!=null?a.getText():null)); retval.v =(char)parseInt((b!=null?b.getText():null));
					}
					break;
				case 5 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1022:22: '.int_kind' a= STRING b= INT
					{
					match(input,125,FOLLOW_125_in_sAnnotationElementSoot3021); 
					a=(Token)match(input,STRING,FOLLOW_STRING_in_sAnnotationElementSoot3025); 
					b=(Token)match(input,INT,FOLLOW_INT_in_sAnnotationElementSoot3029); 
					retval.nn =unEscapeString((a!=null?a.getText():null)); retval.v =parseInt((b!=null?b.getText():null));
					}
					break;
				case 6 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1023:22: '.long_kind' a= STRING b= ( INT | LONG )
					{
					match(input,129,FOLLOW_129_in_sAnnotationElementSoot3063); 
					a=(Token)match(input,STRING,FOLLOW_STRING_in_sAnnotationElementSoot3067); 
					b=input.LT(1);
					if ( input.LA(1)==INT||input.LA(1)==LONG ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					retval.nn =unEscapeString((a!=null?a.getText():null)); retval.v =parseLong((b!=null?b.getText():null));
					}
					break;
				case 7 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1024:22: '.float_kind' a= STRING b= INT
					{
					match(input,120,FOLLOW_120_in_sAnnotationElementSoot3101); 
					a=(Token)match(input,STRING,FOLLOW_STRING_in_sAnnotationElementSoot3105); 
					b=(Token)match(input,INT,FOLLOW_INT_in_sAnnotationElementSoot3109); 
					retval.nn =unEscapeString((a!=null?a.getText():null)); retval.v =parseFloat((b!=null?b.getText():null));
					}
					break;
				case 8 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1025:22: '.doub_kind' a= STRING b= ( INT | LONG )
					{
					match(input,109,FOLLOW_109_in_sAnnotationElementSoot3141); 
					a=(Token)match(input,STRING,FOLLOW_STRING_in_sAnnotationElementSoot3145); 
					b=input.LT(1);
					if ( input.LA(1)==INT||input.LA(1)==LONG ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					retval.nn =unEscapeString((a!=null?a.getText():null)); retval.v =parseDouble((b!=null?b.getText():null));
					}
					break;
				case 9 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1026:22: '.str_kind' a= STRING b= STRING
					{
					match(input,140,FOLLOW_140_in_sAnnotationElementSoot3179); 
					a=(Token)match(input,STRING,FOLLOW_STRING_in_sAnnotationElementSoot3183); 
					b=(Token)match(input,STRING,FOLLOW_STRING_in_sAnnotationElementSoot3187); 
					retval.nn =unEscapeString((a!=null?a.getText():null)); retval.v =unEscapeString((b!=null?b.getText():null));
					}
					break;
				case 10 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1027:22: '.enum_kind' a= STRING b= STRING
					{
					match(input,117,FOLLOW_117_in_sAnnotationElementSoot3218); 
					a=(Token)match(input,STRING,FOLLOW_STRING_in_sAnnotationElementSoot3222); 
					b=(Token)match(input,STRING,FOLLOW_STRING_in_sAnnotationElementSoot3226); 
					retval.nn =unEscapeString((a!=null?a.getText():null)); String on[]=parseOwnerAndName((b!=null?b.getText():null));retval.v =new String[]{on[0],on[1]};
					}
					break;
				case 11 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1028:22: '.cls_kind' a= STRING b= STRING
					{
					match(input,105,FOLLOW_105_in_sAnnotationElementSoot3256); 
					a=(Token)match(input,STRING,FOLLOW_STRING_in_sAnnotationElementSoot3260); 
					b=(Token)match(input,STRING,FOLLOW_STRING_in_sAnnotationElementSoot3264); 
					retval.nn =unEscapeString((a!=null?a.getText():null)); retval.v =Type.getType(unEscapeString((b!=null?b.getText():null)));
					}
					break;
				case 12 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1029:22: '.arr_kind' a= STRING (t= sAnnotationElementSoot )* '.end' '.arr_elem'
					{
					match(input,96,FOLLOW_96_in_sAnnotationElementSoot3295); 
					a=(Token)match(input,STRING,FOLLOW_STRING_in_sAnnotationElementSoot3299); 
					List<Object> array=new ArrayList<>();
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1029:83: (t= sAnnotationElementSoot )*
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( (LA18_0==110) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1029:84: t= sAnnotationElementSoot
							{
							pushFollow(FOLLOW_sAnnotationElementSoot_in_sAnnotationElementSoot3306);
							t=sAnnotationElementSoot();
							state._fsp--;

							array.add((t!=null?((JasminParser.sAnnotationElementSoot_return)t).v:null));
							}
							break;

						default :
							break loop18;
						}
					}

					match(input,116,FOLLOW_116_in_sAnnotationElementSoot3311); 
					match(input,95,FOLLOW_95_in_sAnnotationElementSoot3314); 
					retval.nn =unEscapeString((a!=null?a.getText():null)); retval.v =array;
					}
					break;
				case 13 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1030:22: '.ann_kind' a= STRING q= sSubannotationSoot '.end' '.annot_elem'
					{
					match(input,90,FOLLOW_90_in_sAnnotationElementSoot3341); 
					a=(Token)match(input,STRING,FOLLOW_STRING_in_sAnnotationElementSoot3345); 
					pushFollow(FOLLOW_sSubannotationSoot_in_sAnnotationElementSoot3349);
					q=sSubannotationSoot();
					state._fsp--;

					match(input,116,FOLLOW_116_in_sAnnotationElementSoot3351); 
					match(input,91,FOLLOW_91_in_sAnnotationElementSoot3353); 
					retval.nn =unEscapeString((a!=null?a.getText():null)); retval.v =q;
					}
					break;

			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sAnnotationElementSoot"



	// $ANTLR start "sSubannotationSoot"
	// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1033:1: sSubannotationSoot returns [AnnotationNode v] : '.annotation' a= STRING (t= sAnnotationElementSoot )* '.end' '.annotation' ;
	public final AnnotationNode sSubannotationSoot() throws RecognitionException {
		AnnotationNode v = null;


		Token a=null;
		ParserRuleReturnScope t =null;

		try {
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1034:2: ( '.annotation' a= STRING (t= sAnnotationElementSoot )* '.end' '.annotation' )
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1034:4: '.annotation' a= STRING (t= sAnnotationElementSoot )* '.end' '.annotation'
			{
			match(input,92,FOLLOW_92_in_sSubannotationSoot3375); 
			a=(Token)match(input,STRING,FOLLOW_STRING_in_sSubannotationSoot3379); 
			 v =new AnnotationNode(unEscapeString((a!=null?a.getText():null))); 
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1035:7: (t= sAnnotationElementSoot )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==110) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1035:8: t= sAnnotationElementSoot
					{
					pushFollow(FOLLOW_sAnnotationElementSoot_in_sSubannotationSoot3394);
					t=sAnnotationElementSoot();
					state._fsp--;

					v.visit((t!=null?((JasminParser.sAnnotationElementSoot_return)t).nn:null),(t!=null?((JasminParser.sAnnotationElementSoot_return)t).v:null));
					}
					break;

				default :
					break loop20;
				}
			}

			match(input,116,FOLLOW_116_in_sSubannotationSoot3406); 
			match(input,92,FOLLOW_92_in_sSubannotationSoot3408); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return v;
	}
	// $ANTLR end "sSubannotationSoot"



	// $ANTLR start "sAnnotationElement"
	// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1038:1: sAnnotationElement : a= sId (xid= ID c= OBJECT_TYPE '=' b= sWord | AT b2= OBJECT_TYPE '=' sSubannotation |xid= ID '=' b1= sClassDesc |xid= ID '=' b3= STRING | UP_B '=' b4= INT | UP_Z '=' b5= INT | UP_S '=' b6= INT | UP_C '=' b7= INT | UP_I '=' b8= INT | UP_J '=' b9= ( INT | LONG ) | UP_F '=' b10= ( INT | FLOAT | DOUBLE ) | UP_D '=' b11= ( INT | FLOAT | DOUBLE ) | ARRAY_B '=' (b12= INT )+ | ARRAY_Z '=' (b13= INT )+ | ARRAY_S '=' (b14= INT )+ | ARRAY_C '=' (b15= INT )+ | ARRAY_I '=' (b16= INT )+ | ARRAY_J '=' (b17= ( INT | LONG ) )+ | ARRAY_F '=' (b18= ( INT | FLOAT | DOUBLE ) )+ | ARRAY_D '=' (b19= ( INT | DOUBLE ) )+ | ARRAY_LOW_E c= OBJECT_TYPE '=' ( (b1= sWord |b2= STRING |b3= DSTRING ) )+ | ARRAY_AND b20= OBJECT_TYPE '=' ARRAY_AT '=' ( sSubannotation )+ | ARRAY_LOW_C '=' (b= sClassDesc )+ | ARRAY_LOW_S '=' (b21= STRING )+ ) ;
	public final void sAnnotationElement() throws RecognitionException {
		Token xid=null;
		Token c=null;
		Token b2=null;
		Token b3=null;
		Token b4=null;
		Token b5=null;
		Token b6=null;
		Token b7=null;
		Token b8=null;
		Token b9=null;
		Token b10=null;
		Token b11=null;
		Token b12=null;
		Token b13=null;
		Token b14=null;
		Token b15=null;
		Token b16=null;
		Token b17=null;
		Token b18=null;
		Token b19=null;
		Token b20=null;
		Token b21=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope b1 =null;

		List<Object> array = new ArrayList<Object>(); AnnotationNode _t= currentAnnotationVisitor;
		try {
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1039:5: (a= sId (xid= ID c= OBJECT_TYPE '=' b= sWord | AT b2= OBJECT_TYPE '=' sSubannotation |xid= ID '=' b1= sClassDesc |xid= ID '=' b3= STRING | UP_B '=' b4= INT | UP_Z '=' b5= INT | UP_S '=' b6= INT | UP_C '=' b7= INT | UP_I '=' b8= INT | UP_J '=' b9= ( INT | LONG ) | UP_F '=' b10= ( INT | FLOAT | DOUBLE ) | UP_D '=' b11= ( INT | FLOAT | DOUBLE ) | ARRAY_B '=' (b12= INT )+ | ARRAY_Z '=' (b13= INT )+ | ARRAY_S '=' (b14= INT )+ | ARRAY_C '=' (b15= INT )+ | ARRAY_I '=' (b16= INT )+ | ARRAY_J '=' (b17= ( INT | LONG ) )+ | ARRAY_F '=' (b18= ( INT | FLOAT | DOUBLE ) )+ | ARRAY_D '=' (b19= ( INT | DOUBLE ) )+ | ARRAY_LOW_E c= OBJECT_TYPE '=' ( (b1= sWord |b2= STRING |b3= DSTRING ) )+ | ARRAY_AND b20= OBJECT_TYPE '=' ARRAY_AT '=' ( sSubannotation )+ | ARRAY_LOW_C '=' (b= sClassDesc )+ | ARRAY_LOW_S '=' (b21= STRING )+ ) )
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1039:9: a= sId (xid= ID c= OBJECT_TYPE '=' b= sWord | AT b2= OBJECT_TYPE '=' sSubannotation |xid= ID '=' b1= sClassDesc |xid= ID '=' b3= STRING | UP_B '=' b4= INT | UP_Z '=' b5= INT | UP_S '=' b6= INT | UP_C '=' b7= INT | UP_I '=' b8= INT | UP_J '=' b9= ( INT | LONG ) | UP_F '=' b10= ( INT | FLOAT | DOUBLE ) | UP_D '=' b11= ( INT | FLOAT | DOUBLE ) | ARRAY_B '=' (b12= INT )+ | ARRAY_Z '=' (b13= INT )+ | ARRAY_S '=' (b14= INT )+ | ARRAY_C '=' (b15= INT )+ | ARRAY_I '=' (b16= INT )+ | ARRAY_J '=' (b17= ( INT | LONG ) )+ | ARRAY_F '=' (b18= ( INT | FLOAT | DOUBLE ) )+ | ARRAY_D '=' (b19= ( INT | DOUBLE ) )+ | ARRAY_LOW_E c= OBJECT_TYPE '=' ( (b1= sWord |b2= STRING |b3= DSTRING ) )+ | ARRAY_AND b20= OBJECT_TYPE '=' ARRAY_AT '=' ( sSubannotation )+ | ARRAY_LOW_C '=' (b= sClassDesc )+ | ARRAY_LOW_S '=' (b21= STRING )+ )
			{
			pushFollow(FOLLOW_sId_in_sAnnotationElement3429);
			a=sId();
			state._fsp--;

			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1039:15: (xid= ID c= OBJECT_TYPE '=' b= sWord | AT b2= OBJECT_TYPE '=' sSubannotation |xid= ID '=' b1= sClassDesc |xid= ID '=' b3= STRING | UP_B '=' b4= INT | UP_Z '=' b5= INT | UP_S '=' b6= INT | UP_C '=' b7= INT | UP_I '=' b8= INT | UP_J '=' b9= ( INT | LONG ) | UP_F '=' b10= ( INT | FLOAT | DOUBLE ) | UP_D '=' b11= ( INT | FLOAT | DOUBLE ) | ARRAY_B '=' (b12= INT )+ | ARRAY_Z '=' (b13= INT )+ | ARRAY_S '=' (b14= INT )+ | ARRAY_C '=' (b15= INT )+ | ARRAY_I '=' (b16= INT )+ | ARRAY_J '=' (b17= ( INT | LONG ) )+ | ARRAY_F '=' (b18= ( INT | FLOAT | DOUBLE ) )+ | ARRAY_D '=' (b19= ( INT | DOUBLE ) )+ | ARRAY_LOW_E c= OBJECT_TYPE '=' ( (b1= sWord |b2= STRING |b3= DSTRING ) )+ | ARRAY_AND b20= OBJECT_TYPE '=' ARRAY_AT '=' ( sSubannotation )+ | ARRAY_LOW_C '=' (b= sClassDesc )+ | ARRAY_LOW_S '=' (b21= STRING )+ )
			int alt34=24;
			switch ( input.LA(1) ) {
			case ID:
				{
				int LA34_1 = input.LA(2);
				if ( (LA34_1==OBJECT_TYPE) ) {
					alt34=1;
				}
				else if ( (LA34_1==148) ) {
					int LA34_24 = input.LA(3);
					if ( (LA34_24==STRING) ) {
						alt34=4;
					}
					else if ( ((LA34_24 >= ARRAY_B && LA34_24 <= ARRAY_J)||(LA34_24 >= ARRAY_S && LA34_24 <= ARRAY_Z)||LA34_24==OBJECT_TYPE||LA34_24==PARRAY_TYPE||(LA34_24 >= UP_B && LA34_24 <= UP_Z)) ) {
						alt34=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 34, 24, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 34, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case AT:
				{
				alt34=2;
				}
				break;
			case UP_B:
				{
				alt34=5;
				}
				break;
			case UP_Z:
				{
				alt34=6;
				}
				break;
			case UP_S:
				{
				alt34=7;
				}
				break;
			case UP_C:
				{
				alt34=8;
				}
				break;
			case UP_I:
				{
				alt34=9;
				}
				break;
			case UP_J:
				{
				alt34=10;
				}
				break;
			case UP_F:
				{
				alt34=11;
				}
				break;
			case UP_D:
				{
				alt34=12;
				}
				break;
			case ARRAY_B:
				{
				alt34=13;
				}
				break;
			case ARRAY_Z:
				{
				alt34=14;
				}
				break;
			case ARRAY_S:
				{
				alt34=15;
				}
				break;
			case ARRAY_C:
				{
				alt34=16;
				}
				break;
			case ARRAY_I:
				{
				alt34=17;
				}
				break;
			case ARRAY_J:
				{
				alt34=18;
				}
				break;
			case ARRAY_F:
				{
				alt34=19;
				}
				break;
			case ARRAY_D:
				{
				alt34=20;
				}
				break;
			case ARRAY_LOW_E:
				{
				alt34=21;
				}
				break;
			case ARRAY_AND:
				{
				alt34=22;
				}
				break;
			case ARRAY_LOW_C:
				{
				alt34=23;
				}
				break;
			case ARRAY_LOW_S:
				{
				alt34=24;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}
			switch (alt34) {
				case 1 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1040:14: xid= ID c= OBJECT_TYPE '=' b= sWord
					{
					xid=(Token)match(input,ID,FOLLOW_ID_in_sAnnotationElement3448); 
					 if(!"e".contains((xid!=null?xid.getText():null))){ throw new RecognitionException(input);} 
					c=(Token)match(input,OBJECT_TYPE,FOLLOW_OBJECT_TYPE_in_sAnnotationElement3455); 
					match(input,148,FOLLOW_148_in_sAnnotationElement3457); 
					pushFollow(FOLLOW_sWord_in_sAnnotationElement3461);
					b=sWord();
					state._fsp--;

					  _t.visit((a!=null?input.toString(a.start,a.stop):null),new String[]{(c!=null?c.getText():null),(b!=null?input.toString(b.start,b.stop):null)}); 
					}
					break;
				case 2 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1041:14: AT b2= OBJECT_TYPE '=' sSubannotation
					{
					match(input,AT,FOLLOW_AT_in_sAnnotationElement3478); 
					b2=(Token)match(input,OBJECT_TYPE,FOLLOW_OBJECT_TYPE_in_sAnnotationElement3482); 
					match(input,148,FOLLOW_148_in_sAnnotationElement3484); 
					  currentAnnotationVisitor=new AnnotationNode((b2!=null?b2.getText():null));
					pushFollow(FOLLOW_sSubannotation_in_sAnnotationElement3488);
					sSubannotation();
					state._fsp--;

					 _t.visit((a!=null?input.toString(a.start,a.stop):null),currentAnnotationVisitor); 
					}
					break;
				case 3 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1042:14: xid= ID '=' b1= sClassDesc
					{
					xid=(Token)match(input,ID,FOLLOW_ID_in_sAnnotationElement3508); 
					 if(!"c".contains((xid!=null?xid.getText():null))){ throw new RecognitionException(input);} 
					match(input,148,FOLLOW_148_in_sAnnotationElement3512); 
					pushFollow(FOLLOW_sClassDesc_in_sAnnotationElement3516);
					b1=sClassDesc();
					state._fsp--;

					 currentAnnotationVisitor.visit((a!=null?input.toString(a.start,a.stop):null),Type.getType((b1!=null?input.toString(b1.start,b1.stop):null))); 
					}
					break;
				case 4 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1043:14: xid= ID '=' b3= STRING
					{
					xid=(Token)match(input,ID,FOLLOW_ID_in_sAnnotationElement3535); 
					 if(!"s".contains((xid!=null?xid.getText():null))){ throw new RecognitionException(input);} 
					match(input,148,FOLLOW_148_in_sAnnotationElement3539); 
					b3=(Token)match(input,STRING,FOLLOW_STRING_in_sAnnotationElement3543); 
					 currentAnnotationVisitor.visit((a!=null?input.toString(a.start,a.stop):null),unEscapeString((b3!=null?b3.getText():null))); 
					}
					break;
				case 5 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1044:14: UP_B '=' b4= INT
					{
					match(input,UP_B,FOLLOW_UP_B_in_sAnnotationElement3565); 
					match(input,148,FOLLOW_148_in_sAnnotationElement3568); 
					b4=(Token)match(input,INT,FOLLOW_INT_in_sAnnotationElement3572); 
					 currentAnnotationVisitor.visit((a!=null?input.toString(a.start,a.stop):null),(byte)parseInt((b4!=null?b4.getText():null))); 
					}
					break;
				case 6 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1045:14: UP_Z '=' b5= INT
					{
					match(input,UP_Z,FOLLOW_UP_Z_in_sAnnotationElement3590); 
					match(input,148,FOLLOW_148_in_sAnnotationElement3593); 
					b5=(Token)match(input,INT,FOLLOW_INT_in_sAnnotationElement3597); 
					 currentAnnotationVisitor.visit((a!=null?input.toString(a.start,a.stop):null),0!=parseInt((b5!=null?b5.getText():null))); 
					}
					break;
				case 7 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1046:14: UP_S '=' b6= INT
					{
					match(input,UP_S,FOLLOW_UP_S_in_sAnnotationElement3615); 
					match(input,148,FOLLOW_148_in_sAnnotationElement3618); 
					b6=(Token)match(input,INT,FOLLOW_INT_in_sAnnotationElement3622); 
					 currentAnnotationVisitor.visit((a!=null?input.toString(a.start,a.stop):null),(short)parseInt((b6!=null?b6.getText():null))); 
					}
					break;
				case 8 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1047:14: UP_C '=' b7= INT
					{
					match(input,UP_C,FOLLOW_UP_C_in_sAnnotationElement3641); 
					match(input,148,FOLLOW_148_in_sAnnotationElement3644); 
					b7=(Token)match(input,INT,FOLLOW_INT_in_sAnnotationElement3648); 
					 currentAnnotationVisitor.visit((a!=null?input.toString(a.start,a.stop):null),(char)parseInt((b7!=null?b7.getText():null))); 
					}
					break;
				case 9 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1048:14: UP_I '=' b8= INT
					{
					match(input,UP_I,FOLLOW_UP_I_in_sAnnotationElement3667); 
					match(input,148,FOLLOW_148_in_sAnnotationElement3670); 
					b8=(Token)match(input,INT,FOLLOW_INT_in_sAnnotationElement3674); 
					 currentAnnotationVisitor.visit((a!=null?input.toString(a.start,a.stop):null),parseInt((b8!=null?b8.getText():null))); 
					}
					break;
				case 10 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1049:14: UP_J '=' b9= ( INT | LONG )
					{
					match(input,UP_J,FOLLOW_UP_J_in_sAnnotationElement3693); 
					match(input,148,FOLLOW_148_in_sAnnotationElement3696); 
					b9=input.LT(1);
					if ( input.LA(1)==INT||input.LA(1)==LONG ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					 currentAnnotationVisitor.visit((a!=null?input.toString(a.start,a.stop):null),parseLong((b9!=null?b9.getText():null))); 
					}
					break;
				case 11 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1050:14: UP_F '=' b10= ( INT | FLOAT | DOUBLE )
					{
					match(input,UP_F,FOLLOW_UP_F_in_sAnnotationElement3722); 
					match(input,148,FOLLOW_148_in_sAnnotationElement3725); 
					b10=input.LT(1);
					if ( input.LA(1)==DOUBLE||input.LA(1)==FLOAT||input.LA(1)==INT ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					 currentAnnotationVisitor.visit((a!=null?input.toString(a.start,a.stop):null),parseFloat((b10!=null?b10.getText():null))); 
					}
					break;
				case 12 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1051:14: UP_D '=' b11= ( INT | FLOAT | DOUBLE )
					{
					match(input,UP_D,FOLLOW_UP_D_in_sAnnotationElement3753); 
					match(input,148,FOLLOW_148_in_sAnnotationElement3756); 
					b11=input.LT(1);
					if ( input.LA(1)==DOUBLE||input.LA(1)==FLOAT||input.LA(1)==INT ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					 currentAnnotationVisitor.visit((a!=null?input.toString(a.start,a.stop):null),parseDouble((b11!=null?b11.getText():null))); 
					}
					break;
				case 13 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1052:14: ARRAY_B '=' (b12= INT )+
					{
					match(input,ARRAY_B,FOLLOW_ARRAY_B_in_sAnnotationElement3785); 
					match(input,148,FOLLOW_148_in_sAnnotationElement3787); 
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1052:27: (b12= INT )+
					int cnt21=0;
					loop21:
					while (true) {
						int alt21=2;
						int LA21_0 = input.LA(1);
						if ( (LA21_0==INT) ) {
							alt21=1;
						}

						switch (alt21) {
						case 1 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1052:28: b12= INT
							{
							b12=(Token)match(input,INT,FOLLOW_INT_in_sAnnotationElement3793); 
							array.add((byte)parseInt((b12!=null?b12.getText():null)));
							}
							break;

						default :
							if ( cnt21 >= 1 ) break loop21;
							EarlyExitException eee = new EarlyExitException(21, input);
							throw eee;
						}
						cnt21++;
					}

					 currentAnnotationVisitor.visit((a!=null?input.toString(a.start,a.stop):null),array); 
					}
					break;
				case 14 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1053:14: ARRAY_Z '=' (b13= INT )+
					{
					match(input,ARRAY_Z,FOLLOW_ARRAY_Z_in_sAnnotationElement3818); 
					match(input,148,FOLLOW_148_in_sAnnotationElement3820); 
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1053:27: (b13= INT )+
					int cnt22=0;
					loop22:
					while (true) {
						int alt22=2;
						int LA22_0 = input.LA(1);
						if ( (LA22_0==INT) ) {
							alt22=1;
						}

						switch (alt22) {
						case 1 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1053:28: b13= INT
							{
							b13=(Token)match(input,INT,FOLLOW_INT_in_sAnnotationElement3826); 
							array.add(0!=parseInt((b13!=null?b13.getText():null)));
							}
							break;

						default :
							if ( cnt22 >= 1 ) break loop22;
							EarlyExitException eee = new EarlyExitException(22, input);
							throw eee;
						}
						cnt22++;
					}

					 currentAnnotationVisitor.visit((a!=null?input.toString(a.start,a.stop):null),array); 
					}
					break;
				case 15 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1054:14: ARRAY_S '=' (b14= INT )+
					{
					match(input,ARRAY_S,FOLLOW_ARRAY_S_in_sAnnotationElement3854); 
					match(input,148,FOLLOW_148_in_sAnnotationElement3856); 
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1054:27: (b14= INT )+
					int cnt23=0;
					loop23:
					while (true) {
						int alt23=2;
						int LA23_0 = input.LA(1);
						if ( (LA23_0==INT) ) {
							alt23=1;
						}

						switch (alt23) {
						case 1 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1054:28: b14= INT
							{
							b14=(Token)match(input,INT,FOLLOW_INT_in_sAnnotationElement3862); 
							array.add((short)parseInt((b14!=null?b14.getText():null)));
							}
							break;

						default :
							if ( cnt23 >= 1 ) break loop23;
							EarlyExitException eee = new EarlyExitException(23, input);
							throw eee;
						}
						cnt23++;
					}

					 currentAnnotationVisitor.visit((a!=null?input.toString(a.start,a.stop):null),array); 
					}
					break;
				case 16 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1055:14: ARRAY_C '=' (b15= INT )+
					{
					match(input,ARRAY_C,FOLLOW_ARRAY_C_in_sAnnotationElement3886); 
					match(input,148,FOLLOW_148_in_sAnnotationElement3888); 
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1055:27: (b15= INT )+
					int cnt24=0;
					loop24:
					while (true) {
						int alt24=2;
						int LA24_0 = input.LA(1);
						if ( (LA24_0==INT) ) {
							alt24=1;
						}

						switch (alt24) {
						case 1 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1055:28: b15= INT
							{
							b15=(Token)match(input,INT,FOLLOW_INT_in_sAnnotationElement3894); 
							array.add((char)parseInt((b15!=null?b15.getText():null)));
							}
							break;

						default :
							if ( cnt24 >= 1 ) break loop24;
							EarlyExitException eee = new EarlyExitException(24, input);
							throw eee;
						}
						cnt24++;
					}

					 currentAnnotationVisitor.visit((a!=null?input.toString(a.start,a.stop):null),array); 
					}
					break;
				case 17 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1056:14: ARRAY_I '=' (b16= INT )+
					{
					match(input,ARRAY_I,FOLLOW_ARRAY_I_in_sAnnotationElement3919); 
					match(input,148,FOLLOW_148_in_sAnnotationElement3921); 
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1056:27: (b16= INT )+
					int cnt25=0;
					loop25:
					while (true) {
						int alt25=2;
						int LA25_0 = input.LA(1);
						if ( (LA25_0==INT) ) {
							alt25=1;
						}

						switch (alt25) {
						case 1 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1056:28: b16= INT
							{
							b16=(Token)match(input,INT,FOLLOW_INT_in_sAnnotationElement3927); 
							array.add(parseInt((b16!=null?b16.getText():null)));
							}
							break;

						default :
							if ( cnt25 >= 1 ) break loop25;
							EarlyExitException eee = new EarlyExitException(25, input);
							throw eee;
						}
						cnt25++;
					}

					 currentAnnotationVisitor.visit((a!=null?input.toString(a.start,a.stop):null),array); 
					}
					break;
				case 18 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1057:14: ARRAY_J '=' (b17= ( INT | LONG ) )+
					{
					match(input,ARRAY_J,FOLLOW_ARRAY_J_in_sAnnotationElement3958); 
					match(input,148,FOLLOW_148_in_sAnnotationElement3960); 
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1057:27: (b17= ( INT | LONG ) )+
					int cnt26=0;
					loop26:
					while (true) {
						int alt26=2;
						int LA26_0 = input.LA(1);
						if ( (LA26_0==INT||LA26_0==LONG) ) {
							alt26=1;
						}

						switch (alt26) {
						case 1 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1057:28: b17= ( INT | LONG )
							{
							b17=input.LT(1);
							if ( input.LA(1)==INT||input.LA(1)==LONG ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							array.add(parseLong((b17!=null?b17.getText():null)));
							}
							break;

						default :
							if ( cnt26 >= 1 ) break loop26;
							EarlyExitException eee = new EarlyExitException(26, input);
							throw eee;
						}
						cnt26++;
					}

					 currentAnnotationVisitor.visit((a!=null?input.toString(a.start,a.stop):null),array); 
					}
					break;
				case 19 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1058:14: ARRAY_F '=' (b18= ( INT | FLOAT | DOUBLE ) )+
					{
					match(input,ARRAY_F,FOLLOW_ARRAY_F_in_sAnnotationElement3993); 
					match(input,148,FOLLOW_148_in_sAnnotationElement3995); 
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1058:27: (b18= ( INT | FLOAT | DOUBLE ) )+
					int cnt27=0;
					loop27:
					while (true) {
						int alt27=2;
						int LA27_0 = input.LA(1);
						if ( (LA27_0==DOUBLE||LA27_0==FLOAT||LA27_0==INT) ) {
							alt27=1;
						}

						switch (alt27) {
						case 1 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1058:28: b18= ( INT | FLOAT | DOUBLE )
							{
							b18=input.LT(1);
							if ( input.LA(1)==DOUBLE||input.LA(1)==FLOAT||input.LA(1)==INT ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							array.add(parseFloat((b18!=null?b18.getText():null)));
							}
							break;

						default :
							if ( cnt27 >= 1 ) break loop27;
							EarlyExitException eee = new EarlyExitException(27, input);
							throw eee;
						}
						cnt27++;
					}

					 currentAnnotationVisitor.visit((a!=null?input.toString(a.start,a.stop):null),array); 
					}
					break;
				case 20 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1059:14: ARRAY_D '=' (b19= ( INT | DOUBLE ) )+
					{
					match(input,ARRAY_D,FOLLOW_ARRAY_D_in_sAnnotationElement4030); 
					match(input,148,FOLLOW_148_in_sAnnotationElement4032); 
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1059:27: (b19= ( INT | DOUBLE ) )+
					int cnt28=0;
					loop28:
					while (true) {
						int alt28=2;
						int LA28_0 = input.LA(1);
						if ( (LA28_0==DOUBLE||LA28_0==INT) ) {
							alt28=1;
						}

						switch (alt28) {
						case 1 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1059:28: b19= ( INT | DOUBLE )
							{
							b19=input.LT(1);
							if ( input.LA(1)==DOUBLE||input.LA(1)==INT ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							array.add(parseDouble((b19!=null?b19.getText():null)));
							}
							break;

						default :
							if ( cnt28 >= 1 ) break loop28;
							EarlyExitException eee = new EarlyExitException(28, input);
							throw eee;
						}
						cnt28++;
					}

					 currentAnnotationVisitor.visit((a!=null?input.toString(a.start,a.stop):null),array); 
					}
					break;
				case 21 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1060:14: ARRAY_LOW_E c= OBJECT_TYPE '=' ( (b1= sWord |b2= STRING |b3= DSTRING ) )+
					{
					match(input,ARRAY_LOW_E,FOLLOW_ARRAY_LOW_E_in_sAnnotationElement4070); 
					c=(Token)match(input,OBJECT_TYPE,FOLLOW_OBJECT_TYPE_in_sAnnotationElement4074); 
					match(input,148,FOLLOW_148_in_sAnnotationElement4076); 
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1060:45: ( (b1= sWord |b2= STRING |b3= DSTRING ) )+
					int cnt30=0;
					loop30:
					while (true) {
						int alt30=2;
						int LA30_0 = input.LA(1);
						if ( ((LA30_0 >= AND && LA30_0 <= ANNOTATION_VISIBLITY)||LA30_0==AT||LA30_0==DEFAULT||LA30_0==FROM||(LA30_0 >= HIGH && LA30_0 <= INNER)||(LA30_0 >= INVOKEDYNAMIC && LA30_0 <= LDC)||LA30_0==LOCALS||(LA30_0 >= LOOKUPSWITCH && LA30_0 <= METHOD_ANNOTATION_VISIBLITY)||LA30_0==MULTIANEWARRAY||(LA30_0 >= OP0 && LA30_0 <= OUTTER)||LA30_0==STACK||(LA30_0 >= TABLESWITCH && LA30_0 <= WLONG)||(LA30_0 >= WSHORT && LA30_0 <= XTYPE)) ) {
							switch ( input.LA(2) ) {
							case ID:
								{
								int LA30_4 = input.LA(3);
								if ( ((LA30_4 >= AND && LA30_4 <= ARRAY_AND)||(LA30_4 >= ARRAY_B && LA30_4 <= AT)||LA30_4==DEFAULT||LA30_4==DSTRING||LA30_4==FROM||(LA30_4 >= HIGH && LA30_4 <= INNER)||(LA30_4 >= INVOKEDYNAMIC && LA30_4 <= LDC)||LA30_4==LOCALS||(LA30_4 >= LOOKUPSWITCH && LA30_4 <= METHOD_ANNOTATION_VISIBLITY)||LA30_4==MULTIANEWARRAY||(LA30_4 >= OP0 && LA30_4 <= OUTTER)||(LA30_4 >= STACK && LA30_4 <= WLONG)||(LA30_4 >= WSHORT && LA30_4 <= XTYPE)||LA30_4==113) ) {
									alt30=1;
								}

								}
								break;
							case AT:
								{
								int LA30_5 = input.LA(3);
								if ( ((LA30_5 >= AND && LA30_5 <= ARRAY_AND)||(LA30_5 >= ARRAY_B && LA30_5 <= AT)||LA30_5==DEFAULT||LA30_5==DSTRING||LA30_5==FROM||(LA30_5 >= HIGH && LA30_5 <= INNER)||(LA30_5 >= INVOKEDYNAMIC && LA30_5 <= LDC)||LA30_5==LOCALS||(LA30_5 >= LOOKUPSWITCH && LA30_5 <= METHOD_ANNOTATION_VISIBLITY)||LA30_5==MULTIANEWARRAY||(LA30_5 >= OP0 && LA30_5 <= OUTTER)||(LA30_5 >= STACK && LA30_5 <= WLONG)||(LA30_5 >= WSHORT && LA30_5 <= XTYPE)||LA30_5==113) ) {
									alt30=1;
								}

								}
								break;
							case UP_B:
								{
								int LA30_6 = input.LA(3);
								if ( ((LA30_6 >= AND && LA30_6 <= ARRAY_AND)||(LA30_6 >= ARRAY_B && LA30_6 <= AT)||LA30_6==DEFAULT||LA30_6==DSTRING||LA30_6==FROM||(LA30_6 >= HIGH && LA30_6 <= INNER)||(LA30_6 >= INVOKEDYNAMIC && LA30_6 <= LDC)||LA30_6==LOCALS||(LA30_6 >= LOOKUPSWITCH && LA30_6 <= METHOD_ANNOTATION_VISIBLITY)||LA30_6==MULTIANEWARRAY||(LA30_6 >= OP0 && LA30_6 <= OUTTER)||(LA30_6 >= STACK && LA30_6 <= WLONG)||(LA30_6 >= WSHORT && LA30_6 <= XTYPE)||LA30_6==113) ) {
									alt30=1;
								}

								}
								break;
							case UP_Z:
								{
								int LA30_7 = input.LA(3);
								if ( ((LA30_7 >= AND && LA30_7 <= ARRAY_AND)||(LA30_7 >= ARRAY_B && LA30_7 <= AT)||LA30_7==DEFAULT||LA30_7==DSTRING||LA30_7==FROM||(LA30_7 >= HIGH && LA30_7 <= INNER)||(LA30_7 >= INVOKEDYNAMIC && LA30_7 <= LDC)||LA30_7==LOCALS||(LA30_7 >= LOOKUPSWITCH && LA30_7 <= METHOD_ANNOTATION_VISIBLITY)||LA30_7==MULTIANEWARRAY||(LA30_7 >= OP0 && LA30_7 <= OUTTER)||(LA30_7 >= STACK && LA30_7 <= WLONG)||(LA30_7 >= WSHORT && LA30_7 <= XTYPE)||LA30_7==113) ) {
									alt30=1;
								}

								}
								break;
							case UP_S:
								{
								int LA30_8 = input.LA(3);
								if ( ((LA30_8 >= AND && LA30_8 <= ARRAY_AND)||(LA30_8 >= ARRAY_B && LA30_8 <= AT)||LA30_8==DEFAULT||LA30_8==DSTRING||LA30_8==FROM||(LA30_8 >= HIGH && LA30_8 <= INNER)||(LA30_8 >= INVOKEDYNAMIC && LA30_8 <= LDC)||LA30_8==LOCALS||(LA30_8 >= LOOKUPSWITCH && LA30_8 <= METHOD_ANNOTATION_VISIBLITY)||LA30_8==MULTIANEWARRAY||(LA30_8 >= OP0 && LA30_8 <= OUTTER)||(LA30_8 >= STACK && LA30_8 <= WLONG)||(LA30_8 >= WSHORT && LA30_8 <= XTYPE)||LA30_8==113) ) {
									alt30=1;
								}

								}
								break;
							case UP_C:
								{
								int LA30_9 = input.LA(3);
								if ( ((LA30_9 >= AND && LA30_9 <= ARRAY_AND)||(LA30_9 >= ARRAY_B && LA30_9 <= AT)||LA30_9==DEFAULT||LA30_9==DSTRING||LA30_9==FROM||(LA30_9 >= HIGH && LA30_9 <= INNER)||(LA30_9 >= INVOKEDYNAMIC && LA30_9 <= LDC)||LA30_9==LOCALS||(LA30_9 >= LOOKUPSWITCH && LA30_9 <= METHOD_ANNOTATION_VISIBLITY)||LA30_9==MULTIANEWARRAY||(LA30_9 >= OP0 && LA30_9 <= OUTTER)||(LA30_9 >= STACK && LA30_9 <= WLONG)||(LA30_9 >= WSHORT && LA30_9 <= XTYPE)||LA30_9==113) ) {
									alt30=1;
								}

								}
								break;
							case UP_I:
								{
								int LA30_10 = input.LA(3);
								if ( ((LA30_10 >= AND && LA30_10 <= ARRAY_AND)||(LA30_10 >= ARRAY_B && LA30_10 <= AT)||LA30_10==DEFAULT||LA30_10==DSTRING||LA30_10==FROM||(LA30_10 >= HIGH && LA30_10 <= INNER)||(LA30_10 >= INVOKEDYNAMIC && LA30_10 <= LDC)||LA30_10==LOCALS||(LA30_10 >= LOOKUPSWITCH && LA30_10 <= METHOD_ANNOTATION_VISIBLITY)||LA30_10==MULTIANEWARRAY||(LA30_10 >= OP0 && LA30_10 <= OUTTER)||(LA30_10 >= STACK && LA30_10 <= WLONG)||(LA30_10 >= WSHORT && LA30_10 <= XTYPE)||LA30_10==113) ) {
									alt30=1;
								}

								}
								break;
							case UP_J:
								{
								int LA30_11 = input.LA(3);
								if ( ((LA30_11 >= AND && LA30_11 <= ARRAY_AND)||(LA30_11 >= ARRAY_B && LA30_11 <= AT)||LA30_11==DEFAULT||LA30_11==DSTRING||LA30_11==FROM||(LA30_11 >= HIGH && LA30_11 <= INNER)||(LA30_11 >= INVOKEDYNAMIC && LA30_11 <= LDC)||LA30_11==LOCALS||(LA30_11 >= LOOKUPSWITCH && LA30_11 <= METHOD_ANNOTATION_VISIBLITY)||LA30_11==MULTIANEWARRAY||(LA30_11 >= OP0 && LA30_11 <= OUTTER)||(LA30_11 >= STACK && LA30_11 <= WLONG)||(LA30_11 >= WSHORT && LA30_11 <= XTYPE)||LA30_11==113) ) {
									alt30=1;
								}

								}
								break;
							case UP_F:
								{
								int LA30_12 = input.LA(3);
								if ( ((LA30_12 >= AND && LA30_12 <= ARRAY_AND)||(LA30_12 >= ARRAY_B && LA30_12 <= AT)||LA30_12==DEFAULT||LA30_12==DSTRING||LA30_12==FROM||(LA30_12 >= HIGH && LA30_12 <= INNER)||(LA30_12 >= INVOKEDYNAMIC && LA30_12 <= LDC)||LA30_12==LOCALS||(LA30_12 >= LOOKUPSWITCH && LA30_12 <= METHOD_ANNOTATION_VISIBLITY)||LA30_12==MULTIANEWARRAY||(LA30_12 >= OP0 && LA30_12 <= OUTTER)||(LA30_12 >= STACK && LA30_12 <= WLONG)||(LA30_12 >= WSHORT && LA30_12 <= XTYPE)||LA30_12==113) ) {
									alt30=1;
								}

								}
								break;
							case UP_D:
								{
								int LA30_13 = input.LA(3);
								if ( ((LA30_13 >= AND && LA30_13 <= ARRAY_AND)||(LA30_13 >= ARRAY_B && LA30_13 <= AT)||LA30_13==DEFAULT||LA30_13==DSTRING||LA30_13==FROM||(LA30_13 >= HIGH && LA30_13 <= INNER)||(LA30_13 >= INVOKEDYNAMIC && LA30_13 <= LDC)||LA30_13==LOCALS||(LA30_13 >= LOOKUPSWITCH && LA30_13 <= METHOD_ANNOTATION_VISIBLITY)||LA30_13==MULTIANEWARRAY||(LA30_13 >= OP0 && LA30_13 <= OUTTER)||(LA30_13 >= STACK && LA30_13 <= WLONG)||(LA30_13 >= WSHORT && LA30_13 <= XTYPE)||LA30_13==113) ) {
									alt30=1;
								}

								}
								break;
							case AND:
							case ANNOTATION_VISIBLITY:
							case DEFAULT:
							case DSTRING:
							case FROM:
							case HIGH:
							case IIOP:
							case INNER:
							case INVOKEDYNAMIC:
							case INVOKEINTERFACE:
							case IOP:
							case JOP:
							case LDC:
							case LOCALS:
							case LOOKUPSWITCH:
							case METHOD_ANNOTATION_VISIBLITY:
							case MULTIANEWARRAY:
							case OP0:
							case OUTTER:
							case STACK:
							case STRING:
							case TABLESWITCH:
							case TO:
							case USING:
							case VOID_TYPE:
							case WBOOLEAN:
							case WBYTE:
							case WCHAR:
							case WDOUBLE:
							case WFLOAT:
							case WINTEGER:
							case WLONG:
							case WSHORT:
							case XFIELD:
							case XINVOKE:
							case XNEWARRAY:
							case XTYPE:
							case 113:
								{
								alt30=1;
								}
								break;
							}
						}
						else if ( (LA30_0==DSTRING||LA30_0==STRING) ) {
							alt30=1;
						}

						switch (alt30) {
						case 1 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1060:46: (b1= sWord |b2= STRING |b3= DSTRING )
							{
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1060:46: (b1= sWord |b2= STRING |b3= DSTRING )
							int alt29=3;
							switch ( input.LA(1) ) {
							case AND:
							case ANNOTATION_VISIBLITY:
							case AT:
							case DEFAULT:
							case FROM:
							case HIGH:
							case ID:
							case IIOP:
							case INNER:
							case INVOKEDYNAMIC:
							case INVOKEINTERFACE:
							case IOP:
							case JOP:
							case LDC:
							case LOCALS:
							case LOOKUPSWITCH:
							case METHOD_ANNOTATION_VISIBLITY:
							case MULTIANEWARRAY:
							case OP0:
							case OUTTER:
							case STACK:
							case TABLESWITCH:
							case TO:
							case UP_B:
							case UP_C:
							case UP_D:
							case UP_F:
							case UP_I:
							case UP_J:
							case UP_S:
							case UP_Z:
							case USING:
							case VOID_TYPE:
							case WBOOLEAN:
							case WBYTE:
							case WCHAR:
							case WDOUBLE:
							case WFLOAT:
							case WINTEGER:
							case WLONG:
							case WSHORT:
							case XFIELD:
							case XINVOKE:
							case XNEWARRAY:
							case XTYPE:
								{
								alt29=1;
								}
								break;
							case STRING:
								{
								alt29=2;
								}
								break;
							case DSTRING:
								{
								alt29=3;
								}
								break;
							default:
								NoViableAltException nvae =
									new NoViableAltException("", 29, 0, input);
								throw nvae;
							}
							switch (alt29) {
								case 1 :
									// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1060:47: b1= sWord
									{
									pushFollow(FOLLOW_sWord_in_sAnnotationElement4083);
									b1=sWord();
									state._fsp--;

									  array.add(new String[]{(c!=null?c.getText():null),unEscape((b1!=null?input.toString(b1.start,b1.stop):null))}); 
									}
									break;
								case 2 :
									// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1060:113: b2= STRING
									{
									b2=(Token)match(input,STRING,FOLLOW_STRING_in_sAnnotationElement4088); 
									  array.add(new String[]{(c!=null?c.getText():null),unEscapeString((b2!=null?b2.getText():null))}); 
									}
									break;
								case 3 :
									// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1060:186: b3= DSTRING
									{
									b3=(Token)match(input,DSTRING,FOLLOW_DSTRING_in_sAnnotationElement4093); 
									  array.add(new String[]{(c!=null?c.getText():null),unEscapeString((b3!=null?b3.getText():null))}); 
									}
									break;

							}

							}
							break;

						default :
							if ( cnt30 >= 1 ) break loop30;
							EarlyExitException eee = new EarlyExitException(30, input);
							throw eee;
						}
						cnt30++;
					}

					 currentAnnotationVisitor.visit((a!=null?input.toString(a.start,a.stop):null),array); 
					}
					break;
				case 22 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1061:14: ARRAY_AND b20= OBJECT_TYPE '=' ARRAY_AT '=' ( sSubannotation )+
					{
					match(input,ARRAY_AND,FOLLOW_ARRAY_AND_in_sAnnotationElement4117); 
					b20=(Token)match(input,OBJECT_TYPE,FOLLOW_OBJECT_TYPE_in_sAnnotationElement4121); 
					match(input,148,FOLLOW_148_in_sAnnotationElement4123); 
					match(input,ARRAY_AT,FOLLOW_ARRAY_AT_in_sAnnotationElement4125); 
					match(input,148,FOLLOW_148_in_sAnnotationElement4127); 
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1061:58: ( sSubannotation )+
					int cnt31=0;
					loop31:
					while (true) {
						int alt31=2;
						int LA31_0 = input.LA(1);
						if ( (LA31_0==92) ) {
							alt31=1;
						}

						switch (alt31) {
						case 1 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1061:59: sSubannotation
							{
							currentAnnotationVisitor=new AnnotationNode((b20!=null?b20.getText():null));
							pushFollow(FOLLOW_sSubannotation_in_sAnnotationElement4133);
							sSubannotation();
							state._fsp--;

							 array.add(currentAnnotationVisitor); 
							}
							break;

						default :
							if ( cnt31 >= 1 ) break loop31;
							EarlyExitException eee = new EarlyExitException(31, input);
							throw eee;
						}
						cnt31++;
					}

					 currentAnnotationVisitor.visit((a!=null?input.toString(a.start,a.stop):null),array); 
					}
					break;
				case 23 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1062:14: ARRAY_LOW_C '=' (b= sClassDesc )+
					{
					match(input,ARRAY_LOW_C,FOLLOW_ARRAY_LOW_C_in_sAnnotationElement4153); 
					match(input,148,FOLLOW_148_in_sAnnotationElement4155); 
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1062:31: (b= sClassDesc )+
					int cnt32=0;
					loop32:
					while (true) {
						int alt32=2;
						switch ( input.LA(1) ) {
						case UP_Z:
							{
							switch ( input.LA(2) ) {
							case ID:
								{
								int LA32_11 = input.LA(3);
								if ( (LA32_11==ARRAY_AND||(LA32_11 >= ARRAY_B && LA32_11 <= AT)||LA32_11==ID||(LA32_11 >= UP_B && LA32_11 <= UP_Z)) ) {
									alt32=1;
								}

								}
								break;
							case AT:
								{
								int LA32_12 = input.LA(3);
								if ( (LA32_12==ARRAY_AND||(LA32_12 >= ARRAY_B && LA32_12 <= AT)||LA32_12==ID||(LA32_12 >= UP_B && LA32_12 <= UP_Z)) ) {
									alt32=1;
								}

								}
								break;
							case UP_B:
								{
								int LA32_13 = input.LA(3);
								if ( ((LA32_13 >= AND && LA32_13 <= ARRAY_AND)||(LA32_13 >= ARRAY_B && LA32_13 <= AT)||LA32_13==DEFAULT||LA32_13==FROM||(LA32_13 >= HIGH && LA32_13 <= INNER)||(LA32_13 >= INVOKEDYNAMIC && LA32_13 <= LDC)||LA32_13==LOCALS||(LA32_13 >= LOOKUPSWITCH && LA32_13 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_13 >= MULTIANEWARRAY && LA32_13 <= PARRAY_TYPE)||LA32_13==STACK||(LA32_13 >= TABLESWITCH && LA32_13 <= WLONG)||(LA32_13 >= WSHORT && LA32_13 <= XTYPE)||LA32_13==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_Z:
								{
								int LA32_14 = input.LA(3);
								if ( ((LA32_14 >= AND && LA32_14 <= ARRAY_AND)||(LA32_14 >= ARRAY_B && LA32_14 <= AT)||LA32_14==DEFAULT||LA32_14==FROM||(LA32_14 >= HIGH && LA32_14 <= INNER)||(LA32_14 >= INVOKEDYNAMIC && LA32_14 <= LDC)||LA32_14==LOCALS||(LA32_14 >= LOOKUPSWITCH && LA32_14 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_14 >= MULTIANEWARRAY && LA32_14 <= PARRAY_TYPE)||LA32_14==STACK||(LA32_14 >= TABLESWITCH && LA32_14 <= WLONG)||(LA32_14 >= WSHORT && LA32_14 <= XTYPE)||LA32_14==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_S:
								{
								int LA32_15 = input.LA(3);
								if ( ((LA32_15 >= AND && LA32_15 <= ARRAY_AND)||(LA32_15 >= ARRAY_B && LA32_15 <= AT)||LA32_15==DEFAULT||LA32_15==FROM||(LA32_15 >= HIGH && LA32_15 <= INNER)||(LA32_15 >= INVOKEDYNAMIC && LA32_15 <= LDC)||LA32_15==LOCALS||(LA32_15 >= LOOKUPSWITCH && LA32_15 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_15 >= MULTIANEWARRAY && LA32_15 <= PARRAY_TYPE)||LA32_15==STACK||(LA32_15 >= TABLESWITCH && LA32_15 <= WLONG)||(LA32_15 >= WSHORT && LA32_15 <= XTYPE)||LA32_15==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_C:
								{
								int LA32_16 = input.LA(3);
								if ( ((LA32_16 >= AND && LA32_16 <= ARRAY_AND)||(LA32_16 >= ARRAY_B && LA32_16 <= AT)||LA32_16==DEFAULT||LA32_16==FROM||(LA32_16 >= HIGH && LA32_16 <= INNER)||(LA32_16 >= INVOKEDYNAMIC && LA32_16 <= LDC)||LA32_16==LOCALS||(LA32_16 >= LOOKUPSWITCH && LA32_16 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_16 >= MULTIANEWARRAY && LA32_16 <= PARRAY_TYPE)||LA32_16==STACK||(LA32_16 >= TABLESWITCH && LA32_16 <= WLONG)||(LA32_16 >= WSHORT && LA32_16 <= XTYPE)||LA32_16==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_I:
								{
								int LA32_17 = input.LA(3);
								if ( ((LA32_17 >= AND && LA32_17 <= ARRAY_AND)||(LA32_17 >= ARRAY_B && LA32_17 <= AT)||LA32_17==DEFAULT||LA32_17==FROM||(LA32_17 >= HIGH && LA32_17 <= INNER)||(LA32_17 >= INVOKEDYNAMIC && LA32_17 <= LDC)||LA32_17==LOCALS||(LA32_17 >= LOOKUPSWITCH && LA32_17 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_17 >= MULTIANEWARRAY && LA32_17 <= PARRAY_TYPE)||LA32_17==STACK||(LA32_17 >= TABLESWITCH && LA32_17 <= WLONG)||(LA32_17 >= WSHORT && LA32_17 <= XTYPE)||LA32_17==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_J:
								{
								int LA32_18 = input.LA(3);
								if ( ((LA32_18 >= AND && LA32_18 <= ARRAY_AND)||(LA32_18 >= ARRAY_B && LA32_18 <= AT)||LA32_18==DEFAULT||LA32_18==FROM||(LA32_18 >= HIGH && LA32_18 <= INNER)||(LA32_18 >= INVOKEDYNAMIC && LA32_18 <= LDC)||LA32_18==LOCALS||(LA32_18 >= LOOKUPSWITCH && LA32_18 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_18 >= MULTIANEWARRAY && LA32_18 <= PARRAY_TYPE)||LA32_18==STACK||(LA32_18 >= TABLESWITCH && LA32_18 <= WLONG)||(LA32_18 >= WSHORT && LA32_18 <= XTYPE)||LA32_18==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_F:
								{
								int LA32_19 = input.LA(3);
								if ( ((LA32_19 >= AND && LA32_19 <= ARRAY_AND)||(LA32_19 >= ARRAY_B && LA32_19 <= AT)||LA32_19==DEFAULT||LA32_19==FROM||(LA32_19 >= HIGH && LA32_19 <= INNER)||(LA32_19 >= INVOKEDYNAMIC && LA32_19 <= LDC)||LA32_19==LOCALS||(LA32_19 >= LOOKUPSWITCH && LA32_19 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_19 >= MULTIANEWARRAY && LA32_19 <= PARRAY_TYPE)||LA32_19==STACK||(LA32_19 >= TABLESWITCH && LA32_19 <= WLONG)||(LA32_19 >= WSHORT && LA32_19 <= XTYPE)||LA32_19==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_D:
								{
								int LA32_20 = input.LA(3);
								if ( ((LA32_20 >= AND && LA32_20 <= ARRAY_AND)||(LA32_20 >= ARRAY_B && LA32_20 <= AT)||LA32_20==DEFAULT||LA32_20==FROM||(LA32_20 >= HIGH && LA32_20 <= INNER)||(LA32_20 >= INVOKEDYNAMIC && LA32_20 <= LDC)||LA32_20==LOCALS||(LA32_20 >= LOOKUPSWITCH && LA32_20 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_20 >= MULTIANEWARRAY && LA32_20 <= PARRAY_TYPE)||LA32_20==STACK||(LA32_20 >= TABLESWITCH && LA32_20 <= WLONG)||(LA32_20 >= WSHORT && LA32_20 <= XTYPE)||LA32_20==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_B:
								{
								int LA32_21 = input.LA(3);
								if ( ((LA32_21 >= AND && LA32_21 <= ANNOTATION_VISIBLITY)||(LA32_21 >= ARRAY_B && LA32_21 <= ARRAY_J)||(LA32_21 >= ARRAY_S && LA32_21 <= AT)||LA32_21==DEFAULT||LA32_21==FROM||(LA32_21 >= HIGH && LA32_21 <= INNER)||(LA32_21 >= INVOKEDYNAMIC && LA32_21 <= LDC)||LA32_21==LOCALS||(LA32_21 >= LOOKUPSWITCH && LA32_21 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_21 >= MULTIANEWARRAY && LA32_21 <= PARRAY_TYPE)||LA32_21==STACK||(LA32_21 >= TABLESWITCH && LA32_21 <= WLONG)||(LA32_21 >= WSHORT && LA32_21 <= XTYPE)||LA32_21==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_Z:
								{
								int LA32_22 = input.LA(3);
								if ( ((LA32_22 >= AND && LA32_22 <= ANNOTATION_VISIBLITY)||(LA32_22 >= ARRAY_B && LA32_22 <= ARRAY_J)||(LA32_22 >= ARRAY_S && LA32_22 <= AT)||LA32_22==DEFAULT||LA32_22==FROM||(LA32_22 >= HIGH && LA32_22 <= INNER)||(LA32_22 >= INVOKEDYNAMIC && LA32_22 <= LDC)||LA32_22==LOCALS||(LA32_22 >= LOOKUPSWITCH && LA32_22 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_22 >= MULTIANEWARRAY && LA32_22 <= PARRAY_TYPE)||LA32_22==STACK||(LA32_22 >= TABLESWITCH && LA32_22 <= WLONG)||(LA32_22 >= WSHORT && LA32_22 <= XTYPE)||LA32_22==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_S:
								{
								int LA32_23 = input.LA(3);
								if ( ((LA32_23 >= AND && LA32_23 <= ANNOTATION_VISIBLITY)||(LA32_23 >= ARRAY_B && LA32_23 <= ARRAY_J)||(LA32_23 >= ARRAY_S && LA32_23 <= AT)||LA32_23==DEFAULT||LA32_23==FROM||(LA32_23 >= HIGH && LA32_23 <= INNER)||(LA32_23 >= INVOKEDYNAMIC && LA32_23 <= LDC)||LA32_23==LOCALS||(LA32_23 >= LOOKUPSWITCH && LA32_23 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_23 >= MULTIANEWARRAY && LA32_23 <= PARRAY_TYPE)||LA32_23==STACK||(LA32_23 >= TABLESWITCH && LA32_23 <= WLONG)||(LA32_23 >= WSHORT && LA32_23 <= XTYPE)||LA32_23==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_C:
								{
								int LA32_24 = input.LA(3);
								if ( ((LA32_24 >= AND && LA32_24 <= ANNOTATION_VISIBLITY)||(LA32_24 >= ARRAY_B && LA32_24 <= ARRAY_J)||(LA32_24 >= ARRAY_S && LA32_24 <= AT)||LA32_24==DEFAULT||LA32_24==FROM||(LA32_24 >= HIGH && LA32_24 <= INNER)||(LA32_24 >= INVOKEDYNAMIC && LA32_24 <= LDC)||LA32_24==LOCALS||(LA32_24 >= LOOKUPSWITCH && LA32_24 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_24 >= MULTIANEWARRAY && LA32_24 <= PARRAY_TYPE)||LA32_24==STACK||(LA32_24 >= TABLESWITCH && LA32_24 <= WLONG)||(LA32_24 >= WSHORT && LA32_24 <= XTYPE)||LA32_24==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_I:
								{
								int LA32_25 = input.LA(3);
								if ( ((LA32_25 >= AND && LA32_25 <= ANNOTATION_VISIBLITY)||(LA32_25 >= ARRAY_B && LA32_25 <= ARRAY_J)||(LA32_25 >= ARRAY_S && LA32_25 <= AT)||LA32_25==DEFAULT||LA32_25==FROM||(LA32_25 >= HIGH && LA32_25 <= INNER)||(LA32_25 >= INVOKEDYNAMIC && LA32_25 <= LDC)||LA32_25==LOCALS||(LA32_25 >= LOOKUPSWITCH && LA32_25 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_25 >= MULTIANEWARRAY && LA32_25 <= PARRAY_TYPE)||LA32_25==STACK||(LA32_25 >= TABLESWITCH && LA32_25 <= WLONG)||(LA32_25 >= WSHORT && LA32_25 <= XTYPE)||LA32_25==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_J:
								{
								int LA32_26 = input.LA(3);
								if ( ((LA32_26 >= AND && LA32_26 <= ANNOTATION_VISIBLITY)||(LA32_26 >= ARRAY_B && LA32_26 <= ARRAY_J)||(LA32_26 >= ARRAY_S && LA32_26 <= AT)||LA32_26==DEFAULT||LA32_26==FROM||(LA32_26 >= HIGH && LA32_26 <= INNER)||(LA32_26 >= INVOKEDYNAMIC && LA32_26 <= LDC)||LA32_26==LOCALS||(LA32_26 >= LOOKUPSWITCH && LA32_26 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_26 >= MULTIANEWARRAY && LA32_26 <= PARRAY_TYPE)||LA32_26==STACK||(LA32_26 >= TABLESWITCH && LA32_26 <= WLONG)||(LA32_26 >= WSHORT && LA32_26 <= XTYPE)||LA32_26==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_F:
								{
								int LA32_27 = input.LA(3);
								if ( ((LA32_27 >= AND && LA32_27 <= ANNOTATION_VISIBLITY)||(LA32_27 >= ARRAY_B && LA32_27 <= ARRAY_J)||(LA32_27 >= ARRAY_S && LA32_27 <= AT)||LA32_27==DEFAULT||LA32_27==FROM||(LA32_27 >= HIGH && LA32_27 <= INNER)||(LA32_27 >= INVOKEDYNAMIC && LA32_27 <= LDC)||LA32_27==LOCALS||(LA32_27 >= LOOKUPSWITCH && LA32_27 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_27 >= MULTIANEWARRAY && LA32_27 <= PARRAY_TYPE)||LA32_27==STACK||(LA32_27 >= TABLESWITCH && LA32_27 <= WLONG)||(LA32_27 >= WSHORT && LA32_27 <= XTYPE)||LA32_27==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_D:
								{
								int LA32_28 = input.LA(3);
								if ( ((LA32_28 >= AND && LA32_28 <= ANNOTATION_VISIBLITY)||(LA32_28 >= ARRAY_B && LA32_28 <= ARRAY_J)||(LA32_28 >= ARRAY_S && LA32_28 <= AT)||LA32_28==DEFAULT||LA32_28==FROM||(LA32_28 >= HIGH && LA32_28 <= INNER)||(LA32_28 >= INVOKEDYNAMIC && LA32_28 <= LDC)||LA32_28==LOCALS||(LA32_28 >= LOOKUPSWITCH && LA32_28 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_28 >= MULTIANEWARRAY && LA32_28 <= PARRAY_TYPE)||LA32_28==STACK||(LA32_28 >= TABLESWITCH && LA32_28 <= WLONG)||(LA32_28 >= WSHORT && LA32_28 <= XTYPE)||LA32_28==113) ) {
									alt32=1;
								}

								}
								break;
							case AND:
							case ANNOTATION_VISIBLITY:
							case DEFAULT:
							case FROM:
							case HIGH:
							case IIOP:
							case INNER:
							case INVOKEDYNAMIC:
							case INVOKEINTERFACE:
							case IOP:
							case JOP:
							case LDC:
							case LOCALS:
							case LOOKUPSWITCH:
							case METHOD_ANNOTATION_VISIBLITY:
							case MULTIANEWARRAY:
							case OBJECT_TYPE:
							case OP0:
							case OUTTER:
							case PARRAY_TYPE:
							case STACK:
							case TABLESWITCH:
							case TO:
							case USING:
							case VOID_TYPE:
							case WBOOLEAN:
							case WBYTE:
							case WCHAR:
							case WDOUBLE:
							case WFLOAT:
							case WINTEGER:
							case WLONG:
							case WSHORT:
							case XFIELD:
							case XINVOKE:
							case XNEWARRAY:
							case XTYPE:
							case 113:
								{
								alt32=1;
								}
								break;
							}
							}
							break;
						case ARRAY_B:
						case ARRAY_C:
						case ARRAY_D:
						case ARRAY_F:
						case ARRAY_I:
						case ARRAY_J:
						case ARRAY_S:
						case ARRAY_Z:
						case OBJECT_TYPE:
						case PARRAY_TYPE:
							{
							alt32=1;
							}
							break;
						case UP_B:
							{
							switch ( input.LA(2) ) {
							case ID:
								{
								int LA32_11 = input.LA(3);
								if ( (LA32_11==ARRAY_AND||(LA32_11 >= ARRAY_B && LA32_11 <= AT)||LA32_11==ID||(LA32_11 >= UP_B && LA32_11 <= UP_Z)) ) {
									alt32=1;
								}

								}
								break;
							case AT:
								{
								int LA32_12 = input.LA(3);
								if ( (LA32_12==ARRAY_AND||(LA32_12 >= ARRAY_B && LA32_12 <= AT)||LA32_12==ID||(LA32_12 >= UP_B && LA32_12 <= UP_Z)) ) {
									alt32=1;
								}

								}
								break;
							case UP_B:
								{
								int LA32_13 = input.LA(3);
								if ( ((LA32_13 >= AND && LA32_13 <= ARRAY_AND)||(LA32_13 >= ARRAY_B && LA32_13 <= AT)||LA32_13==DEFAULT||LA32_13==FROM||(LA32_13 >= HIGH && LA32_13 <= INNER)||(LA32_13 >= INVOKEDYNAMIC && LA32_13 <= LDC)||LA32_13==LOCALS||(LA32_13 >= LOOKUPSWITCH && LA32_13 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_13 >= MULTIANEWARRAY && LA32_13 <= PARRAY_TYPE)||LA32_13==STACK||(LA32_13 >= TABLESWITCH && LA32_13 <= WLONG)||(LA32_13 >= WSHORT && LA32_13 <= XTYPE)||LA32_13==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_Z:
								{
								int LA32_14 = input.LA(3);
								if ( ((LA32_14 >= AND && LA32_14 <= ARRAY_AND)||(LA32_14 >= ARRAY_B && LA32_14 <= AT)||LA32_14==DEFAULT||LA32_14==FROM||(LA32_14 >= HIGH && LA32_14 <= INNER)||(LA32_14 >= INVOKEDYNAMIC && LA32_14 <= LDC)||LA32_14==LOCALS||(LA32_14 >= LOOKUPSWITCH && LA32_14 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_14 >= MULTIANEWARRAY && LA32_14 <= PARRAY_TYPE)||LA32_14==STACK||(LA32_14 >= TABLESWITCH && LA32_14 <= WLONG)||(LA32_14 >= WSHORT && LA32_14 <= XTYPE)||LA32_14==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_S:
								{
								int LA32_15 = input.LA(3);
								if ( ((LA32_15 >= AND && LA32_15 <= ARRAY_AND)||(LA32_15 >= ARRAY_B && LA32_15 <= AT)||LA32_15==DEFAULT||LA32_15==FROM||(LA32_15 >= HIGH && LA32_15 <= INNER)||(LA32_15 >= INVOKEDYNAMIC && LA32_15 <= LDC)||LA32_15==LOCALS||(LA32_15 >= LOOKUPSWITCH && LA32_15 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_15 >= MULTIANEWARRAY && LA32_15 <= PARRAY_TYPE)||LA32_15==STACK||(LA32_15 >= TABLESWITCH && LA32_15 <= WLONG)||(LA32_15 >= WSHORT && LA32_15 <= XTYPE)||LA32_15==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_C:
								{
								int LA32_16 = input.LA(3);
								if ( ((LA32_16 >= AND && LA32_16 <= ARRAY_AND)||(LA32_16 >= ARRAY_B && LA32_16 <= AT)||LA32_16==DEFAULT||LA32_16==FROM||(LA32_16 >= HIGH && LA32_16 <= INNER)||(LA32_16 >= INVOKEDYNAMIC && LA32_16 <= LDC)||LA32_16==LOCALS||(LA32_16 >= LOOKUPSWITCH && LA32_16 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_16 >= MULTIANEWARRAY && LA32_16 <= PARRAY_TYPE)||LA32_16==STACK||(LA32_16 >= TABLESWITCH && LA32_16 <= WLONG)||(LA32_16 >= WSHORT && LA32_16 <= XTYPE)||LA32_16==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_I:
								{
								int LA32_17 = input.LA(3);
								if ( ((LA32_17 >= AND && LA32_17 <= ARRAY_AND)||(LA32_17 >= ARRAY_B && LA32_17 <= AT)||LA32_17==DEFAULT||LA32_17==FROM||(LA32_17 >= HIGH && LA32_17 <= INNER)||(LA32_17 >= INVOKEDYNAMIC && LA32_17 <= LDC)||LA32_17==LOCALS||(LA32_17 >= LOOKUPSWITCH && LA32_17 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_17 >= MULTIANEWARRAY && LA32_17 <= PARRAY_TYPE)||LA32_17==STACK||(LA32_17 >= TABLESWITCH && LA32_17 <= WLONG)||(LA32_17 >= WSHORT && LA32_17 <= XTYPE)||LA32_17==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_J:
								{
								int LA32_18 = input.LA(3);
								if ( ((LA32_18 >= AND && LA32_18 <= ARRAY_AND)||(LA32_18 >= ARRAY_B && LA32_18 <= AT)||LA32_18==DEFAULT||LA32_18==FROM||(LA32_18 >= HIGH && LA32_18 <= INNER)||(LA32_18 >= INVOKEDYNAMIC && LA32_18 <= LDC)||LA32_18==LOCALS||(LA32_18 >= LOOKUPSWITCH && LA32_18 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_18 >= MULTIANEWARRAY && LA32_18 <= PARRAY_TYPE)||LA32_18==STACK||(LA32_18 >= TABLESWITCH && LA32_18 <= WLONG)||(LA32_18 >= WSHORT && LA32_18 <= XTYPE)||LA32_18==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_F:
								{
								int LA32_19 = input.LA(3);
								if ( ((LA32_19 >= AND && LA32_19 <= ARRAY_AND)||(LA32_19 >= ARRAY_B && LA32_19 <= AT)||LA32_19==DEFAULT||LA32_19==FROM||(LA32_19 >= HIGH && LA32_19 <= INNER)||(LA32_19 >= INVOKEDYNAMIC && LA32_19 <= LDC)||LA32_19==LOCALS||(LA32_19 >= LOOKUPSWITCH && LA32_19 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_19 >= MULTIANEWARRAY && LA32_19 <= PARRAY_TYPE)||LA32_19==STACK||(LA32_19 >= TABLESWITCH && LA32_19 <= WLONG)||(LA32_19 >= WSHORT && LA32_19 <= XTYPE)||LA32_19==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_D:
								{
								int LA32_20 = input.LA(3);
								if ( ((LA32_20 >= AND && LA32_20 <= ARRAY_AND)||(LA32_20 >= ARRAY_B && LA32_20 <= AT)||LA32_20==DEFAULT||LA32_20==FROM||(LA32_20 >= HIGH && LA32_20 <= INNER)||(LA32_20 >= INVOKEDYNAMIC && LA32_20 <= LDC)||LA32_20==LOCALS||(LA32_20 >= LOOKUPSWITCH && LA32_20 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_20 >= MULTIANEWARRAY && LA32_20 <= PARRAY_TYPE)||LA32_20==STACK||(LA32_20 >= TABLESWITCH && LA32_20 <= WLONG)||(LA32_20 >= WSHORT && LA32_20 <= XTYPE)||LA32_20==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_B:
								{
								int LA32_21 = input.LA(3);
								if ( ((LA32_21 >= AND && LA32_21 <= ANNOTATION_VISIBLITY)||(LA32_21 >= ARRAY_B && LA32_21 <= ARRAY_J)||(LA32_21 >= ARRAY_S && LA32_21 <= AT)||LA32_21==DEFAULT||LA32_21==FROM||(LA32_21 >= HIGH && LA32_21 <= INNER)||(LA32_21 >= INVOKEDYNAMIC && LA32_21 <= LDC)||LA32_21==LOCALS||(LA32_21 >= LOOKUPSWITCH && LA32_21 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_21 >= MULTIANEWARRAY && LA32_21 <= PARRAY_TYPE)||LA32_21==STACK||(LA32_21 >= TABLESWITCH && LA32_21 <= WLONG)||(LA32_21 >= WSHORT && LA32_21 <= XTYPE)||LA32_21==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_Z:
								{
								int LA32_22 = input.LA(3);
								if ( ((LA32_22 >= AND && LA32_22 <= ANNOTATION_VISIBLITY)||(LA32_22 >= ARRAY_B && LA32_22 <= ARRAY_J)||(LA32_22 >= ARRAY_S && LA32_22 <= AT)||LA32_22==DEFAULT||LA32_22==FROM||(LA32_22 >= HIGH && LA32_22 <= INNER)||(LA32_22 >= INVOKEDYNAMIC && LA32_22 <= LDC)||LA32_22==LOCALS||(LA32_22 >= LOOKUPSWITCH && LA32_22 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_22 >= MULTIANEWARRAY && LA32_22 <= PARRAY_TYPE)||LA32_22==STACK||(LA32_22 >= TABLESWITCH && LA32_22 <= WLONG)||(LA32_22 >= WSHORT && LA32_22 <= XTYPE)||LA32_22==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_S:
								{
								int LA32_23 = input.LA(3);
								if ( ((LA32_23 >= AND && LA32_23 <= ANNOTATION_VISIBLITY)||(LA32_23 >= ARRAY_B && LA32_23 <= ARRAY_J)||(LA32_23 >= ARRAY_S && LA32_23 <= AT)||LA32_23==DEFAULT||LA32_23==FROM||(LA32_23 >= HIGH && LA32_23 <= INNER)||(LA32_23 >= INVOKEDYNAMIC && LA32_23 <= LDC)||LA32_23==LOCALS||(LA32_23 >= LOOKUPSWITCH && LA32_23 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_23 >= MULTIANEWARRAY && LA32_23 <= PARRAY_TYPE)||LA32_23==STACK||(LA32_23 >= TABLESWITCH && LA32_23 <= WLONG)||(LA32_23 >= WSHORT && LA32_23 <= XTYPE)||LA32_23==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_C:
								{
								int LA32_24 = input.LA(3);
								if ( ((LA32_24 >= AND && LA32_24 <= ANNOTATION_VISIBLITY)||(LA32_24 >= ARRAY_B && LA32_24 <= ARRAY_J)||(LA32_24 >= ARRAY_S && LA32_24 <= AT)||LA32_24==DEFAULT||LA32_24==FROM||(LA32_24 >= HIGH && LA32_24 <= INNER)||(LA32_24 >= INVOKEDYNAMIC && LA32_24 <= LDC)||LA32_24==LOCALS||(LA32_24 >= LOOKUPSWITCH && LA32_24 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_24 >= MULTIANEWARRAY && LA32_24 <= PARRAY_TYPE)||LA32_24==STACK||(LA32_24 >= TABLESWITCH && LA32_24 <= WLONG)||(LA32_24 >= WSHORT && LA32_24 <= XTYPE)||LA32_24==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_I:
								{
								int LA32_25 = input.LA(3);
								if ( ((LA32_25 >= AND && LA32_25 <= ANNOTATION_VISIBLITY)||(LA32_25 >= ARRAY_B && LA32_25 <= ARRAY_J)||(LA32_25 >= ARRAY_S && LA32_25 <= AT)||LA32_25==DEFAULT||LA32_25==FROM||(LA32_25 >= HIGH && LA32_25 <= INNER)||(LA32_25 >= INVOKEDYNAMIC && LA32_25 <= LDC)||LA32_25==LOCALS||(LA32_25 >= LOOKUPSWITCH && LA32_25 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_25 >= MULTIANEWARRAY && LA32_25 <= PARRAY_TYPE)||LA32_25==STACK||(LA32_25 >= TABLESWITCH && LA32_25 <= WLONG)||(LA32_25 >= WSHORT && LA32_25 <= XTYPE)||LA32_25==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_J:
								{
								int LA32_26 = input.LA(3);
								if ( ((LA32_26 >= AND && LA32_26 <= ANNOTATION_VISIBLITY)||(LA32_26 >= ARRAY_B && LA32_26 <= ARRAY_J)||(LA32_26 >= ARRAY_S && LA32_26 <= AT)||LA32_26==DEFAULT||LA32_26==FROM||(LA32_26 >= HIGH && LA32_26 <= INNER)||(LA32_26 >= INVOKEDYNAMIC && LA32_26 <= LDC)||LA32_26==LOCALS||(LA32_26 >= LOOKUPSWITCH && LA32_26 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_26 >= MULTIANEWARRAY && LA32_26 <= PARRAY_TYPE)||LA32_26==STACK||(LA32_26 >= TABLESWITCH && LA32_26 <= WLONG)||(LA32_26 >= WSHORT && LA32_26 <= XTYPE)||LA32_26==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_F:
								{
								int LA32_27 = input.LA(3);
								if ( ((LA32_27 >= AND && LA32_27 <= ANNOTATION_VISIBLITY)||(LA32_27 >= ARRAY_B && LA32_27 <= ARRAY_J)||(LA32_27 >= ARRAY_S && LA32_27 <= AT)||LA32_27==DEFAULT||LA32_27==FROM||(LA32_27 >= HIGH && LA32_27 <= INNER)||(LA32_27 >= INVOKEDYNAMIC && LA32_27 <= LDC)||LA32_27==LOCALS||(LA32_27 >= LOOKUPSWITCH && LA32_27 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_27 >= MULTIANEWARRAY && LA32_27 <= PARRAY_TYPE)||LA32_27==STACK||(LA32_27 >= TABLESWITCH && LA32_27 <= WLONG)||(LA32_27 >= WSHORT && LA32_27 <= XTYPE)||LA32_27==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_D:
								{
								int LA32_28 = input.LA(3);
								if ( ((LA32_28 >= AND && LA32_28 <= ANNOTATION_VISIBLITY)||(LA32_28 >= ARRAY_B && LA32_28 <= ARRAY_J)||(LA32_28 >= ARRAY_S && LA32_28 <= AT)||LA32_28==DEFAULT||LA32_28==FROM||(LA32_28 >= HIGH && LA32_28 <= INNER)||(LA32_28 >= INVOKEDYNAMIC && LA32_28 <= LDC)||LA32_28==LOCALS||(LA32_28 >= LOOKUPSWITCH && LA32_28 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_28 >= MULTIANEWARRAY && LA32_28 <= PARRAY_TYPE)||LA32_28==STACK||(LA32_28 >= TABLESWITCH && LA32_28 <= WLONG)||(LA32_28 >= WSHORT && LA32_28 <= XTYPE)||LA32_28==113) ) {
									alt32=1;
								}

								}
								break;
							case AND:
							case ANNOTATION_VISIBLITY:
							case DEFAULT:
							case FROM:
							case HIGH:
							case IIOP:
							case INNER:
							case INVOKEDYNAMIC:
							case INVOKEINTERFACE:
							case IOP:
							case JOP:
							case LDC:
							case LOCALS:
							case LOOKUPSWITCH:
							case METHOD_ANNOTATION_VISIBLITY:
							case MULTIANEWARRAY:
							case OBJECT_TYPE:
							case OP0:
							case OUTTER:
							case PARRAY_TYPE:
							case STACK:
							case TABLESWITCH:
							case TO:
							case USING:
							case VOID_TYPE:
							case WBOOLEAN:
							case WBYTE:
							case WCHAR:
							case WDOUBLE:
							case WFLOAT:
							case WINTEGER:
							case WLONG:
							case WSHORT:
							case XFIELD:
							case XINVOKE:
							case XNEWARRAY:
							case XTYPE:
							case 113:
								{
								alt32=1;
								}
								break;
							}
							}
							break;
						case UP_S:
							{
							switch ( input.LA(2) ) {
							case ID:
								{
								int LA32_11 = input.LA(3);
								if ( (LA32_11==ARRAY_AND||(LA32_11 >= ARRAY_B && LA32_11 <= AT)||LA32_11==ID||(LA32_11 >= UP_B && LA32_11 <= UP_Z)) ) {
									alt32=1;
								}

								}
								break;
							case AT:
								{
								int LA32_12 = input.LA(3);
								if ( (LA32_12==ARRAY_AND||(LA32_12 >= ARRAY_B && LA32_12 <= AT)||LA32_12==ID||(LA32_12 >= UP_B && LA32_12 <= UP_Z)) ) {
									alt32=1;
								}

								}
								break;
							case UP_B:
								{
								int LA32_13 = input.LA(3);
								if ( ((LA32_13 >= AND && LA32_13 <= ARRAY_AND)||(LA32_13 >= ARRAY_B && LA32_13 <= AT)||LA32_13==DEFAULT||LA32_13==FROM||(LA32_13 >= HIGH && LA32_13 <= INNER)||(LA32_13 >= INVOKEDYNAMIC && LA32_13 <= LDC)||LA32_13==LOCALS||(LA32_13 >= LOOKUPSWITCH && LA32_13 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_13 >= MULTIANEWARRAY && LA32_13 <= PARRAY_TYPE)||LA32_13==STACK||(LA32_13 >= TABLESWITCH && LA32_13 <= WLONG)||(LA32_13 >= WSHORT && LA32_13 <= XTYPE)||LA32_13==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_Z:
								{
								int LA32_14 = input.LA(3);
								if ( ((LA32_14 >= AND && LA32_14 <= ARRAY_AND)||(LA32_14 >= ARRAY_B && LA32_14 <= AT)||LA32_14==DEFAULT||LA32_14==FROM||(LA32_14 >= HIGH && LA32_14 <= INNER)||(LA32_14 >= INVOKEDYNAMIC && LA32_14 <= LDC)||LA32_14==LOCALS||(LA32_14 >= LOOKUPSWITCH && LA32_14 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_14 >= MULTIANEWARRAY && LA32_14 <= PARRAY_TYPE)||LA32_14==STACK||(LA32_14 >= TABLESWITCH && LA32_14 <= WLONG)||(LA32_14 >= WSHORT && LA32_14 <= XTYPE)||LA32_14==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_S:
								{
								int LA32_15 = input.LA(3);
								if ( ((LA32_15 >= AND && LA32_15 <= ARRAY_AND)||(LA32_15 >= ARRAY_B && LA32_15 <= AT)||LA32_15==DEFAULT||LA32_15==FROM||(LA32_15 >= HIGH && LA32_15 <= INNER)||(LA32_15 >= INVOKEDYNAMIC && LA32_15 <= LDC)||LA32_15==LOCALS||(LA32_15 >= LOOKUPSWITCH && LA32_15 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_15 >= MULTIANEWARRAY && LA32_15 <= PARRAY_TYPE)||LA32_15==STACK||(LA32_15 >= TABLESWITCH && LA32_15 <= WLONG)||(LA32_15 >= WSHORT && LA32_15 <= XTYPE)||LA32_15==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_C:
								{
								int LA32_16 = input.LA(3);
								if ( ((LA32_16 >= AND && LA32_16 <= ARRAY_AND)||(LA32_16 >= ARRAY_B && LA32_16 <= AT)||LA32_16==DEFAULT||LA32_16==FROM||(LA32_16 >= HIGH && LA32_16 <= INNER)||(LA32_16 >= INVOKEDYNAMIC && LA32_16 <= LDC)||LA32_16==LOCALS||(LA32_16 >= LOOKUPSWITCH && LA32_16 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_16 >= MULTIANEWARRAY && LA32_16 <= PARRAY_TYPE)||LA32_16==STACK||(LA32_16 >= TABLESWITCH && LA32_16 <= WLONG)||(LA32_16 >= WSHORT && LA32_16 <= XTYPE)||LA32_16==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_I:
								{
								int LA32_17 = input.LA(3);
								if ( ((LA32_17 >= AND && LA32_17 <= ARRAY_AND)||(LA32_17 >= ARRAY_B && LA32_17 <= AT)||LA32_17==DEFAULT||LA32_17==FROM||(LA32_17 >= HIGH && LA32_17 <= INNER)||(LA32_17 >= INVOKEDYNAMIC && LA32_17 <= LDC)||LA32_17==LOCALS||(LA32_17 >= LOOKUPSWITCH && LA32_17 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_17 >= MULTIANEWARRAY && LA32_17 <= PARRAY_TYPE)||LA32_17==STACK||(LA32_17 >= TABLESWITCH && LA32_17 <= WLONG)||(LA32_17 >= WSHORT && LA32_17 <= XTYPE)||LA32_17==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_J:
								{
								int LA32_18 = input.LA(3);
								if ( ((LA32_18 >= AND && LA32_18 <= ARRAY_AND)||(LA32_18 >= ARRAY_B && LA32_18 <= AT)||LA32_18==DEFAULT||LA32_18==FROM||(LA32_18 >= HIGH && LA32_18 <= INNER)||(LA32_18 >= INVOKEDYNAMIC && LA32_18 <= LDC)||LA32_18==LOCALS||(LA32_18 >= LOOKUPSWITCH && LA32_18 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_18 >= MULTIANEWARRAY && LA32_18 <= PARRAY_TYPE)||LA32_18==STACK||(LA32_18 >= TABLESWITCH && LA32_18 <= WLONG)||(LA32_18 >= WSHORT && LA32_18 <= XTYPE)||LA32_18==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_F:
								{
								int LA32_19 = input.LA(3);
								if ( ((LA32_19 >= AND && LA32_19 <= ARRAY_AND)||(LA32_19 >= ARRAY_B && LA32_19 <= AT)||LA32_19==DEFAULT||LA32_19==FROM||(LA32_19 >= HIGH && LA32_19 <= INNER)||(LA32_19 >= INVOKEDYNAMIC && LA32_19 <= LDC)||LA32_19==LOCALS||(LA32_19 >= LOOKUPSWITCH && LA32_19 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_19 >= MULTIANEWARRAY && LA32_19 <= PARRAY_TYPE)||LA32_19==STACK||(LA32_19 >= TABLESWITCH && LA32_19 <= WLONG)||(LA32_19 >= WSHORT && LA32_19 <= XTYPE)||LA32_19==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_D:
								{
								int LA32_20 = input.LA(3);
								if ( ((LA32_20 >= AND && LA32_20 <= ARRAY_AND)||(LA32_20 >= ARRAY_B && LA32_20 <= AT)||LA32_20==DEFAULT||LA32_20==FROM||(LA32_20 >= HIGH && LA32_20 <= INNER)||(LA32_20 >= INVOKEDYNAMIC && LA32_20 <= LDC)||LA32_20==LOCALS||(LA32_20 >= LOOKUPSWITCH && LA32_20 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_20 >= MULTIANEWARRAY && LA32_20 <= PARRAY_TYPE)||LA32_20==STACK||(LA32_20 >= TABLESWITCH && LA32_20 <= WLONG)||(LA32_20 >= WSHORT && LA32_20 <= XTYPE)||LA32_20==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_B:
								{
								int LA32_21 = input.LA(3);
								if ( ((LA32_21 >= AND && LA32_21 <= ANNOTATION_VISIBLITY)||(LA32_21 >= ARRAY_B && LA32_21 <= ARRAY_J)||(LA32_21 >= ARRAY_S && LA32_21 <= AT)||LA32_21==DEFAULT||LA32_21==FROM||(LA32_21 >= HIGH && LA32_21 <= INNER)||(LA32_21 >= INVOKEDYNAMIC && LA32_21 <= LDC)||LA32_21==LOCALS||(LA32_21 >= LOOKUPSWITCH && LA32_21 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_21 >= MULTIANEWARRAY && LA32_21 <= PARRAY_TYPE)||LA32_21==STACK||(LA32_21 >= TABLESWITCH && LA32_21 <= WLONG)||(LA32_21 >= WSHORT && LA32_21 <= XTYPE)||LA32_21==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_Z:
								{
								int LA32_22 = input.LA(3);
								if ( ((LA32_22 >= AND && LA32_22 <= ANNOTATION_VISIBLITY)||(LA32_22 >= ARRAY_B && LA32_22 <= ARRAY_J)||(LA32_22 >= ARRAY_S && LA32_22 <= AT)||LA32_22==DEFAULT||LA32_22==FROM||(LA32_22 >= HIGH && LA32_22 <= INNER)||(LA32_22 >= INVOKEDYNAMIC && LA32_22 <= LDC)||LA32_22==LOCALS||(LA32_22 >= LOOKUPSWITCH && LA32_22 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_22 >= MULTIANEWARRAY && LA32_22 <= PARRAY_TYPE)||LA32_22==STACK||(LA32_22 >= TABLESWITCH && LA32_22 <= WLONG)||(LA32_22 >= WSHORT && LA32_22 <= XTYPE)||LA32_22==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_S:
								{
								int LA32_23 = input.LA(3);
								if ( ((LA32_23 >= AND && LA32_23 <= ANNOTATION_VISIBLITY)||(LA32_23 >= ARRAY_B && LA32_23 <= ARRAY_J)||(LA32_23 >= ARRAY_S && LA32_23 <= AT)||LA32_23==DEFAULT||LA32_23==FROM||(LA32_23 >= HIGH && LA32_23 <= INNER)||(LA32_23 >= INVOKEDYNAMIC && LA32_23 <= LDC)||LA32_23==LOCALS||(LA32_23 >= LOOKUPSWITCH && LA32_23 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_23 >= MULTIANEWARRAY && LA32_23 <= PARRAY_TYPE)||LA32_23==STACK||(LA32_23 >= TABLESWITCH && LA32_23 <= WLONG)||(LA32_23 >= WSHORT && LA32_23 <= XTYPE)||LA32_23==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_C:
								{
								int LA32_24 = input.LA(3);
								if ( ((LA32_24 >= AND && LA32_24 <= ANNOTATION_VISIBLITY)||(LA32_24 >= ARRAY_B && LA32_24 <= ARRAY_J)||(LA32_24 >= ARRAY_S && LA32_24 <= AT)||LA32_24==DEFAULT||LA32_24==FROM||(LA32_24 >= HIGH && LA32_24 <= INNER)||(LA32_24 >= INVOKEDYNAMIC && LA32_24 <= LDC)||LA32_24==LOCALS||(LA32_24 >= LOOKUPSWITCH && LA32_24 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_24 >= MULTIANEWARRAY && LA32_24 <= PARRAY_TYPE)||LA32_24==STACK||(LA32_24 >= TABLESWITCH && LA32_24 <= WLONG)||(LA32_24 >= WSHORT && LA32_24 <= XTYPE)||LA32_24==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_I:
								{
								int LA32_25 = input.LA(3);
								if ( ((LA32_25 >= AND && LA32_25 <= ANNOTATION_VISIBLITY)||(LA32_25 >= ARRAY_B && LA32_25 <= ARRAY_J)||(LA32_25 >= ARRAY_S && LA32_25 <= AT)||LA32_25==DEFAULT||LA32_25==FROM||(LA32_25 >= HIGH && LA32_25 <= INNER)||(LA32_25 >= INVOKEDYNAMIC && LA32_25 <= LDC)||LA32_25==LOCALS||(LA32_25 >= LOOKUPSWITCH && LA32_25 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_25 >= MULTIANEWARRAY && LA32_25 <= PARRAY_TYPE)||LA32_25==STACK||(LA32_25 >= TABLESWITCH && LA32_25 <= WLONG)||(LA32_25 >= WSHORT && LA32_25 <= XTYPE)||LA32_25==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_J:
								{
								int LA32_26 = input.LA(3);
								if ( ((LA32_26 >= AND && LA32_26 <= ANNOTATION_VISIBLITY)||(LA32_26 >= ARRAY_B && LA32_26 <= ARRAY_J)||(LA32_26 >= ARRAY_S && LA32_26 <= AT)||LA32_26==DEFAULT||LA32_26==FROM||(LA32_26 >= HIGH && LA32_26 <= INNER)||(LA32_26 >= INVOKEDYNAMIC && LA32_26 <= LDC)||LA32_26==LOCALS||(LA32_26 >= LOOKUPSWITCH && LA32_26 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_26 >= MULTIANEWARRAY && LA32_26 <= PARRAY_TYPE)||LA32_26==STACK||(LA32_26 >= TABLESWITCH && LA32_26 <= WLONG)||(LA32_26 >= WSHORT && LA32_26 <= XTYPE)||LA32_26==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_F:
								{
								int LA32_27 = input.LA(3);
								if ( ((LA32_27 >= AND && LA32_27 <= ANNOTATION_VISIBLITY)||(LA32_27 >= ARRAY_B && LA32_27 <= ARRAY_J)||(LA32_27 >= ARRAY_S && LA32_27 <= AT)||LA32_27==DEFAULT||LA32_27==FROM||(LA32_27 >= HIGH && LA32_27 <= INNER)||(LA32_27 >= INVOKEDYNAMIC && LA32_27 <= LDC)||LA32_27==LOCALS||(LA32_27 >= LOOKUPSWITCH && LA32_27 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_27 >= MULTIANEWARRAY && LA32_27 <= PARRAY_TYPE)||LA32_27==STACK||(LA32_27 >= TABLESWITCH && LA32_27 <= WLONG)||(LA32_27 >= WSHORT && LA32_27 <= XTYPE)||LA32_27==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_D:
								{
								int LA32_28 = input.LA(3);
								if ( ((LA32_28 >= AND && LA32_28 <= ANNOTATION_VISIBLITY)||(LA32_28 >= ARRAY_B && LA32_28 <= ARRAY_J)||(LA32_28 >= ARRAY_S && LA32_28 <= AT)||LA32_28==DEFAULT||LA32_28==FROM||(LA32_28 >= HIGH && LA32_28 <= INNER)||(LA32_28 >= INVOKEDYNAMIC && LA32_28 <= LDC)||LA32_28==LOCALS||(LA32_28 >= LOOKUPSWITCH && LA32_28 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_28 >= MULTIANEWARRAY && LA32_28 <= PARRAY_TYPE)||LA32_28==STACK||(LA32_28 >= TABLESWITCH && LA32_28 <= WLONG)||(LA32_28 >= WSHORT && LA32_28 <= XTYPE)||LA32_28==113) ) {
									alt32=1;
								}

								}
								break;
							case AND:
							case ANNOTATION_VISIBLITY:
							case DEFAULT:
							case FROM:
							case HIGH:
							case IIOP:
							case INNER:
							case INVOKEDYNAMIC:
							case INVOKEINTERFACE:
							case IOP:
							case JOP:
							case LDC:
							case LOCALS:
							case LOOKUPSWITCH:
							case METHOD_ANNOTATION_VISIBLITY:
							case MULTIANEWARRAY:
							case OBJECT_TYPE:
							case OP0:
							case OUTTER:
							case PARRAY_TYPE:
							case STACK:
							case TABLESWITCH:
							case TO:
							case USING:
							case VOID_TYPE:
							case WBOOLEAN:
							case WBYTE:
							case WCHAR:
							case WDOUBLE:
							case WFLOAT:
							case WINTEGER:
							case WLONG:
							case WSHORT:
							case XFIELD:
							case XINVOKE:
							case XNEWARRAY:
							case XTYPE:
							case 113:
								{
								alt32=1;
								}
								break;
							}
							}
							break;
						case UP_C:
							{
							switch ( input.LA(2) ) {
							case ID:
								{
								int LA32_11 = input.LA(3);
								if ( (LA32_11==ARRAY_AND||(LA32_11 >= ARRAY_B && LA32_11 <= AT)||LA32_11==ID||(LA32_11 >= UP_B && LA32_11 <= UP_Z)) ) {
									alt32=1;
								}

								}
								break;
							case AT:
								{
								int LA32_12 = input.LA(3);
								if ( (LA32_12==ARRAY_AND||(LA32_12 >= ARRAY_B && LA32_12 <= AT)||LA32_12==ID||(LA32_12 >= UP_B && LA32_12 <= UP_Z)) ) {
									alt32=1;
								}

								}
								break;
							case UP_B:
								{
								int LA32_13 = input.LA(3);
								if ( ((LA32_13 >= AND && LA32_13 <= ARRAY_AND)||(LA32_13 >= ARRAY_B && LA32_13 <= AT)||LA32_13==DEFAULT||LA32_13==FROM||(LA32_13 >= HIGH && LA32_13 <= INNER)||(LA32_13 >= INVOKEDYNAMIC && LA32_13 <= LDC)||LA32_13==LOCALS||(LA32_13 >= LOOKUPSWITCH && LA32_13 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_13 >= MULTIANEWARRAY && LA32_13 <= PARRAY_TYPE)||LA32_13==STACK||(LA32_13 >= TABLESWITCH && LA32_13 <= WLONG)||(LA32_13 >= WSHORT && LA32_13 <= XTYPE)||LA32_13==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_Z:
								{
								int LA32_14 = input.LA(3);
								if ( ((LA32_14 >= AND && LA32_14 <= ARRAY_AND)||(LA32_14 >= ARRAY_B && LA32_14 <= AT)||LA32_14==DEFAULT||LA32_14==FROM||(LA32_14 >= HIGH && LA32_14 <= INNER)||(LA32_14 >= INVOKEDYNAMIC && LA32_14 <= LDC)||LA32_14==LOCALS||(LA32_14 >= LOOKUPSWITCH && LA32_14 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_14 >= MULTIANEWARRAY && LA32_14 <= PARRAY_TYPE)||LA32_14==STACK||(LA32_14 >= TABLESWITCH && LA32_14 <= WLONG)||(LA32_14 >= WSHORT && LA32_14 <= XTYPE)||LA32_14==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_S:
								{
								int LA32_15 = input.LA(3);
								if ( ((LA32_15 >= AND && LA32_15 <= ARRAY_AND)||(LA32_15 >= ARRAY_B && LA32_15 <= AT)||LA32_15==DEFAULT||LA32_15==FROM||(LA32_15 >= HIGH && LA32_15 <= INNER)||(LA32_15 >= INVOKEDYNAMIC && LA32_15 <= LDC)||LA32_15==LOCALS||(LA32_15 >= LOOKUPSWITCH && LA32_15 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_15 >= MULTIANEWARRAY && LA32_15 <= PARRAY_TYPE)||LA32_15==STACK||(LA32_15 >= TABLESWITCH && LA32_15 <= WLONG)||(LA32_15 >= WSHORT && LA32_15 <= XTYPE)||LA32_15==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_C:
								{
								int LA32_16 = input.LA(3);
								if ( ((LA32_16 >= AND && LA32_16 <= ARRAY_AND)||(LA32_16 >= ARRAY_B && LA32_16 <= AT)||LA32_16==DEFAULT||LA32_16==FROM||(LA32_16 >= HIGH && LA32_16 <= INNER)||(LA32_16 >= INVOKEDYNAMIC && LA32_16 <= LDC)||LA32_16==LOCALS||(LA32_16 >= LOOKUPSWITCH && LA32_16 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_16 >= MULTIANEWARRAY && LA32_16 <= PARRAY_TYPE)||LA32_16==STACK||(LA32_16 >= TABLESWITCH && LA32_16 <= WLONG)||(LA32_16 >= WSHORT && LA32_16 <= XTYPE)||LA32_16==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_I:
								{
								int LA32_17 = input.LA(3);
								if ( ((LA32_17 >= AND && LA32_17 <= ARRAY_AND)||(LA32_17 >= ARRAY_B && LA32_17 <= AT)||LA32_17==DEFAULT||LA32_17==FROM||(LA32_17 >= HIGH && LA32_17 <= INNER)||(LA32_17 >= INVOKEDYNAMIC && LA32_17 <= LDC)||LA32_17==LOCALS||(LA32_17 >= LOOKUPSWITCH && LA32_17 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_17 >= MULTIANEWARRAY && LA32_17 <= PARRAY_TYPE)||LA32_17==STACK||(LA32_17 >= TABLESWITCH && LA32_17 <= WLONG)||(LA32_17 >= WSHORT && LA32_17 <= XTYPE)||LA32_17==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_J:
								{
								int LA32_18 = input.LA(3);
								if ( ((LA32_18 >= AND && LA32_18 <= ARRAY_AND)||(LA32_18 >= ARRAY_B && LA32_18 <= AT)||LA32_18==DEFAULT||LA32_18==FROM||(LA32_18 >= HIGH && LA32_18 <= INNER)||(LA32_18 >= INVOKEDYNAMIC && LA32_18 <= LDC)||LA32_18==LOCALS||(LA32_18 >= LOOKUPSWITCH && LA32_18 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_18 >= MULTIANEWARRAY && LA32_18 <= PARRAY_TYPE)||LA32_18==STACK||(LA32_18 >= TABLESWITCH && LA32_18 <= WLONG)||(LA32_18 >= WSHORT && LA32_18 <= XTYPE)||LA32_18==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_F:
								{
								int LA32_19 = input.LA(3);
								if ( ((LA32_19 >= AND && LA32_19 <= ARRAY_AND)||(LA32_19 >= ARRAY_B && LA32_19 <= AT)||LA32_19==DEFAULT||LA32_19==FROM||(LA32_19 >= HIGH && LA32_19 <= INNER)||(LA32_19 >= INVOKEDYNAMIC && LA32_19 <= LDC)||LA32_19==LOCALS||(LA32_19 >= LOOKUPSWITCH && LA32_19 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_19 >= MULTIANEWARRAY && LA32_19 <= PARRAY_TYPE)||LA32_19==STACK||(LA32_19 >= TABLESWITCH && LA32_19 <= WLONG)||(LA32_19 >= WSHORT && LA32_19 <= XTYPE)||LA32_19==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_D:
								{
								int LA32_20 = input.LA(3);
								if ( ((LA32_20 >= AND && LA32_20 <= ARRAY_AND)||(LA32_20 >= ARRAY_B && LA32_20 <= AT)||LA32_20==DEFAULT||LA32_20==FROM||(LA32_20 >= HIGH && LA32_20 <= INNER)||(LA32_20 >= INVOKEDYNAMIC && LA32_20 <= LDC)||LA32_20==LOCALS||(LA32_20 >= LOOKUPSWITCH && LA32_20 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_20 >= MULTIANEWARRAY && LA32_20 <= PARRAY_TYPE)||LA32_20==STACK||(LA32_20 >= TABLESWITCH && LA32_20 <= WLONG)||(LA32_20 >= WSHORT && LA32_20 <= XTYPE)||LA32_20==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_B:
								{
								int LA32_21 = input.LA(3);
								if ( ((LA32_21 >= AND && LA32_21 <= ANNOTATION_VISIBLITY)||(LA32_21 >= ARRAY_B && LA32_21 <= ARRAY_J)||(LA32_21 >= ARRAY_S && LA32_21 <= AT)||LA32_21==DEFAULT||LA32_21==FROM||(LA32_21 >= HIGH && LA32_21 <= INNER)||(LA32_21 >= INVOKEDYNAMIC && LA32_21 <= LDC)||LA32_21==LOCALS||(LA32_21 >= LOOKUPSWITCH && LA32_21 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_21 >= MULTIANEWARRAY && LA32_21 <= PARRAY_TYPE)||LA32_21==STACK||(LA32_21 >= TABLESWITCH && LA32_21 <= WLONG)||(LA32_21 >= WSHORT && LA32_21 <= XTYPE)||LA32_21==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_Z:
								{
								int LA32_22 = input.LA(3);
								if ( ((LA32_22 >= AND && LA32_22 <= ANNOTATION_VISIBLITY)||(LA32_22 >= ARRAY_B && LA32_22 <= ARRAY_J)||(LA32_22 >= ARRAY_S && LA32_22 <= AT)||LA32_22==DEFAULT||LA32_22==FROM||(LA32_22 >= HIGH && LA32_22 <= INNER)||(LA32_22 >= INVOKEDYNAMIC && LA32_22 <= LDC)||LA32_22==LOCALS||(LA32_22 >= LOOKUPSWITCH && LA32_22 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_22 >= MULTIANEWARRAY && LA32_22 <= PARRAY_TYPE)||LA32_22==STACK||(LA32_22 >= TABLESWITCH && LA32_22 <= WLONG)||(LA32_22 >= WSHORT && LA32_22 <= XTYPE)||LA32_22==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_S:
								{
								int LA32_23 = input.LA(3);
								if ( ((LA32_23 >= AND && LA32_23 <= ANNOTATION_VISIBLITY)||(LA32_23 >= ARRAY_B && LA32_23 <= ARRAY_J)||(LA32_23 >= ARRAY_S && LA32_23 <= AT)||LA32_23==DEFAULT||LA32_23==FROM||(LA32_23 >= HIGH && LA32_23 <= INNER)||(LA32_23 >= INVOKEDYNAMIC && LA32_23 <= LDC)||LA32_23==LOCALS||(LA32_23 >= LOOKUPSWITCH && LA32_23 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_23 >= MULTIANEWARRAY && LA32_23 <= PARRAY_TYPE)||LA32_23==STACK||(LA32_23 >= TABLESWITCH && LA32_23 <= WLONG)||(LA32_23 >= WSHORT && LA32_23 <= XTYPE)||LA32_23==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_C:
								{
								int LA32_24 = input.LA(3);
								if ( ((LA32_24 >= AND && LA32_24 <= ANNOTATION_VISIBLITY)||(LA32_24 >= ARRAY_B && LA32_24 <= ARRAY_J)||(LA32_24 >= ARRAY_S && LA32_24 <= AT)||LA32_24==DEFAULT||LA32_24==FROM||(LA32_24 >= HIGH && LA32_24 <= INNER)||(LA32_24 >= INVOKEDYNAMIC && LA32_24 <= LDC)||LA32_24==LOCALS||(LA32_24 >= LOOKUPSWITCH && LA32_24 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_24 >= MULTIANEWARRAY && LA32_24 <= PARRAY_TYPE)||LA32_24==STACK||(LA32_24 >= TABLESWITCH && LA32_24 <= WLONG)||(LA32_24 >= WSHORT && LA32_24 <= XTYPE)||LA32_24==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_I:
								{
								int LA32_25 = input.LA(3);
								if ( ((LA32_25 >= AND && LA32_25 <= ANNOTATION_VISIBLITY)||(LA32_25 >= ARRAY_B && LA32_25 <= ARRAY_J)||(LA32_25 >= ARRAY_S && LA32_25 <= AT)||LA32_25==DEFAULT||LA32_25==FROM||(LA32_25 >= HIGH && LA32_25 <= INNER)||(LA32_25 >= INVOKEDYNAMIC && LA32_25 <= LDC)||LA32_25==LOCALS||(LA32_25 >= LOOKUPSWITCH && LA32_25 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_25 >= MULTIANEWARRAY && LA32_25 <= PARRAY_TYPE)||LA32_25==STACK||(LA32_25 >= TABLESWITCH && LA32_25 <= WLONG)||(LA32_25 >= WSHORT && LA32_25 <= XTYPE)||LA32_25==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_J:
								{
								int LA32_26 = input.LA(3);
								if ( ((LA32_26 >= AND && LA32_26 <= ANNOTATION_VISIBLITY)||(LA32_26 >= ARRAY_B && LA32_26 <= ARRAY_J)||(LA32_26 >= ARRAY_S && LA32_26 <= AT)||LA32_26==DEFAULT||LA32_26==FROM||(LA32_26 >= HIGH && LA32_26 <= INNER)||(LA32_26 >= INVOKEDYNAMIC && LA32_26 <= LDC)||LA32_26==LOCALS||(LA32_26 >= LOOKUPSWITCH && LA32_26 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_26 >= MULTIANEWARRAY && LA32_26 <= PARRAY_TYPE)||LA32_26==STACK||(LA32_26 >= TABLESWITCH && LA32_26 <= WLONG)||(LA32_26 >= WSHORT && LA32_26 <= XTYPE)||LA32_26==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_F:
								{
								int LA32_27 = input.LA(3);
								if ( ((LA32_27 >= AND && LA32_27 <= ANNOTATION_VISIBLITY)||(LA32_27 >= ARRAY_B && LA32_27 <= ARRAY_J)||(LA32_27 >= ARRAY_S && LA32_27 <= AT)||LA32_27==DEFAULT||LA32_27==FROM||(LA32_27 >= HIGH && LA32_27 <= INNER)||(LA32_27 >= INVOKEDYNAMIC && LA32_27 <= LDC)||LA32_27==LOCALS||(LA32_27 >= LOOKUPSWITCH && LA32_27 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_27 >= MULTIANEWARRAY && LA32_27 <= PARRAY_TYPE)||LA32_27==STACK||(LA32_27 >= TABLESWITCH && LA32_27 <= WLONG)||(LA32_27 >= WSHORT && LA32_27 <= XTYPE)||LA32_27==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_D:
								{
								int LA32_28 = input.LA(3);
								if ( ((LA32_28 >= AND && LA32_28 <= ANNOTATION_VISIBLITY)||(LA32_28 >= ARRAY_B && LA32_28 <= ARRAY_J)||(LA32_28 >= ARRAY_S && LA32_28 <= AT)||LA32_28==DEFAULT||LA32_28==FROM||(LA32_28 >= HIGH && LA32_28 <= INNER)||(LA32_28 >= INVOKEDYNAMIC && LA32_28 <= LDC)||LA32_28==LOCALS||(LA32_28 >= LOOKUPSWITCH && LA32_28 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_28 >= MULTIANEWARRAY && LA32_28 <= PARRAY_TYPE)||LA32_28==STACK||(LA32_28 >= TABLESWITCH && LA32_28 <= WLONG)||(LA32_28 >= WSHORT && LA32_28 <= XTYPE)||LA32_28==113) ) {
									alt32=1;
								}

								}
								break;
							case AND:
							case ANNOTATION_VISIBLITY:
							case DEFAULT:
							case FROM:
							case HIGH:
							case IIOP:
							case INNER:
							case INVOKEDYNAMIC:
							case INVOKEINTERFACE:
							case IOP:
							case JOP:
							case LDC:
							case LOCALS:
							case LOOKUPSWITCH:
							case METHOD_ANNOTATION_VISIBLITY:
							case MULTIANEWARRAY:
							case OBJECT_TYPE:
							case OP0:
							case OUTTER:
							case PARRAY_TYPE:
							case STACK:
							case TABLESWITCH:
							case TO:
							case USING:
							case VOID_TYPE:
							case WBOOLEAN:
							case WBYTE:
							case WCHAR:
							case WDOUBLE:
							case WFLOAT:
							case WINTEGER:
							case WLONG:
							case WSHORT:
							case XFIELD:
							case XINVOKE:
							case XNEWARRAY:
							case XTYPE:
							case 113:
								{
								alt32=1;
								}
								break;
							}
							}
							break;
						case UP_I:
							{
							switch ( input.LA(2) ) {
							case ID:
								{
								int LA32_11 = input.LA(3);
								if ( (LA32_11==ARRAY_AND||(LA32_11 >= ARRAY_B && LA32_11 <= AT)||LA32_11==ID||(LA32_11 >= UP_B && LA32_11 <= UP_Z)) ) {
									alt32=1;
								}

								}
								break;
							case AT:
								{
								int LA32_12 = input.LA(3);
								if ( (LA32_12==ARRAY_AND||(LA32_12 >= ARRAY_B && LA32_12 <= AT)||LA32_12==ID||(LA32_12 >= UP_B && LA32_12 <= UP_Z)) ) {
									alt32=1;
								}

								}
								break;
							case UP_B:
								{
								int LA32_13 = input.LA(3);
								if ( ((LA32_13 >= AND && LA32_13 <= ARRAY_AND)||(LA32_13 >= ARRAY_B && LA32_13 <= AT)||LA32_13==DEFAULT||LA32_13==FROM||(LA32_13 >= HIGH && LA32_13 <= INNER)||(LA32_13 >= INVOKEDYNAMIC && LA32_13 <= LDC)||LA32_13==LOCALS||(LA32_13 >= LOOKUPSWITCH && LA32_13 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_13 >= MULTIANEWARRAY && LA32_13 <= PARRAY_TYPE)||LA32_13==STACK||(LA32_13 >= TABLESWITCH && LA32_13 <= WLONG)||(LA32_13 >= WSHORT && LA32_13 <= XTYPE)||LA32_13==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_Z:
								{
								int LA32_14 = input.LA(3);
								if ( ((LA32_14 >= AND && LA32_14 <= ARRAY_AND)||(LA32_14 >= ARRAY_B && LA32_14 <= AT)||LA32_14==DEFAULT||LA32_14==FROM||(LA32_14 >= HIGH && LA32_14 <= INNER)||(LA32_14 >= INVOKEDYNAMIC && LA32_14 <= LDC)||LA32_14==LOCALS||(LA32_14 >= LOOKUPSWITCH && LA32_14 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_14 >= MULTIANEWARRAY && LA32_14 <= PARRAY_TYPE)||LA32_14==STACK||(LA32_14 >= TABLESWITCH && LA32_14 <= WLONG)||(LA32_14 >= WSHORT && LA32_14 <= XTYPE)||LA32_14==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_S:
								{
								int LA32_15 = input.LA(3);
								if ( ((LA32_15 >= AND && LA32_15 <= ARRAY_AND)||(LA32_15 >= ARRAY_B && LA32_15 <= AT)||LA32_15==DEFAULT||LA32_15==FROM||(LA32_15 >= HIGH && LA32_15 <= INNER)||(LA32_15 >= INVOKEDYNAMIC && LA32_15 <= LDC)||LA32_15==LOCALS||(LA32_15 >= LOOKUPSWITCH && LA32_15 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_15 >= MULTIANEWARRAY && LA32_15 <= PARRAY_TYPE)||LA32_15==STACK||(LA32_15 >= TABLESWITCH && LA32_15 <= WLONG)||(LA32_15 >= WSHORT && LA32_15 <= XTYPE)||LA32_15==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_C:
								{
								int LA32_16 = input.LA(3);
								if ( ((LA32_16 >= AND && LA32_16 <= ARRAY_AND)||(LA32_16 >= ARRAY_B && LA32_16 <= AT)||LA32_16==DEFAULT||LA32_16==FROM||(LA32_16 >= HIGH && LA32_16 <= INNER)||(LA32_16 >= INVOKEDYNAMIC && LA32_16 <= LDC)||LA32_16==LOCALS||(LA32_16 >= LOOKUPSWITCH && LA32_16 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_16 >= MULTIANEWARRAY && LA32_16 <= PARRAY_TYPE)||LA32_16==STACK||(LA32_16 >= TABLESWITCH && LA32_16 <= WLONG)||(LA32_16 >= WSHORT && LA32_16 <= XTYPE)||LA32_16==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_I:
								{
								int LA32_17 = input.LA(3);
								if ( ((LA32_17 >= AND && LA32_17 <= ARRAY_AND)||(LA32_17 >= ARRAY_B && LA32_17 <= AT)||LA32_17==DEFAULT||LA32_17==FROM||(LA32_17 >= HIGH && LA32_17 <= INNER)||(LA32_17 >= INVOKEDYNAMIC && LA32_17 <= LDC)||LA32_17==LOCALS||(LA32_17 >= LOOKUPSWITCH && LA32_17 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_17 >= MULTIANEWARRAY && LA32_17 <= PARRAY_TYPE)||LA32_17==STACK||(LA32_17 >= TABLESWITCH && LA32_17 <= WLONG)||(LA32_17 >= WSHORT && LA32_17 <= XTYPE)||LA32_17==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_J:
								{
								int LA32_18 = input.LA(3);
								if ( ((LA32_18 >= AND && LA32_18 <= ARRAY_AND)||(LA32_18 >= ARRAY_B && LA32_18 <= AT)||LA32_18==DEFAULT||LA32_18==FROM||(LA32_18 >= HIGH && LA32_18 <= INNER)||(LA32_18 >= INVOKEDYNAMIC && LA32_18 <= LDC)||LA32_18==LOCALS||(LA32_18 >= LOOKUPSWITCH && LA32_18 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_18 >= MULTIANEWARRAY && LA32_18 <= PARRAY_TYPE)||LA32_18==STACK||(LA32_18 >= TABLESWITCH && LA32_18 <= WLONG)||(LA32_18 >= WSHORT && LA32_18 <= XTYPE)||LA32_18==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_F:
								{
								int LA32_19 = input.LA(3);
								if ( ((LA32_19 >= AND && LA32_19 <= ARRAY_AND)||(LA32_19 >= ARRAY_B && LA32_19 <= AT)||LA32_19==DEFAULT||LA32_19==FROM||(LA32_19 >= HIGH && LA32_19 <= INNER)||(LA32_19 >= INVOKEDYNAMIC && LA32_19 <= LDC)||LA32_19==LOCALS||(LA32_19 >= LOOKUPSWITCH && LA32_19 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_19 >= MULTIANEWARRAY && LA32_19 <= PARRAY_TYPE)||LA32_19==STACK||(LA32_19 >= TABLESWITCH && LA32_19 <= WLONG)||(LA32_19 >= WSHORT && LA32_19 <= XTYPE)||LA32_19==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_D:
								{
								int LA32_20 = input.LA(3);
								if ( ((LA32_20 >= AND && LA32_20 <= ARRAY_AND)||(LA32_20 >= ARRAY_B && LA32_20 <= AT)||LA32_20==DEFAULT||LA32_20==FROM||(LA32_20 >= HIGH && LA32_20 <= INNER)||(LA32_20 >= INVOKEDYNAMIC && LA32_20 <= LDC)||LA32_20==LOCALS||(LA32_20 >= LOOKUPSWITCH && LA32_20 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_20 >= MULTIANEWARRAY && LA32_20 <= PARRAY_TYPE)||LA32_20==STACK||(LA32_20 >= TABLESWITCH && LA32_20 <= WLONG)||(LA32_20 >= WSHORT && LA32_20 <= XTYPE)||LA32_20==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_B:
								{
								int LA32_21 = input.LA(3);
								if ( ((LA32_21 >= AND && LA32_21 <= ANNOTATION_VISIBLITY)||(LA32_21 >= ARRAY_B && LA32_21 <= ARRAY_J)||(LA32_21 >= ARRAY_S && LA32_21 <= AT)||LA32_21==DEFAULT||LA32_21==FROM||(LA32_21 >= HIGH && LA32_21 <= INNER)||(LA32_21 >= INVOKEDYNAMIC && LA32_21 <= LDC)||LA32_21==LOCALS||(LA32_21 >= LOOKUPSWITCH && LA32_21 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_21 >= MULTIANEWARRAY && LA32_21 <= PARRAY_TYPE)||LA32_21==STACK||(LA32_21 >= TABLESWITCH && LA32_21 <= WLONG)||(LA32_21 >= WSHORT && LA32_21 <= XTYPE)||LA32_21==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_Z:
								{
								int LA32_22 = input.LA(3);
								if ( ((LA32_22 >= AND && LA32_22 <= ANNOTATION_VISIBLITY)||(LA32_22 >= ARRAY_B && LA32_22 <= ARRAY_J)||(LA32_22 >= ARRAY_S && LA32_22 <= AT)||LA32_22==DEFAULT||LA32_22==FROM||(LA32_22 >= HIGH && LA32_22 <= INNER)||(LA32_22 >= INVOKEDYNAMIC && LA32_22 <= LDC)||LA32_22==LOCALS||(LA32_22 >= LOOKUPSWITCH && LA32_22 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_22 >= MULTIANEWARRAY && LA32_22 <= PARRAY_TYPE)||LA32_22==STACK||(LA32_22 >= TABLESWITCH && LA32_22 <= WLONG)||(LA32_22 >= WSHORT && LA32_22 <= XTYPE)||LA32_22==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_S:
								{
								int LA32_23 = input.LA(3);
								if ( ((LA32_23 >= AND && LA32_23 <= ANNOTATION_VISIBLITY)||(LA32_23 >= ARRAY_B && LA32_23 <= ARRAY_J)||(LA32_23 >= ARRAY_S && LA32_23 <= AT)||LA32_23==DEFAULT||LA32_23==FROM||(LA32_23 >= HIGH && LA32_23 <= INNER)||(LA32_23 >= INVOKEDYNAMIC && LA32_23 <= LDC)||LA32_23==LOCALS||(LA32_23 >= LOOKUPSWITCH && LA32_23 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_23 >= MULTIANEWARRAY && LA32_23 <= PARRAY_TYPE)||LA32_23==STACK||(LA32_23 >= TABLESWITCH && LA32_23 <= WLONG)||(LA32_23 >= WSHORT && LA32_23 <= XTYPE)||LA32_23==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_C:
								{
								int LA32_24 = input.LA(3);
								if ( ((LA32_24 >= AND && LA32_24 <= ANNOTATION_VISIBLITY)||(LA32_24 >= ARRAY_B && LA32_24 <= ARRAY_J)||(LA32_24 >= ARRAY_S && LA32_24 <= AT)||LA32_24==DEFAULT||LA32_24==FROM||(LA32_24 >= HIGH && LA32_24 <= INNER)||(LA32_24 >= INVOKEDYNAMIC && LA32_24 <= LDC)||LA32_24==LOCALS||(LA32_24 >= LOOKUPSWITCH && LA32_24 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_24 >= MULTIANEWARRAY && LA32_24 <= PARRAY_TYPE)||LA32_24==STACK||(LA32_24 >= TABLESWITCH && LA32_24 <= WLONG)||(LA32_24 >= WSHORT && LA32_24 <= XTYPE)||LA32_24==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_I:
								{
								int LA32_25 = input.LA(3);
								if ( ((LA32_25 >= AND && LA32_25 <= ANNOTATION_VISIBLITY)||(LA32_25 >= ARRAY_B && LA32_25 <= ARRAY_J)||(LA32_25 >= ARRAY_S && LA32_25 <= AT)||LA32_25==DEFAULT||LA32_25==FROM||(LA32_25 >= HIGH && LA32_25 <= INNER)||(LA32_25 >= INVOKEDYNAMIC && LA32_25 <= LDC)||LA32_25==LOCALS||(LA32_25 >= LOOKUPSWITCH && LA32_25 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_25 >= MULTIANEWARRAY && LA32_25 <= PARRAY_TYPE)||LA32_25==STACK||(LA32_25 >= TABLESWITCH && LA32_25 <= WLONG)||(LA32_25 >= WSHORT && LA32_25 <= XTYPE)||LA32_25==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_J:
								{
								int LA32_26 = input.LA(3);
								if ( ((LA32_26 >= AND && LA32_26 <= ANNOTATION_VISIBLITY)||(LA32_26 >= ARRAY_B && LA32_26 <= ARRAY_J)||(LA32_26 >= ARRAY_S && LA32_26 <= AT)||LA32_26==DEFAULT||LA32_26==FROM||(LA32_26 >= HIGH && LA32_26 <= INNER)||(LA32_26 >= INVOKEDYNAMIC && LA32_26 <= LDC)||LA32_26==LOCALS||(LA32_26 >= LOOKUPSWITCH && LA32_26 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_26 >= MULTIANEWARRAY && LA32_26 <= PARRAY_TYPE)||LA32_26==STACK||(LA32_26 >= TABLESWITCH && LA32_26 <= WLONG)||(LA32_26 >= WSHORT && LA32_26 <= XTYPE)||LA32_26==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_F:
								{
								int LA32_27 = input.LA(3);
								if ( ((LA32_27 >= AND && LA32_27 <= ANNOTATION_VISIBLITY)||(LA32_27 >= ARRAY_B && LA32_27 <= ARRAY_J)||(LA32_27 >= ARRAY_S && LA32_27 <= AT)||LA32_27==DEFAULT||LA32_27==FROM||(LA32_27 >= HIGH && LA32_27 <= INNER)||(LA32_27 >= INVOKEDYNAMIC && LA32_27 <= LDC)||LA32_27==LOCALS||(LA32_27 >= LOOKUPSWITCH && LA32_27 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_27 >= MULTIANEWARRAY && LA32_27 <= PARRAY_TYPE)||LA32_27==STACK||(LA32_27 >= TABLESWITCH && LA32_27 <= WLONG)||(LA32_27 >= WSHORT && LA32_27 <= XTYPE)||LA32_27==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_D:
								{
								int LA32_28 = input.LA(3);
								if ( ((LA32_28 >= AND && LA32_28 <= ANNOTATION_VISIBLITY)||(LA32_28 >= ARRAY_B && LA32_28 <= ARRAY_J)||(LA32_28 >= ARRAY_S && LA32_28 <= AT)||LA32_28==DEFAULT||LA32_28==FROM||(LA32_28 >= HIGH && LA32_28 <= INNER)||(LA32_28 >= INVOKEDYNAMIC && LA32_28 <= LDC)||LA32_28==LOCALS||(LA32_28 >= LOOKUPSWITCH && LA32_28 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_28 >= MULTIANEWARRAY && LA32_28 <= PARRAY_TYPE)||LA32_28==STACK||(LA32_28 >= TABLESWITCH && LA32_28 <= WLONG)||(LA32_28 >= WSHORT && LA32_28 <= XTYPE)||LA32_28==113) ) {
									alt32=1;
								}

								}
								break;
							case AND:
							case ANNOTATION_VISIBLITY:
							case DEFAULT:
							case FROM:
							case HIGH:
							case IIOP:
							case INNER:
							case INVOKEDYNAMIC:
							case INVOKEINTERFACE:
							case IOP:
							case JOP:
							case LDC:
							case LOCALS:
							case LOOKUPSWITCH:
							case METHOD_ANNOTATION_VISIBLITY:
							case MULTIANEWARRAY:
							case OBJECT_TYPE:
							case OP0:
							case OUTTER:
							case PARRAY_TYPE:
							case STACK:
							case TABLESWITCH:
							case TO:
							case USING:
							case VOID_TYPE:
							case WBOOLEAN:
							case WBYTE:
							case WCHAR:
							case WDOUBLE:
							case WFLOAT:
							case WINTEGER:
							case WLONG:
							case WSHORT:
							case XFIELD:
							case XINVOKE:
							case XNEWARRAY:
							case XTYPE:
							case 113:
								{
								alt32=1;
								}
								break;
							}
							}
							break;
						case UP_J:
							{
							switch ( input.LA(2) ) {
							case ID:
								{
								int LA32_11 = input.LA(3);
								if ( (LA32_11==ARRAY_AND||(LA32_11 >= ARRAY_B && LA32_11 <= AT)||LA32_11==ID||(LA32_11 >= UP_B && LA32_11 <= UP_Z)) ) {
									alt32=1;
								}

								}
								break;
							case AT:
								{
								int LA32_12 = input.LA(3);
								if ( (LA32_12==ARRAY_AND||(LA32_12 >= ARRAY_B && LA32_12 <= AT)||LA32_12==ID||(LA32_12 >= UP_B && LA32_12 <= UP_Z)) ) {
									alt32=1;
								}

								}
								break;
							case UP_B:
								{
								int LA32_13 = input.LA(3);
								if ( ((LA32_13 >= AND && LA32_13 <= ARRAY_AND)||(LA32_13 >= ARRAY_B && LA32_13 <= AT)||LA32_13==DEFAULT||LA32_13==FROM||(LA32_13 >= HIGH && LA32_13 <= INNER)||(LA32_13 >= INVOKEDYNAMIC && LA32_13 <= LDC)||LA32_13==LOCALS||(LA32_13 >= LOOKUPSWITCH && LA32_13 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_13 >= MULTIANEWARRAY && LA32_13 <= PARRAY_TYPE)||LA32_13==STACK||(LA32_13 >= TABLESWITCH && LA32_13 <= WLONG)||(LA32_13 >= WSHORT && LA32_13 <= XTYPE)||LA32_13==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_Z:
								{
								int LA32_14 = input.LA(3);
								if ( ((LA32_14 >= AND && LA32_14 <= ARRAY_AND)||(LA32_14 >= ARRAY_B && LA32_14 <= AT)||LA32_14==DEFAULT||LA32_14==FROM||(LA32_14 >= HIGH && LA32_14 <= INNER)||(LA32_14 >= INVOKEDYNAMIC && LA32_14 <= LDC)||LA32_14==LOCALS||(LA32_14 >= LOOKUPSWITCH && LA32_14 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_14 >= MULTIANEWARRAY && LA32_14 <= PARRAY_TYPE)||LA32_14==STACK||(LA32_14 >= TABLESWITCH && LA32_14 <= WLONG)||(LA32_14 >= WSHORT && LA32_14 <= XTYPE)||LA32_14==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_S:
								{
								int LA32_15 = input.LA(3);
								if ( ((LA32_15 >= AND && LA32_15 <= ARRAY_AND)||(LA32_15 >= ARRAY_B && LA32_15 <= AT)||LA32_15==DEFAULT||LA32_15==FROM||(LA32_15 >= HIGH && LA32_15 <= INNER)||(LA32_15 >= INVOKEDYNAMIC && LA32_15 <= LDC)||LA32_15==LOCALS||(LA32_15 >= LOOKUPSWITCH && LA32_15 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_15 >= MULTIANEWARRAY && LA32_15 <= PARRAY_TYPE)||LA32_15==STACK||(LA32_15 >= TABLESWITCH && LA32_15 <= WLONG)||(LA32_15 >= WSHORT && LA32_15 <= XTYPE)||LA32_15==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_C:
								{
								int LA32_16 = input.LA(3);
								if ( ((LA32_16 >= AND && LA32_16 <= ARRAY_AND)||(LA32_16 >= ARRAY_B && LA32_16 <= AT)||LA32_16==DEFAULT||LA32_16==FROM||(LA32_16 >= HIGH && LA32_16 <= INNER)||(LA32_16 >= INVOKEDYNAMIC && LA32_16 <= LDC)||LA32_16==LOCALS||(LA32_16 >= LOOKUPSWITCH && LA32_16 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_16 >= MULTIANEWARRAY && LA32_16 <= PARRAY_TYPE)||LA32_16==STACK||(LA32_16 >= TABLESWITCH && LA32_16 <= WLONG)||(LA32_16 >= WSHORT && LA32_16 <= XTYPE)||LA32_16==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_I:
								{
								int LA32_17 = input.LA(3);
								if ( ((LA32_17 >= AND && LA32_17 <= ARRAY_AND)||(LA32_17 >= ARRAY_B && LA32_17 <= AT)||LA32_17==DEFAULT||LA32_17==FROM||(LA32_17 >= HIGH && LA32_17 <= INNER)||(LA32_17 >= INVOKEDYNAMIC && LA32_17 <= LDC)||LA32_17==LOCALS||(LA32_17 >= LOOKUPSWITCH && LA32_17 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_17 >= MULTIANEWARRAY && LA32_17 <= PARRAY_TYPE)||LA32_17==STACK||(LA32_17 >= TABLESWITCH && LA32_17 <= WLONG)||(LA32_17 >= WSHORT && LA32_17 <= XTYPE)||LA32_17==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_J:
								{
								int LA32_18 = input.LA(3);
								if ( ((LA32_18 >= AND && LA32_18 <= ARRAY_AND)||(LA32_18 >= ARRAY_B && LA32_18 <= AT)||LA32_18==DEFAULT||LA32_18==FROM||(LA32_18 >= HIGH && LA32_18 <= INNER)||(LA32_18 >= INVOKEDYNAMIC && LA32_18 <= LDC)||LA32_18==LOCALS||(LA32_18 >= LOOKUPSWITCH && LA32_18 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_18 >= MULTIANEWARRAY && LA32_18 <= PARRAY_TYPE)||LA32_18==STACK||(LA32_18 >= TABLESWITCH && LA32_18 <= WLONG)||(LA32_18 >= WSHORT && LA32_18 <= XTYPE)||LA32_18==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_F:
								{
								int LA32_19 = input.LA(3);
								if ( ((LA32_19 >= AND && LA32_19 <= ARRAY_AND)||(LA32_19 >= ARRAY_B && LA32_19 <= AT)||LA32_19==DEFAULT||LA32_19==FROM||(LA32_19 >= HIGH && LA32_19 <= INNER)||(LA32_19 >= INVOKEDYNAMIC && LA32_19 <= LDC)||LA32_19==LOCALS||(LA32_19 >= LOOKUPSWITCH && LA32_19 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_19 >= MULTIANEWARRAY && LA32_19 <= PARRAY_TYPE)||LA32_19==STACK||(LA32_19 >= TABLESWITCH && LA32_19 <= WLONG)||(LA32_19 >= WSHORT && LA32_19 <= XTYPE)||LA32_19==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_D:
								{
								int LA32_20 = input.LA(3);
								if ( ((LA32_20 >= AND && LA32_20 <= ARRAY_AND)||(LA32_20 >= ARRAY_B && LA32_20 <= AT)||LA32_20==DEFAULT||LA32_20==FROM||(LA32_20 >= HIGH && LA32_20 <= INNER)||(LA32_20 >= INVOKEDYNAMIC && LA32_20 <= LDC)||LA32_20==LOCALS||(LA32_20 >= LOOKUPSWITCH && LA32_20 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_20 >= MULTIANEWARRAY && LA32_20 <= PARRAY_TYPE)||LA32_20==STACK||(LA32_20 >= TABLESWITCH && LA32_20 <= WLONG)||(LA32_20 >= WSHORT && LA32_20 <= XTYPE)||LA32_20==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_B:
								{
								int LA32_21 = input.LA(3);
								if ( ((LA32_21 >= AND && LA32_21 <= ANNOTATION_VISIBLITY)||(LA32_21 >= ARRAY_B && LA32_21 <= ARRAY_J)||(LA32_21 >= ARRAY_S && LA32_21 <= AT)||LA32_21==DEFAULT||LA32_21==FROM||(LA32_21 >= HIGH && LA32_21 <= INNER)||(LA32_21 >= INVOKEDYNAMIC && LA32_21 <= LDC)||LA32_21==LOCALS||(LA32_21 >= LOOKUPSWITCH && LA32_21 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_21 >= MULTIANEWARRAY && LA32_21 <= PARRAY_TYPE)||LA32_21==STACK||(LA32_21 >= TABLESWITCH && LA32_21 <= WLONG)||(LA32_21 >= WSHORT && LA32_21 <= XTYPE)||LA32_21==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_Z:
								{
								int LA32_22 = input.LA(3);
								if ( ((LA32_22 >= AND && LA32_22 <= ANNOTATION_VISIBLITY)||(LA32_22 >= ARRAY_B && LA32_22 <= ARRAY_J)||(LA32_22 >= ARRAY_S && LA32_22 <= AT)||LA32_22==DEFAULT||LA32_22==FROM||(LA32_22 >= HIGH && LA32_22 <= INNER)||(LA32_22 >= INVOKEDYNAMIC && LA32_22 <= LDC)||LA32_22==LOCALS||(LA32_22 >= LOOKUPSWITCH && LA32_22 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_22 >= MULTIANEWARRAY && LA32_22 <= PARRAY_TYPE)||LA32_22==STACK||(LA32_22 >= TABLESWITCH && LA32_22 <= WLONG)||(LA32_22 >= WSHORT && LA32_22 <= XTYPE)||LA32_22==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_S:
								{
								int LA32_23 = input.LA(3);
								if ( ((LA32_23 >= AND && LA32_23 <= ANNOTATION_VISIBLITY)||(LA32_23 >= ARRAY_B && LA32_23 <= ARRAY_J)||(LA32_23 >= ARRAY_S && LA32_23 <= AT)||LA32_23==DEFAULT||LA32_23==FROM||(LA32_23 >= HIGH && LA32_23 <= INNER)||(LA32_23 >= INVOKEDYNAMIC && LA32_23 <= LDC)||LA32_23==LOCALS||(LA32_23 >= LOOKUPSWITCH && LA32_23 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_23 >= MULTIANEWARRAY && LA32_23 <= PARRAY_TYPE)||LA32_23==STACK||(LA32_23 >= TABLESWITCH && LA32_23 <= WLONG)||(LA32_23 >= WSHORT && LA32_23 <= XTYPE)||LA32_23==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_C:
								{
								int LA32_24 = input.LA(3);
								if ( ((LA32_24 >= AND && LA32_24 <= ANNOTATION_VISIBLITY)||(LA32_24 >= ARRAY_B && LA32_24 <= ARRAY_J)||(LA32_24 >= ARRAY_S && LA32_24 <= AT)||LA32_24==DEFAULT||LA32_24==FROM||(LA32_24 >= HIGH && LA32_24 <= INNER)||(LA32_24 >= INVOKEDYNAMIC && LA32_24 <= LDC)||LA32_24==LOCALS||(LA32_24 >= LOOKUPSWITCH && LA32_24 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_24 >= MULTIANEWARRAY && LA32_24 <= PARRAY_TYPE)||LA32_24==STACK||(LA32_24 >= TABLESWITCH && LA32_24 <= WLONG)||(LA32_24 >= WSHORT && LA32_24 <= XTYPE)||LA32_24==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_I:
								{
								int LA32_25 = input.LA(3);
								if ( ((LA32_25 >= AND && LA32_25 <= ANNOTATION_VISIBLITY)||(LA32_25 >= ARRAY_B && LA32_25 <= ARRAY_J)||(LA32_25 >= ARRAY_S && LA32_25 <= AT)||LA32_25==DEFAULT||LA32_25==FROM||(LA32_25 >= HIGH && LA32_25 <= INNER)||(LA32_25 >= INVOKEDYNAMIC && LA32_25 <= LDC)||LA32_25==LOCALS||(LA32_25 >= LOOKUPSWITCH && LA32_25 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_25 >= MULTIANEWARRAY && LA32_25 <= PARRAY_TYPE)||LA32_25==STACK||(LA32_25 >= TABLESWITCH && LA32_25 <= WLONG)||(LA32_25 >= WSHORT && LA32_25 <= XTYPE)||LA32_25==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_J:
								{
								int LA32_26 = input.LA(3);
								if ( ((LA32_26 >= AND && LA32_26 <= ANNOTATION_VISIBLITY)||(LA32_26 >= ARRAY_B && LA32_26 <= ARRAY_J)||(LA32_26 >= ARRAY_S && LA32_26 <= AT)||LA32_26==DEFAULT||LA32_26==FROM||(LA32_26 >= HIGH && LA32_26 <= INNER)||(LA32_26 >= INVOKEDYNAMIC && LA32_26 <= LDC)||LA32_26==LOCALS||(LA32_26 >= LOOKUPSWITCH && LA32_26 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_26 >= MULTIANEWARRAY && LA32_26 <= PARRAY_TYPE)||LA32_26==STACK||(LA32_26 >= TABLESWITCH && LA32_26 <= WLONG)||(LA32_26 >= WSHORT && LA32_26 <= XTYPE)||LA32_26==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_F:
								{
								int LA32_27 = input.LA(3);
								if ( ((LA32_27 >= AND && LA32_27 <= ANNOTATION_VISIBLITY)||(LA32_27 >= ARRAY_B && LA32_27 <= ARRAY_J)||(LA32_27 >= ARRAY_S && LA32_27 <= AT)||LA32_27==DEFAULT||LA32_27==FROM||(LA32_27 >= HIGH && LA32_27 <= INNER)||(LA32_27 >= INVOKEDYNAMIC && LA32_27 <= LDC)||LA32_27==LOCALS||(LA32_27 >= LOOKUPSWITCH && LA32_27 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_27 >= MULTIANEWARRAY && LA32_27 <= PARRAY_TYPE)||LA32_27==STACK||(LA32_27 >= TABLESWITCH && LA32_27 <= WLONG)||(LA32_27 >= WSHORT && LA32_27 <= XTYPE)||LA32_27==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_D:
								{
								int LA32_28 = input.LA(3);
								if ( ((LA32_28 >= AND && LA32_28 <= ANNOTATION_VISIBLITY)||(LA32_28 >= ARRAY_B && LA32_28 <= ARRAY_J)||(LA32_28 >= ARRAY_S && LA32_28 <= AT)||LA32_28==DEFAULT||LA32_28==FROM||(LA32_28 >= HIGH && LA32_28 <= INNER)||(LA32_28 >= INVOKEDYNAMIC && LA32_28 <= LDC)||LA32_28==LOCALS||(LA32_28 >= LOOKUPSWITCH && LA32_28 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_28 >= MULTIANEWARRAY && LA32_28 <= PARRAY_TYPE)||LA32_28==STACK||(LA32_28 >= TABLESWITCH && LA32_28 <= WLONG)||(LA32_28 >= WSHORT && LA32_28 <= XTYPE)||LA32_28==113) ) {
									alt32=1;
								}

								}
								break;
							case AND:
							case ANNOTATION_VISIBLITY:
							case DEFAULT:
							case FROM:
							case HIGH:
							case IIOP:
							case INNER:
							case INVOKEDYNAMIC:
							case INVOKEINTERFACE:
							case IOP:
							case JOP:
							case LDC:
							case LOCALS:
							case LOOKUPSWITCH:
							case METHOD_ANNOTATION_VISIBLITY:
							case MULTIANEWARRAY:
							case OBJECT_TYPE:
							case OP0:
							case OUTTER:
							case PARRAY_TYPE:
							case STACK:
							case TABLESWITCH:
							case TO:
							case USING:
							case VOID_TYPE:
							case WBOOLEAN:
							case WBYTE:
							case WCHAR:
							case WDOUBLE:
							case WFLOAT:
							case WINTEGER:
							case WLONG:
							case WSHORT:
							case XFIELD:
							case XINVOKE:
							case XNEWARRAY:
							case XTYPE:
							case 113:
								{
								alt32=1;
								}
								break;
							}
							}
							break;
						case UP_D:
							{
							switch ( input.LA(2) ) {
							case ID:
								{
								int LA32_11 = input.LA(3);
								if ( (LA32_11==ARRAY_AND||(LA32_11 >= ARRAY_B && LA32_11 <= AT)||LA32_11==ID||(LA32_11 >= UP_B && LA32_11 <= UP_Z)) ) {
									alt32=1;
								}

								}
								break;
							case AT:
								{
								int LA32_12 = input.LA(3);
								if ( (LA32_12==ARRAY_AND||(LA32_12 >= ARRAY_B && LA32_12 <= AT)||LA32_12==ID||(LA32_12 >= UP_B && LA32_12 <= UP_Z)) ) {
									alt32=1;
								}

								}
								break;
							case UP_B:
								{
								int LA32_13 = input.LA(3);
								if ( ((LA32_13 >= AND && LA32_13 <= ARRAY_AND)||(LA32_13 >= ARRAY_B && LA32_13 <= AT)||LA32_13==DEFAULT||LA32_13==FROM||(LA32_13 >= HIGH && LA32_13 <= INNER)||(LA32_13 >= INVOKEDYNAMIC && LA32_13 <= LDC)||LA32_13==LOCALS||(LA32_13 >= LOOKUPSWITCH && LA32_13 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_13 >= MULTIANEWARRAY && LA32_13 <= PARRAY_TYPE)||LA32_13==STACK||(LA32_13 >= TABLESWITCH && LA32_13 <= WLONG)||(LA32_13 >= WSHORT && LA32_13 <= XTYPE)||LA32_13==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_Z:
								{
								int LA32_14 = input.LA(3);
								if ( ((LA32_14 >= AND && LA32_14 <= ARRAY_AND)||(LA32_14 >= ARRAY_B && LA32_14 <= AT)||LA32_14==DEFAULT||LA32_14==FROM||(LA32_14 >= HIGH && LA32_14 <= INNER)||(LA32_14 >= INVOKEDYNAMIC && LA32_14 <= LDC)||LA32_14==LOCALS||(LA32_14 >= LOOKUPSWITCH && LA32_14 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_14 >= MULTIANEWARRAY && LA32_14 <= PARRAY_TYPE)||LA32_14==STACK||(LA32_14 >= TABLESWITCH && LA32_14 <= WLONG)||(LA32_14 >= WSHORT && LA32_14 <= XTYPE)||LA32_14==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_S:
								{
								int LA32_15 = input.LA(3);
								if ( ((LA32_15 >= AND && LA32_15 <= ARRAY_AND)||(LA32_15 >= ARRAY_B && LA32_15 <= AT)||LA32_15==DEFAULT||LA32_15==FROM||(LA32_15 >= HIGH && LA32_15 <= INNER)||(LA32_15 >= INVOKEDYNAMIC && LA32_15 <= LDC)||LA32_15==LOCALS||(LA32_15 >= LOOKUPSWITCH && LA32_15 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_15 >= MULTIANEWARRAY && LA32_15 <= PARRAY_TYPE)||LA32_15==STACK||(LA32_15 >= TABLESWITCH && LA32_15 <= WLONG)||(LA32_15 >= WSHORT && LA32_15 <= XTYPE)||LA32_15==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_C:
								{
								int LA32_16 = input.LA(3);
								if ( ((LA32_16 >= AND && LA32_16 <= ARRAY_AND)||(LA32_16 >= ARRAY_B && LA32_16 <= AT)||LA32_16==DEFAULT||LA32_16==FROM||(LA32_16 >= HIGH && LA32_16 <= INNER)||(LA32_16 >= INVOKEDYNAMIC && LA32_16 <= LDC)||LA32_16==LOCALS||(LA32_16 >= LOOKUPSWITCH && LA32_16 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_16 >= MULTIANEWARRAY && LA32_16 <= PARRAY_TYPE)||LA32_16==STACK||(LA32_16 >= TABLESWITCH && LA32_16 <= WLONG)||(LA32_16 >= WSHORT && LA32_16 <= XTYPE)||LA32_16==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_I:
								{
								int LA32_17 = input.LA(3);
								if ( ((LA32_17 >= AND && LA32_17 <= ARRAY_AND)||(LA32_17 >= ARRAY_B && LA32_17 <= AT)||LA32_17==DEFAULT||LA32_17==FROM||(LA32_17 >= HIGH && LA32_17 <= INNER)||(LA32_17 >= INVOKEDYNAMIC && LA32_17 <= LDC)||LA32_17==LOCALS||(LA32_17 >= LOOKUPSWITCH && LA32_17 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_17 >= MULTIANEWARRAY && LA32_17 <= PARRAY_TYPE)||LA32_17==STACK||(LA32_17 >= TABLESWITCH && LA32_17 <= WLONG)||(LA32_17 >= WSHORT && LA32_17 <= XTYPE)||LA32_17==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_J:
								{
								int LA32_18 = input.LA(3);
								if ( ((LA32_18 >= AND && LA32_18 <= ARRAY_AND)||(LA32_18 >= ARRAY_B && LA32_18 <= AT)||LA32_18==DEFAULT||LA32_18==FROM||(LA32_18 >= HIGH && LA32_18 <= INNER)||(LA32_18 >= INVOKEDYNAMIC && LA32_18 <= LDC)||LA32_18==LOCALS||(LA32_18 >= LOOKUPSWITCH && LA32_18 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_18 >= MULTIANEWARRAY && LA32_18 <= PARRAY_TYPE)||LA32_18==STACK||(LA32_18 >= TABLESWITCH && LA32_18 <= WLONG)||(LA32_18 >= WSHORT && LA32_18 <= XTYPE)||LA32_18==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_F:
								{
								int LA32_19 = input.LA(3);
								if ( ((LA32_19 >= AND && LA32_19 <= ARRAY_AND)||(LA32_19 >= ARRAY_B && LA32_19 <= AT)||LA32_19==DEFAULT||LA32_19==FROM||(LA32_19 >= HIGH && LA32_19 <= INNER)||(LA32_19 >= INVOKEDYNAMIC && LA32_19 <= LDC)||LA32_19==LOCALS||(LA32_19 >= LOOKUPSWITCH && LA32_19 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_19 >= MULTIANEWARRAY && LA32_19 <= PARRAY_TYPE)||LA32_19==STACK||(LA32_19 >= TABLESWITCH && LA32_19 <= WLONG)||(LA32_19 >= WSHORT && LA32_19 <= XTYPE)||LA32_19==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_D:
								{
								int LA32_20 = input.LA(3);
								if ( ((LA32_20 >= AND && LA32_20 <= ARRAY_AND)||(LA32_20 >= ARRAY_B && LA32_20 <= AT)||LA32_20==DEFAULT||LA32_20==FROM||(LA32_20 >= HIGH && LA32_20 <= INNER)||(LA32_20 >= INVOKEDYNAMIC && LA32_20 <= LDC)||LA32_20==LOCALS||(LA32_20 >= LOOKUPSWITCH && LA32_20 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_20 >= MULTIANEWARRAY && LA32_20 <= PARRAY_TYPE)||LA32_20==STACK||(LA32_20 >= TABLESWITCH && LA32_20 <= WLONG)||(LA32_20 >= WSHORT && LA32_20 <= XTYPE)||LA32_20==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_B:
								{
								int LA32_21 = input.LA(3);
								if ( ((LA32_21 >= AND && LA32_21 <= ANNOTATION_VISIBLITY)||(LA32_21 >= ARRAY_B && LA32_21 <= ARRAY_J)||(LA32_21 >= ARRAY_S && LA32_21 <= AT)||LA32_21==DEFAULT||LA32_21==FROM||(LA32_21 >= HIGH && LA32_21 <= INNER)||(LA32_21 >= INVOKEDYNAMIC && LA32_21 <= LDC)||LA32_21==LOCALS||(LA32_21 >= LOOKUPSWITCH && LA32_21 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_21 >= MULTIANEWARRAY && LA32_21 <= PARRAY_TYPE)||LA32_21==STACK||(LA32_21 >= TABLESWITCH && LA32_21 <= WLONG)||(LA32_21 >= WSHORT && LA32_21 <= XTYPE)||LA32_21==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_Z:
								{
								int LA32_22 = input.LA(3);
								if ( ((LA32_22 >= AND && LA32_22 <= ANNOTATION_VISIBLITY)||(LA32_22 >= ARRAY_B && LA32_22 <= ARRAY_J)||(LA32_22 >= ARRAY_S && LA32_22 <= AT)||LA32_22==DEFAULT||LA32_22==FROM||(LA32_22 >= HIGH && LA32_22 <= INNER)||(LA32_22 >= INVOKEDYNAMIC && LA32_22 <= LDC)||LA32_22==LOCALS||(LA32_22 >= LOOKUPSWITCH && LA32_22 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_22 >= MULTIANEWARRAY && LA32_22 <= PARRAY_TYPE)||LA32_22==STACK||(LA32_22 >= TABLESWITCH && LA32_22 <= WLONG)||(LA32_22 >= WSHORT && LA32_22 <= XTYPE)||LA32_22==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_S:
								{
								int LA32_23 = input.LA(3);
								if ( ((LA32_23 >= AND && LA32_23 <= ANNOTATION_VISIBLITY)||(LA32_23 >= ARRAY_B && LA32_23 <= ARRAY_J)||(LA32_23 >= ARRAY_S && LA32_23 <= AT)||LA32_23==DEFAULT||LA32_23==FROM||(LA32_23 >= HIGH && LA32_23 <= INNER)||(LA32_23 >= INVOKEDYNAMIC && LA32_23 <= LDC)||LA32_23==LOCALS||(LA32_23 >= LOOKUPSWITCH && LA32_23 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_23 >= MULTIANEWARRAY && LA32_23 <= PARRAY_TYPE)||LA32_23==STACK||(LA32_23 >= TABLESWITCH && LA32_23 <= WLONG)||(LA32_23 >= WSHORT && LA32_23 <= XTYPE)||LA32_23==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_C:
								{
								int LA32_24 = input.LA(3);
								if ( ((LA32_24 >= AND && LA32_24 <= ANNOTATION_VISIBLITY)||(LA32_24 >= ARRAY_B && LA32_24 <= ARRAY_J)||(LA32_24 >= ARRAY_S && LA32_24 <= AT)||LA32_24==DEFAULT||LA32_24==FROM||(LA32_24 >= HIGH && LA32_24 <= INNER)||(LA32_24 >= INVOKEDYNAMIC && LA32_24 <= LDC)||LA32_24==LOCALS||(LA32_24 >= LOOKUPSWITCH && LA32_24 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_24 >= MULTIANEWARRAY && LA32_24 <= PARRAY_TYPE)||LA32_24==STACK||(LA32_24 >= TABLESWITCH && LA32_24 <= WLONG)||(LA32_24 >= WSHORT && LA32_24 <= XTYPE)||LA32_24==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_I:
								{
								int LA32_25 = input.LA(3);
								if ( ((LA32_25 >= AND && LA32_25 <= ANNOTATION_VISIBLITY)||(LA32_25 >= ARRAY_B && LA32_25 <= ARRAY_J)||(LA32_25 >= ARRAY_S && LA32_25 <= AT)||LA32_25==DEFAULT||LA32_25==FROM||(LA32_25 >= HIGH && LA32_25 <= INNER)||(LA32_25 >= INVOKEDYNAMIC && LA32_25 <= LDC)||LA32_25==LOCALS||(LA32_25 >= LOOKUPSWITCH && LA32_25 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_25 >= MULTIANEWARRAY && LA32_25 <= PARRAY_TYPE)||LA32_25==STACK||(LA32_25 >= TABLESWITCH && LA32_25 <= WLONG)||(LA32_25 >= WSHORT && LA32_25 <= XTYPE)||LA32_25==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_J:
								{
								int LA32_26 = input.LA(3);
								if ( ((LA32_26 >= AND && LA32_26 <= ANNOTATION_VISIBLITY)||(LA32_26 >= ARRAY_B && LA32_26 <= ARRAY_J)||(LA32_26 >= ARRAY_S && LA32_26 <= AT)||LA32_26==DEFAULT||LA32_26==FROM||(LA32_26 >= HIGH && LA32_26 <= INNER)||(LA32_26 >= INVOKEDYNAMIC && LA32_26 <= LDC)||LA32_26==LOCALS||(LA32_26 >= LOOKUPSWITCH && LA32_26 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_26 >= MULTIANEWARRAY && LA32_26 <= PARRAY_TYPE)||LA32_26==STACK||(LA32_26 >= TABLESWITCH && LA32_26 <= WLONG)||(LA32_26 >= WSHORT && LA32_26 <= XTYPE)||LA32_26==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_F:
								{
								int LA32_27 = input.LA(3);
								if ( ((LA32_27 >= AND && LA32_27 <= ANNOTATION_VISIBLITY)||(LA32_27 >= ARRAY_B && LA32_27 <= ARRAY_J)||(LA32_27 >= ARRAY_S && LA32_27 <= AT)||LA32_27==DEFAULT||LA32_27==FROM||(LA32_27 >= HIGH && LA32_27 <= INNER)||(LA32_27 >= INVOKEDYNAMIC && LA32_27 <= LDC)||LA32_27==LOCALS||(LA32_27 >= LOOKUPSWITCH && LA32_27 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_27 >= MULTIANEWARRAY && LA32_27 <= PARRAY_TYPE)||LA32_27==STACK||(LA32_27 >= TABLESWITCH && LA32_27 <= WLONG)||(LA32_27 >= WSHORT && LA32_27 <= XTYPE)||LA32_27==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_D:
								{
								int LA32_28 = input.LA(3);
								if ( ((LA32_28 >= AND && LA32_28 <= ANNOTATION_VISIBLITY)||(LA32_28 >= ARRAY_B && LA32_28 <= ARRAY_J)||(LA32_28 >= ARRAY_S && LA32_28 <= AT)||LA32_28==DEFAULT||LA32_28==FROM||(LA32_28 >= HIGH && LA32_28 <= INNER)||(LA32_28 >= INVOKEDYNAMIC && LA32_28 <= LDC)||LA32_28==LOCALS||(LA32_28 >= LOOKUPSWITCH && LA32_28 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_28 >= MULTIANEWARRAY && LA32_28 <= PARRAY_TYPE)||LA32_28==STACK||(LA32_28 >= TABLESWITCH && LA32_28 <= WLONG)||(LA32_28 >= WSHORT && LA32_28 <= XTYPE)||LA32_28==113) ) {
									alt32=1;
								}

								}
								break;
							case AND:
							case ANNOTATION_VISIBLITY:
							case DEFAULT:
							case FROM:
							case HIGH:
							case IIOP:
							case INNER:
							case INVOKEDYNAMIC:
							case INVOKEINTERFACE:
							case IOP:
							case JOP:
							case LDC:
							case LOCALS:
							case LOOKUPSWITCH:
							case METHOD_ANNOTATION_VISIBLITY:
							case MULTIANEWARRAY:
							case OBJECT_TYPE:
							case OP0:
							case OUTTER:
							case PARRAY_TYPE:
							case STACK:
							case TABLESWITCH:
							case TO:
							case USING:
							case VOID_TYPE:
							case WBOOLEAN:
							case WBYTE:
							case WCHAR:
							case WDOUBLE:
							case WFLOAT:
							case WINTEGER:
							case WLONG:
							case WSHORT:
							case XFIELD:
							case XINVOKE:
							case XNEWARRAY:
							case XTYPE:
							case 113:
								{
								alt32=1;
								}
								break;
							}
							}
							break;
						case UP_F:
							{
							switch ( input.LA(2) ) {
							case ID:
								{
								int LA32_11 = input.LA(3);
								if ( (LA32_11==ARRAY_AND||(LA32_11 >= ARRAY_B && LA32_11 <= AT)||LA32_11==ID||(LA32_11 >= UP_B && LA32_11 <= UP_Z)) ) {
									alt32=1;
								}

								}
								break;
							case AT:
								{
								int LA32_12 = input.LA(3);
								if ( (LA32_12==ARRAY_AND||(LA32_12 >= ARRAY_B && LA32_12 <= AT)||LA32_12==ID||(LA32_12 >= UP_B && LA32_12 <= UP_Z)) ) {
									alt32=1;
								}

								}
								break;
							case UP_B:
								{
								int LA32_13 = input.LA(3);
								if ( ((LA32_13 >= AND && LA32_13 <= ARRAY_AND)||(LA32_13 >= ARRAY_B && LA32_13 <= AT)||LA32_13==DEFAULT||LA32_13==FROM||(LA32_13 >= HIGH && LA32_13 <= INNER)||(LA32_13 >= INVOKEDYNAMIC && LA32_13 <= LDC)||LA32_13==LOCALS||(LA32_13 >= LOOKUPSWITCH && LA32_13 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_13 >= MULTIANEWARRAY && LA32_13 <= PARRAY_TYPE)||LA32_13==STACK||(LA32_13 >= TABLESWITCH && LA32_13 <= WLONG)||(LA32_13 >= WSHORT && LA32_13 <= XTYPE)||LA32_13==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_Z:
								{
								int LA32_14 = input.LA(3);
								if ( ((LA32_14 >= AND && LA32_14 <= ARRAY_AND)||(LA32_14 >= ARRAY_B && LA32_14 <= AT)||LA32_14==DEFAULT||LA32_14==FROM||(LA32_14 >= HIGH && LA32_14 <= INNER)||(LA32_14 >= INVOKEDYNAMIC && LA32_14 <= LDC)||LA32_14==LOCALS||(LA32_14 >= LOOKUPSWITCH && LA32_14 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_14 >= MULTIANEWARRAY && LA32_14 <= PARRAY_TYPE)||LA32_14==STACK||(LA32_14 >= TABLESWITCH && LA32_14 <= WLONG)||(LA32_14 >= WSHORT && LA32_14 <= XTYPE)||LA32_14==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_S:
								{
								int LA32_15 = input.LA(3);
								if ( ((LA32_15 >= AND && LA32_15 <= ARRAY_AND)||(LA32_15 >= ARRAY_B && LA32_15 <= AT)||LA32_15==DEFAULT||LA32_15==FROM||(LA32_15 >= HIGH && LA32_15 <= INNER)||(LA32_15 >= INVOKEDYNAMIC && LA32_15 <= LDC)||LA32_15==LOCALS||(LA32_15 >= LOOKUPSWITCH && LA32_15 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_15 >= MULTIANEWARRAY && LA32_15 <= PARRAY_TYPE)||LA32_15==STACK||(LA32_15 >= TABLESWITCH && LA32_15 <= WLONG)||(LA32_15 >= WSHORT && LA32_15 <= XTYPE)||LA32_15==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_C:
								{
								int LA32_16 = input.LA(3);
								if ( ((LA32_16 >= AND && LA32_16 <= ARRAY_AND)||(LA32_16 >= ARRAY_B && LA32_16 <= AT)||LA32_16==DEFAULT||LA32_16==FROM||(LA32_16 >= HIGH && LA32_16 <= INNER)||(LA32_16 >= INVOKEDYNAMIC && LA32_16 <= LDC)||LA32_16==LOCALS||(LA32_16 >= LOOKUPSWITCH && LA32_16 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_16 >= MULTIANEWARRAY && LA32_16 <= PARRAY_TYPE)||LA32_16==STACK||(LA32_16 >= TABLESWITCH && LA32_16 <= WLONG)||(LA32_16 >= WSHORT && LA32_16 <= XTYPE)||LA32_16==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_I:
								{
								int LA32_17 = input.LA(3);
								if ( ((LA32_17 >= AND && LA32_17 <= ARRAY_AND)||(LA32_17 >= ARRAY_B && LA32_17 <= AT)||LA32_17==DEFAULT||LA32_17==FROM||(LA32_17 >= HIGH && LA32_17 <= INNER)||(LA32_17 >= INVOKEDYNAMIC && LA32_17 <= LDC)||LA32_17==LOCALS||(LA32_17 >= LOOKUPSWITCH && LA32_17 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_17 >= MULTIANEWARRAY && LA32_17 <= PARRAY_TYPE)||LA32_17==STACK||(LA32_17 >= TABLESWITCH && LA32_17 <= WLONG)||(LA32_17 >= WSHORT && LA32_17 <= XTYPE)||LA32_17==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_J:
								{
								int LA32_18 = input.LA(3);
								if ( ((LA32_18 >= AND && LA32_18 <= ARRAY_AND)||(LA32_18 >= ARRAY_B && LA32_18 <= AT)||LA32_18==DEFAULT||LA32_18==FROM||(LA32_18 >= HIGH && LA32_18 <= INNER)||(LA32_18 >= INVOKEDYNAMIC && LA32_18 <= LDC)||LA32_18==LOCALS||(LA32_18 >= LOOKUPSWITCH && LA32_18 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_18 >= MULTIANEWARRAY && LA32_18 <= PARRAY_TYPE)||LA32_18==STACK||(LA32_18 >= TABLESWITCH && LA32_18 <= WLONG)||(LA32_18 >= WSHORT && LA32_18 <= XTYPE)||LA32_18==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_F:
								{
								int LA32_19 = input.LA(3);
								if ( ((LA32_19 >= AND && LA32_19 <= ARRAY_AND)||(LA32_19 >= ARRAY_B && LA32_19 <= AT)||LA32_19==DEFAULT||LA32_19==FROM||(LA32_19 >= HIGH && LA32_19 <= INNER)||(LA32_19 >= INVOKEDYNAMIC && LA32_19 <= LDC)||LA32_19==LOCALS||(LA32_19 >= LOOKUPSWITCH && LA32_19 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_19 >= MULTIANEWARRAY && LA32_19 <= PARRAY_TYPE)||LA32_19==STACK||(LA32_19 >= TABLESWITCH && LA32_19 <= WLONG)||(LA32_19 >= WSHORT && LA32_19 <= XTYPE)||LA32_19==113) ) {
									alt32=1;
								}

								}
								break;
							case UP_D:
								{
								int LA32_20 = input.LA(3);
								if ( ((LA32_20 >= AND && LA32_20 <= ARRAY_AND)||(LA32_20 >= ARRAY_B && LA32_20 <= AT)||LA32_20==DEFAULT||LA32_20==FROM||(LA32_20 >= HIGH && LA32_20 <= INNER)||(LA32_20 >= INVOKEDYNAMIC && LA32_20 <= LDC)||LA32_20==LOCALS||(LA32_20 >= LOOKUPSWITCH && LA32_20 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_20 >= MULTIANEWARRAY && LA32_20 <= PARRAY_TYPE)||LA32_20==STACK||(LA32_20 >= TABLESWITCH && LA32_20 <= WLONG)||(LA32_20 >= WSHORT && LA32_20 <= XTYPE)||LA32_20==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_B:
								{
								int LA32_21 = input.LA(3);
								if ( ((LA32_21 >= AND && LA32_21 <= ANNOTATION_VISIBLITY)||(LA32_21 >= ARRAY_B && LA32_21 <= ARRAY_J)||(LA32_21 >= ARRAY_S && LA32_21 <= AT)||LA32_21==DEFAULT||LA32_21==FROM||(LA32_21 >= HIGH && LA32_21 <= INNER)||(LA32_21 >= INVOKEDYNAMIC && LA32_21 <= LDC)||LA32_21==LOCALS||(LA32_21 >= LOOKUPSWITCH && LA32_21 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_21 >= MULTIANEWARRAY && LA32_21 <= PARRAY_TYPE)||LA32_21==STACK||(LA32_21 >= TABLESWITCH && LA32_21 <= WLONG)||(LA32_21 >= WSHORT && LA32_21 <= XTYPE)||LA32_21==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_Z:
								{
								int LA32_22 = input.LA(3);
								if ( ((LA32_22 >= AND && LA32_22 <= ANNOTATION_VISIBLITY)||(LA32_22 >= ARRAY_B && LA32_22 <= ARRAY_J)||(LA32_22 >= ARRAY_S && LA32_22 <= AT)||LA32_22==DEFAULT||LA32_22==FROM||(LA32_22 >= HIGH && LA32_22 <= INNER)||(LA32_22 >= INVOKEDYNAMIC && LA32_22 <= LDC)||LA32_22==LOCALS||(LA32_22 >= LOOKUPSWITCH && LA32_22 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_22 >= MULTIANEWARRAY && LA32_22 <= PARRAY_TYPE)||LA32_22==STACK||(LA32_22 >= TABLESWITCH && LA32_22 <= WLONG)||(LA32_22 >= WSHORT && LA32_22 <= XTYPE)||LA32_22==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_S:
								{
								int LA32_23 = input.LA(3);
								if ( ((LA32_23 >= AND && LA32_23 <= ANNOTATION_VISIBLITY)||(LA32_23 >= ARRAY_B && LA32_23 <= ARRAY_J)||(LA32_23 >= ARRAY_S && LA32_23 <= AT)||LA32_23==DEFAULT||LA32_23==FROM||(LA32_23 >= HIGH && LA32_23 <= INNER)||(LA32_23 >= INVOKEDYNAMIC && LA32_23 <= LDC)||LA32_23==LOCALS||(LA32_23 >= LOOKUPSWITCH && LA32_23 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_23 >= MULTIANEWARRAY && LA32_23 <= PARRAY_TYPE)||LA32_23==STACK||(LA32_23 >= TABLESWITCH && LA32_23 <= WLONG)||(LA32_23 >= WSHORT && LA32_23 <= XTYPE)||LA32_23==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_C:
								{
								int LA32_24 = input.LA(3);
								if ( ((LA32_24 >= AND && LA32_24 <= ANNOTATION_VISIBLITY)||(LA32_24 >= ARRAY_B && LA32_24 <= ARRAY_J)||(LA32_24 >= ARRAY_S && LA32_24 <= AT)||LA32_24==DEFAULT||LA32_24==FROM||(LA32_24 >= HIGH && LA32_24 <= INNER)||(LA32_24 >= INVOKEDYNAMIC && LA32_24 <= LDC)||LA32_24==LOCALS||(LA32_24 >= LOOKUPSWITCH && LA32_24 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_24 >= MULTIANEWARRAY && LA32_24 <= PARRAY_TYPE)||LA32_24==STACK||(LA32_24 >= TABLESWITCH && LA32_24 <= WLONG)||(LA32_24 >= WSHORT && LA32_24 <= XTYPE)||LA32_24==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_I:
								{
								int LA32_25 = input.LA(3);
								if ( ((LA32_25 >= AND && LA32_25 <= ANNOTATION_VISIBLITY)||(LA32_25 >= ARRAY_B && LA32_25 <= ARRAY_J)||(LA32_25 >= ARRAY_S && LA32_25 <= AT)||LA32_25==DEFAULT||LA32_25==FROM||(LA32_25 >= HIGH && LA32_25 <= INNER)||(LA32_25 >= INVOKEDYNAMIC && LA32_25 <= LDC)||LA32_25==LOCALS||(LA32_25 >= LOOKUPSWITCH && LA32_25 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_25 >= MULTIANEWARRAY && LA32_25 <= PARRAY_TYPE)||LA32_25==STACK||(LA32_25 >= TABLESWITCH && LA32_25 <= WLONG)||(LA32_25 >= WSHORT && LA32_25 <= XTYPE)||LA32_25==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_J:
								{
								int LA32_26 = input.LA(3);
								if ( ((LA32_26 >= AND && LA32_26 <= ANNOTATION_VISIBLITY)||(LA32_26 >= ARRAY_B && LA32_26 <= ARRAY_J)||(LA32_26 >= ARRAY_S && LA32_26 <= AT)||LA32_26==DEFAULT||LA32_26==FROM||(LA32_26 >= HIGH && LA32_26 <= INNER)||(LA32_26 >= INVOKEDYNAMIC && LA32_26 <= LDC)||LA32_26==LOCALS||(LA32_26 >= LOOKUPSWITCH && LA32_26 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_26 >= MULTIANEWARRAY && LA32_26 <= PARRAY_TYPE)||LA32_26==STACK||(LA32_26 >= TABLESWITCH && LA32_26 <= WLONG)||(LA32_26 >= WSHORT && LA32_26 <= XTYPE)||LA32_26==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_F:
								{
								int LA32_27 = input.LA(3);
								if ( ((LA32_27 >= AND && LA32_27 <= ANNOTATION_VISIBLITY)||(LA32_27 >= ARRAY_B && LA32_27 <= ARRAY_J)||(LA32_27 >= ARRAY_S && LA32_27 <= AT)||LA32_27==DEFAULT||LA32_27==FROM||(LA32_27 >= HIGH && LA32_27 <= INNER)||(LA32_27 >= INVOKEDYNAMIC && LA32_27 <= LDC)||LA32_27==LOCALS||(LA32_27 >= LOOKUPSWITCH && LA32_27 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_27 >= MULTIANEWARRAY && LA32_27 <= PARRAY_TYPE)||LA32_27==STACK||(LA32_27 >= TABLESWITCH && LA32_27 <= WLONG)||(LA32_27 >= WSHORT && LA32_27 <= XTYPE)||LA32_27==113) ) {
									alt32=1;
								}

								}
								break;
							case ARRAY_D:
								{
								int LA32_28 = input.LA(3);
								if ( ((LA32_28 >= AND && LA32_28 <= ANNOTATION_VISIBLITY)||(LA32_28 >= ARRAY_B && LA32_28 <= ARRAY_J)||(LA32_28 >= ARRAY_S && LA32_28 <= AT)||LA32_28==DEFAULT||LA32_28==FROM||(LA32_28 >= HIGH && LA32_28 <= INNER)||(LA32_28 >= INVOKEDYNAMIC && LA32_28 <= LDC)||LA32_28==LOCALS||(LA32_28 >= LOOKUPSWITCH && LA32_28 <= METHOD_ANNOTATION_VISIBLITY)||(LA32_28 >= MULTIANEWARRAY && LA32_28 <= PARRAY_TYPE)||LA32_28==STACK||(LA32_28 >= TABLESWITCH && LA32_28 <= WLONG)||(LA32_28 >= WSHORT && LA32_28 <= XTYPE)||LA32_28==113) ) {
									alt32=1;
								}

								}
								break;
							case AND:
							case ANNOTATION_VISIBLITY:
							case DEFAULT:
							case FROM:
							case HIGH:
							case IIOP:
							case INNER:
							case INVOKEDYNAMIC:
							case INVOKEINTERFACE:
							case IOP:
							case JOP:
							case LDC:
							case LOCALS:
							case LOOKUPSWITCH:
							case METHOD_ANNOTATION_VISIBLITY:
							case MULTIANEWARRAY:
							case OBJECT_TYPE:
							case OP0:
							case OUTTER:
							case PARRAY_TYPE:
							case STACK:
							case TABLESWITCH:
							case TO:
							case USING:
							case VOID_TYPE:
							case WBOOLEAN:
							case WBYTE:
							case WCHAR:
							case WDOUBLE:
							case WFLOAT:
							case WINTEGER:
							case WLONG:
							case WSHORT:
							case XFIELD:
							case XINVOKE:
							case XNEWARRAY:
							case XTYPE:
							case 113:
								{
								alt32=1;
								}
								break;
							}
							}
							break;
						}
						switch (alt32) {
						case 1 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1062:32: b= sClassDesc
							{
							pushFollow(FOLLOW_sClassDesc_in_sAnnotationElement4161);
							b=sClassDesc();
							state._fsp--;

							array.add(Type.getType((b!=null?input.toString(b.start,b.stop):null)));
							}
							break;

						default :
							if ( cnt32 >= 1 ) break loop32;
							EarlyExitException eee = new EarlyExitException(32, input);
							throw eee;
						}
						cnt32++;
					}

					 currentAnnotationVisitor.visit((a!=null?input.toString(a.start,a.stop):null),array); 
					}
					break;
				case 24 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1063:14: ARRAY_LOW_S '=' (b21= STRING )+
					{
					match(input,ARRAY_LOW_S,FOLLOW_ARRAY_LOW_S_in_sAnnotationElement4189); 
					match(input,148,FOLLOW_148_in_sAnnotationElement4191); 
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1063:31: (b21= STRING )+
					int cnt33=0;
					loop33:
					while (true) {
						int alt33=2;
						int LA33_0 = input.LA(1);
						if ( (LA33_0==STRING) ) {
							alt33=1;
						}

						switch (alt33) {
						case 1 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1063:32: b21= STRING
							{
							b21=(Token)match(input,STRING,FOLLOW_STRING_in_sAnnotationElement4197); 
							array.add(unEscapeString((b21!=null?b21.getText():null)));
							}
							break;

						default :
							if ( cnt33 >= 1 ) break loop33;
							EarlyExitException eee = new EarlyExitException(33, input);
							throw eee;
						}
						cnt33++;
					}

					 currentAnnotationVisitor.visit((a!=null?input.toString(a.start,a.stop):null),array); 
					}
					break;

			}

			 currentAnnotationVisitor=_t; 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "sAnnotationElement"



	// $ANTLR start "sSubannotation"
	// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1067:1: sSubannotation : '.annotation' ( sAnnotationElement )* '.end annotation' ;
	public final void sSubannotation() throws RecognitionException {
		try {
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1068:2: ( '.annotation' ( sAnnotationElement )* '.end annotation' )
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1068:4: '.annotation' ( sAnnotationElement )* '.end annotation'
			{
			match(input,92,FOLLOW_92_in_sSubannotation4221); 
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1069:7: ( sAnnotationElement )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( ((LA35_0 >= AND && LA35_0 <= ANNOTATION_VISIBLITY)||LA35_0==AT||LA35_0==DEFAULT||LA35_0==FROM||(LA35_0 >= HIGH && LA35_0 <= INNER)||(LA35_0 >= INVOKEDYNAMIC && LA35_0 <= LDC)||LA35_0==LOCALS||(LA35_0 >= LOOKUPSWITCH && LA35_0 <= METHOD_ANNOTATION_VISIBLITY)||LA35_0==MULTIANEWARRAY||(LA35_0 >= OP0 && LA35_0 <= OUTTER)||LA35_0==STACK||(LA35_0 >= TABLESWITCH && LA35_0 <= WLONG)||(LA35_0 >= WSHORT && LA35_0 <= XTYPE)) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1069:7: sAnnotationElement
					{
					pushFollow(FOLLOW_sAnnotationElement_in_sSubannotation4230);
					sAnnotationElement();
					state._fsp--;

					}
					break;

				default :
					break loop35;
				}
			}

			match(input,113,FOLLOW_113_in_sSubannotation4238); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "sSubannotation"



	// $ANTLR start "sAccList"
	// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1072:1: sAccList returns [int acc] : (a= ACC )* ;
	public final int sAccList() throws RecognitionException {
		int acc = 0;


		Token a=null;

		try {
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1072:26: ( (a= ACC )* )
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1072:28: (a= ACC )*
			{
			acc =0;
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1072:38: (a= ACC )*
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==ACC) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1072:40: a= ACC
					{
					a=(Token)match(input,ACC,FOLLOW_ACC_in_sAccList4255); 
					acc|=getAcc((a!=null?a.getText():null));
					}
					break;

				default :
					break loop36;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return acc;
	}
	// $ANTLR end "sAccList"



	// $ANTLR start "sMemberName"
	// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1073:1: sMemberName returns [String name] : (a= sId |b= STRING |c= DSTRING );
	public final String sMemberName() throws RecognitionException {
		String name = null;


		Token b=null;
		Token c=null;
		ParserRuleReturnScope a =null;

		try {
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1073:33: (a= sId |b= STRING |c= DSTRING )
			int alt37=3;
			switch ( input.LA(1) ) {
			case AND:
			case ANNOTATION_VISIBLITY:
			case AT:
			case DEFAULT:
			case FROM:
			case HIGH:
			case ID:
			case IIOP:
			case INNER:
			case INVOKEDYNAMIC:
			case INVOKEINTERFACE:
			case IOP:
			case JOP:
			case LDC:
			case LOCALS:
			case LOOKUPSWITCH:
			case METHOD_ANNOTATION_VISIBLITY:
			case MULTIANEWARRAY:
			case OP0:
			case OUTTER:
			case STACK:
			case TABLESWITCH:
			case TO:
			case UP_B:
			case UP_C:
			case UP_D:
			case UP_F:
			case UP_I:
			case UP_J:
			case UP_S:
			case UP_Z:
			case USING:
			case VOID_TYPE:
			case WBOOLEAN:
			case WBYTE:
			case WCHAR:
			case WDOUBLE:
			case WFLOAT:
			case WINTEGER:
			case WLONG:
			case WSHORT:
			case XFIELD:
			case XINVOKE:
			case XNEWARRAY:
			case XTYPE:
				{
				alt37=1;
				}
				break;
			case STRING:
				{
				alt37=2;
				}
				break;
			case DSTRING:
				{
				alt37=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				throw nvae;
			}
			switch (alt37) {
				case 1 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1073:35: a= sId
					{
					pushFollow(FOLLOW_sId_in_sMemberName4272);
					a=sId();
					state._fsp--;

					name =unEscape((a!=null?input.toString(a.start,a.stop):null));
					}
					break;
				case 2 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1073:70: b= STRING
					{
					b=(Token)match(input,STRING,FOLLOW_STRING_in_sMemberName4280); 
					name =unEscapeString((b!=null?b.getText():null));
					}
					break;
				case 3 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1073:113: c= DSTRING
					{
					c=(Token)match(input,DSTRING,FOLLOW_DSTRING_in_sMemberName4287); 
					name =unEscapeString((c!=null?c.getText():null));
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return name;
	}
	// $ANTLR end "sMemberName"



	// $ANTLR start "sField"
	// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1074:1: sField : '.field' i= sAccList n= sMemberName t= sClassDesc ( '=' (a= STRING |a1= INT |a2= LONG |a3= FLOAT |a4= DOUBLE |a5= sClassDesc ) )? (s= sSigAttr | sDeprecateAttr | sSynthetic | sVisibiltyAnnotation | sAnnotation )* ( '.end field' | '.end' '.field' )? ( '.field_attribute' sId STRING )* ;
	public final void sField() throws RecognitionException {
		Token a=null;
		Token a1=null;
		Token a2=null;
		Token a3=null;
		Token a4=null;
		int i =0;
		String n =null;
		ParserRuleReturnScope t =null;
		ParserRuleReturnScope a5 =null;
		String s =null;


		                    if(cn.fields==null){
		                        cn.fields=new ArrayList<>();
		                    }
		                    currentAv=fnv;
		                    fn=new FieldNode(0,null,null,null,null);
		                    cn.fields.add(fn);
		              
		try {
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1082:5: ( '.field' i= sAccList n= sMemberName t= sClassDesc ( '=' (a= STRING |a1= INT |a2= LONG |a3= FLOAT |a4= DOUBLE |a5= sClassDesc ) )? (s= sSigAttr | sDeprecateAttr | sSynthetic | sVisibiltyAnnotation | sAnnotation )* ( '.end field' | '.end' '.field' )? ( '.field_attribute' sId STRING )* )
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1082:7: '.field' i= sAccList n= sMemberName t= sClassDesc ( '=' (a= STRING |a1= INT |a2= LONG |a3= FLOAT |a4= DOUBLE |a5= sClassDesc ) )? (s= sSigAttr | sDeprecateAttr | sSynthetic | sVisibiltyAnnotation | sAnnotation )* ( '.end field' | '.end' '.field' )? ( '.field_attribute' sId STRING )*
			{
			match(input,118,FOLLOW_118_in_sField4305); 
			pushFollow(FOLLOW_sAccList_in_sField4309);
			i=sAccList();
			state._fsp--;

			pushFollow(FOLLOW_sMemberName_in_sField4313);
			n=sMemberName();
			state._fsp--;

			pushFollow(FOLLOW_sClassDesc_in_sField4317);
			t=sClassDesc();
			state._fsp--;

			 fn.access|=i;fn.name=n;fn.desc=unEscape((t!=null?input.toString(t.start,t.stop):null)); 
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1083:9: ( '=' (a= STRING |a1= INT |a2= LONG |a3= FLOAT |a4= DOUBLE |a5= sClassDesc ) )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==148) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1083:11: '=' (a= STRING |a1= INT |a2= LONG |a3= FLOAT |a4= DOUBLE |a5= sClassDesc )
					{
					match(input,148,FOLLOW_148_in_sField4331); 
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1083:15: (a= STRING |a1= INT |a2= LONG |a3= FLOAT |a4= DOUBLE |a5= sClassDesc )
					int alt38=6;
					switch ( input.LA(1) ) {
					case STRING:
						{
						alt38=1;
						}
						break;
					case INT:
						{
						alt38=2;
						}
						break;
					case LONG:
						{
						alt38=3;
						}
						break;
					case FLOAT:
						{
						alt38=4;
						}
						break;
					case DOUBLE:
						{
						alt38=5;
						}
						break;
					case ARRAY_B:
					case ARRAY_C:
					case ARRAY_D:
					case ARRAY_F:
					case ARRAY_I:
					case ARRAY_J:
					case ARRAY_S:
					case ARRAY_Z:
					case OBJECT_TYPE:
					case PARRAY_TYPE:
					case UP_B:
					case UP_C:
					case UP_D:
					case UP_F:
					case UP_I:
					case UP_J:
					case UP_S:
					case UP_Z:
						{
						alt38=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 38, 0, input);
						throw nvae;
					}
					switch (alt38) {
						case 1 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1083:16: a= STRING
							{
							a=(Token)match(input,STRING,FOLLOW_STRING_in_sField4336); 
							fn.value=parseValue(fn.desc,unEscapeString((a!=null?a.getText():null)));
							}
							break;
						case 2 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1084:16: a1= INT
							{
							a1=(Token)match(input,INT,FOLLOW_INT_in_sField4357); 
							fn.value=parseValue(fn.desc,parseInt((a1!=null?a1.getText():null)));
							}
							break;
						case 3 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1085:16: a2= LONG
							{
							a2=(Token)match(input,LONG,FOLLOW_LONG_in_sField4383); 
							fn.value=parseValue(fn.desc,parseLong((a2!=null?a2.getText():null)));
							}
							break;
						case 4 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1086:16: a3= FLOAT
							{
							a3=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_sField4408); 
							fn.value=parseValue(fn.desc,parseFloat((a3!=null?a3.getText():null)));
							}
							break;
						case 5 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1087:16: a4= DOUBLE
							{
							a4=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_sField4432); 
							fn.value=parseValue(fn.desc,parseDouble((a4!=null?a4.getText():null)));
							}
							break;
						case 6 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1088:16: a5= sClassDesc
							{
							pushFollow(FOLLOW_sClassDesc_in_sField4455);
							a5=sClassDesc();
							state._fsp--;

							fn.value=parseValue(fn.desc,Type.getType(unEscape((a5!=null?input.toString(a5.start,a5.stop):null))));
							}
							break;

					}

					}
					break;

			}

			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1091:13: (s= sSigAttr | sDeprecateAttr | sSynthetic | sVisibiltyAnnotation | sAnnotation )*
			loop40:
			while (true) {
				int alt40=6;
				switch ( input.LA(1) ) {
				case 137:
				case 138:
					{
					alt40=1;
					}
					break;
				case 108:
					{
					alt40=2;
					}
					break;
				case 142:
					{
					alt40=3;
					}
					break;
				case 134:
				case 135:
					{
					alt40=4;
					}
					break;
				case 92:
					{
					alt40=5;
					}
					break;
				}
				switch (alt40) {
				case 1 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1092:13: s= sSigAttr
					{
					pushFollow(FOLLOW_sSigAttr_in_sField4514);
					s=sSigAttr();
					state._fsp--;

					fn.signature=s;
					}
					break;
				case 2 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1093:14: sDeprecateAttr
					{
					pushFollow(FOLLOW_sDeprecateAttr_in_sField4530);
					sDeprecateAttr();
					state._fsp--;

					 fn.access|=ACC_DEPRECATED; 
					}
					break;
				case 3 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1094:14: sSynthetic
					{
					pushFollow(FOLLOW_sSynthetic_in_sField4546);
					sSynthetic();
					state._fsp--;

					cn.access|=ACC_SYNTHETIC;
					}
					break;
				case 4 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1095:14: sVisibiltyAnnotation
					{
					pushFollow(FOLLOW_sVisibiltyAnnotation_in_sField4563);
					sVisibiltyAnnotation();
					state._fsp--;

					}
					break;
				case 5 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1096:14: sAnnotation
					{
					pushFollow(FOLLOW_sAnnotation_in_sField4578);
					sAnnotation();
					state._fsp--;

					}
					break;

				default :
					break loop40;
				}
			}

			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1098:5: ( '.end field' | '.end' '.field' )?
			int alt41=3;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==114) ) {
				alt41=1;
			}
			else if ( (LA41_0==116) ) {
				alt41=2;
			}
			switch (alt41) {
				case 1 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1098:6: '.end field'
					{
					match(input,114,FOLLOW_114_in_sField4600); 
					}
					break;
				case 2 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1098:20: '.end' '.field'
					{
					match(input,116,FOLLOW_116_in_sField4603); 
					match(input,118,FOLLOW_118_in_sField4605); 
					}
					break;

			}

			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1099:2: ( '.field_attribute' sId STRING )*
			loop42:
			while (true) {
				int alt42=2;
				int LA42_0 = input.LA(1);
				if ( (LA42_0==119) ) {
					alt42=1;
				}

				switch (alt42) {
				case 1 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1099:3: '.field_attribute' sId STRING
					{
					match(input,119,FOLLOW_119_in_sField4611); 
					pushFollow(FOLLOW_sId_in_sField4613);
					sId();
					state._fsp--;

					match(input,STRING,FOLLOW_STRING_in_sField4615); 
					System.err.println("ignore .field_attribute");
					}
					break;

				default :
					break loop42;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "sField"



	// $ANTLR start "sMethod"
	// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1101:1: sMethod : '.method' i= sAccList n= sMemberName t= sMethodDesc (s= sSigAttr | sDeprecateAttr | sSynthetic | sVisibiltyAnnotation | sAnnotation | '.throws' at= sInternalNameOrDesc | '.annotation_default' (t= sAnnotationElementSoot )? '.end' '.annotation_default' | '.param' ( '.runtime_invisible_annotation' | '.runtime_visible_annotation' ) ( ( '.runtime_visible_annotation' | '.runtime_invisible_annotation' ) a1= STRING ( sAnnotationSoot )* '.end' '.annotation_attr' )* '.end' '.param' | code )* '.end method' ( '.method_attribute' sId STRING )* ;
	public final void sMethod() throws RecognitionException {
		Token a1=null;
		int i =0;
		String n =null;
		ParserRuleReturnScope t =null;
		String s =null;
		String at =null;


		    if(cn.methods==null){
		        cn.methods=new ArrayList<>();
		    }
		    currentAv=mnv;
		    mn=new MethodNode(ASM4);
		    cn.methods.add(mn);
		    labelMap.clear();
		    if(mn.exceptions==null){
		        mn.exceptions=new ArrayList<>();
		    }
		    if(mn.tryCatchBlocks==null){
		            mn.tryCatchBlocks=new ArrayList<>();
		        }

		try {
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1116:5: ( '.method' i= sAccList n= sMemberName t= sMethodDesc (s= sSigAttr | sDeprecateAttr | sSynthetic | sVisibiltyAnnotation | sAnnotation | '.throws' at= sInternalNameOrDesc | '.annotation_default' (t= sAnnotationElementSoot )? '.end' '.annotation_default' | '.param' ( '.runtime_invisible_annotation' | '.runtime_visible_annotation' ) ( ( '.runtime_visible_annotation' | '.runtime_invisible_annotation' ) a1= STRING ( sAnnotationSoot )* '.end' '.annotation_attr' )* '.end' '.param' | code )* '.end method' ( '.method_attribute' sId STRING )* )
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1116:7: '.method' i= sAccList n= sMemberName t= sMethodDesc (s= sSigAttr | sDeprecateAttr | sSynthetic | sVisibiltyAnnotation | sAnnotation | '.throws' at= sInternalNameOrDesc | '.annotation_default' (t= sAnnotationElementSoot )? '.end' '.annotation_default' | '.param' ( '.runtime_invisible_annotation' | '.runtime_visible_annotation' ) ( ( '.runtime_visible_annotation' | '.runtime_invisible_annotation' ) a1= STRING ( sAnnotationSoot )* '.end' '.annotation_attr' )* '.end' '.param' | code )* '.end method' ( '.method_attribute' sId STRING )*
			{
			match(input,130,FOLLOW_130_in_sMethod4636); 
			pushFollow(FOLLOW_sAccList_in_sMethod4640);
			i=sAccList();
			state._fsp--;

			pushFollow(FOLLOW_sMemberName_in_sMethod4644);
			n=sMemberName();
			state._fsp--;

			pushFollow(FOLLOW_sMethodDesc_in_sMethod4648);
			t=sMethodDesc();
			state._fsp--;

			mn.access|=i;mn.name=n;mn.desc=unEscape((t!=null?input.toString(t.start,t.stop):null));
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1117:13: (s= sSigAttr | sDeprecateAttr | sSynthetic | sVisibiltyAnnotation | sAnnotation | '.throws' at= sInternalNameOrDesc | '.annotation_default' (t= sAnnotationElementSoot )? '.end' '.annotation_default' | '.param' ( '.runtime_invisible_annotation' | '.runtime_visible_annotation' ) ( ( '.runtime_visible_annotation' | '.runtime_invisible_annotation' ) a1= STRING ( sAnnotationSoot )* '.end' '.annotation_attr' )* '.end' '.param' | code )*
			loop47:
			while (true) {
				int alt47=10;
				switch ( input.LA(1) ) {
				case 137:
				case 138:
					{
					alt47=1;
					}
					break;
				case 108:
					{
					alt47=2;
					}
					break;
				case 142:
					{
					alt47=3;
					}
					break;
				case 134:
				case 135:
					{
					alt47=4;
					}
					break;
				case 92:
					{
					alt47=5;
					}
					break;
				case 143:
					{
					alt47=6;
					}
					break;
				case 94:
					{
					alt47=7;
					}
					break;
				case 133:
					{
					alt47=8;
					}
					break;
				case ACC:
				case ANNOTATION_VISIBLITY:
				case ID:
				case IIOP:
				case INNER:
				case INVOKEDYNAMIC:
				case INVOKEINTERFACE:
				case IOP:
				case JOP:
				case LDC:
				case LOOKUPSWITCH:
				case METHOD_ANNOTATION_VISIBLITY:
				case MULTIANEWARRAY:
				case OP0:
				case OUTTER:
				case TABLESWITCH:
				case UP_B:
				case UP_C:
				case UP_D:
				case UP_F:
				case UP_I:
				case UP_J:
				case UP_S:
				case UP_Z:
				case XFIELD:
				case XINVOKE:
				case XNEWARRAY:
				case XTYPE:
				case 101:
				case 106:
				case 127:
				case 128:
				case 144:
					{
					alt47=9;
					}
					break;
				}
				switch (alt47) {
				case 1 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1117:14: s= sSigAttr
					{
					pushFollow(FOLLOW_sSigAttr_in_sMethod4667);
					s=sSigAttr();
					state._fsp--;

					mn.signature=s;
					}
					break;
				case 2 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1118:18: sDeprecateAttr
					{
					pushFollow(FOLLOW_sDeprecateAttr_in_sMethod4687);
					sDeprecateAttr();
					state._fsp--;

					 cn.access|=ACC_DEPRECATED; 
					}
					break;
				case 3 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1119:18: sSynthetic
					{
					pushFollow(FOLLOW_sSynthetic_in_sMethod4707);
					sSynthetic();
					state._fsp--;

					cn.access|=ACC_SYNTHETIC;
					}
					break;
				case 4 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1120:18: sVisibiltyAnnotation
					{
					pushFollow(FOLLOW_sVisibiltyAnnotation_in_sMethod4728);
					sVisibiltyAnnotation();
					state._fsp--;

					}
					break;
				case 5 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1121:18: sAnnotation
					{
					pushFollow(FOLLOW_sAnnotation_in_sMethod4747);
					sAnnotation();
					state._fsp--;

					}
					break;
				case 6 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1122:18: '.throws' at= sInternalNameOrDesc
					{
					match(input,143,FOLLOW_143_in_sMethod4766); 
					pushFollow(FOLLOW_sInternalNameOrDesc_in_sMethod4770);
					at=sInternalNameOrDesc();
					state._fsp--;

					  mn.exceptions.add(Type.getType(at).getInternalName()); 
					}
					break;
				case 7 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1123:18: '.annotation_default' (t= sAnnotationElementSoot )? '.end' '.annotation_default'
					{
					match(input,94,FOLLOW_94_in_sMethod4791); 
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1123:40: (t= sAnnotationElementSoot )?
					int alt43=2;
					int LA43_0 = input.LA(1);
					if ( (LA43_0==110) ) {
						alt43=1;
					}
					switch (alt43) {
						case 1 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1123:41: t= sAnnotationElementSoot
							{
							pushFollow(FOLLOW_sAnnotationElementSoot_in_sMethod4796);
							t=sAnnotationElementSoot();
							state._fsp--;

							currentAnnotationVisitor=(AnnotationNode)mn.visitAnnotationDefault();
							}
							break;

					}

					match(input,116,FOLLOW_116_in_sMethod4803); 
					match(input,94,FOLLOW_94_in_sMethod4805); 
					}
					break;
				case 8 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1124:18: '.param' ( '.runtime_invisible_annotation' | '.runtime_visible_annotation' ) ( ( '.runtime_visible_annotation' | '.runtime_invisible_annotation' ) a1= STRING ( sAnnotationSoot )* '.end' '.annotation_attr' )* '.end' '.param'
					{
					match(input,133,FOLLOW_133_in_sMethod4824); 
					if ( (input.LA(1) >= 134 && input.LA(1) <= 135) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					int index=0;
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1125:21: ( ( '.runtime_visible_annotation' | '.runtime_invisible_annotation' ) a1= STRING ( sAnnotationSoot )* '.end' '.annotation_attr' )*
					loop46:
					while (true) {
						int alt46=2;
						int LA46_0 = input.LA(1);
						if ( ((LA46_0 >= 134 && LA46_0 <= 135)) ) {
							alt46=1;
						}

						switch (alt46) {
						case 1 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1125:22: ( '.runtime_visible_annotation' | '.runtime_invisible_annotation' ) a1= STRING ( sAnnotationSoot )* '.end' '.annotation_attr'
							{
							boolean visible=false;
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1125:47: ( '.runtime_visible_annotation' | '.runtime_invisible_annotation' )
							int alt44=2;
							int LA44_0 = input.LA(1);
							if ( (LA44_0==135) ) {
								alt44=1;
							}
							else if ( (LA44_0==134) ) {
								alt44=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 44, 0, input);
								throw nvae;
							}

							switch (alt44) {
								case 1 :
									// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1125:48: '.runtime_visible_annotation'
									{
									match(input,135,FOLLOW_135_in_sMethod4858); 
									visible=true;
									}
									break;
								case 2 :
									// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1125:94: '.runtime_invisible_annotation'
									{
									match(input,134,FOLLOW_134_in_sMethod4862); 
									visible=false;
									}
									break;

							}

							a1=(Token)match(input,STRING,FOLLOW_STRING_in_sMethod4868); 
							 currentAnnotationVisitor= currentAv.visitParameterAnnotation(index,unEscapeString((a1!=null?a1.getText():null)),visible); 
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1127:25: ( sAnnotationSoot )*
							loop45:
							while (true) {
								int alt45=2;
								int LA45_0 = input.LA(1);
								if ( (LA45_0==92) ) {
									alt45=1;
								}

								switch (alt45) {
								case 1 :
									// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1127:25: sAnnotationSoot
									{
									pushFollow(FOLLOW_sAnnotationSoot_in_sMethod4916);
									sAnnotationSoot();
									state._fsp--;

									}
									break;

								default :
									break loop45;
								}
							}

							match(input,116,FOLLOW_116_in_sMethod4942); 
							match(input,93,FOLLOW_93_in_sMethod4944); 
							index++;
							}
							break;

						default :
							break loop46;
						}
					}

					match(input,116,FOLLOW_116_in_sMethod4988); 
					match(input,133,FOLLOW_133_in_sMethod4990); 
					}
					break;
				case 9 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1131:19: code
					{
					pushFollow(FOLLOW_code_in_sMethod5010);
					code();
					state._fsp--;

					}
					break;

				default :
					break loop47;
				}
			}

			match(input,115,FOLLOW_115_in_sMethod5035); 
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1134:2: ( '.method_attribute' sId STRING )*
			loop48:
			while (true) {
				int alt48=2;
				int LA48_0 = input.LA(1);
				if ( (LA48_0==131) ) {
					alt48=1;
				}

				switch (alt48) {
				case 1 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1134:3: '.method_attribute' sId STRING
					{
					match(input,131,FOLLOW_131_in_sMethod5039); 
					pushFollow(FOLLOW_sId_in_sMethod5041);
					sId();
					state._fsp--;

					match(input,STRING,FOLLOW_STRING_in_sMethod5043); 
					System.err.println("ignore method_attribute");
					}
					break;

				default :
					break loop48;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "sMethod"


	public static class sLabel_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "sLabel"
	// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1137:1: sLabel : ( ACC | ID | UP_Z | UP_B | UP_S | UP_C | UP_I | UP_F | UP_D | UP_J | ANNOTATION_VISIBLITY | METHOD_ANNOTATION_VISIBLITY | INNER | OUTTER );
	public final JasminParser.sLabel_return sLabel() throws RecognitionException {
		JasminParser.sLabel_return retval = new JasminParser.sLabel_return();
		retval.start = input.LT(1);

		try {
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1137:8: ( ACC | ID | UP_Z | UP_B | UP_S | UP_C | UP_I | UP_F | UP_D | UP_J | ANNOTATION_VISIBLITY | METHOD_ANNOTATION_VISIBLITY | INNER | OUTTER )
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:
			{
			if ( input.LA(1)==ACC||input.LA(1)==ANNOTATION_VISIBLITY||input.LA(1)==ID||input.LA(1)==INNER||input.LA(1)==METHOD_ANNOTATION_VISIBLITY||input.LA(1)==OUTTER||(input.LA(1) >= UP_B && input.LA(1) <= UP_Z) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sLabel"



	// $ANTLR start "code"
	// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1139:1: code : (a= OP0 |a= IOP b= INT |a= IIOP b= INT c= INT |a= LDC (c= INT |c= LONG |c= FLOAT |c= DOUBLE |c= STRING |eTV= sInternalNameOrDescNoString ) |a= XFIELD efo= sFieldObject |a= XNEWARRAY ( WBOOLEAN | WBYTE | WSHORT | WCHAR | WINTEGER | WLONG | WFLOAT | WDOUBLE ) |a= XTYPE ffTV= sInternalNameOrDescACC |a= JOP z= sLabel |a= XINVOKE e1= sMethodObject |a= INVOKEINTERFACE e2= sMethodObject ( INT )? |a= INVOKEDYNAMIC e3= sMethodObject sId sMethodDesc '(' sInvokeDynamicE ( ',' sInvokeDynamicE )* ')' |a= MULTIANEWARRAY ff= sClassDesc c= INT |z= sLabel ':' | '.catch' e= sId 'from' z1= sLabel 'to' z2= sLabel 'using' z3= sLabel | '.limit' 'stack' ( '?' |i1= INT ) | '.limit' 'locals' ( '?' |i1= INT ) | '.code_attribute' sId STRING | '.line' b= INT | '.var' var= INT 'is' mber= sMemberName desc= sClassDesc ( 'signature' sig= STRING )? 'from' z1= sLabel 'to' z2= sLabel | sSwitch );
	public final void code() throws RecognitionException {
		Token a=null;
		Token b=null;
		Token c=null;
		Token i1=null;
		Token var=null;
		Token sig=null;
		String eTV =null;
		ParserRuleReturnScope efo =null;
		String ffTV =null;
		ParserRuleReturnScope z =null;
		ParserRuleReturnScope e1 =null;
		ParserRuleReturnScope e2 =null;
		ParserRuleReturnScope e3 =null;
		ParserRuleReturnScope ff =null;
		ParserRuleReturnScope e =null;
		ParserRuleReturnScope z1 =null;
		ParserRuleReturnScope z2 =null;
		ParserRuleReturnScope z3 =null;
		String mber =null;
		ParserRuleReturnScope desc =null;

		try {
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1140:5: (a= OP0 |a= IOP b= INT |a= IIOP b= INT c= INT |a= LDC (c= INT |c= LONG |c= FLOAT |c= DOUBLE |c= STRING |eTV= sInternalNameOrDescNoString ) |a= XFIELD efo= sFieldObject |a= XNEWARRAY ( WBOOLEAN | WBYTE | WSHORT | WCHAR | WINTEGER | WLONG | WFLOAT | WDOUBLE ) |a= XTYPE ffTV= sInternalNameOrDescACC |a= JOP z= sLabel |a= XINVOKE e1= sMethodObject |a= INVOKEINTERFACE e2= sMethodObject ( INT )? |a= INVOKEDYNAMIC e3= sMethodObject sId sMethodDesc '(' sInvokeDynamicE ( ',' sInvokeDynamicE )* ')' |a= MULTIANEWARRAY ff= sClassDesc c= INT |z= sLabel ':' | '.catch' e= sId 'from' z1= sLabel 'to' z2= sLabel 'using' z3= sLabel | '.limit' 'stack' ( '?' |i1= INT ) | '.limit' 'locals' ( '?' |i1= INT ) | '.code_attribute' sId STRING | '.line' b= INT | '.var' var= INT 'is' mber= sMemberName desc= sClassDesc ( 'signature' sig= STRING )? 'from' z1= sLabel 'to' z2= sLabel | sSwitch )
			int alt56=20;
			switch ( input.LA(1) ) {
			case OP0:
				{
				alt56=1;
				}
				break;
			case IOP:
				{
				alt56=2;
				}
				break;
			case IIOP:
				{
				alt56=3;
				}
				break;
			case LDC:
				{
				alt56=4;
				}
				break;
			case XFIELD:
				{
				alt56=5;
				}
				break;
			case XNEWARRAY:
				{
				alt56=6;
				}
				break;
			case XTYPE:
				{
				alt56=7;
				}
				break;
			case JOP:
				{
				alt56=8;
				}
				break;
			case XINVOKE:
				{
				alt56=9;
				}
				break;
			case INVOKEINTERFACE:
				{
				alt56=10;
				}
				break;
			case INVOKEDYNAMIC:
				{
				alt56=11;
				}
				break;
			case MULTIANEWARRAY:
				{
				alt56=12;
				}
				break;
			case ACC:
			case ANNOTATION_VISIBLITY:
			case ID:
			case INNER:
			case METHOD_ANNOTATION_VISIBLITY:
			case OUTTER:
			case UP_B:
			case UP_C:
			case UP_D:
			case UP_F:
			case UP_I:
			case UP_J:
			case UP_S:
			case UP_Z:
				{
				alt56=13;
				}
				break;
			case 101:
				{
				alt56=14;
				}
				break;
			case 127:
				{
				int LA56_15 = input.LA(2);
				if ( (LA56_15==STACK) ) {
					alt56=15;
				}
				else if ( (LA56_15==LOCALS) ) {
					alt56=16;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 56, 15, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 106:
				{
				alt56=17;
				}
				break;
			case 128:
				{
				alt56=18;
				}
				break;
			case 144:
				{
				alt56=19;
				}
				break;
			case LOOKUPSWITCH:
			case TABLESWITCH:
				{
				alt56=20;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 56, 0, input);
				throw nvae;
			}
			switch (alt56) {
				case 1 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1140:7: a= OP0
					{
					a=(Token)match(input,OP0,FOLLOW_OP0_in_code5098); 
					 line((a!=null?a.getLine():0)); visitOP0(getOp((a!=null?a.getText():null))); 
					}
					break;
				case 2 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1141:4: a= IOP b= INT
					{
					a=(Token)match(input,IOP,FOLLOW_IOP_in_code5107); 
					b=(Token)match(input,INT,FOLLOW_INT_in_code5111); 
					 line((a!=null?a.getLine():0)); visitIOP(getOp((a!=null?a.getText():null)),parseInt((b!=null?b.getText():null))); 
					}
					break;
				case 3 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1142:4: a= IIOP b= INT c= INT
					{
					a=(Token)match(input,IIOP,FOLLOW_IIOP_in_code5120); 
					b=(Token)match(input,INT,FOLLOW_INT_in_code5124); 
					c=(Token)match(input,INT,FOLLOW_INT_in_code5128); 
					 line((a!=null?a.getLine():0)); visitIIOP(getOp((a!=null?a.getText():null)),parseInt((b!=null?b.getText():null)),parseInt((c!=null?c.getText():null))); 
					}
					break;
				case 4 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1143:5: a= LDC (c= INT |c= LONG |c= FLOAT |c= DOUBLE |c= STRING |eTV= sInternalNameOrDescNoString )
					{
					a=(Token)match(input,LDC,FOLLOW_LDC_in_code5140); 
					line((a!=null?a.getLine():0));  
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1143:31: (c= INT |c= LONG |c= FLOAT |c= DOUBLE |c= STRING |eTV= sInternalNameOrDescNoString )
					int alt49=6;
					switch ( input.LA(1) ) {
					case INT:
						{
						alt49=1;
						}
						break;
					case LONG:
						{
						alt49=2;
						}
						break;
					case FLOAT:
						{
						alt49=3;
						}
						break;
					case DOUBLE:
						{
						alt49=4;
						}
						break;
					case STRING:
						{
						alt49=5;
						}
						break;
					case ACC:
					case AND:
					case ANNOTATION_VISIBLITY:
					case ARRAY_B:
					case ARRAY_C:
					case ARRAY_D:
					case ARRAY_F:
					case ARRAY_I:
					case ARRAY_J:
					case ARRAY_S:
					case ARRAY_Z:
					case AT:
					case DEFAULT:
					case FROM:
					case HIGH:
					case ID:
					case IIOP:
					case INNER:
					case INVOKEDYNAMIC:
					case INVOKEINTERFACE:
					case IOP:
					case JOP:
					case LDC:
					case LOCALS:
					case LOOKUPSWITCH:
					case METHOD_ANNOTATION_VISIBLITY:
					case MULTIANEWARRAY:
					case OBJECT_TYPE:
					case OP0:
					case OUTTER:
					case PARRAY_TYPE:
					case STACK:
					case TABLESWITCH:
					case TO:
					case UP_B:
					case UP_C:
					case UP_D:
					case UP_F:
					case UP_I:
					case UP_J:
					case UP_S:
					case UP_Z:
					case USING:
					case VOID_TYPE:
					case WBOOLEAN:
					case WBYTE:
					case WCHAR:
					case WDOUBLE:
					case WFLOAT:
					case WINTEGER:
					case WLONG:
					case WSHORT:
					case XFIELD:
					case XINVOKE:
					case XNEWARRAY:
					case XTYPE:
						{
						alt49=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 49, 0, input);
						throw nvae;
					}
					switch (alt49) {
						case 1 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1143:33: c= INT
							{
							c=(Token)match(input,INT,FOLLOW_INT_in_code5149); 
							mn.visitLdcInsn(parseInt((c!=null?c.getText():null)));
							}
							break;
						case 2 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1144:34: c= LONG
							{
							c=(Token)match(input,LONG,FOLLOW_LONG_in_code5195); 
							mn.visitLdcInsn(parseLong((c!=null?c.getText():null)));
							}
							break;
						case 3 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1145:34: c= FLOAT
							{
							c=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_code5240); 
							mn.visitLdcInsn(parseFloat((c!=null?c.getText():null)));
							}
							break;
						case 4 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1146:34: c= DOUBLE
							{
							c=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_code5284); 
							mn.visitLdcInsn(parseDouble((c!=null?c.getText():null)));
							}
							break;
						case 5 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1147:34: c= STRING
							{
							c=(Token)match(input,STRING,FOLLOW_STRING_in_code5327); 
							mn.visitLdcInsn(unEscapeString((c!=null?c.getText():null)));
							}
							break;
						case 6 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1148:34: eTV= sInternalNameOrDescNoString
							{
							pushFollow(FOLLOW_sInternalNameOrDescNoString_in_code5370);
							eTV=sInternalNameOrDescNoString();
							state._fsp--;

							mn.visitLdcInsn(Type.getType(eTV));
							}
							break;

					}

					}
					break;
				case 5 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1150:4: a= XFIELD efo= sFieldObject
					{
					a=(Token)match(input,XFIELD,FOLLOW_XFIELD_in_code5412); 
					pushFollow(FOLLOW_sFieldObject_in_code5416);
					efo=sFieldObject();
					state._fsp--;

					  line((a!=null?a.getLine():0));  mn.visitFieldInsn(getOp((a!=null?a.getText():null)),(efo!=null?((JasminParser.sFieldObject_return)efo).ownerInternalName:null),(efo!=null?((JasminParser.sFieldObject_return)efo).memberName:null),(efo!=null?((JasminParser.sFieldObject_return)efo).type:null));   
					}
					break;
				case 6 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1151:6: a= XNEWARRAY ( WBOOLEAN | WBYTE | WSHORT | WCHAR | WINTEGER | WLONG | WFLOAT | WDOUBLE )
					{
					a=(Token)match(input,XNEWARRAY,FOLLOW_XNEWARRAY_in_code5427); 
					line((a!=null?a.getLine():0)); 
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1151:37: ( WBOOLEAN | WBYTE | WSHORT | WCHAR | WINTEGER | WLONG | WFLOAT | WDOUBLE )
					int alt50=8;
					switch ( input.LA(1) ) {
					case WBOOLEAN:
						{
						alt50=1;
						}
						break;
					case WBYTE:
						{
						alt50=2;
						}
						break;
					case WSHORT:
						{
						alt50=3;
						}
						break;
					case WCHAR:
						{
						alt50=4;
						}
						break;
					case WINTEGER:
						{
						alt50=5;
						}
						break;
					case WLONG:
						{
						alt50=6;
						}
						break;
					case WFLOAT:
						{
						alt50=7;
						}
						break;
					case WDOUBLE:
						{
						alt50=8;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 50, 0, input);
						throw nvae;
					}
					switch (alt50) {
						case 1 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1152:17: WBOOLEAN
							{
							match(input,WBOOLEAN,FOLLOW_WBOOLEAN_in_code5450); 
							mn.visitIntInsn(NEWARRAY,T_BOOLEAN);
							}
							break;
						case 2 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1153:18: WBYTE
							{
							match(input,WBYTE,FOLLOW_WBYTE_in_code5470); 
							mn.visitIntInsn(NEWARRAY,T_BYTE);
							}
							break;
						case 3 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1154:18: WSHORT
							{
							match(input,WSHORT,FOLLOW_WSHORT_in_code5490); 
							mn.visitIntInsn(NEWARRAY,T_SHORT);
							}
							break;
						case 4 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1155:18: WCHAR
							{
							match(input,WCHAR,FOLLOW_WCHAR_in_code5510); 
							mn.visitIntInsn(NEWARRAY,T_CHAR);
							}
							break;
						case 5 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1156:18: WINTEGER
							{
							match(input,WINTEGER,FOLLOW_WINTEGER_in_code5530); 
							mn.visitIntInsn(NEWARRAY,T_INT);
							}
							break;
						case 6 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1157:18: WLONG
							{
							match(input,WLONG,FOLLOW_WLONG_in_code5550); 
							mn.visitIntInsn(NEWARRAY,T_LONG);
							}
							break;
						case 7 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1158:18: WFLOAT
							{
							match(input,WFLOAT,FOLLOW_WFLOAT_in_code5570); 
							mn.visitIntInsn(NEWARRAY,T_FLOAT);
							}
							break;
						case 8 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1159:18: WDOUBLE
							{
							match(input,WDOUBLE,FOLLOW_WDOUBLE_in_code5590); 
							mn.visitIntInsn(NEWARRAY,T_DOUBLE);
							}
							break;

					}

					}
					break;
				case 7 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1160:4: a= XTYPE ffTV= sInternalNameOrDescACC
					{
					a=(Token)match(input,XTYPE,FOLLOW_XTYPE_in_code5599); 
					pushFollow(FOLLOW_sInternalNameOrDescACC_in_code5603);
					ffTV=sInternalNameOrDescACC();
					state._fsp--;


						                       line((a!=null?a.getLine():0));
						                          mn.visitTypeInsn(getOp((a!=null?a.getText():null)),Type.getType(ffTV).getInternalName());
						            
					}
					break;
				case 8 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1164:4: a= JOP z= sLabel
					{
					a=(Token)match(input,JOP,FOLLOW_JOP_in_code5612); 
					pushFollow(FOLLOW_sLabel_in_code5616);
					z=sLabel();
					state._fsp--;

					 line((a!=null?a.getLine():0)); visitJOP(getOp((a!=null?a.getText():null)),getLabel((z!=null?input.toString(z.start,z.stop):null))); 
					}
					break;
				case 9 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1165:4: a= XINVOKE e1= sMethodObject
					{
					a=(Token)match(input,XINVOKE,FOLLOW_XINVOKE_in_code5626); 
					pushFollow(FOLLOW_sMethodObject_in_code5630);
					e1=sMethodObject();
					state._fsp--;

					line((a!=null?a.getLine():0));
						                    mn.visitMethodInsn(getOp((a!=null?a.getText():null)),(e1!=null?((JasminParser.sMethodObject_return)e1).ownerInternalName:null),(e1!=null?((JasminParser.sMethodObject_return)e1).memberName:null),(e1!=null?((JasminParser.sMethodObject_return)e1).desc:null));
						                  
					}
					break;
				case 10 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1168:4: a= INVOKEINTERFACE e2= sMethodObject ( INT )?
					{
					a=(Token)match(input,INVOKEINTERFACE,FOLLOW_INVOKEINTERFACE_in_code5641); 
					pushFollow(FOLLOW_sMethodObject_in_code5645);
					e2=sMethodObject();
					state._fsp--;

					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1168:39: ( INT )?
					int alt51=2;
					int LA51_0 = input.LA(1);
					if ( (LA51_0==INT) ) {
						alt51=1;
					}
					switch (alt51) {
						case 1 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1168:39: INT
							{
							match(input,INT,FOLLOW_INT_in_code5647); 
							}
							break;

					}

					line((a!=null?a.getLine():0));
						                    mn.visitMethodInsn(getOp((a!=null?a.getText():null)),(e2!=null?((JasminParser.sMethodObject_return)e2).ownerInternalName:null),(e2!=null?((JasminParser.sMethodObject_return)e2).memberName:null),(e2!=null?((JasminParser.sMethodObject_return)e2).desc:null));
						                  
					}
					break;
				case 11 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1171:4: a= INVOKEDYNAMIC e3= sMethodObject sId sMethodDesc '(' sInvokeDynamicE ( ',' sInvokeDynamicE )* ')'
					{
					a=(Token)match(input,INVOKEDYNAMIC,FOLLOW_INVOKEDYNAMIC_in_code5658); 
					pushFollow(FOLLOW_sMethodObject_in_code5662);
					e3=sMethodObject();
					state._fsp--;

					pushFollow(FOLLOW_sId_in_code5664);
					sId();
					state._fsp--;

					pushFollow(FOLLOW_sMethodDesc_in_code5666);
					sMethodDesc();
					state._fsp--;

					match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_code5668); 
					pushFollow(FOLLOW_sInvokeDynamicE_in_code5670);
					sInvokeDynamicE();
					state._fsp--;

					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1171:73: ( ',' sInvokeDynamicE )*
					loop52:
					while (true) {
						int alt52=2;
						int LA52_0 = input.LA(1);
						if ( (LA52_0==88) ) {
							alt52=1;
						}

						switch (alt52) {
						case 1 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1171:74: ',' sInvokeDynamicE
							{
							match(input,88,FOLLOW_88_in_code5673); 
							pushFollow(FOLLOW_sInvokeDynamicE_in_code5675);
							sInvokeDynamicE();
							state._fsp--;

							}
							break;

						default :
							break loop52;
						}
					}

					match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_code5679); 
					line((a!=null?a.getLine():0)); if(1==1) throw new RuntimeException("not support Yet!");
					}
					break;
				case 12 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1172:4: a= MULTIANEWARRAY ff= sClassDesc c= INT
					{
					a=(Token)match(input,MULTIANEWARRAY,FOLLOW_MULTIANEWARRAY_in_code5689); 
					pushFollow(FOLLOW_sClassDesc_in_code5693);
					ff=sClassDesc();
					state._fsp--;

					c=(Token)match(input,INT,FOLLOW_INT_in_code5697); 
					line((a!=null?a.getLine():0)); mn.visitMultiANewArrayInsn(unEscape((ff!=null?input.toString(ff.start,ff.stop):null)),parseInt((c!=null?c.getText():null))); 
					}
					break;
				case 13 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1173:6: z= sLabel ':'
					{
					pushFollow(FOLLOW_sLabel_in_code5710);
					z=sLabel();
					state._fsp--;

					match(input,146,FOLLOW_146_in_code5712); 
					 Label label=getLabel((z!=null?input.toString(z.start,z.stop):null)); mn.visitLabel(label); if(rebuildLine) {mn.visitLineNumber((z!=null?(z.start):null).getLine(),label);}
						 
					}
					break;
				case 14 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1175:4: '.catch' e= sId 'from' z1= sLabel 'to' z2= sLabel 'using' z3= sLabel
					{
					match(input,101,FOLLOW_101_in_code5719); 
					pushFollow(FOLLOW_sId_in_code5723);
					e=sId();
					state._fsp--;

					match(input,FROM,FOLLOW_FROM_in_code5725); 
					pushFollow(FOLLOW_sLabel_in_code5729);
					z1=sLabel();
					state._fsp--;

					match(input,TO,FOLLOW_TO_in_code5731); 
					pushFollow(FOLLOW_sLabel_in_code5735);
					z2=sLabel();
					state._fsp--;

					match(input,USING,FOLLOW_USING_in_code5737); 
					pushFollow(FOLLOW_sLabel_in_code5741);
					z3=sLabel();
					state._fsp--;

					 String type="all".equals((e!=null?input.toString(e.start,e.stop):null))?null:unEscape((e!=null?input.toString(e.start,e.stop):null)); mn.visitTryCatchBlock(getLabel((z1!=null?input.toString(z1.start,z1.stop):null)),getLabel((z2!=null?input.toString(z2.start,z2.stop):null)),getLabel((z3!=null?input.toString(z3.start,z3.stop):null)),type); 
					}
					break;
				case 15 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1176:4: '.limit' 'stack' ( '?' |i1= INT )
					{
					match(input,127,FOLLOW_127_in_code5748); 
					match(input,STACK,FOLLOW_STACK_in_code5750); 
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1176:21: ( '?' |i1= INT )
					int alt53=2;
					int LA53_0 = input.LA(1);
					if ( (LA53_0==149) ) {
						alt53=1;
					}
					else if ( (LA53_0==INT) ) {
						alt53=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 53, 0, input);
						throw nvae;
					}

					switch (alt53) {
						case 1 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1176:22: '?'
							{
							match(input,149,FOLLOW_149_in_code5753); 
							 mn.maxStack=-1; 
							}
							break;
						case 2 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1176:48: i1= INT
							{
							i1=(Token)match(input,INT,FOLLOW_INT_in_code5761); 
							 mn.maxStack=parseInt((i1!=null?i1.getText():null)); 
							}
							break;

					}

					}
					break;
				case 16 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1177:4: '.limit' 'locals' ( '?' |i1= INT )
					{
					match(input,127,FOLLOW_127_in_code5769); 
					match(input,LOCALS,FOLLOW_LOCALS_in_code5771); 
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1177:22: ( '?' |i1= INT )
					int alt54=2;
					int LA54_0 = input.LA(1);
					if ( (LA54_0==149) ) {
						alt54=1;
					}
					else if ( (LA54_0==INT) ) {
						alt54=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 54, 0, input);
						throw nvae;
					}

					switch (alt54) {
						case 1 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1177:23: '?'
							{
							match(input,149,FOLLOW_149_in_code5774); 
							mn.maxLocals=-1;
							}
							break;
						case 2 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1177:47: i1= INT
							{
							i1=(Token)match(input,INT,FOLLOW_INT_in_code5781); 
							 mn.maxLocals=parseInt((i1!=null?i1.getText():null));
							}
							break;

					}

					}
					break;
				case 17 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1178:4: '.code_attribute' sId STRING
					{
					match(input,106,FOLLOW_106_in_code5789); 
					pushFollow(FOLLOW_sId_in_code5791);
					sId();
					state._fsp--;

					match(input,STRING,FOLLOW_STRING_in_code5793); 
					 System.err.println("ignore .code_attribute"); 
					}
					break;
				case 18 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1179:4: '.line' b= INT
					{
					match(input,128,FOLLOW_128_in_code5802); 
					b=(Token)match(input,INT,FOLLOW_INT_in_code5806); 
					 if(!rebuildLine) { Label label=new Label(); mn.visitLabel(label); mn.visitLineNumber(parseInt((b!=null?b.getText():null)),label); } 
					}
					break;
				case 19 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1180:6: '.var' var= INT 'is' mber= sMemberName desc= sClassDesc ( 'signature' sig= STRING )? 'from' z1= sLabel 'to' z2= sLabel
					{
					match(input,144,FOLLOW_144_in_code5816); 
					var=(Token)match(input,INT,FOLLOW_INT_in_code5820); 
					match(input,150,FOLLOW_150_in_code5822); 
					pushFollow(FOLLOW_sMemberName_in_code5826);
					mber=sMemberName();
					state._fsp--;

					pushFollow(FOLLOW_sClassDesc_in_code5830);
					desc=sClassDesc();
					state._fsp--;

					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1180:59: ( 'signature' sig= STRING )?
					int alt55=2;
					int LA55_0 = input.LA(1);
					if ( (LA55_0==151) ) {
						alt55=1;
					}
					switch (alt55) {
						case 1 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1180:60: 'signature' sig= STRING
							{
							match(input,151,FOLLOW_151_in_code5833); 
							sig=(Token)match(input,STRING,FOLLOW_STRING_in_code5837); 
							}
							break;

					}

					match(input,FROM,FOLLOW_FROM_in_code5841); 
					pushFollow(FOLLOW_sLabel_in_code5845);
					z1=sLabel();
					state._fsp--;

					match(input,TO,FOLLOW_TO_in_code5847); 
					pushFollow(FOLLOW_sLabel_in_code5851);
					z2=sLabel();
					state._fsp--;

					 mn.visitLocalVariable(mber,unEscape((desc!=null?input.toString(desc.start,desc.stop):null)),unEscapeString((sig!=null?sig.getText():null)),getLabel((z1!=null?input.toString(z1.start,z1.stop):null)),getLabel((z2!=null?input.toString(z2.start,z2.stop):null)),parseInt((var!=null?var.getText():null))); 
					}
					break;
				case 20 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1181:9: sSwitch
					{
					pushFollow(FOLLOW_sSwitch_in_code5864);
					sSwitch();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "code"



	// $ANTLR start "sInvokeDynamicE"
	// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1183:1: sInvokeDynamicE : METHOD_DESC_WITHOUT_RET ( INT | LONG | FLOAT | DOUBLE | STRING ) ;
	public final void sInvokeDynamicE() throws RecognitionException {
		try {
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1184:2: ( METHOD_DESC_WITHOUT_RET ( INT | LONG | FLOAT | DOUBLE | STRING ) )
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1184:4: METHOD_DESC_WITHOUT_RET ( INT | LONG | FLOAT | DOUBLE | STRING )
			{
			match(input,METHOD_DESC_WITHOUT_RET,FOLLOW_METHOD_DESC_WITHOUT_RET_in_sInvokeDynamicE5874); 
			if ( input.LA(1)==DOUBLE||input.LA(1)==FLOAT||input.LA(1)==INT||input.LA(1)==LONG||input.LA(1)==STRING ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "sInvokeDynamicE"


	public static class sMethodDesc_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "sMethodDesc"
	// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1186:1: sMethodDesc : METHOD_DESC_WITHOUT_RET ( sClassDesc | VOID_TYPE ) ;
	public final JasminParser.sMethodDesc_return sMethodDesc() throws RecognitionException {
		JasminParser.sMethodDesc_return retval = new JasminParser.sMethodDesc_return();
		retval.start = input.LT(1);

		try {
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1187:2: ( METHOD_DESC_WITHOUT_RET ( sClassDesc | VOID_TYPE ) )
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1187:4: METHOD_DESC_WITHOUT_RET ( sClassDesc | VOID_TYPE )
			{
			match(input,METHOD_DESC_WITHOUT_RET,FOLLOW_METHOD_DESC_WITHOUT_RET_in_sMethodDesc5896); 
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1187:28: ( sClassDesc | VOID_TYPE )
			int alt57=2;
			int LA57_0 = input.LA(1);
			if ( ((LA57_0 >= ARRAY_B && LA57_0 <= ARRAY_J)||(LA57_0 >= ARRAY_S && LA57_0 <= ARRAY_Z)||LA57_0==OBJECT_TYPE||LA57_0==PARRAY_TYPE||(LA57_0 >= UP_B && LA57_0 <= UP_Z)) ) {
				alt57=1;
			}
			else if ( (LA57_0==VOID_TYPE) ) {
				alt57=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 57, 0, input);
				throw nvae;
			}

			switch (alt57) {
				case 1 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1187:29: sClassDesc
					{
					pushFollow(FOLLOW_sClassDesc_in_sMethodDesc5899);
					sClassDesc();
					state._fsp--;

					}
					break;
				case 2 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1187:40: VOID_TYPE
					{
					match(input,VOID_TYPE,FOLLOW_VOID_TYPE_in_sMethodDesc5901); 
					}
					break;

			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sMethodDesc"



	// $ANTLR start "sSwitch"
	// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1189:1: sSwitch : (a= LOOKUPSWITCH (c= INT ':' z= sLabel )* ( DEFAULT ':' z= sLabel ) |a= TABLESWITCH c= INT ';' 'high' '=' d= INT (z= sLabel )* ( DEFAULT ':' z= sLabel ) |a= TABLESWITCH c= INT (z= sLabel )* ( DEFAULT ':' z= sLabel ) );
	public final void sSwitch() throws RecognitionException {
		Token a=null;
		Token c=null;
		Token d=null;
		ParserRuleReturnScope z =null;

		List<Integer> keys=null;List<Label> labels=null;Label defaultLabel=null;
		try {
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1190:2: (a= LOOKUPSWITCH (c= INT ':' z= sLabel )* ( DEFAULT ':' z= sLabel ) |a= TABLESWITCH c= INT ';' 'high' '=' d= INT (z= sLabel )* ( DEFAULT ':' z= sLabel ) |a= TABLESWITCH c= INT (z= sLabel )* ( DEFAULT ':' z= sLabel ) )
			int alt61=3;
			int LA61_0 = input.LA(1);
			if ( (LA61_0==LOOKUPSWITCH) ) {
				alt61=1;
			}
			else if ( (LA61_0==TABLESWITCH) ) {
				int LA61_2 = input.LA(2);
				if ( (LA61_2==INT) ) {
					int LA61_3 = input.LA(3);
					if ( (LA61_3==147) ) {
						alt61=2;
					}
					else if ( (LA61_3==ACC||LA61_3==ANNOTATION_VISIBLITY||LA61_3==DEFAULT||LA61_3==ID||LA61_3==INNER||LA61_3==METHOD_ANNOTATION_VISIBLITY||LA61_3==OUTTER||(LA61_3 >= UP_B && LA61_3 <= UP_Z)) ) {
						alt61=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 61, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 61, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 61, 0, input);
				throw nvae;
			}

			switch (alt61) {
				case 1 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1190:4: a= LOOKUPSWITCH (c= INT ':' z= sLabel )* ( DEFAULT ':' z= sLabel )
					{
					a=(Token)match(input,LOOKUPSWITCH,FOLLOW_LOOKUPSWITCH_in_sSwitch5919); 
					 keys=new ArrayList<>(); labels=new ArrayList<>();  
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1190:74: (c= INT ':' z= sLabel )*
					loop58:
					while (true) {
						int alt58=2;
						int LA58_0 = input.LA(1);
						if ( (LA58_0==INT) ) {
							alt58=1;
						}

						switch (alt58) {
						case 1 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1190:75: c= INT ':' z= sLabel
							{
							c=(Token)match(input,INT,FOLLOW_INT_in_sSwitch5926); 
							match(input,146,FOLLOW_146_in_sSwitch5928); 
							pushFollow(FOLLOW_sLabel_in_sSwitch5932);
							z=sLabel();
							state._fsp--;

							 keys.add(parseInt((c!=null?c.getText():null))); labels.add(getLabel((z!=null?input.toString(z.start,z.stop):null))); 
							}
							break;

						default :
							break loop58;
						}
					}

					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1190:160: ( DEFAULT ':' z= sLabel )
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1190:161: DEFAULT ':' z= sLabel
					{
					match(input,DEFAULT,FOLLOW_DEFAULT_in_sSwitch5939); 
					match(input,146,FOLLOW_146_in_sSwitch5941); 
					pushFollow(FOLLOW_sLabel_in_sSwitch5945);
					z=sLabel();
					state._fsp--;

					 defaultLabel=getLabel((z!=null?input.toString(z.start,z.stop):null)); 
					}


						        line((a!=null?a.getLine():0));
						        int ts[]=new int[keys.size()];
						        for(int i=0;i<keys.size();i++){
						            ts[i]=keys.get(i);
						        }
						        mn.visitLookupSwitchInsn(defaultLabel, ts, labels.toArray(new Label[labels.size()]));
						        
					}
					break;
				case 2 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1198:4: a= TABLESWITCH c= INT ';' 'high' '=' d= INT (z= sLabel )* ( DEFAULT ':' z= sLabel )
					{
					a=(Token)match(input,TABLESWITCH,FOLLOW_TABLESWITCH_in_sSwitch5959); 
					 labels=new ArrayList<>();  
					c=(Token)match(input,INT,FOLLOW_INT_in_sSwitch5965); 
					match(input,147,FOLLOW_147_in_sSwitch5967); 
					match(input,HIGH,FOLLOW_HIGH_in_sSwitch5969); 
					match(input,148,FOLLOW_148_in_sSwitch5971); 
					d=(Token)match(input,INT,FOLLOW_INT_in_sSwitch5975); 
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1198:76: (z= sLabel )*
					loop59:
					while (true) {
						int alt59=2;
						int LA59_0 = input.LA(1);
						if ( (LA59_0==ACC||LA59_0==ANNOTATION_VISIBLITY||LA59_0==ID||LA59_0==INNER||LA59_0==METHOD_ANNOTATION_VISIBLITY||LA59_0==OUTTER||(LA59_0 >= UP_B && LA59_0 <= UP_Z)) ) {
							alt59=1;
						}

						switch (alt59) {
						case 1 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1198:77: z= sLabel
							{
							pushFollow(FOLLOW_sLabel_in_sSwitch5980);
							z=sLabel();
							state._fsp--;

							labels.add(getLabel((z!=null?input.toString(z.start,z.stop):null)));
							}
							break;

						default :
							break loop59;
						}
					}

					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1198:123: ( DEFAULT ':' z= sLabel )
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1198:124: DEFAULT ':' z= sLabel
					{
					match(input,DEFAULT,FOLLOW_DEFAULT_in_sSwitch5989); 
					match(input,146,FOLLOW_146_in_sSwitch5991); 
					pushFollow(FOLLOW_sLabel_in_sSwitch5995);
					z=sLabel();
					state._fsp--;

					defaultLabel=getLabel((z!=null?input.toString(z.start,z.stop):null));
					}


						        line((a!=null?a.getLine():0)); mn.visitTableSwitchInsn(parseInt((c!=null?c.getText():null)),parseInt((c!=null?c.getText():null))+labels.size()-1,defaultLabel,labels.toArray(new Label[labels.size()]));
						        
					}
					break;
				case 3 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1201:6: a= TABLESWITCH c= INT (z= sLabel )* ( DEFAULT ':' z= sLabel )
					{
					a=(Token)match(input,TABLESWITCH,FOLLOW_TABLESWITCH_in_sSwitch6012); 
					 labels=new ArrayList<>();  
					c=(Token)match(input,INT,FOLLOW_INT_in_sSwitch6018); 
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1201:57: (z= sLabel )*
					loop60:
					while (true) {
						int alt60=2;
						int LA60_0 = input.LA(1);
						if ( (LA60_0==ACC||LA60_0==ANNOTATION_VISIBLITY||LA60_0==ID||LA60_0==INNER||LA60_0==METHOD_ANNOTATION_VISIBLITY||LA60_0==OUTTER||(LA60_0 >= UP_B && LA60_0 <= UP_Z)) ) {
							alt60=1;
						}

						switch (alt60) {
						case 1 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1201:58: z= sLabel
							{
							pushFollow(FOLLOW_sLabel_in_sSwitch6023);
							z=sLabel();
							state._fsp--;

							labels.add(getLabel((z!=null?input.toString(z.start,z.stop):null)));
							}
							break;

						default :
							break loop60;
						}
					}

					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1201:104: ( DEFAULT ':' z= sLabel )
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1201:105: DEFAULT ':' z= sLabel
					{
					match(input,DEFAULT,FOLLOW_DEFAULT_in_sSwitch6032); 
					match(input,146,FOLLOW_146_in_sSwitch6034); 
					pushFollow(FOLLOW_sLabel_in_sSwitch6038);
					z=sLabel();
					state._fsp--;

					defaultLabel=getLabel((z!=null?input.toString(z.start,z.stop):null));
					}


					        	        line((a!=null?a.getLine():0)); mn.visitTableSwitchInsn(parseInt((c!=null?c.getText():null)),parseInt((c!=null?c.getText():null))+labels.size()-1,defaultLabel,labels.toArray(new Label[labels.size()]));
					        	        
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "sSwitch"



	// $ANTLR start "sInternalNameOrDesc"
	// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1205:1: sInternalNameOrDesc returns [String desc] : ( (a= sArrayType |b= OBJECT_TYPE ) |c= sId | DSTRING | STRING );
	public final String sInternalNameOrDesc() throws RecognitionException {
		String desc = null;


		Token b=null;
		Token DSTRING1=null;
		Token STRING2=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope c =null;

		try {
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1206:5: ( (a= sArrayType |b= OBJECT_TYPE ) |c= sId | DSTRING | STRING )
			int alt63=4;
			switch ( input.LA(1) ) {
			case ARRAY_B:
			case ARRAY_C:
			case ARRAY_D:
			case ARRAY_F:
			case ARRAY_I:
			case ARRAY_J:
			case ARRAY_S:
			case ARRAY_Z:
			case OBJECT_TYPE:
			case PARRAY_TYPE:
				{
				alt63=1;
				}
				break;
			case AND:
			case ANNOTATION_VISIBLITY:
			case AT:
			case DEFAULT:
			case FROM:
			case HIGH:
			case ID:
			case IIOP:
			case INNER:
			case INVOKEDYNAMIC:
			case INVOKEINTERFACE:
			case IOP:
			case JOP:
			case LDC:
			case LOCALS:
			case LOOKUPSWITCH:
			case METHOD_ANNOTATION_VISIBLITY:
			case MULTIANEWARRAY:
			case OP0:
			case OUTTER:
			case STACK:
			case TABLESWITCH:
			case TO:
			case UP_B:
			case UP_C:
			case UP_D:
			case UP_F:
			case UP_I:
			case UP_J:
			case UP_S:
			case UP_Z:
			case USING:
			case VOID_TYPE:
			case WBOOLEAN:
			case WBYTE:
			case WCHAR:
			case WDOUBLE:
			case WFLOAT:
			case WINTEGER:
			case WLONG:
			case WSHORT:
			case XFIELD:
			case XINVOKE:
			case XNEWARRAY:
			case XTYPE:
				{
				alt63=2;
				}
				break;
			case DSTRING:
				{
				alt63=3;
				}
				break;
			case STRING:
				{
				alt63=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 63, 0, input);
				throw nvae;
			}
			switch (alt63) {
				case 1 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1206:7: (a= sArrayType |b= OBJECT_TYPE )
					{
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1206:7: (a= sArrayType |b= OBJECT_TYPE )
					int alt62=2;
					int LA62_0 = input.LA(1);
					if ( ((LA62_0 >= ARRAY_B && LA62_0 <= ARRAY_J)||(LA62_0 >= ARRAY_S && LA62_0 <= ARRAY_Z)||LA62_0==PARRAY_TYPE) ) {
						alt62=1;
					}
					else if ( (LA62_0==OBJECT_TYPE) ) {
						alt62=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 62, 0, input);
						throw nvae;
					}

					switch (alt62) {
						case 1 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1206:8: a= sArrayType
							{
							pushFollow(FOLLOW_sArrayType_in_sInternalNameOrDesc6068);
							a=sArrayType();
							state._fsp--;

							 desc =unEscape((a!=null?input.toString(a.start,a.stop):null)); 
							}
							break;
						case 2 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1206:50: b= OBJECT_TYPE
							{
							b=(Token)match(input,OBJECT_TYPE,FOLLOW_OBJECT_TYPE_in_sInternalNameOrDesc6074); 
							 desc =unEscape((b!=null?b.getText():null)); 
							}
							break;

					}

					}
					break;
				case 2 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1207:7: c= sId
					{
					pushFollow(FOLLOW_sId_in_sInternalNameOrDesc6087);
					c=sId();
					state._fsp--;

					  desc = "L"+unEscape((c!=null?input.toString(c.start,c.stop):null))+";"; 
					}
					break;
				case 3 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1208:7: DSTRING
					{
					DSTRING1=(Token)match(input,DSTRING,FOLLOW_DSTRING_in_sInternalNameOrDesc6097); 
					  desc = "L"+unEscapeString((DSTRING1!=null?DSTRING1.getText():null))+";"; 
					}
					break;
				case 4 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1209:7: STRING
					{
					STRING2=(Token)match(input,STRING,FOLLOW_STRING_in_sInternalNameOrDesc6107); 
					  desc = "L"+unEscapeString((STRING2!=null?STRING2.getText():null))+";"; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return desc;
	}
	// $ANTLR end "sInternalNameOrDesc"



	// $ANTLR start "sInternalNameOrDescACC"
	// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1211:1: sInternalNameOrDescACC returns [String desc] : ( (a= sArrayType |b= OBJECT_TYPE ) |c= sAnyId | DSTRING | STRING );
	public final String sInternalNameOrDescACC() throws RecognitionException {
		String desc = null;


		Token b=null;
		Token DSTRING3=null;
		Token STRING4=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope c =null;

		try {
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1212:9: ( (a= sArrayType |b= OBJECT_TYPE ) |c= sAnyId | DSTRING | STRING )
			int alt65=4;
			switch ( input.LA(1) ) {
			case ARRAY_B:
			case ARRAY_C:
			case ARRAY_D:
			case ARRAY_F:
			case ARRAY_I:
			case ARRAY_J:
			case ARRAY_S:
			case ARRAY_Z:
			case OBJECT_TYPE:
			case PARRAY_TYPE:
				{
				alt65=1;
				}
				break;
			case ACC:
			case AND:
			case ANNOTATION_VISIBLITY:
			case AT:
			case DEFAULT:
			case FROM:
			case HIGH:
			case ID:
			case IIOP:
			case INNER:
			case INVOKEDYNAMIC:
			case INVOKEINTERFACE:
			case IOP:
			case JOP:
			case LDC:
			case LOCALS:
			case LOOKUPSWITCH:
			case METHOD_ANNOTATION_VISIBLITY:
			case MULTIANEWARRAY:
			case OP0:
			case OUTTER:
			case STACK:
			case TABLESWITCH:
			case TO:
			case UP_B:
			case UP_C:
			case UP_D:
			case UP_F:
			case UP_I:
			case UP_J:
			case UP_S:
			case UP_Z:
			case USING:
			case VOID_TYPE:
			case WBOOLEAN:
			case WBYTE:
			case WCHAR:
			case WDOUBLE:
			case WFLOAT:
			case WINTEGER:
			case WLONG:
			case WSHORT:
			case XFIELD:
			case XINVOKE:
			case XNEWARRAY:
			case XTYPE:
				{
				alt65=2;
				}
				break;
			case DSTRING:
				{
				alt65=3;
				}
				break;
			case STRING:
				{
				alt65=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 65, 0, input);
				throw nvae;
			}
			switch (alt65) {
				case 1 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1212:11: (a= sArrayType |b= OBJECT_TYPE )
					{
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1212:11: (a= sArrayType |b= OBJECT_TYPE )
					int alt64=2;
					int LA64_0 = input.LA(1);
					if ( ((LA64_0 >= ARRAY_B && LA64_0 <= ARRAY_J)||(LA64_0 >= ARRAY_S && LA64_0 <= ARRAY_Z)||LA64_0==PARRAY_TYPE) ) {
						alt64=1;
					}
					else if ( (LA64_0==OBJECT_TYPE) ) {
						alt64=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 64, 0, input);
						throw nvae;
					}

					switch (alt64) {
						case 1 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1212:12: a= sArrayType
							{
							pushFollow(FOLLOW_sArrayType_in_sInternalNameOrDescACC6135);
							a=sArrayType();
							state._fsp--;

							 desc =unEscape((a!=null?input.toString(a.start,a.stop):null)); 
							}
							break;
						case 2 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1212:54: b= OBJECT_TYPE
							{
							b=(Token)match(input,OBJECT_TYPE,FOLLOW_OBJECT_TYPE_in_sInternalNameOrDescACC6141); 
							 desc =unEscape((b!=null?b.getText():null)); 
							}
							break;

					}

					}
					break;
				case 2 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1213:11: c= sAnyId
					{
					pushFollow(FOLLOW_sAnyId_in_sInternalNameOrDescACC6158);
					c=sAnyId();
					state._fsp--;

					  desc = "L"+unEscape((c!=null?input.toString(c.start,c.stop):null))+";"; 
					}
					break;
				case 3 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1214:11: DSTRING
					{
					DSTRING3=(Token)match(input,DSTRING,FOLLOW_DSTRING_in_sInternalNameOrDescACC6172); 
					  desc = "L"+unEscapeString((DSTRING3!=null?DSTRING3.getText():null))+";"; 
					}
					break;
				case 4 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1215:11: STRING
					{
					STRING4=(Token)match(input,STRING,FOLLOW_STRING_in_sInternalNameOrDescACC6186); 
					  desc = "L"+unEscapeString((STRING4!=null?STRING4.getText():null))+";"; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return desc;
	}
	// $ANTLR end "sInternalNameOrDescACC"



	// $ANTLR start "sInternalNameOrDescNoString"
	// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1217:1: sInternalNameOrDescNoString returns [String desc] : ( (a= sArrayType |b= OBJECT_TYPE ) |c= sAnyId );
	public final String sInternalNameOrDescNoString() throws RecognitionException {
		String desc = null;


		Token b=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope c =null;

		try {
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1218:5: ( (a= sArrayType |b= OBJECT_TYPE ) |c= sAnyId )
			int alt67=2;
			int LA67_0 = input.LA(1);
			if ( ((LA67_0 >= ARRAY_B && LA67_0 <= ARRAY_J)||(LA67_0 >= ARRAY_S && LA67_0 <= ARRAY_Z)||LA67_0==OBJECT_TYPE||LA67_0==PARRAY_TYPE) ) {
				alt67=1;
			}
			else if ( ((LA67_0 >= ACC && LA67_0 <= ANNOTATION_VISIBLITY)||LA67_0==AT||LA67_0==DEFAULT||LA67_0==FROM||(LA67_0 >= HIGH && LA67_0 <= INNER)||(LA67_0 >= INVOKEDYNAMIC && LA67_0 <= LDC)||LA67_0==LOCALS||(LA67_0 >= LOOKUPSWITCH && LA67_0 <= METHOD_ANNOTATION_VISIBLITY)||LA67_0==MULTIANEWARRAY||(LA67_0 >= OP0 && LA67_0 <= OUTTER)||LA67_0==STACK||(LA67_0 >= TABLESWITCH && LA67_0 <= WLONG)||(LA67_0 >= WSHORT && LA67_0 <= XTYPE)) ) {
				alt67=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 67, 0, input);
				throw nvae;
			}

			switch (alt67) {
				case 1 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1218:7: (a= sArrayType |b= OBJECT_TYPE )
					{
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1218:7: (a= sArrayType |b= OBJECT_TYPE )
					int alt66=2;
					int LA66_0 = input.LA(1);
					if ( ((LA66_0 >= ARRAY_B && LA66_0 <= ARRAY_J)||(LA66_0 >= ARRAY_S && LA66_0 <= ARRAY_Z)||LA66_0==PARRAY_TYPE) ) {
						alt66=1;
					}
					else if ( (LA66_0==OBJECT_TYPE) ) {
						alt66=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 66, 0, input);
						throw nvae;
					}

					switch (alt66) {
						case 1 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1218:8: a= sArrayType
							{
							pushFollow(FOLLOW_sArrayType_in_sInternalNameOrDescNoString6214);
							a=sArrayType();
							state._fsp--;

							 desc =unEscape((a!=null?input.toString(a.start,a.stop):null)); 
							}
							break;
						case 2 :
							// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1218:50: b= OBJECT_TYPE
							{
							b=(Token)match(input,OBJECT_TYPE,FOLLOW_OBJECT_TYPE_in_sInternalNameOrDescNoString6220); 
							 desc =unEscape((b!=null?b.getText():null)); 
							}
							break;

					}

					}
					break;
				case 2 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1219:7: c= sAnyId
					{
					pushFollow(FOLLOW_sAnyId_in_sInternalNameOrDescNoString6233);
					c=sAnyId();
					state._fsp--;

					  desc = "L"+unEscape((c!=null?input.toString(c.start,c.stop):null))+";"; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return desc;
	}
	// $ANTLR end "sInternalNameOrDescNoString"


	public static class sAnyId_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "sAnyId"
	// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1221:1: sAnyId : ( ACC | sId );
	public final JasminParser.sAnyId_return sAnyId() throws RecognitionException {
		JasminParser.sAnyId_return retval = new JasminParser.sAnyId_return();
		retval.start = input.LT(1);

		try {
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1222:5: ( ACC | sId )
			int alt68=2;
			int LA68_0 = input.LA(1);
			if ( (LA68_0==ACC) ) {
				alt68=1;
			}
			else if ( ((LA68_0 >= AND && LA68_0 <= ANNOTATION_VISIBLITY)||LA68_0==AT||LA68_0==DEFAULT||LA68_0==FROM||(LA68_0 >= HIGH && LA68_0 <= INNER)||(LA68_0 >= INVOKEDYNAMIC && LA68_0 <= LDC)||LA68_0==LOCALS||(LA68_0 >= LOOKUPSWITCH && LA68_0 <= METHOD_ANNOTATION_VISIBLITY)||LA68_0==MULTIANEWARRAY||(LA68_0 >= OP0 && LA68_0 <= OUTTER)||LA68_0==STACK||(LA68_0 >= TABLESWITCH && LA68_0 <= WLONG)||(LA68_0 >= WSHORT && LA68_0 <= XTYPE)) ) {
				alt68=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 68, 0, input);
				throw nvae;
			}

			switch (alt68) {
				case 1 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1222:7: ACC
					{
					match(input,ACC,FOLLOW_ACC_in_sAnyId6251); 
					}
					break;
				case 2 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1222:13: sId
					{
					pushFollow(FOLLOW_sId_in_sAnyId6255);
					sId();
					state._fsp--;

					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sAnyId"



	// $ANTLR start "sAnyIdOrString"
	// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1224:1: sAnyIdOrString returns [String str] : ( sAnyId | STRING | DSTRING );
	public final String sAnyIdOrString() throws RecognitionException {
		String str = null;


		Token STRING6=null;
		Token DSTRING7=null;
		ParserRuleReturnScope sAnyId5 =null;

		try {
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1225:5: ( sAnyId | STRING | DSTRING )
			int alt69=3;
			switch ( input.LA(1) ) {
			case ACC:
			case AND:
			case ANNOTATION_VISIBLITY:
			case AT:
			case DEFAULT:
			case FROM:
			case HIGH:
			case ID:
			case IIOP:
			case INNER:
			case INVOKEDYNAMIC:
			case INVOKEINTERFACE:
			case IOP:
			case JOP:
			case LDC:
			case LOCALS:
			case LOOKUPSWITCH:
			case METHOD_ANNOTATION_VISIBLITY:
			case MULTIANEWARRAY:
			case OP0:
			case OUTTER:
			case STACK:
			case TABLESWITCH:
			case TO:
			case UP_B:
			case UP_C:
			case UP_D:
			case UP_F:
			case UP_I:
			case UP_J:
			case UP_S:
			case UP_Z:
			case USING:
			case VOID_TYPE:
			case WBOOLEAN:
			case WBYTE:
			case WCHAR:
			case WDOUBLE:
			case WFLOAT:
			case WINTEGER:
			case WLONG:
			case WSHORT:
			case XFIELD:
			case XINVOKE:
			case XNEWARRAY:
			case XTYPE:
				{
				alt69=1;
				}
				break;
			case STRING:
				{
				alt69=2;
				}
				break;
			case DSTRING:
				{
				alt69=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 69, 0, input);
				throw nvae;
			}
			switch (alt69) {
				case 1 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1225:7: sAnyId
					{
					pushFollow(FOLLOW_sAnyId_in_sAnyIdOrString6274);
					sAnyId5=sAnyId();
					state._fsp--;

					 str =unEscape((sAnyId5!=null?input.toString(sAnyId5.start,sAnyId5.stop):null));
					}
					break;
				case 2 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1226:7: STRING
					{
					STRING6=(Token)match(input,STRING,FOLLOW_STRING_in_sAnyIdOrString6284); 
					 str =unEscapeString((STRING6!=null?STRING6.getText():null)); 
					}
					break;
				case 3 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1227:7: DSTRING
					{
					DSTRING7=(Token)match(input,DSTRING,FOLLOW_DSTRING_in_sAnyIdOrString6294); 
					 str =unEscapeString((DSTRING7!=null?DSTRING7.getText():null)); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return str;
	}
	// $ANTLR end "sAnyIdOrString"


	public static class sOwnerAndName_return extends ParserRuleReturnScope {
		public String ownerInternalName;
		public String memberName;
	};


	// $ANTLR start "sOwnerAndName"
	// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1229:1: sOwnerAndName returns [String ownerInternalName, String memberName] : (a= sArrayType '/' x= sAnyId |b= sClassDesc '->' x= sAnyId |c= sId );
	public final JasminParser.sOwnerAndName_return sOwnerAndName() throws RecognitionException {
		JasminParser.sOwnerAndName_return retval = new JasminParser.sOwnerAndName_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope a =null;
		ParserRuleReturnScope x =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope c =null;

		try {
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1230:5: (a= sArrayType '/' x= sAnyId |b= sClassDesc '->' x= sAnyId |c= sId )
			int alt70=3;
			switch ( input.LA(1) ) {
			case ARRAY_B:
			case ARRAY_C:
			case ARRAY_D:
			case ARRAY_F:
			case ARRAY_I:
			case ARRAY_J:
			case ARRAY_S:
			case ARRAY_Z:
			case PARRAY_TYPE:
				{
				int LA70_1 = input.LA(2);
				if ( (LA70_1==145) ) {
					alt70=1;
				}
				else if ( (LA70_1==89) ) {
					alt70=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 70, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case OBJECT_TYPE:
				{
				alt70=2;
				}
				break;
			case UP_Z:
				{
				int LA70_3 = input.LA(2);
				if ( (LA70_3==89) ) {
					alt70=2;
				}
				else if ( (LA70_3==EOF||LA70_3==METHOD_DESC_WITHOUT_RET||LA70_3==92||LA70_3==97||LA70_3==100||(LA70_3 >= 103 && LA70_3 <= 104)||(LA70_3 >= 107 && LA70_3 <= 108)||(LA70_3 >= 111 && LA70_3 <= 112)||LA70_3==118||(LA70_3 >= 121 && LA70_3 <= 123)||LA70_3==126||LA70_3==130||LA70_3==132||(LA70_3 >= 134 && LA70_3 <= 135)||(LA70_3 >= 137 && LA70_3 <= 139)||(LA70_3 >= 141 && LA70_3 <= 142)) ) {
					alt70=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 70, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case UP_B:
				{
				int LA70_4 = input.LA(2);
				if ( (LA70_4==89) ) {
					alt70=2;
				}
				else if ( (LA70_4==EOF||LA70_4==METHOD_DESC_WITHOUT_RET||LA70_4==92||LA70_4==97||LA70_4==100||(LA70_4 >= 103 && LA70_4 <= 104)||(LA70_4 >= 107 && LA70_4 <= 108)||(LA70_4 >= 111 && LA70_4 <= 112)||LA70_4==118||(LA70_4 >= 121 && LA70_4 <= 123)||LA70_4==126||LA70_4==130||LA70_4==132||(LA70_4 >= 134 && LA70_4 <= 135)||(LA70_4 >= 137 && LA70_4 <= 139)||(LA70_4 >= 141 && LA70_4 <= 142)) ) {
					alt70=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 70, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case UP_S:
				{
				int LA70_5 = input.LA(2);
				if ( (LA70_5==89) ) {
					alt70=2;
				}
				else if ( (LA70_5==EOF||LA70_5==METHOD_DESC_WITHOUT_RET||LA70_5==92||LA70_5==97||LA70_5==100||(LA70_5 >= 103 && LA70_5 <= 104)||(LA70_5 >= 107 && LA70_5 <= 108)||(LA70_5 >= 111 && LA70_5 <= 112)||LA70_5==118||(LA70_5 >= 121 && LA70_5 <= 123)||LA70_5==126||LA70_5==130||LA70_5==132||(LA70_5 >= 134 && LA70_5 <= 135)||(LA70_5 >= 137 && LA70_5 <= 139)||(LA70_5 >= 141 && LA70_5 <= 142)) ) {
					alt70=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 70, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case UP_C:
				{
				int LA70_6 = input.LA(2);
				if ( (LA70_6==89) ) {
					alt70=2;
				}
				else if ( (LA70_6==EOF||LA70_6==METHOD_DESC_WITHOUT_RET||LA70_6==92||LA70_6==97||LA70_6==100||(LA70_6 >= 103 && LA70_6 <= 104)||(LA70_6 >= 107 && LA70_6 <= 108)||(LA70_6 >= 111 && LA70_6 <= 112)||LA70_6==118||(LA70_6 >= 121 && LA70_6 <= 123)||LA70_6==126||LA70_6==130||LA70_6==132||(LA70_6 >= 134 && LA70_6 <= 135)||(LA70_6 >= 137 && LA70_6 <= 139)||(LA70_6 >= 141 && LA70_6 <= 142)) ) {
					alt70=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 70, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case UP_I:
				{
				int LA70_7 = input.LA(2);
				if ( (LA70_7==89) ) {
					alt70=2;
				}
				else if ( (LA70_7==EOF||LA70_7==METHOD_DESC_WITHOUT_RET||LA70_7==92||LA70_7==97||LA70_7==100||(LA70_7 >= 103 && LA70_7 <= 104)||(LA70_7 >= 107 && LA70_7 <= 108)||(LA70_7 >= 111 && LA70_7 <= 112)||LA70_7==118||(LA70_7 >= 121 && LA70_7 <= 123)||LA70_7==126||LA70_7==130||LA70_7==132||(LA70_7 >= 134 && LA70_7 <= 135)||(LA70_7 >= 137 && LA70_7 <= 139)||(LA70_7 >= 141 && LA70_7 <= 142)) ) {
					alt70=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 70, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case UP_J:
				{
				int LA70_8 = input.LA(2);
				if ( (LA70_8==89) ) {
					alt70=2;
				}
				else if ( (LA70_8==EOF||LA70_8==METHOD_DESC_WITHOUT_RET||LA70_8==92||LA70_8==97||LA70_8==100||(LA70_8 >= 103 && LA70_8 <= 104)||(LA70_8 >= 107 && LA70_8 <= 108)||(LA70_8 >= 111 && LA70_8 <= 112)||LA70_8==118||(LA70_8 >= 121 && LA70_8 <= 123)||LA70_8==126||LA70_8==130||LA70_8==132||(LA70_8 >= 134 && LA70_8 <= 135)||(LA70_8 >= 137 && LA70_8 <= 139)||(LA70_8 >= 141 && LA70_8 <= 142)) ) {
					alt70=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 70, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case UP_D:
				{
				int LA70_9 = input.LA(2);
				if ( (LA70_9==89) ) {
					alt70=2;
				}
				else if ( (LA70_9==EOF||LA70_9==METHOD_DESC_WITHOUT_RET||LA70_9==92||LA70_9==97||LA70_9==100||(LA70_9 >= 103 && LA70_9 <= 104)||(LA70_9 >= 107 && LA70_9 <= 108)||(LA70_9 >= 111 && LA70_9 <= 112)||LA70_9==118||(LA70_9 >= 121 && LA70_9 <= 123)||LA70_9==126||LA70_9==130||LA70_9==132||(LA70_9 >= 134 && LA70_9 <= 135)||(LA70_9 >= 137 && LA70_9 <= 139)||(LA70_9 >= 141 && LA70_9 <= 142)) ) {
					alt70=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 70, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case UP_F:
				{
				int LA70_10 = input.LA(2);
				if ( (LA70_10==89) ) {
					alt70=2;
				}
				else if ( (LA70_10==EOF||LA70_10==METHOD_DESC_WITHOUT_RET||LA70_10==92||LA70_10==97||LA70_10==100||(LA70_10 >= 103 && LA70_10 <= 104)||(LA70_10 >= 107 && LA70_10 <= 108)||(LA70_10 >= 111 && LA70_10 <= 112)||LA70_10==118||(LA70_10 >= 121 && LA70_10 <= 123)||LA70_10==126||LA70_10==130||LA70_10==132||(LA70_10 >= 134 && LA70_10 <= 135)||(LA70_10 >= 137 && LA70_10 <= 139)||(LA70_10 >= 141 && LA70_10 <= 142)) ) {
					alt70=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 70, 10, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case AND:
			case ANNOTATION_VISIBLITY:
			case AT:
			case DEFAULT:
			case FROM:
			case HIGH:
			case ID:
			case IIOP:
			case INNER:
			case INVOKEDYNAMIC:
			case INVOKEINTERFACE:
			case IOP:
			case JOP:
			case LDC:
			case LOCALS:
			case LOOKUPSWITCH:
			case METHOD_ANNOTATION_VISIBLITY:
			case MULTIANEWARRAY:
			case OP0:
			case OUTTER:
			case STACK:
			case TABLESWITCH:
			case TO:
			case USING:
			case VOID_TYPE:
			case WBOOLEAN:
			case WBYTE:
			case WCHAR:
			case WDOUBLE:
			case WFLOAT:
			case WINTEGER:
			case WLONG:
			case WSHORT:
			case XFIELD:
			case XINVOKE:
			case XNEWARRAY:
			case XTYPE:
				{
				alt70=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 70, 0, input);
				throw nvae;
			}
			switch (alt70) {
				case 1 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1230:10: a= sArrayType '/' x= sAnyId
					{
					pushFollow(FOLLOW_sArrayType_in_sOwnerAndName6320);
					a=sArrayType();
					state._fsp--;

					match(input,145,FOLLOW_145_in_sOwnerAndName6322); 
					pushFollow(FOLLOW_sAnyId_in_sOwnerAndName6326);
					x=sAnyId();
					state._fsp--;

					 if((x!=null?input.toString(x.start,x.stop):null).contains("/")){ throw new RecognitionException(input);}  retval.ownerInternalName =unEscape((a!=null?input.toString(a.start,a.stop):null)); retval.memberName =unEscape((x!=null?input.toString(x.start,x.stop):null)); 
					}
					break;
				case 2 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1231:7: b= sClassDesc '->' x= sAnyId
					{
					pushFollow(FOLLOW_sClassDesc_in_sOwnerAndName6338);
					b=sClassDesc();
					state._fsp--;

					match(input,89,FOLLOW_89_in_sOwnerAndName6340); 
					pushFollow(FOLLOW_sAnyId_in_sOwnerAndName6344);
					x=sAnyId();
					state._fsp--;

					 if((x!=null?input.toString(x.start,x.stop):null).contains("/")){ throw new RecognitionException(input);} retval.ownerInternalName =Type.getType(unEscape((b!=null?input.toString(b.start,b.stop):null))).getInternalName(); retval.memberName =unEscape((x!=null?input.toString(x.start,x.stop):null));  
					}
					break;
				case 3 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1232:7: c= sId
					{
					pushFollow(FOLLOW_sId_in_sOwnerAndName6356);
					c=sId();
					state._fsp--;

					 String cstr=(c!=null?input.toString(c.start,c.stop):null); int idx=cstr.lastIndexOf('/'); if(idx<=0) { throw new RecognitionException(input); } retval.ownerInternalName =unEscape(cstr.substring(0,idx)); retval.memberName =unEscape(cstr.substring(idx+1)); 
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sOwnerAndName"


	public static class sMethodObject_return extends ParserRuleReturnScope {
		public String ownerInternalName;
		public String memberName;
		public String desc;
	};


	// $ANTLR start "sMethodObject"
	// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1234:1: sMethodObject returns [String ownerInternalName, String memberName, String desc] : (a= sArrayType '/' x= sAnyId |b= sClassDesc '->' x= sAnyId |c= sId ) d= sMethodDesc ;
	public final JasminParser.sMethodObject_return sMethodObject() throws RecognitionException {
		JasminParser.sMethodObject_return retval = new JasminParser.sMethodObject_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope a =null;
		ParserRuleReturnScope x =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope c =null;
		ParserRuleReturnScope d =null;

		try {
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1235:5: ( (a= sArrayType '/' x= sAnyId |b= sClassDesc '->' x= sAnyId |c= sId ) d= sMethodDesc )
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1235:9: (a= sArrayType '/' x= sAnyId |b= sClassDesc '->' x= sAnyId |c= sId ) d= sMethodDesc
			{
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1235:9: (a= sArrayType '/' x= sAnyId |b= sClassDesc '->' x= sAnyId |c= sId )
			int alt71=3;
			switch ( input.LA(1) ) {
			case ARRAY_B:
			case ARRAY_C:
			case ARRAY_D:
			case ARRAY_F:
			case ARRAY_I:
			case ARRAY_J:
			case ARRAY_S:
			case ARRAY_Z:
			case PARRAY_TYPE:
				{
				int LA71_1 = input.LA(2);
				if ( (LA71_1==145) ) {
					alt71=1;
				}
				else if ( (LA71_1==89) ) {
					alt71=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 71, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case OBJECT_TYPE:
				{
				alt71=2;
				}
				break;
			case UP_Z:
				{
				int LA71_3 = input.LA(2);
				if ( (LA71_3==89) ) {
					alt71=2;
				}
				else if ( (LA71_3==METHOD_DESC_WITHOUT_RET) ) {
					alt71=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 71, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case UP_B:
				{
				int LA71_4 = input.LA(2);
				if ( (LA71_4==89) ) {
					alt71=2;
				}
				else if ( (LA71_4==METHOD_DESC_WITHOUT_RET) ) {
					alt71=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 71, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case UP_S:
				{
				int LA71_5 = input.LA(2);
				if ( (LA71_5==89) ) {
					alt71=2;
				}
				else if ( (LA71_5==METHOD_DESC_WITHOUT_RET) ) {
					alt71=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 71, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case UP_C:
				{
				int LA71_6 = input.LA(2);
				if ( (LA71_6==89) ) {
					alt71=2;
				}
				else if ( (LA71_6==METHOD_DESC_WITHOUT_RET) ) {
					alt71=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 71, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case UP_I:
				{
				int LA71_7 = input.LA(2);
				if ( (LA71_7==89) ) {
					alt71=2;
				}
				else if ( (LA71_7==METHOD_DESC_WITHOUT_RET) ) {
					alt71=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 71, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case UP_J:
				{
				int LA71_8 = input.LA(2);
				if ( (LA71_8==89) ) {
					alt71=2;
				}
				else if ( (LA71_8==METHOD_DESC_WITHOUT_RET) ) {
					alt71=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 71, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case UP_D:
				{
				int LA71_9 = input.LA(2);
				if ( (LA71_9==89) ) {
					alt71=2;
				}
				else if ( (LA71_9==METHOD_DESC_WITHOUT_RET) ) {
					alt71=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 71, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case UP_F:
				{
				int LA71_10 = input.LA(2);
				if ( (LA71_10==89) ) {
					alt71=2;
				}
				else if ( (LA71_10==METHOD_DESC_WITHOUT_RET) ) {
					alt71=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 71, 10, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case AND:
			case ANNOTATION_VISIBLITY:
			case AT:
			case DEFAULT:
			case FROM:
			case HIGH:
			case ID:
			case IIOP:
			case INNER:
			case INVOKEDYNAMIC:
			case INVOKEINTERFACE:
			case IOP:
			case JOP:
			case LDC:
			case LOCALS:
			case LOOKUPSWITCH:
			case METHOD_ANNOTATION_VISIBLITY:
			case MULTIANEWARRAY:
			case OP0:
			case OUTTER:
			case STACK:
			case TABLESWITCH:
			case TO:
			case USING:
			case VOID_TYPE:
			case WBOOLEAN:
			case WBYTE:
			case WCHAR:
			case WDOUBLE:
			case WFLOAT:
			case WINTEGER:
			case WLONG:
			case WSHORT:
			case XFIELD:
			case XINVOKE:
			case XNEWARRAY:
			case XTYPE:
				{
				alt71=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 71, 0, input);
				throw nvae;
			}
			switch (alt71) {
				case 1 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1235:11: a= sArrayType '/' x= sAnyId
					{
					pushFollow(FOLLOW_sArrayType_in_sMethodObject6383);
					a=sArrayType();
					state._fsp--;

					match(input,145,FOLLOW_145_in_sMethodObject6385); 
					pushFollow(FOLLOW_sAnyId_in_sMethodObject6389);
					x=sAnyId();
					state._fsp--;

					 if((x!=null?input.toString(x.start,x.stop):null).contains("/")){ throw new RecognitionException(input);}  retval.ownerInternalName =unEscape((a!=null?input.toString(a.start,a.stop):null)); retval.memberName =unEscape((x!=null?input.toString(x.start,x.stop):null)); 
					}
					break;
				case 2 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1236:11: b= sClassDesc '->' x= sAnyId
					{
					pushFollow(FOLLOW_sClassDesc_in_sMethodObject6405);
					b=sClassDesc();
					state._fsp--;

					match(input,89,FOLLOW_89_in_sMethodObject6407); 
					pushFollow(FOLLOW_sAnyId_in_sMethodObject6411);
					x=sAnyId();
					state._fsp--;

					 if((x!=null?input.toString(x.start,x.stop):null).contains("/")){ throw new RecognitionException(input);} retval.ownerInternalName =Type.getType(unEscape((b!=null?input.toString(b.start,b.stop):null))).getInternalName(); retval.memberName =unEscape((x!=null?input.toString(x.start,x.stop):null));  
					}
					break;
				case 3 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1237:11: c= sId
					{
					pushFollow(FOLLOW_sId_in_sMethodObject6427);
					c=sId();
					state._fsp--;

					 String cstr=(c!=null?input.toString(c.start,c.stop):null); int idx=cstr.lastIndexOf('/'); if(idx<=0) { throw new RecognitionException(input); } retval.ownerInternalName =unEscape(cstr.substring(0,idx)); retval.memberName =unEscape(cstr.substring(idx+1)); 
					}
					break;

			}

			pushFollow(FOLLOW_sMethodDesc_in_sMethodObject6449);
			d=sMethodDesc();
			state._fsp--;

			 retval.desc =unEscape((d!=null?input.toString(d.start,d.stop):null));  
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sMethodObject"


	public static class sFieldObject_return extends ParserRuleReturnScope {
		public String ownerInternalName;
		public String memberName;
		public String type;
	};


	// $ANTLR start "sFieldObject"
	// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1241:1: sFieldObject returns [String ownerInternalName, String memberName, String type] : (a= sArrayType '/' x= sAnyId |b= sClassDesc '->' x= sAnyId ':' |c= sId ) b= sClassDesc ;
	public final JasminParser.sFieldObject_return sFieldObject() throws RecognitionException {
		JasminParser.sFieldObject_return retval = new JasminParser.sFieldObject_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope a =null;
		ParserRuleReturnScope x =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope c =null;

		try {
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1242:5: ( (a= sArrayType '/' x= sAnyId |b= sClassDesc '->' x= sAnyId ':' |c= sId ) b= sClassDesc )
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1242:9: (a= sArrayType '/' x= sAnyId |b= sClassDesc '->' x= sAnyId ':' |c= sId ) b= sClassDesc
			{
			// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1242:9: (a= sArrayType '/' x= sAnyId |b= sClassDesc '->' x= sAnyId ':' |c= sId )
			int alt72=3;
			switch ( input.LA(1) ) {
			case ARRAY_B:
			case ARRAY_C:
			case ARRAY_D:
			case ARRAY_F:
			case ARRAY_I:
			case ARRAY_J:
			case ARRAY_S:
			case ARRAY_Z:
			case PARRAY_TYPE:
				{
				int LA72_1 = input.LA(2);
				if ( (LA72_1==145) ) {
					alt72=1;
				}
				else if ( (LA72_1==89) ) {
					alt72=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 72, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case OBJECT_TYPE:
				{
				alt72=2;
				}
				break;
			case UP_Z:
				{
				int LA72_3 = input.LA(2);
				if ( (LA72_3==89) ) {
					alt72=2;
				}
				else if ( ((LA72_3 >= ARRAY_B && LA72_3 <= ARRAY_J)||(LA72_3 >= ARRAY_S && LA72_3 <= ARRAY_Z)||LA72_3==OBJECT_TYPE||LA72_3==PARRAY_TYPE||(LA72_3 >= UP_B && LA72_3 <= UP_Z)) ) {
					alt72=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 72, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case UP_B:
				{
				int LA72_4 = input.LA(2);
				if ( (LA72_4==89) ) {
					alt72=2;
				}
				else if ( ((LA72_4 >= ARRAY_B && LA72_4 <= ARRAY_J)||(LA72_4 >= ARRAY_S && LA72_4 <= ARRAY_Z)||LA72_4==OBJECT_TYPE||LA72_4==PARRAY_TYPE||(LA72_4 >= UP_B && LA72_4 <= UP_Z)) ) {
					alt72=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 72, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case UP_S:
				{
				int LA72_5 = input.LA(2);
				if ( (LA72_5==89) ) {
					alt72=2;
				}
				else if ( ((LA72_5 >= ARRAY_B && LA72_5 <= ARRAY_J)||(LA72_5 >= ARRAY_S && LA72_5 <= ARRAY_Z)||LA72_5==OBJECT_TYPE||LA72_5==PARRAY_TYPE||(LA72_5 >= UP_B && LA72_5 <= UP_Z)) ) {
					alt72=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 72, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case UP_C:
				{
				int LA72_6 = input.LA(2);
				if ( (LA72_6==89) ) {
					alt72=2;
				}
				else if ( ((LA72_6 >= ARRAY_B && LA72_6 <= ARRAY_J)||(LA72_6 >= ARRAY_S && LA72_6 <= ARRAY_Z)||LA72_6==OBJECT_TYPE||LA72_6==PARRAY_TYPE||(LA72_6 >= UP_B && LA72_6 <= UP_Z)) ) {
					alt72=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 72, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case UP_I:
				{
				int LA72_7 = input.LA(2);
				if ( (LA72_7==89) ) {
					alt72=2;
				}
				else if ( ((LA72_7 >= ARRAY_B && LA72_7 <= ARRAY_J)||(LA72_7 >= ARRAY_S && LA72_7 <= ARRAY_Z)||LA72_7==OBJECT_TYPE||LA72_7==PARRAY_TYPE||(LA72_7 >= UP_B && LA72_7 <= UP_Z)) ) {
					alt72=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 72, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case UP_J:
				{
				int LA72_8 = input.LA(2);
				if ( (LA72_8==89) ) {
					alt72=2;
				}
				else if ( ((LA72_8 >= ARRAY_B && LA72_8 <= ARRAY_J)||(LA72_8 >= ARRAY_S && LA72_8 <= ARRAY_Z)||LA72_8==OBJECT_TYPE||LA72_8==PARRAY_TYPE||(LA72_8 >= UP_B && LA72_8 <= UP_Z)) ) {
					alt72=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 72, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case UP_D:
				{
				int LA72_9 = input.LA(2);
				if ( (LA72_9==89) ) {
					alt72=2;
				}
				else if ( ((LA72_9 >= ARRAY_B && LA72_9 <= ARRAY_J)||(LA72_9 >= ARRAY_S && LA72_9 <= ARRAY_Z)||LA72_9==OBJECT_TYPE||LA72_9==PARRAY_TYPE||(LA72_9 >= UP_B && LA72_9 <= UP_Z)) ) {
					alt72=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 72, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case UP_F:
				{
				int LA72_10 = input.LA(2);
				if ( (LA72_10==89) ) {
					alt72=2;
				}
				else if ( ((LA72_10 >= ARRAY_B && LA72_10 <= ARRAY_J)||(LA72_10 >= ARRAY_S && LA72_10 <= ARRAY_Z)||LA72_10==OBJECT_TYPE||LA72_10==PARRAY_TYPE||(LA72_10 >= UP_B && LA72_10 <= UP_Z)) ) {
					alt72=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 72, 10, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case AND:
			case ANNOTATION_VISIBLITY:
			case AT:
			case DEFAULT:
			case FROM:
			case HIGH:
			case ID:
			case IIOP:
			case INNER:
			case INVOKEDYNAMIC:
			case INVOKEINTERFACE:
			case IOP:
			case JOP:
			case LDC:
			case LOCALS:
			case LOOKUPSWITCH:
			case METHOD_ANNOTATION_VISIBLITY:
			case MULTIANEWARRAY:
			case OP0:
			case OUTTER:
			case STACK:
			case TABLESWITCH:
			case TO:
			case USING:
			case VOID_TYPE:
			case WBOOLEAN:
			case WBYTE:
			case WCHAR:
			case WDOUBLE:
			case WFLOAT:
			case WINTEGER:
			case WLONG:
			case WSHORT:
			case XFIELD:
			case XINVOKE:
			case XNEWARRAY:
			case XTYPE:
				{
				alt72=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 72, 0, input);
				throw nvae;
			}
			switch (alt72) {
				case 1 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1242:11: a= sArrayType '/' x= sAnyId
					{
					pushFollow(FOLLOW_sArrayType_in_sFieldObject6476);
					a=sArrayType();
					state._fsp--;

					match(input,145,FOLLOW_145_in_sFieldObject6478); 
					pushFollow(FOLLOW_sAnyId_in_sFieldObject6482);
					x=sAnyId();
					state._fsp--;

					 if((x!=null?input.toString(x.start,x.stop):null).contains("/")){ throw new RecognitionException(input);}  retval.ownerInternalName =unEscape((a!=null?input.toString(a.start,a.stop):null)); retval.memberName =unEscape((x!=null?input.toString(x.start,x.stop):null)); 
					}
					break;
				case 2 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1243:11: b= sClassDesc '->' x= sAnyId ':'
					{
					pushFollow(FOLLOW_sClassDesc_in_sFieldObject6498);
					b=sClassDesc();
					state._fsp--;

					match(input,89,FOLLOW_89_in_sFieldObject6500); 
					pushFollow(FOLLOW_sAnyId_in_sFieldObject6504);
					x=sAnyId();
					state._fsp--;

					match(input,146,FOLLOW_146_in_sFieldObject6506); 
					 if((x!=null?input.toString(x.start,x.stop):null).contains("/")){ throw new RecognitionException(input);} retval.ownerInternalName =Type.getType(unEscape((b!=null?input.toString(b.start,b.stop):null))).getInternalName(); retval.memberName =unEscape((x!=null?input.toString(x.start,x.stop):null));  
					}
					break;
				case 3 :
					// com\\googlecode\\d2j\\jasmin\\Jasmin.g:1244:11: c= sId
					{
					pushFollow(FOLLOW_sId_in_sFieldObject6522);
					c=sId();
					state._fsp--;

					 String cstr=(c!=null?input.toString(c.start,c.stop):null); int idx=cstr.lastIndexOf('/'); if(idx<=0) { throw new RecognitionException(input); } retval.ownerInternalName =unEscape(cstr.substring(0,idx)); retval.memberName =unEscape(cstr.substring(idx+1)); 
					}
					break;

			}

			pushFollow(FOLLOW_sClassDesc_in_sFieldObject6544);
			b=sClassDesc();
			state._fsp--;

			 retval.type =unEscape((b!=null?input.toString(b.start,b.stop):null));  
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sFieldObject"

	// Delegated rules


	protected DFA14 dfa14 = new DFA14(this);
	static final String DFA14_eotS =
		"\u00a2\uffff";
	static final String DFA14_eofS =
		"\1\3\u00a1\uffff";
	static final String DFA14_minS =
		"\2\4\2\uffff\2\7\1\4\1\5\1\7\2\4\3\5\4\7\1\70\10\u0092\22\4\12\11\10\131"+
		"\33\4\12\66\10\131\12\66\10\131\12\66\10\131\20\52\2\4";
	static final String DFA14_maxS =
		"\2\u0090\2\uffff\2\110\2\127\1\123\1\127\1\110\3\127\1\110\1\u0092\2\110"+
		"\12\u0094\1\u0090\21\u0094\1\110\21\u0094\1\u0090\32\u0094\1\70\21\u0094"+
		"\1\70\21\u0094\1\70\42\u0094";
	static final String DFA14_acceptS =
		"\2\uffff\1\1\1\2\u009e\uffff";
	static final String DFA14_specialS =
		"\u00a2\uffff}>";
	static final String[] DFA14_transitionS = {
			"\1\3\1\2\1\17\15\uffff\1\2\1\uffff\1\2\10\uffff\1\2\6\uffff\1\2\1\17"+
			"\1\5\1\17\2\uffff\1\15\1\14\1\4\1\12\1\6\1\uffff\1\2\1\uffff\1\20\1\17"+
			"\1\uffff\1\16\1\uffff\1\1\1\17\2\uffff\1\2\1\uffff\1\21\1\2\10\17\11"+
			"\2\1\uffff\1\2\1\7\1\13\1\10\1\11\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3"+
			"\4\uffff\1\3\1\uffff\1\3\4\uffff\1\2\3\3\1\uffff\2\3\7\uffff\2\3\1\uffff"+
			"\1\3\2\uffff\3\3\1\uffff\2\3\3\uffff\3\3",
			"\1\3\1\uffff\1\3\1\2\1\uffff\14\2\22\uffff\1\22\2\3\2\uffff\5\3\3\uffff"+
			"\2\3\1\uffff\1\3\1\uffff\2\3\4\uffff\1\3\1\uffff\1\23\1\26\1\32\1\31"+
			"\1\27\1\30\1\25\1\24\13\uffff\4\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3"+
			"\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\13\uffff\2\3\4\uffff\3\3\1\uffff"+
			"\2\3\3\uffff\3\3",
			"",
			"",
			"\1\2\1\uffff\14\2\22\uffff\1\2\2\uffff\1\3\26\uffff\10\2",
			"\1\2\1\uffff\14\2\22\uffff\1\2\2\uffff\1\3\26\uffff\10\2",
			"\3\3\1\2\1\uffff\1\45\1\50\1\54\1\53\1\51\1\52\3\2\1\47\1\46\1\34\1"+
			"\uffff\2\3\3\uffff\1\3\3\uffff\1\3\6\uffff\1\3\1\33\3\3\1\uffff\5\3\1"+
			"\uffff\4\3\1\uffff\5\3\1\uffff\4\3\1\35\1\40\1\44\1\43\1\41\1\42\1\37"+
			"\1\36\11\3\1\uffff\5\3",
			"\2\3\1\2\1\uffff\1\67\1\72\1\76\1\75\1\73\1\74\3\2\1\71\1\70\1\56\1"+
			"\uffff\1\3\10\uffff\1\3\6\uffff\1\3\1\55\2\3\2\uffff\5\3\1\uffff\1\3"+
			"\1\uffff\2\3\1\uffff\5\3\1\uffff\1\3\1\uffff\2\3\1\57\1\62\1\66\1\65"+
			"\1\63\1\64\1\61\1\60\11\3\1\uffff\5\3",
			"\1\2\1\uffff\14\2\22\uffff\1\2\31\uffff\10\2\2\uffff\7\3\1\uffff\1\3",
			"\3\3\1\2\1\uffff\1\111\1\114\1\120\1\117\1\115\1\116\3\2\1\113\1\112"+
			"\1\100\1\uffff\1\3\1\uffff\1\3\6\uffff\1\3\6\uffff\1\3\1\77\2\3\2\uffff"+
			"\5\3\1\uffff\1\3\1\uffff\2\3\1\uffff\5\3\1\uffff\4\3\1\101\1\104\1\110"+
			"\1\107\1\105\1\106\1\103\1\102\11\3\1\uffff\5\3",
			"\1\3\1\uffff\1\3\1\2\1\uffff\14\2\22\uffff\1\121\1\uffff\1\3\13\uffff"+
			"\1\3\4\uffff\1\3\6\uffff\1\122\1\125\1\131\1\130\1\126\1\127\1\124\1"+
			"\123",
			"\2\3\1\2\1\uffff\1\144\1\147\1\153\1\152\1\150\1\151\3\2\1\146\1\145"+
			"\1\133\1\uffff\1\3\10\uffff\1\3\6\uffff\1\3\1\132\2\3\2\uffff\5\3\1\uffff"+
			"\1\3\1\uffff\2\3\1\uffff\5\3\1\uffff\1\3\1\uffff\2\3\1\134\1\137\1\143"+
			"\1\142\1\140\1\141\1\136\1\135\11\3\1\uffff\5\3",
			"\2\3\1\2\1\uffff\1\166\1\171\1\175\1\174\1\172\1\173\3\2\1\170\1\167"+
			"\1\155\1\uffff\1\3\10\uffff\1\3\6\uffff\1\3\1\154\2\3\2\uffff\5\3\1\uffff"+
			"\1\3\1\uffff\2\3\1\uffff\5\3\1\uffff\1\3\1\uffff\2\3\1\156\1\161\1\165"+
			"\1\164\1\162\1\163\1\160\1\157\11\3\1\uffff\5\3",
			"\2\3\1\2\1\uffff\1\u0088\1\u008b\1\u008f\1\u008e\1\u008c\1\u008d\3\2"+
			"\1\u008a\1\u0089\1\177\1\uffff\1\3\10\uffff\1\3\6\uffff\1\3\1\176\2\3"+
			"\2\uffff\5\3\1\uffff\1\3\1\uffff\2\3\1\uffff\5\3\1\uffff\1\3\1\uffff"+
			"\2\3\1\u0080\1\u0083\1\u0087\1\u0086\1\u0084\1\u0085\1\u0082\1\u0081"+
			"\11\3\1\uffff\5\3",
			"\1\2\1\uffff\1\u0098\1\u009b\1\u009f\1\u009e\1\u009c\1\u009d\3\2\1\u009a"+
			"\1\u0099\1\2\22\uffff\1\2\20\uffff\1\3\2\uffff\1\3\5\uffff\1\u0090\1"+
			"\u0093\1\u0097\1\u0096\1\u0094\1\u0095\1\u0092\1\u0091",
			"\1\2\1\uffff\14\2\22\uffff\1\2\31\uffff\10\2\111\uffff\1\3",
			"\1\2\1\uffff\14\2\1\uffff\1\3\20\uffff\1\2\2\uffff\1\3\26\uffff\10\2",
			"\1\2\1\uffff\14\2\22\uffff\1\2\2\uffff\1\3\26\uffff\10\2",
			"\1\2\131\uffff\1\3\1\uffff\1\2",
			"\1\3\1\uffff\1\2",
			"\1\3\1\uffff\1\2",
			"\1\3\1\uffff\1\2",
			"\1\3\1\uffff\1\2",
			"\1\3\1\uffff\1\2",
			"\1\3\1\uffff\1\2",
			"\1\3\1\uffff\1\2",
			"\1\3\1\uffff\1\2",
			"\1\3\1\uffff\1\3\40\uffff\3\3\2\uffff\5\3\3\uffff\2\3\1\uffff\1\3\1"+
			"\2\2\3\4\uffff\1\3\1\uffff\10\3\13\uffff\4\3\4\uffff\1\3\1\uffff\1\3"+
			"\6\uffff\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\13\uffff\2\3\4\uffff"+
			"\3\3\1\uffff\2\3\3\uffff\3\3\3\uffff\1\2",
			"\1\3\1\uffff\1\3\40\uffff\3\3\2\uffff\5\3\3\uffff\2\3\1\uffff\1\3\1"+
			"\2\2\3\4\uffff\1\3\1\uffff\10\3\13\uffff\4\3\4\uffff\1\3\1\uffff\1\3"+
			"\6\uffff\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\13\uffff\2\3\4\uffff"+
			"\3\3\1\uffff\2\3\3\uffff\3\3",
			"\1\3\1\uffff\1\3\40\uffff\3\3\2\uffff\5\3\3\uffff\2\3\1\uffff\1\3\1"+
			"\uffff\2\3\4\uffff\1\3\1\uffff\10\3\13\uffff\4\3\4\uffff\1\3\1\uffff"+
			"\1\3\6\uffff\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\13\uffff\2\3\4\uffff"+
			"\3\3\1\uffff\2\3\3\uffff\3\3\3\uffff\1\2",
			"\1\3\1\uffff\1\3\40\uffff\3\3\2\uffff\5\3\3\uffff\2\3\1\uffff\1\3\1"+
			"\uffff\2\3\4\uffff\1\3\1\uffff\10\3\13\uffff\4\3\4\uffff\1\3\1\uffff"+
			"\1\3\6\uffff\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\13\uffff\2\3\4\uffff"+
			"\3\3\1\uffff\2\3\3\uffff\3\3\3\uffff\1\2",
			"\1\3\1\uffff\1\3\40\uffff\3\3\2\uffff\5\3\3\uffff\2\3\1\uffff\1\3\1"+
			"\uffff\2\3\4\uffff\1\3\1\uffff\10\3\13\uffff\4\3\4\uffff\1\3\1\uffff"+
			"\1\3\6\uffff\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\13\uffff\2\3\4\uffff"+
			"\3\3\1\uffff\2\3\3\uffff\3\3\3\uffff\1\2",
			"\1\3\1\uffff\1\3\40\uffff\3\3\2\uffff\5\3\3\uffff\2\3\1\uffff\1\3\1"+
			"\uffff\2\3\4\uffff\1\3\1\uffff\10\3\13\uffff\4\3\4\uffff\1\3\1\uffff"+
			"\1\3\6\uffff\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\13\uffff\2\3\4\uffff"+
			"\3\3\1\uffff\2\3\3\uffff\3\3\3\uffff\1\2",
			"\1\3\1\uffff\1\3\40\uffff\3\3\2\uffff\5\3\3\uffff\2\3\1\uffff\1\3\1"+
			"\uffff\2\3\4\uffff\1\3\1\uffff\10\3\13\uffff\4\3\4\uffff\1\3\1\uffff"+
			"\1\3\6\uffff\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\13\uffff\2\3\4\uffff"+
			"\3\3\1\uffff\2\3\3\uffff\3\3\3\uffff\1\2",
			"\1\3\1\uffff\1\3\40\uffff\3\3\2\uffff\5\3\3\uffff\2\3\1\uffff\1\3\1"+
			"\uffff\2\3\4\uffff\1\3\1\uffff\10\3\13\uffff\4\3\4\uffff\1\3\1\uffff"+
			"\1\3\6\uffff\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\13\uffff\2\3\4\uffff"+
			"\3\3\1\uffff\2\3\3\uffff\3\3\3\uffff\1\2",
			"\1\3\1\uffff\1\3\40\uffff\3\3\2\uffff\5\3\3\uffff\2\3\1\uffff\1\3\1"+
			"\uffff\2\3\4\uffff\1\3\1\uffff\10\3\13\uffff\4\3\4\uffff\1\3\1\uffff"+
			"\1\3\6\uffff\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\13\uffff\2\3\4\uffff"+
			"\3\3\1\uffff\2\3\3\uffff\3\3\3\uffff\1\2",
			"\1\3\1\uffff\1\3\40\uffff\3\3\2\uffff\5\3\3\uffff\2\3\1\uffff\1\3\1"+
			"\uffff\2\3\4\uffff\1\3\1\uffff\10\3\13\uffff\4\3\4\uffff\1\3\1\uffff"+
			"\1\3\6\uffff\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\13\uffff\2\3\4\uffff"+
			"\3\3\1\uffff\2\3\3\uffff\3\3\3\uffff\1\2",
			"\1\3\1\uffff\1\3\40\uffff\3\3\2\uffff\5\3\3\uffff\2\3\1\uffff\1\3\1"+
			"\uffff\2\3\4\uffff\1\3\1\uffff\10\3\13\uffff\4\3\4\uffff\1\3\1\uffff"+
			"\1\3\6\uffff\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\13\uffff\2\3\4\uffff"+
			"\3\3\1\uffff\2\3\3\uffff\3\3\3\uffff\1\2",
			"\1\3\1\uffff\1\3\40\uffff\3\3\2\uffff\5\3\3\uffff\2\3\1\uffff\1\3\1"+
			"\uffff\2\3\4\uffff\1\3\1\uffff\10\3\13\uffff\4\3\4\uffff\1\3\1\uffff"+
			"\1\3\6\uffff\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\13\uffff\2\3\4\uffff"+
			"\3\3\1\uffff\2\3\3\uffff\3\3\3\uffff\1\2",
			"\1\3\1\uffff\1\3\40\uffff\3\3\2\uffff\5\3\3\uffff\2\3\1\uffff\1\3\1"+
			"\uffff\2\3\4\uffff\1\3\1\uffff\10\3\13\uffff\4\3\4\uffff\1\3\1\uffff"+
			"\1\3\6\uffff\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\13\uffff\2\3\4\uffff"+
			"\3\3\1\uffff\2\3\3\uffff\3\3\3\uffff\1\2",
			"\1\3\1\uffff\1\3\40\uffff\3\3\2\uffff\5\3\3\uffff\2\3\1\uffff\1\3\1"+
			"\uffff\2\3\4\uffff\1\3\1\uffff\10\3\13\uffff\4\3\4\uffff\1\3\1\uffff"+
			"\1\3\6\uffff\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\13\uffff\2\3\4\uffff"+
			"\3\3\1\uffff\2\3\3\uffff\3\3\3\uffff\1\2",
			"\1\3\1\uffff\1\3\40\uffff\3\3\2\uffff\5\3\3\uffff\2\3\1\uffff\1\3\1"+
			"\uffff\2\3\4\uffff\1\3\1\uffff\10\3\13\uffff\4\3\4\uffff\1\3\1\uffff"+
			"\1\3\6\uffff\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\13\uffff\2\3\4\uffff"+
			"\3\3\1\uffff\2\3\3\uffff\3\3\3\uffff\1\2",
			"\1\3\1\uffff\1\3\40\uffff\3\3\2\uffff\5\3\3\uffff\2\3\1\uffff\1\3\1"+
			"\uffff\2\3\4\uffff\1\3\1\uffff\10\3\13\uffff\4\3\4\uffff\1\3\1\uffff"+
			"\1\3\6\uffff\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\13\uffff\2\3\4\uffff"+
			"\3\3\1\uffff\2\3\3\uffff\3\3\3\uffff\1\2",
			"\1\3\1\uffff\1\3\40\uffff\3\3\2\uffff\5\3\3\uffff\2\3\1\uffff\1\3\1"+
			"\uffff\2\3\4\uffff\1\3\1\uffff\10\3\13\uffff\4\3\4\uffff\1\3\1\uffff"+
			"\1\3\6\uffff\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\13\uffff\2\3\4\uffff"+
			"\3\3\1\uffff\2\3\3\uffff\3\3\3\uffff\1\2",
			"\1\3\1\uffff\1\3\40\uffff\3\3\2\uffff\5\3\3\uffff\2\3\1\uffff\1\3\1"+
			"\uffff\2\3\4\uffff\1\3\1\uffff\10\3\13\uffff\4\3\4\uffff\1\3\1\uffff"+
			"\1\3\6\uffff\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\13\uffff\2\3\4\uffff"+
			"\3\3\1\uffff\2\3\3\uffff\3\3\3\uffff\1\2",
			"\6\3\3\uffff\2\3\44\uffff\1\u00a0\2\uffff\1\3\5\uffff\10\3\113\uffff"+
			"\1\2",
			"\6\3\3\uffff\2\3\44\uffff\1\u00a1\2\uffff\1\3\5\uffff\10\3",
			"\6\3\3\uffff\2\3\44\uffff\1\3\2\uffff\1\3\5\uffff\10\3\20\uffff\1\3"+
			"\72\uffff\1\2",
			"\6\3\3\uffff\2\3\44\uffff\1\3\2\uffff\1\3\5\uffff\10\3\20\uffff\1\3"+
			"\72\uffff\1\2",
			"\6\3\3\uffff\2\3\44\uffff\1\3\2\uffff\1\3\5\uffff\10\3\20\uffff\1\3"+
			"\72\uffff\1\2",
			"\6\3\3\uffff\2\3\44\uffff\1\3\2\uffff\1\3\5\uffff\10\3\20\uffff\1\3"+
			"\72\uffff\1\2",
			"\6\3\3\uffff\2\3\44\uffff\1\3\2\uffff\1\3\5\uffff\10\3\20\uffff\1\3"+
			"\72\uffff\1\2",
			"\6\3\3\uffff\2\3\44\uffff\1\3\2\uffff\1\3\5\uffff\10\3\20\uffff\1\3"+
			"\72\uffff\1\2",
			"\6\3\3\uffff\2\3\44\uffff\1\3\2\uffff\1\3\5\uffff\10\3\20\uffff\1\3"+
			"\72\uffff\1\2",
			"\6\3\3\uffff\2\3\44\uffff\1\3\2\uffff\1\3\5\uffff\10\3\20\uffff\1\3"+
			"\72\uffff\1\2",
			"\1\3\67\uffff\1\3\2\uffff\1\2",
			"\1\3\67\uffff\1\3\2\uffff\1\2",
			"\1\3\67\uffff\1\3\2\uffff\1\2",
			"\1\3\67\uffff\1\3\2\uffff\1\2",
			"\1\3\67\uffff\1\3\2\uffff\1\2",
			"\1\3\67\uffff\1\3\2\uffff\1\2",
			"\1\3\67\uffff\1\3\2\uffff\1\2",
			"\1\3\67\uffff\1\3\2\uffff\1\2",
			"\1\3\1\uffff\1\3\40\uffff\3\3\2\uffff\5\3\3\uffff\2\3\1\uffff\1\3\1"+
			"\2\2\3\4\uffff\1\3\1\uffff\10\3\13\uffff\4\3\4\uffff\1\3\1\uffff\1\3"+
			"\6\uffff\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\13\uffff\2\3\4\uffff"+
			"\3\3\1\uffff\2\3\3\uffff\3\3\3\uffff\1\2",
			"\1\3\1\uffff\1\3\40\uffff\3\3\2\uffff\5\3\3\uffff\2\3\1\uffff\1\3\1"+
			"\2\2\3\4\uffff\1\3\1\uffff\10\3\13\uffff\4\3\4\uffff\1\3\1\uffff\1\3"+
			"\6\uffff\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\13\uffff\2\3\4\uffff"+
			"\3\3\1\uffff\2\3\3\uffff\3\3",
			"\1\3\1\uffff\1\3\40\uffff\3\3\2\uffff\5\3\3\uffff\2\3\1\uffff\1\3\1"+
			"\uffff\2\3\4\uffff\1\3\1\uffff\10\3\13\uffff\4\3\4\uffff\1\3\1\uffff"+
			"\1\3\6\uffff\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\13\uffff\2\3\4\uffff"+
			"\3\3\1\uffff\2\3\3\uffff\3\3\3\uffff\1\2",
			"\1\3\1\uffff\1\3\40\uffff\3\3\2\uffff\5\3\3\uffff\2\3\1\uffff\1\3\1"+
			"\uffff\2\3\4\uffff\1\3\1\uffff\10\3\13\uffff\4\3\4\uffff\1\3\1\uffff"+
			"\1\3\6\uffff\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\13\uffff\2\3\4\uffff"+
			"\3\3\1\uffff\2\3\3\uffff\3\3\3\uffff\1\2",
			"\1\3\1\uffff\1\3\40\uffff\3\3\2\uffff\5\3\3\uffff\2\3\1\uffff\1\3\1"+
			"\uffff\2\3\4\uffff\1\3\1\uffff\10\3\13\uffff\4\3\4\uffff\1\3\1\uffff"+
			"\1\3\6\uffff\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\13\uffff\2\3\4\uffff"+
			"\3\3\1\uffff\2\3\3\uffff\3\3\3\uffff\1\2",
			"\1\3\1\uffff\1\3\40\uffff\3\3\2\uffff\5\3\3\uffff\2\3\1\uffff\1\3\1"+
			"\uffff\2\3\4\uffff\1\3\1\uffff\10\3\13\uffff\4\3\4\uffff\1\3\1\uffff"+
			"\1\3\6\uffff\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\13\uffff\2\3\4\uffff"+
			"\3\3\1\uffff\2\3\3\uffff\3\3\3\uffff\1\2",
			"\1\3\1\uffff\1\3\40\uffff\3\3\2\uffff\5\3\3\uffff\2\3\1\uffff\1\3\1"+
			"\uffff\2\3\4\uffff\1\3\1\uffff\10\3\13\uffff\4\3\4\uffff\1\3\1\uffff"+
			"\1\3\6\uffff\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\13\uffff\2\3\4\uffff"+
			"\3\3\1\uffff\2\3\3\uffff\3\3\3\uffff\1\2",
			"\1\3\1\uffff\1\3\40\uffff\3\3\2\uffff\5\3\3\uffff\2\3\1\uffff\1\3\1"+
			"\uffff\2\3\4\uffff\1\3\1\uffff\10\3\13\uffff\4\3\4\uffff\1\3\1\uffff"+
			"\1\3\6\uffff\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\13\uffff\2\3\4\uffff"+
			"\3\3\1\uffff\2\3\3\uffff\3\3\3\uffff\1\2",
			"\1\3\1\uffff\1\3\40\uffff\3\3\2\uffff\5\3\3\uffff\2\3\1\uffff\1\3\1"+
			"\uffff\2\3\4\uffff\1\3\1\uffff\10\3\13\uffff\4\3\4\uffff\1\3\1\uffff"+
			"\1\3\6\uffff\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\13\uffff\2\3\4\uffff"+
			"\3\3\1\uffff\2\3\3\uffff\3\3\3\uffff\1\2",
			"\1\3\1\uffff\1\3\40\uffff\3\3\2\uffff\5\3\3\uffff\2\3\1\uffff\1\3\1"+
			"\uffff\2\3\4\uffff\1\3\1\uffff\10\3\13\uffff\4\3\4\uffff\1\3\1\uffff"+
			"\1\3\6\uffff\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\13\uffff\2\3\4\uffff"+
			"\3\3\1\uffff\2\3\3\uffff\3\3\3\uffff\1\2",
			"\1\3\1\uffff\1\3\40\uffff\3\3\2\uffff\5\3\3\uffff\2\3\1\uffff\1\3\1"+
			"\uffff\2\3\4\uffff\1\3\1\uffff\10\3\13\uffff\4\3\4\uffff\1\3\1\uffff"+
			"\1\3\6\uffff\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\13\uffff\2\3\4\uffff"+
			"\3\3\1\uffff\2\3\3\uffff\3\3\3\uffff\1\2",
			"\1\3\1\uffff\1\3\40\uffff\3\3\2\uffff\5\3\3\uffff\2\3\1\uffff\1\3\1"+
			"\uffff\2\3\4\uffff\1\3\1\uffff\10\3\13\uffff\4\3\4\uffff\1\3\1\uffff"+
			"\1\3\6\uffff\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\13\uffff\2\3\4\uffff"+
			"\3\3\1\uffff\2\3\3\uffff\3\3\3\uffff\1\2",
			"\1\3\1\uffff\1\3\40\uffff\3\3\2\uffff\5\3\3\uffff\2\3\1\uffff\1\3\1"+
			"\uffff\2\3\4\uffff\1\3\1\uffff\10\3\13\uffff\4\3\4\uffff\1\3\1\uffff"+
			"\1\3\6\uffff\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\13\uffff\2\3\4\uffff"+
			"\3\3\1\uffff\2\3\3\uffff\3\3\3\uffff\1\2",
			"\1\3\1\uffff\1\3\40\uffff\3\3\2\uffff\5\3\3\uffff\2\3\1\uffff\1\3\1"+
			"\uffff\2\3\4\uffff\1\3\1\uffff\10\3\13\uffff\4\3\4\uffff\1\3\1\uffff"+
			"\1\3\6\uffff\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\13\uffff\2\3\4\uffff"+
			"\3\3\1\uffff\2\3\3\uffff\3\3\3\uffff\1\2",
			"\1\3\1\uffff\1\3\40\uffff\3\3\2\uffff\5\3\3\uffff\2\3\1\uffff\1\3\1"+
			"\uffff\2\3\4\uffff\1\3\1\uffff\10\3\13\uffff\4\3\4\uffff\1\3\1\uffff"+
			"\1\3\6\uffff\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\13\uffff\2\3\4\uffff"+
			"\3\3\1\uffff\2\3\3\uffff\3\3\3\uffff\1\2",
			"\1\3\1\uffff\1\3\40\uffff\3\3\2\uffff\5\3\3\uffff\2\3\1\uffff\1\3\1"+
			"\uffff\2\3\4\uffff\1\3\1\uffff\10\3\13\uffff\4\3\4\uffff\1\3\1\uffff"+
			"\1\3\6\uffff\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\13\uffff\2\3\4\uffff"+
			"\3\3\1\uffff\2\3\3\uffff\3\3\3\uffff\1\2",
			"\1\3\1\uffff\1\3\40\uffff\3\3\2\uffff\5\3\3\uffff\2\3\1\uffff\1\3\1"+
			"\uffff\2\3\4\uffff\1\3\1\uffff\10\3\13\uffff\4\3\4\uffff\1\3\1\uffff"+
			"\1\3\6\uffff\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\13\uffff\2\3\4\uffff"+
			"\3\3\1\uffff\2\3\3\uffff\3\3\3\uffff\1\2",
			"\1\3\1\uffff\1\3\40\uffff\3\3\2\uffff\5\3\3\uffff\2\3\1\uffff\1\3\1"+
			"\uffff\2\3\4\uffff\1\3\1\uffff\10\3\13\uffff\4\3\4\uffff\1\3\1\uffff"+
			"\1\3\6\uffff\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\13\uffff\2\3\4\uffff"+
			"\3\3\1\uffff\2\3\3\uffff\3\3\3\uffff\1\2",
			"\1\3\1\uffff\1\3\40\uffff\3\3\2\uffff\5\3\3\uffff\2\3\1\uffff\1\3\1"+
			"\2\2\3\4\uffff\1\3\1\uffff\10\3\13\uffff\4\3\4\uffff\1\3\1\uffff\1\3"+
			"\6\uffff\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\13\uffff\2\3\4\uffff"+
			"\3\3\1\uffff\2\3\3\uffff\3\3\3\uffff\1\2",
			"\1\3\1\uffff\1\3\40\uffff\3\3\2\uffff\5\3\3\uffff\2\3\1\uffff\1\3\1"+
			"\uffff\2\3\4\uffff\1\3\1\uffff\10\3\13\uffff\4\3\4\uffff\1\3\1\uffff"+
			"\1\3\6\uffff\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\13\uffff\2\3\4\uffff"+
			"\3\3\1\uffff\2\3\3\uffff\3\3\3\uffff\1\2",
			"\1\3\1\uffff\1\3\40\uffff\3\3\2\uffff\5\3\3\uffff\2\3\1\uffff\1\3\1"+
			"\uffff\2\3\4\uffff\1\3\1\uffff\10\3\13\uffff\4\3\4\uffff\1\3\1\uffff"+
			"\1\3\6\uffff\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\13\uffff\2\3\4\uffff"+
			"\3\3\1\uffff\2\3\3\uffff\3\3\3\uffff\1\2",
			"\1\3\1\uffff\1\3\40\uffff\3\3\2\uffff\5\3\3\uffff\2\3\1\uffff\1\3\1"+
			"\uffff\2\3\4\uffff\1\3\1\uffff\10\3\13\uffff\4\3\4\uffff\1\3\1\uffff"+
			"\1\3\6\uffff\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\13\uffff\2\3\4\uffff"+
			"\3\3\1\uffff\2\3\3\uffff\3\3\3\uffff\1\2",
			"\1\3\1\uffff\1\3\40\uffff\3\3\2\uffff\5\3\3\uffff\2\3\1\uffff\1\3\1"+
			"\uffff\2\3\4\uffff\1\3\1\uffff\10\3\13\uffff\4\3\4\uffff\1\3\1\uffff"+
			"\1\3\6\uffff\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\13\uffff\2\3\4\uffff"+
			"\3\3\1\uffff\2\3\3\uffff\3\3\3\uffff\1\2",
			"\1\3\1\uffff\1\3\40\uffff\3\3\2\uffff\5\3\3\uffff\2\3\1\uffff\1\3\1"+
			"\uffff\2\3\4\uffff\1\3\1\uffff\10\3\13\uffff\4\3\4\uffff\1\3\1\uffff"+
			"\1\3\6\uffff\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\13\uffff\2\3\4\uffff"+
			"\3\3\1\uffff\2\3\3\uffff\3\3\3\uffff\1\2",
			"\1\3\1\uffff\1\3\40\uffff\3\3\2\uffff\5\3\3\uffff\2\3\1\uffff\1\3\1"+
			"\uffff\2\3\4\uffff\1\3\1\uffff\10\3\13\uffff\4\3\4\uffff\1\3\1\uffff"+
			"\1\3\6\uffff\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\13\uffff\2\3\4\uffff"+
			"\3\3\1\uffff\2\3\3\uffff\3\3\3\uffff\1\2",
			"\1\3\1\uffff\1\3\40\uffff\3\3\2\uffff\5\3\3\uffff\2\3\1\uffff\1\3\1"+
			"\uffff\2\3\4\uffff\1\3\1\uffff\10\3\13\uffff\4\3\4\uffff\1\3\1\uffff"+
			"\1\3\6\uffff\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\13\uffff\2\3\4\uffff"+
			"\3\3\1\uffff\2\3\3\uffff\3\3\3\uffff\1\2",
			"\1\3\1\uffff\1\3\40\uffff\3\3\2\uffff\5\3\3\uffff\2\3\1\uffff\1\3\1"+
			"\uffff\2\3\4\uffff\1\3\1\uffff\10\3\13\uffff\4\3\4\uffff\1\3\1\uffff"+
			"\1\3\6\uffff\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\13\uffff\2\3\4\uffff"+
			"\3\3\1\uffff\2\3\3\uffff\3\3\3\uffff\1\2",
			"\1\3\1\uffff\1\2\133\uffff\1\2",
			"\1\3\1\uffff\1\2",
			"\1\3\42\uffff\1\3\72\uffff\1\2",
			"\1\3\42\uffff\1\3\72\uffff\1\2",
			"\1\3\42\uffff\1\3\72\uffff\1\2",
			"\1\3\42\uffff\1\3\72\uffff\1\2",
			"\1\3\42\uffff\1\3\72\uffff\1\2",
			"\1\3\42\uffff\1\3\72\uffff\1\2",
			"\1\3\42\uffff\1\3\72\uffff\1\2",
			"\1\3\42\uffff\1\3\72\uffff\1\2",
			"\1\3\67\uffff\1\3\2\uffff\1\2",
			"\1\3\67\uffff\1\3\2\uffff\1\2",
			"\1\3\67\uffff\1\3\2\uffff\1\2",
			"\1\3\67\uffff\1\3\2\uffff\1\2",
			"\1\3\67\uffff\1\3\2\uffff\1\2",
			"\1\3\67\uffff\1\3\2\uffff\1\2",
			"\1\3\67\uffff\1\3\2\uffff\1\2",
			"\1\3\67\uffff\1\3\2\uffff\1\2",
			"\1\3\1\uffff\1\2\133\uffff\1\2",
			"\1\3\1\uffff\1\2",
			"\1\3\42\uffff\1\3\72\uffff\1\2",
			"\1\3\42\uffff\1\3\72\uffff\1\2",
			"\1\3\42\uffff\1\3\72\uffff\1\2",
			"\1\3\42\uffff\1\3\72\uffff\1\2",
			"\1\3\42\uffff\1\3\72\uffff\1\2",
			"\1\3\42\uffff\1\3\72\uffff\1\2",
			"\1\3\42\uffff\1\3\72\uffff\1\2",
			"\1\3\42\uffff\1\3\72\uffff\1\2",
			"\1\3\67\uffff\1\3\2\uffff\1\2",
			"\1\3\67\uffff\1\3\2\uffff\1\2",
			"\1\3\67\uffff\1\3\2\uffff\1\2",
			"\1\3\67\uffff\1\3\2\uffff\1\2",
			"\1\3\67\uffff\1\3\2\uffff\1\2",
			"\1\3\67\uffff\1\3\2\uffff\1\2",
			"\1\3\67\uffff\1\3\2\uffff\1\2",
			"\1\3\67\uffff\1\3\2\uffff\1\2",
			"\1\3\1\uffff\1\2\133\uffff\1\2",
			"\1\3\1\uffff\1\2",
			"\1\3\42\uffff\1\3\72\uffff\1\2",
			"\1\3\42\uffff\1\3\72\uffff\1\2",
			"\1\3\42\uffff\1\3\72\uffff\1\2",
			"\1\3\42\uffff\1\3\72\uffff\1\2",
			"\1\3\42\uffff\1\3\72\uffff\1\2",
			"\1\3\42\uffff\1\3\72\uffff\1\2",
			"\1\3\42\uffff\1\3\72\uffff\1\2",
			"\1\3\42\uffff\1\3\72\uffff\1\2",
			"\1\3\67\uffff\1\3\2\uffff\1\2",
			"\1\3\67\uffff\1\3\2\uffff\1\2",
			"\1\3\67\uffff\1\3\2\uffff\1\2",
			"\1\3\67\uffff\1\3\2\uffff\1\2",
			"\1\3\67\uffff\1\3\2\uffff\1\2",
			"\1\3\67\uffff\1\3\2\uffff\1\2",
			"\1\3\67\uffff\1\3\2\uffff\1\2",
			"\1\3\67\uffff\1\3\2\uffff\1\2",
			"\1\3\151\uffff\1\2",
			"\1\3\151\uffff\1\2",
			"\1\3\151\uffff\1\2",
			"\1\3\151\uffff\1\2",
			"\1\3\151\uffff\1\2",
			"\1\3\151\uffff\1\2",
			"\1\3\151\uffff\1\2",
			"\1\3\151\uffff\1\2",
			"\1\3\151\uffff\1\2",
			"\1\3\151\uffff\1\2",
			"\1\3\151\uffff\1\2",
			"\1\3\151\uffff\1\2",
			"\1\3\151\uffff\1\2",
			"\1\3\151\uffff\1\2",
			"\1\3\151\uffff\1\2",
			"\1\3\151\uffff\1\2",
			"\1\3\1\uffff\1\3\40\uffff\3\3\2\uffff\5\3\3\uffff\2\3\1\uffff\1\3\1"+
			"\uffff\2\3\4\uffff\1\3\1\uffff\10\3\13\uffff\4\3\4\uffff\1\3\1\uffff"+
			"\1\3\6\uffff\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\13\uffff\2\3\4\uffff"+
			"\3\3\1\uffff\2\3\3\uffff\3\3\3\uffff\1\2",
			"\1\3\1\uffff\1\3\40\uffff\3\3\2\uffff\5\3\3\uffff\2\3\1\uffff\1\3\1"+
			"\uffff\2\3\4\uffff\1\3\1\uffff\10\3\13\uffff\4\3\4\uffff\1\3\1\uffff"+
			"\1\3\6\uffff\1\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\13\uffff\2\3\4\uffff"+
			"\3\3\1\uffff\2\3\3\uffff\3\3\3\uffff\1\2"
	};

	static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
	static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
	static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
	static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
	static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
	static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
	static final short[][] DFA14_transition;

	static {
		int numStates = DFA14_transitionS.length;
		DFA14_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
		}
	}

	protected class DFA14 extends DFA {

		public DFA14(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 14;
			this.eot = DFA14_eot;
			this.eof = DFA14_eof;
			this.min = DFA14_min;
			this.max = DFA14_max;
			this.accept = DFA14_accept;
			this.special = DFA14_special;
			this.transition = DFA14_transition;
		}
		@Override
		public String getDescription() {
			return "1005:6: ( ( sAnnotationElement )* '.end annotation' )?";
		}
	}

	public static final BitSet FOLLOW_sHead_in_sFile2092 = new BitSet(new long[]{0x0000000000000002L,0x4E41999210000000L,0x0000000000006ED4L});
	public static final BitSet FOLLOW_sAnnotation_in_sFile2096 = new BitSet(new long[]{0x0000000000000002L,0x0040000010000000L,0x00000000000000C4L});
	public static final BitSet FOLLOW_sVisibiltyAnnotation_in_sFile2098 = new BitSet(new long[]{0x0000000000000002L,0x0040000010000000L,0x00000000000000C4L});
	public static final BitSet FOLLOW_sField_in_sFile2103 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_sMethod_in_sFile2105 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_100_in_sHead2119 = new BitSet(new long[]{0x0000040000800000L});
	public static final BitSet FOLLOW_INT_in_sHead2125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_in_sHead2156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_139_in_sHead2196 = new BitSet(new long[]{0xE6B5F3C081500070L,0x0000000000FBFFFFL});
	public static final BitSet FOLLOW_sAnyIdOrString_in_sHead2200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_103_in_sHead2210 = new BitSet(new long[]{0xEFB5F3C0815C7E70L,0x0000000000FBFFFFL});
	public static final BitSet FOLLOW_sAccList_in_sHead2214 = new BitSet(new long[]{0xEFB5F3C0815C7E60L,0x0000000000FBFFFFL});
	public static final BitSet FOLLOW_sInternalNameOrDesc_in_sHead2220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_126_in_sHead2229 = new BitSet(new long[]{0xEFB5F3C0815C7E70L,0x0000000000FBFFFFL});
	public static final BitSet FOLLOW_sAccList_in_sHead2233 = new BitSet(new long[]{0xEFB5F3C0815C7E60L,0x0000000000FBFFFFL});
	public static final BitSet FOLLOW_sInternalNameOrDesc_in_sHead2239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_141_in_sHead2248 = new BitSet(new long[]{0xEFB5F3C0815C7E70L,0x0000000000FBFFFFL});
	public static final BitSet FOLLOW_sInternalNameOrDescACC_in_sHead2252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_121_in_sHead2262 = new BitSet(new long[]{0xEFB5F3C0815C7E70L,0x0000000000FBFFFFL});
	public static final BitSet FOLLOW_sInternalNameOrDescACC_in_sHead2266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_111_in_sHead2275 = new BitSet(new long[]{0xAFB5F3C0805C7E60L,0x0000000000FBFFFFL});
	public static final BitSet FOLLOW_sOwnerAndName_in_sHead2279 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_sMethodDesc_in_sHead2286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sDeprecateAttr_in_sHead2298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_107_in_sHead2308 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_sHead2312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_97_in_sHead2322 = new BitSet(new long[]{0xA6B5F3C080500060L,0x0000000000FBFFFFL});
	public static final BitSet FOLLOW_sId_in_sHead2324 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_sHead2326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_122_in_sHead2339 = new BitSet(new long[]{0xA6B5F3C080500072L,0x0000000000FBFFFFL});
	public static final BitSet FOLLOW_sAccList_in_sHead2344 = new BitSet(new long[]{0xA6B5F3C080500060L,0x0000000000FBFFFFL});
	public static final BitSet FOLLOW_sId_in_sHead2346 = new BitSet(new long[]{0x0400020000000002L});
	public static final BitSet FOLLOW_INNER_in_sHead2354 = new BitSet(new long[]{0xA6B5F3C080500060L,0x0000000000FBFFFFL});
	public static final BitSet FOLLOW_sId_in_sHead2358 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_OUTTER_in_sHead2364 = new BitSet(new long[]{0xA6B5F3C080500060L,0x0000000000FBFFFFL});
	public static final BitSet FOLLOW_sId_in_sHead2368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_132_in_sHead2382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_104_in_sHead2391 = new BitSet(new long[]{0xA6B5F3C080500060L,0x0000000000FBFFFFL});
	public static final BitSet FOLLOW_sId_in_sHead2393 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_sHead2395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_112_in_sHead2407 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_sHead2411 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_sHead2415 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_sHead2419 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_123_in_sHead2430 = new BitSet(new long[]{0x0000000000000000L,0x1010000000000000L});
	public static final BitSet FOLLOW_124_in_sHead2433 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_sHead2437 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_sHead2441 = new BitSet(new long[]{0x0000000000000010L,0x0010000000000000L});
	public static final BitSet FOLLOW_sAccList_in_sHead2445 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_116_in_sHead2447 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_124_in_sHead2449 = new BitSet(new long[]{0x0000000000000000L,0x1010000000000000L});
	public static final BitSet FOLLOW_116_in_sHead2456 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_123_in_sHead2458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sSigAttr_in_sHead2467 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sSynthetic_in_sHead2477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_sSigAttr2493 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_sSigAttr2503 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_108_in_sDeprecateAttr2510 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_142_in_sSynthetic2518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sArrayType_in_sClassDesc2554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OBJECT_TYPE_in_sClassDesc2556 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UP_Z_in_sClassDesc2558 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UP_B_in_sClassDesc2560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UP_S_in_sClassDesc2562 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UP_C_in_sClassDesc2564 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UP_I_in_sClassDesc2566 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UP_J_in_sClassDesc2568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UP_D_in_sClassDesc2570 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UP_F_in_sClassDesc2572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sId_in_sWord2688 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_92_in_sAnnotation2697 = new BitSet(new long[]{0x0020000000000040L});
	public static final BitSet FOLLOW_ANNOTATION_VISIBLITY_in_sAnnotation2702 = new BitSet(new long[]{0xEFB5F3C0815C7E70L,0x0000000000FBFFFFL});
	public static final BitSet FOLLOW_sInternalNameOrDescACC_in_sAnnotation2706 = new BitSet(new long[]{0xA6B5F3C080500062L,0x0002000000FBFFFFL});
	public static final BitSet FOLLOW_METHOD_ANNOTATION_VISIBLITY_in_sAnnotation2733 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_INT_in_sAnnotation2737 = new BitSet(new long[]{0xA6B5F3C080500060L,0x0000000000FBFFFFL});
	public static final BitSet FOLLOW_sId_in_sAnnotation2741 = new BitSet(new long[]{0xA6B5F3C080500062L,0x0002000000FBFFFFL});
	public static final BitSet FOLLOW_sAnnotationElement_in_sAnnotation2770 = new BitSet(new long[]{0xA6B5F3C080500060L,0x0002000000FBFFFFL});
	public static final BitSet FOLLOW_113_in_sAnnotation2773 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_135_in_sVisibiltyAnnotation2788 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_134_in_sVisibiltyAnnotation2792 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_sVisibiltyAnnotation2798 = new BitSet(new long[]{0x0000000000000000L,0x0010000010000000L});
	public static final BitSet FOLLOW_sAnnotationSoot_in_sVisibiltyAnnotation2808 = new BitSet(new long[]{0x0000000000000000L,0x0010000010000000L});
	public static final BitSet FOLLOW_116_in_sVisibiltyAnnotation2813 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_93_in_sVisibiltyAnnotation2815 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_92_in_sAnnotationSoot2825 = new BitSet(new long[]{0x0000000000000000L,0x0010400000000000L});
	public static final BitSet FOLLOW_sAnnotationElementSoot_in_sAnnotationSoot2832 = new BitSet(new long[]{0x0000000000000000L,0x0010400000000000L});
	public static final BitSet FOLLOW_116_in_sAnnotationSoot2840 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_sAnnotationSoot2842 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_110_in_sAnnotationElementSoot2854 = new BitSet(new long[]{0x0000000000000000L,0x2120224D04000000L,0x0000000000001102L});
	public static final BitSet FOLLOW_98_in_sAnnotationElementSoot2857 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_sAnnotationElementSoot2861 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_INT_in_sAnnotationElementSoot2865 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_136_in_sAnnotationElementSoot2899 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_sAnnotationElementSoot2903 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_INT_in_sAnnotationElementSoot2907 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_99_in_sAnnotationElementSoot2939 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_sAnnotationElementSoot2943 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_INT_in_sAnnotationElementSoot2947 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_102_in_sAnnotationElementSoot2980 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_sAnnotationElementSoot2984 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_INT_in_sAnnotationElementSoot2988 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_125_in_sAnnotationElementSoot3021 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_sAnnotationElementSoot3025 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_INT_in_sAnnotationElementSoot3029 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_129_in_sAnnotationElementSoot3063 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_sAnnotationElementSoot3067 = new BitSet(new long[]{0x0008040000000000L});
	public static final BitSet FOLLOW_set_in_sAnnotationElementSoot3071 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_120_in_sAnnotationElementSoot3101 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_sAnnotationElementSoot3105 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_INT_in_sAnnotationElementSoot3109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_109_in_sAnnotationElementSoot3141 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_sAnnotationElementSoot3145 = new BitSet(new long[]{0x0008040000000000L});
	public static final BitSet FOLLOW_set_in_sAnnotationElementSoot3149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_140_in_sAnnotationElementSoot3179 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_sAnnotationElementSoot3183 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_sAnnotationElementSoot3187 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_117_in_sAnnotationElementSoot3218 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_sAnnotationElementSoot3222 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_sAnnotationElementSoot3226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_105_in_sAnnotationElementSoot3256 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_sAnnotationElementSoot3260 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_sAnnotationElementSoot3264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_96_in_sAnnotationElementSoot3295 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_sAnnotationElementSoot3299 = new BitSet(new long[]{0x0000000000000000L,0x0010400000000000L});
	public static final BitSet FOLLOW_sAnnotationElementSoot_in_sAnnotationElementSoot3306 = new BitSet(new long[]{0x0000000000000000L,0x0010400000000000L});
	public static final BitSet FOLLOW_116_in_sAnnotationElementSoot3311 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_95_in_sAnnotationElementSoot3314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_90_in_sAnnotationElementSoot3341 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_sAnnotationElementSoot3345 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_sSubannotationSoot_in_sAnnotationElementSoot3349 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_116_in_sAnnotationElementSoot3351 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_sAnnotationElementSoot3353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_92_in_sSubannotationSoot3375 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_sSubannotationSoot3379 = new BitSet(new long[]{0x0000000000000000L,0x0010400000000000L});
	public static final BitSet FOLLOW_sAnnotationElementSoot_in_sSubannotationSoot3394 = new BitSet(new long[]{0x0000000000000000L,0x0010400000000000L});
	public static final BitSet FOLLOW_116_in_sSubannotationSoot3406 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_sSubannotationSoot3408 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sId_in_sAnnotationElement3429 = new BitSet(new long[]{0x00000080001FFE80L,0x00000000000001FEL});
	public static final BitSet FOLLOW_ID_in_sAnnotationElement3448 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_OBJECT_TYPE_in_sAnnotationElement3455 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_148_in_sAnnotationElement3457 = new BitSet(new long[]{0xA6B5F3C080500060L,0x0000000000FBFFFFL});
	public static final BitSet FOLLOW_sWord_in_sAnnotationElement3461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AT_in_sAnnotationElement3478 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_OBJECT_TYPE_in_sAnnotationElement3482 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_148_in_sAnnotationElement3484 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_sSubannotation_in_sAnnotationElement3488 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_sAnnotationElement3508 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_148_in_sAnnotationElement3512 = new BitSet(new long[]{0x09000000000C7E00L,0x00000000000001FEL});
	public static final BitSet FOLLOW_sClassDesc_in_sAnnotationElement3516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_sAnnotationElement3535 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_148_in_sAnnotationElement3539 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_sAnnotationElement3543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UP_B_in_sAnnotationElement3565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_148_in_sAnnotationElement3568 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_INT_in_sAnnotationElement3572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UP_Z_in_sAnnotationElement3590 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_148_in_sAnnotationElement3593 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_INT_in_sAnnotationElement3597 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UP_S_in_sAnnotationElement3615 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_148_in_sAnnotationElement3618 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_INT_in_sAnnotationElement3622 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UP_C_in_sAnnotationElement3641 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_148_in_sAnnotationElement3644 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_INT_in_sAnnotationElement3648 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UP_I_in_sAnnotationElement3667 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_148_in_sAnnotationElement3670 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_INT_in_sAnnotationElement3674 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UP_J_in_sAnnotationElement3693 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_148_in_sAnnotationElement3696 = new BitSet(new long[]{0x0008040000000000L});
	public static final BitSet FOLLOW_set_in_sAnnotationElement3700 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UP_F_in_sAnnotationElement3722 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_148_in_sAnnotationElement3725 = new BitSet(new long[]{0x0000040008800000L});
	public static final BitSet FOLLOW_set_in_sAnnotationElement3729 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UP_D_in_sAnnotationElement3753 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_148_in_sAnnotationElement3756 = new BitSet(new long[]{0x0000040008800000L});
	public static final BitSet FOLLOW_set_in_sAnnotationElement3760 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_B_in_sAnnotationElement3785 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_148_in_sAnnotationElement3787 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_INT_in_sAnnotationElement3793 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_ARRAY_Z_in_sAnnotationElement3818 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_148_in_sAnnotationElement3820 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_INT_in_sAnnotationElement3826 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_ARRAY_S_in_sAnnotationElement3854 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_148_in_sAnnotationElement3856 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_INT_in_sAnnotationElement3862 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_ARRAY_C_in_sAnnotationElement3886 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_148_in_sAnnotationElement3888 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_INT_in_sAnnotationElement3894 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_ARRAY_I_in_sAnnotationElement3919 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_148_in_sAnnotationElement3921 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_INT_in_sAnnotationElement3927 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_ARRAY_J_in_sAnnotationElement3958 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_148_in_sAnnotationElement3960 = new BitSet(new long[]{0x0008040000000000L});
	public static final BitSet FOLLOW_set_in_sAnnotationElement3966 = new BitSet(new long[]{0x0008040000000002L});
	public static final BitSet FOLLOW_ARRAY_F_in_sAnnotationElement3993 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_148_in_sAnnotationElement3995 = new BitSet(new long[]{0x0000040008800000L});
	public static final BitSet FOLLOW_set_in_sAnnotationElement4001 = new BitSet(new long[]{0x0000040008800002L});
	public static final BitSet FOLLOW_ARRAY_D_in_sAnnotationElement4030 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_148_in_sAnnotationElement4032 = new BitSet(new long[]{0x0000040000800000L});
	public static final BitSet FOLLOW_set_in_sAnnotationElement4038 = new BitSet(new long[]{0x0000040000800002L});
	public static final BitSet FOLLOW_ARRAY_LOW_E_in_sAnnotationElement4070 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_OBJECT_TYPE_in_sAnnotationElement4074 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_148_in_sAnnotationElement4076 = new BitSet(new long[]{0xE6B5F3C081500060L,0x0000000000FBFFFFL});
	public static final BitSet FOLLOW_sWord_in_sAnnotationElement4083 = new BitSet(new long[]{0xE6B5F3C081500062L,0x0000000000FBFFFFL});
	public static final BitSet FOLLOW_STRING_in_sAnnotationElement4088 = new BitSet(new long[]{0xE6B5F3C081500062L,0x0000000000FBFFFFL});
	public static final BitSet FOLLOW_DSTRING_in_sAnnotationElement4093 = new BitSet(new long[]{0xE6B5F3C081500062L,0x0000000000FBFFFFL});
	public static final BitSet FOLLOW_ARRAY_AND_in_sAnnotationElement4117 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_OBJECT_TYPE_in_sAnnotationElement4121 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_148_in_sAnnotationElement4123 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ARRAY_AT_in_sAnnotationElement4125 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_148_in_sAnnotationElement4127 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_sSubannotation_in_sAnnotationElement4133 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
	public static final BitSet FOLLOW_ARRAY_LOW_C_in_sAnnotationElement4153 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_148_in_sAnnotationElement4155 = new BitSet(new long[]{0x09000000000C7E00L,0x00000000000001FEL});
	public static final BitSet FOLLOW_sClassDesc_in_sAnnotationElement4161 = new BitSet(new long[]{0x09000000000C7E02L,0x00000000000001FEL});
	public static final BitSet FOLLOW_ARRAY_LOW_S_in_sAnnotationElement4189 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_148_in_sAnnotationElement4191 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_sAnnotationElement4197 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_92_in_sSubannotation4221 = new BitSet(new long[]{0xA6B5F3C080500060L,0x0002000000FBFFFFL});
	public static final BitSet FOLLOW_sAnnotationElement_in_sSubannotation4230 = new BitSet(new long[]{0xA6B5F3C080500060L,0x0002000000FBFFFFL});
	public static final BitSet FOLLOW_113_in_sSubannotation4238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACC_in_sAccList4255 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_sId_in_sMemberName4272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_sMemberName4280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DSTRING_in_sMemberName4287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_118_in_sField4305 = new BitSet(new long[]{0xE6B5F3C081500070L,0x0000000000FBFFFFL});
	public static final BitSet FOLLOW_sAccList_in_sField4309 = new BitSet(new long[]{0xE6B5F3C081500060L,0x0000000000FBFFFFL});
	public static final BitSet FOLLOW_sMemberName_in_sField4313 = new BitSet(new long[]{0x09000000000C7E00L,0x00000000000001FEL});
	public static final BitSet FOLLOW_sClassDesc_in_sField4317 = new BitSet(new long[]{0x0000000000000002L,0x0094100010000000L,0x00000000001046C0L});
	public static final BitSet FOLLOW_148_in_sField4331 = new BitSet(new long[]{0x49080400088C7E00L,0x00000000000001FEL});
	public static final BitSet FOLLOW_STRING_in_sField4336 = new BitSet(new long[]{0x0000000000000002L,0x0094100010000000L,0x00000000000046C0L});
	public static final BitSet FOLLOW_INT_in_sField4357 = new BitSet(new long[]{0x0000000000000002L,0x0094100010000000L,0x00000000000046C0L});
	public static final BitSet FOLLOW_LONG_in_sField4383 = new BitSet(new long[]{0x0000000000000002L,0x0094100010000000L,0x00000000000046C0L});
	public static final BitSet FOLLOW_FLOAT_in_sField4408 = new BitSet(new long[]{0x0000000000000002L,0x0094100010000000L,0x00000000000046C0L});
	public static final BitSet FOLLOW_DOUBLE_in_sField4432 = new BitSet(new long[]{0x0000000000000002L,0x0094100010000000L,0x00000000000046C0L});
	public static final BitSet FOLLOW_sClassDesc_in_sField4455 = new BitSet(new long[]{0x0000000000000002L,0x0094100010000000L,0x00000000000046C0L});
	public static final BitSet FOLLOW_sSigAttr_in_sField4514 = new BitSet(new long[]{0x0000000000000002L,0x0094100010000000L,0x00000000000046C0L});
	public static final BitSet FOLLOW_sDeprecateAttr_in_sField4530 = new BitSet(new long[]{0x0000000000000002L,0x0094100010000000L,0x00000000000046C0L});
	public static final BitSet FOLLOW_sSynthetic_in_sField4546 = new BitSet(new long[]{0x0000000000000002L,0x0094100010000000L,0x00000000000046C0L});
	public static final BitSet FOLLOW_sVisibiltyAnnotation_in_sField4563 = new BitSet(new long[]{0x0000000000000002L,0x0094100010000000L,0x00000000000046C0L});
	public static final BitSet FOLLOW_sAnnotation_in_sField4578 = new BitSet(new long[]{0x0000000000000002L,0x0094100010000000L,0x00000000000046C0L});
	public static final BitSet FOLLOW_114_in_sField4600 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L});
	public static final BitSet FOLLOW_116_in_sField4603 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_118_in_sField4605 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L});
	public static final BitSet FOLLOW_119_in_sField4611 = new BitSet(new long[]{0xA6B5F3C080500060L,0x0000000000FBFFFFL});
	public static final BitSet FOLLOW_sId_in_sField4613 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_sField4615 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L});
	public static final BitSet FOLLOW_130_in_sMethod4636 = new BitSet(new long[]{0xE6B5F3C081500070L,0x0000000000FBFFFFL});
	public static final BitSet FOLLOW_sAccList_in_sMethod4640 = new BitSet(new long[]{0xE6B5F3C081500060L,0x0000000000FBFFFFL});
	public static final BitSet FOLLOW_sMemberName_in_sMethod4644 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_sMethodDesc_in_sMethod4648 = new BitSet(new long[]{0x86B1F38000000050L,0x8008142050F001FEL,0x000000000001C6E1L});
	public static final BitSet FOLLOW_sSigAttr_in_sMethod4667 = new BitSet(new long[]{0x86B1F38000000050L,0x8008142050F001FEL,0x000000000001C6E1L});
	public static final BitSet FOLLOW_sDeprecateAttr_in_sMethod4687 = new BitSet(new long[]{0x86B1F38000000050L,0x8008142050F001FEL,0x000000000001C6E1L});
	public static final BitSet FOLLOW_sSynthetic_in_sMethod4707 = new BitSet(new long[]{0x86B1F38000000050L,0x8008142050F001FEL,0x000000000001C6E1L});
	public static final BitSet FOLLOW_sVisibiltyAnnotation_in_sMethod4728 = new BitSet(new long[]{0x86B1F38000000050L,0x8008142050F001FEL,0x000000000001C6E1L});
	public static final BitSet FOLLOW_sAnnotation_in_sMethod4747 = new BitSet(new long[]{0x86B1F38000000050L,0x8008142050F001FEL,0x000000000001C6E1L});
	public static final BitSet FOLLOW_143_in_sMethod4766 = new BitSet(new long[]{0xEFB5F3C0815C7E60L,0x0000000000FBFFFFL});
	public static final BitSet FOLLOW_sInternalNameOrDesc_in_sMethod4770 = new BitSet(new long[]{0x86B1F38000000050L,0x8008142050F001FEL,0x000000000001C6E1L});
	public static final BitSet FOLLOW_94_in_sMethod4791 = new BitSet(new long[]{0x0000000000000000L,0x0010400000000000L});
	public static final BitSet FOLLOW_sAnnotationElementSoot_in_sMethod4796 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_116_in_sMethod4803 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_sMethod4805 = new BitSet(new long[]{0x86B1F38000000050L,0x8008142050F001FEL,0x000000000001C6E1L});
	public static final BitSet FOLLOW_133_in_sMethod4824 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
	public static final BitSet FOLLOW_set_in_sMethod4826 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L,0x00000000000000C0L});
	public static final BitSet FOLLOW_135_in_sMethod4858 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_134_in_sMethod4862 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_sMethod4868 = new BitSet(new long[]{0x0000000000000000L,0x0010000010000000L});
	public static final BitSet FOLLOW_sAnnotationSoot_in_sMethod4916 = new BitSet(new long[]{0x0000000000000000L,0x0010000010000000L});
	public static final BitSet FOLLOW_116_in_sMethod4942 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_93_in_sMethod4944 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L,0x00000000000000C0L});
	public static final BitSet FOLLOW_116_in_sMethod4988 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_133_in_sMethod4990 = new BitSet(new long[]{0x86B1F38000000050L,0x8008142050F001FEL,0x000000000001C6E1L});
	public static final BitSet FOLLOW_code_in_sMethod5010 = new BitSet(new long[]{0x86B1F38000000050L,0x8008142050F001FEL,0x000000000001C6E1L});
	public static final BitSet FOLLOW_115_in_sMethod5035 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_131_in_sMethod5039 = new BitSet(new long[]{0xA6B5F3C080500060L,0x0000000000FBFFFFL});
	public static final BitSet FOLLOW_sId_in_sMethod5041 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_sMethod5043 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_OP0_in_code5098 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IOP_in_code5107 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_INT_in_code5111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IIOP_in_code5120 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_INT_in_code5124 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_INT_in_code5128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LDC_in_code5140 = new BitSet(new long[]{0xEFBDF7C088DC7E70L,0x0000000000FBFFFFL});
	public static final BitSet FOLLOW_INT_in_code5149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LONG_in_code5195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_code5240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_in_code5284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_code5327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sInternalNameOrDescNoString_in_code5370 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_XFIELD_in_code5412 = new BitSet(new long[]{0xAFB5F3C0805C7E60L,0x0000000000FBFFFFL});
	public static final BitSet FOLLOW_sFieldObject_in_code5416 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_XNEWARRAY_in_code5427 = new BitSet(new long[]{0x0000000000000000L,0x00000000000BF800L});
	public static final BitSet FOLLOW_WBOOLEAN_in_code5450 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WBYTE_in_code5470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WSHORT_in_code5490 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WCHAR_in_code5510 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WINTEGER_in_code5530 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WLONG_in_code5550 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WFLOAT_in_code5570 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WDOUBLE_in_code5590 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_XTYPE_in_code5599 = new BitSet(new long[]{0xEFB5F3C0815C7E70L,0x0000000000FBFFFFL});
	public static final BitSet FOLLOW_sInternalNameOrDescACC_in_code5603 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOP_in_code5612 = new BitSet(new long[]{0x0420028000000050L,0x00000000000001FEL});
	public static final BitSet FOLLOW_sLabel_in_code5616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_XINVOKE_in_code5626 = new BitSet(new long[]{0xAFB5F3C0805C7E60L,0x0000000000FBFFFFL});
	public static final BitSet FOLLOW_sMethodObject_in_code5630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INVOKEINTERFACE_in_code5641 = new BitSet(new long[]{0xAFB5F3C0805C7E60L,0x0000000000FBFFFFL});
	public static final BitSet FOLLOW_sMethodObject_in_code5645 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_INT_in_code5647 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INVOKEDYNAMIC_in_code5658 = new BitSet(new long[]{0xAFB5F3C0805C7E60L,0x0000000000FBFFFFL});
	public static final BitSet FOLLOW_sMethodObject_in_code5662 = new BitSet(new long[]{0xA6B5F3C080500060L,0x0000000000FBFFFFL});
	public static final BitSet FOLLOW_sId_in_code5664 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_sMethodDesc_in_code5666 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_code5668 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_sInvokeDynamicE_in_code5670 = new BitSet(new long[]{0x1000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_88_in_code5673 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_sInvokeDynamicE_in_code5675 = new BitSet(new long[]{0x1000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_code5679 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULTIANEWARRAY_in_code5689 = new BitSet(new long[]{0x09000000000C7E00L,0x00000000000001FEL});
	public static final BitSet FOLLOW_sClassDesc_in_code5693 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_INT_in_code5697 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sLabel_in_code5710 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_146_in_code5712 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_101_in_code5719 = new BitSet(new long[]{0xA6B5F3C080500060L,0x0000000000FBFFFFL});
	public static final BitSet FOLLOW_sId_in_code5723 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_FROM_in_code5725 = new BitSet(new long[]{0x0420028000000050L,0x00000000000001FEL});
	public static final BitSet FOLLOW_sLabel_in_code5729 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_TO_in_code5731 = new BitSet(new long[]{0x0420028000000050L,0x00000000000001FEL});
	public static final BitSet FOLLOW_sLabel_in_code5735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_USING_in_code5737 = new BitSet(new long[]{0x0420028000000050L,0x00000000000001FEL});
	public static final BitSet FOLLOW_sLabel_in_code5741 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_127_in_code5748 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_STACK_in_code5750 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_149_in_code5753 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_code5761 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_127_in_code5769 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_LOCALS_in_code5771 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_149_in_code5774 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_code5781 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_106_in_code5789 = new BitSet(new long[]{0xA6B5F3C080500060L,0x0000000000FBFFFFL});
	public static final BitSet FOLLOW_sId_in_code5791 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_code5793 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_128_in_code5802 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_INT_in_code5806 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_144_in_code5816 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_INT_in_code5820 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_150_in_code5822 = new BitSet(new long[]{0xE6B5F3C081500060L,0x0000000000FBFFFFL});
	public static final BitSet FOLLOW_sMemberName_in_code5826 = new BitSet(new long[]{0x09000000000C7E00L,0x00000000000001FEL});
	public static final BitSet FOLLOW_sClassDesc_in_code5830 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_151_in_code5833 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STRING_in_code5837 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_FROM_in_code5841 = new BitSet(new long[]{0x0420028000000050L,0x00000000000001FEL});
	public static final BitSet FOLLOW_sLabel_in_code5845 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_TO_in_code5847 = new BitSet(new long[]{0x0420028000000050L,0x00000000000001FEL});
	public static final BitSet FOLLOW_sLabel_in_code5851 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sSwitch_in_code5864 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_METHOD_DESC_WITHOUT_RET_in_sInvokeDynamicE5874 = new BitSet(new long[]{0x4008040008800000L});
	public static final BitSet FOLLOW_set_in_sInvokeDynamicE5876 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_METHOD_DESC_WITHOUT_RET_in_sMethodDesc5896 = new BitSet(new long[]{0x09000000000C7E00L,0x00000000000005FEL});
	public static final BitSet FOLLOW_sClassDesc_in_sMethodDesc5899 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_TYPE_in_sMethodDesc5901 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOOKUPSWITCH_in_sSwitch5919 = new BitSet(new long[]{0x0000040000400000L});
	public static final BitSet FOLLOW_INT_in_sSwitch5926 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_146_in_sSwitch5928 = new BitSet(new long[]{0x0420028000000050L,0x00000000000001FEL});
	public static final BitSet FOLLOW_sLabel_in_sSwitch5932 = new BitSet(new long[]{0x0000040000400000L});
	public static final BitSet FOLLOW_DEFAULT_in_sSwitch5939 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_146_in_sSwitch5941 = new BitSet(new long[]{0x0420028000000050L,0x00000000000001FEL});
	public static final BitSet FOLLOW_sLabel_in_sSwitch5945 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TABLESWITCH_in_sSwitch5959 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_INT_in_sSwitch5965 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_147_in_sSwitch5967 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_HIGH_in_sSwitch5969 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_148_in_sSwitch5971 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_INT_in_sSwitch5975 = new BitSet(new long[]{0x0420028000400050L,0x00000000000001FEL});
	public static final BitSet FOLLOW_sLabel_in_sSwitch5980 = new BitSet(new long[]{0x0420028000400050L,0x00000000000001FEL});
	public static final BitSet FOLLOW_DEFAULT_in_sSwitch5989 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_146_in_sSwitch5991 = new BitSet(new long[]{0x0420028000000050L,0x00000000000001FEL});
	public static final BitSet FOLLOW_sLabel_in_sSwitch5995 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TABLESWITCH_in_sSwitch6012 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_INT_in_sSwitch6018 = new BitSet(new long[]{0x0420028000400050L,0x00000000000001FEL});
	public static final BitSet FOLLOW_sLabel_in_sSwitch6023 = new BitSet(new long[]{0x0420028000400050L,0x00000000000001FEL});
	public static final BitSet FOLLOW_DEFAULT_in_sSwitch6032 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_146_in_sSwitch6034 = new BitSet(new long[]{0x0420028000000050L,0x00000000000001FEL});
	public static final BitSet FOLLOW_sLabel_in_sSwitch6038 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sArrayType_in_sInternalNameOrDesc6068 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OBJECT_TYPE_in_sInternalNameOrDesc6074 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sId_in_sInternalNameOrDesc6087 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DSTRING_in_sInternalNameOrDesc6097 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_sInternalNameOrDesc6107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sArrayType_in_sInternalNameOrDescACC6135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OBJECT_TYPE_in_sInternalNameOrDescACC6141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sAnyId_in_sInternalNameOrDescACC6158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DSTRING_in_sInternalNameOrDescACC6172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_sInternalNameOrDescACC6186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sArrayType_in_sInternalNameOrDescNoString6214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OBJECT_TYPE_in_sInternalNameOrDescNoString6220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sAnyId_in_sInternalNameOrDescNoString6233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACC_in_sAnyId6251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sId_in_sAnyId6255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sAnyId_in_sAnyIdOrString6274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_sAnyIdOrString6284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DSTRING_in_sAnyIdOrString6294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sArrayType_in_sOwnerAndName6320 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_145_in_sOwnerAndName6322 = new BitSet(new long[]{0xA6B5F3C080500070L,0x0000000000FBFFFFL});
	public static final BitSet FOLLOW_sAnyId_in_sOwnerAndName6326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sClassDesc_in_sOwnerAndName6338 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_89_in_sOwnerAndName6340 = new BitSet(new long[]{0xA6B5F3C080500070L,0x0000000000FBFFFFL});
	public static final BitSet FOLLOW_sAnyId_in_sOwnerAndName6344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sId_in_sOwnerAndName6356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sArrayType_in_sMethodObject6383 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_145_in_sMethodObject6385 = new BitSet(new long[]{0xA6B5F3C080500070L,0x0000000000FBFFFFL});
	public static final BitSet FOLLOW_sAnyId_in_sMethodObject6389 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_sClassDesc_in_sMethodObject6405 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_89_in_sMethodObject6407 = new BitSet(new long[]{0xA6B5F3C080500070L,0x0000000000FBFFFFL});
	public static final BitSet FOLLOW_sAnyId_in_sMethodObject6411 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_sId_in_sMethodObject6427 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_sMethodDesc_in_sMethodObject6449 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sArrayType_in_sFieldObject6476 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_145_in_sFieldObject6478 = new BitSet(new long[]{0xA6B5F3C080500070L,0x0000000000FBFFFFL});
	public static final BitSet FOLLOW_sAnyId_in_sFieldObject6482 = new BitSet(new long[]{0x09000000000C7E00L,0x00000000000001FEL});
	public static final BitSet FOLLOW_sClassDesc_in_sFieldObject6498 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_89_in_sFieldObject6500 = new BitSet(new long[]{0xA6B5F3C080500070L,0x0000000000FBFFFFL});
	public static final BitSet FOLLOW_sAnyId_in_sFieldObject6504 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_146_in_sFieldObject6506 = new BitSet(new long[]{0x09000000000C7E00L,0x00000000000001FEL});
	public static final BitSet FOLLOW_sId_in_sFieldObject6522 = new BitSet(new long[]{0x09000000000C7E00L,0x00000000000001FEL});
	public static final BitSet FOLLOW_sClassDesc_in_sFieldObject6544 = new BitSet(new long[]{0x0000000000000002L});
}

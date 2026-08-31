package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.A0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5062A0 {

    /* JADX INFO: renamed from: a */
    static final int f19257a = m22834c(1, 3);

    /* JADX INFO: renamed from: b */
    static final int f19258b = m22834c(1, 4);

    /* JADX INFO: renamed from: c */
    static final int f19259c = m22834c(2, 0);

    /* JADX INFO: renamed from: d */
    static final int f19260d = m22834c(3, 2);

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: renamed from: com.google.protobuf.A0$b */
    public static class b {

        /* JADX INFO: renamed from: A */
        public static final b f19261A;

        /* JADX INFO: renamed from: B */
        public static final b f19262B;

        /* JADX INFO: renamed from: C */
        public static final b f19263C;

        /* JADX INFO: renamed from: D */
        public static final b f19264D;

        /* JADX INFO: renamed from: E */
        public static final b f19265E;

        /* JADX INFO: renamed from: F */
        private static final /* synthetic */ b[] f19266F;

        /* JADX INFO: renamed from: c */
        public static final b f19267c;

        /* JADX INFO: renamed from: d */
        public static final b f19268d;

        /* JADX INFO: renamed from: e */
        public static final b f19269e;

        /* JADX INFO: renamed from: f */
        public static final b f19270f;

        /* JADX INFO: renamed from: r */
        public static final b f19271r;

        /* JADX INFO: renamed from: s */
        public static final b f19272s;

        /* JADX INFO: renamed from: t */
        public static final b f19273t;

        /* JADX INFO: renamed from: u */
        public static final b f19274u;

        /* JADX INFO: renamed from: v */
        public static final b f19275v;

        /* JADX INFO: renamed from: w */
        public static final b f19276w;

        /* JADX INFO: renamed from: x */
        public static final b f19277x;

        /* JADX INFO: renamed from: y */
        public static final b f19278y;

        /* JADX INFO: renamed from: z */
        public static final b f19279z;

        /* JADX INFO: renamed from: a */
        private final c f19280a;

        /* JADX INFO: renamed from: b */
        private final int f19281b;

        /* JADX INFO: renamed from: com.google.protobuf.A0$b$a */
        final enum a extends b {
            a(String str, int i7, c cVar, int i8) {
                super(str, i7, cVar, i8);
            }
        }

        /* JADX INFO: renamed from: com.google.protobuf.A0$b$b, reason: collision with other inner class name */
        final enum C7687b extends b {
            C7687b(String str, int i7, c cVar, int i8) {
                super(str, i7, cVar, i8);
            }
        }

        /* JADX INFO: renamed from: com.google.protobuf.A0$b$c */
        final enum c extends b {
            c(String str, int i7, c cVar, int i8) {
                super(str, i7, cVar, i8);
            }
        }

        /* JADX INFO: renamed from: com.google.protobuf.A0$b$d */
        final enum d extends b {
            d(String str, int i7, c cVar, int i8) {
                super(str, i7, cVar, i8);
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            f19267c = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f19268d = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f19269e = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f19270f = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            f19271r = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            f19272s = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            f19273t = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            f19274u = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            f19275v = aVar;
            c cVar3 = c.MESSAGE;
            C7687b c7687b = new C7687b("GROUP", 9, cVar3, 3);
            f19276w = c7687b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f19277x = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f19278y = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f19279z = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f19261A = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f19262B = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            f19263C = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            f19264D = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            f19265E = bVar14;
            f19266F = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c7687b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f19266F.clone();
        }

        /* JADX INFO: renamed from: c */
        public c m22835c() {
            return this.f19280a;
        }

        /* JADX INFO: renamed from: d */
        public int m22836d() {
            return this.f19281b;
        }

        private b(String str, int i7, c cVar, int i8) {
            super(str, i7);
            this.f19280a = cVar;
            this.f19281b = i8;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.A0$c */
    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(AbstractC5104i.f19401b),
        ENUM(null),
        MESSAGE(null);


        /* JADX INFO: renamed from: a */
        private final Object f19292a;

        c(Object obj) {
            this.f19292a = obj;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m22832a(int i7) {
        return i7 >>> 3;
    }

    /* JADX INFO: renamed from: b */
    public static int m22833b(int i7) {
        return i7 & 7;
    }

    /* JADX INFO: renamed from: c */
    static int m22834c(int i7, int i8) {
        return (i7 << 3) | i8;
    }
}

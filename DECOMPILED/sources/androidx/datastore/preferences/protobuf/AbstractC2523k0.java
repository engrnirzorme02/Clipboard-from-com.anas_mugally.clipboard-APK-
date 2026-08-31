package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2523k0 {

    /* JADX INFO: renamed from: a */
    static final int f9591a = m11550c(1, 3);

    /* JADX INFO: renamed from: b */
    static final int f9592b = m11550c(1, 4);

    /* JADX INFO: renamed from: c */
    static final int f9593c = m11550c(2, 0);

    /* JADX INFO: renamed from: d */
    static final int f9594d = m11550c(3, 2);

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
    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k0$b */
    public static class b {

        /* JADX INFO: renamed from: A */
        public static final b f9595A;

        /* JADX INFO: renamed from: B */
        public static final b f9596B;

        /* JADX INFO: renamed from: C */
        public static final b f9597C;

        /* JADX INFO: renamed from: D */
        public static final b f9598D;

        /* JADX INFO: renamed from: E */
        public static final b f9599E;

        /* JADX INFO: renamed from: F */
        private static final /* synthetic */ b[] f9600F;

        /* JADX INFO: renamed from: c */
        public static final b f9601c;

        /* JADX INFO: renamed from: d */
        public static final b f9602d;

        /* JADX INFO: renamed from: e */
        public static final b f9603e;

        /* JADX INFO: renamed from: f */
        public static final b f9604f;

        /* JADX INFO: renamed from: r */
        public static final b f9605r;

        /* JADX INFO: renamed from: s */
        public static final b f9606s;

        /* JADX INFO: renamed from: t */
        public static final b f9607t;

        /* JADX INFO: renamed from: u */
        public static final b f9608u;

        /* JADX INFO: renamed from: v */
        public static final b f9609v;

        /* JADX INFO: renamed from: w */
        public static final b f9610w;

        /* JADX INFO: renamed from: x */
        public static final b f9611x;

        /* JADX INFO: renamed from: y */
        public static final b f9612y;

        /* JADX INFO: renamed from: z */
        public static final b f9613z;

        /* JADX INFO: renamed from: a */
        private final c f9614a;

        /* JADX INFO: renamed from: b */
        private final int f9615b;

        /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k0$b$a */
        final enum a extends b {
            a(String str, int i7, c cVar, int i8) {
                super(str, i7, cVar, i8);
            }
        }

        /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k0$b$b, reason: collision with other inner class name */
        final enum C7663b extends b {
            C7663b(String str, int i7, c cVar, int i8) {
                super(str, i7, cVar, i8);
            }
        }

        /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k0$b$c */
        final enum c extends b {
            c(String str, int i7, c cVar, int i8) {
                super(str, i7, cVar, i8);
            }
        }

        /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k0$b$d */
        final enum d extends b {
            d(String str, int i7, c cVar, int i8) {
                super(str, i7, cVar, i8);
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            f9601c = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f9602d = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f9603e = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f9604f = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            f9605r = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            f9606s = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            f9607t = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            f9608u = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            f9609v = aVar;
            c cVar3 = c.MESSAGE;
            C7663b c7663b = new C7663b("GROUP", 9, cVar3, 3);
            f9610w = c7663b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f9611x = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f9612y = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f9613z = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f9595A = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f9596B = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            f9597C = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            f9598D = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            f9599E = bVar14;
            f9600F = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c7663b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f9600F.clone();
        }

        /* JADX INFO: renamed from: c */
        public c m11551c() {
            return this.f9614a;
        }

        /* JADX INFO: renamed from: d */
        public int m11552d() {
            return this.f9615b;
        }

        private b(String str, int i7, c cVar, int i8) {
            super(str, i7);
            this.f9614a = cVar;
            this.f9615b = i8;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k0$c */
    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(AbstractC2512f.f9510b),
        ENUM(null),
        MESSAGE(null);


        /* JADX INFO: renamed from: a */
        private final Object f9626a;

        c(Object obj) {
            this.f9626a = obj;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m11548a(int i7) {
        return i7 >>> 3;
    }

    /* JADX INFO: renamed from: b */
    public static int m11549b(int i7) {
        return i7 & 7;
    }

    /* JADX INFO: renamed from: c */
    static int m11550c(int i7, int i8) {
        return (i7 << 3) | i8;
    }
}

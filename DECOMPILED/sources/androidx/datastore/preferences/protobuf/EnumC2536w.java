package androidx.datastore.preferences.protobuf;

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
/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.w */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2536w {

    /* JADX INFO: renamed from: d */
    public static final EnumC2536w f9731d;

    /* JADX INFO: renamed from: e */
    public static final EnumC2536w f9732e;

    /* JADX INFO: renamed from: f */
    public static final EnumC2536w f9733f;

    /* JADX INFO: renamed from: r */
    public static final EnumC2536w f9734r;

    /* JADX INFO: renamed from: s */
    public static final EnumC2536w f9735s;

    /* JADX INFO: renamed from: t */
    public static final EnumC2536w f9736t;

    /* JADX INFO: renamed from: u */
    public static final EnumC2536w f9737u;

    /* JADX INFO: renamed from: v */
    public static final EnumC2536w f9738v;

    /* JADX INFO: renamed from: w */
    public static final EnumC2536w f9739w;

    /* JADX INFO: renamed from: x */
    public static final EnumC2536w f9740x;

    /* JADX INFO: renamed from: y */
    private static final /* synthetic */ EnumC2536w[] f9741y;

    /* JADX INFO: renamed from: a */
    private final Class f9742a;

    /* JADX INFO: renamed from: b */
    private final Class f9743b;

    /* JADX INFO: renamed from: c */
    private final Object f9744c;

    static {
        EnumC2536w enumC2536w = new EnumC2536w("VOID", 0, Void.class, Void.class, null);
        f9731d = enumC2536w;
        Class cls = Integer.TYPE;
        EnumC2536w enumC2536w2 = new EnumC2536w("INT", 1, cls, Integer.class, 0);
        f9732e = enumC2536w2;
        EnumC2536w enumC2536w3 = new EnumC2536w("LONG", 2, Long.TYPE, Long.class, 0L);
        f9733f = enumC2536w3;
        EnumC2536w enumC2536w4 = new EnumC2536w("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f9734r = enumC2536w4;
        EnumC2536w enumC2536w5 = new EnumC2536w("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f9735s = enumC2536w5;
        EnumC2536w enumC2536w6 = new EnumC2536w("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f9736t = enumC2536w6;
        EnumC2536w enumC2536w7 = new EnumC2536w("STRING", 6, String.class, String.class, "");
        f9737u = enumC2536w7;
        EnumC2536w enumC2536w8 = new EnumC2536w("BYTE_STRING", 7, AbstractC2512f.class, AbstractC2512f.class, AbstractC2512f.f9510b);
        f9738v = enumC2536w8;
        EnumC2536w enumC2536w9 = new EnumC2536w("ENUM", 8, cls, Integer.class, null);
        f9739w = enumC2536w9;
        EnumC2536w enumC2536w10 = new EnumC2536w("MESSAGE", 9, Object.class, Object.class, null);
        f9740x = enumC2536w10;
        f9741y = new EnumC2536w[]{enumC2536w, enumC2536w2, enumC2536w3, enumC2536w4, enumC2536w5, enumC2536w6, enumC2536w7, enumC2536w8, enumC2536w9, enumC2536w10};
    }

    private EnumC2536w(String str, int i7, Class cls, Class cls2, Object obj) {
        super(str, i7);
        this.f9742a = cls;
        this.f9743b = cls2;
        this.f9744c = obj;
    }

    public static EnumC2536w valueOf(String str) {
        return (EnumC2536w) Enum.valueOf(EnumC2536w.class, str);
    }

    public static EnumC2536w[] values() {
        return (EnumC2536w[]) f9741y.clone();
    }

    /* JADX INFO: renamed from: c */
    public Class m11658c() {
        return this.f9743b;
    }
}

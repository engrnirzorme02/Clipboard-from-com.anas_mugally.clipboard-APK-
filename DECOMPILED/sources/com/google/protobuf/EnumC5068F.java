package com.google.protobuf;

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
/* JADX INFO: renamed from: com.google.protobuf.F */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC5068F {

    /* JADX INFO: renamed from: d */
    public static final EnumC5068F f19313d;

    /* JADX INFO: renamed from: e */
    public static final EnumC5068F f19314e;

    /* JADX INFO: renamed from: f */
    public static final EnumC5068F f19315f;

    /* JADX INFO: renamed from: r */
    public static final EnumC5068F f19316r;

    /* JADX INFO: renamed from: s */
    public static final EnumC5068F f19317s;

    /* JADX INFO: renamed from: t */
    public static final EnumC5068F f19318t;

    /* JADX INFO: renamed from: u */
    public static final EnumC5068F f19319u;

    /* JADX INFO: renamed from: v */
    public static final EnumC5068F f19320v;

    /* JADX INFO: renamed from: w */
    public static final EnumC5068F f19321w;

    /* JADX INFO: renamed from: x */
    public static final EnumC5068F f19322x;

    /* JADX INFO: renamed from: y */
    private static final /* synthetic */ EnumC5068F[] f19323y;

    /* JADX INFO: renamed from: a */
    private final Class f19324a;

    /* JADX INFO: renamed from: b */
    private final Class f19325b;

    /* JADX INFO: renamed from: c */
    private final Object f19326c;

    static {
        EnumC5068F enumC5068F = new EnumC5068F("VOID", 0, Void.class, Void.class, null);
        f19313d = enumC5068F;
        Class cls = Integer.TYPE;
        EnumC5068F enumC5068F2 = new EnumC5068F("INT", 1, cls, Integer.class, 0);
        f19314e = enumC5068F2;
        EnumC5068F enumC5068F3 = new EnumC5068F("LONG", 2, Long.TYPE, Long.class, 0L);
        f19315f = enumC5068F3;
        EnumC5068F enumC5068F4 = new EnumC5068F("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f19316r = enumC5068F4;
        EnumC5068F enumC5068F5 = new EnumC5068F("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f19317s = enumC5068F5;
        EnumC5068F enumC5068F6 = new EnumC5068F("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f19318t = enumC5068F6;
        EnumC5068F enumC5068F7 = new EnumC5068F("STRING", 6, String.class, String.class, "");
        f19319u = enumC5068F7;
        EnumC5068F enumC5068F8 = new EnumC5068F("BYTE_STRING", 7, AbstractC5104i.class, AbstractC5104i.class, AbstractC5104i.f19401b);
        f19320v = enumC5068F8;
        EnumC5068F enumC5068F9 = new EnumC5068F("ENUM", 8, cls, Integer.class, null);
        f19321w = enumC5068F9;
        EnumC5068F enumC5068F10 = new EnumC5068F("MESSAGE", 9, Object.class, Object.class, null);
        f19322x = enumC5068F10;
        f19323y = new EnumC5068F[]{enumC5068F, enumC5068F2, enumC5068F3, enumC5068F4, enumC5068F5, enumC5068F6, enumC5068F7, enumC5068F8, enumC5068F9, enumC5068F10};
    }

    private EnumC5068F(String str, int i7, Class cls, Class cls2, Object obj) {
        super(str, i7);
        this.f19324a = cls;
        this.f19325b = cls2;
        this.f19326c = obj;
    }

    public static EnumC5068F valueOf(String str) {
        return (EnumC5068F) Enum.valueOf(EnumC5068F.class, str);
    }

    public static EnumC5068F[] values() {
        return (EnumC5068F[]) f19323y.clone();
    }

    /* JADX INFO: renamed from: c */
    public Class m22908c() {
        return this.f19325b;
    }
}

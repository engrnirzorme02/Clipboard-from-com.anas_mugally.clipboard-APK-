package p040E6;

import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: E6.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0395d {

    /* JADX INFO: renamed from: a */
    private final boolean f1598a;

    /* JADX INFO: renamed from: b */
    private final boolean f1599b;

    /* JADX INFO: renamed from: c */
    private final boolean f1600c;

    /* JADX INFO: renamed from: d */
    private final boolean f1601d;

    /* JADX INFO: renamed from: e */
    private final boolean f1602e;

    /* JADX INFO: renamed from: f */
    private final boolean f1603f;

    /* JADX INFO: renamed from: g */
    private final String f1604g;

    /* JADX INFO: renamed from: h */
    private final boolean f1605h;

    /* JADX INFO: renamed from: i */
    private final boolean f1606i;

    /* JADX INFO: renamed from: j */
    private final String f1607j;

    /* JADX INFO: renamed from: k */
    private final boolean f1608k;

    /* JADX INFO: renamed from: l */
    private final boolean f1609l;

    /* JADX INFO: renamed from: m */
    private final boolean f1610m;

    /* JADX INFO: renamed from: n */
    private final boolean f1611n;

    /* JADX INFO: renamed from: o */
    private final boolean f1612o;

    /* JADX INFO: renamed from: p */
    private EnumC0392a f1613p;

    public C0395d(boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, String prettyPrintIndent, boolean z13, boolean z14, String classDiscriminator, boolean z15, boolean z16, InterfaceC0398g interfaceC0398g, boolean z17, boolean z18, boolean z19, EnumC0392a classDiscriminatorMode) {
        AbstractC6118n.m27187e(prettyPrintIndent, "prettyPrintIndent");
        AbstractC6118n.m27187e(classDiscriminator, "classDiscriminator");
        AbstractC6118n.m27187e(classDiscriminatorMode, "classDiscriminatorMode");
        this.f1598a = z7;
        this.f1599b = z8;
        this.f1600c = z9;
        this.f1601d = z10;
        this.f1602e = z11;
        this.f1603f = z12;
        this.f1604g = prettyPrintIndent;
        this.f1605h = z13;
        this.f1606i = z14;
        this.f1607j = classDiscriminator;
        this.f1608k = z15;
        this.f1609l = z16;
        this.f1610m = z17;
        this.f1611n = z18;
        this.f1612o = z19;
        this.f1613p = classDiscriminatorMode;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1676a() {
        return this.f1612o;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1677b() {
        return this.f1608k;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m1678c() {
        return this.f1601d;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1679d() {
        return this.f1611n;
    }

    /* JADX INFO: renamed from: e */
    public final String m1680e() {
        return this.f1607j;
    }

    /* JADX INFO: renamed from: f */
    public final EnumC0392a m1681f() {
        return this.f1613p;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m1682g() {
        return this.f1605h;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m1683h() {
        return this.f1610m;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m1684i() {
        return this.f1598a;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m1685j() {
        return this.f1603f;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m1686k() {
        return this.f1599b;
    }

    /* JADX INFO: renamed from: l */
    public final InterfaceC0398g m1687l() {
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m1688m() {
        return this.f1602e;
    }

    /* JADX INFO: renamed from: n */
    public final String m1689n() {
        return this.f1604g;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m1690o() {
        return this.f1609l;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m1691p() {
        return this.f1606i;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m1692q() {
        return this.f1600c;
    }

    public String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f1598a + ", ignoreUnknownKeys=" + this.f1599b + ", isLenient=" + this.f1600c + ", allowStructuredMapKeys=" + this.f1601d + ", prettyPrint=" + this.f1602e + ", explicitNulls=" + this.f1603f + ", prettyPrintIndent='" + this.f1604g + "', coerceInputValues=" + this.f1605h + ", useArrayPolymorphism=" + this.f1606i + ", classDiscriminator='" + this.f1607j + "', allowSpecialFloatingPointValues=" + this.f1608k + ", useAlternativeNames=" + this.f1609l + ", namingStrategy=" + ((Object) null) + ", decodeEnumsCaseInsensitive=" + this.f1610m + ", allowTrailingComma=" + this.f1611n + ", allowComments=" + this.f1612o + ", classDiscriminatorMode=" + this.f1613p + ')';
    }

    public /* synthetic */ C0395d(boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, String str, boolean z13, boolean z14, String str2, boolean z15, boolean z16, InterfaceC0398g interfaceC0398g, boolean z17, boolean z18, boolean z19, EnumC0392a enumC0392a, int i7, AbstractC6112h abstractC6112h) {
        this((i7 & 1) != 0 ? false : z7, (i7 & 2) != 0 ? false : z8, (i7 & 4) != 0 ? false : z9, (i7 & 8) != 0 ? false : z10, (i7 & 16) != 0 ? false : z11, (i7 & 32) != 0 ? true : z12, (i7 & 64) != 0 ? "    " : str, (i7 & 128) != 0 ? false : z13, (i7 & 256) != 0 ? false : z14, (i7 & 512) != 0 ? "type" : str2, (i7 & 1024) != 0 ? false : z15, (i7 & 2048) == 0 ? z16 : true, (i7 & 4096) != 0 ? null : interfaceC0398g, (i7 & 8192) != 0 ? false : z17, (i7 & 16384) != 0 ? false : z18, (i7 & 32768) != 0 ? false : z19, (i7 & 65536) != 0 ? EnumC0392a.POLYMORPHIC : enumC0392a);
    }
}

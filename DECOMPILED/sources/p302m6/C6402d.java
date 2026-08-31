package p302m6;

import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: m6.d */
/* JADX INFO: loaded from: classes.dex */
public final class C6402d {

    /* JADX INFO: renamed from: a */
    public static final C6402d f24427a = new C6402d();

    /* JADX INFO: renamed from: b */
    public static final Charset f24428b;

    /* JADX INFO: renamed from: c */
    public static final Charset f24429c;

    /* JADX INFO: renamed from: d */
    public static final Charset f24430d;

    /* JADX INFO: renamed from: e */
    public static final Charset f24431e;

    /* JADX INFO: renamed from: f */
    public static final Charset f24432f;

    /* JADX INFO: renamed from: g */
    public static final Charset f24433g;

    /* JADX INFO: renamed from: h */
    private static volatile Charset f24434h;

    /* JADX INFO: renamed from: i */
    private static volatile Charset f24435i;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        AbstractC6118n.m27186d(charsetForName, "forName(...)");
        f24428b = charsetForName;
        Charset charsetForName2 = Charset.forName("UTF-16");
        AbstractC6118n.m27186d(charsetForName2, "forName(...)");
        f24429c = charsetForName2;
        Charset charsetForName3 = Charset.forName("UTF-16BE");
        AbstractC6118n.m27186d(charsetForName3, "forName(...)");
        f24430d = charsetForName3;
        Charset charsetForName4 = Charset.forName("UTF-16LE");
        AbstractC6118n.m27186d(charsetForName4, "forName(...)");
        f24431e = charsetForName4;
        Charset charsetForName5 = Charset.forName("US-ASCII");
        AbstractC6118n.m27186d(charsetForName5, "forName(...)");
        f24432f = charsetForName5;
        Charset charsetForName6 = Charset.forName("ISO-8859-1");
        AbstractC6118n.m27186d(charsetForName6, "forName(...)");
        f24433g = charsetForName6;
    }

    private C6402d() {
    }

    /* JADX INFO: renamed from: a */
    public final Charset m27520a() {
        Charset charset = f24435i;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32BE");
        AbstractC6118n.m27186d(charsetForName, "forName(...)");
        f24435i = charsetForName;
        return charsetForName;
    }

    /* JADX INFO: renamed from: b */
    public final Charset m27521b() {
        Charset charset = f24434h;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32LE");
        AbstractC6118n.m27186d(charsetForName, "forName(...)");
        f24434h = charsetForName;
        return charsetForName;
    }
}

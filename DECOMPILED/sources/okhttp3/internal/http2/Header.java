package okhttp3.internal.http2;

import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p072I6.C0651h;

/* JADX INFO: loaded from: classes.dex */
public final class Header {

    /* JADX INFO: renamed from: d */
    public static final Companion f25791d = new Companion(null);

    /* JADX INFO: renamed from: e */
    public static final C0651h f25792e;

    /* JADX INFO: renamed from: f */
    public static final C0651h f25793f;

    /* JADX INFO: renamed from: g */
    public static final C0651h f25794g;

    /* JADX INFO: renamed from: h */
    public static final C0651h f25795h;

    /* JADX INFO: renamed from: i */
    public static final C0651h f25796i;

    /* JADX INFO: renamed from: j */
    public static final C0651h f25797j;

    /* JADX INFO: renamed from: a */
    public final C0651h f25798a;

    /* JADX INFO: renamed from: b */
    public final C0651h f25799b;

    /* JADX INFO: renamed from: c */
    public final int f25800c;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        private Companion() {
        }
    }

    static {
        C0651h.a aVar = C0651h.f2562d;
        f25792e = aVar.m3114d(":");
        f25793f = aVar.m3114d(":status");
        f25794g = aVar.m3114d(":method");
        f25795h = aVar.m3114d(":path");
        f25796i = aVar.m3114d(":scheme");
        f25797j = aVar.m3114d(":authority");
    }

    public Header(C0651h name, C0651h value) {
        AbstractC6118n.m27187e(name, "name");
        AbstractC6118n.m27187e(value, "value");
        this.f25798a = name;
        this.f25799b = value;
        this.f25800c = name.m3090F() + 32 + value.m3090F();
    }

    /* JADX INFO: renamed from: a */
    public final C0651h m29116a() {
        return this.f25798a;
    }

    /* JADX INFO: renamed from: b */
    public final C0651h m29117b() {
        return this.f25799b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return AbstractC6118n.m27183a(this.f25798a, header.f25798a) && AbstractC6118n.m27183a(this.f25799b, header.f25799b);
    }

    public int hashCode() {
        return (this.f25798a.hashCode() * 31) + this.f25799b.hashCode();
    }

    public String toString() {
        return this.f25798a.m3094M() + ": " + this.f25799b.m3094M();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Header(String name, String value) {
        AbstractC6118n.m27187e(name, "name");
        AbstractC6118n.m27187e(value, "value");
        C0651h.a aVar = C0651h.f2562d;
        this(aVar.m3114d(name), aVar.m3114d(value));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(C0651h name, String value) {
        this(name, C0651h.f2562d.m3114d(value));
        AbstractC6118n.m27187e(name, "name");
        AbstractC6118n.m27187e(value, "value");
    }
}

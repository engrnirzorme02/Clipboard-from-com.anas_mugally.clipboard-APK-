package p067I1;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;
import p019C1.InterfaceC0130f;
import p183Y1.AbstractC2022k;

/* JADX INFO: renamed from: I1.h */
/* JADX INFO: loaded from: classes.dex */
public class C0588h implements InterfaceC0130f {

    /* JADX INFO: renamed from: b */
    private final InterfaceC0589i f2246b;

    /* JADX INFO: renamed from: c */
    private final URL f2247c;

    /* JADX INFO: renamed from: d */
    private final String f2248d;

    /* JADX INFO: renamed from: e */
    private String f2249e;

    /* JADX INFO: renamed from: f */
    private URL f2250f;

    /* JADX INFO: renamed from: g */
    private volatile byte[] f2251g;

    /* JADX INFO: renamed from: h */
    private int f2252h;

    public C0588h(URL url) {
        this(url, InterfaceC0589i.f2254b);
    }

    /* JADX INFO: renamed from: d */
    private byte[] m2595d() {
        if (this.f2251g == null) {
            this.f2251g = m2598c().getBytes(InterfaceC0130f.f689a);
        }
        return this.f2251g;
    }

    /* JADX INFO: renamed from: f */
    private String m2596f() {
        if (TextUtils.isEmpty(this.f2249e)) {
            String string = this.f2248d;
            if (TextUtils.isEmpty(string)) {
                string = ((URL) AbstractC2022k.m8408e(this.f2247c)).toString();
            }
            this.f2249e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$[]");
        }
        return this.f2249e;
    }

    /* JADX INFO: renamed from: g */
    private URL m2597g() {
        if (this.f2250f == null) {
            this.f2250f = new URL(m2596f());
        }
        return this.f2250f;
    }

    @Override // p019C1.InterfaceC0130f
    /* JADX INFO: renamed from: a */
    public void mo590a(MessageDigest messageDigest) {
        messageDigest.update(m2595d());
    }

    /* JADX INFO: renamed from: c */
    public String m2598c() {
        String str = this.f2248d;
        return str != null ? str : ((URL) AbstractC2022k.m8408e(this.f2247c)).toString();
    }

    /* JADX INFO: renamed from: e */
    public Map m2599e() {
        return this.f2246b.mo2601a();
    }

    @Override // p019C1.InterfaceC0130f
    public boolean equals(Object obj) {
        if (obj instanceof C0588h) {
            C0588h c0588h = (C0588h) obj;
            if (m2598c().equals(c0588h.m2598c()) && this.f2246b.equals(c0588h.f2246b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public URL m2600h() {
        return m2597g();
    }

    @Override // p019C1.InterfaceC0130f
    public int hashCode() {
        if (this.f2252h == 0) {
            int iHashCode = m2598c().hashCode();
            this.f2252h = iHashCode;
            this.f2252h = (iHashCode * 31) + this.f2246b.hashCode();
        }
        return this.f2252h;
    }

    public String toString() {
        return m2598c();
    }

    public C0588h(String str) {
        this(str, InterfaceC0589i.f2254b);
    }

    public C0588h(URL url, InterfaceC0589i interfaceC0589i) {
        this.f2247c = (URL) AbstractC2022k.m8408e(url);
        this.f2248d = null;
        this.f2246b = (InterfaceC0589i) AbstractC2022k.m8408e(interfaceC0589i);
    }

    public C0588h(String str, InterfaceC0589i interfaceC0589i) {
        this.f2247c = null;
        this.f2248d = AbstractC2022k.m8406c(str);
        this.f2246b = (InterfaceC0589i) AbstractC2022k.m8408e(interfaceC0589i);
    }
}

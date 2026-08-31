package p019C1;

import java.security.MessageDigest;
import p183Y1.AbstractC2022k;

/* JADX INFO: renamed from: C1.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0131g {

    /* JADX INFO: renamed from: e */
    private static final b f690e = new a();

    /* JADX INFO: renamed from: a */
    private final Object f691a;

    /* JADX INFO: renamed from: b */
    private final b f692b;

    /* JADX INFO: renamed from: c */
    private final String f693c;

    /* JADX INFO: renamed from: d */
    private volatile byte[] f694d;

    /* JADX INFO: renamed from: C1.g$a */
    class a implements b {
        a() {
        }

        @Override // p019C1.C0131g.b
        /* JADX INFO: renamed from: a */
        public void mo598a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    /* JADX INFO: renamed from: C1.g$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo598a(byte[] bArr, Object obj, MessageDigest messageDigest);
    }

    private C0131g(String str, Object obj, b bVar) {
        this.f693c = AbstractC2022k.m8406c(str);
        this.f691a = obj;
        this.f692b = (b) AbstractC2022k.m8408e(bVar);
    }

    /* JADX INFO: renamed from: a */
    public static C0131g m591a(String str, Object obj, b bVar) {
        return new C0131g(str, obj, bVar);
    }

    /* JADX INFO: renamed from: b */
    private static b m592b() {
        return f690e;
    }

    /* JADX INFO: renamed from: d */
    private byte[] m593d() {
        if (this.f694d == null) {
            this.f694d = this.f693c.getBytes(InterfaceC0130f.f689a);
        }
        return this.f694d;
    }

    /* JADX INFO: renamed from: e */
    public static C0131g m594e(String str) {
        return new C0131g(str, null, m592b());
    }

    /* JADX INFO: renamed from: f */
    public static C0131g m595f(String str, Object obj) {
        return new C0131g(str, obj, m592b());
    }

    /* JADX INFO: renamed from: c */
    public Object m596c() {
        return this.f691a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0131g) {
            return this.f693c.equals(((C0131g) obj).f693c);
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public void m597g(Object obj, MessageDigest messageDigest) {
        this.f692b.mo598a(m593d(), obj, messageDigest);
    }

    public int hashCode() {
        return this.f693c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f693c + "'}";
    }
}

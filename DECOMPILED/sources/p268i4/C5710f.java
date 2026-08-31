package p268i4;

import java.io.File;
import p300m4.C6346g;

/* JADX INFO: renamed from: i4.f */
/* JADX INFO: loaded from: classes.dex */
public class C5710f {

    /* JADX INFO: renamed from: c */
    private static final b f21781c = new b();

    /* JADX INFO: renamed from: a */
    private final C6346g f21782a;

    /* JADX INFO: renamed from: b */
    private InterfaceC5708d f21783b;

    /* JADX INFO: renamed from: i4.f$b */
    private static final class b implements InterfaceC5708d {
        private b() {
        }

        @Override // p268i4.InterfaceC5708d
        /* JADX INFO: renamed from: a */
        public void mo25275a() {
        }

        @Override // p268i4.InterfaceC5708d
        /* JADX INFO: renamed from: b */
        public String mo25276b() {
            return null;
        }

        @Override // p268i4.InterfaceC5708d
        /* JADX INFO: renamed from: c */
        public byte[] mo25277c() {
            return null;
        }

        @Override // p268i4.InterfaceC5708d
        /* JADX INFO: renamed from: d */
        public void mo25278d() {
        }

        @Override // p268i4.InterfaceC5708d
        /* JADX INFO: renamed from: e */
        public void mo25279e(long j7, String str) {
        }
    }

    public C5710f(C6346g c6346g) {
        this.f21782a = c6346g;
        this.f21783b = f21781c;
    }

    /* JADX INFO: renamed from: d */
    private File m25285d(String str) {
        return this.f21782a.m27349q(str, "userlog");
    }

    /* JADX INFO: renamed from: a */
    public void m25286a() {
        this.f21783b.mo25278d();
    }

    /* JADX INFO: renamed from: b */
    public byte[] m25287b() {
        return this.f21783b.mo25277c();
    }

    /* JADX INFO: renamed from: c */
    public String m25288c() {
        return this.f21783b.mo25276b();
    }

    /* JADX INFO: renamed from: e */
    public final void m25289e(String str) {
        this.f21783b.mo25275a();
        this.f21783b = f21781c;
        if (str == null) {
            return;
        }
        m25290f(m25285d(str), 65536);
    }

    /* JADX INFO: renamed from: f */
    void m25290f(File file, int i7) {
        this.f21783b = new C5713i(file, i7);
    }

    /* JADX INFO: renamed from: g */
    public void m25291g(long j7, String str) {
        this.f21783b.mo25279e(j7, str);
    }

    public C5710f(C6346g c6346g, String str) {
        this(c6346g);
        m25289e(str);
    }
}

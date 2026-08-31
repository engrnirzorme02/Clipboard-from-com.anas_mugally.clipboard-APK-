package p035E1;

import com.bumptech.glide.load.data.InterfaceC3219d;
import java.io.File;
import java.util.List;
import p019C1.EnumC0125a;
import p019C1.InterfaceC0130f;
import p067I1.InterfaceC0594n;
import p190Z1.AbstractC2084b;

/* JADX INFO: renamed from: E1.w */
/* JADX INFO: loaded from: classes.dex */
class C0302w implements InterfaceC0285f, InterfaceC3219d.a {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0285f.a f1255a;

    /* JADX INFO: renamed from: b */
    private final C0286g f1256b;

    /* JADX INFO: renamed from: c */
    private int f1257c;

    /* JADX INFO: renamed from: d */
    private int f1258d = -1;

    /* JADX INFO: renamed from: e */
    private InterfaceC0130f f1259e;

    /* JADX INFO: renamed from: f */
    private List f1260f;

    /* JADX INFO: renamed from: r */
    private int f1261r;

    /* JADX INFO: renamed from: s */
    private volatile InterfaceC0594n.a f1262s;

    /* JADX INFO: renamed from: t */
    private File f1263t;

    /* JADX INFO: renamed from: u */
    private C0303x f1264u;

    C0302w(C0286g c0286g, InterfaceC0285f.a aVar) {
        this.f1256b = c0286g;
        this.f1255a = aVar;
    }

    /* JADX INFO: renamed from: b */
    private boolean m1466b() {
        return this.f1261r < this.f1260f.size();
    }

    @Override // p035E1.InterfaceC0285f
    /* JADX INFO: renamed from: a */
    public boolean mo1312a() {
        AbstractC2084b.m8604a("ResourceCacheGenerator.startNext");
        try {
            List listM1321c = this.f1256b.m1321c();
            boolean z7 = false;
            if (listM1321c.isEmpty()) {
                AbstractC2084b.m8608e();
                return false;
            }
            List listM1331m = this.f1256b.m1331m();
            if (listM1331m.isEmpty()) {
                if (File.class.equals(this.f1256b.m1336r())) {
                    AbstractC2084b.m8608e();
                    return false;
                }
                throw new IllegalStateException("Failed to find any load path from " + this.f1256b.m1327i() + " to " + this.f1256b.m1336r());
            }
            while (true) {
                if (this.f1260f != null && m1466b()) {
                    this.f1262s = null;
                    while (!z7 && m1466b()) {
                        List list = this.f1260f;
                        int i7 = this.f1261r;
                        this.f1261r = i7 + 1;
                        this.f1262s = ((InterfaceC0594n) list.get(i7)).mo2552a(this.f1263t, this.f1256b.m1338t(), this.f1256b.m1324f(), this.f1256b.m1329k());
                        if (this.f1262s != null && this.f1256b.m1339u(this.f1262s.f2276c.mo930a())) {
                            this.f1262s.f2276c.mo933e(this.f1256b.m1330l(), this);
                            z7 = true;
                        }
                    }
                    AbstractC2084b.m8608e();
                    return z7;
                }
                int i8 = this.f1258d + 1;
                this.f1258d = i8;
                if (i8 >= listM1331m.size()) {
                    int i9 = this.f1257c + 1;
                    this.f1257c = i9;
                    if (i9 >= listM1321c.size()) {
                        AbstractC2084b.m8608e();
                        return false;
                    }
                    this.f1258d = 0;
                }
                InterfaceC0130f interfaceC0130f = (InterfaceC0130f) listM1321c.get(this.f1257c);
                Class cls = (Class) listM1331m.get(this.f1258d);
                this.f1264u = new C0303x(this.f1256b.m1320b(), interfaceC0130f, this.f1256b.m1334p(), this.f1256b.m1338t(), this.f1256b.m1324f(), this.f1256b.m1337s(cls), cls, this.f1256b.m1329k());
                File fileMo2031a = this.f1256b.m1322d().mo2031a(this.f1264u);
                this.f1263t = fileMo2031a;
                if (fileMo2031a != null) {
                    this.f1259e = interfaceC0130f;
                    this.f1260f = this.f1256b.m1328j(fileMo2031a);
                    this.f1261r = 0;
                }
            }
        } catch (Throwable th) {
            AbstractC2084b.m8608e();
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3219d.a
    /* JADX INFO: renamed from: c */
    public void mo1313c(Exception exc) {
        this.f1255a.mo1318h(this.f1264u, exc, this.f1262s.f2276c, EnumC0125a.RESOURCE_DISK_CACHE);
    }

    @Override // p035E1.InterfaceC0285f
    public void cancel() {
        InterfaceC0594n.a aVar = this.f1262s;
        if (aVar != null) {
            aVar.f2276c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3219d.a
    /* JADX INFO: renamed from: f */
    public void mo1314f(Object obj) {
        this.f1255a.mo1316c(this.f1259e, obj, this.f1262s.f2276c, EnumC0125a.RESOURCE_DISK_CACHE, this.f1264u);
    }
}

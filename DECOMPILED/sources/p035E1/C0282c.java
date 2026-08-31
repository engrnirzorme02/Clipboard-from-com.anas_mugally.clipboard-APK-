package p035E1;

import com.bumptech.glide.load.data.InterfaceC3219d;
import java.io.File;
import java.util.List;
import p019C1.EnumC0125a;
import p019C1.InterfaceC0130f;
import p067I1.InterfaceC0594n;
import p190Z1.AbstractC2084b;

/* JADX INFO: renamed from: E1.c */
/* JADX INFO: loaded from: classes.dex */
class C0282c implements InterfaceC0285f, InterfaceC3219d.a {

    /* JADX INFO: renamed from: a */
    private final List f1061a;

    /* JADX INFO: renamed from: b */
    private final C0286g f1062b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC0285f.a f1063c;

    /* JADX INFO: renamed from: d */
    private int f1064d;

    /* JADX INFO: renamed from: e */
    private InterfaceC0130f f1065e;

    /* JADX INFO: renamed from: f */
    private List f1066f;

    /* JADX INFO: renamed from: r */
    private int f1067r;

    /* JADX INFO: renamed from: s */
    private volatile InterfaceC0594n.a f1068s;

    /* JADX INFO: renamed from: t */
    private File f1069t;

    C0282c(C0286g c0286g, InterfaceC0285f.a aVar) {
        this(c0286g.m1321c(), c0286g, aVar);
    }

    /* JADX INFO: renamed from: b */
    private boolean m1311b() {
        return this.f1067r < this.f1066f.size();
    }

    @Override // p035E1.InterfaceC0285f
    /* JADX INFO: renamed from: a */
    public boolean mo1312a() {
        AbstractC2084b.m8604a("DataCacheGenerator.startNext");
        while (true) {
            try {
                boolean z7 = false;
                if (this.f1066f != null && m1311b()) {
                    this.f1068s = null;
                    while (!z7 && m1311b()) {
                        List list = this.f1066f;
                        int i7 = this.f1067r;
                        this.f1067r = i7 + 1;
                        this.f1068s = ((InterfaceC0594n) list.get(i7)).mo2552a(this.f1069t, this.f1062b.m1338t(), this.f1062b.m1324f(), this.f1062b.m1329k());
                        if (this.f1068s != null && this.f1062b.m1339u(this.f1068s.f2276c.mo930a())) {
                            this.f1068s.f2276c.mo933e(this.f1062b.m1330l(), this);
                            z7 = true;
                        }
                    }
                    AbstractC2084b.m8608e();
                    return z7;
                }
                int i8 = this.f1064d + 1;
                this.f1064d = i8;
                if (i8 >= this.f1061a.size()) {
                    AbstractC2084b.m8608e();
                    return false;
                }
                InterfaceC0130f interfaceC0130f = (InterfaceC0130f) this.f1061a.get(this.f1064d);
                File fileMo2031a = this.f1062b.m1322d().mo2031a(new C0283d(interfaceC0130f, this.f1062b.m1334p()));
                this.f1069t = fileMo2031a;
                if (fileMo2031a != null) {
                    this.f1065e = interfaceC0130f;
                    this.f1066f = this.f1062b.m1328j(fileMo2031a);
                    this.f1067r = 0;
                }
            } catch (Throwable th) {
                AbstractC2084b.m8608e();
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3219d.a
    /* JADX INFO: renamed from: c */
    public void mo1313c(Exception exc) {
        this.f1063c.mo1318h(this.f1065e, exc, this.f1068s.f2276c, EnumC0125a.DATA_DISK_CACHE);
    }

    @Override // p035E1.InterfaceC0285f
    public void cancel() {
        InterfaceC0594n.a aVar = this.f1068s;
        if (aVar != null) {
            aVar.f2276c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3219d.a
    /* JADX INFO: renamed from: f */
    public void mo1314f(Object obj) {
        this.f1063c.mo1316c(this.f1065e, obj, this.f1068s.f2276c, EnumC0125a.DATA_DISK_CACHE, this.f1065e);
    }

    C0282c(List list, C0286g c0286g, InterfaceC0285f.a aVar) {
        this.f1064d = -1;
        this.f1061a = list;
        this.f1062b = c0286g;
        this.f1063c = aVar;
    }
}

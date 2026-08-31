package p035E1;

import com.bumptech.glide.C3204d;
import com.bumptech.glide.EnumC3207g;
import com.bumptech.glide.load.data.InterfaceC3220e;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p019C1.C0132h;
import p019C1.InterfaceC0128d;
import p019C1.InterfaceC0130f;
import p019C1.InterfaceC0135k;
import p019C1.InterfaceC0136l;
import p043F1.InterfaceC0404b;
import p051G1.InterfaceC0470a;
import p067I1.InterfaceC0594n;
import p083K1.C0735j;

/* JADX INFO: renamed from: E1.g */
/* JADX INFO: loaded from: classes.dex */
final class C0286g {

    /* JADX INFO: renamed from: a */
    private final List f1075a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private final List f1076b = new ArrayList();

    /* JADX INFO: renamed from: c */
    private C3204d f1077c;

    /* JADX INFO: renamed from: d */
    private Object f1078d;

    /* JADX INFO: renamed from: e */
    private int f1079e;

    /* JADX INFO: renamed from: f */
    private int f1080f;

    /* JADX INFO: renamed from: g */
    private Class f1081g;

    /* JADX INFO: renamed from: h */
    private RunnableC0287h.e f1082h;

    /* JADX INFO: renamed from: i */
    private C0132h f1083i;

    /* JADX INFO: renamed from: j */
    private Map f1084j;

    /* JADX INFO: renamed from: k */
    private Class f1085k;

    /* JADX INFO: renamed from: l */
    private boolean f1086l;

    /* JADX INFO: renamed from: m */
    private boolean f1087m;

    /* JADX INFO: renamed from: n */
    private InterfaceC0130f f1088n;

    /* JADX INFO: renamed from: o */
    private EnumC3207g f1089o;

    /* JADX INFO: renamed from: p */
    private AbstractC0289j f1090p;

    /* JADX INFO: renamed from: q */
    private boolean f1091q;

    /* JADX INFO: renamed from: r */
    private boolean f1092r;

    C0286g() {
    }

    /* JADX INFO: renamed from: a */
    void m1319a() {
        this.f1077c = null;
        this.f1078d = null;
        this.f1088n = null;
        this.f1081g = null;
        this.f1085k = null;
        this.f1083i = null;
        this.f1089o = null;
        this.f1084j = null;
        this.f1090p = null;
        this.f1075a.clear();
        this.f1086l = false;
        this.f1076b.clear();
        this.f1087m = false;
    }

    /* JADX INFO: renamed from: b */
    InterfaceC0404b m1320b() {
        return this.f1077c.m17012b();
    }

    /* JADX INFO: renamed from: c */
    List m1321c() {
        if (!this.f1087m) {
            this.f1087m = true;
            this.f1076b.clear();
            List listM1325g = m1325g();
            int size = listM1325g.size();
            for (int i7 = 0; i7 < size; i7++) {
                InterfaceC0594n.a aVar = (InterfaceC0594n.a) listM1325g.get(i7);
                if (!this.f1076b.contains(aVar.f2274a)) {
                    this.f1076b.add(aVar.f2274a);
                }
                for (int i8 = 0; i8 < aVar.f2275b.size(); i8++) {
                    if (!this.f1076b.contains(aVar.f2275b.get(i8))) {
                        this.f1076b.add((InterfaceC0130f) aVar.f2275b.get(i8));
                    }
                }
            }
        }
        return this.f1076b;
    }

    /* JADX INFO: renamed from: d */
    InterfaceC0470a m1322d() {
        return this.f1082h.mo1380a();
    }

    /* JADX INFO: renamed from: e */
    AbstractC0289j m1323e() {
        return this.f1090p;
    }

    /* JADX INFO: renamed from: f */
    int m1324f() {
        return this.f1080f;
    }

    /* JADX INFO: renamed from: g */
    List m1325g() {
        if (!this.f1086l) {
            this.f1086l = true;
            this.f1075a.clear();
            List listM17033i = this.f1077c.m17019i().m17033i(this.f1078d);
            int size = listM17033i.size();
            for (int i7 = 0; i7 < size; i7++) {
                InterfaceC0594n.a aVarMo2552a = ((InterfaceC0594n) listM17033i.get(i7)).mo2552a(this.f1078d, this.f1079e, this.f1080f, this.f1083i);
                if (aVarMo2552a != null) {
                    this.f1075a.add(aVarMo2552a);
                }
            }
        }
        return this.f1075a;
    }

    /* JADX INFO: renamed from: h */
    C0299t m1326h(Class cls) {
        return this.f1077c.m17019i().m17032h(cls, this.f1081g, this.f1085k);
    }

    /* JADX INFO: renamed from: i */
    Class m1327i() {
        return this.f1078d.getClass();
    }

    /* JADX INFO: renamed from: j */
    List m1328j(File file) {
        return this.f1077c.m17019i().m17033i(file);
    }

    /* JADX INFO: renamed from: k */
    C0132h m1329k() {
        return this.f1083i;
    }

    /* JADX INFO: renamed from: l */
    EnumC3207g m1330l() {
        return this.f1089o;
    }

    /* JADX INFO: renamed from: m */
    List m1331m() {
        return this.f1077c.m17019i().m17034j(this.f1078d.getClass(), this.f1081g, this.f1085k);
    }

    /* JADX INFO: renamed from: n */
    InterfaceC0135k m1332n(InterfaceC0301v interfaceC0301v) {
        return this.f1077c.m17019i().m17035k(interfaceC0301v);
    }

    /* JADX INFO: renamed from: o */
    InterfaceC3220e m1333o(Object obj) {
        return this.f1077c.m17019i().m17036l(obj);
    }

    /* JADX INFO: renamed from: p */
    InterfaceC0130f m1334p() {
        return this.f1088n;
    }

    /* JADX INFO: renamed from: q */
    InterfaceC0128d m1335q(Object obj) {
        return this.f1077c.m17019i().m17037m(obj);
    }

    /* JADX INFO: renamed from: r */
    Class m1336r() {
        return this.f1085k;
    }

    /* JADX INFO: renamed from: s */
    InterfaceC0136l m1337s(Class cls) {
        InterfaceC0136l interfaceC0136l = (InterfaceC0136l) this.f1084j.get(cls);
        if (interfaceC0136l == null) {
            for (Map.Entry entry : this.f1084j.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    interfaceC0136l = (InterfaceC0136l) entry.getValue();
                    break;
                }
            }
        }
        if (interfaceC0136l != null) {
            return interfaceC0136l;
        }
        if (!this.f1084j.isEmpty() || !this.f1091q) {
            return C0735j.m3497c();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    /* JADX INFO: renamed from: t */
    int m1338t() {
        return this.f1079e;
    }

    /* JADX INFO: renamed from: u */
    boolean m1339u(Class cls) {
        return m1326h(cls) != null;
    }

    /* JADX INFO: renamed from: v */
    void m1340v(C3204d c3204d, Object obj, InterfaceC0130f interfaceC0130f, int i7, int i8, AbstractC0289j abstractC0289j, Class cls, Class cls2, EnumC3207g enumC3207g, C0132h c0132h, Map map, boolean z7, boolean z8, RunnableC0287h.e eVar) {
        this.f1077c = c3204d;
        this.f1078d = obj;
        this.f1088n = interfaceC0130f;
        this.f1079e = i7;
        this.f1080f = i8;
        this.f1090p = abstractC0289j;
        this.f1081g = cls;
        this.f1082h = eVar;
        this.f1085k = cls2;
        this.f1089o = enumC3207g;
        this.f1083i = c0132h;
        this.f1084j = map;
        this.f1091q = z7;
        this.f1092r = z8;
    }

    /* JADX INFO: renamed from: w */
    boolean m1341w(InterfaceC0301v interfaceC0301v) {
        return this.f1077c.m17019i().m17038n(interfaceC0301v);
    }

    /* JADX INFO: renamed from: x */
    boolean m1342x() {
        return this.f1092r;
    }

    /* JADX INFO: renamed from: y */
    boolean m1343y(InterfaceC0130f interfaceC0130f) {
        List listM1325g = m1325g();
        int size = listM1325g.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((InterfaceC0594n.a) listM1325g.get(i7)).f2274a.equals(interfaceC0130f)) {
                return true;
            }
        }
        return false;
    }
}

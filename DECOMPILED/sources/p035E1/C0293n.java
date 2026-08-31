package p035E1;

import java.security.MessageDigest;
import java.util.Map;
import p019C1.C0132h;
import p019C1.InterfaceC0130f;
import p183Y1.AbstractC2022k;

/* JADX INFO: renamed from: E1.n */
/* JADX INFO: loaded from: classes.dex */
class C0293n implements InterfaceC0130f {

    /* JADX INFO: renamed from: b */
    private final Object f1219b;

    /* JADX INFO: renamed from: c */
    private final int f1220c;

    /* JADX INFO: renamed from: d */
    private final int f1221d;

    /* JADX INFO: renamed from: e */
    private final Class f1222e;

    /* JADX INFO: renamed from: f */
    private final Class f1223f;

    /* JADX INFO: renamed from: g */
    private final InterfaceC0130f f1224g;

    /* JADX INFO: renamed from: h */
    private final Map f1225h;

    /* JADX INFO: renamed from: i */
    private final C0132h f1226i;

    /* JADX INFO: renamed from: j */
    private int f1227j;

    C0293n(Object obj, InterfaceC0130f interfaceC0130f, int i7, int i8, Map map, Class cls, Class cls2, C0132h c0132h) {
        this.f1219b = AbstractC2022k.m8408e(obj);
        this.f1224g = (InterfaceC0130f) AbstractC2022k.m8409f(interfaceC0130f, "Signature must not be null");
        this.f1220c = i7;
        this.f1221d = i8;
        this.f1225h = (Map) AbstractC2022k.m8408e(map);
        this.f1222e = (Class) AbstractC2022k.m8409f(cls, "Resource class must not be null");
        this.f1223f = (Class) AbstractC2022k.m8409f(cls2, "Transcode class must not be null");
        this.f1226i = (C0132h) AbstractC2022k.m8408e(c0132h);
    }

    @Override // p019C1.InterfaceC0130f
    /* JADX INFO: renamed from: a */
    public void mo590a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // p019C1.InterfaceC0130f
    public boolean equals(Object obj) {
        if (obj instanceof C0293n) {
            C0293n c0293n = (C0293n) obj;
            if (this.f1219b.equals(c0293n.f1219b) && this.f1224g.equals(c0293n.f1224g) && this.f1221d == c0293n.f1221d && this.f1220c == c0293n.f1220c && this.f1225h.equals(c0293n.f1225h) && this.f1222e.equals(c0293n.f1222e) && this.f1223f.equals(c0293n.f1223f) && this.f1226i.equals(c0293n.f1226i)) {
                return true;
            }
        }
        return false;
    }

    @Override // p019C1.InterfaceC0130f
    public int hashCode() {
        if (this.f1227j == 0) {
            int iHashCode = this.f1219b.hashCode();
            this.f1227j = iHashCode;
            int iHashCode2 = (((((iHashCode * 31) + this.f1224g.hashCode()) * 31) + this.f1220c) * 31) + this.f1221d;
            this.f1227j = iHashCode2;
            int iHashCode3 = (iHashCode2 * 31) + this.f1225h.hashCode();
            this.f1227j = iHashCode3;
            int iHashCode4 = (iHashCode3 * 31) + this.f1222e.hashCode();
            this.f1227j = iHashCode4;
            int iHashCode5 = (iHashCode4 * 31) + this.f1223f.hashCode();
            this.f1227j = iHashCode5;
            this.f1227j = (iHashCode5 * 31) + this.f1226i.hashCode();
        }
        return this.f1227j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f1219b + ", width=" + this.f1220c + ", height=" + this.f1221d + ", resourceClass=" + this.f1222e + ", transcodeClass=" + this.f1223f + ", signature=" + this.f1224g + ", hashCode=" + this.f1227j + ", transformations=" + this.f1225h + ", options=" + this.f1226i + '}';
    }
}

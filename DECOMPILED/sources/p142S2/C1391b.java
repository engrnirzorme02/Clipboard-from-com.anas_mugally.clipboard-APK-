package p142S2;

/* JADX INFO: renamed from: S2.b */
/* JADX INFO: loaded from: classes.dex */
public class C1391b {

    /* JADX INFO: renamed from: a */
    private int f4896a = 1;

    /* JADX INFO: renamed from: a */
    public C1391b m5967a(Object obj) {
        this.f4896a = (this.f4896a * 31) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    /* JADX INFO: renamed from: b */
    public int m5968b() {
        return this.f4896a;
    }

    /* JADX INFO: renamed from: c */
    public final C1391b m5969c(boolean z7) {
        this.f4896a = (this.f4896a * 31) + (z7 ? 1 : 0);
        return this;
    }
}

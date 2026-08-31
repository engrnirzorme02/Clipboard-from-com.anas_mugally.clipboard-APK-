package p137R4;

import p186Y4.AbstractC2034b;

/* JADX INFO: renamed from: R4.Q */
/* JADX INFO: loaded from: classes.dex */
public class C1349Q {

    /* JADX INFO: renamed from: a */
    private int f4731a;

    /* JADX INFO: renamed from: b */
    private int f4732b;

    C1349Q(int i7, int i8) {
        AbstractC2034b.m8460d((i7 & 1) == i7, "Generator ID %d contains more than %d reserved bits", Integer.valueOf(i7), 1);
        this.f4732b = i7;
        m5828d(i8);
    }

    /* JADX INFO: renamed from: a */
    public static C1349Q m5826a() {
        return new C1349Q(1, 1);
    }

    /* JADX INFO: renamed from: b */
    public static C1349Q m5827b(int i7) {
        C1349Q c1349q = new C1349Q(0, i7);
        c1349q.m5829c();
        return c1349q;
    }

    /* JADX INFO: renamed from: d */
    private void m5828d(int i7) {
        AbstractC2034b.m8460d((i7 & 1) == this.f4732b, "Cannot supply target ID from different generator ID", new Object[0]);
        this.f4731a = i7;
    }

    /* JADX INFO: renamed from: c */
    public int m5829c() {
        int i7 = this.f4731a;
        this.f4731a = i7 + 2;
        return i7;
    }
}

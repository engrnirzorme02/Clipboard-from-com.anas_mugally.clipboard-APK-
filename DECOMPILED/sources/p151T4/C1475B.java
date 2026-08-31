package p151T4;

import java.util.ArrayList;
import p137R4.C1353V;
import p137R4.C1366m;
import p158U4.C1687k;
import p350s4.C7011e;

/* JADX INFO: renamed from: T4.B */
/* JADX INFO: loaded from: classes.dex */
public final class C1475B {

    /* JADX INFO: renamed from: a */
    private final int f5031a;

    /* JADX INFO: renamed from: b */
    private final boolean f5032b;

    /* JADX INFO: renamed from: c */
    private final C7011e f5033c;

    /* JADX INFO: renamed from: d */
    private final C7011e f5034d;

    /* JADX INFO: renamed from: T4.B$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f5035a;

        static {
            int[] iArr = new int[C1366m.a.values().length];
            f5035a = iArr;
            try {
                iArr[C1366m.a.ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5035a[C1366m.a.REMOVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C1475B(int i7, boolean z7, C7011e c7011e, C7011e c7011e2) {
        this.f5031a = i7;
        this.f5032b = z7;
        this.f5033c = c7011e;
        this.f5034d = c7011e2;
    }

    /* JADX INFO: renamed from: a */
    public static C1475B m6178a(int i7, C1353V c1353v) {
        C7011e c7011e = new C7011e(new ArrayList(), C1687k.m7084c());
        C7011e c7011e2 = new C7011e(new ArrayList(), C1687k.m7084c());
        for (C1366m c1366m : c1353v.m5851d()) {
            int i8 = a.f5035a[c1366m.m5906c().ordinal()];
            if (i8 == 1) {
                c7011e = c7011e.m30620g(c1366m.m5905b().getKey());
            } else if (i8 == 2) {
                c7011e2 = c7011e2.m30620g(c1366m.m5905b().getKey());
            }
        }
        return new C1475B(i7, c1353v.m5858k(), c7011e, c7011e2);
    }

    /* JADX INFO: renamed from: b */
    public C7011e m6179b() {
        return this.f5033c;
    }

    /* JADX INFO: renamed from: c */
    public C7011e m6180c() {
        return this.f5034d;
    }

    /* JADX INFO: renamed from: d */
    public int m6181d() {
        return this.f5031a;
    }

    /* JADX INFO: renamed from: e */
    public boolean m6182e() {
        return this.f5032b;
    }
}

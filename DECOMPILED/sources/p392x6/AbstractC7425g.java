package p392x6;

import p360t6.C7104D;

/* JADX INFO: renamed from: x6.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7425g {

    /* JADX INFO: renamed from: a */
    private static final C7104D f29737a = new C7104D("NO_OWNER");

    /* JADX INFO: renamed from: b */
    private static final C7104D f29738b = new C7104D("ALREADY_LOCKED_BY_OWNER");

    /* JADX INFO: renamed from: a */
    public static final InterfaceC7419a m32876a(boolean z7) {
        return new C7424f(z7);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC7419a m32877b(boolean z7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z7 = false;
        }
        return m32876a(z7);
    }
}

package p318o6;

import p145S5.C1436n;

/* JADX INFO: renamed from: o6.z */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6702z {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC6698x m28297a(InterfaceC6701y0 interfaceC6701y0) {
        return new C6700y(interfaceC6701y0);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC6698x m28298b(InterfaceC6701y0 interfaceC6701y0, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            interfaceC6701y0 = null;
        }
        return m28297a(interfaceC6701y0);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m28299c(InterfaceC6698x interfaceC6698x, Object obj) {
        Throwable thM6075d = C1436n.m6075d(obj);
        return thM6075d == null ? interfaceC6698x.mo28289p0(obj) : interfaceC6698x.mo28288o0(thM6075d);
    }
}

package p352s6;

import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p336q6.InterfaceC6868x;
import p344r6.InterfaceC6919d;

/* JADX INFO: renamed from: s6.s */
/* JADX INFO: loaded from: classes.dex */
public final class C7062s implements InterfaceC6919d {

    /* JADX INFO: renamed from: a */
    private final InterfaceC6868x f28215a;

    public C7062s(InterfaceC6868x interfaceC6868x) {
        this.f28215a = interfaceC6868x;
    }

    @Override // p344r6.InterfaceC6919d
    /* JADX INFO: renamed from: d */
    public Object mo7892d(Object obj, InterfaceC1875e interfaceC1875e) {
        Object objMo29980i = this.f28215a.mo29980i(obj, interfaceC1875e);
        return objMo29980i == AbstractC2005b.m8369e() ? objMo29980i : C1444v.f4971a;
    }
}

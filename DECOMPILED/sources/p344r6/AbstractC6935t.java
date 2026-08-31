package p344r6;

import p173W5.InterfaceC1879i;
import p336q6.EnumC6845a;
import p352s6.AbstractC7056m;
import p360t6.C7104D;

/* JADX INFO: renamed from: r6.t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6935t {

    /* JADX INFO: renamed from: a */
    private static final C7104D f27873a = new C7104D("NONE");

    /* JADX INFO: renamed from: b */
    private static final C7104D f27874b = new C7104D("PENDING");

    /* JADX INFO: renamed from: a */
    public static final InterfaceC6929n m30402a(Object obj) {
        if (obj == null) {
            obj = AbstractC7056m.f28204a;
        }
        return new C6934s(obj);
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC6918c m30405d(InterfaceC6933r interfaceC6933r, InterfaceC1879i interfaceC1879i, int i7, EnumC6845a enumC6845a) {
        return (((i7 < 0 || i7 >= 2) && i7 != -2) || enumC6845a != EnumC6845a.DROP_OLDEST) ? AbstractC6932q.m30394a(interfaceC6933r, interfaceC1879i, i7, enumC6845a) : interfaceC6933r;
    }
}

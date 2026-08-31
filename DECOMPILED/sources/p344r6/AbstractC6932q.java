package p344r6;

import p173W5.InterfaceC1879i;
import p336q6.EnumC6845a;
import p352s6.C7051h;
import p360t6.C7104D;

/* JADX INFO: renamed from: r6.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6932q {

    /* JADX INFO: renamed from: a */
    public static final C7104D f27862a = new C7104D("NO_VALUE");

    /* JADX INFO: renamed from: a */
    public static final InterfaceC6918c m30394a(InterfaceC6931p interfaceC6931p, InterfaceC1879i interfaceC1879i, int i7, EnumC6845a enumC6845a) {
        return ((i7 == 0 || i7 == -3) && enumC6845a == EnumC6845a.SUSPEND) ? interfaceC6931p : new C7051h(interfaceC6931p, interfaceC1879i, i7, enumC6845a);
    }
}

package p216c2;

import p198a2.EnumC2190f;
import p198a2.InterfaceC2193i;
import p250g2.AbstractC5459a;

/* JADX INFO: renamed from: c2.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2996l {
    /* JADX INFO: renamed from: a */
    public static void m14960a(InterfaceC2193i interfaceC2193i, EnumC2190f enumC2190f) {
        if (!(interfaceC2193i instanceof C3003s)) {
            AbstractC5459a.m24668f("ForcedSender", "Expected instance of `TransportImpl`, got `%s`.", interfaceC2193i);
        } else {
            C3005u.m14971c().m14974e().m26265l(((C3003s) interfaceC2193i).m14968d().m14966f(enumC2190f), 1);
        }
    }
}

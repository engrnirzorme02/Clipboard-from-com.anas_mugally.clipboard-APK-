package p147T0;

import android.content.Context;
import p112O0.EnumC1098k;
import p140S0.C1383b;
import p154U0.C1657g;
import p168W0.C1814p;
import p182Y0.InterfaceC2010a;

/* JADX INFO: renamed from: T0.d */
/* JADX INFO: loaded from: classes.dex */
public class C1450d extends AbstractC1449c {
    public C1450d(Context context, InterfaceC2010a interfaceC2010a) {
        super(C1657g.m6915c(context, interfaceC2010a).m6918d());
    }

    @Override // p147T0.AbstractC1449c
    /* JADX INFO: renamed from: b */
    boolean mo6089b(C1814p c1814p) {
        return c1814p.f5901j.m4812b() == EnumC1098k.CONNECTED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p147T0.AbstractC1449c
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean mo6090c(C1383b c1383b) {
        return (c1383b.m5950a() && c1383b.m5953d()) ? false : true;
    }
}

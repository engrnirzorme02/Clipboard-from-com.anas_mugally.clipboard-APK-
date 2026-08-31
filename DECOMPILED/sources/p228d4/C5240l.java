package p228d4;

import androidx.appcompat.app.AbstractC2263x;
import p211b5.InterfaceC2971a;
import p211b5.InterfaceC2972b;
import p268i4.C5718n;

/* JADX INFO: renamed from: d4.l */
/* JADX INFO: loaded from: classes.dex */
public class C5240l {

    /* JADX INFO: renamed from: a */
    private final InterfaceC2971a f19971a;

    public C5240l(InterfaceC2971a interfaceC2971a) {
        this.f19971a = interfaceC2971a;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m24197a(C5233e c5233e, InterfaceC2972b interfaceC2972b) {
        AbstractC2263x.m9328a(interfaceC2972b.get());
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public void m24198b(C5718n c5718n) {
        if (c5718n == null) {
            C5235g.m24179f().m24188k("Didn't successfully register with UserMetadata for rollouts listener");
        } else {
            final C5233e c5233e = new C5233e(c5718n);
            this.f19971a.mo8945a(new InterfaceC2971a.a() { // from class: d4.k
                @Override // p211b5.InterfaceC2971a.a
                /* JADX INFO: renamed from: a */
                public final void mo5341a(InterfaceC2972b interfaceC2972b) {
                    C5240l.m24197a(c5233e, interfaceC2972b);
                }
            });
        }
    }
}

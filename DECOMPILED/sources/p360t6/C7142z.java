package p360t6;

import kotlin.coroutines.jvm.internal.InterfaceC6090e;
import p173W5.InterfaceC1875e;
import p173W5.InterfaceC1879i;
import p180X5.AbstractC2005b;
import p318o6.AbstractC6606E;
import p318o6.AbstractC6649a;

/* JADX INFO: renamed from: t6.z */
/* JADX INFO: loaded from: classes.dex */
public class C7142z extends AbstractC6649a implements InterfaceC6090e {

    /* JADX INFO: renamed from: d */
    public final InterfaceC1875e f28449d;

    public C7142z(InterfaceC1879i interfaceC1879i, InterfaceC1875e interfaceC1875e) {
        super(interfaceC1879i, true, true);
        this.f28449d = interfaceC1875e;
    }

    @Override // p318o6.AbstractC6649a
    /* JADX INFO: renamed from: I0 */
    protected void mo28142I0(Object obj) {
        InterfaceC1875e interfaceC1875e = this.f28449d;
        interfaceC1875e.resumeWith(AbstractC6606E.m27977a(obj, interfaceC1875e));
    }

    @Override // p318o6.C6607E0
    /* JADX INFO: renamed from: a0 */
    protected final boolean mo28031a0() {
        return true;
    }

    @Override // kotlin.coroutines.jvm.internal.InterfaceC6090e
    public final InterfaceC6090e getCallerFrame() {
        InterfaceC1875e interfaceC1875e = this.f28449d;
        if (interfaceC1875e instanceof InterfaceC6090e) {
            return (InterfaceC6090e) interfaceC1875e;
        }
        return null;
    }

    @Override // p318o6.C6607E0
    /* JADX INFO: renamed from: u */
    protected void mo28038u(Object obj) {
        AbstractC7125i.m31458b(AbstractC2005b.m8367c(this.f28449d), AbstractC6606E.m27977a(obj, this.f28449d));
    }
}

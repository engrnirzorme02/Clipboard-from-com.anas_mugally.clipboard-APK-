package p336q6;

import java.util.concurrent.CancellationException;
import p173W5.InterfaceC1875e;
import p173W5.InterfaceC1879i;
import p238e6.InterfaceC5367l;
import p318o6.AbstractC6649a;
import p318o6.C6607E0;
import p318o6.C6703z0;

/* JADX INFO: renamed from: q6.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6852h extends AbstractC6649a implements InterfaceC6851g {

    /* JADX INFO: renamed from: d */
    private final InterfaceC6851g f27479d;

    public AbstractC6852h(InterfaceC1879i interfaceC1879i, InterfaceC6851g interfaceC6851g, boolean z7, boolean z8) {
        super(interfaceC1879i, z7, z8);
        this.f27479d = interfaceC6851g;
    }

    @Override // p318o6.C6607E0
    /* JADX INFO: renamed from: A */
    public void mo28017A(Throwable th) {
        CancellationException cancellationExceptionM27981B0 = C6607E0.m27981B0(this, th, null, 1, null);
        this.f27479d.cancel(cancellationExceptionM27981B0);
        m28043y(cancellationExceptionM27981B0);
    }

    /* JADX INFO: renamed from: N0 */
    protected final InterfaceC6851g m30028N0() {
        return this.f27479d;
    }

    @Override // p336q6.InterfaceC6867w
    /* JADX INFO: renamed from: b */
    public Object mo29974b() {
        return this.f27479d.mo29974b();
    }

    @Override // p318o6.C6607E0, p318o6.InterfaceC6701y0
    public final void cancel(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new C6703z0(mo28020D(), null, this);
        }
        mo28017A(cancellationException);
    }

    @Override // p336q6.InterfaceC6867w
    /* JADX INFO: renamed from: d */
    public Object mo29976d(InterfaceC1875e interfaceC1875e) {
        return this.f27479d.mo29976d(interfaceC1875e);
    }

    @Override // p336q6.InterfaceC6868x
    /* JADX INFO: renamed from: g */
    public boolean mo29979g(Throwable th) {
        return this.f27479d.mo29979g(th);
    }

    @Override // p336q6.InterfaceC6868x
    /* JADX INFO: renamed from: i */
    public Object mo29980i(Object obj, InterfaceC1875e interfaceC1875e) {
        return this.f27479d.mo29980i(obj, interfaceC1875e);
    }

    @Override // p336q6.InterfaceC6867w
    public InterfaceC6853i iterator() {
        return this.f27479d.iterator();
    }

    @Override // p336q6.InterfaceC6868x
    /* JADX INFO: renamed from: j */
    public void mo29981j(InterfaceC5367l interfaceC5367l) {
        this.f27479d.mo29981j(interfaceC5367l);
    }

    @Override // p336q6.InterfaceC6868x
    /* JADX INFO: renamed from: k */
    public Object mo29982k(Object obj) {
        return this.f27479d.mo29982k(obj);
    }

    @Override // p318o6.C6607E0, p318o6.InterfaceC6701y0
    public /* synthetic */ void cancel() {
        mo28017A(new C6703z0(mo28020D(), null, this));
    }

    @Override // p318o6.C6607E0, p318o6.InterfaceC6701y0
    public final /* synthetic */ boolean cancel(Throwable th) {
        mo28017A(new C6703z0(mo28020D(), null, this));
        return true;
    }
}

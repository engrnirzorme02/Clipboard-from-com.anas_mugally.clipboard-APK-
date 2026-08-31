package p342r4;

import androidx.appcompat.app.AbstractC2263x;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import p185Y3.InterfaceC2029a;
import p211b5.InterfaceC2971a;
import p211b5.InterfaceC2972b;
import p374v4.InterfaceC7261z;

/* JADX INFO: renamed from: r4.d */
/* JADX INFO: loaded from: classes.dex */
public class C6904d implements InterfaceC7261z {

    /* JADX INFO: renamed from: a */
    private final InterfaceC2971a f27721a;

    /* JADX INFO: renamed from: b */
    private final AtomicReference f27722b = new AtomicReference();

    public C6904d(InterfaceC2971a interfaceC2971a) {
        this.f27721a = interfaceC2971a;
        interfaceC2971a.mo8945a(new InterfaceC2971a.a() { // from class: r4.a
            @Override // p211b5.InterfaceC2971a.a
            /* JADX INFO: renamed from: a */
            public final void mo5341a(InterfaceC2972b interfaceC2972b) {
                C6904d.m30253c(this.f27716a, interfaceC2972b);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m30253c(C6904d c6904d, InterfaceC2972b interfaceC2972b) {
        AtomicReference atomicReference = c6904d.f27722b;
        AbstractC2263x.m9328a(interfaceC2972b.get());
        atomicReference.set(null);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m30254d(final ExecutorService executorService, final InterfaceC7261z.b bVar, InterfaceC2972b interfaceC2972b) {
        AbstractC2263x.m9328a(interfaceC2972b.get());
        new InterfaceC2029a() { // from class: r4.c
        };
        throw null;
    }

    @Override // p374v4.InterfaceC7261z
    /* JADX INFO: renamed from: a */
    public void mo30255a(final ExecutorService executorService, final InterfaceC7261z.b bVar) {
        this.f27721a.mo8945a(new InterfaceC2971a.a() { // from class: r4.b
            @Override // p211b5.InterfaceC2971a.a
            /* JADX INFO: renamed from: a */
            public final void mo5341a(InterfaceC2972b interfaceC2972b) {
                C6904d.m30254d(executorService, bVar, interfaceC2972b);
            }
        });
    }

    @Override // p374v4.InterfaceC7261z
    /* JADX INFO: renamed from: b */
    public void mo30256b(boolean z7, InterfaceC7261z.a aVar) {
        AbstractC2263x.m9328a(this.f27722b.get());
        aVar.mo31983b(null);
    }
}

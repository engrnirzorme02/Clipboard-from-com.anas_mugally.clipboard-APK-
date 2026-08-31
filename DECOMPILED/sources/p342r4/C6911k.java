package p342r4;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.C4882w;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import p164V3.C1759d;
import p192Z3.InterfaceC2112a;
import p192Z3.InterfaceC2114b;
import p211b5.InterfaceC2971a;
import p211b5.InterfaceC2972b;
import p253g5.C5518b;
import p261h5.C5654a;
import p374v4.InterfaceC7261z;

/* JADX INFO: renamed from: r4.k */
/* JADX INFO: loaded from: classes.dex */
public class C6911k implements InterfaceC7261z {

    /* JADX INFO: renamed from: a */
    private final InterfaceC2971a f27732a;

    /* JADX INFO: renamed from: b */
    private final AtomicReference f27733b = new AtomicReference();

    public C6911k(InterfaceC2971a interfaceC2971a) {
        this.f27732a = interfaceC2971a;
        interfaceC2971a.mo8945a(new InterfaceC2971a.a() { // from class: r4.e
            @Override // p211b5.InterfaceC2971a.a
            /* JADX INFO: renamed from: a */
            public final void mo5341a(InterfaceC2972b interfaceC2972b) {
                this.f27723a.f27733b.set((InterfaceC2114b) interfaceC2972b.get());
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m30262h(InterfaceC7261z.a aVar, Exception exc) {
        if (m30263i(exc)) {
            aVar.mo31983b(null);
        } else {
            aVar.mo31982a(exc.getMessage());
        }
    }

    /* JADX INFO: renamed from: i */
    private static boolean m30263i(Exception exc) {
        return (exc instanceof C1759d) || (exc instanceof C5654a);
    }

    @Override // p374v4.InterfaceC7261z
    /* JADX INFO: renamed from: a */
    public void mo30255a(final ExecutorService executorService, final InterfaceC7261z.b bVar) {
        this.f27732a.mo8945a(new InterfaceC2971a.a() { // from class: r4.f
            @Override // p211b5.InterfaceC2971a.a
            /* JADX INFO: renamed from: a */
            public final void mo5341a(InterfaceC2972b interfaceC2972b) {
                ((InterfaceC2114b) interfaceC2972b.get()).mo8684b(new InterfaceC2112a() { // from class: r4.g
                    @Override // p192Z3.InterfaceC2112a
                    /* JADX INFO: renamed from: a */
                    public final void mo5343a(C5518b c5518b) {
                        executorService.execute(new Runnable() { // from class: r4.h
                            @Override // java.lang.Runnable
                            public final void run() {
                                bVar.mo32060a(c5518b.m24929a());
                            }
                        });
                    }
                });
            }
        });
    }

    @Override // p374v4.InterfaceC7261z
    /* JADX INFO: renamed from: b */
    public void mo30256b(boolean z7, final InterfaceC7261z.a aVar) {
        InterfaceC2114b interfaceC2114b = (InterfaceC2114b) this.f27733b.get();
        if (interfaceC2114b != null) {
            interfaceC2114b.mo8685c(z7).addOnSuccessListener(new OnSuccessListener() { // from class: r4.i
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    aVar.mo31983b(((C4882w) obj).m22060c());
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: r4.j
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    C6911k.m30262h(aVar, exc);
                }
            });
        } else {
            aVar.mo31983b(null);
        }
    }
}

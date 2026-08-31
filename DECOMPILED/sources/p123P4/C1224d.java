package p123P4;

import androidx.appcompat.app.AbstractC2263x;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import p164V3.C1759d;
import p185Y3.InterfaceC2029a;
import p186Y4.InterfaceC2048p;
import p211b5.InterfaceC2971a;
import p211b5.InterfaceC2972b;

/* JADX INFO: renamed from: P4.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1224d extends AbstractC1221a {

    /* JADX INFO: renamed from: a */
    private InterfaceC2048p f4318a;

    /* JADX INFO: renamed from: b */
    private boolean f4319b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC2029a f4320c = new InterfaceC2029a() { // from class: P4.b
    };

    public C1224d(InterfaceC2971a interfaceC2971a) {
        interfaceC2971a.mo8945a(new InterfaceC2971a.a() { // from class: P4.c
            @Override // p211b5.InterfaceC2971a.a
            /* JADX INFO: renamed from: a */
            public final void mo5341a(InterfaceC2972b interfaceC2972b) {
                C1224d.m5342d(this.f4317a, interfaceC2972b);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m5342d(C1224d c1224d, InterfaceC2972b interfaceC2972b) {
        synchronized (c1224d) {
            AbstractC2263x.m9328a(interfaceC2972b.get());
        }
    }

    @Override // p123P4.AbstractC1221a
    /* JADX INFO: renamed from: a */
    public synchronized Task mo5338a() {
        return Tasks.forException(new C1759d("AppCheck is not available"));
    }

    @Override // p123P4.AbstractC1221a
    /* JADX INFO: renamed from: b */
    public synchronized void mo5339b() {
        this.f4319b = true;
    }

    @Override // p123P4.AbstractC1221a
    /* JADX INFO: renamed from: c */
    public synchronized void mo5340c(InterfaceC2048p interfaceC2048p) {
        this.f4318a = interfaceC2048p;
    }
}

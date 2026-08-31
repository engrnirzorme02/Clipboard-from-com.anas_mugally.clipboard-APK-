package p236e4;

import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p228d4.C5235g;

/* JADX INFO: renamed from: e4.c */
/* JADX INFO: loaded from: classes.dex */
public class C5346c implements InterfaceC5345b, InterfaceC5344a {

    /* JADX INFO: renamed from: a */
    private final C5348e f20448a;

    /* JADX INFO: renamed from: b */
    private final int f20449b;

    /* JADX INFO: renamed from: c */
    private final TimeUnit f20450c;

    /* JADX INFO: renamed from: e */
    private CountDownLatch f20452e;

    /* JADX INFO: renamed from: d */
    private final Object f20451d = new Object();

    /* JADX INFO: renamed from: f */
    private boolean f20453f = false;

    public C5346c(C5348e c5348e, int i7, TimeUnit timeUnit) {
        this.f20448a = c5348e;
        this.f20449b = i7;
        this.f20450c = timeUnit;
    }

    @Override // p236e4.InterfaceC5344a
    /* JADX INFO: renamed from: a */
    public void mo14980a(String str, Bundle bundle) {
        synchronized (this.f20451d) {
            try {
                C5235g.m24179f().m24186i("Logging event " + str + " to Firebase Analytics with params " + bundle);
                this.f20452e = new CountDownLatch(1);
                this.f20453f = false;
                this.f20448a.mo14980a(str, bundle);
                C5235g.m24179f().m24186i("Awaiting app exception callback from Analytics...");
                try {
                    if (this.f20452e.await(this.f20449b, this.f20450c)) {
                        this.f20453f = true;
                        C5235g.m24179f().m24186i("App exception callback received from Analytics listener.");
                    } else {
                        C5235g.m24179f().m24188k("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                    }
                } catch (InterruptedException unused) {
                    C5235g.m24179f().m24182d("Interrupted while awaiting app exception callback from Analytics listener.");
                }
                this.f20452e = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p236e4.InterfaceC5345b
    /* JADX INFO: renamed from: b */
    public void mo24335b(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f20452e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}

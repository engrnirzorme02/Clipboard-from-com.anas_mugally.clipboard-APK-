package p119P0;

import android.os.Handler;
import android.os.Looper;
import p081K.AbstractC0717i;
import p112O0.InterfaceC1104q;

/* JADX INFO: renamed from: P0.a */
/* JADX INFO: loaded from: classes.dex */
public class C1174a implements InterfaceC1104q {

    /* JADX INFO: renamed from: a */
    private final Handler f4140a = AbstractC0717i.m3469a(Looper.getMainLooper());

    @Override // p112O0.InterfaceC1104q
    /* JADX INFO: renamed from: a */
    public void mo4859a(long j7, Runnable runnable) {
        this.f4140a.postDelayed(runnable, j7);
    }

    @Override // p112O0.InterfaceC1104q
    /* JADX INFO: renamed from: b */
    public void mo4860b(Runnable runnable) {
        this.f4140a.removeCallbacks(runnable);
    }
}

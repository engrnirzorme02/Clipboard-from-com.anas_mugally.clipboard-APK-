package p342r4;

import android.os.Handler;
import android.os.Looper;
import p374v4.InterfaceC7244i;

/* JADX INFO: renamed from: r4.l */
/* JADX INFO: loaded from: classes.dex */
public class C6912l implements InterfaceC7244i {

    /* JADX INFO: renamed from: a */
    private final Handler f27734a = new Handler(Looper.getMainLooper());

    @Override // p374v4.InterfaceC7244i
    /* JADX INFO: renamed from: a */
    public void mo30264a() {
    }

    @Override // p374v4.InterfaceC7244i
    /* JADX INFO: renamed from: b */
    public void mo30265b(Runnable runnable) {
        this.f27734a.post(runnable);
    }
}

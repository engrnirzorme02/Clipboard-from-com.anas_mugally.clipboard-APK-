package p314o2;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.BinderC3314Y1;
import com.google.android.gms.ads.internal.client.InterfaceC3340f1;
import p404z2.AbstractC7599p;

/* JADX INFO: renamed from: o2.y */
/* JADX INFO: loaded from: classes.dex */
public final class C6573y {

    /* JADX INFO: renamed from: a */
    private final Object f24787a = new Object();

    /* JADX INFO: renamed from: b */
    private InterfaceC3340f1 f24788b;

    /* JADX INFO: renamed from: c */
    private a f24789c;

    /* JADX INFO: renamed from: o2.y$a */
    public static abstract class a {
        public abstract void onVideoEnd();

        public void onVideoMute(boolean z7) {
        }

        public abstract void onVideoPause();

        public void onVideoPlay() {
        }

        public abstract void onVideoStart();
    }

    /* JADX INFO: renamed from: a */
    public void m27868a(a aVar) {
        BinderC3314Y1 binderC3314Y1;
        synchronized (this.f24787a) {
            this.f24789c = aVar;
            InterfaceC3340f1 interfaceC3340f1 = this.f24788b;
            if (interfaceC3340f1 == null) {
                return;
            }
            if (aVar == null) {
                binderC3314Y1 = null;
            } else {
                try {
                    binderC3314Y1 = new BinderC3314Y1(aVar);
                } catch (RemoteException e7) {
                    AbstractC7599p.m33329d("Unable to call setVideoLifecycleCallbacks on video controller.", e7);
                }
            }
            interfaceC3340f1.zzl(binderC3314Y1);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m27869b(InterfaceC3340f1 interfaceC3340f1) {
        synchronized (this.f24787a) {
            try {
                this.f24788b = interfaceC3340f1;
                a aVar = this.f24789c;
                if (aVar != null) {
                    m27868a(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC3340f1 m27870c() {
        InterfaceC3340f1 interfaceC3340f1;
        synchronized (this.f24787a) {
            interfaceC3340f1 = this.f24788b;
        }
        return interfaceC3340f1;
    }
}

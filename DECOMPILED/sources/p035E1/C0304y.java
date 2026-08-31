package p035E1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: E1.y */
/* JADX INFO: loaded from: classes.dex */
class C0304y {

    /* JADX INFO: renamed from: a */
    private boolean f1274a;

    /* JADX INFO: renamed from: b */
    private final Handler f1275b = new Handler(Looper.getMainLooper(), new a());

    /* JADX INFO: renamed from: E1.y$a */
    private static final class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((InterfaceC0301v) message.obj).mo1436b();
            return true;
        }
    }

    C0304y() {
    }

    /* JADX INFO: renamed from: a */
    synchronized void m1468a(InterfaceC0301v interfaceC0301v, boolean z7) {
        try {
            if (this.f1274a || z7) {
                this.f1275b.obtainMessage(1, interfaceC0301v).sendToTarget();
            } else {
                this.f1274a = true;
                interfaceC0301v.mo1436b();
                this.f1274a = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}

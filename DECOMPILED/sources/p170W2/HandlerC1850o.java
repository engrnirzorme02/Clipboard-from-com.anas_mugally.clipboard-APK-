package p170W2;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zau;

/* JADX INFO: renamed from: W2.o */
/* JADX INFO: loaded from: classes.dex */
final class HandlerC1850o extends zau {

    /* JADX INFO: renamed from: a */
    private final Context f6005a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C1840e f6006b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC1850o(C1840e c1840e, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f6006b = c1840e;
        this.f6005a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i7 = message.what;
        if (i7 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i7);
            return;
        }
        C1840e c1840e = this.f6006b;
        int iMo7608g = c1840e.mo7608g(this.f6005a);
        if (c1840e.mo7610j(iMo7608g)) {
            this.f6006b.m7614p(this.f6005a, iMo7608g);
        }
    }
}

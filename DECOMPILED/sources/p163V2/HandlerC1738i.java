package p163V2;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.cloudmessaging.zzf;

/* JADX INFO: renamed from: V2.i */
/* JADX INFO: loaded from: classes.dex */
final class HandlerC1738i extends zzf {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C1732c f5759a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HandlerC1738i(C1732c c1732c, Looper looper) {
        super(looper);
        this.f5759a = c1732c;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1732c.m7360g(this.f5759a, message);
    }
}

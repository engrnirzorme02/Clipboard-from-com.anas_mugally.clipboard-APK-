package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.AbstractC3561i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.base.zau;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.h0 */
/* JADX INFO: loaded from: classes.dex */
final class HandlerC3603h0 extends zau {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C3607j0 f14659a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC3603h0(C3607j0 c3607j0, Looper looper) {
        super(looper);
        this.f14659a = c3607j0;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i7 = message.what;
        if (i7 != 0) {
            if (i7 == 1) {
                RuntimeException runtimeException = (RuntimeException) message.obj;
                Log.e("TransformedResultImpl", "Runtime exception on the transformation worker thread: ".concat(String.valueOf(runtimeException.getMessage())));
                throw runtimeException;
            }
            Log.e("TransformedResultImpl", "TransformationResultHandler received unknown message type: " + i7);
            return;
        }
        AbstractC3561i abstractC3561i = (AbstractC3561i) message.obj;
        synchronized (this.f14659a.f14664c) {
            try {
                C3607j0 c3607j0 = (C3607j0) AbstractC3718s.m18083l(this.f14659a.f14662a);
                if (abstractC3561i == null) {
                    c3607j0.m17915g(new Status(13, "Transform returned null"));
                } else {
                    c3607j0.m17922f(abstractC3561i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

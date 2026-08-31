package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.common.zzh;
import p170W2.C1837b;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.g0 */
/* JADX INFO: loaded from: classes.dex */
final class HandlerC3695g0 extends zzh {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AbstractC3686c f14788a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC3695g0(AbstractC3686c abstractC3686c, Looper looper) {
        super(looper);
        this.f14788a = abstractC3686c;
    }

    /* JADX INFO: renamed from: a */
    private static final void m18028a(Message message) {
        AbstractC3697h0 abstractC3697h0 = (AbstractC3697h0) message.obj;
        abstractC3697h0.mo17991b();
        abstractC3697h0.m18033e();
    }

    /* JADX INFO: renamed from: b */
    private static final boolean m18029b(Message message) {
        int i7 = message.what;
        return i7 == 2 || i7 == 1 || i7 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f14788a.zzd.get() != message.arg1) {
            if (m18029b(message)) {
                m18028a(message);
                return;
            }
            return;
        }
        int i7 = message.what;
        if ((i7 == 1 || i7 == 7 || ((i7 == 4 && !this.f14788a.enableLocalFallback()) || message.what == 5)) && !this.f14788a.isConnecting()) {
            m18028a(message);
            return;
        }
        int i8 = message.what;
        if (i8 == 4) {
            this.f14788a.zzC = new C1837b(message.arg2);
            if (AbstractC3686c.zzo(this.f14788a)) {
                AbstractC3686c abstractC3686c = this.f14788a;
                if (!abstractC3686c.zzD) {
                    abstractC3686c.m18001c(3, null);
                    return;
                }
            }
            AbstractC3686c abstractC3686c2 = this.f14788a;
            C1837b c1837b = abstractC3686c2.zzC != null ? abstractC3686c2.zzC : new C1837b(8);
            this.f14788a.zzc.mo17843a(c1837b);
            this.f14788a.onConnectionFailed(c1837b);
            return;
        }
        if (i8 == 5) {
            AbstractC3686c abstractC3686c3 = this.f14788a;
            C1837b c1837b2 = abstractC3686c3.zzC != null ? abstractC3686c3.zzC : new C1837b(8);
            this.f14788a.zzc.mo17843a(c1837b2);
            this.f14788a.onConnectionFailed(c1837b2);
            return;
        }
        if (i8 == 3) {
            Object obj = message.obj;
            C1837b c1837b3 = new C1837b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.f14788a.zzc.mo17843a(c1837b3);
            this.f14788a.onConnectionFailed(c1837b3);
            return;
        }
        if (i8 == 6) {
            this.f14788a.m18001c(5, null);
            AbstractC3686c abstractC3686c4 = this.f14788a;
            if (abstractC3686c4.zzw != null) {
                abstractC3686c4.zzw.onConnectionSuspended(message.arg2);
            }
            this.f14788a.onConnectionSuspended(message.arg2);
            AbstractC3686c.zzn(this.f14788a, 5, 1, null);
            return;
        }
        if (i8 == 2 && !this.f14788a.isConnected()) {
            m18028a(message);
            return;
        }
        if (m18029b(message)) {
            ((AbstractC3697h0) message.obj).m18031c();
            return;
        }
        Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
    }
}

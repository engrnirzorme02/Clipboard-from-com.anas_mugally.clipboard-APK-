package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.concurrent.atomic.AtomicReference;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzezq {
    public static void zza(AtomicReference atomicReference, zzezp zzezpVar) {
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            zzezpVar.zza(obj);
        } catch (RemoteException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        } catch (NullPointerException e8) {
            int i8 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33332g("NullPointerException occurs when invoking a method from a delegating listener.", e8);
        }
    }
}

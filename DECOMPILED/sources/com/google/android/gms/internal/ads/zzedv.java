package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import java.util.Objects;
import p157U3.InterfaceFutureC1673e;
import p362u0.AbstractC7153a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzedv {
    private AbstractC7153a zza;
    private final Context zzb;

    zzedv(Context context) {
        this.zzb = context;
    }

    public final InterfaceFutureC1673e zza() {
        try {
            AbstractC7153a abstractC7153aM31621a = AbstractC7153a.m31621a(this.zzb);
            this.zza = abstractC7153aM31621a;
            return abstractC7153aM31621a == null ? zzgot.zzc(new IllegalStateException("MeasurementManagerFutures is null")) : abstractC7153aM31621a.mo31622b();
        } catch (Exception e7) {
            return zzgot.zzc(e7);
        }
    }

    public final InterfaceFutureC1673e zzb(Uri uri, InputEvent inputEvent) {
        try {
            AbstractC7153a abstractC7153a = this.zza;
            Objects.requireNonNull(abstractC7153a);
            return abstractC7153a.mo31623c(uri, inputEvent);
        } catch (Exception e7) {
            return zzgot.zzc(e7);
        }
    }
}

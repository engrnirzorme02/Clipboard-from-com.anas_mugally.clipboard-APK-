package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzcel implements View.OnAttachStateChangeListener {
    final /* synthetic */ zzbxf zza;
    final /* synthetic */ zzcev zzb;

    zzcel(zzcev zzcevVar, zzbxf zzbxfVar) {
        this.zza = zzbxfVar;
        Objects.requireNonNull(zzcevVar);
        this.zzb = zzcevVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzb.zzX(view, this.zza, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}

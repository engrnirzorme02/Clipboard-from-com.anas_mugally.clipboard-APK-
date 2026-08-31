package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.Map;
import java.util.Objects;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
final class zzcfh implements zzbjl {
    final /* synthetic */ zzcfn zza;

    zzcfh(zzcfn zzcfnVar) {
        Objects.requireNonNull(zzcfnVar);
        this.zza = zzcfnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int i7 = Integer.parseInt(str);
                zzcfn zzcfnVar = this.zza;
                synchronized (zzcfnVar) {
                    try {
                        if (zzcfnVar.zzaX() != i7) {
                            zzcfnVar.zzaY(i7);
                            zzcfnVar.requestLayout();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e7) {
                int i8 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33332g("Exception occurred while getting webview content height", e7);
            }
        }
    }
}
